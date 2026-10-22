package com.taobao.accs.utl;

import android.content.Intent;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.utl.c */
/* loaded from: classes.dex */
public final class RunnableC3190c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AccsDataListener f13164a;

    /* renamed from: b */
    final /* synthetic */ String f13165b;

    /* renamed from: c */
    final /* synthetic */ int f13166c;

    /* renamed from: d */
    final /* synthetic */ Intent f13167d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3190c(AccsDataListener accsDataListener, String str, int i10, Intent intent) {
        this.f13164a = accsDataListener;
        this.f13165b = str;
        this.f13166c = i10;
        this.f13167d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        TaoBaseService.ExtraInfo m13001c;
        AccsDataListener accsDataListener = this.f13164a;
        String str = this.f13165b;
        int i10 = this.f13166c;
        m13001c = C3188a.m13001c(this.f13167d);
        accsDataListener.onUnbind(str, i10, m13001c);
    }
}
