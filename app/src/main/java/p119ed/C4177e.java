package p119ed;

import ad.C0231c;
import ad.C0232d;
import ad.C0233e;
import ad.InterfaceC0229a;
import ad.InterfaceC0230b;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import bd.C1304k;
import bd.InterfaceC1294a;
import cd.InterfaceC1481a;
import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.Progress;
import com.titan.ranger.Status;
import com.titan.ranger.bean.Program;
import com.titans.bean.AudioTrack;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import com.umeng.ccg.C3417a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;
import p104dd.C4094b;
import p357uc.C7074a;
import p357uc.C7075b;
import p357uc.C7076c;
import p357uc.C7077d;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p386wc.InterfaceC7392a;
import p386wc.InterfaceC7393b;
import p418yc.C7705h;
import vc.EnumC7254b;

/* renamed from: ed.e */
/* loaded from: classes3.dex */
public class C4177e extends FrameLayout implements InterfaceC7392a, InterfaceC7393b {

    /* renamed from: a */
    private final String f18281a;

    /* renamed from: b */
    private int f18282b;

    /* renamed from: c */
    private InterfaceC0229a f18283c;

    /* renamed from: d */
    private InterfaceC0230b f18284d;

    /* renamed from: e */
    private InterfaceC1294a f18285e;

    /* renamed from: f */
    private boolean f18286f;

    /* renamed from: g */
    private boolean f18287g;

    /* renamed from: h */
    private Boolean f18288h;

    /* renamed from: i */
    private String f18289i;

    /* renamed from: j */
    public Map f18290j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4177e(Context context) {
        super(context);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f18290j = new LinkedHashMap();
        this.f18281a = "TitanVideoView";
        this.f18289i = "";
        m17472q();
    }

    /* renamed from: n */
    private final InterfaceC0230b m17466n() {
        return new C0233e();
    }

    /* renamed from: o */
    private final InterfaceC0229a m17467o() {
        C0231c c0231c = new C0231c();
        c0231c.mo803f(this.f18282b);
        return c0231c;
    }

    /* renamed from: z */
    public static /* synthetic */ void m17468z(C4177e c4177e, EnumC7254b enumC7254b, Integer num, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            c4177e.m17479y(enumC7254b, num, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPlayerType");
    }

    /* renamed from: A */
    public void mo17463A(Program program, String str, String str2) {
        String mo805b;
        AbstractC5868k.m23674f(program, "program");
        AbstractC5868k.m23674f(str, "programCode");
        AbstractC5868k.m23674f(str2, "extra");
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null && (mo805b = interfaceC0230b.mo805b()) != null) {
            C7705h.f28256m.m29771a().m29756H(this.f18282b, mo805b);
            InterfaceC0230b interfaceC0230b2 = this.f18284d;
            if (interfaceC0230b2 != null) {
                interfaceC0230b2.mo808e();
            }
        }
        m17470m(program.getBuss(), str);
        InterfaceC0230b interfaceC0230b3 = this.f18284d;
        if (interfaceC0230b3 != null) {
            AbstractC5868k.m23671c(interfaceC0230b3);
            interfaceC0230b3.mo806c(program);
            InterfaceC0230b interfaceC0230b4 = this.f18284d;
            AbstractC5868k.m23671c(interfaceC0230b4);
            interfaceC0230b4.mo807d(str);
        }
        InterfaceC0229a interfaceC0229a = this.f18283c;
        if (interfaceC0229a != null) {
            Context context = getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            interfaceC0229a.mo798a(context, C0232d.f631a.m819a());
        }
        this.f18286f = false;
        Log.i(this.f18281a, "prepareProgram");
        C7705h.f28256m.m29771a().m29766x(this.f18282b, str, program, str2);
    }

