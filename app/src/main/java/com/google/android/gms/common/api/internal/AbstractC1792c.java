package com.google.android.gms.common.api.internal;

import p127f5.C4247j;
import p172i4.C4858d;
import p187j4.C4987a;
import p203k4.AbstractC5126w;
import p203k4.InterfaceC5112i;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractC1792c {

    /* renamed from: a */
    private final C4858d[] f7559a;

    /* renamed from: b */
    private final boolean f7560b;

    /* renamed from: c */
    private final int f7561c;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private InterfaceC5112i f7562a;

        /* renamed from: c */
        private C4858d[] f7564c;

        /* renamed from: b */
        private boolean f7563b = true;

        /* renamed from: d */
        private int f7565d = 0;

        /* synthetic */ a(AbstractC5126w abstractC5126w) {
        }

        /* renamed from: a */
        public AbstractC1792c m7973a() {
            boolean z10;
            if (this.f7562a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC5391n.m21776b(z10, "execute parameter required");
            return new C1807r(this, this.f7564c, this.f7563b, this.f7565d);
        }

        /* renamed from: b */
        public a m7974b(InterfaceC5112i interfaceC5112i) {
            this.f7562a = interfaceC5112i;
            return this;
        }

        /* renamed from: c */
        public a m7975c(boolean z10) {
            this.f7563b = z10;
            return this;
        }

        /* renamed from: d */
        public a m7976d(C4858d... c4858dArr) {
            this.f7564c = c4858dArr;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1792c(C4858d[] c4858dArr, boolean z10, int i10) {
        this.f7559a = c4858dArr;
        boolean z11 = false;
        if (c4858dArr != null && z10) {
            z11 = true;
        }
        this.f7560b = z11;
        this.f7561c = i10;
    }

    /* renamed from: a */
    public static a m7967a() {
        return new a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo7968b(C4987a.b bVar, C4247j c4247j);

    /* renamed from: c */
    public boolean m7969c() {
        return this.f7560b;
    }

    /* renamed from: d */
    public final int m7970d() {
        return this.f7561c;
    }

    /* renamed from: e */
    public final C4858d[] m7971e() {
        return this.f7559a;
    }
}
