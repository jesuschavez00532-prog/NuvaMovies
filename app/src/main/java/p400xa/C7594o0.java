package p400xa;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import be.C1328x;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import com.request.result.Channel;
import com.request.result.PosterList;
import com.taobao.accs.common.Constants;
import com.titans.entity.CdnType;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p003a2.AbstractC0005a;
import p178ia.C4919a;
import p178ia.C4921c;
import p178ia.C4922d;
import p216l1.AbstractC5323j;
import p278p1.C6169i;
import p317rb.AbstractC6567a;
import p322s1.C6625g0;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;

/* renamed from: xa.o0 */
/* loaded from: classes2.dex */
public final class C7594o0 {

    /* renamed from: a */
    public static final C7594o0 f27942a = new C7594o0();

    /* renamed from: xa.o0$a */
    /* loaded from: classes2.dex */
    public enum a {
        Logo("logo"),
        Banner("banner"),
        Icon("icon"),
        Topic("topic"),
        SpecialTopic("special_topic"),
        Poster("poster"),
        Background("background"),
        SpecialTopicBanner("special_topic_banner"),
        Stage("stage");


        /* renamed from: a */
        private final String f27953a;

        a(String str) {
            this.f27953a = str;
        }

        /* renamed from: b */
        public final String m29227b() {
            return this.f27953a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.o0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ImageView f27954a;

        /* renamed from: b */
        final /* synthetic */ Context f27955b;

        /* renamed from: c */
        final /* synthetic */ int f27956c;

        /* renamed from: d */
        final /* synthetic */ int f27957d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ImageView imageView, Context context, int i10, int i11) {
            super(1);
            this.f27954a = imageView;
            this.f27955b = context;
            this.f27956c = i10;
            this.f27957d = i11;
        }

