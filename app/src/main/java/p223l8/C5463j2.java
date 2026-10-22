package p223l8;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.lifecycle.AbstractC0749c;
import ba.AbstractC1196d;
import bd.InterfaceC1294a;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.p064ui.activity.MatchDetailActivity;
import com.live.view.InterfaceC2877e;
import com.live.view.player.LivePlayerController;
import com.lzy.okgo.model.Progress;
import com.request.result.Channel;
import com.titan.ranger.Status;
import com.titan.ranger.bean.Program;
import com.titans.entity.CdnType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p102db.DialogC4084w0;
import p119ed.C4177e;
import p130f8.InterfaceC4288o;
import p130f8.InterfaceC4289p;
import p159h8.C4695v3;
import p170i2.C4842a;
import p170i2.InterfaceC4844c;
import p201k2.AbstractC5085b;
import p263o8.ViewOnClickListenerC5939q;
import p357uc.C7077d;
import p400xa.C7565e1;
import p400xa.C7577i1;
import p400xa.C7586l1;
import p400xa.C7617x;
import p400xa.C7618x0;

/* renamed from: l8.j2 */
/* loaded from: classes2.dex */
public final class C5463j2 extends AbstractC1196d<InterfaceC4288o> implements InterfaceC4289p, InterfaceC2877e, InterfaceC1294a {

    /* renamed from: K0 */
    public static final a f22201K0 = new a(null);

    /* renamed from: A0 */
    private final InterfaceC1312h f22202A0;

    /* renamed from: B0 */
    private b f22203B0;

    /* renamed from: C0 */
    private ViewOnClickListenerC5939q f22204C0;

    /* renamed from: D0 */
    private int f22205D0;

    /* renamed from: E0 */
    private boolean f22206E0;

    /* renamed from: F0 */
    private boolean f22207F0;

    /* renamed from: G0 */
    private boolean f22208G0;

    /* renamed from: H0 */
    private DialogC4084w0 f22209H0;

    /* renamed from: I0 */
    private d f22210I0;

    /* renamed from: J0 */
    public Map f22211J0 = new LinkedHashMap();

    /* renamed from: y0 */
    private final String f22212y0 = "MatchPlayFragment";

    /* renamed from: z0 */
    private String f22213z0 = "";

    /* renamed from: l8.j2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C5463j2 m22033a(String str) {
            AbstractC5868k.m23674f(str, "channelCode");
            C5463j2 c5463j2 = new C5463j2();
            Bundle bundle = new Bundle();
            bundle.putString("match_channel_code", str);
            c5463j2.m3132V8(bundle);
            return c5463j2;
        }
    }

    /* renamed from: l8.j2$b */
    /* loaded from: classes2.dex */
    public static final class b extends Handler {

        /* renamed from: a */
        private final WeakReference f22214a;

        public b(C5463j2 c5463j2) {
            AbstractC5868k.m23674f(c5463j2, "frag");
            this.f22214a = new WeakReference(c5463j2);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC5868k.m23674f(message, "msg");
            C5463j2 c5463j2 = (C5463j2) this.f22214a.get();
            if (c5463j2 != null && message.what == 1) {
                c5463j2.m22021S9();
            }
        }
    }

    /* renamed from: l8.j2$c */
    /* loaded from: classes2.dex */
    public static final class c implements ViewOnClickListenerC5939q.a {
        c() {
        }

        @Override // p263o8.ViewOnClickListenerC5939q.a
        /* renamed from: P */
        public void mo22034P() {
            C5463j2.this.m22024V9(1, 10000L);
        }

        @Override // p263o8.ViewOnClickListenerC5939q.a
        /* renamed from: a */
        public void mo22035a() {
            C5463j2.this.m22021S9();
        }

        @Override // p263o8.ViewOnClickListenerC5939q.a
        /* renamed from: e0 */
        public void mo22036e0(int i10) {
            C5463j2.this.m22020Q9().setAspectRatio(i10);
            C5463j2.this.m22024V9(1, 10000L);
        }
    }

    /* renamed from: l8.j2$d */
    /* loaded from: classes2.dex */
    public static final class d implements C7618x0.a {

        /* renamed from: l8.j2$d$a */
        /* loaded from: classes2.dex */
        public static final class a implements DialogC4084w0.a {

