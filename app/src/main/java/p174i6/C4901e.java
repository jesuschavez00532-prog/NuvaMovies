package p174i6;

/* renamed from: i6.e */
/* loaded from: classes.dex */
public class C4901e {

    /* renamed from: a */
    public final String f20410a;

    /* renamed from: b */
    public final String f20411b;

    /* renamed from: c */
    public final StackTraceElement[] f20412c;

    /* renamed from: d */
    public final C4901e f20413d;

    public C4901e(Throwable th, InterfaceC4900d interfaceC4900d) {
        C4901e c4901e;
        this.f20410a = th.getLocalizedMessage();
        this.f20411b = th.getClass().getName();
        this.f20412c = interfaceC4900d.mo20099a(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            c4901e = new C4901e(cause, interfaceC4900d);
        } else {
            c4901e = null;
        }
        this.f20413d = c4901e;
    }
}
