package p400xa;

import p170i2.C4842a;
import p359ue.AbstractC7166t;

/* renamed from: xa.e1 */
/* loaded from: classes2.dex */
public final class C7565e1 {

    /* renamed from: a */
    public static final C7565e1 f27773a = new C7565e1();

    private C7565e1() {
    }

    /* renamed from: a */
    public final int m28996a(String str) {
        boolean m27723j;
        boolean m27723j2;
        boolean m27723j3;
        boolean m27723j4;
        boolean m27723j5;
        m27723j = AbstractC7166t.m27723j("4K", str, true);
        if (!m27723j) {
            m27723j2 = AbstractC7166t.m27723j("1080P", str, true);
            if (!m27723j2) {
                m27723j3 = AbstractC7166t.m27723j("720P", str, true);
                if (!m27723j3) {
                    m27723j4 = AbstractC7166t.m27723j("480P", str, true);
                    if (!m27723j4) {
                        m27723j5 = AbstractC7166t.m27723j("av1", str, true);
                        if (m27723j5 && C4842a.f20329a.m19920a().m19932I()) {
                            return 10;
                        }
                        return 0;
                    }
                    return 1;
                }
                return 2;
            }
            return 3;
        }
        return 4;
    }

    /* renamed from: b */
    public final String m28997b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "" : "4K" : "1080p" : "720p" : "480p";
    }

    /* renamed from: c */
    public final int m28998c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 5;
        }
        return 4;
    }
}
