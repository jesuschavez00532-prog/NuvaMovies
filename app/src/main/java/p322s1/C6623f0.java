package p322s1;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5571d;
import p347u1.C7022l;

/* renamed from: s1.f0 */
/* loaded from: classes.dex */
public class C6623f0 implements InterfaceC4979j {

    /* renamed from: a */
    private final C7022l f25432a;

    /* renamed from: b */
    private final InterfaceC5571d f25433b;

    public C6623f0(C7022l c7022l, InterfaceC5571d interfaceC5571d) {
        this.f25432a = c7022l;
        this.f25433b = interfaceC5571d;
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5335v mo20329a(Uri uri, int i10, int i11, C4977h c4977h) {
        InterfaceC5335v mo20329a = this.f25432a.mo20329a(uri, i10, i11, c4977h);
        if (mo20329a == null) {
            return null;
        }
        return AbstractC6647v.m25959a(this.f25433b, (Drawable) mo20329a.get(), i10, i11);
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo20330b(Uri uri, C4977h c4977h) {
        return "android.resource".equals(uri.getScheme());
    }
}
