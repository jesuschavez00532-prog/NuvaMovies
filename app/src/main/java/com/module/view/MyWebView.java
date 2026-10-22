package com.module.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import me.jessyan.autosize.AutoSizeCompat;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p359ue.AbstractC7167u;

/* loaded from: classes2.dex */
public final class MyWebView extends WebView {

    /* renamed from: b */
    public static final C3016a f12252b = new C3016a(null);

    /* renamed from: c */
    private static final String f12253c = "MyWebView";

    /* renamed from: d */
    private static boolean f12254d;

    /* renamed from: a */
    public Map f12255a;

    /* renamed from: com.module.view.MyWebView$a */
    /* loaded from: classes2.dex */
    public static final class C3016a {
        private C3016a() {
        }

        public /* synthetic */ C3016a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final Context m12222b(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21 && i10 < 23) {
                Context createConfigurationContext = context.createConfigurationContext(new Configuration());
                AbstractC5868k.m23673e(createConfigurationContext, "context.createConfigurat…nContext(Configuration())");
                return createConfigurationContext;
            }
            return context;
        }

        /* renamed from: c */
        public final boolean m12223c() {
            return MyWebView.f12254d;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i10) {
        boolean m27763v;
        boolean m27763v2;
        boolean m27763v3;
        try {
            super.setOverScrollMode(i10);
            Log.w(f12253c, "setOverScrollMode not found WebView component. Please make human judgment and deal with it");
        } catch (Throwable th) {
            String stackTraceString = Log.getStackTraceString(th);
            AbstractC5868k.m23673e(stackTraceString, "getStackTraceString(e)");
            m27763v = AbstractC7167u.m27763v(stackTraceString, "android.content.pm.PackageManager$NameNotFoundException", false, 2, null);
            if (!m27763v) {
                m27763v2 = AbstractC7167u.m27763v(stackTraceString, "java.lang.RuntimeException: Cannot load WebView", false, 2, null);
                if (!m27763v2) {
                    m27763v3 = AbstractC7167u.m27763v(stackTraceString, "android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed", false, 2, null);
                    if (!m27763v3) {
                        throw th;
                    }
                }
            }
            th.printStackTrace();
            f12254d = true;
            Log.w(f12253c, "not found WebView component. Please make human judgment and deal with it");
        }
        AutoSizeCompat.autoConvertDensityOfGlobal(getResources());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyWebView(Context context, AttributeSet attributeSet, int i10) {
        super(f12252b.m12222b(context), attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f12255a = new LinkedHashMap();
    }

    public /* synthetic */ MyWebView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