        /* renamed from: a */
        public final void m29228a(String str) {
            ImageView imageView = this.f27954a;
            if (imageView != null && str != null) {
                C7594o0.f27942a.m29221j(str, imageView, this.f27955b, this.f27956c, this.f27957d);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29228a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.o0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f27958a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m29229a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29229a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.o0$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ImageView f27959a;

        /* renamed from: b */
        final /* synthetic */ Context f27960b;

        /* renamed from: c */
        final /* synthetic */ Drawable f27961c;

        /* renamed from: d */
        final /* synthetic */ int f27962d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ImageView imageView, Context context, Drawable drawable, int i10) {
            super(1);
            this.f27959a = imageView;
            this.f27960b = context;
            this.f27961c = drawable;
            this.f27962d = i10;
        }

        /* renamed from: a */
        public final void m29230a(String str) {
            ImageView imageView = this.f27959a;
            if (imageView != null && str != null) {
                C7594o0.m29204m(C7594o0.f27942a, str, imageView, this.f27960b, this.f27961c, this.f27962d, null, 32, null);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29230a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.o0$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f27963a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m29231a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29231a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    private C7594o0() {
    }

    /* renamed from: C */
    public static /* synthetic */ void m29188C(C7594o0 c7594o0, Context context, String str, ImageView imageView, Integer num, Integer num2, AbstractC5323j abstractC5323j, int i10, int i11, Object obj) {
        Integer num3;
        Integer num4;
        AbstractC5323j abstractC5323j2;
        int i12;
        if ((i11 & 8) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i11 & 16) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i11 & 32) != 0) {
            AbstractC5323j abstractC5323j3 = AbstractC5323j.f21746d;
            AbstractC5868k.m23673e(abstractC5323j3, "RESOURCE");
            abstractC5323j2 = abstractC5323j3;
        } else {
            abstractC5323j2 = abstractC5323j;
        }
        if ((i11 & 64) != 0) {
            i12 = -1;
        } else {
            i12 = i10;
        }
        c7594o0.m29215A(context, str, imageView, num3, num4, abstractC5323j2, i12);
    }

    /* renamed from: D */
    public static /* synthetic */ void m29189D(C7594o0 c7594o0, Context context, List list, a aVar, ImageView imageView, Integer num, Integer num2, AbstractC5323j abstractC5323j, int i10, int i11, Object obj) {
        AbstractC5323j abstractC5323j2;
        Integer num3 = (i11 & 16) != 0 ? null : num;
        Integer num4 = (i11 & 32) != 0 ? null : num2;
        if ((i11 & 64) != 0) {
            AbstractC5323j abstractC5323j3 = AbstractC5323j.f21746d;
            AbstractC5868k.m23673e(abstractC5323j3, "RESOURCE");
            abstractC5323j2 = abstractC5323j3;
        } else {
            abstractC5323j2 = abstractC5323j;
        }
        c7594o0.m29216B(context, list, aVar, imageView, num3, num4, abstractC5323j2, (i11 & 128) != 0 ? -1 : i10);
    }

    /* renamed from: E */
    private final void m29190E(Context context, String str, View view, Drawable drawable, Integer num, AbstractC5323j abstractC5323j, int i10, boolean z10) {
        boolean m27722i;
        m27722i = AbstractC7166t.m27722i(str, ".gif", false, 2, null);
        if (m27722i) {
            m29213y(context, str, view, drawable, abstractC5323j, i10, z10);
        } else {
            m29192G(context, str, view, drawable, num, abstractC5323j, z10);
        }
    }

    /* renamed from: F */
    private final void m29191F(Context context, String str, View view, Integer num, Integer num2, AbstractC5323j abstractC5323j, int i10, boolean z10) {
        boolean m27722i;
        m27722i = AbstractC7166t.m27722i(str, ".gif", false, 2, null);
        if (m27722i) {
            m29214z(context, str, view, num, abstractC5323j, i10, z10);
        } else {
            m29193H(context, str, view, num, num2, abstractC5323j, z10);
        }
    }

    /* renamed from: G */
    private final void m29192G(Context context, String str, View view, Drawable drawable, Integer num, AbstractC5323j abstractC5323j, boolean z10) {
        if (m29202g(context)) {
            return;
        }
        ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
        AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
        C1596k m28954h = AbstractC7555b0.m28954h(m7282u, str, false, 2, null);
        if (drawable != null) {
            AbstractC0005a mo59k = ((C1596k) m28954h.mo49d0(drawable)).mo59k(drawable);
            AbstractC5868k.m23673e(mo59k, "requestBuilder.placehold…rror(placeholderDrawable)");
            m28954h = (C1596k) mo59k;
        }
        if (num != null && num.intValue() > 0) {
            AbstractC0005a mo67o0 = m28954h.mo67o0(new C6625g0(num.intValue()));
            AbstractC5868k.m23673e(mo67o0, "requestBuilder.transform(RoundedCorners(radius))");
            m28954h = (C1596k) mo67o0;
        }
        AbstractC0005a mo53g = m28954h.mo53g(abstractC5323j);
        AbstractC5868k.m23673e(mo53g, "requestBuilder.diskCacheStrategy(strategy)");
        C1596k c1596k = (C1596k) mo53g;
        if (z10) {
            c1596k.m7363B0(new C4919a(view));
        } else {
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type android.widget.ImageView");
            c1596k.m7365E0((ImageView) view);
        }
    }

    /* renamed from: H */
    private final void m29193H(Context context, String str, View view, Integer num, Integer num2, AbstractC5323j abstractC5323j, boolean z10) {
        if (m29202g(context)) {
            return;
        }
        ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
        AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
        C1596k m28954h = AbstractC7555b0.m28954h(m7282u, str, false, 2, null);
        if (num != null) {
            AbstractC0005a mo57j = ((C1596k) m28954h.mo47c0(num.intValue())).mo57j(num.intValue());
            AbstractC5868k.m23673e(mo57j, "requestBuilder.placehold…rror(placeholderAndError)");
            m28954h = (C1596k) mo57j;
        }
        if (num2 != null && num2.intValue() > 0) {
            AbstractC0005a mo67o0 = m28954h.mo67o0(new C6625g0(num2.intValue()));
            AbstractC5868k.m23673e(mo67o0, "requestBuilder.transform(RoundedCorners(radius))");
            m28954h = (C1596k) mo67o0;
        }
        AbstractC0005a mo53g = m28954h.mo53g(abstractC5323j);
        AbstractC5868k.m23673e(mo53g, "requestBuilder.diskCacheStrategy(strategy)");
        C1596k c1596k = (C1596k) mo53g;
        if (z10) {
            c1596k.m7363B0(new C4919a(view));
        } else {
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type android.widget.ImageView");
            c1596k.m7365E0((ImageView) view);
        }
    }

    /* renamed from: K */
    public static /* synthetic */ void m29194K(C7594o0 c7594o0, Context context, String str, View view, Drawable drawable, Integer num, AbstractC5323j abstractC5323j, int i10, int i11, Object obj) {
        Drawable drawable2;
        Integer num2;
        AbstractC5323j abstractC5323j2;
        int i12;
        if ((i11 & 8) != 0) {
            drawable2 = null;
        } else {
            drawable2 = drawable;
        }
        if ((i11 & 16) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i11 & 32) != 0) {
            AbstractC5323j abstractC5323j3 = AbstractC5323j.f21746d;
            AbstractC5868k.m23673e(abstractC5323j3, "RESOURCE");
            abstractC5323j2 = abstractC5323j3;
        } else {
            abstractC5323j2 = abstractC5323j;
        }
        if ((i11 & 64) != 0) {
            i12 = -1;
        } else {
            i12 = i10;
        }
        c7594o0.m29217I(context, str, view, drawable2, num2, abstractC5323j2, i12);
    }

