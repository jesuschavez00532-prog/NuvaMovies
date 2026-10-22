package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.media.session.AbstractC0272b;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0325e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.InterfaceC0417l1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC0597l1;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0589j1;
import androidx.core.view.InterfaceC0593k1;
import androidx.core.view.InterfaceC0601m1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p138g.AbstractC4318b;
import p138g.C4317a;
import p138g.C4323g;
import p138g.C4324h;

/* renamed from: androidx.appcompat.app.s */
/* loaded from: classes.dex */
public class C0318s extends AbstractC0300a implements ActionBarOverlayLayout.InterfaceC0338d {

    /* renamed from: D */
    private static final Interpolator f1182D = new AccelerateInterpolator();

    /* renamed from: E */
    private static final Interpolator f1183E = new DecelerateInterpolator();

    /* renamed from: a */
    Context f1187a;

    /* renamed from: b */
    private Context f1188b;

    /* renamed from: c */
    private Activity f1189c;

    /* renamed from: d */
    ActionBarOverlayLayout f1190d;

    /* renamed from: e */
    ActionBarContainer f1191e;

    /* renamed from: f */
    InterfaceC0417l1 f1192f;

    /* renamed from: g */
    ActionBarContextView f1193g;

    /* renamed from: h */
    View f1194h;

    /* renamed from: k */
    private boolean f1197k;

    /* renamed from: l */
    d f1198l;

    /* renamed from: m */
    AbstractC4318b f1199m;

    /* renamed from: n */
    AbstractC4318b.a f1200n;

    /* renamed from: o */
    private boolean f1201o;

    /* renamed from: q */
    private boolean f1203q;

    /* renamed from: t */
    boolean f1206t;

    /* renamed from: u */
    boolean f1207u;

    /* renamed from: v */
    private boolean f1208v;

    /* renamed from: x */
    C4324h f1210x;

    /* renamed from: y */
    private boolean f1211y;

    /* renamed from: z */
    boolean f1212z;

    /* renamed from: i */
    private ArrayList f1195i = new ArrayList();

    /* renamed from: j */
    private int f1196j = -1;

    /* renamed from: p */
    private ArrayList f1202p = new ArrayList();

    /* renamed from: r */
    private int f1204r = 0;

    /* renamed from: s */
    boolean f1205s = true;

    /* renamed from: w */
    private boolean f1209w = true;

    /* renamed from: A */
    final InterfaceC0593k1 f1184A = new a();

    /* renamed from: B */
    final InterfaceC0593k1 f1185B = new b();

    /* renamed from: C */
    final InterfaceC0601m1 f1186C = new c();

