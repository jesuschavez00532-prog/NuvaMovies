package com.umeng.message.proguard;

import com.umeng.message.proguard.InterfaceC3606bx;

/* renamed from: com.umeng.message.proguard.bt */
/* loaded from: classes3.dex */
public final class C3602bt {

    /* renamed from: com.umeng.message.proguard.bt$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16100a;

        static {
            int[] iArr = new int[InterfaceC3606bx.c.values().length];
            f16100a = iArr;
            try {
                iArr[InterfaceC3606bx.c.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16100a[InterfaceC3606bx.c.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16100a[InterfaceC3606bx.c.FLOATING_ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public static int m15447a(InterfaceC3606bx.c cVar) {
        if (cVar == null) {
            return -1;
        }
        int i10 = AnonymousClass1.f16100a[cVar.ordinal()];
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 5;
        }
        return 4;
    }

    /* renamed from: a */
    public static InterfaceC3606bx.c m15448a(C3621ck c3621ck) {
        int optInt = c3621ck.f16166b.optInt("type", -1);
        if (optInt == 2) {
            return InterfaceC3606bx.c.BANNER;
        }
        if (optInt == 4) {
            return InterfaceC3606bx.c.INTERSTITIAL;
        }
        if (optInt != 5) {
            return null;
        }
        return InterfaceC3606bx.c.FLOATING_ICON;
    }
}
