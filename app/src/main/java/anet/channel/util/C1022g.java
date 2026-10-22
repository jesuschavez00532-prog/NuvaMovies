package anet.channel.util;

import android.util.Base64;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: anet.channel.util.g */
/* loaded from: classes.dex */
public class C1022g {

    /* renamed from: a */
    public static C1022g f4221a;

    /* renamed from: b */
    private final Proxy f4222b;

    /* renamed from: c */
    private final String f4223c;

    /* renamed from: d */
    private final String f4224d;

    public C1022g(String str, int i10, String str2, String str3) {
        this.f4222b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i10));
        this.f4223c = str2;
        this.f4224d = str3;
    }

    /* renamed from: a */
    public static C1022g m4808a() {
        return f4221a;
    }

    /* renamed from: b */
    public Proxy m4809b() {
        return this.f4222b;
    }

    /* renamed from: c */
    public String m4810c() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f4223c);
        sb2.append(":");
        sb2.append(this.f4224d);
        String encodeToString = Base64.encodeToString(sb2.toString().getBytes(), 0);
        StringBuilder sb3 = new StringBuilder(64);
        sb3.append("Basic ");
        sb3.append(encodeToString);
        return sb3.toString();
    }
}
