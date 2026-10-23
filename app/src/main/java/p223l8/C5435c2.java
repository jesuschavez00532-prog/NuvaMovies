package p223l8;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.lifecycle.AbstractC0749c;
import ba.AbstractC1196d;
import bd.InterfaceC1294a;
import be.C1328x;
import cc.C1466m0;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.p064ui.activity.MatchDetailActivity;
import com.live.view.C2890r;
import com.live.view.InterceptKeyView;
import com.live.view.InterfaceC2877e;
import com.lzy.okgo.model.Progress;
import com.module.event.LoginSuccessRequestDataEvent;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.request.result.LoginResult;
import com.titan.ranger.Status;
import com.titan.ranger.bean.Media;
import com.titan.ranger.bean.Program;
import com.titans.entity.CdnType;
import com.titans.entity.RangerPlayTag;
import com.umeng.analytics.pro.C3309bd;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p102db.DialogC4084w0;
import p119ed.C4176d;
import p130f8.InterfaceC4282i;
import p130f8.InterfaceC4283j;
import p159h8.C4623j3;
import p161ha.ViewOnClickListenerC4758c0;
import p161ha.ViewOnClickListenerC4799t0;
import p170i2.C4842a;
import p170i2.InterfaceC4844c;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5092i;
import p317rb.AbstractC6567a;
import p357uc.C7077d;
import p400xa.C7556b1;
import p400xa.C7565e1;
import p400xa.C7577i1;
import p400xa.C7586l1;
import p400xa.C7594o0;
import p400xa.C7617x;
import p400xa.C7618x0;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: l8.c2 */
/* loaded from: classes2.dex */
public final class C5435c2 extends AbstractC1196d<InterfaceC4282i> implements InterfaceC4283j, InterceptKeyView.InterfaceC2872a, InterfaceC2877e, InterfaceC1294a {

    /* renamed from: Q0 */
    private static Channel f22080Q0;

    /* renamed from: A0 */
    private boolean f22083A0;

    /* renamed from: B0 */
    private C4176d f22084B0;

    /* renamed from: C0 */
    private C2890r f22085C0;

    /* renamed from: D0 */
    private DialogC4084w0 f22086D0;

    /* renamed from: E0 */
    private int f22087E0;

    /* renamed from: F0 */
    private int f22088F0;

    /* renamed from: I0 */
    private boolean f22091I0;

    /* renamed from: z0 */
    private boolean f22099z0;

    /* renamed from: P0 */
    public static final a f22079P0 = new a(null);

    /* renamed from: R0 */
    private static ArrayList f22081R0 = new ArrayList();

    /* renamed from: S0 */
    private static final String f22082S0 = "OUT_CHAIN_URL";

    /* renamed from: O0 */
    public Map f22097O0 = new LinkedHashMap();

    /* renamed from: y0 */
    private final String f22098y0 = "MatchBackPlayFragment";

    /* renamed from: G0 */
    private Handler f22089G0 = new Handler();

    /* renamed from: H0 */
    private boolean f22090H0 = true;

    /* renamed from: J0 */
    private String f22092J0 = "";

    /* renamed from: K0 */
    private String f22093K0 = MessageService.MSG_DB_READY_REPORT;

    /* renamed from: L0 */
    private final e f22094L0 = new e();

    /* renamed from: M0 */
    private final f f22095M0 = new f();

    /* renamed from: N0 */
    private c f22096N0 = new c();

