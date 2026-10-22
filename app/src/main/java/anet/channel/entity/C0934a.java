package anet.channel.entity;

import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.entity.a */
/* loaded from: classes.dex */
public class C0934a {

    /* renamed from: a */
    public final IConnStrategy f3875a;

    /* renamed from: b */
    public int f3876b = 0;

    /* renamed from: c */
    public int f3877c = 0;

    /* renamed from: d */
    private String f3878d;

    /* renamed from: e */
    private String f3879e;

    public C0934a(String str, String str2, IConnStrategy iConnStrategy) {
        this.f3875a = iConnStrategy;
        this.f3878d = str;
        this.f3879e = str2;
    }

    /* renamed from: a */
    public String m4572a() {
        IConnStrategy iConnStrategy = this.f3875a;
        if (iConnStrategy != null) {
            return iConnStrategy.getIp();
        }
        return null;
    }

    /* renamed from: b */
    public int m4573b() {
        IConnStrategy iConnStrategy = this.f3875a;
        if (iConnStrategy != null) {
            return iConnStrategy.getPort();
        }
        return 0;
    }

    /* renamed from: c */
    public ConnType m4574c() {
        IConnStrategy iConnStrategy = this.f3875a;
        if (iConnStrategy != null) {
            return ConnType.valueOf(iConnStrategy.getProtocol());
        }
        return ConnType.HTTP;
    }

    /* renamed from: d */
    public int m4575d() {
        IConnStrategy iConnStrategy = this.f3875a;
        if (iConnStrategy == null || iConnStrategy.getConnectionTimeout() == 0) {
            return 20000;
        }
        return this.f3875a.getConnectionTimeout();
    }

    /* renamed from: e */
    public int m4576e() {
        IConnStrategy iConnStrategy = this.f3875a;
        if (iConnStrategy == null || iConnStrategy.getReadTimeout() == 0) {
            return 20000;
        }
        return this.f3875a.getReadTimeout();
    }

    /* renamed from: f */
    public String m4577f() {
        return this.f3878d;
    }

    /* renamed from: g */
    public int m4578g() {
        IConnStrategy iConnStrategy = this.f3875a;
        if (iConnStrategy != null) {
            return iConnStrategy.getHeartbeat();
        }
        return 45000;
    }

    /* renamed from: h */
    public String m4579h() {
        return this.f3879e;
    }

    public String toString() {
        return "ConnInfo [ip=" + m4572a() + ",port=" + m4573b() + ",type=" + m4574c() + ",hb" + m4578g() + "]";
    }
}
