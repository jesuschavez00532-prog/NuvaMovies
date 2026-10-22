package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
/* loaded from: classes.dex */
final class C1823f implements DynamiteModule.InterfaceC1817b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1817b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC1817b.b mo8067a(Context context, String str, DynamiteModule.InterfaceC1817b.a aVar) {
        DynamiteModule.InterfaceC1817b.b bVar = new DynamiteModule.InterfaceC1817b.b();
        int mo8068a = aVar.mo8068a(context, str, false);
        bVar.f7645b = mo8068a;
        if (mo8068a == 0) {
            bVar.f7646c = 0;
        } else {
            bVar.f7646c = 1;
        }
        return bVar;
    }
}
