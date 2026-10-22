package org.xutils.cache;

import android.text.TextUtils;
import com.lzy.okgo.cache.CacheEntity;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.xutils.C6127x;
import org.xutils.DbManager;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.FileUtil;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.common.util.MD5;
import org.xutils.common.util.ProcessLock;
import org.xutils.config.DbConfigs;
import org.xutils.p274db.sqlite.WhereBuilder;
import org.xutils.p275ex.FileLockedException;

/* loaded from: classes3.dex */
public final class LruDiskCache {
    private static final String CACHE_DIR_NAME = "xUtils_cache";
    private static final HashMap<String, LruDiskCache> DISK_CACHE_MAP = new HashMap<>(5);
    private static final int LIMIT_COUNT = 5000;
    private static final long LIMIT_SIZE = 104857600;
    private static final int LOCK_WAIT = 3000;
    private static final String TEMP_FILE_SUFFIX = ".tmp";
    private static final long TRIM_TIME_SPAN = 1000;
    private boolean available;
    private DbManager cacheDb;
    private File cacheDir;
    private long diskCacheSize = LIMIT_SIZE;
    private final Executor trimExecutor = new PriorityExecutor(1, true);
    private long lastTrimTime = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.xutils.cache.LruDiskCache$a */
    /* loaded from: classes3.dex */
    public class RunnableC6077a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiskCacheEntity f23991a;

        RunnableC6077a(DiskCacheEntity diskCacheEntity) {
            this.f23991a = diskCacheEntity;
        }

