package p331t;

import android.os.Build;
import android.os.LocaleList;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.Locale;

/* renamed from: t.d */
/* loaded from: classes.dex */
public final class C6873d {

    /* renamed from: b */
    private static final C6873d f26166b = m26783a(new Locale[0]);

    /* renamed from: a */
    private InterfaceC6875f f26167a;

    private C6873d(InterfaceC6875f interfaceC6875f) {
        this.f26167a = interfaceC6875f;
    }

    /* renamed from: a */
    public static C6873d m26783a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m26785d(new LocaleList(localeArr));
        }
        return new C6873d(new C6874e(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Locale m26784b(String str) {
        if (str.contains(Operator.Operation.MINUS)) {
            String[] split = str.split(Operator.Operation.MINUS, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: d */
    public static C6873d m26785d(LocaleList localeList) {
        return new C6873d(new C6879j(localeList));
    }

    /* renamed from: c */
    public Locale m26786c(int i10) {
        return this.f26167a.get(i10);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C6873d) && this.f26167a.equals(((C6873d) obj).f26167a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f26167a.hashCode();
    }

    public String toString() {
        return this.f26167a.toString();
    }
}
