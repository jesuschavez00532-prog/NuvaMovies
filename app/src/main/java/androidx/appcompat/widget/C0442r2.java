package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$drawable;
import androidx.appcompat.R$id;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0325e;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.core.view.AbstractC0597l1;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0589j1;
import p106e.AbstractC4105b;
import p150h.C4454a;

/* renamed from: androidx.appcompat.widget.r2 */
/* loaded from: classes.dex */
public class C0442r2 implements InterfaceC0417l1 {

    /* renamed from: a */
    Toolbar f1881a;

    /* renamed from: b */
    private int f1882b;

    /* renamed from: c */
    private View f1883c;

    /* renamed from: d */
    private View f1884d;

    /* renamed from: e */
    private Drawable f1885e;

    /* renamed from: f */
    private Drawable f1886f;

    /* renamed from: g */
    private Drawable f1887g;

    /* renamed from: h */
    private boolean f1888h;

    /* renamed from: i */
    CharSequence f1889i;

    /* renamed from: j */
    private CharSequence f1890j;

    /* renamed from: k */
    private CharSequence f1891k;

    /* renamed from: l */
    Window.Callback f1892l;

    /* renamed from: m */
    boolean f1893m;

    /* renamed from: n */
    private C0387e f1894n;

    /* renamed from: o */
    private int f1895o;

    /* renamed from: p */
    private int f1896p;

    /* renamed from: q */
    private Drawable f1897q;

    /* renamed from: androidx.appcompat.widget.r2$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a */
        final C4454a f1898a;

