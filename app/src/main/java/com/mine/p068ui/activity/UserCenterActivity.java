package com.mine.p068ui.activity;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import be.C1328x;
import cc.C1466m0;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$mipmap;
import com.mine.R$string;
import com.mine.p068ui.activity.UserCenterActivity;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.ClosePersonalEvent;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.open.leanback.widget.AbstractC3050a;
import com.open.leanback.widget.VerticalGridView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.greenrobot.eventbus.ThreadMode;
import p043ce.AbstractC1500l;
import p100d9.C3991l0;
import p100d9.C3999p0;
import p100d9.C4011w;
import p148g9.InterfaceC4411g;
import p148g9.InterfaceC4412h;
import p177i9.C4918j;
import p251n9.AbstractC5774c;
import p400xa.AbstractC7604r1;
import ye.InterfaceC7719m;

/* loaded from: classes.dex */
public final class UserCenterActivity extends AbstractActivityC2972a implements InterfaceC4412h {

    /* renamed from: O */
    public static final C2967a f11728O = new C2967a(null);

    /* renamed from: E */
    private List f11729E;

    /* renamed from: F */
    private C3999p0 f11730F;

    /* renamed from: G */
    private C3991l0 f11731G;

    /* renamed from: H */
    public boolean f11732H;

    /* renamed from: I */
    public int f11733I;

    /* renamed from: J */
    public int f11734J;

    /* renamed from: K */
    private int f11735K;

    /* renamed from: N */
    public Map f11738N = new LinkedHashMap();

    /* renamed from: L */
    private final C2969c f11736L = new C2969c();

    /* renamed from: M */
    private final C2968b f11737M = new C2968b();

    /* renamed from: com.mine.ui.activity.UserCenterActivity$a */
    /* loaded from: classes2.dex */
    public static final class C2967a {
        private C2967a() {
        }

        public /* synthetic */ C2967a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.mine.ui.activity.UserCenterActivity$b */
    /* loaded from: classes2.dex */
    public static final class C2968b extends ViewPager2.OnPageChangeCallback {
        C2968b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            View view;
            UserCenterActivity userCenterActivity = UserCenterActivity.this;
            int i11 = R$id.mTabRecyclerview;
            if (((VerticalGridView) userCenterActivity.m11945i6(i11)).getFocusedChild() == null) {
                ((VerticalGridView) UserCenterActivity.this.m11945i6(i11)).smoothScrollToPosition(i10);
                RecyclerView.AbstractC0797p layoutManager = ((VerticalGridView) UserCenterActivity.this.m11945i6(i11)).getLayoutManager();
                View view2 = null;
                if (layoutManager != null) {
                    view = layoutManager.findViewByPosition(UserCenterActivity.this.f11735K);
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setSelected(false);
                }
                RecyclerView.AbstractC0797p layoutManager2 = ((VerticalGridView) UserCenterActivity.this.m11945i6(i11)).getLayoutManager();
                if (layoutManager2 != null) {
                    view2 = layoutManager2.findViewByPosition(i10);
                }
                if (view2 != null) {
                    view2.setSelected(true);
                }
            }
            UserCenterActivity.this.f11735K = i10;
            UserCenterActivity.this.f11733I = i10;
        }
    }

    /* renamed from: com.mine.ui.activity.UserCenterActivity$c */
    /* loaded from: classes2.dex */
    public static final class C2969c implements C3999p0.a {
        C2969c() {
        }

        @Override // p100d9.C3999p0.a
        /* renamed from: a */
        public void mo11948a(int i10) {
            C3991l0 c3991l0 = UserCenterActivity.this.f11731G;
            boolean z10 = false;
            if (c3991l0 != null && c3991l0.m16880a(i10)) {
                z10 = true;
            }
            if (z10) {
                C3999p0 c3999p0 = UserCenterActivity.this.f11730F;
                if (c3999p0 != null) {
                    c3999p0.m16908x(true);
                }
                C3991l0 c3991l02 = UserCenterActivity.this.f11731G;
                if (c3991l02 != null) {
                    c3991l02.m16882c(i10);
                }
            }
        }

        @Override // p100d9.C3999p0.a
        /* renamed from: b */
        public void mo11949b(int i10, boolean z10) {
            if (z10) {
                ((ViewPager2) UserCenterActivity.this.m11945i6(R$id.mViewPager)).setCurrentItem(i10);
            }
        }
    }

    /* renamed from: com.mine.ui.activity.UserCenterActivity$d */
    /* loaded from: classes2.dex */
    static final class C2970d extends AbstractC5869l implements InterfaceC5642a {
        C2970d() {
            super(0);
        }

