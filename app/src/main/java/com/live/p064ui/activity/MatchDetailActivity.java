package com.live.p064ui.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import androidx.viewpager.widget.AbstractC0871a;
import be.C1328x;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.p064ui.activity.MatchDetailActivity;
import com.live.view.C2893u;
import com.live.view.InterfaceC2877e;
import com.live.view.InterfaceC2894v;
import com.live.view.MatchNavBar;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Progress;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.request.result.Match;
import com.umeng.analytics.pro.C3384f;
import com.widget.custom.CustomViewPager;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p028b8.C1181r;
import p043ce.AbstractC1500l;
import p102db.C4055l1;
import p104dd.AbstractC4096d;
import p115e8.InterfaceC4149h;
import p115e8.InterfaceC4150i;
import p115e8.InterfaceC4151j;
import p115e8.InterfaceC4152k;
import p147g8.C4377l;
import p147g8.C4403y;
import p223l8.C5435c2;
import p223l8.C5447f2;
import p223l8.C5451g2;
import p223l8.C5463j2;
import p223l8.C5475m2;
import p223l8.C5487p2;
import p237m8.C5608b;
import p400xa.C7586l1;
import p400xa.C7619y;
import p433zd.AbstractC7786b;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes2.dex */
public final class MatchDetailActivity extends AbstractActivityC2972a implements InterfaceC4152k, InterfaceC4150i, View.OnFocusChangeListener, View.OnClickListener, View.OnKeyListener, InterfaceC2894v {

    /* renamed from: W */
    public static final C2860a f10864W = new C2860a(null);

    /* renamed from: H */
    private boolean f10868H;

    /* renamed from: I */
    private boolean f10869I;

    /* renamed from: J */
    private View f10870J;

    /* renamed from: K */
    private View f10871K;

    /* renamed from: L */
    private InterfaceC2877e f10872L;

    /* renamed from: O */
    private int f10875O;

    /* renamed from: V */
    public Map f10876V = new LinkedHashMap();

    /* renamed from: E */
    private int f10865E = AbstractC7786b.m30166j(30);

    /* renamed from: F */
    private int f10866F = AbstractC7786b.m30166j(580);

    /* renamed from: G */
    private boolean f10867G = true;

    /* renamed from: M */
    private String f10873M = "MatchDetailActivity";

    /* renamed from: N */
    private HandlerC2862c f10874N = new HandlerC2862c();

    /* renamed from: com.live.ui.activity.MatchDetailActivity$a */
    /* loaded from: classes2.dex */
    public static final class C2860a {