    /* renamed from: l8.c2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final Channel m21860a() {
            return C5435c2.f22080Q0;
        }

        /* renamed from: b */
        public final C5435c2 m21861b(String str) {
            C5435c2 c5435c2 = new C5435c2();
            if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putString(C5435c2.f22082S0, str);
                c5435c2.m3132V8(bundle);
            }
            return c5435c2;
        }

        /* renamed from: c */
        public final void m21862c(Channel channel) {
            AbstractC5868k.m23674f(channel, "backChannel");
            C5435c2.f22080Q0 = channel;
        }

        /* renamed from: d */
        public final void m21863d(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "playingEpgs");
            C5435c2.f22081R0.clear();
            if (!AbstractC6567a.m25635e(arrayList)) {
                C5435c2.f22081R0.addAll(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.c2$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l8.c2$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C5435c2 f22101a;

            /* renamed from: b */
            final /* synthetic */ int f22102b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5435c2 c5435c2, int i10) {
                super(1);
                this.f22101a = c5435c2;
                this.f22102b = i10;
            }

            /* renamed from: a */
            public final void m21865a(boolean z10) {
                int i10 = 0;
                C5435c2 c5435c2 = this.f22101a;
                if (z10) {
                    i10 = this.f22102b;
                } else {
                    i10 = 0;
                }
                c5435c2.f22088F0 = i10;
                if (!this.f22101a.f22091I0) {
                    ((InterfaceC4282i) this.f22101a.m5478w9()).mo17922B();
                }
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m21865a(((Boolean) obj).booleanValue());
                return C1328x.f4998a;
            }
        }

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m21864a(int i10) {
            if (i10 == 0) {
                C5435c2.this.f22088F0 = 0;
                if (!C5435c2.this.f22091I0) {
                    ((InterfaceC4282i) C5435c2.this.m5478w9()).mo17922B();
                    return;
                }
                return;
            }
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = C5435c2.this.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            c7556b1.m28967f(m3110N8, i10, new a(C5435c2.this, i10));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m21864a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.c2$c */
    /* loaded from: classes2.dex */
    public static final class c implements C7618x0.a {

        /* renamed from: l8.c2$c$a */
        /* loaded from: classes2.dex */
        public static final class a implements DialogC4084w0.a {

            /* renamed from: a */
            final /* synthetic */ C5435c2 f22104a;

            a(C5435c2 c5435c2) {
                this.f22104a = c5435c2;
            }

            @Override // p102db.DialogC4084w0.a
            /* renamed from: a */
            public void mo17117a(int i10, KeyEvent keyEvent) {
                AbstractC5868k.m23674f(keyEvent, "event");
                this.f22104a.onKeyDown(i10, keyEvent);
            }
        }

        c() {
        }

        @Override // p400xa.C7618x0.a
        /* renamed from: a */
        public void mo11883a(int i10, KeyEvent keyEvent) {
            AbstractC5868k.m23674f(keyEvent, "event");
        }

        @Override // p400xa.C7618x0.a
        /* renamed from: b */
        public void mo11884b(boolean z10, boolean z11, String str) {
            boolean z12;
            boolean z13;
            DialogC4084w0 dialogC4084w0;
            AbstractC5868k.m23674f(str, "errCode");
            if (!z11) {
                C4176d c4176d = C5435c2.this.f22084B0;
                boolean z14 = true;
                if (c4176d != null && c4176d.getVisibility() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    C4176d c4176d2 = C5435c2.this.f22084B0;
                    if (c4176d2 != null && !c4176d2.m17473r()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if (!z10) {
                            if (C5435c2.this.f22086D0 == null) {
                                C5435c2 c5435c2 = C5435c2.this;
                                Context m3096J6 = C5435c2.this.m3096J6();
                                AbstractC5868k.m23671c(m3096J6);
                                c5435c2.f22086D0 = new DialogC4084w0(m3096J6, true);
                                DialogC4084w0 dialogC4084w02 = C5435c2.this.f22086D0;
                                if (dialogC4084w02 != null) {
                                    dialogC4084w02.m17116e(new a(C5435c2.this));
                                }
                            }
                            DialogC4084w0 dialogC4084w03 = C5435c2.this.f22086D0;
                            if (dialogC4084w03 == null || dialogC4084w03.isShowing()) {
                                z14 = false;
                            }
                            if (z14 && (dialogC4084w0 = C5435c2.this.f22086D0) != null) {
                                dialogC4084w0.show();
                                return;
                            }
                            return;
                        }
                        if (C5435c2.this.m3096J6() != null) {
                            C7586l1 c7586l1 = C7586l1.f27877a;
                            Context m3096J62 = C5435c2.this.m3096J6();
                            AbstractC5868k.m23671c(m3096J62);
                            Context m3096J63 = C5435c2.this.m3096J6();
                            AbstractC5868k.m23671c(m3096J63);
                            String string = m3096J63.getString(R$string.nd_stable_connect);
                            AbstractC5868k.m23673e(string, "context!!.getString(R.string.nd_stable_connect)");
                            C7586l1.m29112f(c7586l1, m3096J62, string, 1, 0, 8, null);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l8.c2$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        /* renamed from: a */
        public final void m21866a() {
            C5435c2.this.m21854ga();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m21866a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: l8.c2$e */
    /* loaded from: classes2.dex */
    public static final class e implements C2890r.a {
        e() {
        }

        @Override // com.live.view.C2890r.a
        /* renamed from: a */
        public void mo11736a() {
            C2890r c2890r = C5435c2.this.f22085C0;
            if (c2890r != null) {
                c2890r.setStatus(6);
            }
        }

        @Override // com.live.view.C2890r.a
        /* renamed from: b */
        public void mo11737b() {
            C2890r c2890r = C5435c2.this.f22085C0;
            if (c2890r != null) {
                c2890r.setStatus(7);
            }
        }

        @Override // com.live.view.C2890r.a
        /* renamed from: c */
        public void mo11738c(int i10) {
            C4176d c4176d;
            long j10;
            C4176d c4176d2 = C5435c2.this.f22084B0;
            if (c4176d2 != null) {
                long j11 = i10;
                C4176d c4176d3 = C5435c2.this.f22084B0;
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
            C4176d c4176d4 = C5435c2.this.f22084B0;
            boolean z10 = false;
            if (c4176d4 != null && !c4176d4.m17473r()) {
                z10 = true;
            }
            if (z10 && (c4176d = C5435c2.this.f22084B0) != null) {
                c4176d.m17476v();
            }
        }
    }

    /* renamed from: l8.c2$f */
    /* loaded from: classes2.dex */
    public static final class f implements C2890r.b {
        f() {
        }

        @Override // com.live.view.C2890r.b
        /* renamed from: Z */
        public void mo11739Z(int i10) {
            int m28998c = C7565e1.f27773a.m28998c(i10);
            C4176d c4176d = C5435c2.this.f22084B0;
            if (c4176d != null) {
                c4176d.setAspectRatio(m28998c);
            }
            C7577i1.f27838b.m29085d().m29076h("play_ratio", Integer.valueOf(i10));
        }

        @Override // com.live.view.C2890r.b
        /* renamed from: k0 */
        public void mo11740k0(int i10) {
        }

        @Override // com.live.view.C2890r.b
        /* renamed from: w0 */
        public void mo11741w0(int i10) {
            String str;
            if (i10 == 0) {
                C2890r c2890r = C5435c2.this.f22085C0;
                if (c2890r != null) {
                    str = c2890r.getProgramTitle();
                } else {
                    str = null;
                }
                if (AbstractC6567a.m25637g(str) || C5435c2.this.f22091I0) {
                    ViewOnClickListenerC4758c0.a aVar = ViewOnClickListenerC4758c0.f20101M0;
                    if (str == null) {
                        str = "";
                    }
                    ViewOnClickListenerC4758c0 m19681b = aVar.m19681b("back", str);
                    AbstractC0729o m3119R6 = C5435c2.this.m3119R6();
                    AbstractC5868k.m23671c(m3119R6);
                    m19681b.mo3277E9(m3119R6, "FeedbackDialog");
                }
            }
        }
    }

    /* renamed from: l8.c2$g */
    /* loaded from: classes2.dex */
    public static final class g implements ViewOnClickListenerC4799t0.a {

        /* renamed from: l8.c2$g$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final a f22109a = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m21867a(LoginResult loginResult) {
                C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m21867a((LoginResult) obj);
                return C1328x.f4998a;
            }
        }

        g() {
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: a */
        public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            C1466m0.f5627a.m6869h0(null);
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3093I6 = C5435c2.this.m3093I6();
                AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                InterfaceC7251a.a.m28064a(interfaceC7251a, m3093I6, true, null, a.f22109a, 4, null);
            }
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: b */
        public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
        }
    }

    /* renamed from: U9 */
    private final void m21845U9() {
        String contentId;
        if (this.f22091I0) {
            contentId = AbstractC5092i.m20666a(this.f22092J0);
        } else {
            contentId = ((EpgProgram) f22081R0.get(this.f22087E0)).getContentId();
        }
        ((InterfaceC4282i) m5478w9()).mo17924x(contentId, new b());
    }

    /* renamed from: W9 */
    private final void m21846W9() {
        if (this.f22085C0 == null) {
            this.f22085C0 = new C2890r(m3096J6());
            ((InterceptKeyView) m21855I9(R$id.flContainer)).addView(this.f22085C0, 1);
            C2890r c2890r = this.f22085C0;
            if (c2890r != null) {
                c2890r.m11729r();
            }
            C2890r c2890r2 = this.f22085C0;
            if (c2890r2 != null) {
                c2890r2.m11735x();
            }
            C2890r c2890r3 = this.f22085C0;
            if (c2890r3 != null) {
                c2890r3.m11733v();
            }
            C2890r c2890r4 = this.f22085C0;
            if (c2890r4 != null) {
                c2890r4.setPauseAdType("");
            }
        }
        C2890r c2890r5 = this.f22085C0;
        if (c2890r5 != null) {
            c2890r5.setStatus(0);
        }
        C2890r c2890r6 = this.f22085C0;
        if (c2890r6 != null) {
            c2890r6.setOnSeekBarSeekListener(this.f22094L0);
        }
        C2890r c2890r7 = this.f22085C0;
        if (c2890r7 != null) {
            c2890r7.setOnSettingFunctionListener(this.f22095M0);
        }
        C2890r c2890r8 = this.f22085C0;
        if (c2890r8 != null) {
            c2890r8.setAutoHideListener(new d());
        }
    }

    /* renamed from: X9 */
    private final void m21847X9() {
        if (this.f22084B0 == null && m3096J6() != null) {
            C4176d c4176d = new C4176d(m3107M8());
            this.f22084B0 = c4176d;
            AbstractC5868k.m23671c(c4176d);
            c4176d.setLayoutParams(new AutoFrameLayout.C3910a(-1, -1, 17));
            ((InterceptKeyView) m21855I9(R$id.flContainer)).addView(this.f22084B0, 0);
            C4176d c4176d2 = this.f22084B0;
            AbstractC5868k.m23671c(c4176d2);
            c4176d2.setPlayerListener(this);
        }
    }

    /* renamed from: Y9 */
    private final void m21848Y9() {
        C4176d c4176d = this.f22084B0;
        if (c4176d != null) {
            c4176d.m17476v();
        }
    }

    /* renamed from: aa */
    private final void m21849aa() {
        if (this.f22083A0) {
            int intValue = ((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue();
            C4176d c4176d = this.f22084B0;
            if (c4176d != null) {
                c4176d.setAspectRatio(C7565e1.f27773a.m28998c(intValue));
                return;
            }
            return;
        }
        C4176d c4176d2 = this.f22084B0;
        if (c4176d2 != null) {
            c4176d2.setAspectRatio(C7565e1.f27773a.m28998c(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ba */
    public static final void m21850ba(C5435c2 c5435c2, String str, boolean z10) {
        String str2;
        String str3;
        String string;
        String string2;
        String m6878m;
        AbstractC5868k.m23674f(c5435c2, "this$0");
        AbstractC5868k.m23674f(str, "$errCode");
        int i10 = R$id.mLayoutError;
        if (((AutoRelativeLayout) c5435c2.m21855I9(i10)) == null) {
            return;
        }
        if (!AbstractC5868k.m23669a("aaa100028", str) && !AbstractC5868k.m23669a("aaa100027", str)) {
            if (AbstractC5868k.m23669a("aaa100083", str)) {
                C1466m0.f5627a.m6849V(true);
                InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
                if (interfaceC7251a != null) {
                    AbstractC0729o m3093I6 = c5435c2.m3093I6();
                    AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                    interfaceC7251a.mo25621a(m3093I6, null);
                    return;
                }
                return;
            }
            if (((AutoRelativeLayout) c5435c2.m21855I9(i10)).getVisibility() != 0) {
                ((AutoRelativeLayout) c5435c2.m21855I9(i10)).setVisibility(0);
            }
            C1466m0 c1466m0 = C1466m0.f5627a;
            if (AbstractC5868k.m23669a(c1466m0.m6860d(), CdnType.DIGITAL_TYPE_PEERSTAR)) {
                m6878m = c1466m0.m6888w();
            } else {
                m6878m = c1466m0.m6878m();
            }
            TextView textView = (TextView) c5435c2.m21855I9(R$id.mTextAccount);
            C5881x c5881x = C5881x.f23415a;
            String string3 = c5435c2.m3107M8().getString(R$string.error_dialog_account);
            AbstractC5868k.m23673e(string3, "requireContext().getStri…ing.error_dialog_account)");
            String format = String.format(string3, Arrays.copyOf(new Object[]{m6878m}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            TextView textView2 = (TextView) c5435c2.m21855I9(R$id.mTextVersion);
            String string4 = c5435c2.m3107M8().getString(R$string.error_dialog_version);
            AbstractC5868k.m23673e(string4, "requireContext().getStri…ing.error_dialog_version)");
            String format2 = String.format(string4, Arrays.copyOf(new Object[]{AbstractC5085b.m20603m(c5435c2.m3096J6())}, 1));
            AbstractC5868k.m23673e(format2, "format(format, *args)");
            textView2.setText(format2);
            TextView textView3 = (TextView) c5435c2.m21855I9(R$id.mTextError);
            C7617x c7617x = C7617x.f28030a;
            Context m3107M8 = c5435c2.m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            textView3.setText(c7617x.m29329b(m3107M8, str, z10));
            return;
        }
        C1466m0.f5627a.m6849V(true);
        C7556b1 c7556b1 = C7556b1.f27754a;
        AbstractC0729o m3093I62 = c5435c2.m3093I6();
        AbstractC5868k.m23673e(m3093I62, "childFragmentManager");
        Context m3096J6 = c5435c2.m3096J6();
        if (m3096J6 == null || (string2 = m3096J6.getString(com.module.R$string.login_invaild_tips)) == null) {
            str2 = "";
        } else {
            str2 = string2;
        }
        Context m3096J62 = c5435c2.m3096J6();
        if (m3096J62 == null || (string = m3096J62.getString(com.module.R$string.commmon_confirm_text)) == null) {
            str3 = "";
        } else {
            str3 = string;
        }
        C7556b1.m28962j(c7556b1, m3093I62, str2, "", str3, true, new g(), false, null, false, 384, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ca */
    public static final void m21851ca(C5435c2 c5435c2, int i10) {
        String m6878m;
        AbstractC5868k.m23674f(c5435c2, "this$0");
        C7617x c7617x = C7617x.f28030a;
        Context m3107M8 = c5435c2.m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        String m29331e = c7617x.m29331e(m3107M8, i10);
        int i11 = R$id.mLayoutError;
        if (((AutoRelativeLayout) c5435c2.m21855I9(i11)) != null && !TextUtils.isEmpty(m29331e)) {
            ((AutoRelativeLayout) c5435c2.m21855I9(i11)).setVisibility(0);
            C1466m0 c1466m0 = C1466m0.f5627a;
            if (AbstractC5868k.m23669a(c1466m0.m6860d(), CdnType.DIGITAL_TYPE_PEERSTAR)) {
                m6878m = c1466m0.m6888w();
            } else {
                m6878m = c1466m0.m6878m();
            }
            TextView textView = (TextView) c5435c2.m21855I9(R$id.mTextAccount);
            C5881x c5881x = C5881x.f23415a;
            String string = c5435c2.m3107M8().getString(R$string.error_dialog_account);
            AbstractC5868k.m23673e(string, "requireContext().getStri…ing.error_dialog_account)");
            String format = String.format(string, Arrays.copyOf(new Object[]{m6878m}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            TextView textView2 = (TextView) c5435c2.m21855I9(R$id.mTextVersion);
            String string2 = c5435c2.m3107M8().getString(R$string.error_dialog_version);
            AbstractC5868k.m23673e(string2, "requireContext().getStri…ing.error_dialog_version)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{AbstractC5085b.m20603m(c5435c2.m3096J6())}, 1));
            AbstractC5868k.m23673e(format2, "format(format, *args)");
            textView2.setText(format2);
            ((TextView) c5435c2.m21855I9(R$id.mTextError)).setText(m29331e);
        }
    }

    /* renamed from: da */
    private final void m21852da() {
        C4176d c4176d = this.f22084B0;
        if (c4176d != null) {
            c4176d.m17469B();
        }
    }

    /* renamed from: fa */
    private final void m21853fa() {
        Channel channel;
        if (!this.f22091I0 && (channel = f22080Q0) != null) {
            C2890r c2890r = this.f22085C0;
            if (c2890r != null) {
                c2890r.setChannelIndex("");
            }
            C2890r c2890r2 = this.f22085C0;
            if (c2890r2 != null) {
                c2890r2.setChannelName(channel.getName());
            }
            C2890r c2890r3 = this.f22085C0;
            if (c2890r3 != null) {
                c2890r3.setChannelIcon(C7594o0.f27942a.m29220i(channel.getPosterList(), C7594o0.a.Icon));
            }
            C2890r c2890r4 = this.f22085C0;
            if (c2890r4 != null) {
                c2890r4.setTimeRange(((EpgProgram) f22081R0.get(this.f22087E0)).getStart() + '-' + ((EpgProgram) f22081R0.get(this.f22087E0)).getStop());
            }
            C2890r c2890r5 = this.f22085C0;
            if (c2890r5 != null) {
                c2890r5.m11723M("", "");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public final void m21854ga() {
        int i10 = R$id.flContainer;
        ((InterceptKeyView) m21855I9(i10)).setFocusable(true);
        ((InterceptKeyView) m21855I9(i10)).requestFocus();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_matchbackplay;
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: C4 */
    public void mo5894C4() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.live.view.InterceptKeyView.InterfaceC2872a
    /* renamed from: H1 */
    public boolean mo11576H1(KeyEvent keyEvent, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        MatchDetailActivity matchDetailActivity;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        AbstractC5868k.m23674f(keyEvent, "event");
        boolean z30 = false;
        if (!this.f22083A0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        C4176d c4176d = this.f22084B0;
        if (c4176d != null && !c4176d.m17473r()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            C2890r c2890r = this.f22085C0;
            if (c2890r != null && c2890r.m11716B()) {
                z29 = true;
            } else {
                z29 = false;
            }
            if (z29) {
                if (keyCode != 7) {
                    if (keyCode != 20) {
                        if (keyCode == 23 || keyCode == 66) {
                            C4176d c4176d2 = this.f22084B0;
                            if (c4176d2 != null) {
                                c4176d2.m17476v();
                            }
                            C2890r c2890r2 = this.f22085C0;
                            if (c2890r2 != null) {
                                c2890r2.setStatus(3);
                            }
                            return true;
                        }
                    } else {
                        C2890r c2890r3 = this.f22085C0;
                        if (c2890r3 != null) {
                            c2890r3.setAdVisible(false);
                        }
                        return true;
                    }
                } else {
                    C2890r c2890r4 = this.f22085C0;
                    if (c2890r4 != null) {
                        c2890r4.m11728p();
                    }
                    return true;
                }
            }
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode != 4) {
                if (keyCode != 66) {
                    if (keyCode != 82) {
                        switch (keyCode) {
                            case 20:
                                C2890r c2890r5 = this.f22085C0;
                                if (c2890r5 != null && c2890r5.m11719E()) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                if (z25) {
                                    C2890r c2890r6 = this.f22085C0;
                                    if (c2890r6 != null) {
                                        c2890r6.m11720J();
                                    }
                                    C2890r c2890r7 = this.f22085C0;
                                    if (c2890r7 == null) {
                                        return false;
                                    }
                                    c2890r7.m11722L();
                                    return false;
                                }
                                C2890r c2890r8 = this.f22085C0;
                                if (c2890r8 != null && !c2890r8.m11719E()) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                if (!z26) {
                                    return false;
                                }
                                m21854ga();
                                C2890r c2890r9 = this.f22085C0;
                                if (c2890r9 != null) {
                                    c2890r9.setSettingVisibility(true);
                                }
                                return true;
                            case 21:
                            case 22:
                                C2890r c2890r10 = this.f22085C0;
                                if (c2890r10 != null && c2890r10.m11719E()) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                if (z27) {
                                    C2890r c2890r11 = this.f22085C0;
                                    if (c2890r11 != null) {
                                        c2890r11.m11720J();
                                    }
                                    return false;
                                }
                                C2890r c2890r12 = this.f22085C0;
                                if (c2890r12 != null && !c2890r12.m11718D()) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                if (z28) {
                                    C2890r c2890r13 = this.f22085C0;
                                    if (c2890r13 != null) {
                                        c2890r13.m11724O();
                                    }
                                    return true;
                                }
                                break;
                        }
                    }
                    C2890r c2890r14 = this.f22085C0;
                    if (c2890r14 != null && c2890r14.m11719E()) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (z24) {
                        C2890r c2890r15 = this.f22085C0;
                        if (c2890r15 != null) {
                            c2890r15.m11720J();
                        }
                        C2890r c2890r16 = this.f22085C0;
                        if (c2890r16 == null) {
                            return false;
                        }
                        c2890r16.m11722L();
                        return false;
                    }
                    C2890r c2890r17 = this.f22085C0;
                    if (c2890r17 != null && c2890r17.m11718D()) {
                        z30 = true;
                    }
                    if (z30) {
                        m21854ga();
                        C2890r c2890r18 = this.f22085C0;
                        if (c2890r18 != null) {
                            c2890r18.m11730s();
                        }
                    } else {
                        C2890r c2890r19 = this.f22085C0;
                        if (c2890r19 != null) {
                            c2890r19.m11724O();
                        }
                    }
                    return true;
                }
                if (keyEvent.getRepeatCount() == 0) {
                    C2890r c2890r20 = this.f22085C0;
                    if (c2890r20 != null && c2890r20.m11719E()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        C2890r c2890r21 = this.f22085C0;
                        if (c2890r21 != null) {
                            c2890r21.m11720J();
                        }
                        return false;
                    }
                    C2890r c2890r22 = this.f22085C0;
                    if (c2890r22 != null && c2890r22.getState() == 7) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        C2890r c2890r23 = this.f22085C0;
                        if (c2890r23 != null && c2890r23.getState() == 6) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (!z16) {
                            C2890r c2890r24 = this.f22085C0;
                            if (c2890r24 != null && c2890r24.getState() == 4) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (!z17) {
                                C2890r c2890r25 = this.f22085C0;
                                if (c2890r25 != null && c2890r25.getState() == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (!z18) {
                                    C2890r c2890r26 = this.f22085C0;
                                    if (c2890r26 != null && c2890r26.getState() == 9) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    if (!z19) {
                                        C2890r c2890r27 = this.f22085C0;
                                        if (c2890r27 != null && c2890r27.getState() == -1) {
                                            z20 = true;
                                        } else {
                                            z20 = false;
                                        }
                                        if (!z20) {
                                            C2890r c2890r28 = this.f22085C0;
                                            if (c2890r28 != null && c2890r28.getState() == -3) {
                                                z21 = true;
                                            } else {
                                                z21 = false;
                                            }
                                            if (!z21) {
                                                C2890r c2890r29 = this.f22085C0;
                                                if (c2890r29 != null && c2890r29.getState() == -2) {
                                                    z22 = true;
                                                } else {
                                                    z22 = false;
                                                }
                                                if (!z22) {
                                                    C2890r c2890r30 = this.f22085C0;
                                                    if (c2890r30 != null && c2890r30.getState() == 1) {
                                                        z23 = true;
                                                    } else {
                                                        z23 = false;
                                                    }
                                                    if (!z23) {
                                                        C4176d c4176d3 = this.f22084B0;
                                                        if (c4176d3 != null && c4176d3.m17473r()) {
                                                            z30 = true;
                                                        }
                                                        if (z30) {
                                                            C4176d c4176d4 = this.f22084B0;
                                                            if (c4176d4 != null) {
                                                                c4176d4.m17475u();
                                                            }
                                                            C2890r c2890r31 = this.f22085C0;
                                                            if (c2890r31 != null) {
                                                                c2890r31.setStatus(2);
                                                            }
                                                        }
                                                    }
                                                    C4176d c4176d5 = this.f22084B0;
                                                    if (c4176d5 != null) {
                                                        c4176d5.m17476v();
                                                    }
                                                    C2890r c2890r32 = this.f22085C0;
                                                    if (c2890r32 != null) {
                                                        c2890r32.setStatus(3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            } else {
                if (keyEvent.getRepeatCount() != 0) {
                    return false;
                }
                C2890r c2890r33 = this.f22085C0;
                if (c2890r33 != null && c2890r33.m11718D()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    m21854ga();
                    C2890r c2890r34 = this.f22085C0;
                    if (c2890r34 != null) {
                        c2890r34.m11730s();
                    }
                } else {
                    C2890r c2890r35 = this.f22085C0;
                    if (c2890r35 != null && c2890r35.m11719E()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        m21854ga();
                        C2890r c2890r36 = this.f22085C0;
                        if (c2890r36 != null) {
                            c2890r36.setSettingVisibility(false);
                        }
                    } else {
                        AbstractActivityC0712e m3075C6 = m3075C6();
                        if (m3075C6 instanceof MatchDetailActivity) {
                            matchDetailActivity = (MatchDetailActivity) m3075C6;
                        } else {
                            matchDetailActivity = null;
                        }
                        if (matchDetailActivity != null) {
                            matchDetailActivity.m11508L6();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p130f8.InterfaceC4283j
    /* renamed from: I2 */
    public void mo17925I2(final String str, final boolean z10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f22089G0.post(new Runnable() { // from class: l8.b2
            @Override // java.lang.Runnable
            public final void run() {
                C5435c2.m21850ba(C5435c2.this, str, z10);
            }
        });
    }

    @Override // p130f8.InterfaceC4283j
    /* renamed from: I4 */
    public EpgProgram mo17926I4() {
        if (f22081R0.size() > 0 && this.f22087E0 < f22081R0.size()) {
            return (EpgProgram) f22081R0.get(this.f22087E0);
        }
        return null;
    }

    /* renamed from: I9 */
    public View m21855I9(int i10) {
        View findViewById;
        Map map = this.f22097O0;
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

    @Override // bd.InterfaceC1294a
    /* renamed from: K0 */
    public void mo5895K0() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: L1 */
    public void mo5896L1() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: O5 */
    public void mo5897O5() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: P3 */
    public void mo5898P3(long j10) {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: P5 */
    public void mo5899P5(long j10) {
    }

    @Override // p130f8.InterfaceC4283j
    /* renamed from: Q */
    public void mo17927Q() {
        C2890r c2890r;
        C2890r c2890r2 = this.f22085C0;
        boolean z10 = false;
        if (c2890r2 != null && !c2890r2.m11718D()) {
            z10 = true;
        }
        if (z10 && this.f22083A0 && (c2890r = this.f22085C0) != null) {
            c2890r.m11724O();
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: R1 */
    public void mo5900R1(int i10) {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: S1 */
    public void mo5901S1() {
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        DialogC4084w0 dialogC4084w0;
        this.f22089G0.removeCallbacksAndMessages(null);
        C4176d c4176d = this.f22084B0;
        if (c4176d != null) {
            c4176d.m17469B();
        }
        boolean z10 = true;
        C7618x0.f28031a.m29362x(true);
        DialogC4084w0 dialogC4084w02 = this.f22086D0;
        if (dialogC4084w02 == null || !dialogC4084w02.isShowing()) {
            z10 = false;
        }
        if (z10 && (dialogC4084w0 = this.f22086D0) != null) {
            dialogC4084w0.dismiss();
        }
        this.f22086D0 = null;
        super.mo3123S7();
        mo5459m9();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: U */
    public void mo5902U() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: V0 */
    public void mo5903V0(long j10) {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: V1 */
    public void mo5904V1() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: V9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4282i mo5465y9() {
        return new C4623j3(this, this);
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

    @Override // bd.InterfaceC1294a
    /* renamed from: Y5 */
    public C7077d mo5907Y5(List list) {
        AbstractC5868k.m23674f(list, "audioTrackList");
        return null;
    }

    /* renamed from: Z9 */
    public final void m21857Z9() {
        Integer num;
        String contentId;
        C4176d c4176d = this.f22084B0;
        if (c4176d != null) {
            num = Integer.valueOf((int) c4176d.getCurrentProgress());
        } else {
            num = null;
        }
        if (this.f22091I0) {
            contentId = AbstractC5092i.m20666a(this.f22092J0);
        } else {
            contentId = ((EpgProgram) f22081R0.get(this.f22087E0)).getContentId();
        }
        if (num != null && num.intValue() > 1000 && contentId != null) {
            this.f22088F0 = num.intValue();
            ((InterfaceC4282i) m5478w9()).mo17923o(contentId, num.intValue());
        }
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: b8 */
    public void mo3149b8() {
        super.mo3149b8();
    }

    /* renamed from: ea */
    public final void m21858ea() {
        m21857Z9();
        this.f22087E0 = 0;
        m21859h4();
        m21846W9();
        m21853fa();
        m21845U9();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: f3 */
    public void mo5908f3() {
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        if (!this.f22090H0) {
            C4176d c4176d = this.f22084B0;
            boolean z10 = false;
            if (c4176d != null && c4176d.m17473r()) {
                z10 = true;
            }
            if (!z10) {
                m21848Y9();
            }
            this.f22090H0 = true;
        }
    }

    /* renamed from: h4 */
    public void m21859h4() {
        boolean z10;
        DialogC4084w0 dialogC4084w0;
        AutoRelativeLayout autoRelativeLayout;
        int i10 = R$id.mLayoutError;
        AutoRelativeLayout autoRelativeLayout2 = (AutoRelativeLayout) m21855I9(i10);
        boolean z11 = true;
        if (autoRelativeLayout2 != null && autoRelativeLayout2.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (autoRelativeLayout = (AutoRelativeLayout) m21855I9(i10)) != null) {
            autoRelativeLayout.setVisibility(8);
        }
        C7618x0.m29358y(C7618x0.f28031a, false, 1, null);
        DialogC4084w0 dialogC4084w02 = this.f22086D0;
        if (dialogC4084w02 == null || !dialogC4084w02.isShowing()) {
            z11 = false;
        }
        if (z11 && (dialogC4084w0 = this.f22086D0) != null) {
            dialogC4084w0.dismiss();
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: i1 */
    public boolean mo5909i1() {
        return false;
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: j8 */
    public void mo3173j8() {
        super.mo3173j8();
        m21857Z9();
        this.f22090H0 = false;
        m21852da();
    }

    @Override // p130f8.InterfaceC4283j
    /* renamed from: k3 */
    public void mo17928k3(List list) {
        String str;
        String str2;
        String programName;
        AbstractC5868k.m23674f(list, "mediaList");
        if (mo17926I4() != null) {
            EpgProgram mo17926I4 = mo17926I4();
            if (mo17926I4 == null || (str = mo17926I4.getContentId()) == null) {
                str = "";
            }
            String value = RangerPlayTag.RECORD.getValue();
            if (mo17926I4 == null || (programName = mo17926I4.getProgramName()) == null) {
                str2 = "";
            } else {
                str2 = programName;
            }
            Program program = new Program(str, value, str2, "-1", "match", C3309bd.f14106m, list, ((Media) list.get(0)).getName(), this.f22088F0);
            C4176d c4176d = this.f22084B0;
            if (c4176d != null) {
                c4176d.mo17463A(program, program.getName(), program.getBuss());
            }
        }
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m21858ea();
    }

    @Override // com.live.view.InterfaceC2877e
    /* renamed from: l6 */
    public void mo11612l6(boolean z10) {
        this.f22083A0 = z10;
        if (!m30051p9()) {
            return;
        }
        if (this.f22083A0) {
            C2890r c2890r = this.f22085C0;
            if (c2890r != null) {
                c2890r.m11724O();
            }
            C2890r c2890r2 = this.f22085C0;
            boolean z11 = false;
            if (c2890r2 != null && c2890r2.m11717C()) {
                z11 = true;
            }
            if (!z11) {
                m21854ga();
            }
        }
        m21849aa();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: m2 */
    public void mo5910m2() {
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f22097O0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        String str;
        Bundle m3090H6 = m3090H6();
        if (m3090H6 != null) {
            str = m3090H6.getString(f22082S0);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f22092J0 = str;
        this.f22091I0 = AbstractC6567a.m25637g(str);
        this.f22087E0 = 0;
        m21847X9();
        mo11612l6(this.f22083A0);
        ((InterceptKeyView) m21855I9(R$id.flContainer)).setOnInterceptKeyEventListener(this);
        InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
        if (m19921b != null) {
            AbstractC0749c mo953f6 = mo953f6();
            AbstractC5868k.m23673e(mo953f6, "lifecycle");
            m19921b.mo19984g(mo953f6);
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        return false;
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: q4 */
    public void mo5911q4() {
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: r4 */
    public void mo5912r4() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: t */
    public void mo5913t(String str, String str2, long j10) {
        AbstractC5868k.m23674f(str, "adName");
        AbstractC5868k.m23674f(str2, "path");
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: u1 */
    public void mo5914u1() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: w6 */
    public void mo5915w6() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: x2 */
    public void mo5916x2() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f22099z0;
    }

    @Override // p130f8.InterfaceC4283j
    /* renamed from: z */
    public void mo17929z(final int i10) {
        this.f22089G0.post(new Runnable() { // from class: l8.a2
            @Override // java.lang.Runnable
            public final void run() {
                C5435c2.m21851ca(C5435c2.this, i10);
            }
        });
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: z2 */
    public void mo5917z2() {
    }
}
