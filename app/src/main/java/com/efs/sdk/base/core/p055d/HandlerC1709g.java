package com.efs.sdk.base.core.p055d;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.p055d.C1708f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.core.d.g */
/* loaded from: classes.dex */
public final class HandlerC1709g extends AbstractHandlerC1703a {

    /* renamed from: b */
    private ConcurrentHashMap<String, a> f7164b = new ConcurrentHashMap<>(10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.d.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        String f7165a;

        /* renamed from: b */
        String f7166b;

        /* renamed from: c */
        String f7167c;

        /* renamed from: d */
        AtomicInteger f7168d = new AtomicInteger(0);

        a(String str, String str2, String str3) {
            this.f7165a = str;
            this.f7166b = str2;
            this.f7167c = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7719a(String str, String str2, String str3) {
        String str4 = str + "_" + str2 + "_" + str3.trim();
        if (!this.f7164b.containsKey(str4) || this.f7164b.get(str4) == null) {
            this.f7164b.putIfAbsent(str4, new a(str, str2, str3));
        }
        this.f7164b.get(str4).f7168d.incrementAndGet();
    }

    @Override // com.efs.sdk.base.core.p055d.AbstractHandlerC1703a
    /* renamed from: a */
    public final void mo7709a() {
        C1708f c1708f;
        try {
            if (this.f7144a != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                Iterator<Map.Entry<String, a>> it = this.f7164b.entrySet().iterator();
                while (it.hasNext()) {
                    a value = it.next().getValue();
                    int i10 = value.f7168d.get();
                    if (i10 > 0) {
                        ControllerCenter controllerCenter = this.f7144a;
                        String str = value.f7165a;
                        String str2 = value.f7166b;
                        String str3 = value.f7167c;
                        c1708f = C1708f.a.f7163a;
                        C1704b c1704b = new C1704b("efs_core", "req_succ_rate", c1708f.f7159a.f7153c);
                        c1704b.put("rep_code", str);
                        c1704b.put("px_code", str2);
                        c1704b.put("path", str3);
                        c1704b.put("cnt", Integer.valueOf(i10));
                        controllerCenter.send(c1704b);
                        value.f7168d.addAndGet(i10 * (-1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
