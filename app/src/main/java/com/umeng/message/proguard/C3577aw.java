package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Intent;
import com.umeng.message.api.UPushMessageNotifyApi;
import com.umeng.message.common.UPLog;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.aw */
/* loaded from: classes3.dex */
public final class C3577aw implements UPushMessageNotifyApi {

    /* renamed from: d */
    private static final C3577aw f16023d = new C3577aw();

    /* renamed from: b */
    public volatile boolean f16025b;

    /* renamed from: c */
    public boolean f16026c = true;

    /* renamed from: a */
    public final C3578ax f16024a = new C3578ax();

    private C3577aw() {
    }

    /* renamed from: a */
    public static C3577aw m15353a() {
        return f16023d;
    }

    /* renamed from: b */
    public final void m15356b() {
        if (this.f16025b) {
            return;
        }
        this.f16025b = true;
        this.f16024a.m15359a();
    }

    @Override // com.umeng.message.api.UPushMessageNotifyApi
    public final boolean isEnabled() {
        return this.f16024a.f16028b.m15365a();
    }

    @Override // com.umeng.message.api.UPushMessageNotifyApi
    public final void setCallback(UPushMessageNotifyApi.Callback callback) {
        C3578ax c3578ax = this.f16024a;
        c3578ax.f16027a = callback;
        if (callback != null && c3578ax.f16029c) {
            try {
                callback.onNotified();
                c3578ax.f16029c = false;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.umeng.message.api.UPushMessageNotifyApi
    public final void setEnable(final boolean z10) {
        this.f16026c = z10;
        final C3578ax c3578ax = this.f16024a;
        if (c3578ax.f16028b.m15365a() != z10) {
            c3578ax.f16028b.f16039a.m15398a("e_u", z10);
            C3581b.m15374b(new Runnable() { // from class: com.umeng.message.proguard.ax.4
                @Override // java.lang.Runnable
                public final void run() {
                    C3578ax.this.f16028b.m15367b(true);
                    boolean z11 = false;
                    try {
                        if (C3637d.m15612h(C3706y.m15840a())) {
                            z11 = C3578ax.m15358a(z10);
                        }
                    } catch (Throwable th) {
                        UPLog.m15196e("Notify", th);
                    }
                    C3578ax.this.f16028b.m15367b(!z11);
                }
            });
        }
    }

    /* renamed from: a */
    public final void m15355a(JSONObject jSONObject) {
        this.f16024a.m15361a(jSONObject);
    }

    /* renamed from: a */
    public final void m15354a(Activity activity, Intent intent) {
        this.f16024a.m15360a(activity, intent);
    }
}
