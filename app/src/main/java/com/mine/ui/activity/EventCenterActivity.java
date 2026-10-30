package com.mine.ui.activity;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import anet.channel.strategy.dispatch.DispatchConstants;
import cc.C1466m0;
import com.lzy.okgo.model.Progress;
import com.mine.R$color;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.ui.activity.EventCenterActivity;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.module.view.MyWebView;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import ne.C5874q;
import ne.C5881x;
import p132fa.C4300d;
import p148g9.InterfaceC4407c;
import p148g9.InterfaceC4408d;
import p170i2.C4842a;
import p177i9.C4915g;
import p201k2.AbstractC5091h;
import p348u2.AbstractC7026c;
import p400xa.AbstractC7598p1;

/* loaded from: classes2.dex */
public final class EventCenterActivity extends AbstractActivityC2972a implements InterfaceC4408d {

    /* renamed from: G */
    private boolean f11719G;

    /* renamed from: H */
    public Map f11720H = new LinkedHashMap();

    /* renamed from: E */
    private final String f11717E = "http://%1$s/#/brasiltv-activity?lang=%2$s&uid=%3$s&appId=%4$s&tk=%5$s&loginType=%6$s&timeStamp=%7$s&portalCode=%8$s&theme=dark";

    /* renamed from: F */
    private final String f11718F = "EventCenterActivity";

    /* renamed from: com.mine.ui.activity.EventCenterActivity$a */
    /* loaded from: classes2.dex */
    public final class C2964a {
        public C2964a() {
        }

        @JavascriptInterface
        public final void showDialog(boolean z10) {
            EventCenterActivity.this.f11719G = z10;
        }

        @JavascriptInterface
        public final void showInput(boolean z10) {
            if (Build.VERSION.SDK_INT <= 19) {
                Object systemService = EventCenterActivity.this.getSystemService("input_method");
                AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                if (z10) {
                    inputMethodManager.showSoftInput((MyWebView) EventCenterActivity.this.m11920g6(R$id.mWebView), 0);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(((MyWebView) EventCenterActivity.this.m11920g6(R$id.mWebView)).getWindowToken(), 2);
                }
            }
        }
    }

    /* renamed from: com.mine.ui.activity.EventCenterActivity$b */
    /* loaded from: classes2.dex */
    public static final class C2965b extends WebViewClient {

        /* renamed from: b */
        final /* synthetic */ C5874q f11723b;

