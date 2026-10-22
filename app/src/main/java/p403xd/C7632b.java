package p403xd;

import android.view.View;

/* renamed from: xd.b */
/* loaded from: classes3.dex */
public class C7632b extends AbstractC7631a {
    public C7632b(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7632b m29413j(int i10, int i11) {
        C7632b c7632b;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7632b = new C7632b(i10, 0, 0);
            } else {
                c7632b = new C7632b(i10, 0, 2);
            }
        } else {
            c7632b = new C7632b(i10, 2, 0);
        }
        return c7632b;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 2;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return false;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        view.getLayoutParams().height = i10;
    }
}