            /* renamed from: a */
            final /* synthetic */ C5463j2 f22217a;

            a(C5463j2 c5463j2) {
                this.f22217a = c5463j2;
            }

            @Override // p102db.DialogC4084w0.a
            /* renamed from: a */
            public void mo17117a(int i10, KeyEvent keyEvent) {
                AbstractC5868k.m23674f(keyEvent, "event");
                this.f22217a.onKeyDown(i10, keyEvent);
            }
        }

        d() {
        }

        @Override // p400xa.C7618x0.a
        /* renamed from: a */
        public void mo11883a(int i10, KeyEvent keyEvent) {
            AbstractC5868k.m23674f(keyEvent, "event");
        }

        @Override // p400xa.C7618x0.a
        /* renamed from: b */
        public void mo11884b(boolean z10, boolean z11, String str) {
            DialogC4084w0 dialogC4084w0;
            AbstractC5868k.m23674f(str, "errCode");
            if (!z11 && C5463j2.this.m22020Q9().getVisibility() == 0 && !C5463j2.this.m22020Q9().m17473r()) {
                if (!z10) {
                    boolean z12 = true;
                    if (C5463j2.this.f22209H0 == null) {
                        C5463j2 c5463j2 = C5463j2.this;
                        Context m3096J6 = C5463j2.this.m3096J6();
                        AbstractC5868k.m23671c(m3096J6);
                        c5463j2.f22209H0 = new DialogC4084w0(m3096J6, true);
                        DialogC4084w0 dialogC4084w02 = C5463j2.this.f22209H0;
                        if (dialogC4084w02 != null) {
                            dialogC4084w02.m17116e(new a(C5463j2.this));
                        }
                    }
                    DialogC4084w0 dialogC4084w03 = C5463j2.this.f22209H0;
                    if (dialogC4084w03 == null || dialogC4084w03.isShowing()) {
                        z12 = false;
                    }
                    if (z12 && (dialogC4084w0 = C5463j2.this.f22209H0) != null) {
                        dialogC4084w0.show();
                        return;
                    }
                    return;
                }
                C7586l1 c7586l1 = C7586l1.f27877a;
                Context m3096J62 = C5463j2.this.m3096J6();
                AbstractC5868k.m23671c(m3096J62);
                Context m3096J63 = C5463j2.this.m3096J6();
                AbstractC5868k.m23671c(m3096J63);
                String string = m3096J63.getString(R$string.nd_stable_connect);
                AbstractC5868k.m23673e(string, "context!!.getString(R.string.nd_stable_connect)");
                C7586l1.m29112f(c7586l1, m3096J62, string, 1, 0, 8, null);
            }
        }
    }

