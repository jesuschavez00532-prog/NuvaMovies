package org.repackage.com.meizu.flyme.openidsdk;

/* loaded from: classes3.dex */
class ValueData {

    /* renamed from: a */
    public String f23859a;

    /* renamed from: b */
    public int f23860b;

    /* renamed from: c */
    public long f23861c = System.currentTimeMillis() + 86400000;

    public ValueData(String str, int i10) {
        this.f23859a = str;
        this.f23860b = i10;
    }

    public String toString() {
        return "ValueData{value='" + this.f23859a + "', code=" + this.f23860b + ", expired=" + this.f23861c + '}';
    }
}