        a() {
            this.f1898a = new C4454a(C0442r2.this.f1881a.getContext(), 0, R.id.home, 0, 0, C0442r2.this.f1889i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0442r2 c0442r2 = C0442r2.this;
            Window.Callback callback = c0442r2.f1892l;
            if (callback != null && c0442r2.f1893m) {
                callback.onMenuItemSelected(0, this.f1898a);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.r2$b */
    /* loaded from: classes.dex */
    class b extends AbstractC0597l1 {

        /* renamed from: a */
        private boolean f1900a = false;

        /* renamed from: b */
        final /* synthetic */ int f1901b;

        b(int i10) {
            this.f1901b = i10;
        }

        @Override // androidx.core.view.AbstractC0597l1, androidx.core.view.InterfaceC0593k1
        /* renamed from: a */
        public void mo1593a(View view) {
            this.f1900a = true;
        }

        @Override // androidx.core.view.InterfaceC0593k1
        /* renamed from: b */
        public void mo1160b(View view) {
            if (!this.f1900a) {
                C0442r2.this.f1881a.setVisibility(this.f1901b);
            }
        }

        @Override // androidx.core.view.AbstractC0597l1, androidx.core.view.InterfaceC0593k1
        /* renamed from: c */
        public void mo1161c(View view) {
            C0442r2.this.f1881a.setVisibility(0);
        }
    }

    public C0442r2(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, R$string.abc_action_bar_up_description, R$drawable.abc_ic_ab_back_material);
    }

    /* renamed from: F */
    private void m1903F(CharSequence charSequence) {
        this.f1889i = charSequence;
        if ((this.f1882b & 8) != 0) {
            this.f1881a.setTitle(charSequence);
        }
    }

    /* renamed from: G */
    private void m1904G() {
        if ((this.f1882b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1891k)) {
                this.f1881a.setNavigationContentDescription(this.f1896p);
            } else {
                this.f1881a.setNavigationContentDescription(this.f1891k);
            }
        }
    }

    /* renamed from: H */
    private void m1905H() {
        if ((this.f1882b & 4) != 0) {
            Toolbar toolbar = this.f1881a;
            Drawable drawable = this.f1887g;
            if (drawable == null) {
                drawable = this.f1897q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1881a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: I */
    private void m1906I() {
        Drawable drawable;
        int i10 = this.f1882b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f1886f;
                if (drawable == null) {
                    drawable = this.f1885e;
                }
            } else {
                drawable = this.f1885e;
            }
        } else {
            drawable = null;
        }
        this.f1881a.setLogo(drawable);
    }

    /* renamed from: w */
    private int m1907w() {
        if (this.f1881a.getNavigationIcon() != null) {
            this.f1897q = this.f1881a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    /* renamed from: A */
    public void m1908A(int i10) {
        String string;
        if (i10 == 0) {
            string = null;
        } else {
            string = mo1785e().getString(i10);
        }
        m1909B(string);
    }

    /* renamed from: B */
    public void m1909B(CharSequence charSequence) {
        this.f1891k = charSequence;
        m1904G();
    }

    /* renamed from: C */
    public void m1910C(Drawable drawable) {
        this.f1887g = drawable;
        m1905H();
    }

    /* renamed from: D */
    public void m1911D(CharSequence charSequence) {
        this.f1890j = charSequence;
        if ((this.f1882b & 8) != 0) {
            this.f1881a.setSubtitle(charSequence);
        }
    }

    /* renamed from: E */
    public void m1912E(CharSequence charSequence) {
        this.f1888h = true;
        m1903F(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: a */
    public void mo1781a(Menu menu, InterfaceC0330j.a aVar) {
        if (this.f1894n == null) {
            C0387e c0387e = new C0387e(this.f1881a.getContext());
            this.f1894n = c0387e;
            c0387e.m1291p(R$id.action_menu_presenter);
        }
        this.f1894n.mo1281f(aVar);
        this.f1881a.m1567I((C0325e) menu, this.f1894n);
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: b */
    public boolean mo1782b() {
        return this.f1881a.m1564A();
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: c */
    public void mo1783c() {
        this.f1893m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    public void collapseActionView() {
        this.f1881a.m1573e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: d */
    public boolean mo1784d() {
        return this.f1881a.m1572d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: e */
    public Context mo1785e() {
        return this.f1881a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: f */
    public boolean mo1786f() {
        return this.f1881a.m1582z();
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: g */
    public boolean mo1787g() {
        return this.f1881a.m1580w();
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    public CharSequence getTitle() {
        return this.f1881a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: h */
    public boolean mo1788h() {
        return this.f1881a.m1570N();
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: i */
    public void mo1789i() {
        this.f1881a.m1574f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: j */
    public void mo1790j(AbstractC0406i2 abstractC0406i2) {
        View view = this.f1883c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1881a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1883c);
            }
        }
        this.f1883c = abstractC0406i2;
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: k */
    public boolean mo1791k() {
        return this.f1881a.m1579v();
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: l */
    public void mo1792l(int i10) {
        View view;
        int i11 = this.f1882b ^ i10;
        this.f1882b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    m1904G();
                }
                m1905H();
            }
            if ((i11 & 3) != 0) {
                m1906I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1881a.setTitle(this.f1889i);
                    this.f1881a.setSubtitle(this.f1890j);
                } else {
                    this.f1881a.setTitle((CharSequence) null);
                    this.f1881a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f1884d) != null) {
                if ((i10 & 16) != 0) {
                    this.f1881a.addView(view);
                } else {
                    this.f1881a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: m */
    public void mo1793m(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = AbstractC4105b.m17170d(mo1785e(), i10);
        } else {
            drawable = null;
        }
        m1915z(drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: n */
    public int mo1794n() {
        return this.f1895o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: o */
    public C0589j1 mo1795o(int i10, long j10) {
        float f10;
        C0589j1 m2615d = AbstractC0616q0.m2615d(this.f1881a);
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return m2615d.m2483a(f10).m2486d(j10).m2488f(new b(i10));
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: p */
    public void mo1796p(int i10) {
        this.f1881a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: q */
    public ViewGroup mo1797q() {
        return this.f1881a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: r */
    public void mo1798r(boolean z10) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: s */
    public int mo1799s() {
        return this.f1882b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? AbstractC4105b.m17170d(mo1785e(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    public void setWindowCallback(Window.Callback callback) {
        this.f1892l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1888h) {
            m1903F(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: t */
    public void mo1800t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: u */
    public void mo1801u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    /* renamed from: v */
    public void mo1802v(boolean z10) {
        this.f1881a.setCollapsible(z10);
    }

    /* renamed from: x */
    public void m1913x(View view) {
        View view2 = this.f1884d;
        if (view2 != null && (this.f1882b & 16) != 0) {
            this.f1881a.removeView(view2);
        }
        this.f1884d = view;
        if (view != null && (this.f1882b & 16) != 0) {
            this.f1881a.addView(view);
        }
    }

    /* renamed from: y */
    public void m1914y(int i10) {
        if (i10 == this.f1896p) {
            return;
        }
        this.f1896p = i10;
        if (TextUtils.isEmpty(this.f1881a.getNavigationContentDescription())) {
            m1908A(this.f1896p);
        }
    }

    /* renamed from: z */
    public void m1915z(Drawable drawable) {
        this.f1886f = drawable;
        m1906I();
    }

    public C0442r2(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1895o = 0;
        this.f1896p = 0;
        this.f1881a = toolbar;
        this.f1889i = toolbar.getTitle();
        this.f1890j = toolbar.getSubtitle();
        this.f1888h = this.f1889i != null;
        this.f1887g = toolbar.getNavigationIcon();
        C0438q2 m1874v = C0438q2.m1874v(toolbar.getContext(), null, R$styleable.f904a, R$attr.actionBarStyle, 0);
        this.f1897q = m1874v.m1881g(R$styleable.ActionBar_homeAsUpIndicator);
        if (z10) {
            CharSequence m1890p = m1874v.m1890p(R$styleable.ActionBar_title);
            if (!TextUtils.isEmpty(m1890p)) {
                m1912E(m1890p);
            }
            CharSequence m1890p2 = m1874v.m1890p(R$styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m1890p2)) {
                m1911D(m1890p2);
            }
            Drawable m1881g = m1874v.m1881g(R$styleable.ActionBar_logo);
            if (m1881g != null) {
                m1915z(m1881g);
            }
            Drawable m1881g2 = m1874v.m1881g(R$styleable.ActionBar_icon);
            if (m1881g2 != null) {
                setIcon(m1881g2);
            }
            if (this.f1887g == null && (drawable = this.f1897q) != null) {
                m1910C(drawable);
            }
            mo1792l(m1874v.m1885k(R$styleable.ActionBar_displayOptions, 0));
            int m1888n = m1874v.m1888n(R$styleable.ActionBar_customNavigationLayout, 0);
            if (m1888n != 0) {
                m1913x(LayoutInflater.from(this.f1881a.getContext()).inflate(m1888n, (ViewGroup) this.f1881a, false));
                mo1792l(this.f1882b | 16);
            }
            int m1887m = m1874v.m1887m(R$styleable.ActionBar_height, 0);
            if (m1887m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1881a.getLayoutParams();
                layoutParams.height = m1887m;
                this.f1881a.setLayoutParams(layoutParams);
            }
            int m1879e = m1874v.m1879e(R$styleable.ActionBar_contentInsetStart, -1);
            int m1879e2 = m1874v.m1879e(R$styleable.ActionBar_contentInsetEnd, -1);
            if (m1879e >= 0 || m1879e2 >= 0) {
                this.f1881a.m1566H(Math.max(m1879e, 0), Math.max(m1879e2, 0));
            }
            int m1888n2 = m1874v.m1888n(R$styleable.ActionBar_titleTextStyle, 0);
            if (m1888n2 != 0) {
                Toolbar toolbar2 = this.f1881a;
                toolbar2.m1569K(toolbar2.getContext(), m1888n2);
            }
            int m1888n3 = m1874v.m1888n(R$styleable.ActionBar_subtitleTextStyle, 0);
            if (m1888n3 != 0) {
                Toolbar toolbar3 = this.f1881a;
                toolbar3.m1568J(toolbar3.getContext(), m1888n3);
            }
            int m1888n4 = m1874v.m1888n(R$styleable.ActionBar_popupTheme, 0);
            if (m1888n4 != 0) {
                this.f1881a.setPopupTheme(m1888n4);
            }
        } else {
            this.f1882b = m1907w();
        }
        m1874v.m1894w();
        m1914y(i10);
        this.f1891k = this.f1881a.getNavigationContentDescription();
        this.f1881a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.InterfaceC0417l1
    public void setIcon(Drawable drawable) {
        this.f1885e = drawable;
        m1906I();
    }
}
