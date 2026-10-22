package com.p077uc.crashsdk.p078a;

import anet.channel.util.HttpConstant;
import com.p077uc.crashsdk.C3250a;
import com.p077uc.crashsdk.C3259b;
import com.p077uc.crashsdk.C3262e;
import com.p077uc.crashsdk.C3263f;
import com.umeng.ccg.C3419c;

/* renamed from: com.uc.crashsdk.a.e */
/* loaded from: classes3.dex */
public class RunnableC3255e implements Runnable {

    /* renamed from: a */
    static final /* synthetic */ boolean f13661a = true;

    /* renamed from: b */
    private final int f13662b;

    /* renamed from: c */
    private final Object[] f13663c;

    public RunnableC3255e(int i10) {
        this.f13662b = i10;
        this.f13663c = null;
    }

    /* renamed from: a */
    public final boolean m13201a() {
        int i10 = this.f13662b;
        if (i10 != 451 && i10 != 452) {
            switch (i10) {
                case 351:
                case 352:
                case 353:
                case 354:
                    return C3258h.m13269b(i10, this.f13663c);
                default:
                    switch (i10) {
                        case 751:
                        case 752:
                        case 753:
                        case 754:
                        case 755:
                        case 756:
                            return C3263f.m13534a(i10, this.f13663c);
                        default:
                            C3251a.m13173d("crashsdk", "Unknown sync runnable: " + toString());
                            if (f13661a) {
                                return false;
                            }
                            throw new AssertionError();
                    }
            }
        }
        return C3262e.m13451b(i10, this.f13663c);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = this.f13662b;
        if (i10 != 10) {
            if (i10 != 500) {
                if (i10 != 700) {
                    if (i10 != 800) {
                        if (i10 != 201 && i10 != 202) {
                            switch (i10) {
                                case 100:
                                case 101:
                                case 102:
                                case 103:
                                case 104:
                                    C3259b.m13325a(i10);
                                    return;
                                default:
                                    switch (i10) {
                                        case C3419c.f15026o /* 301 */:
                                        case 302:
                                        case 303:
                                            C3258h.m13253a(i10, this.f13663c);
                                            return;
                                        default:
                                            switch (i10) {
                                                case 401:
                                                case 402:
                                                case 403:
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 405:
                                                        case 406:
                                                        case 407:
                                                        case 408:
                                                        case 409:
                                                        case 410:
                                                        case 411:
                                                        case 412:
                                                        case 413:
                                                        case 414:
                                                        case 415:
                                                        case HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE /* 416 */:
                                                            break;
                                                        default:
                                                            C3251a.m13173d("crashsdk", "Unknown async runnable: " + toString());
                                                            if (f13661a) {
                                                                return;
                                                            } else {
                                                                throw new AssertionError();
                                                            }
                                                    }
                                            }
                                            C3262e.m13417a(i10, this.f13663c);
                                            return;
                                    }
                            }
                        }
                        C3250a.m13138a(i10);
                        return;
                    }
                    C3257g.m13216a(i10);
                    return;
                }
                C3263f.m13541b(i10);
                return;
            }
            C3254d.m13193a(i10);
            return;
        }
        C3256f.m13204a(i10, this.f13663c);
    }

    public String toString() {
        return super.toString() + "@action_" + this.f13662b;
    }

    public RunnableC3255e(int i10, Object[] objArr) {
        this.f13662b = i10;
        this.f13663c = objArr;
    }
}
