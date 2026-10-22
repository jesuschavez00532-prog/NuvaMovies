package p322s1;

import android.content.res.Resources;
import p109e2.AbstractC4121k;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;

/* renamed from: s1.a */
/* loaded from: classes.dex */
public class C6612a implements InterfaceC4979j {

    /* renamed from: a */
    private final InterfaceC4979j f25405a;

    /* renamed from: b */
    private final Resources f25406b;

    public C6612a(Resources resources, InterfaceC4979j interfaceC4979j) {
        this.f25406b = (Resources) AbstractC4121k.m17226d(resources);
        this.f25405a = (InterfaceC4979j) AbstractC4121k.m17226d(interfaceC4979j);
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: a */
    public InterfaceC5335v mo20329a(Object obj, int i10, int i11, C4977h c4977h) {
        return C6617c0.m25836e(this.f25406b, this.f25405a.mo20329a(obj, i10, i11, c4977h));
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: b */
    public boolean mo20330b(Object obj, C4977h c4977h) {
        return this.f25405a.mo20330b(obj, c4977h);
    }
}
