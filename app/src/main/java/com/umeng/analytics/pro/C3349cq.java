package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C3360da;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.umeng.analytics.pro.cq */
/* loaded from: classes3.dex */
public class C3349cq {

    /* renamed from: a */
    private final ByteArrayOutputStream f14411a;

    /* renamed from: b */
    private final C3378ds f14412b;

    /* renamed from: c */
    private AbstractC3366dg f14413c;

    public C3349cq() {
        this(new C3360da.a());
    }

    /* renamed from: a */
    public byte[] m14096a(InterfaceC3340ch interfaceC3340ch) {
        this.f14411a.reset();
        interfaceC3340ch.write(this.f14413c);
        return this.f14411a.toByteArray();
    }

    /* renamed from: b */
    public String m14097b(InterfaceC3340ch interfaceC3340ch) {
        return new String(m14096a(interfaceC3340ch));
    }

    public C3349cq(InterfaceC3368di interfaceC3368di) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f14411a = byteArrayOutputStream;
        C3378ds c3378ds = new C3378ds(byteArrayOutputStream);
        this.f14412b = c3378ds;
        this.f14413c = interfaceC3368di.mo14177a(c3378ds);
    }

    /* renamed from: a */
    public String m14095a(InterfaceC3340ch interfaceC3340ch, String str) {
        try {
            return new String(m14096a(interfaceC3340ch), str);
        } catch (UnsupportedEncodingException unused) {
            throw new C3346cn("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }
}
