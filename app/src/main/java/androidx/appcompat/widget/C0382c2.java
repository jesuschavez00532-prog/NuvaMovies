package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.resources.R$drawable;
import androidx.core.content.AbstractC0547a;
import androidx.vectordrawable.graphics.drawable.C0844f;
import androidx.vectordrawable.graphics.drawable.C0852n;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p121f.C4202c;
import p214l.C5308f;
import p214l.C5309g;
import p214l.C5311i;
import p214l.C5312j;
import p290q.AbstractC6306k;

/* renamed from: androidx.appcompat.widget.c2 */
/* loaded from: classes.dex */
public final class C0382c2 {

    /* renamed from: i */
    private static C0382c2 f1701i;

    /* renamed from: a */
    private WeakHashMap f1703a;

    /* renamed from: b */
    private C5311i f1704b;

    /* renamed from: c */
    private C5312j f1705c;

    /* renamed from: d */
    private final WeakHashMap f1706d = new WeakHashMap(0);

    /* renamed from: e */
    private TypedValue f1707e;

    /* renamed from: f */
    private boolean f1708f;

    /* renamed from: g */
    private f f1709g;

    /* renamed from: h */
    private static final PorterDuff.Mode f1700h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final c f1702j = new c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.c2$a */
    /* loaded from: classes.dex */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.C0382c2.e
        /* renamed from: a */
        public Drawable mo1657a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C4202c.m17513l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c2$b */
    /* loaded from: classes.dex */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.C0382c2.e
        /* renamed from: a */
        public Drawable mo1657a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0844f.m4320a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c2$c */
    /* loaded from: classes.dex */
    public static class c extends C5309g {
        public c(int i10) {
            super(i10);
        }

        /* renamed from: m */
        private static int m1658m(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* renamed from: n */
        PorterDuffColorFilter m1659n(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) m21407d(Integer.valueOf(m1658m(i10, mode)));
        }

