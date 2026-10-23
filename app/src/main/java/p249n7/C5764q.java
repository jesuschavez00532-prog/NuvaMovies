package p249n7;

import ac.C0159h0;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.AbstractC1468n0;
import cc.C1443b;
import cc.C1466m0;
import cc.C1474t;
import cc.C1475u;
import com.advertlib.bean.AdInfo;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bytedance.boost_multidex.BuildConfig;
import com.google.android.youtube.tv.R;
import com.interactive.brasiliptv.p061ui.activity.GuidePageActivity;
import com.module.event.AdLoadCompleteEvent;
import com.module.event.FreeColumnGetDataEvent;
import com.module.event.RequestLiveColumnSuccessEvent;
import com.module.event.ShowErrorMsgEvent;
import com.request.result.ActiveResult;
import com.request.result.ChildColumn;
import com.request.result.GetColumnContentsResult;
import com.request.result.GetColumnContentsResultData;
import com.request.result.LoginResult;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5878u;
import org.android.agoo.message.MessageService;
import p132fa.C4300d;
import p135fd.C4307b;
import p170i2.C4842a;
import p185j2.C4982a;
import p193ja.C5044a;
import p201k2.C5090g;
import p217l2.InterfaceC5341b;
import p236m7.InterfaceC5605b;
import p236m7.InterfaceC5606c;
import p277p0.C6156m;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6375c0;
import p302qc.C6448c;
import p317rb.AbstractC6567a;
import p321s0.InterfaceC6607b;
import p348u2.AbstractC7026c;
import p348u2.AbstractC7028e;
import p348u2.AbstractC7029f;
import p348u2.AbstractC7030g;
import p383w9.C7383a;
import p400xa.AbstractC7601q1;
import p400xa.C7556b1;
import p400xa.C7577i1;
import p400xa.C7584l;
import p400xa.C7609t0;
import p400xa.C7619y;
import p415y9.AbstractApplicationC7689d;
import p430z9.AbstractActivityC7763a;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import ye.C7709c;
import za.C7776f;

/* renamed from: n7.q */
/* loaded from: classes2.dex */
public final class C5764q implements InterfaceC5605b, InterfaceC6375c0 {

    /* renamed from: a */
    private AbstractActivityC7763a f23082a;

    /* renamed from: b */
    private InterfaceC5606c f23083b;

    /* renamed from: c */
    private final String f23084c;

    /* renamed from: d */
    private final Handler f23085d;

    /* renamed from: e */
    private final InterfaceC1312h f23086e;

    /* renamed from: f */
    private C0159h0 f23087f;

    /* renamed from: n7.q$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ boolean f23088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10) {
            super(1);
            this.f23088a = z10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (this.f23088a) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(AbstractC5868k.m23669a(C7577i1.f27838b.m29084c().m29074f("guide_version", ""), str));
        }
    }

    /* renamed from: n7.q$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Boolean bool) {
            AbstractC5868k.m23674f(bool, "alreadyShowGuide");
            if (!bool.booleanValue() && C4842a.f20329a.m19920a().mo19925B()) {
                AbstractC7601q1.m29249c(49902, 49902);
                AbstractC7026c.m27112b(C5764q.this.m23214u4(), R.mipmap.guide_page_01, false);
                AbstractC7026c.m27112b(C5764q.this.m23214u4(), R.mipmap.guide_page_02, false);
            } else {
                AbstractC7601q1.m29248b(49902);
                AbstractC7026c.m27112b(C5764q.this.m23214u4(), R.color.color_0b0b0b, false);
            }
            return bool;
        }
    }

    /* renamed from: n7.q$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m23218a(Boolean bool) {
            String str = null;
            AbstractC5868k.m23673e(bool, "alreadyShowGuide");
            if (bool.booleanValue()) {
                str = C3325bt.f14194aL;
            } else {
                str = "d";
            }
            AbstractC7028e.m27117c(str);
            if (!bool.booleanValue() && C4842a.f20329a.m19920a().mo19925B()) {
                C7619y.f28056a.m29369b(C5764q.this.m23214u4(), GuidePageActivity.class);
            } else {
                C6448c.m25240q(C5634i.m22843d("http://module_main/HomeActivity").m25255u("formPageKey", 1).m25254t(67108864), C5764q.this.m23214u4(), null, 2, null);
            }
            C5764q.this.m23214u4().finish();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23218a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: n7.q$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f23091a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m23219a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23219a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: n7.q$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC6607b {
        e() {
        }

        @Override // p321s0.InterfaceC6607b
        /* renamed from: a */
        public void mo23220a(String str, boolean z10) {
            AbstractC5868k.m23674f(str, "adType");
        }

