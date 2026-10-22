package p278p1;

import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import p093d2.C3923b;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p278p1.InterfaceC6175o;

/* renamed from: p1.x */
/* loaded from: classes.dex */
public class C6184x implements InterfaceC6175o {

    /* renamed from: a */
    private static final C6184x f24321a = new C6184x();

    /* renamed from: p1.x$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC6176p {

        /* renamed from: a */
        private static final a f24322a = new a();

        /* renamed from: a */
        public static a m24705a() {
            return f24322a;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return C6184x.m24704c();
        }
    }

    /* renamed from: p1.x$b */
    /* loaded from: classes.dex */
    private static class b implements InterfaceC1604d {

        /* renamed from: a */
        private final Object f24323a;

        b(Object obj) {
            this.f24323a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: a */
        public Class mo7418a() {
            return this.f24323a.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: b */
        public void mo7423b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: d */
        public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
            aVar.mo7431e(this.f24323a);
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public EnumC4970a getDataSource() {
            return EnumC4970a.LOCAL;
        }
    }

    /* renamed from: c */
    public static C6184x m24704c() {
        return f24321a;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: a */
    public boolean mo7342a(Object obj) {
        return true;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: b */
    public InterfaceC6175o.a mo7343b(Object obj, int i10, int i11, C4977h c4977h) {
        return new InterfaceC6175o.a(new C3923b(obj), new b(obj));
    }
}
