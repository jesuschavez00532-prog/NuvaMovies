package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.g */
/* loaded from: classes.dex */
final class C1824g implements DynamiteModule.InterfaceC1817b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1817b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1817b.b mo8067a(Context context, String str, DynamiteModule.InterfaceC1817b.a aVar) {
        DynamiteModule.InterfaceC1817b.b bVar = new DynamiteModule.InterfaceC1817b.b();
        bVar.f7644a = aVar.mo8069b(context, str);
        int mo8068a = aVar.mo8068a(context, str, true);
        bVar.f7645b = mo8068a;
        int i10 = bVar.f7644a;
        if (i10 == 0) {
            i10 = 0;
            if (mo8068a == 0) {
                bVar.f7646c = 0;
                return bVar;
            }
        }
        if (i10 >= mo8068a) {
            bVar.f7646c = -1;
        } else {
            bVar.f7646c = 1;
        }
        return bVar;
    }
}
