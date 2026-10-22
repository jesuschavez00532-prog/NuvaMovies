package p322s1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p109e2.AbstractC4121k;
import p216l1.InterfaceC5331r;
import p216l1.InterfaceC5335v;

/* renamed from: s1.c0 */
/* loaded from: classes.dex */
public final class C6617c0 implements InterfaceC5335v, InterfaceC5331r {

    /* renamed from: a */
    private final Resources f25422a;

    /* renamed from: b */
    private final InterfaceC5335v f25423b;

    private C6617c0(Resources resources, InterfaceC5335v interfaceC5335v) {
        this.f25422a = (Resources) AbstractC4121k.m17226d(resources);
        this.f25423b = (InterfaceC5335v) AbstractC4121k.m17226d(interfaceC5335v);
    }

    /* renamed from: e */
    public static InterfaceC5335v m25836e(Resources resources, InterfaceC5335v interfaceC5335v) {
        if (interfaceC5335v == null) {
            return null;
        }
        return new C6617c0(resources, interfaceC5335v);
    }

    @Override // p216l1.InterfaceC5331r
    /* renamed from: a */
    public void mo21593a() {
        InterfaceC5335v interfaceC5335v = this.f25423b;
        if (interfaceC5335v instanceof InterfaceC5331r) {
            ((InterfaceC5331r) interfaceC5335v).mo21593a();
        }
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: b */
    public void mo21576b() {
        this.f25423b.mo21576b();
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: c */
    public Class mo21577c() {
        return BitmapDrawable.class;
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f25422a, (Bitmap) this.f25423b.get());
    }

    @Override // p216l1.InterfaceC5335v
    public int getSize() {
        return this.f25423b.getSize();
    }
}
