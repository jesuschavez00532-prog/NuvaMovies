package com.download.activity;

import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.download.R$color;
import com.download.R$id;
import com.download.R$layout;
import com.download.activity.DownloadActivity;
import com.module.basemvp.AbstractActivityC2972a;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p154h3.AbstractC4512a;
import p154h3.C4513b;
import p154h3.C4515d;
import p171i3.InterfaceC4846a;
import p171i3.InterfaceC4847b;
import p202k3.C5097a;
import p258o3.C5911g;
import p348u2.AbstractC7026c;

/* loaded from: classes.dex */
public final class DownloadActivity extends AbstractActivityC2972a implements InterfaceC4847b {

    /* renamed from: F */
    private final InterfaceC1312h f6947F;

    /* renamed from: G */
    private final InterfaceC1312h f6948G;

    /* renamed from: H */
    private AbstractC4512a f6949H;

    /* renamed from: I */
    public Map f6950I = new LinkedHashMap();

    /* renamed from: E */
    private final String f6946E = DownloadActivity.class.getSimpleName();

    /* renamed from: com.download.activity.DownloadActivity$a */
    /* loaded from: classes.dex */
    static final class C1642a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C1642a f6951a = new C1642a();

        C1642a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4513b invoke() {
            return new C4513b();
        }
    }

    /* renamed from: com.download.activity.DownloadActivity$b */
    /* loaded from: classes.dex */
    static final class C1643b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C1643b f6952a = new C1643b();

        C1643b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4515d invoke() {
            return new C4515d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.download.activity.DownloadActivity$c */
    /* loaded from: classes.dex */
    public static final class C1644c extends AbstractC5869l implements InterfaceC5642a {
        C1644c() {
            super(0);
        }

        /* renamed from: a */
        public final void m7521a() {
            ((RadioButton) DownloadActivity.this.m7514h6(R$id.mRbDownloading)).requestFocus();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7521a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.download.activity.DownloadActivity$d */
    /* loaded from: classes.dex */
    public static final class C1645d extends AbstractC5869l implements InterfaceC5642a {
        C1645d() {
            super(0);
        }

        /* renamed from: a */
        public final void m7522a() {
            ((RadioButton) DownloadActivity.this.m7514h6(R$id.mRbComplete)).requestFocus();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m7522a();
            return C1328x.f4998a;
        }
    }

    public DownloadActivity() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        m5965b = AbstractC1314j.m5965b(C1643b.f6952a);
        this.f6947F = m5965b;
        m5965b2 = AbstractC1314j.m5965b(C1642a.f6951a);
        this.f6948G = m5965b2;
    }

    /* renamed from: i6 */
    private final C4513b m7507i6() {
        return (C4513b) this.f6948G.getValue();
    }

    /* renamed from: j6 */
    private final C4515d m7508j6() {
        return (C4515d) this.f6947F.getValue();
    }

    /* renamed from: p6 */
    private final void m7509p6() {
        ((RadioButton) m7514h6(R$id.mRbDownloading)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d3.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                DownloadActivity.m7510q6(DownloadActivity.this, view, z10);
            }
        });
        ((RadioButton) m7514h6(R$id.mRbComplete)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d3.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                DownloadActivity.m7511r6(DownloadActivity.this, view, z10);
            }
        });
        m7508j6().m18879I9(new C1644c());
        m7507i6().m18879I9(new C1645d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q6 */
    public static final void m7510q6(DownloadActivity downloadActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(downloadActivity, "this$0");
        if (z10) {
            ((RadioButton) downloadActivity.m7514h6(R$id.mRbDownloading)).setChecked(true);
            downloadActivity.m3294d4().m3534m().m3644q(((AutoFrameLayout) downloadActivity.m7514h6(R$id.mFlContainer)).getId(), downloadActivity.m7508j6()).mo3228h();
            downloadActivity.f6949H = downloadActivity.m7508j6();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6 */
    public static final void m7511r6(DownloadActivity downloadActivity, View view, boolean z10) {
        AbstractC5868k.m23674f(downloadActivity, "this$0");
        if (z10) {
            ((RadioButton) downloadActivity.m7514h6(R$id.mRbComplete)).setChecked(true);
            downloadActivity.m3294d4().m3534m().m3644q(((AutoFrameLayout) downloadActivity.m7514h6(R$id.mFlContainer)).getId(), downloadActivity.m7507i6()).mo3228h();
            downloadActivity.f6949H = downloadActivity.m7507i6();
        }
    }

    @Override // p171i3.InterfaceC4847b
    /* renamed from: H1 */
    public void mo7512H1() {
        if (AbstractC5868k.m23669a(this.f6949H, m7508j6())) {
            m7508j6().mo18896G();
        } else if (AbstractC5868k.m23669a(this.f6949H, m7507i6())) {
            m7507i6().mo18881G();
        }
        ((TextView) m7514h6(R$id.mTvDiskName)).setText("");
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((AutoRelativeLayout) m7514h6(R$id.mRootView)).setBackgroundDrawable(AbstractC7026c.m27111a(this, R$color.color_0b0b0b));
        m7509p6();
    }

    /* renamed from: h6 */
    public View m7514h6(int i10) {
        Map map = this.f6950I;
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

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: l6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4846a mo7516s5() {
        return new C5097a(this, this);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0302c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (!((RadioButton) m7514h6(R$id.mRbDownloading)).hasFocus() && !((RadioButton) m7514h6(R$id.mRbComplete)).hasFocus()) {
            AbstractC4512a abstractC4512a = this.f6949H;
            if (abstractC4512a != null) {
                z10 = abstractC4512a.onKeyDown(i10, keyEvent);
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        if (i10 != 4) {
            return false;
        }
        finish();
        return true;
    }

    @Override // p171i3.InterfaceC4847b
    /* renamed from: w1 */
    public void mo7517w1() {
        ((TextView) m7514h6(R$id.mTvDiskName)).setText(C5911g.f23514h.m23905a().m23894i(this));
        if (AbstractC5868k.m23669a(this.f6949H, m7508j6())) {
            m7508j6().m18899Q9();
        } else if (AbstractC5868k.m23669a(this.f6949H, m7507i6())) {
            m7507i6().m18884M9();
        }
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_download;
    }
}
