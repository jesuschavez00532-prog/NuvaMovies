package p403xd;

import android.view.View;

/* renamed from: xd.i */
/* loaded from: classes3.dex */
public class C7639i extends AbstractC7631a {
    public C7639i(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7639i m29420j(int i10, int i11) {
        C7639i c7639i;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7639i = new C7639i(i10, 0, 0);
            } else {
                c7639i = new C7639i(i10, 0, 16384);
            }
        } else {
            c7639i = new C7639i(i10, 16384, 0);
        }
        return c7639i;
    }

    /* renamed from: k */
    public static int m29421k(View view) {
        try {
            return ((Integer) view.getClass().getMethod("getMaxWidth", new Class[0]).invoke(view, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 16384;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return true;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        try {
            view.getClass().getMethod("setMaxWidth", Integer.TYPE).invoke(view, Integer.valueOf(i10));
        } catch (Exception unused) {
        }
    }
}
