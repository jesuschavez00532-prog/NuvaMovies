package p178ia;

import android.view.View;
import ne.AbstractC5868k;
import p375w1.C7346c;

/* renamed from: ia.d */
/* loaded from: classes2.dex */
public final class C4922d extends AbstractC4923e {

    /* renamed from: i */
    private final int f20463i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4922d(View view, int i10) {
        super(view);
        AbstractC5868k.m23674f(view, "view");
        this.f20463i = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p178ia.AbstractC4923e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo20212g(C7346c c7346c) {
        int i10 = this.f20463i;
        if (i10 >= 0 && c7346c != null) {
            c7346c.m28352n(i10);
        }
        this.f4290a.setBackground(c7346c);
    }
}
