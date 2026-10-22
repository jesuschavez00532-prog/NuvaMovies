package p403xd;

import android.view.View;
import android.widget.TextView;

/* renamed from: xd.q */
/* loaded from: classes3.dex */
public class C7647q extends AbstractC7631a {
    public C7647q(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7647q m29430j(int i10, int i11) {
        C7647q c7647q;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7647q = new C7647q(i10, 0, 0);
            } else {
                c7647q = new C7647q(i10, 0, 4);
            }
        } else {
            c7647q = new C7647q(i10, 4, 0);
        }
        return c7647q;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 4;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return false;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        textView.setIncludeFontPadding(false);
        textView.setTextSize(0, i10);
    }
}
