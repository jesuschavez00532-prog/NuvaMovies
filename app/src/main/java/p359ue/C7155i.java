package p359ue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p043ce.AbstractC1499k;
import re.AbstractC6576d;

/* renamed from: ue.i */
/* loaded from: classes3.dex */
public final class C7155i implements Serializable {

    /* renamed from: b */
    public static final a f26854b = new a(null);

    /* renamed from: a */
    private final Pattern f26855a;

    /* renamed from: ue.i$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    public C7155i(Pattern pattern) {
        AbstractC5868k.m23674f(pattern, "nativePattern");
        this.f26855a = pattern;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC7153g m27677b(C7155i c7155i, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c7155i.m27678a(charSequence, i10);
    }

    /* renamed from: a */
    public final InterfaceC7153g m27678a(CharSequence charSequence, int i10) {
        AbstractC5868k.m23674f(charSequence, "input");
        Matcher matcher = this.f26855a.matcher(charSequence);
        AbstractC5868k.m23673e(matcher, "nativePattern.matcher(input)");
        return AbstractC7156j.m27682a(matcher, i10, charSequence);
    }

    /* renamed from: c */
    public final String m27679c(CharSequence charSequence, String str) {
        AbstractC5868k.m23674f(charSequence, "input");
        AbstractC5868k.m23674f(str, "replacement");
        String replaceAll = this.f26855a.matcher(charSequence).replaceAll(str);
        AbstractC5868k.m23673e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: d */
    public final String m27680d(CharSequence charSequence, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(charSequence, "input");
        AbstractC5868k.m23674f(interfaceC5660l, "transform");
        int i10 = 0;
        InterfaceC7153g m27677b = m27677b(this, charSequence, 0, 2, null);
        if (m27677b == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(charSequence, i10, m27677b.mo27667b().m25664p().intValue());
            sb2.append((CharSequence) interfaceC5660l.mo542f(m27677b));
            i10 = m27677b.mo27667b().m25663o().intValue() + 1;
            m27677b = m27677b.next();
            if (i10 >= length) {
                break;
            }
        } while (m27677b != null);
        if (i10 < length) {
            sb2.append(charSequence, i10, length);
        }
        String sb3 = sb2.toString();
        AbstractC5868k.m23673e(sb3, "sb.toString()");
        return sb3;
    }

    /* renamed from: e */
    public final List m27681e(CharSequence charSequence, int i10) {
        List m6983b;
        AbstractC5868k.m23674f(charSequence, "input");
        AbstractC7167u.m27745O(i10);
        Matcher matcher = this.f26855a.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            m6983b = AbstractC1499k.m6983b(charSequence.toString());
            return m6983b;
        }
        int i11 = 10;
        if (i10 > 0) {
            i11 = AbstractC6576d.m25668c(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = i10 - 1;
        int i13 = 0;
        do {
            arrayList.add(charSequence.subSequence(i13, matcher.start()).toString());
            i13 = matcher.end();
            if (i12 >= 0 && arrayList.size() == i12) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i13, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f26855a.toString();
        AbstractC5868k.m23673e(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7155i(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            ne.AbstractC5868k.m23674f(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            ne.AbstractC5868k.m23673e(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p359ue.C7155i.<init>(java.lang.String):void");
    }
}
