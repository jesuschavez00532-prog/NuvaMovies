package com.adimage.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.adimage.R$id;
import com.adimage.R$layout;
import com.adimage.R$string;
import com.adimage.view.LaunchAdView;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p255o0.InterfaceC5898a;

/* loaded from: classes.dex */
public final class LaunchAdView extends FrameLayout {

    /* renamed from: f */
    public static final C1517a f5739f = new C1517a(null);

    /* renamed from: a */
    private long f5740a;

    /* renamed from: b */
    private Handler f5741b;

    /* renamed from: c */
    private InterfaceC5898a f5742c;

    /* renamed from: d */
    private Runnable f5743d;

    /* renamed from: e */
    public Map f5744e;

    /* renamed from: com.adimage.view.LaunchAdView$a */
    /* loaded from: classes.dex */
    public static final class C1517a {
        private C1517a() {
        }

        public /* synthetic */ C1517a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LaunchAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    /* renamed from: c */
    private final void m7040c() {
        this.f5741b.postDelayed(this.f5743d, 1000L);
    }

    /* renamed from: d */
    private final void m7041d() {
        InterfaceC5898a interfaceC5898a = this.f5742c;
        if (interfaceC5898a != null) {
            TraceAdImageView traceAdImageView = (TraceAdImageView) m7045b(R$id.mIvAd);
            AbstractC5868k.m23673e(traceAdImageView, "mIvAd");
            interfaceC5898a.mo11408b(traceAdImageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m7042e(LaunchAdView launchAdView) {
        AbstractC5868k.m23674f(launchAdView, "this$0");
        launchAdView.f5740a--;
        launchAdView.m7044i();
        if (launchAdView.f5740a == 0) {
            InterfaceC5898a interfaceC5898a = launchAdView.f5742c;
            if (interfaceC5898a != null) {
                interfaceC5898a.mo11407a();
                return;
            }
            return;
        }
        launchAdView.m7040c();
    }

    /* renamed from: h */
    private final void m7043h() {
        this.f5740a = 5L;
        m7044i();
        m7040c();
    }

    /* renamed from: i */
    private final void m7044i() {
        if (this.f5740a < 1) {
            return;
        }
        ((TextView) m7045b(R$id.mTvCountDown)).setText(getResources().getString(R$string.ad_count_down, Long.valueOf(this.f5740a)));
    }

    /* renamed from: b */
    public View m7045b(int i10) {
        Map map = this.f5744e;
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

    /* renamed from: f */
    public final void m7046f(InterfaceC5898a interfaceC5898a) {
        AbstractC5868k.m23674f(interfaceC5898a, "listener");
        this.f5742c = interfaceC5898a;
        m7041d();
    }

    /* renamed from: g */
    public final void m7047g() {
        String str;
        int i10 = R$id.mTvVersion;
        ((TextView) m7045b(i10)).setVisibility(0);
        ((TextView) m7045b(R$id.mTvCountDown)).setVisibility(0);
        TextView textView = (TextView) m7045b(i10);
        InterfaceC5898a interfaceC5898a = this.f5742c;
        if (interfaceC5898a != null) {
            str = interfaceC5898a.getVersion();
        } else {
            str = null;
        }
        textView.setText(str);
        m7043h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5741b.removeCallbacks(this.f5743d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f5744e = new LinkedHashMap();
        this.f5740a = 5L;
        this.f5741b = new Handler(Looper.getMainLooper());
        this.f5743d = new Runnable() { // from class: o0.b
            @Override // java.lang.Runnable
            public final void run() {
                LaunchAdView.m7042e(LaunchAdView.this);
            }
        };
        LayoutInflater.from(context).inflate(R$layout.view_launch_ad, (ViewGroup) this, true);
    }

    public /* synthetic */ LaunchAdView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
