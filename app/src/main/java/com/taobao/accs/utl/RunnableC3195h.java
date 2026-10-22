package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.utl.h */
/* loaded from: classes.dex */
public final class RunnableC3195h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AccsDataListener f13190a;

    /* renamed from: b */
    final /* synthetic */ String f13191b;

    /* renamed from: c */
    final /* synthetic */ boolean f13192c;

    /* renamed from: d */
    final /* synthetic */ boolean f13193d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3195h(AccsDataListener accsDataListener, String str, boolean z10, boolean z11) {
        this.f13190a = accsDataListener;
        this.f13191b = str;
        this.f13192c = z10;
        this.f13193d = z11;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13190a.onConnected(new TaoBaseService.ConnectInfo(this.f13191b, this.f13192c, this.f13193d));
    }
}
