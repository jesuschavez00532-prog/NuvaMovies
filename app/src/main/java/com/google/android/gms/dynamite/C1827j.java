package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.j */
/* loaded from: classes.dex */
final class C1827j implements DynamiteModule.InterfaceC1817b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1817b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1817b.b mo8067a(Context context, String str, DynamiteModule.InterfaceC1817b.a aVar) {
        int mo8068a;
        DynamiteModule.InterfaceC1817b.b bVar = new DynamiteModule.InterfaceC1817b.b();
        int mo8069b = aVar.mo8069b(context, str);
        bVar.f7644a = mo8069b;
        int i10 = 0;
        if (mo8069b != 0) {
            mo8068a = aVar.mo8068a(context, str, false);
            bVar.f7645b = mo8068a;
        } else {
            mo8068a = aVar.mo8068a(context, str, true);
            bVar.f7645b = mo8068a;
        }
        int i11 = bVar.f7644a;
        if (i11 == 0) {
            if (mo8068a == 0) {
                bVar.f7646c = 0;
                return bVar;
            }
        } else {
            i10 = i11;
        }
        if (mo8068a >= i10) {
            bVar.f7646c = 1;
        } else {
            bVar.f7646c = -1;
        }
        return bVar;
    }
}
