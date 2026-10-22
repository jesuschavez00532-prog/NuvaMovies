package p400xa;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p170i2.C4842a;

/* renamed from: xa.c */
/* loaded from: classes2.dex */
public abstract class AbstractC7557c {
    /* renamed from: a */
    public static boolean m28973a(String str) {
        if (TextUtils.isEmpty(str) || !C4842a.f20329a.m19920a().mo19939P()) {
            return false;
        }
        Matcher matcher = Pattern.compile("[0-9]*").matcher(str);
        if (str.contains("@") || matcher.matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m28974b(String str) {
        if (TextUtils.isEmpty("^[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$")) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
    }

    /* renamed from: c */
    public static boolean m28975c(String str) {
        return str.matches("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,12}$");
    }

    /* renamed from: d */
    public static boolean m28976d(String str) {
        return str.matches("^[0-9A-Za-z_]{6,12}$");
    }
}
