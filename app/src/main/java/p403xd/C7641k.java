package p403xd;

import android.view.View;

/* renamed from: xd.k */
/* loaded from: classes3.dex */
public class C7641k extends AbstractC7631a {
    public C7641k(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7641k m29424j(int i10, int i11) {
        C7641k c7641k;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7641k = new C7641k(i10, 0, 0);
            } else {
                c7641k = new C7641k(i10, 0, 8192);
            }
        } else {
            c7641k = new C7641k(i10, 8192, 0);
        }
        return c7641k;
    }

    /* renamed from: k */
    public static int m29425k(View view) {
        return view.getMinimumWidth();
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 8192;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return true;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        view.setMinimumWidth(i10);
    }
}
