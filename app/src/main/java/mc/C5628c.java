package mc;

import ne.AbstractC5868k;
import org.android.agoo.common.AgooConstants;

/* renamed from: mc.c */
/* loaded from: classes3.dex */
final class C5628c {

    /* renamed from: a */
    private final String f22687a;

    /* renamed from: b */
    private long f22688b;

    public C5628c(String str) {
        AbstractC5868k.m23674f(str, AgooConstants.MESSAGE_TRACE);
        this.f22687a = str;
        this.f22688b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final long m22832a() {
        return this.f22688b;
    }

    /* renamed from: b */
    public final String m22833b() {
        return this.f22687a;
    }

    /* renamed from: c */
    public final void m22834c() {
        this.f22688b = System.currentTimeMillis();
    }
}
