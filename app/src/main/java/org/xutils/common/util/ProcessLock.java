package org.xutils.common.util;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.message.MessageService;
import org.xutils.C6127x;

/* loaded from: classes3.dex */
public final class ProcessLock implements Closeable {
    private static final DecimalFormat FORMAT;
    private static final String LOCK_FILE_DIR = "process_lock";
    private static final DoubleKeyValueMap<String, Integer, ProcessLock> LOCK_MAP = new DoubleKeyValueMap<>();
    private final File mFile;
    private final FileLock mFileLock;
    private final String mLockName;
    private final Closeable mStream;
    private final boolean mWriteMode;

    static {
        IOUtil.deleteFileOrDir(C6127x.app().getDir(LOCK_FILE_DIR, 0));
        FORMAT = new DecimalFormat("0.##################");
    }

    private ProcessLock(String str, File file, FileLock fileLock, Closeable closeable, boolean z10) {
        this.mLockName = str;
        this.mFileLock = fileLock;
        this.mFile = file;
        this.mStream = closeable;
        this.mWriteMode = z10;
    }

    private static String customHash(String str) {
        if (TextUtils.isEmpty(str)) {
            return MessageService.MSG_DB_READY_REPORT;
        }
        byte[] bytes = str.getBytes();
        double d10 = 0.0d;
        for (int i10 = 0; i10 < str.length(); i10++) {
            double d11 = bytes[i10];
            Double.isNaN(d11);
            d10 = ((d10 * 255.0d) + d11) * 0.005d;
        }
        return FORMAT.format(d10);
    }

    public static ProcessLock tryLock(String str, boolean z10) {
        return tryLockInternal(str, customHash(str), z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ProcessLock tryLockInternal(String str, String str2, boolean z10) {
        FileInputStream fileInputStream;
        FileChannel fileChannel;
        FileInputStream fileInputStream2;
        boolean z11;
        DoubleKeyValueMap<String, Integer, ProcessLock> doubleKeyValueMap = LOCK_MAP;
        synchronized (doubleKeyValueMap) {
            ConcurrentHashMap<Integer, ProcessLock> concurrentHashMap = doubleKeyValueMap.get(str);
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                Iterator<Map.Entry<Integer, ProcessLock>> it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    ProcessLock value = it.next().getValue();
                    if (value != null) {
                        if (!value.isValid()) {
                            it.remove();
                        } else {
                            if (z10) {
                                return null;
                            }
                            if (value.mWriteMode) {
                                return null;
                            }
                        }
                    } else {
                        it.remove();
                    }
                }
            }
            try {
                File file = new File(C6127x.app().getDir(LOCK_FILE_DIR, 0), str2);
                if (file.exists() || file.createNewFile()) {
                    if (z10) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                        fileChannel = fileOutputStream.getChannel();
                        fileInputStream2 = fileOutputStream;
                    } else {
                        FileInputStream fileInputStream3 = new FileInputStream(file);
                        fileChannel = fileInputStream3.getChannel();
                        fileInputStream2 = fileInputStream3;
                    }
                    try {
                        if (fileChannel != null) {
                            if (!z10) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            FileLock tryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, z11);
                            if (isValid(tryLock)) {
                                ProcessLock processLock = new ProcessLock(str, file, tryLock, fileInputStream2, z10);
                                LOCK_MAP.put(str, Integer.valueOf(tryLock.hashCode()), processLock);
                                return processLock;
                            }
                            release(str, tryLock, file, fileInputStream2);
                        } else {
                            throw new IOException("can not get file channel:" + file.getAbsolutePath());
                        }
                    } catch (Throwable th) {
                        fileInputStream = fileInputStream2;
                        th = th;
                        LogUtil.m24373d("tryLock: " + str + ", " + th.getMessage());
                        IOUtil.closeQuietly(fileInputStream);
                        IOUtil.closeQuietly(fileChannel);
                        LOCK_MAP.notifyAll();
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
                fileChannel = null;
            }
            LOCK_MAP.notifyAll();
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }

    protected void finalize() {
        super.finalize();
        release();
    }

    public boolean isValid() {
        return isValid(this.mFileLock);
    }

    public void release() {
        release(this.mLockName, this.mFileLock, this.mFile, this.mStream);
    }

    public String toString() {
        return this.mLockName + ": " + this.mFile.getName();
    }

    private static boolean isValid(FileLock fileLock) {
        return fileLock != null && fileLock.isValid();
    }

    private static void release(String str, FileLock fileLock, File file, Closeable closeable) {
        FileChannel channel;
        DoubleKeyValueMap<String, Integer, ProcessLock> doubleKeyValueMap = LOCK_MAP;
        synchronized (doubleKeyValueMap) {
            if (fileLock != null) {
                try {
                    doubleKeyValueMap.remove(str, Integer.valueOf(fileLock.hashCode()));
                    ConcurrentHashMap<Integer, ProcessLock> concurrentHashMap = doubleKeyValueMap.get(str);
                    if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                        IOUtil.deleteFileOrDir(file);
                    }
                    if (fileLock.channel().isOpen()) {
                        fileLock.release();
                    }
                    channel = fileLock.channel();
                } catch (Throwable th) {
                    try {
                        LogUtil.m24376e(th.getMessage(), th);
                        channel = fileLock.channel();
                    } catch (Throwable th2) {
                        IOUtil.closeQuietly(fileLock.channel());
                        throw th2;
                    }
                }
                IOUtil.closeQuietly(channel);
            }
            IOUtil.closeQuietly(closeable);
            LOCK_MAP.notifyAll();
        }
    }

    public static ProcessLock tryLock(String str, boolean z10, long j10) {
        ProcessLock processLock;
        long currentTimeMillis = System.currentTimeMillis() + j10;
        String customHash = customHash(str);
        synchronized (LOCK_MAP) {
            processLock = null;
            while (System.currentTimeMillis() < currentTimeMillis && (processLock = tryLockInternal(str, customHash, z10)) == null) {
                try {
                    LOCK_MAP.wait(10L);
                } catch (InterruptedException e10) {
                    throw e10;
                } catch (Throwable unused) {
                }
            }
        }
        return processLock;
    }
}
