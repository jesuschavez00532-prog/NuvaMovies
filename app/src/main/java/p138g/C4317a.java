package p138g;

import android.content.Context;
import android.content.res.Configuration;
import androidx.appcompat.R$bool;

/* renamed from: g.a */
/* loaded from: classes.dex */
public class C4317a {

    /* renamed from: a */
    private Context f18768a;

    private C4317a(Context context) {
        this.f18768a = context;
    }

    /* renamed from: b */
    public static C4317a m18100b(Context context) {
        return new C4317a(context);
    }

    /* renamed from: a */
    public boolean m18101a() {
        if (this.f18768a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int m18102c() {
        return this.f18768a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m18103d() {
        Configuration configuration = this.f18768a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600) {
            if (i10 <= 960 || i11 <= 720) {
                if (i10 <= 720 || i11 <= 960) {
                    if (i10 < 500) {
                        if (i10 <= 640 || i11 <= 480) {
                            if (i10 <= 480 || i11 <= 640) {
                                if (i10 >= 360) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 5;
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: e */
    public boolean m18104e() {
        return this.f18768a.getResources().getBoolean(R$bool.abc_action_bar_embed_tabs);
    }

    /* renamed from: f */
    public boolean m18105f() {
        return true;
    }
}
