package com.vod.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import be.C1328x;
import cc.C1466m0;
import com.advertlib.bean.AdInfo;
import com.request.result.ChildColumn;
import com.request.result.ContentList;
import com.request.result.PosterList;
import com.request.result.RecommendList;
import com.titans.entity.CdnType;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$drawable;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$mipmap;
import com.vod.R$styleable;
import com.vod.view.PosterView;
import com.youth.banner.Banner;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.view.BannerViewPager;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5876s;
import org.android.agoo.message.MessageService;
import p035c3.AbstractC1350e;
import p193ja.C5044a;
import p201k2.AbstractC5091h;
import p277p0.C6156m;
import p277p0.C6160q;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p348u2.AbstractC7029f;
import p372vd.C7258a;
import p387wd.C7394a;
import p400xa.C7554b;
import p400xa.C7594o0;

/* loaded from: classes3.dex */
public final class PosterView extends FrameLayout implements OnBannerListener {

    /* renamed from: l */
    public static final C3875a f17456l = new C3875a(null);

    /* renamed from: a */
    private boolean f17457a;

    /* renamed from: b */
    private int f17458b;

    /* renamed from: c */
    private Context f17459c;

    /* renamed from: d */
    private RecommendList f17460d;

    /* renamed from: e */
    private ContentList f17461e;

    /* renamed from: f */
    private int f17462f;

    /* renamed from: g */
    private C7554b f17463g;

    /* renamed from: h */
    private boolean f17464h;

    /* renamed from: i */
    private boolean f17465i;

    /* renamed from: j */
    private final C7394a f17466j;

    /* renamed from: k */
    public Map f17467k;

    /* renamed from: com.vod.view.PosterView$a */
    /* loaded from: classes3.dex */
    public static final class C3875a {
        private C3875a() {
        }

        public /* synthetic */ C3875a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final ContentList m16619a(AdInfo adInfo, String str) {
            AbstractC5868k.m23674f(adInfo, "adInfo");
            AbstractC5868k.m23674f(str, "adType");
            ArrayList arrayList = new ArrayList();
            String m29227b = C7594o0.a.Banner.m29227b();
            String url = adInfo.getUrl();
            if (url == null) {
                url = "";
            }
            arrayList.add(new PosterList("", "", m29227b, url, ""));
            return new ContentList(adInfo.getAd_id(), "", adInfo.getAd_name(), CdnType.DIGITAL_TYPE_PCDN, adInfo.getAction(), str, adInfo.getAction_type(), arrayList, null, null, null, null, null, null, 16128, null);
        }

