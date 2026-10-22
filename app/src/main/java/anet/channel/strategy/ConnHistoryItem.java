package anet.channel.strategy;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ConnHistoryItem implements Serializable {

    /* renamed from: a */
    byte f4073a = 0;

    /* renamed from: b */
    long f4074b = 0;

    /* renamed from: c */
    long f4075c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4697a(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - (z10 ? this.f4074b : this.f4075c) > 10000) {
            this.f4073a = (byte) ((this.f4073a << 1) | (!z10 ? 1 : 0));
            if (z10) {
                this.f4074b = currentTimeMillis;
            } else {
                this.f4075c = currentTimeMillis;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m4698b() {
        if ((this.f4073a & 1) == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m4699c() {
        if (m4696a() < 3 || System.currentTimeMillis() - this.f4075c > 300000) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m4700d() {
        long j10 = this.f4074b;
        long j11 = this.f4075c;
        if (j10 <= j11) {
            j10 = j11;
        }
        if (j10 != 0 && System.currentTimeMillis() - j10 > 86400000) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m4696a() {
        int i10 = 0;
        for (int i11 = this.f4073a & 255; i11 > 0; i11 >>= 1) {
            i10 += i11 & 1;
        }
        return i10;
    }
}
