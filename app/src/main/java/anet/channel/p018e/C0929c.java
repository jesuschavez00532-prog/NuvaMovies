package anet.channel.p018e;

import android.content.SharedPreferences;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C1002l;
import anet.channel.strategy.IStrategyListener;

/* renamed from: anet.channel.e.c */
/* loaded from: classes.dex */
final class C0929c implements IStrategyListener {
    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(C1002l.d dVar) {
        String str;
        String str2;
        String str3;
        if (dVar != null && dVar.f4170b != null) {
            int i10 = 0;
            loop0: while (true) {
                C1002l.b[] bVarArr = dVar.f4170b;
                if (i10 < bVarArr.length) {
                    C1002l.b bVar = bVarArr[i10];
                    str = bVar.f4155a;
                    C1002l.a[] aVarArr = bVar.f4162h;
                    if (aVarArr != null && aVarArr.length > 0) {
                        for (C1002l.a aVar : aVarArr) {
                            String str4 = aVar.f4148b;
                            if (ConnType.HTTP3.equals(str4) || ConnType.HTTP3_PLAIN.equals(str4)) {
                                break loop0;
                            }
                        }
                    }
                    i10++;
                } else {
                    return;
                }
            }
            str2 = C0927a.f3858b;
            if (!str.equals(str2)) {
                String unused = C0927a.f3858b = str;
                SharedPreferences.Editor edit = C0927a.f3862f.edit();
                str3 = C0927a.f3858b;
                edit.putString("http3_detector_host", str3);
                edit.apply();
            }
            C0927a.m4558a(NetworkStatusHelper.getStatus());
        }
    }
}
