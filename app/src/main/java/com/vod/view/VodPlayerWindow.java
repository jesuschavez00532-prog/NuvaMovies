package com.vod.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0738x;
import com.module.bean.Album;
import com.module.event.AwakenVoiceAssistEvent;
import com.request.result.AssetData;
import com.umeng.analytics.pro.C3384f;
import com.vod.R$drawable;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p153h2.AbstractC4509b;
import p258o3.C5909e;
import p358ud.C7121n1;
import p433zd.AbstractC7786b;

/* loaded from: classes3.dex */
public final class VodPlayerWindow extends AutoFrameLayout {

    /* renamed from: a */
    private final String f17533a;

    /* renamed from: b */
    private boolean f17534b;

    /* renamed from: c */
    private C7121n1 f17535c;

    /* renamed from: d */
    private InterfaceC5660l f17536d;

    /* renamed from: e */
    public Map f17537e = new LinkedHashMap();

    public VodPlayerWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17533a = VodPlayerWindow.class.getSimpleName();
        setBackgroundResource(R$drawable.sel_player_window);
        m16728i();
        this.f17535c = new C7121n1();
    }

    /* renamed from: i */
    private final void m16728i() {
    }

    /* renamed from: a */
    public final void m16729a() {
        AbstractC4509b.m18869b(this.f17533a, "exitFullScreen", new Object[0]);
        if (this.f17534b && this.f17535c.m3190s7()) {
            this.f17534b = false;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC7786b.m30166j(765), AbstractC7786b.m30163g(430));
            layoutParams.gravity = 5;
            layoutParams.rightMargin = AbstractC7786b.m30166j(80);
            layoutParams.topMargin = AbstractC7786b.m30163g(50);
            setLayoutParams(layoutParams);
            this.f17535c.m27558l6(false);
            InterfaceC5660l interfaceC5660l = this.f17536d;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Boolean.FALSE);
            }
            C5909e.a aVar = C5909e.f23504f;
            Context context = getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            aVar.m23878a(context).m23874i();
        }
    }

    /* renamed from: c */
    public final void m16730c(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "event");
        this.f17535c.m27556jc(awakenVoiceAssistEvent);
    }

    /* renamed from: g */
    public final void m16731g(String str, int i10, String str2, String str3, int i11, boolean z10, boolean z11, String str4, String str5, boolean z12, int i12, int i13) {
        AbstractC0738x m3645r;
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "playType");
        AbstractC5868k.m23674f(str4, "umengEventKey");
        AbstractC5868k.m23674f(str5, "umengEventCategory");
        if (!this.f17535c.m3190s7()) {
            Context context = getContext();
            AbstractC5868k.m23672d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC0738x m3534m = ((AbstractActivityC0712e) context).m3294d4().m3534m();
            if (m3534m != null && (m3645r = m3534m.m3645r(getId(), this.f17535c, "playerFragment")) != null) {
                m3645r.mo3230j();
            }
        }
        this.f17535c.m27548Zc(str, i10, str2, str3, i11, z10, z11, str4, str5, z12, i12, i13);
    }

    public final int getPlayIndex() {
        return this.f17535c.m27547Zb();
    }

    public final boolean getQualityEmpty() {
        return this.f17535c.m27551bc();
    }

    /* renamed from: j */
    public final boolean m16732j() {
        return this.f17534b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (r4.f17535c.m27539Lb() != false) goto L8;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m16733k(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            ne.AbstractC5868k.m23674f(r6, r0)
            int r0 = r6.getAction()
            r1 = 0
            if (r0 != 0) goto L6a
            java.lang.String r0 = r4.f17533a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dispatchKeyEvent keyCode: "
            r2.append(r3)
            int r3 = r6.getKeyCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            p153h2.AbstractC4509b.m18869b(r0, r2, r3)
            boolean r0 = r4.f17534b
            if (r0 == 0) goto L3a
            ud.n1 r0 = r4.f17535c
            boolean r6 = r0.onKeyDown(r5, r6)
            ud.n1 r0 = r4.f17535c
            boolean r0 = r0.m27539Lb()
            if (r0 == 0) goto L3b
        L3a:
            r6 = 0
        L3b:
            if (r6 != 0) goto L6a
            r6 = 4
            if (r5 == r6) goto L62
            r6 = 23
            if (r5 == r6) goto L54
            r6 = 66
            if (r5 == r6) goto L54
            r6 = 82
            if (r5 == r6) goto L4d
            goto L6a
        L4d:
            ud.n1 r5 = r4.f17535c
            boolean r1 = r5.m27540Ld()
            goto L6a
        L54:
            boolean r5 = r4.f17534b
            if (r5 != 0) goto L6a
            boolean r5 = r4.hasFocus()
            if (r5 == 0) goto L6a
            r4.m16737o()
            goto L6a
        L62:
            boolean r5 = r4.f17534b
            if (r5 == 0) goto L6a
            r4.m16729a()
            r1 = 1
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vod.view.VodPlayerWindow.m16733k(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: l */
    public final void m16734l(int i10) {
        if (this.f17535c.m3079D7()) {
            C7121n1.m27355Dc(this.f17535c, i10, false, 2, null);
        }
    }

    /* renamed from: m */
    public final void m16735m() {
        if (this.f17535c.m3190s7()) {
            this.f17535c.m27542Nc();
        }
    }

    /* renamed from: n */
    public final void m16736n() {
        if (this.f17535c.m3190s7()) {
            C7121n1.m27412Qc(this.f17535c, false, 1, null);
        }
    }

    /* renamed from: o */
    public final void m16737o() {
        if (!this.f17534b && this.f17535c.m3190s7()) {
            this.f17534b = true;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0;
            setLayoutParams(layoutParams);
            requestFocus();
            this.f17535c.m27558l6(true);
            InterfaceC5660l interfaceC5660l = this.f17536d;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Boolean.TRUE);
            }
            C5909e.a aVar = C5909e.f23504f;
            Context context = getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            aVar.m23878a(context).m23872g();
        }
    }

    /* renamed from: p */
    public final void m16738p(AssetData assetData, boolean z10) {
        AbstractC5868k.m23674f(assetData, "detailData");
        this.f17535c.m27550ad(assetData, z10);
    }

    /* renamed from: q */
    public final boolean m16739q() {
        return this.f17535c.m27536Ad();
    }

    /* renamed from: r */
    public final boolean m16740r() {
        return this.f17535c.m27562wd();
    }

    /* renamed from: s */
    public final void m16741s() {
        if (this.f17535c.m3190s7()) {
            this.f17535c.m27538Jd();
        }
    }

    public final void setFullScreenListener(InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "listener");
        this.f17536d = interfaceC5660l;
    }

    public final void setHistoryAlbum(Album album) {
        AbstractC5868k.m23674f(album, "album");
        this.f17535c.m27546Yc(album);
    }

    public final void setPlayEntrance(String str) {
        AbstractC5868k.m23674f(str, "playEntrance");
        this.f17535c.m27552bd(str);
    }
}
