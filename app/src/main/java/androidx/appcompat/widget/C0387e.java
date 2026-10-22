package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.AbstractC0321a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0325e;
import androidx.appcompat.view.menu.C0327g;
import androidx.appcompat.view.menu.C0329i;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.appcompat.view.menu.InterfaceC0331k;
import androidx.appcompat.view.menu.SubMenuC0333m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC0555b;
import java.util.ArrayList;
import p138g.C4317a;
import p150h.InterfaceC4458e;
import p290q.AbstractC6306k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
public class C0387e extends AbstractC0321a implements AbstractC0555b.a {

    /* renamed from: A */
    c f1710A;

    /* renamed from: B */
    private b f1711B;

    /* renamed from: C */
    final f f1712C;

    /* renamed from: D */
    int f1713D;

    /* renamed from: k */
    d f1714k;

    /* renamed from: l */
    private Drawable f1715l;

    /* renamed from: m */
    private boolean f1716m;

    /* renamed from: n */
    private boolean f1717n;

    /* renamed from: o */
    private boolean f1718o;

    /* renamed from: p */
    private int f1719p;

    /* renamed from: q */
    private int f1720q;

    /* renamed from: r */
    private int f1721r;

    /* renamed from: s */
    private boolean f1722s;

    /* renamed from: t */
    private boolean f1723t;

    /* renamed from: u */
    private boolean f1724u;

    /* renamed from: v */
    private boolean f1725v;

    /* renamed from: w */
    private int f1726w;

    /* renamed from: x */
    private final SparseBooleanArray f1727x;

    /* renamed from: y */
    e f1728y;

    /* renamed from: z */
    a f1729z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.e$a */
    /* loaded from: classes.dex */
    public class a extends C0329i {
        public a(Context context, SubMenuC0333m subMenuC0333m, View view) {
            super(context, subMenuC0333m, view, false, R$attr.actionOverflowMenuStyle);
            if (!((C0327g) subMenuC0333m.getItem()).m1393l()) {
                View view2 = C0387e.this.f1714k;
                m1419f(view2 == null ? (View) ((AbstractC0321a) C0387e.this).f1271i : view2);
            }
            m1423j(C0387e.this.f1712C);
        }

        @Override // androidx.appcompat.view.menu.C0329i
        /* renamed from: e */
        protected void mo1418e() {
            C0387e c0387e = C0387e.this;
            c0387e.f1729z = null;
            c0387e.f1713D = 0;
            super.mo1418e();
        }
    }

    /* renamed from: androidx.appcompat.widget.e$b */
    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.AbstractC0320b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0320b
        /* renamed from: a */
        public InterfaceC4458e mo1268a() {
            a aVar = C0387e.this.f1729z;
            if (aVar != null) {
                return aVar.m1416c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.e$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        private e f1732a;

        public c(e eVar) {
            this.f1732a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0321a) C0387e.this).f1265c != null) {
                ((AbstractC0321a) C0387e.this).f1265c.m1358d();
            }
            View view = (View) ((AbstractC0321a) C0387e.this).f1271i;
            if (view != null && view.getWindowToken() != null && this.f1732a.m1425m()) {
                C0387e.this.f1728y = this.f1732a;
            }
            C0387e.this.f1710A = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.e$d */
    /* loaded from: classes.dex */
    public class d extends C0439r implements ActionMenuView.InterfaceC0340a {

        /* renamed from: androidx.appcompat.widget.e$d$a */
        /* loaded from: classes.dex */
        class a extends AbstractViewOnTouchListenerC0441r1 {

