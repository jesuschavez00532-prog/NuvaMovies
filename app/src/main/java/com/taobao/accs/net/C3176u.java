package com.taobao.accs.net;

import android.text.TextUtils;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import com.taobao.accs.net.C3166k;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.List;
import java.util.Map;

/* renamed from: com.taobao.accs.net.u */
/* loaded from: classes.dex */
class C3176u implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ IAuth.AuthCallback f13048a;

    /* renamed from: b */
    final /* synthetic */ C3166k.a f13049b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3176u(C3166k.a aVar, IAuth.AuthCallback authCallback) {
        this.f13049b = aVar;
        this.f13048a = authCallback;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        String str2;
        if (i10 < 0) {
            str2 = this.f13049b.f13026c;
            ALog.m12940e(str2, "auth onFinish", "statusCode", Integer.valueOf(i10));
            this.f13048a.onAuthFail(i10, "onFinish auth fail");
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        String str;
        String str2;
        AbstractC3156a abstractC3156a;
        AbstractC3156a abstractC3156a2;
        AbstractC3156a abstractC3156a3;
        str = this.f13049b.f13026c;
        ALog.m12940e(str, BaseMonitor.ALARM_POINT_AUTH, "httpStatusCode", Integer.valueOf(i10));
        if (i10 == 200) {
            this.f13048a.onAuthSuccess();
            abstractC3156a2 = this.f13049b.f13027d;
            if (abstractC3156a2 instanceof C3166k) {
                abstractC3156a3 = this.f13049b.f13027d;
                ((C3166k) abstractC3156a3).m12887o();
            }
        } else {
            this.f13048a.onAuthFail(i10, "auth fail");
        }
        Map<String, String> m12958a = UtilityImpl.m12958a(map);
        str2 = this.f13049b.f13026c;
        ALog.m12938d(str2, BaseMonitor.ALARM_POINT_AUTH, "header", m12958a);
        String str3 = m12958a.get("x-at");
        if (!TextUtils.isEmpty(str3)) {
            abstractC3156a = this.f13049b.f13027d;
            abstractC3156a.f12988k = str3;
        }
    }
}
