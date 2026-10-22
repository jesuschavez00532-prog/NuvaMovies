package p138g;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: g.b */
/* loaded from: classes.dex */
public abstract class AbstractC4318b {

    /* renamed from: a */
    private Object f18769a;

    /* renamed from: b */
    private boolean f18770b;

    /* renamed from: g.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo1164a(AbstractC4318b abstractC4318b, MenuItem menuItem);

        /* renamed from: b */
        void mo1165b(AbstractC4318b abstractC4318b);

        /* renamed from: c */
        boolean mo1166c(AbstractC4318b abstractC4318b, Menu menu);

        /* renamed from: d */
        boolean mo1167d(AbstractC4318b abstractC4318b, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo1244c();

    /* renamed from: d */
    public abstract View mo1245d();

    /* renamed from: e */
    public abstract Menu mo1246e();

    /* renamed from: f */
    public abstract MenuInflater mo1247f();

    /* renamed from: g */
    public abstract CharSequence mo1248g();

    /* renamed from: h */
    public Object m18106h() {
        return this.f18769a;
    }

    /* renamed from: i */
    public abstract CharSequence mo1249i();

    /* renamed from: j */
    public boolean m18107j() {
        return this.f18770b;
    }

    /* renamed from: k */
    public abstract void mo1250k();

    /* renamed from: l */
    public abstract boolean mo1251l();

    /* renamed from: m */
    public abstract void mo1252m(View view);

    /* renamed from: n */
    public abstract void mo1253n(int i10);

    /* renamed from: o */
    public abstract void mo1254o(CharSequence charSequence);

    /* renamed from: p */
    public void m18108p(Object obj) {
        this.f18769a = obj;
    }

    /* renamed from: q */
    public abstract void mo1255q(int i10);

    /* renamed from: r */
    public abstract void mo1256r(CharSequence charSequence);

    /* renamed from: s */
    public void mo1257s(boolean z10) {
        this.f18770b = z10;
    }
}