            /* renamed from: j */
            final /* synthetic */ C0387e f1735j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C0387e c0387e) {
                super(view);
                this.f1735j = c0387e;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0441r1
            /* renamed from: b */
            public InterfaceC4458e mo1266b() {
                e eVar = C0387e.this.f1728y;
                if (eVar == null) {
                    return null;
                }
                return eVar.m1416c();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0441r1
            /* renamed from: c */
            public boolean mo1267c() {
                C0387e.this.m1688K();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0441r1
            /* renamed from: d */
            public boolean mo1690d() {
                C0387e c0387e = C0387e.this;
                if (c0387e.f1710A != null) {
                    return false;
                }
                c0387e.m1679B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R$attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            AbstractC0450t2.m1940a(this, getContentDescription());
            setOnTouchListener(new a(this, C0387e.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0340a
        /* renamed from: b */
        public boolean mo1261b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0340a
        /* renamed from: c */
        public boolean mo1262c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0387e.this.m1688K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC6306k.m25066l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.e$e */
    /* loaded from: classes.dex */
    public class e extends C0329i {
        public e(Context context, C0325e c0325e, View view, boolean z10) {
            super(context, c0325e, view, z10, R$attr.actionOverflowMenuStyle);
            m1421h(8388613);
            m1423j(C0387e.this.f1712C);
        }

        @Override // androidx.appcompat.view.menu.C0329i
        /* renamed from: e */
        protected void mo1418e() {
            if (((AbstractC0321a) C0387e.this).f1265c != null) {
                ((AbstractC0321a) C0387e.this).f1265c.close();
            }
            C0387e.this.f1728y = null;
            super.mo1418e();
        }
    }

    /* renamed from: androidx.appcompat.widget.e$f */
    /* loaded from: classes.dex */
    private class f implements InterfaceC0330j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j.a
        /* renamed from: a */
        public void mo1162a(C0325e c0325e, boolean z10) {
            if (c0325e instanceof SubMenuC0333m) {
                c0325e.mo1332D().m1360e(false);
            }
            InterfaceC0330j.a m1288m = C0387e.this.m1288m();
            if (m1288m != null) {
                m1288m.mo1162a(c0325e, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0330j.a
        /* renamed from: b */
        public boolean mo1163b(C0325e c0325e) {
            if (c0325e == ((AbstractC0321a) C0387e.this).f1265c) {
                return false;
            }
            C0387e.this.f1713D = ((SubMenuC0333m) c0325e).getItem().getItemId();
            InterfaceC0330j.a m1288m = C0387e.this.m1288m();
            if (m1288m == null) {
                return false;
            }
            return m1288m.mo1163b(c0325e);
        }
    }

    public C0387e(Context context) {
        super(context, R$layout.abc_action_menu_layout, R$layout.abc_action_menu_item_layout);
        this.f1727x = new SparseBooleanArray();
        this.f1712C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    private View m1677z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1271i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof InterfaceC0331k.a) && ((InterfaceC0331k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public Drawable m1678A() {
        d dVar = this.f1714k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1716m) {
            return this.f1715l;
        }
        return null;
    }

    /* renamed from: B */
    public boolean m1679B() {
        Object obj;
        c cVar = this.f1710A;
        if (cVar != null && (obj = this.f1271i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f1710A = null;
            return true;
        }
        e eVar = this.f1728y;
        if (eVar != null) {
            eVar.m1415b();
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean m1680C() {
        a aVar = this.f1729z;
        if (aVar != null) {
            aVar.m1415b();
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public boolean m1681D() {
        if (this.f1710A == null && !m1682E()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public boolean m1682E() {
        e eVar = this.f1728y;
        if (eVar != null && eVar.m1417d()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public void m1683F(Configuration configuration) {
        if (!this.f1722s) {
            this.f1721r = C4317a.m18100b(this.f1264b).m18103d();
        }
        C0325e c0325e = this.f1265c;
        if (c0325e != null) {
            c0325e.m1339K(true);
        }
    }

    /* renamed from: G */
    public void m1684G(boolean z10) {
        this.f1725v = z10;
    }

    /* renamed from: H */
    public void m1685H(ActionMenuView actionMenuView) {
        this.f1271i = actionMenuView;
        actionMenuView.mo1270b(this.f1265c);
    }

    /* renamed from: I */
    public void m1686I(Drawable drawable) {
        d dVar = this.f1714k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1716m = true;
            this.f1715l = drawable;
        }
    }

    /* renamed from: J */
    public void m1687J(boolean z10) {
        this.f1717n = z10;
        this.f1718o = true;
    }

    /* renamed from: K */
    public boolean m1688K() {
        C0325e c0325e;
        if (this.f1717n && !m1682E() && (c0325e = this.f1265c) != null && this.f1271i != null && this.f1710A == null && !c0325e.m1377z().isEmpty()) {
            c cVar = new c(new e(this.f1264b, this.f1265c, this.f1714k, true));
            this.f1710A = cVar;
            ((View) this.f1271i).post(cVar);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0321a, androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: a */
    public void mo1277a(C0325e c0325e, boolean z10) {
        m1689y();
        super.mo1277a(c0325e, z10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0321a, androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: b */
    public void mo1278b(boolean z10) {
        ArrayList arrayList;
        super.mo1278b(z10);
        ((View) this.f1271i).requestLayout();
        C0325e c0325e = this.f1265c;
        boolean z11 = false;
        if (c0325e != null) {
            ArrayList m1370s = c0325e.m1370s();
            int size = m1370s.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC0555b mo1385b = ((C0327g) m1370s.get(i10)).mo1385b();
                if (mo1385b != null) {
                    mo1385b.m2401h(this);
                }
            }
        }
        C0325e c0325e2 = this.f1265c;
        if (c0325e2 != null) {
            arrayList = c0325e2.m1377z();
        } else {
            arrayList = null;
        }
        if (this.f1717n && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z11 = !((C0327g) arrayList.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1714k == null) {
                this.f1714k = new d(this.f1263a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1714k.getParent();
            if (viewGroup != this.f1271i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1714k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1271i;
                actionMenuView.addView(this.f1714k, actionMenuView.m1472F());
            }
        } else {
            d dVar = this.f1714k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f1271i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1714k);
                }
            }
        }
        ((ActionMenuView) this.f1271i).setOverflowReserved(this.f1717n);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: c */
    public boolean mo1300c() {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        C0387e c0387e = this;
        C0325e c0325e = c0387e.f1265c;
        View view = null;
        int i14 = 0;
        if (c0325e != null) {
            arrayList = c0325e.m1333E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i15 = c0387e.f1721r;
        int i16 = c0387e.f1720q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0387e.f1271i;
        boolean z12 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            C0327g c0327g = (C0327g) arrayList.get(i19);
            if (c0327g.m1396o()) {
                i17++;
            } else if (c0327g.m1395n()) {
                i18++;
            } else {
                z12 = true;
            }
            if (c0387e.f1725v && c0327g.isActionViewExpanded()) {
                i15 = 0;
            }
        }
        if (c0387e.f1717n && (z12 || i18 + i17 > i15)) {
            i15--;
        }
        int i20 = i15 - i17;
        SparseBooleanArray sparseBooleanArray = c0387e.f1727x;
        sparseBooleanArray.clear();
        if (c0387e.f1723t) {
            int i21 = c0387e.f1726w;
            i12 = i16 / i21;
            i11 = i21 + ((i16 % i21) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i22 = 0;
        int i23 = 0;
        while (i22 < i10) {
            C0327g c0327g2 = (C0327g) arrayList.get(i22);
            if (c0327g2.m1396o()) {
                View mo1289n = c0387e.mo1289n(c0327g2, view, viewGroup);
                if (c0387e.f1723t) {
                    i12 -= ActionMenuView.m1466L(mo1289n, i11, i12, makeMeasureSpec, i14);
                } else {
                    mo1289n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo1289n.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i23 == 0) {
                    i23 = measuredWidth;
                }
                int groupId = c0327g2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0327g2.m1402u(true);
                i13 = i10;
            } else if (c0327g2.m1395n()) {
                int groupId2 = c0327g2.getGroupId();
                boolean z13 = sparseBooleanArray.get(groupId2);
                if ((i20 > 0 || z13) && i16 > 0 && (!c0387e.f1723t || i12 > 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z14 = z10;
                i13 = i10;
                if (z10) {
                    View mo1289n2 = c0387e.mo1289n(c0327g2, null, viewGroup);
                    if (c0387e.f1723t) {
                        int m1466L = ActionMenuView.m1466L(mo1289n2, i11, i12, makeMeasureSpec, 0);
                        i12 -= m1466L;
                        if (m1466L == 0) {
                            z14 = false;
                        }
                    } else {
                        mo1289n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = mo1289n2.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i23 == 0) {
                        i23 = measuredWidth2;
                    }
                    if (!c0387e.f1723t ? i16 + i23 > 0 : i16 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 = z15 & z11;
                }
                if (z10 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z13) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i24 = 0; i24 < i22; i24++) {
                        C0327g c0327g3 = (C0327g) arrayList.get(i24);
                        if (c0327g3.getGroupId() == groupId2) {
                            if (c0327g3.m1393l()) {
                                i20++;
                            }
                            c0327g3.m1402u(false);
                        }
                    }
                }
                if (z10) {
                    i20--;
                }
                c0327g2.m1402u(z10);
            } else {
                i13 = i10;
                c0327g2.m1402u(false);
                i22++;
                view = null;
                c0387e = this;
                i10 = i13;
                i14 = 0;
            }
            i22++;
            view = null;
            c0387e = this;
            i10 = i13;
            i14 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0321a, androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: g */
    public void mo1282g(Context context, C0325e c0325e) {
        super.mo1282g(context, c0325e);
        Resources resources = context.getResources();
        C4317a m18100b = C4317a.m18100b(context);
        if (!this.f1718o) {
            this.f1717n = m18100b.m18105f();
        }
        if (!this.f1724u) {
            this.f1719p = m18100b.m18102c();
        }
        if (!this.f1722s) {
            this.f1721r = m18100b.m18103d();
        }
        int i10 = this.f1719p;
        if (this.f1717n) {
            if (this.f1714k == null) {
                d dVar = new d(this.f1263a);
                this.f1714k = dVar;
                if (this.f1716m) {
                    dVar.setImageDrawable(this.f1715l);
                    this.f1715l = null;
                    this.f1716m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1714k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1714k.getMeasuredWidth();
        } else {
            this.f1714k = null;
        }
        this.f1720q = i10;
        this.f1726w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0321a, androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: i */
    public boolean mo1284i(SubMenuC0333m subMenuC0333m) {
        boolean z10 = false;
        if (!subMenuC0333m.hasVisibleItems()) {
            return false;
        }
        SubMenuC0333m subMenuC0333m2 = subMenuC0333m;
        while (subMenuC0333m2.m1428e0() != this.f1265c) {
            subMenuC0333m2 = (SubMenuC0333m) subMenuC0333m2.m1428e0();
        }
        View m1677z = m1677z(subMenuC0333m2.getItem());
        if (m1677z == null) {
            return false;
        }
        this.f1713D = subMenuC0333m.getItem().getItemId();
        int size = subMenuC0333m.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = subMenuC0333m.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f1264b, subMenuC0333m, m1677z);
        this.f1729z = aVar;
        aVar.m1420g(z10);
        this.f1729z.m1424k();
        super.mo1284i(subMenuC0333m);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0321a
    /* renamed from: j */
    public void mo1285j(C0327g c0327g, InterfaceC0331k.a aVar) {
        aVar.mo1264e(c0327g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1271i);
        if (this.f1711B == null) {
            this.f1711B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f1711B);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0321a
    /* renamed from: l */
    public boolean mo1287l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1714k) {
            return false;
        }
        return super.mo1287l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0321a
    /* renamed from: n */
    public View mo1289n(C0327g c0327g, View view, ViewGroup viewGroup) {
        int i10;
        View actionView = c0327g.getActionView();
        if (actionView == null || c0327g.m1391j()) {
            actionView = super.mo1289n(c0327g, view, viewGroup);
        }
        if (c0327g.isActionViewExpanded()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        actionView.setVisibility(i10);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0321a
    /* renamed from: o */
    public InterfaceC0331k mo1290o(ViewGroup viewGroup) {
        InterfaceC0331k interfaceC0331k = this.f1271i;
        InterfaceC0331k mo1290o = super.mo1290o(viewGroup);
        if (interfaceC0331k != mo1290o) {
            ((ActionMenuView) mo1290o).setPresenter(this);
        }
        return mo1290o;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0321a
    /* renamed from: q */
    public boolean mo1292q(int i10, C0327g c0327g) {
        return c0327g.m1393l();
    }

    /* renamed from: y */
    public boolean m1689y() {
        return m1679B() | m1680C();
    }
}
