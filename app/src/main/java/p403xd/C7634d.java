package p403xd;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: xd.d */
/* loaded from: classes3.dex */
public class C7634d extends AbstractC7631a {
    public C7634d(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7634d m29414j(int i10, int i11) {
        C7634d c7634d;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7634d = new C7634d(i10, 0, 0);
            } else {
                c7634d = new C7634d(i10, 0, 256);
            }
        } else {
            c7634d = new C7634d(i10, 256, 0);
        }
        return c7634d;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 256;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return false;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin = i10;
    }
}
