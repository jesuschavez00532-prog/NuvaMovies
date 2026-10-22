package com.module.p070ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.lzy.okgo.model.Progress;
import com.module.R$id;
import com.module.R$layout;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.module.view.MyWebView;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ma.C5624b;
import mc.C5634i;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5874q;
import p201k2.AbstractC5085b;
import p209ka.InterfaceC5139b;
import p302qc.C6448c;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7555b0;
import p400xa.C7577i1;
import p400xa.C7619y;

/* loaded from: classes2.dex */
public final class WebActivity extends AbstractActivityC2972a implements InterfaceC5139b {

    /* renamed from: H */
    public static final C2989a f12115H = new C2989a(null);

    /* renamed from: F */
    private boolean f12117F;

    /* renamed from: G */
    public Map f12118G = new LinkedHashMap();

    /* renamed from: E */
    private final String f12116E = "WebActivity";

    /* renamed from: com.module.ui.activity.WebActivity$a */
    /* loaded from: classes2.dex */
    public static final class C2989a {

        /* renamed from: com.module.ui.activity.WebActivity$a$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ String f12119a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f12119a = str;
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "it");
                Intent putExtra = intent.putExtra("extra_url", this.f12119a);
                AbstractC5868k.m23673e(putExtra, "it.putExtra(WebActivity.EXTRA_URL, url)");
                return putExtra;
            }
        }

        private C2989a() {
        }

        public /* synthetic */ C2989a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final void m12054a(Context context, String str) {
            boolean m27763v;
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(str, "url");
            if (!TextUtils.isEmpty(str)) {
                m27763v = AbstractC7167u.m27763v(str, "toInviteFriends", false, 2, null);
                if (m27763v) {
                    C6448c.m25240q(C5634i.m22843d("http://module_mine/InviteFriendsActivity").m25254t(262144), context, null, 2, null);
                } else {
                    if (!AbstractC7555b0.m28949c(context)) {
                        return;
                    }
                    C7619y.m29367d(C7619y.f28056a, context, WebActivity.class, null, new a(str), 2, null);
                }
            }
        }
    }

    /* renamed from: com.module.ui.activity.WebActivity$b */
    /* loaded from: classes2.dex */
    public static final class C2990b extends WebViewClient {

        /* renamed from: b */
        final /* synthetic */ C5874q f12121b;

