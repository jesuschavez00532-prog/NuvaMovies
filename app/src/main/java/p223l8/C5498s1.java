package p223l8;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.AbstractC0738x;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0749c;
import bd.InterfaceC1294a;
import be.C1328x;
import cc.C1456h0;
import cc.C1466m0;
import com.core.sysopt.mark.live.LiveRootView;
import com.live.R$color;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.p063db.ChannelList;
import com.live.view.C2890r;
import com.live.view.ViewOnKeyListenerC2883k;
import com.live.view.player.LivePlayerBufferView;
import com.live.view.player.LivePlayerController;
import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.Progress;
import com.module.event.AwakenVoiceAssistEvent;
import com.module.event.ChangeUserAccountSuccessEvent;
import com.module.event.GetLiveDataSuccessEvent;
import com.module.event.GetLiveFavoriteSucEvent;
import com.module.event.HideContentFragmentEvent;
import com.module.event.HideLockViewEvent;
import com.module.event.LiveGuideShow;
import com.module.event.LockChannelEvent;
import com.module.event.LockMonitorEvent;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.event.RefreshLockEvent;
import com.module.event.ShowLiveInfoBarEvent;
import com.module.event.StopLiveStreamEvent;
import com.module.event.ToStartPlayBackEvent;
import com.module.event.ToStartPlayEvent;
import com.module.event.ToStartPlayVoiceSearchEvent;
import com.module.event.UpdateLiveNoticeEvent;
import com.module.view.net.NetSpeedTextView;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.request.result.LoginResult;
import com.request.result.MosaicChannelBean;
import com.request.result.PosterList;
import com.request.result.UserInfo;
import com.titan.ranger.Status;
import com.titan.ranger.bean.Media;
import com.titan.ranger.bean.Program;
import com.titans.entity.CdnType;
import com.titans.entity.RangerPlayTag;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.C3309bd;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.message.MessageService;
import org.greenrobot.eventbus.ThreadMode;
import p012ab.C0128d;
import p040c8.C1407f;
import p040c8.C1427v;
import p043ce.AbstractC1508t;
import p101da.ViewOnClickListenerC4018d;
import p101da.ViewOnClickListenerC4019e;
import p102db.DialogC4084w0;
import p104dd.C4094b;
import p117ea.AbstractC4161e;
import p117ea.C4160d;
import p119ed.C4176d;
import p119ed.C4177e;
import p130f8.InterfaceC4278e;
import p130f8.InterfaceC4279f;
import p159h8.C4598f2;
import p161ha.ViewOnClickListenerC4758c0;
import p161ha.ViewOnClickListenerC4799t0;
import p170i2.C4842a;
import p170i2.InterfaceC4844c;
import p185j2.C4982a;
import p201k2.AbstractC5085b;
import p217l2.InterfaceC5342c;
import p263o8.ViewOnClickListenerC5929g;
import p263o8.ViewOnFocusChangeListenerC5935m;
import p317rb.AbstractC6567a;
import p323s2.AbstractC6652a;
import p348u2.AbstractC7027d;
import p357uc.C7077d;
import p359ue.AbstractC7167u;
import p400xa.C7556b1;
import p400xa.C7565e1;
import p400xa.C7577i1;
import p400xa.C7586l1;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7617x;
import p400xa.C7618x0;
import p421z0.C7729c;
import p430z9.AbstractC7766d;
import va.InterfaceC7251a;
import vc.EnumC7254b;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: l8.s1 */
/* loaded from: classes.dex */
public final class C5498s1 extends AbstractC7766d<InterfaceC4278e> implements InterfaceC4279f, ViewOnKeyListenerC2883k.a, ViewOnClickListenerC5929g.a, ViewOnClickListenerC4019e.a, InterfaceC1294a {

    /* renamed from: l1 */
    public static final a f22305l1 = new a(null);

    /* renamed from: m1 */
    private static boolean f22306m1;

    /* renamed from: n1 */
    private static boolean f22307n1;

    /* renamed from: A0 */
    private C4176d f22308A0;

    /* renamed from: B0 */
    private C2890r f22309B0;

    /* renamed from: D0 */
    private ViewOnClickListenerC5929g f22311D0;

    /* renamed from: E0 */
    private ViewOnKeyListenerC2883k f22312E0;

    /* renamed from: F0 */
    private ViewOnClickListenerC4019e f22313F0;

    /* renamed from: H0 */
    private boolean f22315H0;

    /* renamed from: I0 */
    private DialogC4084w0 f22316I0;

    /* renamed from: J0 */
    private ViewOnFocusChangeListenerC5935m f22317J0;

    /* renamed from: K0 */
    private boolean f22318K0;

    /* renamed from: L0 */
    private boolean f22319L0;

    /* renamed from: M0 */
    private boolean f22320M0;

    /* renamed from: N0 */
    private boolean f22321N0;

    /* renamed from: O0 */
    private int f22322O0;

    /* renamed from: R0 */
    private boolean f22325R0;

    /* renamed from: S0 */
    private int f22326S0;

    /* renamed from: U0 */
    private int f22328U0;

    /* renamed from: W0 */
    private int f22330W0;

    /* renamed from: Z0 */
    private Disposable f22333Z0;

    /* renamed from: a1 */
    private boolean f22334a1;

    /* renamed from: b1 */
    private boolean f22335b1;

    /* renamed from: d1 */
    private Channel f22337d1;

    /* renamed from: e1 */
    private Handler f22338e1;

    /* renamed from: f1 */
    private HandlerThread f22339f1;

    /* renamed from: g1 */
    private int f22340g1;

    /* renamed from: z0 */
    private C4177e f22346z0;

    /* renamed from: k1 */
    public Map f22344k1 = new LinkedHashMap();

    /* renamed from: y0 */
    private final String f22345y0 = "LiveFrag";

    /* renamed from: C0 */
    private C5442e1 f22310C0 = new C5442e1();

    /* renamed from: G0 */
    private b f22314G0 = new b(this);

    /* renamed from: P0 */
    private Handler f22323P0 = new Handler();

    /* renamed from: Q0 */
    private Runnable f22324Q0 = new Runnable() { // from class: l8.m1
        @Override // java.lang.Runnable
        public final void run() {
            C5498s1.m22179Ra(C5498s1.this);
        }
    };

    /* renamed from: T0 */
    private ArrayList f22327T0 = new ArrayList();

    /* renamed from: V0 */
    private String f22329V0 = "HomeLive";

    /* renamed from: X0 */
    private boolean f22331X0 = true;

    /* renamed from: Y0 */
    private boolean f22332Y0 = true;

    /* renamed from: c1 */
    private String f22336c1 = "";

    /* renamed from: h1 */
    private final f f22341h1 = new f();

    /* renamed from: i1 */
    private final g f22342i1 = new g();

    /* renamed from: j1 */
    private d f22343j1 = new d();

    /* renamed from: l8.s1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final boolean m22284a() {
            return C5498s1.f22306m1;
        }

        /* renamed from: b */
        public final boolean m22285b() {
            return C5498s1.f22307n1;
        }

