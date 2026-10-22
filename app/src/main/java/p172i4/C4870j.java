package p172i4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;
import p219l4.AbstractC5384k1;
import p281p4.AbstractC6204h;
import p310r4.C6534e;
import p394x4.AbstractC7496d;

/* renamed from: i4.j */
/* loaded from: classes.dex */
public class C4870j {

    /* renamed from: a */
    public static final int f20367a = AbstractC4884q.f20380a;

    /* renamed from: b */
    private static final C4870j f20368b = new C4870j();

    /* renamed from: f */
    public static C4870j m20060f() {
        return f20368b;
    }

    /* renamed from: a */
    public int m20061a(Context context) {
        return AbstractC4884q.m20074a(context);
    }

    /* renamed from: b */
    public Intent mo20042b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return AbstractC5384k1.m21765c("com.google.android.gms");
        }
        if (context != null && AbstractC6204h.m24758d(context)) {
            return AbstractC5384k1.m21763a();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f20367a);
        sb2.append(Operator.Operation.MINUS);
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append(Operator.Operation.MINUS);
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append(Operator.Operation.MINUS);
        if (context != null) {
            try {
                sb2.append(C6534e.m25570a(context).m25567e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return AbstractC5384k1.m21764b("com.google.android.gms", sb2.toString());
    }

    /* renamed from: c */
    public PendingIntent mo20043c(Context context, int i10, int i11) {
        return m20062d(context, i10, i11, null);
    }

    /* renamed from: d */
    public PendingIntent m20062d(Context context, int i10, int i11, String str) {
        Intent mo20042b = mo20042b(context, i10, str);
        if (mo20042b == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, mo20042b, AbstractC7496d.f27567a | 134217728);
    }

    /* renamed from: e */
    public String mo20044e(int i10) {
        return AbstractC4884q.m20075b(i10);
    }

    /* renamed from: g */
    public int mo20045g(Context context) {
        return mo20046h(context, f20367a);
    }

    /* renamed from: h */
    public int mo20046h(Context context, int i10) {
        int m20078e = AbstractC4884q.m20078e(context, i10);
        if (AbstractC4884q.m20079f(context, m20078e)) {
            return 18;
        }
        return m20078e;
    }

    /* renamed from: i */
    public boolean m20063i(Context context, String str) {
        return AbstractC4884q.m20083j(context, str);
    }

    /* renamed from: j */
    public boolean mo20047j(int i10) {
        return AbstractC4884q.m20081h(i10);
    }
}
