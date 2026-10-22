package com.uyumao;

import android.content.Context;

/* renamed from: com.uyumao.b */
/* loaded from: classes3.dex */
public final class RunnableC3770b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f16930a;

    public RunnableC3770b(Context context) {
        this.f16930a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r7 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            android.content.Context r2 = r7.f16930a     // Catch: java.lang.Throwable -> L6f
            java.io.File r2 = r2.getCacheDir()     // Catch: java.lang.Throwable -> L6f
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L6f
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "net_change"
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = com.uyumao.C3773e.m16016b(r0)     // Catch: java.lang.Throwable -> L6f
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L6f
            r2 = 0
            if (r1 != 0) goto L4b
            java.lang.String r1 = "\n"
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L6f
            int r1 = r0.length     // Catch: java.lang.Throwable -> L6f
            if (r1 <= 0) goto L4b
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            int r3 = r0.length     // Catch: java.lang.Throwable -> L6f
            r4 = 0
        L3c:
            if (r4 >= r3) goto L4c
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L6f
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6f
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            r1.put(r6)     // Catch: java.lang.Throwable -> L6f
            int r4 = r4 + 1
            goto L3c
        L4b:
            r1 = 0
        L4c:
            android.content.Context r0 = r7.f16930a     // Catch: java.lang.Throwable -> L6f
            android.content.Context r3 = com.uyumao.C3778j.f16966a     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L5a
            if (r0 == 0) goto L5a
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L6f
            com.uyumao.C3778j.f16966a = r0     // Catch: java.lang.Throwable -> L6f
        L5a:
            com.uyumao.j r0 = com.uyumao.C3778j.a.f16967a     // Catch: java.lang.Throwable -> L6f
            com.uyumao.i r0 = r0.m16026a()     // Catch: java.lang.Throwable -> L6f
            android.content.Context r3 = r7.f16930a     // Catch: java.lang.Throwable -> L6f
            org.json.JSONObject r0 = com.uyumao.C3771c.m15996a(r3, r0, r1)     // Catch: java.lang.Throwable -> L6f
            android.content.Context r3 = r7.f16930a     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L6b
            r2 = 1
        L6b:
            com.uyumao.C3771c.m15997a(r3, r0, r2)     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r0 = move-exception
            r0.printStackTrace()
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uyumao.RunnableC3770b.run():void");
    }
}
