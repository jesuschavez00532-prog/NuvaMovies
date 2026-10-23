package p251n9;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import cc.C1464l0;
import cc.C1466m0;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.AccountLogoutEvent;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.module.view.LoadingView;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.result.AuthInfoList;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.LoginResult;
import com.request.result.LoginResultData;
import com.request.result.UserInfo;
import com.swlauthnew.R$style;
import com.taobao.accs.common.Constants;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import org.greenrobot.eventbus.ThreadMode;
import p141g2.C4338b;
import p149gc.DialogC4427d;
import p160h9.InterfaceC4725c;
import p160h9.InterfaceC4727d;
import p161ha.ViewOnClickListenerC4799t0;
import p170i2.C4842a;
import p192j9.C5016b;
import p217l2.InterfaceC5342c;
import p238m9.C5611c;
import p302qc.C6448c;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p371vb.C7252a;
import p400xa.AbstractC7598p1;
import p400xa.C7556b1;
import p421z0.C7734h;
import va.InterfaceC7251a;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: n9.b */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC5771b extends AbstractC5774c<InterfaceC4725c> implements InterfaceC4727d, View.OnClickListener {

    /* renamed from: C0 */
    public Map f23109C0 = new LinkedHashMap();

    /* renamed from: B0 */
    private boolean f23108B0 = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n9.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m23249a(LoginResult loginResult) {
            List<AuthInfoList> list;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            int i10 = 0;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            LoginResultData data;
            LoginResultData data2;
            LoginResultData data3;
            LoginResultData data4;
            LoginResultData data5;
            LoginResultData data6;
            LoginResultData data7;
            LoginResultData data8;
            LoginResultData data9;
            LoginResultData data10;
            LoginResultData data11;
            LoginResultData data12;
            LoginResultData data13;
            LoginResultData data14;
            LoginResultData data15;
            LoginResultData data16;
            LoginResultData data17;
            LoginResultData data18;
            LoginResultData data19;
            LoginResultData data20;
            LoginResultData data21;
            LoginResultData data22;
            LoginResultData data23;
            LoginResultData data24;
            LoginResultData data25;
            String str23 = null;
            if (loginResult != null && (data25 = loginResult.getData()) != null) {
                list = data25.getAuthInfoList();
            } else {
                list = null;
            }
            if (loginResult == null || (data24 = loginResult.getData()) == null || (str = data24.getBindMail()) == null) {
                str = MessageService.MSG_DB_READY_REPORT;
            }
            if (loginResult == null || (data23 = loginResult.getData()) == null || (str2 = data23.getBindMobile()) == null) {
                str2 = MessageService.MSG_DB_READY_REPORT;
            }
            if (loginResult == null || (data22 = loginResult.getData()) == null || (str3 = data22.getHasPay()) == null) {
                str3 = MessageService.MSG_DB_READY_REPORT;
            }
            if (loginResult == null || (data21 = loginResult.getData()) == null || (str4 = data21.getRestrictedStatus()) == null) {
                str4 = MessageService.MSG_DB_READY_REPORT;
            }
            if (loginResult != null && (data20 = loginResult.getData()) != null) {
                str5 = data20.getChildLockPwd();
            } else {
                str5 = null;
            }
            if (loginResult == null || (data19 = loginResult.getData()) == null || (str6 = data19.getHasPwd()) == null) {
                str6 = MessageService.MSG_DB_READY_REPORT;
            }
            if (loginResult != null && (data18 = loginResult.getData()) != null) {
                str7 = data18.getNowTime();
            } else {
                str7 = null;
            }
            if (loginResult != null && (data17 = loginResult.getData()) != null) {
                str8 = data17.getTips();
            } else {
                str8 = null;
            }
            if (loginResult != null && (data16 = loginResult.getData()) != null) {
                str9 = data16.getType();
            } else {
                str9 = null;
            }
            if (loginResult != null && (data15 = loginResult.getData()) != null) {
                i10 = data15.getRemainingDays();
            } else {
                i10 = 0;
            }
            if (loginResult != null && (data14 = loginResult.getData()) != null) {
                str10 = data14.getQrcodeMessage();
            } else {
                str10 = null;
            }
            if (loginResult != null && (data13 = loginResult.getData()) != null) {
                str11 = data13.getQrcodeDisplay();
            } else {
                str11 = null;
            }
            if (loginResult != null && (data12 = loginResult.getData()) != null) {
                str12 = data12.getPayCoreAddress();
            } else {
                str12 = null;
            }
            if (loginResult != null && (data11 = loginResult.getData()) != null) {
                str13 = data11.getUserType();
            } else {
                str13 = null;
            }
            if (loginResult != null && (data10 = loginResult.getData()) != null) {
                str14 = data10.getUserIdentity();
            } else {
                str14 = null;
            }
            if (loginResult == null || (data9 = loginResult.getData()) == null || (str15 = data9.getGetFreeAuthFlag()) == null) {
                str15 = "no";
            }
            String str24 = str15;
            if (loginResult != null && (data8 = loginResult.getData()) != null) {
                str16 = data8.getGetFreeAuthDays();
            } else {
                str16 = null;
            }
            if (loginResult != null && (data7 = loginResult.getData()) != null) {
                str17 = data7.getHasFreeAuth();
            } else {
                str17 = null;
            }
            if (loginResult != null && (data6 = loginResult.getData()) != null) {
                str18 = data6.getShowFlag();
            } else {
                str18 = null;
            }
            if (loginResult != null && (data5 = loginResult.getData()) != null) {
                str19 = data5.getShowType();
            } else {
                str19 = null;
            }
            if (loginResult != null && (data4 = loginResult.getData()) != null) {
                str20 = data4.getRenewFlag();
            } else {
                str20 = null;
            }
            if (loginResult != null && (data3 = loginResult.getData()) != null) {
                str21 = data3.getPlaylistUrl();
            } else {
                str21 = null;
            }
            if (loginResult != null && (data2 = loginResult.getData()) != null) {
                str22 = data2.getAreaFlag();
            } else {
                str22 = null;
            }
            if (loginResult != null && (data = loginResult.getData()) != null) {
                str23 = data.getChargeFlag();
            }
            C7252a.f27087a.m28082q(new GetAuthInfoResult("", "", new GetAuthInfoResultData(list, str, str2, str3, str4, str5, str6, str7, str8, str9, i10, str10, str11, str12, str13, str14, str24, str16, str17, str18, str19, str20, str21, str22, str23)));
            ((InterfaceC4725c) ViewOnClickListenerC5771b.this.m5478w9()).mo19587t0();
            ViewOnClickListenerC5771b.this.m23248h();
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m23249a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.b$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        /* renamed from: a */
        public final void m23250a() {
            ((InterfaceC4725c) ViewOnClickListenerC5771b.this.m5478w9()).mo19586m2();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23250a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.b$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        /* renamed from: a */
        public final void m23251a() {
            ((InterfaceC4725c) ViewOnClickListenerC5771b.this.m5478w9()).mo19586m2();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23251a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: n9.b$d */
    /* loaded from: classes2.dex */
    public static final class d implements ViewOnClickListenerC4799t0.a {
        d() {
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: a */
        public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            ViewOnClickListenerC5771b.this.m23241X9();
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: b */
        public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            viewOnClickListenerC4799t0.mo3279p9();
        }
    }

    /* renamed from: U9 */
    private final String m23239U9(String str) {
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && str.length() >= 10) {
            return C1464l0.f5622a.m6826e(str, "dd/MM/yyyy");
        }
        return "";
    }

    /* renamed from: W9 */
    private final String m23240W9(String str) {
        int m27735E;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            m27735E = AbstractC7167u.m27735E(str, "@", 0, false, 6, null);
            int i10 = 0;
            int i11 = 0;
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                int i12 = i11 + 1;
                int i13 = m27735E - 3;
                boolean z10 = true;
                if (i11 > m27735E - 1 || i13 > i11) {
                    z10 = false;
                }
                if (z10) {
                    sb2.append(Operator.Operation.MULTIPLY);
                } else {
                    sb2.append(charAt);
                }
                i10++;
                i11 = i12;
            }
        }
        String sb3 = sb2.toString();
        AbstractC5868k.m23673e(sb3, "emailShow.toString()");
        return sb3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X9 */
    public final void m23241X9() {
        ((InterfaceC4725c) m5478w9()).mo19585T1();
        InterfaceC5342c interfaceC5342c = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
        if (interfaceC5342c != null) {
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            interfaceC5342c.mo21621h(m3119R6, true, new a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:333:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d1  */
    /* renamed from: Y9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m23242Y9() {
        /*
            Method dump skipped, instructions count: 2697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p251n9.ViewOnClickListenerC5771b.m23242Y9():void");
    }

    /* renamed from: Z9 */
    private final void m23243Z9() {
        ((TextView) m23246S9(R$id.mTvLoginOther)).setOnClickListener(this);
        ((TextView) m23246S9(R$id.mTvLogout)).setOnClickListener(this);
        ((TextView) m23246S9(R$id.mTvReemCode)).setOnClickListener(this);
        ((TextView) m23246S9(R$id.mBtReemCode)).setOnClickListener(this);
        ((TextView) m23246S9(R$id.mBtChangePwd)).setOnClickListener(this);
        ((TextView) m23246S9(R$id.mBtForgetPwd)).setOnClickListener(this);
        ((TextView) m23246S9(R$id.mTvChangeEmail)).setOnClickListener(this);
        ((TextView) m23246S9(R$id.mTvChangePhone)).setOnClickListener(this);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_account;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        TextView textView = (TextView) m23246S9(R$id.mTvLoginOther);
        if (textView != null && textView.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        TextView textView2 = (TextView) m23246S9(R$id.mTvChangeEmail);
        if (textView2 != null && textView2.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        TextView textView3 = (TextView) m23246S9(R$id.mTvChangePhone);
        if (textView3 != null && textView3.hasFocus()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            return true;
        }
        TextView textView4 = (TextView) m23246S9(R$id.mTvLogout);
        if (textView4 != null && textView4.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            return true;
        }
        TextView textView5 = (TextView) m23246S9(R$id.mBtChangePwd);
        if (textView5 != null && textView5.hasFocus()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            return true;
        }
        TextView textView6 = (TextView) m23246S9(R$id.mTvReemCode);
        if (textView6 != null && textView6.hasFocus()) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            return true;
        }
        TextView textView7 = (TextView) m23246S9(R$id.mBtReemCode);
        if (textView7 != null && textView7.hasFocus()) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: J9 */
    public boolean mo23244J9() {
        View view;
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m23246S9(R$id.mRootLayout);
        if (autoFrameLayout != null) {
            view = autoFrameLayout.getFocusedChild();
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
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m23246S9(R$id.mRootLayout);
        if (autoFrameLayout == null || autoFrameLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // p160h9.InterfaceC4727d
    /* renamed from: O3 */
    public void mo19588O3() {
        m23248h();
        C7734h.m29873F(C7734h.f28449q.m29905a(), "", null, 2, null);
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: O9 */
    public void mo23245O9() {
        int i10 = R$id.mTvLogout;
        TextView textView = (TextView) m23246S9(i10);
        boolean z10 = false;
        if (textView != null && textView.getVisibility() == 0) {
            z10 = true;
        }
        if (z10) {
            TextView textView2 = (TextView) m23246S9(i10);
            if (textView2 != null) {
                textView2.requestFocus();
                return;
            }
            return;
        }
        TextView textView3 = (TextView) m23246S9(R$id.mTvLoginOther);
        if (textView3 != null) {
            textView3.requestFocus();
        }
    }

    @Override // p160h9.InterfaceC4727d
    /* renamed from: Q4 */
    public void mo19589Q4() {
        AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.account_logout_failed), new int[0]);
        LoadingView loadingView = (LoadingView) m23246S9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: S9 */
    public View m23246S9(int i10) {
        View findViewById;
        Map map = this.f23109C0;
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
    /* renamed from: V9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4725c mo5465y9() {
        return new C5016b(this, this);
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void accountLogout(AccountLogoutEvent accountLogoutEvent) {
        AbstractC5868k.m23674f(accountLogoutEvent, "event");
        LoadingView loadingView = (LoadingView) m23246S9(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(0);
        }
        ((InterfaceC4725c) m5478w9()).mo19584T();
    }

    @Override // p160h9.InterfaceC4727d
    /* renamed from: e */
    public void mo19590e() {
        C6448c.m25241r(C5634i.m22843d("http://module_login/ForcePasswordChangeActivity").m25254t(262144), this, null, 2, null);
    }

    /* renamed from: h */
    public final void m23248h() {
        if (C1466m0.f5627a.m6887v() == null) {
            LoadingView loadingView = (LoadingView) m23246S9(R$id.mLoadingView);
            if (loadingView != null) {
                loadingView.setVisibility(0);
                return;
            }
            return;
        }
        LoadingView loadingView2 = (LoadingView) m23246S9(R$id.mLoadingView);
        if (loadingView2 != null) {
            loadingView2.setVisibility(8);
        }
        if (C4842a.f20329a.m19920a().m19931H()) {
            m23242Y9();
        }
    }

    @InterfaceC7719m
    public final void handleExchangeSuccess(C4338b c4338b) {
        AbstractC5868k.m23674f(c4338b, "event");
        if (m3180m7() && m30051p9() && C1466m0.f5627a.m6887v() != null) {
            ((InterfaceC4725c) m5478w9()).mo19586m2();
        }
    }

    @Override // p160h9.InterfaceC4727d
    /* renamed from: j0 */
    public void mo19591j0(String str) {
        boolean z10;
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        if (m3075C6() != null) {
            AbstractActivityC0712e m3075C6 = m3075C6();
            if (m3075C6 != null) {
                z10 = m3075C6.isFinishing();
            } else {
                z10 = true;
            }
            if (!z10 && !m3192t7()) {
                switch (str.hashCode()) {
                    case -396103032:
                        if (str.equals("portal100041")) {
                            return;
                        }
                        break;
                    case -396103031:
                        if (str.equals("portal100042")) {
                            return;
                        }
                        break;
                    case -338366812:
                        if (str.equals("aaa100048")) {
                            return;
                        }
                        break;
                }
                if (m3075C6() instanceof AbstractActivityC2972a) {
                    AbstractActivityC0712e m3075C62 = m3075C6();
                    AbstractC5868k.m23672d(m3075C62, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
                    AbstractActivityC2972a.m11957W5((AbstractActivityC2972a) m3075C62, str, false, null, null, null, null, null, 126, null);
                }
            }
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23109C0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        m23243Z9();
        m23248h();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        String str;
        boolean m27724k;
        String str2;
        boolean m27724k2;
        String str3;
        String str4;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mTvLoginOther;
        if (num != null && num.intValue() == i10) {
            if (C1466m0.f5627a.m6829B()) {
                C7556b1 c7556b1 = C7556b1.f27754a;
                AbstractC0729o m3093I6 = m3093I6();
                AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                String string = m3154d7().getString(com.module.R$string.my_count_login_other_tips);
                AbstractC5868k.m23673e(string, "resources.getString(\n   …y_count_login_other_tips)");
                String string2 = m3154d7().getString(com.module.R$string.dialog_close);
                AbstractC5868k.m23673e(string2, "resources.getString(com.…le.R.string.dialog_close)");
                String string3 = m3154d7().getString(com.module.R$string.account_login_another);
                AbstractC5868k.m23673e(string3, "resources.getString(com.…ng.account_login_another)");
                C7556b1.m28962j(c7556b1, m3093I6, string, string2, string3, false, new d(), false, null, false, 448, null);
                return;
            }
            m23241X9();
            return;
        }
        int i11 = R$id.mTvLogout;
        if (num != null && num.intValue() == i11) {
            C5611c c5611c = new C5611c();
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23672d(m3096J6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC0729o m3294d4 = ((AbstractActivityC0712e) m3096J6).m3294d4();
            AbstractC5868k.m23673e(m3294d4, "context as FragmentActiv…y).supportFragmentManager");
            c5611c.mo3277E9(m3294d4, "AccountLogoutDialog");
            return;
        }
        int i12 = R$id.mTvReemCode;
        boolean z10 = true;
        if (num == null || num.intValue() != i12) {
            int i13 = R$id.mBtReemCode;
            if (num == null || num.intValue() != i13) {
                z10 = false;
            }
        }
        if (z10) {
            new DialogC4427d(m3075C6(), R$style.dialog, C1466m0.f5627a.m6878m()).show();
            return;
        }
        int i14 = R$id.mBtChangePwd;
        if (num != null && num.intValue() == i14) {
            InterfaceC5342c interfaceC5342c = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
            if (interfaceC5342c != null) {
                AbstractC0729o m3093I62 = m3093I6();
                AbstractC5868k.m23673e(m3093I62, "childFragmentManager");
                interfaceC5342c.mo21620g(m3093I62);
                return;
            }
            return;
        }
        int i15 = R$id.mBtForgetPwd;
        if (num != null && num.intValue() == i15) {
            C1466m0 c1466m0 = C1466m0.f5627a;
            UserInfo m6887v = c1466m0.m6887v();
            if (m6887v != null) {
                str3 = m6887v.getBindMail();
            } else {
                str3 = null;
            }
            if (!AbstractC5868k.m23669a(str3, "1")) {
                UserInfo m6887v2 = c1466m0.m6887v();
                if (m6887v2 != null) {
                    str4 = m6887v2.getBindMobile();
                } else {
                    str4 = null;
                }
                if (!AbstractC5868k.m23669a(str4, "1")) {
                    AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.personal_please_link_email), new int[0]);
                    return;
                }
            }
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3093I63 = m3093I6();
                AbstractC5868k.m23673e(m3093I63, "childFragmentManager");
                InterfaceC7251a.a.m28065b(interfaceC7251a, m3093I63, false, 2, null);
                return;
            }
            return;
        }
        int i16 = R$id.mTvChangeEmail;
        if (num != null && num.intValue() == i16) {
            UserInfo m6887v3 = C1466m0.f5627a.m6887v();
            if (m6887v3 != null) {
                str2 = m6887v3.getBindMail();
            } else {
                str2 = null;
            }
            m27724k2 = AbstractC7166t.m27724k(str2, "1", false, 2, null);
            if (m27724k2) {
                InterfaceC5342c interfaceC5342c2 = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
                if (interfaceC5342c2 != null) {
                    AbstractC0729o m3093I64 = m3093I6();
                    AbstractC5868k.m23673e(m3093I64, "childFragmentManager");
                    interfaceC5342c2.mo21618e(m3093I64);
                    return;
                }
                return;
            }
            InterfaceC5342c interfaceC5342c3 = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
            if (interfaceC5342c3 != null) {
                AbstractC0729o m3093I65 = m3093I6();
                AbstractC5868k.m23673e(m3093I65, "childFragmentManager");
                InterfaceC5342c.a.m21626a(interfaceC5342c3, m3093I65, new b(), false, 4, null);
                return;
            }
            return;
        }
        int i17 = R$id.mTvChangePhone;
        if (num != null && num.intValue() == i17) {
            UserInfo m6887v4 = C1466m0.f5627a.m6887v();
            if (m6887v4 != null) {
                str = m6887v4.getBindMobile();
            } else {
                str = null;
            }
            m27724k = AbstractC7166t.m27724k(str, "1", false, 2, null);
            if (m27724k) {
                InterfaceC5342c interfaceC5342c4 = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
                if (interfaceC5342c4 != null) {
                    AbstractC0729o m3093I66 = m3093I6();
                    AbstractC5868k.m23673e(m3093I66, "childFragmentManager");
                    interfaceC5342c4.mo21623j(m3093I66);
                    return;
                }
                return;
            }
            InterfaceC5342c interfaceC5342c5 = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
            if (interfaceC5342c5 != null) {
                AbstractC0729o m3093I67 = m3093I6();
                AbstractC5868k.m23673e(m3093I67, "childFragmentManager");
                InterfaceC5342c.a.m21627b(interfaceC5342c5, m3093I67, false, new c(), 2, null);
            }
        }
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        TextView textView;
        TextView textView2;
        AbstractC5868k.m23674f(keyEvent, "event");
        Log.d("AccountFragment", "onKeyDown;keyCode:" + i10);
        boolean z10 = false;
        if (i10 == 22) {
            TextView textView3 = (TextView) m23246S9(R$id.mBtChangePwd);
            if (textView3 != null && textView3.hasFocus()) {
                z10 = true;
            }
            if (z10 && (textView2 = (TextView) m23246S9(R$id.mBtForgetPwd)) != null) {
                textView2.requestFocus();
            }
            return true;
        }
        if (i10 == 19 && ((TextView) m23246S9(R$id.mTvLoginOther)).hasFocus()) {
            int i11 = R$id.mTvLogout;
            TextView textView4 = (TextView) m23246S9(i11);
            if (textView4 != null && textView4.getVisibility() == 0) {
                z10 = true;
            }
            if (z10 && (textView = (TextView) m23246S9(i11)) != null) {
                textView.requestFocus();
            }
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @InterfaceC7719m
    public final void refreshUerInfoDisplayMessage(RefreshUerInfoDisplayEvent refreshUerInfoDisplayEvent) {
        AbstractC5868k.m23674f(refreshUerInfoDisplayEvent, "event");
        if (m3180m7() && m30051p9()) {
            m23248h();
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23108B0;
    }
}