        /* renamed from: a */
        public final void m11950a() {
            ((VerticalGridView) UserCenterActivity.this.m11945i6(R$id.mTabRecyclerview)).requestFocus();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11950a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: s6 */
    private final void m11940s6() {
        List m6989h;
        List list;
        C4011w c4011w;
        List list2;
        List list3;
        String string = getResources().getString(R$string.personal_my_account);
        AbstractC5868k.m23673e(string, "resources.getString(R.string.personal_my_account)");
        C4011w c4011w2 = new C4011w(1, string, Integer.valueOf(R$mipmap.icon_person_my_account_normal), Integer.valueOf(R$mipmap.icon_person_my_account_second), Integer.valueOf(R$mipmap.icon_person_my_account_focus));
        boolean z10 = false;
        String string2 = getResources().getString(R$string.personal_my_subscribe);
        AbstractC5868k.m23673e(string2, "resources.getString(R.st…ng.personal_my_subscribe)");
        String string3 = getResources().getString(R$string.personal_share_app);
        AbstractC5868k.m23673e(string3, "resources.getString(R.string.personal_share_app)");
        String string4 = getResources().getString(R$string.personal_lock);
        AbstractC5868k.m23673e(string4, "resources.getString(R.string.personal_lock)");
        String string5 = getResources().getString(R$string.personal_playback_settings);
        AbstractC5868k.m23673e(string5, "resources.getString(R.st…rsonal_playback_settings)");
        String string6 = getResources().getString(R$string.personal_feedback);
        AbstractC5868k.m23673e(string6, "resources.getString(R.string.personal_feedback)");
        String string7 = getResources().getString(R$string.about_me);
        AbstractC5868k.m23673e(string7, "resources.getString(R.string.about_me)");
        String string8 = getResources().getString(R$string.personal_set_up);
        AbstractC5868k.m23673e(string8, "resources.getString(R.string.personal_set_up)");
        m6989h = AbstractC1500l.m6989h(c4011w2, new C4011w(4, string2, Integer.valueOf(R$mipmap.icon_person_my_list_normal), Integer.valueOf(R$mipmap.icon_person_my_list_second), Integer.valueOf(R$mipmap.icon_person_my_list_focus)), new C4011w(5, string3, Integer.valueOf(R$mipmap.icon_person_share_app_normal), Integer.valueOf(R$mipmap.icon_person_share_app_second), Integer.valueOf(R$mipmap.icon_person_share_app_focus)), new C4011w(6, string4, Integer.valueOf(R$mipmap.icon_person_lock_normal), Integer.valueOf(R$mipmap.icon_person_lock_second), Integer.valueOf(R$mipmap.icon_person_lock_focus)), new C4011w(7, string5, Integer.valueOf(R$mipmap.icon_person_playback_settings_normal), Integer.valueOf(R$mipmap.icon_person_playback_settings_second), Integer.valueOf(R$mipmap.icon_person_playback_settings_focus)), new C4011w(8, string6, Integer.valueOf(R$mipmap.icon_person_feedback_normal), Integer.valueOf(R$mipmap.icon_person_feedback_second), Integer.valueOf(R$mipmap.icon_person_feedback_focus)), new C4011w(9, string7, Integer.valueOf(R$mipmap.icon_person_about_us_normal), Integer.valueOf(R$mipmap.icon_person_about_us_second), Integer.valueOf(R$mipmap.icon_person_about_us_focus)), new C4011w(10, string8, Integer.valueOf(R$mipmap.icon_person_set_up_normal), Integer.valueOf(R$mipmap.icon_person_set_up_second), Integer.valueOf(R$mipmap.icon_person_set_up_focus)));
        this.f11729E = m6989h;
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6838K() && (list2 = this.f11729E) != null && list2.size() > 1 && (list3 = this.f11729E) != null) {
            String string9 = getResources().getString(R$string.personal_member_center);
            AbstractC5868k.m23673e(string9, "resources.getString(R.st…g.personal_member_center)");
            list3.add(1, new C4011w(2, string9, Integer.valueOf(R$mipmap.icon_person_member_center_normal), Integer.valueOf(R$mipmap.icon_person_member_center_second), Integer.valueOf(R$mipmap.icon_person_member_center_focus)));
        }
        if (c1466m0.m6840M() && (list = this.f11729E) != null && list.size() > 1) {
            List list4 = this.f11729E;
            if (list4 != null && (c4011w = (C4011w) list4.get(1)) != null && c4011w.m16952d() == 2) {
                z10 = true;
            }
            if (z10) {
                List list5 = this.f11729E;
                if (list5 != null) {
                    String string10 = getResources().getString(R$string.personal_order_history);
                    AbstractC5868k.m23673e(string10, "resources.getString(R.st…g.personal_order_history)");
                    list5.add(2, new C4011w(3, string10, Integer.valueOf(R$mipmap.icon_person_order_history_normal), Integer.valueOf(R$mipmap.icon_person_order_history_second), Integer.valueOf(R$mipmap.icon_person_order_history_focus)));
                    return;
                }
                return;
            }
            List list6 = this.f11729E;
            if (list6 != null) {
                String string11 = getResources().getString(R$string.personal_order_history);
                AbstractC5868k.m23673e(string11, "resources.getString(R.st…g.personal_order_history)");
                list6.add(1, new C4011w(3, string11, Integer.valueOf(R$mipmap.icon_person_order_history_normal), Integer.valueOf(R$mipmap.icon_person_order_history_second), Integer.valueOf(R$mipmap.icon_person_order_history_focus)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w6 */
    public static final boolean m11941w6(UserCenterActivity userCenterActivity, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(userCenterActivity, "this$0");
        boolean z10 = false;
        if (keyEvent.getKeyCode() != 22 || ((VerticalGridView) userCenterActivity.m11945i6(R$id.mTabRecyclerview)).getFocusedChild() == null) {
            return false;
        }
        C3991l0 c3991l0 = userCenterActivity.f11731G;
        if (c3991l0 != null && c3991l0.m16880a(((ViewPager2) userCenterActivity.m11945i6(R$id.mViewPager)).getCurrentItem())) {
            z10 = true;
        }
        if (z10) {
            C3999p0 c3999p0 = userCenterActivity.f11730F;
            if (c3999p0 != null) {
                c3999p0.m16908x(true);
            }
            C3991l0 c3991l02 = userCenterActivity.f11731G;
            if (c3991l02 != null) {
                c3991l02.m16882c(((ViewPager2) userCenterActivity.m11945i6(R$id.mViewPager)).getCurrentItem());
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6 */
    public static final void m11942x6(UserCenterActivity userCenterActivity) {
        AbstractC5868k.m23674f(userCenterActivity, "this$0");
        ((VerticalGridView) userCenterActivity.m11945i6(R$id.mTabRecyclerview)).requestFocus();
    }

    /* renamed from: y6 */
    private final void m11943y6() {
        if (this.f11731G == null) {
            this.f11731G = new C3991l0(this);
            int i10 = R$id.mViewPager;
            View childAt = ((ViewPager2) m11945i6(i10)).getChildAt(0);
            AbstractC5868k.m23672d(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) childAt;
            recyclerView.setClipToPadding(false);
            recyclerView.setClipChildren(false);
            ((ViewPager2) m11945i6(i10)).setUserInputEnabled(false);
            ((ViewPager2) m11945i6(i10)).setAdapter(this.f11731G);
            ((ViewPager2) m11945i6(i10)).setOrientation(1);
            ViewPager2 viewPager2 = (ViewPager2) m11945i6(i10);
            AbstractC5868k.m23673e(viewPager2, "mViewPager");
            AbstractC7604r1.m29250a(viewPager2);
            ((ViewPager2) m11945i6(i10)).registerOnPageChangeCallback(this.f11737M);
            ((ViewPager2) m11945i6(i10)).post(new Runnable() { // from class: l9.e
                @Override // java.lang.Runnable
                public final void run() {
                    UserCenterActivity.m11944z6(UserCenterActivity.this);
                }
            });
        }
        C3991l0 c3991l0 = this.f11731G;
        if (c3991l0 != null) {
            c3991l0.m16883d(this.f11729E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z6 */
    public static final void m11944z6(UserCenterActivity userCenterActivity) {
        String str;
        C4011w c4011w;
        AbstractC5868k.m23674f(userCenterActivity, "this$0");
        int i10 = R$id.mViewPager;
        ((ViewPager2) userCenterActivity.m11945i6(i10)).setCurrentItem(userCenterActivity.f11733I, false);
        List list = userCenterActivity.f11729E;
        AbstractC5774c abstractC5774c = null;
        if (list != null && (c4011w = (C4011w) list.get(userCenterActivity.f11733I)) != null) {
            str = c4011w.m16953e();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, userCenterActivity.getResources().getString(R$string.personal_member_center))) {
            C3991l0 c3991l0 = userCenterActivity.f11731G;
            if (c3991l0 != null) {
                abstractC5774c = c3991l0.m16881b(((ViewPager2) userCenterActivity.m11945i6(i10)).getCurrentItem());
            }
            C3999p0 c3999p0 = userCenterActivity.f11730F;
            if (c3999p0 != null) {
                c3999p0.m16908x(true);
            }
            if (abstractC5774c != null) {
                abstractC5774c.mo23280R9(userCenterActivity.f11734J, true);
            }
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void closePersonalMessage(ClosePersonalEvent closePersonalEvent) {
        AbstractC5868k.m23674f(closePersonalEvent, "event");
        finish();
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        this.f11733I = getIntent().getIntExtra("SELECTED_POSITION", 0);
        this.f11734J = getIntent().getIntExtra("SELECTED_FRAGMENT_POSITION", 0);
        m11940s6();
        m11947t6();
        m11943y6();
    }

    /* renamed from: i6 */
    public View m11945i6(int i10) {
        Map map = this.f11738N;
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

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        AbstractC5774c abstractC5774c;
        boolean z11;
        AbstractC5868k.m23674f(keyEvent, "event");
        boolean z12 = false;
        if (keyEvent.getAction() == 0) {
            C3991l0 c3991l0 = this.f11731G;
            if (c3991l0 != null && c3991l0.m16880a(((ViewPager2) m11945i6(R$id.mViewPager)).getCurrentItem())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                C3991l0 c3991l02 = this.f11731G;
                if (c3991l02 != null) {
                    abstractC5774c = c3991l02.m16881b(((ViewPager2) m11945i6(R$id.mViewPager)).getCurrentItem());
                } else {
                    abstractC5774c = null;
                }
                if (abstractC5774c != null) {
                    z11 = abstractC5774c.onKeyDown(i10, keyEvent);
                } else {
                    z11 = false;
                }
                if (abstractC5774c != null) {
                    abstractC5774c.m23278P9(new C2970d());
                }
                if (z11) {
                    return true;
                }
            }
            if (i10 == 4) {
                finish();
                z12 = true;
            }
        }
        if (z12) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: r6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4411g mo7516s5() {
        return new C4918j(this, this);
    }

    @InterfaceC7719m
    public final void refreshUerInfoDisplayMessage(RefreshUerInfoDisplayEvent refreshUerInfoDisplayEvent) {
        AbstractC5868k.m23674f(refreshUerInfoDisplayEvent, "event");
        m11940s6();
        m11947t6();
        m11943y6();
    }

    /* renamed from: t6 */
    public final void m11947t6() {
        View view;
        C3999p0 c3999p0 = new C3999p0();
        this.f11730F = c3999p0;
        c3999p0.m28856n(this.f11729E);
        C3999p0 c3999p02 = this.f11730F;
        if (c3999p02 != null) {
            c3999p02.m16907w(this.f11736L);
        }
        int i10 = R$id.mTabRecyclerview;
        ((VerticalGridView) m11945i6(i10)).setAdapter(this.f11730F);
        ((VerticalGridView) m11945i6(i10)).setHasFixedSize(true);
        ((VerticalGridView) m11945i6(i10)).smoothScrollToPosition(this.f11733I);
        RecyclerView.AbstractC0797p layoutManager = ((VerticalGridView) m11945i6(i10)).getLayoutManager();
        View view2 = null;
        if (layoutManager != null) {
            view = layoutManager.findViewByPosition(this.f11735K);
        } else {
            view = null;
        }
        if (view != null) {
            view.setSelected(false);
        }
        RecyclerView.AbstractC0797p layoutManager2 = ((VerticalGridView) m11945i6(i10)).getLayoutManager();
        if (layoutManager2 != null) {
            view2 = layoutManager2.findViewByPosition(this.f11733I);
        }
        if (view2 != null) {
            view2.setSelected(true);
        }
        ((VerticalGridView) m11945i6(i10)).setOnUnhandledKeyListener(new AbstractC3050a.h() { // from class: l9.f
            @Override // com.open.leanback.widget.AbstractC3050a.h
            /* renamed from: a */
            public final boolean mo489a(KeyEvent keyEvent) {
                boolean m11941w6;
                m11941w6 = UserCenterActivity.m11941w6(UserCenterActivity.this, keyEvent);
                return m11941w6;
            }
        });
        ((VerticalGridView) m11945i6(i10)).post(new Runnable() { // from class: l9.g
            @Override // java.lang.Runnable
            public final void run() {
                UserCenterActivity.m11942x6(UserCenterActivity.this);
            }
        });
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_usercenter;
    }
}
