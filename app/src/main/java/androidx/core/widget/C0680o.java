package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.o */
/* loaded from: classes.dex */
public class C0680o extends AbstractViewOnTouchListenerC0658a {

    /* renamed from: s */
    private final ListView f2501s;

    public C0680o(ListView listView) {
        super(listView);
        this.f2501s = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0658a
    /* renamed from: a */
    public boolean mo2897a(int i10) {
        return false;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0658a
    /* renamed from: b */
    public boolean mo2898b(int i10) {
        ListView listView = this.f2501s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC0658a
    /* renamed from: j */
    public void mo2900j(int i10, int i11) {
        AbstractC0681p.m2977a(this.f2501s, i11);
    }
}
