package p138g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.R$style;

/* renamed from: g.d */
/* loaded from: classes.dex */
public class C4320d extends ContextWrapper {

    /* renamed from: a */
    private int f18771a;

    /* renamed from: b */
    private Resources.Theme f18772b;

    /* renamed from: c */
    private LayoutInflater f18773c;

    /* renamed from: d */
    private Configuration f18774d;

    /* renamed from: e */
    private Resources f18775e;

    public C4320d(Context context, int i10) {
        super(context);
        this.f18771a = i10;
    }

    /* renamed from: b */
    private Resources m18109b() {
        if (this.f18775e == null) {
            Configuration configuration = this.f18774d;
            if (configuration == null) {
                this.f18775e = super.getResources();
            } else {
                this.f18775e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f18775e;
    }

    /* renamed from: d */
    private void m18110d() {
        boolean z10 = false;
        if (this.f18772b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18772b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f18772b.setTo(theme);
            }
        }
        m18113e(this.f18772b, this.f18771a, z10);
    }

    /* renamed from: a */
    public void m18111a(Configuration configuration) {
        if (this.f18775e == null) {
            if (this.f18774d == null) {
                this.f18774d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int m18112c() {
        return this.f18771a;
    }

    /* renamed from: e */
    protected void m18113e(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m18109b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f18773c == null) {
                this.f18773c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f18773c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f18772b;
        if (theme != null) {
            return theme;
        }
        if (this.f18771a == 0) {
            this.f18771a = R$style.Theme_AppCompat_Light;
        }
        m18110d();
        return this.f18772b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f18771a != i10) {
            this.f18771a = i10;
            m18110d();
        }
    }

    public C4320d(Context context, Resources.Theme theme) {
        super(context);
        this.f18772b = theme;
    }
}
