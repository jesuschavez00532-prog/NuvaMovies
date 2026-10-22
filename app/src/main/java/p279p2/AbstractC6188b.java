package p279p2;

import android.app.Application;
import me.jessyan.autosize.AutoSize;
import me.jessyan.autosize.AutoSizeConfig;

/* renamed from: p2.b */
/* loaded from: classes.dex */
public abstract class AbstractC6188b {
    /* renamed from: a */
    public static void m24712a(Application application) {
        AutoSize.checkAndInit(application);
        AutoSizeConfig.getInstance().setPrivateFontScale(1.0f);
    }
}