        /* renamed from: c */
        public final void m22286c(boolean z10) {
            C5498s1.f22306m1 = z10;
        }
    }

    /* renamed from: l8.s1$b */
    /* loaded from: classes2.dex */
    public static final class b extends Handler {

        /* renamed from: a */
        private final WeakReference f22347a;

        public b(C5498s1 c5498s1) {
            AbstractC5868k.m23674f(c5498s1, "frag");
            this.f22347a = new WeakReference(c5498s1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            LivePlayerController livePlayerController;
            AbstractC5868k.m23674f(message, "msg");
            super.handleMessage(message);
            C5498s1 c5498s1 = (C5498s1) this.f22347a.get();
            if (c5498s1 == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                c5498s1.m22157Ha();
                return;
            }
            if (i10 != 2) {
                if (i10 == 41 && (livePlayerController = (LivePlayerController) c5498s1.m22244O9(R$id.mPlayerController)) != null) {
                    livePlayerController.m11683c();
                    return;
                }
                return;
            }
            c5498s1.m22234Ea();
        }
    }

    /* renamed from: l8.s1$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ InterfaceC5642a f22349b;

        /* renamed from: l8.s1$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C5498s1 f22350a;

            /* renamed from: b */
            final /* synthetic */ int f22351b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC5642a f22352c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5498s1 c5498s1, int i10, InterfaceC5642a interfaceC5642a) {
                super(1);
                this.f22350a = c5498s1;
                this.f22351b = i10;
                this.f22352c = interfaceC5642a;
            }

            /* renamed from: a */
            public final void m22288a(boolean z10) {
                int i10 = 0;
                C5498s1 c5498s1 = this.f22350a;
                if (z10) {
                    i10 = this.f22351b;
                } else {
                    i10 = 0;
                }
                c5498s1.f22326S0 = i10;
                this.f22352c.invoke();
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m22288a(((Boolean) obj).booleanValue());
                return C1328x.f4998a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5642a interfaceC5642a) {
            super(1);
            this.f22349b = interfaceC5642a;
        }

        /* renamed from: a */
        public final void m22287a(int i10) {
            if (i10 == 0) {
                C5498s1.this.f22326S0 = 0;
                this.f22349b.invoke();
            } else {
                C7556b1 c7556b1 = C7556b1.f27754a;
                AbstractC0729o m3110N8 = C5498s1.this.m3110N8();
                AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
                c7556b1.m28967f(m3110N8, i10, new a(C5498s1.this, i10, this.f22349b));
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22287a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.s1$d */
    /* loaded from: classes2.dex */
    public static final class d implements C7618x0.a {

        /* renamed from: l8.s1$d$a */
        /* loaded from: classes2.dex */
        public static final class a implements DialogC4084w0.a {

            /* renamed from: a */
            final /* synthetic */ C5498s1 f22354a;

            a(C5498s1 c5498s1) {
                this.f22354a = c5498s1;
            }

            @Override // p102db.DialogC4084w0.a
            /* renamed from: a */
            public void mo17117a(int i10, KeyEvent keyEvent) {
                AbstractC5868k.m23674f(keyEvent, "event");
                this.f22354a.onKeyDown(i10, keyEvent);
            }
        }

        d() {
        }

        @Override // p400xa.C7618x0.a
        /* renamed from: a */
        public void mo11883a(int i10, KeyEvent keyEvent) {
            AbstractC5868k.m23674f(keyEvent, "event");
            if (C5498s1.this.m22247Pa()) {
                C5498s1.this.onKeyDown(i10, keyEvent);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        
            if (r9.m17473r() != false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        
            if (r8.intValue() != 2) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        
            r8 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        
            if (p104dd.C4094b.f17998a.m17142e() == 2) goto L123;
         */
        @Override // p400xa.C7618x0.a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo11884b(boolean r8, boolean r9, java.lang.String r10) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p223l8.C5498s1.d.mo11884b(boolean, boolean, java.lang.String):void");
        }
    }

    /* renamed from: l8.s1$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        /* renamed from: a */
        public final void m22289a() {
            C5498s1.this.m22180Rb();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22289a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.s1$f */
    /* loaded from: classes2.dex */
    public static final class f implements C2890r.a {
        f() {
        }

        @Override // com.live.view.C2890r.a
        /* renamed from: a */
        public void mo11736a() {
            C2890r c2890r = C5498s1.this.f22309B0;
            if (c2890r == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
                c2890r = null;
            }
            c2890r.setStatus(6);
        }

        @Override // com.live.view.C2890r.a
        /* renamed from: b */
        public void mo11737b() {
            C2890r c2890r = C5498s1.this.f22309B0;
            if (c2890r == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
                c2890r = null;
            }
            c2890r.setStatus(7);
        }

        @Override // com.live.view.C2890r.a
        /* renamed from: c */
        public void mo11738c(int i10) {
            C4176d c4176d;
            long j10;
            long j11 = i10;
            C4176d c4176d2 = C5498s1.this.f22308A0;
            if (c4176d2 != null) {
                C4176d c4176d3 = C5498s1.this.f22308A0;
                if (c4176d3 != null) {
                    j10 = c4176d3.getDuration();
                } else {
                    j10 = 0;
                }
                if (j11 >= j10) {
                    j11 -= 1000;
                }
                c4176d2.m17477w(j11);
            }
            C4176d c4176d4 = C5498s1.this.f22308A0;
            boolean z10 = false;
            if (c4176d4 != null && !c4176d4.m17473r()) {
                z10 = true;
            }
            if (z10 && (c4176d = C5498s1.this.f22308A0) != null) {
                c4176d.m17476v();
            }
        }
    }

    /* renamed from: l8.s1$g */
    /* loaded from: classes2.dex */
    public static final class g implements C2890r.b {
        g() {
        }

        @Override // com.live.view.C2890r.b
        /* renamed from: Z */
        public void mo11739Z(int i10) {
            int m28998c = C7565e1.f27773a.m28998c(i10);
            C4176d c4176d = C5498s1.this.f22308A0;
            if (c4176d != null) {
                c4176d.setAspectRatio(m28998c);
            }
            C7577i1.f27838b.m29085d().m29076h("play_ratio", Integer.valueOf(i10));
        }

        @Override // com.live.view.C2890r.b
        /* renamed from: k0 */
        public void mo11740k0(int i10) {
            EnumC7254b enumC7254b;
            if (i10 == 0) {
                enumC7254b = EnumC7254b.NATIVE;
            } else {
                enumC7254b = EnumC7254b.IJK;
            }
            C4176d c4176d = C5498s1.this.f22308A0;
            if (c4176d != null) {
                C4177e.m17468z(c4176d, enumC7254b, null, true, 2, null);
            }
            C4094b.f17998a.m17149l(RangerPlayTag.RECORD.getValue(), "", enumC7254b);
            C2890r c2890r = C5498s1.this.f22309B0;
            if (c2890r == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
                c2890r = null;
            }
            c2890r.setStatus(10);
        }

        @Override // com.live.view.C2890r.b
        /* renamed from: w0 */
        public void mo11741w0(int i10) {
            if (i10 == 0) {
                C2890r c2890r = C5498s1.this.f22309B0;
                if (c2890r == null) {
                    AbstractC5868k.m23686r("mBackInfoBar");
                    c2890r = null;
                }
                String programTitle = c2890r.getProgramTitle();
                if (AbstractC6567a.m25637g(programTitle)) {
                    String programName = ((EpgProgram) C5498s1.this.f22327T0.get(C5498s1.this.f22328U0)).getProgramName();
                    if (programName == null) {
                        programName = "";
                    }
                    ViewOnClickListenerC4758c0 m19681b = ViewOnClickListenerC4758c0.f20101M0.m19681b("back", programTitle + '_' + programName);
                    AbstractC0729o m3119R6 = C5498s1.this.m3119R6();
                    AbstractC5868k.m23671c(m3119R6);
                    m19681b.mo3277E9(m3119R6, "FeedbackDialog");
                }
            }
        }
    }

    /* renamed from: l8.s1$h */
    /* loaded from: classes2.dex */
    static final class h extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ Program f22358a;

        /* renamed from: b */
        final /* synthetic */ C5498s1 f22359b;

        /* renamed from: c */
        final /* synthetic */ EpgProgram f22360c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Program program, C5498s1 c5498s1, EpgProgram epgProgram) {
            super(0);
            this.f22358a = program;
            this.f22359b = c5498s1;
            this.f22360c = epgProgram;
        }

        /* renamed from: a */
        public final void m22290a() {
            this.f22358a.setStart(this.f22359b.f22326S0);
            C4176d c4176d = this.f22359b.f22308A0;
            if (c4176d != null) {
                Program program = this.f22358a;
                String contentId = this.f22360c.getContentId();
                if (contentId == null) {
                    contentId = "";
                }
                c4176d.mo17463A(program, contentId, this.f22358a.getBuss());
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22290a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.s1$i */
    /* loaded from: classes2.dex */
    public static final class i implements ViewOnClickListenerC4799t0.a {

        /* renamed from: l8.s1$i$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final a f22362a = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m22291a(LoginResult loginResult) {
                C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m22291a((LoginResult) obj);
                return C1328x.f4998a;
            }
        }

        i() {
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: a */
        public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            C1466m0.f5627a.m6869h0(null);
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3093I6 = C5498s1.this.m3093I6();
                AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                InterfaceC7251a.a.m28064a(interfaceC7251a, m3093I6, true, null, a.f22362a, 4, null);
            }
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: b */
        public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
        }
    }

    /* renamed from: l8.s1$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5642a {
        j() {
            super(0);
        }

        /* renamed from: a */
        public final void m22292a() {
            C5498s1.this.m22198db(2, 15000L);
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22292a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.s1$k */
    /* loaded from: classes2.dex */
    public static final class k implements ViewOnClickListenerC4019e.a {

        /* renamed from: b */
        final /* synthetic */ String f22365b;

        /* renamed from: c */
        final /* synthetic */ String f22366c;

        k(String str, String str2) {
            this.f22365b = str;
            this.f22366c = str2;
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: Z2 */
        public void mo17006Z2() {
            C5498s1.this.m22257cb();
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: b2 */
        public void mo17007b2() {
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: n2 */
        public void mo17008n2() {
            InterfaceC4278e m22188X9 = C5498s1.m22188X9(C5498s1.this);
            if (m22188X9 != null) {
                m22188X9.mo17865F0(this.f22365b, this.f22366c);
            }
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: q0 */
        public void mo17009q0() {
            ViewOnClickListenerC4019e.a.C7837a.m17010a(this);
        }
    }

    /* renamed from: l8.s1$l */
    /* loaded from: classes2.dex */
    public static final class l implements ViewOnClickListenerC4018d.a {

        /* renamed from: b */
        final /* synthetic */ String f22368b;

        /* renamed from: c */
        final /* synthetic */ String f22369c;

        l(String str, String str2) {
            this.f22368b = str;
            this.f22369c = str2;
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        public void cancel() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: q0 */
        public void mo11609q0() {
            ViewOnClickListenerC4018d.a.C7836a.m16992a(this);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: r0 */
        public void mo11610r0() {
            InterfaceC4278e m22188X9 = C5498s1.m22188X9(C5498s1.this);
            if (m22188X9 != null) {
                m22188X9.mo17865F0(this.f22368b, this.f22369c);
            }
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: x */
        public void mo11611x() {
            C5498s1.this.m22257cb();
        }
    }

    /* renamed from: l8.s1$m */
    /* loaded from: classes2.dex */
    public static final class m extends AbstractC5869l implements InterfaceC5660l {
        m() {
            super(1);
        }

        /* renamed from: a */
        public final void m22293a(int i10) {
            MosaicChannelBean mosaicChannelBean;
            String str = null;
            List<MosaicChannelBean> mosaicChannes;
            Object m7008t = null;
            C5498s1.this.f22340g1 = i10;
            Channel m6531w = C1407f.f5458a.m6531w();
            if (m6531w != null && (mosaicChannes = m6531w.getMosaicChannes()) != null) {
                m7008t = AbstractC1508t.m7008t(mosaicChannes, C5498s1.this.f22340g1);
                mosaicChannelBean = (MosaicChannelBean) m7008t;
            } else {
                mosaicChannelBean = null;
            }
            C5498s1 c5498s1 = C5498s1.this;
            if (mosaicChannelBean == null || (str = mosaicChannelBean.getLanguage()) == null) {
                str = "";
            }
            c5498s1.m22195bb(str, i10);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22293a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.s1$n */
    /* loaded from: classes2.dex */
    public static final class n extends AbstractC5869l implements InterfaceC5660l {
        n() {
            super(1);
        }

        /* renamed from: a */
        public final void m22294a(int i10) {
            MosaicChannelBean mosaicChannelBean;
            String str = null;
            List<MosaicChannelBean> mosaicChannes;
            Object m7008t = null;
            C1407f c1407f = C1407f.f5458a;
            Channel m6531w = c1407f.m6531w();
            if (m6531w != null && (mosaicChannes = m6531w.getMosaicChannes()) != null) {
                m7008t = AbstractC1508t.m7008t(mosaicChannes, i10);
                mosaicChannelBean = (MosaicChannelBean) m7008t;
            } else {
                mosaicChannelBean = null;
            }
            ArrayList m6533y = c1407f.m6533y();
            int size = m6533y.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = m6533y.get(i11);
                AbstractC5868k.m23673e(obj, "playChannels.get(index)");
                Channel channel = (Channel) obj;
                if (mosaicChannelBean != null) {
                    str = mosaicChannelBean.getChannelCode();
                } else {
                    str = null;
                }
                if (AbstractC5868k.m23669a(str, channel.getChannelCode())) {
                    C1407f c1407f2 = C1407f.f5458a;
                    c1407f2.m6488M();
                    c1407f2.m6506e0(i11);
                    c1407f2.m6499X(true);
                    C5498s1.this.m22172Nb();
                    C7589m1.f27886a.m29120C(mosaicChannelBean.getChannelCode(), m6531w.getChannelCode());
                    return;
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22294a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.s1$o */
    /* loaded from: classes2.dex */
    public static final class o extends AbstractC5869l implements InterfaceC5660l {
        o() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m22295a(int i10) {
            if (i10 == 17) {
                C5498s1.this.m22160Ia();
                if (!C5498s1.this.f22310C0.m3079D7()) {
                    C5498s1.this.m22214pb();
                    C5498s1.this.m22198db(2, 15000L);
                }
                C5498s1.this.f22310C0.m21952ib();
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            return m22295a(((Number) obj).intValue());
        }
    }

    /* renamed from: l8.s1$p */
    /* loaded from: classes2.dex */
    public static final class p implements ViewOnClickListenerC4019e.a {

        /* renamed from: b */
        final /* synthetic */ Channel f22374b;

        /* renamed from: c */
        final /* synthetic */ ViewOnClickListenerC4019e f22375c;

        p(Channel channel, ViewOnClickListenerC4019e viewOnClickListenerC4019e) {
            this.f22374b = channel;
            this.f22375c = viewOnClickListenerC4019e;
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: Z2 */
        public void mo17006Z2() {
            C5498s1.this.m22257cb();
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: b2 */
        public void mo17007b2() {
            this.f22375c.mo3279p9();
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: n2 */
        public void mo17008n2() {
            C5498s1 c5498s1 = C5498s1.this;
            c5498s1.f22335b1 = c5498s1.f22325R0;
            InterfaceC4278e m22188X9 = C5498s1.m22188X9(C5498s1.this);
            if (m22188X9 != null) {
                m22188X9.mo17879u2(this.f22374b, C5498s1.this.f22325R0);
            }
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: q0 */
        public void mo17009q0() {
            ViewOnClickListenerC4019e.a.C7837a.m17010a(this);
        }
    }

    /* renamed from: l8.s1$q */
    /* loaded from: classes2.dex */
    public static final class q extends AbstractC5869l implements InterfaceC5660l {
        q() {
            super(1);
        }

        /* renamed from: a */
        public final void m22296a(Long l10) {
            ((TextView) C5498s1.this.m22244O9(R$id.mTvTime)).setText(new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(new Date()));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m22296a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.s1$r */
    /* loaded from: classes2.dex */
    public static final class r implements ViewOnClickListenerC4019e.a {
        r() {
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: Z2 */
        public void mo17006Z2() {
            C5498s1.this.m22257cb();
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: b2 */
        public void mo17007b2() {
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: n2 */
        public void mo17008n2() {
            InterfaceC4278e m22188X9 = C5498s1.m22188X9(C5498s1.this);
            if (m22188X9 != null) {
                m22188X9.mo17870O0();
            }
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: q0 */
        public void mo17009q0() {
            ViewOnClickListenerC4019e.a.C7837a.m17010a(this);
        }
    }

    /* renamed from: l8.s1$s */
    /* loaded from: classes2.dex */
    public static final class s implements ViewOnClickListenerC4018d.a {
        s() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        public void cancel() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: q0 */
        public void mo11609q0() {
            ViewOnClickListenerC4018d.a.C7836a.m16992a(this);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: r0 */
        public void mo11610r0() {
            InterfaceC4278e m22188X9 = C5498s1.m22188X9(C5498s1.this);
            if (m22188X9 != null) {
                m22188X9.mo17870O0();
            }
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: x */
        public void mo11611x() {
            C5498s1.this.m22257cb();
        }
    }

    /* renamed from: l8.s1$t */
    /* loaded from: classes2.dex */
    public static final class t implements ViewOnClickListenerC4018d.a {
        t() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        public void cancel() {
            C5498s1.this.m22227yb(true);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: q0 */
        public void mo11609q0() {
            ViewOnClickListenerC4018d.a.C7836a.m16992a(this);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: r0 */
        public void mo11610r0() {
            C5498s1.this.m22172Nb();
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: x */
        public void mo11611x() {
        }
    }

    /* renamed from: l8.s1$u */
    /* loaded from: classes2.dex */
    public static final class u implements ViewOnClickListenerC4018d.a {

        /* renamed from: b */
        final /* synthetic */ Channel f22381b;

        u(Channel channel) {
            this.f22381b = channel;
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        public void cancel() {
            C5498s1.this.m22227yb(true);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: q0 */
        public void mo11609q0() {
            ViewOnClickListenerC4018d.a.C7836a.m16992a(this);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: r0 */
        public void mo11610r0() {
            C5498s1 c5498s1 = C5498s1.this;
            c5498s1.f22335b1 = c5498s1.f22325R0;
            InterfaceC4278e m22188X9 = C5498s1.m22188X9(C5498s1.this);
            if (m22188X9 != null) {
                m22188X9.mo17879u2(this.f22381b, C5498s1.this.f22325R0);
            }
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: x */
        public void mo11611x() {
            C5498s1.this.m22257cb();
        }
    }

    /* renamed from: Ab */
    public static /* synthetic */ void m22145Ab(C5498s1 c5498s1, int i10, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, int i11, Object obj) {
        boolean z11 = false;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        Integer num2;
        if ((i11 & 2) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        String str14 = "";
        if ((i11 & 4) != 0) {
            str8 = "";
        } else {
            str8 = str;
        }
        if ((i11 & 8) != 0) {
            str9 = "";
        } else {
            str9 = str2;
        }
        if ((i11 & 16) != 0) {
            str10 = "";
        } else {
            str10 = str3;
        }
        if ((i11 & 32) != 0) {
            str11 = "";
        } else {
            str11 = str4;
        }
        if ((i11 & 64) != 0) {
            str12 = "";
        } else {
            str12 = str5;
        }
        if ((i11 & 128) != 0) {
            str13 = "";
        } else {
            str13 = str6;
        }
        if ((i11 & 256) == 0) {
            str14 = str7;
        }
        if ((i11 & 512) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        c5498s1.m22283zb(i10, z11, str8, str9, str10, str11, str12, str13, str14, num2);
    }

    /* renamed from: Bb */
    public static final void m22146Bb(String str, C5498s1 c5498s1, int i10, Integer num, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = null;
        String m6878m = null;
        String str9 = null;
        String m29330d = null;
        String valueOf = null;
        AbstractC5868k.m23674f(str, "$errMsg");
        AbstractC5868k.m23674f(c5498s1, "this$0");
        AbstractC5868k.m23674f(str2, "$mCode");
        AbstractC5868k.m23674f(str3, "$title");
        AbstractC5868k.m23674f(str4, "$host");
        AbstractC5868k.m23674f(str5, "$bussType");
        AbstractC5868k.m23674f(str6, "$cdnType");
        AbstractC5868k.m23674f(str7, "$uri");
        if (TextUtils.isEmpty(str)) {
            C7617x c7617x = C7617x.f28030a;
            Context m3107M8 = c5498s1.m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            str8 = c7617x.m29331e(m3107M8, i10);
        } else {
            str8 = str;
        }
        int i11 = R$id.mLayoutError;
        if (((RelativeLayout) c5498s1.m22244O9(i11)) != null && !TextUtils.isEmpty(str8)) {
            if (((RelativeLayout) c5498s1.m22244O9(i11)).getVisibility() != 0) {
                c5498s1.m22148Cb();
                AbstractActivityC0712e m3075C6 = c5498s1.m3075C6();
                if (m3075C6 != null) {
                    str9 = m3075C6.getClass().getSimpleName();
                } else {
                    str9 = null;
                }
                if (AbstractC5868k.m23669a(str9, "HomeActivity")) {
                    if (!TextUtils.isEmpty(str)) {
                        m29330d = AbstractC7167u.m27757a0(str, Operator.Operation.MINUS, null, 2, null);
                    } else {
                        C7617x c7617x2 = C7617x.f28030a;
                        Context m3107M82 = c5498s1.m3107M8();
                        AbstractC5868k.m23673e(m3107M82, "requireContext()");
                        m29330d = c7617x2.m29330d(m3107M82, i10);
                    }
                    String str10 = m29330d;
                    if (num == null || (valueOf = num.toString()) == null) {
                        valueOf = String.valueOf(i10);
                    }
                    C7729c.f28423a.m29853g(str2, str3, str4, str5, str6, str10, valueOf, str7);
                }
            }
            C1466m0 c1466m0 = C1466m0.f5627a;
            if (AbstractC5868k.m23669a(c1466m0.m6860d(), CdnType.DIGITAL_TYPE_PEERSTAR)) {
                m6878m = c1466m0.m6888w();
            } else {
                m6878m = c1466m0.m6878m();
            }
            TextView textView = (TextView) c5498s1.m22244O9(R$id.mTextAccount);
            C5881x c5881x = C5881x.f23415a;
            String string = c5498s1.m3107M8().getString(R$string.error_dialog_account);
            AbstractC5868k.m23673e(string, "requireContext().getStri…ing.error_dialog_account)");
            String format = String.format(string, Arrays.copyOf(new Object[]{m6878m}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            TextView textView2 = (TextView) c5498s1.m22244O9(R$id.mTextVersion);
            String string2 = c5498s1.m3107M8().getString(R$string.error_dialog_version);
            AbstractC5868k.m23673e(string2, "requireContext().getStri…ing.error_dialog_version)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{AbstractC5085b.m20603m(c5498s1.m3096J6())}, 1));
            AbstractC5868k.m23673e(format2, "format(format, *args)");
            textView2.setText(format2);
            ((TextView) c5498s1.m22244O9(R$id.mTextError)).setText(str8);
        }
    }

    /* renamed from: Ca */
    private final void m22147Ca() {
        if (m22226ya()) {
            m22213pa();
            m22220tb();
        } else {
            m22157Ha();
        }
    }

    /* renamed from: Cb */
    private final void m22148Cb() {
        int i10 = R$id.mLayoutError;
        if (((RelativeLayout) m22244O9(i10)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((RelativeLayout) m22244O9(i10)).getLayoutParams();
        AbstractC5868k.m23672d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        layoutParams2.rightMargin = 0;
        ((RelativeLayout) m22244O9(i10)).setLayoutParams(layoutParams2);
        ((RelativeLayout) m22244O9(i10)).setVisibility(0);
    }

    /* renamed from: Eb */
    public static final void m22149Eb(C5498s1 c5498s1) {
        AbstractC5868k.m23674f(c5498s1, "this$0");
        c5498s1.f22310C0.m21963qa();
    }

    /* renamed from: Fa */
    private final void m22151Fa() {
        if (this.f22310C0.m3079D7()) {
            AbstractC0738x m3534m = m3093I6().m3534m();
            AbstractC5868k.m23673e(m3534m, "childFragmentManager.beginTransaction()");
            m3534m.mo3233n(this.f22310C0).mo3230j();
            this.f22310C0.m21968vb();
        }
    }

    /* renamed from: Fb */
    public static final void m22152Fb(C5498s1 c5498s1, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(c5498s1, "this$0");
        c5498s1.f22313F0 = null;
    }

    /* renamed from: Ga */
    private final void m22154Ga() {
        m22163Ja();
        ((LinearLayout) m22244O9(R$id.mLlNetStatus)).setVisibility(8);
        m22187Wa();
    }

    /* renamed from: Gb */
    private final void m22155Gb() {
        Disposable disposable = this.f22333Z0;
        if (disposable != null) {
            AbstractC5868k.m23671c(disposable);
            if (!disposable.isDisposed()) {
                return;
            }
        }
        ((TextView) m22244O9(R$id.mTvTime)).setVisibility(0);
        Observable<R> compose = Observable.interval(2L, TimeUnit.SECONDS).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).compose(m19902N3());
        final q qVar = new q();
        this.f22333Z0 = compose.subscribe((Consumer<? super R>) new Consumer() { // from class: l8.l1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5498s1.m22158Hb(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: Ha */
    public final void m22157Ha() {
        boolean z10 = false;
        boolean z11 = true;
        m22185Va(1);
        ViewOnClickListenerC5929g viewOnClickListenerC5929g = this.f22311D0;
        if (viewOnClickListenerC5929g != null) {
            viewOnClickListenerC5929g.setVisibility(8);
        }
        m22154Ga();
        m22180Rb();
        ViewOnKeyListenerC2883k viewOnKeyListenerC2883k = this.f22312E0;
        if (viewOnKeyListenerC2883k != null && !viewOnKeyListenerC2883k.m11648j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ViewOnKeyListenerC2883k viewOnKeyListenerC2883k2 = this.f22312E0;
            if (viewOnKeyListenerC2883k2 != null) {
                viewOnKeyListenerC2883k2.m11646g();
            }
            this.f22312E0 = null;
        }
        ViewOnClickListenerC4019e viewOnClickListenerC4019e = this.f22313F0;
        if (viewOnClickListenerC4019e == null || !viewOnClickListenerC4019e.m3079D7()) {
            z11 = false;
        }
        if (z11) {
            ViewOnClickListenerC4019e viewOnClickListenerC4019e2 = this.f22313F0;
            if (viewOnClickListenerC4019e2 != null) {
                viewOnClickListenerC4019e2.mo3279p9();
            }
            this.f22313F0 = null;
        }
        C4160d.f18217d.m17390a().m17383i();
    }

    /* renamed from: Hb */
    public static final void m22158Hb(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: Ia */
    public final void m22160Ia() {
        ViewOnFocusChangeListenerC5935m viewOnFocusChangeListenerC5935m = this.f22317J0;
        if (viewOnFocusChangeListenerC5935m != null) {
            viewOnFocusChangeListenerC5935m.m24039i();
        }
    }

    /* renamed from: Ib */
    private final void m22161Ib() {
        Toast makeText = Toast.makeText(m3096J6(), R$string.voice_channel_loading, 0);
        AbstractC6652a.m25971a(makeText);
        makeText.setGravity(17, 0, 100);
        if (m3096J6() instanceof Activity) {
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23672d(m3096J6, "null cannot be cast to non-null type android.app.Activity");
            if (((Activity) m3096J6).isFinishing()) {
                return;
            }
        }
        makeText.show();
    }

    /* renamed from: Ja */
    private final void m22163Ja() {
        Disposable disposable = this.f22333Z0;
        if (disposable != null) {
            disposable.dispose();
        }
        ((TextView) m22244O9(R$id.mTvTime)).setVisibility(8);
    }

    /* renamed from: Jb */
    private final void m22164Jb(int i10, boolean z10) {
        C1407f c1407f = C1407f.f5458a;
        Integer m6511h = c1407f.m6511h(i10);
        if (m6511h != null && m6511h.intValue() >= 0 && c1407f.m6533y().size() > 0 && m6511h.intValue() < c1407f.m6533y().size()) {
            if (this.f22310C0.m3079D7()) {
                m22185Va(2);
                m22234Ea();
            }
            c1407f.m6488M();
            c1407f.m6506e0(m6511h.intValue());
            m22172Nb();
            m22221ua();
            return;
        }
        if (z10) {
            m22222ub();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r0.indexOfChild(r3) == (-1)) goto L37;
     */
    /* renamed from: Ka */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m22166Ka() {
        /*
            r5 = this;
            com.live.view.r r0 = r5.f22309B0
            r1 = 0
            java.lang.String r2 = "mBackInfoBar"
            if (r0 == 0) goto L1e
            int r0 = com.live.R$id.mLiveRoot
            android.view.View r0 = r5.m22244O9(r0)
            com.core.sysopt.mark.live.LiveRootView r0 = (com.core.sysopt.mark.live.LiveRootView) r0
            com.live.view.r r3 = r5.f22309B0
            if (r3 != 0) goto L17
            ne.AbstractC5868k.m23686r(r2)
            r3 = r1
        L17:
            int r0 = r0.indexOfChild(r3)
            r3 = -1
            if (r0 != r3) goto L3d
        L1e:
            com.live.view.r r0 = new com.live.view.r
            android.content.Context r3 = r5.m3096J6()
            r0.<init>(r3)
            r5.f22309B0 = r0
            int r0 = com.live.R$id.mLiveRoot
            android.view.View r0 = r5.m22244O9(r0)
            com.core.sysopt.mark.live.LiveRootView r0 = (com.core.sysopt.mark.live.LiveRootView) r0
            com.live.view.r r3 = r5.f22309B0
            if (r3 != 0) goto L39
            ne.AbstractC5868k.m23686r(r2)
            r3 = r1
        L39:
            r4 = 2
            r0.addView(r3, r4)
        L3d:
            com.live.view.r r0 = r5.f22309B0
            if (r0 != 0) goto L45
            ne.AbstractC5868k.m23686r(r2)
            r0 = r1
        L45:
            r3 = 0
            r0.setStatus(r3)
            com.live.view.r r0 = r5.f22309B0
            if (r0 != 0) goto L51
            ne.AbstractC5868k.m23686r(r2)
            r0 = r1
        L51:
            l8.s1$f r3 = r5.f22341h1
            r0.setOnSeekBarSeekListener(r3)
            com.live.view.r r0 = r5.f22309B0
            if (r0 != 0) goto L5e
            ne.AbstractC5868k.m23686r(r2)
            r0 = r1
        L5e:
            l8.s1$g r3 = r5.f22342i1
            r0.setOnSettingFunctionListener(r3)
            com.live.view.r r0 = r5.f22309B0
            if (r0 != 0) goto L6b
            ne.AbstractC5868k.m23686r(r2)
            goto L6c
        L6b:
            r1 = r0
        L6c:
            l8.s1$e r0 = new l8.s1$e
            r0.<init>()
            r1.setAutoHideListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.C5498s1.m22166Ka():void");
    }

    /* renamed from: Kb */
    static /* synthetic */ void m22167Kb(C5498s1 c5498s1, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        c5498s1.m22164Jb(i10, z10);
    }

    /* renamed from: Ma */
    private final void m22170Ma() {
        AbstractC0738x m3534m = m3093I6().m3534m();
        AbstractC5868k.m23673e(m3534m, "childFragmentManager.beginTransaction()");
        m3534m.m3645r(R$id.mFlContent, this.f22310C0, "liveContentFrag").mo3233n(this.f22310C0).mo3228h();
    }

    /* renamed from: Nb */
    public final void m22172Nb() {
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17869N2();
        }
        m22160Ia();
    }

    /* renamed from: Oa */
    public static final void m22173Oa(C5498s1 c5498s1, View view) {
        AbstractC5868k.m23674f(c5498s1, "this$0");
        c5498s1.m22278vb();
    }

    /* renamed from: Pb */
    private final void m22175Pb() {
        Channel m6630P;
        String num = null;
        String str = null;
        List<PosterList> list;
        String str2 = null;
        String programName = null;
        Channel m6630P2;
        String str3 = "";
        if (!C1407f.f5458a.m6527s() ? (m6630P = C1427v.f5519a.m6630P()) == null || (num = Integer.valueOf(m6630P.getChannelNumber()).toString()) == null : (m6630P2 = C1427v.f5519a.m6630P()) == null || (num = m6630P2.getFixedChannelNumber()) == null) {
            num = "";
        }
        C2890r c2890r = this.f22309B0;
        C2890r c2890r2 = null;
        if (c2890r == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r = null;
        }
        c2890r.setChannelIndex(num);
        C2890r c2890r3 = this.f22309B0;
        if (c2890r3 == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r3 = null;
        }
        C1427v c1427v = C1427v.f5519a;
        Channel m6630P3 = c1427v.m6630P();
        if (m6630P3 != null) {
            str = m6630P3.getName();
        } else {
            str = null;
        }
        c2890r3.setChannelName(str);
        C2890r c2890r4 = this.f22309B0;
        if (c2890r4 == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r4 = null;
        }
        C7594o0 c7594o0 = C7594o0.f27942a;
        Channel m6630P4 = c1427v.m6630P();
        if (m6630P4 != null) {
            list = m6630P4.getPosterList();
        } else {
            list = null;
        }
        c2890r4.setChannelIcon(c7594o0.m29220i(list, C7594o0.a.Icon));
        if (this.f22328U0 >= this.f22327T0.size() || (str2 = ((EpgProgram) this.f22327T0.get(this.f22328U0)).getProgramName()) == null) {
            str2 = "";
        }
        if (this.f22328U0 + 1 < this.f22327T0.size() && (programName = ((EpgProgram) this.f22327T0.get(this.f22328U0 + 1)).getProgramName()) != null) {
            str3 = programName;
        }
        C2890r c2890r5 = this.f22309B0;
        if (c2890r5 == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r5 = null;
        }
        c2890r5.setTimeRange(((EpgProgram) this.f22327T0.get(this.f22328U0)).getStart() + '-' + ((EpgProgram) this.f22327T0.get(this.f22328U0)).getStop());
        C2890r c2890r6 = this.f22309B0;
        if (c2890r6 == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
        } else {
            c2890r2 = c2890r6;
        }
        c2890r2.m11723M(str2, str3);
    }

    /* renamed from: Qb */
    private final void m22177Qb() {
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17877f(this.f22311D0);
        }
        m22198db(1, 10000L);
    }

    /* renamed from: Ra */
    public static final void m22179Ra(C5498s1 c5498s1) {
        AbstractC5868k.m23674f(c5498s1, "this$0");
        C1407f c1407f = C1407f.f5458a;
        Integer m6511h = c1407f.m6511h(c5498s1.f22322O0);
        int m6532x = c1407f.m6532x();
        if (m6511h != null && m6511h.intValue() >= 0 && c1407f.m6533y().size() > 0 && m6511h.intValue() < c1407f.m6533y().size()) {
            if (c5498s1.f22310C0.m3079D7()) {
                c5498s1.m22185Va(2);
                c5498s1.m22234Ea();
            }
            if (m6511h.intValue() != m6532x) {
                c1407f.m6488M();
                c1407f.m6506e0(m6511h.intValue());
                c5498s1.m22172Nb();
            }
            c5498s1.m22221ua();
            c5498s1.f22322O0 = 0;
            return;
        }
        c5498s1.m22222ub();
        c5498s1.f22322O0 = 0;
    }

    /* renamed from: Rb */
    public final void m22180Rb() {
        ViewOnFocusChangeListenerC5935m viewOnFocusChangeListenerC5935m = this.f22317J0;
        boolean z10 = false;
        if (viewOnFocusChangeListenerC5935m != null && viewOnFocusChangeListenerC5935m.m24034d()) {
            z10 = true;
        }
        if (!z10) {
            int i10 = R$id.mPlayFrameLayout;
            ((FrameLayout) m22244O9(i10)).setFocusable(true);
            ((FrameLayout) m22244O9(i10)).requestFocus();
        }
    }

    /* renamed from: Va */
    private final void m22185Va(int i10) {
        this.f22314G0.removeMessages(i10);
    }

    /* renamed from: Wa */
    private final void m22187Wa() {
        int i10 = R$id.mTvDownSpeed;
        if (((NetSpeedTextView) m22244O9(i10)) == null) {
            return;
        }
        C0128d c0128d = C0128d.f375a;
        NetSpeedTextView netSpeedTextView = (NetSpeedTextView) m22244O9(i10);
        AbstractC5868k.m23673e(netSpeedTextView, "mTvDownSpeed");
        c0128d.m513n(netSpeedTextView);
    }

    /* renamed from: X9 */
    public static final /* synthetic */ InterfaceC4278e m22188X9(C5498s1 c5498s1) {
        return (InterfaceC4278e) c5498s1.m30063y9();
    }

    /* renamed from: Xa */
    private final void m22189Xa() {
        C2890r c2890r = this.f22309B0;
        if (c2890r == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r = null;
        }
        c2890r.setVisibility(8);
        m22224xa();
        m22172Nb();
    }

    /* renamed from: Za */
    public static /* synthetic */ void m22192Za(C5498s1 c5498s1, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c5498s1.m22255Ya(z10);
    }

    /* renamed from: bb */
    public final void m22195bb(String str, int i10) {
    }

    /* renamed from: db */
    public final void m22198db(int i10, long j10) {
        this.f22314G0.removeMessages(i10);
        this.f22314G0.sendEmptyMessageDelayed(i10, j10);
    }

    /* renamed from: mb */
    public static final void m22208mb(C5498s1 c5498s1) {
        AbstractC5868k.m23674f(c5498s1, "this$0");
        c5498s1.f22310C0.m21962pa();
    }

    /* renamed from: nb */
    public static /* synthetic */ void m22210nb(C5498s1 c5498s1, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c5498s1.m22236I2(str, z10);
    }

    /* renamed from: ob */
    public static final void m22212ob(C5498s1 c5498s1, String str, boolean z10) {
        String str2 = null;
        String str3 = null;
        String string = null;
        String string2 = null;
        String m6878m = null;
        AbstractC5868k.m23674f(c5498s1, "this$0");
        AbstractC5868k.m23674f(str, "$errCode");
        int i10 = R$id.mLayoutError;
        if (((RelativeLayout) c5498s1.m22244O9(i10)) == null) {
            return;
        }
        if ((AbstractC5868k.m23669a("aaa100028", str) || AbstractC5868k.m23669a("aaa100027", str)) && C4842a.f20329a.m19920a().m19931H()) {
            C1466m0.f5627a.m6849V(true);
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3093I6 = c5498s1.m3093I6();
            AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
            Context m3096J6 = c5498s1.m3096J6();
            if (m3096J6 == null || (string2 = m3096J6.getString(com.module.R$string.login_invaild_tips)) == null) {
                str2 = "";
            } else {
                str2 = string2;
            }
            Context m3096J62 = c5498s1.m3096J6();
            if (m3096J62 == null || (string = m3096J62.getString(com.module.R$string.commmon_confirm_text)) == null) {
                str3 = "";
            } else {
                str3 = string;
            }
            C7556b1.m28962j(c7556b1, m3093I6, str2, "", str3, true, new i(), false, null, false, 384, null);
            return;
        }
        if (AbstractC5868k.m23669a("aaa100083", str)) {
            C1466m0.f5627a.m6849V(true);
            InterfaceC5342c interfaceC5342c = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
            if (interfaceC5342c != null) {
                AbstractC0729o m3093I62 = c5498s1.m3093I6();
                AbstractC5868k.m23673e(m3093I62, "childFragmentManager");
                interfaceC5342c.mo21614a(m3093I62, null);
                return;
            }
            return;
        }
        if (((RelativeLayout) c5498s1.m22244O9(i10)).getVisibility() != 0) {
            c5498s1.m22148Cb();
        }
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (AbstractC5868k.m23669a(c1466m0.m6860d(), CdnType.DIGITAL_TYPE_PEERSTAR)) {
            m6878m = c1466m0.m6888w();
        } else {
            m6878m = c1466m0.m6878m();
        }
        TextView textView = (TextView) c5498s1.m22244O9(R$id.mTextAccount);
        C5881x c5881x = C5881x.f23415a;
        String string3 = c5498s1.m3107M8().getString(R$string.error_dialog_account);
        AbstractC5868k.m23673e(string3, "requireContext().getStri…ing.error_dialog_account)");
        String format = String.format(string3, Arrays.copyOf(new Object[]{m6878m}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        textView.setText(format);
        TextView textView2 = (TextView) c5498s1.m22244O9(R$id.mTextVersion);
        String string4 = c5498s1.m3107M8().getString(R$string.error_dialog_version);
        AbstractC5868k.m23673e(string4, "requireContext().getStri…ing.error_dialog_version)");
        String format2 = String.format(string4, Arrays.copyOf(new Object[]{AbstractC5085b.m20603m(c5498s1.m3096J6())}, 1));
        AbstractC5868k.m23673e(format2, "format(format, *args)");
        textView2.setText(format2);
        TextView textView3 = (TextView) c5498s1.m22244O9(R$id.mTextError);
        C7617x c7617x = C7617x.f28030a;
        Context m3107M8 = c5498s1.m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        textView3.setText(c7617x.m29329b(m3107M8, str, z10));
    }

    /* renamed from: pa */
    private final void m22213pa() {
        if (this.f22311D0 != null) {
            return;
        }
        Context m3107M8 = m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        ViewOnClickListenerC5929g viewOnClickListenerC5929g = new ViewOnClickListenerC5929g(m3107M8);
        this.f22311D0 = viewOnClickListenerC5929g;
        viewOnClickListenerC5929g.setOnBottomMenuListener(this);
        ViewOnClickListenerC5929g viewOnClickListenerC5929g2 = this.f22311D0;
        if (viewOnClickListenerC5929g2 != null) {
            viewOnClickListenerC5929g2.setLiveHandle(this.f22314G0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AutoSizeUtils.dp2px(m3096J6(), 160.0f));
        layoutParams.gravity = 80;
        ((LiveRootView) m22244O9(R$id.mLiveRoot)).addView(this.f22311D0, layoutParams);
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17872Q();
        }
    }

    /* renamed from: pb */
    public final void m22214pb() {
        AbstractC0738x m3534m = m3093I6().m3534m();
        AbstractC5868k.m23673e(m3534m, "childFragmentManager.beginTransaction()");
        if (!this.f22310C0.m3190s7()) {
            m3534m.m3645r(R$id.mFlContent, this.f22310C0, "liveContentFrag").mo3228h();
        } else {
            m3534m.mo3237u(this.f22310C0).mo3228h();
        }
        this.f22310C0.m21950fb(new j());
        m22160Ia();
    }

    /* renamed from: qa */
    private final void m22215qa() {
        C0128d c0128d = C0128d.f375a;
        NetSpeedTextView netSpeedTextView = (NetSpeedTextView) m22244O9(R$id.mTvDownSpeed);
        AbstractC5868k.m23673e(netSpeedTextView, "mTvDownSpeed");
        c0128d.m510e(netSpeedTextView);
    }

    /* renamed from: qb */
    private final void m22216qb() {
        m22155Gb();
        ((LinearLayout) m22244O9(R$id.mLlNetStatus)).setVisibility(0);
        m22215qa();
    }

    /* renamed from: ra */
    private final void m22217ra() {
        Handler handler = this.f22338e1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        synchronized (this) {
            HandlerThread handlerThread = this.f22339f1;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            this.f22339f1 = null;
            this.f22338e1 = null;
            C1328x c1328x = C1328x.f4998a;
        }
    }

    /* renamed from: sb */
    public static final void m22218sb(C5498s1 c5498s1) {
        AbstractC5868k.m23674f(c5498s1, "this$0");
        c5498s1.f22310C0.m21960oa();
    }

    /* renamed from: ta */
    private final void m22219ta(InterfaceC5642a interfaceC5642a) {
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17881x(((EpgProgram) this.f22327T0.get(this.f22328U0)).getContentId(), new c(interfaceC5642a));
        }
    }

    /* renamed from: tb */
    private final void m22220tb() {
        boolean z10 = false;
        if (C1407f.f5458a.m6484E()) {
            ViewOnClickListenerC5929g viewOnClickListenerC5929g = this.f22311D0;
            if (viewOnClickListenerC5929g != null && viewOnClickListenerC5929g.getVisibility() == 0) {
                z10 = true;
            }
            if (z10) {
                m22157Ha();
                return;
            }
            return;
        }
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17863A1();
        }
        ViewOnClickListenerC5929g viewOnClickListenerC5929g2 = this.f22311D0;
        if (viewOnClickListenerC5929g2 != null) {
            viewOnClickListenerC5929g2.setVisibility(0);
        }
        m22177Qb();
        m22216qb();
    }

    /* renamed from: ua */
    private final void m22221ua() {
        ViewOnClickListenerC5929g viewOnClickListenerC5929g = this.f22311D0;
        boolean z10 = false;
        if (viewOnClickListenerC5929g != null && viewOnClickListenerC5929g.getVisibility() == 0) {
            z10 = true;
        }
        if (z10) {
            if (C1407f.f5458a.m6484E()) {
                m22157Ha();
            } else {
                m22177Qb();
                m22216qb();
            }
        }
    }

    /* renamed from: ub */
    private final void m22222ub() {
        int i10 = 0;
        if (AbstractC5868k.m23669a(this.f22329V0, "NewVoiceLive") && C1407f.f5458a.m6530v()) {
            i10 = R$string.voice_channel_loading;
        } else {
            i10 = R$string.tip_invalid_number;
        }
        Toast makeText = Toast.makeText(m3096J6(), i10, 0);
        AbstractC6652a.m25971a(makeText);
        makeText.setGravity(17, 0, 100);
        if (m3096J6() instanceof Activity) {
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23672d(m3096J6, "null cannot be cast to non-null type android.app.Activity");
            if (((Activity) m3096J6).isFinishing()) {
                return;
            }
        }
        makeText.show();
    }

    /* renamed from: wb */
    private final void m22223wb() {
        if (m3096J6() != null) {
            int i10 = R$id.mLiveRoot;
            if (((LiveRootView) m22244O9(i10)) != null) {
                if (this.f22317J0 == null) {
                    Context m3107M8 = m3107M8();
                    AbstractC5868k.m23673e(m3107M8, "requireContext()");
                    LiveRootView liveRootView = (LiveRootView) m22244O9(i10);
                    AbstractC5868k.m23673e(liveRootView, "mLiveRoot");
                    ViewOnFocusChangeListenerC5935m viewOnFocusChangeListenerC5935m = new ViewOnFocusChangeListenerC5935m(m3107M8, liveRootView);
                    this.f22317J0 = viewOnFocusChangeListenerC5935m;
                    viewOnFocusChangeListenerC5935m.m24038h(new m());
                    ViewOnFocusChangeListenerC5935m viewOnFocusChangeListenerC5935m2 = this.f22317J0;
                    if (viewOnFocusChangeListenerC5935m2 != null) {
                        viewOnFocusChangeListenerC5935m2.m24037g(new n());
                    }
                    ViewOnFocusChangeListenerC5935m viewOnFocusChangeListenerC5935m3 = this.f22317J0;
                    if (viewOnFocusChangeListenerC5935m3 != null) {
                        viewOnFocusChangeListenerC5935m3.m24036f(new o());
                    }
                }
                m22151Fa();
                ViewOnFocusChangeListenerC5935m viewOnFocusChangeListenerC5935m4 = this.f22317J0;
                if (viewOnFocusChangeListenerC5935m4 != null) {
                    viewOnFocusChangeListenerC5935m4.m24033b(this.f22340g1);
                }
            }
        }
    }

    /* renamed from: xa */
    private final void m22224xa() {
        C1427v.f5519a.m6651o0(-1);
        LiveRootView liveRootView = (LiveRootView) m22244O9(R$id.mLiveRoot);
        C2890r c2890r = this.f22309B0;
        C4177e c4177e = null;
        if (c2890r == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r = null;
        }
        liveRootView.removeView(c2890r);
        m22256ab();
        mo17889L0(true);
        this.f22325R0 = false;
        C4176d c4176d = this.f22308A0;
        AbstractC5868k.m23671c(c4176d);
        c4176d.m17469B();
        C4176d c4176d2 = this.f22308A0;
        AbstractC5868k.m23671c(c4176d2);
        c4176d2.setVisibility(8);
        ((FrameLayout) m22244O9(R$id.mPlayFrameLayout)).removeView(this.f22308A0);
        this.f22308A0 = null;
        C4177e c4177e2 = this.f22346z0;
        if (c4177e2 == null) {
            AbstractC5868k.m23686r("mLSvPlay");
            c4177e2 = null;
        }
        c4177e2.setVisibility(0);
        m22180Rb();
        mo17886I0("");
        mo17898h4();
        int intValue = ((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue();
        C4177e c4177e3 = this.f22346z0;
        if (c4177e3 == null) {
            AbstractC5868k.m23686r("mLSvPlay");
        } else {
            c4177e = c4177e3;
        }
        c4177e.setAspectRatio(C7565e1.f27773a.m28998c(intValue));
    }

    /* renamed from: xb */
    private final void m22225xb() {
        this.f22314G0.removeMessages(41);
        this.f22314G0.sendEmptyMessageDelayed(41, 3000L);
        ((LivePlayerController) m22244O9(R$id.mPlayerController)).m11686f(this.f22322O0);
    }

    /* renamed from: ya */
    private final boolean m22226ya() {
        boolean z10 = false;
        ViewOnClickListenerC5929g viewOnClickListenerC5929g = this.f22311D0;
        if (viewOnClickListenerC5929g == null) {
            return true;
        }
        if (viewOnClickListenerC5929g != null && viewOnClickListenerC5929g.getVisibility() == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    /* renamed from: yb */
    public final void m22227yb(boolean z10) {
        Integer num;
        LivePlayerBufferView livePlayerBufferView;
        if (!this.f22325R0) {
            int i10 = R$id.mPlayerController;
            LivePlayerController livePlayerController = (LivePlayerController) m22244O9(i10);
            if (livePlayerController != null && (livePlayerBufferView = (LivePlayerBufferView) livePlayerController.m11682b(R$id.mBufferView)) != null) {
                num = Integer.valueOf(livePlayerBufferView.getVisibility());
            } else {
                num = null;
            }
            if (z10 && num != null && num.intValue() == 8) {
                ((LivePlayerBufferView) ((LivePlayerController) m22244O9(i10)).m11682b(R$id.mBufferView)).setVisibility(0);
            } else if (!z10 && num != null && num.intValue() == 0) {
                ((LivePlayerBufferView) ((LivePlayerController) m22244O9(i10)).m11682b(R$id.mBufferView)).setVisibility(8);
            }
        }
    }

    @Override // p430z9.AbstractC7766d
    /* renamed from: Aa */
    public InterfaceC4278e mo22228A9() {
        return new C4598f2(this, this);
    }

    /* renamed from: Ba */
    public final String m22230Ba() {
        return this.f22336c1;
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: C4 */
    public void mo5894C4() {
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: D5 */
    public void mo17884D5(int i10, int i11) {
        ViewOnKeyListenerC2883k viewOnKeyListenerC2883k = this.f22312E0;
        if (viewOnKeyListenerC2883k != null) {
            viewOnKeyListenerC2883k.m11649k(i10, i11);
        }
    }

    /* renamed from: Da */
    public final void m22231Da(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        boolean z10 = false;
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "event");
        boolean z11 = false;
        C2890r c2890r = null;
        if (this.f22325R0) {
            if (awakenVoiceAssistEvent.getCommad() == 1) {
                C2890r c2890r2 = this.f22309B0;
                if (c2890r2 == null) {
                    AbstractC5868k.m23686r("mBackInfoBar");
                    c2890r2 = null;
                }
                if (c2890r2.getState() != 7) {
                    C2890r c2890r3 = this.f22309B0;
                    if (c2890r3 == null) {
                        AbstractC5868k.m23686r("mBackInfoBar");
                        c2890r3 = null;
                    }
                    if (c2890r3.getState() != 6) {
                        C2890r c2890r4 = this.f22309B0;
                        if (c2890r4 == null) {
                            AbstractC5868k.m23686r("mBackInfoBar");
                            c2890r4 = null;
                        }
                        if (c2890r4.getState() != 4) {
                            C2890r c2890r5 = this.f22309B0;
                            if (c2890r5 == null) {
                                AbstractC5868k.m23686r("mBackInfoBar");
                                c2890r5 = null;
                            }
                            if (c2890r5.getState() != 0) {
                                C2890r c2890r6 = this.f22309B0;
                                if (c2890r6 == null) {
                                    AbstractC5868k.m23686r("mBackInfoBar");
                                    c2890r6 = null;
                                }
                                if (c2890r6.getState() != 9) {
                                    C2890r c2890r7 = this.f22309B0;
                                    if (c2890r7 == null) {
                                        AbstractC5868k.m23686r("mBackInfoBar");
                                        c2890r7 = null;
                                    }
                                    if (c2890r7.getState() != -1) {
                                        C2890r c2890r8 = this.f22309B0;
                                        if (c2890r8 == null) {
                                            AbstractC5868k.m23686r("mBackInfoBar");
                                            c2890r8 = null;
                                        }
                                        if (c2890r8.getState() != -3) {
                                            C2890r c2890r9 = this.f22309B0;
                                            if (c2890r9 == null) {
                                                AbstractC5868k.m23686r("mBackInfoBar");
                                                c2890r9 = null;
                                            }
                                            if (c2890r9.getState() != -2) {
                                                String voiceMsg = awakenVoiceAssistEvent.getVoiceMsg();
                                                int hashCode = voiceMsg.hashCode();
                                                if (hashCode != 2490196) {
                                                    if (hashCode != 2587682) {
                                                        if (hashCode != 76887510 || !voiceMsg.equals("Pause")) {
                                                            return;
                                                        }
                                                    } else if (!voiceMsg.equals("Stop")) {
                                                        return;
                                                    }
                                                    C4176d c4176d = this.f22308A0;
                                                    if (c4176d != null && c4176d.m17473r()) {
                                                        z11 = true;
                                                    }
                                                    if (z11) {
                                                        C4176d c4176d2 = this.f22308A0;
                                                        if (c4176d2 != null) {
                                                            c4176d2.m17475u();
                                                        }
                                                        this.f22321N0 = true;
                                                        C2890r c2890r10 = this.f22309B0;
                                                        if (c2890r10 == null) {
                                                            AbstractC5868k.m23686r("mBackInfoBar");
                                                        } else {
                                                            c2890r = c2890r10;
                                                        }
                                                        c2890r.setStatus(2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (voiceMsg.equals("Play")) {
                                                    C4176d c4176d3 = this.f22308A0;
                                                    if (c4176d3 != null && !c4176d3.m17473r()) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        C4176d c4176d4 = this.f22308A0;
                                                        if (c4176d4 != null) {
                                                            c4176d4.m17476v();
                                                        }
                                                        this.f22321N0 = false;
                                                        C2890r c2890r11 = this.f22309B0;
                                                        if (c2890r11 == null) {
                                                            AbstractC5868k.m23686r("mBackInfoBar");
                                                            c2890r11 = null;
                                                        }
                                                        if (c2890r11.getState() != 1) {
                                                            C2890r c2890r12 = this.f22309B0;
                                                            if (c2890r12 == null) {
                                                                AbstractC5868k.m23686r("mBackInfoBar");
                                                            } else {
                                                                c2890r = c2890r12;
                                                            }
                                                            c2890r.setStatus(3);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int commad = awakenVoiceAssistEvent.getCommad();
        try {
            if (commad != 5) {
                if (commad == 6) {
                    m22164Jb(Integer.parseInt(awakenVoiceAssistEvent.getVoiceMsg()) + C1407f.f5458a.m6532x() + 1, false);
                }
            }
            m22167Kb(this, Integer.parseInt(awakenVoiceAssistEvent.getVoiceMsg()), false, 2, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Db */
    public final void m22232Db() {
        m22214pb();
        ((LiveRootView) m22244O9(R$id.mLiveRoot)).post(new Runnable() { // from class: l8.q1
            @Override // java.lang.Runnable
            public final void run() {
                C5498s1.m22149Eb(C5498s1.this);
            }
        });
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: E1 */
    public void mo22233E1(int i10, String str) {
        AbstractC5868k.m23674f(str, "operate");
    }

    /* renamed from: Ea */
    public final void m22234Ea() {
        boolean z10 = false;
        if (!this.f22334a1) {
            m22151Fa();
            m22180Rb();
            m22277va();
            m22154Ga();
            ViewOnKeyListenerC2883k viewOnKeyListenerC2883k = this.f22312E0;
            boolean z11 = true;
            if (viewOnKeyListenerC2883k != null && !viewOnKeyListenerC2883k.m11648j()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ViewOnKeyListenerC2883k viewOnKeyListenerC2883k2 = this.f22312E0;
                if (viewOnKeyListenerC2883k2 != null) {
                    viewOnKeyListenerC2883k2.m11646g();
                }
                this.f22312E0 = null;
            }
            ViewOnClickListenerC4019e viewOnClickListenerC4019e = this.f22313F0;
            if (viewOnClickListenerC4019e == null || !viewOnClickListenerC4019e.m3079D7()) {
                z11 = false;
            }
            if (z11) {
                ViewOnClickListenerC4019e viewOnClickListenerC4019e2 = this.f22313F0;
                if (viewOnClickListenerC4019e2 != null) {
                    viewOnClickListenerC4019e2.mo3279p9();
                }
                this.f22313F0 = null;
            }
            C4160d.f18217d.m17390a().m17383i();
            C5442e1 c5442e1 = this.f22310C0;
            if (c5442e1 != null) {
                c5442e1.m21965ua();
            }
            Object systemService = m3107M8().getSystemService("input_method");
            AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(((LiveRootView) m22244O9(R$id.mLiveRoot)).getWindowToken(), 0);
        }
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: F */
    public void mo17885F() {
        C4160d m17390a = C4160d.f18217d.m17390a();
        AbstractC0729o m3294d4 = m3104L8().m3294d4();
        AbstractC5868k.m23673e(m3294d4, "requireActivity().supportFragmentManager");
        C4160d.m17379m(m17390a, m3294d4, new t(), false, 4, null);
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: H5 */
    public void mo22235H5() {
        if (AbstractC5868k.m23669a(this.f22329V0, "NewVoiceLive") && C1407f.f5458a.m6530v()) {
            m22161Ib();
            return;
        }
        mo17898h4();
        C1407f c1407f = C1407f.f5458a;
        c1407f.m6488M();
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17868N0(-1);
        }
        m22160Ia();
        if (!c1407f.m6484E()) {
            m22213pa();
            m22220tb();
        } else {
            m22157Ha();
        }
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: I0 */
    public void mo17886I0(String str) {
        boolean z10 = false;
        AbstractC5868k.m23674f(str, "text");
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        m22227yb(z10);
        LivePlayerController livePlayerController = (LivePlayerController) m22244O9(R$id.mPlayerController);
        if (livePlayerController != null) {
            livePlayerController.setPlayNotice(str);
        }
    }

    /* renamed from: I2 */
    public final void m22236I2(final String str, final boolean z10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f22314G0.post(new Runnable() { // from class: l8.j1
            @Override // java.lang.Runnable
            public final void run() {
                C5498s1.m22212ob(C5498s1.this, str, z10);
            }
        });
    }

    /* renamed from: I4 */
    public final EpgProgram m22237I4() {
        if (this.f22327T0.size() > 0 && this.f22328U0 < this.f22327T0.size()) {
            return (EpgProgram) this.f22327T0.get(this.f22328U0);
        }
        return null;
    }

    /* renamed from: J0 */
    public final String m22238J0() {
        int size = this.f22327T0.size();
        int i10 = this.f22328U0;
        if (size > i10 && i10 >= 0) {
            return ((EpgProgram) this.f22327T0.get(i10)).getContentId();
        }
        return "";
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: J1 */
    public boolean mo22239J1(int i10) {
        boolean z10 = false;
        Channel channel;
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            InterfaceC4278e interfaceC4278e2 = (InterfaceC4278e) m30063y9();
            if (interfaceC4278e2 != null) {
                channel = interfaceC4278e2.mo17875W0();
            } else {
                channel = null;
            }
            z10 = interfaceC4278e.mo17883y1(channel);
        } else {
            z10 = false;
        }
        m22198db(1, 20000L);
        return z10;
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: J2 */
    public void mo17887J2(List list, String str) {
        String str2 = null;
        String str3 = null;
        AbstractC5868k.m23674f(list, "mediaList");
        AbstractC5868k.m23674f(str, "from");
        EpgProgram m22237I4 = m22237I4();
        if (this.f22325R0 && m22237I4 != null) {
            String contentId = m22237I4.getContentId();
            if (contentId == null) {
                str2 = "";
            } else {
                str2 = contentId;
            }
            String value = RangerPlayTag.RECORD.getValue();
            String programName = m22237I4.getProgramName();
            if (programName == null) {
                str3 = "";
            } else {
                str3 = programName;
            }
            Program program = new Program(str2, value, str3, "-1", str, C3309bd.f14106m, list, ((Media) list.get(0)).getName(), 0L);
            AbstractC7027d.m27114a();
            m22219ta(new h(program, this, m22237I4));
        }
    }

    @Override // com.live.view.ViewOnKeyListenerC2883k.a
    /* renamed from: J3 */
    public void mo11651J3() {
        if (!this.f22310C0.m3079D7()) {
            ViewOnClickListenerC5929g viewOnClickListenerC5929g = this.f22311D0;
            if (viewOnClickListenerC5929g != null) {
                viewOnClickListenerC5929g.m23991B();
                return;
            }
            return;
        }
        C7709c.m29787d().m29801m(new HideLockViewEvent());
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: K */
    public void mo17888K(Program program, String str) {
        AbstractC5868k.m23674f(program, "program");
        AbstractC5868k.m23674f(str, "channelCode");
        C4177e c4177e = null;
        if (C1407f.m6469G(C1407f.f5458a, str, false, 2, null) && this.f22332Y0) {
            this.f22315H0 = true;
            this.f22318K0 = false;
            C4177e c4177e2 = this.f22346z0;
            if (c4177e2 == null) {
                AbstractC5868k.m23686r("mLSvPlay");
            } else {
                c4177e = c4177e2;
            }
            c4177e.mo17463A(program, str, program.getBuss());
            if (this.f22319L0) {
                m22253Ua();
            }
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: K0 */
    public void mo5895K0() {
        RelativeLayout relativeLayout = (RelativeLayout) m22244O9(R$id.mLayoutError);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: L0 */
    public void mo17889L0(boolean z10) {
        C4176d c4176d = this.f22308A0;
        if (c4176d != null) {
            c4176d.m17469B();
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: L1 */
    public void mo5896L1() {
    }

    /* renamed from: La */
    public final void m22240La() {
        this.f22325R0 = true;
        InterfaceC4279f.a.m17911a(this, false, 1, null);
        C4177e c4177e = this.f22346z0;
        if (c4177e == null) {
            AbstractC5868k.m23686r("mLSvPlay");
            c4177e = null;
        }
        c4177e.setVisibility(8);
        InterfaceC4279f.a.m17912b(this, false, 1, null);
        C4176d c4176d = this.f22308A0;
        if (c4176d == null) {
            C4176d c4176d2 = new C4176d(m3107M8());
            this.f22308A0 = c4176d2;
            AbstractC5868k.m23671c(c4176d2);
            c4176d2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            ((FrameLayout) m22244O9(R$id.mPlayFrameLayout)).addView(this.f22308A0);
        } else {
            AbstractC5868k.m23671c(c4176d);
            c4176d.setVisibility(0);
        }
        int intValue = ((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue();
        C4176d c4176d3 = this.f22308A0;
        AbstractC5868k.m23671c(c4176d3);
        c4176d3.setAspectRatio(C7565e1.f27773a.m28998c(intValue));
        C4176d c4176d4 = this.f22308A0;
        AbstractC5868k.m23671c(c4176d4);
        c4176d4.setPlayerListener(this);
    }

    /* renamed from: Lb */
    public void m22241Lb() {
        if (this.f22325R0) {
            m22256ab();
            C4176d c4176d = this.f22308A0;
            if (c4176d != null) {
                c4176d.m17469B();
            }
        }
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: M1 */
    public void mo17890M1(String str, String str2) {
        AbstractC5868k.m23674f(str, "channelCode");
        AbstractC5868k.m23674f(str2, "quality");
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: M2 */
    public void mo17891M2() {
        this.f22318K0 = false;
        C4177e c4177e = this.f22346z0;
        if (c4177e == null) {
            AbstractC5868k.m23686r("mLSvPlay");
            c4177e = null;
        }
        c4177e.m17469B();
    }

    /* renamed from: Mb */
    public final void m22242Mb(int i10) {
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17871P(i10);
        }
    }

    /* renamed from: Na */
    public final void m22243Na() {
        Context m3107M8 = m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        C4177e c4177e = new C4177e(m3107M8);
        this.f22346z0 = c4177e;
        c4177e.setPlayerListener(this);
        this.f22325R0 = false;
        C4177e c4177e2 = null;
        InterfaceC4279f.a.m17912b(this, false, 1, null);
        C4177e c4177e3 = this.f22346z0;
        if (c4177e3 == null) {
            AbstractC5868k.m23686r("mLSvPlay");
            c4177e3 = null;
        }
        c4177e3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        int i10 = R$id.mPlayFrameLayout;
        ((FrameLayout) m22244O9(i10)).removeAllViews();
        FrameLayout frameLayout = (FrameLayout) m22244O9(i10);
        C4177e c4177e4 = this.f22346z0;
        if (c4177e4 == null) {
            AbstractC5868k.m23686r("mLSvPlay");
            c4177e4 = null;
        }
        frameLayout.addView(c4177e4);
        if (!AbstractC5868k.m23669a(this.f22329V0, "HomeLive")) {
            this.f22330W0 = ((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue();
            C4177e c4177e5 = this.f22346z0;
            if (c4177e5 == null) {
                AbstractC5868k.m23686r("mLSvPlay");
            } else {
                c4177e2 = c4177e5;
            }
            c4177e2.setAspectRatio(C7565e1.f27773a.m28998c(this.f22330W0));
        }
        ((LiveRootView) m22244O9(R$id.mLiveRoot)).setOnClickListener(new View.OnClickListener() { // from class: l8.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5498s1.m22173Oa(C5498s1.this, view);
            }
        });
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: O0 */
    public void mo17892O0(int i10) {
        C7586l1 c7586l1 = C7586l1.f27877a;
        Context m3107M8 = m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        String string = m3154d7().getString(i10);
        AbstractC5868k.m23673e(string, "resources.getString(resId)");
        C7586l1.m29112f(c7586l1, m3107M8, string, 0, 0, 12, null);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: O5 */
    public void mo5897O5() {
    }

    /* renamed from: O9 */
    public View m22244O9(int i10) {
        View findViewById;
        Map map = this.f22344k1;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    /* renamed from: Ob */
    public final void m22245Ob() {
        if (this.f22325R0) {
            m22224xa();
        }
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17869N2();
        }
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: P */
    public void mo22246P() {
        m22198db(1, 10000L);
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: P1 */
    public void mo17893P1(Channel channel) {
        AbstractC5868k.m23674f(channel, "channel");
        if (m3096J6() != null && AbstractC5868k.m23669a(channel.getRestricted(), MessageService.MSG_DB_READY_REPORT)) {
            C1407f c1407f = C1407f.f5458a;
            int m6529u = c1407f.m6529u();
            int m6528t = c1407f.m6528t();
            if (m6529u == -1) {
                if (!AbstractC5868k.m23669a(this.f22329V0, "NewVoiceLive")) {
                    m6529u = this.f22310C0.m21938Ha();
                } else {
                    m6529u = C5442e1.f22119U0.m21970b();
                }
            }
            if (m6528t == -1 && !AbstractC5868k.m23669a(this.f22329V0, "NewVoiceLive")) {
                m6528t = this.f22310C0.m21937Ga();
            }
            C4982a c4982a = C4982a.f20721a;
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            c4982a.m20335c(m3107M8, "live_last_tab", Integer.valueOf(m6529u));
            Context m3107M82 = m3107M8();
            AbstractC5868k.m23673e(m3107M82, "requireContext()");
            c4982a.m20335c(m3107M82, "live_last_column_id", Integer.valueOf(m6528t));
            Context m3107M83 = m3107M8();
            AbstractC5868k.m23673e(m3107M83, "requireContext()");
            c4982a.m20335c(m3107M83, "live_last_channel_code", channel.getChannelCode());
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: P3 */
    public void mo5898P3(long j10) {
        if (this.f22325R0) {
            C2890r c2890r = this.f22309B0;
            if (c2890r == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
                c2890r = null;
            }
            c2890r.m11726U((int) j10);
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: P5 */
    public void mo5899P5(long j10) {
    }

    /* renamed from: Pa */
    public final boolean m22247Pa() {
        return this.f22320M0;
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: Q */
    public void mo17894Q() {
        C2890r c2890r = this.f22309B0;
        C2890r c2890r2 = null;
        if (c2890r == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r = null;
        }
        if (!c2890r.m11718D()) {
            C2890r c2890r3 = this.f22309B0;
            if (c2890r3 == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
            } else {
                c2890r2 = c2890r3;
            }
            c2890r2.m11724O();
        }
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: Q3 */
    public void mo22248Q3(int i10) {
        EnumC7254b enumC7254b;
        String str = null;
        if (i10 == 0) {
            enumC7254b = EnumC7254b.NATIVE;
        } else {
            enumC7254b = EnumC7254b.IJK;
        }
        C4177e c4177e = this.f22346z0;
        if (c4177e == null) {
            AbstractC5868k.m23686r("mLSvPlay");
            c4177e = null;
        }
        C4177e.m17468z(c4177e, enumC7254b, null, true, 2, null);
        C4094b c4094b = C4094b.f17998a;
        String value = RangerPlayTag.LIVE.getValue();
        Channel m6531w = C1407f.f5458a.m6531w();
        if (m6531w == null || (str = m6531w.getChannelCode()) == null) {
            str = "";
        }
        c4094b.m17149l(value, str, enumC7254b);
        LivePlayerController livePlayerController = (LivePlayerController) m22244O9(R$id.mPlayerController);
        if (livePlayerController != null) {
            livePlayerController.m11685e();
        }
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public void mo3118Q7() {
        DialogC4084w0 dialogC4084w0;
        C4177e c4177e = this.f22346z0;
        if (c4177e != null) {
            if (c4177e == null) {
                AbstractC5868k.m23686r("mLSvPlay");
                c4177e = null;
            }
            c4177e.m17469B();
        }
        m22217ra();
        this.f22314G0.removeCallbacksAndMessages(null);
        this.f22323P0.removeCallbacksAndMessages(null);
        boolean z10 = true;
        C7618x0.f28031a.m29362x(true);
        DialogC4084w0 dialogC4084w02 = this.f22316I0;
        if (dialogC4084w02 == null || !dialogC4084w02.isShowing()) {
            z10 = false;
        }
        if (z10 && (dialogC4084w0 = this.f22316I0) != null) {
            dialogC4084w0.dismiss();
        }
        this.f22316I0 = null;
        super.mo3118Q7();
    }

    /* renamed from: Qa */
    public final boolean m22249Qa() {
        C4177e c4177e = this.f22346z0;
        if (c4177e == null) {
            AbstractC5868k.m23686r("mLSvPlay");
            c4177e = null;
        }
        return c4177e.m17473r();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: R1 */
    public void mo5900R1(int i10) {
        m22145Ab(this, i10, false, null, "ranger", null, null, null, null, null, null, 1014, null);
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: R5 */
    public void mo17895R5() {
        ViewOnClickListenerC4019e viewOnClickListenerC4019e = new ViewOnClickListenerC4019e();
        this.f22313F0 = viewOnClickListenerC4019e;
        viewOnClickListenerC4019e.m17004Q9(this);
        ViewOnClickListenerC4019e viewOnClickListenerC4019e2 = this.f22313F0;
        if (viewOnClickListenerC4019e2 != null) {
            viewOnClickListenerC4019e2.m17003O9(new DialogInterface.OnDismissListener() { // from class: l8.o1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C5498s1.m22152Fb(C5498s1.this, dialogInterface);
                }
            });
        }
        AbstractC0738x m3534m = m3093I6().m3534m();
        AbstractC5868k.m23673e(m3534m, "childFragmentManager.beginTransaction()");
        ViewOnClickListenerC4019e viewOnClickListenerC4019e3 = this.f22313F0;
        if (viewOnClickListenerC4019e3 != null) {
            viewOnClickListenerC4019e3.m3276D9(m3534m, "SetPasswordDialog");
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: S1 */
    public void mo5901S1() {
    }

    @Override // p430z9.AbstractC7766d, p430z9.AbstractC7770h, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        ((LiveRootView) m22244O9(R$id.mLiveRoot)).removeView(this.f22311D0);
        this.f22311D0 = null;
        m22185Va(1);
        m22185Va(2);
        m22154Ga();
        super.mo3123S7();
        mo22268m9();
    }

    /* renamed from: Sa */
    public final void m22250Sa() {
        if (this.f22310C0.m3079D7()) {
            m22185Va(2);
            m22234Ea();
        }
        mo22251T3();
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: T3 */
    public void mo22251T3() {
        C1407f.f5458a.m6505d0(null);
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17867K2(this.f22311D0);
        }
        m22160Ia();
        m22198db(1, 10000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d A[ADDED_TO_REGION] */
    /* renamed from: Ta */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m22252Ta(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            ne.AbstractC5868k.m23674f(r6, r0)
            c8.f r6 = p040c8.C1407f.f5458a
            com.request.result.Channel r6 = r6.m6531w()
            r0 = 0
            if (r6 == 0) goto L13
            java.lang.String r6 = r6.getChannelCode()
            goto L14
        L13:
            r6 = r0
        L14:
            com.request.result.Channel r1 = r4.f22337d1
            if (r1 == 0) goto L1d
            java.lang.String r1 = r1.getChannelCode()
            goto L1e
        L1d:
            r1 = r0
        L1e:
            boolean r6 = ne.AbstractC5868k.m23669a(r6, r1)
            r1 = 0
            if (r6 == 0) goto L34
            com.request.result.Channel r6 = r4.f22337d1
            if (r6 == 0) goto L2d
            java.lang.String r0 = r6.getChannelCode()
        L2d:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L34
            return r1
        L34:
            com.live.view.k r6 = r4.f22312E0
            r0 = 1
            if (r6 == 0) goto L44
            ne.AbstractC5868k.m23671c(r6)
            boolean r6 = r6.m11648j()
            if (r6 != 0) goto L44
            r6 = 1
            goto L45
        L44:
            r6 = 0
        L45:
            da.e r2 = r4.f22313F0
            if (r2 == 0) goto L54
            ne.AbstractC5868k.m23671c(r2)
            boolean r2 = r2.m3079D7()
            if (r2 == 0) goto L54
            r2 = 1
            goto L55
        L54:
            r2 = 0
        L55:
            l8.e1 r3 = r4.f22310C0
            boolean r3 = r3.m3079D7()
            if (r3 != 0) goto L72
            if (r6 != 0) goto L72
            if (r2 != 0) goto L72
            r6 = 19
            if (r5 == r6) goto L6a
            r6 = 20
            if (r5 == r6) goto L6a
            goto L72
        L6a:
            boolean r5 = r4.f22325R0
            if (r5 != 0) goto L72
            r4.m22172Nb()
            return r0
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.C5498s1.m22252Ta(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r0 != null) goto L51;
     */
    @Override // bd.InterfaceC1294a
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5902U() {
        /*
            r6 = this;
            boolean r0 = r6.f22325R0
            r1 = 0
            if (r0 != 0) goto L46
            r0 = 1
            p223l8.C5498s1.f22307n1 = r0
            r6.f22318K0 = r0
            r6.m22277va()
            c8.f r0 = p040c8.C1407f.f5458a
            boolean r2 = r0.m6484E()
            if (r2 == 0) goto L38
            com.request.result.Channel r0 = r0.m6531w()
            if (r0 == 0) goto L31
            java.util.List r0 = r0.getMosaicChannes()
            if (r0 == 0) goto L31
            int r2 = r6.f22340g1
            java.lang.Object r0 = p043ce.AbstractC1498j.m6978t(r0, r2)
            com.request.result.MosaicChannelBean r0 = (com.request.result.MosaicChannelBean) r0
            if (r0 == 0) goto L31
            java.lang.String r0 = r0.getLanguage()
            if (r0 != 0) goto L33
        L31:
            java.lang.String r0 = ""
        L33:
            int r2 = r6.f22340g1
            r6.m22195bb(r0, r2)
        L38:
            int r0 = com.live.R$id.mPlayerController
            android.view.View r0 = r6.m22244O9(r0)
            com.live.view.player.LivePlayerController r0 = (com.live.view.player.LivePlayerController) r0
            if (r0 == 0) goto L78
            r0.m11684d()
            goto L78
        L46:
            com.live.view.r r0 = r6.f22309B0
            r2 = 0
            java.lang.String r3 = "mBackInfoBar"
            if (r0 != 0) goto L51
            ne.AbstractC5868k.m23686r(r3)
            r0 = r2
        L51:
            r4 = 4
            r0.setStatus(r4)
            com.live.view.r r0 = r6.f22309B0
            if (r0 != 0) goto L5d
            ne.AbstractC5868k.m23686r(r3)
            r0 = r2
        L5d:
            ed.d r4 = r6.f22308A0
            if (r4 == 0) goto L67
            long r4 = r4.getDuration()
            int r5 = (int) r4
            goto L68
        L67:
            r5 = 0
        L68:
            r0.setTotalTime(r5)
            com.live.view.r r0 = r6.f22309B0
            if (r0 != 0) goto L73
            ne.AbstractC5868k.m23686r(r3)
            goto L74
        L73:
            r2 = r0
        L74:
            r0 = 3
            r2.setStatus(r0)
        L78:
            r6.m22227yb(r1)
            r6.mo17898h4()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.C5498s1.mo5902U():void");
    }

    /* renamed from: Ua */
    public final void m22253Ua() {
        this.f22332Y0 = false;
        if (m3096J6() == null) {
            return;
        }
        m22227yb(false);
        C4177e c4177e = this.f22346z0;
        if (c4177e != null) {
            this.f22318K0 = false;
            if (c4177e == null) {
                AbstractC5868k.m23686r("mLSvPlay");
                c4177e = null;
            }
            c4177e.m17469B();
        }
        m22241Lb();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: V0 */
    public void mo5903V0(long j10) {
        if (this.f22325R0) {
            C2890r c2890r = this.f22309B0;
            if (c2890r == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
                c2890r = null;
            }
            c2890r.setSecondaryProgress((int) j10);
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: V1 */
    public void mo5904V1() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: W1 */
    public void mo5905W1(Bitmap bitmap) {
        AbstractC5868k.m23674f(bitmap, "bitmap");
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: X2 */
    public void mo5906X2(Status status) {
        AbstractC5868k.m23674f(status, Progress.STATUS);
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: Y0 */
    public void mo17896Y0(boolean z10) {
        m22227yb(z10);
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: Y3 */
    public void mo22254Y3(int i10, String str) {
        AbstractC5868k.m23674f(str, "quality");
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17866G2(i10, str);
        }
        m22198db(1, 10000L);
    }

    @Override // com.live.view.ViewOnKeyListenerC2883k.a
    /* renamed from: Y4 */
    public void mo11652Y4(ViewOnKeyListenerC2883k viewOnKeyListenerC2883k) {
        AbstractC5868k.m23674f(viewOnKeyListenerC2883k, "view");
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17873T2();
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: Y5 */
    public C7077d mo5907Y5(List list) {
        AbstractC5868k.m23674f(list, "audioTrackList");
        return null;
    }

    /* renamed from: Ya */
    public final void m22255Ya(boolean z10) {
        String str = null;
        String str2 = null;
        InterfaceC4278e interfaceC4278e;
        this.f22332Y0 = true;
        if (this.f22325R0) {
            if (!this.f22321N0 && (interfaceC4278e = (InterfaceC4278e) m30063y9()) != null) {
                interfaceC4278e.mo17864B();
                return;
            }
            return;
        }
        Channel m6531w = C1407f.f5458a.m6531w();
        C4177e c4177e = null;
        if (m6531w != null) {
            str = m6531w.getRestricted();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, "1")) {
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v != null) {
                str2 = m6887v.getRestrictedStatus();
            } else {
                str2 = null;
            }
            if (!AbstractC5868k.m23669a(str2, "1")) {
                this.f22318K0 = false;
                C4177e c4177e2 = this.f22346z0;
                if (c4177e2 == null) {
                    AbstractC5868k.m23686r("mLSvPlay");
                } else {
                    c4177e = c4177e2;
                }
                c4177e.m17469B();
                return;
            }
        }
        mo17886I0("");
        m22172Nb();
    }

    @Override // p101da.ViewOnClickListenerC4019e.a
    /* renamed from: Z2 */
    public void mo17006Z2() {
        m22257cb();
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: a3 */
    public void mo17897a3() {
        if (AbstractC5868k.m23669a(this.f22329V0, "HomeLive")) {
            Fragment m3133W6 = m3133W6();
            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.HomeLiveFragment");
            if (!((C5500t) m3133W6).m22346sa()) {
                return;
            }
        }
        if (!this.f22310C0.m3079D7()) {
            m22213pa();
            m22220tb();
        }
    }

    /* renamed from: ab */
    public final void m22256ab() {
        Long l10;
        if (this.f22325R0) {
            C4176d c4176d = this.f22308A0;
            if (c4176d != null) {
                l10 = Long.valueOf(c4176d.getCurrentProgress());
            } else {
                l10 = null;
            }
            String contentId = ((EpgProgram) this.f22327T0.get(this.f22328U0)).getContentId();
            if (l10 != null && l10.longValue() > 1000 && contentId != null) {
                this.f22326S0 = (int) l10.longValue();
                InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
                if (interfaceC4278e != null) {
                    interfaceC4278e.mo17878o(contentId, (int) l10.longValue());
                }
            }
        }
    }

    @Override // p101da.ViewOnClickListenerC4019e.a
    /* renamed from: b2 */
    public void mo17007b2() {
        ViewOnClickListenerC4019e viewOnClickListenerC4019e = this.f22313F0;
        boolean z10 = false;
        if (viewOnClickListenerC4019e != null && viewOnClickListenerC4019e.m3079D7()) {
            z10 = true;
        }
        if (z10) {
            ViewOnClickListenerC4019e viewOnClickListenerC4019e2 = this.f22313F0;
            if (viewOnClickListenerC4019e2 != null) {
                viewOnClickListenerC4019e2.mo3279p9();
            }
            this.f22313F0 = null;
        }
    }

    /* renamed from: cb */
    public final void m22257cb() {
        if (this.f22310C0.m3079D7()) {
            m22198db(2, 15000L);
            return;
        }
        ViewOnClickListenerC5929g viewOnClickListenerC5929g = this.f22311D0;
        boolean z10 = false;
        if (viewOnClickListenerC5929g != null && viewOnClickListenerC5929g.getVisibility() == 0) {
            z10 = true;
        }
        if (z10) {
            m22198db(1, 10000L);
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void changeUserAccountSuccess(ChangeUserAccountSuccessEvent changeUserAccountSuccessEvent) {
        AbstractC5868k.m23674f(changeUserAccountSuccessEvent, "event");
        C1466m0 c1466m0 = C1466m0.f5627a;
        c1466m0.m6847T(true);
        c1466m0.m6857b0(true);
        if (this.f22332Y0) {
            toStartPlay(new ToStartPlayEvent("HomeLive"));
        }
    }

    /* renamed from: d4 */
    public final boolean m22258d4() {
        return this.f22325R0;
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: e0 */
    public void mo22259e0(int i10) {
        C4177e c4177e = this.f22346z0;
        if (c4177e == null) {
            AbstractC5868k.m23686r("mLSvPlay");
            c4177e = null;
        }
        c4177e.setAspectRatio(i10);
        m22198db(1, 10000L);
    }

    /* renamed from: eb */
    public final void m22260eb() {
        m22279wa();
        if (this.f22328U0 + 1 < this.f22327T0.size()) {
            mo17889L0(true);
            C2890r c2890r = this.f22309B0;
            C2890r c2890r2 = null;
            if (c2890r == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
                c2890r = null;
            }
            c2890r.m11721K();
            C2890r c2890r3 = this.f22309B0;
            if (c2890r3 == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
            } else {
                c2890r2 = c2890r3;
            }
            c2890r2.setStatus(0);
            this.f22328U0++;
            m22175Pb();
            InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
            if (interfaceC4278e != null) {
                interfaceC4278e.mo17864B();
                return;
            }
            return;
        }
        m22189Xa();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: f3 */
    public void mo5908f3() {
    }

    /* renamed from: fb */
    public final void m22261fb(boolean z10) {
        this.f22320M0 = z10;
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void findLockChannel(LockMonitorEvent lockMonitorEvent) {
        InterfaceC4278e interfaceC4278e;
        AbstractC5868k.m23674f(lockMonitorEvent, "event");
        if (!this.f22325R0 && lockMonitorEvent.getLockedChannel() != null && (lockMonitorEvent.getLockedChannel() instanceof ChannelList)) {
            Object lockedChannel = lockMonitorEvent.getLockedChannel();
            AbstractC5868k.m23672d(lockedChannel, "null cannot be cast to non-null type com.live.db.ChannelList");
            if (!AbstractC6567a.m25634d(((ChannelList) lockedChannel).getChannelCode()) && (interfaceC4278e = (InterfaceC4278e) m30063y9()) != null) {
                Object lockedChannel2 = lockMonitorEvent.getLockedChannel();
                AbstractC5868k.m23672d(lockedChannel2, "null cannot be cast to non-null type com.live.db.ChannelList");
                interfaceC4278e.mo17882x2((ChannelList) lockedChannel2, lockMonitorEvent.isLock());
            }
        }
    }

    @Override // com.live.view.ViewOnKeyListenerC2883k.a
    /* renamed from: g6 */
    public void mo11653g6(ViewOnKeyListenerC2883k viewOnKeyListenerC2883k, String str, String str2) {
        AbstractC5868k.m23674f(viewOnKeyListenerC2883k, "view");
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17880w0(str, str2);
        }
    }

    /* renamed from: gb */
    public final void m22262gb(boolean z10) {
        this.f22319L0 = z10;
    }

    @InterfaceC7719m
    public final void getFavListSucMessage(GetLiveFavoriteSucEvent getLiveFavoriteSucEvent) {
        AbstractC5868k.m23674f(getLiveFavoriteSucEvent, "event");
        ViewOnClickListenerC5929g viewOnClickListenerC5929g = this.f22311D0;
        boolean z10 = false;
        if (viewOnClickListenerC5929g != null && viewOnClickListenerC5929g.getVisibility() == 0) {
            z10 = true;
        }
        if (z10) {
            m22177Qb();
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void getLiveDataSuccess(GetLiveDataSuccessEvent getLiveDataSuccessEvent) {
        InterfaceC4278e interfaceC4278e;
        AbstractC5868k.m23674f(getLiveDataSuccessEvent, "event");
        if (AbstractC5868k.m23669a(this.f22329V0, "HomeLive") && !AbstractC5868k.m23669a(getLiveDataSuccessEvent.getFrom(), "NewVoiceLive") && !C1466m0.f5627a.m6830C() && (interfaceC4278e = (InterfaceC4278e) m30063y9()) != null) {
            interfaceC4278e.mo17871P(getLiveDataSuccessEvent.getColumnId());
        }
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: h4 */
    public void mo17898h4() {
        DialogC4084w0 dialogC4084w0;
        RelativeLayout relativeLayout = (RelativeLayout) m22244O9(R$id.mLayoutError);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        boolean z10 = false;
        C7618x0.m29358y(C7618x0.f28031a, false, 1, null);
        DialogC4084w0 dialogC4084w02 = this.f22316I0;
        if (dialogC4084w02 != null && dialogC4084w02.isShowing()) {
            z10 = true;
        }
        if (z10 && (dialogC4084w0 = this.f22316I0) != null) {
            dialogC4084w0.dismiss();
        }
    }

    /* renamed from: hb */
    public final void m22263hb(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f22329V0 = str;
    }

    @InterfaceC7719m
    public final void hideContent(HideContentFragmentEvent hideContentFragmentEvent) {
        AbstractC5868k.m23674f(hideContentFragmentEvent, "event");
        if (m3073B7()) {
            m22185Va(2);
            m22234Ea();
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: i1 */
    public boolean mo5909i1() {
        return false;
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: i3 */
    public void mo17899i3(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        C1407f c1407f = C1407f.f5458a;
        if (C1407f.m6469G(c1407f, str, false, 2, null)) {
            this.f22337d1 = c1407f.m6531w();
        }
    }

    /* renamed from: ib */
    public final void m22264ib(boolean z10) {
        this.f22321N0 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r0.m22346sa() == true) goto L43;
     */
    /* renamed from: jb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22265jb() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f22329V0
            java.lang.String r1 = "HomeLive"
            boolean r0 = ne.AbstractC5868k.m23669a(r0, r1)
            java.lang.String r1 = "mLSvPlay"
            java.lang.String r2 = "play_ratio"
            r3 = 0
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L53
            androidx.fragment.app.Fragment r0 = r7.m3133W6()
            boolean r6 = r0 instanceof p223l8.C5500t
            if (r6 == 0) goto L1f
            l8.t r0 = (p223l8.C5500t) r0
            goto L20
        L1f:
            r0 = r3
        L20:
            if (r0 == 0) goto L2a
            boolean r0 = r0.m22346sa()
            r6 = 1
            if (r0 != r6) goto L2a
            goto L2b
        L2a:
            r6 = 0
        L2b:
            if (r6 == 0) goto L2e
            goto L53
        L2e:
            xa.i1$f r0 = p400xa.C7577i1.f27838b
            xa.i1 r0 = r0.m29085d()
            java.lang.Object r0 = r0.m29074f(r2, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L75
            ed.e r0 = r7.f22346z0
            if (r0 != 0) goto L48
            ne.AbstractC5868k.m23686r(r1)
            goto L49
        L48:
            r3 = r0
        L49:
            xa.e1 r0 = p400xa.C7565e1.f27773a
            int r0 = r0.m28998c(r4)
            r3.setAspectRatio(r0)
            goto L75
        L53:
            xa.i1$f r0 = p400xa.C7577i1.f27838b
            xa.i1 r0 = r0.m29085d()
            java.lang.Object r0 = r0.m29074f(r2, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            ed.e r2 = r7.f22346z0
            if (r2 != 0) goto L6b
            ne.AbstractC5868k.m23686r(r1)
            goto L6c
        L6b:
            r3 = r2
        L6c:
            xa.e1 r1 = p400xa.C7565e1.f27773a
            int r0 = r1.m28998c(r0)
            r3.setAspectRatio(r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.C5498s1.m22265jb():void");
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: k4 */
    public void mo17900k4() {
        boolean z10 = false;
        if (AbstractC4161e.f18225a.m17399b().length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            C4160d m17390a = C4160d.f18217d.m17390a();
            AbstractC0729o m3294d4 = m3104L8().m3294d4();
            AbstractC5868k.m23673e(m3294d4, "requireActivity().supportFragmentManager");
            C4160d.m17381p(m17390a, m3294d4, new r(), false, false, 12, null);
            return;
        }
        C4160d m17390a2 = C4160d.f18217d.m17390a();
        AbstractC0729o m3294d42 = m3104L8().m3294d4();
        AbstractC5868k.m23673e(m3294d42, "requireActivity().supportFragmentManager");
        C4160d.m17379m(m17390a2, m3294d42, new s(), false, 4, null);
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: k5 */
    public void mo17901k5(String str, String str2) {
        AbstractC5868k.m23674f(str, AnalyticsConfig.RTD_START_TIME);
        AbstractC5868k.m23674f(str2, "endTime");
        Context m3107M8 = m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        ViewOnKeyListenerC2883k viewOnKeyListenerC2883k = new ViewOnKeyListenerC2883k(m3107M8, null, 0, 6, null);
        this.f22312E0 = viewOnKeyListenerC2883k;
        viewOnKeyListenerC2883k.setId(R$id.live_lock_time_root);
        ViewOnKeyListenerC2883k viewOnKeyListenerC2883k2 = this.f22312E0;
        if (viewOnKeyListenerC2883k2 != null) {
            viewOnKeyListenerC2883k2.setBackgroundColor(m3107M8().getResources().getColor(R$color.color_80414141));
        }
        ViewOnKeyListenerC2883k viewOnKeyListenerC2883k3 = this.f22312E0;
        if (viewOnKeyListenerC2883k3 != null) {
            viewOnKeyListenerC2883k3.setOrientation(1);
        }
        ViewOnKeyListenerC2883k viewOnKeyListenerC2883k4 = this.f22312E0;
        if (viewOnKeyListenerC2883k4 != null) {
            viewOnKeyListenerC2883k4.m11650l(str, str2);
        }
        ViewOnKeyListenerC2883k viewOnKeyListenerC2883k5 = this.f22312E0;
        if (viewOnKeyListenerC2883k5 != null) {
            viewOnKeyListenerC2883k5.setLockListener(this);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AutoSizeUtils.dp2px(m3096J6(), 308.0f), AutoSizeUtils.dp2px(m3096J6(), 227.0f));
        layoutParams.gravity = 17;
        ((LiveRootView) m22244O9(R$id.mLiveRoot)).addView(this.f22312E0, layoutParams);
    }

    @Override // p430z9.AbstractC7766d, p430z9.AbstractC7770h, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        if (!AbstractC5868k.m23669a(this.f22329V0, "HomeLive") && !AbstractC5868k.m23669a(this.f22329V0, "VoiceLive") && !AbstractC5868k.m23669a(this.f22329V0, "NewVoiceLive")) {
            m22245Ob();
        }
    }

    /* renamed from: kb */
    public final void m22266kb(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f22336c1 = str;
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: l3 */
    public void mo17902l3() {
        C2890r c2890r = this.f22309B0;
        C2890r c2890r2 = null;
        if (c2890r == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r = null;
        }
        if (c2890r.m11719E()) {
            C2890r c2890r3 = this.f22309B0;
            if (c2890r3 == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
                c2890r3 = null;
            }
            c2890r3.setSettingVisibility(false);
            m22180Rb();
        }
        C2890r c2890r4 = this.f22309B0;
        if (c2890r4 == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r4 = null;
        }
        if (c2890r4.m11718D()) {
            C2890r c2890r5 = this.f22309B0;
            if (c2890r5 == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
            } else {
                c2890r2 = c2890r5;
            }
            c2890r2.m11730s();
            m22180Rb();
        }
    }

    /* renamed from: lb */
    public final void m22267lb() {
        m22214pb();
        ((LiveRootView) m22244O9(R$id.mLiveRoot)).post(new Runnable() { // from class: l8.r1
            @Override // java.lang.Runnable
            public final void run() {
                C5498s1.m22208mb(C5498s1.this);
            }
        });
    }

    @InterfaceC7719m
    public final void liveGuideShow(LiveGuideShow liveGuideShow) {
        AbstractC5868k.m23674f(liveGuideShow, "event");
        if (m3073B7()) {
            this.f22334a1 = liveGuideShow.isShowing();
            if (liveGuideShow.isShowing()) {
                m22185Va(2);
                if (m22226ya() && !this.f22310C0.m3079D7()) {
                    m22198db(2, 15000L);
                    m22214pb();
                    this.f22310C0.m21952ib();
                    if (!this.f22325R0) {
                        m22216qb();
                        return;
                    }
                    return;
                }
                return;
            }
            m22198db(2, 15000L);
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void lockChannel(LockChannelEvent lockChannelEvent) {
        AbstractC5868k.m23674f(lockChannelEvent, "event");
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17883y1(lockChannelEvent.getChannel());
        }
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: m1 */
    public void mo17903m1() {
        LivePlayerController livePlayerController = (LivePlayerController) m22244O9(R$id.mPlayerController);
        if (livePlayerController != null) {
            livePlayerController.setPlayNotice("");
        }
        m22227yb(true);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: m2 */
    public void mo5910m2() {
    }

    @Override // p430z9.AbstractC7766d, p430z9.AbstractC7770h
    /* renamed from: m9 */
    public void mo22268m9() {
        this.f22344k1.clear();
    }

    @Override // p101da.ViewOnClickListenerC4019e.a
    /* renamed from: n2 */
    public void mo17008n2() {
        ViewOnKeyListenerC2883k viewOnKeyListenerC2883k = this.f22312E0;
        if (viewOnKeyListenerC2883k != null) {
            viewOnKeyListenerC2883k.m11645f();
        }
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: n9 */
    public void mo22269n9() {
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: o9 */
    public void mo22270o9() {
        m22170Ma();
        m22243Na();
        InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
        if (m19921b != null) {
            AbstractC0749c mo953f6 = mo953f6();
            AbstractC5868k.m23673e(mo953f6, "lifecycle");
            m19921b.mo19984g(mo953f6);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r0.m11718D() != false) goto L429;
     */
    @Override // p011aa.InterfaceC0124b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.C5498s1.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: p6 */
    public void mo22271p6() {
        ViewOnClickListenerC5929g viewOnClickListenerC5929g = this.f22311D0;
        if (viewOnClickListenerC5929g != null) {
            viewOnClickListenerC5929g.setVisibility(8);
        }
        m22185Va(1);
        m22198db(2, 15000L);
        m22214pb();
        this.f22310C0.m21952ib();
        m22216qb();
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: p9 */
    public int mo22272p9() {
        return R$layout.frag_live;
    }

    @Override // p101da.ViewOnClickListenerC4019e.a
    /* renamed from: q0 */
    public void mo17009q0() {
        ViewOnClickListenerC4019e.a.C7837a.m17010a(this);
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: q3 */
    public void mo17904q3(Channel channel) {
        AbstractC5868k.m23674f(channel, "channel");
        ViewOnClickListenerC4019e viewOnClickListenerC4019e = new ViewOnClickListenerC4019e();
        viewOnClickListenerC4019e.m17004Q9(new p(channel, viewOnClickListenerC4019e));
        AbstractC0738x m3534m = m3093I6().m3534m();
        AbstractC5868k.m23673e(m3534m, "childFragmentManager.beginTransaction()");
        viewOnClickListenerC4019e.m3276D9(m3534m, "SetRestrictPwdDialog");
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: q4 */
    public void mo5911q4() {
        if (!this.f22325R0) {
            ((LivePlayerBufferView) ((LivePlayerController) m22244O9(R$id.mPlayerController)).m11682b(R$id.mBufferView)).setVisibility(8);
            return;
        }
        C2890r c2890r = this.f22309B0;
        C2890r c2890r2 = null;
        if (c2890r == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r = null;
        }
        if (c2890r.getState() == 1) {
            C2890r c2890r3 = this.f22309B0;
            if (c2890r3 == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
            } else {
                c2890r2 = c2890r3;
            }
            c2890r2.setStatus(3);
        }
    }

    @Override // p430z9.AbstractC7770h
    /* renamed from: q9 */
    public void mo22273q9() {
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: r3 */
    public void mo17905r3(String str, String str2) {
        boolean z10 = false;
        AbstractC5868k.m23674f(str, AnalyticsConfig.RTD_START_TIME);
        AbstractC5868k.m23674f(str2, "endTime");
        if (AbstractC4161e.f18225a.m17399b().length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            C4160d m17390a = C4160d.f18217d.m17390a();
            AbstractC0729o m3294d4 = m3104L8().m3294d4();
            AbstractC5868k.m23673e(m3294d4, "requireActivity().supportFragmentManager");
            C4160d.m17381p(m17390a, m3294d4, new k(str, str2), false, false, 12, null);
            return;
        }
        C4160d m17390a2 = C4160d.f18217d.m17390a();
        AbstractC0729o m3294d42 = m3104L8().m3294d4();
        AbstractC5868k.m23673e(m3294d42, "requireActivity().supportFragmentManager");
        C4160d.m17379m(m17390a2, m3294d42, new l(str, str2), false, 4, null);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: r4 */
    public void mo5912r4() {
        if (!this.f22325R0) {
            ((LivePlayerBufferView) ((LivePlayerController) m22244O9(R$id.mPlayerController)).m11682b(R$id.mBufferView)).setVisibility(0);
            return;
        }
        C2890r c2890r = this.f22309B0;
        C2890r c2890r2 = null;
        if (c2890r == null) {
            AbstractC5868k.m23686r("mBackInfoBar");
            c2890r = null;
        }
        if (c2890r.getState() != 0) {
            C2890r c2890r3 = this.f22309B0;
            if (c2890r3 == null) {
                AbstractC5868k.m23686r("mBackInfoBar");
                c2890r3 = null;
            }
            if (c2890r3.getState() != 2) {
                C2890r c2890r4 = this.f22309B0;
                if (c2890r4 == null) {
                    AbstractC5868k.m23686r("mBackInfoBar");
                } else {
                    c2890r2 = c2890r4;
                }
                c2890r2.setStatus(1);
            }
        }
    }

    /* renamed from: rb */
    public final void m22274rb() {
        m22214pb();
        ((LiveRootView) m22244O9(R$id.mLiveRoot)).post(new Runnable() { // from class: l8.p1
            @Override // java.lang.Runnable
            public final void run() {
                C5498s1.m22218sb(C5498s1.this);
            }
        });
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: s2 */
    public void mo22275s2() {
        if (AbstractC5868k.m23669a(this.f22329V0, "NewVoiceLive") && C1407f.f5458a.m6530v()) {
            m22161Ib();
            return;
        }
        mo17898h4();
        C1407f c1407f = C1407f.f5458a;
        c1407f.m6488M();
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17868N0(1);
        }
        m22160Ia();
        if (!c1407f.m6484E()) {
            m22213pa();
            m22220tb();
        } else {
            m22157Ha();
        }
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: s6 */
    public void mo17906s6(boolean z10) {
        ViewOnClickListenerC5929g viewOnClickListenerC5929g = this.f22311D0;
        if (viewOnClickListenerC5929g != null) {
            viewOnClickListenerC5929g.setLockStatus(z10);
        }
        C7709c.m29787d().m29801m(new RefreshLockEvent(z10));
    }

    /* renamed from: sa */
    public final void m22276sa() {
        String str = null;
        this.f22332Y0 = true;
        C1407f c1407f = C1407f.f5458a;
        if (c1407f.m6532x() == -1) {
            c1407f.m6506e0(0);
        }
        mo17898h4();
        if (c1407f.m6528t() == c1407f.m6525q()) {
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v != null) {
                str = m6887v.getUserIdentity();
            } else {
                str = null;
            }
            if (!AbstractC5868k.m23669a(str, "2")) {
                c1407f.m6501Z(c1407f.m6523o());
                this.f22310C0.m21953jb(c1407f.m6523o());
            }
        }
    }

    @InterfaceC7719m
    public final void showInfoBar(ShowLiveInfoBarEvent showLiveInfoBarEvent) {
        AbstractC5868k.m23674f(showLiveInfoBarEvent, "event");
        if (!this.f22310C0.m3079D7()) {
            m22213pa();
            m22220tb();
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void stopLiveStream(StopLiveStreamEvent stopLiveStreamEvent) {
        AbstractC5868k.m23674f(stopLiveStreamEvent, "event");
        if (AbstractC5868k.m23669a(this.f22329V0, "VoiceLive")) {
            return;
        }
        C4177e c4177e = this.f22346z0;
        if (c4177e == null) {
            AbstractC5868k.m23686r("mLSvPlay");
            c4177e = null;
        }
        c4177e.m17469B();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: t */
    public void mo5913t(String str, String str2, long j10) {
        AbstractC5868k.m23674f(str, "adName");
        AbstractC5868k.m23674f(str2, "path");
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: t6 */
    public void mo17907t6(boolean z10) {
        this.f22318K0 = false;
        C4177e c4177e = this.f22346z0;
        if (c4177e == null) {
            AbstractC5868k.m23686r("mLSvPlay");
            c4177e = null;
        }
        c4177e.m17469B();
    }

    @InterfaceC7719m
    public final void toStartPlay(ToStartPlayEvent toStartPlayEvent) {
        AbstractC5868k.m23674f(toStartPlayEvent, "event");
        if (!AbstractC5868k.m23669a(this.f22329V0, toStartPlayEvent.getParentType())) {
            return;
        }
        if (this.f22325R0) {
            m22224xa();
        }
        m22172Nb();
    }

    @InterfaceC7719m
    public final void toStartPlayBack(ToStartPlayBackEvent toStartPlayBackEvent) {
        AbstractC5868k.m23674f(toStartPlayBackEvent, "event");
        if (AbstractC5868k.m23669a(toStartPlayBackEvent.getParentType(), this.f22329V0)) {
            m22227yb(false);
            m22256ab();
            this.f22327T0.clear();
            this.f22327T0.addAll(C1427v.f5519a.m6631Q());
            this.f22328U0 = 0;
            m22240La();
            mo17898h4();
            mo17886I0("");
            m22166Ka();
            m22175Pb();
            InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
            if (interfaceC4278e != null) {
                interfaceC4278e.mo17864B();
            }
            m22160Ia();
        }
    }

    @InterfaceC7719m(sticky = true, threadMode = ThreadMode.MAIN)
    public final void toStartPlayVoiceSearch(ToStartPlayVoiceSearchEvent toStartPlayVoiceSearchEvent) {
        AbstractC5868k.m23674f(toStartPlayVoiceSearchEvent, "event");
        if (!AbstractC5868k.m23669a(this.f22329V0, "VoiceLive")) {
            return;
        }
        if (this.f22325R0) {
            m22224xa();
        }
        m22172Nb();
        C7709c.m29787d().m29805t(toStartPlayVoiceSearchEvent);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: u1 */
    public void mo5914u1() {
    }

    @InterfaceC7719m
    public final void updateLiveNotice(UpdateLiveNoticeEvent updateLiveNoticeEvent) {
        AbstractC5868k.m23674f(updateLiveNoticeEvent, "event");
        LivePlayerController livePlayerController = (LivePlayerController) m22244O9(R$id.mPlayerController);
        if (livePlayerController != null) {
            livePlayerController.m11688h();
        }
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: v3 */
    public void mo17908v3(String str) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        LivePlayerController livePlayerController = (LivePlayerController) m22244O9(R$id.mPlayerController);
        if (livePlayerController != null) {
            livePlayerController.setChannelName(str);
        }
    }

    /* renamed from: va */
    public final void m22277va() {
        if (this.f22320M0 && this.f22318K0 && C1407f.f5458a.m6484E()) {
            m22223wb();
        } else {
            m22160Ia();
        }
    }

    /* renamed from: vb */
    public final void m22278vb() {
        if (!m22226ya()) {
            m22157Ha();
            return;
        }
        if (!this.f22310C0.m3079D7()) {
            if (C1407f.f5458a.m6484E()) {
                return;
            }
            m22198db(2, 15000L);
            m22214pb();
            this.f22310C0.m21952ib();
            if (!this.f22325R0) {
                m22216qb();
                return;
            }
            return;
        }
        m22185Va(2);
        m22234Ea();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: w6 */
    public void mo5915w6() {
        C1456h0.a aVar;
        String str = null;
        DialogC4084w0 dialogC4084w0;
        DialogC4084w0 dialogC4084w02 = this.f22316I0;
        boolean z10 = false;
        if (dialogC4084w02 != null && dialogC4084w02.isShowing()) {
            z10 = true;
        }
        if (z10 && (dialogC4084w0 = this.f22316I0) != null) {
            dialogC4084w0.dismiss();
        }
        C7618x0 c7618x0 = C7618x0.f28031a;
        if (!c7618x0.m29363z()) {
            String str2 = null;
            if (this.f22325R0) {
                EpgProgram m22237I4 = m22237I4();
                if (m22237I4 != null) {
                    str2 = m22237I4.getProgramName();
                }
            } else {
                Channel m6531w = C1407f.f5458a.m6531w();
                if (m6531w != null) {
                    str2 = m6531w.getName();
                }
            }
            if (this.f22325R0) {
                aVar = C1456h0.a.RECORD;
            } else {
                aVar = C1456h0.a.LIVE;
            }
            String m6784b = aVar.m6784b();
            ArrayList arrayList = new ArrayList();
            String m6776l = C1456h0.f5574a.m6776l();
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
            c7618x0.m29359C(null, arrayList, false, m6776l, "EC11", AgooConstants.ACK_BODY_NULL, str, "", m6784b, "", "");
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            c7618x0.m29361F(m3107M8);
            c7618x0.m29360E(this.f22343j1);
        }
    }

    /* renamed from: wa */
    public final void m22279wa() {
        InterfaceC4278e interfaceC4278e;
        if (this.f22325R0 && ((EpgProgram) this.f22327T0.get(this.f22328U0)).getContentId() != null && (interfaceC4278e = (InterfaceC4278e) m30063y9()) != null) {
            String contentId = ((EpgProgram) this.f22327T0.get(this.f22328U0)).getContentId();
            AbstractC5868k.m23671c(contentId);
            interfaceC4278e.mo17876d3(contentId);
        }
    }

    @Override // com.live.view.ViewOnKeyListenerC2883k.a
    /* renamed from: x */
    public void mo11654x() {
        m22257cb();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: x2 */
    public void mo5916x2() {
        DialogC4084w0 dialogC4084w0;
        DialogC4084w0 dialogC4084w02 = this.f22316I0;
        boolean z10 = false;
        if (dialogC4084w02 != null && dialogC4084w02.isShowing()) {
            z10 = true;
        }
        if (z10 && (dialogC4084w0 = this.f22316I0) != null) {
            dialogC4084w0.dismiss();
        }
        C7618x0.f28031a.m29362x(true);
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: x3 */
    public void mo17909x3(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "menuIcons");
        ViewOnClickListenerC5929g viewOnClickListenerC5929g = this.f22311D0;
        if (viewOnClickListenerC5929g != null) {
            viewOnClickListenerC5929g.setupBottomMenuIcon(arrayList);
        }
    }

    @Override // p130f8.InterfaceC4279f
    /* renamed from: y2 */
    public void mo17910y2(Channel channel) {
        AbstractC5868k.m23674f(channel, "channel");
        if (!this.f22332Y0) {
            return;
        }
        C4160d m17390a = C4160d.f18217d.m17390a();
        AbstractC0729o m3294d4 = m3104L8().m3294d4();
        AbstractC5868k.m23673e(m3294d4, "requireActivity().supportFragmentManager");
        C4160d.m17379m(m17390a, m3294d4, new u(channel), false, 4, null);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: z2 */
    public void mo5917z2() {
        if (this.f22325R0) {
            m22260eb();
        }
    }

    @Override // p263o8.ViewOnClickListenerC5929g.a
    /* renamed from: z5 */
    public void mo22280z5() {
        InterfaceC4278e interfaceC4278e = (InterfaceC4278e) m30063y9();
        if (interfaceC4278e != null) {
            interfaceC4278e.mo17874U(this.f22311D0);
        }
        m22198db(1, 10000L);
    }

    @Override // p430z9.AbstractC7766d
    /* renamed from: z9 */
    public boolean mo22281z9() {
        return this.f22331X0;
    }

    /* renamed from: za */
    public final String m22282za() {
        return this.f22329V0;
    }

    /* renamed from: zb */
    public final void m22283zb(final int i10, boolean z10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final Integer num) {
        AbstractC5868k.m23674f(str, "errMsg");
        AbstractC5868k.m23674f(str2, "uri");
        AbstractC5868k.m23674f(str3, "bussType");
        AbstractC5868k.m23674f(str4, "mCode");
        AbstractC5868k.m23674f(str5, "title");
        AbstractC5868k.m23674f(str6, "host");
        AbstractC5868k.m23674f(str7, "cdnType");
        this.f22314G0.post(new Runnable() { // from class: l8.k1
            @Override // java.lang.Runnable
            public final void run() {
                C5498s1.m22146Bb(str, this, i10, num, str4, str5, str6, str3, str7, str2);
            }
        });
    }
}
