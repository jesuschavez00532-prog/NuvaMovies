package p150h;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p214l.C5311i;
import p305r.InterfaceMenuItemC6491b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h.b */
/* loaded from: classes.dex */
public abstract class AbstractC4455b {

    /* renamed from: a */
    final Context f19293a;

    /* renamed from: b */
    private C5311i f19294b;

    /* renamed from: c */
    private C5311i f19295c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4455b(Context context) {
        this.f19293a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem m18651c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC6491b) {
            InterfaceMenuItemC6491b interfaceMenuItemC6491b = (InterfaceMenuItemC6491b) menuItem;
            if (this.f19294b == null) {
                this.f19294b = new C5311i();
            }
            MenuItem menuItem2 = (MenuItem) this.f19294b.get(menuItem);
            if (menuItem2 == null) {
                MenuItemC4456c menuItemC4456c = new MenuItemC4456c(this.f19293a, interfaceMenuItemC6491b);
                this.f19294b.put(interfaceMenuItemC6491b, menuItemC4456c);
                return menuItemC4456c;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu m18652d(SubMenu subMenu) {
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m18653e() {
        C5311i c5311i = this.f19294b;
        if (c5311i != null) {
            c5311i.clear();
        }
        C5311i c5311i2 = this.f19295c;
        if (c5311i2 != null) {
            c5311i2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m18654f(int i10) {
        if (this.f19294b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f19294b.size()) {
            if (((InterfaceMenuItemC6491b) this.f19294b.m21434i(i11)).getGroupId() == i10) {
                this.f19294b.mo17198k(i11);
                i11--;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m18655g(int i10) {
        if (this.f19294b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f19294b.size(); i11++) {
            if (((InterfaceMenuItemC6491b) this.f19294b.m21434i(i11)).getItemId() == i10) {
                this.f19294b.mo17198k(i11);
                return;
            }
        }
    }
}
