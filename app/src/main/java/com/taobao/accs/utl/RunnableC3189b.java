package com.taobao.accs.utl;

import android.content.Intent;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.utl.b */
/* loaded from: classes.dex */
public final class RunnableC3189b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AccsDataListener f13160a;

    /* renamed from: b */
    final /* synthetic */ String f13161b;

    /* renamed from: c */
    final /* synthetic */ int f13162c;

    /* renamed from: d */
    final /* synthetic */ Intent f13163d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3189b(AccsDataListener accsDataListener, String str, int i10, Intent intent) {
        this.f13160a = accsDataListener;
        this.f13161b = str;
        this.f13162c = i10;
        this.f13163d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        TaoBaseService.ExtraInfo m13001c;
        AccsDataListener accsDataListener = this.f13160a;
        String str = this.f13161b;
        int i10 = this.f13162c;
        m13001c = C3188a.m13001c(this.f13163d);
        accsDataListener.onBind(str, i10, m13001c);
    }
}
