package org.repackage.com.meizu.flyme.openidsdk;

/* loaded from: classes3.dex */
class OpenId {

    /* renamed from: a */
    long f23851a;

    /* renamed from: b */
    String f23852b;

    /* renamed from: c */
    String f23853c;

    /* renamed from: d */
    int f23854d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenId(String str) {
        this.f23853c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m24232a(int i10) {
        this.f23854d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m24236b() {
        this.f23851a = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m24233a(long j10) {
        this.f23851a = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m24234a(String str) {
        this.f23852b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m24235a() {
        return this.f23851a > System.currentTimeMillis();
    }
}
