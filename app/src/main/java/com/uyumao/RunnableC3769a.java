package com.uyumao;

import android.content.Context;
import com.uyumao.C3778j;
import org.json.JSONArray;

/* renamed from: com.uyumao.a */
/* loaded from: classes3.dex */
public final class RunnableC3769a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f16929a;

    public RunnableC3769a(Context context) {
        this.f16929a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Context context = this.f16929a;
            if (C3778j.f16966a == null && context != null) {
                C3778j.f16966a = context.getApplicationContext();
            }
            C3771c.m15997a(this.f16929a, C3771c.m15996a(this.f16929a, C3778j.a.f16967a.m16026a(), (JSONArray) null), false);
        } catch (Throwable unused) {
        }
    }
}
