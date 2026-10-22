package com.taobao.accs.data;

import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.data.l */
/* loaded from: classes.dex */
public class RunnableC3147l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f12953a;

    /* renamed from: b */
    final /* synthetic */ MsgDistributeService f12954b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3147l(MsgDistributeService msgDistributeService, Intent intent) {
        this.f12954b = msgDistributeService;
        this.f12953a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        ALog.m12941i("MsgDistributeService", "onStartCommand send message", new Object[0]);
        ACCSManager.AccsRequest accsRequest = (ACCSManager.AccsRequest) this.f12953a.getSerializableExtra(Constants.KEY_SEND_REQDATA);
        String stringExtra = this.f12953a.getStringExtra(Constants.KEY_PACKAGE_NAME);
        String stringExtra2 = this.f12953a.getStringExtra(Constants.KEY_APP_KEY);
        String stringExtra3 = this.f12953a.getStringExtra(Constants.KEY_CONFIG_TAG);
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra3 = stringExtra2;
        }
        ACCSManager.getAccsInstance(this.f12954b.getApplicationContext(), stringExtra2, stringExtra3).mo12672a(this.f12954b.getApplicationContext(), accsRequest, stringExtra, false);
    }
}
