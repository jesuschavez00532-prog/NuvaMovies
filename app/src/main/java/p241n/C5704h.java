package p241n;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: n.h */
/* loaded from: classes.dex */
public class C5704h {

    /* renamed from: a */
    public List f22886a;

    /* renamed from: b */
    int f22887b;

    /* renamed from: c */
    int f22888c;

    /* renamed from: d */
    public boolean f22889d;

    /* renamed from: e */
    public final int[] f22890e;

    /* renamed from: f */
    List f22891f;

    /* renamed from: g */
    List f22892g;

    /* renamed from: h */
    HashSet f22893h;

    /* renamed from: i */
    HashSet f22894i;

    /* renamed from: j */
    List f22895j;

    /* renamed from: k */
    List f22896k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5704h(List list) {
        this.f22887b = -1;
        this.f22888c = -1;
        this.f22889d = false;
        this.f22890e = new int[]{-1, -1};
        this.f22891f = new ArrayList();
        this.f22892g = new ArrayList();
        this.f22893h = new HashSet();
        this.f22894i = new HashSet();
        this.f22895j = new ArrayList();
        this.f22896k = new ArrayList();
        this.f22886a = list;
    }

    /* renamed from: e */
    private void m23042e(ArrayList arrayList, C5702f c5702f) {
        C5702f c5702f2;
        if (c5702f.f22832k0) {
            return;
        }
        arrayList.add(c5702f);
        c5702f.f22832k0 = true;
        if (c5702f.m22961L()) {
            return;
        }
        if (c5702f instanceof AbstractC5706j) {
            AbstractC5706j abstractC5706j = (AbstractC5706j) c5702f;
            int i10 = abstractC5706j.f22908w0;
            for (int i11 = 0; i11 < i10; i11++) {
                m23042e(arrayList, abstractC5706j.f22907v0[i11]);
            }
        }
        int length = c5702f.f22787C.length;
        for (int i12 = 0; i12 < length; i12++) {
            C5701e c5701e = c5702f.f22787C[i12].f22759d;
            if (c5701e != null && (c5702f2 = c5701e.f22757b) != c5702f.m23009u()) {
                m23042e(arrayList, c5702f2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004c  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m23043f(p241n.C5702f r7) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p241n.C5704h.m23043f(n.f):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m23044a(C5702f c5702f, int i10) {
        if (i10 == 0) {
            this.f22893h.add(c5702f);
        } else if (i10 == 1) {
            this.f22894i.add(c5702f);
        }
    }

    /* renamed from: b */
    public List m23045b(int i10) {
        if (i10 == 0) {
            return this.f22891f;
        }
        if (i10 == 1) {
            return this.f22892g;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Set m23046c(int i10) {
        if (i10 == 0) {
            return this.f22893h;
        }
        if (i10 == 1) {
            return this.f22894i;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public List m23047d() {
        if (!this.f22895j.isEmpty()) {
            return this.f22895j;
        }
        int size = this.f22886a.size();
        for (int i10 = 0; i10 < size; i10++) {
            C5702f c5702f = (C5702f) this.f22886a.get(i10);
            if (!c5702f.f22828i0) {
                m23042e((ArrayList) this.f22895j, c5702f);
            }
        }
        this.f22896k.clear();
        this.f22896k.addAll(this.f22886a);
        this.f22896k.removeAll(this.f22895j);
        return this.f22895j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m23048g() {
        int size = this.f22896k.size();
        for (int i10 = 0; i10 < size; i10++) {
            m23043f((C5702f) this.f22896k.get(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5704h(List list, boolean z10) {
        this.f22887b = -1;
        this.f22888c = -1;
        this.f22889d = false;
        this.f22890e = new int[]{-1, -1};
        this.f22891f = new ArrayList();
        this.f22892g = new ArrayList();
        this.f22893h = new HashSet();
        this.f22894i = new HashSet();
        this.f22895j = new ArrayList();
        this.f22896k = new ArrayList();
        this.f22886a = list;
        this.f22889d = z10;
    }
}
