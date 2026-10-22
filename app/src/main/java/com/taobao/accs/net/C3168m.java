package com.taobao.accs.net;

import android.content.Intent;
import android.os.Handler;
import anet.channel.ISessionListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.net.m */
/* loaded from: classes.dex */
public class C3168m implements ISessionListener {

    /* renamed from: a */
    final /* synthetic */ C3166k f13029a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3168m(C3166k c3166k) {
        this.f13029a = c3166k;
    }

    @Override // anet.channel.ISessionListener
    public void onConnectionChanged(Intent intent) {
        TaoBaseService.ConnectInfo connectInfo;
        Handler handler;
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
            String stringExtra = intent.getStringExtra("host");
            ALog.m12940e(this.f13029a.mo12858d(), "onConnectionChanged", "currentHost", "https://" + this.f13029a.f12986i.getInappHost(), "changeHost", stringExtra, "state", Boolean.valueOf(booleanExtra));
            if (("https://" + this.f13029a.f12986i.getInappHost()).equals(stringExtra)) {
                AbstractC3162g.m12870a(GlobalClientInfo.getContext()).m12872a();
                int intExtra = intent.getIntExtra(Constants.KEY_ERROR_CODE, -1);
                String stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
                boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
                boolean booleanExtra3 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
                if (booleanExtra) {
                    connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3);
                } else {
                    connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3, intExtra, stringExtra2);
                }
                connectInfo.connected = booleanExtra;
                Iterator<AccsConnectStateListener> it = this.f13029a.m12868n().iterator();
                while (it.hasNext()) {
                    AccsConnectStateListener next = it.next();
                    handler = this.f13029a.f13019r;
                    handler.post(new RunnableC3169n(this, connectInfo, next));
                }
            }
        }
    }
}