    /* renamed from: l8.j2$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4177e invoke() {
            Context m3107M8 = C5463j2.this.m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            C4177e c4177e = new C4177e(m3107M8);
            c4177e.setPlayerListener(C5463j2.this);
            return c4177e;
        }
    }

    public C5463j2() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new e());
        this.f22202A0 = m5965b;
        this.f22203B0 = new b(this);
        this.f22207F0 = true;
        this.f22210I0 = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P9 */
    public static final boolean m22019P9(C5463j2 c5463j2, View view, int i10, KeyEvent keyEvent) {
        MatchDetailActivity matchDetailActivity;
        AbstractC5868k.m23674f(c5463j2, "this$0");
        if (!c5463j2.f22206E0) {
            return false;
        }
        if (i10 != 4) {
            if (i10 != 82) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        return true;
                }
            }
            if (keyEvent.getAction() == 0) {
                c5463j2.mo17945s5();
            }
        } else if (keyEvent.getAction() == 0) {
            AbstractActivityC0712e m3075C6 = c5463j2.m3075C6();
            if (m3075C6 instanceof MatchDetailActivity) {
                matchDetailActivity = (MatchDetailActivity) m3075C6;
            } else {
                matchDetailActivity = null;
            }
            if (matchDetailActivity != null) {
                matchDetailActivity.m11508L6();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q9 */
    public final C4177e m22020Q9() {
        return (C4177e) this.f22202A0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S9 */
    public final void m22021S9() {
        ViewOnClickListenerC5939q viewOnClickListenerC5939q = this.f22204C0;
        if (viewOnClickListenerC5939q != null) {
            viewOnClickListenerC5939q.setVisibility(8);
        }
        m22028aa();
    }

    /* renamed from: T9 */
    private final void m22022T9() {
        m22032X9(false);
        m22020Q9().m17469B();
    }

    /* renamed from: U9 */
    private final void m22023U9() {
        Channel mo17942M;
        if (m5472B9() && (mo17942M = ((InterfaceC4288o) m5478w9()).mo17942M()) != null) {
            ((InterfaceC4288o) m5478w9()).mo17941E1(mo17942M.getChannelCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V9 */
    public final void m22024V9(int i10, long j10) {
        this.f22203B0.removeMessages(i10);
        this.f22203B0.sendEmptyMessageDelayed(i10, j10);
    }

    /* renamed from: W9 */
    private final void m22025W9() {
        if (this.f22206E0) {
            this.f22205D0 = ((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue();
            m22020Q9().setAspectRatio(C7565e1.f27773a.m28998c(this.f22205D0));
        } else {
            m22020Q9().setAspectRatio(C7565e1.f27773a.m28998c(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y9 */
    public static final void m22026Y9(C5463j2 c5463j2, int i10) {
        String m6878m;
        AbstractC5868k.m23674f(c5463j2, "this$0");
        C7617x c7617x = C7617x.f28030a;
        Context m3107M8 = c5463j2.m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        String m29331e = c7617x.m29331e(m3107M8, i10);
        int i11 = R$id.mLayoutError;
        if (((RelativeLayout) c5463j2.m22029I9(i11)) != null && !TextUtils.isEmpty(m29331e)) {
            ((RelativeLayout) c5463j2.m22029I9(i11)).setVisibility(0);
            C1466m0 c1466m0 = C1466m0.f5627a;
            if (AbstractC5868k.m23669a(c1466m0.m6860d(), CdnType.DIGITAL_TYPE_PEERSTAR)) {
                m6878m = c1466m0.m6888w();
            } else {
                m6878m = c1466m0.m6878m();
            }
            TextView textView = (TextView) c5463j2.m22029I9(R$id.mTextAccount);
            C5881x c5881x = C5881x.f23415a;
            String string = c5463j2.m3107M8().getString(R$string.error_dialog_account);
            AbstractC5868k.m23673e(string, "requireContext().getStri…ing.error_dialog_account)");
            String format = String.format(string, Arrays.copyOf(new Object[]{m6878m}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            TextView textView2 = (TextView) c5463j2.m22029I9(R$id.mTextVersion);
            String string2 = c5463j2.m3107M8().getString(R$string.error_dialog_version);
            AbstractC5868k.m23673e(string2, "requireContext().getStri…ing.error_dialog_version)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{AbstractC5085b.m20603m(c5463j2.m3096J6())}, 1));
            AbstractC5868k.m23673e(format2, "format(format, *args)");
            textView2.setText(format2);
            ((TextView) c5463j2.m22029I9(R$id.mTextError)).setText(m29331e);
        }
    }

    /* renamed from: Z9 */
    private final void m22027Z9() {
        ((InterfaceC4288o) m5478w9()).mo17943f(this.f22204C0);
        m22024V9(1, 10000L);
    }

    /* renamed from: aa */
    private final void m22028aa() {
        int i10 = R$id.flContainer;
        ((FrameLayout) m22029I9(i10)).setFocusable(true);
        ((FrameLayout) m22029I9(i10)).requestFocus();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_matchplay;
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: C4 */
    public void mo5894C4() {
    }

    /* renamed from: I9 */
    public View m22029I9(int i10) {
        View findViewById;
        Map map = this.f22211J0;
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

    @Override // p130f8.InterfaceC4289p
    /* renamed from: K */
    public void mo17944K(Program program, String str) {
        C4177e m22020Q9;
        AbstractC5868k.m23674f(program, "program");
        AbstractC5868k.m23674f(str, "channelCode");
        if (this.f22207F0 && (m22020Q9 = m22020Q9()) != null) {
            m22020Q9.mo17463A(program, str, program.getBuss());
        }
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

    /* renamed from: O9 */
    public final void m22030O9() {
        if (this.f22204C0 == null && m3096J6() != null) {
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            ViewOnClickListenerC5939q viewOnClickListenerC5939q = new ViewOnClickListenerC5939q(m3107M8);
            this.f22204C0 = viewOnClickListenerC5939q;
            viewOnClickListenerC5939q.setOnBottomMenuListener(new c());
            ((FrameLayout) m22029I9(R$id.flContainer)).addView(this.f22204C0, 1, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: P3 */
    public void mo5898P3(long j10) {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: P5 */
    public void mo5899P5(long j10) {
    }

    @Override // ba.AbstractC1196d, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public void mo3118Q7() {
        DialogC4084w0 dialogC4084w0;
        this.f22203B0.removeCallbacksAndMessages(null);
        m22020Q9().m17469B();
        boolean z10 = true;
        C7618x0.f28031a.m29362x(true);
        DialogC4084w0 dialogC4084w02 = this.f22209H0;
        if (dialogC4084w02 == null || !dialogC4084w02.isShowing()) {
            z10 = false;
        }
        if (z10 && (dialogC4084w0 = this.f22209H0) != null) {
            dialogC4084w0.dismiss();
        }
        this.f22209H0 = null;
        super.mo3118Q7();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: R1 */
    public void mo5900R1(int i10) {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: R9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4288o mo5465y9() {
        return new C4695v3(this, this);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: S1 */
    public void mo5901S1() {
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
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

    /* renamed from: X9 */
    public void m22032X9(boolean z10) {
        ((LivePlayerController) m22029I9(R$id.mPlayerController)).m11687g(z10);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: Y5 */
    public C7077d mo5907Y5(List list) {
        AbstractC5868k.m23674f(list, "audioTrackList");
        return null;
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: b8 */
    public void mo3149b8() {
        super.mo3149b8();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: f3 */
    public void mo5908f3() {
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        if (!this.f22207F0 && !m22020Q9().m17473r()) {
            m22023U9();
        }
        this.f22207F0 = true;
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
        this.f22207F0 = false;
        m22022T9();
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        ((InterfaceC4288o) m5478w9()).mo17941E1(this.f22213z0);
        mo11612l6(this.f22206E0);
    }

    @Override // com.live.view.InterfaceC2877e
    /* renamed from: l6 */
    public void mo11612l6(boolean z10) {
        this.f22206E0 = z10;
        if (!m30051p9()) {
            return;
        }
        if (this.f22206E0) {
            m22028aa();
            mo17945s5();
        }
        m22025W9();
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: m2 */
    public void mo5910m2() {
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f22211J0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        String str;
        Bundle m3090H6 = m3090H6();
        if (m3090H6 != null) {
            str = m3090H6.getString("match_channel_code");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.f22213z0 = str;
        C4177e m22020Q9 = m22020Q9();
        m22020Q9.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        int i10 = R$id.flContainer;
        ((FrameLayout) m22029I9(i10)).addView(m22020Q9, 0);
        m22032X9(true);
        InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
        if (m19921b != null) {
            AbstractC0749c mo953f6 = mo953f6();
            AbstractC5868k.m23673e(mo953f6, "lifecycle");
            m19921b.mo19984g(mo953f6);
        }
        ((FrameLayout) m22029I9(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.i2
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m22019P9;
                m22019P9 = C5463j2.m22019P9(C5463j2.this, view, i11, keyEvent);
                return m22019P9;
            }
        });
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

    @Override // p130f8.InterfaceC4289p
    /* renamed from: s5 */
    public void mo17945s5() {
        Channel mo17942M = ((InterfaceC4288o) m5478w9()).mo17942M();
        if (this.f22206E0 && mo17942M != null) {
            m22030O9();
            ViewOnClickListenerC5939q viewOnClickListenerC5939q = this.f22204C0;
            if (viewOnClickListenerC5939q != null) {
                viewOnClickListenerC5939q.setVisibility(0);
            }
            m22027Z9();
        }
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
        return this.f22208G0;
    }

    @Override // p130f8.InterfaceC4289p
    /* renamed from: z */
    public void mo17946z(final int i10) {
        this.f22203B0.post(new Runnable() { // from class: l8.h2
            @Override // java.lang.Runnable
            public final void run() {
                C5463j2.m22026Y9(C5463j2.this, i10);
            }
        });
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: z2 */
    public void mo5917z2() {
    }
}
