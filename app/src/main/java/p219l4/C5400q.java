package p219l4;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R$string;

/* renamed from: l4.q */
/* loaded from: classes.dex */
public class C5400q {

    /* renamed from: a */
    private final Resources f22031a;

    /* renamed from: b */
    private final String f22032b;

    public C5400q(Context context) {
        AbstractC5391n.m21783i(context);
        Resources resources = context.getResources();
        this.f22031a = resources;
        this.f22032b = resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public String m21802a(String str) {
        int identifier = this.f22031a.getIdentifier(str, "string", this.f22032b);
        if (identifier == 0) {
            return null;
        }
        return this.f22031a.getString(identifier);
    }
}
