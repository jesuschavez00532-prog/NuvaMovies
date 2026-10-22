package com.main.p067ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0729o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.advertlib.bean.AdInfo;
import com.download.activity.DownloadActivity;
import com.main.R$id;
import com.main.R$string;
import com.main.p067ui.activity.HomeActivity;
import com.mine.p068ui.activity.UserCenterActivity;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.bean.TabBean;
import com.module.event.AdLoadCompleteEvent;
import com.module.event.AwakenVoiceAssistEvent;
import com.module.event.CloseForceBindEvent;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.event.MsgUnReadSizeUpdateEvent;
import com.module.event.PlayVoiceSearchLiveEvent;
import com.module.event.RefreshTableTitleEvent;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.module.event.ShowErrorMsgEvent;
import com.module.event.ShowJoinMembershipEvent;
import com.module.event.TimeChangedEvent;
import com.module.event.UpdateCouponReceiveStatus;
import com.module.event.UsbChangedEvent;
import com.module.view.AdvertiseLayout;
import com.open.leanback.widget.VerticalGridView;
import com.request.result.BaseResult;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.LoginResult;
import com.vod.p089ui.activity.FilterActivity;
import com.vod.p089ui.activity.VodSearchActivity;
import com.vod.view.NotificationBar;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.C5543b;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import np.dcc.protect.EntryPoint;
import org.greenrobot.eventbus.ThreadMode;
import p011aa.InterfaceC0124b;
import p029b9.C1192c;
import p043ce.AbstractC1500l;
import p102db.C4053l;
import p127f5.AbstractC4245i;
import p141g2.C4338b;
import p161ha.DialogC4761d0;
import p161ha.InterfaceC4786n;
import p161ha.ViewOnClickListenerC4757c;
import p161ha.ViewOnClickListenerC4775i;
import p161ha.ViewOnClickListenerC4784m;
import p161ha.ViewOnClickListenerC4799t0;
import p161ha.ViewOnClickListenerC4802v;
import p170i2.C4842a;
import p195jc.C5048a;
import p198k.C5076a;
import p223l8.C5500t;
import p315r9.InterfaceC6565c;
import p343tb.AbstractC6929a;
import p348u2.AbstractC7028e;
import p354u8.C7059h;
import p369v8.InterfaceC7249a;
import p387wd.C7414k;
import p398x8.C7523p;
import p399x9.C7549x;
import p400xa.C7556b1;
import p400xa.C7584l;
import p400xa.C7589m1;
import p400xa.C7618x0;
import p400xa.C7619y;
import p421z0.C7734h;
import va.InterfaceC7251a;
import ye.C7709c;
import ye.InterfaceC7719m;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC2972a implements InterfaceC7249a, InterfaceC6565c {

    /* renamed from: E */
    private boolean f11451E;

    /* renamed from: F */
    private final int f11452F;

    /* renamed from: G */
    private final InterfaceC1312h f11453G;

    /* renamed from: H */
    private final String f11454H;

    /* renamed from: I */
    private C7549x f11455I;

    /* renamed from: J */
    private C7059h f11456J;

    /* renamed from: K */
    private ArrayList f11457K;

    /* renamed from: L */
    private ArrayList f11458L;

    /* renamed from: M */
    private int f11459M;

    /* renamed from: N */
    private C5048a f11460N;

    /* renamed from: O */
    private C5500t f11461O;

    /* renamed from: V */
    private GetAuthInfoResultData f11462V;

    /* renamed from: W */
    private final InterfaceC1312h f11463W;

    /* renamed from: X */
    private final InterfaceC1312h f11464X;

    /* renamed from: Y */
    private List f11465Y;

    /* renamed from: Z */
    private ViewOnClickListenerC4784m f11466Z;

    /* renamed from: g0 */
    private boolean f11467g0;

    /* renamed from: h0 */
    private boolean f11468h0;

    /* renamed from: i0 */
    private ViewOnClickListenerC4775i f11469i0;

    /* renamed from: j0 */
    private ViewOnClickListenerC4802v f11470j0;

    /* renamed from: k0 */
    private final InterfaceC1312h f11471k0;

    /* renamed from: l0 */
    private boolean f11472l0;

    /* renamed from: m0 */
    private int f11473m0;

    /* renamed from: n0 */
    private int f11474n0;

    /* renamed from: o0 */
    private final InterfaceC1312h f11475o0;

    /* renamed from: p0 */
    private final InterfaceC1312h f11476p0;

    /* renamed from: q0 */
    private final C2951p f11477q0;

    /* renamed from: r0 */
    private final C2950o f11478r0;

    /* renamed from: s0 */
    private final InterfaceC1312h f11479s0;

    /* renamed from: t0 */
    private C2942h f11480t0;

    /* renamed from: u0 */
    public Map f11481u0 = new LinkedHashMap();

    /* renamed from: com.main.ui.activity.HomeActivity$a */
    /* loaded from: classes2.dex */
    static final class C2928a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C2928a f11482a = new C2928a();

        C2928a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            int i10;
            if (C4842a.f20329a.m19920a().m19938O()) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            return Integer.valueOf(i10);
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$a0 */
    /* loaded from: classes2.dex */
    static final class C2929a0 extends AbstractC5869l implements InterfaceC5642a {
        C2929a0() {
            super(0);
        }

        /* renamed from: a */
        public final void m11858a() {
            C7619y.f28056a.m29369b(HomeActivity.this.m30049S4(), UserCenterActivity.class);
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11858a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$b */
    /* loaded from: classes2.dex */
    static final class C2930b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C2930b f11484a = new C2930b();

        C2930b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            int i10;
            if (C4842a.f20329a.m19920a().m19938O()) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            return Integer.valueOf(i10);
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$b0 */
    /* loaded from: classes2.dex */
    static final class C2931b0 extends AbstractC5869l implements InterfaceC5642a {
        C2931b0() {
            super(0);
        }

        /* renamed from: a */
        public final void m11860a() {
            HomeActivity.this.f11461O.m22353za();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11860a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$c */
    /* loaded from: classes2.dex */
    static final class C2932c extends AbstractC5869l implements InterfaceC5660l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.main.ui.activity.HomeActivity$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final a f11487a = new a();

            a() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "intent");
                Intent putExtra = intent.putExtra("vod_type", "");
                AbstractC5868k.m23673e(putExtra, "intent.putExtra(VodSearc…ctivity.KEY_VOD_TYPE, \"\")");
                return putExtra;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.main.ui.activity.HomeActivity$c$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final b f11488a = new b();

            b() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "intent");
                Intent putExtra = intent.putExtra("SELECTED_POSITION", 3);
                AbstractC5868k.m23673e(putExtra, "intent.putExtra(com.mine…erCenterActivity.TYPE, 3)");
                return putExtra;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.main.ui.activity.HomeActivity$c$c */
        /* loaded from: classes2.dex */
        public static final class c extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final c f11489a = new c();

            c() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "intent");
                Intent putExtra = intent.putExtra("SELECTED_POSITION", 2);
                AbstractC5868k.m23673e(putExtra, "intent.putExtra(com.mine…erCenterActivity.TYPE, 2)");
                return putExtra;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.main.ui.activity.HomeActivity$c$d */
        /* loaded from: classes2.dex */
        public static final class d extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final d f11490a = new d();

            d() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "intent");
                Intent putExtra = intent.putExtra("SELECTED_POSITION", 3);
                AbstractC5868k.m23673e(putExtra, "intent.putExtra(com.mine…erCenterActivity.TYPE, 3)");
                return putExtra;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.main.ui.activity.HomeActivity$c$e */
        /* loaded from: classes2.dex */
        public static final class e extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final e f11491a = new e();

            e() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "intent");
                Intent putExtra = intent.putExtra("SELECTED_POSITION", 1);
                AbstractC5868k.m23673e(putExtra, "intent.putExtra(com.mine…erCenterActivity.TYPE, 1)");
                return putExtra;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.main.ui.activity.HomeActivity$c$f */
        /* loaded from: classes2.dex */
        public static final class f extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final f f11492a = new f();

            f() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "intent");
                Intent putExtra = intent.putExtra("SELECTED_POSITION", 1);
                AbstractC5868k.m23673e(putExtra, "intent.putExtra(com.mine…erCenterActivity.TYPE, 1)");
                return putExtra;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.main.ui.activity.HomeActivity$c$g */
        /* loaded from: classes2.dex */
        public static final class g extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ HomeActivity f11493a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(HomeActivity homeActivity) {
                super(1);
                this.f11493a = homeActivity;
            }

            /* renamed from: a */
            public final void m11870a(Boolean bool) {
                AbstractC5868k.m23673e(bool, "it");
                if (bool.booleanValue()) {
                    C7589m1.f27886a.m29146o(3);
                    C7619y.f28056a.m29369b(this.f11493a.m30049S4(), DownloadActivity.class);
                }
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m11870a((Boolean) obj);
                return C1328x.f4998a;
            }
        }

        C2932c() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m11862e(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            interfaceC5660l.mo542f(obj);
        }

        /* renamed from: d */
        public final void m11863d(int i10) {
            switch (i10) {
                case 0:
                    C7589m1 c7589m1 = C7589m1.f27886a;
                    c7589m1.m29146o(6);
                    c7589m1.m29147p();
                    c7589m1.m29122E();
                    C7619y.m29367d(C7619y.f28056a, HomeActivity.this.m30049S4(), VodSearchActivity.class, null, a.f11487a, 2, null);
                    return;
                case 1:
                    C7589m1.f27886a.m29146o(1);
                    C7619y.f28056a.m29369b(HomeActivity.this.m30049S4(), UserCenterActivity.class);
                    return;
                case 2:
                    C7589m1.f27886a.m29146o(4);
                    C1466m0 c1466m0 = C1466m0.f5627a;
                    if (c1466m0.m6839L()) {
                        if (c1466m0.m6838K()) {
                            C7619y.m29367d(C7619y.f28056a, HomeActivity.this.m30049S4(), UserCenterActivity.class, null, b.f11488a, 2, null);
                            return;
                        } else {
                            C7619y.m29367d(C7619y.f28056a, HomeActivity.this.m30049S4(), UserCenterActivity.class, null, c.f11489a, 2, null);
                            return;
                        }
                    }
                    if (c1466m0.m6838K()) {
                        C7619y.m29367d(C7619y.f28056a, HomeActivity.this.m30049S4(), UserCenterActivity.class, null, d.f11490a, 2, null);
                        return;
                    } else {
                        C7619y.m29367d(C7619y.f28056a, HomeActivity.this.m30049S4(), UserCenterActivity.class, null, e.f11491a, 2, null);
                        return;
                    }
                case 3:
                    C7589m1.f27886a.m29146o(5);
                    HomeActivity.this.m11818s7();
                    return;
                case 4:
                    C7589m1.f27886a.m29146o(0);
                    C7619y.m29367d(C7619y.f28056a, HomeActivity.this.m30049S4(), UserCenterActivity.class, null, f.f11492a, 2, null);
                    return;
                case 5:
                    Observable m22472n = new C5543b(HomeActivity.this).m22472n("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
                    final g gVar = new g(HomeActivity.this);
                    m22472n.subscribe(new Consumer() { // from class: com.main.ui.activity.a
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            HomeActivity.C2932c.m11862e(InterfaceC5660l.this, obj);
                        }
                    });
                    return;
                case 6:
                    C7589m1 c7589m12 = C7589m1.f27886a;
                    c7589m12.m29146o(8);
                    c7589m12.m29141j();
                    c7589m12.m29121D();
                    C7619y.f28056a.m29369b(HomeActivity.this.m30049S4(), FilterActivity.class);
                    return;
                default:
                    return;
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11863d(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$c0 */
    /* loaded from: classes2.dex */
    static final class C2933c0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ boolean f11494a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2933c0(boolean z10) {
            super(1);
            this.f11494a = z10;
        }

        /* renamed from: a */
        public final void m11871a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(this.f11494a, true, loginResult));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11871a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$d */
    /* loaded from: classes2.dex */
    static final class C2934d extends AbstractC5869l implements InterfaceC5642a {
        C2934d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(AutoSizeUtils.dp2px(HomeActivity.this, 83.0f));
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$d0 */
    /* loaded from: classes2.dex */
    static final class C2935d0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C2935d0 f11496a = new C2935d0();

        C2935d0() {
            super(1);
        }

        /* renamed from: a */
        public final void m11873a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11873a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$e */
    /* loaded from: classes2.dex */
    static final class C2936e extends AbstractC5869l implements InterfaceC5642a {
        C2936e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(AutoSizeUtils.dp2px(HomeActivity.this, 236.0f));
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$e0 */
    /* loaded from: classes2.dex */
    public static final class C2937e0 implements ViewOnClickListenerC4799t0.a {

        /* renamed from: com.main.ui.activity.HomeActivity$e0$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final a f11499a = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m11877a(LoginResult loginResult) {
                C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m11877a((LoginResult) obj);
                return C1328x.f4998a;
            }
        }

        C2937e0() {
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: a */
        public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3294d4 = HomeActivity.this.m3294d4();
                AbstractC5868k.m23673e(m3294d4, "supportFragmentManager");
                InterfaceC7251a.a.m28064a(interfaceC7251a, m3294d4, false, null, a.f11499a, 4, null);
            }
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: b */
        public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$f */
    /* loaded from: classes2.dex */
    static final class C2938f extends AbstractC5869l implements InterfaceC5660l {
        C2938f() {
            super(1);
        }

        /* renamed from: a */
        public final void m11878a(Integer num) {
            NotificationBar notificationBar = (NotificationBar) HomeActivity.this.m11849t6(R$id.mNotificationBar);
            AbstractC5868k.m23673e(num, "it");
            notificationBar.setMsgNumber(num.intValue());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11878a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$f0 */
    /* loaded from: classes2.dex */
    public static final class C2939f0 implements ViewOnClickListenerC4775i.a {

        /* renamed from: com.main.ui.activity.HomeActivity$f0$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final a f11502a = new a();

            a() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "intent");
                Intent putExtra = intent.putExtra("SELECTED_POSITION", 0);
                AbstractC5868k.m23673e(putExtra, "intent.putExtra(com.mine…erCenterActivity.TYPE, 0)");
                return putExtra;
            }
        }

        C2939f0() {
        }

        @Override // p161ha.ViewOnClickListenerC4775i.a
        /* renamed from: a */
        public void mo11879a(ViewOnClickListenerC4775i viewOnClickListenerC4775i) {
            AbstractC5868k.m23674f(viewOnClickListenerC4775i, "dialog");
            HomeActivity.this.m11814q7(true, true);
        }

        @Override // p161ha.ViewOnClickListenerC4775i.a
        /* renamed from: b */
        public void mo11880b(ViewOnClickListenerC4775i viewOnClickListenerC4775i) {
            AbstractC5868k.m23674f(viewOnClickListenerC4775i, "dialog");
            C7619y.m29367d(C7619y.f28056a, HomeActivity.this.m30049S4(), UserCenterActivity.class, null, a.f11502a, 2, null);
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$g */
    /* loaded from: classes2.dex */
    static final class C2940g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C2940g f11503a = new C2940g();

        C2940g() {
            super(1);
        }

        /* renamed from: a */
        public final void m11882a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11882a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$g0 */
    /* loaded from: classes2.dex */
    public static final class C2941g0 implements ViewOnClickListenerC4775i.a {
        C2941g0() {
        }

        @Override // p161ha.ViewOnClickListenerC4775i.a
        /* renamed from: a */
        public void mo11879a(ViewOnClickListenerC4775i viewOnClickListenerC4775i) {
            AbstractC5868k.m23674f(viewOnClickListenerC4775i, "dialog");
        }

        @Override // p161ha.ViewOnClickListenerC4775i.a
        /* renamed from: b */
        public void mo11880b(ViewOnClickListenerC4775i viewOnClickListenerC4775i) {
            AbstractC5868k.m23674f(viewOnClickListenerC4775i, "dialog");
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$h */
    /* loaded from: classes2.dex */
    public static final class C2942h implements C7618x0.a {
        C2942h() {
        }

        @Override // p400xa.C7618x0.a
        /* renamed from: a */
        public void mo11883a(int i10, KeyEvent keyEvent) {
            AbstractC5868k.m23674f(keyEvent, "event");
        }

        @Override // p400xa.C7618x0.a
        /* renamed from: b */
        public void mo11884b(boolean z10, boolean z11, String str) {
            AbstractC5868k.m23674f(str, "errCode");
            C7734h.f28449q.m29905a().m29899t();
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$h0 */
    /* loaded from: classes2.dex */
    public static final class C2943h0 extends AbstractC6929a {
        C2943h0() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(BaseResult baseResult) {
            AbstractC5868k.m23674f(baseResult, "t");
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$i */
    /* loaded from: classes2.dex */
    public static final class C2944i implements C5500t.b {
        C2944i() {
        }

        @Override // p223l8.C5500t.b
        /* renamed from: a */
        public void mo11886a(boolean z10) {
            HomeActivity.this.f11472l0 = z10;
            AbstractC7028e.m27119e(0, "a" + (z10 ? 1 : 0));
            HomeActivity.this.m11847m7(z10);
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$j */
    /* loaded from: classes2.dex */
    static final class C2945j extends AbstractC5869l implements InterfaceC5660l {
        C2945j() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m11888e(HomeActivity homeActivity, View view) {
            AbstractC5868k.m23674f(homeActivity, "this$0");
            AbstractC5868k.m23674f(view, "$targetView");
            homeActivity.m11778K6(view);
        }

        /* renamed from: d */
        public final void m11889d(final View view) {
            AbstractC5868k.m23674f(view, "targetView");
            final HomeActivity homeActivity = HomeActivity.this;
            view.post(new Runnable() { // from class: com.main.ui.activity.b
                @Override // java.lang.Runnable
                public final void run() {
                    HomeActivity.C2945j.m11888e(HomeActivity.this, view);
                }
            });
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11889d((View) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$k */
    /* loaded from: classes2.dex */
    static final class C2946k extends AbstractC5869l implements InterfaceC5642a {
        C2946k() {
            super(0);
        }

        /* renamed from: a */
        public final void m11890a() {
            ((NotificationBar) HomeActivity.this.m11849t6(R$id.mNotificationBar)).m16602t();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11890a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$l */
    /* loaded from: classes2.dex */
    static final class C2947l extends AbstractC5869l implements InterfaceC5642a {
        C2947l() {
            super(0);
        }

        /* renamed from: a */
        public final void m11891a() {
            C7549x c7549x = HomeActivity.this.f11455I;
            if (c7549x != null) {
                c7549x.m28925m(false);
            }
            HomeActivity.this.m11777J6(false);
            HomeActivity homeActivity = HomeActivity.this;
            int i10 = R$id.mGridTab;
            ((VerticalGridView) homeActivity.m11849t6(i10)).requestFocus();
            ((VerticalGridView) HomeActivity.this.m11849t6(i10)).setSelectedPositionSmooth(HomeActivity.this.f11459M);
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11891a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$m */
    /* loaded from: classes2.dex */
    static final class C2948m extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C2948m f11510a = new C2948m();

        C2948m() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1192c invoke() {
            return new C1192c();
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$n */
    /* loaded from: classes2.dex */
    static final class C2949n extends AbstractC5869l implements InterfaceC5642a {
        C2949n() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7414k invoke() {
            return new C7414k(HomeActivity.this);
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$o */
    /* loaded from: classes2.dex */
    public static final class C2950o extends ViewPager2.OnPageChangeCallback {
        C2950o() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            View view;
            View view2;
            AbstractC7028e.m27119e(1, "b" + i10);
            HomeActivity homeActivity = HomeActivity.this;
            int i11 = R$id.mGridTab;
            InterfaceC0124b interfaceC0124b = null;
            if (((VerticalGridView) homeActivity.m11849t6(i11)).getFocusedChild() == null) {
                ((VerticalGridView) HomeActivity.this.m11849t6(i11)).smoothScrollToPosition(i10);
                RecyclerView.AbstractC0797p layoutManager = ((VerticalGridView) HomeActivity.this.m11849t6(i11)).getLayoutManager();
                if (layoutManager != null) {
                    view = layoutManager.findViewByPosition(HomeActivity.this.f11459M);
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setSelected(false);
                }
                RecyclerView.AbstractC0797p layoutManager2 = ((VerticalGridView) HomeActivity.this.m11849t6(i11)).getLayoutManager();
                if (layoutManager2 != null) {
                    view2 = layoutManager2.findViewByPosition(i10);
                } else {
                    view2 = null;
                }
                if (view2 != null) {
                    view2.setSelected(true);
                }
            }
            C7059h c7059h = HomeActivity.this.f11456J;
            if (c7059h != null) {
                interfaceC0124b = c7059h.m27201d(((ViewPager2) HomeActivity.this.m11849t6(R$id.mViewPager)).getCurrentItem());
            }
            if (!AbstractC5868k.m23669a(interfaceC0124b, HomeActivity.this.f11461O)) {
                HomeActivity.this.f11461O.m22349ua();
            }
            HomeActivity.this.f11459M = i10;
            ((AdvertiseLayout) HomeActivity.this.m11849t6(R$id.adLayout)).setColumnUrl(C7584l.f27868a.m29104b(((TabBean) HomeActivity.this.m11787V6().get(i10)).getTitleStr(), HomeActivity.this.m30049S4()));
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$p */
    /* loaded from: classes2.dex */
    public static final class C2951p implements C7549x.a {
        C2951p() {
        }

        @Override // p399x9.C7549x.a
        /* renamed from: a */
        public void mo11894a(int i10) {
            boolean z10;
            C7059h c7059h = HomeActivity.this.f11456J;
            if (c7059h != null && c7059h.m27200c(i10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || ((ViewPager2) HomeActivity.this.m11849t6(R$id.mViewPager)).getCurrentItem() != i10) {
                C7549x c7549x = HomeActivity.this.f11455I;
                if (c7549x != null) {
                    c7549x.m28925m(false);
                }
                HomeActivity.this.m11777J6(false);
                ((VerticalGridView) HomeActivity.this.m11849t6(R$id.mGridTab)).requestFocus();
            } else {
                C7549x c7549x2 = HomeActivity.this.f11455I;
                if (c7549x2 != null) {
                    c7549x2.m28925m(true);
                }
                HomeActivity.this.m11777J6(true);
                C7059h c7059h2 = HomeActivity.this.f11456J;
                if (c7059h2 != null) {
                    c7059h2.m27202e(i10);
                }
            }
            if (i10 == 0 && ((ViewPager2) HomeActivity.this.m11849t6(R$id.mViewPager)).getCurrentItem() == i10) {
                HomeActivity.this.f11461O.m22351xa(true);
            } else {
                ((ViewPager2) HomeActivity.this.m11849t6(R$id.mViewPager)).setCurrentItem(i10);
            }
        }

        @Override // p399x9.C7549x.a
        /* renamed from: b */
        public void mo11895b(int i10, boolean z10) {
            if (z10) {
                ((ViewPager2) HomeActivity.this.m11849t6(R$id.mViewPager)).setCurrentItem(i10);
            }
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$q */
    /* loaded from: classes2.dex */
    static final class C2952q extends AbstractC5869l implements InterfaceC5642a {
        C2952q() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            ArrayList m6984c;
            String string = HomeActivity.this.getResources().getString(R$string.home_category_live);
            AbstractC5868k.m23673e(string, "resources.getString(R.string.home_category_live)");
            String string2 = HomeActivity.this.getResources().getString(R$string.home_category_featured);
            AbstractC5868k.m23673e(string2, "resources.getString(R.st…g.home_category_featured)");
            String string3 = HomeActivity.this.getResources().getString(R$string.home_category_movies);
            AbstractC5868k.m23673e(string3, "resources.getString(R.string.home_category_movies)");
            String string4 = HomeActivity.this.getResources().getString(R$string.home_category_series);
            AbstractC5868k.m23673e(string4, "resources.getString(R.string.home_category_series)");
            String string5 = HomeActivity.this.getResources().getString(R$string.home_category_kids);
            AbstractC5868k.m23673e(string5, "resources.getString(R.string.home_category_kids)");
            String string6 = HomeActivity.this.getResources().getString(R$string.home_category_anime);
            AbstractC5868k.m23673e(string6, "resources.getString(R.string.home_category_anime)");
            String string7 = HomeActivity.this.getResources().getString(R$string.home_category_showtime);
            AbstractC5868k.m23673e(string7, "resources.getString(R.st…g.home_category_showtime)");
            m6984c = AbstractC1500l.m6984c(new TabBean(string, 0, 2, null), new TabBean(string2, 0, 2, null), new TabBean(string3, 0, 2, null), new TabBean(string4, 0, 2, null), new TabBean(string5, 0, 2, null), new TabBean(string6, 0, 2, null), new TabBean(string7, 0, 2, null));
            return m6984c;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$r */
    /* loaded from: classes2.dex */
    static final class C2953r extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ ShowErrorMsgEvent f11516b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2953r(ShowErrorMsgEvent showErrorMsgEvent) {
            super(1);
            this.f11516b = showErrorMsgEvent;
        }

        /* renamed from: a */
        public final void m11897a(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (!HomeActivity.this.isFinishing()) {
                HomeActivity.this.m11812p7(this.f11516b);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11897a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$s */
    /* loaded from: classes2.dex */
    static final class C2954s extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ PlayVoiceSearchLiveEvent f11517a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2954s(PlayVoiceSearchLiveEvent playVoiceSearchLiveEvent) {
            super(1);
            this.f11517a = playVoiceSearchLiveEvent;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent mo542f(Intent intent) {
            AbstractC5868k.m23674f(intent, "it");
            Intent putExtra = intent.putExtra("voice_channel_code", this.f11517a.getChannelCode());
            AbstractC5868k.m23673e(putExtra, "it.putExtra(LiveVoiceSea…_CODE, event.channelCode)");
            return putExtra;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$t */
    /* loaded from: classes2.dex */
    static final class C2955t extends AbstractC5869l implements InterfaceC5642a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.main.ui.activity.HomeActivity$t$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final a f11519a = new a();

            a() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Intent mo542f(Intent intent) {
                AbstractC5868k.m23674f(intent, "it");
                Intent putExtra = intent.putExtra("SELECTED_POSITION", 0);
                AbstractC5868k.m23673e(putExtra, "it.putExtra(UserCenterActivity.TYPE,0)");
                return putExtra;
            }
        }

        C2955t() {
            super(0);
        }

        /* renamed from: a */
        public final void m11899a() {
            C7619y.m29367d(C7619y.f28056a, HomeActivity.this.m30049S4(), UserCenterActivity.class, null, a.f11519a, 2, null);
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11899a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$u */
    /* loaded from: classes2.dex */
    public static final class C2956u implements InterfaceC4786n {
        C2956u() {
        }

        @Override // p161ha.InterfaceC4786n
        /* renamed from: a */
        public void mo11901a() {
            ((C7523p) HomeActivity.this.m11977r5()).m28810s1();
        }

        @Override // p161ha.InterfaceC4786n
        public void cancel() {
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$v */
    /* loaded from: classes2.dex */
    public static final class C2957v implements ViewOnClickListenerC4802v.b {

        /* renamed from: b */
        final /* synthetic */ ViewOnClickListenerC4802v f11522b;

        /* renamed from: com.main.ui.activity.HomeActivity$v$a */
        /* loaded from: classes2.dex */
        public static final class a implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ HomeActivity f11523a;

            a(HomeActivity homeActivity) {
                this.f11523a = homeActivity;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                ((C7523p) this.f11523a.m11977r5()).m28794I0();
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: b */
            public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            }
        }

        /* renamed from: com.main.ui.activity.HomeActivity$v$b */
        /* loaded from: classes2.dex */
        public static final class b implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ HomeActivity f11524a;

            /* renamed from: b */
            final /* synthetic */ ViewOnClickListenerC4802v f11525b;

            /* renamed from: com.main.ui.activity.HomeActivity$v$b$a */
            /* loaded from: classes2.dex */
            static final class a extends AbstractC5869l implements InterfaceC5660l {

                /* renamed from: a */
                public static final a f11526a = new a();

                a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m11905a(LoginResult loginResult) {
                    C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
                }

                @Override // me.InterfaceC5660l
                /* renamed from: f */
                public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                    m11905a((LoginResult) obj);
                    return C1328x.f4998a;
                }
            }

            b(HomeActivity homeActivity, ViewOnClickListenerC4802v viewOnClickListenerC4802v) {
                this.f11524a = homeActivity;
                this.f11525b = viewOnClickListenerC4802v;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f11524a.f11470j0;
                if (viewOnClickListenerC4802v != null) {
                    viewOnClickListenerC4802v.mo3279p9();
                }
                InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
                if (interfaceC7251a != null) {
                    AbstractC0729o m3119R6 = this.f11525b.m3119R6();
                    AbstractC5868k.m23671c(m3119R6);
                    InterfaceC7251a.a.m28064a(interfaceC7251a, m3119R6, true, null, a.f11526a, 4, null);
                }
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: b */
            public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            }
        }

        C2957v(ViewOnClickListenerC4802v viewOnClickListenerC4802v) {
            this.f11522b = viewOnClickListenerC4802v;
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: a0 */
        public void mo11902a0() {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = HomeActivity.this.f11470j0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.mo3279p9();
            }
            ((C7523p) HomeActivity.this.m11977r5()).m28812t();
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: b0 */
        public void mo11903b0() {
            String str;
            String str2;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f11522b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f11522b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.operation_failed_tips)) == null) {
                str = "";
            }
            Context m3096J62 = this.f11522b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_confirm_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new a(HomeActivity.this), false, null, false, 384, null);
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: c0 */
        public void mo11904c0() {
            String str;
            String str2;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f11522b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f11522b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.login_invaild_text)) == null) {
                str = "";
            }
            Context m3096J62 = this.f11522b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_refresh_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new b(HomeActivity.this, this.f11522b), false, null, false, 384, null);
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$w */
    /* loaded from: classes2.dex */
    static final class C2958w extends AbstractC5869l implements InterfaceC5642a {
        C2958w() {
            super(0);
        }

        /* renamed from: a */
        public final void m11906a() {
            HomeActivity.m11816r7(HomeActivity.this, false, false, 2, null);
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11906a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$x */
    /* loaded from: classes2.dex */
    public static final class C2959x implements ViewOnClickListenerC4757c.a {
        C2959x() {
        }

        @Override // p161ha.ViewOnClickListenerC4757c.a
        /* renamed from: t */
        public void mo11907t() {
            HomeActivity.m11816r7(HomeActivity.this, false, false, 2, null);
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$y */
    /* loaded from: classes2.dex */
    public static final class C2960y implements C5076a.e {

        /* renamed from: b */
        final /* synthetic */ AdInfo f11530b;

        C2960y(AdInfo adInfo) {
            this.f11530b = adInfo;
        }

        @Override // p198k.C5076a.e
        /* renamed from: a */
        public void mo11400a(View view, int i10, ViewGroup viewGroup) {
            AbstractC5868k.m23674f(view, "view");
            if (HomeActivity.this.isFinishing()) {
                return;
            }
            DialogC4761d0 dialogC4761d0 = new DialogC4761d0(HomeActivity.this.m30049S4(), view);
            dialogC4761d0.m19689b(this.f11530b);
            dialogC4761d0.show();
        }
    }

    /* renamed from: com.main.ui.activity.HomeActivity$z */
    /* loaded from: classes2.dex */
    static final class C2961z extends AbstractC5869l implements InterfaceC5642a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.main.ui.activity.HomeActivity$z$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final a f11532a = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m11909a(LoginResult loginResult) {
                C7709c.m29787d().m29801m(new CloseForceBindEvent());
                C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m11909a((LoginResult) obj);
                return C1328x.f4998a;
            }
        }

        C2961z() {
            super(0);
        }

        /* renamed from: a */
        public final void m11908a() {
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3294d4 = HomeActivity.this.m3294d4();
                AbstractC5868k.m23673e(m3294d4, "supportFragmentManager");
                InterfaceC7251a.a.m28064a(interfaceC7251a, m3294d4, true, null, a.f11532a, 4, null);
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m11908a();
            return C1328x.f4998a;
        }
    }

    static {
        EntryPoint.stub(17);
    }

    public HomeActivity() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        InterfaceC1312h m5965b5;
        InterfaceC1312h m5965b6;
        InterfaceC1312h m5965b7;
        m5965b = AbstractC1314j.m5965b(new C2952q());
        this.f11453G = m5965b;
        this.f11454H = "HomeActivity";
        this.f11457K = new ArrayList();
        this.f11458L = new ArrayList();
        this.f11461O = new C5500t();
        m5965b2 = AbstractC1314j.m5965b(C2930b.f11484a);
        this.f11463W = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(C2928a.f11482a);
        this.f11464X = m5965b3;
        this.f11465Y = new ArrayList();
        m5965b4 = AbstractC1314j.m5965b(C2948m.f11510a);
        this.f11471k0 = m5965b4;
        this.f11473m0 = 1;
        m5965b5 = AbstractC1314j.m5965b(new C2936e());
        this.f11475o0 = m5965b5;
        m5965b6 = AbstractC1314j.m5965b(new C2934d());
        this.f11476p0 = m5965b6;
        this.f11477q0 = new C2951p();
        this.f11478r0 = new C2950o();
        m5965b7 = AbstractC1314j.m5965b(new C2949n());
        this.f11479s0 = m5965b7;
        this.f11480t0 = new C2942h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J6 */
    public final native void m11777J6(boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K6 */
    public final native void m11778K6(View view);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L6 */
    public static final native void m11779L6(C4053l c4053l, HomeActivity homeActivity);

    /* renamed from: M6 */
    private final native void m11780M6();

    /* renamed from: N6 */
    private final native void m11781N6();

    /* renamed from: P6 */
    private final native void m11782P6();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q6 */
    public static final native void m11783Q6(HomeActivity homeActivity, AbstractC4245i abstractC4245i);

    /* renamed from: R6 */
    private final native boolean m11784R6(int i10);

    /* renamed from: S6 */
    private final native int m11785S6();

    /* renamed from: T6 */
    private final native int m11786T6();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V6 */
    public final native ArrayList m11787V6();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X6 */
    public static final native Integer m11788X6();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y6 */
    public static final native void m11789Y6(InterfaceC5660l interfaceC5660l, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z6 */
    public static final native void m11790Z6(InterfaceC5660l interfaceC5660l, Object obj);

    /* renamed from: a7 */
    private final native void m11791a7();

    /* renamed from: b7 */
    private final native void m11792b7();

    /* renamed from: c7 */
    private final native void m11793c7();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d7 */
    public static final native boolean m11794d7(HomeActivity homeActivity, KeyEvent keyEvent);

    /* renamed from: e7 */
    private final native void m11796e7();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f7 */
    public static final native void m11797f7(HomeActivity homeActivity);

    /* renamed from: g7 */
    private final native void m11799g7();

    /* renamed from: h7 */
    private final native void m11801h7(String str);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i7 */
    public static final native boolean m11803i7(HomeActivity homeActivity);

    /* renamed from: j7 */
    private final native void m11805j7();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7 */
    public static final native void m11806k7();

    /* renamed from: l7 */
    private final native void m11808l7(boolean z10);

    /* renamed from: n7 */
    private final native void m11809n7();

    /* renamed from: o7 */
    private final native void m11810o7();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p7 */
    public final native void m11812p7(ShowErrorMsgEvent showErrorMsgEvent);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q7 */
    public final native void m11814q7(boolean z10, boolean z11);

    /* renamed from: r7 */
    static /* synthetic */ void m11816r7(HomeActivity homeActivity, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        homeActivity.m11814q7(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s7 */
    public final native void m11818s7();

    /* renamed from: t7 */
    private final native void m11819t7();

    /* renamed from: u7 */
    private final native void m11820u7();

    /* renamed from: v7 */
    private final native void m11821v7();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w7 */
    public static final native void m11823w7(HomeActivity homeActivity);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: A1 */
    public native void mo11827A1();

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: A5 */
    protected native boolean mo11828A5();

    @Override // p369v8.InterfaceC7249a
    /* renamed from: B */
    public native void mo11829B(String str);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: G3 */
    public native int mo11830G3();

    @Override // p369v8.InterfaceC7249a
    /* renamed from: O0 */
    public native void mo11831O0();

    /* renamed from: O6 */
    public final native void m11832O6(boolean z10);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: R */
    public native void mo11833R();

    @Override // p369v8.InterfaceC7249a
    /* renamed from: R1 */
    public native void mo11834R1();

    @Override // p315r9.InterfaceC6565c
    /* renamed from: U */
    public native void mo11835U();

    /* renamed from: U6 */
    public final native C7414k m11836U6();

    @Override // p369v8.InterfaceC7249a
    /* renamed from: W1 */
    public native void mo11837W1(AdInfo adInfo);

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: W6, reason: merged with bridge method [inline-methods] */
    public native C7523p mo7516s5();

    @InterfaceC7719m
    public final native void adLoadCompleteMessage(AdLoadCompleteEvent adLoadCompleteEvent);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: d0 */
    public native void mo11839d0(GetAuthInfoResult getAuthInfoResult);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: d2 */
    public native void mo11840d2(List list);

    @Override // com.module.basemvp.AbstractActivityC2972a, androidx.appcompat.app.AbstractActivityC0302c, androidx.core.app.AbstractActivityC0511i, android.app.Activity, android.view.Window.Callback
    public native boolean dispatchKeyEvent(KeyEvent keyEvent);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: e */
    public native void mo11841e();

    @Override // p315r9.InterfaceC6565c
    /* renamed from: f1 */
    public native void mo11842f1(long j10, long j11);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: f3 */
    public native void mo11843f3(AdInfo adInfo);

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected native void mo7513g5();

    @InterfaceC7719m
    public final native void handleExchangeSuccess(C4338b c4338b);

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final native void handleMessageUpdateEvent(MsgUnReadSizeUpdateEvent msgUnReadSizeUpdateEvent);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: k3 */
    public native void mo11844k3();

    @Override // p369v8.InterfaceC7249a
    /* renamed from: l */
    public native void mo11845l(List list, String str, boolean z10);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: m0 */
    public native void mo11846m0(String str);

    /* renamed from: m7 */
    public final native void m11847m7(boolean z10);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: o0 */
    public native void mo11848o0();

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public native void onBackPressed();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p430z9.AbstractActivityC7763a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0511i, android.app.Activity
    public native void onCreate(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public native void onDestroy();

    @InterfaceC7719m(sticky = true, threadMode = ThreadMode.MAIN)
    public final native void onEventShowErrorMsg(ShowErrorMsgEvent showErrorMsgEvent);

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final native void onEventTimeChanged(TimeChangedEvent timeChangedEvent);

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final native void onEventUsbChanged(UsbChangedEvent usbChangedEvent);

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public native boolean onKeyDown(int i10, KeyEvent keyEvent);

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public native boolean onKeyUp(int i10, KeyEvent keyEvent);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, android.app.Activity
    public native void onRestart();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public native void onResume();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public native void onStop();

    @Override // p315r9.InterfaceC6565c
    public native void onSuccess();

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final native void playSearchLiveChannel(PlayVoiceSearchLiveEvent playVoiceSearchLiveEvent);

    @InterfaceC7719m(sticky = true, threadMode = ThreadMode.MAIN)
    public final native void refreshTableMessage(RefreshTableTitleEvent refreshTableTitleEvent);

    @InterfaceC7719m
    public final native void refreshUerInfoDisplayMessage(RefreshUerInfoDisplayEvent refreshUerInfoDisplayEvent);

    @InterfaceC7719m
    public final native void showJoinMembershipMessage(ShowJoinMembershipEvent showJoinMembershipEvent);

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: t5 */
    public native void mo11422t5(AwakenVoiceAssistEvent awakenVoiceAssistEvent);

    /* renamed from: t6 */
    public native View m11849t6(int i10);

    @Override // p315r9.InterfaceC6565c
    /* renamed from: u0 */
    public native void mo11850u0(Exception exc);

    @InterfaceC7719m
    public final native void updateCouponReceiveStatus(UpdateCouponReceiveStatus updateCouponReceiveStatus);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: v */
    public native void mo11851v(boolean z10);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: y0 */
    public native void mo11852y0();

    @Override // p369v8.InterfaceC7249a
    /* renamed from: y2 */
    public native void mo11853y2(int i10);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: z */
    public native void mo11854z(String str);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: z0 */
    public native void mo11855z0(String str, List list);

    @Override // p369v8.InterfaceC7249a
    /* renamed from: z2 */
    public native void mo11856z2(int i10);

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected native int mo7518z5();
}
