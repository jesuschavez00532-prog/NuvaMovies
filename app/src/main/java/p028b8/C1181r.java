package p028b8;

import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.AbstractC0734t;
import androidx.fragment.app.Fragment;
import java.util.List;
import ne.AbstractC5868k;

/* renamed from: b8.r */
/* loaded from: classes2.dex */
public final class C1181r extends AbstractC0734t {

    /* renamed from: f */
    private List f4677f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181r(AbstractC0729o abstractC0729o, List list) {
        super(abstractC0729o);
        AbstractC5868k.m23674f(abstractC0729o, "fm");
        AbstractC5868k.m23674f(list, "fragments");
        this.f4677f = list;
    }

    @Override // androidx.fragment.app.AbstractC0734t
    /* renamed from: a */
    public Fragment mo3587a(int i10) {
        return (Fragment) this.f4677f.get(i10);
    }

    /* renamed from: d */
    public final List m5421d() {
        return this.f4677f;
    }

    @Override // androidx.viewpager.widget.AbstractC0871a
    public int getCount() {
        return this.f4677f.size();
    }
}
