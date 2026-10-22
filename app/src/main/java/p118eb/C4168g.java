package p118eb;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import be.C1328x;
import cc.C1466m0;
import com.advertlib.bean.AdInfo;
import com.advertlib.bean.AdInfoWrapper;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p170i2.C4842a;
import p242n0.C5714a;
import p277p0.C6156m;
import p277p0.C6160q;
import p433zd.AbstractC7786b;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.widget.IjkVideoView;

/* renamed from: eb.g */
/* loaded from: classes2.dex */
public final class C4168g extends AutoFrameLayout {

    /* renamed from: k */
    public static final a f18235k = new a(null);

    /* renamed from: a */
    private final AdInfoWrapper f18236a;

    /* renamed from: b */
    private long f18237b;

    /* renamed from: c */
    private long f18238c;

    /* renamed from: d */
    private Handler f18239d;

    /* renamed from: e */
    private InterfaceC4162a f18240e;

    /* renamed from: f */
    private boolean f18241f;

    /* renamed from: g */
    private IjkVideoView f18242g;

    /* renamed from: h */
    private boolean f18243h;

    /* renamed from: i */
    private Runnable f18244i;

    /* renamed from: j */
    public Map f18245j;

    /* renamed from: eb.g$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eb.g$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m17430a(boolean z10) {
            if (!z10) {
                InterfaceC4162a interfaceC4162a = C4168g.this.f18240e;
                if (interfaceC4162a != null) {
                    interfaceC4162a.mo17406a();
                    return;
                }
                return;
            }
            C4168g.this.m17428r();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m17430a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4168g(Context context, AdInfoWrapper adInfoWrapper, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(adInfoWrapper, "mAdInfoWrapper");
        this.f18245j = new LinkedHashMap();
        this.f18236a = adInfoWrapper;
        this.f18237b = 5L;
        this.f18239d = new Handler();
        this.f18244i = new Runnable() { // from class: eb.b
            @Override // java.lang.Runnable
            public final void run() {
                C4168g.m17417o(C4168g.this);
            }
        };
        LayoutInflater.from(context).inflate(R$layout.layout_before_ad, (ViewGroup) this, true);
        AdInfo adInfo = adInfoWrapper.getAdInfo();
        this.f18241f = AbstractC5868k.m23669a(adInfo != null ? adInfo.getMedia_type() : null, "video");
    }

    /* renamed from: A */
    private final void m17407A() {
        ((TextView) m17426j(R$id.mTvCountDown)).setText(getResources().getString(R$string.ads_skip, Long.valueOf(this.f18237b)));
    }

    /* renamed from: l */
    private final void m17414l() {
        AutoFrameLayout.C3910a c3910a = new AutoFrameLayout.C3910a(-2, AbstractC7786b.m30163g(58));
        ((FrameLayout.LayoutParams) c3910a).gravity = 53;
        AutoFrameLayout.C3910a c3910a2 = new AutoFrameLayout.C3910a(-2, AbstractC7786b.m30163g(58));
        ((FrameLayout.LayoutParams) c3910a2).gravity = 83;
        if (this.f18243h) {
            if (C4842a.f20329a.m19920a().m19931H()) {
                int i10 = R$id.mTvCountDown;
                ((TextView) m17426j(i10)).setFocusable(true);
                ((TextView) m17426j(i10)).requestFocus();
            }
            ((FrameLayout.LayoutParams) c3910a).topMargin = AbstractC7786b.m30163g(60);
            ((FrameLayout.LayoutParams) c3910a).rightMargin = AbstractC7786b.m30166j(80);
            ((FrameLayout.LayoutParams) c3910a2).bottomMargin = AbstractC7786b.m30163g(80);
            ((FrameLayout.LayoutParams) c3910a2).leftMargin = AbstractC7786b.m30166j(80);
        } else {
            ((FrameLayout.LayoutParams) c3910a).topMargin = AbstractC7786b.m30163g(10);
            ((FrameLayout.LayoutParams) c3910a).rightMargin = AbstractC7786b.m30166j(10);
            ((FrameLayout.LayoutParams) c3910a2).bottomMargin = AbstractC7786b.m30163g(10);
            ((FrameLayout.LayoutParams) c3910a2).leftMargin = AbstractC7786b.m30166j(10);
            if (C4842a.f20329a.m19920a().m19931H()) {
                ((TextView) m17426j(R$id.mTvCountDown)).setFocusable(false);
            }
        }
        ((TextView) m17426j(R$id.mTvCountDown)).setLayoutParams(c3910a);
        ((TextView) m17426j(R$id.mTvFlag)).setLayoutParams(c3910a2);
    }

