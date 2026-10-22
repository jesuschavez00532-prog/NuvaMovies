package p403xd;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: xd.c */
/* loaded from: classes3.dex */
public class C7633c extends AbstractC7631a {
    public C7633c(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: a */
    public void mo29404a(View view) {
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        if (m29412i()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int m29411h = m29411h();
            marginLayoutParams.rightMargin = m29411h;
            marginLayoutParams.leftMargin = m29411h;
            int m29410g = m29410g();
            marginLayoutParams.bottomMargin = m29410g;
            marginLayoutParams.topMargin = m29410g;
            return;
        }
        super.mo29404a(view);
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 16;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return false;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.bottomMargin = i10;
        marginLayoutParams.topMargin = i10;
        marginLayoutParams.rightMargin = i10;
        marginLayoutParams.leftMargin = i10;
    }
}
