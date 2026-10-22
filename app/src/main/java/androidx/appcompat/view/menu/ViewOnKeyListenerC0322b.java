package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.appcompat.widget.C0378b2;
import androidx.appcompat.widget.InterfaceC0465x1;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0619r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0322b extends AbstractC0328h implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B */
    private static final int f1273B = R$layout.abc_cascading_menu_item_layout;

    /* renamed from: A */
    boolean f1274A;

    /* renamed from: b */
    private final Context f1275b;

    /* renamed from: c */
    private final int f1276c;

    /* renamed from: d */
    private final int f1277d;

    /* renamed from: e */
    private final int f1278e;

    /* renamed from: f */
    private final boolean f1279f;

    /* renamed from: g */
    final Handler f1280g;

    /* renamed from: o */
    private View f1288o;

    /* renamed from: p */
    View f1289p;

    /* renamed from: r */
    private boolean f1291r;

    /* renamed from: s */
    private boolean f1292s;

    /* renamed from: t */
    private int f1293t;

    /* renamed from: u */
    private int f1294u;

    /* renamed from: w */
    private boolean f1296w;

    /* renamed from: x */
    private InterfaceC0330j.a f1297x;

    /* renamed from: y */
    ViewTreeObserver f1298y;

    /* renamed from: z */
    private PopupWindow.OnDismissListener f1299z;

    /* renamed from: h */
    private final List f1281h = new ArrayList();

    /* renamed from: i */
    final List f1282i = new ArrayList();

    /* renamed from: j */
    final ViewTreeObserver.OnGlobalLayoutListener f1283j = new a();

    /* renamed from: k */
    private final View.OnAttachStateChangeListener f1284k = new b();

    /* renamed from: l */
    private final InterfaceC0465x1 f1285l = new c();

    /* renamed from: m */
    private int f1286m = 0;

    /* renamed from: n */
    private int f1287n = 0;

    /* renamed from: v */
    private boolean f1295v = false;

    /* renamed from: q */
    private int f1290q = m1294B();

    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ViewOnKeyListenerC0322b.this.isShowing() && ViewOnKeyListenerC0322b.this.f1282i.size() > 0 && !((d) ViewOnKeyListenerC0322b.this.f1282i.get(0)).f1307a.m2017v()) {
                View view = ViewOnKeyListenerC0322b.this.f1289p;
                if (view != null && view.isShown()) {
                    Iterator it = ViewOnKeyListenerC0322b.this.f1282i.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f1307a.show();
                    }
                    return;
                }
                ViewOnKeyListenerC0322b.this.dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0322b.this.f1298y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0322b.this.f1298y = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0322b viewOnKeyListenerC0322b = ViewOnKeyListenerC0322b.this;
                viewOnKeyListenerC0322b.f1298y.removeGlobalOnLayoutListener(viewOnKeyListenerC0322b.f1283j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC0465x1 {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ d f1303a;

            /* renamed from: b */
            final /* synthetic */ MenuItem f1304b;

            /* renamed from: c */
            final /* synthetic */ C0325e f1305c;

            a(d dVar, MenuItem menuItem, C0325e c0325e) {
                this.f1303a = dVar;
                this.f1304b = menuItem;
                this.f1305c = c0325e;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1303a;
                if (dVar != null) {
                    ViewOnKeyListenerC0322b.this.f1274A = true;
                    dVar.f1308b.m1360e(false);
                    ViewOnKeyListenerC0322b.this.f1274A = false;
                }
                if (this.f1304b.isEnabled() && this.f1304b.hasSubMenu()) {
                    this.f1305c.m1340L(this.f1304b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0465x1
        /* renamed from: b */
        public void mo1311b(C0325e c0325e, MenuItem menuItem) {
            d dVar = null;
            ViewOnKeyListenerC0322b.this.f1280g.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0322b.this.f1282i.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (c0325e == ((d) ViewOnKeyListenerC0322b.this.f1282i.get(i10)).f1308b) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            if (i11 < ViewOnKeyListenerC0322b.this.f1282i.size()) {
                dVar = (d) ViewOnKeyListenerC0322b.this.f1282i.get(i11);
            }
            ViewOnKeyListenerC0322b.this.f1280g.postAtTime(new a(dVar, menuItem, c0325e), c0325e, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0465x1
        /* renamed from: e */
        public void mo1312e(C0325e c0325e, MenuItem menuItem) {
            ViewOnKeyListenerC0322b.this.f1280g.removeCallbacksAndMessages(c0325e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final C0378b2 f1307a;

        /* renamed from: b */
        public final C0325e f1308b;

        /* renamed from: c */
        public final int f1309c;

        public d(C0378b2 c0378b2, C0325e c0325e, int i10) {
            this.f1307a = c0378b2;
            this.f1308b = c0325e;
            this.f1309c = i10;
        }

        /* renamed from: a */
        public ListView m1313a() {
            return this.f1307a.mo1301h();
        }
    }

    public ViewOnKeyListenerC0322b(Context context, View view, int i10, int i11, boolean z10) {
        this.f1275b = context;
        this.f1288o = view;
        this.f1277d = i10;
        this.f1278e = i11;
        this.f1279f = z10;
        Resources resources = context.getResources();
        this.f1276c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.f1280g = new Handler();
    }

    /* renamed from: A */
    private View m1293A(d dVar, C0325e c0325e) {
        C0324d c0324d;
        int i10;
        int firstVisiblePosition;
        MenuItem m1299z = m1299z(dVar.f1308b, c0325e);
        if (m1299z == null) {
            return null;
        }
        ListView m1313a = dVar.m1313a();
        ListAdapter adapter = m1313a.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            c0324d = (C0324d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0324d = (C0324d) adapter;
            i10 = 0;
        }
        int count = c0324d.getCount();
        while (true) {
            if (i11 < count) {
                if (m1299z == c0324d.getItem(i11)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 == -1 || (firstVisiblePosition = (i11 + i10) - m1313a.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= m1313a.getChildCount()) {
            return null;
        }
        return m1313a.getChildAt(firstVisiblePosition);
    }

    /* renamed from: B */
    private int m1294B() {
        if (AbstractC0616q0.m2579B(this.f1288o) != 1) {
            return 1;
        }
        return 0;
    }

    /* renamed from: C */
    private int m1295C(int i10) {
        List list = this.f1282i;
        ListView m1313a = ((d) list.get(list.size() - 1)).m1313a();
        int[] iArr = new int[2];
        m1313a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1289p.getWindowVisibleDisplayFrame(rect);
        if (this.f1290q == 1) {
            if (iArr[0] + m1313a.getWidth() + i10 <= rect.right) {
                return 1;
            }
            return 0;
        }
        if (iArr[0] - i10 < 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: D */
    private void m1296D(C0325e c0325e) {
        d dVar;
        View view;
        boolean z10;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f1275b);
        C0324d c0324d = new C0324d(c0325e, from, this.f1279f, f1273B);
        if (!isShowing() && this.f1295v) {
            c0324d.m1321d(true);
        } else if (isShowing()) {
            c0324d.m1321d(AbstractC0328h.m1409v(c0325e));
        }
        int m1408m = AbstractC0328h.m1408m(c0324d, null, this.f1275b, this.f1276c);
        C0378b2 m1297x = m1297x();
        m1297x.mo1616n(c0324d);
        m1297x.m2020z(m1408m);
        m1297x.m1997A(this.f1287n);
        if (this.f1282i.size() > 0) {
            List list = this.f1282i;
            dVar = (d) list.get(list.size() - 1);
            view = m1293A(dVar, c0325e);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            m1297x.m1627O(false);
            m1297x.m1624L(null);
            int m1295C = m1295C(m1408m);
            if (m1295C == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f1290q = m1295C;
            if (Build.VERSION.SDK_INT >= 26) {
                m1297x.m2018x(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1288o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1287n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1288o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f1287n & 5) == 5) {
                if (!z10) {
                    m1408m = view.getWidth();
                    i12 = i10 - m1408m;
                }
                i12 = i10 + m1408m;
            } else {
                if (z10) {
                    m1408m = view.getWidth();
                    i12 = i10 + m1408m;
                }
                i12 = i10 - m1408m;
            }
            m1297x.m2008c(i12);
            m1297x.m2003G(true);
            m1297x.m2011j(i11);
        } else {
            if (this.f1291r) {
                m1297x.m2008c(this.f1293t);
            }
            if (this.f1292s) {
                m1297x.m2011j(this.f1294u);
            }
            m1297x.m1998B(m1411l());
        }
        this.f1282i.add(new d(m1297x, c0325e, this.f1290q));
        m1297x.show();
        ListView mo1301h = m1297x.mo1301h();
        mo1301h.setOnKeyListener(this);
        if (dVar == null && this.f1296w && c0325e.m1375x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) mo1301h, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0325e.m1375x());
            mo1301h.addHeaderView(frameLayout, null, false);
            m1297x.show();
        }
    }

    /* renamed from: x */
    private C0378b2 m1297x() {
        C0378b2 c0378b2 = new C0378b2(this.f1275b, null, this.f1277d, this.f1278e);
        c0378b2.m1626N(this.f1285l);
        c0378b2.m2002F(this);
        c0378b2.m2001E(this);
        c0378b2.m2018x(this.f1288o);
        c0378b2.m1997A(this.f1287n);
        c0378b2.m2000D(true);
        c0378b2.m1999C(2);
        return c0378b2;
    }

    /* renamed from: y */
    private int m1298y(C0325e c0325e) {
        int size = this.f1282i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (c0325e == ((d) this.f1282i.get(i10)).f1308b) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: z */
    private MenuItem m1299z(C0325e c0325e, C0325e c0325e2) {
        int size = c0325e.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0325e.getItem(i10);
            if (item.hasSubMenu() && c0325e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: a */
    public void mo1277a(C0325e c0325e, boolean z10) {
        int m1298y = m1298y(c0325e);
        if (m1298y < 0) {
            return;
        }
        int i10 = m1298y + 1;
        if (i10 < this.f1282i.size()) {
            ((d) this.f1282i.get(i10)).f1308b.m1360e(false);
        }
        d dVar = (d) this.f1282i.remove(m1298y);
        dVar.f1308b.m1342O(this);
        if (this.f1274A) {
            dVar.f1307a.m1625M(null);
            dVar.f1307a.m2019y(0);
        }
        dVar.f1307a.dismiss();
        int size = this.f1282i.size();
        if (size > 0) {
            this.f1290q = ((d) this.f1282i.get(size - 1)).f1309c;
        } else {
            this.f1290q = m1294B();
        }
        if (size == 0) {
            dismiss();
            InterfaceC0330j.a aVar = this.f1297x;
            if (aVar != null) {
                aVar.mo1162a(c0325e, true);
            }
            ViewTreeObserver viewTreeObserver = this.f1298y;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f1298y.removeGlobalOnLayoutListener(this.f1283j);
                }
                this.f1298y = null;
            }
            this.f1289p.removeOnAttachStateChangeListener(this.f1284k);
            this.f1299z.onDismiss();
            return;
        }
        if (z10) {
            ((d) this.f1282i.get(0)).f1308b.m1360e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: b */
    public void mo1278b(boolean z10) {
        Iterator it = this.f1282i.iterator();
        while (it.hasNext()) {
            AbstractC0328h.m1410w(((d) it.next()).m1313a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: c */
    public boolean mo1300c() {
        return false;
    }

    @Override // p150h.InterfaceC4458e
    public void dismiss() {
        int size = this.f1282i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1282i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f1307a.isShowing()) {
                    dVar.f1307a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: f */
    public void mo1281f(InterfaceC0330j.a aVar) {
        this.f1297x = aVar;
    }

    @Override // p150h.InterfaceC4458e
    /* renamed from: h */
    public ListView mo1301h() {
        if (this.f1282i.isEmpty()) {
            return null;
        }
        return ((d) this.f1282i.get(r0.size() - 1)).m1313a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: i */
    public boolean mo1284i(SubMenuC0333m subMenuC0333m) {
        for (d dVar : this.f1282i) {
            if (subMenuC0333m == dVar.f1308b) {
                dVar.m1313a().requestFocus();
                return true;
            }
        }
        if (subMenuC0333m.hasVisibleItems()) {
            mo1302j(subMenuC0333m);
            InterfaceC0330j.a aVar = this.f1297x;
            if (aVar != null) {
                aVar.mo1163b(subMenuC0333m);
            }
            return true;
        }
        return false;
    }

    @Override // p150h.InterfaceC4458e
    public boolean isShowing() {
        if (this.f1282i.size() <= 0 || !((d) this.f1282i.get(0)).f1307a.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: j */
    public void mo1302j(C0325e c0325e) {
        c0325e.m1356c(this, this.f1275b);
        if (isShowing()) {
            m1296D(c0325e);
        } else {
            this.f1281h.add(c0325e);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: k */
    protected boolean mo1303k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: n */
    public void mo1304n(View view) {
        if (this.f1288o != view) {
            this.f1288o = view;
            this.f1287n = AbstractC0619r.m2800b(this.f1286m, AbstractC0616q0.m2579B(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1282i.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                dVar = (d) this.f1282i.get(i10);
                if (!dVar.f1307a.isShowing()) {
                    break;
                } else {
                    i10++;
                }
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f1308b.m1360e(false);
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
        this.f1295v = z10;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: q */
    public void mo1306q(int i10) {
        if (this.f1286m != i10) {
            this.f1286m = i10;
            this.f1287n = AbstractC0619r.m2800b(i10, AbstractC0616q0.m2579B(this.f1288o));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: r */
    public void mo1307r(int i10) {
        this.f1291r = true;
        this.f1293t = i10;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: s */
    public void mo1308s(PopupWindow.OnDismissListener onDismissListener) {
        this.f1299z = onDismissListener;
    }

    @Override // p150h.InterfaceC4458e
    public void show() {
        boolean z10;
        if (isShowing()) {
            return;
        }
        Iterator it = this.f1281h.iterator();
        while (it.hasNext()) {
            m1296D((C0325e) it.next());
        }
        this.f1281h.clear();
        View view = this.f1288o;
        this.f1289p = view;
        if (view != null) {
            if (this.f1298y == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1298y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1283j);
            }
            this.f1289p.addOnAttachStateChangeListener(this.f1284k);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: t */
    public void mo1309t(boolean z10) {
        this.f1296w = z10;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0328h
    /* renamed from: u */
    public void mo1310u(int i10) {
        this.f1292s = true;
        this.f1294u = i10;
    }
}
