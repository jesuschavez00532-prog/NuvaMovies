package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p367v6.AbstractC7245d;
import p396x6.C7506b;
import p396x6.InterfaceC7505a;

/* renamed from: com.google.firebase.installations.i */
/* loaded from: classes.dex */
public final class C2661i {

    /* renamed from: b */
    public static final long f10181b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f10182c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C2661i f10183d;

    /* renamed from: a */
    private final InterfaceC7505a f10184a;

    private C2661i(InterfaceC7505a interfaceC7505a) {
        this.f10184a = interfaceC7505a;
    }

    /* renamed from: c */
    public static C2661i m11036c() {
        return m11037d(C7506b.m28728b());
    }

    /* renamed from: d */
    public static C2661i m11037d(InterfaceC7505a interfaceC7505a) {
        if (f10183d == null) {
            f10183d = new C2661i(interfaceC7505a);
        }
        return f10183d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m11038g(String str) {
        return f10182c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m11039h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m11040a() {
        return this.f10184a.mo28727a();
    }

    /* renamed from: b */
    public long m11041b() {
        return TimeUnit.MILLISECONDS.toSeconds(m11040a());
    }

    /* renamed from: e */
    public long m11042e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m11043f(AbstractC7245d abstractC7245d) {
        if (TextUtils.isEmpty(abstractC7245d.mo28012b()) || abstractC7245d.mo28018h() + abstractC7245d.mo28013c() < m11041b() + f10181b) {
            return true;
        }
        return false;
    }
}
