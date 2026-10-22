package org.repackage.com.meizu.flyme.openidsdk;

import android.text.TextUtils;

/* loaded from: classes3.dex */
class SupportInfo {

    /* renamed from: a */
    String f23857a;

    /* renamed from: b */
    Boolean f23858b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m24243a(boolean z10) {
        this.f23858b = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m24246b(String str) {
        this.f23857a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m24244a() {
        return this.f23858b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m24247b() {
        Boolean bool = this.f23858b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m24245a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f23857a, str);
    }
}
