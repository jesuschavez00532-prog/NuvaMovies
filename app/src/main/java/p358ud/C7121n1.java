package p358ud;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import anet.channel.entity.EventType;
import ba.AbstractC1196d;
import bb.C1203g;
import bd.InterfaceC1294a;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import bf.AbstractC1330a;
import cc.C1456h0;
import cc.C1466m0;
import cc.C1473s;
import com.advertlib.bean.AdInfo;
import com.advertlib.bean.AdInfoWrapper;
import com.lzy.okgo.model.Progress;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.bean.Album;
import com.module.bean.AudioInfoBean;
import com.module.bean.AudioInfoUtil;
import com.module.bean.DefinitionBean;
import com.module.bean.Link;
import com.module.bean.QualityBean;
import com.module.bean.QualityBeanKt;
import com.module.bean.RecordAudioInfoBean;
import com.module.bean.RecordSubtitleInfoBean;
import com.module.bean.SourceBean;
import com.module.bean.VodQualityBean;
import com.module.event.AwakenVoiceAssistEvent;
import com.module.event.StopVodPlayEvent;
import com.module.playsetting.view.PlaySettingView;
import com.module.view.MFInfoBar;
import com.request.bean.SubTitleFileList;
import com.request.bean.SubTitleItemData;
import com.request.bean.SubtitleDownloadErrorEvent;
import com.request.bean.SubtitleDownloadFinishEvent;
import com.request.result.AssetData;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.LicenseData;
import com.request.result.MovieList;
import com.request.result.SimpleProgramList;
import com.request.result.StartPlayVODResultData;
import com.request.result.StartPlayVODResultDataItem;
import com.request.result.TotalMovieListItem;
import com.request.result.UserInfo;
import com.titan.ranger.Status;
import com.titan.ranger.bean.Media;
import com.titan.ranger.bean.Program;
import com.titans.entity.RangerPlayTag;
import com.umeng.analytics.pro.C3309bd;
import com.vod.R$color;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$mipmap;
import com.vod.R$string;
import com.vod.p089ui.activity.VodDetailsActivity;
import com.zhy.autolayout.AutoFrameLayout;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5876s;
import ne.C5878u;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.message.MessageService;
import org.android.spdy.TnetStatusCode;
import org.greenrobot.eventbus.ThreadMode;
import p030bc.C1251l2;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1504p;
import p043ce.AbstractC1508t;
import p102db.DialogC4084w0;
import p104dd.C4094b;
import p118eb.C4168g;
import p118eb.InterfaceC4162a;
import p119ed.C4176d;
import p119ed.C4177e;
import p125f3.C4224c;
import p132fa.C4300d;
import p153h2.AbstractC4509b;
import p161ha.ViewOnClickListenerC4758c0;
import p170i2.AbstractC4843b;
import p170i2.C4842a;
import p185j2.C4982a;
import p201k2.AbstractC5085b;
import p201k2.C5090g;
import p212kd.C5180h1;
import p212kd.InterfaceC5160c1;
import p217l2.InterfaceC5346g;
import p231m2.AbstractC5584b;
import p242n0.C5714a;
import p258o3.C5911g;
import p265oa.C5956n;
import p268od.InterfaceC5971g;
import p277p0.C6156m;
import p302qc.C6448c;
import p303qd.C6465e0;
import p317rb.AbstractC6567a;
import p321s0.InterfaceC6611f;
import p342ta.C6928a;
import p348u2.AbstractC7029f;
import p348u2.AbstractC7030g;
import p357uc.C7076c;
import p357uc.C7077d;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p371vb.C7252a;
import p372vd.C7259b;
import p400xa.AbstractC7598p1;
import p400xa.C7556b1;
import p400xa.C7565e1;
import p400xa.C7574h1;
import p400xa.C7577i1;
import p400xa.C7586l1;
import p400xa.C7589m1;
import p400xa.C7594o0;
import p400xa.C7615w;
import p400xa.C7617x;
import p400xa.C7618x0;
import p415y9.AbstractApplicationC7689d;
import p433zd.AbstractC7786b;
import td.C6936d;
import td.C6940h;
import vc.EnumC7254b;
import ye.InterfaceC7719m;

/* renamed from: ud.n1 */
/* loaded from: classes.dex */
public final class C7121n1 extends AbstractC1196d<C6465e0> implements InterfaceC5971g, PlaySettingView.InterfaceC2975b, MFInfoBar.InterfaceC3004b, InterfaceC1294a {

    /* renamed from: A0 */
    private AssetData f26632A0;

    /* renamed from: A1 */
    private StartPlayVODResultData f26633A1;

    /* renamed from: B0 */
    private SimpleProgramList f26634B0;

    /* renamed from: B1 */
    private String f26635B1;

    /* renamed from: C0 */
    private int f26636C0;

    /* renamed from: C1 */
    private Disposable f26637C1;

    /* renamed from: D1 */
    private HashMap f26639D1;

    /* renamed from: E1 */
    private List f26641E1;

    /* renamed from: F1 */
    private QualityBean f26643F1;

    /* renamed from: G0 */
    private int f26644G0;

    /* renamed from: G1 */
    private List f26645G1;

    /* renamed from: H0 */
    private boolean f26646H0;

    /* renamed from: H1 */
    private Album f26647H1;

    /* renamed from: I0 */
    private boolean f26648I0;

    /* renamed from: I1 */
    private String f26649I1;

    /* renamed from: J1 */
    private boolean f26651J1;

    /* renamed from: K1 */
    private boolean f26653K1;

    /* renamed from: L1 */
    private final InterfaceC1312h f26655L1;

    /* renamed from: M0 */
    private boolean f26656M0;

    /* renamed from: M1 */
    private Disposable f26657M1;

    /* renamed from: N0 */
    private ImageView f26658N0;

    /* renamed from: N1 */
    private boolean f26659N1;

    /* renamed from: O0 */
    private boolean f26660O0;

    /* renamed from: O1 */
    private final f f26661O1;

    /* renamed from: P1 */
    private DialogC4084w0 f26663P1;

    /* renamed from: Q1 */
    private e f26665Q1;

    /* renamed from: R0 */
    private boolean f26666R0;

    /* renamed from: S0 */
    private boolean f26668S0;

    /* renamed from: T0 */
    private boolean f26669T0;

    /* renamed from: U0 */
    private int f26670U0;

    /* renamed from: V0 */
    private Disposable f26671V0;

    /* renamed from: W0 */
    private int f26672W0;

    /* renamed from: X0 */
    private boolean f26673X0;

    /* renamed from: Y0 */
    private int f26674Y0;

    /* renamed from: b1 */
    private boolean f26677b1;

    /* renamed from: d1 */
    private int f26679d1;

    /* renamed from: f1 */
    private boolean f26681f1;

    /* renamed from: g1 */
    private boolean f26682g1;

    /* renamed from: i1 */
    private boolean f26684i1;

    /* renamed from: j1 */
    private Program f26685j1;

    /* renamed from: k1 */
    private Disposable f26686k1;

    /* renamed from: l1 */
    private Program f26687l1;

    /* renamed from: m1 */
    private List f26688m1;

    /* renamed from: n1 */
    private int f26689n1;

    /* renamed from: t1 */
    private final InterfaceC1312h f26695t1;

    /* renamed from: u1 */
    private C6936d f26696u1;

    /* renamed from: v1 */
    private C4168g f26697v1;

    /* renamed from: w1 */
    private C6940h f26698w1;

    /* renamed from: x1 */
    private boolean f26699x1;

    /* renamed from: y1 */
    private Progress f26701y1;

    /* renamed from: z1 */
    private C4176d f26703z1;

    /* renamed from: R1 */
    public Map f26667R1 = new LinkedHashMap();

    /* renamed from: y0 */
    private final String f26700y0 = "VodPlayerFragment";

    /* renamed from: z0 */
    private boolean f26702z0 = true;

    /* renamed from: D0 */
    private String f26638D0 = "";

    /* renamed from: E0 */
    private String f26640E0 = "";

    /* renamed from: F0 */
    private String f26642F0 = "";

    /* renamed from: J0 */
    private String f26650J0 = "";

    /* renamed from: K0 */
    private String f26652K0 = "";

    /* renamed from: L0 */
    private String f26654L0 = "";

    /* renamed from: P0 */
    private String f26662P0 = "";

    /* renamed from: Q0 */
    private List f26664Q0 = new ArrayList();

    /* renamed from: Z0 */
    private String f26675Z0 = "";

    /* renamed from: a1 */
    private String f26676a1 = "";

    /* renamed from: c1 */
    private int f26678c1 = 1;

    /* renamed from: e1 */
    private String f26680e1 = C3309bd.f14106m;

    /* renamed from: h1 */
    private boolean f26683h1 = true;

    /* renamed from: o1 */
    private boolean f26690o1 = true;

    /* renamed from: p1 */
    private int f26691p1 = -1;

    /* renamed from: q1 */
    private int f26692q1 = -1;

    /* renamed from: r1 */
    private String f26693r1 = "";

    /* renamed from: s1 */
    private String f26694s1 = "";

    /* renamed from: ud.n1$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ Program f26705b;

        /* renamed from: ud.n1$a$a */
        /* loaded from: classes3.dex */
        public static final class C7862a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C7121n1 f26706a;

            /* renamed from: b */
            final /* synthetic */ Link f26707b;

            /* renamed from: c */
            final /* synthetic */ Program f26708c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7862a(C7121n1 c7121n1, Link link, Program program) {
                super(1);
                this.f26706a = c7121n1;
                this.f26707b = link;
                this.f26708c = program;
            }

            /* renamed from: a */
            public final void m27564a(boolean z10) {
                int i10 = 0;
                this.f26706a.f26651J1 = false;
                C7121n1 c7121n1 = this.f26706a;
                if (z10) {
                    i10 = this.f26707b.getRecordTime();
                }
                c7121n1.f26672W0 = i10;
                this.f26708c.setStart(this.f26706a.f26672W0);
                this.f26706a.m27359Ec(this.f26708c);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m27564a(((Boolean) obj).booleanValue());
                return C1328x.f4998a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Program program) {
            super(1);
            this.f26705b = program;
        }

