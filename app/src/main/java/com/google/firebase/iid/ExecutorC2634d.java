package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.d */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC2634d implements Executor {

    /* renamed from: a */
    static final Executor f10091a = new ExecutorC2634d();

    private ExecutorC2634d() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
