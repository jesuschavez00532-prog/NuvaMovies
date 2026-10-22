package com.taobao.accs.antibrush;

import android.content.Context;
import com.taobao.accs.utl.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.antibrush.a */
/* loaded from: classes.dex */
public class RunnableC3116a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AntiBrush f12832a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3116a(AntiBrush antiBrush) {
        this.f12832a = antiBrush;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        ALog.m12940e("AntiBrush", "anti bursh timeout", new Object[0]);
        context = this.f12832a.mContext;
        AntiBrush.onResult(context, false);
    }
}
