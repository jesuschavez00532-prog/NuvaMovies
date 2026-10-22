package p138g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p138g.AbstractC4318b;
import p150h.MenuC4457d;
import p150h.MenuItemC4456c;
import p214l.C5311i;
import p305r.InterfaceMenuC6490a;
import p305r.InterfaceMenuItemC6491b;

/* renamed from: g.f */
/* loaded from: classes.dex */
public class C4322f extends ActionMode {

    /* renamed from: a */
    final Context f18783a;

    /* renamed from: b */
    final AbstractC4318b f18784b;

    /* renamed from: g.f$a */
    /* loaded from: classes.dex */
    public static class a implements AbstractC4318b.a {

        /* renamed from: a */
        final ActionMode.Callback f18785a;

        /* renamed from: b */
        final Context f18786b;

        /* renamed from: c */
        final ArrayList f18787c = new ArrayList();

        /* renamed from: d */
        final C5311i f18788d = new C5311i();

        public a(Context context, ActionMode.Callback callback) {
            this.f18786b = context;
            this.f18785a = callback;
        }

        /* renamed from: f */
        private Menu m18114f(Menu menu) {
            Menu menu2 = (Menu) this.f18788d.get(menu);
            if (menu2 == null) {
                MenuC4457d menuC4457d = new MenuC4457d(this.f18786b, (InterfaceMenuC6490a) menu);
                this.f18788d.put(menu, menuC4457d);
                return menuC4457d;
            }
            return menu2;
        }

        @Override // p138g.AbstractC4318b.a
        /* renamed from: a */
        public boolean mo1164a(AbstractC4318b abstractC4318b, MenuItem menuItem) {
            return this.f18785a.onActionItemClicked(m18115e(abstractC4318b), new MenuItemC4456c(this.f18786b, (InterfaceMenuItemC6491b) menuItem));
        }

        @Override // p138g.AbstractC4318b.a
        /* renamed from: b */
        public void mo1165b(AbstractC4318b abstractC4318b) {
            this.f18785a.onDestroyActionMode(m18115e(abstractC4318b));
        }

        @Override // p138g.AbstractC4318b.a
        /* renamed from: c */
        public boolean mo1166c(AbstractC4318b abstractC4318b, Menu menu) {
            return this.f18785a.onPrepareActionMode(m18115e(abstractC4318b), m18114f(menu));
        }

        @Override // p138g.AbstractC4318b.a
        /* renamed from: d */
        public boolean mo1167d(AbstractC4318b abstractC4318b, Menu menu) {
            return this.f18785a.onCreateActionMode(m18115e(abstractC4318b), m18114f(menu));
        }

        /* renamed from: e */
        public ActionMode m18115e(AbstractC4318b abstractC4318b) {
            int size = this.f18787c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4322f c4322f = (C4322f) this.f18787c.get(i10);
                if (c4322f != null && c4322f.f18784b == abstractC4318b) {
                    return c4322f;
                }
            }
            C4322f c4322f2 = new C4322f(this.f18786b, abstractC4318b);
            this.f18787c.add(c4322f2);
            return c4322f2;
        }
    }

    public C4322f(Context context, AbstractC4318b abstractC4318b) {
        this.f18783a = context;
        this.f18784b = abstractC4318b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f18784b.mo1244c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f18784b.mo1245d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC4457d(this.f18783a, (InterfaceMenuC6490a) this.f18784b.mo1246e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f18784b.mo1247f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f18784b.mo1248g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f18784b.m18106h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f18784b.mo1249i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f18784b.m18107j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f18784b.mo1250k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f18784b.mo1251l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f18784b.mo1252m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f18784b.mo1254o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f18784b.m18108p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f18784b.mo1256r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f18784b.mo1257s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f18784b.mo1253n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f18784b.mo1255q(i10);
    }
}
