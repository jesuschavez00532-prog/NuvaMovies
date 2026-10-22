package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1941gc;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* loaded from: classes.dex */
final class C2338j4 implements InterfaceC1941gc {

    /* renamed from: a */
    final /* synthetic */ String f8712a;

    /* renamed from: b */
    final /* synthetic */ C2349k4 f8713b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2338j4(C2349k4 c2349k4, String str) {
        this.f8713b = c2349k4;
        this.f8712a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1941gc
    /* renamed from: n */
    public final String mo8471n(String str) {
        Map map;
        map = this.f8713b.f8734d;
        Map map2 = (Map) map.get(this.f8712a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
