package p025b5;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import p219l4.AbstractC5391n;

/* renamed from: b5.x */
/* loaded from: classes.dex */
public abstract class AbstractC1126x {
    /* renamed from: a */
    public static String m5104a(String str, String[] strArr, String[] strArr2) {
        AbstractC5391n.m21783i(strArr);
        AbstractC5391n.m21783i(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m5105b(Context context, String str, String str2) {
        AbstractC5391n.m21783i(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC1115m.m5082a(context);
        }
        return AbstractC1115m.m5083b("google_app_id", resources, str2);
    }
}
