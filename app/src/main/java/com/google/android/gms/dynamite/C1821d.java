package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
/* loaded from: classes.dex */
final class C1821d implements DynamiteModule.InterfaceC1817b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1817b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1817b.b mo8067a(Context context, String str, DynamiteModule.InterfaceC1817b.a aVar) {
        DynamiteModule.InterfaceC1817b.b bVar = new DynamiteModule.InterfaceC1817b.b();
        int mo8068a = aVar.mo8068a(context, str, true);
        bVar.f7645b = mo8068a;
        if (mo8068a != 0) {
            bVar.f7646c = 1;
        } else {
            int mo8069b = aVar.mo8069b(context, str);
            bVar.f7644a = mo8069b;
            if (mo8069b != 0) {
                bVar.f7646c = -1;
            }
        }
        return bVar;
    }
}
