package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.appcompat.widget.C0378b2;
import androidx.core.view.AbstractC0616q0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0332l extends AbstractC0328h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: v */
    private static final int f1404v = R$layout.abc_popup_menu_item_layout;

    /* renamed from: b */
    private final Context f1405b;

    /* renamed from: c */
    private final C0325e f1406c;

    /* renamed from: d */
    private final C0324d f1407d;

    /* renamed from: e */
    private final boolean f1408e;

    /* renamed from: f */
    private final int f1409f;

    /* renamed from: g */
    private final int f1410g;

    /* renamed from: h */
    private final int f1411h;

    /* renamed from: i */
    final C0378b2 f1412i;

    /* renamed from: l */
    private PopupWindow.OnDismissListener f1415l;

    /* renamed from: m */
    private View f1416m;

    /* renamed from: n */
    View f1417n;

    /* renamed from: o */
    private InterfaceC0330j.a f1418o;

    /* renamed from: p */
    ViewTreeObserver f1419p;

    /* renamed from: q */
    private boolean f1420q;

    /* renamed from: r */
    private boolean f1421r;

    /* renamed from: s */
    private int f1422s;

    /* renamed from: u */
    private boolean f1424u;

    /* renamed from: j */
    final ViewTreeObserver.OnGlobalLayoutListener f1413j = new a();

    /* renamed from: k */
    private final View.OnAttachStateChangeListener f1414k = new b();

    /* renamed from: t */
    private int f1423t = 0;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ViewOnKeyListenerC0332l.this.isShowing() && !ViewOnKeyListenerC0332l.this.f1412i.m2017v()) {
                View view = ViewOnKeyListenerC0332l.this.f1417n;
                if (view != null && view.isShown()) {
                    ViewOnKeyListenerC0332l.this.f1412i.show();
                } else {
                    ViewOnKeyListenerC0332l.this.dismiss();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0332l.this.f1419p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0332l.this.f1419p = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0332l viewOnKeyListenerC0332l = ViewOnKeyListenerC0332l.this;
                viewOnKeyListenerC0332l.f1419p.removeGlobalOnLayoutListener(viewOnKeyListenerC0332l.f1413j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0332l(Context context, C0325e c0325e, View view, int i10, int i11, boolean z10) {
        this.f1405b = context;
        this.f1406c = c0325e;
        this.f1408e = z10;
        this.f1407d = new C0324d(c0325e, LayoutInflater.from(context), z10, f1404v);
        this.f1410g = i10;
        this.f1411h = i11;
        Resources resources = context.getResources();
        this.f1409f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.f1416m = view;
        this.f1412i = new C0378b2(context, null, i10, i11);
        c0325e.m1356c(this, context);
    }

    /* renamed from: x */
    private boolean m1427x() {
        View view;
        boolean z10;
        if (isShowing()) {
            return true;
        }
        if (this.f1420q || (view = this.f1416m) == null) {
            return false;
        }
        this.f1417n = view;
        this.f1412i.m2001E(this);
        this.f1412i.m2002F(this);
        this.f1412i.m2000D(true);
        View view2 = this.f1417n;
        if (this.f1419p == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1419p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1413j);
        }
        view2.addOnAttachStateChangeListener(this.f1414k);
        this.f1412i.m2018x(view2);
        this.f1412i.m1997A(this.f1423t);
        if (!this.f1421r) {
            this.f1422s = AbstractC0328h.m1408m(this.f1407d, null, this.f1405b, this.f1409f);
            this.f1421r = true;
        }
        this.f1412i.m2020z(this.f1422s);
        this.f1412i.m1999C(2);
        this.f1412i.m1998B(m1411l());
        this.f1412i.show();
        ListView mo1301h = this.f1412i.mo1301h();
        mo1301h.setOnKeyListener(this);
        if (this.f1424u && this.f1406c.m1375x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1405b).inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) mo1301h, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1406c.m1375x());
            }
            frameLayout.setEnabled(false);
            mo1301h.addHeaderView(frameLayout, null, false);
        }
        this.f1412i.mo1616n(this.f1407d);
        this.f1412i.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: a */
    public void mo1277a(C0325e c0325e, boolean z10) {
        if (c0325e != this.f1406c) {
            return;
        }
        dismiss();
        InterfaceC0330j.a aVar = this.f1418o;
        if (aVar != null) {
            aVar.mo1162a(c0325e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: b */
    public void mo1278b(boolean z10) {
        this.f1421r = false;
        C0324d c0324d = this.f1407d;
        if (c0324d != null) {
            c0324d.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: c */
    public boolean mo1300c() {
        return false;
    }

    @Override // p150h.InterfaceC4458e
    public void dismiss() {
        if (isShowing()) {
            this.f1412i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: f */
    public void mo1281f(InterfaceC0330j.a aVar) {
        this.f1418o = aVar;
    }

    @Override // p150h.InterfaceC4458e
    /* renamed from: h */
    public ListView mo1301h() {
        return this.f1412i.mo1301h();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: i */
    public boolean mo1284i(SubMenuC0333m subMenuC0333m) {
        if (subMenuC0333m.hasVisibleItems()) {
            C0329i c0329i = new C0329i(this.f1405b, subMenuC0333m, this.f1417n, this.f1408e, this.f1410g, this.f1411h);
            c0329i.m1423j(this.f1418o);
            c0329i.m1420g(AbstractC0328h.m1409v(subMenuC0333m));
            c0329i.m1422i(this.f1415l);
            this.f1415l = null;
            this.f1406c.m1360e(false);
            int m2007a = this.f1412i.m2007a();
            int m2012m = this.f1412i.m2012m();
            if ((Gravity.getAbsoluteGravity(this.f1423t, AbstractC0616q0.m2579B(this.f1416m)) & 7) == 5) {
                m2007a += this.f1416m.getWidth();
            }
            if (c0329i.m1426n(m2007a, m2012m)) {
                InterfaceC0330j.a aVar = this.f1418o;
                if (aVar != null) {
                    aVar.mo1163b(subMenuC0333m);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p150h.InterfaceC4458e
    public boolean isShowing() {
        if (!this.f1420q && this.f1412i.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: j */
    public void mo1302j(C0325e c0325e) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: n */
    public void mo1304n(View view) {
        this.f1416m = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1420q = true;
        this.f1406c.close();
        ViewTreeObserver viewTreeObserver = this.f1419p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1419p = this.f1417n.getViewTreeObserver();
            }
            this.f1419p.removeGlobalOnLayoutListener(this.f1413j);
            this.f1419p = null;
        }
        this.f1417n.removeOnAttachStateChangeListener(this.f1414k);
        PopupWindow.OnDismissListener onDismissListener = this.f1415l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: p */
    public void mo1305p(boolean z10) {
        this.f1407d.m1321d(z10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: q */
    public void mo1306q(int i10) {
        this.f1423t = i10;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: r */
    public void mo1307r(int i10) {
        this.f1412i.m2008c(i10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: s */
    public void mo1308s(PopupWindow.OnDismissListener onDismissListener) {
        this.f1415l = onDismissListener;
    }

    @Override // p150h.InterfaceC4458e
    public void show() {
        if (m1427x()) {
        } else {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: t */
    public void mo1309t(boolean z10) {
        this.f1424u = z10;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: u */
    public void mo1310u(int i10) {
        this.f1412i.m2011j(i10);
    }
}
