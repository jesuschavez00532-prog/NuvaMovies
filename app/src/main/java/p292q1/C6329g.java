package p292q1;

import java.io.InputStream;
import java.net.URL;
import p184j1.C4977h;
import p278p1.C6169i;
import p278p1.C6179s;
import p278p1.InterfaceC6175o;
import p278p1.InterfaceC6176p;

/* renamed from: q1.g */
/* loaded from: classes.dex */
public class C6329g implements InterfaceC6175o {

    /* renamed from: a */
    private final InterfaceC6175o f24674a;

    /* renamed from: q1.g$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC6176p {
        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6329g(c6179s.m24683d(C6169i.class, InputStream.class));
        }
    }

    public C6329g(InterfaceC6175o interfaceC6175o) {
        this.f24674a = interfaceC6175o;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(URL url, int i10, int i11, C4977h c4977h) {
        return this.f24674a.mo7343b(new C6169i(url), i10, i11, c4977h);
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(URL url) {
        return true;
    }
}
