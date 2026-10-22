package com.bumptech.glide.integration.okhttp3;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import p169i1.C4841a;
import p184j1.C4977h;
import p278p1.C6169i;
import p278p1.C6179s;
import p278p1.InterfaceC6175o;
import p278p1.InterfaceC6176p;

/* renamed from: com.bumptech.glide.integration.okhttp3.b */
/* loaded from: classes.dex */
public class C1594b implements InterfaceC6175o {

    /* renamed from: a */
    private final Call.Factory f6336a;

    /* renamed from: com.bumptech.glide.integration.okhttp3.b$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC6176p {

        /* renamed from: b */
        private static volatile Call.Factory f6337b;

        /* renamed from: a */
        private final Call.Factory f6338a;

        public a() {
            this(m7346a());
        }

        /* renamed from: a */
        private static Call.Factory m7346a() {
            if (f6337b == null) {
                synchronized (a.class) {
                    if (f6337b == null) {
                        f6337b = new OkHttpClient();
                    }
                }
            }
            return f6337b;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C1594b(this.f6338a);
        }

        public a(Call.Factory factory) {
            this.f6338a = factory;
        }
    }

    public C1594b(Call.Factory factory) {
        this.f6336a = factory;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(C6169i c6169i, int i10, int i11, C4977h c4977h) {
        return new InterfaceC6175o.a(c6169i, new C4841a(this.f6336a, c6169i));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(C6169i c6169i) {
        return true;
    }
}
