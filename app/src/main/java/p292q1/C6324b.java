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

/* renamed from: q1.b */
/* loaded from: classes.dex */
public class C6324b implements InterfaceC6175o {

    /* renamed from: a */
    private final Context f24653a;

    /* renamed from: q1.b$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC6176p {

        /* renamed from: a */
        private final Context f24654a;

        public a(Context context) {
            this.f24654a = context;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6324b(this.f24654a);
        }
    }

    public C6324b(Context context) {
        this.f24653a = context.getApplicationContext();
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(Uri uri, int i10, int i11, C4977h c4977h) {
        if (AbstractC5080b.m20578e(i10, i11)) {
            return new InterfaceC6175o.a(new C3923b(uri), C5081c.m20581e(this.f24653a, uri));
        }
        return null;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(Uri uri) {
        return AbstractC5080b.m20575b(uri);
    }
}
