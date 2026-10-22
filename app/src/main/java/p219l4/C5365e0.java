package p219l4;

import android.content.Context;
import android.util.SparseIntArray;
import p172i4.C4870j;
import p187j4.C4987a;

/* renamed from: l4.e0 */
/* loaded from: classes.dex */
public final class C5365e0 {

    /* renamed from: a */
    private final SparseIntArray f21952a = new SparseIntArray();

    /* renamed from: b */
    private C4870j f21953b;

    public C5365e0(C4870j c4870j) {
        AbstractC5391n.m21783i(c4870j);
        this.f21953b = c4870j;
    }

    /* renamed from: a */
    public final int m21723a(Context context, int i10) {
        return this.f21952a.get(i10, -1);
    }

    /* renamed from: b */
    public final int m21724b(Context context, C4987a.f fVar) {
        AbstractC5391n.m21783i(context);
        AbstractC5391n.m21783i(fVar);
        int i10 = 0;
        if (!fVar.m20355h()) {
            return 0;
        }
        int m20356i = fVar.m20356i();
        int m21723a = m21723a(context, m20356i);
        if (m21723a == -1) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f21952a.size()) {
                    int keyAt = this.f21952a.keyAt(i11);
                    if (keyAt > m20356i && this.f21952a.get(keyAt) == 0) {
                        break;
                    }
                    i11++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                m21723a = this.f21953b.mo20046h(context, m20356i);
            } else {
                m21723a = i10;
            }
            this.f21952a.put(m20356i, m21723a);
        }
        return m21723a;
    }

    /* renamed from: c */
    public final void m21725c() {
        this.f21952a.clear();
    }
}
