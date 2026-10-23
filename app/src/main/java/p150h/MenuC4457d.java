package p150h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p305r.InterfaceMenuC6490a;

/* renamed from: h.d */
/* loaded from: classes.dex */
public class MenuC4457d extends AbstractC4455b implements Menu {

    /* renamed from: d */
    private final InterfaceMenuC6490a f19307d;

    public MenuC4457d(Context context, InterfaceMenuC6490a interfaceMenuC6490a) {
        super(context);
        if (interfaceMenuC6490a != null) {
            this.f19307d = interfaceMenuC6490a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m18651c(this.f19307d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f19307d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = m18651c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m18652d(this.f19307d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() throws java.io.IOException {
        m18653e();
        this.f19307d.clear();
    }

    @Override // android.view.Menu
    public void close() throws java.io.IOException {
        this.f19307d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return m18651c(this.f19307d.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return m18651c(this.f19307d.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f19307d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f19307d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f19307d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f19307d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        m18654f(i10);
        this.f19307d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m18655g(i10);
        this.f19307d.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f19307d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f19307d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f19307d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f19307d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f19307d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m18651c(this.f19307d.add(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return m18652d(this.f19307d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m18651c(this.f19307d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return m18652d(this.f19307d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m18651c(this.f19307d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return m18652d(this.f19307d.addSubMenu(i10, i11, i12, i13));
    }
}
