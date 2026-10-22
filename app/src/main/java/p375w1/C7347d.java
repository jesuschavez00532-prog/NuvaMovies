package p375w1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p109e2.AbstractC4111a;
import p184j1.C4977h;
import p184j1.EnumC4972c;
import p184j1.InterfaceC4980k;
import p216l1.InterfaceC5335v;

/* renamed from: w1.d */
/* loaded from: classes.dex */
public class C7347d implements InterfaceC4980k {
    @Override // p184j1.InterfaceC4980k
    /* renamed from: a */
    public EnumC4972c mo20331a(C4977h c4977h) {
        return EnumC4972c.SOURCE;
    }

    @Override // p184j1.InterfaceC4973d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo20315b(InterfaceC5335v interfaceC5335v, File file, C4977h c4977h) {
        try {
            AbstractC4111a.m17195f(((C7346c) interfaceC5335v.get()).m28345c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}
