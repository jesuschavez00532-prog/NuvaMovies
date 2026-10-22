package anet.channel;

import anet.channel.p015b.C0901a;
import p183j0.AbstractC4968b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.j */
/* loaded from: classes.dex */
public final class RunnableC0946j implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            C0901a c0901a = new C0901a();
            c0901a.m4509a();
            AbstractC4968b.m20309a(c0901a, new C0947k(this), 1);
        } catch (Exception unused) {
        }
    }
}
