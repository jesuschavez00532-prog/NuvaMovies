package p225ld;

import java.util.List;
import ne.AbstractC5864g;

/* renamed from: ld.d */
/* loaded from: classes3.dex */
public final class C5550d {

    /* renamed from: a */
    private int f22495a;

    /* renamed from: b */
    private int f22496b;

    /* renamed from: c */
    private List f22497c;

    /* renamed from: d */
    private List f22498d;

    /* renamed from: e */
    private List f22499e;

    /* renamed from: f */
    private boolean f22500f;

    public C5550d(int i10, int i11, List list, List list2, List list3, boolean z10) {
        this.f22495a = i10;
        this.f22496b = i11;
        this.f22497c = list;
        this.f22498d = list2;
        this.f22499e = list3;
        this.f22500f = z10;
    }

    /* renamed from: a */
    public final List m22498a() {
        return this.f22499e;
    }

    /* renamed from: b */
    public final List m22499b() {
        return this.f22498d;
    }

    /* renamed from: c */
    public final int m22500c() {
        return this.f22496b;
    }

    /* renamed from: d */
    public final int m22501d() {
        return this.f22495a;
    }

    /* renamed from: e */
    public final List m22502e() {
        return this.f22497c;
    }

    /* renamed from: f */
    public final boolean m22503f() {
        return this.f22500f;
    }

    /* renamed from: g */
    public final void m22504g(List list) {
        this.f22499e = list;
    }

    /* renamed from: h */
    public final void m22505h(int i10) {
        this.f22495a = i10;
    }

    /* renamed from: i */
    public final void m22506i(boolean z10) {
        this.f22500f = z10;
    }

    public String toString() {
        Integer num;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HomeVodExtra(position=");
        sb2.append(this.f22495a);
        sb2.append(", itemType=");
        sb2.append(this.f22496b);
        sb2.append(", recommendData=");
        List list = this.f22497c;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb2.append(num);
        sb2.append(", childColumns=");
        sb2.append(this.f22498d);
        sb2.append(", assetLists=");
        sb2.append(this.f22499e);
        sb2.append(", showMock=");
        sb2.append(this.f22500f);
        return sb2.toString();
    }

    public /* synthetic */ C5550d(int i10, int i11, List list, List list2, List list3, boolean z10, int i12, AbstractC5864g abstractC5864g) {
        this(i10, i11, list, list2, (i12 & 16) != 0 ? null : list3, (i12 & 32) != 0 ? true : z10);
    }
}
