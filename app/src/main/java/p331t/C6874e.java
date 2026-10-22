package p331t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: t.e */
/* loaded from: classes.dex */
final class C6874e implements InterfaceC6875f {

    /* renamed from: c */
    private static final Locale[] f26168c = new Locale[0];

    /* renamed from: d */
    private static final Locale f26169d = new Locale("en", "XA");

    /* renamed from: e */
    private static final Locale f26170e = new Locale("ar", "XB");

    /* renamed from: f */
    private static final Locale f26171f = C6873d.m26784b("en-Latn");

    /* renamed from: a */
    private final Locale[] f26172a;

    /* renamed from: b */
    private final String f26173b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6874e(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f26172a = f26168c;
            this.f26173b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m26787b(sb2, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
        }
        this.f26172a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        this.f26173b = sb2.toString();
    }

    /* renamed from: b */
    static void m26787b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    @Override // p331t.InterfaceC6875f
    /* renamed from: a */
    public Object mo26788a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6874e)) {
            return false;
        }
        Locale[] localeArr = ((C6874e) obj).f26172a;
        if (this.f26172a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f26172a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // p331t.InterfaceC6875f
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f26172a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.f26172a;
            if (i11 < localeArr.length) {
                i10 = (i10 * 31) + localeArr[i11].hashCode();
                i11++;
            } else {
                return i10;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f26172a;
            if (i10 < localeArr.length) {
                sb2.append(localeArr[i10]);
                if (i10 < this.f26172a.length - 1) {
                    sb2.append(',');
                }
                i10++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
