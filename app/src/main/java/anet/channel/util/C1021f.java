package anet.channel.util;

import com.raizlabs.android.dbflow.sql.language.Operator;
import java.net.Inet6Address;

/* renamed from: anet.channel.util.f */
/* loaded from: classes.dex */
public class C1021f {

    /* renamed from: a */
    public int f4219a;

    /* renamed from: b */
    public Inet6Address f4220b;

    public C1021f(Inet6Address inet6Address, int i10) {
        this.f4219a = i10;
        this.f4220b = inet6Address;
    }

    public String toString() {
        return this.f4220b.getHostAddress() + Operator.Operation.DIVISION + this.f4219a;
    }
}
