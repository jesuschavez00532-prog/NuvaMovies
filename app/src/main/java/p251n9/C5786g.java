package p251n9;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import cc.C1466m0;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.module.event.UpdateRestrictStateEvent;
import com.request.result.UserInfo;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p011aa.AbstractViewOnClickListenerC0123a;
import p101da.ViewOnClickListenerC4018d;
import p101da.ViewOnClickListenerC4019e;
import p117ea.AbstractC4161e;
import p117ea.C4160d;
import p160h9.InterfaceC4731g;
import p160h9.InterfaceC4732h;
import p161ha.C4772h;
import p192j9.C5026i;
import p201k2.C5096m;
import p317rb.AbstractC6567a;
import p400xa.AbstractC7598p1;
import p400xa.C7556b1;
import ye.C7709c;

/* renamed from: n9.g */
/* loaded from: classes2.dex */
public final class C5786g extends AbstractC5774c<InterfaceC4731g> implements InterfaceC4732h {

    /* renamed from: B0 */
    private boolean f23180B0;

    /* renamed from: C0 */
    private boolean f23181C0;

    /* renamed from: D0 */
    public Map f23182D0 = new LinkedHashMap();

    /* renamed from: n9.g$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractViewOnClickListenerC0123a {
        a() {
        }

        @Override // p011aa.AbstractViewOnClickListenerC0123a
        /* renamed from: c */
        public void mo492c(View view) {
            if (!C5786g.this.f23180B0 && AbstractC6567a.m25634d(AbstractC4161e.f18225a.m17399b())) {
                AbstractC7598p1.m29244h(C5786g.this.m3096J6(), C5786g.this.m3172j7(R$string.cr_switch_to_set_pwd_toast_tips), new int[0]);
            } else {
                C5786g.this.m23366Y9(!r3.f23180B0);
            }
        }
    }

    /* renamed from: n9.g$b */
    /* loaded from: classes2.dex */
    public static final class b implements View.OnClickListener {

        /* renamed from: n9.g$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements ViewOnClickListenerC4019e.a {

            /* renamed from: a */
            final /* synthetic */ C5786g f23185a;

            /* renamed from: n9.g$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            static final class C7855a extends AbstractC5869l implements InterfaceC5642a {

                /* renamed from: a */
                public static final C7855a f23186a = new C7855a();

                C7855a() {
                    super(0);
                }

                /* renamed from: a */
                public final void m23369a() {
                }

                @Override // me.InterfaceC5642a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m23369a();
                    return C1328x.f4998a;
                }
            }

            a(C5786g c5786g) {
                this.f23185a = c5786g;
            }

            @Override // p101da.ViewOnClickListenerC4019e.a
            /* renamed from: Z2 */
            public void mo17006Z2() {
            }

            @Override // p101da.ViewOnClickListenerC4019e.a
            /* renamed from: b2 */
            public void mo17007b2() {
            }

            @Override // p101da.ViewOnClickListenerC4019e.a
            /* renamed from: n2 */
            public void mo17008n2() {
                this.f23185a.m23365X9();
                C4160d.b bVar = C4160d.f18217d;
                Context m3096J6 = this.f23185a.m3096J6();
                AbstractC5868k.m23671c(m3096J6);
                Context m3096J62 = this.f23185a.m3096J6();
                AbstractC5868k.m23671c(m3096J62);
                String string = m3096J62.getString(R$string.pwd_set_suc);
                AbstractC5868k.m23673e(string, "context!!.getString(R.string.pwd_set_suc)");
                C4160d.b.m17389f(bVar, m3096J6, string, false, 4, null);
            }

            @Override // p101da.ViewOnClickListenerC4019e.a
            /* renamed from: q0 */
            public void mo17009q0() {
                String str;
                C1466m0 c1466m0 = C1466m0.f5627a;
                UserInfo m6887v = c1466m0.m6887v();
                if (m6887v != null) {
                    m6887v.setRestrictedStatus("1");
                }
                C5786g c5786g = this.f23185a;
                UserInfo m6887v2 = c1466m0.m6887v();
                if (m6887v2 != null) {
                    str = m6887v2.getRestrictedStatus();
                } else {
                    str = null;
                }
                c5786g.m23366Y9(AbstractC5868k.m23669a(str, "1"));
                C7556b1 c7556b1 = C7556b1.f27754a;
                AbstractC0729o m3119R6 = this.f23185a.m3119R6();
                AbstractC5868k.m23671c(m3119R6);
                c7556b1.m28968g(m3119R6, true, false, C7855a.f23186a);
            }
        }

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CharSequence charSequence;
            TextView textView = (TextView) C5786g.this.m23367S9(R$id.mTvChangeCrPwd);
            if (textView != null) {
                charSequence = textView.getText();
            } else {
                charSequence = null;
            }
            if (AbstractC5868k.m23669a(charSequence, C5786g.this.m3154d7().getString(R$string.cr_switch_change_parent_control_pwd))) {
                C7556b1 c7556b1 = C7556b1.f27754a;
                AbstractC0729o m3093I6 = C5786g.this.m3093I6();
                AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                Context m3096J6 = C5786g.this.m3096J6();
                AbstractC5868k.m23671c(m3096J6);
                c7556b1.m28969h(m3093I6, m3096J6);
                return;
            }
            C4160d m17390a = C4160d.f18217d.m17390a();
            AbstractC0729o m3119R6 = C5786g.this.m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            C4160d.m17381p(m17390a, m3119R6, new a(C5786g.this), false, false, 4, null);
        }
    }

    /* renamed from: n9.g$c */
    /* loaded from: classes2.dex */
    public static final class c implements View.OnClickListener {

        /* renamed from: n9.g$c$a */
        /* loaded from: classes2.dex */
        public static final class a implements ViewOnClickListenerC4018d.a {

            /* renamed from: a */
            final /* synthetic */ C5786g f23188a;

            a(C5786g c5786g) {
                this.f23188a = c5786g;
            }

            @Override // p101da.ViewOnClickListenerC4018d.a
            public void cancel() {
                this.f23188a.m23365X9();
            }

            @Override // p101da.ViewOnClickListenerC4018d.a
            /* renamed from: q0 */
            public void mo11609q0() {
            }

            @Override // p101da.ViewOnClickListenerC4018d.a
            /* renamed from: r0 */
            public void mo11610r0() {
            }

            @Override // p101da.ViewOnClickListenerC4018d.a
            /* renamed from: x */
            public void mo11611x() {
            }
        }

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v != null) {
                str = m6887v.getHasPwd();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT)) {
                if (C5096m.f20979a.m20692c()) {
                    C4160d.b bVar = C4160d.f18217d;
                    Context m3096J6 = C5786g.this.m3096J6();
                    AbstractC5868k.m23671c(m3096J6);
                    Context m3096J62 = C5786g.this.m3096J6();
                    AbstractC5868k.m23671c(m3096J62);
                    String string = m3096J62.getString(com.module.R$string.adult_reset_child_pwd_without_pwd_tips_other);
                    AbstractC5868k.m23673e(string, "context!!.getString(com.…d_without_pwd_tips_other)");
                    bVar.m17393e(m3096J6, string, true);
                    return;
                }
                C4160d.b bVar2 = C4160d.f18217d;
                Context m3096J63 = C5786g.this.m3096J6();
                AbstractC5868k.m23671c(m3096J63);
                Context m3096J64 = C5786g.this.m3096J6();
                AbstractC5868k.m23671c(m3096J64);
                String string2 = m3096J64.getString(com.module.R$string.adult_reset_child_pwd_without_pwd_tips_own);
                AbstractC5868k.m23673e(string2, "context!!.getString(com.…pwd_without_pwd_tips_own)");
                bVar2.m17393e(m3096J63, string2, true);
                return;
            }
            C4772h c4772h = new C4772h();
            c4772h.m19723P9(new a(C5786g.this));
            AbstractC0729o m3119R6 = C5786g.this.m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            c4772h.mo3277E9(m3119R6, "CheckLoginPwdDialog");
        }
    }

    /* renamed from: n9.g$d */
    /* loaded from: classes2.dex */
    public static final class d implements ViewOnClickListenerC4018d.a {

        /* renamed from: n9.g$d$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5642a {

            /* renamed from: a */
            public static final a f23190a = new a();

            a() {
                super(0);
            }

            /* renamed from: a */
            public final void m23370a() {
            }

            @Override // me.InterfaceC5642a
            public /* bridge */ /* synthetic */ Object invoke() {
                m23370a();
                return C1328x.f4998a;
            }
        }

        d() {
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        public void cancel() {
            C5786g.this.m23365X9();
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: q0 */
        public void mo11609q0() {
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v != null) {
                m6887v.setRestrictedStatus("1");
            }
            C7709c.m29787d().m29801m(new UpdateRestrictStateEvent());
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3119R6 = C5786g.this.m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            c7556b1.m28968g(m3119R6, true, false, a.f23190a);
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: r0 */
        public void mo11610r0() {
            ImageView imageView = (ImageView) C5786g.this.m23367S9(R$id.mLockBtn);
            if (imageView != null) {
                imageView.setSelected(C5786g.this.f23180B0);
            }
            C5786g c5786g = C5786g.this;
            int i10 = R$id.tvLockStatusDes;
            TextView textView = (TextView) c5786g.m23367S9(i10);
            if (textView != null) {
                textView.setText(C5786g.this.m3154d7().getString(com.module.R$string.cr_switch_open_tips));
            }
            TextView textView2 = (TextView) C5786g.this.m23367S9(i10);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }

        @Override // p101da.ViewOnClickListenerC4018d.a
        /* renamed from: x */
        public void mo11611x() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X9 */
    public final void m23365X9() {
        String str;
        UserInfo m6887v = C1466m0.f5627a.m6887v();
        if (m6887v != null) {
            str = m6887v.getRestrictedStatus();
        } else {
            str = null;
        }
        this.f23180B0 = AbstractC5868k.m23669a(str, "1");
        ImageView imageView = (ImageView) m23367S9(R$id.mLockBtn);
        if (imageView != null) {
            imageView.setSelected(this.f23180B0);
        }
        if (this.f23180B0) {
            int i10 = R$id.tvLockStatusDes;
            TextView textView = (TextView) m23367S9(i10);
            if (textView != null) {
                textView.setText(m3154d7().getString(com.module.R$string.cr_switch_open_tips));
            }
            TextView textView2 = (TextView) m23367S9(i10);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            TextView textView3 = (TextView) m23367S9(R$id.tvLockStatusDes);
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
        }
        if (AbstractC6567a.m25634d(AbstractC4161e.f18225a.m17399b())) {
            TextView textView4 = (TextView) m23367S9(R$id.mTvChangeCrPwd);
            if (textView4 != null) {
                textView4.setText(m3154d7().getString(com.module.R$string.cr_switch_to_set_pwd));
            }
            TextView textView5 = (TextView) m23367S9(R$id.tvLockDes);
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = (TextView) m23367S9(R$id.mTvForgetCrPwd);
            if (textView6 != null) {
                textView6.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView7 = (TextView) m23367S9(R$id.mTvChangeCrPwd);
        if (textView7 != null) {
            textView7.setText(m3154d7().getString(com.module.R$string.cr_switch_change_parent_control_pwd));
        }
        TextView textView8 = (TextView) m23367S9(R$id.tvLockDes);
        if (textView8 != null) {
            textView8.setVisibility(8);
        }
        TextView textView9 = (TextView) m23367S9(R$id.mTvForgetCrPwd);
        if (textView9 != null) {
            textView9.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y9 */
    public final void m23366Y9(boolean z10) {
        this.f23180B0 = z10;
        if (z10) {
            C4160d m17390a = C4160d.f18217d.m17390a();
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            m17390a.m17385l(m3119R6, new d(), true);
            return;
        }
        ((InterfaceC4731g) m5478w9()).mo19601b3(MessageService.MSG_DB_READY_REPORT);
        ImageView imageView = (ImageView) m23367S9(R$id.mLockBtn);
        if (imageView != null) {
            imageView.setSelected(this.f23180B0);
        }
        UserInfo m6887v = C1466m0.f5627a.m6887v();
        if (m6887v != null) {
            m6887v.setRestrictedStatus(MessageService.MSG_DB_READY_REPORT);
        }
        TextView textView = (TextView) m23367S9(R$id.tvLockStatusDes);
        if (textView != null) {
            textView.setVisibility(4);
        }
        C7709c.m29787d().m29801m(new UpdateRestrictStateEvent());
    }

    @Override // p160h9.InterfaceC4732h
    /* renamed from: A1 */
    public void mo19602A1() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_cr_switch;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        boolean z10;
        boolean z11;
        boolean z12;
        ImageView imageView = (ImageView) m23367S9(R$id.mLockBtn);
        if (imageView != null && imageView.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        TextView textView = (TextView) m23367S9(R$id.mTvChangeCrPwd);
        if (textView != null && textView.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        TextView textView2 = (TextView) m23367S9(R$id.mTvForgetCrPwd);
        if (textView2 != null && textView2.hasFocus()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: J9 */
    public boolean mo23244J9() {
        View view;
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23367S9(R$id.mRootLayout);
        if (autoRelativeLayout != null) {
            view = autoRelativeLayout.getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        AutoRelativeLayout autoRelativeLayout = (AutoRelativeLayout) m23367S9(R$id.mRootLayout);
        if (autoRelativeLayout == null || autoRelativeLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: O9 */
    public void mo23245O9() {
        ImageView imageView = (ImageView) m23367S9(R$id.mLockBtn);
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    @Override // p160h9.InterfaceC4732h
    /* renamed from: Q1 */
    public void mo19603Q1() {
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: S9 */
    public View m23367S9(int i10) {
        View findViewById;
        Map map = this.f23182D0;
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

    @Override // ba.AbstractC1196d
    /* renamed from: W9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4731g mo5465y9() {
        return new C5026i(this, this);
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23182D0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        String str;
        UserInfo m6887v = C1466m0.f5627a.m6887v();
        if (m6887v != null) {
            str = m6887v.getRestrictedStatus();
        } else {
            str = null;
        }
        this.f23180B0 = AbstractC5868k.m23669a(str, "1");
        int i10 = R$id.mLockBtn;
        ((ImageView) m23367S9(i10)).setSelected(this.f23180B0);
        m23365X9();
        ((ImageView) m23367S9(i10)).setOnClickListener(new a());
        ((TextView) m23367S9(R$id.mTvChangeCrPwd)).setOnClickListener(new b());
        ((TextView) m23367S9(R$id.mTvForgetCrPwd)).setOnClickListener(new c());
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (i10 == 20) {
            ImageView imageView = (ImageView) m23367S9(R$id.mLockBtn);
            boolean z12 = false;
            if (imageView != null && imageView.hasFocus()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                TextView textView = (TextView) m23367S9(R$id.mTvChangeCrPwd);
                if (textView != null) {
                    textView.requestFocus();
                }
                return true;
            }
            TextView textView2 = (TextView) m23367S9(R$id.mTvChangeCrPwd);
            if (textView2 != null && textView2.hasFocus()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i11 = R$id.mTvForgetCrPwd;
                TextView textView3 = (TextView) m23367S9(i11);
                if (textView3 != null && textView3.getVisibility() == 0) {
                    z12 = true;
                }
                if (!z12) {
                    return true;
                }
                TextView textView4 = (TextView) m23367S9(i11);
                if (textView4 != null) {
                    textView4.requestFocus();
                }
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23181C0;
    }
}