        /* renamed from: a */
        public final void m27563a(Link link) {
            if (C7121n1.this.m3096J6() != null && !C7121n1.this.m3192t7()) {
                if (link == null || link.getRecordTime() <= 0) {
                    C7121n1.this.f26672W0 = 0;
                    this.f26705b.setStart(C7121n1.this.f26672W0);
                    C7121n1.this.m27359Ec(this.f26705b);
                } else {
                    C7556b1 c7556b1 = C7556b1.f27754a;
                    AbstractC0729o m3110N8 = C7121n1.this.m3110N8();
                    AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
                    c7556b1.m28967f(m3110N8, link.getRecordTime(), new C7862a(C7121n1.this, link, this.f26705b));
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27563a((Link) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$a0 */
    /* loaded from: classes3.dex */
    public static final class a0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5180h1 f26709a;

        /* renamed from: b */
        final /* synthetic */ C7121n1 f26710b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(C5180h1 c5180h1, C7121n1 c7121n1) {
            super(1);
            this.f26709a = c5180h1;
            this.f26710b = c7121n1;
        }

        /* renamed from: a */
        public final void m27565a(int i10) {
            if (this.f26709a.m20907s() != i10) {
                C6936d c6936d = this.f26710b.f26696u1;
                if (c6936d != null) {
                    c6936d.mo3278o9();
                }
                ((MFInfoBar) this.f26710b.m27561ua(R$id.mInfoBar)).setStatus(0);
                C7121n1 c7121n1 = this.f26710b;
                c7121n1.m27388Kd(c7121n1.f26641E1, i10);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27565a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        /* renamed from: a */
        public final void m27566a() {
            if (C7121n1.this.f26699x1) {
                C4176d c4176d = null;
                C7121n1.m27412Qc(C7121n1.this, false, 1, null);
                C7121n1.this.f26699x1 = false;
                C4176d c4176d2 = C7121n1.this.f26703z1;
                if (c4176d2 == null) {
                    AbstractC5868k.m23686r("mVideoView");
                } else {
                    c4176d = c4176d2;
                }
                c4176d.m17469B();
                Program program = C7121n1.this.f26687l1;
                if (program != null) {
                    C7121n1.m27364Fd(C7121n1.this, program, false, false, 6, null);
                }
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27566a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$b0 */
    /* loaded from: classes3.dex */
    public static final class b0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b0 f26712a = new b0();

        b0() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a */
        public final Boolean mo542f(Long l10) {
            AbstractC5868k.m23674f(l10, "it");
            return Boolean.valueOf(C1456h0.f5574a.m6779o());
        }
    }

    /* renamed from: ud.n1$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ SourceBean f26714b;

        /* renamed from: c */
        final /* synthetic */ DefinitionBean f26715c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SourceBean sourceBean, DefinitionBean definitionBean) {
            super(1);
            this.f26714b = sourceBean;
            this.f26715c = definitionBean;
        }

        /* renamed from: a */
        public final void m27568a(String str) {
            C7121n1.this.m27553cc(this.f26714b.getAudioTag(), this.f26715c);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27568a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$c0 */
    /* loaded from: classes3.dex */
    public static final class c0 implements Observer {

        /* renamed from: b */
        final /* synthetic */ StartPlayVODResultData f26717b;

        /* renamed from: c */
        final /* synthetic */ int f26718c;

        c0(StartPlayVODResultData startPlayVODResultData, int i10) {
            this.f26717b = startPlayVODResultData;
            this.f26718c = i10;
        }

        /* renamed from: a */
        public void m27569a(long j10) {
            Disposable disposable = C7121n1.this.f26657M1;
            if (disposable != null) {
                disposable.dispose();
            }
            C7121n1.this.mo24156Y1(this.f26717b, this.f26718c);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            C1473s.f5656a.m6918b(32600);
            C1456h0.f5574a.m6781q(true);
            C7121n1.this.mo24156Y1(this.f26717b, this.f26718c);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
        }

        @Override // io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            m27569a(((Number) obj).longValue());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            C7121n1.this.f26657M1 = disposable;
        }
    }

    /* renamed from: ud.n1$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f26719a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m27570a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27570a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$d0 */
    /* loaded from: classes3.dex */
    public static final class d0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ boolean f26721b;

        /* renamed from: c */
        final /* synthetic */ boolean f26722c;

        /* renamed from: d */
        final /* synthetic */ Program f26723d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(boolean z10, boolean z11, Program program) {
            super(1);
            this.f26721b = z10;
            this.f26722c = z11;
            this.f26723d = program;
        }

        /* renamed from: a */
        public final void m27571a(Boolean bool) {
            AbstractC5868k.m23673e(bool, "hasCache");
            if (!bool.booleanValue()) {
                C7121n1.this.f26699x1 = false;
                C7121n1.this.f26673X0 = false;
                if (!this.f26721b && !this.f26722c) {
                    ((MFInfoBar) C7121n1.this.m27561ua(R$id.mInfoBar)).m12190J0();
                }
                if (this.f26722c) {
                    ((MFInfoBar) C7121n1.this.m27561ua(R$id.mInfoBar)).setStatus(0);
                }
                C4176d c4176d = C7121n1.this.f26703z1;
                if (c4176d == null) {
                    AbstractC5868k.m23686r("mVideoView");
                    c4176d = null;
                }
                Program program = this.f26723d;
                c4176d.mo17463A(program, program.getName(), this.f26723d.getBuss());
                return;
            }
            if (C7121n1.this.f26701y1 != null) {
                C7121n1.this.f26699x1 = true;
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27571a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$e */
    /* loaded from: classes3.dex */
    public static final class e implements C7618x0.a {
        e() {
        }

        @Override // p400xa.C7618x0.a
        /* renamed from: a */
        public void mo11883a(int i10, KeyEvent keyEvent) {
            AbstractC5868k.m23674f(keyEvent, "event");
        }

        @Override // p400xa.C7618x0.a
        /* renamed from: b */
        public void mo11884b(boolean z10, boolean z11, String str) {
            boolean z12 = false;
            DialogC4084w0 dialogC4084w0;
            AbstractC5868k.m23674f(str, "errCode");
            if (!z11) {
                C4176d c4176d = C7121n1.this.f26703z1;
                if (c4176d == null) {
                    AbstractC5868k.m23686r("mVideoView");
                    c4176d = null;
                }
                boolean z13 = true;
                if (!c4176d.m17473r()) {
                    if (!z10) {
                        if (C4094b.f17998a.m17143f() == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (C7121n1.this.f26663P1 == null) {
                            C7121n1 c7121n1 = C7121n1.this;
                            Context m3096J6 = C7121n1.this.m3096J6();
                            AbstractC5868k.m23671c(m3096J6);
                            c7121n1.f26663P1 = new DialogC4084w0(m3096J6, z12);
                        }
                        DialogC4084w0 dialogC4084w02 = C7121n1.this.f26663P1;
                        if (dialogC4084w02 == null || dialogC4084w02.isShowing()) {
                            z13 = false;
                        }
                        if (z13 && (dialogC4084w0 = C7121n1.this.f26663P1) != null) {
                            dialogC4084w0.show();
                            return;
                        }
                        return;
                    }
                    Context m3096J62 = C7121n1.this.m3096J6();
                    if (m3096J62 != null) {
                        C7586l1 c7586l1 = C7586l1.f27877a;
                        String string = m3096J62.getString(R$string.nd_stable_connect);
                        AbstractC5868k.m23673e(string, "it.getString(R.string.nd_stable_connect)");
                        C7586l1.m29112f(c7586l1, m3096J62, string, 1, 0, 8, null);
                    }
                }
            }
        }
    }

    /* renamed from: ud.n1$e0 */
    /* loaded from: classes3.dex */
    public static final class e0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e0 f26725a = new e0();

        e0() {
            super(1);
        }

        /* renamed from: a */
        public final void m27572a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27572a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$f */
    /* loaded from: classes3.dex */
    public static final class f implements MFInfoBar.InterfaceC3005c {
        f() {
        }

        @Override // com.module.view.MFInfoBar.InterfaceC3005c
        /* renamed from: a */
        public void mo7577a() {
            C7121n1.this.m27442Yb().m5497g();
            ((MFInfoBar) C7121n1.this.m27561ua(R$id.mInfoBar)).setStatus(6);
        }

        @Override // com.module.view.MFInfoBar.InterfaceC3005c
        /* renamed from: b */
        public void mo7578b() {
            C7121n1.this.m27442Yb().m5497g();
            ((MFInfoBar) C7121n1.this.m27561ua(R$id.mInfoBar)).setStatus(7);
        }

        @Override // com.module.view.MFInfoBar.InterfaceC3005c
        /* renamed from: c */
        public void mo7579c(int i10) {
            long j10;
            C4176d c4176d = C7121n1.this.f26703z1;
            C4176d c4176d2 = null;
            if (c4176d == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d = null;
            }
            long j11 = i10;
            C4176d c4176d3 = C7121n1.this.f26703z1;
            if (c4176d3 == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d3 = null;
            }
            if (j11 >= c4176d3.getDuration()) {
                j10 = j11 - 3000;
            } else {
                j10 = j11;
            }
            c4176d.m17477w(j10);
            C4176d c4176d4 = C7121n1.this.f26703z1;
            if (c4176d4 == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d4 = null;
            }
            if (!c4176d4.m17473r()) {
                C4176d c4176d5 = C7121n1.this.f26703z1;
                if (c4176d5 == null) {
                    AbstractC5868k.m23686r("mVideoView");
                    c4176d5 = null;
                }
                c4176d5.m17476v();
                C7121n1 c7121n1 = C7121n1.this;
                int i11 = R$id.mInfoBar;
                ((MFInfoBar) c7121n1.m27561ua(i11)).setStatus(3);
                if (C7121n1.this.f26659N1) {
                    ((MFInfoBar) C7121n1.this.m27561ua(i11)).m12199X();
                    C7121n1.this.f26659N1 = false;
                }
            }
            C7121n1 c7121n12 = C7121n1.this;
            C4176d c4176d6 = c7121n12.f26703z1;
            if (c4176d6 == null) {
                AbstractC5868k.m23686r("mVideoView");
            } else {
                c4176d2 = c4176d6;
            }
            if (j11 >= c4176d2.getDuration()) {
                i10 += TnetStatusCode.EASY_REASON_HANDSHAKE_ERROR;
            }
            c7121n12.m27531yd(i10);
        }
    }

    /* renamed from: ud.n1$f0 */
    /* loaded from: classes3.dex */
    public static final class f0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f0 f26727a = new f0();

        f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m27573a(C1328x c1328x) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27573a((C1328x) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ud.n1$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final g f26728a = new g();

        g() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a */
        public final C1251l2 invoke() {
            return new C1251l2();
        }
    }

    /* renamed from: ud.n1$g0 */
    /* loaded from: classes3.dex */
    public static final class g0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g0 f26729a = new g0();

        g0() {
            super(1);
        }

        /* renamed from: a */
        public final void m27575a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27575a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ud.n1$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final h f26730a = new h();

        h() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a */
        public final C1203g invoke() {
            return new C1203g();
        }
    }

    /* renamed from: ud.n1$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5878u f26731a;

        /* renamed from: b */
        final /* synthetic */ C5878u f26732b;

        /* renamed from: c */
        final /* synthetic */ C7121n1 f26733c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f26734d;

        /* renamed from: e */
        final /* synthetic */ String f26735e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C5878u c5878u, C5878u c5878u2, C7121n1 c7121n1, ArrayList arrayList, String str) {
            super(1);
            this.f26731a = c5878u;
            this.f26732b = c5878u2;
            this.f26733c = c7121n1;
            this.f26734d = arrayList;
            this.f26735e = str;
        }

        /* renamed from: a */
        public final void m27577a(ArrayList arrayList) {
            Integer num;
            String str = null;
            List<SimpleProgramList> simpleProgramList;
            boolean z10 = false;
            String str2 = null;
            boolean m27763v;
            boolean m27763v2;
            String language = null;
            AbstractC5868k.m23673e(arrayList, "it");
            if (!arrayList.isEmpty()) {
                ((ArrayList) this.f26731a.f23412a).addAll(arrayList);
            }
            if (!((ArrayList) this.f26731a.f23412a).isEmpty()) {
                this.f26733c.f26666R0 = true;
                this.f26733c.f26668S0 = true;
                int size = this.f26733c.f26664Q0.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (AbstractC5868k.m23669a(((DefinitionBean) this.f26733c.f26664Q0.get(i10)).getQuality(), this.f26733c.f26643F1.getQualityValue())) {
                        this.f26733c.f26670U0 = i10;
                        break;
                    }
                    i10++;
                }
                DefinitionBean definitionBean = (DefinitionBean) this.f26733c.f26664Q0.get(this.f26733c.f26670U0);
                this.f26733c.m27461fc(definitionBean);
                SourceBean selectSource = definitionBean.getSelectSource();
                String name = ((Media) this.f26734d.get(0)).getName();
                ArrayList arrayList2 = this.f26734d;
                C7121n1 c7121n1 = this.f26733c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (AbstractC5868k.m23669a(((Media) obj).getQuality(), c7121n1.f26643F1.getQualityValue())) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = this.f26734d;
                ArrayList arrayList5 = new ArrayList();
                Iterator it = arrayList4.iterator();
                while (true) {
                    num = null;
                    String str3 = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String lang = ((Media) next).getLang();
                    AudioInfoBean selectAduio = selectSource.getSelectAduio();
                    if (selectAduio != null && (language = selectAduio.getLanguage()) != null) {
                        str3 = language;
                    }
                    m27763v2 = AbstractC7167u.m27763v(lang, str3, false, 2, null);
                    if (m27763v2) {
                        arrayList5.add(next);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList5 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        String lang2 = ((Media) obj2).getLang();
                        AudioInfoBean selectAduio2 = selectSource.getSelectAduio();
                        if (selectAduio2 == null || (str2 = selectAduio2.getLanguage()) == null) {
                            str2 = "";
                        }
                        m27763v = AbstractC7167u.m27763v(lang2, str2, false, 2, null);
                        if (m27763v) {
                            arrayList5.add(obj2);
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    name = ((Media) arrayList5.get(0)).getName();
                }
                List list = this.f26733c.f26664Q0;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        int i11 = 0;
                        for (Object obj3 : ((DefinitionBean) it2.next()).getSourceList()) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                AbstractC1500l.m6991j();
                            }
                            SourceBean sourceBean = (SourceBean) obj3;
                            if (definitionBean.getSelectSourceIndex() == i11) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                name = sourceBean.getContentId();
                            }
                            i11 = i12;
                        }
                    }
                }
                String str4 = name;
                this.f26733c.f26669T0 = true;
                this.f26733c.f26683h1 = true;
                String str5 = this.f26733c.f26675Z0;
                String value = RangerPlayTag.VOD.getValue();
                String str6 = this.f26735e;
                if (str6 == null) {
                    str = "";
                } else {
                    str = str6;
                }
                AssetData assetData = this.f26733c.f26632A0;
                if (assetData != null && (simpleProgramList = assetData.getSimpleProgramList()) != null) {
                    num = Integer.valueOf(simpleProgramList.size());
                }
                Program program = new Program(str5, value, str, String.valueOf(num), this.f26733c.f26662P0, C3309bd.f14106m, this.f26734d, str4, 0L);
                if (this.f26733c.f26660O0) {
                    this.f26733c.m27479kc();
                }
                this.f26733c.m27402Ob(program);
                C7121n1 c7121n12 = this.f26733c;
                c7121n12.m27457ec(c7121n12.f26645G1, this.f26733c.f26675Z0);
                this.f26733c.mo24155W3();
                return;
            }
            Object obj4 = this.f26732b.f23412a;
            if (obj4 != null) {
                AbstractC5868k.m23671c(obj4);
                if (((TotalMovieListItem) obj4).getMovieList() == null) {
                    this.f26733c.f26683h1 = false;
                    ((MFInfoBar) this.f26733c.m27561ua(R$id.mInfoBar)).setStatus(9);
                    this.f26733c.m27520vd();
                    this.f26733c.f26669T0 = false;
                    this.f26733c.f26666R0 = true;
                    this.f26733c.f26668S0 = true;
                }
            }
            this.f26733c.f26683h1 = true;
            AbstractC7598p1.m29244h(this.f26733c.m3096J6(), this.f26733c.m3175k7(R$string.vod_play_no_source_available, C7615w.f27995a.m29303G()), new int[0]);
            ((MFInfoBar) this.f26733c.m27561ua(R$id.mInfoBar)).setStatus(-2);
            this.f26733c.f26669T0 = false;
            this.f26733c.f26666R0 = true;
            this.f26733c.f26668S0 = true;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27577a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final j f26736a = new j();

        j() {
            super(1);
        }

        /* renamed from: a */
        public final void m27578a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27578a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {
        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m27579a(Context context) {
            AbstractC5868k.m23674f(context, "$this$runOnUiThread");
            C7121n1.this.f26683h1 = true;
            AbstractC7598p1.m29244h(C7121n1.this.m3096J6(), context.getString(R$string.vod_play_no_source_available, C7615w.f27995a.m29303G()), new int[0]);
            ((MFInfoBar) C7121n1.this.m27561ua(R$id.mInfoBar)).setStatus(-2);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27579a((Context) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5878u f26739b;

        /* renamed from: ud.n1$l$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C5878u f26740a;

            /* renamed from: b */
            final /* synthetic */ C7121n1 f26741b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5878u c5878u, C7121n1 c7121n1) {
                super(1);
                this.f26740a = c5878u;
                this.f26741b = c7121n1;
            }

            /* renamed from: a */
            public final void m27581a(Context context) {
                AbstractC5868k.m23674f(context, "$this$runOnUiThread");
                Object obj = this.f26740a.f23412a;
                if (obj != null) {
                    AbstractC5868k.m23671c(obj);
                    if (((TotalMovieListItem) obj).getMovieList() == null) {
                        this.f26741b.f26683h1 = false;
                        this.f26741b.m27520vd();
                        return;
                    }
                }
                this.f26741b.f26683h1 = true;
                AbstractC7598p1.m29244h(this.f26741b.m3096J6(), context.getString(R$string.vod_play_no_source_available, C7615w.f27995a.m29303G()), new int[0]);
                ((MFInfoBar) this.f26741b.m27561ua(R$id.mInfoBar)).setStatus(-2);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m27581a((Context) obj);
                return C1328x.f4998a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C5878u c5878u) {
            super(1);
            this.f26739b = c5878u;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a */
        public final Boolean mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            if (list.isEmpty()) {
                Context m3096J6 = C7121n1.this.m3096J6();
                if (m3096J6 != null) {
                    AbstractC1330a.m5982a(m3096J6, new a(this.f26739b, C7121n1.this));
                }
                C7121n1.this.f26669T0 = false;
                C7121n1.this.f26666R0 = true;
                C7121n1.this.f26668S0 = true;
            }
            return Boolean.valueOf(!list.isEmpty());
        }
    }

    /* renamed from: ud.n1$m */
    /* loaded from: classes3.dex */
    public static final class m extends AbstractC5869l implements InterfaceC5660l {
        m() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a */
        public final HashMap mo542f(List list) {
            boolean z10 = false;
            String quality = null;
            AbstractC5868k.m23674f(list, "it");
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TotalMovieListItem totalMovieListItem = (TotalMovieListItem) it.next();
                String quality2 = totalMovieListItem.getQuality();
                if (quality2 == null) {
                    quality2 = "";
                }
                hashMap2.put(quality2, totalMovieListItem);
                List<MovieList> movieList = totalMovieListItem.getMovieList();
                if (movieList != null && !movieList.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10 && (quality = totalMovieListItem.getQuality()) != null) {
                    int hashCode = quality.hashCode();
                    if (hashCode != 1604548) {
                        if (hashCode != 1688155) {
                            if (hashCode == 46737913 && quality.equals("1080p")) {
                                hashMap.put("1080p", totalMovieListItem);
                            }
                        } else if (quality.equals("720p")) {
                            hashMap.put("720p", totalMovieListItem);
                        }
                    } else if (quality.equals("480p")) {
                        hashMap.put("480p", totalMovieListItem);
                    }
                }
            }
            C7121n1.this.m27454dd(hashMap2);
            return hashMap;
        }
    }

    /* renamed from: ud.n1$n */
    /* loaded from: classes3.dex */
    public static final class n extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5878u f26744b;

        /* renamed from: ud.n1$n$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C5878u f26745a;

            /* renamed from: b */
            final /* synthetic */ C7121n1 f26746b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5878u c5878u, C7121n1 c7121n1) {
                super(1);
                this.f26745a = c5878u;
                this.f26746b = c7121n1;
            }

            /* renamed from: a */
            public final void m27584a(Context context) {
                AbstractC5868k.m23674f(context, "$this$runOnUiThread");
                Object obj = this.f26745a.f23412a;
                if (obj != null) {
                    AbstractC5868k.m23671c(obj);
                    if (((TotalMovieListItem) obj).getMovieList() == null) {
                        this.f26746b.f26683h1 = false;
                        ((MFInfoBar) this.f26746b.m27561ua(R$id.mInfoBar)).setStatus(9);
                        this.f26746b.m27520vd();
                        return;
                    }
                }
                this.f26746b.f26683h1 = true;
                AbstractC7598p1.m29244h(this.f26746b.m3096J6(), context.getString(R$string.vod_play_no_source_available, C7615w.f27995a.m29303G()), new int[0]);
                ((MFInfoBar) this.f26746b.m27561ua(R$id.mInfoBar)).setStatus(-2);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m27584a((Context) obj);
                return C1328x.f4998a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C5878u c5878u) {
            super(1);
            this.f26744b = c5878u;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a */
        public final Boolean mo542f(HashMap hashMap) {
            AbstractC5868k.m23674f(hashMap, "map");
            if (!hashMap.isEmpty()) {
                C7121n1.this.m27432Vc();
                C7121n1.this.m27382Jb(hashMap);
            } else {
                Context m3096J6 = C7121n1.this.m3096J6();
                if (m3096J6 != null) {
                    AbstractC1330a.m5982a(m3096J6, new a(this.f26744b, C7121n1.this));
                }
                C7121n1.this.f26669T0 = false;
                C7121n1.this.f26666R0 = true;
                C7121n1.this.m27432Vc();
            }
            C7121n1.this.f26668S0 = true;
            C7121n1.this.m27428Uc();
            return Boolean.valueOf(!hashMap.isEmpty());
        }
    }

    /* renamed from: ud.n1$o */
    /* loaded from: classes3.dex */
    public static final class o extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ StartPlayVODResultData f26748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(StartPlayVODResultData startPlayVODResultData) {
            super(1);
            this.f26748b = startPlayVODResultData;
        }

        /* renamed from: a */
        public final void m27585a(HashMap hashMap) {
            AbstractC4509b.m18869b(C7121n1.this.f26700y0, "totalMovieList:" + hashMap, new Object[0]);
            C7121n1 c7121n1 = C7121n1.this;
            AbstractC5868k.m23673e(hashMap, "totalMovieList");
            c7121n1.m27413Qd(hashMap);
            C7121n1.this.m27560pc(hashMap, this.f26748b.getName());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27585a((HashMap) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$p */
    /* loaded from: classes3.dex */
    public static final class p extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final p f26749a = new p();

        p() {
            super(1);
        }

        /* renamed from: a */
        public final void m27586a(Throwable th) {
            AbstractC5584b.m22679a(th, "onStartPlayVodSuc");
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27586a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$q */
    /* loaded from: classes3.dex */
    public static final class q implements InterfaceC6611f {

        /* renamed from: b */
        final /* synthetic */ Program f26751b;

        q(Program program) {
            this.f26751b = program;
        }

        @Override // p321s0.InterfaceC6611f
        /* renamed from: a */
        public void mo25825a(List list) {
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            if (AbstractC6567a.m25638h(list)) {
                ArrayList arrayList = new ArrayList();
                String str5 = (String) C4982a.f20721a.m20333a(AbstractApplicationC7689d.f28135d.m29494a(), C5090g.f20948a.m20647l(), "");
                if (AbstractC5868k.m23669a(str5, "2")) {
                    AbstractC5868k.m23671c(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AdInfoWrapper adInfoWrapper = (AdInfoWrapper) it.next();
                        AdInfo adInfo = adInfoWrapper.getAdInfo();
                        if (adInfo != null) {
                            str3 = adInfo.is_dealer();
                        } else {
                            str3 = null;
                        }
                        if (!AbstractC5868k.m23669a("no", str3)) {
                            AdInfo adInfo2 = adInfoWrapper.getAdInfo();
                            if (adInfo2 != null) {
                                str4 = adInfo2.is_dealer();
                            } else {
                                str4 = null;
                            }
                            if (AbstractC5868k.m23669a("default", str4)) {
                            }
                        }
                        arrayList.add(adInfoWrapper);
                    }
                } else if (AbstractC5868k.m23669a(str5, MessageService.MSG_DB_READY_REPORT)) {
                    AbstractC5868k.m23671c(list);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        AdInfoWrapper adInfoWrapper2 = (AdInfoWrapper) it2.next();
                        AdInfo adInfo3 = adInfoWrapper2.getAdInfo();
                        if (adInfo3 != null) {
                            str = adInfo3.is_dealer();
                        } else {
                            str = null;
                        }
                        if (!AbstractC5868k.m23669a("yes", str)) {
                            AdInfo adInfo4 = adInfoWrapper2.getAdInfo();
                            if (adInfo4 != null) {
                                str2 = adInfo4.is_dealer();
                            } else {
                                str2 = null;
                            }
                            if (AbstractC5868k.m23669a("default", str2)) {
                            }
                        }
                        arrayList.add(adInfoWrapper2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AdInfoWrapper adInfoWrapper3 = (AdInfoWrapper) arrayList.get(new Random().nextInt(arrayList.size()));
                    C7121n1.this.m27516ud(this.f26751b, adInfoWrapper3);
                    C6156m c6156m = C6156m.f24180a;
                    AdInfo adInfo5 = adInfoWrapper3.getAdInfo();
                    AbstractC5868k.m23671c(adInfo5);
                    c6156m.m24570W(adInfo5);
                    return;
                }
                C7121n1.m27364Fd(C7121n1.this, this.f26751b, false, false, 6, null);
                return;
            }
            C7121n1.m27364Fd(C7121n1.this, this.f26751b, false, false, 6, null);
        }
    }

    /* renamed from: ud.n1$r */
    /* loaded from: classes3.dex */
    public static final class r extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5878u f26752a;

        /* renamed from: b */
        final /* synthetic */ C5878u f26753b;

        /* renamed from: c */
        final /* synthetic */ C7121n1 f26754c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f26755d;

        /* renamed from: e */
        final /* synthetic */ String f26756e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(C5878u c5878u, C5878u c5878u2, C7121n1 c7121n1, ArrayList arrayList, String str) {
            super(1);
            this.f26752a = c5878u;
            this.f26753b = c5878u2;
            this.f26754c = c7121n1;
            this.f26755d = arrayList;
            this.f26756e = str;
        }

        /* renamed from: a */
        public final void m27587a(ArrayList arrayList) {
            Integer num;
            String str = null;
            List<SimpleProgramList> simpleProgramList;
            boolean z10 = false;
            boolean m27763v;
            String language = null;
            AbstractC5868k.m23673e(arrayList, "it");
            if (!arrayList.isEmpty()) {
                ((ArrayList) this.f26752a.f23412a).addAll(arrayList);
            }
            if (!((ArrayList) this.f26752a.f23412a).isEmpty()) {
                this.f26754c.f26666R0 = true;
                this.f26754c.f26668S0 = true;
                int size = this.f26754c.f26664Q0.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (AbstractC5868k.m23669a(((DefinitionBean) this.f26754c.f26664Q0.get(i10)).getQuality(), this.f26754c.f26643F1.getQualityValue())) {
                        this.f26754c.f26670U0 = i10;
                        break;
                    }
                    i10++;
                }
                DefinitionBean definitionBean = (DefinitionBean) this.f26754c.f26664Q0.get(this.f26754c.f26670U0);
                this.f26754c.m27461fc(definitionBean);
                SourceBean selectSource = definitionBean.getSelectSource();
                String name = ((Media) this.f26755d.get(0)).getName();
                ArrayList arrayList2 = this.f26755d;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (true) {
                    num = null;
                    String str2 = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String lang = ((Media) next).getLang();
                    AudioInfoBean selectAduio = selectSource.getSelectAduio();
                    if (selectAduio != null && (language = selectAduio.getLanguage()) != null) {
                        str2 = language;
                    }
                    m27763v = AbstractC7167u.m27763v(lang, str2, false, 2, null);
                    if (m27763v) {
                        arrayList3.add(next);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    name = ((Media) arrayList3.get(0)).getName();
                }
                List list = this.f26754c.f26664Q0;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        int i11 = 0;
                        for (Object obj : ((DefinitionBean) it2.next()).getSourceList()) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                AbstractC1500l.m6991j();
                            }
                            SourceBean sourceBean = (SourceBean) obj;
                            if (definitionBean.getSelectSourceIndex() == i11) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                name = sourceBean.getContentId();
                            }
                            i11 = i12;
                        }
                    }
                }
                String str3 = name;
                this.f26754c.f26669T0 = true;
                this.f26754c.f26683h1 = true;
                String str4 = this.f26754c.f26675Z0;
                String value = RangerPlayTag.VOD.getValue();
                String str5 = this.f26756e;
                if (str5 == null) {
                    str = "";
                } else {
                    str = str5;
                }
                AssetData assetData = this.f26754c.f26632A0;
                if (assetData != null && (simpleProgramList = assetData.getSimpleProgramList()) != null) {
                    num = Integer.valueOf(simpleProgramList.size());
                }
                Program program = new Program(str4, value, str, String.valueOf(num), this.f26754c.f26662P0, C3309bd.f14106m, this.f26755d, str3, 0L);
                if (this.f26754c.f26697v1 != null) {
                    this.f26754c.f26684i1 = true;
                    this.f26754c.f26685j1 = program;
                    return;
                }
                program.setStart(this.f26754c.f26672W0);
                C7121n1.m27364Fd(this.f26754c, program, false, false, 6, null);
                C7121n1 c7121n1 = this.f26754c;
                c7121n1.m27457ec(c7121n1.f26645G1, this.f26754c.f26675Z0);
                this.f26754c.mo24155W3();
                return;
            }
            Object obj2 = this.f26753b.f23412a;
            if (obj2 != null) {
                AbstractC5868k.m23671c(obj2);
                if (((TotalMovieListItem) obj2).getMovieList() == null) {
                    ((MFInfoBar) this.f26754c.m27561ua(R$id.mInfoBar)).setStatus(9);
                    this.f26754c.m27520vd();
                    this.f26754c.f26669T0 = false;
                    this.f26754c.f26666R0 = true;
                    this.f26754c.f26668S0 = true;
                }
            }
            AbstractC7598p1.m29244h(this.f26754c.m3096J6(), this.f26754c.m3175k7(R$string.vod_play_no_source_available, C7615w.f27995a.m29303G()), new int[0]);
            ((MFInfoBar) this.f26754c.m27561ua(R$id.mInfoBar)).setStatus(-2);
            this.f26754c.f26669T0 = false;
            this.f26754c.f26666R0 = true;
            this.f26754c.f26668S0 = true;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27587a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$s */
    /* loaded from: classes3.dex */
    public static final class s extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final s f26757a = new s();

        s() {
            super(1);
        }

        /* renamed from: a */
        public final void m27588a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27588a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$t */
    /* loaded from: classes3.dex */
    public static final class t extends AbstractC5869l implements InterfaceC5660l {
        t() {
            super(1);
        }

        /* renamed from: a */
        public final void m27589a(Integer num) {
            C7121n1 c7121n1 = C7121n1.this;
            int i10 = R$id.mTvSubtitle;
            TextView textView = (TextView) c7121n1.m27561ua(i10);
            if (textView != null) {
                textView.setShadowLayer(1.0f, 2.0f, 2.0f, -16777216);
            }
            if (num != null && num.intValue() == 1) {
                TextView textView2 = (TextView) C7121n1.this.m27561ua(i10);
                if (textView2 != null) {
                    textView2.setBackgroundColor(C7121n1.this.m3107M8().getResources().getColor(R$color.color_00ffffff));
                }
                TextView textView3 = (TextView) C7121n1.this.m27561ua(i10);
                if (textView3 != null) {
                    textView3.setTextColor(C7121n1.this.m3107M8().getResources().getColor(R$color.color_ffaa00));
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 3) {
                TextView textView4 = (TextView) C7121n1.this.m27561ua(i10);
                if (textView4 != null) {
                    textView4.setBackgroundColor(C7121n1.this.m3107M8().getResources().getColor(R$color.black));
                }
                TextView textView5 = (TextView) C7121n1.this.m27561ua(i10);
                if (textView5 != null) {
                    textView5.setTextColor(C7121n1.this.m3107M8().getResources().getColor(R$color.color_ffffff));
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 2) {
                TextView textView6 = (TextView) C7121n1.this.m27561ua(i10);
                if (textView6 != null) {
                    textView6.setBackgroundColor(C7121n1.this.m3107M8().getResources().getColor(R$color.color_00ffffff));
                }
                TextView textView7 = (TextView) C7121n1.this.m27561ua(i10);
                if (textView7 != null) {
                    textView7.setTextColor(C7121n1.this.m3107M8().getResources().getColor(R$color.color_ffffff));
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27589a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$u */
    /* loaded from: classes3.dex */
    public static final class u extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final u f26759a = new u();

        u() {
            super(1);
        }

        /* renamed from: a */
        public final void m27590a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27590a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$v */
    /* loaded from: classes3.dex */
    public static final class v extends AbstractC5869l implements InterfaceC5660l {
        v() {
            super(1);
        }

        /* renamed from: a */
        public final void m27591a(Integer num) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            if (num != null && num.intValue() == 2) {
                TextView textView = (TextView) C7121n1.this.m27561ua(R$id.mTvSubtitle);
                if (textView != null) {
                    if (C7121n1.this.f26660O0) {
                        i12 = 66;
                    } else {
                        i12 = 48;
                    }
                    textView.setTextSize(0, AbstractC7786b.m30163g(i12));
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 3) {
                TextView textView2 = (TextView) C7121n1.this.m27561ua(R$id.mTvSubtitle);
                if (textView2 != null) {
                    if (C7121n1.this.f26660O0) {
                        i11 = 40;
                    } else {
                        i11 = 26;
                    }
                    textView2.setTextSize(0, AbstractC7786b.m30163g(i11));
                    return;
                }
                return;
            }
            TextView textView3 = (TextView) C7121n1.this.m27561ua(R$id.mTvSubtitle);
            if (textView3 != null) {
                if (C7121n1.this.f26660O0) {
                    i10 = 50;
                } else {
                    i10 = 34;
                }
                textView3.setTextSize(0, AbstractC7786b.m30163g(i10));
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27591a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$w */
    /* loaded from: classes3.dex */
    public static final class w extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final w f26761a = new w();

        w() {
            super(1);
        }

        /* renamed from: a */
        public final void m27592a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27592a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ud.n1$x */
    /* loaded from: classes3.dex */
    public static final class x implements InterfaceC4162a {

        /* renamed from: b */
        final /* synthetic */ Program f26763b;

        x(Program program) {
            this.f26763b = program;
        }

        @Override // p118eb.InterfaceC4162a
        /* renamed from: a */
        public void mo17406a() {
            AutoFrameLayout autoFrameLayout;
            C4176d c4176d = C7121n1.this.f26703z1;
            if (c4176d == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d = null;
            }
            c4176d.setVisibility(0);
            C4168g c4168g = C7121n1.this.f26697v1;
            if (c4168g != null && (autoFrameLayout = (AutoFrameLayout) C7121n1.this.m27561ua(R$id.mFlRoot)) != null) {
                autoFrameLayout.removeView(c4168g);
            }
            C7121n1.this.f26697v1 = null;
            if (C7121n1.this.f26660O0) {
                C7121n1 c7121n1 = C7121n1.this;
                int i10 = R$id.mInfoBar;
                if (!((MFInfoBar) c7121n1.m27561ua(i10)).m12202m0()) {
                    ((MFInfoBar) C7121n1.this.m27561ua(i10)).m12189A0();
                }
            }
            if (C7121n1.this.f26684i1 && C7121n1.this.f26685j1 != null) {
                C7121n1.this.f26651J1 = false;
                C7121n1 c7121n12 = C7121n1.this;
                Program program = c7121n12.f26685j1;
                AbstractC5868k.m23671c(program);
                C7121n1.m27364Fd(c7121n12, program, false, false, 6, null);
                return;
            }
            C7121n1.m27364Fd(C7121n1.this, this.f26763b, false, false, 6, null);
        }
    }

    /* renamed from: ud.n1$y */
    /* loaded from: classes3.dex */
    public static final class y implements InterfaceC5160c1 {
        y() {
        }

        @Override // p212kd.InterfaceC5160c1
        /* renamed from: a */
        public void mo20844a(int i10, String str) {
            AbstractC5868k.m23674f(str, "language");
            C7121n1.this.f26689n1 = i10;
            C7121n1.this.f26693r1 = str;
            C7121n1.this.f26690o1 = true;
            AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
            audioInfoUtil.putSubtitleSwitch(C7121n1.this.f26676a1, true);
            audioInfoUtil.putSelectSubtitle(C7121n1.this.f26676a1, i10, str);
            C7121n1 c7121n1 = C7121n1.this;
            if (!c7121n1.m27427Ub(c7121n1.f26689n1)) {
                C7121n1.this.m27458ed();
                return;
            }
            C7586l1 c7586l1 = C7586l1.f27877a;
            Context m3096J6 = C7121n1.this.m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            Context m3096J62 = C7121n1.this.m3096J6();
            AbstractC5868k.m23671c(m3096J62);
            String string = m3096J62.getString(R$string.vod_download_subtitle_fail);
            AbstractC5868k.m23673e(string, "context!!.getString(R.st…d_download_subtitle_fail)");
            c7586l1.m29114b(m3096J6, string, 1, 80);
        }

        @Override // p212kd.InterfaceC5160c1
        /* renamed from: b */
        public void mo20845b(boolean z10) {
            C7121n1.this.f26690o1 = z10;
            AudioInfoUtil.INSTANCE.putSubtitleSwitch(C7121n1.this.f26676a1, C7121n1.this.f26690o1);
            C7121n1.this.m27559od();
        }

        @Override // p212kd.InterfaceC5160c1
        /* renamed from: c */
        public void mo20846c(int i10, AudioInfoBean audioInfoBean) {
            String str = null;
            String str2 = null;
            DefinitionBean m27545Wb = C7121n1.this.m27545Wb();
            if (m27545Wb != null) {
                C4176d c4176d = null;
                if (m27545Wb.getSelectSourceIndex() != i10) {
                    m27545Wb.setSelectSourceIndex(i10);
                    SourceBean selectSource = m27545Wb.getSelectSource();
                    C7121n1 c7121n1 = C7121n1.this;
                    AudioInfoBean selectAduio = m27545Wb.getSelectSource().getSelectAduio();
                    if (selectAduio == null || (str2 = selectAduio.getLanguage()) == null) {
                        str2 = "";
                    }
                    c7121n1.f26694s1 = str2;
                    C7121n1.m27412Qc(C7121n1.this, false, 1, null);
                    MFInfoBar mFInfoBar = (MFInfoBar) C7121n1.this.m27561ua(R$id.mInfoBar);
                    if (mFInfoBar != null) {
                        mFInfoBar.setStatus(1);
                    }
                    C7121n1.this.f26673X0 = true;
                    C4176d c4176d2 = C7121n1.this.f26703z1;
                    if (c4176d2 == null) {
                        AbstractC5868k.m23686r("mVideoView");
                    } else {
                        c4176d = c4176d2;
                    }
                    c4176d.setMedia(selectSource.getContentId());
                } else {
                    AudioInfoBean selectAduio2 = m27545Wb.getSelectSource().getSelectAduio();
                    if (selectAduio2 != null) {
                        str = selectAduio2.getLanguage();
                    } else {
                        str = null;
                    }
                    int selectAudio = m27545Wb.getSelectSource().getSelectAudio();
                    C7121n1.this.f26694s1 = String.valueOf(str);
                    if (AbstractC6567a.m25637g(str)) {
                        C4176d c4176d3 = C7121n1.this.f26703z1;
                        if (c4176d3 == null) {
                            AbstractC5868k.m23686r("mVideoView");
                        } else {
                            c4176d = c4176d3;
                        }
                        AbstractC5868k.m23671c(str);
                        c4176d.m17478x(str, selectAudio);
                    }
                }
                AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
                audioInfoUtil.putRealAudioMap(C7121n1.this.f26676a1, C7121n1.this.f26694s1);
                audioInfoUtil.putAduioRecord(C7121n1.this.f26676a1, m27545Wb);
                AbstractC7598p1.m29242f(C7121n1.this.m3096J6(), C7121n1.this.m3172j7(R$string.switching_audio_tip), new int[0]);
            }
        }

        @Override // p212kd.InterfaceC5160c1
        /* renamed from: d */
        public void mo20847d(int i10) {
            AbstractC4509b.m18869b("selectSubtitle", "clickColor:" + i10, new Object[0]);
            C7121n1.this.f26692q1 = i10;
            C7121n1.this.f26690o1 = true;
            AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
            audioInfoUtil.putSubtitleColor(C7121n1.this.f26676a1, C7121n1.this.f26692q1);
            audioInfoUtil.putSubtitleSwitch(C7121n1.this.f26676a1, true);
            C7121n1.this.m27555gd();
        }

        @Override // p212kd.InterfaceC5160c1
        /* renamed from: e */
        public void mo20848e(int i10) {
            AbstractC4509b.m18869b("selectSubtitle", "clickSize:" + i10, new Object[0]);
            C7121n1.this.f26691p1 = i10;
            C7121n1.this.f26690o1 = true;
            AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
            audioInfoUtil.putSubtitleSize(C7121n1.this.f26676a1, C7121n1.this.f26691p1);
            audioInfoUtil.putSubtitleSwitch(C7121n1.this.f26676a1, true);
            C7121n1.this.m27557kd();
        }
    }

    /* renamed from: ud.n1$z */
    /* loaded from: classes3.dex */
    public static final class z implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C5876s f26766b;

        z(C5876s c5876s) {
            this.f26766b = c5876s;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = (TextView) C7121n1.this.m27561ua(R$id.mTvSubtitle);
            if (((MFInfoBar) C7121n1.this.m27561ua(R$id.mInfoBar)) != null && textView != null && C7121n1.this.m27442Yb() != null) {
                int i10 = this.f26766b.f23410a;
                if (i10 == -1) {
                    C4176d c4176d = C7121n1.this.f26703z1;
                    if (c4176d == null) {
                        AbstractC5868k.m23686r("mVideoView");
                        c4176d = null;
                    }
                    i10 = (int) c4176d.getCurrentProgress();
                }
                long m5504t = C7121n1.this.m27442Yb().m5504t(textView, i10);
                this.f26766b.f23410a = -1;
                boolean z10 = false;
                if (0 <= m5504t && m5504t < 20) {
                    z10 = true;
                }
                if (z10) {
                    m5504t = 20;
                }
                if (m5504t >= 0) {
                    C7121n1.this.m27442Yb().m5501o(m5504t, this);
                }
            }
        }
    }

    public C7121n1() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        m5965b = AbstractC1314j.m5965b(h.f26730a);
        this.f26695t1 = m5965b;
        this.f26635B1 = "";
        this.f26639D1 = new HashMap();
        this.f26641E1 = new ArrayList();
        this.f26643F1 = QualityBeanKt.getQUALITY_FHD();
        this.f26651J1 = true;
        m5965b2 = AbstractC1314j.m5965b(g.f26728a);
        this.f26655L1 = m5965b2;
        this.f26661O1 = new f();
        this.f26665Q1 = new e();
    }

    /* renamed from: Ac */
    public static final boolean m27345Ac(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* renamed from: Bc */
    private final void m27348Bc() {
        C4176d c4176d = this.f26703z1;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        c4176d.m17475u();
        ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(2);
        m27442Yb().m5497g();
    }

    /* renamed from: Bd */
    private final void m27349Bd(List list, String str) {
        SubTitleItemData subTitleItemData;
        boolean m27763v;
        if (list != null && list.size() > 0) {
            C5956n.f23662f.m24114a(0);
            String str2 = (String) C7577i1.f27838b.m29085d().m29074f("key_setting_subtitle", C4842a.f20329a.m19920a().mo19964m());
            Iterator it = list.iterator();
            while (true) {
                subTitleItemData = null;
                if (!it.hasNext()) {
                    break;
                }
                SubTitleItemData subTitleItemData2 = (SubTitleItemData) it.next();
                String language = subTitleItemData2.getLanguage();
                if (language == null) {
                    language = "";
                }
                m27763v = AbstractC7167u.m27763v(str2, language, false, 2, null);
                if (m27763v) {
                    subTitleItemData = subTitleItemData2;
                    break;
                }
            }
            if (subTitleItemData != null) {
                list.remove(subTitleItemData);
                list.add(0, subTitleItemData);
            }
            C1251l2 m27438Xb = m27438Xb();
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            C1251l2.m5641j(m27438Xb, m3107M8, str, list, null, 8, null);
        }
    }

    /* renamed from: Cd */
    private final void m27352Cd(StartPlayVODResultData startPlayVODResultData, int i10) {
        Disposable disposable;
        Disposable disposable2 = this.f26657M1;
        if (disposable2 != null) {
            AbstractC5868k.m23671c(disposable2);
            if (!disposable2.isDisposed() && (disposable = this.f26657M1) != null) {
                disposable.dispose();
            }
        }
        Observable<Long> intervalRange = Observable.intervalRange(0L, 45L, 0L, 2L, TimeUnit.SECONDS);
        final b0 b0Var = b0.f26712a;
        Observable<Long> filter = intervalRange.filter(new Predicate() { // from class: ud.t0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m27356Dd;
                m27356Dd = C7121n1.m27356Dd(InterfaceC5660l.this, obj);
                return m27356Dd;
            }
        });
        AbstractC5868k.m23673e(filter, "intervalRange(0, 45, 0, …bFinish\n                }");
        AbstractC6567a.m25631a(filter, m19902N3()).compose(AbstractC7029f.m27120a()).subscribe(new c0(startPlayVODResultData, i10));
    }

    /* renamed from: Dc */
    public static /* synthetic */ void m27355Dc(C7121n1 c7121n1, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        c7121n1.m27537Cc(i10, z10);
    }

    /* renamed from: Dd */
    public static final boolean m27356Dd(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* renamed from: Ec */
    public final void m27359Ec(Program program) {
        String str = null;
        String str2 = null;
        String hasPay = null;
        if (m3096J6() != null && !m3192t7()) {
            this.f26687l1 = program;
            C6156m c6156m = C6156m.f24180a;
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            String m23094g = C5714a.f22937a.m23094g();
            q qVar = new q(program);
            C1466m0 c1466m0 = C1466m0.f5627a;
            UserInfo m6887v = c1466m0.m6887v();
            if (m6887v == null || (str = m6887v.getUserIdentity()) == null) {
                str = "1";
            }
            UserInfo m6887v2 = c1466m0.m6887v();
            if (m6887v2 == null || (hasPay = m6887v2.getHasPay()) == null) {
                str2 = "1";
            } else {
                str2 = hasPay;
            }
            C6156m.m24511D(c6156m, m3107M8, m23094g, qVar, str, false, str2, 16, null);
        }
    }

    /* renamed from: Ed */
    private final void m27360Ed(final Program program, boolean z10, boolean z11) {
        if (AbstractC5868k.m23669a(program.getName(), this.f26675Z0)) {
            this.f26659N1 = false;
            Observable compose = Observable.fromCallable(new Callable() { // from class: ud.m1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean m27369Gd;
                    m27369Gd = C7121n1.m27369Gd(C7121n1.this, program);
                    return m27369Gd;
                }
            }).compose(AbstractC7029f.m27121b());
            final d0 d0Var = new d0(z10, z11, program);
            Consumer consumer = new Consumer() { // from class: ud.a0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7121n1.m27374Hd(InterfaceC5660l.this, obj);
                }
            };
            final e0 e0Var = e0.f26725a;
            compose.subscribe(consumer, new Consumer() { // from class: ud.b0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7121n1.m27379Id(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    /* renamed from: Fc */
    private final void m27363Fc(final HashMap hashMap, String str, boolean z10) {
        boolean z11 = false;
        int i10 = 0;
        String str2 = null;
        String str3 = null;
        String name = null;
        String contentId = null;
        if (hashMap.isEmpty()) {
            return;
        }
        C1456h0 c1456h0 = C1456h0.f5574a;
        C1456h0.a aVar = C1456h0.a.VOD;
        List m6773i = c1456h0.m6773i(aVar);
        final List m6774j = c1456h0.m6774j(aVar);
        if (m6773i != null && !m6773i.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            int m6917a = C1473s.f5656a.m6917a();
            if (m6917a == 0) {
                i10 = 20900;
            } else {
                i10 = m6917a;
            }
            AbstractActivityC0712e m3075C6 = m3075C6();
            AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
            AbstractActivityC2972a abstractActivityC2972a = (AbstractActivityC2972a) m3075C6;
            C7617x c7617x = C7617x.f28030a;
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            String m29327c = C7617x.m29327c(c7617x, m3107M8, String.valueOf(i10), false, 4, null);
            AssetData assetData = this.f26632A0;
            if (assetData == null || (contentId = assetData.getContentId()) == null) {
                str2 = "";
            } else {
                str2 = contentId;
            }
            AssetData assetData2 = this.f26632A0;
            if (assetData2 == null || (name = assetData2.getName()) == null) {
                str3 = "";
            } else {
                str3 = name;
            }
            AbstractActivityC2972a.m11962b6(abstractActivityC2972a, i10, false, null, m29327c, "apk", "vod", str2, str3, "", "", null, EventType.AUTH_FAIL, null);
            this.f26669T0 = false;
            this.f26666R0 = true;
            this.f26668S0 = true;
            return;
        }
        final C5878u c5878u = new C5878u();
        final C5878u c5878u2 = new C5878u();
        final C5878u c5878u3 = new C5878u();
        final C5878u c5878u4 = new C5878u();
        final ArrayList arrayList = new ArrayList();
        C5878u c5878u5 = new C5878u();
        c5878u5.f23412a = new ArrayList();
        this.f26664Q0.clear();
        Disposable disposable = this.f26637C1;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: ud.h1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C7121n1.m27373Hc(hashMap, c5878u3, c5878u4, this, arrayList, c5878u2, c5878u, m6774j, observableEmitter);
            }
        }).compose(AbstractC7029f.m27120a());
        final r rVar = new r(c5878u5, c5878u4, this, arrayList, str);
        Consumer consumer = new Consumer() { // from class: ud.i1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27378Ic(InterfaceC5660l.this, obj);
            }
        };
        final s sVar = s.f26757a;
        this.f26637C1 = compose.subscribe(consumer, new Consumer() { // from class: ud.j1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27383Jc(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: ud.k1
            @Override // io.reactivex.functions.Action
            public final void run() {
                C7121n1.m27387Kc();
            }
        });
    }

    /* renamed from: Fd */
    static /* synthetic */ void m27364Fd(C7121n1 c7121n1, Program program, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        c7121n1.m27360Ed(program, z10, z11);
    }

    /* renamed from: Gc */
    static /* synthetic */ void m27368Gc(C7121n1 c7121n1, HashMap hashMap, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        c7121n1.m27363Fc(hashMap, str, z10);
    }

    /* renamed from: Gd */
    public static final Boolean m27369Gd(C7121n1 c7121n1, Program program) {
        AbstractC5868k.m23674f(c7121n1, "this$0");
        AbstractC5868k.m23674f(program, "$result");
        return Boolean.valueOf(m27398Nb(c7121n1, program, 0, 2, null));
    }

    /* renamed from: Hc */
    public static final void m27373Hc(HashMap hashMap, C5878u c5878u, C5878u c5878u2, C7121n1 c7121n1, ArrayList arrayList, C5878u c5878u3, C5878u c5878u4, List list, ObservableEmitter observableEmitter) {
        List list2;
        boolean z10 = false;
        Iterator it;
        String str = null;
        int i10 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Object m7008t = null;
        List<String> list3;
        boolean z11 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        C5878u c5878u5 = c5878u2;
        AbstractC5868k.m23674f(hashMap, "$map");
        AbstractC5868k.m23674f(c5878u, "$sourceBeanList");
        AbstractC5868k.m23674f(c5878u5, "$playVODResultDataItem");
        AbstractC5868k.m23674f(c7121n1, "this$0");
        AbstractC5868k.m23674f(arrayList, "$mediaList");
        AbstractC5868k.m23674f(c5878u3, "$audioInfoBeanList");
        AbstractC5868k.m23674f(c5878u4, "$audioTag");
        AbstractC5868k.m23674f(list, "$cdnTagList");
        AbstractC5868k.m23674f(observableEmitter, "it");
        Iterator it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str10 = (String) entry.getKey();
            TotalMovieListItem totalMovieListItem = (TotalMovieListItem) entry.getValue();
            c5878u.f23412a = new ArrayList();
            c5878u5.f23412a = totalMovieListItem;
            String quality = totalMovieListItem.getQuality();
            String str11 = "";
            if (quality == null) {
                quality = "";
            }
            List<MovieList> movieList = totalMovieListItem.getMovieList();
            AbstractC5868k.m23671c(movieList);
            for (MovieList movieList2 : movieList) {
                List<LicenseData> licenseList = movieList2.getLicenseList();
                if (licenseList != null && !licenseList.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z12 = !z10;
                LicenseData licenseData = null;
                if (AbstractC5868k.m23669a(c7121n1.f26643F1.getQualityValue(), str10)) {
                    String audioInfo = movieList2.getAudioInfo();
                    if (audioInfo != null) {
                        list3 = AbstractC7167u.m27748R(audioInfo, new String[]{","}, false, 0, 6, null);
                    } else {
                        list3 = null;
                    }
                    c5878u3.f23412a = new ArrayList();
                    if (list3 != null && !list3.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    String str12 = "unkown";
                    if (!z11 && !TextUtils.isEmpty(movieList2.getAudioInfo())) {
                        String audioInfo2 = movieList2.getAudioInfo();
                        if (audioInfo2 != null) {
                            str12 = audioInfo2;
                        }
                        c5878u4.f23412a = str12;
                        for (String str13 : list3) {
                            List list4 = (List) c5878u3.f23412a;
                            String contentId = movieList2.getContentId();
                            if (contentId == null) {
                                str9 = str11;
                            } else {
                                str9 = contentId;
                            }
                            list4.add(new AudioInfoBean(str9, quality, str13, null, 8, null));
                            str11 = str11;
                            it2 = it2;
                        }
                        it = it2;
                        str = str11;
                        i10 = 0;
                    } else {
                        it = it2;
                        str = str11;
                        i10 = 0;
                        c5878u4.f23412a = "unkown";
                        List list5 = (List) c5878u3.f23412a;
                        String contentId2 = movieList2.getContentId();
                        if (contentId2 == null) {
                            str7 = str;
                        } else {
                            str7 = contentId2;
                        }
                        list5.add(new AudioInfoBean(str7, quality, "unkown", null, 8, null));
                    }
                    List list6 = (List) c5878u.f23412a;
                    String contentId3 = movieList2.getContentId();
                    if (contentId3 == null) {
                        str8 = str;
                    } else {
                        str8 = contentId3;
                    }
                    list6.add(new SourceBean(str8, (String) c5878u4.f23412a, (List) c5878u3.f23412a, z12, 0, 16, null));
                } else {
                    it = it2;
                    str = str11;
                    i10 = 0;
                }
                if (z12) {
                    List<LicenseData> licenseList2 = movieList2.getLicenseList();
                    if (licenseList2 != null) {
                        m7008t = AbstractC1508t.m7008t(licenseList2, i10);
                        licenseData = (LicenseData) m7008t;
                    }
                    AbstractC5868k.m23671c(licenseData);
                    if (list.contains(licenseData.getTag())) {
                        String contentId4 = movieList2.getContentId();
                        if (contentId4 == null) {
                            str2 = str;
                        } else {
                            str2 = contentId4;
                        }
                        String license = licenseData.getLicense();
                        String audioInfo3 = movieList2.getAudioInfo();
                        if (audioInfo3 == null) {
                            str3 = str;
                        } else {
                            str3 = audioInfo3;
                        }
                        String quality2 = totalMovieListItem.getQuality();
                        if (quality2 == null) {
                            str4 = str;
                        } else {
                            str4 = quality2;
                        }
                        String encodeFormat = movieList2.getEncodeFormat();
                        if (encodeFormat == null) {
                            str5 = str;
                        } else {
                            str5 = encodeFormat;
                        }
                        String videoFormat = movieList2.getVideoFormat();
                        if (videoFormat == null) {
                            str6 = str;
                        } else {
                            str6 = videoFormat;
                        }
                        arrayList.add(new Media(str2, license, str3, str4, str5, str6));
                    }
                }
                str11 = str;
                it2 = it;
            }
            Iterator it3 = it2;
            if (AbstractC6567a.m25638h((List) c5878u.f23412a) && (list2 = c7121n1.f26664Q0) != null) {
                list2.add(new DefinitionBean(str10, (List) c5878u.f23412a, 0, 4, null));
            }
            c5878u5 = c5878u2;
            it2 = it3;
        }
        observableEmitter.onNext(arrayList);
        observableEmitter.onComplete();
    }

    /* renamed from: Hd */
    public static final void m27374Hd(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: Ic */
    public static final void m27378Ic(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: Id */
    public static final void m27379Id(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: Jb */
    public final void m27382Jb(HashMap hashMap) {
        if (!hashMap.containsKey(this.f26643F1.getQualityValue())) {
            if (AbstractC5868k.m23669a(this.f26643F1.getQualityValue(), "480p")) {
                if (hashMap.containsKey("720p")) {
                    this.f26643F1 = QualityBeanKt.getQUALITY_HD();
                } else if (hashMap.containsKey("1080p")) {
                    this.f26643F1 = QualityBeanKt.getQUALITY_FHD();
                }
            } else if (AbstractC5868k.m23669a(this.f26643F1.getQualityValue(), "720p")) {
                if (hashMap.containsKey("1080p")) {
                    this.f26643F1 = QualityBeanKt.getQUALITY_FHD();
                } else if (hashMap.containsKey("480p")) {
                    this.f26643F1 = QualityBeanKt.getQUALITY_SD();
                }
            } else if (AbstractC5868k.m23669a(this.f26643F1.getQualityValue(), "1080p")) {
                if (hashMap.containsKey("720p")) {
                    this.f26643F1 = QualityBeanKt.getQUALITY_HD();
                } else if (hashMap.containsKey("480p")) {
                    this.f26643F1 = QualityBeanKt.getQUALITY_SD();
                }
            }
            C7259b.f27144a.m28093b(this.f26643F1.getQualityInt());
        }
    }

    /* renamed from: Jc */
    public static final void m27383Jc(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: Kb */
    private final void m27386Kb() {
        Disposable disposable;
        Disposable disposable2 = this.f26671V0;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f26671V0) != null) {
            disposable.dispose();
        }
    }

    /* renamed from: Kc */
    public static final void m27387Kc() {
    }

    /* renamed from: Kd */
    public final boolean m27388Kd(List list, int i10) {
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        QualityBean quality_fhd;
        String str = null;
        List<SimpleProgramList> simpleProgramList;
        VodQualityBean vodQualityBean = (VodQualityBean) list.get(i10);
        int i13 = 0;
        if (!AbstractC5868k.m23669a(vodQualityBean.getQualityValue(), QualityBeanKt.getQUALITY_SD().getQualityValue()) ? !(!AbstractC5868k.m23669a(vodQualityBean.getQualityValue(), QualityBeanKt.getQUALITY_HD().getQualityValue()) ? !AbstractC5868k.m23669a(vodQualityBean.getQualityValue(), QualityBeanKt.getQUALITY_FHD().getQualityValue()) || !vodQualityBean.isAuth() : !vodQualityBean.isAuth()) : vodQualityBean.isAuth()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!C1466m0.f5627a.m6841N()) {
                AbstractC7598p1.m29243g(m3096J6(), m3172j7(R$string.play_not_vip), new int[0]);
            } else {
                AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.vod_detail_un_support_quality), new int[0]);
            }
            return z10;
        }
        if (!this.f26660O0) {
            AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.vod_tips_switch_quality), new int[0]);
        }
        AssetData assetData = this.f26632A0;
        if (assetData != null && (simpleProgramList = assetData.getSimpleProgramList()) != null) {
            i11 = simpleProgramList.size();
        } else {
            i11 = 0;
        }
        if (i11 > 0 && (i12 = this.f26644G0) >= 0 && i12 < i11) {
            m27412Qc(this, false, 1, null);
            String qualityValue = vodQualityBean.getQualityValue();
            if (AbstractC5868k.m23669a(qualityValue, QualityBeanKt.getQUALITY_SD().getQualityValue())) {
                quality_fhd = QualityBeanKt.getQUALITY_SD();
            } else if (AbstractC5868k.m23669a(qualityValue, QualityBeanKt.getQUALITY_HD().getQualityValue())) {
                quality_fhd = QualityBeanKt.getQUALITY_HD();
            } else {
                quality_fhd = QualityBeanKt.getQUALITY_FHD();
            }
            this.f26643F1 = quality_fhd;
            C7259b.f27144a.m28093b(quality_fhd.getQualityInt());
            int size = this.f26641E1.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (AbstractC5868k.m23669a(((VodQualityBean) this.f26641E1.get(i14)).getQualityValue(), this.f26643F1.getQualityValue())) {
                    ((MFInfoBar) m27561ua(R$id.mInfoBar)).setQualitySelection(i14);
                }
            }
            int size2 = this.f26664Q0.size();
            while (true) {
                if (i13 >= size2) {
                    break;
                }
                if (AbstractC5868k.m23669a(((DefinitionBean) this.f26664Q0.get(i13)).getQuality(), this.f26643F1.getQualityValue())) {
                    this.f26670U0 = i13;
                    break;
                }
                i13++;
            }
            HashMap hashMap = this.f26639D1;
            SimpleProgramList simpleProgramList2 = this.f26634B0;
            if (simpleProgramList2 == null || (str = simpleProgramList2.getContentId()) == null) {
                str = "";
            }
            m27368Gc(this, hashMap, str, false, 4, null);
            return true;
        }
        AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.vod_detail_un_support_quality), new int[0]);
        return false;
    }

    /* renamed from: Lc */
    private final void m27391Lc() {
        this.f26677b1 = false;
        ((TextView) m27561ua(R$id.mTvPlayTip)).setVisibility(8);
        m27416Rb();
    }

    /* renamed from: Mb */
    private final boolean m27394Mb(Program program, int i10) {
        String str = null;
        boolean z10 = false;
        this.f26701y1 = null;
        C5911g.a aVar = C5911g.f23514h;
        if (aVar.m23905a().m23900q()) {
            if (i10 == -1) {
                RecordAudioInfoBean aduioRecord = AudioInfoUtil.INSTANCE.getAduioRecord(this.f26676a1);
                if (aduioRecord != null) {
                    i10 = aduioRecord.getSourceIndex();
                } else {
                    i10 = -1;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            if (program == null || (str = program.getName()) == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append('_');
            sb2.append(i10);
            Progress m17670p = C4224c.m17666u().m17670p(sb2.toString());
            this.f26701y1 = m17670p;
            if (m17670p != null && m17670p.status == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (new File(aVar.m23905a().m23897l() + '/' + m17670p.filePath).exists()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Mc */
    private final void m27395Mc() {
        ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(0);
        this.f26666R0 = false;
        this.f26668S0 = false;
        m27435Wc();
        if (this.f26656M0) {
            m27497pd();
        }
    }

    /* renamed from: Nb */
    static /* synthetic */ boolean m27398Nb(C7121n1 c7121n1, Program program, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = -1;
        }
        return c7121n1.m27394Mb(program, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r0 != false) goto L34;
     */
    /* renamed from: Nd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27399Nd(p358ud.C7121n1 r2, java.lang.String r3, java.util.List r4, io.reactivex.ObservableEmitter r5) {
        /*
            java.lang.String r0 = "this$0"
            ne.AbstractC5868k.m23674f(r2, r0)
            java.lang.String r0 = "$programId"
            ne.AbstractC5868k.m23674f(r3, r0)
            java.lang.String r0 = "it"
            ne.AbstractC5868k.m23674f(r5, r0)
            java.lang.String r5 = r2.f26676a1
            java.lang.String r0 = r2.f26640E0
            java.lang.String r1 = "1"
            boolean r0 = ne.AbstractC5868k.m23669a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L2b
            if (r5 == 0) goto L27
            int r0 = r5.length()
            if (r0 != 0) goto L25
            goto L27
        L25:
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r3 = r5
        L2c:
            java.lang.Class<l2.g> r5 = p217l2.InterfaceC5346g.class
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object r5 = mc.C5634i.m22844e(r5, r0)
            l2.g r5 = (p217l2.InterfaceC5346g) r5
            if (r5 == 0) goto L43
            fa.d r0 = p132fa.C4300d.f18678a
            int r0 = r0.m18068x0()
            com.module.bean.Album r3 = r5.mo20790g(r3, r0)
            goto L44
        L43:
            r3 = 0
        L44:
            if (r3 == 0) goto L48
            r2.f26647H1 = r3
        L48:
            r2.m27554dc(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p358ud.C7121n1.m27399Nd(ud.n1, java.lang.String, java.util.List, io.reactivex.ObservableEmitter):void");
    }

    /* renamed from: Ob */
    public final void m27402Ob(Program program) {
        Observable observeOn = Observable.create(new ObservableOnSubscribe() { // from class: ud.d1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C7121n1.m27407Pb(C7121n1.this, observableEmitter);
            }
        }).subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        final a aVar = new a(program);
        this.f26686k1 = observeOn.subscribe(new Consumer() { // from class: ud.e1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27411Qb(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: Oc */
    private final void m27403Oc() {
        C4176d c4176d = this.f26703z1;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        c4176d.m17476v();
        ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(3);
        m27535zd(this, 0, 1, null);
    }

    /* renamed from: Od */
    public static final void m27404Od(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: Pb */
    public static final void m27407Pb(C7121n1 c7121n1, ObservableEmitter observableEmitter) {
        Link link;
        AbstractC5868k.m23674f(c7121n1, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        InterfaceC5346g interfaceC5346g = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
        if (interfaceC5346g != null) {
            link = interfaceC5346g.mo20786c(c7121n1.f26675Z0);
        } else {
            link = null;
        }
        if (link == null) {
            link = new Link();
        }
        observableEmitter.onNext(link);
        observableEmitter.onComplete();
    }

    /* renamed from: Pd */
    public static final void m27408Pd(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: Qb */
    public static final void m27411Qb(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: Qc */
    public static /* synthetic */ void m27412Qc(C7121n1 c7121n1, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c7121n1.m27543Pc(z10);
    }

    /* renamed from: Qd */
    public final void m27413Qd(HashMap hashMap) {
        this.f26639D1.clear();
        this.f26639D1.putAll(hashMap);
    }

    /* renamed from: Rb */
    private final void m27416Rb() {
        String str = null;
        int[] iArr;
        int[] iArr2;
        this.f26669T0 = false;
        String str2 = "";
        if (!AbstractC5868k.m23669a(this.f26640E0, MessageService.MSG_DB_READY_REPORT)) {
            str = "";
        } else {
            str = this.f26638D0;
        }
        if (AbstractC5868k.m23669a(this.f26640E0, MessageService.MSG_DB_READY_REPORT)) {
            int i10 = this.f26678c1;
            if (i10 <= 1 && this.f26644G0 == 0) {
                iArr2 = new int[]{0, 1};
            } else {
                int i11 = this.f26674Y0;
                if (i11 != 0 && i10 + 1 > i11) {
                    iArr2 = new int[]{i10};
                } else {
                    iArr2 = new int[]{i10, i10 + 1};
                }
            }
            str2 = "1";
            iArr = iArr2;
        } else {
            iArr = null;
        }
        this.f26633A1 = null;
        this.f26687l1 = null;
        ((C6465e0) m5478w9()).m25295Y0(this.f26636C0, this.f26638D0, str, this.f26642F0, 0, str2, iArr);
    }

    /* renamed from: Rc */
    public static final void m27417Rc(AssetData assetData, int i10, C7121n1 c7121n1, SimpleProgramList simpleProgramList, int i11, C5876s c5876s) {
        Album album;
        Integer num;
        int i12 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i13 = 0;
        String str5 = null;
        int i14 = 0;
        String str6 = null;
        String str7 = null;
        Link link;
        String m27728o = null;
        String str8 = null;
        InterfaceC5346g interfaceC5346g;
        InterfaceC5346g interfaceC5346g2;
        String str9 = null;
        AbstractC5868k.m23674f(c7121n1, "this$0");
        AbstractC5868k.m23674f(c5876s, "$recordTime");
        if (assetData != null && i10 > 5000) {
            synchronized (C7121n1.class) {
                InterfaceC5346g interfaceC5346g3 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
                String str10 = null;
                if (interfaceC5346g3 != null) {
                    album = interfaceC5346g3.mo20790g(assetData.getContentId(), C4300d.f18678a.m18068x0());
                } else {
                    album = null;
                }
                if (album == null) {
                    album = new Album();
                    album.setTypeId(C4300d.f18678a.m18068x0());
                    album.setContentId(assetData.getContentId());
                }
                album.setAlbumType(assetData.getProgramType());
                album.setShelveType(c7121n1.f26640E0);
                album.setAlbumTitle(assetData.getName());
                album.setAlbumPic(C7594o0.f27942a.m29220i(assetData.getPosterList(), C7594o0.a.Icon));
                album.setMovieRate(assetData.getScore());
                if (simpleProgramList != null) {
                    num = Integer.valueOf(simpleProgramList.getSeriesNumber());
                } else {
                    num = null;
                }
                album.setPlayIndexTitle(String.valueOf(num));
                album.setPostiveplayIndex(i11);
                List<SimpleProgramList> simpleProgramList2 = assetData.getSimpleProgramList();
                if (simpleProgramList2 != null) {
                    i12 = simpleProgramList2.size();
                } else {
                    i12 = 0;
                }
                album.setStreamNumber(i12);
                album.setAlbumState(assetData.getUpdateCount());
                album.setTotalNum(assetData.getVolumnCount());
                album.setTime(AbstractC7598p1.m29240d());
                album.setAlias(assetData.getAlias());
                String contentType = assetData.getContentType();
                if (contentType == null) {
                    contentType = "";
                }
                album.setContentType(contentType);
                AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
                AssetData assetData2 = c7121n1.f26632A0;
                if (assetData2 == null || (str = assetData2.getContentId()) == null) {
                    str = "";
                }
                Object selectSwitch = audioInfoUtil.getSelectSwitch(str);
                if (selectSwitch == null) {
                    selectSwitch = "";
                }
                album.setSubLanguageSwitch(selectSwitch.toString());
                AssetData assetData3 = c7121n1.f26632A0;
                if (assetData3 == null || (str2 = assetData3.getContentId()) == null) {
                    str2 = "";
                }
                RecordSubtitleInfoBean selectSubtitle = audioInfoUtil.getSelectSubtitle(str2);
                if (selectSubtitle != null) {
                    str3 = selectSubtitle.getSubTitleLanguage();
                } else {
                    str3 = null;
                }
                album.setSubLanguage(str3);
                AssetData assetData4 = c7121n1.f26632A0;
                if (assetData4 == null || (str4 = assetData4.getContentId()) == null) {
                    str4 = "";
                }
                RecordSubtitleInfoBean selectSubtitle2 = audioInfoUtil.getSelectSubtitle(str4);
                int i15 = -1;
                if (selectSubtitle2 != null) {
                    i13 = selectSubtitle2.getSubtitleIndex();
                } else {
                    i13 = -1;
                }
                album.setSubIndex(i13);
                AssetData assetData5 = c7121n1.f26632A0;
                if (assetData5 == null || (str5 = assetData5.getContentId()) == null) {
                    str5 = "";
                }
                Integer subtitleSize = audioInfoUtil.getSubtitleSize(str5);
                if (subtitleSize != null) {
                    i14 = subtitleSize.intValue();
                } else {
                    i14 = -1;
                }
                album.setSubSize(i14);
                AssetData assetData6 = c7121n1.f26632A0;
                if (assetData6 == null || (str6 = assetData6.getContentId()) == null) {
                    str6 = "";
                }
                Integer subtitleColor = audioInfoUtil.getSubtitleColor(str6);
                if (subtitleColor != null) {
                    i15 = subtitleColor.intValue();
                }
                album.setSubStyle(i15);
                AssetData assetData7 = c7121n1.f26632A0;
                if (assetData7 == null || (str7 = assetData7.getContentId()) == null) {
                    str7 = "";
                }
                String realAudioMap = audioInfoUtil.getRealAudioMap(str7);
                if (realAudioMap == null) {
                    realAudioMap = "";
                }
                album.setRealAudio(realAudioMap);
                InterfaceC5346g interfaceC5346g4 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
                if (interfaceC5346g4 != null) {
                    interfaceC5346g4.mo20788e(album);
                }
                InterfaceC5346g interfaceC5346g5 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
                if (interfaceC5346g5 != null) {
                    if (simpleProgramList == null || (str9 = simpleProgramList.getContentId()) == null) {
                        str9 = "";
                    }
                    link = interfaceC5346g5.mo20786c(str9);
                } else {
                    link = null;
                }
                if (link == null) {
                    link = new Link();
                    link.setProgramId(assetData.getContentId());
                    if (simpleProgramList != null) {
                        str10 = simpleProgramList.getContentId();
                    }
                    link.setContentId(str10);
                }
                link.setRecordTime(c5876s.f23410a);
                InterfaceC5346g interfaceC5346g6 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
                if (interfaceC5346g6 != null) {
                    interfaceC5346g6.mo20789f(link);
                }
                if (C4842a.f20329a.m19920a().m19976y()) {
                    String m20595e = AbstractC5085b.m20595e();
                    AbstractC5868k.m23673e(m20595e, "getEnglishAppName()");
                    m27728o = AbstractC7166t.m27728o(m20595e, " ", "", false, 4, null);
                    Locale locale = Locale.US;
                    AbstractC5868k.m23673e(locale, "US");
                    String lowerCase = m27728o.toLowerCase(locale);
                    AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String str11 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db_" + lowerCase;
                    AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
                    Context m29494a = aVar.m29494a();
                    InterfaceC5346g interfaceC5346g7 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
                    if (interfaceC5346g7 == null || (str8 = interfaceC5346g7.mo20784a()) == null) {
                        str8 = "";
                    }
                    String path = m29494a.getDatabasePath(str8).getPath();
                    String str12 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-shm_" + lowerCase;
                    String path2 = aVar.m29494a().getDatabasePath("user_vod.db-shm").getPath();
                    String str13 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-wal_" + lowerCase;
                    String path3 = aVar.m29494a().getDatabasePath("user_vod.db-wal").getPath();
                    InterfaceC5346g interfaceC5346g8 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
                    if (interfaceC5346g8 != null) {
                        AbstractC5868k.m23673e(path, "oldPath");
                        interfaceC5346g8.mo20787d(path, str11);
                    }
                    if (new File(path2).exists() && (interfaceC5346g2 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0])) != null) {
                        AbstractC5868k.m23673e(path2, "oldPath1");
                        interfaceC5346g2.mo20787d(path2, str12);
                    }
                    if (new File(path3).exists() && (interfaceC5346g = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0])) != null) {
                        AbstractC5868k.m23673e(path3, "oldPath2");
                        interfaceC5346g.mo20787d(path3, str13);
                    }
                }
                C1328x c1328x = C1328x.f4998a;
            }
        }
    }

    /* renamed from: Sb */
    private final void m27420Sb() {
        String str = null;
        if (this.f26646H0) {
            return;
        }
        final C5878u c5878u = new C5878u();
        AssetData assetData = this.f26632A0;
        if (assetData != null) {
            if (assetData != null) {
                str = assetData.getContentId();
            } else {
                str = null;
            }
        } else {
            str = this.f26638D0;
        }
        c5878u.f23412a = str;
        if (str == null) {
            return;
        }
        AbstractC7030g.m27129c("delete album", new Runnable() { // from class: ud.y0
            @Override // java.lang.Runnable
            public final void run() {
                C7121n1.m27424Tb(C5878u.this);
            }
        }, false);
    }

    /* renamed from: Sc */
    private final void m27421Sc(boolean z10) {
        long currentProgress;
        long j10;
        int i10 = 0;
        C4176d c4176d = this.f26703z1;
        C4176d c4176d2 = null;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        if (!c4176d.m17473r()) {
            C4176d c4176d3 = this.f26703z1;
            if (c4176d3 == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d3 = null;
            }
            c4176d3.m17476v();
            ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(3);
        }
        if (z10) {
            C4176d c4176d4 = this.f26703z1;
            if (c4176d4 == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d4 = null;
            }
            currentProgress = c4176d4.getCurrentProgress() + 10000;
        } else {
            C4176d c4176d5 = this.f26703z1;
            if (c4176d5 == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d5 = null;
            }
            currentProgress = c4176d5.getCurrentProgress() - 10000;
        }
        C4176d c4176d6 = this.f26703z1;
        if (c4176d6 == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d6 = null;
        }
        C4176d c4176d7 = this.f26703z1;
        if (c4176d7 == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d7 = null;
        }
        if (currentProgress >= c4176d7.getDuration()) {
            j10 = currentProgress - 1000;
        } else {
            j10 = currentProgress;
        }
        c4176d6.m17477w(j10);
        C4176d c4176d8 = this.f26703z1;
        if (c4176d8 == null) {
            AbstractC5868k.m23686r("mVideoView");
        } else {
            c4176d2 = c4176d8;
        }
        if (currentProgress >= c4176d2.getDuration()) {
            i10 = ((int) currentProgress) - 1000;
        } else {
            i10 = (int) currentProgress;
        }
        m27531yd(i10);
    }

    /* renamed from: Tb */
    public static final void m27424Tb(C5878u c5878u) {
        String m27728o = null;
        String str = null;
        InterfaceC5346g interfaceC5346g;
        InterfaceC5346g interfaceC5346g2;
        AbstractC5868k.m23674f(c5878u, "$targetContentId");
        synchronized (C7121n1.class) {
            InterfaceC5346g interfaceC5346g3 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
            if (interfaceC5346g3 != null) {
                interfaceC5346g3.mo20785b(C4300d.f18678a.m18068x0(), (String) c5878u.f23412a);
            }
            if (C4842a.f20329a.m19920a().m19976y()) {
                String m20595e = AbstractC5085b.m20595e();
                AbstractC5868k.m23673e(m20595e, "getEnglishAppName()");
                m27728o = AbstractC7166t.m27728o(m20595e, " ", "", false, 4, null);
                Locale locale = Locale.US;
                AbstractC5868k.m23673e(locale, "US");
                String lowerCase = m27728o.toLowerCase(locale);
                AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db_" + lowerCase;
                AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
                Context m29494a = aVar.m29494a();
                InterfaceC5346g interfaceC5346g4 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
                if (interfaceC5346g4 == null || (str = interfaceC5346g4.mo20784a()) == null) {
                    str = "";
                }
                String path = m29494a.getDatabasePath(str).getPath();
                String str3 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-shm_" + lowerCase;
                String path2 = aVar.m29494a().getDatabasePath("user_vod.db-shm").getPath();
                String str4 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-wal_" + lowerCase;
                String path3 = aVar.m29494a().getDatabasePath("user_vod.db-wal").getPath();
                InterfaceC5346g interfaceC5346g5 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
                if (interfaceC5346g5 != null) {
                    AbstractC5868k.m23673e(path, "oldPath");
                    interfaceC5346g5.mo20787d(path, str2);
                }
                if (new File(path2).exists() && (interfaceC5346g2 = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0])) != null) {
                    AbstractC5868k.m23673e(path2, "oldPath1");
                    interfaceC5346g2.mo20787d(path2, str3);
                }
                if (new File(path3).exists() && (interfaceC5346g = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0])) != null) {
                    AbstractC5868k.m23673e(path3, "oldPath2");
                    interfaceC5346g.mo20787d(path3, str4);
                }
            }
            C1328x c1328x = C1328x.f4998a;
        }
    }

    /* renamed from: Ub */
    public final boolean m27427Ub(int i10) {
        SubTitleItemData subTitleItemData;
        List<SubTitleFileList> file;
        Object m7008t = null;
        if (AbstractC6567a.m25635e(this.f26688m1)) {
            return false;
        }
        List list = this.f26688m1;
        if (list != null) {
            m7008t = AbstractC1508t.m7008t(list, i10);
            subTitleItemData = (SubTitleItemData) m7008t;
        } else {
            subTitleItemData = null;
        }
        if (subTitleItemData == null || (file = subTitleItemData.getFile()) == null) {
            return false;
        }
        for (SubTitleFileList subTitleFileList : file) {
            if (AbstractC5868k.m23669a(subTitleFileList.getFileType(), "srt")) {
                if (!subTitleFileList.getDownloadFinished() || !subTitleFileList.getDownloadError()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: Uc */
    public final void m27428Uc() {
        int size = this.f26641E1.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC4509b.m18869b(this.f26700y0, "setDefaultLandQuality:" + this.f26643F1.getQualityValue(), new Object[0]);
            if (AbstractC5868k.m23669a(((VodQualityBean) this.f26641E1.get(i10)).getQualityValue(), this.f26643F1.getQualityValue())) {
                AbstractC4509b.m18869b(this.f26700y0, "setDefaultLandQuality:position" + i10, new Object[0]);
                ((MFInfoBar) m27561ua(R$id.mInfoBar)).setQualitySelection(i10);
            }
        }
    }

    /* renamed from: Vb */
    private final void m27431Vb() {
        m27403Oc();
    }

    /* renamed from: Vc */
    public final void m27432Vc() {
        QualityBean quality_sd;
        int m28092a = C7259b.f27144a.m28092a();
        if (m28092a != 1) {
            if (m28092a != 2) {
                if (m28092a != 3) {
                    quality_sd = QualityBeanKt.getQUALITY_FHD();
                } else {
                    quality_sd = QualityBeanKt.getQUALITY_FHD();
                }
            } else {
                quality_sd = QualityBeanKt.getQUALITY_HD();
            }
        } else {
            quality_sd = QualityBeanKt.getQUALITY_SD();
        }
        this.f26643F1 = quality_sd;
    }

    /* renamed from: Wc */
    private final void m27435Wc() {
        if (this.f26632A0 != null) {
            MFInfoBar mFInfoBar = (MFInfoBar) m27561ua(R$id.mInfoBar);
            AbstractC5868k.m23673e(mFInfoBar, "mInfoBar");
            AssetData assetData = this.f26632A0;
            AbstractC5868k.m23671c(assetData);
            MFInfoBar.m12183v0(mFInfoBar, assetData, this.f26644G0, this.f26640E0, false, 8, null);
            m27555gd();
            m27557kd();
        }
        int i10 = R$id.mInfoBar;
        ((MFInfoBar) m27561ua(i10)).setSettingFunctionListener(this);
        ((MFInfoBar) m27561ua(i10)).setOnPlayMenuCallback(this);
    }

    /* renamed from: Xb */
    private final C1251l2 m27438Xb() {
        return (C1251l2) this.f26655L1.getValue();
    }

    /* renamed from: Xc */
    private final void m27439Xc(int i10) {
        if (i10 == -1) {
            return;
        }
        C7589m1.f27886a.m29125H("fullScreen", ((VodQualityBean) this.f26641E1.get(i10)).getQualityValue());
        if (!AbstractC5868k.m23669a(this.f26643F1.getQualityValue(), ((VodQualityBean) this.f26641E1.get(i10)).getQualityValue())) {
            if (!((VodQualityBean) this.f26641E1.get(i10)).isAuth()) {
                if (!C1466m0.f5627a.m6841N()) {
                    AbstractC7598p1.m29243g(m3096J6(), m3172j7(R$string.play_not_vip), new int[0]);
                } else {
                    AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.vod_detail_un_support_quality), new int[0]);
                }
            } else {
                ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(11);
            }
            if (!m27388Kd(this.f26641E1, i10)) {
                ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(9);
            }
        }
    }

    /* renamed from: Yb */
    public final C1203g m27442Yb() {
        return (C1203g) this.f26695t1.getValue();
    }

    /* renamed from: cd */
    private final void m27451cd() {
        int i10 = 0;
        List<SimpleProgramList> simpleProgramList;
        m27442Yb().m5497g();
        C6940h c6940h = this.f26698w1;
        if (c6940h != null) {
            c6940h.mo3279p9();
        }
        m27543Pc(true);
        AssetData assetData = this.f26632A0;
        if (assetData != null && (simpleProgramList = assetData.getSimpleProgramList()) != null) {
            i10 = simpleProgramList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 1 && this.f26644G0 < i10 - 1) {
            ((MFInfoBar) m27561ua(R$id.mInfoBar)).setLoadingNext(true);
            m27537Cc(this.f26644G0 + 1, true);
            return;
        }
        this.f26682g1 = true;
        this.f26659N1 = true;
        int i11 = R$id.mInfoBar;
        ((MFInfoBar) m27561ua(i11)).setStatus(2);
        C4176d c4176d = this.f26703z1;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        c4176d.m17475u();
        if (this.f26660O0 && (m3075C6() instanceof VodDetailsActivity)) {
            ((MFInfoBar) m27561ua(i11)).m12196U();
            ((MFInfoBar) m27561ua(i11)).setSettingVisibility(false);
            AbstractActivityC0712e m3075C6 = m3075C6();
            AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.vod.ui.activity.VodDetailsActivity");
            ((VodDetailsActivity) m3075C6).m16479P6();
            ((MFInfoBar) m27561ua(i11)).m12190J0();
        }
        this.f26677b1 = false;
    }

    /* renamed from: dd */
    public final void m27454dd(HashMap hashMap) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = new ArrayList();
        if (hashMap.containsKey("480p")) {
            Object obj = hashMap.get("480p");
            AbstractC5868k.m23671c(obj);
            List<MovieList> movieList = ((TotalMovieListItem) obj).getMovieList();
            if (movieList != null && !movieList.isEmpty()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12) {
                arrayList.add(new VodQualityBean("480P", "480p", false, true));
            } else {
                arrayList.add(new VodQualityBean("480P", "480p", false, false));
            }
        }
        if (hashMap.containsKey("720p")) {
            Object obj2 = hashMap.get("720p");
            AbstractC5868k.m23671c(obj2);
            List<MovieList> movieList2 = ((TotalMovieListItem) obj2).getMovieList();
            if (movieList2 != null && !movieList2.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                arrayList.add(new VodQualityBean("720P", "720p", true, true));
            } else {
                arrayList.add(new VodQualityBean("720P", "720p", true, false));
            }
        }
        if (hashMap.containsKey("1080p")) {
            Object obj3 = hashMap.get("1080p");
            AbstractC5868k.m23671c(obj3);
            List<MovieList> movieList3 = ((TotalMovieListItem) obj3).getMovieList();
            if (movieList3 != null && !movieList3.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                arrayList.add(new VodQualityBean("1080P", "1080p", true, true));
            } else {
                arrayList.add(new VodQualityBean("1080P", "1080p", true, false));
            }
        }
        this.f26641E1.clear();
        this.f26641E1.addAll(arrayList);
        if (C4842a.f20329a.m19920a().mo19929F() && (!this.f26641E1.isEmpty())) {
            ((MFInfoBar) m27561ua(R$id.mInfoBar)).setQualityData(this.f26641E1);
            m27428Uc();
        }
    }

    /* renamed from: ec */
    public final void m27457ec(List list, String str) {
        ((TextView) m27561ua(R$id.mTvSubtitle)).setText("");
        m27349Bd(list, str);
        m27541Md(list, str);
    }

    /* renamed from: ed */
    public final void m27458ed() {
        boolean z10 = false;
        List list;
        Object m7008t = null;
        if (m3096J6() != null) {
            AbstractActivityC0712e m3075C6 = m3075C6();
            if (m3075C6 != null) {
                z10 = m3075C6.isFinishing();
            } else {
                z10 = true;
            }
            if (!z10) {
                ((TextView) m27561ua(R$id.mTvSubtitle)).setText("");
                m27442Yb().m5503q();
                if (this.f26690o1 && (list = this.f26688m1) != null) {
                    m7008t = AbstractC1508t.m7008t(list, this.f26689n1);
                    final SubTitleItemData subTitleItemData = (SubTitleItemData) m7008t;
                    if (subTitleItemData != null) {
                        m27442Yb().m5501o(0L, new Runnable() { // from class: ud.g1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C7121n1.m27462fd(C7121n1.this, subTitleItemData);
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: fc */
    public final void m27461fc(DefinitionBean definitionBean) {
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        RecordAudioInfoBean aduioRecord = audioInfoUtil.getAduioRecord(this.f26676a1);
        definitionBean.getSourceList().get(definitionBean.getSelectSourceIndex());
        SourceBean selectSource = definitionBean.getSelectSource();
        if (aduioRecord != null && aduioRecord.getSourceIndex() < definitionBean.getSourceList().size() && aduioRecord.getAudioIndex() < definitionBean.getSourceList().get(aduioRecord.getSourceIndex()).getAudioInfoList().size() && AbstractC5868k.m23669a(aduioRecord.getAudio(), definitionBean.getSourceList().get(aduioRecord.getSourceIndex()).getAudioInfoList().get(aduioRecord.getAudioIndex()).getLanguage())) {
            definitionBean.setSelectSourceIndex(aduioRecord.getSourceIndex());
            definitionBean.getSelectSource().setSelectAudio(aduioRecord.getAudioIndex());
            audioInfoUtil.putRealAudioMap(this.f26676a1, aduioRecord.getAudio());
            return;
        }
        AbstractC4509b.m18869b("selectAudio", "mSubAndAudioAlbum:" + this.f26647H1, new Object[0]);
        if (this.f26647H1 == null) {
            Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: ud.q0
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    C7121n1.m27465gc(C7121n1.this, observableEmitter);
                }
            }).compose(AbstractC7029f.m27121b());
            final c cVar = new c(selectSource, definitionBean);
            Consumer consumer = new Consumer() { // from class: ud.r0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7121n1.m27468hc(InterfaceC5660l.this, obj);
                }
            };
            final d dVar = d.f26719a;
            compose.subscribe(consumer, new Consumer() { // from class: ud.s0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7121n1.m27472ic(InterfaceC5660l.this, obj);
                }
            });
            return;
        }
        m27553cc(selectSource.getAudioTag(), definitionBean);
    }

    /* renamed from: fd */
    public static final void m27462fd(C7121n1 c7121n1, SubTitleItemData subTitleItemData) {
        AbstractC5868k.m23674f(c7121n1, "this$0");
        AbstractC5868k.m23674f(subTitleItemData, "$it");
        C1203g m27442Yb = c7121n1.m27442Yb();
        Context m3107M8 = c7121n1.m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        C1203g.m5489n(m27442Yb, m3107M8, c7121n1.f26675Z0, subTitleItemData, null, 8, null);
        m27535zd(c7121n1, 0, 1, null);
    }

    /* renamed from: gc */
    public static final void m27465gc(C7121n1 c7121n1, ObservableEmitter observableEmitter) {
        Album album;
        AbstractC5868k.m23674f(c7121n1, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        InterfaceC5346g interfaceC5346g = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
        String str = null;
        if (interfaceC5346g != null) {
            album = interfaceC5346g.mo20790g(c7121n1.f26676a1, C4300d.f18678a.m18068x0());
        } else {
            album = null;
        }
        if (album != null) {
            c7121n1.f26647H1 = album;
            AbstractC4509b.m18869b("selectAudio", "mSubAndAudioAlbum:" + c7121n1.f26647H1, new Object[0]);
        }
        Album album2 = c7121n1.f26647H1;
        if (album2 != null) {
            str = album2.getRealAudio();
        }
        if (str == null) {
            str = "";
        }
        observableEmitter.onNext(str);
    }

    /* renamed from: hc */
    public static final void m27468hc(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: hd */
    public static final void m27469hd(C7121n1 c7121n1, ObservableEmitter observableEmitter) {
        String str = null;
        int i10 = 0;
        Album album;
        int i11 = 0;
        AbstractC5868k.m23674f(c7121n1, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        AssetData assetData = c7121n1.f26632A0;
        if (assetData == null || (str = assetData.getContentId()) == null) {
            str = "";
        }
        Integer subtitleColor = audioInfoUtil.getSubtitleColor(str);
        if (subtitleColor != null) {
            i10 = subtitleColor.intValue();
        } else {
            i10 = -1;
        }
        c7121n1.f26692q1 = i10;
        if (i10 == -1) {
            InterfaceC5346g interfaceC5346g = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
            if (interfaceC5346g != null) {
                album = interfaceC5346g.mo20790g(c7121n1.f26676a1, C4300d.f18678a.m18068x0());
            } else {
                album = null;
            }
            if (album != null) {
                AbstractC4509b.m18869b("selectAudio", "mSubAndAudioAlbum:" + c7121n1.f26647H1, new Object[0]);
                c7121n1.f26647H1 = album;
            }
            if (album != null) {
                i11 = album.getSubStyle();
            } else {
                i11 = -1;
            }
            c7121n1.f26692q1 = i11;
            if (i11 != -1 && i11 != 0) {
                audioInfoUtil.putSubtitleColor(c7121n1.f26676a1, i11);
            } else {
                c7121n1.f26692q1 = ((Number) C7577i1.f27838b.m29085d().m29074f("key_setting_subtitle_color", 2)).intValue();
            }
        }
        observableEmitter.onNext(Integer.valueOf(c7121n1.f26692q1));
    }

    /* renamed from: ic */
    public static final void m27472ic(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: id */
    public static final void m27473id(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: jd */
    public static final void m27476jd(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: kc */
    public final void m27479kc() {
        int m28998c = C7565e1.f27773a.m28998c(((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue());
        C4176d c4176d = this.f26703z1;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        c4176d.setAspectRatio(m28998c);
    }

    /* renamed from: lc */
    private final void m27482lc() {
        this.f26703z1 = new C4176d(m3107M8());
        AutoFrameLayout.C3910a c3910a = new AutoFrameLayout.C3910a(-1, -1);
        ((FrameLayout.LayoutParams) c3910a).gravity = 17;
        C4176d c4176d = this.f26703z1;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        c4176d.setLayoutParams(c3910a);
        int i10 = R$id.mFlRoot;
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m27561ua(i10);
        Resources m3154d7 = m3154d7();
        int i11 = R$color.color_000000;
        autoFrameLayout.setBackgroundColor(m3154d7.getColor(i11));
        C4176d c4176d2 = this.f26703z1;
        if (c4176d2 == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d2 = null;
        }
        c4176d2.setBackgroundColor(m3154d7().getColor(i11));
        AutoFrameLayout autoFrameLayout2 = (AutoFrameLayout) m27561ua(i10);
        C4176d c4176d3 = this.f26703z1;
        if (c4176d3 == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d3 = null;
        }
        autoFrameLayout2.addView(c4176d3, 0);
        ((AutoFrameLayout) m27561ua(i10)).setOnClickListener(new View.OnClickListener() { // from class: ud.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7121n1.m27486mc(C7121n1.this, view);
            }
        });
        m27395Mc();
        m27494oc(this, false, 1, null);
    }

    /* renamed from: ld */
    public static final void m27483ld(C7121n1 c7121n1, ObservableEmitter observableEmitter) {
        String str = null;
        int i10 = 0;
        Album album;
        int i11 = 0;
        AbstractC5868k.m23674f(c7121n1, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        AssetData assetData = c7121n1.f26632A0;
        if (assetData == null || (str = assetData.getContentId()) == null) {
            str = "";
        }
        Integer subtitleSize = audioInfoUtil.getSubtitleSize(str);
        if (subtitleSize != null) {
            i10 = subtitleSize.intValue();
        } else {
            i10 = -1;
        }
        c7121n1.f26691p1 = i10;
        if (i10 == -1) {
            InterfaceC5346g interfaceC5346g = (InterfaceC5346g) C5634i.m22844e(InterfaceC5346g.class, new Object[0]);
            if (interfaceC5346g != null) {
                album = interfaceC5346g.mo20790g(c7121n1.f26676a1, C4300d.f18678a.m18068x0());
            } else {
                album = null;
            }
            if (album != null) {
                c7121n1.f26647H1 = album;
            }
            if (album != null) {
                i11 = album.getSubSize();
            } else {
                i11 = -1;
            }
            c7121n1.f26691p1 = i11;
            if (i11 != -1 && i11 != 0) {
                audioInfoUtil.putSubtitleSize(c7121n1.f26676a1, i11);
            } else {
                c7121n1.f26691p1 = ((Number) C7577i1.f27838b.m29085d().m29074f("key_setting_subtitle_size", 1)).intValue();
            }
        }
        observableEmitter.onNext(Integer.valueOf(c7121n1.f26691p1));
    }

    /* renamed from: mc */
    public static final void m27486mc(C7121n1 c7121n1, View view) {
        AbstractC5868k.m23674f(c7121n1, "this$0");
        int i10 = R$id.mInfoBar;
        if (((MFInfoBar) c7121n1.m27561ua(i10)).m12202m0()) {
            ((MFInfoBar) c7121n1.m27561ua(i10)).setSettingVisibility(false);
        } else if (((MFInfoBar) c7121n1.m27561ua(i10)).m12201l0()) {
            ((MFInfoBar) c7121n1.m27561ua(i10)).m12196U();
        } else {
            ((MFInfoBar) c7121n1.m27561ua(i10)).m12189A0();
        }
    }

    /* renamed from: md */
    public static final void m27487md(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: nc */
    private final void m27490nc(boolean z10) {
        C4176d c4176d = this.f26703z1;
        C4176d c4176d2 = null;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        c4176d.setPlayerListener(this);
        ((MFInfoBar) m27561ua(R$id.mInfoBar)).setOnSeekBarSeekListener(this.f26661O1);
        if (z10) {
            C4176d c4176d3 = this.f26703z1;
            if (c4176d3 == null) {
                AbstractC5868k.m23686r("mVideoView");
            } else {
                c4176d2 = c4176d3;
            }
            c4176d2.setAspectRatio(0);
        }
    }

    /* renamed from: nd */
    public static final void m27491nd(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: oc */
    static /* synthetic */ void m27494oc(C7121n1 c7121n1, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        c7121n1.m27490nc(z10);
    }

    /* renamed from: pd */
    private final void m27497pd() {
        ImageView imageView = new ImageView(m3096J6());
        this.f26658N0 = imageView;
        AbstractC5868k.m23671c(imageView);
        imageView.setImageResource(R$mipmap.vod_icon_tag_ts);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC7786b.m30166j(51), AbstractC7786b.m30163g(52));
        layoutParams.gravity = 5;
        ((AutoFrameLayout) m27561ua(R$id.mFlRoot)).addView(this.f26658N0, layoutParams);
    }

    /* renamed from: qc */
    public static final void m27500qc(HashMap hashMap, C5878u c5878u, C5878u c5878u2, C7121n1 c7121n1, ArrayList arrayList, C5878u c5878u3, C5878u c5878u4, List list, ObservableEmitter observableEmitter) {
        List list2;
        boolean z10 = false;
        Iterator it;
        String str = null;
        int i10 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Object m7008t = null;
        List<String> list3;
        boolean z11 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        C5878u c5878u5 = c5878u2;
        AbstractC5868k.m23674f(hashMap, "$map");
        AbstractC5868k.m23674f(c5878u, "$sourceBeanList");
        AbstractC5868k.m23674f(c5878u5, "$playVODResultDataItem");
        AbstractC5868k.m23674f(c7121n1, "this$0");
        AbstractC5868k.m23674f(arrayList, "$mediaList");
        AbstractC5868k.m23674f(c5878u3, "$audioInfoBeanList");
        AbstractC5868k.m23674f(c5878u4, "$audioTag");
        AbstractC5868k.m23674f(list, "$cdnTagList");
        AbstractC5868k.m23674f(observableEmitter, "it");
        Iterator it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str10 = (String) entry.getKey();
            TotalMovieListItem totalMovieListItem = (TotalMovieListItem) entry.getValue();
            c5878u.f23412a = new ArrayList();
            c5878u5.f23412a = totalMovieListItem;
            String quality = totalMovieListItem.getQuality();
            String str11 = "";
            if (quality == null) {
                quality = "";
            }
            List<MovieList> movieList = totalMovieListItem.getMovieList();
            AbstractC5868k.m23671c(movieList);
            for (MovieList movieList2 : movieList) {
                List<LicenseData> licenseList = movieList2.getLicenseList();
                if (licenseList != null && !licenseList.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z12 = !z10;
                LicenseData licenseData = null;
                if (AbstractC5868k.m23669a(c7121n1.f26643F1.getQualityValue(), str10)) {
                    String audioInfo = movieList2.getAudioInfo();
                    if (audioInfo != null) {
                        list3 = AbstractC7167u.m27748R(audioInfo, new String[]{","}, false, 0, 6, null);
                    } else {
                        list3 = null;
                    }
                    c5878u3.f23412a = new ArrayList();
                    if (list3 != null && !list3.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    String str12 = "unkown";
                    if (!z11 && !TextUtils.isEmpty(movieList2.getAudioInfo())) {
                        String audioInfo2 = movieList2.getAudioInfo();
                        if (audioInfo2 != null) {
                            str12 = audioInfo2;
                        }
                        c5878u4.f23412a = str12;
                        for (String str13 : list3) {
                            List list4 = (List) c5878u3.f23412a;
                            String contentId = movieList2.getContentId();
                            if (contentId == null) {
                                str9 = str11;
                            } else {
                                str9 = contentId;
                            }
                            list4.add(new AudioInfoBean(str9, quality, str13, null, 8, null));
                            str11 = str11;
                            it2 = it2;
                        }
                        it = it2;
                        str = str11;
                        i10 = 0;
                    } else {
                        it = it2;
                        str = str11;
                        i10 = 0;
                        c5878u4.f23412a = "unkown";
                        List list5 = (List) c5878u3.f23412a;
                        String contentId2 = movieList2.getContentId();
                        if (contentId2 == null) {
                            str7 = str;
                        } else {
                            str7 = contentId2;
                        }
                        list5.add(new AudioInfoBean(str7, quality, "unkown", null, 8, null));
                    }
                    List list6 = (List) c5878u.f23412a;
                    String contentId3 = movieList2.getContentId();
                    if (contentId3 == null) {
                        str8 = str;
                    } else {
                        str8 = contentId3;
                    }
                    list6.add(new SourceBean(str8, (String) c5878u4.f23412a, (List) c5878u3.f23412a, z12, 0, 16, null));
                } else {
                    it = it2;
                    str = str11;
                    i10 = 0;
                }
                if (z12) {
                    List<LicenseData> licenseList2 = movieList2.getLicenseList();
                    if (licenseList2 != null) {
                        m7008t = AbstractC1508t.m7008t(licenseList2, i10);
                        licenseData = (LicenseData) m7008t;
                    }
                    AbstractC5868k.m23671c(licenseData);
                    if (list.contains(licenseData.getTag())) {
                        String contentId4 = movieList2.getContentId();
                        if (contentId4 == null) {
                            str2 = str;
                        } else {
                            str2 = contentId4;
                        }
                        String license = licenseData.getLicense();
                        String audioInfo3 = movieList2.getAudioInfo();
                        if (audioInfo3 == null) {
                            str3 = str;
                        } else {
                            str3 = audioInfo3;
                        }
                        String quality2 = totalMovieListItem.getQuality();
                        if (quality2 == null) {
                            str4 = str;
                        } else {
                            str4 = quality2;
                        }
                        String encodeFormat = movieList2.getEncodeFormat();
                        if (encodeFormat == null) {
                            str5 = str;
                        } else {
                            str5 = encodeFormat;
                        }
                        String videoFormat = movieList2.getVideoFormat();
                        if (videoFormat == null) {
                            str6 = str;
                        } else {
                            str6 = videoFormat;
                        }
                        arrayList.add(new Media(str2, license, str3, str4, str5, str6));
                    }
                }
                str11 = str;
                it2 = it;
            }
            Iterator it3 = it2;
            if (AbstractC6567a.m25638h((List) c5878u.f23412a) && (list2 = c7121n1.f26664Q0) != null) {
                list2.add(new DefinitionBean(str10, (List) c5878u.f23412a, 0, 4, null));
            }
            c5878u5 = c5878u2;
            it2 = it3;
        }
        observableEmitter.onNext(arrayList);
        observableEmitter.onComplete();
    }

    /* renamed from: qd */
    private final void m27501qd() {
        int i10 = R$id.tvAv1Hint;
        ((TextView) m27561ua(i10)).setVisibility(0);
        VodDetailsActivity.f17367q0.m16499b(true);
        ((TextView) m27561ua(i10)).postDelayed(new Runnable() { // from class: ud.e0
            @Override // java.lang.Runnable
            public final void run() {
                C7121n1.m27505rd(C7121n1.this);
            }
        }, 5000L);
    }

    /* renamed from: rc */
    public static final void m27504rc(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: rd */
    public static final void m27505rd(C7121n1 c7121n1) {
        TextView textView;
        AbstractC5868k.m23674f(c7121n1, "this$0");
        if (c7121n1.m3096J6() != null && (textView = (TextView) c7121n1.m27561ua(R$id.tvAv1Hint)) != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: sc */
    public static final void m27508sc(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: sd */
    private final void m27509sd() {
        int i10 = R$id.mTvPlayTip;
        ((TextView) m27561ua(i10)).setVisibility(0);
        ((TextView) m27561ua(i10)).setText(m3154d7().getText(R$string.vod_play_av1_playing));
        ((TextView) m27561ua(i10)).postDelayed(new Runnable() { // from class: ud.f1
            @Override // java.lang.Runnable
            public final void run() {
                C7121n1.m27513td(C7121n1.this);
            }
        }, 3000L);
    }

    /* renamed from: tc */
    public static final void m27512tc() {
    }

    /* renamed from: td */
    public static final void m27513td(C7121n1 c7121n1) {
        TextView textView;
        AbstractC5868k.m23674f(c7121n1, "this$0");
        if (c7121n1.m3096J6() != null && (textView = (TextView) c7121n1.m27561ua(R$id.mTvPlayTip)) != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: uc */
    public static final void m27515uc(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: ud */
    public final void m27516ud(Program program, AdInfoWrapper adInfoWrapper) {
        C4176d c4176d = this.f26703z1;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        c4176d.setVisibility(8);
        Context m3107M8 = m3107M8();
        AbstractC5868k.m23673e(m3107M8, "requireContext()");
        C4168g c4168g = new C4168g(m3107M8, adInfoWrapper, null, 0, 12, null);
        this.f26697v1 = c4168g;
        c4168g.setFullScreen(this.f26660O0);
        ((AutoFrameLayout) m27561ua(R$id.mFlRoot)).addView(this.f26697v1);
        C4168g c4168g2 = this.f26697v1;
        if (c4168g2 != null) {
            c4168g2.m17427q(new x(program));
        }
    }

    /* renamed from: vc */
    public static final void m27519vc(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: vd */
    public final void m27520vd() {
        String str = null;
        String str2 = null;
        GetAuthInfoResultData data;
        GetAuthInfoResultData data2;
        GetAuthInfoResultData data3;
        C7252a c7252a = C7252a.f27087a;
        GetAuthInfoResult m28073h = c7252a.m28073h();
        String str3 = null;
        if (m28073h != null && (data3 = m28073h.getData()) != null) {
            str = data3.getChargeFlag();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, "1")) {
            GetAuthInfoResult m28073h2 = c7252a.m28073h();
            if (m28073h2 != null && (data2 = m28073h2.getData()) != null) {
                str2 = data2.getRenewFlag();
            } else {
                str2 = null;
            }
            if (AbstractC5868k.m23669a(str2, "2")) {
                this.f26683h1 = false;
                int i10 = R$id.mInfoBar;
                MFInfoBar mFInfoBar = (MFInfoBar) m27561ua(i10);
                String string = m3154d7().getString(R$string.play_not_vip);
                AbstractC5868k.m23673e(string, "resources.getString(R.string.play_not_vip)");
                mFInfoBar.setPlayNotice(string);
                ((MFInfoBar) m27561ua(i10)).setStatus(9);
                return;
            }
            GetAuthInfoResult m28073h3 = c7252a.m28073h();
            if (m28073h3 != null && (data = m28073h3.getData()) != null) {
                str3 = data.getShowType();
            }
            if (AbstractC5868k.m23669a(str3, "1")) {
                this.f26683h1 = false;
                int i11 = R$id.mInfoBar;
                MFInfoBar mFInfoBar2 = (MFInfoBar) m27561ua(i11);
                String string2 = m3154d7().getString(R$string.play_not_vip_noflag);
                AbstractC5868k.m23673e(string2, "resources.getString(R.string.play_not_vip_noflag)");
                mFInfoBar2.setPlayNotice(string2);
                ((MFInfoBar) m27561ua(i11)).setStatus(9);
                return;
            }
            this.f26683h1 = false;
            AbstractC7598p1.m29244h(m3096J6(), m3175k7(R$string.vod_play_no_source_available, C7615w.f27995a.m29303G()), new int[0]);
            ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(-2);
            return;
        }
        this.f26683h1 = true;
        AbstractC7598p1.m29244h(m3096J6(), m3175k7(R$string.vod_play_no_source_available, C7615w.f27995a.m29303G()), new int[0]);
        ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(-2);
    }

    /* renamed from: wc */
    public static final List m27523wc(C7121n1 c7121n1, StartPlayVODResultData startPlayVODResultData, C5878u c5878u, C5878u c5878u2) {
        int i10 = 0;
        StartPlayVODResultDataItem startPlayVODResultDataItem;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        List<SubTitleItemData> list;
        List<TotalMovieListItem> list2;
        String programContentId = null;
        String str = null;
        String str2 = null;
        TotalMovieListItem totalMovieListItem;
        List<TotalMovieListItem> totalMovieList;
        List<TotalMovieListItem> totalMovieList2;
        List<TotalMovieListItem> totalMovieList3;
        int i12 = 0;
        StartPlayVODResultDataItem startPlayVODResultDataItem2;
        StartPlayVODResultDataItem startPlayVODResultDataItem3;
        List<TotalMovieListItem> totalMovieList4;
        AbstractC5868k.m23674f(c7121n1, "this$0");
        AbstractC5868k.m23674f(startPlayVODResultData, "$result1");
        AbstractC5868k.m23674f(c5878u, "$result");
        AbstractC5868k.m23674f(c5878u2, "$playVODResultDataItem");
        if (AbstractC5868k.m23669a(c7121n1.f26640E0, "1")) {
            List<StartPlayVODResultDataItem> episodeList = startPlayVODResultData.getEpisodeList();
            if (episodeList != null && (startPlayVODResultDataItem3 = episodeList.get(0)) != null && (totalMovieList4 = startPlayVODResultDataItem3.getTotalMovieList()) != null) {
                i12 = totalMovieList4.size();
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                List<StartPlayVODResultDataItem> episodeList2 = startPlayVODResultData.getEpisodeList();
                if (episodeList2 != null) {
                    startPlayVODResultDataItem2 = episodeList2.get(0);
                } else {
                    startPlayVODResultDataItem2 = null;
                }
                c5878u.f23412a = startPlayVODResultDataItem2;
            }
        } else {
            List<StartPlayVODResultDataItem> episodeList3 = startPlayVODResultData.getEpisodeList();
            if (episodeList3 != null) {
                i10 = episodeList3.size();
            } else {
                i10 = 0;
            }
            if (i10 > 1) {
                List<StartPlayVODResultDataItem> episodeList4 = startPlayVODResultData.getEpisodeList();
                AbstractC5868k.m23671c(episodeList4);
                for (StartPlayVODResultDataItem startPlayVODResultDataItem4 : episodeList4) {
                    if (!AbstractC6567a.m25635e(startPlayVODResultDataItem4.getTotalMovieList())) {
                        if (startPlayVODResultDataItem4.getEpisodeNumber() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && c7121n1.f26678c1 <= 1 && c7121n1.f26644G0 == 0) {
                            c5878u.f23412a = startPlayVODResultDataItem4;
                        } else {
                            if (c5878u.f23412a == null) {
                                if (startPlayVODResultDataItem4.getEpisodeNumber() == c7121n1.f26678c1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    c5878u.f23412a = startPlayVODResultDataItem4;
                                }
                            }
                            int episodeNumber = startPlayVODResultDataItem4.getEpisodeNumber();
                            int i13 = c7121n1.f26678c1;
                            if (episodeNumber == i13 + 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                c7121n1.f26679d1 = i13 + 1;
                                c7121n1.f26633A1 = startPlayVODResultData;
                                if (c5878u.f23412a != null) {
                                    break;
                                }
                            } else if (c7121n1.f26633A1 != null && c5878u.f23412a != null) {
                                break;
                            }
                        }
                    }
                }
            } else if (i10 > 0) {
                List<StartPlayVODResultDataItem> episodeList5 = startPlayVODResultData.getEpisodeList();
                if (episodeList5 != null) {
                    startPlayVODResultDataItem = episodeList5.get(0);
                } else {
                    startPlayVODResultDataItem = null;
                }
                c5878u.f23412a = startPlayVODResultDataItem;
            }
        }
        StartPlayVODResultDataItem startPlayVODResultDataItem5 = (StartPlayVODResultDataItem) c5878u.f23412a;
        if (startPlayVODResultDataItem5 != null && (totalMovieList3 = startPlayVODResultDataItem5.getTotalMovieList()) != null) {
            i11 = totalMovieList3.size();
        } else {
            i11 = 0;
        }
        if (i11 > 0) {
            StartPlayVODResultDataItem startPlayVODResultDataItem6 = (StartPlayVODResultDataItem) c5878u.f23412a;
            if (startPlayVODResultDataItem6 != null && (totalMovieList2 = startPlayVODResultDataItem6.getTotalMovieList()) != null) {
                AbstractC1504p.m6994m(totalMovieList2, new Comparator() { // from class: ud.z0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m27526xc;
                        m27526xc = C7121n1.m27526xc((TotalMovieListItem) obj, (TotalMovieListItem) obj2);
                        return m27526xc;
                    }
                });
            }
            StartPlayVODResultDataItem startPlayVODResultDataItem7 = (StartPlayVODResultDataItem) c5878u.f23412a;
            if (startPlayVODResultDataItem7 != null && (totalMovieList = startPlayVODResultDataItem7.getTotalMovieList()) != null) {
                totalMovieListItem = totalMovieList.get(0);
            } else {
                totalMovieListItem = null;
            }
            c5878u2.f23412a = totalMovieListItem;
        }
        Object obj = c5878u2.f23412a;
        String str3 = "";
        if (obj != null) {
            StartPlayVODResultDataItem startPlayVODResultDataItem8 = (StartPlayVODResultDataItem) c5878u.f23412a;
            if (startPlayVODResultDataItem8 == null || (str = startPlayVODResultDataItem8.getProgramContentId()) == null) {
                str = "";
            }
            c7121n1.f26675Z0 = str;
            AssetData assetData = c7121n1.f26632A0;
            if (assetData == null || (str2 = assetData.getContentId()) == null) {
                str2 = "";
            }
            c7121n1.f26676a1 = str2;
        }
        StartPlayVODResultDataItem startPlayVODResultDataItem9 = (StartPlayVODResultDataItem) c5878u.f23412a;
        if (startPlayVODResultDataItem9 != null) {
            list = startPlayVODResultDataItem9.getSubtitleList();
        } else {
            list = null;
        }
        c7121n1.f26645G1 = list;
        StartPlayVODResultDataItem startPlayVODResultDataItem10 = (StartPlayVODResultDataItem) c5878u.f23412a;
        if (startPlayVODResultDataItem10 != null && (programContentId = startPlayVODResultDataItem10.getProgramContentId()) != null) {
            str3 = programContentId;
        }
        c7121n1.f26675Z0 = str3;
        ((MFInfoBar) c7121n1.m27561ua(R$id.mInfoBar)).setPlayerData(!c7121n1.f26681f1);
        StartPlayVODResultDataItem startPlayVODResultDataItem11 = (StartPlayVODResultDataItem) c5878u.f23412a;
        if (startPlayVODResultDataItem11 != null) {
            list2 = startPlayVODResultDataItem11.getTotalMovieList();
        } else {
            list2 = null;
        }
        if (AbstractC6567a.m25635e(list2)) {
            c7121n1.f26669T0 = false;
            c7121n1.f26666R0 = true;
            c7121n1.f26668S0 = true;
            Context m3096J6 = c7121n1.m3096J6();
            if (m3096J6 != null) {
                AbstractC1330a.m5982a(m3096J6, new k());
            }
        }
        StartPlayVODResultDataItem startPlayVODResultDataItem12 = (StartPlayVODResultDataItem) c5878u.f23412a;
        if (startPlayVODResultDataItem12 == null) {
            return null;
        }
        return startPlayVODResultDataItem12.getTotalMovieList();
    }

    /* renamed from: xc */
    public static final int m27526xc(TotalMovieListItem totalMovieListItem, TotalMovieListItem totalMovieListItem2) {
        AbstractC4843b m19920a = C4842a.f20329a.m19920a();
        C7565e1 c7565e1 = C7565e1.f27773a;
        return m19920a.m19951a0(c7565e1.m28996a(totalMovieListItem.getQuality()), c7565e1.m28996a(totalMovieListItem2.getQuality()));
    }

    /* renamed from: xd */
    public static final void m27527xd(C7121n1 c7121n1, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(c7121n1, "this$0");
        c7121n1.f26698w1 = null;
    }

    /* renamed from: yc */
    public static final boolean m27530yc(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* renamed from: yd */
    public final void m27531yd(int i10) {
        int i11 = 0;
        C5876s c5876s = new C5876s();
        c5876s.f23410a = i10;
        m27442Yb().m5497g();
        List list = this.f26688m1;
        if (list != null) {
            i11 = list.size();
        } else {
            i11 = 0;
        }
        if (i11 <= 0) {
            return;
        }
        m27442Yb().m5501o(0L, new z(c5876s));
    }

    /* renamed from: zc */
    public static final HashMap m27534zc(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (HashMap) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: zd */
    static /* synthetic */ void m27535zd(C7121n1 c7121n1, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        c7121n1.m27531yd(i10);
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: A3 */
    public void mo7566A3(int i10) {
        m27562wd();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_vod_player;
    }

    /* renamed from: Ad */
    public final boolean m27536Ad() {
        int i10 = 0;
        if (!m30051p9()) {
            return false;
        }
        if (!this.f26668S0) {
            AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.vod_detail_no_quality), new int[0]);
            return false;
        }
        if (this.f26641E1.isEmpty()) {
            AbstractC7598p1.m29244h(m3096J6(), m3175k7(R$string.vod_play_no_source_available, C7615w.f27995a.m29303G()), new int[0]);
            return false;
        }
        int i11 = 0;
        for (Object obj : this.f26641E1) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1500l.m6991j();
            }
            if (AbstractC5868k.m23669a(((VodQualityBean) obj).getQualityValue(), this.f26643F1.getQualityValue())) {
                i10 = i11;
            }
            i11 = i12;
        }
        C5180h1 c5180h1 = new C5180h1();
        this.f26696u1 = new C6936d(c5180h1);
        c5180h1.m28845b(this.f26641E1);
        c5180h1.m20909u(i10);
        c5180h1.m20908t(new a0(c5180h1, this));
        C6936d c6936d = this.f26696u1;
        AbstractC5868k.m23671c(c6936d);
        AbstractC0729o m3093I6 = m3093I6();
        AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
        c6936d.mo3277E9(m3093I6, "SelectQualityDialog");
        return true;
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: C4 */
    public void mo5894C4() {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: Cc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m27537Cc(int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p358ud.C7121n1.m27537Cc(int, boolean):void");
    }

    @Override // com.module.view.MFInfoBar.InterfaceC3004b
    /* renamed from: G3 */
    public void mo12210G3() {
        int i10 = R$id.mInfoBar;
        if (((MFInfoBar) m27561ua(i10)).getState() != 7 && ((MFInfoBar) m27561ua(i10)).getState() != 6 && ((MFInfoBar) m27561ua(i10)).getState() != 4 && ((MFInfoBar) m27561ua(i10)).getState() != 0 && ((MFInfoBar) m27561ua(i10)).getState() != 1 && ((MFInfoBar) m27561ua(i10)).getState() != 9 && ((MFInfoBar) m27561ua(i10)).getState() != -1 && ((MFInfoBar) m27561ua(i10)).getState() != -3 && ((MFInfoBar) m27561ua(i10)).getState() != -2 && ((MFInfoBar) m27561ua(i10)).getState() != 10) {
            C4176d c4176d = this.f26703z1;
            C4176d c4176d2 = null;
            if (c4176d == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d = null;
            }
            if (c4176d.m17473r()) {
                m27348Bc();
                return;
            }
            m27403Oc();
            if (this.f26659N1) {
                ((MFInfoBar) m27561ua(i10)).m12199X();
                C4176d c4176d3 = this.f26703z1;
                if (c4176d3 == null) {
                    AbstractC5868k.m23686r("mVideoView");
                } else {
                    c4176d2 = c4176d3;
                }
                c4176d2.m17477w(0L);
                this.f26659N1 = false;
            }
        }
    }

    /* renamed from: Jd */
    public final void m27538Jd() {
        C4176d c4176d = null;
        m27412Qc(this, false, 1, null);
        C4176d c4176d2 = this.f26703z1;
        if (c4176d2 == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d2 = null;
        }
        c4176d2.m17469B();
        C4176d c4176d3 = this.f26703z1;
        if (c4176d3 == null) {
            AbstractC5868k.m23686r("mVideoView");
        } else {
            c4176d = c4176d3;
        }
        c4176d.setVisibility(8);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: K0 */
    public void mo5895K0() {
        AbstractActivityC0712e m3075C6 = m3075C6();
        boolean z10 = false;
        if (m3075C6 != null && !m3075C6.isFinishing()) {
            z10 = true;
        }
        if (z10) {
            C7574h1.f27833a.m29063a();
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: L1 */
    public void mo5896L1() {
    }

    /* renamed from: Lb */
    public final boolean m27539Lb() {
        if (this.f26697v1 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: Ld */
    public final boolean m27540Ld() {
        boolean z10 = false;
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6838K() && c1466m0.m6831D()) {
            MFInfoBar mFInfoBar = (MFInfoBar) m27561ua(R$id.mInfoBar);
            if (mFInfoBar != null && mFInfoBar.m12203p0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                C6448c.m25240q(C5634i.m22843d("http://module_mine/UserCenterActivity").m25257w("SELECTED_POSITION", "1").m25254t(262144), m3096J6(), null, 2, null);
                return true;
            }
        }
        return false;
    }

    /* renamed from: Md */
    public final void m27541Md(final List list, final String str) {
        AbstractC5868k.m23674f(str, "programId");
        boolean z10 = true;
        this.f26666R0 = true;
        this.f26688m1 = list;
        if (list != null && (!list.isEmpty())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mSubAndAudioAlbum:");
            sb2.append(this.f26647H1);
            sb2.append((char) 65307);
            if (this.f26647H1 != null) {
                z10 = false;
            }
            sb2.append(z10);
            AbstractC4509b.m18869b("selectSubtitle", sb2.toString(), new Object[0]);
            if (this.f26647H1 == null) {
                AbstractC4509b.m18869b("selectSubtitle", "mSubAndAudioAlbum ==null", new Object[0]);
                Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: ud.u0
                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(ObservableEmitter observableEmitter) {
                        C7121n1.m27399Nd(C7121n1.this, str, list, observableEmitter);
                    }
                }).compose(AbstractC7029f.m27121b());
                final f0 f0Var = f0.f26727a;
                Consumer consumer = new Consumer() { // from class: ud.w0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C7121n1.m27404Od(InterfaceC5660l.this, obj);
                    }
                };
                final g0 g0Var = g0.f26729a;
                compose.subscribe(consumer, new Consumer() { // from class: ud.x0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C7121n1.m27408Pd(InterfaceC5660l.this, obj);
                    }
                });
                return;
            }
            m27554dc(list);
            return;
        }
        this.f26689n1 = -1;
        this.f26690o1 = false;
    }

    /* renamed from: Nc */
    public final void m27542Nc() {
        this.f26632A0 = null;
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: O5 */
    public void mo5897O5() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: P3 */
    public void mo5898P3(long j10) {
        int i10 = 0;
        int i11 = 0;
        List<SimpleProgramList> simpleProgramList;
        SimpleProgramList simpleProgramList2;
        List<SimpleProgramList> simpleProgramList3;
        List<SimpleProgramList> simpleProgramList4;
        C4176d c4176d = this.f26703z1;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        long duration = c4176d.getDuration();
        ((MFInfoBar) m27561ua(R$id.mInfoBar)).m12194O0(j10, duration);
        this.f26672W0 = (int) j10;
        long j11 = 600000;
        if (j10 >= duration - j11 && duration > j11 && AbstractC5868k.m23669a(this.f26640E0, MessageService.MSG_DB_READY_REPORT) && !this.f26677b1 && (i10 = this.f26678c1) >= this.f26679d1) {
            AssetData assetData = this.f26632A0;
            int i12 = 0;
            if (assetData != null && (simpleProgramList4 = assetData.getSimpleProgramList()) != null) {
                i11 = simpleProgramList4.size();
            } else {
                i11 = 0;
            }
            if (i10 < i11) {
                int i13 = 1;
                this.f26677b1 = true;
                this.f26633A1 = null;
                int i14 = this.f26644G0 + 1;
                AssetData assetData2 = this.f26632A0;
                if (assetData2 != null && (simpleProgramList3 = assetData2.getSimpleProgramList()) != null) {
                    i12 = simpleProgramList3.size();
                }
                if (i14 < i12) {
                    AssetData assetData3 = this.f26632A0;
                    if (assetData3 != null && (simpleProgramList = assetData3.getSimpleProgramList()) != null && (simpleProgramList2 = simpleProgramList.get(this.f26644G0 + 1)) != null) {
                        i13 = simpleProgramList2.getSeriesNumber();
                    }
                    C6465e0 c6465e0 = (C6465e0) m5478w9();
                    int i15 = this.f26636C0;
                    String str = this.f26638D0;
                    c6465e0.m25295Y0(i15, str, str, this.f26642F0, 0, "1", new int[]{i13});
                }
            }
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: P5 */
    public void mo5899P5(long j10) {
    }

    /* renamed from: Pc */
    public final void m27543Pc(boolean z10) {
        int i10 = 0;
        if (!this.f26646H0) {
            if (this.f26703z1 == null) {
                AbstractC5868k.m23686r("mVideoView");
            }
            C4176d c4176d = this.f26703z1;
            C4176d c4176d2 = null;
            if (c4176d == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d = null;
            }
            final int currentProgress = (int) c4176d.getCurrentProgress();
            if (currentProgress == -1) {
                return;
            }
            final C5876s c5876s = new C5876s();
            C4176d c4176d3 = this.f26703z1;
            if (c4176d3 == null) {
                AbstractC5868k.m23686r("mVideoView");
            } else {
                c4176d2 = c4176d3;
            }
            if (currentProgress >= ((int) c4176d2.getDuration()) - 10000) {
                i10 = 0;
            } else {
                i10 = currentProgress;
            }
            c5876s.f23410a = i10;
            if (z10) {
                c5876s.f23410a = 0;
            }
            int i11 = c5876s.f23410a;
            if (i11 > 0) {
                this.f26672W0 = i11;
            }
            final SimpleProgramList simpleProgramList = this.f26634B0;
            final int i12 = this.f26644G0;
            final AssetData assetData = this.f26632A0;
            AbstractC7030g.m27129c("save album", new Runnable() { // from class: ud.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C7121n1.m27417Rc(AssetData.this, currentProgress, this, simpleProgramList, i12, c5876s);
                }
            }, false);
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: R1 */
    public void mo5900R1(int i10) {
        int i11 = R$id.mInfoBar;
        ((MFInfoBar) m27561ua(i11)).m12199X();
        ((MFInfoBar) m27561ua(i11)).setStatus(-1);
        AbstractActivityC0712e m3075C6 = m3075C6();
        boolean z10 = false;
        if (m3075C6 != null && !m3075C6.isFinishing()) {
            z10 = true;
        }
        if (z10) {
            C4176d c4176d = this.f26703z1;
            String str = null;
            if (c4176d == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d = null;
            }
            C7076c playStatus = c4176d.getPlayStatus();
            if (playStatus != null) {
                str = playStatus.m27265e();
            }
            boolean m23669a = AbstractC5868k.m23669a(str, "ijk");
            AbstractActivityC0712e m3075C62 = m3075C6();
            AbstractC5868k.m23672d(m3075C62, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
            AbstractActivityC2972a.m11962b6((AbstractActivityC2972a) m3075C62, i10, m23669a, null, null, "ranger", null, null, null, null, null, null, 2028, null);
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: S1 */
    public void mo5901S1() {
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        Disposable disposable;
        Disposable disposable2 = this.f26686k1;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f26686k1) != null) {
            disposable.dispose();
        }
        m27386Kb();
        C7618x0.f28031a.m29362x(true);
        C6928a.f26265a.m26920c();
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: T7 */
    public void mo3126T7() {
        m27442Yb().m5502p();
        C5911g.f23514h.m23905a().m23903v(null);
        super.mo3126T7();
    }

    /* renamed from: Tc */
    public final boolean m27544Tc(int i10) {
        if (m27427Ub(i10)) {
            C7586l1 c7586l1 = C7586l1.f27877a;
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            String string = m3107M8().getString(R$string.vod_download_subtitle_fail);
            AbstractC5868k.m23673e(string, "requireContext().getStri…d_download_subtitle_fail)");
            c7586l1.m29114b(m3107M8, string, 1, 80);
            return false;
        }
        this.f26689n1 = i10;
        m27458ed();
        return true;
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: U */
    public void mo5902U() {
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m27561ua(R$id.mFlRoot);
        Resources m3154d7 = m3154d7();
        int i10 = R$color.transparent;
        autoFrameLayout.setBackgroundColor(m3154d7.getColor(i10));
        C4176d c4176d = this.f26703z1;
        C4176d c4176d2 = null;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        c4176d.setBackgroundColor(m3154d7().getColor(i10));
        int i11 = R$id.mInfoBar;
        ((MFInfoBar) m27561ua(i11)).setStatus(4);
        MFInfoBar mFInfoBar = (MFInfoBar) m27561ua(i11);
        C4176d c4176d3 = this.f26703z1;
        if (c4176d3 == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d3 = null;
        }
        mFInfoBar.setTotalTime((int) c4176d3.getDuration());
        int i12 = this.f26672W0;
        if (i12 != 0) {
            m27531yd(i12);
        } else {
            m27535zd(this, 0, 1, null);
        }
        if (this.f26673X0) {
            C4176d c4176d4 = this.f26703z1;
            if (c4176d4 == null) {
                AbstractC5868k.m23686r("mVideoView");
                c4176d4 = null;
            }
            c4176d4.m17477w(this.f26672W0);
            this.f26673X0 = false;
        }
        C7574h1.f27833a.m29063a();
        C7618x0.m29358y(C7618x0.f28031a, false, 1, null);
        if (!VodDetailsActivity.f17367q0.m16498a() && this.f26660O0 && this.f26681f1) {
            m27501qd();
        }
        if (this.f26681f1) {
            m27509sd();
        }
        ((MFInfoBar) m27561ua(i11)).setHasPreview(Boolean.FALSE);
        AbstractC4509b.m18869b(this.f26700y0, "switchQuality;isNeedPausePlay:" + this.f26651J1, new Object[0]);
        if (this.f26651J1) {
            if (!this.f26660O0) {
                ((MFInfoBar) m27561ua(i11)).setAdVisible(false);
                m27348Bc();
                this.f26653K1 = true;
            } else {
                ((MFInfoBar) m27561ua(i11)).m12199X();
                ((MFInfoBar) m27561ua(i11)).setStatus(3);
                C4176d c4176d5 = this.f26703z1;
                if (c4176d5 == null) {
                    AbstractC5868k.m23686r("mVideoView");
                    c4176d5 = null;
                }
                if (!c4176d5.m17473r()) {
                    C4176d c4176d6 = this.f26703z1;
                    if (c4176d6 == null) {
                        AbstractC5868k.m23686r("mVideoView");
                    } else {
                        c4176d2 = c4176d6;
                    }
                    c4176d2.m17476v();
                }
            }
            this.f26651J1 = false;
            return;
        }
        ((MFInfoBar) m27561ua(i11)).m12199X();
        ((MFInfoBar) m27561ua(i11)).setStatus(3);
        C4176d c4176d7 = this.f26703z1;
        if (c4176d7 == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d7 = null;
        }
        if (!c4176d7.m17473r()) {
            C4176d c4176d8 = this.f26703z1;
            if (c4176d8 == null) {
                AbstractC5868k.m23686r("mVideoView");
            } else {
                c4176d2 = c4176d8;
            }
            c4176d2.m17476v();
        }
    }

    @Override // p268od.InterfaceC5971g
    /* renamed from: V */
    public void mo24154V(String str, int i10) {
        String str2 = null;
        AbstractC5868k.m23674f(str, "errCode");
        if (!this.f26677b1) {
            mo24155W3();
            ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(-1);
            if (!AbstractC5868k.m23669a("portal100006", str) && !AbstractC5868k.m23669a("portal100008", str)) {
                AbstractActivityC0712e m3075C6 = m3075C6();
                AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
                AbstractActivityC2972a abstractActivityC2972a = (AbstractActivityC2972a) m3075C6;
                String str3 = this.f26638D0;
                AssetData assetData = this.f26632A0;
                if (assetData == null || (str2 = assetData.getName()) == null) {
                    str2 = "";
                }
                abstractActivityC2972a.m11972U5(str, false, "/startPlayVOD", "vod", str3, str2, "");
            }
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: V0 */
    public void mo5903V0(long j10) {
        ((MFInfoBar) m27561ua(R$id.mInfoBar)).setSecondaryProgress((int) j10);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: V1 */
    public void mo5904V1() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: W1 */
    public void mo5905W1(Bitmap bitmap) {
        AbstractC5868k.m23674f(bitmap, "bitmap");
    }

    @Override // p268od.InterfaceC5971g
    /* renamed from: W3 */
    public void mo24155W3() {
        C4168g c4168g = this.f26697v1;
        if (c4168g != null) {
            ((AutoFrameLayout) m27561ua(R$id.mFlRoot)).removeView(c4168g);
        }
        this.f26697v1 = null;
    }

    /* renamed from: Wb */
    public final DefinitionBean m27545Wb() {
        if (this.f26664Q0.size() == 0) {
            return null;
        }
        return (DefinitionBean) this.f26664Q0.get(this.f26670U0);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: X2 */
    public void mo5906X2(Status status) {
        AbstractC5868k.m23674f(status, Progress.STATUS);
    }

    @Override // p268od.InterfaceC5971g
    /* renamed from: Y1 */
    public void mo24156Y1(final StartPlayVODResultData startPlayVODResultData, int i10) {
        boolean z10 = false;
        int i11 = 0;
        String str = null;
        AbstractC5868k.m23674f(startPlayVODResultData, "result1");
        if (this.f26677b1) {
            this.f26679d1 = i10;
            this.f26633A1 = startPlayVODResultData;
            return;
        }
        C4176d c4176d = this.f26703z1;
        C4176d c4176d2 = null;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        c4176d.m17469B();
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m27561ua(R$id.mFlRoot);
        C4176d c4176d3 = this.f26703z1;
        if (c4176d3 == null) {
            AbstractC5868k.m23686r("mVideoView");
        } else {
            c4176d2 = c4176d3;
        }
        autoFrameLayout.removeView(c4176d2);
        m27482lc();
        if (AbstractC6567a.m25635e(startPlayVODResultData.getEpisodeList())) {
            AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.source_hint), new int[0]);
            ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(-2);
            this.f26669T0 = false;
            this.f26666R0 = true;
            this.f26668S0 = true;
            m27420Sb();
            return;
        }
        C1456h0 c1456h0 = C1456h0.f5574a;
        if (!c1456h0.m6779o()) {
            m27352Cd(startPlayVODResultData, i10);
            return;
        }
        C1456h0.a aVar = C1456h0.a.VOD;
        List m6773i = c1456h0.m6773i(aVar);
        c1456h0.m6774j(aVar);
        if (m6773i != null && !m6773i.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            int m6917a = C1473s.f5656a.m6917a();
            if (m6917a == 0) {
                i11 = 20900;
            } else {
                i11 = m6917a;
            }
            AbstractActivityC0712e m3075C6 = m3075C6();
            AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
            AbstractActivityC2972a abstractActivityC2972a = (AbstractActivityC2972a) m3075C6;
            C7617x c7617x = C7617x.f28030a;
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            String m29327c = C7617x.m29327c(c7617x, m3107M8, String.valueOf(i11), false, 4, null);
            String str2 = this.f26638D0;
            AssetData assetData = this.f26632A0;
            if (assetData == null || (str = assetData.getName()) == null) {
                str = "";
            }
            AbstractActivityC2972a.m11962b6(abstractActivityC2972a, i11, false, null, m29327c, "apk", "vod", str2, str, "", "", null, EventType.AUTH_FAIL, null);
            this.f26669T0 = false;
            this.f26666R0 = true;
            this.f26668S0 = true;
            return;
        }
        final C5878u c5878u = new C5878u();
        final C5878u c5878u2 = new C5878u();
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: ud.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m27523wc;
                m27523wc = C7121n1.m27523wc(C7121n1.this, startPlayVODResultData, c5878u, c5878u2);
                return m27523wc;
            }
        });
        final l lVar = new l(c5878u2);
        Observable filter = fromCallable.filter(new Predicate() { // from class: ud.g0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m27530yc;
                m27530yc = C7121n1.m27530yc(InterfaceC5660l.this, obj);
                return m27530yc;
            }
        });
        final m mVar = new m();
        Observable map = filter.map(new Function() { // from class: ud.h0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                HashMap m27534zc;
                m27534zc = C7121n1.m27534zc(InterfaceC5660l.this, obj);
                return m27534zc;
            }
        });
        final n nVar = new n(c5878u2);
        Observable observeOn = map.filter(new Predicate() { // from class: ud.i0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m27345Ac;
                m27345Ac = C7121n1.m27345Ac(InterfaceC5660l.this, obj);
                return m27345Ac;
            }
        }).subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        final o oVar = new o(startPlayVODResultData);
        Consumer consumer = new Consumer() { // from class: ud.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27515uc(InterfaceC5660l.this, obj);
            }
        };
        final p pVar = p.f26749a;
        observeOn.subscribe(consumer, new Consumer() { // from class: ud.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27519vc(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: Y5 */
    public C7077d mo5907Y5(List list) {
        String str = null;
        AbstractC5868k.m23674f(list, "audioTrackList");
        DefinitionBean m27545Wb = m27545Wb();
        C4176d c4176d = null;
        if (m27545Wb != null && (!list.isEmpty())) {
            AudioInfoBean selectAduio = m27545Wb.getSelectSource().getSelectAduio();
            if (selectAduio != null) {
                str = selectAduio.getLanguage();
            } else {
                str = null;
            }
            if (AbstractC6567a.m25637g(str)) {
                int selectAudio = m27545Wb.getSelectSource().getSelectAudio();
                C4176d c4176d2 = this.f26703z1;
                if (c4176d2 == null) {
                    AbstractC5868k.m23686r("mVideoView");
                } else {
                    c4176d = c4176d2;
                }
                AbstractC5868k.m23671c(str);
                return c4176d.m17471p(str, selectAudio);
            }
        }
        return null;
    }

    /* renamed from: Yc */
    public final void m27546Yc(Album album) {
        this.f26647H1 = album;
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: Z */
    public void mo7568Z(int i10) {
        int m28998c = C7565e1.f27773a.m28998c(i10);
        C4176d c4176d = this.f26703z1;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        c4176d.setAspectRatio(m28998c);
        C7577i1.f27838b.m29085d().m29076h("play_ratio", Integer.valueOf(i10));
    }

    /* renamed from: Zb */
    public final int m27547Zb() {
        return this.f26644G0;
    }

    /* renamed from: Zc */
    public final void m27548Zc(String str, int i10, String str2, String str3, int i11, boolean z10, boolean z11, String str4, String str5, boolean z12, int i12, int i13) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC5868k.m23674f(str3, "playType");
        AbstractC5868k.m23674f(str4, "umengEventKey");
        AbstractC5868k.m23674f(str5, "umengEventCategory");
        this.f26638D0 = str;
        this.f26675Z0 = str;
        this.f26676a1 = str;
        this.f26636C0 = i10;
        this.f26640E0 = str2;
        this.f26642F0 = str3;
        this.f26644G0 = i11;
        this.f26646H0 = z10;
        this.f26648I0 = z11;
        this.f26656M0 = z12;
        this.f26674Y0 = i12;
        this.f26652K0 = str4;
        this.f26654L0 = str5;
        this.f26678c1 = i13;
        if (m30051p9()) {
            m27391Lc();
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: ac */
    public C6465e0 mo5465y9() {
        return new C6465e0(this, this);
    }

    /* renamed from: ad */
    public final void m27550ad(AssetData assetData, boolean z10) {
        int i10 = 0;
        SimpleProgramList simpleProgramList;
        String str = null;
        int i11 = 0;
        AbstractC5868k.m23674f(assetData, "detailData");
        this.f26632A0 = assetData;
        this.f26656M0 = z10;
        m27432Vc();
        int i12 = this.f26644G0;
        List<SimpleProgramList> simpleProgramList2 = assetData.getSimpleProgramList();
        int i13 = 0;
        if (simpleProgramList2 != null) {
            i10 = simpleProgramList2.size();
        } else {
            i10 = 0;
        }
        if (i12 < i10) {
            List<SimpleProgramList> simpleProgramList3 = assetData.getSimpleProgramList();
            if (simpleProgramList3 != null) {
                simpleProgramList = simpleProgramList3.get(this.f26644G0);
            } else {
                simpleProgramList = null;
            }
            this.f26634B0 = simpleProgramList;
            if (simpleProgramList == null || (str = simpleProgramList.getContentId()) == null) {
                str = "";
            }
            this.f26675Z0 = str;
            this.f26676a1 = assetData.getContentId();
            SimpleProgramList simpleProgramList4 = this.f26634B0;
            if (simpleProgramList4 != null) {
                i11 = simpleProgramList4.getSeriesNumber();
            } else {
                i11 = 1;
            }
            this.f26678c1 = i11;
        }
        AssetData assetData2 = this.f26632A0;
        if (assetData2 != null) {
            i13 = assetData2.getVolumnCount();
        }
        this.f26674Y0 = i13;
        if (m30051p9()) {
            m27435Wc();
            if (this.f26656M0) {
                m27497pd();
            }
        }
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: b8 */
    public void mo3149b8() {
        super.mo3149b8();
    }

    /* renamed from: bc */
    public final boolean m27551bc() {
        return this.f26641E1.isEmpty();
    }

    /* renamed from: bd */
    public final void m27552bd(String str) {
        AbstractC5868k.m23674f(str, "playEntrance");
        this.f26662P0 = str;
    }

    /* renamed from: cc */
    public final void m27553cc(String str, DefinitionBean definitionBean) {
        String str2 = null;
        boolean m27763v;
        AudioInfoBean selectAduio;
        boolean m27763v2;
        AbstractC5868k.m23674f(str, "audioTag");
        AbstractC5868k.m23674f(definitionBean, "definitionBean");
        SourceBean selectSource = definitionBean.getSelectSource();
        Album album = this.f26647H1;
        if (album != null) {
            str2 = album.getRealAudio();
        } else {
            str2 = null;
        }
        this.f26649I1 = str2;
        if (str2 != null && AbstractC6567a.m25637g(str2)) {
            AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
            String str3 = this.f26676a1;
            String str4 = this.f26649I1;
            AbstractC5868k.m23671c(str4);
            audioInfoUtil.putRealAudioMap(str3, str4);
        }
        String str5 = this.f26649I1;
        int i10 = 0;
        if (str5 != null && AbstractC6567a.m25637g(str5)) {
            String str6 = this.f26649I1;
            AbstractC5868k.m23671c(str6);
            m27763v2 = AbstractC7167u.m27763v(str, str6, false, 2, null);
            if (m27763v2) {
                int size = selectSource.getAudioInfoList().size();
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (AbstractC5868k.m23669a(selectSource.getAudioInfoList().get(i10).getLanguage(), this.f26649I1)) {
                        definitionBean.getSelectSource().setSelectAudio(i10);
                        AudioInfoUtil.INSTANCE.putAduioRecord(this.f26676a1, definitionBean);
                        break;
                    }
                    i10++;
                }
                selectAduio = definitionBean.getSelectSource().getSelectAduio();
                if (selectAduio != null || (r9 = selectAduio.getLanguage()) == null) {
                    String str7 = "";
                }
                this.f26694s1 = str7;
            }
        }
        ArrayList arrayList = new ArrayList();
        String str8 = (String) C7577i1.f27838b.m29085d().m29074f("key_setting_play_audio", C4842a.f20329a.m19920a().mo19964m());
        arrayList.add(0, str8);
        if (str8.equals("pt")) {
            arrayList.add("por");
        } else if (str8.equals("es")) {
            arrayList.add("spa");
        } else if (str8.equals("en")) {
            arrayList.add("eng");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str9 = (String) it.next();
            AbstractC5868k.m23673e(str9, "item");
            m27763v = AbstractC7167u.m27763v(str, str9, false, 2, null);
            if (m27763v) {
                str8 = str9;
            }
        }
        if (!TextUtils.isEmpty(str8)) {
            int size2 = selectSource.getAudioInfoList().size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                if (AbstractC5868k.m23669a(selectSource.getAudioInfoList().get(i10).getLanguage(), str8)) {
                    definitionBean.getSelectSource().setSelectAudio(i10);
                    break;
                }
                i10++;
            }
        }
        selectAduio = definitionBean.getSelectSource().getSelectAduio();
        if (selectAduio != null) {
        }
        String str72 = "";
        this.f26694s1 = str72;
    }

    /* renamed from: dc */
    public final void m27554dc(List list) {
        String str = null;
        String str2 = null;
        int i10 = 0;
        Object m7008t = null;
        Object m7008t2 = null;
        String str3 = null;
        AbstractC5868k.m23674f(list, "list");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        Boolean selectSwitch = audioInfoUtil.getSelectSwitch(this.f26676a1);
        String str4 = null;
        if (selectSwitch == null) {
            Album album = this.f26647H1;
            if (album != null) {
                str3 = album.getSubLanguageSwitch();
            } else {
                str3 = null;
            }
            if (str3 != null && !AbstractC5868k.m23669a(str3, "null") && AbstractC6567a.m25637g(str3)) {
                selectSwitch = Boolean.valueOf(str3.equals("true"));
                audioInfoUtil.putSubtitleSwitch(this.f26676a1, selectSwitch.booleanValue());
            } else {
                selectSwitch = (Boolean) C7577i1.f27838b.m29085d().m29074f("key_setting_subtitle_switch", Boolean.valueOf(audioInfoUtil.getSUBTITLE_SWITCH()));
            }
        }
        this.f26690o1 = selectSwitch.booleanValue();
        AssetData assetData = this.f26632A0;
        if (assetData == null || (str = assetData.getContentId()) == null) {
            str = "";
        }
        RecordSubtitleInfoBean selectSubtitle = audioInfoUtil.getSelectSubtitle(str);
        if (selectSubtitle != null && !TextUtils.isEmpty(selectSubtitle.getSubTitleLanguage())) {
            this.f26689n1 = selectSubtitle.getSubtitleIndex();
            this.f26693r1 = selectSubtitle.getSubTitleLanguage();
            if (selectSubtitle.getSubtitleIndex() != -1) {
                m7008t2 = AbstractC1508t.m7008t(list, selectSubtitle.getSubtitleIndex());
                SubTitleItemData subTitleItemData = (SubTitleItemData) m7008t2;
                if (subTitleItemData != null) {
                    str4 = subTitleItemData.getLanguage();
                }
                if (!AbstractC5868k.m23669a(str4, selectSubtitle.getSubTitleLanguage())) {
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (selectSubtitle.getSubTitleLanguage().equals(((SubTitleItemData) list.get(i11)).getLanguage())) {
                            if (selectSubtitle.getSubtitleIndex() == i11) {
                                arrayList.add(Integer.valueOf(i11));
                                this.f26689n1 = i11;
                            }
                            arrayList2.add(Integer.valueOf(i11));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        if (AbstractC6567a.m25638h(arrayList2)) {
                            Object obj = arrayList2.get(0);
                            AbstractC5868k.m23673e(obj, "sameLanguage[0]");
                            this.f26689n1 = ((Number) obj).intValue();
                            return;
                        }
                        this.f26689n1 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Album album2 = this.f26647H1;
        if (album2 != null) {
            str2 = album2.getSubLanguage();
        } else {
            str2 = null;
        }
        Album album3 = this.f26647H1;
        if (album3 != null) {
            i10 = album3.getSubIndex();
        } else {
            i10 = 0;
        }
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            this.f26689n1 = i10;
            this.f26693r1 = str2;
            audioInfoUtil.putSelectSubtitle(this.f26676a1, i10, str2);
            m7008t = AbstractC1508t.m7008t(list, i10);
            SubTitleItemData subTitleItemData2 = (SubTitleItemData) m7008t;
            if (subTitleItemData2 != null) {
                str4 = subTitleItemData2.getLanguage();
            }
            if (!AbstractC5868k.m23669a(str4, str2)) {
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (str2.equals(((SubTitleItemData) list.get(i12)).getLanguage())) {
                        if (i10 == i12) {
                            arrayList.add(Integer.valueOf(i12));
                            this.f26689n1 = i12;
                        }
                        arrayList2.add(Integer.valueOf(i12));
                    }
                }
                if (arrayList.isEmpty()) {
                    if (AbstractC6567a.m25638h(arrayList2)) {
                        Object obj2 = arrayList2.get(0);
                        AbstractC5868k.m23673e(obj2, "sameLanguage[0]");
                        this.f26689n1 = ((Number) obj2).intValue();
                        return;
                    }
                    this.f26689n1 = 0;
                    return;
                }
                return;
            }
            return;
        }
        this.f26689n1 = 0;
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: f3 */
    public void mo5908f3() {
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        String str = null;
        long j10;
        super.mo3164g8();
        C4168g c4168g = this.f26697v1;
        if (c4168g != null) {
            if (c4168g != null) {
                c4168g.m17429y();
                return;
            }
            return;
        }
        Program program = this.f26687l1;
        if (program != null) {
            AbstractC5868k.m23671c(program);
            String name = program.getName();
            SimpleProgramList simpleProgramList = this.f26634B0;
            C4176d c4176d = null;
            if (simpleProgramList != null) {
                str = simpleProgramList.getContentId();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(name, str)) {
                C4176d c4176d2 = this.f26703z1;
                if (c4176d2 == null) {
                    AbstractC5868k.m23686r("mVideoView");
                    c4176d2 = null;
                }
                boolean z10 = true;
                if (!c4176d2.m17473r() && !this.f26682g1) {
                    Program program2 = this.f26687l1;
                    AbstractC5868k.m23671c(program2);
                    if (this.f26659N1) {
                        j10 = 0;
                    } else {
                        j10 = this.f26672W0;
                    }
                    program2.setStart(j10);
                    Program program3 = this.f26687l1;
                    AbstractC5868k.m23671c(program3);
                    m27364Fd(this, program3, false, true, 2, null);
                }
                C4176d c4176d3 = this.f26703z1;
                if (c4176d3 == null) {
                    AbstractC5868k.m23686r("mVideoView");
                    c4176d3 = null;
                }
                if (c4176d3.getVisibility() != 8) {
                    z10 = false;
                }
                if (z10) {
                    C4176d c4176d4 = this.f26703z1;
                    if (c4176d4 == null) {
                        AbstractC5868k.m23686r("mVideoView");
                    } else {
                        c4176d = c4176d4;
                    }
                    c4176d.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: gd */
    public final void m27555gd() {
        Observable observeOn = Observable.create(new ObservableOnSubscribe() { // from class: ud.a1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C7121n1.m27469hd(C7121n1.this, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b()).observeOn(AndroidSchedulers.mainThread());
        final t tVar = new t();
        Consumer consumer = new Consumer() { // from class: ud.b1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27473id(InterfaceC5660l.this, obj);
            }
        };
        final u uVar = u.f26759a;
        observeOn.subscribe(consumer, new Consumer() { // from class: ud.c1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27476jd(InterfaceC5660l.this, obj);
            }
        });
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void handleSubtitleDownloadFailReport(SubtitleDownloadErrorEvent subtitleDownloadErrorEvent) {
        AbstractC5868k.m23674f(subtitleDownloadErrorEvent, "event");
        AbstractC4509b.m18869b(this.f26700y0, "Download subtitle error message:" + subtitleDownloadErrorEvent.getErrorMessage(), new Object[0]);
        C7589m1.f27886a.m29128K(subtitleDownloadErrorEvent.getProgramId(), subtitleDownloadErrorEvent.getErrorMessage());
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: i1 */
    public boolean mo5909i1() {
        return false;
    }

    @Override // p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: j8 */
    public void mo3173j8() {
        super.mo3173j8();
        m27538Jd();
        this.f26682g1 = false;
        this.f26677b1 = false;
    }

    /* renamed from: jc */
    public final void m27556jc(AwakenVoiceAssistEvent awakenVoiceAssistEvent) {
        int i10 = 0;
        List<SimpleProgramList> simpleProgramList;
        int i11 = 0;
        List<SimpleProgramList> simpleProgramList2;
        AbstractC5868k.m23674f(awakenVoiceAssistEvent, "event");
        C4176d c4176d = null;
        if (AbstractC5868k.m23669a(awakenVoiceAssistEvent.getVoiceMsg(), "Previous")) {
            AssetData assetData = this.f26632A0;
            if (assetData != null && (simpleProgramList2 = assetData.getSimpleProgramList()) != null) {
                i11 = simpleProgramList2.size();
            } else {
                i11 = 0;
            }
            if (i11 > 1 && this.f26644G0 > 0) {
                m27442Yb().m5497g();
                C6940h c6940h = this.f26698w1;
                if (c6940h != null) {
                    c6940h.mo3279p9();
                }
                m27412Qc(this, false, 1, null);
                ((MFInfoBar) m27561ua(R$id.mInfoBar)).setLoadingNext(true);
                m27537Cc(this.f26644G0 - 1, true);
                return;
            }
            return;
        }
        if (AbstractC5868k.m23669a(awakenVoiceAssistEvent.getVoiceMsg(), "Next")) {
            AssetData assetData2 = this.f26632A0;
            if (assetData2 != null && (simpleProgramList = assetData2.getSimpleProgramList()) != null) {
                i10 = simpleProgramList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 1 && this.f26644G0 < i10 - 1) {
                m27442Yb().m5497g();
                C6940h c6940h2 = this.f26698w1;
                if (c6940h2 != null) {
                    c6940h2.mo3279p9();
                }
                m27412Qc(this, false, 1, null);
                ((MFInfoBar) m27561ua(R$id.mInfoBar)).setLoadingNext(true);
                m27537Cc(this.f26644G0 + 1, true);
                return;
            }
            return;
        }
        int i12 = R$id.mInfoBar;
        if (((MFInfoBar) m27561ua(i12)).getState() != 7 && ((MFInfoBar) m27561ua(i12)).getState() != 6 && ((MFInfoBar) m27561ua(i12)).getState() != 4 && ((MFInfoBar) m27561ua(i12)).getState() != 0 && ((MFInfoBar) m27561ua(i12)).getState() != 9 && ((MFInfoBar) m27561ua(i12)).getState() != -1 && ((MFInfoBar) m27561ua(i12)).getState() != -3 && ((MFInfoBar) m27561ua(i12)).getState() != -2 && ((MFInfoBar) m27561ua(i12)).getState() != 10) {
            String voiceMsg = awakenVoiceAssistEvent.getVoiceMsg();
            switch (voiceMsg.hashCode()) {
                case -1850451749:
                    if (voiceMsg.equals("Rewind")) {
                        m27421Sc(false);
                        return;
                    }
                    return;
                case 2490196:
                    if (voiceMsg.equals("Play")) {
                        m27403Oc();
                        return;
                    }
                    return;
                case 2587682:
                    if (!voiceMsg.equals("Stop")) {
                        return;
                    }
                    break;
                case 76887510:
                    if (!voiceMsg.equals("Pause")) {
                        return;
                    }
                    break;
                case 771693225:
                    if (voiceMsg.equals("FastForward")) {
                        m27421Sc(true);
                        return;
                    }
                    return;
                default:
                    return;
            }
            C4176d c4176d2 = this.f26703z1;
            if (c4176d2 == null) {
                AbstractC5868k.m23686r("mVideoView");
            } else {
                c4176d = c4176d2;
            }
            if (c4176d.m17473r()) {
                m27348Bc();
            }
        }
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: k0 */
    public void mo7569k0(int i10) {
        EnumC7254b enumC7254b;
        if (i10 == 0) {
            enumC7254b = EnumC7254b.NATIVE;
        } else {
            enumC7254b = EnumC7254b.IJK;
        }
        C4176d c4176d = this.f26703z1;
        if (c4176d == null) {
            AbstractC5868k.m23686r("mVideoView");
            c4176d = null;
        }
        C4177e.m17468z(c4176d, enumC7254b, null, true, 2, null);
        C4094b.f17998a.m17149l(RangerPlayTag.VOD.getValue(), "", enumC7254b);
        ((MFInfoBar) m27561ua(R$id.mInfoBar)).setStatus(10);
        this.f26673X0 = false;
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: k6 */
    public void mo7570k6(int i10) {
        m27544Tc(i10);
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        if (!TextUtils.isEmpty(this.f26638D0)) {
            m27391Lc();
        }
    }

    /* renamed from: kd */
    public final void m27557kd() {
        Observable observeOn = Observable.create(new ObservableOnSubscribe() { // from class: ud.z
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C7121n1.m27483ld(C7121n1.this, observableEmitter);
            }
        }).subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        final v vVar = new v();
        Consumer consumer = new Consumer() { // from class: ud.k0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27487md(InterfaceC5660l.this, obj);
            }
        };
        final w wVar = w.f26761a;
        observeOn.subscribe(consumer, new Consumer() { // from class: ud.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27491nd(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: l6 */
    public final void m27558l6(boolean z10) {
        int i10 = 0;
        int i11 = 0;
        this.f26660O0 = z10;
        int i12 = R$id.mInfoBar;
        ((MFInfoBar) m27561ua(i12)).m12195P(z10);
        m27557kd();
        ImageView imageView = this.f26658N0;
        if (imageView != null) {
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            imageView.setVisibility(i11);
        }
        C4168g c4168g = this.f26697v1;
        if (c4168g != null) {
            c4168g.setFullScreen(z10);
        }
        C4176d c4176d = null;
        if (z10) {
            if (this.f26653K1) {
                ((MFInfoBar) m27561ua(i12)).m12198W();
                ((MFInfoBar) m27561ua(i12)).m12199X();
                if (!this.f26651J1) {
                    this.f26653K1 = false;
                }
                m27431Vb();
                mo24155W3();
            }
            m27479kc();
            if (this.f26697v1 == null) {
                ((MFInfoBar) m27561ua(i12)).m12189A0();
                C1328x c1328x = C1328x.f4998a;
            }
            if (!VodDetailsActivity.f17367q0.m16498a() && this.f26681f1) {
                C4176d c4176d2 = this.f26703z1;
                if (c4176d2 == null) {
                    AbstractC5868k.m23686r("mVideoView");
                } else {
                    c4176d = c4176d2;
                }
                if (c4176d.m17474s()) {
                    m27501qd();
                }
            }
        } else {
            C4176d c4176d3 = this.f26703z1;
            if (c4176d3 == null) {
                AbstractC5868k.m23686r("mVideoView");
            } else {
                c4176d = c4176d3;
            }
            c4176d.setAspectRatio(0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (z10) {
            i10 = 45;
        } else {
            i10 = 25;
        }
        layoutParams.bottomMargin = AbstractC7786b.m30163g(i10);
        ((TextView) m27561ua(R$id.mTvSubtitle)).setLayoutParams(layoutParams);
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: m2 */
    public void mo5910m2() {
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f26667R1.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        m27482lc();
        C5911g.f23514h.m23905a().m23903v(new b());
    }

    /* renamed from: od */
    public final void m27559od() {
        String str = null;
        SourceBean selectSource;
        AudioInfoBean selectAduio;
        String transLanguage = null;
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        AssetData assetData = this.f26632A0;
        String str2 = "";
        if (assetData == null || (str = assetData.getContentId()) == null) {
            str = "";
        }
        if (AbstractC5868k.m23669a(audioInfoUtil.getSelectSwitch(str), Boolean.TRUE)) {
            ((TextView) m27561ua(R$id.mTvSubtitle)).setVisibility(0);
            m27458ed();
            return;
        }
        C7589m1 c7589m1 = C7589m1.f27886a;
        DefinitionBean m27545Wb = m27545Wb();
        if (m27545Wb != null && (selectSource = m27545Wb.getSelectSource()) != null && (selectAduio = selectSource.getSelectAduio()) != null && (transLanguage = selectAduio.getTransLanguage()) != null) {
            str2 = transLanguage;
        }
        c7589m1.m29152u(false, str2);
        ((TextView) m27561ua(R$id.mTvSubtitle)).setVisibility(8);
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        int i11 = R$id.mInfoBar;
        if (((MFInfoBar) m27561ua(i11)).m12202m0() || ((MFInfoBar) m27561ua(i11)).m12201l0()) {
            ((MFInfoBar) m27561ua(i11)).m12204s0();
        }
        if (this.f26697v1 != null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 4) {
            C4176d c4176d = null;
            if (keyCode != 7) {
                if (keyCode != 85) {
                    switch (keyCode) {
                        case 19:
                            if (((MFInfoBar) m27561ua(i11)).m12202m0()) {
                                ((MFInfoBar) m27561ua(i11)).m12206w0();
                                return false;
                            }
                            if (((MFInfoBar) m27561ua(i11)).m12201l0()) {
                                ((MFInfoBar) m27561ua(i11)).m12196U();
                                break;
                            } else {
                                ((MFInfoBar) m27561ua(i11)).m12189A0();
                                break;
                            }
                        case 20:
                            C4176d c4176d2 = this.f26703z1;
                            if (c4176d2 == null) {
                                AbstractC5868k.m23686r("mVideoView");
                            } else {
                                c4176d = c4176d2;
                            }
                            if (!c4176d.m17473r() && ((MFInfoBar) m27561ua(i11)).m12200k0()) {
                                ((MFInfoBar) m27561ua(i11)).setAdVisible(false);
                                break;
                            } else {
                                if (((MFInfoBar) m27561ua(i11)).m12202m0()) {
                                    ((MFInfoBar) m27561ua(i11)).m12206w0();
                                    return false;
                                }
                                if (((MFInfoBar) m27561ua(i11)).m12202m0()) {
                                    return false;
                                }
                                ((MFInfoBar) m27561ua(i11)).setSettingVisibility(true);
                                break;
                            }
                            break;
                        case 21:
                        case 22:
                            if (((MFInfoBar) m27561ua(i11)).m12202m0() || ((MFInfoBar) m27561ua(i11)).m12201l0()) {
                                return false;
                            }
                            ((MFInfoBar) m27561ua(i11)).m12189A0();
                            ((MFInfoBar) m27561ua(i11)).m12207x0();
                            break;
                            break;
                        case 23:
                            break;
                        default:
                            return false;
                    }
                }
                if (keyEvent.getRepeatCount() != 0 || ((MFInfoBar) m27561ua(i11)).m12202m0()) {
                    return false;
                }
                if (((MFInfoBar) m27561ua(i11)).getState() != 7 && ((MFInfoBar) m27561ua(i11)).getState() != 6 && ((MFInfoBar) m27561ua(i11)).getState() != 4 && ((MFInfoBar) m27561ua(i11)).getState() != 0 && ((MFInfoBar) m27561ua(i11)).getState() != 1 && ((MFInfoBar) m27561ua(i11)).getState() != 9 && ((MFInfoBar) m27561ua(i11)).getState() != -1 && ((MFInfoBar) m27561ua(i11)).getState() != -3 && ((MFInfoBar) m27561ua(i11)).getState() != -2 && ((MFInfoBar) m27561ua(i11)).getState() != 10) {
                    C4176d c4176d3 = this.f26703z1;
                    if (c4176d3 == null) {
                        AbstractC5868k.m23686r("mVideoView");
                        c4176d3 = null;
                    }
                    if (c4176d3.m17473r()) {
                        m27348Bc();
                        this.f26682g1 = true;
                    } else {
                        m27403Oc();
                        this.f26682g1 = false;
                        if (this.f26659N1) {
                            ((MFInfoBar) m27561ua(i11)).m12199X();
                            C4176d c4176d4 = this.f26703z1;
                            if (c4176d4 == null) {
                                AbstractC5868k.m23686r("mVideoView");
                            } else {
                                c4176d = c4176d4;
                            }
                            c4176d.m17477w(0L);
                            this.f26659N1 = false;
                        }
                    }
                }
            } else {
                C4176d c4176d5 = this.f26703z1;
                if (c4176d5 == null) {
                    AbstractC5868k.m23686r("mVideoView");
                } else {
                    c4176d = c4176d5;
                }
                if (c4176d.m17473r() || !((MFInfoBar) m27561ua(i11)).m12200k0()) {
                    return false;
                }
                ((MFInfoBar) m27561ua(i11)).m12193N();
            }
        } else if (((MFInfoBar) m27561ua(i11)).m12201l0()) {
            ((MFInfoBar) m27561ua(i11)).m12196U();
        } else {
            if (!((MFInfoBar) m27561ua(i11)).m12202m0()) {
                return false;
            }
            ((MFInfoBar) m27561ua(i11)).setSettingVisibility(false);
        }
        return true;
    }

    /* renamed from: pc */
    public final void m27560pc(final HashMap hashMap, String str) {
        boolean z10 = false;
        int i10 = 0;
        String str2 = null;
        String str3 = null;
        String name = null;
        String contentId = null;
        AbstractC5868k.m23674f(hashMap, "map");
        if (hashMap.isEmpty()) {
            return;
        }
        C1456h0 c1456h0 = C1456h0.f5574a;
        C1456h0.a aVar = C1456h0.a.VOD;
        List m6773i = c1456h0.m6773i(aVar);
        final List m6774j = c1456h0.m6774j(aVar);
        if (m6773i != null && !m6773i.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            int m6917a = C1473s.f5656a.m6917a();
            if (m6917a == 0) {
                i10 = 20900;
            } else {
                i10 = m6917a;
            }
            AbstractActivityC0712e m3075C6 = m3075C6();
            AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
            AbstractActivityC2972a abstractActivityC2972a = (AbstractActivityC2972a) m3075C6;
            C7617x c7617x = C7617x.f28030a;
            Context m3107M8 = m3107M8();
            AbstractC5868k.m23673e(m3107M8, "requireContext()");
            String m29327c = C7617x.m29327c(c7617x, m3107M8, String.valueOf(i10), false, 4, null);
            AssetData assetData = this.f26632A0;
            if (assetData == null || (contentId = assetData.getContentId()) == null) {
                str2 = "";
            } else {
                str2 = contentId;
            }
            AssetData assetData2 = this.f26632A0;
            if (assetData2 == null || (name = assetData2.getName()) == null) {
                str3 = "";
            } else {
                str3 = name;
            }
            AbstractActivityC2972a.m11962b6(abstractActivityC2972a, i10, false, null, m29327c, "apk", "vod", str2, str3, "", "", null, EventType.AUTH_FAIL, null);
            this.f26669T0 = false;
            this.f26666R0 = true;
            this.f26668S0 = true;
            return;
        }
        final C5878u c5878u = new C5878u();
        final C5878u c5878u2 = new C5878u();
        final C5878u c5878u3 = new C5878u();
        final C5878u c5878u4 = new C5878u();
        final ArrayList arrayList = new ArrayList();
        C5878u c5878u5 = new C5878u();
        c5878u5.f23412a = new ArrayList();
        this.f26664Q0.clear();
        Disposable disposable = this.f26637C1;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: ud.m0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C7121n1.m27500qc(hashMap, c5878u3, c5878u4, this, arrayList, c5878u2, c5878u, m6774j, observableEmitter);
            }
        }).compose(AbstractC7029f.m27120a());
        final i iVar = new i(c5878u5, c5878u4, this, arrayList, str);
        Consumer consumer = new Consumer() { // from class: ud.n0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27504rc(InterfaceC5660l.this, obj);
            }
        };
        final j jVar = j.f26736a;
        this.f26637C1 = compose.subscribe(consumer, new Consumer() { // from class: ud.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7121n1.m27508sc(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: ud.p0
            @Override // io.reactivex.functions.Action
            public final void run() {
                C7121n1.m27512tc();
            }
        });
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: q4 */
    public void mo5911q4() {
        int i10 = R$id.mInfoBar;
        if (((MFInfoBar) m27561ua(i10)).getState() == 1) {
            ((MFInfoBar) m27561ua(i10)).setStatus(3);
        }
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: r4 */
    public void mo5912r4() {
        int i10 = R$id.mInfoBar;
        if (((MFInfoBar) m27561ua(i10)).getState() != 0 && ((MFInfoBar) m27561ua(i10)).getState() != 2) {
            ((MFInfoBar) m27561ua(i10)).setStatus(1);
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void stopVodPlayMessage(StopVodPlayEvent stopVodPlayEvent) {
        AbstractC5868k.m23674f(stopVodPlayEvent, "event");
        m27538Jd();
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void subTitleDowmloadCompleteMessage(SubtitleDownloadFinishEvent subtitleDownloadFinishEvent) {
        AbstractC5868k.m23674f(subtitleDownloadFinishEvent, "event");
        if (AbstractC5868k.m23669a(this.f26675Z0, subtitleDownloadFinishEvent.getProgramId())) {
            m27458ed();
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: t */
    public void mo5913t(String str, String str2, long j10) {
        AbstractC5868k.m23674f(str, "adName");
        AbstractC5868k.m23674f(str2, "path");
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: u1 */
    public void mo5914u1() {
    }

    /* renamed from: ua */
    public View m27561ua(int i10) {
        View findViewById;
        Map map = this.f26667R1;
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

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: w0 */
    public void mo7572w0(int i10) {
        if (i10 == 0) {
            String programTitle = ((MFInfoBar) m27561ua(R$id.mInfoBar)).getProgramTitle();
            if (AbstractC6567a.m25637g(programTitle)) {
                ViewOnClickListenerC4758c0 m19681b = ViewOnClickListenerC4758c0.f20101M0.m19681b("vod", programTitle);
                AbstractC0729o m3110N8 = m3110N8();
                AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
                m19681b.mo3277E9(m3110N8, "FeedbackDialog");
            }
        }
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: w5 */
    public void mo7573w5(int i10) {
        if (this.f26644G0 != i10) {
            m27355Dc(this, i10, false, 2, null);
        }
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: w6 */
    public void mo5915w6() {
        String str = null;
        DialogC4084w0 dialogC4084w0;
        DialogC4084w0 dialogC4084w02 = this.f26663P1;
        boolean z10 = false;
        if (dialogC4084w02 != null && dialogC4084w02.isShowing()) {
            z10 = true;
        }
        if (z10 && (dialogC4084w0 = this.f26663P1) != null) {
            dialogC4084w0.dismiss();
        }
        C7618x0 c7618x0 = C7618x0.f28031a;
        if (!c7618x0.m29363z()) {
            ArrayList arrayList = new ArrayList();
            String m6776l = C1456h0.f5574a.m6776l();
            AssetData assetData = this.f26632A0;
            if (assetData == null || (str = assetData.getName()) == null) {
                str = "";
            }
            c7618x0.m29359C(null, arrayList, false, m6776l, "EC11", AgooConstants.ACK_BODY_NULL, str, "", C1456h0.a.VOD.m6784b(), "", "");
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            c7618x0.m29361F(m3096J6);
            c7618x0.m29360E(this.f26665Q1);
        }
    }

    /* renamed from: wd */
    public final boolean m27562wd() {
        Dialog m3280r9;
        String str = null;
        if (!m30051p9()) {
            return false;
        }
        if (!this.f26666R0) {
            AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.load_audio_tip), new int[0]);
            return false;
        }
        if (!this.f26683h1) {
            AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.play_not_vip), new int[0]);
            return false;
        }
        if (this.f26641E1.isEmpty()) {
            AbstractC7598p1.m29244h(m3096J6(), m3175k7(R$string.vod_play_no_source_available, C7615w.f27995a.m29303G()), new int[0]);
            return false;
        }
        C6940h c6940h = new C6940h();
        this.f26698w1 = c6940h;
        c6940h.m26963Z9(m27545Wb());
        C6940h c6940h2 = this.f26698w1;
        if (c6940h2 != null) {
            c6940h2.m26966ca(this.f26688m1);
        }
        C6940h c6940h3 = this.f26698w1;
        if (c6940h3 != null) {
            AssetData assetData = this.f26632A0;
            if (assetData == null || (str = assetData.getContentId()) == null) {
                str = "";
            }
            c6940h3.m26964aa(str);
        }
        C6940h c6940h4 = this.f26698w1;
        if (c6940h4 != null) {
            c6940h4.m26962Y9(this.f26675Z0);
        }
        C6940h c6940h5 = this.f26698w1;
        if (c6940h5 != null) {
            c6940h5.m26967da(this.f26690o1, this.f26689n1, this.f26691p1, this.f26692q1);
        }
        C6940h c6940h6 = this.f26698w1;
        if (c6940h6 != null) {
            c6940h6.mo3277E9(m3093I6(), "SelectSubTitleAndAudioDialog");
        }
        C6940h c6940h7 = this.f26698w1;
        if (c6940h7 != null && (m3280r9 = c6940h7.m3280r9()) != null) {
            m3280r9.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ud.d0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C7121n1.m27527xd(C7121n1.this, dialogInterface);
                }
            });
        }
        C6940h c6940h8 = this.f26698w1;
        if (c6940h8 != null) {
            c6940h8.m26965ba(new y());
        }
        return true;
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: x2 */
    public void mo5916x2() {
        DialogC4084w0 dialogC4084w0;
        DialogC4084w0 dialogC4084w02 = this.f26663P1;
        boolean z10 = false;
        if (dialogC4084w02 != null && dialogC4084w02.isShowing()) {
            z10 = true;
        }
        if (z10 && (dialogC4084w0 = this.f26663P1) != null) {
            dialogC4084w0.dismiss();
        }
        C7618x0.f28031a.m29362x(true);
    }

    @Override // com.module.playsetting.view.PlaySettingView.InterfaceC2975b
    /* renamed from: x4 */
    public void mo7574x4(int i10) {
        m27439Xc(i10);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f26702z0;
    }

    @Override // bd.InterfaceC1294a
    /* renamed from: z2 */
    public void mo5917z2() {
        m27451cd();
    }
}
