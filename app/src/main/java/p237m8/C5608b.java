package p237m8;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import com.live.R$drawable;
import com.request.result.ShelveMatch;
import com.umeng.analytics.pro.C3384f;
import ne.AbstractC5868k;
import p178ia.C4920b;
import p317rb.AbstractC6567a;
import p400xa.AbstractC7555b0;

/* renamed from: m8.b */
/* loaded from: classes2.dex */
public final class C5608b {

    /* renamed from: a */
    public static final C5608b f22632a = new C5608b();

    /* renamed from: b */
    private static final ShelveMatch f22633b = new ShelveMatch(null, "all", null, null, null);

    private C5608b() {
    }

    /* renamed from: a */
    public final void m22778a(Context context, ImageView imageView, String str) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(imageView, "logoView");
        if (AbstractC6567a.m25634d(str)) {
            imageView.setImageResource(R$drawable.ic_match_logo_default);
            return;
        }
        ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
        AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
        C1596k m28954h = AbstractC7555b0.m28954h(m7282u, str, false, 2, null);
        int i10 = R$drawable.ic_match_logo_default;
        ((C1596k) ((C1596k) m28954h.mo57j(i10)).mo47c0(i10)).m7363B0(new C4920b(imageView));
    }

    /* renamed from: b */
    public final void m22779b(Context context, ImageView imageView, String str) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(imageView, "logoView");
        if (AbstractC6567a.m25634d(str)) {
            imageView.setImageResource(R$drawable.ic_match_play_off_default);
            return;
        }
        ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
        AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
        C1596k m28954h = AbstractC7555b0.m28954h(m7282u, str, false, 2, null);
        int i10 = R$drawable.ic_match_logo_default;
        ((C1596k) ((C1596k) m28954h.mo57j(i10)).mo47c0(i10)).m7363B0(new C4920b(imageView));
    }

    /* renamed from: c */
    public final void m22780c(Context context, ImageView imageView, String str) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(imageView, "logoView");
        if (AbstractC6567a.m25634d(str)) {
            imageView.setImageResource(R$drawable.ic_match_logo_default);
            return;
        }
        ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
        AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
        C1596k m28954h = AbstractC7555b0.m28954h(m7282u, str, false, 2, null);
        int i10 = R$drawable.ic_match_logo_default;
        ((C1596k) ((C1596k) m28954h.mo57j(i10)).mo47c0(i10)).m7363B0(new C4920b(imageView));
    }
}
