package p403xd;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: xd.g */
/* loaded from: classes3.dex */
public class C7637g extends AbstractC7631a {
    public C7637g(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7637g m29417j(int i10, int i11) {
        C7637g c7637g;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7637g = new C7637g(i10, 0, 0);
            } else {
                c7637g = new C7637g(i10, 0, 64);
            }
        } else {
            c7637g = new C7637g(i10, 64, 0);
        }
        return c7637g;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 64;
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
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = i10;
    }
}
