package p395x5;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import p007a6.AbstractC0074g;

/* renamed from: x5.e */
/* loaded from: classes.dex */
public class C7502e {

    /* renamed from: a */
    private final Context f27576a;

    /* renamed from: b */
    private b f27577b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x5.e$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        private final String f27578a;

        /* renamed from: b */
        private final String f27579b;

        private b() {
            int m267q = AbstractC0074g.m267q(C7502e.this.f27576a, "com.google.firebase.crashlytics.unity_version", "string");
            if (m267q == 0) {
                if (C7502e.this.m28708c("flutter_assets/NOTICES.Z")) {
                    this.f27578a = "Flutter";
                    this.f27579b = null;
                    C7503f.m28716f().m28723i("Development platform is: Flutter");
                    return;
                } else {
                    this.f27578a = null;
                    this.f27579b = null;
                    return;
                }
            }
            this.f27578a = "Unity";
            String string = C7502e.this.f27576a.getResources().getString(m267q);
            this.f27579b = string;
            C7503f.m28716f().m28723i("Unity Editor version is: " + string);
        }
    }

    public C7502e(Context context) {
        this.f27576a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m28708c(String str) {
        if (this.f27576a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f27576a.getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private b m28709f() {
        if (this.f27577b == null) {
            this.f27577b = new b();
        }
        return this.f27577b;
    }

    /* renamed from: g */
    public static boolean m28710g(Context context) {
        if (AbstractC0074g.m267q(context, "com.google.firebase.crashlytics.unity_version", "string") != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public String m28711d() {
        return m28709f().f27578a;
    }

    /* renamed from: e */
    public String m28712e() {
        return m28709f().f27579b;
    }
}
