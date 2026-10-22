package p292q1;

import android.content.Context;
import android.net.Uri;
import p093d2.C3923b;
import p184j1.C4977h;
import p200k1.AbstractC5080b;
import p200k1.C5081c;
import p278p1.C6179s;
import p278p1.InterfaceC6175o;
import p278p1.InterfaceC6176p;
import p322s1.C6635l0;

/* renamed from: q1.c */
/* loaded from: classes.dex */
public class C6325c implements InterfaceC6175o {

    /* renamed from: a */
    private final Context f24655a;

    /* renamed from: q1.c$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC6176p {

        /* renamed from: a */
        private final Context f24656a;

        public a(Context context) {
            this.f24656a = context;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6325c(this.f24656a);
        }
    }

    public C6325c(Context context) {
        this.f24655a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m25091e(C4977h c4977h) {
        Long l10 = (Long) c4977h.m20325c(C6635l0.f25452d);
        if (l10 != null && l10.longValue() == -1) {
            return true;
        }
        return false;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(Uri uri, int i10, int i11, C4977h c4977h) {
        if (AbstractC5080b.m20578e(i10, i11) && m25091e(c4977h)) {
            return new InterfaceC6175o.a(new C3923b(uri), C5081c.m20582f(this.f24655a, uri));
        }
        return null;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(Uri uri) {
        return AbstractC5080b.m20577d(uri);
    }
}
