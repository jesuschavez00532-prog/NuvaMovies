package anet.channel;

import android.content.Intent;
import anet.channel.util.ALog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.a */
/* loaded from: classes.dex */
public class RunnableC0895a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f3783a;

    /* renamed from: b */
    final /* synthetic */ AccsSessionManager f3784b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0895a(AccsSessionManager accsSessionManager, Intent intent) {
        this.f3784b = accsSessionManager;
        this.f3783a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = AccsSessionManager.f3672c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            try {
                ((ISessionListener) it.next()).onConnectionChanged(this.f3783a);
            } catch (Exception e10) {
                ALog.m4786e("awcn.AccsSessionManager", "notifyListener exception.", null, e10, new Object[0]);
            }
        }
    }
}
