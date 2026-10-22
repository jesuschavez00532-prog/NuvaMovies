package retrofit2;

import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class Response<T> {

    /* renamed from: a */
    private final okhttp3.Response f25370a;

    /* renamed from: b */
    private final Object f25371b;

    /* renamed from: c */
    private final ResponseBody f25372c;

    private Response(okhttp3.Response response, Object obj, ResponseBody responseBody) {
        this.f25370a = response;
        this.f25371b = obj;
        this.f25372c = responseBody;
    }

    /* renamed from: c */
    public static Response m25759c(ResponseBody responseBody, okhttp3.Response response) {
        Utils.m25785b(responseBody, "body == null");
        Utils.m25785b(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new Response(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: f */
    public static Response m25760f(Object obj, okhttp3.Response response) {
        Utils.m25785b(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new Response(response, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public Object m25761a() {
        return this.f25371b;
    }

    /* renamed from: b */
    public int m25762b() {
        return this.f25370a.code();
    }

    /* renamed from: d */
    public boolean m25763d() {
        return this.f25370a.isSuccessful();
    }

    /* renamed from: e */
    public String m25764e() {
        return this.f25370a.message();
    }

    public String toString() {
        return this.f25370a.toString();
    }
}
