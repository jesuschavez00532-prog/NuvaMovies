package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C1002l;
import java.io.Serializable;

/* loaded from: classes.dex */
class IPConnStrategy implements IConnStrategy, Serializable {
    public static final int SOURCE_AMDC = 0;
    public static final int SOURCE_CUSTOMIZED = 2;
    public static final int SOURCE_LOCAL_DNS = 1;
    public static final int TYPE_IP_TO_HOST = -1;
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_STATIC_BANDWITDH = 0;

    /* renamed from: a */
    volatile int f4076a = 1;

    /* renamed from: b */
    volatile int f4077b = 1;

    /* renamed from: c */
    transient boolean f4078c;
    public volatile int cto;
    public volatile int heartbeat;

    /* renamed from: ip */
    public final String f4079ip;
    public final int port;
    public final ConnProtocol protocol;
    public volatile int retry;
    public volatile int rto;

    private IPConnStrategy(String str, int i10, ConnProtocol connProtocol, int i11, int i12, int i13, int i14) {
        this.f4079ip = str;
        this.port = i10;
        this.protocol = connProtocol;
        this.cto = i11;
        this.rto = i12;
        this.retry = i13;
        this.heartbeat = i14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static IPConnStrategy m4702a(String str, C1002l.a aVar) {
        ConnProtocol valueOf = ConnProtocol.valueOf(aVar);
        if (valueOf == null) {
            return null;
        }
        return m4701a(str, aVar.f4147a, valueOf, aVar.f4149c, aVar.f4150d, aVar.f4151e, aVar.f4152f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IPConnStrategy)) {
            return false;
        }
        IPConnStrategy iPConnStrategy = (IPConnStrategy) obj;
        if (this.port == iPConnStrategy.port && this.f4079ip.equals(iPConnStrategy.f4079ip) && this.protocol.equals(iPConnStrategy.protocol)) {
            return true;
        }
        return false;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.cto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return this.heartbeat;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f4079ip;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return this.f4077b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return this.f4076a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.port;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.protocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.rto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return this.retry;
    }

    public int getUniqueId() {
        return hashCode();
    }

    public int hashCode() {
        return ((((527 + this.f4079ip.hashCode()) * 31) + this.port) * 31) + this.protocol.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('{');
        sb2.append(this.f4079ip);
        if (this.f4076a == 0) {
            sb2.append("(*)");
        }
        sb2.append(' ');
        sb2.append(this.port);
        sb2.append(' ');
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static IPConnStrategy m4701a(String str, int i10, ConnProtocol connProtocol, int i11, int i12, int i13, int i14) {
        if (TextUtils.isEmpty(str) || connProtocol == null || i10 <= 0) {
            return null;
        }
        return new IPConnStrategy(str, i10, connProtocol, i11, i12, i13, i14);
    }
}
