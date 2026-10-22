package com.live.p064ui.activity;

import android.content.Intent;
import android.view.KeyEvent;
import androidx.fragment.app.AbstractC0738x;
import com.live.R$id;
import com.live.R$layout;
import com.module.basemvp.AbstractActivityC2972a;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p115e8.InterfaceC4145d;
import p115e8.InterfaceC4146e;
import p147g8.C4359c;
import p223l8.C5498s1;

/* loaded from: classes2.dex */
public final class LiveVoiceSearchActivity extends AbstractActivityC2972a implements InterfaceC4146e {

    /* renamed from: H */
    public static final C2853a f10850H = new C2853a(null);

    /* renamed from: G */
    public Map f10853G = new LinkedHashMap();

    /* renamed from: E */
    private final String f10851E = LiveVoiceSearchActivity.class.getSimpleName();

    /* renamed from: F */
    private final C5498s1 f10852F = new C5498s1();

    /* renamed from: com.live.ui.activity.LiveVoiceSearchActivity$a */
    /* loaded from: classes2.dex */
    public static final class C2853a {
        private C2853a() {
        }

        public /* synthetic */ C2853a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: e6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4145d mo7516s5() {
        return new C4359c(this, this);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((InterfaceC4145d) m11977r5()).mo17354w1();
        this.f10852F.m22263hb("VoiceLive");
        AbstractC0738x m3534m = m3294d4().m3534m();
        AbstractC5868k.m23673e(m3534m, "supportFragmentManager.beginTransaction()");
        m3534m.m3644q(R$id.mFlLive, this.f10852F).mo3228h();
        InterfaceC4145d interfaceC4145d = (InterfaceC4145d) m11977r5();
        String stringExtra = getIntent().getStringExtra("voice_channel_code");
        if (stringExtra == null) {
            stringExtra = "";
        }
        interfaceC4145d.mo17352c0(stringExtra);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        boolean onKeyDown = this.f10852F.onKeyDown(i10, keyEvent);
        if (!onKeyDown) {
            return super.onKeyDown(i10, keyEvent);
        }
        return onKeyDown;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        boolean m22252Ta = this.f10852F.m22252Ta(i10, keyEvent);
        if (m22252Ta) {
            return m22252Ta;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC5868k.m23674f(intent, "intent");
        super.onNewIntent(intent);
        InterfaceC4145d interfaceC4145d = (InterfaceC4145d) m11977r5();
        String stringExtra = intent.getStringExtra("voice_channel_code");
        if (stringExtra == null) {
            stringExtra = "";
        }
        interfaceC4145d.mo17352c0(stringExtra);
        ((InterfaceC4145d) m11977r5()).mo17353o1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onPause() {
        super.onPause();
        C5498s1 c5498s1 = this.f10852F;
        if (c5498s1 != null) {
            c5498s1.m22253Ua();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5498s1 c5498s1 = this.f10852F;
        if (c5498s1 != null) {
            C5498s1.m22192Za(c5498s1, false, 1, null);
        }
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_live;
    }
}
