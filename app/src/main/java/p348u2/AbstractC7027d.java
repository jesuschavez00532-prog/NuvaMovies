package p348u2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/* renamed from: u2.d */
/* loaded from: classes.dex */
public abstract class AbstractC7027d {

    /* renamed from: a */
    private static Gson f26398a;

    /* renamed from: a */
    public static Gson m27114a() {
        if (f26398a == null) {
            synchronized (AbstractC7027d.class) {
                if (f26398a == null) {
                    f26398a = new GsonBuilder().disableHtmlEscaping().create();
                }
            }
        }
        return f26398a;
    }
}
