package com.vod.view;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.module.p070ui.activity.WebActivity;
import com.open.leanback.widget.HorizontalGridView;
import com.request.result.AssetData;
import com.request.result.SameSeasonSeriesBean;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.view.VodDetailLeftPanel;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1500l;
import p153h2.AbstractC4509b;
import p170i2.C4842a;
import p198k.C5076a;
import p212kd.C5153a2;
import p231m2.AbstractC5584b;
import p317rb.AbstractC6567a;
import p400xa.AbstractC7555b0;
import p400xa.C7619y;
import td.C6934b;

/* loaded from: classes3.dex */
public final class VodDetailLeftPanel extends AutoLinearLayout {

    /* renamed from: m */
    public static final C3883a f17501m = new C3883a(null);

    /* renamed from: a */
    private boolean f17502a;

    /* renamed from: b */
    private C5153a2 f17503b;

    /* renamed from: c */
    private InterfaceC5664p f17504c;

    /* renamed from: d */
    private C5153a2.a f17505d;

    /* renamed from: e */
    private AssetData f17506e;

    /* renamed from: f */
    private final InterfaceC1312h f17507f;

    /* renamed from: g */
    private ArrayList f17508g;

    /* renamed from: h */
    private AbstractC0729o f17509h;

    /* renamed from: i */
    private String f17510i;

    /* renamed from: j */
    private Boolean f17511j;

    /* renamed from: k */
    private String f17512k;

    /* renamed from: l */
    public Map f17513l;

    /* renamed from: com.vod.view.VodDetailLeftPanel$a */
    /* loaded from: classes3.dex */
    public static final class C3883a {
        private C3883a() {
        }

        public /* synthetic */ C3883a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.vod.view.VodDetailLeftPanel$b */
    /* loaded from: classes3.dex */
    static final class C3884b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C3884b f17514a = new C3884b();

        C3884b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6934b invoke() {
            return new C6934b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.view.VodDetailLeftPanel$c */
    /* loaded from: classes3.dex */
    public static final class C3885c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ AssetData f17515a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3885c(AssetData assetData) {
            super(1);
            this.f17515a = assetData;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "intent");
            intent.putExtra("extra_pg", true);
            Intent putExtra = intent.putExtra("extra_url", this.f17515a.getAwardsUrl());
            AbstractC5868k.m23673e(putExtra, "intent.putExtra(WebActiv…URL, assetData.awardsUrl)");
            return putExtra;
        }
    }

    /* renamed from: com.vod.view.VodDetailLeftPanel$d */
    /* loaded from: classes3.dex */
    public static final class C3886d implements C5153a2.a {
        C3886d() {
        }

