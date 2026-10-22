package p150h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0555b;
import java.lang.reflect.Method;
import p138g.InterfaceC4319c;
import p305r.InterfaceMenuItemC6491b;

/* renamed from: h.c */
/* loaded from: classes.dex */
public class MenuItemC4456c extends AbstractC4455b implements MenuItem {

    /* renamed from: d */
    private final InterfaceMenuItemC6491b f19296d;

    /* renamed from: e */
    private Method f19297e;

    /* renamed from: h.c$a */
    /* loaded from: classes.dex */
    private class a extends AbstractC0555b {

        /* renamed from: d */
        final ActionProvider f19298d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f19298d = actionProvider;
        }

        @Override // androidx.core.view.AbstractC0555b
        /* renamed from: a */
        public boolean mo2394a() {
            return this.f19298d.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0555b
        /* renamed from: d */
        public boolean mo2397d() {
            return this.f19298d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0555b
        /* renamed from: e */
        public void mo2398e(SubMenu subMenu) {
            this.f19298d.onPrepareSubMenu(MenuItemC4456c.this.m18652d(subMenu));
        }
    }

    /* renamed from: h.c$b */
    /* loaded from: classes.dex */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private AbstractC0555b.b f19300f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC0555b
        /* renamed from: b */
        public boolean mo2395b() {
            return this.f19298d.isVisible();
        }

        @Override // androidx.core.view.AbstractC0555b
        /* renamed from: c */
        public View mo2396c(MenuItem menuItem) {
            return this.f19298d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC0555b
        /* renamed from: f */
        public boolean mo2399f() {
            return this.f19298d.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0555b
        /* renamed from: i */
        public void mo2402i(AbstractC0555b.b bVar) {
            b bVar2;
            this.f19300f = bVar;
            ActionProvider actionProvider = this.f19298d;
            if (bVar != null) {
                bVar2 = this;
            } else {
                bVar2 = null;
            }
            actionProvider.setVisibilityListener(bVar2);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC0555b.b bVar = this.f19300f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* renamed from: h.c$c */
    /* loaded from: classes.dex */
    static class c extends FrameLayout implements InterfaceC4319c {

        /* renamed from: a */
        final CollapsibleActionView f19302a;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f19302a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m18657a() {
            return (View) this.f19302a;
        }

        @Override // p138g.InterfaceC4319c
        /* renamed from: c */
        public void mo1528c() {
            this.f19302a.onActionViewExpanded();
        }

        @Override // p138g.InterfaceC4319c
        /* renamed from: f */
        public void mo1530f() {
            this.f19302a.onActionViewCollapsed();
        }
    }

    /* renamed from: h.c$d */
    /* loaded from: classes.dex */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f19303a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f19303a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f19303a.onMenuItemActionCollapse(MenuItemC4456c.this.m18651c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f19303a.onMenuItemActionExpand(MenuItemC4456c.this.m18651c(menuItem));
        }
    }

    /* renamed from: h.c$e */
    /* loaded from: classes.dex */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f19305a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f19305a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f19305a.onMenuItemClick(MenuItemC4456c.this.m18651c(menuItem));
        }
    }

    public MenuItemC4456c(Context context, InterfaceMenuItemC6491b interfaceMenuItemC6491b) {
        super(context);
        if (interfaceMenuItemC6491b != null) {
            this.f19296d = interfaceMenuItemC6491b;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f19296d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f19296d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0555b mo1385b = this.f19296d.mo1385b();
        if (mo1385b instanceof a) {
            return ((a) mo1385b).f19298d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f19296d.getActionView();
        if (actionView instanceof c) {
            return ((c) actionView).m18657a();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f19296d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f19296d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f19296d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f19296d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f19296d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f19296d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f19296d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f19296d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f19296d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f19296d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f19296d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f19296d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f19296d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m18652d(this.f19296d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f19296d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f19296d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f19296d.getTooltipText();
    }

    /* renamed from: h */
    public void m18656h(boolean z10) {
        try {
            if (this.f19297e == null) {
                this.f19297e = this.f19296d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f19297e.invoke(this.f19296d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f19296d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f19296d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f19296d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f19296d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f19296d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f19296d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f19293a, actionProvider);
        InterfaceMenuItemC6491b interfaceMenuItemC6491b = this.f19296d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC6491b.mo1384a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f19296d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f19296d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f19296d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f19296d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f19296d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f19296d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f19296d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19296d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19296d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f19296d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f19296d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        d dVar;
        InterfaceMenuItemC6491b interfaceMenuItemC6491b = this.f19296d;
        if (onActionExpandListener != null) {
            dVar = new d(onActionExpandListener);
        } else {
            dVar = null;
        }
        interfaceMenuItemC6491b.setOnActionExpandListener(dVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        e eVar;
        InterfaceMenuItemC6491b interfaceMenuItemC6491b = this.f19296d;
        if (onMenuItemClickListener != null) {
            eVar = new e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        interfaceMenuItemC6491b.setOnMenuItemClickListener(eVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f19296d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f19296d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f19296d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f19296d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19296d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f19296d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f19296d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f19296d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f19296d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f19296d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f19296d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f19296d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f19296d.setActionView(i10);
        View actionView = this.f19296d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f19296d.setActionView(new c(actionView));
        }
        return this;
    }
}
