package p424z3;

import android.content.Context;
import android.os.Build;
import p005a4.AbstractC0060z;
import p005a4.C0017a;
import p005a4.C0047p;
import p005a4.InterfaceC0052r0;
import p024b4.InterfaceC1055d;
import p095d4.InterfaceC3935a;

/* renamed from: z3.h */
/* loaded from: classes.dex */
public abstract class AbstractC7752h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC0052r0 m29957a(Context context, InterfaceC1055d interfaceC1055d, AbstractC0060z abstractC0060z, InterfaceC3935a interfaceC3935a) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0047p(context, interfaceC1055d, abstractC0060z);
        }
        return new C0017a(context, interfaceC1055d, interfaceC3935a, abstractC0060z);
    }
}
