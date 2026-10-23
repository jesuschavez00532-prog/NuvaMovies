package p400xa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import com.module.R$string;
import com.module.bean.ColumnPosterBean;
import com.module.event.RefreshTableTitleEvent;
import com.request.result.ChildColumn;
import com.request.result.PosterList;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3384f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;
import p102db.C4035f;
import p132fa.C4300d;
import p216l1.AbstractC5323j;
import p287pb.AbstractApplicationC6253c;
import p317rb.AbstractC6567a;
import p400xa.C7594o0;
import ye.C7709c;

/* renamed from: xa.l */
/* loaded from: classes2.dex */
public final class C7584l {

    /* renamed from: a */
    public static final C7584l f27868a;

    /* renamed from: b */
    private static final String f27869b;

    /* renamed from: c */
    private static HashMap f27870c;

    /* renamed from: d */
    private static HashMap f27871d;

    /* renamed from: e */
    private static boolean f27872e;

    /* renamed from: f */
    private static HashMap f27873f;

    /* renamed from: g */
    private static HashMap f27874g;

    static {
        C7584l c7584l = new C7584l();
        f27868a = c7584l;
        f27869b = c7584l.getClass().getSimpleName();
        f27870c = new HashMap();
        f27871d = new HashMap();
        f27873f = new HashMap();
        f27874g = new HashMap();
    }

    private C7584l() {
    }

    /* renamed from: h */
    private final String m29102h(Context context, String str) {
        if (AbstractC5868k.m23669a(str, context.getResources().getString(R$string.home_category_live))) {
            return C4300d.f18678a.m18035h();
        }
        if (AbstractC5868k.m23669a(str, context.getResources().getString(R$string.home_category_match))) {
            return C4300d.f18678a.m18037i();
        }
        if (AbstractC5868k.m23669a(str, context.getResources().getString(R$string.home_category_featured))) {
            return C4300d.f18678a.m18027d();
        }
        if (AbstractC5868k.m23669a(str, context.getResources().getString(R$string.home_category_movies))) {
            return C4300d.f18678a.m18039j();
        }
        if (AbstractC5868k.m23669a(str, context.getResources().getString(R$string.home_category_series))) {
            return C4300d.f18678a.m18041k();
        }
        if (AbstractC5868k.m23669a(str, context.getResources().getString(R$string.home_category_kids))) {
            return C4300d.f18678a.m18033g();
        }
        if (AbstractC5868k.m23669a(str, context.getResources().getString(R$string.home_category_anime))) {
            return C4300d.f18678a.m18023b();
        }
        if (AbstractC5868k.m23669a(str, context.getResources().getString(R$string.home_category_showtime))) {
            return C4300d.f18678a.m18025c();
        }
        if (AbstractC5868k.m23669a(str, context.getResources().getString(R$string.home_category_free))) {
            return C4300d.f18678a.m18029e();
        }
        if (AbstractC5868k.m23669a(str, context.getResources().getString(R$string.home_category_uhd))) {
            return C4300d.f18678a.m18045m();
        }
        return "";
    }

    /* renamed from: a */
    public final String m29103a(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_HTTP_CODE);
        String str2 = (String) f27870c.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: b */
    public final String m29104b(String str, Context context) {
        AbstractC5868k.m23674f(str, "title");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        return m29103a(m29102h(context, str));
    }

    /* renamed from: c */
    public final Drawable m29105c(String str) {
        AbstractC5868k.m23674f(str, "url");
        try {
            ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(AbstractApplicationC6253c.f24484b.m24887a());
            AbstractC5868k.m23673e(m7282u, "with(BaseApp.context)");
            return (Drawable) ((C1596k) AbstractC7555b0.m28954h(m7282u, str, false, 2, null).mo53g(AbstractC5323j.f21745c)).m7369L0().get();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final C4035f m29106d(Context context, String str) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "title");
        if (!f27872e) {
            return null;
        }
        return (C4035f) f27874g.get(m29102h(context, str));
    }

    /* renamed from: e */
    public final String m29107e(List list, String str) {
        AbstractC5868k.m23674f(str, "type");
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PosterList posterList = (PosterList) it.next();
            if (AbstractC5868k.m23669a(str, posterList.getFileType())) {
                return posterList.getFileUrl();
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m29108f() {
        if (f27873f.size() > 0) {
            for (Map.Entry entry : f27873f.entrySet()) {
                try {
                    C7584l c7584l = f27868a;
                    Drawable m29105c = c7584l.m29105c(((ColumnPosterBean) entry.getValue()).getIconUrl());
                    Drawable m29105c2 = c7584l.m29105c(((ColumnPosterBean) entry.getValue()).getStageUrl());
                    Drawable m29105c3 = c7584l.m29105c(((ColumnPosterBean) entry.getValue()).getLogoUrl());
                    if (m29105c != null && m29105c2 != null && m29105c3 != null) {
                        f27874g.put(entry.getKey(), new C4035f(m29105c3, m29105c2, m29105c));
                    }
                } catch (Exception unused) {
                }
            }
            f27872e = true;
            if (f27874g.size() > 0) {
                C7709c.m29787d().m29802p(new RefreshTableTitleEvent());
            }
        }
    }

    /* renamed from: g */
    public final void m29109g(ChildColumn childColumn) {
        int i10 = 0;
        boolean z10;
        boolean z11;
        AbstractC5868k.m23674f(childColumn, "column");
        List<PosterList> posterList = childColumn.getPosterList();
        boolean z12 = false;
        if (posterList != null) {
            i10 = posterList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            List<PosterList> posterList2 = childColumn.getPosterList();
            AbstractC5868k.m23671c(posterList2);
            String str = "";
            String str2 = "";
            String str3 = str2;
            for (PosterList posterList3 : posterList2) {
                if (AbstractC5868k.m23669a(posterList3.getFileType(), C7594o0.a.Poster.m29227b()) && AbstractC6567a.m25637g(posterList3.getFileUrl())) {
                    f27870c.put(childColumn.getCode(), posterList3.getFileUrl());
                } else if (AbstractC5868k.m23669a(posterList3.getFileType(), C7594o0.a.Icon.m29227b()) && AbstractC6567a.m25637g(posterList3.getFileUrl())) {
                    f27871d.put(childColumn.getCode(), posterList3.getFileUrl());
                    str = posterList3.getFileUrl();
                } else if (AbstractC5868k.m23669a(posterList3.getFileType(), C7594o0.a.Logo.m29227b()) && AbstractC6567a.m25637g(posterList3.getFileUrl())) {
                    str2 = posterList3.getFileUrl();
                } else if (AbstractC5868k.m23669a(posterList3.getFileType(), C7594o0.a.Stage.m29227b()) && AbstractC6567a.m25637g(posterList3.getFileUrl())) {
                    str3 = posterList3.getFileUrl();
                }
            }
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (str2.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (str3.length() > 0) {
                        z12 = true;
                    }
                    if (z12) {
                        f27873f.put(childColumn.getCode(), new ColumnPosterBean(childColumn.getId(), str2, str3, str));
                    }
                }
            }
        }
    }
}
