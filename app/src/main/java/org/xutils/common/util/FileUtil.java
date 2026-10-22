package org.xutils.common.util;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.xutils.C6127x;

/* loaded from: classes3.dex */
public class FileUtil {
    private FileUtil() {
    }

    public static boolean copy(String str, String str2) {
        FileOutputStream fileOutputStream;
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(str2);
        IOUtil.deleteFileOrDir(file2);
        File parentFile = file2.getParentFile();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    IOUtil.copy(fileInputStream2, fileOutputStream);
                    IOUtil.closeQuietly(fileInputStream2);
                    IOUtil.closeQuietly(fileOutputStream);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    try {
                        LogUtil.m24374d(th.getMessage(), th);
                        return false;
                    } finally {
                        IOUtil.closeQuietly(fileInputStream);
                        IOUtil.closeQuietly(fileOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static boolean deleteFileOrDir(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                return file.delete();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    deleteFileOrDir(file2);
                }
            }
            return file.delete();
        }
        return true;
    }

    public static Boolean existsSdcard() {
        return Boolean.valueOf(Environment.getExternalStorageState().equals("mounted"));
    }

    public static File getCacheDir(String str) {
        File file;
        File externalCacheDir;
        if (isDiskAvailable() && (externalCacheDir = C6127x.app().getExternalCacheDir()) != null) {
            file = new File(externalCacheDir, str);
        } else {
            file = null;
        }
        if (file == null) {
            file = new File(C6127x.app().getCacheDir(), str);
        }
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static long getDiskAvailableSize() {
        if (!existsSdcard().booleanValue()) {
            return 0L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static long getFileOrDirSize(File file) {
        long j10 = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j10 += getFileOrDirSize(file2);
            }
        }
        return j10;
    }

    public static boolean isDiskAvailable() {
        if (getDiskAvailableSize() > 10485760) {
            return true;
        }
        return false;
    }
}
