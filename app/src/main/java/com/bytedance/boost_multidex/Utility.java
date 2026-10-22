package com.bytedance.boost_multidex;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.Process;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes.dex */
public class Utility {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void clearDirFiles(File file) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Monitor.get().logWarning("Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Monitor.get().logInfo("Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Monitor.get().logInfo("Deleted old file " + file2.getPath());
                } else {
                    Monitor.get().logWarning("Failed to delete old file " + file2.getPath());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            Monitor.get().logWarning("Failed to close resource", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long doFileCheckSum(java.io.File r6) {
        /*
            boolean r0 = r6.exists()
            r1 = 0
            if (r0 != 0) goto L25
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "File is not exist: "
            r3.append(r4)
            java.lang.String r6 = r6.getPath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r0.logInfo(r6)
            return r1
        L25:
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            boolean r0 = r0.isEnableNativeCheckSum()
            if (r0 == 0) goto L55
            java.lang.String r0 = r6.getPath()     // Catch: java.lang.Throwable -> L38
            long r3 = com.bytedance.boost_multidex.BoostNative.obtainCheckSum(r0)     // Catch: java.lang.Throwable -> L38
            goto L56
        L38:
            r0 = move-exception
            com.bytedance.boost_multidex.Monitor r3 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to native obtainCheckSum in "
            r4.append(r5)
            java.lang.String r5 = r6.getPath()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.logWarning(r4, r0)
        L55:
            r3 = r1
        L56:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L90
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.String r1 = "Fall back to java impl"
            r0.logWarning(r1)
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            java.util.zip.CheckedInputStream r1 = new java.util.zip.CheckedInputStream     // Catch: java.lang.Throwable -> L8a
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8a
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L8a
            java.util.zip.Adler32 r6 = new java.util.zip.Adler32     // Catch: java.lang.Throwable -> L8a
            r6.<init>()     // Catch: java.lang.Throwable -> L8a
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> L8a
        L76:
            int r6 = r1.read(r0)     // Catch: java.lang.Throwable -> L88
            if (r6 >= 0) goto L76
            java.util.zip.Checksum r6 = r1.getChecksum()     // Catch: java.lang.Throwable -> L88
            long r3 = r6.getValue()     // Catch: java.lang.Throwable -> L88
            closeQuietly(r1)
            goto L90
        L88:
            r6 = move-exception
            goto L8c
        L8a:
            r6 = move-exception
            r1 = 0
        L8c:
            closeQuietly(r1)
            throw r6
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.Utility.doFileCheckSum(java.io.File):long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long doZipCheckSum(File file) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile.length() - 22;
                if (length < 0) {
                    throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
                }
                long j10 = length - IjkMediaMeta.AV_CH_TOP_BACK_CENTER;
                if (j10 < 0) {
                    j10 = 0;
                }
                int reverseBytes = Integer.reverseBytes(Constants.ENDSIG);
                do {
                    randomAccessFile.seek(length);
                    if (randomAccessFile.readInt() == reverseBytes) {
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        long reverseBytes2 = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                        CRC32 crc32 = new CRC32();
                        randomAccessFile.seek(4294967295L & Integer.reverseBytes(randomAccessFile.readInt()));
                        byte[] bArr = new byte[8192];
                        int read = randomAccessFile.read(bArr, 0, (int) Math.min(IjkMediaMeta.AV_CH_TOP_FRONT_CENTER, reverseBytes2));
                        while (read != -1) {
                            crc32.update(bArr, 0, read);
                            reverseBytes2 -= read;
                            if (reverseBytes2 == 0) {
                                break;
                            }
                            read = randomAccessFile.read(bArr, 0, (int) Math.min(IjkMediaMeta.AV_CH_TOP_FRONT_CENTER, reverseBytes2));
                        }
                        long value = crc32.getValue();
                        closeQuietly(randomAccessFile);
                        return value;
                    }
                    length--;
                } while (length >= j10);
                throw new ZipException("End Of Central Directory signature not found");
            } catch (Throwable th) {
                th = th;
                closeQuietly(randomAccessFile);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File ensureDirCreated(File file, String str) {
        File file2 = new File(file, str);
        mkdirChecked(file2);
        return file2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void expandFieldArray(Object obj, String str, Object[] objArr) {
        Field findField = findField(obj.getClass(), str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        findField.set(obj, objArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Constructor findConstructor(Class<?> cls, Class<?>... clsArr) {
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    static Field findField(Class<?> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        if (!declaredField.isAccessible()) {
            declaredField.setAccessible(true);
        }
        return declaredField;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Field findFieldRecursively(Class<?> cls, String str) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                return findField(cls2, str);
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + cls);
    }

    static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod;
    }

    static Method findMethodRecursively(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                return findMethod(cls2, str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getCurProcessName(Context context) {
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isBetterUseApkBuf() {
        Runtime runtime = Runtime.getRuntime();
        long freeSpace = Environment.getDataDirectory().getFreeSpace();
        long maxMemory = runtime.maxMemory() - runtime.totalMemory();
        Monitor.get().logInfo("Memory remains " + maxMemory + ", free space " + freeSpace);
        return maxMemory > Constants.MEM_THRESHOLD || freeSpace < Constants.SPACE_MIN_THRESHOLD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isOptimizeProcess(String str) {
        return str != null && str.endsWith(":boost_multidex");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void mkdirChecked(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Monitor.get().logError("Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Monitor.get().logError("Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }

    static byte[] obtainBytesFromInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            closeQuietly(byteArrayOutputStream);
        }
    }

    static byte[] obtainBytesInFile(File file) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file.getPath(), "r");
            try {
                try {
                    byte[] bArr = new byte[(int) randomAccessFile.length()];
                    randomAccessFile.readFully(bArr);
                    closeQuietly(randomAccessFile);
                    return bArr;
                } catch (IOException e10) {
                    e = e10;
                    Monitor.get().logWarning("Fail to get bytes of file", e);
                    closeQuietly(randomAccessFile);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                closeQuietly(randomAccessFile2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            closeQuietly(randomAccessFile2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] obtainEntryBytesInZip(ZipFile zipFile, ZipEntry zipEntry) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        IOException e10 = null;
        for (int i10 = 3; i10 > 0; i10--) {
            try {
                InputStream inputStream3 = zipFile.getInputStream(zipEntry);
                try {
                    byte[] obtainBytesFromInputStream = obtainBytesFromInputStream(inputStream3);
                    closeQuietly(inputStream3);
                    return obtainBytesFromInputStream;
                } catch (IOException e11) {
                    inputStream = inputStream3;
                    e10 = e11;
                    closeQuietly(inputStream);
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream3;
                    closeQuietly(inputStream2);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw e10;
    }

    static File obtainEntryFileFromInputStream(InputStream inputStream, File file) {
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        Monitor.get().logInfo("Extracting " + createTempFile.getPath());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            if (!createTempFile.setReadOnly()) {
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            }
            Monitor.get().logInfo("Renaming to " + file.getPath());
            if (createTempFile.renameTo(file)) {
                return file;
            }
            throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
        } finally {
            closeQuietly(fileOutputStream);
            createTempFile.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File obtainEntryFileInZip(ZipFile zipFile, ZipEntry zipEntry, File file) {
        IOException iOException = null;
        int i10 = 3;
        while (i10 > 0) {
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                File obtainEntryFileFromInputStream = obtainEntryFileFromInputStream(inputStream, file);
                closeQuietly(inputStream);
                return obtainEntryFileFromInputStream;
            } catch (IOException e10) {
                closeQuietly(inputStream);
                i10--;
                iOException = e10;
            } catch (Throwable th) {
                closeQuietly(inputStream);
                throw th;
            }
        }
        throw iOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void obtainZipForEntryFileInZip(ZipFile zipFile, ZipEntry zipEntry, File file) {
        IOException iOException = null;
        int i10 = 3;
        while (i10 > 0) {
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            File createTempFile = File.createTempFile("tmp-", Constants.ZIP_SUFFIX, file.getParentFile());
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
                try {
                    ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                    zipEntry2.setTime(zipEntry.getTime());
                    zipOutputStream.putNextEntry(zipEntry2);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, read);
                        }
                    }
                    zipOutputStream.closeEntry();
                    zipOutputStream.close();
                    if (!createTempFile.setReadOnly()) {
                        throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                    }
                    Monitor.get().logInfo("Renaming to " + file.getPath());
                    if (createTempFile.renameTo(file)) {
                        closeQuietly(inputStream);
                        createTempFile.delete();
                        return;
                    }
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                } catch (Throwable th) {
                    zipOutputStream.close();
                    throw th;
                }
            } catch (IOException e10) {
                closeQuietly(inputStream);
                createTempFile.delete();
                i10--;
                iOException = e10;
            } catch (Throwable th2) {
                closeQuietly(inputStream);
                createTempFile.delete();
                throw th2;
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean storeBytesToFile(byte[] bArr, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            fileOutputStream.write(bArr);
            closeQuietly(fileOutputStream);
            return true;
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            Monitor.get().logError("fail to store bytes to file", e);
            closeQuietly(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            closeQuietly(fileOutputStream2);
            throw th;
        }
    }
}
