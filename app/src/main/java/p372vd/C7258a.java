package p372vd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$drawable;
import com.youth.banner.loader.ImageLoader;
import ne.AbstractC5868k;
import p242n0.AbstractC5718e;
import p348u2.AbstractC7026c;
import p400xa.AbstractC7555b0;

/* renamed from: vd.a */
/* loaded from: classes3.dex */
public final class C7258a extends ImageLoader {

    /* renamed from: a */
    private final String f27143a = "GlideImageLoader";

    @Override // com.youth.banner.loader.ImageLoaderInterface
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void displayImage(Context context, Object obj, ImageView imageView) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(imageView, "imageView");
        if (AbstractC5718e.m23111a(context)) {
            return;
        }
        Drawable m27111a = AbstractC7026c.m27111a(context, R$drawable.bg_placehoder_vertical);
        ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
        AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
        ((C1596k) ((C1596k) AbstractC7555b0.m28953g(m7282u, String.valueOf(obj), false).mo49d0(m27111a)).mo59k(m27111a)).m7365E0(imageView);
    }
}