    /* renamed from: androidx.appcompat.app.s$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0597l1 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC0593k1
        /* renamed from: b */
        public void mo1160b(View view) {
            View view2;
            C0318s c0318s = C0318s.this;
            if (c0318s.f1205s && (view2 = c0318s.f1194h) != null) {
                view2.setTranslationY(0.0f);
                C0318s.this.f1191e.setTranslationY(0.0f);
            }
            C0318s.this.f1191e.setVisibility(8);
            C0318s.this.f1191e.setTransitioning(false);
            C0318s c0318s2 = C0318s.this;
            c0318s2.f1210x = null;
            c0318s2.m1240x();
            ActionBarOverlayLayout actionBarOverlayLayout = C0318s.this.f1190d;
            if (actionBarOverlayLayout != null) {
                AbstractC0616q0.m2630k0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.s$b */
    /* loaded from: classes.dex */
    class b extends AbstractC0597l1 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC0593k1
        /* renamed from: b */
        public void mo1160b(View view) {
            C0318s c0318s = C0318s.this;
            c0318s.f1210x = null;
            c0318s.f1191e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.s$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC0601m1 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC0601m1
        /* renamed from: a */
        public void mo1243a(View view) {
            ((View) C0318s.this.f1191e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.s$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC4318b implements C0325e.a {

        /* renamed from: c */
        private final Context f1216c;

        /* renamed from: d */
        private final C0325e f1217d;

        /* renamed from: e */
        private AbstractC4318b.a f1218e;

        /* renamed from: f */
        private WeakReference f1219f;

        public d(Context context, AbstractC4318b.a aVar) {
            this.f1216c = context;
            this.f1218e = aVar;
            C0325e m1346S = new C0325e(context).m1346S(1);
            this.f1217d = m1346S;
            m1346S.mo1345R(this);
        }

        @Override // androidx.appcompat.view.menu.C0325e.a
        /* renamed from: a */
        public boolean mo1141a(C0325e c0325e, MenuItem menuItem) {
            AbstractC4318b.a aVar = this.f1218e;
            if (aVar != null) {
                return aVar.mo1164a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0325e.a
        /* renamed from: b */
        public void mo1143b(C0325e c0325e) {
            if (this.f1218e == null) {
                return;
            }
            mo1250k();
            C0318s.this.f1193g.m1437l();
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: c */
        public void mo1244c() {
            C0318s c0318s = C0318s.this;
            if (c0318s.f1198l != this) {
                return;
            }
            if (!C0318s.m1226w(c0318s.f1206t, c0318s.f1207u, false)) {
                C0318s c0318s2 = C0318s.this;
                c0318s2.f1199m = this;
                c0318s2.f1200n = this.f1218e;
            } else {
                this.f1218e.mo1165b(this);
            }
            this.f1218e = null;
            C0318s.this.m1239v(false);
            C0318s.this.f1193g.m1433g();
            C0318s.this.f1192f.mo1797q().sendAccessibilityEvent(32);
            C0318s c0318s3 = C0318s.this;
            c0318s3.f1190d.setHideOnContentScrollEnabled(c0318s3.f1212z);
            C0318s.this.f1198l = null;
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: d */
        public View mo1245d() {
            WeakReference weakReference = this.f1219f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: e */
        public Menu mo1246e() {
            return this.f1217d;
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: f */
        public MenuInflater mo1247f() {
            return new C4323g(this.f1216c);
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: g */
        public CharSequence mo1248g() {
            return C0318s.this.f1193g.getSubtitle();
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: i */
        public CharSequence mo1249i() {
            return C0318s.this.f1193g.getTitle();
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: k */
        public void mo1250k() {
            if (C0318s.this.f1198l != this) {
                return;
            }
            this.f1217d.m1359d0();
            try {
                this.f1218e.mo1166c(this, this.f1217d);
            } finally {
                this.f1217d.m1357c0();
            }
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: l */
        public boolean mo1251l() {
            return C0318s.this.f1193g.m1435j();
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: m */
        public void mo1252m(View view) {
            C0318s.this.f1193g.setCustomView(view);
            this.f1219f = new WeakReference(view);
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: n */
        public void mo1253n(int i10) {
            mo1254o(C0318s.this.f1187a.getResources().getString(i10));
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: o */
        public void mo1254o(CharSequence charSequence) {
            C0318s.this.f1193g.setSubtitle(charSequence);
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: q */
        public void mo1255q(int i10) {
            mo1256r(C0318s.this.f1187a.getResources().getString(i10));
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: r */
        public void mo1256r(CharSequence charSequence) {
            C0318s.this.f1193g.setTitle(charSequence);
        }

        @Override // p138g.AbstractC4318b
        /* renamed from: s */
        public void mo1257s(boolean z10) {
            super.mo1257s(z10);
            C0318s.this.f1193g.setTitleOptional(z10);
        }

        /* renamed from: t */
        public boolean m1258t() {
            this.f1217d.m1359d0();
            try {
                return this.f1218e.mo1167d(this, this.f1217d);
            } finally {
                this.f1217d.m1357c0();
            }
        }
    }

    public C0318s(Activity activity, boolean z10) {
        this.f1189c = activity;
        View decorView = activity.getWindow().getDecorView();
        m1221D(decorView);
        if (z10) {
            return;
        }
        this.f1194h = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    private InterfaceC0417l1 m1219A(View view) {
        String str;
        if (view instanceof InterfaceC0417l1) {
            return (InterfaceC0417l1) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        if (view != 0) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: C */
    private void m1220C() {
        if (this.f1208v) {
            this.f1208v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1190d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1225M(false);
        }
    }

    /* renamed from: D */
    private void m1221D(View view) {
        boolean z10;
        boolean z11;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R$id.decor_content_parent);
        this.f1190d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1192f = m1219A(view.findViewById(R$id.action_bar));
        this.f1193g = (ActionBarContextView) view.findViewById(R$id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R$id.action_bar_container);
        this.f1191e = actionBarContainer;
        InterfaceC0417l1 interfaceC0417l1 = this.f1192f;
        if (interfaceC0417l1 != null && this.f1193g != null && actionBarContainer != null) {
            this.f1187a = interfaceC0417l1.mo1785e();
            if ((this.f1192f.mo1799s() & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f1197k = true;
            }
            C4317a m18100b = C4317a.m18100b(this.f1187a);
            if (!m18100b.m18101a() && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            m1232J(z11);
            m1222H(m18100b.m18104e());
            TypedArray obtainStyledAttributes = this.f1187a.obtainStyledAttributes(null, R$styleable.f904a, R$attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(R$styleable.ActionBar_hideOnContentScroll, false)) {
                m1231I(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                m1230G(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    /* renamed from: H */
    private void m1222H(boolean z10) {
        boolean z11;
        boolean z12;
        this.f1203q = z10;
        if (!z10) {
            this.f1192f.mo1790j(null);
            this.f1191e.setTabContainer(null);
        } else {
            this.f1191e.setTabContainer(null);
            this.f1192f.mo1790j(null);
        }
        boolean z13 = true;
        if (m1227B() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        InterfaceC0417l1 interfaceC0417l1 = this.f1192f;
        if (!this.f1203q && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        interfaceC0417l1.mo1802v(z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1190d;
        if (this.f1203q || !z11) {
            z13 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z13);
    }

    /* renamed from: K */
    private boolean m1223K() {
        return AbstractC0616q0.m2600R(this.f1191e);
    }

    /* renamed from: L */
    private void m1224L() {
        if (!this.f1208v) {
            this.f1208v = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1190d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m1225M(false);
        }
    }

    /* renamed from: M */
    private void m1225M(boolean z10) {
        if (m1226w(this.f1206t, this.f1207u, this.f1208v)) {
            if (!this.f1209w) {
                this.f1209w = true;
                m1242z(z10);
                return;
            }
            return;
        }
        if (this.f1209w) {
            this.f1209w = false;
            m1241y(z10);
        }
    }

    /* renamed from: w */
    static boolean m1226w(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* renamed from: B */
    public int m1227B() {
        return this.f1192f.mo1794n();
    }

    /* renamed from: E */
    public void m1228E(boolean z10) {
        int i10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        m1229F(i10, 4);
    }

    /* renamed from: F */
    public void m1229F(int i10, int i11) {
        int mo1799s = this.f1192f.mo1799s();
        if ((i11 & 4) != 0) {
            this.f1197k = true;
        }
        this.f1192f.mo1792l((i10 & i11) | ((i11 ^ (-1)) & mo1799s));
    }

    /* renamed from: G */
    public void m1230G(float f10) {
        AbstractC0616q0.m2650u0(this.f1191e, f10);
    }

    /* renamed from: I */
    public void m1231I(boolean z10) {
        if (z10 && !this.f1190d.m1464w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f1212z = z10;
        this.f1190d.setHideOnContentScrollEnabled(z10);
    }

    /* renamed from: J */
    public void m1232J(boolean z10) {
        this.f1192f.mo1798r(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0338d
    /* renamed from: a */
    public void mo1233a() {
        if (this.f1207u) {
            this.f1207u = false;
            m1225M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0338d
    /* renamed from: b */
    public void mo1234b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0338d
    /* renamed from: c */
    public void mo1235c(boolean z10) {
        this.f1205s = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0338d
    /* renamed from: d */
    public void mo1236d() {
        if (!this.f1207u) {
            this.f1207u = true;
            m1225M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0338d
    /* renamed from: e */
    public void mo1237e() {
        C4324h c4324h = this.f1210x;
        if (c4324h != null) {
            c4324h.m18128a();
            this.f1210x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0338d
    /* renamed from: f */
    public void mo1238f(int i10) {
        this.f1204r = i10;
    }

    @Override // androidx.appcompat.app.AbstractC0300a
    /* renamed from: h */
    public boolean mo1025h() {
        InterfaceC0417l1 interfaceC0417l1 = this.f1192f;
        if (interfaceC0417l1 != null && interfaceC0417l1.mo1791k()) {
            this.f1192f.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0300a
    /* renamed from: i */
    public void mo1026i(boolean z10) {
        if (z10 == this.f1201o) {
            return;
        }
        this.f1201o = z10;
        if (this.f1202p.size() <= 0) {
            return;
        }
        AbstractC0272b.m941a(this.f1202p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC0300a
    /* renamed from: j */
    public int mo1027j() {
        return this.f1192f.mo1799s();
    }

    @Override // androidx.appcompat.app.AbstractC0300a
    /* renamed from: k */
    public Context mo1028k() {
        if (this.f1188b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1187a.getTheme().resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f1188b = new ContextThemeWrapper(this.f1187a, i10);
            } else {
                this.f1188b = this.f1187a;
            }
        }
        return this.f1188b;
    }

    @Override // androidx.appcompat.app.AbstractC0300a
    /* renamed from: m */
    public void mo1030m(Configuration configuration) {
        m1222H(C4317a.m18100b(this.f1187a).m18104e());
    }

    @Override // androidx.appcompat.app.AbstractC0300a
    /* renamed from: o */
    public boolean mo1032o(int i10, KeyEvent keyEvent) {
        Menu mo1246e;
        int i11;
        d dVar = this.f1198l;
        if (dVar == null || (mo1246e = dVar.mo1246e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        mo1246e.setQwertyMode(z10);
        return mo1246e.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0300a
    /* renamed from: r */
    public void mo1035r(boolean z10) {
        if (!this.f1197k) {
            m1228E(z10);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0300a
    /* renamed from: s */
    public void mo1036s(boolean z10) {
        C4324h c4324h;
        this.f1211y = z10;
        if (!z10 && (c4324h = this.f1210x) != null) {
            c4324h.m18128a();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0300a
    /* renamed from: t */
    public void mo1037t(CharSequence charSequence) {
        this.f1192f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0300a
    /* renamed from: u */
    public AbstractC4318b mo1038u(AbstractC4318b.a aVar) {
        d dVar = this.f1198l;
        if (dVar != null) {
            dVar.mo1244c();
        }
        this.f1190d.setHideOnContentScrollEnabled(false);
        this.f1193g.m1436k();
        d dVar2 = new d(this.f1193g.getContext(), aVar);
        if (dVar2.m1258t()) {
            this.f1198l = dVar2;
            dVar2.mo1250k();
            this.f1193g.m1434h(dVar2);
            m1239v(true);
            this.f1193g.sendAccessibilityEvent(32);
            return dVar2;
        }
        return null;
    }

    /* renamed from: v */
    public void m1239v(boolean z10) {
        C0589j1 mo1795o;
        C0589j1 mo1432f;
        if (z10) {
            m1224L();
        } else {
            m1220C();
        }
        if (m1223K()) {
            if (z10) {
                mo1432f = this.f1192f.mo1795o(4, 100L);
                mo1795o = this.f1193g.mo1432f(0, 200L);
            } else {
                mo1795o = this.f1192f.mo1795o(0, 200L);
                mo1432f = this.f1193g.mo1432f(8, 100L);
            }
            C4324h c4324h = new C4324h();
            c4324h.m18131d(mo1432f, mo1795o);
            c4324h.m18135h();
            return;
        }
        if (z10) {
            this.f1192f.mo1796p(4);
            this.f1193g.setVisibility(0);
        } else {
            this.f1192f.mo1796p(0);
            this.f1193g.setVisibility(8);
        }
    }

    /* renamed from: x */
    void m1240x() {
        AbstractC4318b.a aVar = this.f1200n;
        if (aVar != null) {
            aVar.mo1165b(this.f1199m);
            this.f1199m = null;
            this.f1200n = null;
        }
    }

    /* renamed from: y */
    public void m1241y(boolean z10) {
        View view;
        C4324h c4324h = this.f1210x;
        if (c4324h != null) {
            c4324h.m18128a();
        }
        if (this.f1204r == 0 && (this.f1211y || z10)) {
            this.f1191e.setAlpha(1.0f);
            this.f1191e.setTransitioning(true);
            C4324h c4324h2 = new C4324h();
            float f10 = -this.f1191e.getHeight();
            if (z10) {
                this.f1191e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            C0589j1 m2492k = AbstractC0616q0.m2615d(this.f1191e).m2492k(f10);
            m2492k.m2490i(this.f1186C);
            c4324h2.m18130c(m2492k);
            if (this.f1205s && (view = this.f1194h) != null) {
                c4324h2.m18130c(AbstractC0616q0.m2615d(view).m2492k(f10));
            }
            c4324h2.m18133f(f1182D);
            c4324h2.m18132e(250L);
            c4324h2.m18134g(this.f1184A);
            this.f1210x = c4324h2;
            c4324h2.m18135h();
            return;
        }
        this.f1184A.mo1160b(null);
    }

    /* renamed from: z */
    public void m1242z(boolean z10) {
        View view;
        View view2;
        C4324h c4324h = this.f1210x;
        if (c4324h != null) {
            c4324h.m18128a();
        }
        this.f1191e.setVisibility(0);
        if (this.f1204r == 0 && (this.f1211y || z10)) {
            this.f1191e.setTranslationY(0.0f);
            float f10 = -this.f1191e.getHeight();
            if (z10) {
                this.f1191e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f1191e.setTranslationY(f10);
            C4324h c4324h2 = new C4324h();
            C0589j1 m2492k = AbstractC0616q0.m2615d(this.f1191e).m2492k(0.0f);
            m2492k.m2490i(this.f1186C);
            c4324h2.m18130c(m2492k);
            if (this.f1205s && (view2 = this.f1194h) != null) {
                view2.setTranslationY(f10);
                c4324h2.m18130c(AbstractC0616q0.m2615d(this.f1194h).m2492k(0.0f));
            }
            c4324h2.m18133f(f1183E);
            c4324h2.m18132e(250L);
            c4324h2.m18134g(this.f1185B);
            this.f1210x = c4324h2;
            c4324h2.m18135h();
        } else {
            this.f1191e.setAlpha(1.0f);
            this.f1191e.setTranslationY(0.0f);
            if (this.f1205s && (view = this.f1194h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1185B.mo1160b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1190d;
        if (actionBarOverlayLayout != null) {
            AbstractC0616q0.m2630k0(actionBarOverlayLayout);
        }
    }

    public C0318s(Dialog dialog) {
        m1221D(dialog.getWindow().getDecorView());
    }
}
