package com.module.basemvp;

import ac.C0152f1;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Toast;
import androidx.fragment.app.AbstractC0729o;
import anet.channel.entity.EventType;
import be.C1328x;
import ca.InterfaceC1439a;
import cc.C1441a;
import cc.C1463l;
import cc.C1466m0;
import com.module.R$string;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.AwakenVoiceAssistEvent;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.event.RemoteLoginEvent;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.bean.UserTokenInvalidEvent;
import com.request.result.LoginResult;
import com.umeng.analytics.MobclickAgent;
import ga.C4417e;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5660l;
import me.jessyan.autosize.AutoSizeCompat;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.greenrobot.eventbus.ThreadMode;
import p104dd.AbstractC4096d;
import p134fc.AbstractC4305b;
import p141g2.C4337a;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6432v0;
import p323s2.AbstractC6652a;
import p348u2.AbstractC7028e;
import p348u2.AbstractC7030g;
import p359ue.AbstractC7167u;
import p363v2.C7197a;
import p383w9.C7383a;
import p400xa.AbstractC7558c0;
import p400xa.C7556b1;
import p400xa.C7572h;
import p400xa.C7574h1;
import p400xa.C7589m1;
import p400xa.C7610t1;
import p400xa.C7617x;
import p415y9.AbstractApplicationC7689d;
import p421z0.C7729c;
import p421z0.C7734h;
import p430z9.AbstractActivityC7763a;
import va.InterfaceC7251a;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: com.module.basemvp.a */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2972a extends AbstractActivityC7763a implements AbstractC7558c0.b {

    /* renamed from: D */
    public static final a f12042D = new a(null);

    /* renamed from: A */
    private boolean f12043A;

    /* renamed from: B */
    public boolean f12044B;

    /* renamed from: C */
    public Map f12045C = new LinkedHashMap();

    /* renamed from: v */
    private final String f12046v = "BaseMVPActivity";

    /* renamed from: w */
    public InterfaceC1439a f12047w;

    /* renamed from: x */
    private long f12048x;

    /* renamed from: y */
    protected Context f12049y;

    /* renamed from: z */
    private Toast f12050z;

    /* renamed from: com.module.basemvp.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: com.module.basemvp.a$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC6432v0 {

        /* renamed from: b */
        final /* synthetic */ RemoteLoginEvent f12052b;

        b(RemoteLoginEvent remoteLoginEvent) {
            this.f12052b = remoteLoginEvent;
        }

        @Override // p301qb.InterfaceC6432v0
        /* renamed from: c */
        public void mo11978c(String str) {
            AbstractC5868k.m23674f(str, "errCode");
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3294d4 = AbstractActivityC2972a.this.m3294d4();
                AbstractC5868k.m23673e(m3294d4, "supportFragmentManager");
                interfaceC7251a.mo25621a(m3294d4, this.f12052b.getMsg());
            }
        }
    }

    /* renamed from: com.module.basemvp.a$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f12053a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m11979a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11979a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.basemvp.a$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f12054a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m11980a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11980a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H5 */
    public static final void m11955H5(AbstractActivityC2972a abstractActivityC2972a) {
        AbstractC5868k.m23674f(abstractActivityC2972a, "this$0");
        abstractActivityC2972a.m11964e5();
    }

    /* renamed from: O5 */
    private final void m11956O5() {
        C7709c.m29787d().m29803r(this);
    }

    /* renamed from: W5 */
    public static /* synthetic */ void m11957W5(AbstractActivityC2972a abstractActivityC2972a, String str, boolean z10, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        boolean z11;
        String str7;
        String str8;
        String str9;
        String str10;
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z11 = false;
            } else {
                z11 = z10;
            }
            String str11 = "";
            if ((i10 & 4) != 0) {
                str7 = "";
            } else {
                str7 = str2;
            }
            if ((i10 & 8) != 0) {
                str8 = "";
            } else {
                str8 = str3;
            }
            if ((i10 & 16) != 0) {
                str9 = "";
            } else {
                str9 = str4;
            }
            if ((i10 & 32) != 0) {
                str10 = "";
            } else {
                str10 = str5;
            }
            if ((i10 & 64) == 0) {
                str11 = str6;
            }
            abstractActivityC2972a.m11972U5(str, z11, str7, str8, str9, str10, str11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorMsg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y5 */
    public static final void m11960Y5(AbstractActivityC2972a abstractActivityC2972a, String str) {
        AbstractC5868k.m23674f(abstractActivityC2972a, "this$0");
        AbstractC5868k.m23674f(str, "$errorStr");
        C7574h1.m29062c(C7574h1.f27833a, abstractActivityC2972a.m30049S4(), str, null, 4, null);
    }

    /* renamed from: b6 */
    public static /* synthetic */ void m11962b6(AbstractActivityC2972a abstractActivityC2972a, int i10, boolean z10, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, int i11, Object obj) {
        boolean z11;
        Boolean bool2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = false;
            } else {
                z11 = z10;
            }
            Integer num2 = null;
            if ((i11 & 4) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            String str14 = "";
            if ((i11 & 8) != 0) {
                str8 = "";
            } else {
                str8 = str;
            }
            if ((i11 & 16) != 0) {
                str9 = "";
            } else {
                str9 = str2;
            }
            if ((i11 & 32) != 0) {
                str10 = "";
            } else {
                str10 = str3;
            }
            if ((i11 & 64) != 0) {
                str11 = "";
            } else {
                str11 = str4;
            }
            if ((i11 & 128) != 0) {
                str12 = "";
            } else {
                str12 = str5;
            }
            if ((i11 & 256) != 0) {
                str13 = "";
            } else {
                str13 = str6;
            }
            if ((i11 & 512) == 0) {
                str14 = str7;
            }
            if ((i11 & EventType.AUTH_FAIL) == 0) {
                num2 = num;
            }
            abstractActivityC2972a.m11973Z5(i10, z11, bool2, str8, str9, str10, str11, str12, str13, str14, num2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPlayErrorMsg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d6 */
    public static final void m11963d6(AbstractActivityC2972a abstractActivityC2972a, String str, Boolean bool) {
        AbstractC5868k.m23674f(abstractActivityC2972a, "this$0");
        AbstractC5868k.m23674f(str, "$errorStr");
        C7574h1.f27833a.m29064b(abstractActivityC2972a.m30049S4(), str, bool);
    }

    /* renamed from: e5 */
    private final void m11964e5() {
        C7734h.f28449q.m29905a().m29898p(this);
    }

    /* renamed from: k5 */
    public static /* synthetic */ void m11965k5(AbstractActivityC2972a abstractActivityC2972a, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            abstractActivityC2972a.m11974i5(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exit");
    }

    /* renamed from: A5 */
    protected boolean mo11828A5() {
        return false;
    }

    /* renamed from: B5 */
    public final boolean m11966B5() {
        if (this.f12047w != null) {
            return true;
        }
        return false;
    }

    /* renamed from: D5 */
    public boolean mo11394D5() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F5 */
    public final void m11967F5() {
        C7383a c7383a = C7383a.f27389a;
        C7383a.m28494e(c7383a, null, 1, null);
        mo7513g5();
        m11956O5();
        m11977r5().mo6701B0();
        C7383a.m28493c(c7383a, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K5 */
    public final void m11968K5() {
        Toast toast;
        if (System.currentTimeMillis() - this.f12048x > 2000) {
            Toast toast2 = this.f12050z;
            if (toast2 != null) {
                toast2.cancel();
            }
            Toast makeText = Toast.makeText(this, getString(R$string.press_again_to_exits), 0);
            this.f12050z = makeText;
            AbstractC6652a.m25971a(makeText);
            if (!isFinishing() && (toast = this.f12050z) != null) {
                toast.show();
            }
            this.f12048x = System.currentTimeMillis();
            return;
        }
        Toast toast3 = this.f12050z;
        if (toast3 != null) {
            toast3.cancel();
        }
        AbstractC7028e.m27115a("p2");
        m11974i5(true);
        finish();
        super.onBackPressed();
    }

    @Override // p400xa.AbstractC7558c0.b
    /* renamed from: N2 */
    public void mo11969N2() {
        AbstractC4096d.m17153c("task", "start");
    }

    /* renamed from: P5 */
    protected final void m11970P5(Context context) {
        AbstractC5868k.m23674f(context, "<set-?>");
        this.f12049y = context;
    }

    /* renamed from: R5 */
    public final void m11971R5(InterfaceC1439a interfaceC1439a) {
        AbstractC5868k.m23674f(interfaceC1439a, "<set-?>");
        this.f12047w = interfaceC1439a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00da, code lost:
    
        if (r6 != false) goto L22;
     */
    /* renamed from: U5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11972U5(java.lang.String r16, boolean r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.module.basemvp.AbstractActivityC2972a.m11972U5(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: Z5 */
    public final void m11973Z5(int i10, boolean z10, final Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num) {
        final String m29331e;
        String m29330d;
        String valueOf;
        String num2;
        AbstractC5868k.m23674f(str, "errMsg");
        AbstractC5868k.m23674f(str2, "uri");
        AbstractC5868k.m23674f(str3, "bussType");
        AbstractC5868k.m23674f(str4, "mCode");
        AbstractC5868k.m23674f(str5, "title");
        AbstractC5868k.m23674f(str6, "host");
        AbstractC5868k.m23674f(str7, "cdnType");
        if (!TextUtils.isEmpty(str)) {
            m29331e = str;
        } else {
            m29331e = C7617x.f28030a.m29331e(m30049S4(), i10);
        }
        if (!TextUtils.isEmpty(str)) {
            m29330d = AbstractC7167u.m27757a0(str, Operator.Operation.MINUS, null, 2, null);
        } else {
            m29330d = C7617x.f28030a.m29330d(m30049S4(), i10);
        }
        String str8 = m29330d;
        if (num != null && (num2 = num.toString()) != null) {
            valueOf = num2;
        } else {
            valueOf = String.valueOf(i10);
        }
        C7729c.f28423a.m29853g(str4, str5, str6, str3, str7, str8, valueOf, str2);
        if (!TextUtils.isEmpty(m29331e) && !isFinishing()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ba.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractActivityC2972a.m11963d6(AbstractActivityC2972a.this, m29331e, bool);
                }
            });
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void awakenVoiceAssist(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "event");
        if (!this.f12043A) {
            return;
        }
        if (awakenVoiceAssistEvent.getCommad() == -1) {
            C7610t1.f27984a.m29266d(this, awakenVoiceAssistEvent);
        } else {
            mo11422t5(awakenVoiceAssistEvent);
        }
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, androidx.core.app.AbstractActivityC0511i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.getKeyCode() == 61) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e4 */
    protected void mo11397e4() {
        C7383a c7383a = C7383a.f27389a;
        c7383a.m28497d("setContentView");
        setContentView(mo7518z5());
        c7383a.m28496b("setContentView");
        m11971R5(mo7516s5());
        C1441a.f5552a.m6703a(this);
        if (!mo11828A5()) {
            m11967F5();
        }
    }

    /* renamed from: g5 */
    protected abstract void mo7513g5();

    /* renamed from: i5 */
    public void m11974i5(boolean z10) {
        C7572h.f27809j.m29056a().m29054w();
        C4417e c4417e = C4417e.f19115a;
        Context m30049S4 = m30049S4();
        String m20598h = AbstractC5085b.m20598h(m30049S4());
        AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
        c4417e.m18502e(m30049S4, m20598h, false, z10);
    }

    @Override // p400xa.AbstractC7558c0.b
    /* renamed from: o1 */
    public void mo11975o1() {
        AbstractC4096d.m17153c("home", "start");
        AbstractC7028e.m27115a("home");
        m11965k5(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o5 */
    public final Context m11976o5() {
        Context context = this.f12049y;
        if (context != null) {
            return context;
        }
        AbstractC5868k.m23686r("mContext");
        return null;
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC5868k.m23674f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        AutoSizeCompat.autoConvertDensityOfGlobal(getResources());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p430z9.AbstractActivityC7763a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0511i, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!getClass().getName().equals("com.interactive.brasiliptv.ui.activity.WelcomeActivity") && bundle != null && (C7197a.f26917a.m27848e() == null || TextUtils.isEmpty(C1463l.f5620a.m6820a()))) {
            m11965k5(this, false, 1, null);
            Intent launchIntentForPackage = m30049S4().getPackageManager().getLaunchIntentForPackage(m30049S4().getPackageName());
            if (launchIntentForPackage != null) {
                m30049S4().startActivity(Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
                try {
                    System.exit(0);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                } catch (Exception unused) {
                } finally {
                    Process.killProcess(Process.myPid());
                }
            }
            finish();
            return;
        }
        C7383a c7383a = C7383a.f27389a;
        c7383a.m28497d("baseCreate");
        super.onCreate(bundle);
        m11970P5(this);
        c7383a.m28496b("baseCreate");
        mo11397e4();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onDestroy() {
        C7734h.f28449q.m29905a().m29896n();
        if (C7709c.m29787d().m29800k(this)) {
            C7709c.m29787d().m29806v(this);
        }
        C1441a.f5552a.m6708f(this);
        m11977r5().mo6702n2();
        super.onDestroy();
    }

    @InterfaceC7719m(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventRemoteLogin(RemoteLoginEvent remoteLoginEvent) {
        AbstractC5868k.m23674f(remoteLoginEvent, "event");
        if (!this.f12043A) {
            return;
        }
        C7709c.m29787d().m29805t(remoteLoginEvent);
        new C0152f1(new b(remoteLoginEvent)).m582e(true);
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void onExchangeExpired(C4337a c4337a) {
        AbstractC5868k.m23674f(c4337a, "event");
        if (c4337a.m18205a()) {
            C1466m0.f5627a.m6849V(true);
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3294d4 = m3294d4();
                AbstractC5868k.m23673e(m3294d4, "supportFragmentManager");
                InterfaceC7251a.a.m28064a(interfaceC7251a, m3294d4, false, null, c.f12053a, 4, null);
                return;
            }
            return;
        }
        AbstractC7028e.m27115a("ex");
        C4417e c4417e = C4417e.f19115a;
        Context m29494a = AbstractApplicationC7689d.f28135d.m29494a();
        String m20598h = AbstractC5085b.m20598h(m30049S4());
        AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
        C4417e.m18497f(c4417e, m29494a, m20598h, false, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f12043A = false;
        MobclickAgent.onPause(this);
        AbstractC7558c0.m28981e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        AbstractC7030g.m27129c("bigbee resume", new Runnable() { // from class: ba.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractActivityC2972a.m11955H5(AbstractActivityC2972a.this);
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (mo11394D5()) {
            C7572h.f27809j.m29056a().m29053t(this);
        }
        this.f12043A = true;
        MobclickAgent.onResume(this);
        AbstractC7558c0.m28980d(m30049S4());
        AbstractC7558c0.m28979c(this);
        if (!AbstractC5868k.m23669a(getClass().getSimpleName(), "WelcomeActivity") && !AbstractC5868k.m23669a(getClass().getSimpleName(), "VoiceSearchActivity") && AbstractC5868k.m23669a(AbstractC4305b.f18742a, "2b494e53756c664c2f44465245733572")) {
            C7589m1.f27886a.m29153v();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            AbstractApplicationC6253c.f24484b.m24887a().startActivity(intent);
            Process.killProcess(Process.myPid());
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onStop() {
        super.onStop();
        C7734h.f28449q.m29905a().m29897o(this);
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        if ((getIntent().getFlags() & 262144) != 0 && getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") && C4842a.f20329a.m19920a().mo19968q()) {
            m11965k5(this, false, 1, null);
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void onUserTokenInvalid(UserTokenInvalidEvent userTokenInvalidEvent) {
        AbstractC5868k.m23674f(userTokenInvalidEvent, "event");
        if (this.f12043A) {
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3294d4 = m3294d4();
            AbstractC5868k.m23673e(m3294d4, "supportFragmentManager");
            c7556b1.m28972l(m3294d4);
        }
    }

    /* renamed from: r5 */
    public final InterfaceC1439a m11977r5() {
        InterfaceC1439a interfaceC1439a = this.f12047w;
        if (interfaceC1439a != null) {
            return interfaceC1439a;
        }
        AbstractC5868k.m23686r("mPresenter");
        return null;
    }

    /* renamed from: s5 */
    protected abstract InterfaceC1439a mo7516s5();

    /* renamed from: t5 */
    public void mo11422t5(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "event");
        awakenVoiceAssistEvent.getCommad();
    }

    /* renamed from: z5 */
    protected abstract int mo7518z5();
}
