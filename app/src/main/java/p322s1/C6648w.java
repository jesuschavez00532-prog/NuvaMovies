package p322s1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import java.security.MessageDigest;
import p184j1.InterfaceC4981l;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5571d;

/* renamed from: s1.w */
/* loaded from: classes.dex */
public class C6648w implements InterfaceC4981l {

    /* renamed from: b */
    private final InterfaceC4981l f25496b;

    /* renamed from: c */
    private final boolean f25497c;

    public C6648w(InterfaceC4981l interfaceC4981l, boolean z10) {
        this.f25496b = interfaceC4981l;
        this.f25497c = z10;
    }

    /* renamed from: d */
    private InterfaceC5335v m25961d(Context context, InterfaceC5335v interfaceC5335v) {
        return C6617c0.m25836e(context.getResources(), interfaceC5335v);
    }

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        this.f25496b.mo16761a(messageDigest);
    }

    @Override // p184j1.InterfaceC4981l
    /* renamed from: b */
    public InterfaceC5335v mo20332b(Context context, InterfaceC5335v interfaceC5335v, int i10, int i11) {
        InterfaceC5571d m7288g = ComponentCallbacks2C1586c.m7276d(context).m7288g();
        Drawable drawable = (Drawable) interfaceC5335v.get();
        InterfaceC5335v m25959a = AbstractC6647v.m25959a(m7288g, drawable, i10, i11);
        if (m25959a == null) {
            if (!this.f25497c) {
                return interfaceC5335v;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        InterfaceC5335v mo20332b = this.f25496b.mo20332b(context, m25959a, i10, i11);
        if (mo20332b.equals(m25959a)) {
            mo20332b.mo21576b();
            return interfaceC5335v;
        }
        return m25961d(context, mo20332b);
    }

    /* renamed from: c */
    public InterfaceC4981l m25962c() {
        return this;
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        if (obj instanceof C6648w) {
            return this.f25496b.equals(((C6648w) obj).f25496b);
        }
        return false;
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        return this.f25496b.hashCode();
    }
}
