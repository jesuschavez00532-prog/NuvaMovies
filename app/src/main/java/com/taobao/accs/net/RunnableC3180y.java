package com.taobao.accs.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.net.y */
/* loaded from: classes.dex */
public class RunnableC3180y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13085a;

    /* renamed from: b */
    final /* synthetic */ C3177v f13086b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3180y(C3177v c3177v, String str) {
        this.f13086b = c3177v;
        this.f13085a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2 = this.f13085a;
        if (str2 != null) {
            str = this.f13086b.f13064O;
            if (str2.equals(str) && this.f13086b.f13070t == 2) {
                this.f13086b.f13060K = false;
                this.f13086b.f13062M = true;
                this.f13086b.m12918o();
                this.f13086b.f13058I.setCloseReason("conn timeout");
            }
        }
    }
}
