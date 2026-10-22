package cc;

import android.content.Context;
import com.umeng.analytics.pro.C3384f;
import java.util.List;
import ne.AbstractC5868k;
import okhttp3.Dns;
import p343tb.InterfaceC6930b;
import p417yb.C7697b;

/* renamed from: cc.v */
/* loaded from: classes.dex */
public final class C1476v implements Dns {

    /* renamed from: a */
    private final Context f5661a;

    /* renamed from: b */
    private C7697b f5662b;

    /* renamed from: cc.v$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC6930b {
        a() {
        }

        @Override // p343tb.InterfaceC6930b
        /* renamed from: a */
        public void mo6921a(String str, String str2, String str3, String str4) {
            AbstractC5868k.m23674f(str, "type");
            AbstractC5868k.m23674f(str2, "hostnameMapper");
            AbstractC5868k.m23674f(str3, "mapper");
            AbstractC5868k.m23674f(str4, "resolver");
            C1451f.f5570a.m6756a(C1476v.this.m6920a(), str, str2, str3, str4);
        }
    }

    public C1476v(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f5661a = context;
        this.f5662b = C7697b.f28151f.m29575a();
    }

    /* renamed from: a */
    public final Context m6920a() {
        return this.f5661a;
    }

    @Override // okhttp3.Dns
    public List lookup(String str) {
        AbstractC5868k.m23674f(str, "hostname");
        this.f5662b.m29574o(new a());
        return this.f5662b.m29573j(str, ".bigbee");
    }
}
