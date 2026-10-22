package p403xd;

import android.view.View;
import com.taobao.accs.data.Message;

/* renamed from: xd.j */
/* loaded from: classes3.dex */
public class C7640j extends AbstractC7631a {
    public C7640j(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7640j m29422j(int i10, int i11) {
        C7640j c7640j;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7640j = new C7640j(i10, 0, 0);
            } else {
                c7640j = new C7640j(i10, 0, Message.FLAG_DATA_TYPE);
            }
        } else {
            c7640j = new C7640j(i10, Message.FLAG_DATA_TYPE, 0);
        }
        return c7640j;
    }

    /* renamed from: k */
    public static int m29423k(View view) {
        return view.getMinimumHeight();
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return Message.FLAG_DATA_TYPE;
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
            view.setMinimumHeight(i10);
        } catch (Exception unused) {
        }
    }
}
