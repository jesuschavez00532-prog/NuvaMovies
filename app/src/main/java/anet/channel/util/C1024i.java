package anet.channel.util;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.util.i */
/* loaded from: classes.dex */
public class C1024i {

    /* renamed from: a */
    private static AtomicInteger f4226a = new AtomicInteger();

    /* renamed from: a */
    public static String m4812a(String str) {
        if (f4226a.get() == Integer.MAX_VALUE) {
            f4226a.set(0);
        }
        if (!TextUtils.isEmpty(str)) {
            return StringUtils.concatString(str, ".AWCN", String.valueOf(f4226a.incrementAndGet()));
        }
        return StringUtils.concatString("AWCN", String.valueOf(f4226a.incrementAndGet()));
    }
}
