package com.interactive.brasiliptv.p061ui.activity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.AbstractC0547a;
import anet.channel.entity.EventType;
import be.C1318n;
import be.C1328x;
import cc.C1441a;
import cc.C1445c;
import cc.C1446c0;
import cc.C1466m0;
import cc.C1476v;
import cc.C1477w;
import com.adimage.view.LaunchAdView;
import com.advertlib.bean.AdInfo;
import com.core.sysopt.mark.TraceRecycledImageView;
import com.dcs.bean.DomainInfo;
import com.google.android.youtube.tv.R;
import com.interactive.brasiliptv.R$id;
import com.interactive.brasiliptv.p061ui.activity.WelcomeActivity;
import com.interactive.brasiliptv.utils.AbstractC2843a;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.EnterHomeAct;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.C5543b;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p179ib.AbstractC4926c;
import p179ib.AbstractC4929f;
import p185j2.C4982a;
import p198k.C5076a;
import p201k2.AbstractC5085b;
import p201k2.AbstractC5093j;
import p222l7.DialogC5423b;
import p236m7.InterfaceC5605b;
import p236m7.InterfaceC5606c;
import p242n0.C5714a;
import p249n7.C5752e;
import p249n7.C5764q;
import p255o0.InterfaceC5898a;
import p277p0.C6156m;
import p277p0.C6160q;
import p287pb.AbstractApplicationC6253c;
import p348u2.AbstractC7028e;
import p348u2.AbstractC7029f;
import p348u2.AbstractC7030g;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p363v2.C7197a;
import p383w9.C7383a;
import p392x2.InterfaceC7491a;
import p406y0.AbstractC7656a;
import p419yd.C7706a;
import p421z0.C7729c;
import p421z0.C7734h;
import ye.InterfaceC7719m;

/* loaded from: classes.dex */
public final class WelcomeActivity extends AbstractActivityC2972a implements InterfaceC5606c {

    /* renamed from: F */
    private DialogC5423b f10612F;

    /* renamed from: G */
    private boolean f10613G;

    /* renamed from: I */
    public Map f10615I = new LinkedHashMap();

    /* renamed from: E */
    private long f10611E = 1000;

    /* renamed from: H */
    private final String f10614H = "WelcomeActivity";

    /* renamed from: com.interactive.brasiliptv.ui.activity.WelcomeActivity$a */
    /* loaded from: classes2.dex */
    public static final class C2836a implements C5076a.e {
        C2836a() {
        }

        @Override // p198k.C5076a.e
        /* renamed from: a */
        public void mo11400a(View view, int i10, ViewGroup viewGroup) {
            AbstractC5868k.m23674f(view, "view");
            if (WelcomeActivity.this.isFinishing()) {
                return;
            }
            WelcomeActivity.this.setContentView(view);
            WelcomeActivity.this.m11967F5();
        }
    }

    /* renamed from: com.interactive.brasiliptv.ui.activity.WelcomeActivity$b */
    /* loaded from: classes2.dex */
    public static final class C2837b implements InterfaceC7491a {
        C2837b() {
        }

