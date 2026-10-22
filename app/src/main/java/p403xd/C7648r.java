package p403xd;

import android.view.View;

/* renamed from: xd.r */
/* loaded from: classes3.dex */
public class C7648r extends AbstractC7631a {
    public C7648r(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7648r m29431j(int i10, int i11) {
        C7648r c7648r;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7648r = new C7648r(i10, 0, 0);
            } else {
                c7648r = new C7648r(i10, 0, 1);
            }
        } else {
            c7648r = new C7648r(i10, 1, 0);
        }
        return c7648r;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 1;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return true;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        view.getLayoutParams().width = i10;
    }
}
