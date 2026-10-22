package org.android.agoo.control;

import com.taobao.accs.base.TaoBaseService;

/* renamed from: org.android.agoo.control.b */
/* loaded from: classes3.dex */
class RunnableC6042b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f23698a;

    /* renamed from: b */
    final /* synthetic */ String f23699b;

    /* renamed from: c */
    final /* synthetic */ TaoBaseService.ExtraInfo f23700c;

    /* renamed from: d */
    final /* synthetic */ AgooFactory f23701d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6042b(AgooFactory agooFactory, byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        this.f23701d = agooFactory;
        this.f23698a = bArr;
        this.f23699b = str;
        this.f23700c = extraInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f23701d.msgReceiverPreHandler(this.f23698a, this.f23699b, this.f23700c, true);
    }
}
