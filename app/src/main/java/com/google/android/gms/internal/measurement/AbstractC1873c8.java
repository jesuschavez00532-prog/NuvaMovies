package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.c8 */
/* loaded from: classes.dex */
public abstract class AbstractC1873c8 implements Iterable, Serializable {

    /* renamed from: b */
    public static final AbstractC1873c8 f7691b = new C2221z7(AbstractC1938g9.f7768d);

    /* renamed from: c */
    private static final Comparator f7692c;

    /* renamed from: d */
    private static final C1857b8 f7693d;

    /* renamed from: a */
    private int f7694a = 0;

    static {
        int i10 = AbstractC2056o7.f7980a;
        f7693d = new C1857b8(null);
        f7692c = new C2131t7();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static int m8177q(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
                }
                throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        return i13;
    }

    /* renamed from: u */
    public static AbstractC1873c8 m8178u(byte[] bArr, int i10, int i11) {
        m8177q(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C2221z7(bArr2);
    }

    /* renamed from: v */
    public static AbstractC1873c8 m8179v(String str) {
        return new C2221z7(str.getBytes(AbstractC1938g9.f7766b));
    }

    /* renamed from: c */
    public abstract byte mo8180c(int i10);

    public abstract boolean equals(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract byte mo8181g(int i10);

    public final int hashCode() {
        int i10 = this.f7694a;
        if (i10 == 0) {
            int mo8182i = mo8182i();
            i10 = mo8183j(mo8182i, 0, mo8182i);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f7694a = i10;
        }
        return i10;
    }

    /* renamed from: i */
    public abstract int mo8182i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2116s7(this);
    }

    /* renamed from: j */
    protected abstract int mo8183j(int i10, int i11, int i12);

    /* renamed from: k */
    public abstract AbstractC1873c8 mo8184k(int i10, int i11);

    /* renamed from: n */
    protected abstract String mo8185n(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo8186o(AbstractC2101r7 abstractC2101r7);

    /* renamed from: p */
    public abstract boolean mo8187p();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final int m8188t() {
        return this.f7694a;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo8182i());
        if (mo8182i() <= 50) {
            concat = AbstractC2119sa.m8913a(this);
        } else {
            concat = AbstractC2119sa.m8913a(mo8184k(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: w */
    public final String m8189w(Charset charset) {
        if (mo8182i() == 0) {
            return "";
        }
        return mo8185n(charset);
    }
}
