package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC1605e;
import java.io.InputStream;
import p230m1.InterfaceC5569b;
import p322s1.C6621e0;

/* renamed from: com.bumptech.glide.load.data.k */
/* loaded from: classes.dex */
public final class C1611k implements InterfaceC1605e {

    /* renamed from: a */
    private final C6621e0 f6414a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC1605e.a {

        /* renamed from: a */
        private final InterfaceC5569b f6415a;

        public a(InterfaceC5569b interfaceC5569b) {
            this.f6415a = interfaceC5569b;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1605e.a
        /* renamed from: a */
        public Class mo7415a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1605e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC1605e mo7416b(InputStream inputStream) {
            return new C1611k(inputStream, this.f6415a);
        }
    }

    public C1611k(InputStream inputStream, InterfaceC5569b interfaceC5569b) {
        C6621e0 c6621e0 = new C6621e0(inputStream, interfaceC5569b);
        this.f6414a = c6621e0;
        c6621e0.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1605e
    /* renamed from: b */
    public void mo7413b() {
        this.f6414a.m25846c();
    }

    /* renamed from: c */
    public void m7445c() {
        this.f6414a.m25845b();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1605e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo7412a() {
        this.f6414a.reset();
        return this.f6414a;
    }
}