        /* renamed from: com.live.ui.activity.MatchDetailActivity$a$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ String f10877a;

            /* renamed from: b */
            final /* synthetic */ String f10878b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2) {
                super(1);
                this.f10877a = str;
                this.f10878b = str2;
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "intent");
                intent.putExtra("extra_game_id", this.f10877a);
                Intent putExtra = intent.putExtra("extra_date", this.f10878b);
                AbstractC5868k.m23673e(putExtra, "intent.putExtra(EXTRA_GAME_DATE, date)");
                return putExtra;
            }
        }

        private C2860a() {
        }

        public /* synthetic */ C2860a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final void m11527a(Context context, String str, String str2) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(str, "gameId");
            AbstractC5868k.m23674f(str2, Progress.DATE);
            C7619y.m29367d(C7619y.f28056a, context, MatchDetailActivity.class, null, new a(str, str2), 2, null);
        }
    }

    /* renamed from: com.live.ui.activity.MatchDetailActivity$b */
    /* loaded from: classes2.dex */
    public static final class C2861b implements Animator.AnimatorListener {
        C2861b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
            ((AutoLinearLayout) MatchDetailActivity.this.m11520r6(R$id.mNavigationPanel)).setTag(null);
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

    /* renamed from: com.live.ui.activity.MatchDetailActivity$c */
    /* loaded from: classes2.dex */
    public static final class HandlerC2862c extends Handler {
        HandlerC2862c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC5868k.m23674f(message, "msg");
            super.handleMessage(message);
            if (message.what == 801) {
                MatchDetailActivity matchDetailActivity = MatchDetailActivity.this;
                Object obj = message.obj;
                AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type kotlin.Long");
                matchDetailActivity.m11477A6(((Long) obj).longValue());
            }
        }
    }

    /* renamed from: com.live.ui.activity.MatchDetailActivity$d */
    /* loaded from: classes2.dex */
    public static final class C2863d implements Animator.AnimatorListener {
        C2863d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC5868k.m23674f(animator, "animation");
            ((AutoLinearLayout) MatchDetailActivity.this.m11520r6(R$id.mNavigationPanel)).setTag(null);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A6 */
    public final void m11477A6(long j10) {
        long currentTimeMillis = j10 - (System.currentTimeMillis() / 1000);
        C5881x c5881x = C5881x.f23415a;
        String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(currentTimeMillis / 86400)}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf((currentTimeMillis % 86400) / 3600)}, 1));
        AbstractC5868k.m23673e(format2, "format(format, *args)");
        String format3 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf((currentTimeMillis % 3600) / 60)}, 1));
        AbstractC5868k.m23673e(format3, "format(format, *args)");
        if (AbstractC5868k.m23669a(format, "00") && AbstractC5868k.m23669a(format2, "00") && AbstractC5868k.m23669a(format3, "00")) {
            View view = this.f10870J;
            if (view != null) {
                view.setVisibility(8);
            }
            ((InterfaceC4151j) m11977r5()).mo17365i1();
            return;
        }
        ((TextView) m11520r6(R$id.mTvDayFirst)).setText(String.valueOf(format.charAt(0)));
        ((TextView) m11520r6(R$id.mTvDaySecond)).setText(String.valueOf(format.charAt(1)));
        ((TextView) m11520r6(R$id.mTvHourFirst)).setText(String.valueOf(format2.charAt(0)));
        ((TextView) m11520r6(R$id.mTvHourSecond)).setText(String.valueOf(format2.charAt(1)));
        ((TextView) m11520r6(R$id.mTvMinuteFirst)).setText(String.valueOf(format3.charAt(0)));
        ((TextView) m11520r6(R$id.mTvMinuteSecond)).setText(String.valueOf(format3.charAt(1)));
        Message obtainMessage = this.f10874N.obtainMessage(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE);
        AbstractC5868k.m23673e(obtainMessage, "mHandler.obtainMessage(MSG_COUNT_DOWN)");
        obtainMessage.obj = Long.valueOf(j10);
        this.f10874N.sendMessageDelayed(obtainMessage, OkGo.DEFAULT_MILLISECONDS);
    }

    /* renamed from: B6 */
    private final boolean m11478B6(View view, int i10) {
        if (i10 != 19) {
            if (i10 != 20) {
                if (i10 == 22) {
                    int id2 = view.getId();
                    int i11 = R$id.mBtnSubscrbe;
                    if (id2 == i11) {
                        return true;
                    }
                    if (view.getId() == R$id.mBtnFullscreen && ((AutoLinearLayout) m11520r6(i11)).getVisibility() == 8) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            ((MatchNavBar) m11520r6(R$id.mMatchNavBar)).m11589f();
            m11501w6();
        }
        return true;
    }

    /* renamed from: C6 */
    private final boolean m11479C6(int i10) {
        boolean z10 = this.f10868H;
        if (z10 && i10 == 4) {
            m11508L6();
            return true;
        }
        if (i10 != 66 && i10 != 23) {
            if (i10 == 21) {
                return true;
            }
            if (i10 == 22) {
                if (!z10) {
                    ((AutoLinearLayout) m11520r6(R$id.mBtnFullscreen)).requestFocus();
                }
                return true;
            }
            if (i10 == 20) {
                if (!z10) {
                    ((MatchNavBar) m11520r6(R$id.mMatchNavBar)).m11589f();
                    m11501w6();
                }
                return true;
            }
            return false;
        }
        m11503y6();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D6 */
    public static final void m11480D6(MatchDetailActivity matchDetailActivity) {
        AbstractC5868k.m23674f(matchDetailActivity, "this$0");
        View view = matchDetailActivity.f10871K;
        if (view != null) {
            view.setVisibility(8);
        }
        LoadingView loadingView = (LoadingView) matchDetailActivity.m11520r6(R$id.loading);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E6 */
    public static final boolean m11481E6(MatchDetailActivity matchDetailActivity) {
        AbstractC5868k.m23674f(matchDetailActivity, "this$0");
        ((InterfaceC4151j) matchDetailActivity.m11977r5()).mo17364V1();
        return false;
    }

    /* renamed from: F6 */
    private final void m11482F6(C4377l c4377l) {
        C5608b c5608b = C5608b.f22632a;
        ImageView imageView = (ImageView) m11520r6(R$id.mIvVisitTeam);
        AbstractC5868k.m23673e(imageView, "mIvVisitTeam");
        c5608b.m22780c(this, imageView, c4377l.m18355g());
        ((TextView) m11520r6(R$id.mTvVisitTeam)).setText(c4377l.m18356h());
        ImageView imageView2 = (ImageView) m11520r6(R$id.mIvHomeTeam);
        AbstractC5868k.m23673e(imageView2, "mIvHomeTeam");
        c5608b.m22780c(this, imageView2, c4377l.m18349a());
        ((TextView) m11520r6(R$id.mTvHomeTeam)).setText(c4377l.m18350b());
        ((TextView) m11520r6(R$id.mTvMatchName)).setText(c4377l.m18352d());
        ((TextView) m11520r6(R$id.mTvScore)).setText(c4377l.m18353e());
        ((TextView) m11520r6(R$id.mTvDate)).setText(c4377l.m18351c());
        if (c4377l.m18357i()) {
            int i10 = R$id.mTvFinished;
            ((TextView) m11520r6(i10)).setVisibility(0);
            ((TextView) m11520r6(i10)).setText(getString(R$string.match_finished));
        } else if (c4377l.m18358j()) {
            int i11 = R$id.mTvFinished;
            ((TextView) m11520r6(i11)).setVisibility(0);
            ((TextView) m11520r6(i11)).setText(getString(R$string.match_processing));
        } else {
            ((TextView) m11520r6(R$id.mTvFinished)).setVisibility(4);
        }
        ((AutoLinearLayout) m11520r6(R$id.mMatchInfoPanel)).setVisibility(0);
    }

    /* renamed from: G6 */
    private final void m11483G6(C4377l c4377l) {
        int i10;
        int i11 = R$id.mBtnFullscreen;
        int i12 = 0;
        ((AutoLinearLayout) m11520r6(i11)).setVisibility(0);
        ((AutoLinearLayout) m11520r6(i11)).requestFocus();
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m11520r6(R$id.mBtnSubscrbe);
        if (c4377l.m18354f()) {
            ImageView imageView = (ImageView) m11520r6(R$id.mIvSubscribe);
            if (c4377l.m18359k()) {
                i10 = R$drawable.ic_match_reverse_selected;
            } else {
                i10 = R$drawable.ic_detail_subscribe;
            }
            imageView.setImageResource(i10);
        } else {
            i12 = 8;
        }
        autoLinearLayout.setVisibility(i12);
    }

    /* renamed from: H6 */
    private final void m11484H6(C4377l c4377l) {
        int i10 = R$id.mPlayerPanel;
        ((AutoFrameLayout) m11520r6(i10)).setBackgroundResource(0);
        ((AutoFrameLayout) m11520r6(i10)).setFocusable(true);
        ((AutoFrameLayout) m11520r6(i10)).setFocusableInTouchMode(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I6 */
    public static final void m11485I6(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J6 */
    public static final boolean m11486J6(View view, int i10, KeyEvent keyEvent) {
        return i10 != 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K6 */
    public static final void m11487K6(MatchDetailActivity matchDetailActivity) {
        AbstractC5868k.m23674f(matchDetailActivity, "this$0");
        if (matchDetailActivity.f10870J == null) {
            matchDetailActivity.f10870J = ((ViewStub) matchDetailActivity.m11520r6(R$id.mStubMatchStatus)).inflate();
            C1328x c1328x = C1328x.f4998a;
        }
        int i10 = R$id.mTvStatus;
        ((TextView) matchDetailActivity.m11520r6(i10)).setVisibility(0);
        ((AutoLinearLayout) matchDetailActivity.m11520r6(R$id.mCountDownPanel)).setVisibility(8);
        ((TextView) matchDetailActivity.m11520r6(R$id.mTvUntilMatchBegin)).setVisibility(8);
        ((TextView) matchDetailActivity.m11520r6(i10)).setText(matchDetailActivity.getResources().getString(R$string.match_hint_recording));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M6 */
    public static final void m11488M6(String str, MatchDetailActivity matchDetailActivity) {
        AbstractC5868k.m23674f(matchDetailActivity, "this$0");
        C5435c2 m21861b = C5435c2.f22079P0.m21861b(str);
        matchDetailActivity.f10872L = m21861b;
        if (m21861b != null) {
            m21861b.mo11612l6(matchDetailActivity.f10868H);
        }
        matchDetailActivity.m3294d4().m3534m().m3644q(R$id.mPlayerPanel, m21861b).mo3228h();
    }

    /* renamed from: N6 */
    private final void m11489N6() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f10865E, this.f10866F);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(500L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j8.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MatchDetailActivity.m11490O6(MatchDetailActivity.this, valueAnimator);
            }
        });
        ofInt.addListener(new C2863d());
        ofInt.start();
        ((AutoLinearLayout) m11520r6(R$id.mNavigationPanel)).setTag(ofInt);
        this.f10869I = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O6 */
    public static final void m11490O6(MatchDetailActivity matchDetailActivity, ValueAnimator valueAnimator) {
        AbstractC5868k.m23674f(matchDetailActivity, "this$0");
        AbstractC5868k.m23674f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC5868k.m23672d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        AutoFrameLayout.C3910a c3910a = new AutoFrameLayout.C3910a(-1, -1);
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        AbstractC5868k.m23672d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        ((FrameLayout.LayoutParams) c3910a).topMargin = ((Integer) animatedValue2).intValue();
        ((AutoLinearLayout) matchDetailActivity.m11520r6(R$id.mNavigationPanel)).setLayoutParams(c3910a);
        int i10 = matchDetailActivity.f10865E;
        float f10 = ((intValue - i10) * 1.0f) / (matchDetailActivity.f10866F - i10);
        ((AutoLinearLayout) matchDetailActivity.m11520r6(R$id.mMatchInfoPanel)).setAlpha(f10);
        ((AutoLinearLayout) matchDetailActivity.m11520r6(R$id.mMatchMenuPanel)).setAlpha(f10);
        ((AutoFrameLayout) matchDetailActivity.m11520r6(R$id.mPlayerPanel)).setAlpha(f10);
    }

    /* renamed from: t6 */
    private final InterfaceC4149h m11500t6() {
        int i10 = R$id.mVpNav;
        int currentItem = ((CustomViewPager) m11520r6(i10)).getCurrentItem();
        AbstractC0871a adapter = ((CustomViewPager) m11520r6(i10)).getAdapter();
        AbstractC5868k.m23672d(adapter, "null cannot be cast to non-null type com.live.adapter.MatchDetailNavAdapter");
        Object obj = ((C1181r) adapter).m5421d().get(currentItem);
        AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type com.live.mvp.contract.act.MatchDetailContract.InnerMatchView");
        return (InterfaceC4149h) obj;
    }

    /* renamed from: w6 */
    private final void m11501w6() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f10866F, this.f10865E);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(500L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j8.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MatchDetailActivity.m11502x6(MatchDetailActivity.this, valueAnimator);
            }
        });
        ofInt.addListener(new C2861b());
        ofInt.start();
        ((AutoLinearLayout) m11520r6(R$id.mNavigationPanel)).setTag(ofInt);
        this.f10869I = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6 */
    public static final void m11502x6(MatchDetailActivity matchDetailActivity, ValueAnimator valueAnimator) {
        AbstractC5868k.m23674f(matchDetailActivity, "this$0");
        AbstractC5868k.m23674f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC5868k.m23672d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        AutoFrameLayout.C3910a c3910a = new AutoFrameLayout.C3910a(-1, -1);
        ((FrameLayout.LayoutParams) c3910a).topMargin = intValue;
        ((AutoLinearLayout) matchDetailActivity.m11520r6(R$id.mNavigationPanel)).setLayoutParams(c3910a);
        int i10 = matchDetailActivity.f10865E;
        float f10 = ((intValue - i10) * 1.0f) / (matchDetailActivity.f10866F - i10);
        ((AutoLinearLayout) matchDetailActivity.m11520r6(R$id.mMatchInfoPanel)).setAlpha(f10);
        ((AutoLinearLayout) matchDetailActivity.m11520r6(R$id.mMatchMenuPanel)).setAlpha(f10);
        ((AutoFrameLayout) matchDetailActivity.m11520r6(R$id.mPlayerPanel)).setAlpha(f10);
    }

    /* renamed from: y6 */
    private final void m11503y6() {
        AutoFrameLayout.C3910a c3910a = new AutoFrameLayout.C3910a(-1, -1);
        ((FrameLayout.LayoutParams) c3910a).leftMargin = 0;
        ((FrameLayout.LayoutParams) c3910a).topMargin = 0;
        int i10 = R$id.mPlayerPanel;
        ((AutoFrameLayout) m11520r6(i10)).setLayoutParams(c3910a);
        this.f10868H = true;
        m11520r6(R$id.mPlayerFocusView).setVisibility(8);
        ((AutoLinearLayout) m11520r6(R$id.mNavigationPanel)).setVisibility(8);
        InterfaceC2877e interfaceC2877e = this.f10872L;
        if (interfaceC2877e != null) {
            if (interfaceC2877e != null) {
                interfaceC2877e.mo11612l6(true);
                return;
            }
            return;
        }
        ((AutoFrameLayout) m11520r6(i10)).requestFocus();
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: B2 */
    public void mo11504B2(long j10) {
        if (this.f10870J == null) {
            this.f10870J = ((ViewStub) m11520r6(R$id.mStubMatchStatus)).inflate();
            C1328x c1328x = C1328x.f4998a;
        }
        ((TextView) m11520r6(R$id.mTvStatus)).setVisibility(8);
        ((AutoLinearLayout) m11520r6(R$id.mCountDownPanel)).setVisibility(0);
        ((TextView) m11520r6(R$id.mTvUntilMatchBegin)).setVisibility(0);
        m11477A6(j10);
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: E3 */
    public void mo11505E3() {
        if (this.f10870J == null) {
            this.f10870J = ((ViewStub) m11520r6(R$id.mStubMatchStatus)).inflate();
            C1328x c1328x = C1328x.f4998a;
        }
        int i10 = R$id.mTvStatus;
        ((TextView) m11520r6(i10)).setVisibility(0);
        ((AutoLinearLayout) m11520r6(R$id.mCountDownPanel)).setVisibility(8);
        ((TextView) m11520r6(R$id.mTvUntilMatchBegin)).setVisibility(8);
        ((TextView) m11520r6(i10)).setText(getResources().getString(R$string.match_hint_user_goto_channel));
    }

    @Override // p115e8.InterfaceC4150i
    /* renamed from: G */
    public void mo11506G() {
        ((MatchNavBar) m11520r6(R$id.mMatchNavBar)).m11589f();
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: J3 */
    public void mo11507J3() {
        View view;
        View view2 = this.f10871K;
        if (view2 == null) {
            ViewStub viewStub = (ViewStub) m11520r6(R$id.mStubMatchLoading);
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            this.f10871K = view;
            ((LoadingView) m11520r6(R$id.loading)).setVisibility(0);
            return;
        }
        if (view2 != null) {
            view2.setVisibility(0);
        }
        ((LoadingView) m11520r6(R$id.loading)).setVisibility(0);
    }

    /* renamed from: L6 */
    public final void m11508L6() {
        AutoFrameLayout.C3910a c3910a = new AutoFrameLayout.C3910a(AbstractC7786b.m30166j(800), AbstractC7786b.m30166j(450));
        ((FrameLayout.LayoutParams) c3910a).leftMargin = AbstractC7786b.m30166j(90);
        ((FrameLayout.LayoutParams) c3910a).topMargin = AbstractC7786b.m30166j(80);
        int i10 = R$id.mPlayerPanel;
        ((AutoFrameLayout) m11520r6(i10)).setLayoutParams(c3910a);
        this.f10868H = false;
        m11520r6(R$id.mPlayerFocusView).setVisibility(0);
        ((AutoFrameLayout) m11520r6(i10)).requestFocus();
        InterfaceC2877e interfaceC2877e = this.f10872L;
        if (interfaceC2877e != null) {
            interfaceC2877e.mo11612l6(false);
        }
        ((AutoLinearLayout) m11520r6(R$id.mNavigationPanel)).setVisibility(0);
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: Q2 */
    public void mo11509Q2() {
        C7586l1 c7586l1 = C7586l1.f27877a;
        String string = getResources().getString(R$string.system_busy);
        AbstractC5868k.m23673e(string, "resources.getString(R.string.system_busy)");
        C7586l1.m29112f(c7586l1, this, string, 1, 0, 8, null);
    }

    @Override // com.live.view.InterfaceC2894v
    /* renamed from: S */
    public boolean mo11510S(int i10) {
        m11500t6().mo17362f2();
        return true;
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: V0 */
    public void mo11511V0(boolean z10) {
        int i10;
        ImageView imageView = (ImageView) m11520r6(R$id.mIvSubscribe);
        if (z10) {
            i10 = R$drawable.ic_match_reverse_selected;
        } else {
            i10 = R$drawable.ic_detail_subscribe;
        }
        imageView.setImageResource(i10);
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: V2 */
    public void mo11512V2(boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                i10 = R$string.match_subscribed_simple;
            } else {
                i10 = R$string.match_subscribed;
            }
        } else {
            i10 = R$string.match_unsubscribed;
        }
        C4055l1.a aVar = C4055l1.f17924H0;
        String string = getString(i10);
        AbstractC5868k.m23673e(string, "getString(toastMsgResId)");
        aVar.m17082a(this, string, 5000L);
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: X2 */
    public void mo11513X2(C4377l c4377l) {
        AbstractC5868k.m23674f(c4377l, "matchDetail");
        m11482F6(c4377l);
        m11483G6(c4377l);
        m11484H6(c4377l);
    }

    @Override // com.live.view.InterfaceC2894v
    /* renamed from: Y */
    public void mo11514Y(int i10) {
        ((CustomViewPager) m11520r6(R$id.mVpNav)).setCurrentItem(i10);
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: Z0 */
    public void mo11515Z0(C4377l c4377l, Match match) {
        List m6988g;
        AbstractC5868k.m23674f(c4377l, "matchDetail");
        AbstractC5868k.m23674f(match, "match");
        ((ViewStub) m11520r6(R$id.mStubMatchNavigation)).inflate();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2893u(R$string.match_event));
        arrayList.add(new C2893u(R$string.match_line_up));
        arrayList.add(new C2893u(R$string.match_statistics));
        arrayList.add(new C2893u(R$string.match_rank));
        int i10 = R$id.mMatchNavBar;
        ((MatchNavBar) m11520r6(i10)).setNavData(arrayList);
        ((MatchNavBar) m11520r6(i10)).setOnMatchNavListener(this);
        int i11 = R$id.mVpNav;
        ((CustomViewPager) m11520r6(i11)).setScrollable(false);
        ((CustomViewPager) m11520r6(i11)).setOffscreenPageLimit(2);
        C5447f2 m22006a = C5447f2.f22172D0.m22006a(c4377l, match);
        m22006a.m22005N9(this);
        C5451g2 m22011a = C5451g2.f22181D0.m22011a(c4377l, match);
        m22011a.m22010J9(this);
        C5487p2 m22144a = C5487p2.f22286F0.m22144a(c4377l, match);
        m22144a.m22143N9(this);
        C5475m2 m22134a = C5475m2.f22269D0.m22134a(c4377l, match);
        m22134a.m22133N9(this);
        CustomViewPager customViewPager = (CustomViewPager) m11520r6(i11);
        AbstractC0729o m3294d4 = m3294d4();
        AbstractC5868k.m23673e(m3294d4, "supportFragmentManager");
        m6988g = AbstractC1500l.m6988g(m22006a, m22011a, m22144a, m22134a);
        customViewPager.setAdapter(new C1181r(m3294d4, m6988g));
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: c */
    public void mo11516c() {
        LoadingView loadingView = new LoadingView(this);
        loadingView.setId(R$id.match_loading);
        loadingView.setFocusable(true);
        loadingView.setFocusableInTouchMode(true);
        loadingView.setOnClickListener(new View.OnClickListener() { // from class: j8.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MatchDetailActivity.m11485I6(view);
            }
        });
        loadingView.setOnKeyListener(new View.OnKeyListener() { // from class: j8.g
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                boolean m11486J6;
                m11486J6 = MatchDetailActivity.m11486J6(view, i10, keyEvent);
                return m11486J6;
            }
        });
        loadingView.setVisibility(0);
        ((AutoFrameLayout) m11520r6(R$id.mRootView)).addView(loadingView, -1, -1);
        loadingView.requestFocus();
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: d3 */
    public void mo11517d3() {
        runOnUiThread(new Runnable() { // from class: j8.j
            @Override // java.lang.Runnable
            public final void run() {
                MatchDetailActivity.m11487K6(MatchDetailActivity.this);
            }
        });
    }

    @Override // com.module.basemvp.AbstractActivityC2972a, androidx.appcompat.app.AbstractActivityC0302c, androidx.core.app.AbstractActivityC0511i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.isLongPress()) {
            this.f10875O = keyEvent.getKeyCode();
        }
        if (keyEvent.getKeyCode() != this.f10875O && keyEvent.getAction() == 0) {
            this.f10875O = keyEvent.getKeyCode();
            AbstractC4096d.m17153c(String.valueOf(keyEvent.getKeyCode()), "start");
        } else if (keyEvent.getAction() == 1) {
            this.f10875O = 0;
            AbstractC4096d.m17153c(String.valueOf(keyEvent.getKeyCode()), "stop");
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        int i10 = R$id.mPlayerPanel;
        ((AutoFrameLayout) m11520r6(i10)).setOnKeyListener(this);
        ((AutoFrameLayout) m11520r6(i10)).setOnFocusChangeListener(this);
        int i11 = R$id.mBtnFullscreen;
        ((AutoLinearLayout) m11520r6(i11)).setOnKeyListener(this);
        ((AutoLinearLayout) m11520r6(i11)).setOnClickListener(this);
        ((AutoLinearLayout) m11520r6(i11)).setOnFocusChangeListener(this);
        int i12 = R$id.mBtnSubscrbe;
        ((AutoLinearLayout) m11520r6(i12)).setOnKeyListener(this);
        ((AutoLinearLayout) m11520r6(i12)).setOnClickListener(this);
        ((AutoLinearLayout) m11520r6(i12)).setOnFocusChangeListener(this);
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: m1 */
    public void mo11518m1() {
        int i10 = R$id.mRootView;
        LoadingView loadingView = (LoadingView) ((AutoFrameLayout) m11520r6(i10)).findViewById(R$id.match_loading);
        if (loadingView != null) {
            ((AutoFrameLayout) m11520r6(i10)).removeView(loadingView);
        }
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: n3 */
    public void mo11519n3() {
        if (this.f10870J == null) {
            this.f10870J = ((ViewStub) m11520r6(R$id.mStubMatchStatus)).inflate();
            C1328x c1328x = C1328x.f4998a;
        }
        int i10 = R$id.mTvStatus;
        ((TextView) m11520r6(i10)).setVisibility(0);
        ((AutoLinearLayout) m11520r6(R$id.mCountDownPanel)).setVisibility(8);
        ((TextView) m11520r6(R$id.mTvUntilMatchBegin)).setVisibility(8);
        ((TextView) m11520r6(i10)).setText(getResources().getString(R$string.play_not_vip));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mBtnFullscreen;
        if (num != null && num.intValue() == i10) {
            m11503y6();
            return;
        }
        int i11 = R$id.mBtnSubscrbe;
        if (num != null && num.intValue() == i11) {
            ((InterfaceC4151j) m11977r5()).mo17363V0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onDestroy() {
        Object obj;
        ValueAnimator valueAnimator;
        this.f10874N.removeMessages(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE);
        int i10 = R$id.mNavigationPanel;
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m11520r6(i10);
        if (autoLinearLayout != null) {
            obj = autoLinearLayout.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof ValueAnimator) {
            valueAnimator = (ValueAnimator) obj;
        } else {
            valueAnimator = null;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m11520r6(i10);
        if (autoLinearLayout2 != null) {
            autoLinearLayout2.setTag(null);
        }
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // android.view.View.OnFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFocusChange(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            if (r6 == 0) goto Lb
            int r0 = r6.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r1 = com.live.R$id.mBtnFullscreen
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L13
            goto L1b
        L13:
            int r4 = r0.intValue()
            if (r4 != r1) goto L1b
        L19:
            r1 = 1
            goto L28
        L1b:
            int r1 = com.live.R$id.mBtnSubscrbe
            if (r0 != 0) goto L20
            goto L27
        L20:
            int r4 = r0.intValue()
            if (r4 != r1) goto L27
            goto L19
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L38
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            if (r6 == 0) goto L5e
            r0 = r7 ^ 1
            r6.setClipChildren(r0)
            r7 = r7 ^ r3
            r6.setClipToPadding(r7)
            goto L5e
        L38:
            int r6 = com.live.R$id.mPlayerPanel
            if (r0 != 0) goto L3d
            goto L5e
        L3d:
            int r0 = r0.intValue()
            if (r0 != r6) goto L5e
            if (r7 == 0) goto L53
            boolean r6 = r5.f10868H
            if (r6 != 0) goto L53
            int r6 = com.live.R$id.mPlayerFocusView
            android.view.View r6 = r5.m11520r6(r6)
            r6.setVisibility(r2)
            goto L5e
        L53:
            int r6 = com.live.R$id.mPlayerFocusView
            android.view.View r6 = r5.m11520r6(r6)
            r7 = 8
            r6.setVisibility(r7)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.live.p064ui.activity.MatchDetailActivity.onFocusChange(android.view.View, boolean):void");
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        boolean z10;
        Integer num;
        boolean z11 = true;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            int i11 = R$id.mPlayerPanel;
            if (num != null && num.intValue() == i11) {
                return m11479C6(i10);
            }
            int i12 = R$id.mBtnFullscreen;
            if (num == null || num.intValue() != i12) {
                int i13 = R$id.mBtnSubscrbe;
                if (num == null || num.intValue() != i13) {
                    z11 = false;
                }
            }
            if (z11) {
                return m11478B6(view, i10);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f10867G) {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: j8.d
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    boolean m11481E6;
                    m11481E6 = MatchDetailActivity.m11481E6(MatchDetailActivity.this);
                    return m11481E6;
                }
            });
            this.f10867G = false;
        }
    }

    /* renamed from: r6 */
    public View m11520r6(int i10) {
        Map map = this.f10876V;
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

    @Override // p115e8.InterfaceC4152k
    /* renamed from: s2 */
    public void mo11521s2(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        C5463j2 m22033a = C5463j2.f22201K0.m22033a(str);
        this.f10872L = m22033a;
        if (m22033a != null) {
            m22033a.mo11612l6(this.f10868H);
        }
        m3294d4().m3534m().m3644q(R$id.mPlayerPanel, m22033a).mo3228h();
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: t3 */
    public void mo11522t3() {
        if (this.f10870J == null) {
            this.f10870J = ((ViewStub) m11520r6(R$id.mStubMatchStatus)).inflate();
            C1328x c1328x = C1328x.f4998a;
        }
        int i10 = R$id.mTvStatus;
        ((TextView) m11520r6(i10)).setVisibility(0);
        ((AutoLinearLayout) m11520r6(R$id.mCountDownPanel)).setVisibility(8);
        ((TextView) m11520r6(R$id.mTvUntilMatchBegin)).setVisibility(8);
        ((TextView) m11520r6(i10)).setText(getResources().getString(R$string.match_hint_content_unavailable));
    }

    @Override // com.live.view.InterfaceC2894v
    /* renamed from: x2 */
    public boolean mo11523x2(int i10) {
        ((AutoLinearLayout) m11520r6(R$id.mBtnFullscreen)).requestFocus();
        if (this.f10869I) {
            m11489N6();
            return true;
        }
        return true;
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: x3 */
    public void mo11524x3(final String str) {
        mo11525y1();
        runOnUiThread(new Runnable() { // from class: j8.k
            @Override // java.lang.Runnable
            public final void run() {
                MatchDetailActivity.m11488M6(str, this);
            }
        });
    }

    @Override // p115e8.InterfaceC4152k
    /* renamed from: y1 */
    public void mo11525y1() {
        runOnUiThread(new Runnable() { // from class: j8.i
            @Override // java.lang.Runnable
            public final void run() {
                MatchDetailActivity.m11480D6(MatchDetailActivity.this);
            }
        });
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.act_match_detail;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4151j mo7516s5() {
        return new C4403y(this, this);
    }
}
