package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: com.google.android.gms.measurement.internal.m */
/* loaded from: classes.dex */
public abstract class AbstractC2366m {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m9787a(com.google.android.gms.measurement.internal.C2370m3 r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AbstractC2366m.m9787a(com.google.android.gms.measurement.internal.m3, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m9788b(C2370m3 c2370m3, SQLiteDatabase sQLiteDatabase) {
        if (c2370m3 != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                c2370m3.m9805w().m9699a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                c2370m3.m9805w().m9699a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                c2370m3.m9805w().m9699a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                c2370m3.m9805w().m9699a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
