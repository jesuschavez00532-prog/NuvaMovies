package p345u;

import android.util.Base64;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.List;
import p373w.AbstractC7342g;

/* renamed from: u.d */
/* loaded from: classes.dex */
public final class C7003d {

    /* renamed from: a */
    private final String f26332a;

    /* renamed from: b */
    private final String f26333b;

    /* renamed from: c */
    private final String f26334c;

    /* renamed from: d */
    private final List f26335d;

    /* renamed from: e */
    private final int f26336e = 0;

    /* renamed from: f */
    private final String f26337f;

    public C7003d(String str, String str2, String str3, List list) {
        this.f26332a = (String) AbstractC7342g.m28327g(str);
        this.f26333b = (String) AbstractC7342g.m28327g(str2);
        this.f26334c = (String) AbstractC7342g.m28327g(str3);
        this.f26335d = (List) AbstractC7342g.m28327g(list);
        this.f26337f = m27020a(str, str2, str3);
    }

    /* renamed from: a */
    private String m27020a(String str, String str2, String str3) {
        return str + Operator.Operation.MINUS + str2 + Operator.Operation.MINUS + str3;
    }

    /* renamed from: b */
    public List m27021b() {
        return this.f26335d;
    }

    /* renamed from: c */
    public int m27022c() {
        return this.f26336e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m27023d() {
        return this.f26337f;
    }

    /* renamed from: e */
    public String m27024e() {
        return this.f26332a;
    }

    /* renamed from: f */
    public String m27025f() {
        return this.f26333b;
    }

    /* renamed from: g */
    public String m27026g() {
        return this.f26334c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f26332a + ", mProviderPackage: " + this.f26333b + ", mQuery: " + this.f26334c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f26335d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f26335d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f26336e);
        return sb2.toString();
    }
}