        @Override // p321s0.InterfaceC6607b
        /* renamed from: b */
        public void mo23221b(boolean z10) {
            C7709c.m29787d().m29801m(new AdLoadCompleteEvent());
        }
    }

    /* renamed from: n7.q$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final f f23092a = new f();

        f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (C4842a.f20329a.m19920a().m19932I()) {
                return "1";
            }
            return MessageService.MSG_DB_READY_REPORT;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n7.q$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m23223a(C5752e c5752e) {
            InterfaceC5606c m23207C4 = C5764q.this.m23207C4();
            AbstractC5868k.m23673e(c5752e, "it");
            m23207C4.mo11396a3(c5752e);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23223a((C5752e) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n7.q$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f23094a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m23224a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23224a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: n7.q$i */
    /* loaded from: classes2.dex */
    public static final class i implements C7776f.a {
        i() {
        }

        @Override // za.C7776f.a
        /* renamed from: a */
        public void mo11443a(boolean z10, String str, ActiveResult activeResult, LoginResult loginResult, String str2, String str3) {
            AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
            AbstractC5868k.m23674f(str2, "uri");
            AbstractC5868k.m23674f(str3, "accountType");
            if (z10) {
                C7609t0.f27981a.m29259h(AbstractApplicationC7689d.f28135d.m29494a());
                C5764q.this.m23215v4(null, null, 10001);
                C5764q.this.m23178I4();
            }
        }
    }

    public C5764q(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5606c interfaceC5606c) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5606c, "view");
        this.f23082a = abstractActivityC7763a;
        this.f23083b = interfaceC5606c;
        this.f23084c = C5764q.class.getSimpleName();
        this.f23085d = new Handler();
        m5965b = AbstractC1314j.m5965b(f.f23092a);
        this.f23086e = m5965b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I4 */
    public final void m23178I4() {
        C6156m c6156m = C6156m.f24180a;
        AbstractActivityC7763a abstractActivityC7763a = this.f23082a;
        C1466m0 c1466m0 = C1466m0.f5627a;
        C6156m.m24526c0(c6156m, abstractActivityC7763a, c1466m0.m6885t(), c1466m0.m6870i(), new e(), null, false, 48, null);
    }

    /* renamed from: K4 */
    private final void m23180K4() {
        C7577i1.f27838b.m29085d().m29074f("isShowFreeOverDialog", Boolean.FALSE);
        C7383a.m28494e(C7383a.f27389a, null, 1, null);
        List<AdInfo> m24562N = C6156m.f24180a.m24562N(this.f23082a, "picture");
        ComponentCallbacks2C1586c.m7284w(this.f23082a);
        if (m24562N == null) {
            m23210O4();
        } else {
            ArrayList arrayList = new ArrayList();
            String str = (String) C4982a.f20721a.m20333a(AbstractApplicationC7689d.f28135d.m29494a(), C5090g.f20948a.m20647l(), "");
            if (AbstractC5868k.m23669a(str, "2")) {
                for (AdInfo adInfo : m24562N) {
                    if (AbstractC5868k.m23669a("no", adInfo.is_dealer()) || AbstractC5868k.m23669a("default", adInfo.is_dealer())) {
                        arrayList.add(adInfo);
                    }
                }
            } else if (AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT)) {
                for (AdInfo adInfo2 : m24562N) {
                    if (AbstractC5868k.m23669a("yes", adInfo2.is_dealer()) || AbstractC5868k.m23669a("default", adInfo2.is_dealer())) {
                        arrayList.add(adInfo2);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AdInfo adInfo3 = (AdInfo) arrayList.get(new Random().nextInt(arrayList.size()));
                m23195b5(adInfo3);
                C6156m.f24180a.m24570W(adInfo3);
            } else {
                m23210O4();
            }
        }
        C7383a.m28493c(C7383a.f27389a, null, 1, null);
    }

    /* renamed from: M4 */
    private final void m23181M4(String str, String str2) {
        if (AbstractC6567a.m25637g(str)) {
            C1474t.f5658a.m6919a(str);
            C7709c.m29787d().m29802p(new ShowErrorMsgEvent(str, str2));
        }
    }

    /* renamed from: N4 */
    private final void m23182N4() {
        C1466m0.f5627a.m6853Z(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P4 */
    public static final C5752e m23185P4(C5764q c5764q) {
        AbstractC5868k.m23674f(c5764q, "this$0");
        long j10 = 0;
        if (C4842a.f20329a.m19920a().mo19946W()) {
            Drawable drawable = c5764q.f23082a.getResources().getDrawable(R.drawable.anim_welcome_loading);
            AbstractC5868k.m23672d(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            for (int i10 = 0; i10 < animationDrawable.getNumberOfFrames(); i10++) {
                j10 += animationDrawable.getDuration(i10);
            }
            return new C5752e(true, animationDrawable, j10);
        }
        return new C5752e(false, null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q4 */
    public static final void m23187Q4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S4 */
    public static final void m23188S4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y4 */
    public static final void m23193Y4(C5764q c5764q) {
        AbstractC5868k.m23674f(c5764q, "this$0");
        C6156m c6156m = C6156m.f24180a;
        c6156m.m24573h0(new C1475u());
        c6156m.m24574i0(new C1443b());
        C7383a c7383a = C7383a.f27389a;
        C7383a.m28494e(c7383a, null, 1, null);
        Schedulers.computation();
        Flowable.bufferSize();
        c5764q.m23208D4();
        AbstractC1468n0.m6897e();
        c5764q.m23196c4();
        c5764q.m23197d4();
        c5764q.m23198e4();
        c5764q.m23182N4();
        C7776f c7776f = C7776f.f28648a;
        c7776f.m30099j0(c5764q.f23082a);
        InterfaceC5341b interfaceC5341b = (InterfaceC5341b) C5634i.m22844e(InterfaceC5341b.class, new Object[0]);
        if (interfaceC5341b != null) {
            interfaceC5341b.mo20171b(c5764q.f23082a);
        }
        c5764q.m23180K4();
        InterfaceC5341b interfaceC5341b2 = (InterfaceC5341b) C5634i.m22844e(InterfaceC5341b.class, new Object[0]);
        if (interfaceC5341b2 != null) {
            interfaceC5341b2.mo20174e();
        }
        C7383a.m28493c(c7383a, null, 1, null);
        c7776f.m30102r(new i());
    }

    /* renamed from: b5 */
    private final void m23195b5(final AdInfo adInfo) {
        this.f23085d.post(new Runnable() { // from class: n7.g
            @Override // java.lang.Runnable
            public final void run() {
                C5764q.m23199e5(C5764q.this, adInfo);
            }
        });
    }

    /* renamed from: c4 */
    private final void m23196c4() {
    }

    /* renamed from: d4 */
    private final void m23197d4() {
        C4982a.a m20334b = C4982a.f20721a.m20334b(this.f23082a);
        C4300d c4300d = C4300d.f18678a;
        m20334b.m20338c(c4300d.m18035h(), "").m20338c(c4300d.m18043l(), "").m20338c(c4300d.m18031f(), "").m20338c(c4300d.m18029e(), "").m20338c("Special_root", "").m20340e("home_hot_search").m20336a();
    }

    /* renamed from: e4 */
    private final void m23198e4() {
        String str = null;
        try {
            C5090g c5090g = C5090g.f20948a;
            StringBuilder sb2 = new StringBuilder();
            File externalCacheDir = AbstractApplicationC6253c.f24484b.m24887a().getExternalCacheDir();
            if (externalCacheDir != null) {
                str = externalCacheDir.getAbsolutePath();
            } else {
                str = null;
            }
            sb2.append(str);
            sb2.append("/sub");
            c5090g.m20639c(new File(sb2.toString()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e5 */
    public static final void m23199e5(C5764q c5764q, AdInfo adInfo) {
        AbstractC5868k.m23674f(c5764q, "this$0");
        AbstractC5868k.m23674f(adInfo, "$adInfo");
        c5764q.f23083b.mo11392A2(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h4 */
    public static final void m23200h4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k4 */
    public static final void m23201k4(C5764q c5764q) {
        AbstractC5868k.m23674f(c5764q, "this$0");
        InterfaceC5605b.a.m22775a(c5764q, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q4 */
    public static final Boolean m23202q4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r4 */
    public static final Boolean m23203r4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s4 */
    public static final void m23204s4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* renamed from: w4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m23205w4(ne.C5878u r19, int r20, p249n7.C5764q r21, java.lang.Integer r22, java.lang.String r23, ne.C5878u r24) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p249n7.C5764q.m23205w4(ne.u, int, n7.q, java.lang.Integer, java.lang.String, ne.u):void");
    }

    /* renamed from: x4 */
    private final String m23206x4() {
        return (String) this.f23086e.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    /* renamed from: C4 */
    public final InterfaceC5606c m23207C4() {
        return this.f23083b;
    }

    /* renamed from: D4 */
    public void m23208D4() {
        if (C4842a.f20329a.m19920a().m19933J()) {
            C7383a c7383a = C7383a.f27389a;
            C7383a.m28494e(c7383a, null, 1, null);
            this.f23083b.mo11399z(C1466m0.f5627a.m6866g());
            C7383a.m28493c(c7383a, null, 1, null);
        }
    }

    @Override // p301qb.InterfaceC6375c0
    /* renamed from: L2 */
    public void mo23209L2(GetColumnContentsResult getColumnContentsResult, int i10) {
        List<ChildColumn> childColumnList;
        boolean m23669a;
        boolean m23669a2;
        boolean m23669a3;
        boolean m23669a4;
        boolean m23669a5;
        boolean m23669a6;
        List<ChildColumn> childColumnList2;
        InterfaceC5341b interfaceC5341b;
        InterfaceC5341b interfaceC5341b2;
        AbstractC5868k.m23674f(getColumnContentsResult, "result");
        C7383a.m28494e(C7383a.f27389a, null, 1, null);
        if (i10 != 10001) {
            if (i10 != 10002) {
                if (i10 == 10006) {
                    C5044a.f20862a.m20489e(C4300d.f18678a.m18029e(), getColumnContentsResult.getData());
                    C7709c.m29787d().m29801m(new FreeColumnGetDataEvent());
                }
            } else {
                GetColumnContentsResultData data = getColumnContentsResult.getData();
                if (data != null && (childColumnList2 = data.getChildColumnList()) != null) {
                    int size = childColumnList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (AbstractC5868k.m23669a(childColumnList2.get(i11).getRestricted(), "1") && (interfaceC5341b2 = (InterfaceC5341b) C5634i.m22844e(InterfaceC5341b.class, new Object[0])) != null) {
                            interfaceC5341b2.mo20173d(childColumnList2.get(i11), i11);
                        }
                        if (AbstractC5868k.m23669a(childColumnList2.get(i11).isAv1(), "1") && (interfaceC5341b = (InterfaceC5341b) C5634i.m22844e(InterfaceC5341b.class, new Object[0])) != null) {
                            interfaceC5341b.mo20175f(childColumnList2.get(i11), i11);
                        }
                    }
                }
                AbstractC7028e.m27117c("e");
                C5044a.f20862a.m20489e(C4300d.f18678a.m18035h(), getColumnContentsResult.getData());
                C7709c.m29787d().m29802p(new RequestLiveColumnSuccessEvent());
                InterfaceC5341b interfaceC5341b3 = (InterfaceC5341b) C5634i.m22844e(InterfaceC5341b.class, new Object[0]);
                if (interfaceC5341b3 != null) {
                    interfaceC5341b3.mo20170a();
                }
            }
        } else {
            GetColumnContentsResultData data2 = getColumnContentsResult.getData();
            if (data2 != null && (childColumnList = data2.getChildColumnList()) != null) {
                for (ChildColumn childColumn : childColumnList) {
                    String code = childColumn.getCode();
                    C4300d c4300d = C4300d.f18678a;
                    if (AbstractC5868k.m23669a(code, c4300d.m18035h())) {
                        m23215v4(Integer.valueOf(childColumn.getId()), MessageService.MSG_DB_READY_REPORT, 10002);
                        C7584l.f27868a.m29109g(childColumn);
                    } else {
                        if (AbstractC5868k.m23669a(code, c4300d.m18027d())) {
                            m23669a = true;
                        } else {
                            m23669a = AbstractC5868k.m23669a(code, c4300d.m18025c());
                        }
                        if (m23669a) {
                            m23669a2 = true;
                        } else {
                            m23669a2 = AbstractC5868k.m23669a(code, c4300d.m18045m());
                        }
                        if (m23669a2) {
                            m23669a3 = true;
                        } else {
                            m23669a3 = AbstractC5868k.m23669a(code, c4300d.m18033g());
                        }
                        if (m23669a3) {
                            m23669a4 = true;
                        } else {
                            m23669a4 = AbstractC5868k.m23669a(code, c4300d.m18039j());
                        }
                        if (m23669a4) {
                            m23669a5 = true;
                        } else {
                            m23669a5 = AbstractC5868k.m23669a(code, c4300d.m18041k());
                        }
                        if (m23669a5) {
                            m23669a6 = true;
                        } else {
                            m23669a6 = AbstractC5868k.m23669a(code, c4300d.m18023b());
                        }
                        if (m23669a6) {
                            C5044a.f20862a.m20489e(childColumn.getCode(), childColumn);
                            C7584l.f27868a.m29109g(childColumn);
                        } else if (AbstractC5868k.m23669a(code, c4300d.m18043l())) {
                            C5044a.f20862a.m20489e("Special_root", childColumn);
                        } else if (AbstractC5868k.m23669a(code, c4300d.m18031f())) {
                            C5044a.f20862a.m20489e(c4300d.m18031f(), childColumn);
                        } else if (AbstractC5868k.m23669a(code, c4300d.m18029e())) {
                            m23215v4(Integer.valueOf(childColumn.getId()), MessageService.MSG_DB_READY_REPORT, IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO);
                            C7584l.f27868a.m29109g(childColumn);
                        } else if (AbstractC5868k.m23669a(code, c4300d.m18037i())) {
                            C7584l.f27868a.m29109g(childColumn);
                        }
                    }
                }
            }
            C5044a.f20862a.m20488d();
            C7584l.f27868a.m29108f();
        }
        C7383a.m28493c(C7383a.f27389a, null, 1, null);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return null;
    }

    /* renamed from: O4 */
    public void m23210O4() {
        Observable compose = Observable.fromCallable(new Callable() { // from class: n7.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C5752e m23185P4;
                m23185P4 = C5764q.m23185P4(C5764q.this);
                return m23185P4;
            }
        }).compose(AbstractC7029f.m27121b());
        final g gVar = new g();
        Consumer consumer = new Consumer() { // from class: n7.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5764q.m23187Q4(InterfaceC5660l.this, obj);
            }
        };
        final h hVar = h.f23094a;
        compose.subscribe(consumer, new Consumer() { // from class: n7.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5764q.m23188S4(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p301qb.InterfaceC6375c0
    /* renamed from: S5 */
    public void mo23211S5(String str, int i10, boolean z10) {
        AbstractC5868k.m23674f(str, "errCode");
        m23181M4(str, "/getColumnContents");
    }

    /* renamed from: X4 */
    public void m23212X4() {
        AbstractC7030g.m27128b("load launch data", new Runnable() { // from class: n7.m
            @Override // java.lang.Runnable
            public final void run() {
                C5764q.m23193Y4(C5764q.this);
            }
        }, false);
    }

    /* renamed from: g4 */
    public void m23213g4(long j10) {
        this.f23085d.postDelayed(new Runnable() { // from class: n7.f
            @Override // java.lang.Runnable
            public final void run() {
                C5764q.m23201k4(C5764q.this);
            }
        }, j10);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p236m7.InterfaceC5605b
    /* renamed from: t3 */
    public void mo22774t3(boolean z10) {
        if (C4842a.f20329a.m19920a().m19969r() && C7556b1.f27754a.m28964b()) {
            return;
        }
        Observable just = Observable.just(BuildConfig.VERSION_NAME);
        final a aVar = new a(z10);
        Observable map = just.map(new Function() { // from class: n7.i
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m23202q4;
                m23202q4 = C5764q.m23202q4(InterfaceC5660l.this, obj);
                return m23202q4;
            }
        });
        final b bVar = new b();
        Observable compose = map.map(new Function() { // from class: n7.j
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m23203r4;
                m23203r4 = C5764q.m23203r4(InterfaceC5660l.this, obj);
                return m23203r4;
            }
        }).compose(AbstractC7029f.m27121b());
        final c cVar = new c();
        Consumer consumer = new Consumer() { // from class: n7.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5764q.m23204s4(InterfaceC5660l.this, obj);
            }
        };
        final d dVar = d.f23091a;
        compose.subscribe(consumer, new Consumer() { // from class: n7.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5764q.m23200h4(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: u4 */
    public final AbstractActivityC7763a m23214u4() {
        return this.f23082a;
    }

    /* renamed from: v4 */
    public void m23215v4(final Integer num, final String str, final int i10) {
        final C5878u c5878u = new C5878u();
        final C5878u c5878u2 = new C5878u();
        AbstractC7030g.m27129c("loadCacheColumnsInfo", new Runnable() { // from class: n7.h
            @Override // java.lang.Runnable
            public final void run() {
                C5764q.m23205w4(C5878u.this, i10, this, num, str, c5878u2);
            }
        }, false);
    }
}
