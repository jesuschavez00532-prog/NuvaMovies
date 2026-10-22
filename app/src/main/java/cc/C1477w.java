package cc;

import java.util.List;
import ne.AbstractC5868k;
import okhttp3.Dns;
import p417yb.C7697b;

/* renamed from: cc.w */
/* loaded from: classes.dex */
public final class C1477w implements Dns {

    /* renamed from: a */
    private String f5664a;

    /* renamed from: b */
    private C7697b f5665b;

    public C1477w(String str) {
        AbstractC5868k.m23674f(str, "mark");
        this.f5664a = str;
        this.f5665b = C7697b.f28151f.m29575a();
    }

    @Override // okhttp3.Dns
    public List lookup(String str) {
        AbstractC5868k.m23674f(str, "hostname");
        return this.f5665b.m29573j(str, this.f5664a);
    }
}