        /* renamed from: b */
        public final AdInfo m16620b(ContentList contentList) {
            AbstractC5868k.m23674f(contentList, "contentList");
            String contentId = contentList.getContentId();
            List<PosterList> posterList = contentList.getPosterList();
            AbstractC5868k.m23671c(posterList);
            return new AdInfo(contentId, "picture", posterList.get(0).getFileUrl(), contentList.getViewPoint(), contentList.getRemark(), contentList.getUrl(), 1, 0, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.view.PosterView$b */
    /* loaded from: classes3.dex */
    public static final class C3876b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ ArrayList f17469b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f17470c;

        /* renamed from: d */
        final /* synthetic */ C5876s f17471d;

        /* renamed from: com.vod.view.PosterView$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements ViewPager.InterfaceC0866j {

            /* renamed from: a */
            final /* synthetic */ PosterView f17472a;

            a(PosterView posterView) {
                this.f17472a = posterView;
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0866j
            public void onPageScrollStateChanged(int i10) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0866j
            public void onPageScrolled(int i10, float f10, int i11) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0866j
            public void onPageSelected(int i10) {
                this.f17472a.m16615o(i10 - 1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3876b(ArrayList arrayList, ArrayList arrayList2, C5876s c5876s) {
            super(1);
            this.f17469b = arrayList;
            this.f17470c = arrayList2;
            this.f17471d = c5876s;
        }

        /* renamed from: a */
        public final void m16621a(Integer num) {
            PosterView.this.setBackgroundDrawable(null);
            if (PosterView.this.hasFocus() && !PosterView.this.f17457a && PosterView.this.f17462f != 4) {
                ((TextView) PosterView.this.m16616c(R$id.mTextTitle)).setVisibility(0);
                PosterView posterView = PosterView.this;
                int i10 = R$id.mShadowImg;
                ((ImageView) posterView.m16616c(i10)).setVisibility(0);
                ((ImageView) PosterView.this.m16616c(i10)).setImageResource(R$drawable.shape_bg_poster_title);
            }
            PosterView.this.m16615o(0);
            PosterView posterView2 = PosterView.this;
            int i11 = R$id.mBanner;
            Banner banner = (Banner) posterView2.m16616c(i11);
            AbstractC5868k.m23671c(banner);
            banner.setImages(this.f17469b).setBannerTitles(this.f17470c).setBannerAnimation(Transformer.Accordion).setBannerStyle(1).setIndicatorGravity(7).setImageLoader(new C7258a()).setDelayTime(this.f17471d.f23410a).setOnBannerListener(PosterView.this).start();
            Banner banner2 = (Banner) PosterView.this.m16616c(i11);
            AbstractC5868k.m23671c(banner2);
            ((BannerViewPager) banner2.findViewById(R$id.bannerViewPager)).addOnPageChangeListener(new a(PosterView.this));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16621a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PosterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17467k = new LinkedHashMap();
        this.f17463g = new C7554b();
        this.f17466j = new C7394a();
        m16609i(context, attributeSet, 0);
    }

    /* renamed from: i */
    private final void m16609i(Context context, AttributeSet attributeSet, int i10) {
        this.f17459c = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f17067F0, i10, 0);
        AbstractC5868k.m23673e(obtainStyledAttributes, "context.obtainStyledAttr…oItemPoster, defStyle, 0)");
        this.f17464h = obtainStyledAttributes.getBoolean(R$styleable.MetroItemPoster_isLeft, false);
        this.f17465i = obtainStyledAttributes.getBoolean(R$styleable.MetroItemPoster_isRight, false);
        this.f17458b = obtainStyledAttributes.getInt(R$styleable.MetroItemPoster_posterType, 0);
        obtainStyledAttributes.recycle();
        setBackgroundResource(R$drawable.bg_placehoder_vertical);
        setDescendantFocusability(393216);
        setFocusable(true);
    }

    /* renamed from: j */
    private final void m16610j() {
        int i10 = R$id.mTextTitle;
        ViewGroup.LayoutParams layoutParams = ((TextView) m16616c(i10)).getLayoutParams();
        AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -2;
        layoutParams2.height = AutoSizeUtils.dp2px(getContext(), 30.0f);
        ((TextView) m16616c(i10)).setTextSize(0, AutoSizeUtils.sp2px(getContext(), 19.0f));
        ((TextView) m16616c(i10)).setGravity(17);
        ((TextView) m16616c(i10)).setLayoutParams(layoutParams2);
        ((TextView) m16616c(i10)).setIncludeFontPadding(false);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, 0, 0, 0);
        layoutParams3.gravity = 51;
        int i11 = R$id.mRlTitle;
        ((LinearLayout) m16616c(i11)).setLayoutParams(layoutParams3);
        ((LinearLayout) m16616c(i11)).setBackgroundResource(R$drawable.bg_recommend_column);
        this.f17457a = true;
        ((ImageView) m16616c(R$id.mShadowImg)).setVisibility(8);
    }

    /* renamed from: k */
    private final void m16611k(final RecommendList recommendList) {
        if (getChildCount() <= 0) {
            LayoutInflater.from(getContext()).inflate(R$layout.layout_poster_banner, this);
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        C5876s c5876s = new C5876s();
        int changeSeconds = recommendList.getChangeSeconds() * 1000;
        c5876s.f23410a = changeSeconds;
        if (changeSeconds <= 0) {
            c5876s.f23410a = 5000;
        }
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: wd.u
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                PosterView.m16612l(RecommendList.this, arrayList2, arrayList, observableEmitter);
            }
        }).compose(AbstractC7029f.m27120a());
        final C3876b c3876b = new C3876b(arrayList, arrayList2, c5876s);
        compose.subscribe(new Consumer() { // from class: wd.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PosterView.m16613m(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m16612l(RecommendList recommendList, ArrayList arrayList, ArrayList arrayList2, ObservableEmitter observableEmitter) {
        String m6119a;
        AbstractC5868k.m23674f(recommendList, "$info");
        AbstractC5868k.m23674f(arrayList, "$title");
        AbstractC5868k.m23674f(arrayList2, "$list");
        AbstractC5868k.m23674f(observableEmitter, "it");
        List<ContentList> contentList = recommendList.getContentList();
        if (contentList != null) {
            for (ContentList contentList2 : contentList) {
                arrayList.add(AbstractC5091h.m20660c(contentList2.getName(), contentList2.getColumnAlias()));
                List<PosterList> posterList = contentList2.getPosterList();
                String str = "";
                if (posterList != null) {
                    for (PosterList posterList2 : posterList) {
                        if (AbstractC5868k.m23669a(posterList2.getFileType(), "banner")) {
                            str = posterList2.getFileUrl();
                        }
                    }
                }
                if (AbstractC5868k.m23669a(contentList2.getType(), CdnType.DIGITAL_TYPE_PCDN)) {
                    arrayList2.add(str);
                } else {
                    if (str != null && (m6119a = AbstractC1350e.m6119a(str, "key_poster")) != null) {
                        str = m6119a;
                    }
                    arrayList2.add(str);
                }
            }
        }
        observableEmitter.onNext(0);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m16613m(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: n */
    private final void m16614n(List list) {
        String str;
        boolean z10;
        ChildColumn childColumn = null;
        if (getChildCount() <= 0) {
            LayoutInflater.from(getContext()).inflate(R$layout.view_poster, this);
            setBackgroundDrawable(null);
        }
        ContentList contentList = (ContentList) list.get(0);
        this.f17461e = contentList;
        if (contentList != null) {
            this.f17462f = Integer.parseInt(contentList.getType());
            Drawable m27111a = AbstractC7026c.m27111a(this.f17459c, com.module.R$drawable.bg_placehoder_vertical);
            C7594o0 c7594o0 = C7594o0.f27942a;
            String m29220i = c7594o0.m29220i(contentList.getPosterList(), C7594o0.a.Banner);
            ImageView imageView = (ImageView) m16616c(R$id.mImgPoster);
            AbstractC5868k.m23673e(imageView, "mImgPoster");
            Context context = this.f17459c;
            AbstractC5868k.m23671c(context);
            AbstractC5868k.m23673e(m27111a, "placeholder");
            ContentList contentList2 = this.f17461e;
            if (contentList2 == null || (str = contentList2.getType()) == null) {
                str = MessageService.MSG_DB_READY_REPORT;
            }
            C7594o0.m29204m(c7594o0, m29220i, imageView, context, m27111a, 0, str, 16, null);
            int i10 = R$id.mTextTitle;
            ((TextView) m16616c(i10)).setText(AbstractC5091h.m20660c(contentList.getName(), contentList.getColumnAlias()));
            int i11 = this.f17462f;
            if (i11 == 3) {
                this.f17457a = false;
                ((TextView) m16616c(i10)).setVisibility(0);
                if (AbstractC5868k.m23669a(contentList.getSpecialFlag(), "1")) {
                    Object m20485a = C5044a.f20862a.m20485a("Special_root");
                    if (m20485a instanceof ChildColumn) {
                        childColumn = (ChildColumn) m20485a;
                    }
                    if (childColumn != null && Integer.parseInt(contentList.getContentId()) == childColumn.getId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ((ImageView) m16616c(R$id.mImgSpecialTag)).setVisibility(8);
                        m16610j();
                        return;
                    }
                    if (AbstractC5091h.m20663f()) {
                        ((ImageView) m16616c(R$id.mImgSpecialTag)).setImageResource(R$mipmap.vod_icon_tag_special_pt);
                    } else {
                        ((ImageView) m16616c(R$id.mImgSpecialTag)).setImageResource(R$mipmap.vod_icon_tag_special);
                    }
                    ((ImageView) m16616c(R$id.mImgSpecialTag)).setVisibility(0);
                    int i12 = R$id.mShadowImg;
                    ((ImageView) m16616c(i12)).setVisibility(0);
                    ((ImageView) m16616c(i12)).setImageResource(R$drawable.shape_bg_poster_title);
                    return;
                }
                ((ImageView) m16616c(R$id.mImgSpecialTag)).setVisibility(8);
                m16610j();
                return;
            }
            if (i11 == 5) {
                C6156m c6156m = C6156m.f24180a;
                Context context2 = getContext();
                AbstractC5868k.m23673e(context2, C3384f.f14563X);
                String description = contentList.getDescription();
                String str2 = "";
                if (description == null) {
                    description = "";
                }
                c6156m.m24572g0(context2, description, contentList.getContentId());
                C6160q c6160q = C6160q.f24221a;
                Context context3 = getContext();
                AbstractC5868k.m23673e(context3, C3384f.f14563X);
                String name = contentList.getName();
                String description2 = contentList.getDescription();
                if (description2 != null) {
                    str2 = description2;
                }
                c6160q.m24600i(context3, name, str2, f17456l.m16620b(contentList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m16615o(int i10) {
        int i11;
        ContentList contentList;
        List<ContentList> contentList2;
        List<ContentList> contentList3;
        RecommendList recommendList = this.f17460d;
        int i12 = 0;
        if (recommendList != null && (contentList3 = recommendList.getContentList()) != null) {
            i11 = contentList3.size();
        } else {
            i11 = 0;
        }
        if (i11 > i10 && i10 >= 0) {
            RecommendList recommendList2 = this.f17460d;
            if (recommendList2 != null && (contentList2 = recommendList2.getContentList()) != null) {
                contentList = contentList2.get(i10);
            } else {
                contentList = null;
            }
            if (contentList != null) {
                int i13 = R$id.mTextTitle;
                ((TextView) m16616c(i13)).setText(AbstractC5091h.m20660c(contentList.getName(), contentList.getColumnAlias()));
                int parseInt = Integer.parseInt(contentList.getType());
                this.f17462f = parseInt;
                if (parseInt == 3) {
                    ((TextView) m16616c(i13)).setVisibility(0);
                    int i14 = R$id.mShadowImg;
                    ((ImageView) m16616c(i14)).setVisibility(0);
                    ((ImageView) m16616c(i14)).setImageResource(R$drawable.shape_bg_poster_title);
                    this.f17457a = false;
                } else if (parseInt == 5) {
                    C6156m c6156m = C6156m.f24180a;
                    Context context = getContext();
                    AbstractC5868k.m23673e(context, C3384f.f14563X);
                    String description = contentList.getDescription();
                    String str = "";
                    if (description == null) {
                        description = "";
                    }
                    c6156m.m24572g0(context, description, contentList.getContentId());
                    C6160q c6160q = C6160q.f24221a;
                    Context context2 = getContext();
                    AbstractC5868k.m23673e(context2, C3384f.f14563X);
                    String m6888w = C1466m0.f5627a.m6888w();
                    String description2 = contentList.getDescription();
                    if (description2 != null) {
                        str = description2;
                    }
                    c6160q.m24600i(context2, m6888w, str, f17456l.m16620b(contentList));
                }
                int i15 = R$id.mImgSpecialTag;
                ImageView imageView = (ImageView) m16616c(i15);
                if (AbstractC5868k.m23669a(contentList.getSpecialFlag(), "1")) {
                    if (AbstractC5091h.m20663f()) {
                        ((ImageView) m16616c(i15)).setImageResource(R$mipmap.vod_icon_tag_special_pt);
                    } else {
                        ((ImageView) m16616c(i15)).setImageResource(R$mipmap.vod_icon_tag_special);
                    }
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
            }
        }
    }

    @Override // com.youth.banner.listener.OnBannerListener
    public void OnBannerClick(int i10) {
        performClick();
    }

    /* renamed from: c */
    public View m16616c(int i10) {
        Map map = this.f17467k;
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

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (isFocused()) {
            this.f17466j.draw(canvas);
        }
    }

    /* renamed from: g */
    public final void m16617g(boolean z10) {
        if (z10) {
            Banner banner = (Banner) m16616c(R$id.mBanner);
            if (banner != null) {
                banner.startAutoPlay();
                return;
            }
            return;
        }
        Banner banner2 = (Banner) m16616c(R$id.mBanner);
        if (banner2 != null) {
            banner2.stopAutoPlay();
        }
    }

    public final ContentList getContentList() {
        int i10;
        RecommendList recommendList;
        List<ContentList> contentList;
        List<ContentList> contentList2;
        BannerViewPager bannerViewPager;
        int i11 = R$id.mBanner;
        if (((Banner) m16616c(i11)) != null) {
            Banner banner = (Banner) m16616c(i11);
            if (banner != null && (bannerViewPager = (BannerViewPager) banner.findViewById(R$id.bannerViewPager)) != null) {
                i10 = bannerViewPager.getCurrentItem();
            } else {
                i10 = 1;
            }
            int i12 = i10 - 1;
            int i13 = 0;
            if (i12 < 0) {
                i12 = 0;
            }
            RecommendList recommendList2 = this.f17460d;
            if (recommendList2 != null && (contentList2 = recommendList2.getContentList()) != null) {
                i13 = contentList2.size();
            }
            if (i13 <= i12 || (recommendList = this.f17460d) == null || (contentList = recommendList.getContentList()) == null) {
                return null;
            }
            return contentList.get(i12);
        }
        return this.f17461e;
    }

    /* renamed from: h */
    public final void m16618h() {
        setBackgroundResource(R$drawable.bg_placehoder_vertical);
        if (getChildCount() > 0) {
            removeAllViews();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11 = R$id.mTextTitle;
        TextView textView = (TextView) m16616c(i11);
        if (textView != null) {
            textView.setSelected(z10);
        }
        if (z10) {
            if (!this.f17457a && this.f17462f != 4) {
                TextView textView2 = (TextView) m16616c(i11);
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                int i12 = R$id.mShadowImg;
                ImageView imageView = (ImageView) m16616c(i12);
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView2 = (ImageView) m16616c(i12);
                if (imageView2 != null) {
                    imageView2.setImageResource(R$drawable.shape_bg_poster_title);
                }
            }
            bringToFront();
            this.f17463g.m28943c(this, 1.05f);
            Banner banner = (Banner) m16616c(R$id.mBanner);
            if (banner != null) {
                banner.stopAutoPlay();
            }
        } else {
            if (this.f17462f != 3) {
                TextView textView3 = (TextView) m16616c(i11);
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
                ImageView imageView3 = (ImageView) m16616c(R$id.mShadowImg);
                if (imageView3 != null) {
                    imageView3.setVisibility(4);
                }
            }
            this.f17463g.m28945f(this, 1.05f);
            Banner banner2 = (Banner) m16616c(R$id.mBanner);
            if (banner2 != null) {
                banner2.startAutoPlay();
            }
        }
        super.onFocusChanged(z10, i10, rect);
    }

    @Override // android.view.View
    public void onHoverChanged(boolean z10) {
        int i10 = R$id.mBanner;
        if (((Banner) m16616c(i10)) != null) {
            return;
        }
        int i11 = R$id.mTextTitle;
        TextView textView = (TextView) m16616c(i11);
        if (textView != null) {
            textView.setSelected(z10);
        }
        if (z10) {
            if (!this.f17457a && this.f17462f != 4) {
                TextView textView2 = (TextView) m16616c(i11);
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                int i12 = R$id.mShadowImg;
                ImageView imageView = (ImageView) m16616c(i12);
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView2 = (ImageView) m16616c(i12);
                if (imageView2 != null) {
                    imageView2.setImageResource(R$drawable.shape_bg_poster_title);
                }
            }
            bringToFront();
            C7554b.m28939e(this.f17463g, this, 0.0f, 2, null);
            Banner banner = (Banner) m16616c(i10);
            if (banner != null) {
                banner.stopAutoPlay();
            }
        } else {
            if (this.f17462f != 3 && this.f17458b == 0) {
                TextView textView3 = (TextView) m16616c(i11);
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
                ImageView imageView3 = (ImageView) m16616c(R$id.mShadowImg);
                if (imageView3 != null) {
                    imageView3.setVisibility(4);
                }
            }
            C7554b.m28940h(this.f17463g, this, 0.0f, 2, null);
            Banner banner2 = (Banner) m16616c(i10);
            if (banner2 != null) {
                banner2.startAutoPlay();
            }
        }
        super.onHoverChanged(z10);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11 = false;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (i10 == 21 ? !(!this.f17464h || keyEvent.getRepeatCount() <= 0) : !(i10 != 22 || !this.f17465i || keyEvent.getRepeatCount() <= 0))) {
            z11 = true;
        }
        if (z11) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f17466j.setBounds(0, 0, i10, i11);
    }

    public final void setRcmbData(RecommendList recommendList) {
        AbstractC5868k.m23674f(recommendList, "info");
        if (AbstractC6567a.m25635e(recommendList.getContentList())) {
            return;
        }
        this.f17460d = recommendList;
        List<ContentList> contentList = recommendList.getContentList();
        AbstractC5868k.m23671c(contentList);
        if (contentList.size() == 1) {
            List<ContentList> contentList2 = recommendList.getContentList();
            AbstractC5868k.m23671c(contentList2);
            m16614n(contentList2);
            return;
        }
        m16611k(recommendList);
    }
}
