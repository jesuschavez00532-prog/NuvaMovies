package com.uyumao;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.uyumao.C3775g;
import java.util.HashMap;

/* renamed from: com.uyumao.f */
/* loaded from: classes3.dex */
public final class HandlerC3774f extends Handler {
    public HandlerC3774f(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C3775g.a aVar;
        if (message.what == 256) {
            int i10 = message.arg1;
            Object obj = message.obj;
            Integer valueOf = Integer.valueOf(i10 / 100);
            HashMap<Integer, C3775g.a> hashMap = C3775g.f16956c;
            if (hashMap != null) {
                if (hashMap.containsKey(valueOf)) {
                    aVar = C3775g.f16956c.get(valueOf);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.mo16001a(obj, i10);
                }
            }
        }
    }
}
