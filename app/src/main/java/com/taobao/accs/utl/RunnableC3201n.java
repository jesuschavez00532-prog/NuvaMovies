package com.taobao.accs.utl;

import android.app.Application;
import com.taobao.accs.utl.C3199l;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.taobao.accs.utl.n */
/* loaded from: classes.dex */
class RunnableC3201n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3199l f13218a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3201n(C3199l c3199l) {
        this.f13218a = c3199l;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        arrayList = C3199l.f13207d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3199l.b bVar = (C3199l.b) it.next();
            if (bVar != null) {
                Application unused = C3199l.f13208e;
                bVar.mo12833b();
            }
        }
    }
}
