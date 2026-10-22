package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0324d;
import androidx.appcompat.view.menu.C0325e;
import androidx.appcompat.view.menu.C0327g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.b2 */
/* loaded from: classes.dex */
public class C0378b2 extends AbstractC0461w1 implements InterfaceC0465x1 {

    /* renamed from: K */
    private static Method f1693K;

    /* renamed from: J */
    private InterfaceC0465x1 f1694J;

    /* renamed from: androidx.appcompat.widget.b2$a */
    /* loaded from: classes.dex */
    public static class a extends C0433p1 {

        /* renamed from: o */
        final int f1695o;

        /* renamed from: p */
        final int f1696p;

        /* renamed from: q */
        private InterfaceC0465x1 f1697q;

        /* renamed from: r */
        private MenuItem f1698r;

        public a(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1695o = 21;
                this.f1696p = 22;
            } else {
                this.f1695o = 22;
                this.f1696p = 21;
            }
        }

        @Override // androidx.appcompat.widget.C0433p1
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo1629d(int i10, int i11, int i12, int i13, int i14) {
            return super.mo1629d(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.C0433p1
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo1630e(MotionEvent motionEvent, int i10) {
            return super.mo1630e(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.C0433p1, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0433p1, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0433p1, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0433p1, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C0433p1, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C0324d c0324d;
            int i10;
            C0327g c0327g;
            int pointToPosition;
            int i11;
            if (this.f1697q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    c0324d = (C0324d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0324d = (C0324d) adapter;
                    i10 = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < c0324d.getCount()) {
                    c0327g = c0324d.getItem(i11);
                } else {
                    c0327g = null;
                }
                MenuItem menuItem = this.f1698r;
                if (menuItem != c0327g) {
                    C0325e m1319b = c0324d.m1319b();
                    if (menuItem != null) {
                        this.f1697q.mo1312e(m1319b, menuItem);
                    }
                    this.f1698r = c0327g;
                    if (c0327g != null) {
                        this.f1697q.mo1311b(m1319b, c0327g);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            C0324d c0324d;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1695o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i10 == this.f1696p) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    c0324d = (C0324d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    c0324d = (C0324d) adapter;
                }
                c0324d.m1319b().m1360e(false);
                return true;
            }
            return super.onKeyDown(i10, keyEvent);
        }

        @Override // androidx.appcompat.widget.C0433p1, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0465x1 interfaceC0465x1) {
            this.f1697q = interfaceC0465x1;
        }

        @Override // androidx.appcompat.widget.C0433p1, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1693K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0378b2(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    /* renamed from: L */
    public void m1624L(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1979F.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: M */
    public void m1625M(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1979F.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: N */
    public void m1626N(InterfaceC0465x1 interfaceC0465x1) {
        this.f1694J = interfaceC0465x1;
    }

    /* renamed from: O */
    public void m1627O(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f1979F.setTouchModal(z10);
            return;
        }
        Method method = f1693K;
        if (method != null) {
            try {
                method.invoke(this.f1979F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0465x1
    /* renamed from: b */
    public void mo1311b(C0325e c0325e, MenuItem menuItem) {
        InterfaceC0465x1 interfaceC0465x1 = this.f1694J;
        if (interfaceC0465x1 != null) {
            interfaceC0465x1.mo1311b(c0325e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0465x1
    /* renamed from: e */
    public void mo1312e(C0325e c0325e, MenuItem menuItem) {
        InterfaceC0465x1 interfaceC0465x1 = this.f1694J;
        if (interfaceC0465x1 != null) {
            interfaceC0465x1.mo1312e(c0325e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0461w1
    /* renamed from: q */
    C0433p1 mo1628q(Context context, boolean z10) {
        a aVar = new a(context, z10);
        aVar.setHoverListener(this);
        return aVar;
    }
}
