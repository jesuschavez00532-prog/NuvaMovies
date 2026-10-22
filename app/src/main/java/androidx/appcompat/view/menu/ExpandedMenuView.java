package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0325e;
import androidx.appcompat.widget.C0438q2;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0325e.b, InterfaceC0331k, AdapterView.OnItemClickListener {

    /* renamed from: c */
    private static final int[] f1243c = {R.attr.background, R.attr.divider};

    /* renamed from: a */
    private C0325e f1244a;

    /* renamed from: b */
    private int f1245b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.C0325e.b
    /* renamed from: a */
    public boolean mo1269a(C0327g c0327g) {
        return this.f1244a.m1340L(c0327g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k
    /* renamed from: b */
    public void mo1270b(C0325e c0325e) {
        this.f1244a = c0325e;
    }

    public int getWindowAnimations() {
        return this.f1245b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        mo1269a((C0327g) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0438q2 m1874v = C0438q2.m1874v(context, attributeSet, f1243c, i10, 0);
        if (m1874v.m1893s(0)) {
            setBackgroundDrawable(m1874v.m1881g(0));
        }
        if (m1874v.m1893s(1)) {
            setDivider(m1874v.m1881g(1));
        }
        m1874v.m1894w();
    }
}
