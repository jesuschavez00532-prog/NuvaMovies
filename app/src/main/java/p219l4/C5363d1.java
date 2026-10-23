package p219l4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: l4.d1 */
/* loaded from: classes.dex */
public final class C5363d1 {

    /* renamed from: f */
    private static final Uri f21940f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f21941a;

    /* renamed from: b */
    private final String f21942b;

    /* renamed from: c */
    private final ComponentName f21943c;

    /* renamed from: d */
    private final int f21944d;

    /* renamed from: e */
    private final boolean f21945e;

    public C5363d1(String str, String str2, int i10, boolean z10) {
        AbstractC5391n.m21779e(str);
        this.f21941a = str;
        AbstractC5391n.m21779e(str2);
        this.f21942b = str2;
        this.f21943c = null;
        this.f21944d = i10;
        this.f21945e = z10;
    }

    /* renamed from: a */
    public final int m21713a() {
        return this.f21944d;
    }

    /* renamed from: b */
    public final ComponentName m21714b() {
        return this.f21943c;
    }

    /* renamed from: c */
    public final Intent m21715c(Context context) {
        Bundle bundle = null;
        if (this.f21941a != null) {
            Intent intent = null;
            if (this.f21945e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f21941a);
                try {
                    bundle = context.getContentResolver().call(f21940f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f21941a)));
                }
            }
            if (intent == null) {
                return new Intent(this.f21941a).setPackage(this.f21942b);
            }
            return intent;
        }
        return new Intent().setComponent(this.f21943c);
    }

    /* renamed from: d */
    public final String m21716d() {
        return this.f21942b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5363d1)) {
            return false;
        }
        C5363d1 c5363d1 = (C5363d1) obj;
        if (AbstractC5388m.m21771a(this.f21941a, c5363d1.f21941a) && AbstractC5388m.m21771a(this.f21942b, c5363d1.f21942b) && AbstractC5388m.m21771a(this.f21943c, c5363d1.f21943c) && this.f21944d == c5363d1.f21944d && this.f21945e == c5363d1.f21945e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC5388m.m21772b(this.f21941a, this.f21942b, this.f21943c, Integer.valueOf(this.f21944d), Boolean.valueOf(this.f21945e));
    }

    public final String toString() {
        String str = this.f21941a;
        if (str == null) {
            AbstractC5391n.m21783i(this.f21943c);
            return this.f21943c.flattenToString();
        }
        return str;
    }
}
