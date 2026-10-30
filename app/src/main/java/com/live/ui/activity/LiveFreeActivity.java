package com.live.ui.activity;

import android.view.KeyEvent;
import androidx.fragment.app.AbstractC0738x;
import androidx.lifecycle.AbstractC0749c;
import com.live.R$id;
import com.live.R$layout;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.AwakenVoiceAssistEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p040c8.C1407f;
import p115e8.InterfaceC4142a;
import p147g8.C4355a;
import p170i2.C4842a;
import p170i2.InterfaceC4844c;
import p223l8.C5442e1;
import p223l8.C5498s1;

/* loaded from: classes2.dex */
public final class LiveFreeActivity extends AbstractActivityC2972a implements InterfaceC4142a {

    /* renamed from: G */
    public Map f10829G = new LinkedHashMap();

    /* renamed from: E */
    private final String f10827E = "LiveFreeActivity";

    /* renamed from: F */
    private final C5498s1 f10828F = new C5498s1();

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: e6, reason: merged with bridge method [inline-methods] */
    public C4355a mo7516s5() {
        return new C4355a(this, this);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        AbstractC0738x m3534m = m3294d4().m3534m();
        AbstractC5868k.m23673e(m3534m, "supportFragmentManager.beginTransaction()");
        m3534m.m3645r(R$id.mFlLive, this.f10828F, "liveFrag").mo3228h();
        this.f10828F.m22263hb("FreeLive");
        C1407f c1407f = C1407f.f5458a;
        c1407f.m6502a0(C5442e1.f22119U0.m21969a());
        c1407f.m6501Z(c1407f.m6525q());
        InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
        if (m19921b != null) {
            AbstractC0749c mo953f6 = mo953f6();
            AbstractC5868k.m23673e(mo953f6, "lifecycle");
            m19921b.mo19984g(mo953f6);
        }
        this.f10828F.m22261fb(true);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        boolean onKeyDown = this.f10828F.onKeyDown(i10, keyEvent);
        if (!onKeyDown) {
            return super.onKeyDown(i10, keyEvent);
        }
        return onKeyDown;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        boolean m22252Ta = this.f10828F.m22252Ta(i10, keyEvent);
        if (m22252Ta) {
            return m22252Ta;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onResume() {
        C5498s1 c5498s1;
        super.onResume();
        C5498s1 c5498s12 = this.f10828F;
        boolean z10 = false;
        if (c5498s12 != null && c5498s12.m22249Qa()) {
            z10 = true;
        }
        if (!z10 && (c5498s1 = this.f10828F) != null) {
            c5498s1.m22255Ya(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.module.basemvp.AbstractActivityC2972a, p164hd.AbstractActivityC4816a, androidx.appcompat.app.AbstractActivityC0302c, androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onStop() {
        super.onStop();
        C5498s1 c5498s1 = this.f10828F;
        if (c5498s1 != null) {
            c5498s1.m22253Ua();
        }
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: t5 */
    public void mo11422t5(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "event");
        C5498s1 c5498s1 = this.f10828F;
        if (c5498s1 != null) {
            c5498s1.m22231Da(awakenVoiceAssistEvent);
        }
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_live;
    }
}
