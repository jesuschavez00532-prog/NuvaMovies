package com.efs.sdk.net.p057a.p058a;

import android.text.TextUtils;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.net.NetManager;
import com.efs.sdk.net.p057a.C1755a;
import com.efs.sdk.net.p057a.C1766c;
import com.efs.sdk.net.p057a.p058a.InterfaceC1761f;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.net.a.a.g */
/* loaded from: classes.dex */
public final class C1762g implements InterfaceC1761f {

    /* renamed from: a */
    private static AtomicInteger f7359a = new AtomicInteger(0);

    /* renamed from: c */
    private static C1762g f7360c;

    /* renamed from: b */
    private C1757b f7361b = new C1757b();

    private C1762g() {
    }

    /* renamed from: c */
    public static C1762g m7855c() {
        if (f7360c == null) {
            f7360c = new C1762g();
        }
        return f7360c;
    }

    @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f
    /* renamed from: a */
    public final void mo7852a(InterfaceC1761f.b bVar) {
        String str;
        Log.m7722d("NetTrace-Interceptor", "request will be sent");
        C1757b c1757b = this.f7361b;
        try {
            String mo7822a = bVar.mo7822a();
            c1757b.f7350a.put(bVar.mo7822a(), Long.valueOf(System.currentTimeMillis()));
            Log.m7730i("NetTrace-Interceptor", "save request");
            C1766c m7839a = C1755a.m7837a().m7839a(mo7822a);
            String mo7824b = bVar.mo7824b();
            if (!TextUtils.isEmpty(mo7824b)) {
                m7839a.f7373d = mo7824b;
            }
            m7839a.f7374e = bVar.mo7826c();
            HashMap hashMap = new HashMap();
            int mo7828e = bVar.mo7828e();
            for (int i10 = 0; i10 < mo7828e; i10++) {
                hashMap.put(bVar.mo7823a(i10), bVar.mo7825b(i10));
            }
            m7839a.f7375f = C1757b.m7843a(bVar);
            if (NetManager.getNetConfigManager().getNetRequestBodyCollectState()) {
                String str2 = m7839a.f7374e;
                if ((str2 == null || !str2.equalsIgnoreCase("get")) && (str = m7839a.f7374e) != null && str.equalsIgnoreCase("post") && m7839a.f7375f < 10240) {
                    if (hashMap.containsKey("Content-Type") || hashMap.containsKey("content-type")) {
                        String str3 = (String) hashMap.get("Content-Type");
                        if (TextUtils.isEmpty(str3)) {
                            str3 = (String) hashMap.get("content-type");
                        }
                        if (str3 != null) {
                            if (str3.contains("application/json") || str3.contains("application/x-www-form-urlencoded")) {
                                m7839a.f7376g = new String(bVar.mo7827d());
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f
    /* renamed from: b */
    public final String mo7854b() {
        Log.m7722d("NetTrace-Interceptor", "next request id");
        return String.valueOf(f7359a.getAndIncrement());
    }

    @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f
    /* renamed from: a */
    public final void mo7853a(InterfaceC1761f.d dVar) {
        Log.m7722d("NetTrace-Interceptor", "response headers received");
        C1757b c1757b = this.f7361b;
        Log.m7730i("NetTrace-Interceptor", "save response");
        String mo7829a = dVar.mo7829a();
        if (c1757b.f7350a != null) {
            C1755a.m7837a().m7839a(mo7829a).f7377h = dVar.mo7830b();
        }
    }

    @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f
    /* renamed from: a */
    public final InputStream mo7850a(String str, String str2, String str3, InputStream inputStream) {
        Log.m7722d("NetTrace-Interceptor", "interpret response stream");
        return C1757b.m7845a(str, str2, str3, inputStream);
    }

    @Override // com.efs.sdk.net.p057a.p058a.InterfaceC1761f
    /* renamed from: a */
    public final void mo7851a() {
        Log.m7722d("NetTrace-Interceptor", "data sent");
    }
}
