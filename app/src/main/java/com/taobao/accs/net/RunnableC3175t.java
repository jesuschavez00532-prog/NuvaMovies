package com.taobao.accs.net;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.net.t */
/* loaded from: classes.dex */
public class RunnableC3175t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3166k f13047a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3175t(C3166k c3166k) {
        this.f13047a = c3166k;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C3166k c3166k = this.f13047a;
            if (c3166k.f12981d == null || TextUtils.isEmpty(c3166k.m12863i())) {
                return;
            }
            ALog.m12941i(this.f13047a.mo12858d(), "mTryStartServiceRunable bindapp", new Object[0]);
            this.f13047a.m12865k();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
