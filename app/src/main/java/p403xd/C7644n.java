package p403xd;

import android.view.View;

/* renamed from: xd.n */
/* loaded from: classes3.dex */
public class C7644n extends AbstractC7631a {
    public C7644n(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7644n m29427j(int i10, int i11) {
        C7644n c7644n;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7644n = new C7644n(i10, 0, 0);
            } else {
                c7644n = new C7644n(i10, 0, 512);
            }
        } else {
            c7644n = new C7644n(i10, 512, 0);
        }
        return c7644n;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 512;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return true;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        view.setPadding(i10, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }
}
