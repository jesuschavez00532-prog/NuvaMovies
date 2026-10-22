package p359ue;

import anet.channel.request.Request;
import java.nio.charset.Charset;
import ne.AbstractC5868k;

/* renamed from: ue.c */
/* loaded from: classes3.dex */
public final class C7149c {

    /* renamed from: a */
    public static final C7149c f26828a = new C7149c();

    /* renamed from: b */
    public static final Charset f26829b;

    /* renamed from: c */
    public static final Charset f26830c;

    /* renamed from: d */
    public static final Charset f26831d;

    /* renamed from: e */
    public static final Charset f26832e;

    /* renamed from: f */
    public static final Charset f26833f;

    /* renamed from: g */
    public static final Charset f26834g;

    static {
        Charset forName = Charset.forName(Request.DEFAULT_CHARSET);
        AbstractC5868k.m23673e(forName, "forName(\"UTF-8\")");
        f26829b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        AbstractC5868k.m23673e(forName2, "forName(\"UTF-16\")");
        f26830c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        AbstractC5868k.m23673e(forName3, "forName(\"UTF-16BE\")");
        f26831d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        AbstractC5868k.m23673e(forName4, "forName(\"UTF-16LE\")");
        f26832e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        AbstractC5868k.m23673e(forName5, "forName(\"US-ASCII\")");
        f26833f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        AbstractC5868k.m23673e(forName6, "forName(\"ISO-8859-1\")");
        f26834g = forName6;
    }

    private C7149c() {
    }
}
