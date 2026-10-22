package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$style;
import com.module.view.LoadingView;
import com.module.view.MyWebView;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p359ue.AbstractC7167u;
import p430z9.C7767e;

/* renamed from: ha.h0 */
/* loaded from: classes2.dex */
public final class C4773h0 extends C7767e {

    /* renamed from: G0 */
    public static final a f20139G0 = new a(null);

    /* renamed from: F0 */
    public Map f20140F0 = new LinkedHashMap();

    /* renamed from: ha.h0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: ha.h0$b */
    /* loaded from: classes2.dex */
    public static final class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            String title;
            boolean m27763v;
            boolean m27763v2;
            super.onPageFinished(webView, str);
            if (webView != null && (title = webView.getTitle()) != null) {
                C4773h0 c4773h0 = C4773h0.this;
                boolean z10 = false;
                m27763v = AbstractC7167u.m27763v(title, "koocan.com", false, 2, null);
                if (!m27763v) {
                    String url = webView.getUrl();
                    String str2 = "";
                    if (url != null) {
                        AbstractC5868k.m23673e(url, "url");
                        String title2 = webView.getTitle();
                        if (title2 == null) {
                            title2 = "";
                        }
                        AbstractC5868k.m23673e(title2, "view.title ?: \"\"");
                        m27763v2 = AbstractC7167u.m27763v(url, title2, false, 2, null);
                        if (m27763v2) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        TextView textView = (TextView) c4773h0.m19732J9(R$id.mTvWebTitle);
                        if (textView != null) {
                            String title3 = webView.getTitle();
                            if (title3 != null) {
                                str2 = title3;
                            }
                            textView.setText(str2);
                        }
                    }
                }
                TextView textView2 = (TextView) c4773h0.m19732J9(R$id.mTvWebTitle);
                if (textView2 != null) {
                    textView2.setText(" ");
                }
            }
            LoadingView loadingView = (LoadingView) C4773h0.this.m19732J9(R$id.mLoadingView);
            if (loadingView != null) {
                loadingView.setVisibility(8);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            LoadingView loadingView = (LoadingView) C4773h0.this.m19732J9(R$id.mLoadingView);
            if (loadingView != null) {
                loadingView.setVisibility(0);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str != null && webView != null) {
                webView.loadUrl(str);
                return true;
            }
            return true;
        }
    }

    /* renamed from: ha.h0$c */
    /* loaded from: classes2.dex */
    public static final class c extends WebChromeClient {
        c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            boolean m27763v;
            String title;
            String url;
            boolean m27763v2;
            super.onReceivedTitle(webView, str);
            if (str != null) {
                C4773h0 c4773h0 = C4773h0.this;
                boolean z10 = false;
                m27763v = AbstractC7167u.m27763v(str, "koocan.com", false, 2, null);
                String str2 = " ";
                if (!m27763v) {
                    if (webView != null && (url = webView.getUrl()) != null) {
                        String title2 = webView.getTitle();
                        if (title2 == null) {
                            title2 = "";
                        }
                        AbstractC5868k.m23673e(title2, "view.title ?: \"\"");
                        m27763v2 = AbstractC7167u.m27763v(url, title2, false, 2, null);
                        if (!m27763v2) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        TextView textView = (TextView) c4773h0.m19732J9(R$id.mTvWebTitle);
                        if (textView != null) {
                            if (webView != null && (title = webView.getTitle()) != null) {
                                str2 = title;
                            }
                            textView.setText(str2);
                            return;
                        }
                        return;
                    }
                }
                TextView textView2 = (TextView) c4773h0.m19732J9(R$id.mTvWebTitle);
                if (textView2 != null) {
                    textView2.setText(" ");
                }
            }
        }
    }

    /* renamed from: K9 */
    private final void m19729K9() {
        String str;
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            m3280r9.setCancelable(true);
        }
        int i10 = R$id.mWvCommon;
        ((MyWebView) m19732J9(i10)).setFocusable(true);
        WebSettings settings = ((MyWebView) m19732J9(i10)).getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        int i11 = R$id.mIvClose;
        ((ImageView) m19732J9(i11)).setOnClickListener(new View.OnClickListener() { // from class: ha.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4773h0.m19730L9(C4773h0.this, view);
            }
        });
        ((ImageView) m19732J9(i11)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ha.g0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C4773h0.m19731M9(C4773h0.this, view, z10);
            }
        });
        ((MyWebView) m19732J9(i10)).setWebViewClient(new b());
        ((MyWebView) m19732J9(i10)).setWebChromeClient(new c());
        MyWebView myWebView = (MyWebView) m19732J9(i10);
        Bundle m3090H6 = m3090H6();
        if (m3090H6 == null || (str = m3090H6.getString("extra_visit_link")) == null) {
            str = "";
        }
        myWebView.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L9 */
    public static final void m19730L9(C4773h0 c4773h0, View view) {
        AbstractC5868k.m23674f(c4773h0, "this$0");
        c4773h0.mo3278o9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M9 */
    public static final void m19731M9(C4773h0 c4773h0, View view, boolean z10) {
        AbstractC5868k.m23674f(c4773h0, "this$0");
        if (z10) {
            ((ImageView) c4773h0.m19732J9(R$id.mIvClose)).setAlpha(0.5f);
        } else {
            ((ImageView) c4773h0.m19732J9(R$id.mIvClose)).setAlpha(1.0f);
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20140F0.clear();
    }

    /* renamed from: J9 */
    public View m19732J9(int i10) {
        View findViewById;
        Map map = this.f20140F0;
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

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.VoiceAssistDialog);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.dialog_float_web, viewGroup, false);
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Object obj;
        Window window;
        Window window2;
        Window window3;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window3 = m3280r9.getWindow()) != null) {
            window3.setGravity(17);
        }
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            obj = m3096J6.getSystemService("window");
        } else {
            obj = null;
        }
        AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) obj;
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        Dialog m3280r92 = m3280r9();
        if (m3280r92 != null && (window2 = m3280r92.getWindow()) != null) {
            window2.setLayout(width, height);
        }
        Dialog m3280r93 = m3280r9();
        if (m3280r93 != null && (window = m3280r93.getWindow()) != null) {
            window.setWindowAnimations(R$style.DialogBottomAnim);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m19729K9();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        int i10 = R$id.mWvCommon;
        if (((MyWebView) m19732J9(i10)).getParent() != null) {
            ViewParent parent = ((MyWebView) m19732J9(i10)).getParent();
            AbstractC5868k.m23672d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView((MyWebView) m19732J9(i10));
        }
        ((MyWebView) m19732J9(i10)).stopLoading();
        ((MyWebView) m19732J9(i10)).getSettings().setJavaScriptEnabled(false);
        ((MyWebView) m19732J9(i10)).clearHistory();
        ((MyWebView) m19732J9(i10)).clearView();
        ((MyWebView) m19732J9(i10)).removeAllViews();
        ((MyWebView) m19732J9(i10)).destroy();
    }
}