        @Override // java.lang.Runnable
        public void run() {
            DiskCacheEntity diskCacheEntity = this.f23991a;
            diskCacheEntity.setHits(diskCacheEntity.getHits() + 1);
            this.f23991a.setLastAccess(System.currentTimeMillis());
            try {
                LruDiskCache.this.cacheDb.update(this.f23991a, "hits", "lastAccess");
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.xutils.cache.LruDiskCache$b */
    /* loaded from: classes3.dex */
    public class RunnableC6078b implements Runnable {
        RunnableC6078b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            List<DiskCacheEntity> findAll;
            if (!LruDiskCache.this.available) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - LruDiskCache.this.lastTrimTime >= 1000) {
                LruDiskCache.this.lastTrimTime = currentTimeMillis;
                LruDiskCache.this.deleteExpiry();
                try {
                    int count = (int) LruDiskCache.this.cacheDb.selector(DiskCacheEntity.class).count();
                    if (count > 5010 && (findAll = LruDiskCache.this.cacheDb.selector(DiskCacheEntity.class).orderBy("lastAccess").orderBy("hits").limit(count - 5000).offset(0).findAll()) != null && findAll.size() > 0) {
                        for (DiskCacheEntity diskCacheEntity : findAll) {
                            try {
                                LruDiskCache.this.cacheDb.delete(diskCacheEntity);
                                String path = diskCacheEntity.getPath();
                                if (!TextUtils.isEmpty(path)) {
                                    LruDiskCache.this.deleteFileWithLock(path);
                                    LruDiskCache.this.deleteFileWithLock(path + LruDiskCache.TEMP_FILE_SUFFIX);
                                }
                            } catch (Throwable th) {
                                LogUtil.m24376e(th.getMessage(), th);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    LogUtil.m24376e(th2.getMessage(), th2);
                }
                while (FileUtil.getFileOrDirSize(LruDiskCache.this.cacheDir) > LruDiskCache.this.diskCacheSize) {
                    try {
                        List<DiskCacheEntity> findAll2 = LruDiskCache.this.cacheDb.selector(DiskCacheEntity.class).orderBy("lastAccess").orderBy("hits").limit(10).offset(0).findAll();
                        if (findAll2 != null && findAll2.size() > 0) {
                            for (DiskCacheEntity diskCacheEntity2 : findAll2) {
                                try {
                                    LruDiskCache.this.cacheDb.delete(diskCacheEntity2);
                                    String path2 = diskCacheEntity2.getPath();
                                    if (!TextUtils.isEmpty(path2)) {
                                        LruDiskCache.this.deleteFileWithLock(path2);
                                        LruDiskCache.this.deleteFileWithLock(path2 + LruDiskCache.TEMP_FILE_SUFFIX);
                                    }
                                } catch (Throwable th3) {
                                    LogUtil.m24376e(th3.getMessage(), th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        LogUtil.m24376e(th4.getMessage(), th4);
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.xutils.cache.LruDiskCache$c */
    /* loaded from: classes3.dex */
    public class RunnableC6079c implements Runnable {
        RunnableC6079c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!LruDiskCache.this.available) {
                return;
            }
            try {
                File[] listFiles = LruDiskCache.this.cacheDir.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        try {
                            if (LruDiskCache.this.cacheDb.selector(DiskCacheEntity.class).where("path", Operator.Operation.EQUALS, file.getAbsolutePath()).count() < 1) {
                                IOUtil.deleteFileOrDir(file);
                            }
                        } catch (Throwable th) {
                            LogUtil.m24376e(th.getMessage(), th);
                        }
                    }
                }
            } catch (Throwable th2) {
                LogUtil.m24376e(th2.getMessage(), th2);
            }
        }
    }

    private LruDiskCache(String str) {
        this.available = false;
        try {
            File cacheDir = FileUtil.getCacheDir(str);
            this.cacheDir = cacheDir;
            if (cacheDir != null && (cacheDir.exists() || this.cacheDir.mkdirs())) {
                this.available = true;
            }
            this.cacheDb = C6127x.getDb(DbConfigs.HTTP.getConfig());
        } catch (Throwable th) {
            this.available = false;
            LogUtil.m24376e(th.getMessage(), th);
        }
        deleteNoIndexFiles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteExpiry() {
        if (!this.available) {
            return;
        }
        try {
            WhereBuilder m24391b = WhereBuilder.m24391b("expires", Operator.Operation.LESS_THAN, Long.valueOf(System.currentTimeMillis()));
            List findAll = this.cacheDb.selector(DiskCacheEntity.class).where(m24391b).findAll();
            this.cacheDb.delete(DiskCacheEntity.class, m24391b);
            if (findAll != null && findAll.size() > 0) {
                Iterator it = findAll.iterator();
                while (it.hasNext()) {
                    String path = ((DiskCacheEntity) it.next()).getPath();
                    if (!TextUtils.isEmpty(path)) {
                        deleteFileWithLock(path);
                    }
                }
            }
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean deleteFileWithLock(String str) {
        ProcessLock processLock;
        try {
            processLock = ProcessLock.tryLock(str, true);
            if (processLock != null) {
                try {
                    if (processLock.isValid()) {
                        boolean deleteFileOrDir = IOUtil.deleteFileOrDir(new File(str));
                        IOUtil.closeQuietly(processLock);
                        return deleteFileOrDir;
                    }
                } catch (Throwable th) {
                    th = th;
                    IOUtil.closeQuietly(processLock);
                    throw th;
                }
            }
            IOUtil.closeQuietly(processLock);
            return false;
        } catch (Throwable th2) {
            th = th2;
            processLock = null;
        }
    }

    private void deleteNoIndexFiles() {
        this.trimExecutor.execute(new RunnableC6079c());
    }

    public static synchronized LruDiskCache getDiskCache(String str) {
        LruDiskCache lruDiskCache;
        synchronized (LruDiskCache.class) {
            if (TextUtils.isEmpty(str)) {
                str = CACHE_DIR_NAME;
            }
            HashMap<String, LruDiskCache> hashMap = DISK_CACHE_MAP;
            lruDiskCache = hashMap.get(str);
            if (lruDiskCache == null) {
                lruDiskCache = new LruDiskCache(str);
                hashMap.put(str, lruDiskCache);
            }
        }
        return lruDiskCache;
    }

    private void trimSize() {
        this.trimExecutor.execute(new RunnableC6078b());
    }

    public void clearCacheFiles() {
        IOUtil.deleteFileOrDir(this.cacheDir);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.xutils.cache.DiskCacheFile commitDiskCacheFile(org.xutils.cache.DiskCacheFile r7) {
        /*
            r6 = this;
            boolean r0 = r6.available
            if (r0 == 0) goto La8
            if (r7 != 0) goto L8
            goto La8
        L8:
            org.xutils.cache.DiskCacheEntity r0 = r7.getCacheEntity()
            java.lang.String r1 = r7.getName()
            java.lang.String r2 = ".tmp"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto La8
            r1 = 0
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L82
            r3 = 1
            r4 = 3000(0xbb8, double:1.482E-320)
            org.xutils.common.util.ProcessLock r3 = org.xutils.common.util.ProcessLock.tryLock(r2, r3, r4)     // Catch: java.lang.Throwable -> L7e java.lang.InterruptedException -> L82
            if (r3 == 0) goto L73
            boolean r4 = r3.isValid()     // Catch: java.lang.Throwable -> L79 java.lang.InterruptedException -> L7c
            if (r4 == 0) goto L73
            org.xutils.cache.DiskCacheFile r4 = new org.xutils.cache.DiskCacheFile     // Catch: java.lang.Throwable -> L79 java.lang.InterruptedException -> L7c
            r4.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L79 java.lang.InterruptedException -> L7c
            boolean r2 = r7.renameTo(r4)     // Catch: java.lang.Throwable -> L6e java.lang.InterruptedException -> L70
            if (r2 == 0) goto L53
            org.xutils.DbManager r1 = r6.cacheDb     // Catch: java.lang.Throwable -> L3d
            r1.replace(r0)     // Catch: java.lang.Throwable -> L3d
            goto L45
        L3d:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L50 java.lang.InterruptedException -> L70
            org.xutils.common.util.LogUtil.m24376e(r1, r0)     // Catch: java.lang.Throwable -> L50 java.lang.InterruptedException -> L70
        L45:
            r6.trimSize()     // Catch: java.lang.Throwable -> L50 java.lang.InterruptedException -> L70
            org.xutils.common.util.IOUtil.closeQuietly(r7)
            org.xutils.common.util.IOUtil.deleteFileOrDir(r7)
            r7 = r4
            goto La8
        L50:
            r0 = move-exception
            r1 = r4
            goto L95
        L53:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L6e java.lang.InterruptedException -> L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e java.lang.InterruptedException -> L70
            r2.<init>()     // Catch: java.lang.Throwable -> L6e java.lang.InterruptedException -> L70
            java.lang.String r5 = "rename:"
            r2.append(r5)     // Catch: java.lang.Throwable -> L6e java.lang.InterruptedException -> L70
            java.lang.String r5 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L6e java.lang.InterruptedException -> L70
            r2.append(r5)     // Catch: java.lang.Throwable -> L6e java.lang.InterruptedException -> L70
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6e java.lang.InterruptedException -> L70
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L6e java.lang.InterruptedException -> L70
            throw r0     // Catch: java.lang.Throwable -> L6e java.lang.InterruptedException -> L70
        L6e:
            r0 = move-exception
            goto L95
        L70:
            r0 = move-exception
            r1 = r4
            goto L84
        L73:
            org.xutils.ex.FileLockedException r0 = new org.xutils.ex.FileLockedException     // Catch: java.lang.Throwable -> L79 java.lang.InterruptedException -> L7c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L79 java.lang.InterruptedException -> L7c
            throw r0     // Catch: java.lang.Throwable -> L79 java.lang.InterruptedException -> L7c
        L79:
            r0 = move-exception
            r4 = r1
            goto L95
        L7c:
            r0 = move-exception
            goto L84
        L7e:
            r0 = move-exception
            r3 = r1
            r4 = r3
            goto L95
        L82:
            r0 = move-exception
            r3 = r1
        L84:
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L92
            org.xutils.common.util.LogUtil.m24376e(r2, r0)     // Catch: java.lang.Throwable -> L92
            org.xutils.common.util.IOUtil.closeQuietly(r7)
            org.xutils.common.util.IOUtil.deleteFileOrDir(r7)
            goto La8
        L92:
            r0 = move-exception
            r4 = r1
            r1 = r7
        L95:
            if (r1 != 0) goto La1
            org.xutils.common.util.IOUtil.closeQuietly(r4)
            org.xutils.common.util.IOUtil.closeQuietly(r3)
            org.xutils.common.util.IOUtil.deleteFileOrDir(r4)
            goto La7
        La1:
            org.xutils.common.util.IOUtil.closeQuietly(r7)
            org.xutils.common.util.IOUtil.deleteFileOrDir(r7)
        La7:
            throw r0
        La8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.cache.LruDiskCache.commitDiskCacheFile(org.xutils.cache.DiskCacheFile):org.xutils.cache.DiskCacheFile");
    }

    public DiskCacheFile createDiskCacheFile(DiskCacheEntity diskCacheEntity) {
        if (this.available && diskCacheEntity != null) {
            diskCacheEntity.setPath(new File(this.cacheDir, MD5.md5(diskCacheEntity.getKey())).getAbsolutePath());
            String str = diskCacheEntity.getPath() + TEMP_FILE_SUFFIX;
            ProcessLock tryLock = ProcessLock.tryLock(str, true);
            if (tryLock != null && tryLock.isValid()) {
                DiskCacheFile diskCacheFile = new DiskCacheFile(str, diskCacheEntity, tryLock);
                if (!diskCacheFile.getParentFile().exists()) {
                    diskCacheFile.mkdirs();
                }
                return diskCacheFile;
            }
            throw new FileLockedException(diskCacheEntity.getPath());
        }
        return null;
    }

    public DiskCacheEntity get(String str) {
        DiskCacheEntity diskCacheEntity;
        if (!this.available || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            diskCacheEntity = (DiskCacheEntity) this.cacheDb.selector(DiskCacheEntity.class).where(CacheEntity.KEY, Operator.Operation.EQUALS, str).findFirst();
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
            diskCacheEntity = null;
        }
        if (diskCacheEntity != null) {
            if (diskCacheEntity.getExpires() < System.currentTimeMillis()) {
                return null;
            }
            this.trimExecutor.execute(new RunnableC6077a(diskCacheEntity));
        }
        return diskCacheEntity;
    }

    public DiskCacheFile getDiskCacheFile(String str) {
        DiskCacheEntity diskCacheEntity;
        ProcessLock tryLock;
        if (!this.available || TextUtils.isEmpty(str) || (diskCacheEntity = get(str)) == null || !new File(diskCacheEntity.getPath()).exists() || (tryLock = ProcessLock.tryLock(diskCacheEntity.getPath(), false, 3000L)) == null || !tryLock.isValid()) {
            return null;
        }
        DiskCacheFile diskCacheFile = new DiskCacheFile(diskCacheEntity.getPath(), diskCacheEntity, tryLock);
        if (!diskCacheFile.exists()) {
            try {
                this.cacheDb.delete(diskCacheEntity);
                return null;
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
                return null;
            }
        }
        return diskCacheFile;
    }

    public void put(DiskCacheEntity diskCacheEntity) {
        if (this.available && diskCacheEntity != null && !TextUtils.isEmpty(diskCacheEntity.getTextContent()) && diskCacheEntity.getExpires() >= System.currentTimeMillis()) {
            try {
                this.cacheDb.replace(diskCacheEntity);
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
            trimSize();
        }
    }

    public LruDiskCache setMaxSize(long j10) {
        if (j10 > 0) {
            long diskAvailableSize = FileUtil.getDiskAvailableSize();
            if (diskAvailableSize > j10) {
                this.diskCacheSize = j10;
            } else {
                this.diskCacheSize = diskAvailableSize;
            }
        }
        return this;
    }
}
