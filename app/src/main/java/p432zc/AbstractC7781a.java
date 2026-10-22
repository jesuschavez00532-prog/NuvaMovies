package p432zc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/* renamed from: zc.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7781a {

    /* renamed from: a */
    private static Gson f28708a;

    /* renamed from: a */
    public static Gson m30143a() {
        if (f28708a == null) {
            synchronized (AbstractC7781a.class) {
                if (f28708a == null) {
                    f28708a = new GsonBuilder().disableHtmlEscaping().create();
                }
            }
        }
        return f28708a;
    }
}
