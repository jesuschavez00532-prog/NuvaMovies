package ac;

import cc.C1456h0;
import cc.C1473s;
import com.request.result.CdnListBeanResult;
import com.request.result.GetSlbInfoBeanResult;
import com.request.result.GetSlbInfoBeanResultData;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p030bc.C1224f;
import p170i2.C4842a;
import p301qb.InterfaceC6423s0;
import p317rb.AbstractC6567a;
import p343tb.AbstractC6929a;

/* renamed from: ac.k2 */
/* loaded from: classes2.dex */
public final class C0173k2 extends AbstractC0166j {

    /* renamed from: b */
    private final String f480b;

    /* renamed from: c */
    private long f481c;

    /* renamed from: d */
    private long f482d;

    /* renamed from: e */
    private Disposable f483e;

    /* renamed from: f */
    private boolean f484f;

    /* renamed from: ac.k2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f485a;

        /* renamed from: b */
        final /* synthetic */ String f486b;

        /* renamed from: c */
        final /* synthetic */ String[] f487c;

        /* renamed from: d */
        final /* synthetic */ String f488d;

        /* renamed from: e */
        final /* synthetic */ String f489e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String[] strArr, String str3, String str4) {
            super(1);
            this.f485a = str;
            this.f486b = str2;
            this.f487c = strArr;
            this.f488d = str3;
            this.f489e = str4;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a */
        public final ObservableSource mo542f(Long l10) {
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            AbstractC5868k.m23674f(l10, "it");
            if (C4842a.f20329a.m19920a().mo19934K()) {
                C1224f m5631a = C1224f.f4816e.m5631a();
                String str5 = this.f485a;
                String str6 = this.f486b;
                String[] strArr = this.f487c;
                String str7 = this.f488d;
                if (str7 == null) {
                    str3 = "";
                } else {
                    str3 = str7;
                }
                String str8 = this.f489e;
                if (str8 == null) {
                    str4 = "";
                } else {
                    str4 = str8;
                }
                return m5631a.m5588f0(str5, str6, strArr, str3, str4);
            }
            C1224f m5631a2 = C1224f.f4816e.m5631a();
            String str9 = this.f485a;
            String str10 = this.f486b;
            String[] strArr2 = this.f487c;
            String str11 = this.f488d;
            if (str11 == null) {
                str = "";
            } else {
                str = str11;
            }
            String str12 = this.f489e;
            if (str12 == null) {
                str2 = "";
            } else {
                str2 = str12;
            }
            return m5631a2.m5586e0(str9, str10, strArr2, str, str2);
        }
    }

    /* renamed from: ac.k2$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f491c;

        /* renamed from: d */
        final /* synthetic */ String f492d;

        /* renamed from: e */
        final /* synthetic */ String[] f493e;

        /* renamed from: f */
        final /* synthetic */ String f494f;

        /* renamed from: g */
        final /* synthetic */ String f495g;

        /* renamed from: h */
        final /* synthetic */ boolean f496h;

        b(String str, String str2, String[] strArr, String str3, String str4, boolean z10) {
            this.f491c = str;
            this.f492d = str2;
            this.f493e = strArr;
            this.f494f = str3;
            this.f495g = str4;
            this.f496h = z10;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c */
        public void onNext(GetSlbInfoBeanResult getSlbInfoBeanResult) {
            AbstractC5868k.m23674f(getSlbInfoBeanResult, "t");
            super.onNext(getSlbInfoBeanResult);
            C0173k2.this.m636g(getSlbInfoBeanResult, this.f491c, this.f492d, this.f493e, this.f494f, this.f495g, this.f496h);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[Catch: Exception -> 0x00bd, TRY_ENTER, TryCatch #0 {Exception -> 0x00bd, blocks: (B:6:0x0035, B:9:0x003d, B:15:0x0092, B:18:0x009a, B:19:0x00ae, B:23:0x00a7, B:24:0x0056, B:34:0x0071, B:41:0x0083, B:44:0x0088, B:46:0x008c, B:47:0x007c, B:48:0x0077), top: B:5:0x0035 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:6:0x0035, B:9:0x003d, B:15:0x0092, B:18:0x009a, B:19:0x00ae, B:23:0x00a7, B:24:0x0056, B:34:0x0071, B:41:0x0083, B:44:0x0088, B:46:0x008c, B:47:0x007c, B:48:0x0077), top: B:5:0x0035 }] */
        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onError(java.lang.Throwable r14) {
            /*
                r13 = this;
                java.lang.String r0 = "e"
                ne.AbstractC5868k.m23674f(r14, r0)
                super.onError(r14)
                cc.h0 r0 = cc.C1456h0.f5574a
                r1 = 1
                r0.m6781q(r1)
                ac.k2 r0 = ac.C0173k2.this
                boolean r0 = ac.C0173k2.m630c(r0)
                if (r0 != 0) goto L30
                ac.k2 r0 = ac.C0173k2.this
                r2 = 300(0x12c, double:1.48E-321)
                ac.C0173k2.m632e(r0, r2)
                ac.k2 r4 = ac.C0173k2.this
                java.lang.String r5 = r13.f491c
                java.lang.String r6 = r13.f492d
                java.lang.String[] r7 = r13.f493e
                java.lang.String r8 = r13.f494f
                java.lang.String r9 = r13.f495g
                r10 = 0
                r11 = 32
                r12 = 0
                ac.C0173k2.m634i(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            L30:
                ac.k2 r0 = ac.C0173k2.this
                ac.C0173k2.m633f(r0, r1)
                boolean r0 = r14 instanceof retrofit2.HttpException     // Catch: java.lang.Exception -> Lbd
                java.lang.String r2 = ""
                java.lang.String r3 = "25500"
                if (r0 == 0) goto L71
                r0 = r14
                retrofit2.HttpException r0 = (retrofit2.HttpException) r0     // Catch: java.lang.Exception -> Lbd
                int r0 = r0.m25696a()     // Catch: java.lang.Exception -> Lbd
                r1 = 503(0x1f7, float:7.05E-43)
                r4 = 500(0x1f4, float:7.0E-43)
                r5 = 401(0x191, float:5.62E-43)
                r6 = 400(0x190, float:5.6E-43)
                if (r0 == r6) goto L56
                if (r0 == r5) goto L56
                if (r0 == r4) goto L56
                if (r0 == r1) goto L56
            L54:
                r2 = r3
                goto L92
            L56:
                retrofit2.HttpException r14 = (retrofit2.HttpException) r14     // Catch: java.lang.Exception -> Lbd
                int r14 = r14.m25696a()     // Catch: java.lang.Exception -> Lbd
                if (r14 == r6) goto L6e
                if (r14 == r5) goto L6b
                if (r14 == r4) goto L68
                if (r14 == r1) goto L65
                goto L92
            L65:
                java.lang.String r2 = "20900"
                goto L92
            L68:
                java.lang.String r2 = "20700"
                goto L92
            L6b:
                java.lang.String r2 = "20800"
                goto L92
            L6e:
                java.lang.String r2 = "20600"
                goto L92
            L71:
                boolean r0 = r14 instanceof java.net.ConnectException     // Catch: java.lang.Exception -> Lbd
                if (r0 == 0) goto L77
                r0 = 1
                goto L79
            L77:
                boolean r0 = r14 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Exception -> Lbd
            L79:
                if (r0 == 0) goto L7c
                goto L7e
            L7c:
                boolean r1 = r14 instanceof java.util.concurrent.TimeoutException     // Catch: java.lang.Exception -> Lbd
            L7e:
                if (r1 == 0) goto L83
                java.lang.String r2 = "25100"
                goto L92
            L83:
                boolean r0 = r14 instanceof java.text.ParseException     // Catch: java.lang.Exception -> Lbd
                if (r0 == 0) goto L88
                goto L54
            L88:
                boolean r0 = r14 instanceof com.request.converterFactory.bean.ResultException     // Catch: java.lang.Exception -> Lbd
                if (r0 == 0) goto L92
                com.request.converterFactory.bean.ResultException r14 = (com.request.converterFactory.bean.ResultException) r14     // Catch: java.lang.Exception -> Lbd
                java.lang.String r2 = r14.getReturnCode()     // Catch: java.lang.Exception -> Lbd
            L92:
                boolean r14 = android.text.TextUtils.isDigitsOnly(r2)     // Catch: java.lang.Exception -> Lbd
                java.lang.String r0 = "errCode"
                if (r14 == 0) goto La7
                cc.s r14 = cc.C1473s.f5656a     // Catch: java.lang.Exception -> Lbd
                ne.AbstractC5868k.m23673e(r2, r0)     // Catch: java.lang.Exception -> Lbd
                int r1 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> Lbd
                r14.m6918b(r1)     // Catch: java.lang.Exception -> Lbd
                goto Lae
            La7:
                cc.s r14 = cc.C1473s.f5656a     // Catch: java.lang.Exception -> Lbd
                r1 = 20900(0x51a4, float:2.9287E-41)
                r14.m6918b(r1)     // Catch: java.lang.Exception -> Lbd
            Lae:
                ac.k2 r14 = ac.C0173k2.this     // Catch: java.lang.Exception -> Lbd
                java.lang.Object r14 = r14.m618a()     // Catch: java.lang.Exception -> Lbd
                qb.s0 r14 = (p301qb.InterfaceC6423s0) r14     // Catch: java.lang.Exception -> Lbd
                ne.AbstractC5868k.m23673e(r2, r0)     // Catch: java.lang.Exception -> Lbd
                r14.mo25226T0(r2)     // Catch: java.lang.Exception -> Lbd
                goto Lc1
            Lbd:
                r14 = move-exception
                r14.printStackTrace()
            Lc1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ac.C0173k2.b.onError(java.lang.Throwable):void");
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            C0173k2.this.f483e = disposable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0173k2(InterfaceC6423s0 interfaceC6423s0) {
        super(interfaceC6423s0);
        AbstractC5868k.m23674f(interfaceC6423s0, "view");
        this.f480b = C0173k2.class.getSimpleName();
        this.f481c = 1800L;
    }

    /* renamed from: i */
    public static /* synthetic */ void m634i(C0173k2 c0173k2, String str, String str2, String[] strArr, String str3, String str4, boolean z10, int i10, Object obj) {
        String str5 = null;
        String str6 = null;
        boolean z11 = false;
        if ((i10 & 8) != 0) {
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i10 & 16) != 0) {
            str6 = null;
        } else {
            str6 = str4;
        }
        if ((i10 & 32) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        c0173k2.m637h(str, str2, strArr, str5, str6, z11);
    }

    /* renamed from: j */
    public static final ObservableSource m635j(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: g */
    public final void m636g(GetSlbInfoBeanResult getSlbInfoBeanResult, String str, String str2, String[] strArr, String str3, String str4, boolean z10) {
        String str5 = null;
        long j10;
        boolean z11 = false;
        List<CdnListBeanResult> list;
        Integer error_code;
        AbstractC5868k.m23674f(getSlbInfoBeanResult, "t");
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "lang");
        AbstractC5868k.m23674f(strArr, "liveCodeList");
        GetSlbInfoBeanResultData data = getSlbInfoBeanResult.getData();
        Integer num = null;
        if (data != null) {
            str5 = data.getInvalidTime();
        } else {
            str5 = null;
        }
        long j11 = 60;
        if (AbstractC6567a.m25637g(str5)) {
            try {
                GetSlbInfoBeanResultData data2 = getSlbInfoBeanResult.getData();
                AbstractC5868k.m23671c(data2);
                String invalidTime = data2.getInvalidTime();
                AbstractC5868k.m23671c(invalidTime);
                j10 = Long.parseLong(invalidTime) / 2;
            } catch (Exception unused) {
                j10 = 60;
            }
            this.f482d = j10;
        } else {
            j10 = 60;
        }
        this.f484f = false;
        if (this.f482d == 0) {
            if (j10 != 0) {
                j11 = j10;
            }
            this.f482d = j11;
        }
        m634i(this, str, str2, strArr, str3, str4, false, 32, null);
        GetSlbInfoBeanResultData data3 = getSlbInfoBeanResult.getData();
        if (data3 != null && (error_code = data3.getError_code()) != null && error_code.intValue() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            GetSlbInfoBeanResultData data4 = getSlbInfoBeanResult.getData();
            if (data4 != null) {
                list = data4.getCdn_list();
            } else {
                list = null;
            }
            if (!AbstractC6567a.m25635e(list)) {
                C1456h0.f5574a.m6782r(getSlbInfoBeanResult.getData(), false, z10);
                InterfaceC6423s0 interfaceC6423s0 = (InterfaceC6423s0) m618a();
                GetSlbInfoBeanResultData data5 = getSlbInfoBeanResult.getData();
                AbstractC5868k.m23671c(data5);
                interfaceC6423s0.mo25227Y2(data5);
                return;
            }
        }
        C1456h0.f5574a.m6781q(true);
        GetSlbInfoBeanResultData data6 = getSlbInfoBeanResult.getData();
        if (data6 != null) {
            num = data6.getError_code();
        }
        int i10 = 20900;
        if (num != null) {
            GetSlbInfoBeanResultData data7 = getSlbInfoBeanResult.getData();
            AbstractC5868k.m23671c(data7);
            Integer error_code2 = data7.getError_code();
            AbstractC5868k.m23671c(error_code2);
            int intValue = error_code2.intValue();
            if (intValue != 400) {
                if (intValue != 401) {
                    if (intValue != 500) {
                        if (intValue != 503) {
                            GetSlbInfoBeanResultData data8 = getSlbInfoBeanResult.getData();
                            AbstractC5868k.m23671c(data8);
                            Integer error_code3 = data8.getError_code();
                            AbstractC5868k.m23671c(error_code3);
                            i10 = error_code3.intValue();
                        }
                    } else {
                        i10 = 20700;
                    }
                } else {
                    i10 = 20800;
                }
            } else {
                i10 = 20600;
            }
        }
        C1473s.f5656a.m6918b(i10);
        ((InterfaceC6423s0) m618a()).mo25226T0(String.valueOf(i10));
    }

    /* renamed from: h */
    public final void m637h(String str, String str2, String[] strArr, String str3, String str4, boolean z10) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "lang");
        AbstractC5868k.m23674f(strArr, "liveCodeList");
        Observable<Long> timer = Observable.timer(this.f482d, TimeUnit.SECONDS);
        final a aVar = new a(str, str2, strArr, str3, str4);
        Observable<R> flatMap = timer.flatMap(new Function() { // from class: ac.j2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m635j;
                m635j = C0173k2.m635j(InterfaceC5660l.this, obj);
                return m635j;
            }
        });
        AbstractC5868k.m23673e(flatMap, "type: String, lang: Stri…      }\n                }");
        AbstractC6567a.m25631a(flatMap, ((InterfaceC6423s0) m618a()).mo523N3()).subscribe(new b(str, str2, strArr, str3, str4, z10));
    }

    /* renamed from: k */
    public final void m638k() {
        this.f481c = 1800L;
        this.f482d = 0L;
        this.f484f = false;
        Disposable disposable = this.f483e;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
