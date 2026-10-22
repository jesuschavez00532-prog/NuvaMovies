package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C3360da;

/* renamed from: com.umeng.analytics.pro.dj */
/* loaded from: classes3.dex */
public class C3369dj {

    /* renamed from: a */
    private static int f14509a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m14212a(int i10) {
        f14509a = i10;
    }

    /* renamed from: a */
    public static void m14213a(AbstractC3366dg abstractC3366dg, byte b10) {
        m14214a(abstractC3366dg, b10, f14509a);
    }

    /* renamed from: a */
    public static void m14214a(AbstractC3366dg abstractC3366dg, byte b10, int i10) {
        if (i10 > 0) {
            int i11 = 0;
            switch (b10) {
                case 2:
                    abstractC3366dg.mo14170t();
                    return;
                case 3:
                    abstractC3366dg.mo14171u();
                    return;
                case 4:
                    abstractC3366dg.mo14175y();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    abstractC3366dg.mo14172v();
                    return;
                case 8:
                    abstractC3366dg.mo14173w();
                    return;
                case 10:
                    abstractC3366dg.mo14174x();
                    return;
                case 11:
                    abstractC3366dg.mo14133A();
                    return;
                case 12:
                    abstractC3366dg.mo14160j();
                    while (true) {
                        byte b11 = abstractC3366dg.mo14162l().f14486b;
                        if (b11 == 0) {
                            abstractC3366dg.mo14161k();
                            return;
                        } else {
                            m14214a(abstractC3366dg, b11, i10 - 1);
                            abstractC3366dg.mo14163m();
                        }
                    }
                case 13:
                    C3363dd mo14164n = abstractC3366dg.mo14164n();
                    while (i11 < mo14164n.f14492c) {
                        int i12 = i10 - 1;
                        m14214a(abstractC3366dg, mo14164n.f14490a, i12);
                        m14214a(abstractC3366dg, mo14164n.f14491b, i12);
                        i11++;
                    }
                    abstractC3366dg.mo14165o();
                    return;
                case 14:
                    C3370dk mo14168r = abstractC3366dg.mo14168r();
                    while (i11 < mo14168r.f14511b) {
                        m14214a(abstractC3366dg, mo14168r.f14510a, i10 - 1);
                        i11++;
                    }
                    abstractC3366dg.mo14169s();
                    return;
                case 15:
                    C3362dc mo14166p = abstractC3366dg.mo14166p();
                    while (i11 < mo14166p.f14489b) {
                        m14214a(abstractC3366dg, mo14166p.f14488a, i10 - 1);
                        i11++;
                    }
                    abstractC3366dg.mo14167q();
                    return;
            }
        } else {
            throw new C3346cn("Maximum skip depth exceeded");
        }
    }

    /* renamed from: a */
    public static InterfaceC3368di m14211a(byte[] bArr, InterfaceC3368di interfaceC3368di) {
        if (bArr[0] > 16) {
            return new C3360da.a();
        }
        return (bArr.length <= 1 || (bArr[1] & 128) == 0) ? interfaceC3368di : new C3360da.a();
    }
}
