package com.module.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.adimage.view.PauseAdView;
import com.advertlib.bean.AdInfo;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import com.lzy.okgo.model.Progress;
import com.module.R$color;
import com.module.R$drawable;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$mipmap;
import com.module.R$string;
import com.module.bean.VodQualityBean;
import com.module.p070ui.activity.WebActivity;
import com.module.playsetting.view.PlaySettingView;
import com.module.previewseekbar.InterfaceC2985e;
import com.module.previewseekbar.PreviewSeekBar;
import com.module.view.MFInfoBar;
import com.module.view.net.NetSpeedTextView;
import com.request.result.AssetData;
import com.request.result.PosterList;
import com.request.result.SimpleProgramList;
import com.request.result.UserInfo;
import com.umeng.analytics.pro.C3384f;
import com.youth.banner.Banner;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p012ab.C0128d;
import p043ce.AbstractC1500l;
import p102db.C4053l;
import p161ha.AbstractDialogC4756b1;
import p185j2.C4982a;
import p198k.C5076a;
import p201k2.AbstractC5091h;
import p201k2.AbstractC5095l;
import p201k2.C5090g;
import p242n0.C5714a;
import p277p0.C6156m;
import p277p0.C6160q;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7167u;
import p361v0.AbstractC7189b;
import p400xa.AbstractC7555b0;
import p400xa.C7577i1;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7615w;
import p415y9.AbstractApplicationC7689d;
import p419yd.C7706a;
import p433zd.AbstractC7786b;
import pa.C6246c;
import pa.C6247d;
import pa.C6248e;
import pa.C6250g;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* loaded from: classes2.dex */
public final class MFInfoBar extends AutoFrameLayout {

    /* renamed from: A */
    private Disposable f12203A;

    /* renamed from: B */
    private String f12204B;

    /* renamed from: C */
    private ArrayList f12205C;

    /* renamed from: D */
    private Banner f12206D;

    /* renamed from: E */
    private boolean f12207E;

    /* renamed from: F */
    private AnimatorSet f12208F;

    /* renamed from: G */
    private final HandlerC3034b f12209G;

    /* renamed from: H */
    public Map f12210H = new LinkedHashMap();

    /* renamed from: a */
    private final String f12211a;

    /* renamed from: b */
    private final int f12212b;

    /* renamed from: c */
    private boolean f12213c;

    /* renamed from: d */
    private String f12214d;

    /* renamed from: e */
    private boolean f12215e;

    /* renamed from: f */
    private Boolean f12216f;

    /* renamed from: g */
    private PlaySettingView.InterfaceC2975b f12217g;

    /* renamed from: h */
    private InterfaceC3004b f12218h;

    /* renamed from: i */
    private Integer f12219i;

    /* renamed from: j */
    private CharSequence f12220j;

    /* renamed from: k */
    private List f12221k;

    /* renamed from: l */
    private final InterfaceC1312h f12222l;

    /* renamed from: m */
    private Boolean f12223m;

    /* renamed from: n */
    private int f12224n;

    /* renamed from: o */
    private List f12225o;

    /* renamed from: p */
    private int f12226p;

    /* renamed from: q */
    private ObjectAnimator f12227q;

    /* renamed from: r */
    private final long f12228r;

    /* renamed from: s */
    private AssetData f12229s;

    /* renamed from: t */
    private int f12230t;

    /* renamed from: u */
    private int f12231u;

    /* renamed from: v */
    private boolean f12232v;

    /* renamed from: w */
    private InterfaceC3005c f12233w;

    /* renamed from: x */
    private AdInfo f12234x;

    /* renamed from: y */
    private PauseAdView f12235y;

    /* renamed from: z */
    private boolean f12236z;

