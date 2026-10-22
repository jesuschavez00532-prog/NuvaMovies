package kotlinx.coroutines.internal;

import p359ue.AbstractC7165s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.internal.v */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5283v {
    /* renamed from: a */
    public static final int m21255a(String str, int i10, int i11, int i12) {
        return (int) AbstractC5281t.m21248c(str, i10, i11, i12);
    }

    /* renamed from: b */
    public static final long m21256b(String str, long j10, long j11, long j12) {
        Long m27718e;
        String m21249d = AbstractC5281t.m21249d(str);
        if (m21249d != null) {
            m27718e = AbstractC7165s.m27718e(m21249d);
            if (m27718e != null) {
                long longValue = m27718e.longValue();
                if (j11 <= longValue && j12 >= longValue) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m21249d + '\'').toString());
        }
        return j10;
    }

    /* renamed from: c */
    public static final boolean m21257c(String str, boolean z10) {
        String m21249d = AbstractC5281t.m21249d(str);
        if (m21249d != null) {
            return Boolean.parseBoolean(m21249d);
        }
        return z10;
    }

    /* renamed from: d */
    public static /* synthetic */ int m21258d(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return AbstractC5281t.m21247b(str, i10, i11, i12);
    }

    /* renamed from: e */
    public static /* synthetic */ long m21259e(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return AbstractC5281t.m21248c(str, j10, j13, j12);
    }
}
