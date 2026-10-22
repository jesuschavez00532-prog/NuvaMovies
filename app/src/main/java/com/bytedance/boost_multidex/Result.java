package com.bytedance.boost_multidex;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Result {
    private static Result result = new Result();
    public File dataDir;
    public File dexDir;
    public Throwable fatalThrowable;
    public long freeSpaceAfter;
    public long freeSpaceBefore;
    public boolean isYunOS;
    public boolean modified;
    public File optDexDir;
    public File rootDir;
    public boolean supportFastLoadDex;
    public String vmLibName;
    public File zipDir;
    public List<Throwable> unFatalThrowable = new ArrayList();
    public List<String> dexInfoList = new ArrayList();

    private Result() {
    }

    public static Result get() {
        Result result2 = result;
        if (result2 != null) {
            return result2;
        }
        Log.w(Constants.TAG, "Avoid npe, but return a invalid tmp result");
        return new Result();
    }

    public void addDexInfo(String str) {
        this.dexInfoList.add(str);
    }

    public void addUnFatalThrowable(Throwable th) {
        this.unFatalThrowable.add(th);
    }

    public void setDirs(File file, File file2, File file3, File file4, File file5) {
        this.dataDir = file;
        this.rootDir = file2;
        this.dexDir = file3;
        this.optDexDir = file4;
        this.zipDir = file5;
    }

    public void setFatalThrowable(Throwable th) {
        this.fatalThrowable = th;
    }
}
