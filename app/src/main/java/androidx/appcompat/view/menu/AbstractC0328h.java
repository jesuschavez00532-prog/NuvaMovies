package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import p150h.InterfaceC4458e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public abstract class AbstractC0328h implements InterfaceC4458e, InterfaceC0330j, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f1390a;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static int m1408m(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public static boolean m1409v(C0325e c0325e) {
        int size = c0325e.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0325e.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public static C0324d m1410w(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0324d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0324d) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: d */
    public boolean mo1279d(C0325e c0325e, C0327g c0327g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: e */
    public boolean mo1280e(C0325e c0325e, C0327g c0327g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: g */
    public void mo1282g(Context context, C0325e c0325e) {
    }

    /* renamed from: j */
    public abstract void mo1302j(C0325e c0325e);

    /* renamed from: k */
    protected boolean mo1303k() {
        return true;
    }

    /* renamed from: l */
    public Rect m1411l() {
        return this.f1390a;
    }

    /* renamed from: n */
    public abstract void mo1304n(View view);

    /* renamed from: o */
    public void m1412o(Rect rect) {
        this.f1390a = rect;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        int i11;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0325e c0325e = m1410w(listAdapter).f1321a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i10);
        if (mo1303k()) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        c0325e.m1341M(menuItem, this, i11);
    }

    /* renamed from: p */
    public abstract void mo1305p(boolean z10);

    /* renamed from: q */
    public abstract void mo1306q(int i10);

    /* renamed from: r */
    public abstract void mo1307r(int i10);

    /* renamed from: s */
    public abstract void mo1308s(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: t */
    public abstract void mo1309t(boolean z10);

    /* renamed from: u */
    public abstract void mo1310u(int i10);
}