    /* renamed from: m */
    private final void m17415m() {
        this.f18239d.postDelayed(this.f18244i, 1000L);
    }

    /* renamed from: n */
    private final void m17416n() {
        if (this.f18241f) {
            m17421u();
        } else {
            m17420t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m17417o(C4168g c4168g) {
        int i10;
        AbstractC5868k.m23674f(c4168g, "this$0");
        if (c4168g.f18241f) {
            long j10 = c4168g.f18238c;
            IjkVideoView ijkVideoView = c4168g.f18242g;
            if (ijkVideoView != null) {
                i10 = ijkVideoView.getCurrentPosition();
            } else {
                i10 = 0;
            }
            c4168g.f18237b = j10 - (i10 / 1000);
        } else {
            c4168g.f18237b--;
        }
        c4168g.m17407A();
        if (c4168g.f18237b <= 0) {
            InterfaceC4162a interfaceC4162a = c4168g.f18240e;
            if (interfaceC4162a != null) {
                interfaceC4162a.mo17406a();
                return;
            }
            return;
        }
        c4168g.m17415m();
    }

    /* renamed from: p */
    private final void m17418p() {
        IjkVideoView ijkVideoView = this.f18242g;
        if (ijkVideoView != null) {
            ijkVideoView.release(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m17419s(C4168g c4168g, View view) {
        AbstractC5868k.m23674f(c4168g, "this$0");
        InterfaceC4162a interfaceC4162a = c4168g.f18240e;
        if (interfaceC4162a != null) {
            interfaceC4162a.mo17406a();
        }
    }

    /* renamed from: t */
    private final void m17420t() {
        int i10 = R$id.mIvAd;
        ((ImageView) m17426j(i10)).setVisibility(0);
        C6156m c6156m = C6156m.f24180a;
        Context context = getContext();
        AbstractC5868k.m23671c(context);
        ImageView imageView = (ImageView) m17426j(i10);
        AbstractC5868k.m23673e(imageView, "mIvAd");
        C6156m.m24538k0(c6156m, context, imageView, C5714a.f22937a.m23094g(), this.f18236a.getAdInfo(), null, new b(), null, false, 0, 464, null);
    }

    /* renamed from: u */
    private final void m17421u() {
        ((ImageView) m17426j(R$id.mIvAd)).setVisibility(8);
        IjkVideoView ijkVideoView = new IjkVideoView(getContext());
        this.f18242g = ijkVideoView;
        ijkVideoView.setPlayMode(true);
        IjkVideoView ijkVideoView2 = this.f18242g;
        if (ijkVideoView2 != null) {
            ijkVideoView2.setAspectRatio(1);
        }
        IjkVideoView ijkVideoView3 = this.f18242g;
        if (ijkVideoView3 != null) {
            ijkVideoView3.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: eb.c
                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
                public final void onPrepared(IMediaPlayer iMediaPlayer) {
                    C4168g.m17422v(C4168g.this, iMediaPlayer);
                }
            });
        }
        IjkVideoView ijkVideoView4 = this.f18242g;
        if (ijkVideoView4 != null) {
            ijkVideoView4.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: eb.d
                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
                public final void onCompletion(IMediaPlayer iMediaPlayer) {
                    C4168g.m17423w(C4168g.this, iMediaPlayer);
                }
            });
        }
        IjkVideoView ijkVideoView5 = this.f18242g;
        if (ijkVideoView5 != null) {
            ijkVideoView5.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: eb.e
                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
                    boolean m17424x;
                    m17424x = C4168g.m17424x(C4168g.this, iMediaPlayer, i10, i11);
                    return m17424x;
                }
            });
        }
        addView(this.f18242g, 0, new AutoFrameLayout.C3910a(-1, -1));
        IjkVideoView ijkVideoView6 = this.f18242g;
        if (ijkVideoView6 != null) {
            ijkVideoView6.setVideoPath(this.f18236a.getCachePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m17422v(C4168g c4168g, IMediaPlayer iMediaPlayer) {
        AbstractC5868k.m23674f(c4168g, "this$0");
        c4168g.m17428r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m17423w(C4168g c4168g, IMediaPlayer iMediaPlayer) {
        AbstractC5868k.m23674f(c4168g, "this$0");
        InterfaceC4162a interfaceC4162a = c4168g.f18240e;
        if (interfaceC4162a != null) {
            interfaceC4162a.mo17406a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final boolean m17424x(C4168g c4168g, IMediaPlayer iMediaPlayer, int i10, int i11) {
        AbstractC5868k.m23674f(c4168g, "this$0");
        InterfaceC4162a interfaceC4162a = c4168g.f18240e;
        if (interfaceC4162a != null) {
            interfaceC4162a.mo17406a();
            return false;
        }
        return false;
    }

    /* renamed from: z */
    private final void m17425z() {
        long j10;
        if (this.f18241f) {
            IjkVideoView ijkVideoView = this.f18242g;
            if (ijkVideoView != null) {
                j10 = ijkVideoView.getDuration();
            } else {
                j10 = 0;
            }
            long j11 = j10 / 1000;
            this.f18238c = j11;
            if (j11 > 60) {
                this.f18238c = 60L;
            }
            this.f18237b = this.f18238c;
        } else {
            this.f18237b = 5L;
        }
        m17407A();
        m17415m();
    }

    public final AdInfoWrapper getMAdInfoWrapper() {
        return this.f18236a;
    }

    /* renamed from: j */
    public View m17426j(int i10) {
        Map map = this.f18245j;
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

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IjkVideoView ijkVideoView = this.f18242g;
        if (ijkVideoView != null) {
            removeView(ijkVideoView);
        }
        m17418p();
        this.f18239d.removeCallbacks(this.f18244i);
    }

    /* renamed from: q */
    public final void m17427q(InterfaceC4162a interfaceC4162a) {
        AbstractC5868k.m23674f(interfaceC4162a, "listener");
        this.f18240e = interfaceC4162a;
        m17416n();
    }

    /* renamed from: r */
    public final void m17428r() {
        if (C4842a.f20329a.m19920a().m19931H()) {
            ((TextView) m17426j(R$id.mTvCountDown)).setVisibility(0);
        }
        C6156m c6156m = C6156m.f24180a;
        Context context = getContext();
        AbstractC5868k.m23671c(context);
        C5714a c5714a = C5714a.f22937a;
        String m23094g = c5714a.m23094g();
        AdInfo adInfo = this.f18236a.getAdInfo();
        AbstractC5868k.m23671c(adInfo);
        c6156m.m24572g0(context, m23094g, adInfo.getAd_id());
        C6160q c6160q = C6160q.f24221a;
        Context context2 = getContext();
        AbstractC5868k.m23671c(context2);
        String m6888w = C1466m0.f5627a.m6888w();
        String m23094g2 = c5714a.m23094g();
        AdInfo adInfo2 = this.f18236a.getAdInfo();
        AbstractC5868k.m23671c(adInfo2);
        c6160q.m24600i(context2, m6888w, m23094g2, adInfo2);
        ((TextView) m17426j(R$id.mTvFlag)).setVisibility(0);
        m17414l();
        ((TextView) m17426j(R$id.mTvCountDown)).setOnClickListener(new View.OnClickListener() { // from class: eb.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4168g.m17419s(C4168g.this, view);
            }
        });
        m17425z();
    }

    public final void setFullScreen(boolean z10) {
        this.f18243h = z10;
        m17414l();
    }

    /* renamed from: y */
    public final void m17429y() {
        IjkVideoView ijkVideoView = this.f18242g;
        if (ijkVideoView != null) {
            ijkVideoView.start();
        }
        this.f18239d.post(this.f18244i);
    }

    public /* synthetic */ C4168g(Context context, AdInfoWrapper adInfoWrapper, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, adInfoWrapper, (i11 & 4) != 0 ? null : attributeSet, (i11 & 8) != 0 ? 0 : i10);
    }
}