    /* renamed from: B */
    public final void m17469B() {
        String mo805b;
        this.f18286f = false;
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null && (mo805b = interfaceC0230b.mo805b()) != null) {
            C7705h.f28256m.m29771a().m29756H(this.f18282b, mo805b);
        }
        InterfaceC0230b interfaceC0230b2 = this.f18284d;
        if (interfaceC0230b2 != null) {
            interfaceC0230b2.mo808e();
        }
        if (AbstractC5868k.m23669a(this.f18288h, Boolean.TRUE)) {
            this.f18288h = Boolean.FALSE;
        }
    }

    @Override // p386wc.InterfaceC7393b
    /* renamed from: a */
    public void mo5954a(int i10, String str, Status status, long j10) {
        String str2;
        InterfaceC1294a interfaceC1294a;
        InterfaceC1294a interfaceC1294a2;
        InterfaceC1294a interfaceC1294a3;
        InterfaceC1294a interfaceC1294a4;
        AbstractC5868k.m23674f(str, "event");
        AbstractC5868k.m23674f(status, Progress.STATUS);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        Program program = null;
        if (interfaceC0230b != null) {
            str2 = interfaceC0230b.mo805b();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            InterfaceC0230b interfaceC0230b2 = this.f18284d;
            if (interfaceC0230b2 != null) {
                program = interfaceC0230b2.mo804a();
            }
            if (program == null) {
                return;
            }
        }
        switch (str.hashCode()) {
            case -1689439142:
                str.equals("license_expiring");
                return;
            case -843230256:
                if (str.equals("cast_prepare_error") && (interfaceC1294a = this.f18285e) != null) {
                    interfaceC1294a.mo5899P5(j10);
                    return;
                }
                return;
            case 730889939:
                if (str.equals("auth_expiring") && (interfaceC1294a2 = this.f18285e) != null) {
                    interfaceC1294a2.mo5897O5();
                    return;
                }
                return;
            case 1601094581:
                if (str.equals("media_prepare_error") && (interfaceC1294a3 = this.f18285e) != null) {
                    interfaceC1294a3.mo5901S1();
                    return;
                }
                return;
            case 1948221757:
                if (str.equals("cast_prepared") && (interfaceC1294a4 = this.f18285e) != null) {
                    interfaceC1294a4.mo5906X2(status);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p386wc.InterfaceC7393b
    /* renamed from: b */
    public void mo5955b(int i10, String str, Object obj, String str2) {
        AbstractC5868k.m23674f(str, "event");
        AbstractC5868k.m23674f(obj, "data");
        AbstractC5868k.m23674f(str2, "app_ctx");
    }

    @Override // p386wc.InterfaceC7392a
    /* renamed from: c */
    public void mo5944c(int i10, String str) {
        String str2;
        InterfaceC1294a interfaceC1294a;
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null) {
            str2 = interfaceC0230b.mo805b();
        } else {
            str2 = null;
        }
        if (AbstractC5868k.m23669a(str, str2) && (interfaceC1294a = this.f18285e) != null) {
            interfaceC1294a.mo5896L1();
        }
    }

    @Override // p386wc.InterfaceC7392a
    /* renamed from: d */
    public C7077d mo5945d(C7076c c7076c, String str) {
        String str2;
        InterfaceC1294a interfaceC1294a;
        AbstractC5868k.m23674f(c7076c, "playStatus");
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null) {
            str2 = interfaceC0230b.mo805b();
        } else {
            str2 = null;
        }
        if (!AbstractC5868k.m23669a(str, str2) || (interfaceC1294a = this.f18285e) == null) {
            return null;
        }
        return interfaceC1294a.mo5907Y5(getAudioTracks());
    }

    /* renamed from: e */
    public void mo5946e(int i10, String str, String str2) {
        String str3;
        InterfaceC1294a interfaceC1294a;
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null) {
            str3 = interfaceC0230b.mo805b();
        } else {
            str3 = null;
        }
        if (!AbstractC5868k.m23669a(str2, str3)) {
            return;
        }
        if (AbstractC5868k.m23669a(str, "media")) {
            InterfaceC1294a interfaceC1294a2 = this.f18285e;
            if (interfaceC1294a2 != null) {
                interfaceC1294a2.mo5917z2();
                return;
            }
            return;
        }
        if (AbstractC5868k.m23669a(str, C3325bt.f14185aC) && (interfaceC1294a = this.f18285e) != null) {
            interfaceC1294a.mo5910m2();
        }
    }

    /* renamed from: f */
    public void mo5947f(int i10, long j10, String str) {
        String str2;
        InterfaceC1294a interfaceC1294a;
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null) {
            str2 = interfaceC0230b.mo805b();
        } else {
            str2 = null;
        }
        if (AbstractC5868k.m23669a(str, str2) && m17473r() && !this.f18287g && (interfaceC1294a = this.f18285e) != null) {
            interfaceC1294a.mo5898P3(j10);
        }
    }

    @Override // p386wc.InterfaceC7392a
    /* renamed from: g */
    public void mo5948g(int i10, String str, String str2, int i11, String str3) {
        String str4;
        AbstractC5868k.m23674f(str, "obj");
        AbstractC5868k.m23674f(str2, C3417a.f15001w);
        AbstractC5868k.m23674f(str3, SerializableCookie.NAME);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null) {
            str4 = interfaceC0230b.mo805b();
        } else {
            str4 = null;
        }
        if (!AbstractC5868k.m23669a(str3, str4)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1123989362) {
            boolean z10 = true;
            if (hashCode != 61512610) {
                if (hashCode == 96784904 && str.equals("error")) {
                    if (AbstractC5868k.m23669a(str2, "show")) {
                        if (i11 == 13) {
                            InterfaceC1294a interfaceC1294a = this.f18285e;
                            if (interfaceC1294a == null || !interfaceC1294a.mo5909i1()) {
                                z10 = false;
                            }
                            if (z10) {
                                return;
                            }
                        }
                        InterfaceC1294a interfaceC1294a2 = this.f18285e;
                        if (interfaceC1294a2 != null) {
                            interfaceC1294a2.mo5900R1(i11);
                            return;
                        }
                        return;
                    }
                    InterfaceC1294a interfaceC1294a3 = this.f18285e;
                    if (interfaceC1294a3 != null) {
                        interfaceC1294a3.mo5895K0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.equals("buffering")) {
                if (AbstractC5868k.m23669a(str2, "show")) {
                    this.f18287g = true;
                    InterfaceC1294a interfaceC1294a4 = this.f18285e;
                    if (interfaceC1294a4 != null) {
                        interfaceC1294a4.mo5912r4();
                        return;
                    }
                    return;
                }
                this.f18287g = false;
                InterfaceC1294a interfaceC1294a5 = this.f18285e;
                if (interfaceC1294a5 != null) {
                    interfaceC1294a5.mo5911q4();
                    return;
                }
                return;
            }
            return;
        }
        if (str.equals("probe_net")) {
            if (AbstractC5868k.m23669a(str2, "show")) {
                InterfaceC1294a interfaceC1294a6 = this.f18285e;
                if (interfaceC1294a6 != null) {
                    interfaceC1294a6.mo5915w6();
                    return;
                }
                return;
            }
            InterfaceC1294a interfaceC1294a7 = this.f18285e;
            if (interfaceC1294a7 != null) {
                interfaceC1294a7.mo5916x2();
            }
        }
    }

    public final List<AudioTrack> getAudioTracks() {
        ArrayList<C7075b> arrayList;
        boolean z10;
        C7076c m29760p = C7705h.f28256m.m29771a().m29760p(this.f18282b);
        if (m29760p != null) {
            arrayList = m29760p.m27266f();
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (C7075b c7075b : arrayList) {
                if (AbstractC5868k.m23669a(c7075b.m27251d(), "audio")) {
                    arrayList2.add(new AudioTrack(c7075b.m27249b(), c7075b.m27250c()));
                }
            }
        }
        return arrayList2;
    }

    public final long getCurrentProgress() {
        return C7705h.f28256m.m29771a().m29759o(this.f18282b);
    }

    public final long getDuration() {
        C7076c m29760p = C7705h.f28256m.m29771a().m29760p(this.f18282b);
        if (m29760p != null) {
            return m29760p.m27263c();
        }
        return 0L;
    }

    public final InterfaceC0229a getMPlayer() {
        return this.f18283c;
    }

    public final C7076c getPlayStatus() {
        return C7705h.f28256m.m29771a().m29760p(this.f18282b);
    }

    public final InterfaceC0230b getTitanContext() {
        return this.f18284d;
    }

    @Override // p386wc.InterfaceC7392a
    /* renamed from: h */
    public void mo5949h(int i10, long j10, String str) {
        String str2;
        InterfaceC1294a interfaceC1294a;
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null) {
            str2 = interfaceC0230b.mo805b();
        } else {
            str2 = null;
        }
        if (AbstractC5868k.m23669a(str, str2) && (interfaceC1294a = this.f18285e) != null) {
            interfaceC1294a.mo5903V0(j10);
        }
    }

    @Override // p386wc.InterfaceC7392a
    /* renamed from: i */
    public void mo5950i(boolean z10, Bitmap bitmap, String str) {
        String str2;
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null) {
            str2 = interfaceC0230b.mo805b();
        } else {
            str2 = null;
        }
        if (!AbstractC5868k.m23669a(str, str2)) {
            return;
        }
        if (z10 && bitmap != null) {
            InterfaceC1294a interfaceC1294a = this.f18285e;
            if (interfaceC1294a != null) {
                interfaceC1294a.mo5905W1(bitmap);
                return;
            }
            return;
        }
        InterfaceC1294a interfaceC1294a2 = this.f18285e;
        if (interfaceC1294a2 != null) {
            interfaceC1294a2.mo5914u1();
        }
    }

    @Override // p386wc.InterfaceC7392a
    /* renamed from: j */
    public void mo5951j(int i10, int i11, String str, String str2) {
        String str3;
        String str4;
        AbstractC5868k.m23674f(str, "player");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null) {
            str3 = interfaceC0230b.mo805b();
        } else {
            str3 = null;
        }
        if (!AbstractC5868k.m23669a(str2, str3)) {
            return;
        }
        switch (i11) {
            case 1101:
            case 1102:
            case 1103:
                if (C0232d.f631a.m822d() && this.f18288h == null && !AbstractC5868k.m23669a(this.f18289i, str2)) {
                    EnumC7254b enumC7254b = EnumC7254b.IJK;
                    if (AbstractC5868k.m23669a(str, enumC7254b.m28086a())) {
                        enumC7254b = EnumC7254b.NATIVE;
                    }
                    this.f18289i = str2;
                    m17468z(this, enumC7254b, Integer.valueOf(i11), false, 4, null);
                    C4094b c4094b = C4094b.f17998a;
                    C7076c playStatus = getPlayStatus();
                    if (playStatus == null || (str4 = playStatus.m27262b()) == null) {
                        str4 = "";
                    }
                    c4094b.m17149l(str4, str2, enumC7254b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p386wc.InterfaceC7392a
    /* renamed from: k */
    public void mo5952k(boolean z10, String str) {
        String str2;
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null) {
            str2 = interfaceC0230b.mo805b();
        } else {
            str2 = null;
        }
        if (!AbstractC5868k.m23669a(str, str2)) {
            return;
        }
        if (z10) {
            InterfaceC1294a interfaceC1294a = this.f18285e;
            if (interfaceC1294a != null) {
                interfaceC1294a.mo5908f3();
                return;
            }
            return;
        }
        InterfaceC1294a interfaceC1294a2 = this.f18285e;
        if (interfaceC1294a2 != null) {
            interfaceC1294a2.mo5894C4();
        }
    }

    /* renamed from: l */
    public void mo5953l(int i10, int i11, int i12, String str, String str2) {
        String str3;
        InterfaceC1294a interfaceC1294a;
        String str4;
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null) {
            str3 = interfaceC0230b.mo805b();
        } else {
            str3 = null;
        }
        if (!AbstractC5868k.m23669a(str2, str3)) {
            return;
        }
        InterfaceC0229a interfaceC0229a = this.f18283c;
        if (interfaceC0229a != null) {
            interfaceC0229a.mo802e(i11, i12);
        }
        if (AbstractC5868k.m23669a(str, "media")) {
            this.f18286f = true;
            InterfaceC1294a interfaceC1294a2 = this.f18285e;
            if (interfaceC1294a2 != null) {
                interfaceC1294a2.mo5902U();
            }
            if (AbstractC5868k.m23669a(this.f18288h, Boolean.TRUE)) {
                this.f18288h = Boolean.FALSE;
                C4094b c4094b = C4094b.f17998a;
                C7076c playStatus = getPlayStatus();
                if (playStatus == null || (str4 = playStatus.m27262b()) == null) {
                    str4 = "";
                }
                c4094b.m17147j(str4, str2);
                return;
            }
            return;
        }
        if (AbstractC5868k.m23669a(str, C3325bt.f14185aC) && (interfaceC1294a = this.f18285e) != null) {
            interfaceC1294a.mo5904V1();
        }
    }

    /* renamed from: m */
    public final void m17470m(String str, String str2) {
        C4094b c4094b;
        EnumC7254b m17140c;
        AbstractC5868k.m23674f(str, "buss");
        AbstractC5868k.m23674f(str2, "programCode");
        if (C0232d.f631a.m822d() && c4094b.m17139b() != (m17140c = (c4094b = C4094b.f17998a).m17140c(str, str2))) {
            m17468z(this, m17140c, null, false, 6, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0229a interfaceC0229a = this.f18283c;
        if (interfaceC0229a != null) {
            interfaceC0229a.mo800c(this);
        }
        C1304k.f4966a.m5922e(this, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        InterfaceC0229a interfaceC0229a = this.f18283c;
        if (interfaceC0229a != null) {
            interfaceC0229a.mo799b();
        }
        C1304k.f4966a.m5925h(this, this);
        super.onDetachedFromWindow();
    }

    /* renamed from: p */
    public final C7077d m17471p(String str, int i10) {
        boolean m27761t;
        boolean m27761t2;
        boolean m27761t3;
        boolean m27730q;
        boolean m27730q2;
        AbstractC5868k.m23674f(str, "lang");
        List<AudioTrack> audioTracks = getAudioTracks();
        if (audioTracks.isEmpty()) {
            return null;
        }
        if (!AbstractC5868k.m23669a(audioTracks.get(0).getLang(), "")) {
            m27761t = AbstractC7167u.m27761t(audioTracks.get(0).getLang(), "und", true);
            if (!m27761t) {
                m27761t2 = AbstractC7167u.m27761t(audioTracks.get(0).getLang(), "unknown", true);
                if (!m27761t2) {
                    m27761t3 = AbstractC7167u.m27761t(audioTracks.get(0).getLang(), "undefined", true);
                    if (!m27761t3) {
                        if (i10 < audioTracks.size()) {
                            m27730q2 = AbstractC7166t.m27730q(audioTracks.get(i10).getLang(), str, false, 2, null);
                            if (m27730q2) {
                                return new C7077d(0, audioTracks.get(i10).getTrackId(), 0, 5, null);
                            }
                        }
                        for (AudioTrack audioTrack : audioTracks) {
                            m27730q = AbstractC7166t.m27730q(audioTrack.getLang(), str, false, 2, null);
                            if (m27730q) {
                                return new C7077d(0, audioTrack.getTrackId(), 0, 5, null);
                            }
                        }
                        return null;
                    }
                }
            }
        }
        if (i10 >= audioTracks.size()) {
            return null;
        }
        return new C7077d(0, audioTracks.get(i10).getTrackId(), 0, 5, null);
    }

    /* renamed from: q */
    public final void m17472q() {
        this.f18283c = m17467o();
        this.f18284d = m17466n();
        C0232d c0232d = C0232d.f631a;
        if (!c0232d.m822d()) {
            m17468z(this, EnumC7254b.IJK, null, false, 6, null);
        }
        setPollingPeriod(c0232d.m820b());
    }

    /* renamed from: r */
    public final boolean m17473r() {
        return C7705h.f28256m.m29771a().m29763t(this.f18282b);
    }

    /* renamed from: s */
    public final boolean m17474s() {
        return this.f18286f;
    }

    public final void setAspectRatio(int i10) {
        InterfaceC0229a interfaceC0229a = this.f18283c;
        if (interfaceC0229a != null) {
            interfaceC0229a.setAspectRatio(i10);
        }
    }

    public final void setAudio(int i10) {
        C7074a m27261a;
        C7076c playStatus = getPlayStatus();
        boolean z10 = false;
        if (playStatus != null && (m27261a = playStatus.m27261a()) != null && m27261a.m27240a() == i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        C7705h.f28256m.m29771a().m29753E(this.f18282b, "audio", i10);
    }

    public final void setIsPip(boolean z10) {
        this.f18282b = z10 ? 1 : 0;
        InterfaceC0229a interfaceC0229a = this.f18283c;
        if (interfaceC0229a != null) {
            interfaceC0229a.mo803f(z10 ? 1 : 0);
        }
    }

    public final void setMPlayer(InterfaceC0229a interfaceC0229a) {
        this.f18283c = interfaceC0229a;
    }

    public final void setMedia(String str) {
        String mo805b;
        AbstractC5868k.m23674f(str, "mediaCode");
        this.f18286f = false;
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null && (mo805b = interfaceC0230b.mo805b()) != null) {
            C7705h.f28256m.m29771a().m29752D(this.f18282b, mo805b, str);
        }
    }

    public final void setMediaCast(String str) {
        Program mo804a;
        AbstractC5868k.m23674f(str, "mediaCode");
        this.f18286f = false;
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null && (mo804a = interfaceC0230b.mo804a()) != null) {
            C7705h.f28256m.m29771a().m29752D(this.f18282b, mo804a.getName(), str);
        }
    }

    public final void setPlayerListener(InterfaceC1294a interfaceC1294a) {
        AbstractC5868k.m23674f(interfaceC1294a, "playerListener");
        this.f18285e = interfaceC1294a;
    }

    public final void setPlayerStateChangeListener(InterfaceC1481a interfaceC1481a) {
        AbstractC5868k.m23674f(interfaceC1481a, "stateChangeListener");
    }

    public final void setPollingPeriod(int i10) {
        C7705h.f28256m.m29771a().m29753E(this.f18282b, "polling_period", i10);
    }

    public final void setThumbnail(int i10) {
        C7705h.f28256m.m29771a().m29753E(this.f18282b, "thumbnail", i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        View view;
        super.setVisibility(i10);
        InterfaceC0229a interfaceC0229a = this.f18283c;
        if (interfaceC0229a != null) {
            view = interfaceC0229a.getRenderView();
        } else {
            view = null;
        }
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public final void setVolume(int i10) {
        C7705h.f28256m.m29771a().m29753E(this.f18282b, "volume", i10);
    }

    @Override // p386wc.InterfaceC7393b
    /* renamed from: t */
    public void mo5956t(String str, String str2, long j10) {
        AbstractC5868k.m23674f(str, "adName");
        AbstractC5868k.m23674f(str2, "path");
        InterfaceC1294a interfaceC1294a = this.f18285e;
        if (interfaceC1294a != null) {
            interfaceC1294a.mo5913t(str, str2, j10);
        }
    }

    /* renamed from: u */
    public final void m17475u() {
        String mo805b;
        Log.i(this.f18281a, "pause player");
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null && (mo805b = interfaceC0230b.mo805b()) != null) {
            C7705h.f28256m.m29771a().m29765v(this.f18282b, mo805b);
        }
    }

    /* renamed from: v */
    public final void m17476v() {
        String mo805b;
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null && (mo805b = interfaceC0230b.mo805b()) != null) {
            C7705h.f28256m.m29771a().m29767y(this.f18282b, mo805b);
        }
    }

    /* renamed from: w */
    public final void m17477w(long j10) {
        String mo805b;
        InterfaceC0230b interfaceC0230b = this.f18284d;
        if (interfaceC0230b != null && (mo805b = interfaceC0230b.mo805b()) != null) {
            C7705h.f28256m.m29771a().m29768z(this.f18282b, mo805b, j10);
        }
    }

    /* renamed from: x */
    public final boolean m17478x(String str, int i10) {
        boolean m27761t;
        boolean m27761t2;
        boolean m27761t3;
        boolean m27730q;
        boolean m27730q2;
        AbstractC5868k.m23674f(str, "lang");
        List<AudioTrack> audioTracks = getAudioTracks();
        if (!audioTracks.isEmpty()) {
            if (!AbstractC5868k.m23669a(audioTracks.get(0).getLang(), "")) {
                m27761t = AbstractC7167u.m27761t(audioTracks.get(0).getLang(), "und", true);
                if (!m27761t) {
                    m27761t2 = AbstractC7167u.m27761t(audioTracks.get(0).getLang(), "unknown", true);
                    if (!m27761t2) {
                        m27761t3 = AbstractC7167u.m27761t(audioTracks.get(0).getLang(), "undefined", true);
                        if (!m27761t3) {
                            if (i10 < audioTracks.size()) {
                                m27730q2 = AbstractC7166t.m27730q(audioTracks.get(i10).getLang(), str, false, 2, null);
                                if (m27730q2) {
                                    new C7077d(0, audioTracks.get(i10).getTrackId(), 0, 5, null);
                                    C7705h.f28256m.m29771a().m29753E(this.f18282b, "audio", audioTracks.get(i10).getTrackId());
                                    return true;
                                }
                            }
                            for (AudioTrack audioTrack : audioTracks) {
                                m27730q = AbstractC7166t.m27730q(audioTrack.getLang(), str, false, 2, null);
                                if (m27730q) {
                                    C7705h.f28256m.m29771a().m29753E(this.f18282b, "audio", audioTrack.getTrackId());
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            if (i10 < audioTracks.size()) {
                C7705h.f28256m.m29771a().m29753E(this.f18282b, "audio", audioTracks.get(i10).getTrackId());
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public final void m17479y(EnumC7254b enumC7254b, Integer num, boolean z10) {
        Context context;
        AbstractC5868k.m23674f(enumC7254b, "type");
        C4094b.f17998a.m17148k(enumC7254b);
        if (z10) {
            this.f18288h = Boolean.TRUE;
        }
        if (enumC7254b == EnumC7254b.EXO) {
            context = getContext().getApplicationContext();
        } else {
            context = null;
        }
        InterfaceC0229a interfaceC0229a = this.f18283c;
        if (interfaceC0229a != null) {
            interfaceC0229a.mo801d(this.f18282b, enumC7254b.m28086a(), context, num);
        }
    }
}
