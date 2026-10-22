package com.taobao.accs.net;

import android.content.Intent;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.C3131a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p071a.C3114a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3197j;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.net.d */
/* loaded from: classes.dex */
public class RunnableC3159d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC3156a f13000a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3159d(AbstractC3156a abstractC3156a) {
        this.f13000a = abstractC3156a;
    }

    @Override // java.lang.Runnable
    public void run() {
        ALog.m12938d(this.f13000a.mo12858d(), "startChannelService", new Object[0]);
        Intent intent = new Intent(Constants.ACTION_START_SERVICE);
        intent.putExtra(Constants.KEY_APP_KEY, this.f13000a.m12863i());
        intent.putExtra(Constants.KEY_TTID, this.f13000a.f12978a);
        intent.putExtra(Constants.KEY_PACKAGE_NAME, GlobalClientInfo.getContext().getPackageName());
        intent.putExtra("app_sercet", this.f13000a.f12986i.getAppSecret());
        intent.putExtra(Constants.KEY_MODE, AccsClientConfig.mEnv);
        intent.putExtra(Config.PROPERTY_APP_KEY, Config.m24181a(GlobalClientInfo.getContext()));
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.f13000a.f12990m);
        intent.setClassName(GlobalClientInfo.getContext().getPackageName(), C3197j.channelService);
        C3114a.m12664a(GlobalClientInfo.getContext(), intent);
        Intent intent2 = new Intent();
        intent2.setAction(AgooConstants.INTENT_FROM_AGOO_REPORT);
        intent2.setPackage(GlobalClientInfo.getContext().getPackageName());
        String packageName = GlobalClientInfo.getContext().getPackageName();
        GlobalClientInfo.getContext().getPackageName();
        intent2.setClassName(packageName, C3131a.m12733b());
        C3114a.m12664a(GlobalClientInfo.getContext(), intent2);
    }
}
