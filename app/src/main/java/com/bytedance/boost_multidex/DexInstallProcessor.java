package com.bytedance.boost_multidex;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import com.bytedance.boost_multidex.DexHolder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
class DexInstallProcessor {
    private boolean mDoCheckSum;
    private SharedPreferences mPreferences;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DexInstallProcessor() {
        this.mDoCheckSum = new Random().nextInt(3) == 0;
        Monitor.get().logInfo("Do checksum " + this.mDoCheckSum);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean checkFileValid(int r10, java.lang.String r11, java.lang.String r12, java.io.File r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r13.exists()
            r1 = 0
            if (r0 != 0) goto L24
            com.bytedance.boost_multidex.Monitor r10 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "File does not exist! "
            r11.append(r12)
            java.lang.String r12 = r13.getPath()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.logWarning(r11)
            return r1
        L24:
            android.content.SharedPreferences r0 = r9.mPreferences
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r3 = -1
            long r5 = r0.getLong(r2, r3)
            long r7 = r13.lastModified()
            java.lang.String r0 = "Invalid file:  (key \""
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L72
            com.bytedance.boost_multidex.Monitor r13 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r0)
            r14.append(r11)
            r14.append(r12)
            r14.append(r10)
            java.lang.String r10 = "\"), expected modification time: "
            r14.append(r10)
            r14.append(r5)
            java.lang.String r10 = ", modification time: "
            r14.append(r10)
            r14.append(r7)
            java.lang.String r10 = r14.toString()
            r13.logWarning(r10)
            return r1
        L72:
            java.lang.String r2 = "dex.checksum."
            boolean r2 = r2.equals(r11)
            r5 = 1
            if (r2 == 0) goto L90
            if (r14 == 0) goto L82
            long r13 = com.bytedance.boost_multidex.Utility.doZipCheckSum(r13)     // Catch: java.io.IOException -> L8f
            goto L9c
        L82:
            boolean r14 = r9.mDoCheckSum     // Catch: java.io.IOException -> L8f
            if (r14 == 0) goto L8b
            long r13 = com.bytedance.boost_multidex.Utility.doFileCheckSum(r13)     // Catch: java.io.IOException -> L8f
            goto L9c
        L8b:
            r13 = 0
            r2 = 0
            goto L9d
        L8f:
            return r1
        L90:
            java.lang.String r14 = "odex.checksum."
            boolean r14 = r14.equals(r11)
            if (r14 == 0) goto Le6
            long r13 = r13.length()
        L9c:
            r2 = 1
        L9d:
            if (r2 == 0) goto Le5
            android.content.SharedPreferences r2 = r9.mPreferences
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r11)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            long r2 = r2.getLong(r6, r3)
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto Le5
            com.bytedance.boost_multidex.Monitor r4 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r11)
            r5.append(r12)
            r5.append(r10)
            java.lang.String r10 = "\"), expected checksum: "
            r5.append(r10)
            r5.append(r2)
            java.lang.String r10 = ", file checksum: "
            r5.append(r10)
            r5.append(r13)
            java.lang.String r10 = r5.toString()
            r4.logWarning(r10)
            return r1
        Le5:
            return r5
        Le6:
            com.bytedance.boost_multidex.Monitor r10 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "unsupported checksum key: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.logWarning(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.DexInstallProcessor.checkFileValid(int, java.lang.String, java.lang.String, java.io.File, boolean):boolean");
    }

    private File getValidDexFile(File file, int i10) {
        if (checkFileValid(i10, Constants.KEY_DEX_CHECKSUM, Constants.KEY_DEX_TIME, file, false)) {
            return file;
        }
        return null;
    }

    private File getValidOptDexFile(File file, int i10) {
        if (file.exists()) {
            if (checkFileValid(i10, Constants.KEY_ODEX_CHECKSUM, Constants.KEY_ODEX_TIME, file, false)) {
                return file;
            }
            return null;
        }
        Monitor.get().logInfo("opt file does not exist: " + file.getPath());
        return null;
    }

    private void installSecondaryDexes(ClassLoader classLoader, List<DexHolder> list) {
        DexLoader.create(Build.VERSION.SDK_INT).install(classLoader, list, this.mPreferences);
        try {
            BoostNative.recoverAction();
        } catch (UnsatisfiedLinkError unused) {
        }
        Monitor.get().logDebug("After install all, sp value is " + this.mPreferences.getAll());
    }

    private boolean isZipFileValid(File file, int i10) {
        return checkFileValid(i10, Constants.KEY_DEX_CHECKSUM, Constants.KEY_DEX_TIME, file, true);
    }

    private DexHolder obtainDexHolder(int i10, File file, File file2, File file3, File file4) {
        int i11 = this.mPreferences.getInt(Constants.KEY_DEX_OBJ_TYPE + i10, 9);
        if (i11 == 9) {
            i11 = BoostNative.isSupportFastLoad() ? !Utility.isBetterUseApkBuf() ? 1 : 0 : 3;
        }
        if (i11 == 3) {
            File file5 = new File(file4, i10 + Constants.ZIP_SUFFIX);
            File file6 = new File(file4, i10 + Constants.ODEX_SUFFIX);
            if (isZipFileValid(file5, i10)) {
                return new DexHolder.ZipOpt(i10, file5, file6);
            }
            ZipFile zipFile = new ZipFile(file);
            DexHolder.ZipOpt obtainValidZipDex = DexHolder.obtainValidZipDex(this.mPreferences, i10, file5, file6, zipFile, zipFile.getEntry(Constants.DEX_PREFIX + i10 + ".dex"));
            zipFile.close();
            return obtainValidZipDex;
        }
        File file7 = new File(file2, i10 + ".dex");
        File file8 = new File(file3, i10 + Constants.ODEX_SUFFIX);
        int i12 = 0;
        if (i11 == 2) {
            File validDexFile = getValidDexFile(file7, i10);
            if (validDexFile != null) {
                File validOptDexFile = getValidOptDexFile(file8, i10);
                if (validOptDexFile != null) {
                    return new DexHolder.DexOpt(i10, validDexFile, validOptDexFile, false);
                }
                if (!BoostNative.isSupportFastLoad()) {
                    return new DexHolder.DexOpt(i10, validDexFile, file8, true);
                }
                i11 = 1;
            } else {
                if (!BoostNative.isSupportFastLoad()) {
                    ZipFile zipFile2 = new ZipFile(file);
                    return DexHolder.obtainValidForceDexOpt(this.mPreferences, i10, file7, file8, zipFile2, zipFile2.getEntry(Constants.DEX_PREFIX + i10 + ".dex"));
                }
                i11 = 0;
            }
        }
        if (i11 == 1) {
            File validDexFile2 = getValidDexFile(file7, i10);
            if (!BoostNative.isSupportFastLoad()) {
                if (validDexFile2 != null) {
                    return new DexHolder.DexOpt(i10, validDexFile2, file8, true);
                }
                ZipFile zipFile3 = new ZipFile(file);
                return DexHolder.obtainValidForceDexOpt(this.mPreferences, i10, file7, file8, zipFile3, zipFile3.getEntry(Constants.DEX_PREFIX + i10 + ".dex"));
            }
            if (validDexFile2 != null) {
                return new DexHolder.DexBuffer(i10, validDexFile2, file8);
            }
        } else {
            i12 = i11;
        }
        if (i12 != 0) {
            return null;
        }
        if (!BoostNative.isSupportFastLoad()) {
            Monitor.get().logError("Do not support apk buf!");
        }
        ZipFile zipFile4 = new ZipFile(file);
        DexHolder.ApkBuffer apkBuffer = new DexHolder.ApkBuffer(i10, obtainEntryBytesInApk(zipFile4, zipFile4.getEntry(Constants.DEX_PREFIX + i10 + ".dex")), file7, file8);
        zipFile4.close();
        return apkBuffer;
    }

    @SuppressLint({"ApplySharedPref"})
    private List<DexHolder> obtainDexObjectList(File file, File file2, File file3, File file4, File file5, Result result) {
        Result result2;
        boolean z10;
        DexHolder obtainValidZipDex;
        long doZipCheckSum = Utility.doZipCheckSum(file);
        long lastModified = file.lastModified();
        long j10 = this.mPreferences.getLong("timestamp", -1L);
        String str = Constants.KEY_CRC;
        if (j10 == lastModified && this.mPreferences.getLong(Constants.KEY_CRC, -1L) == doZipCheckSum) {
            result2 = result;
            z10 = false;
        } else {
            result2 = result;
            z10 = true;
        }
        result2.modified = z10;
        ArrayList arrayList = new ArrayList();
        int i10 = 2;
        if (z10) {
            Utility.clearDirFiles(file3);
            Utility.clearDirFiles(file4);
            Utility.clearDirFiles(file5);
            SharedPreferences.Editor edit = this.mPreferences.edit();
            edit.clear();
            edit.commit();
            ZipFile zipFile = new ZipFile(file);
            while (true) {
                ZipEntry entry = zipFile.getEntry(Constants.DEX_PREFIX + i10 + ".dex");
                if (entry == null) {
                    break;
                }
                long j11 = doZipCheckSum;
                File file6 = new File(file3, i10 + ".dex");
                String str2 = str;
                File file7 = new File(file4, i10 + Constants.ODEX_SUFFIX);
                if (BoostNative.isSupportFastLoad()) {
                    if (Utility.isBetterUseApkBuf()) {
                        arrayList.add(new DexHolder.ApkBuffer(i10, obtainEntryBytesInApk(zipFile, entry), file6, file7));
                        i10++;
                        doZipCheckSum = j11;
                        str = str2;
                    } else {
                        obtainValidZipDex = DexHolder.obtainValidDexBuffer(this.mPreferences, i10, obtainEntryFileInApk(zipFile, entry, file6), file7);
                    }
                } else if (Environment.getDataDirectory().getFreeSpace() > Constants.SPACE_THRESHOLD) {
                    obtainValidZipDex = DexHolder.obtainValidForceDexOpt(this.mPreferences, i10, file6, file7, zipFile, entry);
                } else {
                    obtainValidZipDex = DexHolder.obtainValidZipDex(this.mPreferences, i10, new File(file5, i10 + Constants.ZIP_SUFFIX), new File(file5, i10 + Constants.ODEX_SUFFIX), zipFile, entry);
                }
                arrayList.add(obtainValidZipDex);
                i10++;
                doZipCheckSum = j11;
                str = str2;
            }
            zipFile.close();
            edit.putInt(Constants.KEY_DEX_NUMBER, i10 - 1);
            edit.putLong("timestamp", lastModified);
            edit.putLong(str, doZipCheckSum);
            edit.commit();
        } else {
            int i11 = this.mPreferences.getInt(Constants.KEY_DEX_NUMBER, 0);
            while (i10 <= i11) {
                arrayList.add(obtainDexHolder(i10, file, file3, file4, file5));
                i10++;
            }
        }
        return arrayList;
    }

    private byte[] obtainEntryBytesInApk(ZipFile zipFile, ZipEntry zipEntry) {
        return Utility.obtainEntryBytesInZip(zipFile, zipEntry);
    }

    private File obtainEntryFileInApk(ZipFile zipFile, ZipEntry zipEntry, File file) {
        return Utility.obtainEntryFileInZip(zipFile, zipEntry, file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void doInstallation(final Context context, File file, Result result) {
        File filesDir = context.getFilesDir();
        if (!filesDir.exists()) {
            Utility.mkdirChecked(filesDir);
        }
        Utility.clearDirFiles(new File(filesDir.getParent(), Constants.CODE_CACHE_SECONDARY_FOLDER_NAME));
        File ensureDirCreated = Utility.ensureDirCreated(filesDir, Constants.BOOST_MULTIDEX_DIR_NAME);
        File ensureDirCreated2 = Utility.ensureDirCreated(ensureDirCreated, Constants.DEX_DIR_NAME);
        File ensureDirCreated3 = Utility.ensureDirCreated(ensureDirCreated, Constants.ODEX_DIR_NAME);
        File ensureDirCreated4 = Utility.ensureDirCreated(ensureDirCreated, Constants.ZIP_DIR_NAME);
        result.setDirs(filesDir, ensureDirCreated, ensureDirCreated2, ensureDirCreated3, ensureDirCreated4);
        new Locker(new File(ensureDirCreated, Constants.LOCK_PREPARE_FILENAME)).lock();
        Locker locker = new Locker(new File(ensureDirCreated, Constants.LOCK_INSTALL_FILENAME));
        locker.lock();
        try {
            this.mPreferences = context.getSharedPreferences(Constants.PREFS_FILE, 0);
            result.freeSpaceBefore = Environment.getDataDirectory().getFreeSpace();
            List<DexHolder> obtainDexObjectList = obtainDexObjectList(file, ensureDirCreated, ensureDirCreated2, ensureDirCreated3, ensureDirCreated4, result);
            installSecondaryDexes(context.getClassLoader(), obtainDexObjectList);
            locker.close();
            long freeSpace = Environment.getDataDirectory().getFreeSpace();
            result.freeSpaceAfter = freeSpace;
            if (freeSpace < Constants.SPACE_MIN_THRESHOLD) {
                Monitor.get().logWarning("Free space is too small: " + freeSpace + ", compare to " + Constants.SPACE_MIN_THRESHOLD);
                return;
            }
            for (DexHolder dexHolder : obtainDexObjectList) {
                if (!(dexHolder instanceof DexHolder.ZipOpt) && !(dexHolder instanceof DexHolder.DexOpt)) {
                    Monitor.get().doAfterInstall(new Runnable() { // from class: com.bytedance.boost_multidex.DexInstallProcessor.1
                        @Override // java.lang.Runnable
                        public void run() {
                            OptimizeService.startOptimizeService(context);
                        }
                    });
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                Monitor.get().logWarning("Failed to install extracted secondary dex files", th);
                throw th;
            } finally {
                locker.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void doInstallationInOptProcess(Context context, File file) {
        if (!BoostNative.isSupportFastLoad()) {
            Monitor.get().logError("Fast load is not supported!");
            return;
        }
        ZipFile zipFile = new ZipFile(file);
        ArrayList arrayList = new ArrayList();
        int i10 = 2;
        while (true) {
            ZipEntry entry = zipFile.getEntry(Constants.DEX_PREFIX + i10 + ".dex");
            if (entry == null) {
                DexLoader.create(Build.VERSION.SDK_INT).install(context.getClassLoader(), arrayList);
                zipFile.close();
                try {
                    BoostNative.recoverAction();
                    return;
                } catch (UnsatisfiedLinkError unused) {
                    return;
                }
            }
            arrayList.add(new DexHolder.ApkBuffer(i10, obtainEntryBytesInApk(zipFile, entry), null, null));
            i10++;
        }
    }
}
