package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.zip.Deflater;

/* renamed from: com.umeng.commonsdk.stateless.d */
/* loaded from: classes3.dex */
public class C3480d {

    /* renamed from: a */
    public static int f15381a;

    /* renamed from: b */
    private static Object f15382b = new Object();

    /* renamed from: a */
    public static boolean m14725a(long j10, long j11) {
        return j10 > j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:
    
        if (r1 == null) goto L44;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m14732b(android.content.Context r8, java.lang.String r9, java.lang.String r10, byte[] r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C3480d.m14732b(android.content.Context, java.lang.String, java.lang.String, byte[]):boolean");
    }

    /* renamed from: c */
    public static File[] m14734c(Context context) {
        if (context == null) {
            return null;
        }
        try {
            synchronized (f15382b) {
                String str = context.getApplicationContext().getFilesDir() + File.separator + C3477a.f15360f;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                File file = new File(str);
                synchronized (f15382b) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null && listFiles.length != 0) {
                        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.3
                            @Override // java.util.Comparator
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file2, File file3) {
                                long lastModified = file2.lastModified() - file3.lastModified();
                                if (lastModified > 0) {
                                    return 1;
                                }
                                if (lastModified == 0) {
                                    return 0;
                                }
                                return -1;
                            }
                        });
                        return listFiles;
                    }
                    return null;
                }
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* renamed from: d */
    public static String m14735d(String str) {
        int lastIndexOf;
        int lastIndexOf2;
        if (TextUtils.isEmpty(str) || str.indexOf("envelope") >= 0 || (lastIndexOf = str.lastIndexOf("_")) < 0 || (lastIndexOf2 = str.lastIndexOf(".")) < 0) {
            return "";
        }
        return str.substring(lastIndexOf + 1, lastIndexOf2);
    }

    /* renamed from: a */
    public static boolean m14726a(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!m14726a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0061, code lost:
    
        if (r1 == null) goto L33;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m14720a(android.content.Context r6, java.lang.String r7, java.lang.String r8, byte[] r9) {
        /*
            r0 = 101(0x65, float:1.42E-43)
            if (r6 == 0) goto L75
            r1 = 0
            java.lang.Object r2 = com.umeng.commonsdk.stateless.C3480d.f15382b     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r4.<init>()     // Catch: java.lang.Throwable -> L5a
            java.io.File r5 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L5a
            r4.append(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = java.io.File.separator     // Catch: java.lang.Throwable -> L5a
            r4.append(r5)     // Catch: java.lang.Throwable -> L5a
            r4.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L5a
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L5a
            boolean r7 = r3.isDirectory()     // Catch: java.lang.Throwable -> L5a
            if (r7 != 0) goto L2e
            r3.mkdir()     // Catch: java.lang.Throwable -> L5a
        L2e:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r4.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L5a
            r4.append(r3)     // Catch: java.lang.Throwable -> L5a
            r4.append(r5)     // Catch: java.lang.Throwable -> L5a
            r4.append(r8)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L5a
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L5a
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L5a
            r8.write(r9)     // Catch: java.lang.Throwable -> L57
            r8.close()     // Catch: java.lang.Throwable -> L57
            r0 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5a
            goto L75
        L57:
            r7 = move-exception
            r1 = r8
            goto L5b
        L5a:
            r7 = move-exception
        L5b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5a
            throw r7     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
        L5d:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r7)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L75
        L63:
            r1.close()     // Catch: java.lang.Throwable -> L75
            goto L75
        L67:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r7)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L75
            goto L63
        L6e:
            r6 = move-exception
            if (r1 == 0) goto L74
            r1.close()     // Catch: java.lang.Throwable -> L74
        L74:
            throw r6
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C3480d.m14720a(android.content.Context, java.lang.String, java.lang.String, byte[]):int");
    }

    /* renamed from: c */
    public static String m14733c(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static byte[] m14727a(String str) {
        byte[] bArr;
        synchronized (f15382b) {
            FileChannel fileChannel = null;
            try {
                try {
                    fileChannel = new RandomAccessFile(str, "r").getChannel();
                    MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannel.size()).load();
                    bArr = new byte[(int) fileChannel.size()];
                    if (load.remaining() > 0) {
                        load.get(bArr, 0, load.remaining());
                    }
                    try {
                        fileChannel.close();
                    } catch (Throwable unused) {
                    }
                } catch (IOException e10) {
                    ULog.m14804i("walle", "[stateless] write envelope, e is " + e10.getMessage());
                    throw e10;
                }
            } catch (Throwable th) {
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        }
        return bArr;
    }

    /* renamed from: b */
    public static File m14729b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            synchronized (f15382b) {
                String str = context.getApplicationContext().getFilesDir() + File.separator + C3477a.f15360f;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                File file = new File(str);
                synchronized (f15382b) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null && listFiles.length != 0) {
                        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.2
                            @Override // java.util.Comparator
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file2, File file3) {
                                long lastModified = file2.lastModified() - file3.lastModified();
                                if (lastModified > 0) {
                                    return 1;
                                }
                                if (lastModified == 0) {
                                    return 0;
                                }
                                return -1;
                            }
                        });
                        return listFiles[0];
                    }
                    return null;
                }
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m14731b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b10)));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public static File m14721a(Context context) {
        File[] listFiles;
        File[] listFiles2;
        File file = null;
        try {
            synchronized (f15382b) {
                ULog.m14804i("walle", "get last envelope begin, thread is " + Thread.currentThread());
                if (context != null && context.getApplicationContext() != null) {
                    String str = context.getApplicationContext().getFilesDir() + File.separator + C3477a.f15359e;
                    if (!TextUtils.isEmpty(str)) {
                        File file2 = new File(str);
                        if (file2.isDirectory() && (listFiles = file2.listFiles()) != null && listFiles.length > 0) {
                            for (File file3 : listFiles) {
                                if (file3 != null && file3.isDirectory() && (listFiles2 = file3.listFiles()) != null && listFiles2.length > 0) {
                                    Arrays.sort(listFiles2, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.1
                                        @Override // java.util.Comparator
                                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public int compare(File file4, File file5) {
                                            long lastModified = file4.lastModified() - file5.lastModified();
                                            if (lastModified > 0) {
                                                return 1;
                                            }
                                            if (lastModified == 0) {
                                                return 0;
                                            }
                                            return -1;
                                        }
                                    });
                                    File file4 = listFiles2[0];
                                    if (file4 != null && (file == null || file.lastModified() > file4.lastModified())) {
                                        file = file4;
                                    }
                                }
                            }
                        }
                    }
                }
                ULog.m14804i("walle", "get last envelope end, thread is " + Thread.currentThread());
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
        return file;
    }

    /* renamed from: b */
    public static String m14730b(String str) {
        try {
            return Base64.encodeToString(str.getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m14722a(Context context, boolean z10) {
        String str;
        String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            if (z10) {
                str = context.getApplicationContext().getFilesDir() + File.separator + C3477a.f15359e;
            } else {
                str = context.getApplicationContext().getFilesDir() + File.separator + C3477a.f15360f;
            }
            str2 = str;
            return str2;
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public static void m14723a(Context context, String str, int i10) {
        try {
            if (str == null) {
                ULog.m14804i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            File file = new File(str);
            if (!file.isDirectory()) {
                ULog.m14804i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            synchronized (f15382b) {
                File[] listFiles = file.listFiles();
                ULog.m14804i("AmapLBS", "[lbs-build] delete file begin " + listFiles.length + ", thread is " + Thread.currentThread());
                if (listFiles.length >= i10) {
                    ULog.m14804i("AmapLBS", "[lbs-build] file size >= max");
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listFiles) {
                        if (file2 != null) {
                            arrayList.add(file2);
                        }
                    }
                    if (arrayList.size() >= i10) {
                        Collections.sort(arrayList, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.4
                            @Override // java.util.Comparator
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file3, File file4) {
                                if (file3 != null && file4 != null && file3.lastModified() < file4.lastModified()) {
                                    return -1;
                                }
                                if (file3 != null && file4 != null && file3.lastModified() == file4.lastModified()) {
                                    return 0;
                                }
                                return 1;
                            }
                        });
                        if (ULog.DEBUG) {
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                ULog.m14804i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i11)).getPath());
                            }
                        }
                        for (int i12 = 0; i12 <= arrayList.size() - i10; i12++) {
                            if (arrayList.get(i12) != null) {
                                ULog.m14804i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i12)).getPath());
                                try {
                                    ((File) arrayList.get(i12)).delete();
                                    arrayList.remove(i12);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                } else {
                    ULog.m14804i("AmapLBS", "[lbs-build] file size < max");
                }
                ULog.m14804i("AmapLBS", "[lbs-build] delete file end " + listFiles.length + ", thread is " + Thread.currentThread());
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: a */
    public static void m14724a(Context context, String str, final String str2, int i10) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.isDirectory()) {
                synchronized (f15382b) {
                    File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.umeng.commonsdk.stateless.d.5
                        @Override // java.io.FilenameFilter
                        public boolean accept(File file2, String str3) {
                            if (str3.startsWith(str2)) {
                                return true;
                            }
                            return false;
                        }
                    });
                    if (listFiles != null && listFiles.length >= i10) {
                        ULog.m14804i("AmapLBS", "[lbs-build] file size >= max");
                        ArrayList arrayList = new ArrayList();
                        for (File file2 : listFiles) {
                            if (file2 != null) {
                                arrayList.add(file2);
                            }
                        }
                        if (arrayList.size() >= i10) {
                            Collections.sort(arrayList, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.d.6
                                @Override // java.util.Comparator
                                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                                public int compare(File file3, File file4) {
                                    if (file3 != null && file4 != null && file3.lastModified() < file4.lastModified()) {
                                        return -1;
                                    }
                                    if (file3 != null && file4 != null && file3.lastModified() == file4.lastModified()) {
                                        return 0;
                                    }
                                    return 1;
                                }
                            });
                            if (ULog.DEBUG) {
                                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                    ULog.m14804i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i11)).getPath());
                                }
                            }
                            for (int i12 = 0; i12 <= arrayList.size() - i10; i12++) {
                                if (arrayList.get(i12) != null) {
                                    ULog.m14804i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i12)).getPath());
                                    try {
                                        ((File) arrayList.get(i12)).delete();
                                        arrayList.remove(i12);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    } else {
                        ULog.m14804i("AmapLBS", "[lbs-build] file size < max");
                    }
                    ULog.m14804i("AmapLBS", "[lbs-build] delete file end " + listFiles.length + ", thread is " + Thread.currentThread());
                }
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: a */
    public static byte[] m14728a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        f15381a = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                try {
                    int deflate = deflater.deflate(bArr2);
                    f15381a += deflate;
                    byteArrayOutputStream2.write(bArr2, 0, deflate);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            }
            deflater.end();
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
