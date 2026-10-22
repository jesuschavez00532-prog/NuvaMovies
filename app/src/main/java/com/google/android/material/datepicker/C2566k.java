package com.google.android.material.datepicker;

import android.os.Bundle;
import android.support.v4.media.session.AbstractC0272b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C2566k<S> extends AbstractC2571p {

    /* renamed from: p0 */
    private C2556a f9701p0;

    /* renamed from: com.google.android.material.datepicker.k$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC2570o {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9 */
    public static C2566k m10510n9(InterfaceC2559d interfaceC2559d, C2556a c2556a) {
        C2566k c2566k = new C2566k();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", interfaceC2559d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2556a);
        c2566k.m3132V8(bundle);
        return c2566k;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        if (bundle == null) {
            bundle = m3090H6();
        }
        AbstractC0272b.m941a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f9701p0 = (C2556a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        new a();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: h8 */
    public void mo3167h8(Bundle bundle) {
        super.mo3167h8(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9701p0);
    }
}
