package p242n0;

import com.umeng.ccg.C3417a;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import ne.AbstractC5868k;
import p184j1.InterfaceC4975f;

/* renamed from: n0.i */
/* loaded from: classes.dex */
public final class C5722i implements InterfaceC4975f {

    /* renamed from: b */
    private final String f22986b;

    /* renamed from: c */
    private final InterfaceC4975f f22987c;

    public C5722i(String str, InterfaceC4975f interfaceC4975f) {
        AbstractC5868k.m23674f(str, "id");
        AbstractC5868k.m23674f(interfaceC4975f, C3417a.f15002x);
        this.f22986b = str;
        this.f22987c = interfaceC4975f;
    }

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        AbstractC5868k.m23674f(messageDigest, "messageDigest");
        String str = this.f22986b;
        Charset charset = InterfaceC4975f.f20711a;
        AbstractC5868k.m23673e(charset, "CHARSET");
        byte[] bytes = str.getBytes(charset);
        AbstractC5868k.m23673e(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        this.f22987c.mo16761a(messageDigest);
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC5868k.m23669a(C5722i.class, obj.getClass())) {
            return false;
        }
        C5722i c5722i = (C5722i) obj;
        if (!AbstractC5868k.m23669a(this.f22986b, c5722i.f22986b)) {
            return false;
        }
        return AbstractC5868k.m23669a(this.f22987c, c5722i.f22987c);
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        return (this.f22986b.hashCode() * 31) + this.f22987c.hashCode();
    }
}
