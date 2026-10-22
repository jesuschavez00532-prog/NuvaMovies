package p403xd;

import android.view.View;

/* renamed from: xd.l */
/* loaded from: classes3.dex */
public class C7642l extends AbstractC7631a {
    public C7642l(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: a */
    public void mo29404a(View view) {
        if (m29412i()) {
            int m29411h = m29411h();
            int m29410g = m29410g();
            view.setPadding(m29411h, m29410g, m29411h, m29410g);
            return;
        }
        super.mo29404a(view);
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 8;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return false;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        view.setPadding(i10, i10, i10, i10);
    }
}
