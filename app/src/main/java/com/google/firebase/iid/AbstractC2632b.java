package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p295q4.ThreadFactoryC6342a;

/* renamed from: com.google.firebase.iid.b */
/* loaded from: classes.dex */
abstract class AbstractC2632b {

    /* renamed from: a */
    private static final Executor f10087a = ExecutorC2631a.f10086a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m10948a() {
        return f10087a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ExecutorService m10949b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6342a("firebase-iid-executor"));
    }
}