        @Override // p392x2.InterfaceC7491a
        /* renamed from: a */
        public void mo11401a(long j10, long j11, String str, String str2, int i10, boolean z10) {
            AbstractC5868k.m23674f(str, "uri");
            AbstractC5868k.m23674f(str2, "domain");
            C7729c.m29846e(C7729c.f28423a, j10, SystemClock.elapsedRealtime(), str, str2, i10, C1466m0.f5627a.m6876l(), null, z10, 64, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.interactive.brasiliptv.ui.activity.WelcomeActivity$c */
    /* loaded from: classes2.dex */
    public static final class C2838c extends AbstractC5869l implements InterfaceC5660l {
        C2838c() {
            super(1);
        }

        /* renamed from: a */
        public final void m11402a(Boolean bool) {
            ((C5764q) WelcomeActivity.this.m11977r5()).m23212X4();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11402a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.interactive.brasiliptv.ui.activity.WelcomeActivity$d */
    /* loaded from: classes2.dex */
    public static final class C2839d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C2839d f10618a = new C2839d();

        C2839d() {
            super(1);
        }

        /* renamed from: a */
        public final void m11403a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11403a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.interactive.brasiliptv.ui.activity.WelcomeActivity$e */
    /* loaded from: classes2.dex */
    public static final class C2840e extends AbstractC5869l implements InterfaceC5660l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.interactive.brasiliptv.ui.activity.WelcomeActivity$e$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5642a {

            /* renamed from: a */
            final /* synthetic */ WelcomeActivity f10620a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WelcomeActivity welcomeActivity) {
                super(0);
                this.f10620a = welcomeActivity;
            }

            /* renamed from: a */
            public final void m11405a() {
                this.f10620a.f10613G = true;
            }

            @Override // me.InterfaceC5642a
            public /* bridge */ /* synthetic */ Object invoke() {
                m11405a();
                return C1328x.f4998a;
            }
        }

        C2840e() {
            super(1);
        }

        /* renamed from: a */
        public final void m11404a(Boolean bool) {
            AbstractC5868k.m23673e(bool, "granted");
            if (bool.booleanValue()) {
                WelcomeActivity.this.f10613G = false;
                DialogC5423b dialogC5423b = WelcomeActivity.this.f10612F;
                if (dialogC5423b != null) {
                    dialogC5423b.dismiss();
                }
                WelcomeActivity.this.m11366C6();
                return;
            }
            if (WelcomeActivity.this.f10612F != null) {
                DialogC5423b dialogC5423b2 = WelcomeActivity.this.f10612F;
                AbstractC5868k.m23671c(dialogC5423b2);
                if (dialogC5423b2.isShowing()) {
                    return;
                }
            }
            WelcomeActivity.this.f10612F = new DialogC5423b(WelcomeActivity.this.m11976o5(), new a(WelcomeActivity.this));
            DialogC5423b dialogC5423b3 = WelcomeActivity.this.f10612F;
            if (dialogC5423b3 != null) {
                dialogC5423b3.show();
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11404a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.interactive.brasiliptv.ui.activity.WelcomeActivity$f */
    /* loaded from: classes2.dex */
    public static final class C2841f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C2841f f10621a = new C2841f();

        C2841f() {
            super(1);
        }

        /* renamed from: a */
        public final void m11406a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11406a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: com.interactive.brasiliptv.ui.activity.WelcomeActivity$g */
    /* loaded from: classes2.dex */
    public static final class C2842g implements InterfaceC5898a {

        /* renamed from: b */
        final /* synthetic */ AdInfo f10623b;

        /* renamed from: com.interactive.brasiliptv.ui.activity.WelcomeActivity$g$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ WelcomeActivity f10624a;

            /* renamed from: b */
            final /* synthetic */ AdInfo f10625b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WelcomeActivity welcomeActivity, AdInfo adInfo) {
                super(1);
                this.f10624a = welcomeActivity;
                this.f10625b = adInfo;
            }

            /* renamed from: a */
            public final void m11409a(boolean z10) {
                C7383a c7383a = C7383a.f27389a;
                c7383a.m28497d("reportAdShowEvent");
                if (z10) {
                    C6160q.f24221a.m24600i(this.f10624a.m30049S4(), C1466m0.f5627a.m6888w(), C5714a.f22937a.m23093f(), this.f10625b);
                    c7383a.m28497d("lavLaunchAd");
                    ((LaunchAdView) this.f10624a.m11398r6(R$id.launchAd)).m7047g();
                    c7383a.m28496b("lavLaunchAd");
                } else {
                    ((C5764q) this.f10624a.m11977r5()).m23210O4();
                }
                c7383a.m28496b("reportAdShowEvent");
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m11409a(((Boolean) obj).booleanValue());
                return C1328x.f4998a;
            }
        }

        C2842g(AdInfo adInfo) {
            this.f10623b = adInfo;
        }

        @Override // p255o0.InterfaceC5898a
        /* renamed from: a */
        public void mo11407a() {
            InterfaceC5605b.a.m22775a((InterfaceC5605b) WelcomeActivity.this.m11977r5(), false, 1, null);
        }

        @Override // p255o0.InterfaceC5898a
        /* renamed from: b */
        public void mo11408b(ImageView imageView) {
            AbstractC5868k.m23674f(imageView, "view");
            C7383a c7383a = C7383a.f27389a;
            C7383a.m28494e(c7383a, null, 1, null);
            if (WelcomeActivity.this.isDestroyed()) {
                return;
            }
            C6156m c6156m = C6156m.f24180a;
            WelcomeActivity welcomeActivity = WelcomeActivity.this;
            String m23093f = C5714a.f22937a.m23093f();
            AdInfo adInfo = this.f10623b;
            C6156m.m24538k0(c6156m, welcomeActivity, imageView, m23093f, adInfo, null, new a(WelcomeActivity.this, adInfo), null, false, 0, 464, null);
            C7383a.m28493c(c7383a, null, 1, null);
        }

        @Override // p255o0.InterfaceC5898a
        public String getVersion() {
            String string = WelcomeActivity.this.getResources().getString(R.string.launch_version, "4.99.2");
            AbstractC5868k.m23673e(string, "resources.getString(R.st…BuildConfig.VERSION_NAME)");
            return string;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A6 */
    public static final void m11365A6(WelcomeActivity welcomeActivity) {
        AbstractC5868k.m23674f(welcomeActivity, "this$0");
        welcomeActivity.m11368F6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C6 */
    public final void m11366C6() {
        m11370H6();
    }

    /* renamed from: E6 */
    private final void m11367E6() {
        boolean z10;
        String m27728o;
        String m27728o2;
        String m27728o3;
        String m27728o4;
        List<String> m27748R;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        C2837b c2837b = new C2837b();
        String obj = AbstractC4926c.m20241h().first.toString();
        String obj2 = AbstractC4926c.m20241h().second.toString();
        String str = (String) C4982a.f20721a.m20333a(AbstractApplicationC6253c.f24484b.m24887a(), "key_dcs_all_url", "");
        boolean z16 = true;
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m27728o = AbstractC7166t.m27728o(str, obj, "", false, 4, null);
            m27728o2 = AbstractC7166t.m27728o(m27728o, obj2, "", false, 4, null);
            m27728o3 = AbstractC7166t.m27728o(m27728o2, "http://", "", false, 4, null);
            m27728o4 = AbstractC7166t.m27728o(m27728o3, "https://", "", false, 4, null);
            m27748R = AbstractC7167u.m27748R(m27728o4, new String[]{"|"}, false, 0, 6, null);
            if (m27748R != null && !m27748R.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                String str2 = "";
                String str3 = str2;
                for (String str4 : m27748R) {
                    if (str4.length() > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if (str2.length() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            str2 = str4;
                        } else {
                            if (str3.length() == 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                str3 = str4;
                            }
                        }
                    }
                }
                if (str2.length() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    obj = str2;
                }
                if (str3.length() <= 0) {
                    z16 = false;
                }
                if (z16) {
                    obj2 = str3;
                }
            }
            C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "key_dcs_all_url", "");
        }
        C7197a.f26917a.m27857n(AbstractApplicationC6253c.f24484b.m24887a(), new C1318n(obj, obj2), c2837b, new C1477w(".dcs"));
    }

    /* renamed from: F6 */
    private final void m11368F6() {
        C7383a c7383a = C7383a.f27389a;
        c7383a.m28497d("onAppStart");
        AbstractC4929f.m20255e(this);
        c7383a.m28496b("onAppStart");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G6 */
    public static final void m11369G6(WelcomeActivity welcomeActivity) {
        AbstractC5868k.m23674f(welcomeActivity, "this$0");
        welcomeActivity.m11367E6();
        welcomeActivity.m11395D6();
    }

    /* renamed from: H6 */
    private final void m11370H6() {
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: p7.f
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                WelcomeActivity.m11371I6(WelcomeActivity.this, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final C2838c c2838c = new C2838c();
        Consumer consumer = new Consumer() { // from class: p7.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WelcomeActivity.m11372J6(InterfaceC5660l.this, obj);
            }
        };
        final C2839d c2839d = C2839d.f10618a;
        compose.subscribe(consumer, new Consumer() { // from class: p7.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WelcomeActivity.m11373K6(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I6 */
    public static final void m11371I6(WelcomeActivity welcomeActivity, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(welcomeActivity, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        C1446c0.f5559a.m6737E(welcomeActivity.m30049S4());
        observableEmitter.onNext(Boolean.TRUE);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J6 */
    public static final void m11372J6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K6 */
    public static final void m11373K6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: L6 */
    private final void m11374L6() {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_AUDIO"};
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        }
        Observable m22472n = new C5543b(this).m22472n((String[]) Arrays.copyOf(strArr, strArr.length));
        final C2840e c2840e = new C2840e();
        Consumer consumer = new Consumer() { // from class: p7.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WelcomeActivity.m11375M6(InterfaceC5660l.this, obj);
            }
        };
        final C2841f c2841f = C2841f.f10621a;
        m22472n.subscribe(consumer, new Consumer() { // from class: p7.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WelcomeActivity.m11376N6(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M6 */
    public static final void m11375M6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N6 */
    public static final void m11376N6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O6 */
    public static final void m11377O6(WelcomeActivity welcomeActivity, String str) {
        AbstractC5868k.m23674f(welcomeActivity, "this$0");
        AbstractC5868k.m23674f(str, "$areaFlag");
        int i10 = R$id.mTextAreaFlag;
        ((TextView) welcomeActivity.m11398r6(i10)).setText(str);
        ((TextView) welcomeActivity.m11398r6(i10)).setVisibility(0);
    }

    @Override // p236m7.InterfaceC5606c
    /* renamed from: A2 */
    public void mo11392A2(AdInfo adInfo) {
        AbstractC5868k.m23674f(adInfo, "adInfo");
        if (isFinishing()) {
            return;
        }
        AbstractC7028e.m27117c("b");
        int i10 = R$id.launchAd;
        ((LaunchAdView) m11398r6(i10)).setVisibility(0);
        ((LaunchAdView) m11398r6(i10)).m7046f(new C2842g(adInfo));
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: B6, reason: merged with bridge method [inline-methods] */
    public C5764q mo7516s5() {
        return new C5764q(this, this);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: D5 */
    public boolean mo11394D5() {
        return false;
    }

    /* renamed from: D6 */
    public final void m11395D6() {
        String str;
        String str2;
        Object obj;
        Object obj2;
        Pair m20235b = AbstractC4926c.m20235b();
        if (m20235b == null || (obj2 = m20235b.first) == null || (str = obj2.toString()) == null) {
            str = AbstractC7656a.f28101g;
        }
        if (m20235b == null || (obj = m20235b.second) == null || (str2 = obj.toString()) == null) {
            str2 = AbstractC7656a.f28101g;
        }
        C7197a c7197a = C7197a.f26917a;
        AbstractC5868k.m23673e(str, "bbMainDomain");
        AbstractC5868k.m23673e(str2, "bbSecondDomain");
        DomainInfo m27845b = c7197a.m27845b(str, str2, "key_tdc");
        C7734h.b bVar = C7734h.f28449q;
        C7734h m29905a = bVar.m29905a();
        Context applicationContext = getApplicationContext();
        AbstractC5868k.m23673e(applicationContext, "applicationContext");
        Context applicationContext2 = getApplicationContext();
        AbstractC5868k.m23673e(applicationContext2, "applicationContext");
        C1476v c1476v = new C1476v(applicationContext2);
        Context applicationContext3 = getApplicationContext();
        AbstractC5868k.m23673e(applicationContext3, "applicationContext");
        C7734h.m29882l(m29905a, applicationContext, true, null, null, c1476v, new C1445c(applicationContext3), 12, null);
        bVar.m29905a().m29900u();
        C7734h m29905a2 = bVar.m29905a();
        String m20598h = AbstractC5085b.m20598h(getApplicationContext());
        AbstractC5868k.m23673e(m20598h, "getPackageName(applicationContext)");
        int m20602l = AbstractC5085b.m20602l(getApplicationContext());
        String m20601k = AbstractC5085b.m20601k();
        AbstractC5868k.m23673e(m20601k, "getSystemVersion()");
        String m20676h = AbstractC5093j.m20676h(getApplicationContext());
        AbstractC5868k.m23673e(m20676h, "getMacAddr(applicationContext)");
        String m20678j = AbstractC5093j.m20678j();
        AbstractC5868k.m23673e(m20678j, "getReserve1()");
        C7734h.m29870A(m29905a2, false, m27845b, m20598h, m20602l, m20601k, m20676h, m20678j, C1446c0.f5559a.m6748t(), "", C1466m0.f5627a.m6888w(), false, EventType.AUTH_FAIL, null);
    }

    @Override // p236m7.InterfaceC5606c
    /* renamed from: a3 */
    public void mo11396a3(C5752e c5752e) {
        AbstractC5868k.m23674f(c5752e, "config");
        if (c5752e.m23174c() && c5752e.m23173b() != null) {
            ((TraceRecycledImageView) m11398r6(R$id.mImgLoading)).setImageDrawable(c5752e.m23173b());
            this.f10611E = c5752e.m23172a();
            c5752e.m23173b().start();
        } else {
            ((TraceRecycledImageView) m11398r6(R$id.mImgLoading)).setVisibility(8);
            this.f10611E = 5000L;
        }
        ((C5764q) m11977r5()).m23213g4(this.f10611E);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: e4 */
    protected void mo11397e4() {
        m11971R5(mo7516s5());
        C1441a.f5552a.m6703a(this);
        new C5076a(m30049S4()).m20545a(R.layout.activity_welcome, null, new C2836a());
    }

    @InterfaceC7719m
    public final void enterHomeAct(EnterHomeAct enterHomeAct) {
        AbstractC5868k.m23674f(enterHomeAct, "event");
        ((C5764q) m11977r5()).m23213g4(this.f10611E - 1000);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        AbstractC7028e.m27117c("a");
        if (Build.VERSION.SDK_INT > 19) {
            AbstractC2843a.m11410a(this);
        }
        TextView textView = (TextView) m11398r6(R$id.mTextVersion);
        if (textView != null) {
            textView.setText(getResources().getString(R.string.version_format, "4.99.4"));
        }
        m11374L6();
        AbstractC7030g.m27129c("onAppStart", new Runnable() { // from class: p7.e
            @Override // java.lang.Runnable
            public final void run() {
                WelcomeActivity.m11365A6(WelcomeActivity.this);
            }
        }, false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        AbstractC7028e.m27115a("w");
        AbstractActivityC2972a.m11965k5(this, false, 1, null);
        finish();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p430z9.AbstractActivityC7763a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0511i, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC7030g.m27129c("Init domain", new Runnable() { // from class: p7.b
            @Override // java.lang.Runnable
            public final void run() {
                WelcomeActivity.m11369G6(WelcomeActivity.this);
            }
        }, false);
        C7383a c7383a = C7383a.f27389a;
        C7383a.m28494e(c7383a, null, 1, null);
        C7706a.m29774d().m29782i();
        super.onCreate(bundle);
        C7383a.m28493c(c7383a, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onResume() {
        C7383a c7383a = C7383a.f27389a;
        C7383a.m28494e(c7383a, null, 1, null);
        super.onResume();
        if (this.f10613G && (Build.VERSION.SDK_INT < 23 || AbstractC0547a.m2319a(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 || AbstractC0547a.m2319a(this, "android.permission.READ_MEDIA_AUDIO") == 0)) {
            m11374L6();
        }
        c7383a.m28496b("appLauncher");
        C7383a.m28493c(c7383a, null, 1, null);
    }

    /* renamed from: r6 */
    public View m11398r6(int i10) {
        Map map = this.f10615I;
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

    @Override // p236m7.InterfaceC5606c
    /* renamed from: z */
    public void mo11399z(final String str) {
        AbstractC5868k.m23674f(str, "areaFlag");
        runOnUiThread(new Runnable() { // from class: p7.i
            @Override // java.lang.Runnable
            public final void run() {
                WelcomeActivity.m11377O6(WelcomeActivity.this, str);
            }
        });
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R.layout.activity_welcome;
    }
}
