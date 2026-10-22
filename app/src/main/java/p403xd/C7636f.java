package p403xd;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: xd.f */
/* loaded from: classes3.dex */
public class C7636f extends AbstractC7631a {
    public C7636f(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7636f m29416j(int i10, int i11) {
        C7636f c7636f;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7636f = new C7636f(i10, 0, 0);
            } else {
                c7636f = new C7636f(i10, 0, 128);
            }
        } else {
            c7636f = new C7636f(i10, 128, 0);
        }
        return c7636f;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 128;
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
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = i10;
    }
}
