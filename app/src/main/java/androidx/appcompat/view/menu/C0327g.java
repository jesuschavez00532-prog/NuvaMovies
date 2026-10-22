package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.R$string;
import androidx.appcompat.view.menu.InterfaceC0331k;
import androidx.core.view.AbstractC0555b;
import p106e.AbstractC4105b;
import p290q.AbstractC6306k;
import p305r.InterfaceMenuItemC6491b;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public final class C0327g implements InterfaceMenuItemC6491b {

    /* renamed from: A */
    private View f1358A;

    /* renamed from: B */
    private AbstractC0555b f1359B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1360C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1362E;

    /* renamed from: a */
    private final int f1363a;

    /* renamed from: b */
    private final int f1364b;

    /* renamed from: c */
    private final int f1365c;

    /* renamed from: d */
    private final int f1366d;

    /* renamed from: e */
    private CharSequence f1367e;

    /* renamed from: f */
    private CharSequence f1368f;

    /* renamed from: g */
    private Intent f1369g;

    /* renamed from: h */
    private char f1370h;

    /* renamed from: j */
    private char f1372j;

    /* renamed from: l */
    private Drawable f1374l;

    /* renamed from: n */
    C0325e f1376n;

    /* renamed from: o */
    private SubMenuC0333m f1377o;

    /* renamed from: p */
    private Runnable f1378p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1379q;

    /* renamed from: r */
    private CharSequence f1380r;

    /* renamed from: s */
    private CharSequence f1381s;

    /* renamed from: z */
    private int f1388z;

    /* renamed from: i */
    private int f1371i = 4096;

    /* renamed from: k */
    private int f1373k = 4096;

    /* renamed from: m */
    private int f1375m = 0;

    /* renamed from: t */
    private ColorStateList f1382t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1383u = null;

    /* renamed from: v */
    private boolean f1384v = false;

    /* renamed from: w */
    private boolean f1385w = false;

    /* renamed from: x */
    private boolean f1386x = false;

    /* renamed from: y */
    private int f1387y = 16;

    /* renamed from: D */
    private boolean f1361D = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes.dex */
    class a implements AbstractC0555b.b {
        a() {
        }

        @Override // androidx.core.view.AbstractC0555b.b
        public void onActionProviderVisibilityChanged(boolean z10) {
            C0327g c0327g = C0327g.this;
            c0327g.f1376n.m1338J(c0327g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0327g(C0325e c0325e, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1376n = c0325e;
        this.f1363a = i11;
        this.f1364b = i10;
        this.f1365c = i12;
        this.f1366d = i13;
        this.f1367e = charSequence;
        this.f1388z = i14;
    }

    /* renamed from: d */
    private static void m1380d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m1381e(Drawable drawable) {
        if (drawable != null && this.f1386x && (this.f1384v || this.f1385w)) {
            drawable = AbstractC6306k.m25072r(drawable).mutate();
            if (this.f1384v) {
                AbstractC6306k.m25069o(drawable, this.f1382t);
            }
            if (this.f1385w) {
                AbstractC6306k.m25070p(drawable, this.f1383u);
            }
            this.f1386x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m1382A() {
        if (this.f1376n.mo1336H() && m1388g() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean m1383B() {
        if ((this.f1388z & 4) == 4) {
            return true;
        }
        return false;
    }

    @Override // p305r.InterfaceMenuItemC6491b
    /* renamed from: a */
    public InterfaceMenuItemC6491b mo1384a(AbstractC0555b abstractC0555b) {
        AbstractC0555b abstractC0555b2 = this.f1359B;
        if (abstractC0555b2 != null) {
            abstractC0555b2.m2400g();
        }
        this.f1358A = null;
        this.f1359B = abstractC0555b;
        this.f1376n.m1339K(true);
        AbstractC0555b abstractC0555b3 = this.f1359B;
        if (abstractC0555b3 != null) {
            abstractC0555b3.mo2402i(new a());
        }
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b
    /* renamed from: b */
    public AbstractC0555b mo1385b() {
        return this.f1359B;
    }

    /* renamed from: c */
    public void m1386c() {
        this.f1376n.m1337I(this);
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1388z & 8) == 0) {
            return false;
        }
        if (this.f1358A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1360C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f1376n.mo1361f(this);
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m1391j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1360C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f1376n.mo1363k(this);
    }

    /* renamed from: f */
    public int m1387f() {
        return this.f1366d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public char m1388g() {
        if (this.f1376n.mo1335G()) {
            return this.f1372j;
        }
        return this.f1370h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1358A;
        if (view != null) {
            return view;
        }
        AbstractC0555b abstractC0555b = this.f1359B;
        if (abstractC0555b != null) {
            View mo2396c = abstractC0555b.mo2396c(this);
            this.f1358A = mo2396c;
            return mo2396c;
        }
        return null;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1373k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1372j;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1380r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1364b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1374l;
        if (drawable != null) {
            return m1381e(drawable);
        }
        if (this.f1375m != 0) {
            Drawable m17170d = AbstractC4105b.m17170d(this.f1376n.m1372u(), this.f1375m);
            this.f1375m = 0;
            this.f1374l = m17170d;
            return m1381e(m17170d);
        }
        return null;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1382t;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1383u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1369g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1363a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1362E;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1371i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1370h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1365c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1377o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1367e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1368f;
        if (charSequence == null) {
            return this.f1367e;
        }
        return charSequence;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1381s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public String m1389h() {
        int i10;
        char m1388g = m1388g();
        if (m1388g == 0) {
            return "";
        }
        Resources resources = this.f1376n.m1372u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1376n.m1372u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(R$string.abc_prepend_shortcut_label));
        }
        if (this.f1376n.mo1335G()) {
            i10 = this.f1373k;
        } else {
            i10 = this.f1371i;
        }
        m1380d(sb2, i10, 65536, resources.getString(R$string.abc_menu_meta_shortcut_label));
        m1380d(sb2, i10, 4096, resources.getString(R$string.abc_menu_ctrl_shortcut_label));
        m1380d(sb2, i10, 2, resources.getString(R$string.abc_menu_alt_shortcut_label));
        m1380d(sb2, i10, 1, resources.getString(R$string.abc_menu_shift_shortcut_label));
        m1380d(sb2, i10, 4, resources.getString(R$string.abc_menu_sym_shortcut_label));
        m1380d(sb2, i10, 8, resources.getString(R$string.abc_menu_function_shortcut_label));
        if (m1388g != '\b') {
            if (m1388g != '\n') {
                if (m1388g != ' ') {
                    sb2.append(m1388g);
                } else {
                    sb2.append(resources.getString(R$string.abc_menu_space_shortcut_label));
                }
            } else {
                sb2.append(resources.getString(R$string.abc_menu_enter_shortcut_label));
            }
        } else {
            sb2.append(resources.getString(R$string.abc_menu_delete_shortcut_label));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        if (this.f1377o != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence m1390i(InterfaceC0331k.a aVar) {
        if (aVar != null && aVar.mo1263d()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1361D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.f1387y & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.f1387y & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.f1387y & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0555b abstractC0555b = this.f1359B;
        if (abstractC0555b != null && abstractC0555b.mo2399f()) {
            if ((this.f1387y & 8) == 0 && this.f1359B.mo2395b()) {
                return true;
            }
            return false;
        }
        if ((this.f1387y & 8) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m1391j() {
        AbstractC0555b abstractC0555b;
        if ((this.f1388z & 8) == 0) {
            return false;
        }
        if (this.f1358A == null && (abstractC0555b = this.f1359B) != null) {
            this.f1358A = abstractC0555b.mo2396c(this);
        }
        if (this.f1358A == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m1392k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1379q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0325e c0325e = this.f1376n;
        if (c0325e.mo1362h(c0325e, this)) {
            return true;
        }
        Runnable runnable = this.f1378p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1369g != null) {
            try {
                this.f1376n.m1372u().startActivity(this.f1369g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC0555b abstractC0555b = this.f1359B;
        if (abstractC0555b != null && abstractC0555b.mo2397d()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m1393l() {
        if ((this.f1387y & 32) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m1394m() {
        if ((this.f1387y & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1395n() {
        if ((this.f1388z & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1396o() {
        if ((this.f1388z & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6491b setActionView(int i10) {
        Context m1372u = this.f1376n.m1372u();
        setActionView(LayoutInflater.from(m1372u).inflate(i10, (ViewGroup) new LinearLayout(m1372u), false));
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6491b setActionView(View view) {
        int i10;
        this.f1358A = view;
        this.f1359B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1363a) > 0) {
            view.setId(i10);
        }
        this.f1376n.m1337I(this);
        return this;
    }

    /* renamed from: r */
    public void m1399r(boolean z10) {
        this.f1361D = z10;
        this.f1376n.m1339K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m1400s(boolean z10) {
        int i10;
        int i11 = this.f1387y;
        int i12 = i11 & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i13 = i10 | i12;
        this.f1387y = i13;
        if (i11 != i13) {
            this.f1376n.m1339K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1372j == c10) {
            return this;
        }
        this.f1372j = Character.toLowerCase(c10);
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1387y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1387y = i11;
        if (i10 != i11) {
            this.f1376n.m1339K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1387y & 4) != 0) {
            this.f1376n.m1347T(this);
        } else {
            m1400s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f1387y |= 16;
        } else {
            this.f1387y &= -17;
        }
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1375m = 0;
        this.f1374l = drawable;
        this.f1386x = true;
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1382t = colorStateList;
        this.f1384v = true;
        this.f1386x = true;
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1383u = mode;
        this.f1385w = true;
        this.f1386x = true;
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1369g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1370h == c10) {
            return this;
        }
        this.f1370h = c10;
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1360C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1379q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1370h = c10;
        this.f1372j = Character.toLowerCase(c11);
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1388z = i10;
        this.f1376n.m1337I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1367e = charSequence;
        this.f1376n.m1339K(false);
        SubMenuC0333m subMenuC0333m = this.f1377o;
        if (subMenuC0333m != null) {
            subMenuC0333m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1368f = charSequence;
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (m1406y(z10)) {
            this.f1376n.m1338J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m1401t(boolean z10) {
        int i10;
        int i11 = this.f1387y & (-5);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        this.f1387y = i10 | i11;
    }

    public String toString() {
        CharSequence charSequence = this.f1367e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m1402u(boolean z10) {
        if (z10) {
            this.f1387y |= 32;
        } else {
            this.f1387y &= -33;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m1403v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1362E = contextMenuInfo;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6491b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    /* renamed from: x */
    public void m1405x(SubMenuC0333m subMenuC0333m) {
        this.f1377o = subMenuC0333m;
        subMenuC0333m.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m1406y(boolean z10) {
        int i10;
        int i11 = this.f1387y;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f1387y = i13;
        if (i11 == i13) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public boolean m1407z() {
        return this.f1376n.m1330A();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC6491b setContentDescription(CharSequence charSequence) {
        this.f1380r = charSequence;
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC6491b setTooltipText(CharSequence charSequence) {
        this.f1381s = charSequence;
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1372j == c10 && this.f1373k == i10) {
            return this;
        }
        this.f1372j = Character.toLowerCase(c10);
        this.f1373k = KeyEvent.normalizeMetaState(i10);
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1370h == c10 && this.f1371i == i10) {
            return this;
        }
        this.f1370h = c10;
        this.f1371i = KeyEvent.normalizeMetaState(i10);
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1370h = c10;
        this.f1371i = KeyEvent.normalizeMetaState(i10);
        this.f1372j = Character.toLowerCase(c11);
        this.f1373k = KeyEvent.normalizeMetaState(i11);
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1374l = null;
        this.f1375m = i10;
        this.f1386x = true;
        this.f1376n.m1339K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1376n.m1372u().getString(i10));
    }
}