    /* renamed from: L */
    public static /* synthetic */ void m29195L(C7594o0 c7594o0, Context context, String str, View view, Integer num, Integer num2, AbstractC5323j abstractC5323j, int i10, int i11, Object obj) {
        Integer num3;
        Integer num4;
        AbstractC5323j abstractC5323j2;
        int i12;
        if ((i11 & 8) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i11 & 16) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i11 & 32) != 0) {
            AbstractC5323j abstractC5323j3 = AbstractC5323j.f21746d;
            AbstractC5868k.m23673e(abstractC5323j3, "RESOURCE");
            abstractC5323j2 = abstractC5323j3;
        } else {
            abstractC5323j2 = abstractC5323j;
        }
        if ((i11 & 64) != 0) {
            i12 = -1;
        } else {
            i12 = i10;
        }
        c7594o0.m29218J(context, str, view, num3, num4, abstractC5323j2, i12);
    }

    /* renamed from: g */
    private final boolean m29202g(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).isDestroyed();
        }
        if (context instanceof ContextWrapper) {
            return m29202g(((ContextWrapper) context).getBaseContext());
        }
        return false;
    }

    /* renamed from: l */
    public static /* synthetic */ void m29203l(C7594o0 c7594o0, String str, ImageView imageView, Context context, int i10, int i11, int i12, Object obj) {
        int i13;
        if ((i12 & 16) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        c7594o0.m29221j(str, imageView, context, i10, i13);
    }

    /* renamed from: m */
    public static /* synthetic */ void m29204m(C7594o0 c7594o0, String str, ImageView imageView, Context context, Drawable drawable, int i10, String str2, int i11, Object obj) {
        int i12;
        if ((i11 & 16) != 0) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        if ((i11 & 32) != 0) {
            str2 = MessageService.MSG_DB_READY_REPORT;
        }
        c7594o0.m29222k(str, imageView, context, drawable, i12, str2);
    }

    /* renamed from: p */
    public static /* synthetic */ void m29205p(C7594o0 c7594o0, List list, a aVar, ImageView imageView, Context context, int i10, int i11, int i12, Object obj) {
        int i13;
        if ((i12 & 32) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        c7594o0.m29223n(list, aVar, imageView, context, i10, i13);
    }

    /* renamed from: q */
    public static /* synthetic */ void m29206q(C7594o0 c7594o0, List list, a aVar, ImageView imageView, Context context, Drawable drawable, int i10, int i11, Object obj) {
        int i12;
        if ((i11 & 32) != 0) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        c7594o0.m29224o(list, aVar, imageView, context, drawable, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final String m29207r(List list, a aVar) {
        AbstractC5868k.m23674f(aVar, "$type");
        return f27942a.m29220i(list, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m29208s(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m29209t(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final String m29210u(List list, a aVar) {
        AbstractC5868k.m23674f(aVar, "$type");
        return f27942a.m29220i(list, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m29211v(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m29212w(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: y */
    private final void m29213y(Context context, String str, View view, Drawable drawable, AbstractC5323j abstractC5323j, int i10, boolean z10) {
        if (m29202g(context)) {
            return;
        }
        C1596k mo7379d = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext()).mo7379d();
        AbstractC5868k.m23673e(mo7379d, "with(context.applicationContext).asGif()");
        C1596k m28952f = AbstractC7555b0.m28952f(mo7379d, str);
        if (drawable != null) {
            AbstractC0005a mo59k = ((C1596k) m28952f.mo49d0(drawable)).mo59k(drawable);
            AbstractC5868k.m23673e(mo59k, "requestBuilder.placehold…rror(placeholderDrawable)");
            m28952f = (C1596k) mo59k;
        }
        AbstractC0005a mo53g = m28952f.mo53g(abstractC5323j);
        AbstractC5868k.m23673e(mo53g, "requestBuilder.diskCacheStrategy(strategy)");
        C1596k c1596k = (C1596k) mo53g;
        if (z10) {
            c1596k.m7363B0(new C4922d(view, i10));
        } else {
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type android.widget.ImageView");
            c1596k.m7363B0(new C4921c((ImageView) view, i10));
        }
    }

    /* renamed from: z */
    private final void m29214z(Context context, String str, View view, Integer num, AbstractC5323j abstractC5323j, int i10, boolean z10) {
        if (m29202g(context)) {
            return;
        }
        C1596k mo7379d = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext()).mo7379d();
        AbstractC5868k.m23673e(mo7379d, "with(context.applicationContext).asGif()");
        C1596k m28952f = AbstractC7555b0.m28952f(mo7379d, str);
        if (num != null) {
            AbstractC0005a mo57j = ((C1596k) m28952f.mo47c0(num.intValue())).mo57j(num.intValue());
            AbstractC5868k.m23673e(mo57j, "requestBuilder.placehold…rror(placeholderAndError)");
            m28952f = (C1596k) mo57j;
        }
        AbstractC0005a mo53g = m28952f.mo53g(abstractC5323j);
        AbstractC5868k.m23673e(mo53g, "requestBuilder.diskCacheStrategy(strategy)");
        C1596k c1596k = (C1596k) mo53g;
        if (z10) {
            c1596k.m7363B0(new C4922d(view, i10));
        } else {
            AbstractC5868k.m23672d(view, "null cannot be cast to non-null type android.widget.ImageView");
            c1596k.m7363B0(new C4921c((ImageView) view, i10));
        }
    }

    /* renamed from: A */
    public final void m29215A(Context context, String str, ImageView imageView, Integer num, Integer num2, AbstractC5323j abstractC5323j, int i10) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "path");
        AbstractC5868k.m23674f(imageView, "imageView");
        AbstractC5868k.m23674f(abstractC5323j, Constants.KEY_STRATEGY);
        m29191F(context, str, imageView, num, num2, abstractC5323j, i10, false);
    }

    /* renamed from: B */
    public final void m29216B(Context context, List list, a aVar, ImageView imageView, Integer num, Integer num2, AbstractC5323j abstractC5323j, int i10) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(aVar, "type");
        AbstractC5868k.m23674f(imageView, "imageView");
        AbstractC5868k.m23674f(abstractC5323j, Constants.KEY_STRATEGY);
        m29215A(context, m29220i(list, aVar), imageView, num, num2, abstractC5323j, i10);
    }

    /* renamed from: I */
    public final void m29217I(Context context, String str, View view, Drawable drawable, Integer num, AbstractC5323j abstractC5323j, int i10) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "path");
        AbstractC5868k.m23674f(view, "view");
        AbstractC5868k.m23674f(abstractC5323j, Constants.KEY_STRATEGY);
        m29190E(context, str, view, drawable, num, abstractC5323j, i10, true);
    }

    /* renamed from: J */
    public final void m29218J(Context context, String str, View view, Integer num, Integer num2, AbstractC5323j abstractC5323j, int i10) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "path");
        AbstractC5868k.m23674f(view, "view");
        AbstractC5868k.m23674f(abstractC5323j, Constants.KEY_STRATEGY);
        m29191F(context, str, view, num, num2, abstractC5323j, i10, true);
    }

    /* renamed from: h */
    public final void m29219h(Channel channel) {
        boolean m27723j;
        boolean m27723j2;
        if (channel == null) {
            return;
        }
        channel.setShowIconUrl("");
        channel.setShowPosterUrl("");
        List<PosterList> posterList = channel.getPosterList();
        if (AbstractC6567a.m25635e(posterList)) {
            return;
        }
        AbstractC5868k.m23671c(posterList);
        for (PosterList posterList2 : posterList) {
            a aVar = a.Icon;
            m27723j = AbstractC7166t.m27723j(aVar.m29227b(), posterList2.getFileType(), true);
            if (!m27723j) {
                m27723j2 = AbstractC7166t.m27723j(aVar.m29227b(), posterList2.getFileType(), true);
                if (m27723j2) {
                    channel.setShowPosterUrl(posterList2.getFileUrl());
                }
            } else {
                channel.setShowIconUrl(posterList2.getFileUrl());
            }
        }
    }

    /* renamed from: i */
    public final String m29220i(List list, a aVar) {
        boolean m27723j;
        AbstractC5868k.m23674f(aVar, "type");
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PosterList posterList = (PosterList) it.next();
                m27723j = AbstractC7166t.m27723j(aVar.m29227b(), posterList.getFileType(), true);
                if (m27723j) {
                    return posterList.getFileUrl();
                }
            }
        }
        return "";
    }

    /* renamed from: j */
    public final void m29221j(String str, ImageView imageView, Context context, int i10, int i11) {
        AbstractC5868k.m23674f(imageView, "imageView");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (m29202g(context)) {
            return;
        }
        ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
        AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
        AbstractC0005a mo53g = ((C1596k) ((C1596k) AbstractC7555b0.m28954h(m7282u, str, false, 2, null).mo47c0(i10)).mo57j(i10)).mo53g(AbstractC5323j.f21746d);
        AbstractC5868k.m23673e(mo53g, "with(context.application…skCacheStrategy.RESOURCE)");
        C1596k c1596k = (C1596k) mo53g;
        if (i11 != 0) {
            AbstractC0005a mo67o0 = c1596k.mo67o0(new C6625g0(i11));
            AbstractC5868k.m23673e(mo67o0, "requestBuilder\n         …m(RoundedCorners(radius))");
            c1596k = (C1596k) mo67o0;
        }
        c1596k.m7365E0(imageView);
    }

    /* renamed from: k */
    public final void m29222k(String str, ImageView imageView, Context context, Drawable drawable, int i10, String str2) {
        C1596k c1596k;
        AbstractC5868k.m23674f(imageView, "imageView");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(drawable, "placeholderDrawable");
        AbstractC5868k.m23674f(str2, "type");
        if (m29202g(context)) {
            return;
        }
        C6169i c6169i = null;
        if (AbstractC5868k.m23669a(str2, CdnType.DIGITAL_TYPE_PCDN)) {
            ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
            if (str != null) {
                c6169i = AbstractC7555b0.m28960n(str);
            }
            AbstractC0005a mo53g = ((C1596k) ((C1596k) m7282u.mo7387m(c6169i).mo49d0(drawable)).mo59k(drawable)).mo53g(AbstractC5323j.f21746d);
            AbstractC5868k.m23673e(mo53g, "with(context.application…skCacheStrategy.RESOURCE)");
            c1596k = (C1596k) mo53g;
        } else {
            ComponentCallbacks2C1597l m7282u2 = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
            AbstractC5868k.m23673e(m7282u2, "with(context.applicationContext)");
            AbstractC0005a mo53g2 = ((C1596k) ((C1596k) AbstractC7555b0.m28954h(m7282u2, str, false, 2, null).mo49d0(drawable)).mo59k(drawable)).mo53g(AbstractC5323j.f21746d);
            AbstractC5868k.m23673e(mo53g2, "with(context.application…skCacheStrategy.RESOURCE)");
            c1596k = (C1596k) mo53g2;
        }
        if (i10 != 0) {
            AbstractC0005a mo67o0 = c1596k.mo67o0(new C6625g0(i10));
            AbstractC5868k.m23673e(mo67o0, "requestBuilder\n         …m(RoundedCorners(radius))");
            c1596k = (C1596k) mo67o0;
        }
        c1596k.m7365E0(imageView);
    }

    /* renamed from: n */
    public final void m29223n(final List list, final a aVar, ImageView imageView, Context context, int i10, int i11) {
        AbstractC5868k.m23674f(aVar, "type");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        Observable compose = Observable.fromCallable(new Callable() { // from class: xa.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m29207r;
                m29207r = C7594o0.m29207r(list, aVar);
                return m29207r;
            }
        }).compose(AbstractC7029f.m27121b());
        final b bVar = new b(imageView, context, i10, i11);
        Consumer consumer = new Consumer() { // from class: xa.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7594o0.m29208s(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f27958a;
        compose.subscribe(consumer, new Consumer() { // from class: xa.k0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7594o0.m29209t(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: o */
    public final void m29224o(final List list, final a aVar, ImageView imageView, Context context, Drawable drawable, int i10) {
        AbstractC5868k.m23674f(aVar, "type");
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(drawable, "mDrawable");
        Observable compose = Observable.fromCallable(new Callable() { // from class: xa.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m29210u;
                m29210u = C7594o0.m29210u(list, aVar);
                return m29210u;
            }
        }).compose(AbstractC7029f.m27121b());
        final d dVar = new d(imageView, context, drawable, i10);
        Consumer consumer = new Consumer() { // from class: xa.m0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7594o0.m29211v(InterfaceC5660l.this, obj);
            }
        };
        final e eVar = e.f27963a;
        compose.subscribe(consumer, new Consumer() { // from class: xa.n0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7594o0.m29212w(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: x */
    public final void m29225x(Context context, String str, ImageView imageView, Integer num, Integer num2) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "url");
        AbstractC5868k.m23674f(imageView, "view");
        if (m29202g(context)) {
            return;
        }
        ComponentCallbacks2C1597l m7282u = ComponentCallbacks2C1586c.m7282u(context.getApplicationContext());
        AbstractC5868k.m23673e(m7282u, "with(context.applicationContext)");
        C1596k m28954h = AbstractC7555b0.m28954h(m7282u, str, false, 2, null);
        if (num != null) {
            AbstractC0005a mo57j = ((C1596k) m28954h.mo47c0(num.intValue())).mo57j(num.intValue());
            AbstractC5868k.m23673e(mo57j, "requestBuilder.placehold…rror(placeholderAndError)");
            m28954h = (C1596k) mo57j;
        }
        if (num2 != null && num2.intValue() > 0) {
            AbstractC0005a mo67o0 = m28954h.mo67o0(new C6625g0(num2.intValue()));
            AbstractC5868k.m23673e(mo67o0, "requestBuilder.transform(RoundedCorners(radius))");
            m28954h = (C1596k) mo67o0;
        }
        m28954h.m7365E0(imageView);
    }
}
