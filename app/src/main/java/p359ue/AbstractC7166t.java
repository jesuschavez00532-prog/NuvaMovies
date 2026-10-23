package p359ue;

import anet.channel.strategy.dispatch.DispatchConstants;
import java.util.Collection;
import java.util.Iterator;
import ne.AbstractC5868k;
import p043ce.AbstractC1513y;
import re.AbstractC6578f;

/* renamed from: ue.t */
/* loaded from: classes.dex */
public abstract class AbstractC7166t extends AbstractC7165s {
    /* renamed from: g */
    public static int m27720g(String str, String str2, boolean z10) {
        AbstractC5868k.m23674f(str, "<this>");
        AbstractC5868k.m23674f(str2, DispatchConstants.OTHER);
        if (z10) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    /* renamed from: h */
    public static boolean m27721h(String str, String str2, boolean z10) {
        AbstractC5868k.m23674f(str, "<this>");
        AbstractC5868k.m23674f(str2, "suffix");
        if (!z10) {
            return str.endsWith(str2);
        }
        return m27726m(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m27722i(String str, String str2, boolean z10, int i10, Object obj) {
        boolean m27721h;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m27721h = m27721h(str, str2, z10);
        return m27721h;
    }

    /* renamed from: j */
    public static boolean m27723j(String str, String str2, boolean z10) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z10) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: k */
    public static /* synthetic */ boolean m27724k(String str, String str2, boolean z10, int i10, Object obj) {
        boolean m27723j;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m27723j = m27723j(str, str2, z10);
        return m27723j;
    }

    /* renamed from: l */
    public static boolean m27725l(CharSequence charSequence) {
        boolean z10 = false;
        AbstractC5868k.m23674f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable m27765x = AbstractC7167u.m27765x(charSequence);
        if (!(m27765x instanceof Collection) || !((Collection) m27765x).isEmpty()) {
            Iterator it = m27765x.iterator();
            while (it.hasNext()) {
                if (!AbstractC7147a.m27658c(charSequence.charAt(((AbstractC1513y) it).mo7032b()))) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m27726m(String str, int i10, String str2, int i11, int i12, boolean z10) {
        AbstractC5868k.m23674f(str, "<this>");
        AbstractC5868k.m23674f(str2, DispatchConstants.OTHER);
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    /* renamed from: n */
    public static final String m27727n(String str, String str2, String str3, boolean z10) {
        int m25673a;
        AbstractC5868k.m23674f(str, "<this>");
        AbstractC5868k.m23674f(str2, "oldValue");
        AbstractC5868k.m23674f(str3, "newValue");
        int i10 = 0;
        int m27731A = AbstractC7167u.m27731A(str, str2, 0, z10);
        if (m27731A < 0) {
            return str;
        }
        int length = str2.length();
        m25673a = AbstractC6578f.m25673a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i10, m27731A);
                sb2.append(str3);
                i10 = m27731A + length;
                if (m27731A >= str.length()) {
                    break;
                }
                m27731A = AbstractC7167u.m27731A(str, str2, m27731A + m25673a, z10);
            } while (m27731A > 0);
            sb2.append((CharSequence) str, i10, str.length());
            String sb3 = sb2.toString();
            AbstractC5868k.m23673e(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: o */
    public static /* synthetic */ String m27728o(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m27727n(str, str2, str3, z10);
    }

    /* renamed from: p */
    public static boolean m27729p(String str, String str2, boolean z10) {
        AbstractC5868k.m23674f(str, "<this>");
        AbstractC5868k.m23674f(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return m27726m(str, 0, str2, 0, str2.length(), z10);
    }

    /* renamed from: q */
    public static /* synthetic */ boolean m27730q(String str, String str2, boolean z10, int i10, Object obj) {
        boolean m27729p;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m27729p = m27729p(str, str2, z10);
        return m27729p;
    }
}
