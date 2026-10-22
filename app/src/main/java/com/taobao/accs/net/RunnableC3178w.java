package com.taobao.accs.net;

import com.taobao.accs.data.Message;

/* renamed from: com.taobao.accs.net.w */
/* loaded from: classes.dex */
class RunnableC3178w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Message f13081a;

    /* renamed from: b */
    final /* synthetic */ boolean f13082b;

    /* renamed from: c */
    final /* synthetic */ C3177v f13083c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3178w(C3177v c3177v, Message message, boolean z10) {
        this.f13083c = c3177v;
        this.f13081a = message;
        this.f13082b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f13083c.f13071u) {
            this.f13083c.m12896a(this.f13081a);
            if (this.f13083c.f13071u.size() == 0) {
                this.f13083c.f13071u.add(this.f13081a);
            } else {
                Message message = (Message) this.f13083c.f13071u.getFirst();
                if (this.f13081a.getType() != 1 && this.f13081a.getType() != 0) {
                    if (this.f13081a.getType() == 2 && message.getType() == 2) {
                        if (!message.force && this.f13081a.force) {
                            this.f13083c.f13071u.removeFirst();
                            this.f13083c.f13071u.addFirst(this.f13081a);
                        }
                    } else {
                        this.f13083c.f13071u.addLast(this.f13081a);
                    }
                }
                this.f13083c.f13071u.addLast(this.f13081a);
                if (message.getType() == 2) {
                    this.f13083c.f13071u.removeFirst();
                }
            }
            if (this.f13082b || this.f13083c.f13070t == 3) {
                try {
                    this.f13083c.f13071u.notifyAll();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
