package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import p219l4.AbstractC5388m;

/* renamed from: com.google.firebase.messaging.x0 */
/* loaded from: classes.dex */
final class C2719x0 {

    /* renamed from: d */
    private static final Pattern f10401d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f10402a;

    /* renamed from: b */
    private final String f10403b;

    /* renamed from: c */
    private final String f10404c;

    private C2719x0(String str, String str2) {
        this.f10402a = m11343d(str2, str);
        this.f10403b = str;
        this.f10404c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2719x0 m11342a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C2719x0(split[0], split[1]);
    }

    /* renamed from: d */
    private static String m11343d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f10401d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    /* renamed from: b */
    public String m11344b() {
        return this.f10403b;
    }

    /* renamed from: c */
    public String m11345c() {
        return this.f10402a;
    }

    /* renamed from: e */
    public String m11346e() {
        return this.f10404c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2719x0)) {
            return false;
        }
        C2719x0 c2719x0 = (C2719x0) obj;
        if (!this.f10402a.equals(c2719x0.f10402a) || !this.f10403b.equals(c2719x0.f10403b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC5388m.m21772b(this.f10403b, this.f10402a);
    }
}
