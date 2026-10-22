package p184j1;

import anet.channel.request.Request;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: j1.f */
/* loaded from: classes.dex */
public interface InterfaceC4975f {

    /* renamed from: a */
    public static final Charset f20711a = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: a */
    void mo16761a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
