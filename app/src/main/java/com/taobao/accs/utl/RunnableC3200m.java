package com.taobao.accs.utl;

import android.app.Application;
import com.taobao.accs.utl.C3199l;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.taobao.accs.utl.m */
/* loaded from: classes.dex */
class RunnableC3200m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3199l f13217a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3200m(C3199l c3199l) {
        this.f13217a = c3199l;
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
                bVar.mo12832a();
            }
        }
    }
}
