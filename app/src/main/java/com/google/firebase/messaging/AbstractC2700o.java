package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p008a7.AbstractC0109b;
import p008a7.EnumC0110c;
import p295q4.ThreadFactoryC6342a;

/* renamed from: com.google.firebase.messaging.o */
/* loaded from: classes.dex */
abstract class AbstractC2700o {
    /* renamed from: a */
    private static Executor m11292a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6342a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Executor m11293b() {
        return m11292a("Firebase-Messaging-File-Io");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ScheduledExecutorService m11294c() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6342a("Firebase-Messaging-Init"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static ExecutorService m11295d() {
        return AbstractC0109b.m483a().mo482a(new ThreadFactoryC6342a("Firebase-Messaging-Intent-Handle"), EnumC0110c.HIGH_SPEED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ExecutorService m11296e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC6342a("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static ExecutorService m11297f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC6342a("Firebase-Messaging-Task"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static ScheduledExecutorService m11298g() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6342a("Firebase-Messaging-Topics-Io"));
    }
}
