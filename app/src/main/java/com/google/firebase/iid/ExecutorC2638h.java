package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.h */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC2638h implements Executor {

    /* renamed from: a */
    static final Executor f10102a = new ExecutorC2638h();

    private ExecutorC2638h() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
