package p360v;

import android.text.SpannableStringBuilder;
import com.umeng.analytics.pro.C3373dn;
import java.util.Locale;

/* renamed from: v.a */
/* loaded from: classes.dex */
public final class C7170a {

    /* renamed from: d */
    static final InterfaceC7185p f26858d;

    /* renamed from: e */
    private static final String f26859e;

    /* renamed from: f */
    private static final String f26860f;

    /* renamed from: g */
    static final C7170a f26861g;

    /* renamed from: h */
    static final C7170a f26862h;

    /* renamed from: a */
    private final boolean f26863a;

    /* renamed from: b */
    private final int f26864b;

    /* renamed from: c */
    private final InterfaceC7185p f26865c;

    /* renamed from: v.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f26866a;

        /* renamed from: b */
        private int f26867b;

        /* renamed from: c */
        private InterfaceC7185p f26868c;

        public a() {
            m27779c(C7170a.m27772e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C7170a m27778b(boolean z10) {
            if (z10) {
                return C7170a.f26862h;
            }
            return C7170a.f26861g;
        }

        /* renamed from: c */
        private void m27779c(boolean z10) {
            this.f26866a = z10;
            this.f26868c = C7170a.f26858d;
            this.f26867b = 2;
        }

        /* renamed from: a */
        public C7170a m27780a() {
            if (this.f26867b == 2 && this.f26868c == C7170a.f26858d) {
                return m27778b(this.f26866a);
            }
            return new C7170a(this.f26866a, this.f26867b, this.f26868c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f */
        private static final byte[] f26869f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f26870a;

        /* renamed from: b */
        private final boolean f26871b;

        /* renamed from: c */
        private final int f26872c;

        /* renamed from: d */
        private int f26873d;

        /* renamed from: e */
        private char f26874e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f26869f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f26870a = charSequence;
            this.f26871b = z10;
            this.f26872c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m27781c(char c10) {
            if (c10 < 1792) {
                return f26869f[c10];
            }
            return Character.getDirectionality(c10);
        }

        /* renamed from: f */
        private byte m27782f() {
            char charAt;
            int i10 = this.f26873d;
            do {
                int i11 = this.f26873d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f26870a;
                int i12 = i11 - 1;
                this.f26873d = i12;
                charAt = charSequence.charAt(i12);
                this.f26874e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f26873d = i10;
            this.f26874e = ';';
            return C3373dn.f14523k;
        }

        /* renamed from: g */
        private byte m27783g() {
            char charAt;
            do {
                int i10 = this.f26873d;
                if (i10 < this.f26872c) {
                    CharSequence charSequence = this.f26870a;
                    this.f26873d = i10 + 1;
                    charAt = charSequence.charAt(i10);
                    this.f26874e = charAt;
                } else {
                    return (byte) 12;
                }
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        private byte m27784h() {
            char charAt;
            int i10 = this.f26873d;
            while (true) {
                int i11 = this.f26873d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f26870a;
                int i12 = i11 - 1;
                this.f26873d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f26874e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f26873d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f26870a;
                            int i14 = i13 - 1;
                            this.f26873d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f26874e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f26873d = i10;
            this.f26874e = '>';
            return C3373dn.f14523k;
        }

        /* renamed from: i */
        private byte m27785i() {
            char charAt;
            int i10 = this.f26873d;
            while (true) {
                int i11 = this.f26873d;
                if (i11 < this.f26872c) {
                    CharSequence charSequence = this.f26870a;
                    this.f26873d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f26874e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f26873d;
                            if (i12 < this.f26872c) {
                                CharSequence charSequence2 = this.f26870a;
                                this.f26873d = i12 + 1;
                                charAt = charSequence2.charAt(i12);
                                this.f26874e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f26873d = i10;
                    this.f26874e = '<';
                    return C3373dn.f14523k;
                }
            }
        }

        /* renamed from: a */
        byte m27786a() {
            char charAt = this.f26870a.charAt(this.f26873d - 1);
            this.f26874e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f26870a, this.f26873d);
                this.f26873d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f26873d--;
            byte m27781c = m27781c(this.f26874e);
            if (this.f26871b) {
                char c10 = this.f26874e;
                if (c10 == '>') {
                    return m27784h();
                }
                if (c10 == ';') {
                    return m27782f();
                }
                return m27781c;
            }
            return m27781c;
        }

        /* renamed from: b */
        byte m27787b() {
            char charAt = this.f26870a.charAt(this.f26873d);
            this.f26874e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f26870a, this.f26873d);
                this.f26873d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f26873d++;
            byte m27781c = m27781c(this.f26874e);
            if (this.f26871b) {
                char c10 = this.f26874e;
                if (c10 == '<') {
                    return m27785i();
                }
                if (c10 == '&') {
                    return m27783g();
                }
                return m27781c;
            }
            return m27781c;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:46:0x0045. Please report as an issue. */
        /* renamed from: d */
        int m27788d() {
            this.f26873d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f26873d < this.f26872c && i10 == 0) {
                byte m27787b = m27787b();
                if (m27787b != 0) {
                    if (m27787b != 1 && m27787b != 2) {
                        if (m27787b != 9) {
                            switch (m27787b) {
                                case 14:
                                case 15:
                                    i12++;
                                    i11 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i12++;
                                    i11 = 1;
                                    continue;
                                case 18:
                                    i12--;
                                    i11 = 0;
                                    continue;
                            }
                        }
                    } else if (i12 == 0) {
                        return 1;
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f26873d > 0) {
                switch (m27786a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        i12--;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        i12--;
                    case 18:
                        i12++;
                }
            }
            return 0;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:33:0x001c. Please report as an issue. */
        /* renamed from: e */
        int m27789e() {
            this.f26873d = this.f26872c;
            int i10 = 0;
            int i11 = 0;
            while (this.f26873d > 0) {
                byte m27786a = m27786a();
                if (m27786a != 0) {
                    if (m27786a != 1 && m27786a != 2) {
                        if (m27786a != 9) {
                            switch (m27786a) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        i11 = i10;
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                            i11 = i10;
                        }
                    }
                } else {
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                        i11 = i10;
                    }
                }
            }
            return 0;
        }
    }

    static {
        InterfaceC7185p interfaceC7185p = AbstractC7186q.f26886c;
        f26858d = interfaceC7185p;
        f26859e = Character.toString((char) 8206);
        f26860f = Character.toString((char) 8207);
        f26861g = new C7170a(false, 2, interfaceC7185p);
        f26862h = new C7170a(true, 2, interfaceC7185p);
    }

    C7170a(boolean z10, int i10, InterfaceC7185p interfaceC7185p) {
        this.f26863a = z10;
        this.f26864b = i10;
        this.f26865c = interfaceC7185p;
    }

    /* renamed from: a */
    private static int m27769a(CharSequence charSequence) {
        return new b(charSequence, false).m27788d();
    }

    /* renamed from: b */
    private static int m27770b(CharSequence charSequence) {
        return new b(charSequence, false).m27789e();
    }

    /* renamed from: c */
    public static C7170a m27771c() {
        return new a().m27780a();
    }

    /* renamed from: e */
    static boolean m27772e(Locale locale) {
        if (AbstractC7187r.m27818a(locale) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private String m27773f(CharSequence charSequence, InterfaceC7185p interfaceC7185p) {
        boolean mo27812a = interfaceC7185p.mo27812a(charSequence, 0, charSequence.length());
        if (!this.f26863a && (mo27812a || m27770b(charSequence) == 1)) {
            return f26859e;
        }
        if (this.f26863a) {
            if (!mo27812a || m27770b(charSequence) == -1) {
                return f26860f;
            }
            return "";
        }
        return "";
    }

    /* renamed from: g */
    private String m27774g(CharSequence charSequence, InterfaceC7185p interfaceC7185p) {
        boolean mo27812a = interfaceC7185p.mo27812a(charSequence, 0, charSequence.length());
        if (!this.f26863a && (mo27812a || m27769a(charSequence) == 1)) {
            return f26859e;
        }
        if (this.f26863a) {
            if (!mo27812a || m27769a(charSequence) == -1) {
                return f26860f;
            }
            return "";
        }
        return "";
    }

    /* renamed from: d */
    public boolean m27775d() {
        if ((this.f26864b & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public CharSequence m27776h(CharSequence charSequence) {
        return m27777i(charSequence, this.f26865c, true);
    }

    /* renamed from: i */
    public CharSequence m27777i(CharSequence charSequence, InterfaceC7185p interfaceC7185p, boolean z10) {
        InterfaceC7185p interfaceC7185p2;
        char c10 = '\0';
        InterfaceC7185p interfaceC7185p3;
        if (charSequence == null) {
            return null;
        }
        boolean mo27812a = interfaceC7185p.mo27812a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m27775d() && z10) {
            if (mo27812a) {
                interfaceC7185p3 = AbstractC7186q.f26885b;
            } else {
                interfaceC7185p3 = AbstractC7186q.f26884a;
            }
            spannableStringBuilder.append((CharSequence) m27774g(charSequence, interfaceC7185p3));
        }
        if (mo27812a != this.f26863a) {
            if (mo27812a) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            if (mo27812a) {
                interfaceC7185p2 = AbstractC7186q.f26885b;
            } else {
                interfaceC7185p2 = AbstractC7186q.f26884a;
            }
            spannableStringBuilder.append((CharSequence) m27773f(charSequence, interfaceC7185p2));
        }
        return spannableStringBuilder;
    }
}
