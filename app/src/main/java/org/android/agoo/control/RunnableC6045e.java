package org.android.agoo.control;

/* renamed from: org.android.agoo.control.e */
/* loaded from: classes3.dex */
class RunnableC6045e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f23706a;

    /* renamed from: b */
    final /* synthetic */ String f23707b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f23708c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6045e(AgooFactory agooFactory, String str, String str2) {
        this.f23708c = agooFactory;
        this.f23706a = str;
        this.f23707b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f23708c.updateMsgStatus(this.f23706a, this.f23707b);
    }
}
