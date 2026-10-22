package com.umeng.p079ut.p084b.p087b;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.p079ut.p080a.C3742a;
import com.umeng.p079ut.p080a.p082b.RunnableC3751g;
import com.umeng.p079ut.p080a.p083c.C3752a;
import com.umeng.p079ut.p080a.p083c.C3756e;

/* renamed from: com.umeng.ut.b.b.a */
/* loaded from: classes3.dex */
public class C3762a {

    /* renamed from: a */
    private static final C3762a f16809a = new C3762a();

    /* renamed from: c */
    private static long f16810c = 3000;

    /* renamed from: c */
    private String f16811c = "";

    private C3762a() {
    }

    /* renamed from: a */
    public static C3762a m15971a() {
        return f16809a;
    }

    /* renamed from: b */
    public static long m15972b() {
        return f16810c;
    }

    /* renamed from: d */
    private void m15973d() {
        C3756e.m15958c();
        if (TextUtils.isEmpty(this.f16811c)) {
            return;
        }
        try {
            Context m15927a = C3742a.m15925a().m15927a();
            if (!C3752a.m15940a(m15927a)) {
                return;
            }
            new Thread(new RunnableC3751g(m15927a)).start();
        } catch (Throwable th) {
            C3756e.m15954a("", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String getUtdid(Context context) {
        if (!TextUtils.isEmpty(this.f16811c)) {
            return this.f16811c;
        }
        try {
            String value = C3765d.m15978a(context).getValue();
            if (!TextUtils.isEmpty(value)) {
                this.f16811c = value;
                m15973d();
                return this.f16811c;
            }
            return "ffffffffffffffffffffffff";
        } catch (Throwable th) {
            C3756e.m15953a("AppUtdid", th, new Object[0]);
            return "ffffffffffffffffffffffff";
        }
    }

    /* renamed from: i */
    public synchronized String m15974i() {
        return this.f16811c;
    }
}
