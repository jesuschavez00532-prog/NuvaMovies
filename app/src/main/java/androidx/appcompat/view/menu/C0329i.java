package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.R$dimen;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0619r;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public class C0329i {

    /* renamed from: a */
    private final Context f1391a;

    /* renamed from: b */
    private final C0325e f1392b;

    /* renamed from: c */
    private final boolean f1393c;

    /* renamed from: d */
    private final int f1394d;

    /* renamed from: e */
    private final int f1395e;

    /* renamed from: f */
    private View f1396f;

    /* renamed from: g */
    private int f1397g;

    /* renamed from: h */
    private boolean f1398h;

    /* renamed from: i */
    private InterfaceC0330j.a f1399i;

    /* renamed from: j */
    private AbstractC0328h f1400j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1401k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1402l;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0329i.this.mo1418e();
        }
    }

    public C0329i(Context context, C0325e c0325e, View view, boolean z10, int i10) {
        this(context, c0325e, view, z10, i10, 0);
    }

    /* renamed from: a */
    private AbstractC0328h m1413a() {
        boolean z10;
        AbstractC0328h viewOnKeyListenerC0332l;
        Display defaultDisplay = ((WindowManager) this.f1391a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (Math.min(point.x, point.y) >= this.f1391a.getResources().getDimensionPixelSize(R$dimen.abc_cascading_menus_min_smallest_width)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            viewOnKeyListenerC0332l = new ViewOnKeyListenerC0322b(this.f1391a, this.f1396f, this.f1394d, this.f1395e, this.f1393c);
        } else {
            viewOnKeyListenerC0332l = new ViewOnKeyListenerC0332l(this.f1391a, this.f1392b, this.f1396f, this.f1394d, this.f1395e, this.f1393c);
        }
        viewOnKeyListenerC0332l.mo1302j(this.f1392b);
        viewOnKeyListenerC0332l.mo1308s(this.f1402l);
        viewOnKeyListenerC0332l.mo1304n(this.f1396f);
        viewOnKeyListenerC0332l.mo1281f(this.f1399i);
        viewOnKeyListenerC0332l.mo1305p(this.f1398h);
        viewOnKeyListenerC0332l.mo1306q(this.f1397g);
        return viewOnKeyListenerC0332l;
    }

    /* renamed from: l */
    private void m1414l(int i10, int i11, boolean z10, boolean z11) {
        AbstractC0328h m1416c = m1416c();
        m1416c.mo1309t(z11);
        if (z10) {
            if ((AbstractC0619r.m2800b(this.f1397g, AbstractC0616q0.m2579B(this.f1396f)) & 7) == 5) {
                i10 -= this.f1396f.getWidth();
            }
            m1416c.mo1307r(i10);
            m1416c.mo1310u(i11);
            int i12 = (int) ((this.f1391a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m1416c.m1412o(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        m1416c.show();
    }

    /* renamed from: b */
    public void m1415b() {
        if (m1417d()) {
            this.f1400j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC0328h m1416c() {
        if (this.f1400j == null) {
            this.f1400j = m1413a();
        }
        return this.f1400j;
    }

    /* renamed from: d */
    public boolean m1417d() {
        AbstractC0328h abstractC0328h = this.f1400j;
        if (abstractC0328h != null && abstractC0328h.isShowing()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1418e() {
        this.f1400j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1401k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m1419f(View view) {
        this.f1396f = view;
    }

    /* renamed from: g */
    public void m1420g(boolean z10) {
        this.f1398h = z10;
        AbstractC0328h abstractC0328h = this.f1400j;
        if (abstractC0328h != null) {
            abstractC0328h.mo1305p(z10);
        }
    }

    /* renamed from: h */
    public void m1421h(int i10) {
        this.f1397g = i10;
    }

    /* renamed from: i */
    public void m1422i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1401k = onDismissListener;
    }

    /* renamed from: j */
    public void m1423j(InterfaceC0330j.a aVar) {
        this.f1399i = aVar;
        AbstractC0328h abstractC0328h = this.f1400j;
        if (abstractC0328h != null) {
            abstractC0328h.mo1281f(aVar);
        }
    }

    /* renamed from: k */
    public void m1424k() {
        if (m1425m()) {
        } else {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean m1425m() {
        if (m1417d()) {
            return true;
        }
        if (this.f1396f == null) {
            return false;
        }
        m1414l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m1426n(int i10, int i11) {
        if (m1417d()) {
            return true;
        }
        if (this.f1396f == null) {
            return false;
        }
        m1414l(i10, i11, true, true);
        return true;
    }

    public C0329i(Context context, C0325e c0325e, View view, boolean z10, int i10, int i11) {
        this.f1397g = 8388611;
        this.f1402l = new a();
        this.f1391a = context;
        this.f1392b = c0325e;
        this.f1396f = view;
        this.f1393c = z10;
        this.f1394d = i10;
        this.f1395e = i11;
    }
}
