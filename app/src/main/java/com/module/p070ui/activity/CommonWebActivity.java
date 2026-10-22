package com.module.p070ui.activity;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.p070ui.activity.CommonWebActivity;
import com.module.view.LoadingView;
import com.module.view.MyWebView;
import java.util.LinkedHashMap;
import java.util.Map;
import ma.C5623a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p209ka.InterfaceC5138a;
import p359ue.AbstractC7167u;

/* loaded from: classes2.dex */
public final class CommonWebActivity extends AbstractActivityC2972a implements InterfaceC5138a {

    /* renamed from: F */
    public static final C2986a f12111F = new C2986a(null);

    /* renamed from: E */
    public Map f12112E = new LinkedHashMap();

    /* renamed from: com.module.ui.activity.CommonWebActivity$a */
    /* loaded from: classes2.dex */
    public static final class C2986a {
        private C2986a() {
        }

        public /* synthetic */ C2986a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.module.ui.activity.CommonWebActivity$b */
    /* loaded from: classes2.dex */
    public static final class C2987b extends WebViewClient {
        C2987b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            String title;
            boolean m27763v;
            boolean m27763v2;
            super.onPageFinished(webView, str);
            if (webView != null && (title = webView.getTitle()) != null) {
                CommonWebActivity commonWebActivity = CommonWebActivity.this;
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
                        TextView textView = (TextView) commonWebActivity.m12048h6(R$id.mTvWebTitle);
                        String title3 = webView.getTitle();
                        if (title3 != null) {
                            str2 = title3;
                        }
                        textView.setText(str2);
                    }
                }
                ((TextView) commonWebActivity.m12048h6(R$id.mTvWebTitle)).setText(" ");
            }
            ((LoadingView) CommonWebActivity.this.m12048h6(R$id.mLoadingView)).setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            ((LoadingView) CommonWebActivity.this.m12048h6(R$id.mLoadingView)).setVisibility(0);
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

    /* renamed from: com.module.ui.activity.CommonWebActivity$c */
    /* loaded from: classes2.dex */
    public static final class C2988c extends WebChromeClient {
        C2988c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            boolean m27763v;
            String title;
            String url;
            boolean m27763v2;
            super.onReceivedTitle(webView, str);
            if (str != null) {
                CommonWebActivity commonWebActivity = CommonWebActivity.this;
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
                        TextView textView = (TextView) commonWebActivity.m12048h6(R$id.mTvWebTitle);
                        if (webView != null && (title = webView.getTitle()) != null) {
                            str2 = title;
                        }
                        textView.setText(str2);
                        return;
                    }
                }
                ((TextView) commonWebActivity.m12048h6(R$id.mTvWebTitle)).setText(" ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i6 */
    public static final void m12046i6(CommonWebActivity commonWebActivity, View view) {
        AbstractC5868k.m23674f(commonWebActivity, "this$0");
        commonWebActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j6 */
    public static final void m12047j6(CommonWebActivity commonWebActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(commonWebActivity, "this$0");
        if (z10) {
            ((ImageView) commonWebActivity.m12048h6(R$id.mIvClose)).setAlpha(0.5f);
        } else {
            ((ImageView) commonWebActivity.m12048h6(R$id.mIvClose)).setAlpha(1.0f);
        }
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        int i10 = R$id.mWvCommon;
        ((MyWebView) m12048h6(i10)).setFocusable(true);
        WebSettings settings = ((MyWebView) m12048h6(i10)).getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        int i11 = R$id.mIvClose;
        ((ImageView) m12048h6(i11)).setOnClickListener(new View.OnClickListener() { // from class: wa.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonWebActivity.m12046i6(CommonWebActivity.this, view);
            }
        });
        ((ImageView) m12048h6(i11)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: wa.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                CommonWebActivity.m12047j6(CommonWebActivity.this, view, z10);
            }
        });
        ((MyWebView) m12048h6(i10)).setWebViewClient(new C2987b());
        ((MyWebView) m12048h6(i10)).setWebChromeClient(new C2988c());
        String stringExtra = getIntent().getStringExtra("extra_jump_url");
        if (stringExtra != null) {
            ((MyWebView) m12048h6(i10)).loadUrl(stringExtra);
        }
    }

    /* renamed from: h6 */
    public View m12048h6(int i10) {
        Map map = this.f12112E;
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
    /* renamed from: l6, reason: merged with bridge method [inline-methods] */
    public C5623a mo7516s5() {
        return new C5623a(this, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i10 = R$id.mWvCommon;
        if (((MyWebView) m12048h6(i10)).canGoBack()) {
            ((MyWebView) m12048h6(i10)).goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        int i10 = R$id.mWvCommon;
        if (((MyWebView) m12048h6(i10)).getParent() != null) {
            ViewParent parent = ((MyWebView) m12048h6(i10)).getParent();
            AbstractC5868k.m23672d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView((MyWebView) m12048h6(i10));
        }
        ((MyWebView) m12048h6(i10)).stopLoading();
        ((MyWebView) m12048h6(i10)).getSettings().setJavaScriptEnabled(false);
        ((MyWebView) m12048h6(i10)).clearHistory();
        ((MyWebView) m12048h6(i10)).clearView();
        ((MyWebView) m12048h6(i10)).removeAllViews();
        ((MyWebView) m12048h6(i10)).destroy();
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.act_common_web;
    }
}
