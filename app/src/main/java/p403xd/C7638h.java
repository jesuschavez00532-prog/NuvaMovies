package p403xd;

import android.view.View;

/* renamed from: xd.h */
/* loaded from: classes3.dex */
public class C7638h extends AbstractC7631a {
    public C7638h(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7638h m29418j(int i10, int i11) {
        C7638h c7638h;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7638h = new C7638h(i10, 0, 0);
            } else {
                c7638h = new C7638h(i10, 0, 65536);
            }
        } else {
            c7638h = new C7638h(i10, 65536, 0);
        }
        return c7638h;
    }

    /* renamed from: k */
    public static int m29419k(View view) {
        try {
            return ((Integer) view.getClass().getMethod("getMaxHeight", new Class[0]).invoke(view, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return 65536;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return false;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        try {
            view.getClass().getMethod("setMaxHeight", Integer.TYPE).invoke(view, Integer.valueOf(i10));
        } catch (Exception unused) {
        }
    }
}
