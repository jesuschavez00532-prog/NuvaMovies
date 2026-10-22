package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p025b5.AbstractC1115m;
import p219l4.AbstractC5391n;
import p325s4.BinderC6676b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.x1 */
/* loaded from: classes.dex */
public final class C2185x1 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ String f8246e;

    /* renamed from: f */
    final /* synthetic */ String f8247f;

    /* renamed from: g */
    final /* synthetic */ Context f8248g;

    /* renamed from: h */
    final /* synthetic */ Bundle f8249h;

    /* renamed from: i */
    final /* synthetic */ C2201y2 f8250i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2185x1(C2201y2 c2201y2, String str, String str2, Context context, Bundle bundle) {
        super(c2201y2, true);
        this.f8250i = c2201y2;
        this.f8246e = str;
        this.f8247f = str2;
        this.f8248g = context;
        this.f8249h = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    public final void mo8116a() {
        boolean m9204m;
        String str;
        String str2;
        String str3;
        InterfaceC1945h1 interfaceC1945h1;
        boolean z10;
        InterfaceC1945h1 interfaceC1945h12;
        String str4;
        String str5;
        try {
            C2201y2 c2201y2 = this.f8250i;
            m9204m = C2201y2.m9204m(this.f8246e, this.f8247f);
            if (m9204m) {
                String str6 = this.f8247f;
                String str7 = this.f8246e;
                str5 = this.f8250i.f8273a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC5391n.m21783i(this.f8248g);
            C2201y2 c2201y22 = this.f8250i;
            c2201y22.f8281i = c2201y22.m9222r(this.f8248g, true);
            interfaceC1945h1 = this.f8250i.f8281i;
            if (interfaceC1945h1 == null) {
                str4 = this.f8250i.f8273a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int m8056a = DynamiteModule.m8056a(this.f8248g, ModuleDescriptor.MODULE_ID);
            int m8057b = DynamiteModule.m8057b(this.f8248g, ModuleDescriptor.MODULE_ID);
            int max = Math.max(m8056a, m8057b);
            if (m8057b < m8056a) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2080q1 c2080q1 = new C2080q1(73000L, max, z10, str, str2, str3, this.f8249h, AbstractC1115m.m5082a(this.f8248g));
            interfaceC1945h12 = this.f8250i.f8281i;
            ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h12)).initialize(BinderC6676b.m26053M(this.f8248g), c2080q1, this.f7958a);
        } catch (Exception e10) {
            this.f8250i.m9201j(e10, true, false);
        }
    }
}
