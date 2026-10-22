package kotlinx.coroutines.internal;

import java.util.Arrays;
import ne.AbstractC5868k;

/* renamed from: kotlinx.coroutines.internal.x */
/* loaded from: classes3.dex */
public abstract class AbstractC5285x {
    private volatile int _size = 0;

    /* renamed from: a */
    private InterfaceC5286y[] f21514a;

    /* renamed from: f */
    private final InterfaceC5286y[] m21267f() {
        InterfaceC5286y[] interfaceC5286yArr = this.f21514a;
        if (interfaceC5286yArr == null) {
            InterfaceC5286y[] interfaceC5286yArr2 = new InterfaceC5286y[4];
            this.f21514a = interfaceC5286yArr2;
            return interfaceC5286yArr2;
        }
        if (m21274c() >= interfaceC5286yArr.length) {
            Object[] copyOf = Arrays.copyOf(interfaceC5286yArr, m21274c() * 2);
            AbstractC5868k.m23673e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            InterfaceC5286y[] interfaceC5286yArr3 = (InterfaceC5286y[]) copyOf;
            this.f21514a = interfaceC5286yArr3;
            return interfaceC5286yArr3;
        }
        return interfaceC5286yArr;
    }

    /* renamed from: j */
    private final void m21268j(int i10) {
        this._size = i10;
    }

    /* renamed from: k */
    private final void m21269k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= m21274c()) {
                return;
            }
            InterfaceC5286y[] interfaceC5286yArr = this.f21514a;
            AbstractC5868k.m23671c(interfaceC5286yArr);
            int i12 = i11 + 1;
            if (i12 < m21274c()) {
                InterfaceC5286y interfaceC5286y = interfaceC5286yArr[i12];
                AbstractC5868k.m23671c(interfaceC5286y);
                InterfaceC5286y interfaceC5286y2 = interfaceC5286yArr[i11];
                AbstractC5868k.m23671c(interfaceC5286y2);
                if (((Comparable) interfaceC5286y).compareTo(interfaceC5286y2) < 0) {
                    i11 = i12;
                }
            }
            InterfaceC5286y interfaceC5286y3 = interfaceC5286yArr[i10];
            AbstractC5868k.m23671c(interfaceC5286y3);
            InterfaceC5286y interfaceC5286y4 = interfaceC5286yArr[i11];
            AbstractC5868k.m23671c(interfaceC5286y4);
            if (((Comparable) interfaceC5286y3).compareTo(interfaceC5286y4) <= 0) {
                return;
            }
            m21271m(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: l */
    private final void m21270l(int i10) {
        while (i10 > 0) {
            InterfaceC5286y[] interfaceC5286yArr = this.f21514a;
            AbstractC5868k.m23671c(interfaceC5286yArr);
            int i11 = (i10 - 1) / 2;
            InterfaceC5286y interfaceC5286y = interfaceC5286yArr[i11];
            AbstractC5868k.m23671c(interfaceC5286y);
            InterfaceC5286y interfaceC5286y2 = interfaceC5286yArr[i10];
            AbstractC5868k.m23671c(interfaceC5286y2);
            if (((Comparable) interfaceC5286y).compareTo(interfaceC5286y2) <= 0) {
                return;
            }
            m21271m(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: m */
    private final void m21271m(int i10, int i11) {
        InterfaceC5286y[] interfaceC5286yArr = this.f21514a;
        AbstractC5868k.m23671c(interfaceC5286yArr);
        InterfaceC5286y interfaceC5286y = interfaceC5286yArr[i11];
        AbstractC5868k.m23671c(interfaceC5286y);
        InterfaceC5286y interfaceC5286y2 = interfaceC5286yArr[i10];
        AbstractC5868k.m23671c(interfaceC5286y2);
        interfaceC5286yArr[i10] = interfaceC5286y;
        interfaceC5286yArr[i11] = interfaceC5286y2;
        interfaceC5286y.mo21282c(i10);
        interfaceC5286y2.mo21282c(i11);
    }

    /* renamed from: a */
    public final void m21272a(InterfaceC5286y interfaceC5286y) {
        interfaceC5286y.mo21280a(this);
        InterfaceC5286y[] m21267f = m21267f();
        int m21274c = m21274c();
        m21268j(m21274c + 1);
        m21267f[m21274c] = interfaceC5286y;
        interfaceC5286y.mo21282c(m21274c);
        m21270l(m21274c);
    }

    /* renamed from: b */
    public final InterfaceC5286y m21273b() {
        InterfaceC5286y[] interfaceC5286yArr = this.f21514a;
        if (interfaceC5286yArr != null) {
            return interfaceC5286yArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m21274c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean m21275d() {
        if (m21274c() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final InterfaceC5286y m21276e() {
        InterfaceC5286y m21273b;
        synchronized (this) {
            m21273b = m21273b();
        }
        return m21273b;
    }

    /* renamed from: g */
    public final boolean m21277g(InterfaceC5286y interfaceC5286y) {
        boolean z10;
        synchronized (this) {
            if (interfaceC5286y.mo21281b() == null) {
                z10 = false;
            } else {
                m21278h(interfaceC5286y.mo21283e());
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: h */
    public final InterfaceC5286y m21278h(int i10) {
        InterfaceC5286y[] interfaceC5286yArr = this.f21514a;
        AbstractC5868k.m23671c(interfaceC5286yArr);
        m21268j(m21274c() - 1);
        if (i10 < m21274c()) {
            m21271m(i10, m21274c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                InterfaceC5286y interfaceC5286y = interfaceC5286yArr[i10];
                AbstractC5868k.m23671c(interfaceC5286y);
                InterfaceC5286y interfaceC5286y2 = interfaceC5286yArr[i11];
                AbstractC5868k.m23671c(interfaceC5286y2);
                if (((Comparable) interfaceC5286y).compareTo(interfaceC5286y2) < 0) {
                    m21271m(i10, i11);
                    m21270l(i11);
                }
            }
            m21269k(i10);
        }
        InterfaceC5286y interfaceC5286y3 = interfaceC5286yArr[m21274c()];
        AbstractC5868k.m23671c(interfaceC5286y3);
        interfaceC5286y3.mo21280a(null);
        interfaceC5286y3.mo21282c(-1);
        interfaceC5286yArr[m21274c()] = null;
        return interfaceC5286y3;
    }

    /* renamed from: i */
    public final InterfaceC5286y m21279i() {
        InterfaceC5286y interfaceC5286y;
        synchronized (this) {
            if (m21274c() > 0) {
                interfaceC5286y = m21278h(0);
            } else {
                interfaceC5286y = null;
            }
        }
        return interfaceC5286y;
    }
}
