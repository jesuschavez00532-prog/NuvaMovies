package cc;

import java.util.List;
import ne.AbstractC5868k;
import okhttp3.Dns;
import p417yb.C7697b;

/* renamed from: cc.u */
/* loaded from: classes.dex */
public final class C1475u implements Dns {

    /* renamed from: a */
    private C7697b f5660a = C7697b.f28151f.m29575a();

    @Override // okhttp3.Dns
    public List lookup(String str) {
        AbstractC5868k.m23674f(str, "hostname");
        return this.f5660a.m29573j(str, ".advert");
    }
}
