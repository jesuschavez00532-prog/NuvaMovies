package p242n0;

import android.app.Activity;
import android.content.Context;
import ne.AbstractC5868k;

/* renamed from: n0.e */
/* loaded from: classes.dex */
public abstract class AbstractC5718e {
    /* renamed from: a */
    public static final boolean m23111a(Context context) {
        AbstractC5868k.m23674f(context, "<this>");
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            return true;
        }
        return false;
    }
}
