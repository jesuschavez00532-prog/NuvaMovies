package p322s1;

import android.graphics.Bitmap;
import p109e2.AbstractC4121k;
import p109e2.AbstractC4122l;
import p216l1.InterfaceC5331r;
import p216l1.InterfaceC5335v;
import p230m1.InterfaceC5571d;

/* renamed from: s1.g */
/* loaded from: classes.dex */
public class C6624g implements InterfaceC5335v, InterfaceC5331r {

    /* renamed from: a */
    private final Bitmap f25434a;

    /* renamed from: b */
    private final InterfaceC5571d f25435b;

    public C6624g(Bitmap bitmap, InterfaceC5571d interfaceC5571d) {
        this.f25434a = (Bitmap) AbstractC4121k.m17227e(bitmap, "Bitmap must not be null");
        this.f25435b = (InterfaceC5571d) AbstractC4121k.m17227e(interfaceC5571d, "BitmapPool must not be null");
    }

    /* renamed from: e */
    public static C6624g m25851e(Bitmap bitmap, InterfaceC5571d interfaceC5571d) {
        if (bitmap == null) {
            return null;
        }
        return new C6624g(bitmap, interfaceC5571d);
    }

    @Override // p216l1.InterfaceC5331r
    /* renamed from: a */
    public void mo21593a() {
        this.f25434a.prepareToDraw();
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: b */
    public void mo21576b() {
        this.f25435b.mo22617c(this.f25434a);
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: c */
    public Class mo21577c() {
        return Bitmap.class;
    }

    @Override // p216l1.InterfaceC5335v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f25434a;
    }

    @Override // p216l1.InterfaceC5335v
    public int getSize() {
        return AbstractC4122l.m17236i(this.f25434a);
    }
}
