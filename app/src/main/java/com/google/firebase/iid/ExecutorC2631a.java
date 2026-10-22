package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.a */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC2631a implements Executor {

    /* renamed from: a */
    static final Executor f10086a = new ExecutorC2631a();

    private ExecutorC2631a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
