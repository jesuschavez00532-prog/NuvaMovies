package p302qc;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.InputStream;

/* renamed from: qc.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6446a {
    /* renamed from: a */
    public static final InputStream m25231a(Context context, String str) {
        Resources resources;
        AssetManager assets;
        if (str == null || context == null || (resources = context.getResources()) == null || (assets = resources.getAssets()) == null) {
            return null;
        }
        return assets.open(str);
    }
}
