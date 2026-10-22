package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
/* loaded from: classes.dex */
public abstract class AbstractC0555b {

    /* renamed from: a */
    private final Context f2323a;

    /* renamed from: b */
    private a f2324b;

    /* renamed from: c */
    private b f2325c;

    /* renamed from: androidx.core.view.b$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b */
    /* loaded from: classes.dex */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC0555b(Context context) {
        this.f2323a = context;
    }

    /* renamed from: a */
    public abstract boolean mo2394a();

    /* renamed from: b */
    public abstract boolean mo2395b();

    /* renamed from: c */
    public abstract View mo2396c(MenuItem menuItem);

    /* renamed from: d */
    public abstract boolean mo2397d();

    /* renamed from: e */
    public abstract void mo2398e(SubMenu subMenu);

    /* renamed from: f */
    public abstract boolean mo2399f();

    /* renamed from: g */
    public void m2400g() {
        this.f2325c = null;
        this.f2324b = null;
    }

    /* renamed from: h */
    public void m2401h(a aVar) {
        this.f2324b = aVar;
    }

    /* renamed from: i */
    public abstract void mo2402i(b bVar);
}
