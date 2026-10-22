package p212kd;

import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.AbstractC0734t;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5868k;

/* renamed from: kd.u2 */
/* loaded from: classes3.dex */
public final class C5233u2 extends AbstractC0734t {

    /* renamed from: f */
    private List f21389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5233u2(AbstractC0729o abstractC0729o) {
        super(abstractC0729o, 1);
        AbstractC5868k.m23674f(abstractC0729o, "fm");
        this.f21389f = new ArrayList();
    }

    @Override // androidx.fragment.app.AbstractC0734t
    /* renamed from: a */
    public Fragment mo3587a(int i10) {
        return (Fragment) this.f21389f.get(i10);
    }

    /* renamed from: d */
    public final void m21095d(List list) {
        AbstractC5868k.m23674f(list, "list");
        this.f21389f = list;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.AbstractC0871a
    public int getCount() {
        return this.f21389f.size();
    }
}
