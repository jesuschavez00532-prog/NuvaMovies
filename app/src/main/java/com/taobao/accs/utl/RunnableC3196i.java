package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.utl.i */
/* loaded from: classes.dex */
public final class RunnableC3196i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AccsDataListener f13194a;

    /* renamed from: b */
    final /* synthetic */ String f13195b;

    /* renamed from: c */
    final /* synthetic */ boolean f13196c;

    /* renamed from: d */
    final /* synthetic */ boolean f13197d;

    /* renamed from: e */
    final /* synthetic */ int f13198e;

    /* renamed from: f */
    final /* synthetic */ String f13199f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3196i(AccsDataListener accsDataListener, String str, boolean z10, boolean z11, int i10, String str2) {
        this.f13194a = accsDataListener;
        this.f13195b = str;
        this.f13196c = z10;
        this.f13197d = z11;
        this.f13198e = i10;
        this.f13199f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13194a.onDisconnected(new TaoBaseService.ConnectInfo(this.f13195b, this.f13196c, this.f13197d, this.f13198e, this.f13199f));
    }
}
