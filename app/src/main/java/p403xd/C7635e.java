package p403xd;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: xd.e */
/* loaded from: classes3.dex */
public class C7635e extends AbstractC7631a {
    public C7635e(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7635e m29415j(int i10, int i11) {
        C7635e c7635e;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7635e = new C7635e(i10, 0, 0);
            } else {
                c7635e = new C7635e(i10, 0, 32);
            }
        } else {
            c7635e = new C7635e(i10, 32, 0);
        }
        return c7635e;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 32;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return true;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = i10;
    }
}