    /* renamed from: com.module.view.MFInfoBar$a */
    /* loaded from: classes2.dex */
    public static final class C3003a extends ImageLoader {
        @Override // com.youth.banner.loader.ImageLoaderInterface
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void displayImage(Context context, Object obj, ImageView imageView) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(imageView, "imageView");
            ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
            AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
            C1596k m28954h = AbstractC7555b0.m28954h(m7282u, String.valueOf(obj), false, 2, null);
            int i10 = R$color.transparent;
            ((C1596k) ((C1596k) m28954h.mo47c0(i10)).mo57j(i10)).m7365E0(imageView);
        }
    }

    /* renamed from: com.module.view.MFInfoBar$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3004b {
        /* renamed from: G3 */
        void mo12210G3();
    }

    /* renamed from: com.module.view.MFInfoBar$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC3005c {
        /* renamed from: a */
        void mo7577a();

        /* renamed from: b */
        void mo7578b();

        /* renamed from: c */
        void mo7579c(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.MFInfoBar$d */
    /* loaded from: classes2.dex */
    public static final class C3006d extends AbstractC5869l implements InterfaceC5660l {
        C3006d() {
            super(1);
        }

        /* renamed from: a */
        public final void m12211a(Integer num) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12211a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.MFInfoBar$e */
    /* loaded from: classes2.dex */
    public static final class C3007e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3007e f12238a = new C3007e();

        C3007e() {
            super(1);
        }

        /* renamed from: a */
        public final void m12212a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12212a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.MFInfoBar$f */
    /* loaded from: classes2.dex */
    public static final class C3008f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3008f f12239a = new C3008f();

        C3008f() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(String str) {
            boolean z10;
            AbstractC5868k.m23674f(str, "it");
            if (System.currentTimeMillis() - ((Number) C7577i1.f27838b.m29083b().m29074f(str, 0L)).longValue() >= 604800000) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.MFInfoBar$g */
    /* loaded from: classes2.dex */
    public static final class C3009g extends AbstractC5869l implements InterfaceC5660l {
        C3009g() {
            super(1);
        }

        /* renamed from: a */
        public final void m12214a(Boolean bool) {
            MFInfoBar mFInfoBar = MFInfoBar.this;
            AbstractC5868k.m23673e(bool, "it");
            mFInfoBar.f12236z = bool.booleanValue();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12214a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.MFInfoBar$h */
    /* loaded from: classes2.dex */
    public static final class C3010h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C3010h f12241a = new C3010h();

        C3010h() {
            super(1);
        }

        /* renamed from: a */
        public final void m12215a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12215a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.module.view.MFInfoBar$i */
    /* loaded from: classes2.dex */
    public static final class C3011i implements InterfaceC2985e.a {
        C3011i() {
        }

        @Override // com.module.previewseekbar.InterfaceC2985e.a
        /* renamed from: a */
        public void mo12030a(InterfaceC2985e interfaceC2985e, int i10) {
        }

        @Override // com.module.previewseekbar.InterfaceC2985e.a
        /* renamed from: b */
        public void mo12031b(InterfaceC2985e interfaceC2985e, int i10, int i11) {
            if (!MFInfoBar.this.m12207x0()) {
                MFInfoBar.this.m12204s0();
                if (i11 == 21 || i11 == 89) {
                    InterfaceC3005c interfaceC3005c = MFInfoBar.this.f12233w;
                    if (interfaceC3005c != null) {
                        interfaceC3005c.mo7577a();
                        return;
                    }
                    return;
                }
                InterfaceC3005c interfaceC3005c2 = MFInfoBar.this.f12233w;
                if (interfaceC3005c2 != null) {
                    interfaceC3005c2.mo7578b();
                }
            }
        }

        @Override // com.module.previewseekbar.InterfaceC2985e.a
        /* renamed from: c */
        public void mo12032c(InterfaceC2985e interfaceC2985e, int i10) {
            MFInfoBar.this.m12204s0();
            InterfaceC3005c interfaceC3005c = MFInfoBar.this.f12233w;
            if (interfaceC3005c != null) {
                interfaceC3005c.mo7579c(((ThumbnailSeekBar) MFInfoBar.this.m12208z(R$id.mSeekBar)).getProgress());
            }
            ((ThumbnailSeekBar) MFInfoBar.this.m12208z(R$id.mSeekBar)).requestFocus();
        }

        @Override // com.module.previewseekbar.InterfaceC2985e.a
        /* renamed from: d */
        public void mo12033d(InterfaceC2985e interfaceC2985e, int i10, boolean z10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.MFInfoBar$j */
    /* loaded from: classes2.dex */
    public static final class C3012j extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ boolean f12243a;

        /* renamed from: b */
        final /* synthetic */ MFInfoBar f12244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3012j(boolean z10, MFInfoBar mFInfoBar) {
            super(0);
            this.f12243a = z10;
            this.f12244b = mFInfoBar;
        }

        /* renamed from: a */
        public final void m12216a() {
            if (this.f12243a) {
                this.f12244b.m12136I0();
            } else {
                this.f12244b.m12139K0();
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12216a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.MFInfoBar$k */
    /* loaded from: classes2.dex */
    public static final class C3013k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ AdInfo f12246b;

        /* renamed from: com.module.view.MFInfoBar$k$a */
        /* loaded from: classes2.dex */
        public static final class a implements Animator.AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ MFInfoBar f12247a;

            a(MFInfoBar mFInfoBar) {
                this.f12247a = mFInfoBar;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                boolean z10;
                AbstractC5868k.m23674f(animator, "animation");
                if (!this.f12247a.m12200k0()) {
                    MFInfoBar mFInfoBar = this.f12247a;
                    int i10 = R$id.mIvPlayStatus;
                    if (((ImageView) mFInfoBar.m12208z(i10)).getTranslationX() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        ((ImageView) this.f12247a.m12208z(i10)).setTranslationX(0.0f);
                        ((ImageView) this.f12247a.m12208z(i10)).setTranslationY(0.0f);
                    }
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                boolean z10;
                AbstractC5868k.m23674f(animator, "animation");
                if (!this.f12247a.m12200k0()) {
                    MFInfoBar mFInfoBar = this.f12247a;
                    int i10 = R$id.mIvPlayStatus;
                    if (((ImageView) mFInfoBar.m12208z(i10)).getTranslationX() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        ((ImageView) this.f12247a.m12208z(i10)).setTranslationX(0.0f);
                        ((ImageView) this.f12247a.m12208z(i10)).setTranslationY(0.0f);
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
        C3013k(AdInfo adInfo) {
            super(1);
            this.f12246b = adInfo;
        }

        /* renamed from: a */
        public final void m12217a(boolean z10) {
            PauseAdView pauseAdView;
            if (z10 && (pauseAdView = MFInfoBar.this.f12235y) != null) {
                MFInfoBar mFInfoBar = MFInfoBar.this;
                AdInfo adInfo = this.f12246b;
                pauseAdView.setVisibility(0);
                C6156m c6156m = C6156m.f24180a;
                Context context = mFInfoBar.getContext();
                AbstractC5868k.m23673e(context, C3384f.f14563X);
                C5714a c5714a = C5714a.f22937a;
                c6156m.m24572g0(context, c5714a.m23092e(), adInfo.getAd_id());
                C6160q c6160q = C6160q.f24221a;
                Context context2 = mFInfoBar.getContext();
                AbstractC5868k.m23673e(context2, C3384f.f14563X);
                c6160q.m24600i(context2, C1466m0.f5627a.m6888w(), c5714a.m23092e(), adInfo);
                C7589m1.f27886a.m29132a(C7589m1.a.f27892a.m29158a(), mFInfoBar.getProgramTitle());
                String m27820a = AbstractC7189b.m27820a(adInfo);
                if (!AbstractC6567a.m25634d(m27820a)) {
                    AbstractC5868k.m23671c(m27820a);
                    mFInfoBar.m12130F0(m27820a);
                }
                int i10 = R$id.mIvPlayStatus;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) mFInfoBar.m12208z(i10), "translationX", 0.0f, AbstractC7786b.m30166j(450));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((ImageView) mFInfoBar.m12208z(i10), "translationY", 0.0f, AbstractC7786b.m30163g(240));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(500L);
                animatorSet.addListener(new a(mFInfoBar));
                animatorSet.start();
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12217a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.MFInfoBar$l */
    /* loaded from: classes2.dex */
    public static final class C3014l extends AbstractC5869l implements InterfaceC5660l {
        C3014l() {
            super(1);
        }

        /* renamed from: a */
        public final void m12218a(Bitmap bitmap) {
            int m30166j;
            int m30166j2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            int m29780g = C7706a.m29774d().m29780g();
            int m29779f = C7706a.m29774d().m29779f();
            layoutParams.gravity = 85;
            int i10 = m29780g / 2;
            PauseAdView pauseAdView = MFInfoBar.this.f12235y;
            if (pauseAdView != null) {
                m30166j = pauseAdView.getMeasuredWidth();
            } else {
                m30166j = AbstractC7786b.m30166j(IjkMediaCodecInfo.RANK_LAST_CHANCE);
            }
            layoutParams.rightMargin = i10 + (m30166j / 2);
            int i11 = m29779f / 2;
            PauseAdView pauseAdView2 = MFInfoBar.this.f12235y;
            if (pauseAdView2 != null) {
                m30166j2 = pauseAdView2.getMeasuredHeight();
            } else {
                m30166j2 = AbstractC7786b.m30166j(700);
            }
            layoutParams.bottomMargin = i11 - (m30166j2 / 2);
            PauseAdView pauseAdView3 = MFInfoBar.this.f12235y;
            if (pauseAdView3 != null) {
                AbstractC5868k.m23673e(bitmap, "it");
                pauseAdView3.m7052g(bitmap, layoutParams);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12218a((Bitmap) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.MFInfoBar$m */
    /* loaded from: classes2.dex */
    public static final class C3015m extends AbstractC5869l implements InterfaceC5642a {
        C3015m() {
            super(0);
        }

        /* renamed from: a */
        public final void m12219a() {
            MFInfoBar.this.m12139K0();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12219a();
            return C1328x.f4998a;
        }
    }

    public MFInfoBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC1312h m5965b;
        HandlerC3034b handlerC3034b;
        this.f12211a = MFInfoBar.class.getSimpleName();
        this.f12212b = 10001;
        m5965b = AbstractC1314j.m5965b(new C3035c(this));
        this.f12222l = m5965b;
        if (isInEditMode()) {
            LayoutInflater.from(getContext()).inflate(R$layout.layout_mf_infobar, (ViewGroup) this, true);
            this.f12213c = true;
            m12154c0();
            m12148Y();
            m12137J();
        } else {
            new C5076a(getContext()).m20545a(R$layout.layout_mf_infobar, this, new C5076a.e() { // from class: db.f0
                @Override // p198k.C5076a.e
                /* renamed from: a */
                public final void mo11400a(View view, int i10, ViewGroup viewGroup) {
                    MFInfoBar.m12120A(MFInfoBar.this, view, i10, viewGroup);
                }
            });
        }
        this.f12228r = 10000L;
        this.f12204B = "";
        this.f12205C = new ArrayList();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handlerC3034b = new HandlerC3034b(myLooper, this);
        } else {
            handlerC3034b = null;
        }
        this.f12209G = handlerC3034b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m12120A(MFInfoBar mFInfoBar, View view, int i10, ViewGroup viewGroup) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        AbstractC5868k.m23674f(view, "view");
        ViewGroup viewGroup2 = (ViewGroup) view;
        int childCount = viewGroup2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup2.getChildAt(0);
            viewGroup2.removeViewAt(0);
            mFInfoBar.addView(childAt);
        }
        mFInfoBar.f12213c = true;
        mFInfoBar.m12154c0();
        mFInfoBar.m12148Y();
        mFInfoBar.m12137J();
        String str = mFInfoBar.f12214d;
        if (str != null) {
            mFInfoBar.setLocalMode(str);
            mFInfoBar.f12214d = null;
        }
        AssetData assetData = mFInfoBar.f12229s;
        if (assetData != null) {
            mFInfoBar.m12205u0(assetData, mFInfoBar.f12230t, mFInfoBar.f12204B, false);
        }
        if (AbstractC5868k.m23669a(mFInfoBar.f12216f, Boolean.TRUE)) {
            mFInfoBar.m12189A0();
        }
        PlaySettingView.InterfaceC2975b interfaceC2975b = mFInfoBar.f12217g;
        if (interfaceC2975b != null) {
            mFInfoBar.setSettingFunctionListener(interfaceC2975b);
        }
        InterfaceC3004b interfaceC3004b = mFInfoBar.f12218h;
        if (interfaceC3004b != null) {
            mFInfoBar.setOnPlayMenuCallback(interfaceC3004b);
        }
        Integer num = mFInfoBar.f12219i;
        if (num != null) {
            mFInfoBar.setTotalTime(num.intValue());
        }
        CharSequence charSequence = mFInfoBar.f12220j;
        if (charSequence != null) {
            mFInfoBar.setPlayNotice(charSequence);
        }
        List list = mFInfoBar.f12221k;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mFInfoBar.setStatus(((Number) it.next()).intValue());
            }
        }
        Boolean bool = mFInfoBar.f12223m;
        if (bool != null) {
            mFInfoBar.setPlayerData(bool.booleanValue());
        }
        if (AbstractC6567a.m25638h(mFInfoBar.f12225o)) {
            List<VodQualityBean> list2 = mFInfoBar.f12225o;
            if (list2 != null) {
                mFInfoBar.setQualityData(list2);
            }
            mFInfoBar.setQualitySelection(mFInfoBar.f12224n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public static final void m12122B0(MFInfoBar mFInfoBar) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        mFInfoBar.m12188z0();
    }

    /* renamed from: C0 */
    private final void m12124C0() {
        int i10 = R$id.mTvPlayStatus;
        ((TextView) m12208z(i10)).setVisibility(8);
        ((TextView) m12208z(i10)).setText("");
        ((ImageView) m12208z(R$id.mIvLoading)).setVisibility(0);
        ((NetSpeedTextView) m12208z(R$id.mTvLoadingSpeed)).setVisibility(0);
        m12141L0();
    }

    /* renamed from: D0 */
    private final void m12126D0(final AdInfo adInfo) {
        ImageView imageView;
        C6156m c6156m = C6156m.f24180a;
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        PauseAdView pauseAdView = this.f12235y;
        if (pauseAdView != null) {
            imageView = pauseAdView.getAdView();
        } else {
            imageView = null;
        }
        AbstractC5868k.m23671c(imageView);
        C6156m.m24538k0(c6156m, context, imageView, C5714a.f22937a.m23092e(), adInfo, null, new C3013k(adInfo), Integer.MIN_VALUE, false, 0, 400, null);
        PauseAdView pauseAdView2 = this.f12235y;
        if (pauseAdView2 != null) {
            pauseAdView2.setOnClickListener(new View.OnClickListener() { // from class: db.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MFInfoBar.m12128E0(AdInfo.this, this, view);
                }
            });
        }
    }

    /* renamed from: E */
    public static final /* synthetic */ AbstractDialogC4756b1 m12127E(MFInfoBar mFInfoBar) {
        mFInfoBar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public static final void m12128E0(AdInfo adInfo, MFInfoBar mFInfoBar, View view) {
        boolean m27763v;
        AbstractC5868k.m23674f(adInfo, "$adInfo");
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        String action = adInfo.getAction();
        if (action == null) {
            action = "";
        }
        m27763v = AbstractC7167u.m27763v(action, "toInviteFriends", false, 2, null);
        if (m27763v) {
            C7589m1.f27886a.m29148q("3");
            WebActivity.C2989a c2989a = WebActivity.f12115H;
            Context context = mFInfoBar.getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            c2989a.m12054a(context, action);
            return;
        }
        String m27820a = AbstractC7189b.m27820a(adInfo);
        Context context2 = mFInfoBar.getContext();
        AbstractC5868k.m23673e(context2, C3384f.f14563X);
        if (AbstractC7555b0.m28950d(m27820a, context2)) {
            C6160q c6160q = C6160q.f24221a;
            Context context3 = mFInfoBar.getContext();
            AbstractC5868k.m23673e(context3, C3384f.f14563X);
            c6160q.m24599h(context3, C1466m0.f5627a.m6888w(), C5714a.f22937a.m23092e(), adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public final void m12130F0(final String str) {
        Observable observeOn = Observable.fromCallable(new Callable() { // from class: db.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap m12132G0;
                m12132G0 = MFInfoBar.m12132G0(str);
                return m12132G0;
            }
        }).subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        final C3014l c3014l = new C3014l();
        observeOn.subscribe(new Consumer() { // from class: db.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MFInfoBar.m12134H0(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G0 */
    public static final Bitmap m12132G0(String str) {
        AbstractC5868k.m23674f(str, "$jumpUrl");
        return AbstractC5095l.m20687a(str, AbstractC7786b.m30166j(166));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public static final void m12134H0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public final void m12136I0() {
        HandlerC3034b handlerC3034b = this.f12209G;
        if (handlerC3034b != null) {
            handlerC3034b.removeMessages(this.f12212b);
        }
        C4053l c4053l = new C4053l();
        ImageView imageView = (ImageView) m12208z(R$id.mIvArrowDown);
        AbstractC5868k.m23673e(imageView, "mIvArrowDown");
        c4053l.m17069ea(imageView);
        c4053l.m17067ca(C4053l.b.TOP_LEFT);
        c4053l.m17065aa(R$layout.layout_guide_vod_infobar_down);
        String string = getContext().getString(R$string.dialog_guide_vod_player_options);
        AbstractC5868k.m23673e(string, "context.getString(R.stri…guide_vod_player_options)");
        c4053l.m17064Z9(string);
        String string2 = getContext().getString(R$string.dialog_guide_next);
        AbstractC5868k.m23673e(string2, "context.getString(R.string.dialog_guide_next)");
        c4053l.m17063Y9(string2);
        c4053l.m17066ba(AbstractC7786b.m30166j(-45), AbstractC7786b.m30163g(20));
        c4053l.m17068da(new C3015m());
        Context context = getContext();
        AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
        c4053l.mo3277E9(m3294d4, "GuideDialog");
        C4053l.f17879P0.m17073d(C4053l.c.VodInfoBarPlayer, true);
    }

    /* renamed from: J */
    private final void m12137J() {
        C0128d c0128d = C0128d.f375a;
        NetSpeedTextView netSpeedTextView = (NetSpeedTextView) m12208z(R$id.mTvNetSpeed);
        AbstractC5868k.m23673e(netSpeedTextView, "mTvNetSpeed");
        c0128d.m510e(netSpeedTextView);
        NetSpeedTextView netSpeedTextView2 = (NetSpeedTextView) m12208z(R$id.mTvLoadingSpeed);
        AbstractC5868k.m23673e(netSpeedTextView2, "mTvLoadingSpeed");
        c0128d.m510e(netSpeedTextView2);
    }

    /* renamed from: K */
    private final void m12138K() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.f12208F;
        boolean z10 = false;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            z10 = true;
        }
        if (z10 && (animatorSet = this.f12208F) != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public final void m12139K0() {
        m12204s0();
        int i10 = R$id.mSeekBar;
        ((ThumbnailSeekBar) m12208z(i10)).requestFocus();
        if (!m12207x0()) {
            ((ThumbnailSeekBar) m12208z(i10)).m12291h();
        }
    }

    /* renamed from: L */
    private final void m12140L() {
        ObjectAnimator objectAnimator = this.f12227q;
        if (objectAnimator == null) {
            return;
        }
        AbstractC5868k.m23671c(objectAnimator);
        if (objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f12227q;
            AbstractC5868k.m23671c(objectAnimator2);
            objectAnimator2.cancel();
        }
        this.f12227q = null;
    }

    /* renamed from: L0 */
    private final void m12141L0() {
        if (this.f12227q == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) m12208z(R$id.mIvLoading), "rotation", 0.0f, 360.0f);
            ofFloat.setDuration(1500L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            this.f12227q = ofFloat;
        }
        ObjectAnimator objectAnimator = this.f12227q;
        AbstractC5868k.m23671c(objectAnimator);
        if (!objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f12227q;
            AbstractC5868k.m23671c(objectAnimator2);
            objectAnimator2.start();
        }
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m12142N0(MFInfoBar mFInfoBar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        mFInfoBar.m12192M0(i10, z10);
    }

    /* renamed from: O */
    private final void m12143O() {
        if (this.f12235y != null) {
            return;
        }
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        PauseAdView pauseAdView = new PauseAdView(context, null, 0, 6, null);
        this.f12235y = pauseAdView;
        pauseAdView.m7051c();
        PauseAdView pauseAdView2 = this.f12235y;
        if (pauseAdView2 != null) {
            pauseAdView2.setFocusable(false);
        }
        PauseAdView pauseAdView3 = this.f12235y;
        if (pauseAdView3 != null) {
            pauseAdView3.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC7786b.m30166j(700), AbstractC7786b.m30166j(IjkMediaCodecInfo.RANK_LAST_CHANCE));
        layoutParams.gravity = 17;
        addView(this.f12235y, 0, layoutParams);
    }

    /* renamed from: Q */
    private final void m12144Q(final AssetData assetData, final int i10) {
        Disposable disposable = this.f12203A;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f12205C.clear();
        Observable subscribeOn = Observable.create(new ObservableOnSubscribe() { // from class: db.h0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                MFInfoBar.m12145R(MFInfoBar.this, assetData, i10, observableEmitter);
            }
        }).subscribeOn(Schedulers.computation());
        final C3006d c3006d = new C3006d();
        Consumer consumer = new Consumer() { // from class: db.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MFInfoBar.m12146S(InterfaceC5660l.this, obj);
            }
        };
        final C3007e c3007e = C3007e.f12238a;
        this.f12203A = subscribeOn.subscribe(consumer, new Consumer() { // from class: db.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MFInfoBar.m12147T(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m12145R(MFInfoBar mFInfoBar, AssetData assetData, int i10, ObservableEmitter observableEmitter) {
        boolean z10;
        List<PosterList> posterList;
        boolean z11;
        SimpleProgramList simpleProgramList;
        List<PosterList> posterList2;
        boolean z12;
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        AbstractC5868k.m23674f(assetData, "$assetData");
        AbstractC5868k.m23674f(observableEmitter, "it");
        if (AbstractC5868k.m23669a(mFInfoBar.f12204B, MessageService.MSG_DB_READY_REPORT)) {
            List<SimpleProgramList> simpleProgramList2 = assetData.getSimpleProgramList();
            if (simpleProgramList2 != null && (simpleProgramList = simpleProgramList2.get(i10)) != null && (posterList2 = simpleProgramList.getPosterList()) != null) {
                for (PosterList posterList3 : posterList2) {
                    if (AbstractC5868k.m23669a(posterList3.getFileType(), C7594o0.a.Stage.m29227b())) {
                        if (posterList3.getFileUrl().length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            mFInfoBar.f12205C.add(posterList3.getFileUrl());
                        }
                    }
                }
            }
            if (mFInfoBar.f12205C.isEmpty() && (posterList = assetData.getPosterList()) != null) {
                for (PosterList posterList4 : posterList) {
                    if (AbstractC5868k.m23669a(posterList4.getFileType(), C7594o0.a.Stage.m29227b())) {
                        if (posterList4.getFileUrl().length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            mFInfoBar.f12205C.add(posterList4.getFileUrl());
                        }
                    }
                }
            }
        } else {
            List<PosterList> posterList5 = assetData.getPosterList();
            if (posterList5 != null) {
                for (PosterList posterList6 : posterList5) {
                    if (AbstractC5868k.m23669a(posterList6.getFileType(), C7594o0.a.Stage.m29227b())) {
                        if (posterList6.getFileUrl().length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            mFInfoBar.f12205C.add(posterList6.getFileUrl());
                        }
                    }
                }
            }
        }
        observableEmitter.onNext(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m12146S(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m12147T(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: Y */
    private final void m12148Y() {
        Observable just = Observable.just("thumbnail_not_support_time");
        final C3008f c3008f = C3008f.f12239a;
        Observable compose = just.map(new Function() { // from class: db.t
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m12149Z;
                m12149Z = MFInfoBar.m12149Z(InterfaceC5660l.this, obj);
                return m12149Z;
            }
        }).compose(AbstractC7029f.m27121b());
        final C3009g c3009g = new C3009g();
        Consumer consumer = new Consumer() { // from class: db.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MFInfoBar.m12151a0(InterfaceC5660l.this, obj);
            }
        };
        final C3010h c3010h = C3010h.f12241a;
        compose.subscribe(consumer, new Consumer() { // from class: db.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MFInfoBar.m12152b0(InterfaceC5660l.this, obj);
            }
        });
        m12180t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final Boolean m12149Z(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m12151a0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m12152b0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: c0 */
    private final void m12154c0() {
        ((ThumbnailSeekBar) m12208z(R$id.mSeekBar)).mo12002b(new C3011i());
        m12191M();
        ((PlaySettingView) m12208z(R$id.mPlaySettingView)).setPageType(1);
        ((AutoLinearLayout) m12208z(R$id.mAllKeyExit)).setOnTouchListener(new View.OnTouchListener() { // from class: db.w
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m12155d0;
                m12155d0 = MFInfoBar.m12155d0(MFInfoBar.this, view, motionEvent);
                return m12155d0;
            }
        });
        ((AutoLinearLayout) m12208z(R$id.mAllKeyOk)).setOnTouchListener(new View.OnTouchListener() { // from class: db.x
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m12156e0;
                m12156e0 = MFInfoBar.m12156e0(MFInfoBar.this, view, motionEvent);
                return m12156e0;
            }
        });
        ((AutoLinearLayout) m12208z(R$id.mAllKeyLeft)).setOnTouchListener(new View.OnTouchListener() { // from class: db.y
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m12157f0;
                m12157f0 = MFInfoBar.m12157f0(MFInfoBar.this, view, motionEvent);
                return m12157f0;
            }
        });
        ((AutoLinearLayout) m12208z(R$id.mAllKeyRight)).setOnTouchListener(new View.OnTouchListener() { // from class: db.z
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m12159g0;
                m12159g0 = MFInfoBar.m12159g0(MFInfoBar.this, view, motionEvent);
                return m12159g0;
            }
        });
        ((AutoLinearLayout) m12208z(R$id.mAllKeyInfo)).setOnTouchListener(new View.OnTouchListener() { // from class: db.a0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m12161h0;
                m12161h0 = MFInfoBar.m12161h0(MFInfoBar.this, view, motionEvent);
                return m12161h0;
            }
        });
        ((AutoRelativeLayout) m12208z(R$id.mRlInfoBar)).setOnTouchListener(new View.OnTouchListener() { // from class: db.b0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m12163i0;
                m12163i0 = MFInfoBar.m12163i0(MFInfoBar.this, view, motionEvent);
                return m12163i0;
            }
        });
        ((ImageView) m12208z(R$id.mIvArrowDown)).setOnTouchListener(new View.OnTouchListener() { // from class: db.d0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m12165j0;
                m12165j0 = MFInfoBar.m12165j0(MFInfoBar.this, view, motionEvent);
                return m12165j0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final boolean m12155d0(MFInfoBar mFInfoBar, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        if (motionEvent.getAction() == 1) {
            mFInfoBar.m12196U();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final boolean m12156e0(MFInfoBar mFInfoBar, View view, MotionEvent motionEvent) {
        InterfaceC3004b interfaceC3004b;
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        if (motionEvent.getAction() == 1 && (interfaceC3004b = mFInfoBar.f12218h) != null) {
            interfaceC3004b.mo12210G3();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final boolean m12157f0(MFInfoBar mFInfoBar, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        if (motionEvent.getAction() == 1) {
            KeyEvent m12170n0 = mFInfoBar.m12170n0(0, 21);
            int i10 = R$id.mSeekBar;
            ThumbnailSeekBar thumbnailSeekBar = (ThumbnailSeekBar) mFInfoBar.m12208z(i10);
            int i11 = R$id.mPreviewSeekBar;
            ((PreviewSeekBar) thumbnailSeekBar.m12289d(i11)).onKeyDown(21, m12170n0);
            ((PreviewSeekBar) ((ThumbnailSeekBar) mFInfoBar.m12208z(i10)).m12289d(i11)).onKeyUp(21, mFInfoBar.m12170n0(1, 21));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final boolean m12159g0(MFInfoBar mFInfoBar, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        if (motionEvent.getAction() == 1) {
            KeyEvent m12170n0 = mFInfoBar.m12170n0(0, 22);
            int i10 = R$id.mSeekBar;
            ThumbnailSeekBar thumbnailSeekBar = (ThumbnailSeekBar) mFInfoBar.m12208z(i10);
            int i11 = R$id.mPreviewSeekBar;
            ((PreviewSeekBar) thumbnailSeekBar.m12289d(i11)).onKeyDown(22, m12170n0);
            ((PreviewSeekBar) ((ThumbnailSeekBar) mFInfoBar.m12208z(i10)).m12289d(i11)).onKeyUp(22, mFInfoBar.m12170n0(1, 22));
        }
        return true;
    }

    private final C6247d getMPlayItem() {
        return (C6247d) this.f12222l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final boolean m12161h0(MFInfoBar mFInfoBar, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        if (motionEvent.getAction() == 1) {
            mFInfoBar.m12196U();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final boolean m12163i0(MFInfoBar mFInfoBar, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        if (motionEvent.getAction() == 1) {
            mFInfoBar.m12196U();
            mFInfoBar.setSettingVisibility(false);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final boolean m12165j0(MFInfoBar mFInfoBar, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        if (motionEvent.getAction() == 1) {
            mFInfoBar.setSettingVisibility(true);
        }
        return true;
    }

    /* renamed from: n0 */
    private final KeyEvent m12170n0(int i10, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        return new KeyEvent(currentTimeMillis, currentTimeMillis, i10, i11, 0);
    }

    /* renamed from: o0 */
    private final AdInfo m12172o0() {
        String str;
        String hasPay;
        C6156m c6156m = C6156m.f24180a;
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        String m23092e = C5714a.f22937a.m23092e();
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        String str2 = "1";
        if (m6887v == null || (str = m6887v.getUserIdentity()) == null) {
            str = "1";
        }
        UserInfo m6887v2 = c1466m0.m6887v();
        if (m6887v2 != null && (hasPay = m6887v2.getHasPay()) != null) {
            str2 = hasPay;
        }
        List<AdInfo> m24515I = C6156m.m24515I(c6156m, context, m23092e, "picture", str, false, str2, 16, null);
        if (AbstractC6567a.m25638h(m24515I)) {
            ArrayList arrayList = new ArrayList();
            String str3 = (String) C4982a.f20721a.m20333a(AbstractApplicationC7689d.f28135d.m29494a(), C5090g.f20948a.m20647l(), "");
            if (AbstractC5868k.m23669a(str3, "2")) {
                AbstractC5868k.m23671c(m24515I);
                for (AdInfo adInfo : m24515I) {
                    if (AbstractC5868k.m23669a("no", adInfo.is_dealer()) || AbstractC5868k.m23669a("default", adInfo.is_dealer())) {
                        arrayList.add(adInfo);
                    }
                }
            } else if (AbstractC5868k.m23669a(str3, MessageService.MSG_DB_READY_REPORT)) {
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

    /* renamed from: q0 */
    private final void m12175q0() {
        if (!this.f12213c) {
            return;
        }
        C0128d c0128d = C0128d.f375a;
        NetSpeedTextView netSpeedTextView = (NetSpeedTextView) m12208z(R$id.mTvNetSpeed);
        AbstractC5868k.m23673e(netSpeedTextView, "mTvNetSpeed");
        c0128d.m513n(netSpeedTextView);
        NetSpeedTextView netSpeedTextView2 = (NetSpeedTextView) m12208z(R$id.mTvLoadingSpeed);
        AbstractC5868k.m23673e(netSpeedTextView2, "mTvLoadingSpeed");
        c0128d.m513n(netSpeedTextView2);
    }

    /* renamed from: r0 */
    private final void m12177r0() {
        m12138K();
        int i10 = R$id.mIvArrowDown;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) m12208z(i10), "translationY", -10.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((ImageView) m12208z(i10), "alpha", 1.0f, 0.5f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12208F = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        AnimatorSet animatorSet2 = this.f12208F;
        if (animatorSet2 != null) {
            animatorSet2.setDuration(1200L);
        }
        AnimatorSet animatorSet3 = this.f12208F;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    private final void setSelectionData(ArrayList<SimpleProgramList> arrayList) {
        C6250g c6250g = new C6250g();
        c6250g.m24879b(arrayList);
        ((PlaySettingView) m12208z(R$id.mPlaySettingView)).m11994m(c6250g, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSettingFocus$lambda$25(MFInfoBar mFInfoBar) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        ((PlaySettingView) mFInfoBar.m12208z(R$id.mPlaySettingView)).requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSettingVisibility$lambda$24(MFInfoBar mFInfoBar) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        ((PlaySettingView) mFInfoBar.m12208z(R$id.mPlaySettingView)).requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStatus$lambda$26(MFInfoBar mFInfoBar) {
        AbstractC5868k.m23674f(mFInfoBar, "this$0");
        ((TextView) mFInfoBar.m12208z(R$id.mTvSwitchPlayerStatus)).setVisibility(8);
    }

    /* renamed from: t0 */
    private final void m12180t0() {
        ArrayList m6984c;
        C6246c c6246c = new C6246c();
        String string = getContext().getString(R$string.vod_menu_audio_settings);
        AbstractC5868k.m23673e(string, "context.getString(R.stri….vod_menu_audio_settings)");
        m6984c = AbstractC1500l.m6984c(string);
        c6246c.m24871b(m6984c);
        ((PlaySettingView) m12208z(R$id.mPlaySettingView)).m11994m(c6246c, 2);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m12183v0(MFInfoBar mFInfoBar, AssetData assetData, int i10, String str, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        mFInfoBar.m12205u0(assetData, i10, str, z10);
    }

    /* renamed from: y0 */
    private final void m12187y0(boolean z10) {
        HandlerC3034b handlerC3034b = this.f12209G;
        if (handlerC3034b != null) {
            handlerC3034b.removeMessages(this.f12212b);
        }
        C4053l c4053l = new C4053l();
        ImageView imageView = (ImageView) m12208z(R$id.mIvArrowDown);
        AbstractC5868k.m23673e(imageView, "mIvArrowDown");
        c4053l.m17069ea(imageView);
        c4053l.m17067ca(C4053l.b.TOP_LEFT);
        c4053l.m17065aa(R$layout.layout_guide_vod_infobar_down);
        c4053l.m17066ba(AbstractC7786b.m30166j(-45), AbstractC7786b.m30163g(20));
        c4053l.m17068da(new C3012j(z10, this));
        if (z10) {
            String string = getContext().getString(R$string.dialog_guide_vod_more_function_new);
            AbstractC5868k.m23673e(string, "context.getString(R.stri…de_vod_more_function_new)");
            c4053l.m17064Z9(string);
            String string2 = getContext().getString(R$string.dialog_guide_next);
            AbstractC5868k.m23673e(string2, "context.getString(R.string.dialog_guide_next)");
            c4053l.m17063Y9(string2);
        }
        Context context = getContext();
        AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC0729o m3294d4 = ((AbstractActivityC0712e) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
        c4053l.mo3277E9(m3294d4, "GuideDialog");
        C4053l.f17879P0.m17073d(C4053l.c.VodInfoBar, true);
    }

    /* renamed from: z0 */
    private final void m12188z0() {
        if (this.f12207E) {
            return;
        }
        C4053l.c cVar = C4053l.c.VodInfoBarPlayer;
        C4053l.a aVar = C4053l.f17879P0;
        if (!aVar.m17071b(cVar)) {
            if (m12201l0()) {
                m12187y0(true);
            }
        } else if (!aVar.m17071b(C4053l.c.VodThumbnail) && m12201l0()) {
            m12139K0();
        }
    }

    /* renamed from: A0 */
    public final void m12189A0() {
        if (!this.f12213c) {
            this.f12216f = Boolean.TRUE;
            return;
        }
        if (!this.f12215e) {
            return;
        }
        int i10 = R$id.mRlInfoBar;
        ((AutoRelativeLayout) m12208z(i10)).setVisibility(0);
        ((AutoLinearLayout) m12208z(R$id.mLlNetStatus)).setVisibility(0);
        ((ThumbnailSeekBar) m12208z(R$id.mSeekBar)).requestFocus();
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m12208z(i10);
        if (autoRelativeLayout != null) {
            autoRelativeLayout.post(new Runnable() { // from class: db.e0
                @Override // java.lang.Runnable
                public final void run() {
                    MFInfoBar.m12122B0(MFInfoBar.this);
                }
            });
        }
        m12177r0();
        m12204s0();
    }

    /* renamed from: J0 */
    public final void m12190J0() {
        if (this.f12205C.size() > 0) {
            m12199X();
            Banner banner = new Banner(getContext());
            this.f12206D = banner;
            AbstractC5868k.m23671c(banner);
            Banner delayTime = banner.setImages(this.f12205C).setBannerAnimation(Transformer.Accordion).setBannerStyle(0).setImageLoader(new C3003a()).setDelayTime(3000);
            boolean z10 = true;
            if (this.f12205C.size() == 1) {
                z10 = false;
            }
            delayTime.isAutoPlay(z10).start();
            Banner banner2 = this.f12206D;
            AbstractC5868k.m23671c(banner2);
            banner2.setFocusable(false);
            addView(this.f12206D, 0);
        }
    }

    /* renamed from: M */
    public final void m12191M() {
    }

    /* renamed from: M0 */
    public final void m12192M0(int i10, boolean z10) {
        int i11;
        String m20660c;
        if (z10) {
            m12199X();
        }
        this.f12230t = i10;
        if (!this.f12213c) {
            return;
        }
        int i12 = R$id.mSeekBar;
        ((ThumbnailSeekBar) m12208z(i12)).setProgress(0L);
        ((ThumbnailSeekBar) m12208z(i12)).setMax(0L);
        AssetData assetData = this.f12229s;
        if (assetData != null) {
            m12144Q(assetData, i10);
            List<SimpleProgramList> simpleProgramList = assetData.getSimpleProgramList();
            int i13 = 0;
            if (simpleProgramList != null) {
                i11 = simpleProgramList.size();
            } else {
                i11 = 0;
            }
            if (i11 > 1) {
                List<SimpleProgramList> simpleProgramList2 = assetData.getSimpleProgramList();
                if (simpleProgramList2 != null) {
                    i13 = simpleProgramList2.size();
                }
                if (i10 < i13) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractC5091h.m20660c(assetData.getName(), assetData.getAlias()));
                    sb2.append(' ');
                    List<SimpleProgramList> simpleProgramList3 = assetData.getSimpleProgramList();
                    AbstractC5868k.m23671c(simpleProgramList3);
                    sb2.append(simpleProgramList3.get(i10).getSeriesNumber());
                    m20660c = sb2.toString();
                    ((TextView) m12208z(R$id.mTvName)).setText(m20660c);
                }
            }
            m20660c = AbstractC5091h.m20660c(assetData.getName(), assetData.getAlias());
            ((TextView) m12208z(R$id.mTvName)).setText(m20660c);
        }
        ((PlaySettingView) m12208z(R$id.mPlaySettingView)).setPlaySelection(i10);
    }

    /* renamed from: N */
    public final void m12193N() {
        PauseAdView pauseAdView = this.f12235y;
        if (pauseAdView != null) {
            pauseAdView.performClick();
        }
    }

    /* renamed from: O0 */
    public final void m12194O0(long j10, long j11) {
        if (!this.f12213c) {
            return;
        }
        int i10 = this.f12231u;
        if (i10 != 7 && i10 != 6 && j10 >= 0) {
            ((ThumbnailSeekBar) m12208z(R$id.mSeekBar)).setProgress(j10);
        }
        int i11 = R$id.mSeekBar;
        if (((ThumbnailSeekBar) m12208z(i11)).getMax() == 0) {
            ((ThumbnailSeekBar) m12208z(i11)).setMax(j11);
        }
    }

    /* renamed from: P */
    public final void m12195P(boolean z10) {
        this.f12215e = z10;
        if (!this.f12213c) {
            return;
        }
        if (this.f12231u == 2) {
            setAdVisible(z10);
        }
        if (!z10) {
            int i10 = R$id.mTvSwitchPlayerStatus;
            if (((TextView) m12208z(i10)).getVisibility() == 0) {
                ((TextView) m12208z(i10)).setVisibility(8);
            }
        }
    }

    /* renamed from: U */
    public final void m12196U() {
        if (!this.f12213c) {
            this.f12216f = Boolean.FALSE;
            return;
        }
        int i10 = R$id.mSeekBar;
        ((ThumbnailSeekBar) m12208z(i10)).m12290e();
        ((AutoRelativeLayout) m12208z(R$id.mRlInfoBar)).setVisibility(8);
        ((AutoLinearLayout) m12208z(R$id.mLlNetStatus)).setVisibility(8);
        ((ThumbnailSeekBar) m12208z(i10)).clearFocus();
        m12138K();
        HandlerC3034b handlerC3034b = this.f12209G;
        if (handlerC3034b != null) {
            handlerC3034b.removeMessages(this.f12212b);
        }
    }

    /* renamed from: V */
    public final void m12197V() {
        if (!this.f12213c) {
            return;
        }
        int i10 = R$id.mTvPlayStatus;
        ((TextView) m12208z(i10)).setVisibility(8);
        ((TextView) m12208z(i10)).setText("");
        ((ImageView) m12208z(R$id.mIvLoading)).setVisibility(8);
        ((NetSpeedTextView) m12208z(R$id.mTvLoadingSpeed)).setVisibility(8);
        m12140L();
    }

    /* renamed from: W */
    public final void m12198W() {
        if (!this.f12213c) {
            return;
        }
        if (this.f12234x != null) {
            C7589m1.f27886a.m29132a(C7589m1.a.f27892a.m29159b(), getProgramTitle());
        }
        PauseAdView pauseAdView = this.f12235y;
        if (pauseAdView != null) {
            pauseAdView.setVisibility(8);
        }
        PauseAdView pauseAdView2 = this.f12235y;
        if (pauseAdView2 != null && pauseAdView2.getParent() != null) {
            removeView(this.f12235y);
        }
        this.f12235y = null;
        this.f12234x = null;
        int i10 = R$id.mIvPlayStatus;
        ((ImageView) m12208z(i10)).setTranslationX(0.0f);
        ((ImageView) m12208z(i10)).setTranslationY(0.0f);
    }

    /* renamed from: X */
    public final void m12199X() {
        Banner banner = this.f12206D;
        if (banner != null) {
            removeView(banner);
        }
    }

    public final String getProgramTitle() {
        CharSequence text;
        String obj;
        TextView textView = (TextView) m12208z(R$id.mTvName);
        if (textView == null || (text = textView.getText()) == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final int getState() {
        List list;
        Integer num;
        if (!this.f12213c && (list = this.f12221k) != null) {
            AbstractC5868k.m23671c(list);
            if (list.size() > 0) {
                List list2 = this.f12221k;
                if (list2 != null) {
                    AbstractC5868k.m23671c(list2);
                    num = (Integer) list2.get(list2.size() - 1);
                } else {
                    num = null;
                }
                AbstractC5868k.m23671c(num);
                return num.intValue();
            }
        }
        return this.f12231u;
    }

    /* renamed from: k0 */
    public final boolean m12200k0() {
        PauseAdView pauseAdView = this.f12235y;
        if (pauseAdView == null || pauseAdView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l0 */
    public final boolean m12201l0() {
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m12208z(R$id.mRlInfoBar);
        if (autoRelativeLayout == null || autoRelativeLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: m0 */
    public final boolean m12202m0() {
        PlaySettingView playSettingView = (PlaySettingView) m12208z(R$id.mPlaySettingView);
        if (playSettingView == null || playSettingView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        HandlerC3034b handlerC3034b = this.f12209G;
        if (handlerC3034b != null) {
            handlerC3034b.removeMessages(this.f12212b);
        }
        m12175q0();
        super.onDetachedFromWindow();
    }

    /* renamed from: p0 */
    public final boolean m12203p0() {
        TextView textView = (TextView) m12208z(R$id.mTvPlayNotice);
        if (textView == null || textView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: s0 */
    public final void m12204s0() {
        if (!this.f12213c) {
            return;
        }
        HandlerC3034b handlerC3034b = this.f12209G;
        if (handlerC3034b != null) {
            handlerC3034b.removeMessages(this.f12212b);
        }
        HandlerC3034b handlerC3034b2 = this.f12209G;
        if (handlerC3034b2 != null) {
            handlerC3034b2.sendEmptyMessageDelayed(this.f12212b, this.f12228r);
        }
    }

    public final void setAdVisible(boolean z10) {
        if (!this.f12213c) {
            return;
        }
        if (z10 && this.f12215e) {
            AdInfo m12172o0 = m12172o0();
            if (m12172o0 != null) {
                m12143O();
                PauseAdView pauseAdView = this.f12235y;
                boolean z11 = false;
                if (pauseAdView != null && pauseAdView.getVisibility() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    this.f12234x = m12172o0;
                    m12126D0(m12172o0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f12235y != null) {
            m12198W();
        }
    }

    public final void setHasPreview(Boolean bool) {
        ThumbnailSeekBar thumbnailSeekBar;
        if (bool != null && (thumbnailSeekBar = (ThumbnailSeekBar) m12208z(R$id.mSeekBar)) != null) {
            thumbnailSeekBar.setHasPreview(bool.booleanValue());
        }
    }

    public final void setLoadingNext(boolean z10) {
        this.f12232v = z10;
    }

    public final void setLocalMode(String str) {
        AbstractC5868k.m23674f(str, Progress.FILE_NAME);
        this.f12207E = true;
        if (!this.f12213c) {
            this.f12214d = str;
            return;
        }
        this.f12215e = true;
        ((TextView) m12208z(R$id.mTvName)).setText(str);
        m12175q0();
        ((NetSpeedTextView) m12208z(R$id.mTvNetSpeed)).setText("");
        ((ThumbnailSeekBar) m12208z(R$id.mSeekBar)).setHasPreview(false);
    }

    public final void setOnPlayMenuCallback(InterfaceC3004b interfaceC3004b) {
        AbstractC5868k.m23674f(interfaceC3004b, "callback");
        this.f12218h = interfaceC3004b;
    }

    public final void setOnSeekBarSeekListener(InterfaceC3005c interfaceC3005c) {
        AbstractC5868k.m23674f(interfaceC3005c, "listener");
        this.f12233w = interfaceC3005c;
    }

    public final void setPlayNotice(CharSequence charSequence) {
        boolean z10;
        AbstractC5868k.m23674f(charSequence, "text");
        if (!this.f12213c) {
            this.f12220j = charSequence;
            return;
        }
        m12197V();
        if (charSequence.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((TextView) m12208z(R$id.mTvPlayNotice)).setVisibility(0);
        } else {
            ((TextView) m12208z(R$id.mTvPlayNotice)).setVisibility(8);
        }
        ((TextView) m12208z(R$id.mTvPlayNotice)).setText(charSequence);
    }

    public final void setPlayerData(boolean z10) {
        this.f12223m = Boolean.valueOf(z10);
        if (this.f12213c) {
            if (z10) {
                ((PlaySettingView) m12208z(R$id.mPlaySettingView)).m11994m(getMPlayItem(), 5);
            } else {
                ((PlaySettingView) m12208z(R$id.mPlaySettingView)).m11993l(5);
            }
            this.f12223m = null;
        }
    }

    public final void setQualityData(List<VodQualityBean> list) {
        AbstractC5868k.m23674f(list, "list");
        C6248e c6248e = new C6248e();
        c6248e.m24875b(list);
        this.f12225o = list;
        if (this.f12213c) {
            ((PlaySettingView) m12208z(R$id.mPlaySettingView)).m11994m(c6248e, 3);
            this.f12225o = null;
        }
    }

    public final void setQualitySelection(int i10) {
        this.f12224n = i10;
        if (!this.f12213c) {
            return;
        }
        ((PlaySettingView) m12208z(R$id.mPlaySettingView)).setQualitySelection(i10);
    }

    public final void setSecondaryProgress(int i10) {
        if (!this.f12213c) {
            return;
        }
        ((ThumbnailSeekBar) m12208z(R$id.mSeekBar)).setSecondProgress(i10);
    }

    public final void setSettingFunctionListener(PlaySettingView.InterfaceC2975b interfaceC2975b) {
        AbstractC5868k.m23674f(interfaceC2975b, "listener");
        this.f12217g = interfaceC2975b;
        if (!this.f12213c) {
            return;
        }
        ((PlaySettingView) m12208z(R$id.mPlaySettingView)).setSettingFunctionListener(interfaceC2975b);
    }

    public final void setSettingVisibility(boolean z10) {
        if (!this.f12213c) {
            return;
        }
        if (z10) {
            m12196U();
            int i10 = R$id.mPlaySettingView;
            ((PlaySettingView) m12208z(i10)).m11991g();
            ((PlaySettingView) m12208z(i10)).setVisibility(0);
            ((PlaySettingView) m12208z(i10)).postDelayed(new Runnable() { // from class: db.k0
                @Override // java.lang.Runnable
                public final void run() {
                    MFInfoBar.setSettingVisibility$lambda$24(MFInfoBar.this);
                }
            }, 150L);
            m12204s0();
            return;
        }
        int i11 = R$id.mPlaySettingView;
        ((PlaySettingView) m12208z(i11)).m11992h();
        ((PlaySettingView) m12208z(i11)).setVisibility(8);
        ((PlaySettingView) m12208z(i11)).clearFocus();
    }

    public final void setStatus(int i10) {
        Context context;
        int i11;
        if (!this.f12213c) {
            if (this.f12221k == null) {
                this.f12221k = new ArrayList();
            }
            List list = this.f12221k;
            if (list != null) {
                list.add(Integer.valueOf(i10));
                return;
            }
            return;
        }
        switch (i10) {
            case -2:
                m12197V();
                ((ImageView) m12208z(R$id.mIvPlayStatus)).setVisibility(8);
                int i12 = R$id.mTvPlayStatus;
                ((TextView) m12208z(i12)).setVisibility(0);
                ((TextView) m12208z(i12)).setText(getContext().getString(R$string.vod_play_no_source_available, C7615w.f27995a.m29303G()) + "\n (" + C1466m0.f5627a.m6878m() + ')');
                break;
            case -1:
                m12197V();
                ((ImageView) m12208z(R$id.mIvPlayStatus)).setVisibility(8);
                ((TextView) m12208z(R$id.mTvPlayStatus)).setVisibility(0);
                break;
            case 0:
                m12197V();
                ((ImageView) m12208z(R$id.mIvPlayStatus)).setVisibility(8);
                int i13 = R$id.mTvPlayStatus;
                ((TextView) m12208z(i13)).setVisibility(0);
                TextView textView = (TextView) m12208z(i13);
                if (this.f12232v) {
                    context = getContext();
                    i11 = R$string.next_epg;
                } else {
                    context = getContext();
                    i11 = R$string.loading;
                }
                textView.setText(context.getString(i11));
                int i14 = R$id.mSeekBar;
                ((ThumbnailSeekBar) m12208z(i14)).m12290e();
                ((ThumbnailSeekBar) m12208z(i14)).setEnabled(false);
                break;
            case 1:
                if (((TextView) m12208z(R$id.mTvPlayNotice)).getVisibility() != 0) {
                    ((ImageView) m12208z(R$id.mIvPlayStatus)).setVisibility(8);
                    m12124C0();
                    break;
                }
                break;
            case 2:
                m12197V();
                if (this.f12215e) {
                    ((ImageView) m12208z(R$id.mIvPlayStatus)).setImageResource(R$mipmap.icon_status_pause);
                } else {
                    ((ImageView) m12208z(R$id.mIvPlayStatus)).setImageResource(R$mipmap.icon_status_pause_not_fullscreen);
                }
                ((ImageView) m12208z(R$id.mIvPlayStatus)).setVisibility(0);
                int i15 = this.f12231u;
                if (i15 != 2 && i15 != 7 && i15 != 6) {
                    setAdVisible(true);
                    ((ThumbnailSeekBar) m12208z(R$id.mSeekBar)).m12290e();
                    break;
                }
                break;
            case 3:
                ((TextView) m12208z(R$id.mTvPlayStatus)).setVisibility(8);
                ((ImageView) m12208z(R$id.mIvPlayStatus)).setVisibility(8);
                m12197V();
                setAdVisible(false);
                break;
            case 4:
                m12197V();
                ((ImageView) m12208z(R$id.mIvPlayStatus)).setVisibility(8);
                int i16 = R$id.mTvPlayStatus;
                ((TextView) m12208z(i16)).setVisibility(0);
                ((TextView) m12208z(i16)).setText(getContext().getString(R$string.load_complete));
                int i17 = R$id.mSeekBar;
                ((ThumbnailSeekBar) m12208z(i17)).setEnabled(true);
                if (m12201l0()) {
                    ((ThumbnailSeekBar) m12208z(i17)).requestFocus();
                }
                this.f12232v = false;
                int i18 = R$id.mTvSwitchPlayerStatus;
                if (((TextView) m12208z(i18)).getVisibility() == 0) {
                    int i19 = this.f12226p;
                    if (i19 != 10) {
                        if (i19 == 11) {
                            ((TextView) m12208z(i18)).setText(getContext().getString(R$string.vod_switch_quality_success));
                        }
                    } else {
                        ((TextView) m12208z(i18)).setText(getContext().getString(R$string.vod_menu_switch_player_success));
                    }
                    ((TextView) m12208z(i18)).postDelayed(new Runnable() { // from class: db.c0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MFInfoBar.setStatus$lambda$26(MFInfoBar.this);
                        }
                    }, 3000L);
                    break;
                }
                break;
            case 6:
                m12197V();
                int i20 = R$id.mIvPlayStatus;
                ((ImageView) m12208z(i20)).setImageResource(R$mipmap.icon_status_backward);
                ((ImageView) m12208z(i20)).setVisibility(0);
                break;
            case 7:
                m12197V();
                int i21 = R$id.mIvPlayStatus;
                ((ImageView) m12208z(i21)).setImageResource(R$mipmap.icon_status_forward);
                ((ImageView) m12208z(i21)).setVisibility(0);
                break;
            case 8:
                m12197V();
                int i22 = R$id.mTvPlayStatus;
                ((TextView) m12208z(i22)).setVisibility(0);
                ((TextView) m12208z(i22)).setText(getContext().getString(R$string.loading));
                break;
            case 9:
                m12197V();
                int i23 = R$id.mTvPlayStatus;
                ((TextView) m12208z(i23)).setVisibility(8);
                ((TextView) m12208z(i23)).setText("");
                break;
            case 10:
                m12124C0();
                ((NetSpeedTextView) m12208z(R$id.mTvLoadingSpeed)).setVisibility(8);
                int i24 = R$id.mTvSwitchPlayerStatus;
                ((TextView) m12208z(i24)).setVisibility(0);
                ((TextView) m12208z(i24)).setText(getContext().getString(R$string.vod_menu_switching_player));
                ((ThumbnailSeekBar) m12208z(R$id.mSeekBar)).setEnabled(false);
                this.f12226p = 10;
                break;
            case 11:
                m12124C0();
                ((NetSpeedTextView) m12208z(R$id.mTvLoadingSpeed)).setVisibility(8);
                int i25 = R$id.mTvSwitchPlayerStatus;
                ((TextView) m12208z(i25)).setVisibility(0);
                ((TextView) m12208z(i25)).setText(getContext().getString(R$string.vod_tips_switch_quality));
                ((ThumbnailSeekBar) m12208z(R$id.mSeekBar)).setEnabled(false);
                this.f12226p = 11;
                break;
        }
        this.f12231u = i10;
    }

    public final void setTotalTime(int i10) {
        if (!this.f12213c) {
            this.f12219i = Integer.valueOf(i10);
        } else if (i10 > 0) {
            ((ThumbnailSeekBar) m12208z(R$id.mSeekBar)).setMax(i10);
        } else {
            ((ThumbnailSeekBar) m12208z(R$id.mSeekBar)).setMax(0L);
        }
    }

    /* renamed from: u0 */
    public final void m12205u0(AssetData assetData, int i10, String str, boolean z10) {
        List<SimpleProgramList> simpleProgramList;
        AbstractC5868k.m23674f(assetData, "assetData");
        AbstractC5868k.m23674f(str, "type");
        this.f12229s = assetData;
        this.f12230t = i10;
        this.f12204B = str;
        SelectionView.f12294t.m12279b(i10);
        m12192M0(i10, z10);
        if (!this.f12213c) {
            return;
        }
        Drawable m27111a = AbstractC7026c.m27111a(getContext(), R$drawable.bg_placehoder);
        C7594o0 c7594o0 = C7594o0.f27942a;
        AssetData assetData2 = this.f12229s;
        AbstractC5868k.m23671c(assetData2);
        List<PosterList> posterList = assetData2.getPosterList();
        C7594o0.a aVar = C7594o0.a.Icon;
        ImageView imageView = (ImageView) m12208z(R$id.mIvPoster);
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        AbstractC5868k.m23673e(m27111a, "placeholder");
        C7594o0.m29206q(c7594o0, posterList, aVar, imageView, context, m27111a, 0, 32, null);
        AssetData assetData3 = this.f12229s;
        if (assetData3 != null && (simpleProgramList = assetData3.getSimpleProgramList()) != null && simpleProgramList.size() > 1) {
            setSelectionData((ArrayList) simpleProgramList);
        }
    }

    /* renamed from: w0 */
    public final void m12206w0() {
        PlaySettingView playSettingView = (PlaySettingView) m12208z(R$id.mPlaySettingView);
        if (playSettingView != null) {
            playSettingView.post(new Runnable() { // from class: db.r
                @Override // java.lang.Runnable
                public final void run() {
                    MFInfoBar.setSettingFocus$lambda$25(MFInfoBar.this);
                }
            });
        }
    }

    /* renamed from: x0 */
    public final boolean m12207x0() {
        return false;
    }

    /* renamed from: z */
    public View m12208z(int i10) {
        Map map = this.f12210H;
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
}
