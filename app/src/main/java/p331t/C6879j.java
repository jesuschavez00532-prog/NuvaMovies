package p331t;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: t.j */
/* loaded from: classes.dex */
final class C6879j implements InterfaceC6875f {

    /* renamed from: a */
    private final LocaleList f26174a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6879j(LocaleList localeList) {
        this.f26174a = localeList;
    }

    @Override // p331t.InterfaceC6875f
    /* renamed from: a */
    public Object mo26788a() {
        return this.f26174a;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f26174a.equals(((InterfaceC6875f) obj).mo26788a());
        return equals;
    }

    @Override // p331t.InterfaceC6875f
    public Locale get(int i10) {
        Locale locale;
        locale = this.f26174a.get(i10);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f26174a.hashCode();
        return hashCode;
    }

    public String toString() {
        String localeList = null;
        localeList = this.f26174a.toString();
        return localeList;
    }
}