        C2990b(C5874q c5874q) {
            this.f12121b = c5874q;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            AbstractC5868k.m23674f(webView, "view");
            AbstractC5868k.m23674f(str, "url");
            ((LoadingView) WebActivity.this.m12052e6(R$id.mLoadingView)).setVisibility(8);
            if (this.f12121b.f23408a) {
                ((AutoLinearLayout) WebActivity.this.m12052e6(R$id.llHelpCenterNetFailed)).setVisibility(0);
                webView.setVisibility(8);
            } else {
                webView.setVisibility(0);
                ((AutoLinearLayout) WebActivity.this.m12052e6(R$id.llHelpCenterNetFailed)).setVisibility(8);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            AbstractC5868k.m23674f(webView, "view");
            AbstractC5868k.m23674f(webResourceRequest, Progress.REQUEST);
            AbstractC5868k.m23674f(webResourceError, "error");
            this.f12121b.f23408a = true;
            ((LoadingView) WebActivity.this.m12052e6(R$id.mLoadingView)).setVisibility(8);
            ((AutoLinearLayout) WebActivity.this.m12052e6(R$id.llHelpCenterNetFailed)).setVisibility(0);
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
            throw new UnsupportedOperationException("Method not decompiled: com.module.p070ui.activity.WebActivity.C2990b.onReceivedHttpError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (WebActivity.this.f12117F) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    /* renamed from: h6 */
    private final void m12051h6() {
        int m20602l = AbstractC5085b.m20602l(m30049S4());
        C7577i1.f fVar = C7577i1.f27838b;
        if (((Number) fVar.m29084c().m29074f("clear_webview_cache_version", 0)).intValue() != m20602l) {
            ((MyWebView) m12052e6(R$id.mWebView)).clearCache(true);
            fVar.m29084c().m29076h("clear_webview_cache_version", Integer.valueOf(m20602l));
        }
    }

    /* renamed from: e6 */
    public View m12052e6(int i10) {
        Map map = this.f12118G;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void mo7513g5() {
        /*
            r8 = this;
            c3.k r0 = p035c3.C1356k.f5086a
            boolean r0 = r0.m6133f(r8)
            r8.m12051h6()
            int r1 = com.module.R$id.mWebView
            android.view.View r2 = r8.m12052e6(r1)
            com.module.view.MyWebView r2 = (com.module.view.MyWebView) r2
            r3 = 1
            r2.setFocusable(r3)
            r2 = 8
            r4 = 0
            if (r0 == 0) goto Lab
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r5 = "extra_url"
            java.lang.String r0 = r0.getStringExtra(r5)
            android.content.Intent r5 = r8.getIntent()
            java.lang.String r6 = "extra_pg"
            boolean r5 = r5.getBooleanExtra(r6, r4)
            r8.f12117F = r5
            if (r0 == 0) goto L3e
            r5 = 2
            r6 = 0
            java.lang.String r7 = "#/tv-help"
            boolean r5 = p359ue.AbstractC7157k.m27713v(r0, r7, r4, r5, r6)
            if (r5 != r3) goto L3e
            r5 = 1
            goto L3f
        L3e:
            r5 = 0
        L3f:
            if (r5 == 0) goto L4d
            int r2 = com.module.R$id.mLayoutTitle
            android.view.View r2 = r8.m12052e6(r2)
            com.zhy.autolayout.AutoRelativeLayout r2 = (com.zhy.autolayout.AutoRelativeLayout) r2
            r2.setVisibility(r4)
            goto L58
        L4d:
            int r5 = com.module.R$id.mLayoutTitle
            android.view.View r5 = r8.m12052e6(r5)
            com.zhy.autolayout.AutoRelativeLayout r5 = (com.zhy.autolayout.AutoRelativeLayout) r5
            r5.setVisibility(r2)
        L58:
            android.view.View r2 = r8.m12052e6(r1)
            com.module.view.MyWebView r2 = (com.module.view.MyWebView) r2
            android.webkit.WebSettings r2 = r2.getSettings()
            java.lang.String r5 = "mWebView.settings"
            ne.AbstractC5868k.m23673e(r2, r5)
            r5 = -1
            r2.setCacheMode(r5)
            r2.setJavaScriptEnabled(r3)
            r2.setDomStorageEnabled(r3)
            r2.setDatabaseEnabled(r3)
            r2.setUseWideViewPort(r3)
            android.webkit.WebSettings$LayoutAlgorithm r5 = android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN
            r2.setLayoutAlgorithm(r5)
            r2.setLoadWithOverviewMode(r3)
            android.view.View r2 = r8.m12052e6(r1)
            com.module.view.MyWebView r2 = (com.module.view.MyWebView) r2
            if (r0 != 0) goto L89
            java.lang.String r0 = ""
        L89:
            r2.loadUrl(r0)
            int r0 = com.module.R$id.mLoadingView
            android.view.View r0 = r8.m12052e6(r0)
            com.module.view.LoadingView r0 = (com.module.view.LoadingView) r0
            r0.setVisibility(r4)
            ne.q r0 = new ne.q
            r0.<init>()
            android.view.View r1 = r8.m12052e6(r1)
            com.module.view.MyWebView r1 = (com.module.view.MyWebView) r1
            com.module.ui.activity.WebActivity$b r2 = new com.module.ui.activity.WebActivity$b
            r2.<init>(r0)
            r1.setWebViewClient(r2)
            goto Lbf
        Lab:
            int r0 = com.module.R$id.llHelpCenterNetFailed
            android.view.View r0 = r8.m12052e6(r0)
            com.zhy.autolayout.AutoLinearLayout r0 = (com.zhy.autolayout.AutoLinearLayout) r0
            r0.setVisibility(r4)
            android.view.View r0 = r8.m12052e6(r1)
            com.module.view.MyWebView r0 = (com.module.view.MyWebView) r0
            r0.setVisibility(r2)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.module.p070ui.activity.WebActivity.mo7513g5():void");
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        if (Build.VERSION.SDK_INT == 23) {
            AssetManager assets = getResources().getAssets();
            AbstractC5868k.m23673e(assets, "resources.assets");
            return assets;
        }
        AssetManager assets2 = super.getAssets();
        AbstractC5868k.m23673e(assets2, "super.getAssets()");
        return assets2;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: i6, reason: merged with bridge method [inline-methods] */
    public C5624b mo7516s5() {
        return new C5624b(this, this);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_web;
    }
}
