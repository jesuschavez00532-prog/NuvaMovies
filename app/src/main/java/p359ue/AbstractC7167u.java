package p359ue;

import anet.channel.strategy.dispatch.DispatchConstants;
import be.AbstractC1324t;
import be.C1318n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1488d;
import p043ce.AbstractC1498j;
import p043ce.AbstractC1513y;
import p344te.AbstractC6945e;
import p344te.InterfaceC6942b;
import re.AbstractC6576d;
import re.C6573a;
import re.C6575c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ue.u */
/* loaded from: classes.dex */
public abstract class AbstractC7167u extends AbstractC7166t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ue.u$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        final /* synthetic */ List f26856a;

        /* renamed from: b */
        final /* synthetic */ boolean f26857b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, boolean z10) {
            super(2);
            this.f26856a = list;
            this.f26857b = z10;
        }

        /* renamed from: a */
        public final C1318n m27768a(CharSequence charSequence, int i10) {
            AbstractC5868k.m23674f(charSequence, "$this$$receiver");
            C1318n m27764w = AbstractC7167u.m27764w(charSequence, this.f26856a, i10, this.f26857b, false);
            if (m27764w != null) {
                return AbstractC1324t.m5980a(m27764w.m5969c(), Integer.valueOf(((String) m27764w.m5970d()).length()));
            }
            return null;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            return m27768a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: A */
    public static final int m27731A(CharSequence charSequence, String str, int i10, boolean z10) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        AbstractC5868k.m23674f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return m27733C(charSequence, str, i10, charSequence.length(), z10, false, 16, null);
    }

    /* renamed from: B */
    private static final int m27732B(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        C6573a m25671f;
        if (!z11) {
            m25671f = new C6575c(AbstractC6576d.m25666a(i10, 0), AbstractC6576d.m25668c(i11, charSequence.length()));
        } else {
            m25671f = AbstractC6576d.m25671f(AbstractC6576d.m25668c(i10, m27766y(charSequence)), AbstractC6576d.m25666a(i11, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m25656c = m25671f.m25656c();
            int m25657g = m25671f.m25657g();
            int m25658i = m25671f.m25658i();
            if ((m25658i > 0 && m25656c <= m25657g) || (m25658i < 0 && m25657g <= m25656c)) {
                while (!AbstractC7166t.m27726m((String) charSequence2, 0, (String) charSequence, m25656c, charSequence2.length(), z10)) {
                    if (m25656c != m25657g) {
                        m25656c += m25658i;
                    } else {
                        return -1;
                    }
                }
                return m25656c;
            }
            return -1;
        }
        int m25656c2 = m25671f.m25656c();
        int m25657g2 = m25671f.m25657g();
        int m25658i2 = m25671f.m25658i();
        if ((m25658i2 > 0 && m25656c2 <= m25657g2) || (m25658i2 < 0 && m25657g2 <= m25656c2)) {
            while (!m27744N(charSequence2, 0, charSequence, m25656c2, charSequence2.length(), z10)) {
                if (m25656c2 != m25657g2) {
                    m25656c2 += m25658i2;
                } else {
                    return -1;
                }
            }
            return m25656c2;
        }
        return -1;
    }

    /* renamed from: C */
    static /* synthetic */ int m27733C(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        boolean z12 = false;
        if ((i12 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        return m27732B(charSequence, charSequence2, i10, i11, z10, z12);
    }

    /* renamed from: D */
    public static /* synthetic */ int m27734D(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m27767z(charSequence, c10, i10, z10);
    }

    /* renamed from: E */
    public static /* synthetic */ int m27735E(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m27731A(charSequence, str, i10, z10);
    }

    /* renamed from: F */
    public static final int m27736F(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        boolean z11 = false;
        AbstractC5868k.m23674f(charSequence, "<this>");
        AbstractC5868k.m23674f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC1488d.m6945g(cArr), i10);
        }
        AbstractC1513y it = new C6575c(AbstractC6576d.m25666a(i10, 0), m27766y(charSequence)).iterator();
        while (it.hasNext()) {
            int mo7032b = it.mo7032b();
            char charAt = charSequence.charAt(mo7032b);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (AbstractC7148b.m27659d(cArr[i11], charAt, z10)) {
                        z11 = true;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z11) {
                return mo7032b;
            }
        }
        return -1;
    }

    /* renamed from: G */
    public static final int m27737G(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return m27741K(charSequence, new char[]{c10}, i10, z10);
    }

    /* renamed from: H */
    public static final int m27738H(CharSequence charSequence, String str, int i10, boolean z10) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        AbstractC5868k.m23674f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i10);
        }
        return m27732B(charSequence, str, i10, 0, z10, true);
    }

    /* renamed from: I */
    public static /* synthetic */ int m27739I(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m27766y(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m27737G(charSequence, c10, i10, z10);
    }

    /* renamed from: J */
    public static /* synthetic */ int m27740J(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m27766y(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m27738H(charSequence, str, i10, z10);
    }

    /* renamed from: K */
    public static final int m27741K(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        AbstractC5868k.m23674f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC1488d.m6945g(cArr), i10);
        }
        for (int m25668c = AbstractC6576d.m25668c(i10, m27766y(charSequence)); -1 < m25668c; m25668c--) {
            char charAt = charSequence.charAt(m25668c);
            int length = cArr.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (AbstractC7148b.m27659d(cArr[i11], charAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return m25668c;
            }
        }
        return -1;
    }

    /* renamed from: L */
    private static final InterfaceC6942b m27742L(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        m27745O(i11);
        return new C7150d(charSequence, i10, i11, new a(AbstractC1488d.m6943a(strArr), z10));
    }

    /* renamed from: M */
    static /* synthetic */ InterfaceC6942b m27743M(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m27742L(charSequence, strArr, i10, z10, i11);
    }

    /* renamed from: N */
    public static final boolean m27744N(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        AbstractC5868k.m23674f(charSequence2, DispatchConstants.OTHER);
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!AbstractC7148b.m27659d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: O */
    public static final void m27745O(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    /* renamed from: P */
    public static final List m27746P(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        AbstractC5868k.m23674f(strArr, "delimiters");
        boolean z11 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                return m27747Q(charSequence, str, z10, i10);
            }
        }
        Iterable m26984e = AbstractC6945e.m26984e(m27743M(charSequence, strArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1498j.m6973k(m26984e, 10));
        Iterator it = m26984e.iterator();
        while (it.hasNext()) {
            arrayList.add(m27749S(charSequence, (C6575c) it.next()));
        }
        return arrayList;
    }

    /* renamed from: Q */
    private static final List m27747Q(CharSequence charSequence, String str, boolean z10, int i10) {
        boolean z11 = false;
        m27745O(i10);
        int i11 = 0;
        int m27731A = m27731A(charSequence, str, 0, z10);
        if (m27731A != -1 && i10 != 1) {
            if (i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = 10;
            if (z11) {
                i12 = AbstractC6576d.m25668c(i10, 10);
            }
            ArrayList arrayList = new ArrayList(i12);
            do {
                arrayList.add(charSequence.subSequence(i11, m27731A).toString());
                i11 = str.length() + m27731A;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                m27731A = m27731A(charSequence, str, i11, z10);
            } while (m27731A != -1);
            arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            return arrayList;
        }
        return AbstractC1498j.m6964b(charSequence.toString());
    }

    /* renamed from: R */
    public static /* synthetic */ List m27748R(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m27746P(charSequence, strArr, z10, i10);
    }

    /* renamed from: S */
    public static final String m27749S(CharSequence charSequence, C6575c c6575c) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        AbstractC5868k.m23674f(c6575c, "range");
        return charSequence.subSequence(c6575c.m25664p().intValue(), c6575c.m25663o().intValue() + 1).toString();
    }

    /* renamed from: T */
    public static final String m27750T(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "<this>");
        AbstractC5868k.m23674f(str2, "delimiter");
        AbstractC5868k.m23674f(str3, "missingDelimiterValue");
        int m27689E = AbstractC7157k.m27689E(str, str2, 0, false, 6, null);
        if (m27689E != -1) {
            String substring = str.substring(m27689E + str2.length(), str.length());
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str3;
    }

    /* renamed from: U */
    public static /* synthetic */ String m27751U(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m27750T(str, str2, str3);
    }

    /* renamed from: V */
    public static final String m27752V(String str, char c10, String str2) {
        AbstractC5868k.m23674f(str, "<this>");
        AbstractC5868k.m23674f(str2, "missingDelimiterValue");
        int m27690I = AbstractC7157k.m27690I(str, c10, 0, false, 6, null);
        if (m27690I != -1) {
            String substring = str.substring(m27690I + 1, str.length());
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    /* renamed from: W */
    public static /* synthetic */ String m27753W(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m27752V(str, c10, str2);
    }

    /* renamed from: X */
    public static final String m27754X(String str, char c10, String str2) {
        AbstractC5868k.m23674f(str, "<this>");
        AbstractC5868k.m23674f(str2, "missingDelimiterValue");
        int m27688D = AbstractC7157k.m27688D(str, c10, 0, false, 6, null);
        if (m27688D != -1) {
            String substring = str.substring(0, m27688D);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    /* renamed from: Y */
    public static final String m27755Y(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "<this>");
        AbstractC5868k.m23674f(str2, "delimiter");
        AbstractC5868k.m23674f(str3, "missingDelimiterValue");
        int m27689E = AbstractC7157k.m27689E(str, str2, 0, false, 6, null);
        if (m27689E != -1) {
            String substring = str.substring(0, m27689E);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str3;
    }

    /* renamed from: Z */
    public static /* synthetic */ String m27756Z(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m27754X(str, c10, str2);
    }

    /* renamed from: a0 */
    public static /* synthetic */ String m27757a0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m27755Y(str, str2, str3);
    }

    /* renamed from: b0 */
    public static CharSequence m27758b0(CharSequence charSequence) {
        int i10 = 0;
        AbstractC5868k.m23674f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            if (!z10) {
                i10 = i11;
            } else {
                i10 = length;
            }
            boolean m27658c = AbstractC7147a.m27658c(charSequence.charAt(i10));
            if (!z10) {
                if (!m27658c) {
                    z10 = true;
                } else {
                    i11++;
                }
            } else {
                if (!m27658c) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    /* renamed from: s */
    public static final boolean m27760s(CharSequence charSequence, char c10, boolean z10) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        if (AbstractC7157k.m27688D(charSequence, c10, 0, z10, 2, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m27761t(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        AbstractC5868k.m23674f(charSequence2, DispatchConstants.OTHER);
        if (charSequence2 instanceof String) {
            if (AbstractC7157k.m27689E(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (m27733C(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m27762u(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m27760s(charSequence, c10, z10);
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m27763v(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return AbstractC7157k.m27711t(charSequence, charSequence2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final C1318n m27764w(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        C6573a m25671f;
        Object obj = null;
        Object obj2 = null;
        int m27691J;
        if (!z10 && collection.size() == 1) {
            String str = (String) AbstractC1498j.m6981y(collection);
            if (!z11) {
                m27691J = AbstractC7157k.m27689E(charSequence, str, i10, false, 4, null);
            } else {
                m27691J = AbstractC7157k.m27691J(charSequence, str, i10, false, 4, null);
            }
            if (m27691J < 0) {
                return null;
            }
            return AbstractC1324t.m5980a(Integer.valueOf(m27691J), str);
        }
        if (!z11) {
            m25671f = new C6575c(AbstractC6576d.m25666a(i10, 0), charSequence.length());
        } else {
            m25671f = AbstractC6576d.m25671f(AbstractC6576d.m25668c(i10, m27766y(charSequence)), 0);
        }
        if (charSequence instanceof String) {
            int m25656c = m25671f.m25656c();
            int m25657g = m25671f.m25657g();
            int m25658i = m25671f.m25658i();
            if ((m25658i > 0 && m25656c <= m25657g) || (m25658i < 0 && m25657g <= m25656c)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            if (AbstractC7166t.m27726m(str2, 0, (String) charSequence, m25656c, str2.length(), z10)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return AbstractC1324t.m5980a(Integer.valueOf(m25656c), str3);
                    }
                    if (m25656c == m25657g) {
                        break;
                    }
                    m25656c += m25658i;
                }
            }
        } else {
            int m25656c2 = m25671f.m25656c();
            int m25657g2 = m25671f.m25657g();
            int m25658i2 = m25671f.m25658i();
            if ((m25658i2 > 0 && m25656c2 <= m25657g2) || (m25658i2 < 0 && m25657g2 <= m25656c2)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (m27744N(str4, 0, charSequence, m25656c2, str4.length(), z10)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return AbstractC1324t.m5980a(Integer.valueOf(m25656c2), str5);
                    }
                    if (m25656c2 == m25657g2) {
                        break;
                    }
                    m25656c2 += m25658i2;
                }
            }
        }
        return null;
    }

    /* renamed from: x */
    public static final C6575c m27765x(CharSequence charSequence) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        return new C6575c(0, charSequence.length() - 1);
    }

    /* renamed from: y */
    public static final int m27766y(CharSequence charSequence) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: z */
    public static final int m27767z(CharSequence charSequence, char c10, int i10, boolean z10) {
        AbstractC5868k.m23674f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return m27736F(charSequence, new char[]{c10}, i10, z10);
    }
}
