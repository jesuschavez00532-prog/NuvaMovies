package p391x1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p184j1.C4977h;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5571d;
import p322s1.C6624g;
import p375w1.C7346c;

/* renamed from: x1.c */
/* loaded from: classes.dex */
public final class C7486c implements InterfaceC7488e {

    /* renamed from: a */
    private final InterfaceC5571d f27556a;

    /* renamed from: b */
    private final InterfaceC7488e f27557b;

    /* renamed from: c */
    private final InterfaceC7488e f27558c;

    public C7486c(InterfaceC5571d interfaceC5571d, InterfaceC7488e interfaceC7488e, InterfaceC7488e interfaceC7488e2) {
        this.f27556a = interfaceC5571d;
        this.f27557b = interfaceC7488e;
        this.f27558c = interfaceC7488e2;
    }

    /* renamed from: b */
    private static InterfaceC5335v m28681b(InterfaceC5335v interfaceC5335v) {
        return interfaceC5335v;
    }

    @Override // p391x1.InterfaceC7488e
    /* renamed from: a */
    public InterfaceC5335v mo28680a(InterfaceC5335v interfaceC5335v, C4977h c4977h) {
        Drawable drawable = (Drawable) interfaceC5335v.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f27557b.mo28680a(C6624g.m25851e(((BitmapDrawable) drawable).getBitmap(), this.f27556a), c4977h);
        }
        if (drawable instanceof C7346c) {
            return this.f27558c.mo28680a(m28681b(interfaceC5335v), c4977h);
        }
        return null;
    }
}
