package com.taobao.accs.net;

/* renamed from: com.taobao.accs.net.x */
/* loaded from: classes.dex */
class RunnableC3179x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3177v f13084a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3179x(C3177v c3177v) {
        this.f13084a = c3177v;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13084a.m12918o();
        if (this.f13084a.f13058I != null) {
            this.f13084a.f13058I.setCloseReason("shut down");
        }
        synchronized (this.f13084a.f13071u) {
            try {
                this.f13084a.f13071u.notifyAll();
            } catch (Exception unused) {
            }
        }
    }
}
