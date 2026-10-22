package anet.channel.security;

/* renamed from: anet.channel.security.c */
/* loaded from: classes.dex */
public class C0960c {

    /* renamed from: a */
    private static volatile ISecurityFactory f4002a;

    /* renamed from: a */
    public static ISecurityFactory m4645a() {
        if (f4002a == null) {
            f4002a = new C0961d();
        }
        return f4002a;
    }
}
