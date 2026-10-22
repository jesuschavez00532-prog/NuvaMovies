package p281p4;

import java.util.regex.Pattern;

/* renamed from: p4.m */
/* loaded from: classes.dex */
public abstract class AbstractC6209m {

    /* renamed from: a */
    private static final Pattern f24379a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static boolean m24777a(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
