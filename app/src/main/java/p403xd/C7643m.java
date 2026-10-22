package p403xd;

import android.view.View;

/* renamed from: xd.m */
/* loaded from: classes3.dex */
public class C7643m extends AbstractC7631a {
    public C7643m(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7643m m29426j(int i10, int i11) {
        C7643m c7643m;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7643m = new C7643m(i10, 0, 0);
            } else {
                c7643m = new C7643m(i10, 0, 4096);
            }
        } else {
            c7643m = new C7643m(i10, 4096, 0);
        }
        return c7643m;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 4096;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return false;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }
}