        /* renamed from: o */
        PorterDuffColorFilter m1660o(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) m21409f(Integer.valueOf(m1658m(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.c2$d */
    /* loaded from: classes.dex */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.C0382c2.e
        /* renamed from: a */
        public Drawable mo1657a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c2$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        Drawable mo1657a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.c2$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        boolean mo1661a(Context context, int i10, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo1662b(int i10);

        /* renamed from: c */
        Drawable mo1663c(C0382c2 c0382c2, Context context, int i10);

        /* renamed from: d */
        ColorStateList mo1664d(Context context, int i10);

        /* renamed from: e */
        boolean mo1665e(Context context, int i10, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c2$g */
    /* loaded from: classes.dex */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.C0382c2.e
        /* renamed from: a */
        public Drawable mo1657a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0852n.m4355c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m1633a(String str, e eVar) {
        if (this.f1704b == null) {
            this.f1704b = new C5311i();
        }
        this.f1704b.put(str, eVar);
    }

    /* renamed from: b */
    private synchronized boolean m1634b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C5308f c5308f = (C5308f) this.f1706d.get(context);
            if (c5308f == null) {
                c5308f = new C5308f();
                this.f1706d.put(context, c5308f);
            }
            c5308f.m21399l(j10, new WeakReference(constantState));
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m1635c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1703a == null) {
            this.f1703a = new WeakHashMap();
        }
        C5312j c5312j = (C5312j) this.f1703a.get(context);
        if (c5312j == null) {
            c5312j = new C5312j();
            this.f1703a.put(context, c5312j);
        }
        c5312j.m21437a(i10, colorStateList);
    }

    /* renamed from: d */
    private void m1636d(Context context) {
        if (this.f1708f) {
            return;
        }
        this.f1708f = true;
        Drawable m1649j = m1649j(context, R$drawable.abc_vector_test);
        if (m1649j != null && m1645q(m1649j)) {
            return;
        }
        this.f1708f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    /* renamed from: e */
    private static long m1637e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    private Drawable m1638f(Context context, int i10) {
        Drawable mo1663c;
        if (this.f1707e == null) {
            this.f1707e = new TypedValue();
        }
        TypedValue typedValue = this.f1707e;
        context.getResources().getValue(i10, typedValue, true);
        long m1637e = m1637e(typedValue);
        Drawable m1641i = m1641i(context, m1637e);
        if (m1641i != null) {
            return m1641i;
        }
        f fVar = this.f1709g;
        if (fVar == null) {
            mo1663c = null;
        } else {
            mo1663c = fVar.mo1663c(this, context, i10);
        }
        if (mo1663c != null) {
            mo1663c.setChangingConfigurations(typedValue.changingConfigurations);
            m1634b(context, m1637e, mo1663c);
        }
        return mo1663c;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m1639g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList != null && mode != null) {
            return m1642l(colorStateList.getColorForState(iArr, 0), mode);
        }
        return null;
    }

    /* renamed from: h */
    public static synchronized C0382c2 m1640h() {
        C0382c2 c0382c2;
        synchronized (C0382c2.class) {
            if (f1701i == null) {
                C0382c2 c0382c22 = new C0382c2();
                f1701i = c0382c22;
                m1644p(c0382c22);
            }
            c0382c2 = f1701i;
        }
        return c0382c2;
    }

    /* renamed from: i */
    private synchronized Drawable m1641i(Context context, long j10) {
        C5308f c5308f = (C5308f) this.f1706d.get(context);
        if (c5308f == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c5308f.m21394g(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c5308f.m21400m(j10);
        }
        return null;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m1642l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1659n;
        synchronized (C0382c2.class) {
            c cVar = f1702j;
            m1659n = cVar.m1659n(i10, mode);
            if (m1659n == null) {
                m1659n = new PorterDuffColorFilter(i10, mode);
                cVar.m1660o(i10, mode, m1659n);
            }
        }
        return m1659n;
    }

    /* renamed from: n */
    private ColorStateList m1643n(Context context, int i10) {
        C5312j c5312j;
        WeakHashMap weakHashMap = this.f1703a;
        if (weakHashMap == null || (c5312j = (C5312j) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) c5312j.m21440f(i10);
    }

    /* renamed from: p */
    private static void m1644p(C0382c2 c0382c2) {
        if (Build.VERSION.SDK_INT < 24) {
            c0382c2.m1633a("vector", new g());
            c0382c2.m1633a("animated-vector", new b());
            c0382c2.m1633a("animated-selector", new a());
            c0382c2.m1633a("drawable", new d());
        }
    }

    /* renamed from: q */
    private static boolean m1645q(Drawable drawable) {
        if (!(drawable instanceof C0852n) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private Drawable m1646r(Context context, int i10) {
        int next;
        C5311i c5311i = this.f1704b;
        if (c5311i == null || c5311i.isEmpty()) {
            return null;
        }
        C5312j c5312j = this.f1705c;
        if (c5312j != null) {
            String str = (String) c5312j.m21440f(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f1704b.get(str) == null)) {
                return null;
            }
        } else {
            this.f1705c = new C5312j();
        }
        if (this.f1707e == null) {
            this.f1707e = new TypedValue();
        }
        TypedValue typedValue = this.f1707e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long m1637e = m1637e(typedValue);
        Drawable m1641i = m1641i(context, m1637e);
        if (m1641i != null) {
            return m1641i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f1705c.m21437a(i10, name);
                    e eVar = (e) this.f1704b.get(name);
                    if (eVar != null) {
                        m1641i = eVar.mo1657a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (m1641i != null) {
                        m1641i.setChangingConfigurations(typedValue.changingConfigurations);
                        m1634b(context, m1637e, m1641i);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (m1641i == null) {
            this.f1705c.m21437a(i10, "appcompat_skip_skip");
        }
        return m1641i;
    }

    /* renamed from: v */
    private Drawable m1647v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m1651m = m1651m(context, i10);
        if (m1651m != null) {
            if (AbstractC0421m1.m1828a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m25072r = AbstractC6306k.m25072r(drawable);
            AbstractC6306k.m25069o(m25072r, m1651m);
            PorterDuff.Mode m1652o = m1652o(i10);
            if (m1652o != null) {
                AbstractC6306k.m25070p(m25072r, m1652o);
                return m25072r;
            }
            return m25072r;
        }
        f fVar = this.f1709g;
        if ((fVar == null || !fVar.mo1665e(context, i10, drawable)) && !m1656x(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m1648w(Drawable drawable, C0430o2 c0430o2, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        if (AbstractC0421m1.m1828a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = c0430o2.f1843d;
        if (!z10 && !c0430o2.f1842c) {
            drawable.clearColorFilter();
        } else {
            if (z10) {
                colorStateList = c0430o2.f1840a;
            } else {
                colorStateList = null;
            }
            if (c0430o2.f1842c) {
                mode = c0430o2.f1841b;
            } else {
                mode = f1700h;
            }
            drawable.setColorFilter(m1639g(colorStateList, mode, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable m1649j(Context context, int i10) {
        return m1650k(context, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable m1650k(Context context, int i10, boolean z10) {
        Drawable m1646r;
        m1636d(context);
        m1646r = m1646r(context, i10);
        if (m1646r == null) {
            m1646r = m1638f(context, i10);
        }
        if (m1646r == null) {
            m1646r = AbstractC0547a.m2324f(context, i10);
        }
        if (m1646r != null) {
            m1646r = m1647v(context, i10, z10, m1646r);
        }
        if (m1646r != null) {
            AbstractC0421m1.m1829b(m1646r);
        }
        return m1646r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList m1651m(Context context, int i10) {
        ColorStateList m1643n;
        m1643n = m1643n(context, i10);
        if (m1643n == null) {
            f fVar = this.f1709g;
            if (fVar == null) {
                m1643n = null;
            } else {
                m1643n = fVar.mo1664d(context, i10);
            }
            if (m1643n != null) {
                m1635c(context, i10, m1643n);
            }
        }
        return m1643n;
    }

    /* renamed from: o */
    PorterDuff.Mode m1652o(int i10) {
        f fVar = this.f1709g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo1662b(i10);
    }

    /* renamed from: s */
    public synchronized void m1653s(Context context) {
        C5308f c5308f = (C5308f) this.f1706d.get(context);
        if (c5308f != null) {
            c5308f.m21391b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable m1654t(Context context, C0462w2 c0462w2, int i10) {
        Drawable m1646r = m1646r(context, i10);
        if (m1646r == null) {
            m1646r = c0462w2.m2023c(i10);
        }
        if (m1646r != null) {
            return m1647v(context, i10, false, m1646r);
        }
        return null;
    }

    /* renamed from: u */
    public synchronized void m1655u(f fVar) {
        this.f1709g = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m1656x(Context context, int i10, Drawable drawable) {
        f fVar = this.f1709g;
        if (fVar != null && fVar.mo1661a(context, i10, drawable)) {
            return true;
        }
        return false;
    }
}
