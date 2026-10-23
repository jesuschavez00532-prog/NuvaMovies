package p150h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.AbstractC0547a;
import androidx.core.view.AbstractC0555b;
import p290q.AbstractC6306k;
import p305r.InterfaceMenuItemC6491b;

/* renamed from: h.a */
/* loaded from: classes.dex */
public class C4454a implements InterfaceMenuItemC6491b {

    /* renamed from: a */
    private final int f19273a;

    /* renamed from: b */
    private final int f19274b;

    /* renamed from: c */
    private final int f19275c;

    /* renamed from: d */
    private CharSequence f19276d;

    /* renamed from: e */
    private CharSequence f19277e;

    /* renamed from: f */
    private Intent f19278f;

    /* renamed from: g */
    private char f19279g;

    /* renamed from: i */
    private char f19281i;

    /* renamed from: k */
    private Drawable f19283k;

    /* renamed from: l */
    private Context f19284l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f19285m;

    /* renamed from: n */
    private CharSequence f19286n;

    /* renamed from: o */
    private CharSequence f19287o;

    /* renamed from: h */
    private int f19280h = 4096;

    /* renamed from: j */
    private int f19282j = 4096;

    /* renamed from: p */
    private ColorStateList f19288p = null;

    /* renamed from: q */
    private PorterDuff.Mode f19289q = null;

    /* renamed from: r */
    private boolean f19290r = false;

    /* renamed from: s */
    private boolean f19291s = false;

    /* renamed from: t */
    private int f19292t = 16;

    public C4454a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f19284l = context;
        this.f19273a = i11;
        this.f19274b = i10;
        this.f19275c = i13;
        this.f19276d = charSequence;
    }

    /* renamed from: c */
    private void m18647c() {
        Drawable drawable = this.f19283k;
        if (drawable != null) {
            if (this.f19290r || this.f19291s) {
                Drawable m25072r = AbstractC6306k.m25072r(drawable);
                this.f19283k = m25072r;
                Drawable mutate = m25072r.mutate();
                this.f19283k = mutate;
                if (this.f19290r) {
                    AbstractC6306k.m25069o(mutate, this.f19288p);
                }
                if (this.f19291s) {
                    AbstractC6306k.m25070p(this.f19283k, this.f19289q);
                }
            }
        }
    }

    @Override // p305r.InterfaceMenuItemC6491b
    /* renamed from: a */
    public InterfaceMenuItemC6491b mo1384a(AbstractC0555b abstractC0555b) {
        throw new UnsupportedOperationException();
    }

    @Override // p305r.InterfaceMenuItemC6491b
    /* renamed from: b */
    public AbstractC0555b mo1385b() {
        return null;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6491b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6491b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6491b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f19282j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f19281i;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f19286n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f19274b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f19283k;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f19288p;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f19289q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f19278f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f19273a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f19280h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f19279g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f19275c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f19276d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19277e;
        if (charSequence == null) {
            return this.f19276d;
        }
        return charSequence;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f19287o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        if ((this.f19292t & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        if ((this.f19292t & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        if ((this.f19292t & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        if ((this.f19292t & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f19281i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f19292t = (z10 ? 1 : 0) | (this.f19292t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        int i10 = 0;
        int i11 = this.f19292t & (-3);
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f19292t = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        int i10 = 0;
        int i11 = this.f19292t & (-17);
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f19292t = i10 | i11;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f19283k = drawable;
        m18647c();
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19288p = colorStateList;
        this.f19290r = true;
        m18647c();
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19289q = mode;
        this.f19291s = true;
        m18647c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f19278f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f19279g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19285m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f19279g = c10;
        this.f19281i = Character.toLowerCase(c11);
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f19276d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19277e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f19292t & 8;
        if (z10) {
            i10 = 0;
        }
        this.f19292t = i11 | i10;
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f19281i = Character.toLowerCase(c10);
        this.f19282j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC6491b setContentDescription(CharSequence charSequence) {
        this.f19286n = charSequence;
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f19279g = c10;
        this.f19280h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f19276d = this.f19284l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC6491b setTooltipText(CharSequence charSequence) {
        this.f19287o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f19283k = AbstractC0547a.m2324f(this.f19284l, i10);
        m18647c();
        return this;
    }

    @Override // p305r.InterfaceMenuItemC6491b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f19279g = c10;
        this.f19280h = KeyEvent.normalizeMetaState(i10);
        this.f19281i = Character.toLowerCase(c11);
        this.f19282j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
