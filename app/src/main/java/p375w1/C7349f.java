package p375w1;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import java.security.MessageDigest;
import p109e2.AbstractC4121k;
import p184j1.InterfaceC4981l;
import p216l1.InterfaceC5335v;
import p322s1.C6624g;

/* renamed from: w1.f */
/* loaded from: classes.dex */
public class C7349f implements InterfaceC4981l {

    /* renamed from: b */
    private final InterfaceC4981l f27267b;

    public C7349f(InterfaceC4981l interfaceC4981l) {
        this.f27267b = (InterfaceC4981l) AbstractC4121k.m17226d(interfaceC4981l);
    }

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        this.f27267b.mo16761a(messageDigest);
    }

    @Override // p184j1.InterfaceC4981l
    /* renamed from: b */
    public InterfaceC5335v mo20332b(Context context, InterfaceC5335v interfaceC5335v, int i10, int i11) {
        C7346c c7346c = (C7346c) interfaceC5335v.get();
        InterfaceC5335v c6624g = new C6624g(c7346c.m28346e(), ComponentCallbacks2C1586c.m7276d(context).m7288g());
        InterfaceC5335v mo20332b = this.f27267b.mo20332b(context, c6624g, i10, i11);
        if (!c6624g.equals(mo20332b)) {
            c6624g.mo21576b();
        }
        c7346c.m28351m(this.f27267b, (Bitmap) mo20332b.get());
        return interfaceC5335v;
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        if (obj instanceof C7349f) {
            return this.f27267b.equals(((C7349f) obj).f27267b);
        }
        return false;
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        return this.f27267b.hashCode();
    }
}
