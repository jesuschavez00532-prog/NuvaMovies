package p399x9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.module.R$drawable;
import com.module.R$id;
import com.module.R$layout;
import com.module.event.FinishVodDetailEvent;
import com.module.event.PlayVoiceSearchLiveEvent;
import com.request.result.AssetList;
import com.request.result.Channel;
import com.request.result.PosterList;
import com.umeng.analytics.pro.C3384f;
import java.util.List;
import java.util.Locale;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import okhttp3.internal.http.StatusLine;
import p302qc.C6448c;
import p348u2.AbstractC7026c;
import p400xa.C7554b;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: x9.m */
/* loaded from: classes2.dex */
public final class C7538m extends AbstractC7527b {

    /* renamed from: e */
    private final String f27705e;

    /* renamed from: f */
    private C7554b f27706f;

    /* renamed from: g */
    private C7531f f27707g;

    /* renamed from: h */
    private InterfaceC5664p f27708h;

    /* renamed from: i */
    private InterfaceC5642a f27709i;

    /* renamed from: x9.m$a */
    /* loaded from: classes2.dex */
    public static final class a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7550y f27710a;

        /* renamed from: b */
        final /* synthetic */ C7538m f27711b;

        a(C7550y c7550y, C7538m c7538m) {
            this.f27710a = c7550y;
            this.f27711b = c7538m;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f27710a.m28930c()) {
                this.f27711b.m28892s(this.f27710a);
            } else {
                C7538m c7538m = this.f27711b;
                c7538m.m28893t(c7538m.m28850h(), this.f27710a);
            }
        }
    }

    public C7538m() {
        super(R$layout.layout_voice_search_result, null, 2, null);
        this.f27705e = C7538m.class.getSimpleName();
        this.f27706f = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m28890r(C7538m c7538m, C7531f c7531f, int i10, View view, boolean z10) {
        AbstractC5868k.m23674f(c7538m, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        view.setSelected(z10);
        if (z10) {
            c7538m.f27707g = c7531f;
            c7531f.itemView.setTag(Boolean.TRUE);
            C7554b c7554b = c7538m.f27706f;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.1f);
        } else {
            C7554b c7554b2 = c7538m.f27706f;
            AbstractC5868k.m23673e(view, "v");
            c7554b2.m28945f(view, 1.1f);
            c7531f.itemView.setTag(Boolean.FALSE);
        }
        InterfaceC5664p interfaceC5664p = c7538m.f27708h;
        if (interfaceC5664p != null) {
            interfaceC5664p.mo2391h(Integer.valueOf(i10), Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, C7550y c7550y) {
        List<PosterList> list;
        List<PosterList> list2;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(c7550y, "bean");
        final int layoutPosition = c7531f.getLayoutPosition();
        int i10 = R$id.mAflPostWrapper;
        FrameLayout frameLayout = (FrameLayout) c7531f.m28863b(i10);
        ImageView imageView = (ImageView) c7531f.m28863b(R$id.mIvPost);
        TextView textView = (TextView) c7531f.m28863b(R$id.mTvFlag);
        String str = null;
        if (c7550y.m28930c()) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(AbstractC7786b.m30166j(40), 0, AbstractC7786b.m30166j(40), 0);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(AbstractC7786b.m30166j(242), AbstractC7786b.m30166j(StatusLine.HTTP_PERM_REDIRECT)));
            Drawable m27111a = AbstractC7026c.m27111a(m28850h(), R$drawable.live_channel_default_icon);
            C7594o0 c7594o0 = C7594o0.f27942a;
            Channel m28928a = c7550y.m28928a();
            if (m28928a != null) {
                list2 = m28928a.getPosterList();
            } else {
                list2 = null;
            }
            C7594o0.a aVar = C7594o0.a.Icon;
            Context m28850h = m28850h();
            AbstractC5868k.m23673e(m27111a, "placeholder");
            c7594o0.m29224o(list2, aVar, imageView, m28850h, m27111a, 0);
            int i11 = R$id.mTvTitle;
            Channel m28928a2 = c7550y.m28928a();
            if (m28928a2 != null) {
                str = m28928a2.getName();
            }
            c7531f.m28865d(i11, str);
            StringBuilder sb2 = new StringBuilder();
            CharSequence text = textView.getText();
            AbstractC5868k.m23673e(text, "mTvFlag.text");
            sb2.append(text.subSequence(0, 1).toString());
            CharSequence text2 = textView.getText();
            AbstractC5868k.m23673e(text2, "mTvFlag.text");
            String obj = text2.subSequence(1, text2.length()).toString();
            Locale locale = Locale.US;
            AbstractC5868k.m23673e(locale, "US");
            String lowerCase = obj.toLowerCase(locale);
            AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            sb2.append(lowerCase);
            textView.setText(sb2.toString());
            textView.setVisibility(0);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(0, 0, 0, 0);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(AbstractC7786b.m30166j(210), AbstractC7786b.m30166j(StatusLine.HTTP_PERM_REDIRECT)));
            Drawable m27111a2 = AbstractC7026c.m27111a(m28850h(), R$drawable.bg_placehoder);
            C7594o0 c7594o02 = C7594o0.f27942a;
            AssetList m28929b = c7550y.m28929b();
            if (m28929b != null) {
                list = m28929b.getPosterList();
            } else {
                list = null;
            }
            C7594o0.a aVar2 = C7594o0.a.Icon;
            Context m28850h2 = m28850h();
            AbstractC5868k.m23673e(m27111a2, "placeholder");
            c7594o02.m29224o(list, aVar2, imageView, m28850h2, m27111a2, 0);
            int i12 = R$id.mTvTitle;
            AssetList m28929b2 = c7550y.m28929b();
            if (m28929b2 != null) {
                str = m28929b2.getName();
            }
            c7531f.m28865d(i12, str);
            textView.setVisibility(8);
        }
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: x9.l
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C7538m.m28890r(C7538m.this, c7531f, layoutPosition, view, z10);
            }
        });
        c7531f.m28864c(R$id.mAllWrapper, new a(c7550y, this));
    }

    /* renamed from: s */
    public final void m28892s(C7550y c7550y) {
        String str = null;
        AbstractC5868k.m23674f(c7550y, "bean");
        C7709c m29787d = C7709c.m29787d();
        Channel m28928a = c7550y.m28928a();
        if (m28928a != null) {
            str = m28928a.getChannelCode();
        } else {
            str = null;
        }
        m29787d.m29801m(new PlayVoiceSearchLiveEvent(str));
    }

    /* renamed from: t */
    public final void m28893t(Context context, C7550y c7550y) {
        String str = null;
        String type = null;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(c7550y, "bean");
        C7709c.m29787d().m29801m(new FinishVodDetailEvent());
        C6448c m22843d = C5634i.m22843d("http://module_vod/VodDetailsActivity");
        AssetList m28929b = c7550y.m28929b();
        String str2 = "";
        if (m28929b == null || (str = m28929b.getContentId()) == null) {
            str = "";
        }
        C6448c m25257w = m22843d.m25257w("extra_content_id", str).m25257w("extra_play_type", "1");
        AssetList m28929b2 = c7550y.m28929b();
        if (m28929b2 != null && (type = m28929b2.getType()) != null) {
            str2 = type;
        }
        C6448c.m25240q(m25257w.m25257w("extra_type", str2).m25253s("extra_restrict", false).m25257w("extra_umeng_event_key", C7589m1.c.f27901a.m29168f()).m25253s("extra_from_router", true).m25254t(262144), context, null, 2, null);
        InterfaceC5642a interfaceC5642a = this.f27709i;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
    }

    /* renamed from: u */
    public final void m28894u(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "listener");
        this.f27709i = interfaceC5642a;
    }

    /* renamed from: v */
    public final void m28895v(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "listener");
        this.f27708h = interfaceC5664p;
    }
}
