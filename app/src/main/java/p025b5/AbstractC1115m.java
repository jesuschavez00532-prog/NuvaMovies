package p025b5;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R$string;

/* renamed from: b5.m */
/* loaded from: classes.dex */
public abstract class AbstractC1115m {
    /* renamed from: a */
    public static String m5082a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R$string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m5083b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return resources.getString(identifier);
    }
}
