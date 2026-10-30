package com.live.ui.activity;

import android.view.KeyEvent;
import androidx.fragment.app.AbstractC0738x;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.C1441a;
import com.live.R$id;
import com.live.R$layout;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.AwakenVoiceAssistEvent;
import com.module.event.FinishVoiceLiveEvent;
import com.request.result.ActiveResult;
import com.request.result.LoginResult;
import com.request.result.PosterList;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.AnalyticsConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1499k;
import p115e8.InterfaceC4143b;
import p115e8.InterfaceC4144c;
import p147g8.C4357b;
import p223l8.C5498s1;
import p302qc.C6448c;
import p400xa.C7575i;
import p400xa.C7594o0;
import ye.InterfaceC7719m;
import za.C7776f;

/* loaded from: classes.dex */
public final class LiveNewVoiceSearchActivity extends AbstractActivityC2972a implements InterfaceC4144c {

    /* renamed from: M */
    public static final C2846a f10830M = new C2846a(null);

    /* renamed from: N */
    private static final String f10831N = "channelCode";

    /* renamed from: O */
    private static final String f10832O = "channelName";

    /* renamed from: V */
    private static final String f10833V = "channelNumber";

    /* renamed from: W */
    private static final String f10834W = "channelPoster";

    /* renamed from: X */
    private static final String f10835X = "isFromOutSide";

    /* renamed from: G */
    private final InterfaceC1312h f10838G;

    /* renamed from: H */
    private final InterfaceC1312h f10839H;

    /* renamed from: I */
    private final InterfaceC1312h f10840I;

    /* renamed from: J */
    private final InterfaceC1312h f10841J;

    /* renamed from: K */
    private final InterfaceC1312h f10842K;

    /* renamed from: L */
    public Map f10843L = new LinkedHashMap();

    /* renamed from: E */
    private final String f10836E = LiveNewVoiceSearchActivity.class.getSimpleName();

    /* renamed from: F */
    private final C5498s1 f10837F = new C5498s1();

    /* renamed from: com.live.ui.activity.LiveNewVoiceSearchActivity$a */
    /* loaded from: classes2.dex */
    public static final class C2846a {
        private C2846a() {
        }

        public /* synthetic */ C2846a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final String m11435a() {
            return LiveNewVoiceSearchActivity.f10831N;
        }

        /* renamed from: b */
        public final String m11436b() {
            return LiveNewVoiceSearchActivity.f10832O;
        }

        /* renamed from: c */
        public final String m11437c() {
            return LiveNewVoiceSearchActivity.f10833V;
        }

        /* renamed from: d */
        public final String m11438d() {
            return LiveNewVoiceSearchActivity.f10834W;
        }

        /* renamed from: e */
        public final String m11439e() {
            return LiveNewVoiceSearchActivity.f10835X;
        }
    }

