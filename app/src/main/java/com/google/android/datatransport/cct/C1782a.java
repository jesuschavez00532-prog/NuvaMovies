package com.google.android.datatransport.cct;

import anet.channel.request.Request;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p294q3.C6335b;
import p324s3.InterfaceC6659g;

/* renamed from: com.google.android.datatransport.cct.a */
/* loaded from: classes.dex */
public final class C1782a implements InterfaceC6659g {

    /* renamed from: c */
    static final String f7477c;

    /* renamed from: d */
    static final String f7478d;

    /* renamed from: e */
    private static final String f7479e;

    /* renamed from: f */
    private static final Set f7480f;

    /* renamed from: g */
    public static final C1782a f7481g;

    /* renamed from: h */
    public static final C1782a f7482h;

    /* renamed from: a */
    private final String f7483a;

    /* renamed from: b */
    private final String f7484b;

    static {
        String m7893a = AbstractC1786e.m7893a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f7477c = m7893a;
        String m7893a2 = AbstractC1786e.m7893a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f7478d = m7893a2;
        String m7893a3 = AbstractC1786e.m7893a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f7479e = m7893a3;
        f7480f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C6335b.m25117b("proto"), C6335b.m25117b("json"))));
        f7481g = new C1782a(m7893a, null);
        f7482h = new C1782a(m7893a2, m7893a3);
    }

    public C1782a(String str, String str2) {
        this.f7483a = str;
        this.f7484b = str2;
    }

    /* renamed from: c */
    public static C1782a m7872c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Request.DEFAULT_CHARSET));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C1782a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // p324s3.InterfaceC6659g
    /* renamed from: a */
    public Set mo7873a() {
        return f7480f;
    }

    /* renamed from: b */
    public byte[] m7874b() {
        String str = this.f7484b;
        if (str == null && this.f7483a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f7483a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(Request.DEFAULT_CHARSET));
    }

    /* renamed from: d */
    public String m7875d() {
        return this.f7484b;
    }

    /* renamed from: e */
    public String m7876e() {
        return this.f7483a;
    }

    @Override // p324s3.InterfaceC6658f
    public byte[] getExtras() {
        return m7874b();
    }

    @Override // p324s3.InterfaceC6658f
    public String getName() {
        return "cct";
    }
}
