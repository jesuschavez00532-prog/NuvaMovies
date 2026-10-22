package p129f7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f7.c */
/* loaded from: classes.dex */
public final class C4273c {

    /* renamed from: a */
    private final C4271a f18615a;

    /* renamed from: b */
    private final List f18616b;

    public C4273c(C4271a c4271a) {
        this.f18615a = c4271a;
        ArrayList arrayList = new ArrayList();
        this.f18616b = arrayList;
        arrayList.add(new C4272b(c4271a, new int[]{1}));
    }

    /* renamed from: a */
    private C4272b m17822a(int i10) {
        if (i10 >= this.f18616b.size()) {
            List list = this.f18616b;
            C4272b c4272b = (C4272b) list.get(list.size() - 1);
            for (int size = this.f18616b.size(); size <= i10; size++) {
                C4271a c4271a = this.f18615a;
                c4272b = c4272b.m17820g(new C4272b(c4271a, new int[]{1, c4271a.m17808c((size - 1) + c4271a.m17809d())}));
                this.f18616b.add(c4272b);
            }
        }
        return (C4272b) this.f18616b.get(i10);
    }

    /* renamed from: b */
    public void m17823b(int[] iArr, int i10) {
        if (i10 != 0) {
            int length = iArr.length - i10;
            if (length > 0) {
                C4272b m17822a = m17822a(i10);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] m17817d = new C4272b(this.f18615a, iArr2).m17821h(i10, 1).m17815b(m17822a)[1].m17817d();
                int length2 = i10 - m17817d.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    iArr[length + i11] = 0;
                }
                System.arraycopy(m17817d, 0, iArr, length + length2, m17817d.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
