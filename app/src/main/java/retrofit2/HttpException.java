package retrofit2;

/* loaded from: classes3.dex */
public class HttpException extends RuntimeException {

    /* renamed from: a */
    private final int f25231a;

    /* renamed from: b */
    private final String f25232b;

    /* renamed from: c */
    private final transient Response f25233c;

    public HttpException(Response response) {
        super(m25695b(response));
        this.f25231a = response.m25762b();
        this.f25232b = response.m25764e();
        this.f25233c = response;
    }

    /* renamed from: b */
    private static String m25695b(Response response) {
        Utils.m25785b(response, "response == null");
        return "HTTP " + response.m25762b() + " " + response.m25764e();
    }

    /* renamed from: a */
    public int m25696a() {
        return this.f25231a;
    }
}
