package p403xd;

import android.view.View;
import anet.channel.entity.EventType;

/* renamed from: xd.p */
/* loaded from: classes3.dex */
public class C7646p extends AbstractC7631a {
    public C7646p(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    /* renamed from: j */
    public static C7646p m29429j(int i10, int i11) {
        C7646p c7646p;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                c7646p = new C7646p(i10, 0, 0);
            } else {
                c7646p = new C7646p(i10, 0, EventType.AUTH_FAIL);
            }
        } else {
            c7646p = new C7646p(i10, EventType.AUTH_FAIL, 0);
        }
        return c7646p;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: b */
    protected int mo29405b() {
        return EventType.AUTH_FAIL;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: e */
    protected boolean mo29408e() {
        return false;
    }

    @Override // p403xd.AbstractC7631a
    /* renamed from: f */
    protected void mo29409f(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), view.getPaddingBottom());
    }
}
