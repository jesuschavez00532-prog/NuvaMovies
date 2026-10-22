package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import com.lzy.okgo.model.Progress;
import com.module.R$color;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$style;
import com.module.view.LoadingView;
import com.module.view.MyWebView;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.C5874q;
import ne.C5881x;
import p153h2.AbstractC4509b;
import p170i2.AbstractC4843b;
import p170i2.C4842a;
import p179ib.AbstractC4926c;
import p201k2.AbstractC5091h;
import p201k2.AbstractC5094k;
import p348u2.AbstractC7026c;

/* renamed from: ha.z0 */
/* loaded from: classes2.dex */
public final class C4811z0 extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: G0 */
    public static final a f20273G0 = new a(null);

    /* renamed from: D0 */
    private View f20275D0;

    /* renamed from: F0 */
    public Map f20277F0 = new LinkedHashMap();

    /* renamed from: C0 */
    private final String f20274C0 = C4811z0.class.getSimpleName();

    /* renamed from: E0 */
    private WebViewClient f20276E0 = new WebViewClient();

    /* renamed from: ha.z0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: ha.z0$b */
    /* loaded from: classes2.dex */
    public static final class b extends WebViewClient {

        /* renamed from: b */
        final /* synthetic */ C5874q f20279b;

        b(C5874q c5874q) {
            this.f20279b = c5874q;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            AbstractC5868k.m23674f(webView, "view");
            AbstractC5868k.m23674f(str, "url");
            AbstractC4509b.m18869b(C4811z0.this.f20274C0, "onPageFinished()", new Object[0]);
            ((LoadingView) C4811z0.this.m19888G9(R$id.mLoadingView)).setVisibility(8);
            if (this.f20279b.f23408a) {
                ((AutoLinearLayout) C4811z0.this.m19888G9(R$id.mLayoutFail)).setVisibility(0);
                webView.setVisibility(8);
            } else {
                webView.setVisibility(0);
                ((AutoLinearLayout) C4811z0.this.m19888G9(R$id.mLayoutFail)).setVisibility(8);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            AbstractC5868k.m23674f(webView, "view");
            AbstractC5868k.m23674f(webResourceRequest, Progress.REQUEST);
            AbstractC5868k.m23674f(webResourceError, "error");
            AbstractC4509b.m18869b(C4811z0.this.f20274C0, "onReceivedError()", new Object[0]);
            this.f20279b.f23408a = true;
            ((LoadingView) C4811z0.this.m19888G9(R$id.mLoadingView)).setVisibility(8);
            ((AutoLinearLayout) C4811z0.this.m19888G9(R$id.mLayoutFail)).setVisibility(0);
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
            throw new UnsupportedOperationException("Method not decompiled: p161ha.C4811z0.b.onReceivedHttpError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
        }
    }

    /* renamed from: F9 */
    public void m19887F9() {
        this.f20277F0.clear();
    }

    /* renamed from: G9 */
    public View m19888G9(int i10) {
        View findViewById;
        Map map = this.f20277F0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    /* renamed from: I9 */
    public final void m19889I9() {
        int i10 = R$id.mWebView;
        ((MyWebView) m19888G9(i10)).setVisibility(4);
        boolean m20685b = AbstractC5094k.m20685b(m3096J6());
        ((MyWebView) m19888G9(i10)).setFocusable(true);
        ((MyWebView) m19888G9(i10)).setBackgroundColor(0);
        if (m20685b) {
            C5881x c5881x = C5881x.f23415a;
            AbstractC4843b m19920a = C4842a.f20329a.m19920a();
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            String format = String.format("http://%1$s/#/tv-privacy-policy?lang=%2$s&appId=%3$s&timeStamp=%4$s", Arrays.copyOf(new Object[]{AbstractC4926c.m20242i(), AbstractC5091h.m20659b(), m19920a.mo19960i(m3096J6), Long.valueOf(new Date().getTime())}, 4));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            ((MyWebView) m19888G9(i10)).loadUrl(format);
            AbstractC4509b.m18869b(this.f20274C0, "mWebView.url = " + format, new Object[0]);
            ((LoadingView) m19888G9(R$id.mLoadingView)).setVisibility(0);
            ((MyWebView) m19888G9(i10)).setWebViewClient(new b(new C5874q()));
            WebSettings settings = ((MyWebView) m19888G9(i10)).getSettings();
            AbstractC5868k.m23673e(settings, "mWebView.settings");
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(-1);
            return;
        }
        ((AutoLinearLayout) m19888G9(R$id.mLayoutFail)).setVisibility(0);
        ((MyWebView) m19888G9(i10)).setVisibility(0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_privacy_policy, viewGroup, false);
        this.f20275D0 = inflate;
        if (inflate != null) {
            inflate.setBackgroundDrawable(AbstractC7026c.m27111a(m3096J6(), R$color.color_0b0b0b));
        }
        return this.f20275D0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        ((MyWebView) m19888G9(R$id.mWebView)).setWebViewClient(this.f20276E0);
        super.mo3123S7();
        m19887F9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m19889I9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        ((MyWebView) m19888G9(R$id.mWebView)).setWebViewClient(this.f20276E0);
    }
}
