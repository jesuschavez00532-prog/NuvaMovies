package p138g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0327g;
import androidx.appcompat.widget.AbstractC0421m1;
import androidx.appcompat.widget.C0438q2;
import androidx.core.view.AbstractC0555b;
import androidx.core.view.AbstractC0556b0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p150h.MenuItemC4456c;
import p305r.InterfaceMenuC6490a;

/* renamed from: g.g */
/* loaded from: classes.dex */
public class C4323g extends MenuInflater {

    /* renamed from: e */
    static final Class[] f18789e;

    /* renamed from: f */
    static final Class[] f18790f;

    /* renamed from: a */
    final Object[] f18791a;

    /* renamed from: b */
    final Object[] f18792b;

    /* renamed from: c */
    Context f18793c;

    /* renamed from: d */
    private Object f18794d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g.g$a */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class[] f18795c = {MenuItem.class};

        /* renamed from: a */
        private Object f18796a;

        /* renamed from: b */
        private Method f18797b;

        public a(Object obj, String str) {
            this.f18796a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f18797b = cls.getMethod(str, f18795c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f18797b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f18797b.invoke(this.f18796a, menuItem)).booleanValue();
                }
                this.f18797b.invoke(this.f18796a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g.g$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: A */
        AbstractC0555b f18798A;

        /* renamed from: B */
        private CharSequence f18799B;

        /* renamed from: C */
        private CharSequence f18800C;

        /* renamed from: D */
        private ColorStateList f18801D = null;

        /* renamed from: E */
        private PorterDuff.Mode f18802E = null;

        /* renamed from: a */
        private Menu f18804a;

        /* renamed from: b */
        private int f18805b;

        /* renamed from: c */
        private int f18806c;

        /* renamed from: d */
        private int f18807d;

        /* renamed from: e */
        private int f18808e;

        /* renamed from: f */
        private boolean f18809f;

        /* renamed from: g */
        private boolean f18810g;

        /* renamed from: h */
        private boolean f18811h;

        /* renamed from: i */
        private int f18812i;

        /* renamed from: j */
        private int f18813j;

        /* renamed from: k */
        private CharSequence f18814k;

        /* renamed from: l */
        private CharSequence f18815l;

        /* renamed from: m */
        private int f18816m;

        /* renamed from: n */
        private char f18817n;

        /* renamed from: o */
        private int f18818o;

        /* renamed from: p */
        private char f18819p;

        /* renamed from: q */
        private int f18820q;

        /* renamed from: r */
        private int f18821r;

        /* renamed from: s */
        private boolean f18822s;

        /* renamed from: t */
        private boolean f18823t;

        /* renamed from: u */
        private boolean f18824u;

        /* renamed from: v */
        private int f18825v;

        /* renamed from: w */
        private int f18826w;

        /* renamed from: x */
        private String f18827x;

        /* renamed from: y */
        private String f18828y;

        /* renamed from: z */
        private String f18829z;

        public b(Menu menu) {
            this.f18804a = menu;
            m18127h();
        }

        /* renamed from: c */
        private char m18119c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private Object m18120e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C4323g.this.f18793c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        /* renamed from: i */
        private void m18121i(MenuItem menuItem) {
            boolean z10;
            MenuItem enabled = menuItem.setChecked(this.f18822s).setVisible(this.f18823t).setEnabled(this.f18824u);
            boolean z11 = false;
            if (this.f18821r >= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            enabled.setCheckable(z10).setTitleCondensed(this.f18815l).setIcon(this.f18816m);
            int i10 = this.f18825v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f18829z != null) {
                if (!C4323g.this.f18793c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(C4323g.this.m18118b(), this.f18829z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f18821r >= 2) {
                if (menuItem instanceof C0327g) {
                    ((C0327g) menuItem).m1401t(true);
                } else if (menuItem instanceof MenuItemC4456c) {
                    ((MenuItemC4456c) menuItem).m18656h(true);
                }
            }
            String str = this.f18827x;
            if (str != null) {
                menuItem.setActionView((View) m18120e(str, C4323g.f18789e, C4323g.this.f18791a));
                z11 = true;
            }
            int i11 = this.f18826w;
            if (i11 > 0) {
                if (!z11) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC0555b abstractC0555b = this.f18798A;
            if (abstractC0555b != null) {
                AbstractC0556b0.m2403a(menuItem, abstractC0555b);
            }
            AbstractC0556b0.m2405c(menuItem, this.f18799B);
            AbstractC0556b0.m2409g(menuItem, this.f18800C);
            AbstractC0556b0.m2404b(menuItem, this.f18817n, this.f18818o);
            AbstractC0556b0.m2408f(menuItem, this.f18819p, this.f18820q);
            PorterDuff.Mode mode = this.f18802E;
            if (mode != null) {
                AbstractC0556b0.m2407e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f18801D;
            if (colorStateList != null) {
                AbstractC0556b0.m2406d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m18122a() {
            this.f18811h = true;
            m18121i(this.f18804a.add(this.f18805b, this.f18812i, this.f18813j, this.f18814k));
        }

        /* renamed from: b */
        public SubMenu m18123b() {
            this.f18811h = true;
            SubMenu addSubMenu = this.f18804a.addSubMenu(this.f18805b, this.f18812i, this.f18813j, this.f18814k);
            m18121i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m18124d() {
            return this.f18811h;
        }

        /* renamed from: f */
        public void m18125f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C4323g.this.f18793c.obtainStyledAttributes(attributeSet, R$styleable.f888C);
            this.f18805b = obtainStyledAttributes.getResourceId(R$styleable.MenuGroup_android_id, 0);
            this.f18806c = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_menuCategory, 0);
            this.f18807d = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_orderInCategory, 0);
            this.f18808e = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_checkableBehavior, 0);
            this.f18809f = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_visible, true);
            this.f18810g = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m18126g(AttributeSet attributeSet) {
            boolean z10;
            C0438q2 m1873u = C0438q2.m1873u(C4323g.this.f18793c, attributeSet, R$styleable.f889D);
            this.f18812i = m1873u.m1888n(R$styleable.MenuItem_android_id, 0);
            this.f18813j = (m1873u.m1885k(R$styleable.MenuItem_android_menuCategory, this.f18806c) & (-65536)) | (m1873u.m1885k(R$styleable.MenuItem_android_orderInCategory, this.f18807d) & 65535);
            this.f18814k = m1873u.m1890p(R$styleable.MenuItem_android_title);
            this.f18815l = m1873u.m1890p(R$styleable.MenuItem_android_titleCondensed);
            this.f18816m = m1873u.m1888n(R$styleable.MenuItem_android_icon, 0);
            this.f18817n = m18119c(m1873u.m1889o(R$styleable.MenuItem_android_alphabeticShortcut));
            this.f18818o = m1873u.m1885k(R$styleable.MenuItem_alphabeticModifiers, 4096);
            this.f18819p = m18119c(m1873u.m1889o(R$styleable.MenuItem_android_numericShortcut));
            this.f18820q = m1873u.m1885k(R$styleable.MenuItem_numericModifiers, 4096);
            int i10 = R$styleable.MenuItem_android_checkable;
            if (m1873u.m1893s(i10)) {
                this.f18821r = m1873u.m1875a(i10, false) ? 1 : 0;
            } else {
                this.f18821r = this.f18808e;
            }
            this.f18822s = m1873u.m1875a(R$styleable.MenuItem_android_checked, false);
            this.f18823t = m1873u.m1875a(R$styleable.MenuItem_android_visible, this.f18809f);
            this.f18824u = m1873u.m1875a(R$styleable.MenuItem_android_enabled, this.f18810g);
            this.f18825v = m1873u.m1885k(R$styleable.MenuItem_showAsAction, -1);
            this.f18829z = m1873u.m1889o(R$styleable.MenuItem_android_onClick);
            this.f18826w = m1873u.m1888n(R$styleable.MenuItem_actionLayout, 0);
            this.f18827x = m1873u.m1889o(R$styleable.MenuItem_actionViewClass);
            String m1889o = m1873u.m1889o(R$styleable.MenuItem_actionProviderClass);
            this.f18828y = m1889o;
            if (m1889o != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f18826w == 0 && this.f18827x == null) {
                this.f18798A = (AbstractC0555b) m18120e(m1889o, C4323g.f18790f, C4323g.this.f18792b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f18798A = null;
            }
            this.f18799B = m1873u.m1890p(R$styleable.MenuItem_contentDescription);
            this.f18800C = m1873u.m1890p(R$styleable.MenuItem_tooltipText);
            int i11 = R$styleable.MenuItem_iconTintMode;
            if (m1873u.m1893s(i11)) {
                this.f18802E = AbstractC0421m1.m1831d(m1873u.m1885k(i11, -1), this.f18802E);
            } else {
                this.f18802E = null;
            }
            int i12 = R$styleable.MenuItem_iconTint;
            if (m1873u.m1893s(i12)) {
                this.f18801D = m1873u.m1877c(i12);
            } else {
                this.f18801D = null;
            }
            m1873u.m1894w();
            this.f18811h = false;
        }

        /* renamed from: h */
        public void m18127h() {
            this.f18805b = 0;
            this.f18806c = 0;
            this.f18807d = 0;
            this.f18808e = 0;
            this.f18809f = true;
            this.f18810g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f18789e = clsArr;
        f18790f = clsArr;
    }

    public C4323g(Context context) {
        super(context);
        this.f18793c = context;
        Object[] objArr = {context};
        this.f18791a = objArr;
        this.f18792b = objArr;
    }

    /* renamed from: a */
    private Object m18116a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return m18116a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.m18127h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.m18124d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.f18798A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.mo2394a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.m18123b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.m18122a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.m18125f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.m18126g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        m18117c(r13, r14, r0.m18123b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m18117c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            g.g$b r0 = new g.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r5
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r5
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m18127h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m18124d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.f18798A
            if (r15 == 0) goto L82
            boolean r15 = r15.mo2394a()
            if (r15 == 0) goto L82
            r0.m18123b()
            goto Lb9
        L82:
            r0.m18122a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m18125f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m18126g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m18123b()
            r12.m18117c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p138g.C4323g.m18117c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: b */
    Object m18118b() {
        if (this.f18794d == null) {
            this.f18794d = m18116a(this.f18793c);
        }
        return this.f18794d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC6490a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f18793c.getResources().getLayout(i10);
                    m18117c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