        C2965b(C5874q c5874q) {
            this.f11723b = c5874q;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            AbstractC5868k.m23674f(webView, "view");
            AbstractC5868k.m23674f(str, "url");
            ((LoadingView) EventCenterActivity.this.m11920g6(R$id.mLoadingView)).setVisibility(8);
            if (this.f11723b.f23408a) {
                ((AutoLinearLayout) EventCenterActivity.this.m11920g6(R$id.mLayoutFail)).setVisibility(0);
                webView.setVisibility(8);
            } else {
                webView.setVisibility(0);
                ((AutoLinearLayout) EventCenterActivity.this.m11920g6(R$id.mLayoutFail)).setVisibility(8);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            AbstractC5868k.m23674f(webView, "view");
            AbstractC5868k.m23674f(webResourceRequest, Progress.REQUEST);
            AbstractC5868k.m23674f(webResourceError, "error");
            this.f11723b.f23408a = true;
            ((LoadingView) EventCenterActivity.this.m11920g6(R$id.mLoadingView)).setVisibility(8);
            ((AutoLinearLayout) EventCenterActivity.this.m11920g6(R$id.mLayoutFail)).setVisibility(0);
            webView.setVisibility(8);
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:
        
            r2 = r15.getUrl();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            r2 = r15.getUrl();
         */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onReceivedHttpError(android.webkit.WebView r14, android.webkit.WebResourceRequest r15, android.webkit.WebResourceResponse r16) {
            /*
                r13 = this;
                super.onReceivedHttpError(r14, r15, r16)
                long r3 = android.os.SystemClock.elapsedRealtime()
                z0.c r0 = p421z0.C7729c.f28423a
                java.lang.String r1 = ""
                if (r15 == 0) goto L1c
                android.net.Uri r2 = p224l9.AbstractC5527b.m22424a(r15)
                if (r2 == 0) goto L1c
                java.lang.String r2 = r2.getPath()
                if (r2 != 0) goto L1a
                goto L1c
            L1a:
                r5 = r2
                goto L1d
            L1c:
                r5 = r1
            L1d:
                if (r15 == 0) goto L2d
                android.net.Uri r2 = p224l9.AbstractC5527b.m22424a(r15)
                if (r2 == 0) goto L2d
                java.lang.String r2 = r2.getHost()
                if (r2 != 0) goto L2c
                goto L2d
            L2c:
                r1 = r2
            L2d:
                java.lang.String r2 = p035c3.AbstractC1349d.f5077a
                java.lang.String r6 = p035c3.AbstractC1349d.m6118a(r1, r2)
                java.lang.String r1 = "encryption(request?.url?…\"\", DESUtils.MAC_DES_KEY)"
                ne.AbstractC5868k.m23673e(r6, r1)
                if (r16 == 0) goto L40
                int r1 = p224l9.AbstractC5528c.m22425a(r16)
                r7 = r1
                goto L42
            L40:
                r1 = -1
                r7 = -1
            L42:
                cc.m0 r1 = cc.C1466m0.f5627a
                java.lang.String r8 = r1.m6876l()
                r9 = 0
                r10 = 1
                r11 = 64
                r12 = 0
                r1 = r3
                p421z0.C7729c.m29846e(r0, r1, r3, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mine.p068ui.activity.EventCenterActivity.C2965b.onReceivedHttpError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l6 */
    public static final boolean m11919l6(EventCenterActivity eventCenterActivity, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(eventCenterActivity, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 4) {
            if (eventCenterActivity.f11719G) {
                return true;
            }
            int i11 = R$id.mWebView;
            if (((MyWebView) eventCenterActivity.m11920g6(i11)).canGoBack()) {
                ((MyWebView) eventCenterActivity.m11920g6(i11)).goBack();
                return true;
            }
        }
        return false;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a, androidx.appcompat.app.AbstractActivityC0302c, androidx.core.app.AbstractActivityC0511i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode == 20 && this.f11719G) {
                    return true;
                }
            } else if (this.f11719G) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((AutoRelativeLayout) m11920g6(R$id.mRootView)).setBackgroundDrawable(AbstractC7026c.m27111a(this, R$color.color_0b0b0b));
        m11922j6();
    }

    /* renamed from: g6 */
    public View m11920g6(int i10) {
        Map map = this.f11720H;
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

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: i6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4407c mo7516s5() {
        return new C4915g(this, this);
    }

    /* renamed from: j6 */
    public final void m11922j6() {
        int i10 = R$id.mWebView;
        ((MyWebView) m11920g6(i10)).requestFocus(130);
        ((MyWebView) m11920g6(i10)).setVisibility(4);
        boolean m29241e = AbstractC7598p1.m29241e(this);
        ((MyWebView) m11920g6(i10)).setFocusable(true);
        ((MyWebView) m11920g6(i10)).setBackgroundColor(0);
        if (m29241e) {
            C5881x c5881x = C5881x.f23415a;
            String str = this.f11717E;
            C1466m0 c1466m0 = C1466m0.f5627a;
            String format = String.format(str, Arrays.copyOf(new Object[]{C4300d.f18678a.m18049o(), AbstractC5091h.m20659b(), c1466m0.m6878m(), C4842a.f20329a.m19920a().mo19960i(m30049S4()), c1466m0.m6879n(), "1", Long.valueOf(new Date().getTime()), c1466m0.m6882q()}, 8));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            ((MyWebView) m11920g6(i10)).loadUrl(format);
            ((LoadingView) m11920g6(R$id.mLoadingView)).setVisibility(0);
            ((MyWebView) m11920g6(i10)).setWebViewClient(new C2965b(new C5874q()));
            WebSettings settings = ((MyWebView) m11920g6(i10)).getSettings();
            AbstractC5868k.m23673e(settings, "mWebView.settings");
            settings.setJavaScriptEnabled(true);
            ((MyWebView) m11920g6(i10)).setLayerType(1, null);
            ((MyWebView) m11920g6(i10)).addJavascriptInterface(new C2964a(), DispatchConstants.ANDROID);
            ((MyWebView) m11920g6(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: l9.a
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                    boolean m11919l6;
                    m11919l6 = EventCenterActivity.m11919l6(EventCenterActivity.this, view, i11, keyEvent);
                    return m11919l6;
                }
            });
            return;
        }
        ((AutoLinearLayout) m11920g6(R$id.mLayoutFail)).setVisibility(0);
        ((MyWebView) m11920g6(i10)).setVisibility(0);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_eventcenter;
    }
}
