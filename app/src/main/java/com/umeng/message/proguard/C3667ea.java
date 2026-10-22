package com.umeng.message.proguard;

import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;

/* renamed from: com.umeng.message.proguard.ea */
/* loaded from: classes3.dex */
public final class C3667ea {
    /* renamed from: a */
    private static void m15721a(File file) {
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* renamed from: a */
    public static File m15720a(String str) {
        String lowerCase = UMUtils.MD5(str).toLowerCase();
        File file = new File(C3643de.m15638a().getExternalFilesDir(null), "UMCache");
        m15721a(file);
        return new File(file, lowerCase);
    }
}
