package p416ya;

import java.util.List;
import ne.AbstractC5868k;
import okhttp3.Dns;
import p417yb.C7697b;

/* renamed from: ya.e */
/* loaded from: classes2.dex */
public final class C7695e implements Dns {

    /* renamed from: a */
    private C7697b f28145a = C7697b.f28151f.m29575a();

    @Override // okhttp3.Dns
    public List lookup(String str) {
        AbstractC5868k.m23674f(str, "hostname");
        return this.f28145a.m29573j(str, ".img");
    }
}
