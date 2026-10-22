package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0325e;

/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes.dex */
public class SubMenuC0333m extends C0325e implements SubMenu {

    /* renamed from: B */
    private C0325e f1427B;

    /* renamed from: C */
    private C0327g f1428C;

    public SubMenuC0333m(Context context, C0325e c0325e, C0327g c0327g) {
        super(context);
        this.f1427B = c0325e;
        this.f1428C = c0327g;
    }

    @Override // androidx.appcompat.view.menu.C0325e
    /* renamed from: D */
    public C0325e mo1332D() {
        return this.f1427B.mo1332D();
    }

    @Override // androidx.appcompat.view.menu.C0325e
    /* renamed from: F */
    public boolean mo1334F() {
        return this.f1427B.mo1334F();
    }

    @Override // androidx.appcompat.view.menu.C0325e
    /* renamed from: G */
    public boolean mo1335G() {
        return this.f1427B.mo1335G();
    }

    @Override // androidx.appcompat.view.menu.C0325e
    /* renamed from: H */
    public boolean mo1336H() {
        return this.f1427B.mo1336H();
    }

    @Override // androidx.appcompat.view.menu.C0325e
    /* renamed from: R */
    public void mo1345R(C0325e.a aVar) {
        this.f1427B.mo1345R(aVar);
    }

    /* renamed from: e0 */
    public Menu m1428e0() {
        return this.f1427B;
    }

    @Override // androidx.appcompat.view.menu.C0325e
    /* renamed from: f */
    public boolean mo1361f(C0327g c0327g) {
        return this.f1427B.mo1361f(c0327g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1428C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0325e
    /* renamed from: h */
    public boolean mo1362h(C0325e c0325e, MenuItem menuItem) {
        if (!super.mo1362h(c0325e, menuItem) && !this.f1427B.mo1362h(c0325e, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.C0325e
    /* renamed from: k */
    public boolean mo1363k(C0327g c0327g) {
        return this.f1427B.mo1363k(c0327g);
    }

    @Override // androidx.appcompat.view.menu.C0325e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1427B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m1349V(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m1351Y(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m1352Z(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1428C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0325e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1427B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.C0325e
    /* renamed from: t */
    public String mo1371t() {
        int i10;
        C0327g c0327g = this.f1428C;
        if (c0327g != null) {
            i10 = c0327g.getItemId();
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return null;
        }
        return super.mo1371t() + ":" + i10;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.m1348U(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.m1350X(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f1428C.setIcon(i10);
        return this;
    }
}
