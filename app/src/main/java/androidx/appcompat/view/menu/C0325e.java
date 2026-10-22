package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.AbstractC0547a;
import androidx.core.view.AbstractC0555b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p305r.InterfaceMenuC6490a;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C0325e implements InterfaceMenuC6490a {

    /* renamed from: A */
    private static final int[] f1327A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1328a;

    /* renamed from: b */
    private final Resources f1329b;

    /* renamed from: c */
    private boolean f1330c;

    /* renamed from: d */
    private boolean f1331d;

    /* renamed from: e */
    private a f1332e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1340m;

    /* renamed from: n */
    CharSequence f1341n;

    /* renamed from: o */
    Drawable f1342o;

    /* renamed from: p */
    View f1343p;

    /* renamed from: x */
    private C0327g f1351x;

    /* renamed from: z */
    private boolean f1353z;

    /* renamed from: l */
    private int f1339l = 0;

    /* renamed from: q */
    private boolean f1344q = false;

    /* renamed from: r */
    private boolean f1345r = false;

    /* renamed from: s */
    private boolean f1346s = false;

    /* renamed from: t */
    private boolean f1347t = false;

    /* renamed from: u */
    private boolean f1348u = false;

    /* renamed from: v */
    private ArrayList f1349v = new ArrayList();

    /* renamed from: w */
    private CopyOnWriteArrayList f1350w = new CopyOnWriteArrayList();

    /* renamed from: y */
    private boolean f1352y = false;

    /* renamed from: f */
    private ArrayList f1333f = new ArrayList();

    /* renamed from: g */
    private ArrayList f1334g = new ArrayList();

    /* renamed from: h */
    private boolean f1335h = true;

    /* renamed from: i */
    private ArrayList f1336i = new ArrayList();

    /* renamed from: j */
    private ArrayList f1337j = new ArrayList();

    /* renamed from: k */
    private boolean f1338k = true;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo1141a(C0325e c0325e, MenuItem menuItem);

        /* renamed from: b */
        void mo1143b(C0325e c0325e);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        boolean mo1269a(C0327g c0327g);
    }

    public C0325e(Context context) {
        this.f1328a = context;
        this.f1329b = context.getResources();
        m1325b0(true);
    }

    /* renamed from: B */
    private static int m1322B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f1327A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m1323N(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f1333f.size()) {
            this.f1333f.remove(i10);
            if (z10) {
                m1339K(true);
            }
        }
    }

    /* renamed from: W */
    private void m1324W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources m1331C = m1331C();
        if (view != null) {
            this.f1343p = view;
            this.f1341n = null;
            this.f1342o = null;
        } else {
            if (i10 > 0) {
                this.f1341n = m1331C.getText(i10);
            } else if (charSequence != null) {
                this.f1341n = charSequence;
            }
            if (i11 > 0) {
                this.f1342o = AbstractC0547a.m2324f(m1372u(), i11);
            } else if (drawable != null) {
                this.f1342o = drawable;
            }
            this.f1343p = null;
        }
        m1339K(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.AbstractC0640w0.m2831e(android.view.ViewConfiguration.get(r2.f1328a), r2.f1328a) != false) goto L9;
     */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1325b0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f1329b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f1328a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1328a
            boolean r3 = androidx.core.view.AbstractC0640w0.m2831e(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f1331d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0325e.m1325b0(boolean):void");
    }

    /* renamed from: g */
    private C0327g m1326g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new C0327g(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* renamed from: i */
    private void m1327i(boolean z10) {
        if (this.f1350w.isEmpty()) {
            return;
        }
        m1359d0();
        Iterator it = this.f1350w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0330j interfaceC0330j = (InterfaceC0330j) weakReference.get();
            if (interfaceC0330j == null) {
                this.f1350w.remove(weakReference);
            } else {
                interfaceC0330j.mo1278b(z10);
            }
        }
        m1357c0();
    }

    /* renamed from: j */
    private boolean m1328j(SubMenuC0333m subMenuC0333m, InterfaceC0330j interfaceC0330j) {
        boolean z10 = false;
        if (this.f1350w.isEmpty()) {
            return false;
        }
        if (interfaceC0330j != null) {
            z10 = interfaceC0330j.mo1284i(subMenuC0333m);
        }
        Iterator it = this.f1350w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0330j interfaceC0330j2 = (InterfaceC0330j) weakReference.get();
            if (interfaceC0330j2 == null) {
                this.f1350w.remove(weakReference);
            } else if (!z10) {
                z10 = interfaceC0330j2.mo1284i(subMenuC0333m);
            }
        }
        return z10;
    }

    /* renamed from: n */
    private static int m1329n(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0327g) arrayList.get(size)).m1387f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m1330A() {
        return this.f1347t;
    }

    /* renamed from: C */
    Resources m1331C() {
        return this.f1329b;
    }

    /* renamed from: D */
    public C0325e mo1332D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList m1333E() {
        if (!this.f1335h) {
            return this.f1334g;
        }
        this.f1334g.clear();
        int size = this.f1333f.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0327g c0327g = (C0327g) this.f1333f.get(i10);
            if (c0327g.isVisible()) {
                this.f1334g.add(c0327g);
            }
        }
        this.f1335h = false;
        this.f1338k = true;
        return this.f1334g;
    }

    /* renamed from: F */
    public boolean mo1334F() {
        return this.f1352y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo1335G() {
        return this.f1330c;
    }

    /* renamed from: H */
    public boolean mo1336H() {
        return this.f1331d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m1337I(C0327g c0327g) {
        this.f1338k = true;
        m1339K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m1338J(C0327g c0327g) {
        this.f1335h = true;
        m1339K(true);
    }

    /* renamed from: K */
    public void m1339K(boolean z10) {
        if (!this.f1344q) {
            if (z10) {
                this.f1335h = true;
                this.f1338k = true;
            }
            m1327i(z10);
            return;
        }
        this.f1345r = true;
        if (z10) {
            this.f1346s = true;
        }
    }

    /* renamed from: L */
    public boolean m1340L(MenuItem menuItem, int i10) {
        return m1341M(menuItem, null, i10);
    }

    /* renamed from: M */
    public boolean m1341M(MenuItem menuItem, InterfaceC0330j interfaceC0330j, int i10) {
        boolean z10;
        C0327g c0327g = (C0327g) menuItem;
        if (c0327g == null || !c0327g.isEnabled()) {
            return false;
        }
        boolean m1392k = c0327g.m1392k();
        AbstractC0555b mo1385b = c0327g.mo1385b();
        if (mo1385b != null && mo1385b.mo2394a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0327g.m1391j()) {
            m1392k |= c0327g.expandActionView();
            if (m1392k) {
                m1360e(true);
            }
        } else if (!c0327g.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                m1360e(true);
            }
        } else {
            if ((i10 & 4) == 0) {
                m1360e(false);
            }
            if (!c0327g.hasSubMenu()) {
                c0327g.m1405x(new SubMenuC0333m(m1372u(), this, c0327g));
            }
            SubMenuC0333m subMenuC0333m = (SubMenuC0333m) c0327g.getSubMenu();
            if (z10) {
                mo1385b.mo2398e(subMenuC0333m);
            }
            m1392k |= m1328j(subMenuC0333m, interfaceC0330j);
            if (!m1392k) {
                m1360e(true);
            }
        }
        return m1392k;
    }

    /* renamed from: O */
    public void m1342O(InterfaceC0330j interfaceC0330j) {
        Iterator it = this.f1350w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0330j interfaceC0330j2 = (InterfaceC0330j) weakReference.get();
            if (interfaceC0330j2 == null || interfaceC0330j2 == interfaceC0330j) {
                this.f1350w.remove(weakReference);
            }
        }
    }

    /* renamed from: P */
    public void m1343P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo1371t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0333m) item.getSubMenu()).m1343P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 > 0 && (findItem = findItem(i11)) != null) {
            findItem.expandActionView();
        }
    }

    /* renamed from: Q */
    public void m1344Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0333m) item.getSubMenu()).m1344Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1371t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo1345R(a aVar) {
        this.f1332e = aVar;
    }

    /* renamed from: S */
    public C0325e m1346S(int i10) {
        this.f1339l = i10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m1347T(MenuItem menuItem) {
        boolean z10;
        int groupId = menuItem.getGroupId();
        int size = this.f1333f.size();
        m1359d0();
        for (int i10 = 0; i10 < size; i10++) {
            C0327g c0327g = (C0327g) this.f1333f.get(i10);
            if (c0327g.getGroupId() == groupId && c0327g.m1394m() && c0327g.isCheckable()) {
                if (c0327g == menuItem) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c0327g.m1400s(z10);
            }
        }
        m1357c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public C0325e m1348U(int i10) {
        m1324W(0, null, i10, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public C0325e m1349V(Drawable drawable) {
        m1324W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public C0325e m1350X(int i10) {
        m1324W(i10, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public C0325e m1351Y(CharSequence charSequence) {
        m1324W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public C0325e m1352Z(View view) {
        m1324W(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    protected MenuItem m1353a(int i10, int i11, int i12, CharSequence charSequence) {
        int m1322B = m1322B(i12);
        C0327g m1326g = m1326g(i10, i11, i12, m1322B, charSequence, this.f1339l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1340m;
        if (contextMenuInfo != null) {
            m1326g.m1403v(contextMenuInfo);
        }
        ArrayList arrayList = this.f1333f;
        arrayList.add(m1329n(arrayList, m1322B), m1326g);
        m1339K(true);
        return m1326g;
    }

    /* renamed from: a0 */
    public void m1354a0(boolean z10) {
        this.f1353z = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m1353a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        Intent intent2;
        int i15;
        PackageManager packageManager = this.f1328a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i14 = queryIntentActivityOptions.size();
        } else {
            i14 = 0;
        }
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            if (i17 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i17];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = intent4;
            }
        }
        return i14;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m1355b(InterfaceC0330j interfaceC0330j) {
        m1356c(interfaceC0330j, this.f1328a);
    }

    /* renamed from: c */
    public void m1356c(InterfaceC0330j interfaceC0330j, Context context) {
        this.f1350w.add(new WeakReference(interfaceC0330j));
        interfaceC0330j.mo1282g(context, this);
        this.f1338k = true;
    }

    /* renamed from: c0 */
    public void m1357c0() {
        this.f1344q = false;
        if (this.f1345r) {
            this.f1345r = false;
            m1339K(this.f1346s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C0327g c0327g = this.f1351x;
        if (c0327g != null) {
            mo1361f(c0327g);
        }
        this.f1333f.clear();
        m1339K(true);
    }

    public void clearHeader() {
        this.f1342o = null;
        this.f1341n = null;
        this.f1343p = null;
        m1339K(false);
    }

    @Override // android.view.Menu
    public void close() {
        m1360e(true);
    }

    /* renamed from: d */
    public void m1358d() {
        a aVar = this.f1332e;
        if (aVar != null) {
            aVar.mo1143b(this);
        }
    }

    /* renamed from: d0 */
    public void m1359d0() {
        if (!this.f1344q) {
            this.f1344q = true;
            this.f1345r = false;
            this.f1346s = false;
        }
    }

    /* renamed from: e */
    public final void m1360e(boolean z10) {
        if (this.f1348u) {
            return;
        }
        this.f1348u = true;
        Iterator it = this.f1350w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0330j interfaceC0330j = (InterfaceC0330j) weakReference.get();
            if (interfaceC0330j == null) {
                this.f1350w.remove(weakReference);
            } else {
                interfaceC0330j.mo1277a(this, z10);
            }
        }
        this.f1348u = false;
    }

    /* renamed from: f */
    public boolean mo1361f(C0327g c0327g) {
        boolean z10 = false;
        if (!this.f1350w.isEmpty() && this.f1351x == c0327g) {
            m1359d0();
            Iterator it = this.f1350w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0330j interfaceC0330j = (InterfaceC0330j) weakReference.get();
                if (interfaceC0330j == null) {
                    this.f1350w.remove(weakReference);
                } else {
                    z10 = interfaceC0330j.mo1279d(this, c0327g);
                    if (z10) {
                        break;
                    }
                }
            }
            m1357c0();
            if (z10) {
                this.f1351x = null;
            }
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            C0327g c0327g = (C0327g) this.f1333f.get(i11);
            if (c0327g.getItemId() == i10) {
                return c0327g;
            }
            if (c0327g.hasSubMenu() && (findItem = c0327g.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f1333f.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1362h(C0325e c0325e, MenuItem menuItem) {
        a aVar = this.f1332e;
        if (aVar != null && aVar.mo1141a(c0325e, menuItem)) {
            return true;
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1353z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C0327g) this.f1333f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        if (m1367p(i10, keyEvent) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo1363k(C0327g c0327g) {
        boolean z10 = false;
        if (this.f1350w.isEmpty()) {
            return false;
        }
        m1359d0();
        Iterator it = this.f1350w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0330j interfaceC0330j = (InterfaceC0330j) weakReference.get();
            if (interfaceC0330j == null) {
                this.f1350w.remove(weakReference);
            } else {
                z10 = interfaceC0330j.mo1280e(this, c0327g);
                if (z10) {
                    break;
                }
            }
        }
        m1357c0();
        if (z10) {
            this.f1351x = c0327g;
        }
        return z10;
    }

    /* renamed from: l */
    public int m1364l(int i10) {
        return m1365m(i10, 0);
    }

    /* renamed from: m */
    public int m1365m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((C0327g) this.f1333f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: o */
    public int m1366o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((C0327g) this.f1333f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: p */
    C0327g m1367p(int i10, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList arrayList = this.f1349v;
        arrayList.clear();
        m1368q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0327g) arrayList.get(0);
        }
        boolean mo1335G = mo1335G();
        for (int i11 = 0; i11 < size; i11++) {
            C0327g c0327g = (C0327g) arrayList.get(i11);
            if (mo1335G) {
                numericShortcut = c0327g.getAlphabeticShortcut();
            } else {
                numericShortcut = c0327g.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (mo1335G && numericShortcut == '\b' && i10 == 67))) {
                return c0327g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return m1340L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        C0327g m1367p = m1367p(i10, keyEvent);
        if (m1367p != null) {
            z10 = m1340L(m1367p, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            m1360e(true);
        }
        return z10;
    }

    /* renamed from: q */
    void m1368q(List list, int i10, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean z10;
        boolean mo1335G = mo1335G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i10 != 67) {
            return;
        }
        int size = this.f1333f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0327g c0327g = (C0327g) this.f1333f.get(i11);
            if (c0327g.hasSubMenu()) {
                ((C0325e) c0327g.getSubMenu()).m1368q(list, i10, keyEvent);
            }
            if (mo1335G) {
                numericShortcut = c0327g.getAlphabeticShortcut();
            } else {
                numericShortcut = c0327g.getNumericShortcut();
            }
            if (mo1335G) {
                numericModifiers = c0327g.getAlphabeticModifiers();
            } else {
                numericModifiers = c0327g.getNumericModifiers();
            }
            if ((modifiers & 69647) == (numericModifiers & 69647)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && numericShortcut != 0) {
                char[] cArr = keyData.meta;
                if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (mo1335G && numericShortcut == '\b' && i10 == 67)) && c0327g.isEnabled()) {
                    list.add(c0327g);
                }
            }
        }
    }

    /* renamed from: r */
    public void m1369r() {
        ArrayList m1333E = m1333E();
        if (!this.f1338k) {
            return;
        }
        Iterator it = this.f1350w.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0330j interfaceC0330j = (InterfaceC0330j) weakReference.get();
            if (interfaceC0330j == null) {
                this.f1350w.remove(weakReference);
            } else {
                z10 |= interfaceC0330j.mo1300c();
            }
        }
        if (z10) {
            this.f1336i.clear();
            this.f1337j.clear();
            int size = m1333E.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0327g c0327g = (C0327g) m1333E.get(i10);
                if (c0327g.m1393l()) {
                    this.f1336i.add(c0327g);
                } else {
                    this.f1337j.add(c0327g);
                }
            }
        } else {
            this.f1336i.clear();
            this.f1337j.clear();
            this.f1337j.addAll(m1333E());
        }
        this.f1338k = false;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int m1364l = m1364l(i10);
        if (m1364l >= 0) {
            int size = this.f1333f.size() - m1364l;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((C0327g) this.f1333f.get(m1364l)).getGroupId() != i10) {
                    break;
                }
                m1323N(m1364l, false);
                i11 = i12;
            }
            m1339K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m1323N(m1366o(i10), true);
    }

    /* renamed from: s */
    public ArrayList m1370s() {
        m1369r();
        return this.f1336i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f1333f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0327g c0327g = (C0327g) this.f1333f.get(i11);
            if (c0327g.getGroupId() == i10) {
                c0327g.m1401t(z11);
                c0327g.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1352y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f1333f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0327g c0327g = (C0327g) this.f1333f.get(i11);
            if (c0327g.getGroupId() == i10) {
                c0327g.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f1333f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C0327g c0327g = (C0327g) this.f1333f.get(i11);
            if (c0327g.getGroupId() == i10 && c0327g.m1406y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            m1339K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1330c = z10;
        m1339K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1333f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public String mo1371t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context m1372u() {
        return this.f1328a;
    }

    /* renamed from: v */
    public C0327g m1373v() {
        return this.f1351x;
    }

    /* renamed from: w */
    public Drawable m1374w() {
        return this.f1342o;
    }

    /* renamed from: x */
    public CharSequence m1375x() {
        return this.f1341n;
    }

    /* renamed from: y */
    public View m1376y() {
        return this.f1343p;
    }

    /* renamed from: z */
    public ArrayList m1377z() {
        m1369r();
        return this.f1337j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m1353a(0, 0, 0, this.f1329b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f1329b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m1353a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        C0327g c0327g = (C0327g) m1353a(i10, i11, i12, charSequence);
        SubMenuC0333m subMenuC0333m = new SubMenuC0333m(this.f1328a, this, c0327g);
        c0327g.m1405x(subMenuC0333m);
        return subMenuC0333m;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m1353a(i10, i11, i12, this.f1329b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f1329b.getString(i13));
    }
}
