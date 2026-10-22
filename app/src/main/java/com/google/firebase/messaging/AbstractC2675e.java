package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import p214l.C5303a;

/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes.dex */
public abstract class AbstractC2675e {

    /* renamed from: a */
    public static final long f10286a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static C5303a m11173a(Bundle bundle) {
            C5303a c5303a = new C5303a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c5303a.put(str, str2);
                    }
                }
            }
            return c5303a;
        }
    }
}
