package com.vod.ui.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.Html;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.open.leanback.widget.AbstractC3050a;
import com.open.leanback.widget.AbstractC3057h;
import com.open.leanback.widget.HorizontalGridView;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.ChildColumn;
import com.request.result.FilterInfo;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.ui.activity.FilterActivity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import ne.C5874q;
import ne.C5875r;
import p132fa.C4300d;
import p193ja.C5044a;
import p212kd.C5174g;
import p212kd.C5199m0;
import p212kd.C5244x1;
import p253nd.InterfaceC5844d;
import p253nd.InterfaceC5845e;
import p289pd.C6273k;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7026c;
import p400xa.AbstractC7555b0;
import p400xa.C7586l1;
import p400xa.C7589m1;

/* loaded from: classes3.dex */
public final class FilterActivity extends AbstractActivityC2972a implements InterfaceC5845e, C5244x1.a {

    /* renamed from: E */
    private boolean f17215E;

    /* renamed from: F */
    private C5244x1 f17216F;

    /* renamed from: G */
    private C5174g f17217G;

    /* renamed from: H */
    private C5244x1 f17218H;

    /* renamed from: I */
    private C5174g f17219I;

    /* renamed from: J */
    private int f17220J;

    /* renamed from: K */
    private boolean f17221K;

    /* renamed from: L */
    private final InterfaceC1312h f17222L;

    /* renamed from: M */
    private boolean f17223M;

    /* renamed from: N */
    private ValueAnimator f17224N;

    /* renamed from: O */
    private final C3807e f17225O;

    /* renamed from: V */
    public Map f17226V = new LinkedHashMap();

