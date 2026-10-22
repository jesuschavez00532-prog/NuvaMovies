package p213kf;

import retrofit2.Response;

/* renamed from: kf.e */
/* loaded from: classes3.dex */
public final class C5257e {

    /* renamed from: a */
    private final Response f21445a;

    /* renamed from: b */
    private final Throwable f21446b;

    private C5257e(Response response, Throwable th) {
        this.f21445a = response;
        this.f21446b = th;
    }

    /* renamed from: a */
    public static C5257e m21160a(Throwable th) {
        if (th != null) {
            return new C5257e(null, th);
        }
        throw new NullPointerException("error == null");
    }

    /* renamed from: b */
    public static C5257e m21161b(Response response) {
        if (response != null) {
            return new C5257e(response, null);
        }
        throw new NullPointerException("response == null");
    }
}
