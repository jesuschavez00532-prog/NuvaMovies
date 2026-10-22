package p279p2;

import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;

/* renamed from: p2.a */
/* loaded from: classes.dex */
public abstract class AbstractC6187a {

    /* renamed from: a */
    private static final ConnectionPool f24331a = new ConnectionPool(5, 2, TimeUnit.MINUTES);

    /* renamed from: a */
    public static synchronized ConnectionPool m24711a() {
        ConnectionPool connectionPool;
        synchronized (AbstractC6187a.class) {
            connectionPool = f24331a;
        }
        return connectionPool;
    }
}
