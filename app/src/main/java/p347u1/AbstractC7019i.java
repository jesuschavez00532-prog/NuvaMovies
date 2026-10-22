package p347u1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.content.AbstractC0547a;
import p106e.AbstractC4105b;
import p138g.C4320d;
import p254o.AbstractC5894i;

/* renamed from: u1.i */
/* loaded from: classes.dex */
public abstract class AbstractC7019i {

    /* renamed from: a */
    private static volatile boolean f26394a = true;

    /* renamed from: a */
    public static Drawable m27093a(Context context, int i10, Resources.Theme theme) {
        return m27095c(context, context, i10, theme);
    }

    /* renamed from: b */
    public static Drawable m27094b(Context context, Context context2, int i10) {
        return m27095c(context, context2, i10, null);
    }

    /* renamed from: c */
    private static Drawable m27095c(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f26394a) {
                return m27097e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return AbstractC0547a.m2324f(context2, i10);
            }
            throw e10;
        } catch (NoClassDefFoundError unused2) {
            f26394a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m27096d(context2, i10, theme);
    }

    /* renamed from: d */
    private static Drawable m27096d(Context context, int i10, Resources.Theme theme) {
        return AbstractC5894i.m23796d(context.getResources(), i10, theme);
    }

    /* renamed from: e */
    private static Drawable m27097e(Context context, int i10, Resources.Theme theme) {
        Resources resources;
        if (theme != null && Build.VERSION.SDK_INT >= 21) {
            C4320d c4320d = new C4320d(context, theme);
            resources = theme.getResources();
            c4320d.m18111a(resources.getConfiguration());
            context = c4320d;
        }
        return AbstractC4105b.m17170d(context, i10);
    }
}