    /* renamed from: com.live.ui.activity.LiveNewVoiceSearchActivity$b */
    /* loaded from: classes2.dex */
    static final class C2847b extends AbstractC5869l implements InterfaceC5642a {
        C2847b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String stringExtra = LiveNewVoiceSearchActivity.this.getIntent().getStringExtra(LiveNewVoiceSearchActivity.f10830M.m11435a());
            if (stringExtra == null) {
                return "";
            }
            return stringExtra;
        }
    }

    /* renamed from: com.live.ui.activity.LiveNewVoiceSearchActivity$c */
    /* loaded from: classes2.dex */
    static final class C2848c extends AbstractC5869l implements InterfaceC5642a {
        C2848c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String stringExtra = LiveNewVoiceSearchActivity.this.getIntent().getStringExtra(LiveNewVoiceSearchActivity.f10830M.m11436b());
            if (stringExtra == null) {
                return "";
            }
            return stringExtra;
        }
    }

    /* renamed from: com.live.ui.activity.LiveNewVoiceSearchActivity$d */
    /* loaded from: classes2.dex */
    static final class C2849d extends AbstractC5869l implements InterfaceC5642a {
        C2849d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(LiveNewVoiceSearchActivity.this.getIntent().getIntExtra(LiveNewVoiceSearchActivity.f10830M.m11437c(), -1));
        }
    }

    /* renamed from: com.live.ui.activity.LiveNewVoiceSearchActivity$e */
    /* loaded from: classes2.dex */
    public static final class C2850e implements C7776f.a {
        C2850e() {
        }

        @Override // za.C7776f.a
        /* renamed from: a */
        public void mo11443a(boolean z10, String str, ActiveResult activeResult, LoginResult loginResult, String str2, String str3) {
            AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
            AbstractC5868k.m23674f(str2, "uri");
            AbstractC5868k.m23674f(str3, "accountType");
            if (z10) {
                ((InterfaceC4143b) LiveNewVoiceSearchActivity.this.m11977r5()).mo17351M1();
            }
        }
    }

    /* renamed from: com.live.ui.activity.LiveNewVoiceSearchActivity$f */
    /* loaded from: classes2.dex */
    static final class C2851f extends AbstractC5869l implements InterfaceC5642a {
        C2851f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(LiveNewVoiceSearchActivity.this.getIntent().getBooleanExtra(LiveNewVoiceSearchActivity.f10830M.m11439e(), false));
        }
    }

    /* renamed from: com.live.ui.activity.LiveNewVoiceSearchActivity$g */
    /* loaded from: classes2.dex */
    static final class C2852g extends AbstractC5869l implements InterfaceC5642a {
        C2852g() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List m6983b;
            String mo11434u2 = LiveNewVoiceSearchActivity.this.mo11434u2();
            String m29227b = C7594o0.a.Icon.m29227b();
            String stringExtra = LiveNewVoiceSearchActivity.this.getIntent().getStringExtra(LiveNewVoiceSearchActivity.f10830M.m11438d());
            if (stringExtra == null) {
                stringExtra = "";
            }
            m6983b = AbstractC1499k.m6983b(new PosterList("", mo11434u2, m29227b, stringExtra, ""));
            return m6983b;
        }
    }

    public LiveNewVoiceSearchActivity() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        InterfaceC1312h m5965b5;
        m5965b = AbstractC1314j.m5965b(new C2847b());
        this.f10838G = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new C2848c());
        this.f10839H = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new C2849d());
        this.f10840I = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(new C2852g());
        this.f10841J = m5965b4;
        m5965b5 = AbstractC1314j.m5965b(new C2851f());
        this.f10842K = m5965b5;
    }

    @Override // p115e8.InterfaceC4144c
    /* renamed from: C3 */
    public String mo11428C3() {
        return (String) this.f10839H.getValue();
    }

    @Override // p115e8.InterfaceC4144c
    /* renamed from: G0 */
    public int mo11429G0() {
        return ((Number) this.f10840I.getValue()).intValue();
    }

    @Override // p115e8.InterfaceC4144c
    /* renamed from: K2 */
    public List mo11430K2() {
        return (List) this.f10841J.getValue();
    }

    @Override // p115e8.InterfaceC4144c
    /* renamed from: M2 */
    public void mo11431M2(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        AbstractActivityC2972a.m11957W5(this, str, false, null, null, null, null, null, 126, null);
    }

    @InterfaceC7719m
    public final void finishVioceMsg(FinishVoiceLiveEvent finishVoiceLiveEvent) {
        AbstractC5868k.m23674f(finishVoiceLiveEvent, "finishEvent");
        finish();
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        this.f10837F.m22263hb("NewVoiceLive");
        if (m11433p6()) {
            this.f10837F.m22266kb("voice/search/app/live");
        } else {
            this.f10837F.m22266kb("voice/search/live");
        }
        this.f10837F.m22261fb(true);
        long longExtra = getIntent().getLongExtra(AnalyticsConfig.RTD_START_TIME, -1L);
        int intExtra = getIntent().getIntExtra("itemPosition", -1);
        String stringExtra = getIntent().getStringExtra("searchWord");
        if (stringExtra != null) {
            C7575i.f27835a.m29068d(stringExtra, mo11428C3(), intExtra, this.f10837F.m22230Ba(), longExtra);
        }
        AbstractC0738x m3534m = m3294d4().m3534m();
        AbstractC5868k.m23673e(m3534m, "supportFragmentManager.beginTransaction()");
        m3534m.m3644q(R$id.mFlLive, this.f10837F).mo3228h();
        C7776f.f28648a.m30102r(new C2850e());
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: l6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4143b mo7516s5() {
        return new C4357b(this, this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (C1441a.f5552a.m6705c().size() == 1) {
            C6448c.m25240q(C5634i.m22843d("http://module_main/HomeActivity").m25255u("formPageKey", 3).m25254t(67108864), this, null, 2, null);
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        boolean onKeyDown = this.f10837F.onKeyDown(i10, keyEvent);
        if (!onKeyDown) {
            return super.onKeyDown(i10, keyEvent);
        }
        return onKeyDown;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        boolean m22252Ta = this.f10837F.m22252Ta(i10, keyEvent);
        if (m22252Ta) {
            return m22252Ta;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onPause() {
        super.onPause();
        C5498s1 c5498s1 = this.f10837F;
        if (c5498s1 != null) {
            c5498s1.m22253Ua();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5498s1 c5498s1 = this.f10837F;
        if (c5498s1 != null) {
            c5498s1.m22255Ya(true);
        }
    }

    /* renamed from: p6 */
    public boolean m11433p6() {
        return ((Boolean) this.f10842K.getValue()).booleanValue();
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: t5 */
    public void mo11422t5(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "event");
        C5498s1 c5498s1 = this.f10837F;
        if (c5498s1 != null) {
            c5498s1.m22231Da(awakenVoiceAssistEvent);
        }
    }

    @Override // p115e8.InterfaceC4144c
    /* renamed from: u2 */
    public String mo11434u2() {
        return (String) this.f10838G.getValue();
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_live_new_voice_search;
    }
}
