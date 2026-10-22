package p403xd;

import android.view.View;

/* renamed from: xd.o */
/* loaded from: classes3.dex */
public class C7645o extends AbstractC7631a {
    public C7645o(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7645o m29428j(int i10, int i11) {
        C7645o c7645o;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7645o = new C7645o(i10, 0, 0);
            } else {
                c7645o = new C7645o(i10, 0, 2048);
            }
        } else {
            c7645o = new C7645o(i10, 2048, 0);
        }
        return c7645o;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 2048;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return true;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i10, view.getPaddingBottom());
    }
}
