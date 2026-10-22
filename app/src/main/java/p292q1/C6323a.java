package p292q1;

import com.bumptech.glide.load.data.C1610j;
import p184j1.C4976g;
import p184j1.C4977h;
import p278p1.C6169i;
import p278p1.C6174n;
import p278p1.C6179s;
import p278p1.InterfaceC6175o;
import p278p1.InterfaceC6176p;

/* renamed from: q1.a */
/* loaded from: classes.dex */
public class C6323a implements InterfaceC6175o {

    /* renamed from: b */
    public static final C4976g f24650b = C4976g.m20320f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    private final C6174n f24651a;

    /* renamed from: q1.a$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC6176p {

        /* renamed from: a */
        private final C6174n f24652a = new C6174n(500);

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6323a(this.f24652a);
        }
    }

    public C6323a(C6174n c6174n) {
        this.f24651a = c6174n;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(C6169i c6169i, int i10, int i11, C4977h c4977h) {
        C6174n c6174n = this.f24651a;
        if (c6174n != null) {
            C6169i c6169i2 = (C6169i) c6174n.m24660a(c6169i, 0, 0);
            if (c6169i2 == null) {
                this.f24651a.m24661b(c6169i, 0, 0, c6169i);
            } else {
                c6169i = c6169i2;
            }
        }
        return new InterfaceC6175o.a(c6169i, new C1610j(c6169i, ((Integer) c4977h.m20325c(f24650b)).intValue()));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(C6169i c6169i) {
        return true;
    }
}
