package com.umeng.analytics.pro;

import com.taobao.accs.common.Constants;

/* renamed from: com.umeng.analytics.pro.cg */
/* loaded from: classes3.dex */
public class C3339cg extends C3346cn {

    /* renamed from: a */
    public static final int f14391a = 0;

    /* renamed from: b */
    public static final int f14392b = 1;

    /* renamed from: c */
    public static final int f14393c = 2;

    /* renamed from: d */
    public static final int f14394d = 3;

    /* renamed from: e */
    public static final int f14395e = 4;

    /* renamed from: f */
    public static final int f14396f = 5;

    /* renamed from: g */
    public static final int f14397g = 6;

    /* renamed from: h */
    public static final int f14398h = 7;

    /* renamed from: j */
    private static final C3371dl f14399j = new C3371dl("TApplicationException");

    /* renamed from: k */
    private static final C3361db f14400k = new C3361db(Constants.SHARED_MESSAGE_ID_FILE, (byte) 11, 1);

    /* renamed from: l */
    private static final C3361db f14401l = new C3361db("type", (byte) 8, 2);

    /* renamed from: m */
    private static final long f14402m = 1;

    /* renamed from: i */
    protected int f14403i;

    public C3339cg() {
        this.f14403i = 0;
    }

    /* renamed from: a */
    public int m14054a() {
        return this.f14403i;
    }

    /* renamed from: b */
    public void m14055b(AbstractC3366dg abstractC3366dg) {
        abstractC3366dg.mo14144a(f14399j);
        if (getMessage() != null) {
            abstractC3366dg.mo14139a(f14400k);
            abstractC3366dg.mo14145a(getMessage());
            abstractC3366dg.mo14151c();
        }
        abstractC3366dg.mo14139a(f14401l);
        abstractC3366dg.mo14137a(this.f14403i);
        abstractC3366dg.mo14151c();
        abstractC3366dg.mo14153d();
        abstractC3366dg.mo14150b();
    }

    /* renamed from: a */
    public static C3339cg m14053a(AbstractC3366dg abstractC3366dg) {
        abstractC3366dg.mo14160j();
        String str = null;
        int i10 = 0;
        while (true) {
            C3361db mo14162l = abstractC3366dg.mo14162l();
            byte b10 = mo14162l.f14486b;
            if (b10 == 0) {
                abstractC3366dg.mo14161k();
                return new C3339cg(i10, str);
            }
            short s10 = mo14162l.f14487c;
            if (s10 != 1) {
                if (s10 != 2) {
                    C3369dj.m14213a(abstractC3366dg, b10);
                } else if (b10 == 8) {
                    i10 = abstractC3366dg.mo14173w();
                } else {
                    C3369dj.m14213a(abstractC3366dg, b10);
                }
            } else if (b10 == 11) {
                str = abstractC3366dg.mo14176z();
            } else {
                C3369dj.m14213a(abstractC3366dg, b10);
            }
            abstractC3366dg.mo14163m();
        }
    }

    public C3339cg(int i10) {
        this.f14403i = i10;
    }

    public C3339cg(int i10, String str) {
        super(str);
        this.f14403i = i10;
    }

    public C3339cg(String str) {
        super(str);
        this.f14403i = 0;
    }
}