        @Override // p212kd.C5153a2.a
        /* renamed from: a */
        public void mo16507a(String str, int i10) {
            AbstractC5868k.m23674f(str, "genre");
            C5153a2.a aVar = VodDetailLeftPanel.this.f17505d;
            if (aVar != null) {
                aVar.mo16507a(str, i10);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VodDetailLeftPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    private final C6934b getMIntroductionDialog() {
        return (C6934b) this.f17507f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m16667j(VodDetailLeftPanel vodDetailLeftPanel, View view, int i10, ViewGroup viewGroup) {
        AbstractC5868k.m23674f(vodDetailLeftPanel, "this$0");
        AbstractC5868k.m23674f(view, "view");
        ViewGroup viewGroup2 = (ViewGroup) view;
        int childCount = viewGroup2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup2.getChildAt(0);
            viewGroup2.removeViewAt(0);
            vodDetailLeftPanel.addView(childAt);
        }
        vodDetailLeftPanel.m16673r();
        vodDetailLeftPanel.f17502a = true;
        AssetData assetData = vodDetailLeftPanel.f17506e;
        if (assetData != null) {
            vodDetailLeftPanel.m16682p(assetData, vodDetailLeftPanel.f17510i);
            vodDetailLeftPanel.setNewSelect(assetData);
        }
        Boolean bool = vodDetailLeftPanel.f17511j;
        if (bool != null) {
            vodDetailLeftPanel.setChildFocusable(bool.booleanValue());
        }
    }

    /* renamed from: l */
    private final String m16669l(String str) {
        if (str == null) {
            return m16670m(R$string.unknown);
        }
        return str;
    }

    /* renamed from: m */
    private final String m16670m(int i10) {
        String string = getContext().getString(i10);
        AbstractC5868k.m23673e(string, "context.getString(resId)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m16671o(VodDetailLeftPanel vodDetailLeftPanel, AssetData assetData, View view) {
        AbstractC5868k.m23674f(vodDetailLeftPanel, "this$0");
        AbstractC5868k.m23674f(assetData, "$assetData");
        Context context = vodDetailLeftPanel.getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        if (!AbstractC7555b0.m28949c(context)) {
            C7619y c7619y = C7619y.f28056a;
            Context context2 = vodDetailLeftPanel.getContext();
            AbstractC5868k.m23673e(context2, C3384f.f14563X);
            C7619y.m29367d(c7619y, context2, WebActivity.class, null, new C3885c(assetData), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m16672q(VodDetailLeftPanel vodDetailLeftPanel, AssetData assetData) {
        AbstractC5868k.m23674f(vodDetailLeftPanel, "this$0");
        AbstractC5868k.m23674f(assetData, "$assetData");
        vodDetailLeftPanel.setIntroductionInfo(assetData);
    }

    /* renamed from: r */
    private final void m16673r() {
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        this.f17503b = new C5153a2(context);
        ((HorizontalGridView) m16680i(R$id.mGridGenre)).setAdapter(this.f17503b);
        ((TextView) m16680i(R$id.mTextDirector)).setOnClickListener(new View.OnClickListener() { // from class: wd.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailLeftPanel.m16674s(VodDetailLeftPanel.this, view);
            }
        });
        ((TextView) m16680i(R$id.mTextActor)).setOnClickListener(new View.OnClickListener() { // from class: wd.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailLeftPanel.m16675t(VodDetailLeftPanel.this, view);
            }
        });
        int i10 = R$id.mTextIntroduction;
        ((TextView) m16680i(i10)).setOnClickListener(new View.OnClickListener() { // from class: wd.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailLeftPanel.m16676u(VodDetailLeftPanel.this, view);
            }
        });
        ((TextView) m16680i(R$id.tvMore)).setOnClickListener(new View.OnClickListener() { // from class: wd.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VodDetailLeftPanel.m16677v(VodDetailLeftPanel.this, view);
            }
        });
        ((TextView) m16680i(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: wd.g0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                VodDetailLeftPanel.m16678w(VodDetailLeftPanel.this, view, z10);
            }
        });
        C5153a2 c5153a2 = this.f17503b;
        if (c5153a2 != null) {
            c5153a2.m20842h(new C3886d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m16674s(VodDetailLeftPanel vodDetailLeftPanel, View view) {
        AbstractC5868k.m23674f(vodDetailLeftPanel, "this$0");
        InterfaceC5664p interfaceC5664p = vodDetailLeftPanel.f17504c;
        if (interfaceC5664p != null) {
            AbstractC5868k.m23673e(view, "it");
            interfaceC5664p.mo2391h(view, 1);
        }
    }

    private final void set4K(AssetData assetData) {
        if (AbstractC5868k.m23669a(assetData.getContentType(), "3") && C4842a.f20329a.m19920a().m19932I()) {
            ((ImageView) m16680i(R$id.mIv4k)).setVisibility(0);
        } else {
            ((ImageView) m16680i(R$id.mIv4k)).setVisibility(8);
        }
    }

    private final void setContentLevel(final AssetData assetData) {
        if (!TextUtils.isEmpty(assetData.getContentTag())) {
            int i10 = R$id.mTvContentTag;
            ((TextView) m16680i(i10)).setVisibility(0);
            ((TextView) m16680i(i10)).setText(assetData.getContentTag());
        } else {
            ((TextView) m16680i(R$id.mTvContentTag)).setVisibility(8);
        }
        if (!TextUtils.isEmpty(assetData.getAwardsUrl())) {
            SpannableString spannableString = new SpannableString(m16670m(R$string.detail_awards_));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            int i11 = R$id.tvAwards;
            ((TextView) m16680i(i11)).setVisibility(0);
            ((TextView) m16680i(i11)).setFocusable(true);
            ((TextView) m16680i(i11)).setText(spannableString);
            ((TextView) m16680i(i11)).setOnClickListener(new View.OnClickListener() { // from class: wd.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VodDetailLeftPanel.m16671o(VodDetailLeftPanel.this, assetData, view);
                }
            });
            return;
        }
        ((TextView) m16680i(R$id.tvAwards)).setVisibility(8);
    }

    private final void setIntroductionInfo(AssetData assetData) {
        String str;
        int i10;
        if (AbstractC6567a.m25634d(assetData.getDescriptionCompt())) {
            str = "\t\t\t\t\t\t\t" + m16670m(R$string.detail_no_data);
        } else {
            str = "\t\t\t\t\t\t\t" + m16669l(assetData.getDescriptionCompt());
        }
        int i11 = R$id.mTextIntroduction;
        ((TextView) m16680i(i11)).setText(str);
        if (AbstractC6567a.m25634d(assetData.getDescriptionCompt())) {
            ((TextView) m16680i(i11)).setFocusable(false);
            ((TextView) m16680i(i11)).setTextColor(getResources().getColor(R$color.color_detail_font_des));
        }
        Layout layout = ((TextView) m16680i(i11)).getLayout();
        if (layout != null) {
            i10 = layout.getLineCount();
        } else {
            i10 = 0;
        }
        if (i10 > 0 && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
            int i12 = R$id.tvMore;
            ((TextView) m16680i(i12)).setVisibility(0);
            int lineEnd = new StaticLayout(str, 0, str.length(), ((TextView) m16680i(i11)).getPaint(), ((TextView) m16680i(i11)).getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, false).getLineEnd(1);
            if (lineEnd > 145) {
                lineEnd = 145;
            }
            TextView textView = (TextView) m16680i(i11);
            AbstractC5868k.m23673e(textView, "mTextIntroduction");
            m16679x(textView, str, lineEnd - 6, ((TextView) m16680i(i12)).getText().toString());
            ((TextView) m16680i(i11)).setFocusable(false);
            return;
        }
        ((TextView) m16680i(i11)).setFocusable(true);
        ((TextView) m16680i(R$id.tvMore)).setVisibility(4);
    }

    private final void setScoreInfo(AssetData assetData) {
        boolean z10 = true;
        if (assetData.getScore() > 0.0f && assetData.getScore() < 10.0f) {
            int i10 = R$id.mTextScore;
            ((TextView) m16680i(i10)).setVisibility(0);
            try {
                C5881x c5881x = C5881x.f23415a;
                String format = String.format(m16670m(R$string.vod_detail_score), Arrays.copyOf(new Object[]{Integer.valueOf(((int) assetData.getScore()) % 10), Integer.valueOf(((int) (assetData.getScore() * 10)) % 10)}, 2));
                AbstractC5868k.m23673e(format, "format(format, *args)");
                ((TextView) m16680i(i10)).setText(Html.fromHtml(format));
                return;
            } catch (Exception e10) {
                AbstractC5584b.m22679a(e10, "格式化字符串报错" + assetData.getScore());
                return;
            }
        }
        if (assetData.getScore() != 10.0f) {
            z10 = false;
        }
        if (z10) {
            ((TextView) m16680i(R$id.mTextScore)).setText(String.valueOf((int) assetData.getScore()));
        } else {
            ((TextView) m16680i(R$id.mTextScore)).setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m16675t(VodDetailLeftPanel vodDetailLeftPanel, View view) {
        AbstractC5868k.m23674f(vodDetailLeftPanel, "this$0");
        InterfaceC5664p interfaceC5664p = vodDetailLeftPanel.f17504c;
        if (interfaceC5664p != null) {
            AbstractC5868k.m23673e(view, "it");
            interfaceC5664p.mo2391h(view, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m16676u(VodDetailLeftPanel vodDetailLeftPanel, View view) {
        boolean z10;
        AbstractC5868k.m23674f(vodDetailLeftPanel, "this$0");
        Dialog m3280r9 = vodDetailLeftPanel.getMIntroductionDialog().m3280r9();
        boolean z11 = true;
        if (m3280r9 != null && m3280r9.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && vodDetailLeftPanel.f17509h != null && !vodDetailLeftPanel.getMIntroductionDialog().m3190s7()) {
            vodDetailLeftPanel.getMIntroductionDialog().m26938I9(vodDetailLeftPanel.f17506e);
            AbstractC0729o abstractC0729o = vodDetailLeftPanel.f17509h;
            if (abstractC0729o == null || !abstractC0729o.m3477E0()) {
                z11 = false;
            }
            if (!z11) {
                C6934b mIntroductionDialog = vodDetailLeftPanel.getMIntroductionDialog();
                AbstractC0729o abstractC0729o2 = vodDetailLeftPanel.f17509h;
                AbstractC5868k.m23671c(abstractC0729o2);
                mIntroductionDialog.mo3277E9(abstractC0729o2, "IntroductionDialog");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m16677v(VodDetailLeftPanel vodDetailLeftPanel, View view) {
        boolean z10;
        AbstractC5868k.m23674f(vodDetailLeftPanel, "this$0");
        Dialog m3280r9 = vodDetailLeftPanel.getMIntroductionDialog().m3280r9();
        boolean z11 = true;
        if (m3280r9 != null && m3280r9.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && vodDetailLeftPanel.f17509h != null && !vodDetailLeftPanel.getMIntroductionDialog().m3190s7()) {
            vodDetailLeftPanel.getMIntroductionDialog().m26938I9(vodDetailLeftPanel.f17506e);
            AbstractC0729o abstractC0729o = vodDetailLeftPanel.f17509h;
            if (abstractC0729o == null || !abstractC0729o.m3477E0()) {
                z11 = false;
            }
            if (!z11) {
                C6934b mIntroductionDialog = vodDetailLeftPanel.getMIntroductionDialog();
                AbstractC0729o abstractC0729o2 = vodDetailLeftPanel.f17509h;
                AbstractC5868k.m23671c(abstractC0729o2);
                mIntroductionDialog.mo3277E9(abstractC0729o2, "IntroductionDialog");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m16678w(VodDetailLeftPanel vodDetailLeftPanel, View view, boolean z10) {
        AbstractC5868k.m23674f(vodDetailLeftPanel, "this$0");
        ((TextView) vodDetailLeftPanel.m16680i(R$id.tvIntroductionDes)).setSelected(z10);
    }

    /* renamed from: x */
    private final void m16679x(TextView textView, String str, int i10, String str2) {
        while (true) {
            String substring = str.substring(0, i10);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            textView.setText(substring + "..." + str2);
            Layout layout = textView.getLayout();
            AbstractC5868k.m23673e(layout, "tv.layout");
            if (layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
                i10 -= 2;
            } else {
                textView.setText(substring + "...");
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC5868k.m23674f(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    /* renamed from: i */
    public View m16680i(int i10) {
        Map map = this.f17513l;
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

    /* renamed from: n */
    public final boolean m16681n() {
        String str;
        String str2;
        if (!this.f17502a) {
            return false;
        }
        AssetData assetData = this.f17506e;
        String str3 = null;
        if (assetData != null) {
            str = assetData.getDescriptionCompt();
        } else {
            str = null;
        }
        if (AbstractC6567a.m25637g(str)) {
            int i10 = R$id.tvMore;
            if (((TextView) m16680i(i10)).getVisibility() == 0) {
                ((TextView) m16680i(i10)).requestFocus();
            } else {
                ((TextView) m16680i(R$id.mTextIntroduction)).requestFocus();
            }
            return true;
        }
        AssetData assetData2 = this.f17506e;
        if (assetData2 != null) {
            str2 = assetData2.getActorDisplay();
        } else {
            str2 = null;
        }
        if (AbstractC6567a.m25637g(str2)) {
            ((TextView) m16680i(R$id.mTextActor)).requestFocus();
            return true;
        }
        AssetData assetData3 = this.f17506e;
        if (assetData3 != null) {
            str3 = assetData3.getDirector();
        }
        if (AbstractC6567a.m25637g(str3)) {
            ((TextView) m16680i(R$id.mTextDirector)).requestFocus();
            return true;
        }
        if (this.f17508g.size() <= 1 && (this.f17508g.size() != 1 || !AbstractC6567a.m25637g((String) this.f17508g.get(0)))) {
            return false;
        }
        ((HorizontalGridView) m16680i(R$id.mGridGenre)).requestFocus();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zhy.autolayout.AutoLinearLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zhy.autolayout.AutoLinearLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16682p(final com.request.result.AssetData r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vod.view.VodDetailLeftPanel.m16682p(com.request.result.AssetData, java.lang.String):void");
    }

    public final void setChildClickListener(InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "childClickListener");
        this.f17504c = interfaceC5664p;
    }

    public final void setChildFocusable(boolean z10) {
        String str;
        this.f17511j = Boolean.valueOf(z10);
        if (!this.f17502a) {
            return;
        }
        boolean z11 = false;
        if (z10) {
            if (((TextView) m16680i(R$id.tvMore)).getVisibility() == 4) {
                ((TextView) m16680i(R$id.mTextIntroduction)).setFocusable(true);
            }
            TextView textView = (TextView) m16680i(R$id.mTvContentTag);
            AssetData assetData = this.f17506e;
            String str2 = null;
            if (assetData != null) {
                str = assetData.getContentTag();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                AssetData assetData2 = this.f17506e;
                if (assetData2 != null) {
                    str2 = assetData2.getContentTagUrl();
                }
                if (!TextUtils.isEmpty(str2)) {
                    z11 = true;
                }
            }
            textView.setFocusable(z11);
            int i10 = R$id.mGridGenre;
            ((HorizontalGridView) m16680i(i10)).setDescendantFocusability(262144);
            ((HorizontalGridView) m16680i(i10)).setFocusable(true);
            ((TextView) m16680i(R$id.mTextDirector)).setFocusable(true);
            ((TextView) m16680i(R$id.mTextActor)).setFocusable(true);
            ((TextView) m16680i(R$id.tvAwards)).setFocusable(true);
            return;
        }
        ((TextView) m16680i(R$id.mTextIntroduction)).setFocusable(false);
        ((TextView) m16680i(R$id.mTvContentTag)).setFocusable(false);
        int i11 = R$id.mGridGenre;
        ((HorizontalGridView) m16680i(i11)).setDescendantFocusability(393216);
        ((HorizontalGridView) m16680i(i11)).setFocusable(false);
        ((TextView) m16680i(R$id.mTextDirector)).setFocusable(false);
        ((TextView) m16680i(R$id.mTextActor)).setFocusable(false);
        ((TextView) m16680i(R$id.tvAwards)).setFocusable(false);
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "contentId");
        this.f17512k = str;
    }

    public final void setGenreOnItemClickListener(C5153a2.a aVar) {
        AbstractC5868k.m23674f(aVar, "genreItemClickListener");
        this.f17505d = aVar;
    }

    public final void setNewSelect(AssetData assetData) {
        List<SameSeasonSeriesBean> list;
        List<SameSeasonSeriesBean> list2;
        List<SameSeasonSeriesBean> sameSeasonSeriesList;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mContentId:");
        sb2.append(this.f17512k);
        sb2.append(" --sameSeasonSeriesList:");
        Integer num = null;
        if (assetData != null) {
            list = assetData.getSameSeasonSeriesList();
        } else {
            list = null;
        }
        sb2.append(list);
        sb2.append(" --assetData:");
        sb2.append(assetData);
        AbstractC4509b.m18869b("VodDetailLeftPanel", sb2.toString(), new Object[0]);
        if (this.f17502a && AbstractC5868k.m23669a(this.f17510i, MessageService.MSG_DB_READY_REPORT) && AbstractC6567a.m25637g(this.f17512k)) {
            if (assetData != null) {
                list2 = assetData.getSameSeasonSeriesList();
            } else {
                list2 = null;
            }
            if (AbstractC6567a.m25635e(list2)) {
                int i10 = R$id.mTextUpdate;
                ((TextView) m16680i(i10)).setVisibility(0);
                TextView textView = (TextView) m16680i(i10);
                C5881x c5881x = C5881x.f23415a;
                String m16670m = m16670m(R$string.detail_no_season);
                Object[] objArr = new Object[1];
                if (assetData != null) {
                    num = Integer.valueOf(assetData.getUpdateCount());
                }
                objArr[0] = num;
                String format = String.format(m16670m, Arrays.copyOf(objArr, 1));
                AbstractC5868k.m23673e(format, "format(format, *args)");
                textView.setText(format);
                return;
            }
            if (assetData != null && (sameSeasonSeriesList = assetData.getSameSeasonSeriesList()) != null) {
                int i11 = 0;
                for (Object obj : sameSeasonSeriesList) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC1500l.m6991j();
                    }
                    SameSeasonSeriesBean sameSeasonSeriesBean = (SameSeasonSeriesBean) obj;
                    if (AbstractC5868k.m23669a(this.f17512k, sameSeasonSeriesBean.getContentId())) {
                        int i13 = R$id.mTextUpdate;
                        ((TextView) m16680i(i13)).setVisibility(0);
                        TextView textView2 = (TextView) m16680i(i13);
                        C5881x c5881x2 = C5881x.f23415a;
                        String format2 = String.format(m16670m(R$string.detail_season_set), Arrays.copyOf(new Object[]{Integer.valueOf(sameSeasonSeriesBean.getSeasonNumber()), Integer.valueOf(assetData.getUpdateCount())}, 2));
                        AbstractC5868k.m23673e(format2, "format(format, *args)");
                        textView2.setText(format2);
                    }
                    i11 = i12;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VodDetailLeftPanel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17513l = new LinkedHashMap();
        m5965b = AbstractC1314j.m5965b(C3884b.f17514a);
        this.f17507f = m5965b;
        this.f17508g = new ArrayList();
        this.f17510i = "";
        this.f17512k = "";
        if (isInEditMode()) {
            LayoutInflater.from(context).inflate(R$layout.layout_vod_detail_left_panel, this);
            m16673r();
            this.f17502a = true;
        } else {
            this.f17509h = ((AbstractActivityC0302c) context).m3294d4();
            new C5076a(context).m20545a(R$layout.layout_vod_detail_left_panel, this, new C5076a.e() { // from class: wd.b0
                @Override // p198k.C5076a.e
                /* renamed from: a */
                public final void mo11400a(View view, int i11, ViewGroup viewGroup) {
                    VodDetailLeftPanel.m16667j(VodDetailLeftPanel.this, view, i11, viewGroup);
                }
            });
        }
    }

    public /* synthetic */ VodDetailLeftPanel(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
