package com.uyumao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.uyumao.l */
/* loaded from: classes3.dex */
public class C3780l {

    /* renamed from: a */
    public static C3780l f16968a;

    /* renamed from: b */
    public ExecutorService f16969b;

    /* renamed from: a */
    public static C3780l m16029a() {
        if (f16968a == null) {
            synchronized (C3780l.class) {
                if (f16968a == null) {
                    f16968a = new C3780l();
                }
            }
        }
        return f16968a;
    }

    /* renamed from: b */
    public ExecutorService m16030b() {
        if (this.f16969b == null) {
            synchronized (C3780l.class) {
                if (this.f16969b == null) {
                    this.f16969b = Executors.newSingleThreadExecutor();
                }
            }
        }
        return this.f16969b;
    }
}
