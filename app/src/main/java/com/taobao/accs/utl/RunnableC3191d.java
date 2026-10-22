package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.utl.d */
/* loaded from: classes.dex */
public final class RunnableC3191d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13168a;

    /* renamed from: b */
    final /* synthetic */ String f13169b;

    /* renamed from: c */
    final /* synthetic */ int f13170c;

    /* renamed from: d */
    final /* synthetic */ AccsDataListener f13171d;

    /* renamed from: e */
    final /* synthetic */ String f13172e;

    /* renamed from: f */
    final /* synthetic */ byte[] f13173f;

    /* renamed from: g */
    final /* synthetic */ TaoBaseService.ExtraInfo f13174g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3191d(String str, String str2, int i10, AccsDataListener accsDataListener, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        this.f13168a = str;
        this.f13169b = str2;
        this.f13170c = i10;
        this.f13171d = accsDataListener;
        this.f13172e = str3;
        this.f13173f = bArr;
        this.f13174g = extraInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f13168a)) {
            ALog.m12940e(C3188a.TAG, "onData start", Constants.KEY_DATA_ID, this.f13169b, Constants.KEY_SERVICE_ID, this.f13168a, "command", Integer.valueOf(this.f13170c), "className", this.f13171d.getClass().getName());
        }
        this.f13171d.onData(this.f13168a, this.f13172e, this.f13169b, this.f13173f, this.f13174g);
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f13168a)) {
            ALog.m12940e(C3188a.TAG, "onData end", Constants.KEY_DATA_ID, this.f13169b);
        }
    }
}
