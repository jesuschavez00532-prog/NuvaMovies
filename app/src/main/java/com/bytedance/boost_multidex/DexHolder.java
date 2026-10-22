package com.bytedance.boost_multidex;

import android.content.SharedPreferences;
import com.bytedance.boost_multidex.DexLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class DexHolder {
    File mFile;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ApkBuffer extends DexHolder {
        private byte[] mBytes;
        private int mIndex;
        private File mOptFile;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ApkBuffer(int i10, byte[] bArr, File file, File file2) {
            this.mIndex = i10;
            this.mBytes = bArr;
            this.mFile = file;
            this.mOptFile = file2;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public StoreInfo getInfo() {
            return null;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public Object toDexFile() {
            try {
                return BoostNative.loadDirectDex(null, this.mBytes);
            } catch (Exception e10) {
                Monitor.get().logError("Fail to create DexFile: " + toString(), e10);
                Result.get().unFatalThrowable.add(e10);
                return null;
            }
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public Object toDexListElement(DexLoader.ElementConstructor elementConstructor) {
            Object dexFile = toDexFile();
            if (dexFile == null) {
                return null;
            }
            return elementConstructor.newInstance(null, dexFile);
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            if (Utility.storeBytesToFile(this.mBytes, this.mFile)) {
                try {
                    return DexHolder.obtainValidDexBuffer(sharedPreferences, this.mIndex, this.mFile, this.mOptFile);
                } catch (IOException e10) {
                    Monitor.get().logError("fail to get dex buffer", e10);
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(", index: ");
            sb2.append(this.mIndex);
            sb2.append(", [file: ");
            sb2.append(this.mFile.getPath());
            sb2.append(", size: ");
            sb2.append(this.mFile.length());
            sb2.append("], [opt file: ");
            sb2.append(this.mOptFile);
            sb2.append(", size: ");
            sb2.append(this.mOptFile.length());
            sb2.append("], bytes len: ");
            byte[] bArr = this.mBytes;
            sb2.append(bArr == null ? null : Integer.valueOf(bArr.length));
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class DexBuffer extends DexHolder {
        private int mIndex;
        private File mOptFile;

        /* JADX INFO: Access modifiers changed from: package-private */
        public DexBuffer(int i10, File file, File file2) {
            this.mIndex = i10;
            this.mFile = file;
            this.mOptFile = file2;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public StoreInfo getInfo() {
            return new StoreInfo(1, this.mIndex, this.mFile);
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public Object toDexFile() {
            try {
                return BoostNative.loadDirectDex(this.mFile.getPath(), null);
            } catch (Exception e10) {
                Monitor.get().logError("Fail to create DexFile: " + toString(), e10);
                Result.get().unFatalThrowable.add(e10);
                return null;
            }
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            try {
                if (!BoostNative.isSupportFastLoad() || !BoostNative.makeOptDexFile(this.mFile.getPath(), this.mOptFile.getPath())) {
                    Monitor.get().logWarning("Opt dex in origin way");
                    DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0).close();
                }
                return DexHolder.obtainValidDexOpt(sharedPreferences, this.mIndex, this.mFile, this.mOptFile);
            } catch (IOException e10) {
                Monitor.get().logError("Fail to opt dex finally", e10);
                return null;
            }
        }

        public String toString() {
            return super.toString() + ", index: " + this.mIndex + ", [file: " + this.mFile.getPath() + ", size: " + this.mFile.length() + "], [opt file: " + this.mOptFile + ", size: " + this.mOptFile.length() + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class DexOpt extends DexHolder {
        private boolean mForceOpt;
        private int mIndex;
        private File mOptFile;

        /* JADX INFO: Access modifiers changed from: package-private */
        public DexOpt(int i10, File file, File file2, boolean z10) {
            this.mIndex = i10;
            this.mFile = file;
            this.mOptFile = file2;
            this.mForceOpt = z10;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public StoreInfo getInfo() {
            return new StoreInfo(2, this.mIndex, this.mOptFile);
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public Object toDexFile() {
            try {
                return DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0);
            } catch (IOException e10) {
                Monitor.get().logError("Fail to load dex file first time", e10);
                try {
                    return this.mForceOpt ? DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0) : BoostNative.loadDirectDex(this.mFile.getPath(), null);
                } catch (IOException e11) {
                    Monitor.get().logError("Fail to load dex file", e11);
                    throw new RuntimeException(e11);
                }
            }
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            return null;
        }

        public String toString() {
            return super.toString() + ", index: " + this.mIndex + ", [file: " + this.mFile.getPath() + ", size: " + this.mFile.length() + "], [opt file: " + this.mOptFile + ", size: " + this.mOptFile.length() + "], force: " + this.mForceOpt;
        }
    }

    /* loaded from: classes.dex */
    class StoreInfo {
        File file;
        int index;
        int type;

        StoreInfo(int i10, int i11, File file) {
            this.type = i10;
            this.index = i11;
            this.file = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ZipOpt extends DexHolder {
        private int mIndex;
        private File mOptFile;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ZipOpt(int i10, File file, File file2) {
            this.mIndex = i10;
            this.mFile = file;
            this.mOptFile = file2;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public StoreInfo getInfo() {
            return null;
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public Object toDexFile() {
            try {
                return DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0);
            } catch (IOException e10) {
                Monitor.get().logError("Fail to load dex file");
                throw new RuntimeException(e10);
            }
        }

        @Override // com.bytedance.boost_multidex.DexHolder
        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            return null;
        }

        public String toString() {
            return super.toString() + ", index: " + this.mIndex + ", [file: " + this.mFile.getPath() + ", size: " + this.mFile.length() + "], [opt file: " + this.mOptFile + ", size: " + this.mOptFile.length() + "]";
        }
    }

    DexHolder() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DexHolder obtainValidDexBuffer(SharedPreferences sharedPreferences, int i10, File file, File file2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i10, 1);
        putDexFileInfo(edit, i10, file);
        edit.commit();
        return new DexBuffer(i10, file, file2);
    }

    static DexHolder obtainValidDexOpt(SharedPreferences sharedPreferences, int i10, File file, File file2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i10, 2);
        putDexOptInfo(edit, i10, file2);
        edit.commit();
        return new DexOpt(i10, file, file2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DexHolder obtainValidForceDexOpt(SharedPreferences sharedPreferences, int i10, File file, File file2, ZipFile zipFile, ZipEntry zipEntry) {
        File obtainEntryFileInZip = Utility.obtainEntryFileInZip(zipFile, zipEntry, file);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i10, 2);
        putDexFileInfo(edit, i10, obtainEntryFileInZip);
        edit.commit();
        return new DexOpt(i10, obtainEntryFileInZip, file2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZipOpt obtainValidZipDex(SharedPreferences sharedPreferences, int i10, File file, File file2, ZipFile zipFile, ZipEntry zipEntry) {
        Utility.obtainZipForEntryFileInZip(zipFile, zipEntry, file);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i10, 3);
        putZipOptInfo(edit, i10, file);
        edit.commit();
        return new ZipOpt(i10, file, file2);
    }

    private static void putDexFileInfo(SharedPreferences.Editor editor, int i10, File file) {
        long doFileCheckSum = Utility.doFileCheckSum(file);
        editor.putLong(Constants.KEY_DEX_CHECKSUM + i10, doFileCheckSum);
        long lastModified = file.lastModified();
        editor.putLong(Constants.KEY_DEX_TIME + i10, lastModified);
        Monitor.get().logInfo("Put f key " + Constants.KEY_DEX_CHECKSUM + Constants.KEY_DEX_TIME + i10 + " checksum=" + doFileCheckSum + ", time=" + lastModified);
    }

    private static void putDexOptInfo(SharedPreferences.Editor editor, int i10, File file) {
        long length = file.length();
        editor.putLong(Constants.KEY_ODEX_CHECKSUM + i10, length);
        long lastModified = file.lastModified();
        editor.putLong(Constants.KEY_ODEX_TIME + i10, lastModified);
        Monitor.get().logInfo("Put o key " + Constants.KEY_ODEX_CHECKSUM + Constants.KEY_ODEX_TIME + i10 + " checksum=" + length + ", time=" + lastModified);
    }

    private static void putTypeInfo(SharedPreferences.Editor editor, int i10, int i11) {
        editor.putInt(Constants.KEY_DEX_OBJ_TYPE + i10, i11);
    }

    private static void putZipOptInfo(SharedPreferences.Editor editor, int i10, File file) {
        long doZipCheckSum = Utility.doZipCheckSum(file);
        editor.putLong(Constants.KEY_DEX_CHECKSUM + i10, doZipCheckSum);
        long lastModified = file.lastModified();
        editor.putLong(Constants.KEY_DEX_TIME + i10, lastModified);
        Monitor.get().logInfo("Put z key " + Constants.KEY_DEX_CHECKSUM + Constants.KEY_DEX_TIME + i10 + " checksum=" + doZipCheckSum + ", time=" + lastModified);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract StoreInfo getInfo();

    abstract Object toDexFile();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object toDexListElement(DexLoader.ElementConstructor elementConstructor) {
        Object dexFile = toDexFile();
        if (dexFile == null) {
            return null;
        }
        return elementConstructor.newInstance(this.mFile, dexFile);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract DexHolder toFasterHolder(SharedPreferences sharedPreferences);
}