    /* renamed from: com.vod.ui.activity.FilterActivity$a */
    /* loaded from: classes3.dex */
    public static final class C3803a implements Animator.AnimatorListener {
        C3803a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
            FilterActivity.this.f17224N = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
        }
    }

    /* renamed from: com.vod.ui.activity.FilterActivity$b */
    /* loaded from: classes3.dex */
    public static final class C3804b extends AbstractC3057h {
        C3804b() {
        }

        @Override // com.open.leanback.widget.AbstractC3057h
        /* renamed from: a */
        public void mo11995a(RecyclerView recyclerView, RecyclerView.AbstractC0787f0 abstractC0787f0, int i10, int i11) {
            super.mo11995a(recyclerView, abstractC0787f0, i10, i11);
            int itemCount = FilterActivity.this.m16160F6().getItemCount();
            if (itemCount < FilterActivity.this.f17220J && !FilterActivity.this.f17221K && i10 >= itemCount - 12) {
                FilterActivity.this.f17221K = true;
                ((InterfaceC5844d) FilterActivity.this.m11977r5()).mo23640J1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vod.ui.activity.FilterActivity$c */
    /* loaded from: classes3.dex */
    public static final class C3805c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5874q f17229a;

        /* renamed from: b */
        final /* synthetic */ C5875r f17230b;

        /* renamed from: c */
        final /* synthetic */ FilterActivity f17231c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3805c(C5874q c5874q, C5875r c5875r, FilterActivity filterActivity) {
            super(1);
            this.f17229a = c5874q;
            this.f17230b = c5875r;
            this.f17231c = filterActivity;
        }

        /* renamed from: a */
        public final void m16204a(MotionEvent motionEvent) {
            AbstractC5868k.m23674f(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action != 1 && action != 2) || this.f17229a.f23408a) {
                    return;
                }
                float y10 = motionEvent.getY() - this.f17230b.f23409a;
                if (!((VerticalGridView) this.f17231c.m16203s6(R$id.mVgvFilterResult)).canScrollVertically(-1)) {
                    if (y10 > 0.0f && this.f17231c.f17223M && y10 > ViewConfiguration.getTouchSlop()) {
                        this.f17231c.m16176W6();
                        this.f17229a.f23408a = true;
                        return;
                    } else {
                        if (y10 < 0.0f && !this.f17231c.f17223M && (-y10) > ViewConfiguration.getTouchSlop()) {
                            this.f17231c.m16158D6();
                            this.f17229a.f23408a = true;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            this.f17229a.f23408a = false;
            this.f17230b.f23409a = motionEvent.getY();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m16204a((MotionEvent) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.vod.ui.activity.FilterActivity$d */
    /* loaded from: classes3.dex */
    static final class C3806d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C3806d f17232a = new C3806d();

        C3806d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5199m0 invoke() {
            return new C5199m0();
        }
    }

    /* renamed from: com.vod.ui.activity.FilterActivity$e */
    /* loaded from: classes3.dex */
    public static final class C3807e extends RecyclerView.AbstractC0802u {
        C3807e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            AbstractC5868k.m23674f(recyclerView, "recyclerView");
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    ComponentCallbacks2C1586c.m7282u(FilterActivity.this.m30049S4().getApplicationContext()).m7390p();
                    return;
                }
                return;
            }
            ComponentCallbacks2C1586c.m7282u(FilterActivity.this.m30049S4().getApplicationContext()).m7391q();
        }
    }

    /* renamed from: com.vod.ui.activity.FilterActivity$f */
    /* loaded from: classes3.dex */
    public static final class C3808f implements Animator.AnimatorListener {
        C3808f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
            FilterActivity.this.f17224N = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
        }
    }

    public FilterActivity() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(C3806d.f17232a);
        this.f17222L = m5965b;
        this.f17225O = new C3807e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D6 */
    public final void m16158D6() {
        ValueAnimator valueAnimator = this.f17224N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, -AutoSizeUtils.dp2px(this, 281.0f));
        this.f17224N = ofInt;
        if (ofInt != null) {
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sd.y
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    FilterActivity.m16159E6(FilterActivity.this, valueAnimator2);
                }
            });
        }
        ValueAnimator valueAnimator2 = this.f17224N;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new C3803a());
        }
        ValueAnimator valueAnimator3 = this.f17224N;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(150L);
        }
        ValueAnimator valueAnimator4 = this.f17224N;
        if (valueAnimator4 != null) {
            valueAnimator4.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator5 = this.f17224N;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        this.f17223M = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E6 */
    public static final void m16159E6(FilterActivity filterActivity, ValueAnimator valueAnimator) {
        AbstractC5868k.m23674f(filterActivity, "this$0");
        AbstractC5868k.m23674f(valueAnimator, "it");
        int i10 = R$id.mAllFilterPanel;
        if (((LinearLayout) filterActivity.m16203s6(i10)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) filterActivity.m16203s6(i10)).getLayoutParams();
        AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC5868k.m23672d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams2.topMargin = ((Integer) animatedValue).intValue();
        ((LinearLayout) filterActivity.m16203s6(i10)).setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F6 */
    public final C5199m0 m16160F6() {
        return (C5199m0) this.f17222L.getValue();
    }

    /* renamed from: H6 */
    private final int m16161H6() {
        String str;
        ChildColumn childColumn;
        if (((TextView) m16203s6(R$id.mTvMovies)).isSelected()) {
            str = C4300d.f18678a.m18039j();
        } else if (((TextView) m16203s6(R$id.mTvSeries)).isSelected()) {
            str = C4300d.f18678a.m18041k();
        } else if (((TextView) m16203s6(R$id.mTvKids)).isSelected()) {
            str = C4300d.f18678a.m18033g();
        } else if (((TextView) m16203s6(R$id.mTvAnime)).isSelected()) {
            str = C4300d.f18678a.m18023b();
        } else {
            str = "";
        }
        if (AbstractC6567a.m25634d(str)) {
            return 0;
        }
        Object m20485a = C5044a.f20862a.m20485a(str);
        if (m20485a instanceof ChildColumn) {
            childColumn = (ChildColumn) m20485a;
        } else {
            childColumn = null;
        }
        if (childColumn == null) {
            return 0;
        }
        return childColumn.getId();
    }

    /* renamed from: I6 */
    private final void m16162I6(View view) {
        if (view.isSelected()) {
            return;
        }
        int i10 = R$id.mTvMovies;
        ((TextView) m16203s6(i10)).setSelected(AbstractC5868k.m23669a(view, (TextView) m16203s6(i10)));
        int i11 = R$id.mTvSeries;
        ((TextView) m16203s6(i11)).setSelected(AbstractC5868k.m23669a(view, (TextView) m16203s6(i11)));
        int i12 = R$id.mTvKids;
        ((TextView) m16203s6(i12)).setSelected(AbstractC5868k.m23669a(view, (TextView) m16203s6(i12)));
        int i13 = R$id.mTvAnime;
        ((TextView) m16203s6(i13)).setSelected(AbstractC5868k.m23669a(view, (TextView) m16203s6(i13)));
        m16175V6();
    }

    /* renamed from: J6 */
    private final void m16163J6() {
        if (this.f17215E) {
            return;
        }
        ((ViewStub) m16203s6(R$id.mVsFilterPanel)).inflate();
        TextView textView = (TextView) m16203s6(R$id.mTvMovies);
        AbstractC5868k.m23673e(textView, "mTvMovies");
        m16172S6(textView);
        TextView textView2 = (TextView) m16203s6(R$id.mTvSeries);
        AbstractC5868k.m23673e(textView2, "mTvSeries");
        m16172S6(textView2);
        TextView textView3 = (TextView) m16203s6(R$id.mTvKids);
        AbstractC5868k.m23673e(textView3, "mTvKids");
        m16172S6(textView3);
        TextView textView4 = (TextView) m16203s6(R$id.mTvAnime);
        AbstractC5868k.m23673e(textView4, "mTvAnime");
        m16172S6(textView4);
        C5244x1 c5244x1 = new C5244x1(1);
        this.f17216F = c5244x1;
        AbstractC5868k.m23671c(c5244x1);
        c5244x1.m21121t(this);
        int i10 = R$id.mHgvGenre;
        ((HorizontalGridView) m16203s6(i10)).setHasFixedSize(true);
        ((HorizontalGridView) m16203s6(i10)).setAdapter(this.f17216F);
        HorizontalGridView horizontalGridView = (HorizontalGridView) m16203s6(i10);
        AbstractC5868k.m23671c(horizontalGridView);
        horizontalGridView.setOnKeyInterceptListener(new AbstractC3050a.c() { // from class: sd.u
            @Override // com.open.leanback.widget.AbstractC3050a.c
            /* renamed from: a */
            public final boolean mo12521a(KeyEvent keyEvent) {
                boolean m16164K6;
                m16164K6 = FilterActivity.m16164K6(FilterActivity.this, keyEvent);
                return m16164K6;
            }
        });
        C5174g c5174g = new C5174g(2);
        this.f17217G = c5174g;
        AbstractC5868k.m23671c(c5174g);
        c5174g.m20901t(this);
        int i11 = R$id.mHgvYear;
        ((HorizontalGridView) m16203s6(i11)).setHasFixedSize(true);
        ((HorizontalGridView) m16203s6(i11)).setAdapter(this.f17217G);
        HorizontalGridView horizontalGridView2 = (HorizontalGridView) m16203s6(i11);
        AbstractC5868k.m23671c(horizontalGridView2);
        horizontalGridView2.setOnKeyInterceptListener(new AbstractC3050a.c() { // from class: sd.v
            @Override // com.open.leanback.widget.AbstractC3050a.c
            /* renamed from: a */
            public final boolean mo12521a(KeyEvent keyEvent) {
                boolean m16165L6;
                m16165L6 = FilterActivity.m16165L6(FilterActivity.this, keyEvent);
                return m16165L6;
            }
        });
        C5244x1 c5244x12 = new C5244x1(3);
        this.f17218H = c5244x12;
        AbstractC5868k.m23671c(c5244x12);
        c5244x12.m21121t(this);
        int i12 = R$id.mHgvCountry;
        ((HorizontalGridView) m16203s6(i12)).setHasFixedSize(true);
        ((HorizontalGridView) m16203s6(i12)).setAdapter(this.f17218H);
        HorizontalGridView horizontalGridView3 = (HorizontalGridView) m16203s6(i12);
        AbstractC5868k.m23671c(horizontalGridView3);
        horizontalGridView3.setOnKeyInterceptListener(new AbstractC3050a.c() { // from class: sd.w
            @Override // com.open.leanback.widget.AbstractC3050a.c
            /* renamed from: a */
            public final boolean mo12521a(KeyEvent keyEvent) {
                boolean m16166M6;
                m16166M6 = FilterActivity.m16166M6(FilterActivity.this, keyEvent);
                return m16166M6;
            }
        });
        C5174g c5174g2 = new C5174g(4);
        this.f17219I = c5174g2;
        AbstractC5868k.m23671c(c5174g2);
        c5174g2.m20901t(this);
        int i13 = R$id.mHgvAudio;
        ((HorizontalGridView) m16203s6(i13)).setHasFixedSize(true);
        ((HorizontalGridView) m16203s6(i13)).setAdapter(this.f17219I);
        HorizontalGridView horizontalGridView4 = (HorizontalGridView) m16203s6(i13);
        AbstractC5868k.m23671c(horizontalGridView4);
        horizontalGridView4.setOnKeyInterceptListener(new AbstractC3050a.c() { // from class: sd.x
            @Override // com.open.leanback.widget.AbstractC3050a.c
            /* renamed from: a */
            public final boolean mo12521a(KeyEvent keyEvent) {
                boolean m16167N6;
                m16167N6 = FilterActivity.m16167N6(FilterActivity.this, keyEvent);
                return m16167N6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K6 */
    public static final boolean m16164K6(FilterActivity filterActivity, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(filterActivity, "this$0");
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 20) {
                ((HorizontalGridView) filterActivity.m16203s6(R$id.mHgvYear)).requestFocus();
                return true;
            }
            if (keyEvent.getKeyCode() == 19) {
                filterActivity.m16170Q6();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L6 */
    public static final boolean m16165L6(FilterActivity filterActivity, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(filterActivity, "this$0");
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 19) {
                ((HorizontalGridView) filterActivity.m16203s6(R$id.mHgvGenre)).requestFocus();
                return true;
            }
            if (keyEvent.getKeyCode() == 20) {
                ((HorizontalGridView) filterActivity.m16203s6(R$id.mHgvCountry)).requestFocus();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M6 */
    public static final boolean m16166M6(FilterActivity filterActivity, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(filterActivity, "this$0");
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 19) {
                ((HorizontalGridView) filterActivity.m16203s6(R$id.mHgvYear)).requestFocus();
                return true;
            }
            if (keyEvent.getKeyCode() == 20) {
                ((HorizontalGridView) filterActivity.m16203s6(R$id.mHgvAudio)).requestFocus();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N6 */
    public static final boolean m16167N6(FilterActivity filterActivity, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(filterActivity, "this$0");
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 19) {
                ((HorizontalGridView) filterActivity.m16203s6(R$id.mHgvCountry)).requestFocus();
                return true;
            }
            if (keyEvent.getKeyCode() == 20 && filterActivity.m16160F6().getItemCount() <= 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: O6 */
    private final void m16168O6() {
        int i10 = R$id.mVgvFilterResult;
        ((VerticalGridView) m16203s6(i10)).setHasFixedSize(true);
        ((VerticalGridView) m16203s6(i10)).setAdapter(m16160F6());
        ((VerticalGridView) m16203s6(i10)).setItemAnimator(null);
        ((VerticalGridView) m16203s6(i10)).addOnScrollListener(this.f17225O);
        ((VerticalGridView) m16203s6(i10)).setOnChildViewHolderSelectedListener(new C3804b());
        ((VerticalGridView) m16203s6(i10)).setOnKeyInterceptListener(new AbstractC3050a.c() { // from class: sd.t
            @Override // com.open.leanback.widget.AbstractC3050a.c
            /* renamed from: a */
            public final boolean mo12521a(KeyEvent keyEvent) {
                boolean m16169P6;
                m16169P6 = FilterActivity.m16169P6(FilterActivity.this, keyEvent);
                return m16169P6;
            }
        });
        C5874q c5874q = new C5874q();
        C5875r c5875r = new C5875r();
        VerticalGridView verticalGridView = (VerticalGridView) m16203s6(i10);
        AbstractC5868k.m23673e(verticalGridView, "mVgvFilterResult");
        AbstractC7555b0.m28958l(verticalGridView, true, false, new C3805c(c5874q, c5875r, this), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P6 */
    public static final boolean m16169P6(FilterActivity filterActivity, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(filterActivity, "this$0");
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                if (filterActivity.f17223M && ((VerticalGridView) filterActivity.m16203s6(R$id.mVgvFilterResult)).getSelectedPosition() == 6) {
                    filterActivity.m16176W6();
                }
            } else {
                boolean z10 = true;
                if (keyEvent.getKeyCode() == 19) {
                    if (filterActivity.f17223M) {
                        int selectedPosition = ((VerticalGridView) filterActivity.m16203s6(R$id.mVgvFilterResult)).getSelectedPosition();
                        if (selectedPosition < 0 || selectedPosition >= 12) {
                            z10 = false;
                        }
                        if (z10) {
                            filterActivity.m16176W6();
                        }
                    }
                } else if (keyEvent.getKeyCode() == 20 && !filterActivity.f17223M && filterActivity.m16160F6().getItemCount() >= 6) {
                    int selectedPosition2 = ((VerticalGridView) filterActivity.m16203s6(R$id.mVgvFilterResult)).getSelectedPosition();
                    if (selectedPosition2 < 0 || selectedPosition2 >= 6) {
                        z10 = false;
                    }
                    if (z10) {
                        filterActivity.m16158D6();
                    }
                }
            }
            ((InterfaceC5844d) filterActivity.m11977r5()).mo23641y2(keyEvent.getKeyCode(), ((VerticalGridView) filterActivity.m16203s6(R$id.mVgvFilterResult)).getSelectedPosition());
        }
        return false;
    }

    /* renamed from: Q6 */
    private final void m16170Q6() {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = R$id.mTvMovies;
        TextView textView = (TextView) m16203s6(i10);
        boolean z13 = true;
        if (textView != null && textView.isSelected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((TextView) m16203s6(i10)).requestFocus();
            return;
        }
        int i11 = R$id.mTvSeries;
        TextView textView2 = (TextView) m16203s6(i11);
        if (textView2 != null && textView2.isSelected()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            ((TextView) m16203s6(i11)).requestFocus();
            return;
        }
        int i12 = R$id.mTvKids;
        TextView textView3 = (TextView) m16203s6(i12);
        if (textView3 != null && textView3.isSelected()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            ((TextView) m16203s6(i12)).requestFocus();
            return;
        }
        int i13 = R$id.mTvAnime;
        TextView textView4 = (TextView) m16203s6(i13);
        if (textView4 == null || !textView4.isSelected()) {
            z13 = false;
        }
        if (z13) {
            ((TextView) m16203s6(i13)).requestFocus();
        }
    }

    /* renamed from: R6 */
    private final void m16171R6(List list, List list2, List list3, List list4) {
        String string = getString(R$string.filter_vod_title);
        AbstractC5868k.m23673e(string, "getString(R.string.filter_vod_title)");
        if (AbstractC6567a.m25638h(list)) {
            AbstractC5868k.m23672d(list, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
            AbstractC5882y.m23702b(list).add(0, string);
            C5244x1 c5244x1 = this.f17216F;
            if (c5244x1 != null) {
                c5244x1.m28856n(list);
            }
        } else {
            C5244x1 c5244x12 = this.f17216F;
            if (c5244x12 != null) {
                c5244x12.m28844a(string);
            }
        }
        FilterInfo filterInfo = new FilterInfo("", string);
        if (AbstractC6567a.m25638h(list2)) {
            AbstractC5868k.m23672d(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.FilterInfo>");
            AbstractC5882y.m23702b(list2).add(0, filterInfo);
            C5174g c5174g = this.f17217G;
            if (c5174g != null) {
                c5174g.m28856n(list2);
            }
        } else {
            C5174g c5174g2 = this.f17217G;
            if (c5174g2 != null) {
                c5174g2.m28844a(filterInfo);
            }
        }
        if (AbstractC6567a.m25638h(list3)) {
            AbstractC5868k.m23672d(list3, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
            AbstractC5882y.m23702b(list3).add(0, string);
            C5244x1 c5244x13 = this.f17218H;
            if (c5244x13 != null) {
                c5244x13.m28856n(list3);
            }
        } else {
            C5244x1 c5244x14 = this.f17218H;
            if (c5244x14 != null) {
                c5244x14.m28844a(string);
            }
        }
        FilterInfo filterInfo2 = new FilterInfo("", string);
        if (AbstractC6567a.m25638h(list4)) {
            AbstractC5868k.m23672d(list4, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.FilterInfo>");
            AbstractC5882y.m23702b(list4).add(0, filterInfo2);
            C5174g c5174g3 = this.f17219I;
            if (c5174g3 != null) {
                c5174g3.m28856n(list4);
                return;
            }
            return;
        }
        C5174g c5174g4 = this.f17219I;
        if (c5174g4 != null) {
            c5174g4.m28844a(filterInfo2);
        }
    }

    /* renamed from: S6 */
    private final void m16172S6(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: sd.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FilterActivity.m16173T6(FilterActivity.this, view2);
            }
        });
        view.setOnTouchListener(new View.OnTouchListener() { // from class: sd.a0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m16174U6;
                m16174U6 = FilterActivity.m16174U6(FilterActivity.this, view2, motionEvent);
                return m16174U6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T6 */
    public static final void m16173T6(FilterActivity filterActivity, View view) {
        AbstractC5868k.m23674f(filterActivity, "this$0");
        AbstractC5868k.m23673e(view, "it");
        filterActivity.m16162I6(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U6 */
    public static final boolean m16174U6(FilterActivity filterActivity, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(filterActivity, "this$0");
        if (motionEvent.getAction() == 1) {
            view.requestFocus();
            AbstractC5868k.m23673e(view, "v");
            filterActivity.m16162I6(view);
        }
        return true;
    }

    /* renamed from: V6 */
    private final void m16175V6() {
        Object obj;
        String str;
        Object obj2;
        int m20900s;
        int m21120s;
        String str2;
        int m21120s2;
        C5244x1 c5244x1 = this.f17216F;
        String str3 = "";
        if (c5244x1 == null || (m21120s2 = c5244x1.m21120s()) <= 0 || m21120s2 >= c5244x1.getItemCount()) {
            obj = "";
        } else {
            obj = c5244x1.m28849g().get(m21120s2);
        }
        C5174g c5174g = this.f17217G;
        if (c5174g == null) {
            str = "";
        } else {
            int m20900s2 = c5174g.m20900s();
            if (m20900s2 <= 0 || m20900s2 >= c5174g.getItemCount()) {
                str2 = "";
            } else {
                str2 = ((FilterInfo) c5174g.m28849g().get(m20900s2)).getKey();
            }
            str = str2;
        }
        C5244x1 c5244x12 = this.f17218H;
        if (c5244x12 == null || (m21120s = c5244x12.m21120s()) <= 0 || m21120s >= c5244x12.getItemCount()) {
            obj2 = "";
        } else {
            obj2 = c5244x12.m28849g().get(m21120s);
        }
        C5174g c5174g2 = this.f17219I;
        if (c5174g2 != null && (m20900s = c5174g2.m20900s()) > 0 && m20900s < c5174g2.getItemCount()) {
            str3 = ((FilterInfo) c5174g2.m28849g().get(m20900s)).getKey();
        }
        int m16161H6 = m16161H6();
        this.f17221K = false;
        ((TextView) m16203s6(R$id.mTvNoResult)).setVisibility(8);
        m16160F6().m21000D(0);
        m16160F6().m28847d();
        m16160F6().m20999C("filter", m16161H6);
        ((InterfaceC5844d) m11977r5()).mo23639G0(m16161H6, (String) obj, str, (String) obj2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W6 */
    public final void m16176W6() {
        ValueAnimator valueAnimator = this.f17224N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(-AutoSizeUtils.dp2px(this, 281.0f), 0);
        this.f17224N = ofInt;
        if (ofInt != null) {
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sd.s
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    FilterActivity.m16177X6(FilterActivity.this, valueAnimator2);
                }
            });
        }
        ValueAnimator valueAnimator2 = this.f17224N;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new C3808f());
        }
        ValueAnimator valueAnimator3 = this.f17224N;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(150L);
        }
        ValueAnimator valueAnimator4 = this.f17224N;
        if (valueAnimator4 != null) {
            valueAnimator4.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator5 = this.f17224N;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        this.f17223M = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X6 */
    public static final void m16177X6(FilterActivity filterActivity, ValueAnimator valueAnimator) {
        AbstractC5868k.m23674f(filterActivity, "this$0");
        AbstractC5868k.m23674f(valueAnimator, "it");
        int i10 = R$id.mAllFilterPanel;
        if (((LinearLayout) filterActivity.m16203s6(i10)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) filterActivity.m16203s6(i10)).getLayoutParams();
        AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC5868k.m23672d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams2.topMargin = ((Integer) animatedValue).intValue();
        ((LinearLayout) filterActivity.m16203s6(i10)).setLayoutParams(layoutParams2);
    }

    @Override // p253nd.InterfaceC5845e
    /* renamed from: D2 */
    public void mo16192D2(List list, int i10) {
        AbstractC5868k.m23674f(list, "datas");
        this.f17221K = false;
        this.f17220J = i10;
        m16160F6().m21000D(i10);
        m16160F6().m28854l(list);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: G6, reason: merged with bridge method [inline-methods] */
    public InterfaceC5844d mo7516s5() {
        return new C6273k(this, this);
    }

    @Override // p253nd.InterfaceC5845e
    /* renamed from: T1 */
    public void mo16194T1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f17221K = false;
        AbstractActivityC2972a.m11957W5(this, str, false, null, null, null, null, null, 126, null);
    }

    @Override // p253nd.InterfaceC5845e
    /* renamed from: T2 */
    public void mo16195T2(List list, List list2, List list3, List list4) {
        m16163J6();
        m16171R6(list, list2, list3, list4);
        int i10 = R$id.mTvMovies;
        ((TextView) m16203s6(i10)).setSelected(true);
        ((TextView) m16203s6(i10)).requestFocus();
        m16175V6();
    }

    @Override // p253nd.InterfaceC5845e
    /* renamed from: Y0 */
    public void mo16196Y0(boolean z10) {
        this.f17221K = false;
        if (z10) {
            ((TextView) m16203s6(R$id.mTvNoResult)).setVisibility(0);
        }
    }

    @Override // p253nd.InterfaceC5845e
    /* renamed from: Z2 */
    public void mo16197Z2(List list) {
        AbstractC5868k.m23674f(list, "datas");
        this.f17221K = false;
        m16160F6().m28845b(list);
    }

    @Override // p253nd.InterfaceC5845e
    /* renamed from: a */
    public void mo16198a() {
        ((LoadingView) m16203s6(R$id.mLvLoading)).setVisibility(0);
    }

    @Override // p253nd.InterfaceC5845e
    /* renamed from: b */
    public void mo16199b() {
        ((LoadingView) m16203s6(R$id.mLvLoading)).setVisibility(8);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((LinearLayout) m16203s6(R$id.mRootView)).setBackgroundDrawable(AbstractC7026c.m27111a(this, R$color.color_0b0b0b));
        m16168O6();
    }

    @Override // p212kd.C5244x1.a
    /* renamed from: i3 */
    public void mo16200i3(int i10, int i11) {
        C7589m1 c7589m1 = C7589m1.f27886a;
        c7589m1.m29142k(i10);
        c7589m1.m29143l(i10);
        m16175V6();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f17223M) {
            ((VerticalGridView) m16203s6(R$id.mVgvFilterResult)).scrollToPosition(0);
            m16176W6();
            m16170Q6();
            return;
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onDestroy() {
        ((VerticalGridView) m16203s6(R$id.mVgvFilterResult)).removeOnScrollListener(this.f17225O);
        ValueAnimator valueAnimator = this.f17224N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f17224N = null;
        super.onDestroy();
    }

    @Override // p253nd.InterfaceC5845e
    /* renamed from: r3 */
    public void mo16201r3() {
        C7586l1 c7586l1 = C7586l1.f27877a;
        Spanned fromHtml = Html.fromHtml(getString(R$string.filter_back_key_hint));
        AbstractC5868k.m23673e(fromHtml, "fromHtml(getString(R.string.filter_back_key_hint))");
        C7586l1.m29110c(c7586l1, this, fromHtml, 1, 0, 8, null);
    }

    @Override // p253nd.InterfaceC5845e
    /* renamed from: s1 */
    public void mo16202s1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractActivityC2972a.m11957W5(this, str, false, null, null, null, null, null, 126, null);
    }

    /* renamed from: s6 */
    public View m16203s6(int i10) {
        Map map = this.f17226V;
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
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_filter;
    }
}
