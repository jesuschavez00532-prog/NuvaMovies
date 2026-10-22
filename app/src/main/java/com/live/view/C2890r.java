package com.live.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.adimage.view.PauseAdView;
import com.advertlib.bean.AdInfo;
import com.live.R$array;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.module.R$mipmap;
import com.module.playsetting.view.PlaySettingView;
import com.module.view.AutoFocusedTextView;
import com.module.view.NumberSeekBar;
import com.module.view.net.NetSpeedTextView;
import com.request.result.UserInfo;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p012ab.C0128d;
import p102db.C4053l;
import p153h2.AbstractC4509b;
import p185j2.C4982a;
import p201k2.AbstractC5086c;
import p201k2.AbstractC5095l;
import p201k2.C5090g;
import p242n0.C5714a;
import p277p0.C6156m;
import p277p0.C6160q;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p361v0.AbstractC7189b;
import p400xa.AbstractC7555b0;
import p400xa.C7577i1;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p415y9.AbstractApplicationC7689d;

/* renamed from: com.live.view.r */
/* loaded from: classes2.dex */
public final class C2890r extends RelativeLayout implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    private final String f11047a;

    /* renamed from: b */
    private final int f11048b;

    /* renamed from: c */
    private final String f11049c;

    /* renamed from: d */
    private ObjectAnimator f11050d;

    /* renamed from: e */
    private final long f11051e;

    /* renamed from: f */
    private int f11052f;

    /* renamed from: g */
    private boolean f11053g;

    /* renamed from: h */
    private a f11054h;

    /* renamed from: i */
    private InterfaceC5642a f11055i;

    /* renamed from: j */
    private b f11056j;

    /* renamed from: k */
    private String[] f11057k;

    /* renamed from: l */
    private boolean f11058l;

    /* renamed from: m */
    private AdInfo f11059m;

    /* renamed from: n */
    private PauseAdView f11060n;

    /* renamed from: o */
    private String f11061o;

    /* renamed from: p */
    private final InterfaceC1312h f11062p;

    /* renamed from: q */
    private final Runnable f11063q;

    /* renamed from: r */
    private final c f11064r;

    /* renamed from: s */
    private final e f11065s;

    /* renamed from: t */
    public Map f11066t = new LinkedHashMap();

    /* renamed from: com.live.view.r$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo11736a();

        /* renamed from: b */
        void mo11737b();

        /* renamed from: c */
        void mo11738c(int i10);
    }

    /* renamed from: com.live.view.r$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: Z */
        void mo11739Z(int i10);

        /* renamed from: k0 */
        void mo11740k0(int i10);

        /* renamed from: w0 */
        void mo11741w0(int i10);
    }

    /* renamed from: com.live.view.r$c */
    /* loaded from: classes2.dex */
    public static final class c extends Handler {

        /* renamed from: a */
        final /* synthetic */ C2890r f11067a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Looper looper, C2890r c2890r) {
            super(looper);
            this.f11067a = c2890r;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC5868k.m23674f(message, "msg");
            if (message.what == this.f11067a.f11048b && !C4053l.f17879P0.m17070a() && !this.f11067a.f11058l) {
                this.f11067a.m11731t();
            }
        }
    }

    /* renamed from: com.live.view.r$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObjectAnimator invoke() {
            return ObjectAnimator.ofFloat((RelativeLayout) C2890r.this.m11727g(R$id.mRlInfoBar), "translationY", AutoSizeUtils.dp2px(C2890r.this.getContext(), 160.0f), 0.0f);
        }
    }

    /* renamed from: com.live.view.r$e */
    /* loaded from: classes2.dex */
    public static final class e implements PlaySettingView.InterfaceC2975b {
        e() {
        }

        @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
        /* renamed from: A3 */
        public void mo7566A3(int i10) {
        }

        @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
        /* renamed from: Z */
        public void mo7568Z(int i10) {
            b bVar = C2890r.this.f11056j;
            if (bVar != null) {
                bVar.mo11739Z(i10);
            }
            TextView textView = (TextView) C2890r.this.m11727g(R$id.mTvRatio);
            String[] strArr = C2890r.this.f11057k;
            if (strArr == null) {
                AbstractC5868k.m23686r("mRatioArray");
                strArr = null;
            }
            textView.setText(strArr[i10]);
        }

        @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
        /* renamed from: k0 */
        public void mo7569k0(int i10) {
            b bVar = C2890r.this.f11056j;
            if (bVar != null) {
                bVar.mo11740k0(i10);
            }
        }

        @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
        /* renamed from: k6 */
        public void mo7570k6(int i10) {
        }

        @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
        /* renamed from: w0 */
        public void mo7572w0(int i10) {
            b bVar = C2890r.this.f11056j;
            if (bVar != null) {
                bVar.mo11741w0(i10);
            }
        }

        @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
        /* renamed from: w5 */
        public void mo7573w5(int i10) {
        }

        @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
        /* renamed from: x4 */
        public void mo7574x4(int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.live.view.r$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5642a {
        f() {
            super(0);
        }

        /* renamed from: a */
        public final void m11743a() {
            C2890r.this.m11720J();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11743a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.live.view.r$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5642a {
        g() {
            super(0);
        }

        /* renamed from: a */
        public final void m11744a() {
            C2890r.this.m11694N();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11744a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.live.view.r$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ AdInfo f11073b;

        /* renamed from: com.live.view.r$h$a */
        /* loaded from: classes2.dex */
        public static final class a implements Animator.AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C2890r f11074a;

            a(C2890r c2890r) {
                this.f11074a = c2890r;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                boolean z10;
                AbstractC5868k.m23674f(animator, "animation");
                if (!this.f11074a.m11716B()) {
                    C2890r c2890r = this.f11074a;
                    int i10 = R$id.mIvPlayStatus;
                    if (((ImageView) c2890r.m11727g(i10)).getTranslationX() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        ((ImageView) this.f11074a.m11727g(i10)).setTranslationX(0.0f);
                        ((ImageView) this.f11074a.m11727g(i10)).setTranslationY(0.0f);
                    }
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                boolean z10;
                AbstractC5868k.m23674f(animator, "animation");
                if (!this.f11074a.m11716B()) {
                    C2890r c2890r = this.f11074a;
                    int i10 = R$id.mIvPlayStatus;
                    if (((ImageView) c2890r.m11727g(i10)).getTranslationX() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        ((ImageView) this.f11074a.m11727g(i10)).setTranslationX(0.0f);
                        ((ImageView) this.f11074a.m11727g(i10)).setTranslationY(0.0f);
                    }
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                AbstractC5868k.m23674f(animator, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC5868k.m23674f(animator, "animation");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AdInfo adInfo) {
            super(1);
            this.f11073b = adInfo;
        }

        /* renamed from: a */
        public final void m11745a(boolean z10) {
            PauseAdView pauseAdView;
            if (z10 && (pauseAdView = C2890r.this.f11060n) != null) {
                C2890r c2890r = C2890r.this;
                AdInfo adInfo = this.f11073b;
                pauseAdView.setVisibility(0);
                C6160q c6160q = C6160q.f24221a;
                Context context = c2890r.getContext();
                AbstractC5868k.m23673e(context, C3384f.f14563X);
                c6160q.m24600i(context, C1466m0.f5627a.m6888w(), C5714a.f22937a.m23089b(), adInfo);
                C7589m1.f27886a.m29132a(C7589m1.a.f27892a.m29158a(), c2890r.getProgramTitle());
                String m27820a = AbstractC7189b.m27820a(adInfo);
                if (!AbstractC6567a.m25634d(m27820a)) {
                    Bitmap m20687a = AbstractC5095l.m20687a(m27820a, AutoSizeUtils.dp2px(c2890r.getContext(), 110.0f));
                    AbstractC5868k.m23673e(m20687a, "qRCodeBitmap");
                    PauseAdView.m7048h(pauseAdView, m20687a, null, 2, null);
                }
                int i10 = R$id.mIvPlayStatus;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) c2890r.m11727g(i10), "translationX", 0.0f, AutoSizeUtils.dp2px(c2890r.getContext(), 300.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((ImageView) c2890r.m11727g(i10), "translationY", 0.0f, AutoSizeUtils.dp2px(c2890r.getContext(), 160.0f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(500L);
                animatorSet.addListener(new a(c2890r));
                animatorSet.start();
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11745a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    public C2890r(Context context) {
        super(context);
        InterfaceC1312h m5965b;
        c cVar;
        this.f11047a = C2890r.class.getSimpleName();
        this.f11048b = 10001;
        LayoutInflater.from(getContext()).inflate(R$layout.layout_mf_back_infobar, (ViewGroup) this, true);
        m11715z();
        m11714y();
        m11711n();
        this.f11049c = "00:00:00";
        this.f11051e = 10000L;
        this.f11061o = C5714a.f22937a.m23089b();
        m5965b = AbstractC1314j.m5965b(new d());
        this.f11062p = m5965b;
        this.f11063q = new Runnable() { // from class: com.live.view.p
            @Override // java.lang.Runnable
            public final void run() {
                C2890r.m11691G(C2890r.this);
            }
        };
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            cVar = new c(myLooper, this);
        } else {
            cVar = null;
        }
        this.f11064r = cVar;
        this.f11065s = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final boolean m11689A(C2890r c2890r, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c2890r, "this$0");
        if (i10 == 21 || i10 == 22) {
            if (keyEvent.getAction() == 0) {
                c2890r.f11058l = true;
                if (i10 == 21) {
                    a aVar = c2890r.f11054h;
                    if (aVar != null) {
                        aVar.mo11736a();
                    }
                } else {
                    a aVar2 = c2890r.f11054h;
                    if (aVar2 != null) {
                        aVar2.mo11737b();
                    }
                }
            } else if (keyEvent.getAction() == 1) {
                c2890r.f11058l = false;
                c2890r.m11720J();
                a aVar3 = c2890r.f11054h;
                if (aVar3 != null) {
                    aVar3.mo11738c(((NumberSeekBar) c2890r.m11727g(R$id.mSeekBar)).getProgress());
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    private final AdInfo m11690F() {
        String str;
        String hasPay;
        C6156m c6156m = C6156m.f24180a;
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        String str2 = this.f11061o;
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        String str3 = "1";
        if (m6887v == null || (str = m6887v.getUserIdentity()) == null) {
            str = "1";
        }
        UserInfo m6887v2 = c1466m0.m6887v();
        if (m6887v2 != null && (hasPay = m6887v2.getHasPay()) != null) {
            str3 = hasPay;
        }
        List<AdInfo> m24515I = C6156m.m24515I(c6156m, context, str2, "picture", str, false, str3, 16, null);
        if (AbstractC6567a.m25638h(m24515I)) {
            ArrayList arrayList = new ArrayList();
            String str4 = (String) C4982a.f20721a.m20333a(AbstractApplicationC7689d.f28135d.m29494a(), C5090g.f20948a.m20647l(), "");
            if (AbstractC5868k.m23669a(str4, "2")) {
                AbstractC5868k.m23671c(m24515I);
                for (AdInfo adInfo : m24515I) {
                    if (AbstractC5868k.m23669a("no", adInfo.is_dealer()) || AbstractC5868k.m23669a("default", adInfo.is_dealer())) {
                        arrayList.add(adInfo);
                    }
                }
            } else if (AbstractC5868k.m23669a(str4, MessageService.MSG_DB_READY_REPORT)) {
                AbstractC5868k.m23671c(m24515I);
                for (AdInfo adInfo2 : m24515I) {
                    if (AbstractC5868k.m23669a("yes", adInfo2.is_dealer()) || AbstractC5868k.m23669a("default", adInfo2.is_dealer())) {
                        arrayList.add(adInfo2);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AdInfo adInfo3 = (AdInfo) arrayList.get(new Random().nextInt(arrayList.size()));
                C6156m.f24180a.m24569V(adInfo3);
                return adInfo3;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final void m11691G(C2890r c2890r) {
        AbstractC5868k.m23674f(c2890r, "this$0");
        if (!C4053l.f17879P0.m17071b(C4053l.c.BackInfoBar) && c2890r.m11718D()) {
            c2890r.m11695Q();
        }
    }

    /* renamed from: H */
    private final void m11692H() {
        C0128d c0128d = C0128d.f375a;
        NetSpeedTextView netSpeedTextView = (NetSpeedTextView) m11727g(R$id.mTvNetSpeed);
        AbstractC5868k.m23673e(netSpeedTextView, "mTvNetSpeed");
        c0128d.m513n(netSpeedTextView);
        NetSpeedTextView netSpeedTextView2 = (NetSpeedTextView) m11727g(R$id.mTvLoadingSpeed);
        AbstractC5868k.m23673e(netSpeedTextView2, "mTvLoadingSpeed");
        c0128d.m513n(netSpeedTextView2);
    }

    /* renamed from: I */
    private final void m11693I() {
        int i10 = R$id.mIvArrowDown;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) m11727g(i10), "translationY", -5.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((ImageView) m11727g(i10), "alpha", 1.0f, 0.5f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(1200L);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final void m11694N() {
        C4053l c4053l = new C4053l();
        ImageView imageView = (ImageView) m11727g(R$id.mIvArrowDown);
        AbstractC5868k.m23673e(imageView, "mIvArrowDown");
        c4053l.m17069ea(imageView);
        c4053l.m17067ca(C4053l.b.TOP_RIGHT);
        c4053l.m17065aa(R$layout.layout_guide_back_infobar_down);
        c4053l.m17066ba(-AutoSizeUtils.dp2px(getContext(), 30.0f), AutoSizeUtils.dp2px(getContext(), 13.0f));
        c4053l.m17068da(new f());
        Context context = getContext();
        AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
        c4053l.mo3277E9(m3294d4, "GuideDialog");
    }

    /* renamed from: Q */
    private final void m11695Q() {
        c cVar = this.f11064r;
        if (cVar != null) {
            cVar.removeMessages(this.f11048b);
        }
        C4053l c4053l = new C4053l();
        ImageView imageView = (ImageView) m11727g(R$id.mIvMenu);
        AbstractC5868k.m23673e(imageView, "mIvMenu");
        c4053l.m17069ea(imageView);
        c4053l.m17067ca(C4053l.b.TOP_RIGHT);
        c4053l.m17065aa(R$layout.layout_guide_back_infobar_menu);
        c4053l.m17066ba(-AutoSizeUtils.dp2px(getContext(), 30.0f), AutoSizeUtils.dp2px(getContext(), 13.0f));
        c4053l.m17068da(new g());
        Context context = getContext();
        AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
        c4053l.mo3277E9(m3294d4, "GuideDialog");
        C4053l.f17879P0.m17073d(C4053l.c.BackInfoBar, true);
    }

    /* renamed from: R */
    private final void m11696R(final AdInfo adInfo) {
        ImageView imageView;
        C6156m c6156m = C6156m.f24180a;
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        C5714a c5714a = C5714a.f22937a;
        c6156m.m24572g0(context, c5714a.m23089b(), adInfo.getAd_id());
        Context context2 = getContext();
        AbstractC5868k.m23673e(context2, C3384f.f14563X);
        PauseAdView pauseAdView = this.f11060n;
        if (pauseAdView != null) {
            imageView = pauseAdView.getAdView();
        } else {
            imageView = null;
        }
        AbstractC5868k.m23671c(imageView);
        C6156m.m24538k0(c6156m, context2, imageView, c5714a.m23089b(), adInfo, null, new h(adInfo), Integer.MIN_VALUE, false, 0, 400, null);
        PauseAdView pauseAdView2 = this.f11060n;
        if (pauseAdView2 != null) {
            pauseAdView2.setOnClickListener(new View.OnClickListener() { // from class: com.live.view.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2890r.m11697S(AdInfo.this, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m11697S(AdInfo adInfo, C2890r c2890r, View view) {
        AbstractC5868k.m23674f(adInfo, "$adInfo");
        AbstractC5868k.m23674f(c2890r, "this$0");
        String m27820a = AbstractC7189b.m27820a(adInfo);
        Context context = c2890r.getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        if (AbstractC7555b0.m28950d(m27820a, context)) {
            C6160q c6160q = C6160q.f24221a;
            Context context2 = c2890r.getContext();
            AbstractC5868k.m23673e(context2, C3384f.f14563X);
            c6160q.m24599h(context2, C1466m0.f5627a.m6888w(), C5714a.f22937a.m23089b(), adInfo);
        }
    }

    /* renamed from: T */
    private final void m11698T() {
        if (this.f11050d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) m11727g(R$id.mIvLoading), "rotation", 0.0f, 360.0f);
            ofFloat.setDuration(1500L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            this.f11050d = ofFloat;
        }
        ObjectAnimator objectAnimator = this.f11050d;
        AbstractC5868k.m23671c(objectAnimator);
        if (!objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f11050d;
            AbstractC5868k.m23671c(objectAnimator2);
            objectAnimator2.start();
        }
    }

    private final ObjectAnimator getMInfoBarAnimator() {
        return (ObjectAnimator) this.f11062p.getValue();
    }

    /* renamed from: n */
    private final void m11711n() {
        C0128d c0128d = C0128d.f375a;
        NetSpeedTextView netSpeedTextView = (NetSpeedTextView) m11727g(R$id.mTvNetSpeed);
        AbstractC5868k.m23673e(netSpeedTextView, "mTvNetSpeed");
        c0128d.m510e(netSpeedTextView);
        NetSpeedTextView netSpeedTextView2 = (NetSpeedTextView) m11727g(R$id.mTvLoadingSpeed);
        AbstractC5868k.m23673e(netSpeedTextView2, "mTvLoadingSpeed");
        c0128d.m510e(netSpeedTextView2);
    }

    /* renamed from: o */
    private final void m11712o() {
        ObjectAnimator objectAnimator = this.f11050d;
        if (objectAnimator == null) {
            return;
        }
        AbstractC5868k.m23671c(objectAnimator);
        if (objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f11050d;
            AbstractC5868k.m23671c(objectAnimator2);
            objectAnimator2.cancel();
        }
        this.f11050d = null;
    }

    /* renamed from: q */
    private final void m11713q() {
        if (this.f11060n != null) {
            return;
        }
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        PauseAdView pauseAdView = new PauseAdView(context, null, 0, 6, null);
        this.f11060n = pauseAdView;
        pauseAdView.m7051c();
        PauseAdView pauseAdView2 = this.f11060n;
        if (pauseAdView2 != null) {
            pauseAdView2.setFocusable(false);
        }
        PauseAdView pauseAdView3 = this.f11060n;
        if (pauseAdView3 != null) {
            pauseAdView3.setVisibility(8);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AutoSizeUtils.dp2px(getContext(), 467.0f), AutoSizeUtils.dp2px(getContext(), 400.0f));
        layoutParams.addRule(13);
        addView(this.f11060n, 0, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSettingFocus$lambda$3(C2890r c2890r) {
        AbstractC5868k.m23674f(c2890r, "this$0");
        ((PlaySettingView) c2890r.m11727g(R$id.mPlaySettingView)).requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSettingVisibility$lambda$2(C2890r c2890r) {
        AbstractC5868k.m23674f(c2890r, "this$0");
        ((PlaySettingView) c2890r.m11727g(R$id.mPlaySettingView)).requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStatus$lambda$4(C2890r c2890r) {
        AbstractC5868k.m23674f(c2890r, "this$0");
        ((TextView) c2890r.m11727g(R$id.mTvSwitchPlayerStatus)).setVisibility(8);
    }

    /* renamed from: y */
    private final void m11714y() {
        String[] stringArray = getContext().getResources().getStringArray(R$array.play_setting_play_ratio);
        AbstractC5868k.m23673e(stringArray, "context.resources.getStr….play_setting_play_ratio)");
        this.f11057k = stringArray;
        int intValue = ((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue();
        TextView textView = (TextView) m11727g(R$id.mTvRatio);
        String[] strArr = this.f11057k;
        if (strArr == null) {
            AbstractC5868k.m23686r("mRatioArray");
            strArr = null;
        }
        textView.setText(strArr[intValue]);
    }

    /* renamed from: z */
    private final void m11715z() {
        int i10 = R$id.mSeekBar;
        ((NumberSeekBar) m11727g(i10)).setOnSeekBarChangeListener(this);
        ((NumberSeekBar) m11727g(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: com.live.view.q
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m11689A;
                m11689A = C2890r.m11689A(C2890r.this, view, i11, keyEvent);
                return m11689A;
            }
        });
        ((PlaySettingView) m11727g(R$id.mPlaySettingView)).setPageType(2);
        m11711n();
    }

    /* renamed from: B */
    public final boolean m11716B() {
        PauseAdView pauseAdView = this.f11060n;
        if (pauseAdView == null || pauseAdView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final boolean m11717C() {
        if (getFocusedChild() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final boolean m11718D() {
        if (((RelativeLayout) m11727g(R$id.mRlInfoBar)).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean m11719E() {
        if (((PlaySettingView) m11727g(R$id.mPlaySettingView)).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void m11720J() {
        c cVar = this.f11064r;
        if (cVar != null) {
            cVar.removeMessages(this.f11048b);
        }
        c cVar2 = this.f11064r;
        if (cVar2 != null) {
            cVar2.sendEmptyMessageDelayed(this.f11048b, this.f11051e);
        }
    }

    /* renamed from: K */
    public final void m11721K() {
        this.f11053g = true;
    }

    /* renamed from: L */
    public final void m11722L() {
        ((PlaySettingView) m11727g(R$id.mPlaySettingView)).post(new Runnable() { // from class: com.live.view.l
            @Override // java.lang.Runnable
            public final void run() {
                C2890r.setSettingFocus$lambda$3(C2890r.this);
            }
        });
    }

    /* renamed from: M */
    public final void m11723M(String str, String str2) {
        AbstractC5868k.m23674f(str, "currentStream");
        AbstractC5868k.m23674f(str2, "nextStream");
        AutoFocusedTextView autoFocusedTextView = (AutoFocusedTextView) m11727g(R$id.mNowPlayInfo);
        if (autoFocusedTextView != null) {
            autoFocusedTextView.setText(getContext().getString(R$string.now_play) + str);
        }
        AutoFocusedTextView autoFocusedTextView2 = (AutoFocusedTextView) m11727g(R$id.mNextPlayInfo);
        if (autoFocusedTextView2 != null) {
            autoFocusedTextView2.setText(getContext().getString(R$string.next_play) + str2);
        }
    }

    /* renamed from: O */
    public final void m11724O() {
        ((RelativeLayout) m11727g(R$id.mRlInfoBar)).setVisibility(0);
        ((LinearLayout) m11727g(R$id.mLlNetStatus)).setVisibility(0);
        ((NumberSeekBar) m11727g(R$id.mSeekBar)).requestFocus();
        removeCallbacks(this.f11063q);
        postDelayed(this.f11063q, 500L);
        m11693I();
        m11720J();
    }

    /* renamed from: P */
    public final void m11725P() {
        int i10 = R$id.mTvPlayStatus;
        ((TextView) m11727g(i10)).setVisibility(8);
        ((TextView) m11727g(i10)).setText("");
        ((ImageView) m11727g(R$id.mIvLoading)).setVisibility(0);
        ((NetSpeedTextView) m11727g(R$id.mTvLoadingSpeed)).setVisibility(0);
        m11698T();
    }

    /* renamed from: U */
    public final void m11726U(int i10) {
        int i11 = this.f11052f;
        if (i11 != 7 && i11 != 6 && i10 >= 0) {
            ((NumberSeekBar) m11727g(R$id.mSeekBar)).setProgress(i10);
            ((TextView) m11727g(R$id.mTvCurrentTime)).setText(AbstractC5086c.m20623p(i10 / 1000));
        }
    }

    /* renamed from: g */
    public View m11727g(int i10) {
        Map map = this.f11066t;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    public final String getProgramTitle() {
        return ((TextView) m11727g(R$id.mTvName)).getText().toString();
    }

    public final int getState() {
        return this.f11052f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        c cVar = this.f11064r;
        if (cVar != null) {
            cVar.removeMessages(this.f11048b);
        }
        m11692H();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        ((TextView) m11727g(R$id.mTvCurrentTime)).setText(AbstractC5086c.m20623p(i10 / 1000));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: p */
    public final void m11728p() {
        PauseAdView pauseAdView = this.f11060n;
        if (pauseAdView != null) {
            pauseAdView.performClick();
        }
    }

    /* renamed from: r */
    public final void m11729r() {
        ((ImageView) m11727g(R$id.mIvBackState)).setVisibility(8);
        ((TextView) m11727g(R$id.mTvBackTag)).setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = AutoSizeUtils.dp2px(getContext(), 40.0f);
        layoutParams.rightMargin = AutoSizeUtils.dp2px(getContext(), 66.0f);
        layoutParams.addRule(11);
        ((LinearLayout) m11727g(R$id.mLlNetStatus)).setLayoutParams(layoutParams);
    }

    /* renamed from: s */
    public final void m11730s() {
        ((RelativeLayout) m11727g(R$id.mRlInfoBar)).setVisibility(8);
        ((LinearLayout) m11727g(R$id.mLlNetStatus)).setVisibility(8);
        ((NumberSeekBar) m11727g(R$id.mSeekBar)).clearFocus();
        removeCallbacks(this.f11063q);
        ((ImageView) m11727g(R$id.mIvArrowDown)).clearAnimation();
        c cVar = this.f11064r;
        if (cVar != null) {
            cVar.removeMessages(this.f11048b);
        }
    }

    public final void setAdVisible(boolean z10) {
        if (z10) {
            AdInfo m11690F = m11690F();
            if (m11690F != null) {
                m11713q();
                PauseAdView pauseAdView = this.f11060n;
                boolean z11 = false;
                if (pauseAdView != null && pauseAdView.getVisibility() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    this.f11059m = m11690F;
                    m11696R(m11690F);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f11060n != null) {
            m11734w();
        }
    }

    public final void setAutoHideListener(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "listener");
        this.f11055i = interfaceC5642a;
    }

    public final void setChannelIcon(String str) {
        Drawable m27111a = AbstractC7026c.m27111a(getContext(), R$drawable.live_channel_default_icon);
        if (AbstractC6567a.m25637g(str)) {
            C7594o0 c7594o0 = C7594o0.f27942a;
            AbstractC5868k.m23671c(str);
            ImageView imageView = (ImageView) m11727g(R$id.mIvPoster);
            AbstractC5868k.m23673e(imageView, "mIvPoster");
            Context context = getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            AbstractC5868k.m23673e(m27111a, "placeholder");
            C7594o0.m29204m(c7594o0, str, imageView, context, m27111a, 0, null, 48, null);
            return;
        }
        ((ImageView) m11727g(R$id.mIvPoster)).setImageDrawable(m27111a);
    }

    public final void setChannelIndex(String str) {
        AbstractC5868k.m23674f(str, "index");
        ((TextView) m11727g(R$id.mTvIndex)).setText(str);
    }

    public final void setChannelName(String str) {
        TextView textView = (TextView) m11727g(R$id.mTvName);
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    public final void setOnSeekBarSeekListener(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f11054h = aVar;
    }

    public final void setOnSettingFunctionListener(b bVar) {
        AbstractC5868k.m23674f(bVar, "listener");
        this.f11056j = bVar;
        ((PlaySettingView) m11727g(R$id.mPlaySettingView)).setSettingFunctionListener(this.f11065s);
    }

    public final void setPauseAdType(String str) {
        AbstractC5868k.m23674f(str, "adType");
        this.f11061o = str;
    }

    public final void setPlayNotice(String str) {
        boolean z10;
        AbstractC5868k.m23674f(str, "text");
        m11732u();
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((TextView) m11727g(R$id.mTvPlayNotice)).setVisibility(0);
        } else {
            ((TextView) m11727g(R$id.mTvPlayNotice)).setVisibility(8);
        }
        ((TextView) m11727g(R$id.mTvPlayNotice)).setText(str);
    }

    public final void setQuality(String str) {
        AbstractC5868k.m23674f(str, "quality");
        ((TextView) m11727g(R$id.mTvQuality)).setText(str);
    }

    public final void setScreenRatio(String str) {
        AbstractC5868k.m23674f(str, "ratio");
        ((TextView) m11727g(R$id.mTvRatio)).setText(str);
    }

    public final void setSecondaryProgress(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(" - ");
        int i11 = R$id.mSeekBar;
        sb2.append(((NumberSeekBar) m11727g(i11)).getProgress());
        sb2.append(" - ");
        sb2.append(((NumberSeekBar) m11727g(i11)).getMax());
        AbstractC4509b.m18869b("ThumbnailSeekBar", sb2.toString(), new Object[0]);
        ((NumberSeekBar) m11727g(i11)).setSecondaryProgress(i10);
    }

    public final void setSettingVisibility(boolean z10) {
        if (z10) {
            m11730s();
            int i10 = R$id.mPlaySettingView;
            ((PlaySettingView) m11727g(i10)).setVisibility(0);
            ((PlaySettingView) m11727g(i10)).postDelayed(new Runnable() { // from class: com.live.view.n
                @Override // java.lang.Runnable
                public final void run() {
                    C2890r.setSettingVisibility$lambda$2(C2890r.this);
                }
            }, 150L);
            m11720J();
            return;
        }
        int i11 = R$id.mPlaySettingView;
        ((PlaySettingView) m11727g(i11)).setVisibility(8);
        ((PlaySettingView) m11727g(i11)).clearFocus();
    }

    public final void setStatus(int i10) {
        Context context;
        int i11;
        this.f11052f = i10;
        switch (i10) {
            case -2:
                m11732u();
                ((ImageView) m11727g(R$id.mIvPlayStatus)).setVisibility(8);
                int i12 = R$id.mTvPlayStatus;
                ((TextView) m11727g(i12)).setVisibility(0);
                ((TextView) m11727g(i12)).setText(getContext().getString(com.module.R$string.loading_bad_error));
                return;
            case -1:
                m11732u();
                ((ImageView) m11727g(R$id.mIvPlayStatus)).setVisibility(8);
                int i13 = R$id.mTvPlayStatus;
                ((TextView) m11727g(i13)).setVisibility(0);
                ((TextView) m11727g(i13)).setText(getContext().getString(com.module.R$string.loading_error));
                return;
            case 0:
                m11732u();
                int i14 = R$id.mTvPlayStatus;
                ((TextView) m11727g(i14)).setVisibility(0);
                ((ImageView) m11727g(R$id.mIvPlayStatus)).setVisibility(8);
                TextView textView = (TextView) m11727g(i14);
                if (this.f11053g) {
                    context = getContext();
                    i11 = com.module.R$string.next_epg;
                } else {
                    context = getContext();
                    i11 = com.module.R$string.loading;
                }
                textView.setText(context.getString(i11));
                this.f11053g = false;
                ((NumberSeekBar) m11727g(R$id.mSeekBar)).setEnabled(false);
                return;
            case 1:
                ((ImageView) m11727g(R$id.mIvPlayStatus)).setVisibility(8);
                m11725P();
                return;
            case 2:
                m11732u();
                int i15 = R$id.mIvPlayStatus;
                ((ImageView) m11727g(i15)).setImageResource(R$mipmap.icon_status_pause);
                ((ImageView) m11727g(i15)).setVisibility(0);
                setAdVisible(true);
                return;
            case 3:
                ((TextView) m11727g(R$id.mTvPlayStatus)).setVisibility(8);
                ((ImageView) m11727g(R$id.mIvPlayStatus)).setVisibility(8);
                m11732u();
                setAdVisible(false);
                int i16 = R$id.mSeekBar;
                if (!((NumberSeekBar) m11727g(i16)).isEnabled()) {
                    ((NumberSeekBar) m11727g(i16)).setEnabled(true);
                    if (m11718D()) {
                        ((NumberSeekBar) m11727g(i16)).requestFocus();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                m11732u();
                ((ImageView) m11727g(R$id.mIvPlayStatus)).setVisibility(8);
                int i17 = R$id.mTvPlayStatus;
                ((TextView) m11727g(i17)).setVisibility(0);
                ((TextView) m11727g(i17)).setText(getContext().getString(com.module.R$string.load_complete));
                int i18 = R$id.mSeekBar;
                ((NumberSeekBar) m11727g(i18)).setEnabled(true);
                if (m11718D()) {
                    ((NumberSeekBar) m11727g(i18)).requestFocus();
                }
                this.f11053g = false;
                int i19 = R$id.mTvSwitchPlayerStatus;
                if (((TextView) m11727g(i19)).getVisibility() == 0) {
                    ((TextView) m11727g(i19)).setText(getContext().getString(com.module.R$string.vod_menu_switch_player_success));
                    ((TextView) m11727g(i19)).postDelayed(new Runnable() { // from class: com.live.view.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2890r.setStatus$lambda$4(C2890r.this);
                        }
                    }, 3000L);
                    return;
                }
                return;
            case 5:
            default:
                return;
            case 6:
                m11732u();
                int i20 = R$id.mIvPlayStatus;
                ((ImageView) m11727g(i20)).setImageResource(R$mipmap.icon_status_backward);
                ((ImageView) m11727g(i20)).setVisibility(0);
                return;
            case 7:
                m11732u();
                int i21 = R$id.mIvPlayStatus;
                ((ImageView) m11727g(i21)).setImageResource(R$mipmap.icon_status_forward);
                ((ImageView) m11727g(i21)).setVisibility(0);
                return;
            case 8:
                m11732u();
                int i22 = R$id.mTvPlayStatus;
                ((TextView) m11727g(i22)).setVisibility(0);
                ((TextView) m11727g(i22)).setText(getContext().getString(com.module.R$string.loading));
                return;
            case 9:
                int i23 = R$id.mTvPlayStatus;
                ((TextView) m11727g(i23)).setVisibility(8);
                ((TextView) m11727g(i23)).setText("");
                return;
            case 10:
                m11725P();
                ((NetSpeedTextView) m11727g(R$id.mTvLoadingSpeed)).setVisibility(8);
                int i24 = R$id.mTvSwitchPlayerStatus;
                ((TextView) m11727g(i24)).setVisibility(0);
                ((TextView) m11727g(i24)).setText(getContext().getString(com.module.R$string.vod_menu_switching_player));
                ((NumberSeekBar) m11727g(R$id.mSeekBar)).setEnabled(false);
                return;
        }
    }

    public final void setTimeRange(String str) {
        AbstractC5868k.m23674f(str, "timeRange");
        ((TextView) m11727g(R$id.mTvTotalTime)).setText(str);
    }

    public final void setTotalTime(int i10) {
        if (i10 > 0) {
            ((NumberSeekBar) m11727g(R$id.mSeekBar)).setMax(i10);
        } else {
            ((TextView) m11727g(R$id.mTvTotalTime)).setText(this.f11049c);
        }
    }

    /* renamed from: t */
    public final void m11731t() {
        InterfaceC5642a interfaceC5642a = this.f11055i;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
        m11730s();
        setSettingVisibility(false);
    }

    /* renamed from: u */
    public final void m11732u() {
        int i10 = R$id.mTvPlayStatus;
        ((TextView) m11727g(i10)).setVisibility(8);
        ((TextView) m11727g(i10)).setText("");
        ((ImageView) m11727g(R$id.mIvLoading)).setVisibility(8);
        ((NetSpeedTextView) m11727g(R$id.mTvLoadingSpeed)).setVisibility(8);
        m11712o();
    }

    /* renamed from: v */
    public final void m11733v() {
        ((ImageView) m11727g(R$id.mIvMenu)).setVisibility(8);
        ((TextView) m11727g(R$id.tvChannelList)).setVisibility(8);
        ((ImageView) m11727g(R$id.ivLive)).setVisibility(8);
        ((TextView) m11727g(R$id.tvLive)).setVisibility(8);
    }

    /* renamed from: w */
    public final void m11734w() {
        if (this.f11059m != null) {
            C7589m1.f27886a.m29132a(C7589m1.a.f27892a.m29159b(), getProgramTitle());
        }
        PauseAdView pauseAdView = this.f11060n;
        if (pauseAdView != null) {
            pauseAdView.setVisibility(8);
        }
        PauseAdView pauseAdView2 = this.f11060n;
        if (pauseAdView2 != null && pauseAdView2.getParent() != null) {
            removeView(this.f11060n);
        }
        this.f11060n = null;
        this.f11059m = null;
        int i10 = R$id.mIvPlayStatus;
        ((ImageView) m11727g(i10)).setTranslationX(0.0f);
        ((ImageView) m11727g(i10)).setTranslationY(0.0f);
    }

    /* renamed from: x */
    public final void m11735x() {
        AutoFocusedTextView autoFocusedTextView = (AutoFocusedTextView) m11727g(R$id.mNowPlayInfo);
        if (autoFocusedTextView != null) {
            autoFocusedTextView.setVisibility(4);
        }
        AutoFocusedTextView autoFocusedTextView2 = (AutoFocusedTextView) m11727g(R$id.mNextPlayInfo);
        if (autoFocusedTextView2 != null) {
            autoFocusedTextView2.setVisibility(4);
        }
    }
}
