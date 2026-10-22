package p229m0;

import android.content.Context;
import anet.channel.entity.ENV;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: m0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5567a implements Serializable {

    /* renamed from: c */
    private static Context f22574c;

    /* renamed from: a */
    public static ENV f22572a = ENV.ONLINE;

    /* renamed from: b */
    private static AtomicBoolean f22573b = new AtomicBoolean(false);

    /* renamed from: d */
    private static HashMap f22575d = null;

    /* renamed from: a */
    public static Context m22604a() {
        return f22574c;
    }
}
