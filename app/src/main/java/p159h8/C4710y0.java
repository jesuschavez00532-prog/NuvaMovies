package p159h8;

import ac.C0199r0;
import ac.C0223y;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ba.AbstractC1196d;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.live.R$string;
import com.live.bean.EpgDate;
import com.live.p063db.ReservationList;
import com.module.event.PlaySelectedChannelListEvent;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.request.result.ChildColumn;
import com.request.result.EpgData;
import com.request.result.GetColumnContentsResultData;
import com.request.result.GetLiveDataResult;
import com.request.result.GetLiveDataResultData;
import com.request.result.UserInfo;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import p040c8.C1407f;
import p040c8.C1427v;
import p130f8.InterfaceC4276c;
import p130f8.InterfaceC4277d;
import p132fa.C4300d;
import p135fd.C4307b;
import p170i2.C4842a;
import p185j2.C4982a;
import p193ja.C5044a;
import p223l8.C5442e1;
import p263o8.InterfaceC5941s;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6396j0;
import p301qb.InterfaceC6431v;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7027d;
import p348u2.AbstractC7029f;
import p348u2.AbstractC7030g;
import p383w9.C7383a;
import p400xa.C7581k;
import p400xa.C7589m1;
import ye.C7709c;

/* renamed from: h8.y0 */
/* loaded from: classes2.dex */
public final class C4710y0 implements InterfaceC4276c, InterfaceC6396j0, InterfaceC6431v {

    /* renamed from: a */
    private AbstractC1196d f20016a;

    /* renamed from: b */
    private InterfaceC4277d f20017b;

    /* renamed from: c */
    private final String f20018c;

    /* renamed from: d */
    private final int f20019d;

    /* renamed from: e */
    private EpgDate f20020e;

    /* renamed from: f */
    private Channel f20021f;

    /* renamed from: g */
    private C0199r0 f20022g;

    /* renamed from: h */
    private C0223y f20023h;

    /* renamed from: i */
    private Disposable f20024i;

    /* renamed from: j */
    private Disposable f20025j;

    /* renamed from: k */
    private Disposable f20026k;

    /* renamed from: l */
    private Disposable f20027l;

    /* renamed from: m */
    private final InterfaceC1312h f20028m;

    /* renamed from: h8.y0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ EpgProgram f20030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EpgProgram epgProgram) {
            super(1);
            this.f20030b = epgProgram;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EpgProgram mo542f(EpgProgram epgProgram) {
            AbstractC5868k.m23674f(epgProgram, "it");
            C1427v.f5519a.m6617C(C4710y0.this.f20021f, this.f20030b);
            epgProgram.setFlag(0);
            return epgProgram;
        }
    }

    /* renamed from: h8.y0$a0 */
    /* loaded from: classes2.dex */
    static final class a0 extends AbstractC5869l implements InterfaceC5660l {
        a0() {
            super(1);
        }

        /* renamed from: a */
        public final void m19522a(ArrayList arrayList) {
            InterfaceC4277d m19520O5 = C4710y0.this.m19520O5();
            AbstractC5868k.m23673e(arrayList, "it");
            m19520O5.mo17857W5(arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19522a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.y0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19523a(EpgProgram epgProgram) {
            C4710y0.this.m19520O5().mo17862z0();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19523a((EpgProgram) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.y0$b0 */
    /* loaded from: classes2.dex */
    static final class b0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b0 f20033a = new b0();

        b0() {
            super(1);
        }

        /* renamed from: a */
        public final void m19524a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19524a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.y0$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f20034a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19525a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19525a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.y0$c0 */
    /* loaded from: classes2.dex */
    static final class c0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ReservationList f20035a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(ReservationList reservationList) {
            super(1);
            this.f20035a = reservationList;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EpgProgram mo542f(EpgProgram epgProgram) {
            AbstractC5868k.m23674f(epgProgram, "it");
            C1427v.f5519a.m6615B(this.f20035a);
            return epgProgram;
        }
    }

    /* renamed from: h8.y0$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ EpgProgram f20036a;

        /* renamed from: b */
        final /* synthetic */ C4710y0 f20037b;

        /* renamed from: c */
        final /* synthetic */ EpgDate f20038c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(EpgProgram epgProgram, C4710y0 c4710y0, EpgDate epgDate) {
            super(1);
            this.f20036a = epgProgram;
            this.f20037b = c4710y0;
            this.f20038c = epgDate;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "it");
            if (AbstractC6567a.m25635e(arrayList)) {
                this.f20036a.setFlag(1);
                C1427v.f5519a.m6633S(this.f20037b.f20021f, this.f20038c, this.f20036a);
                C7589m1 c7589m1 = C7589m1.f27886a;
                String m29162c = C7589m1.b.f27896a.m29162c();
                String programName = this.f20036a.getProgramName();
                if (programName == null) {
                    programName = "";
                }
                c7589m1.m29136e(m29162c, programName);
            }
            return arrayList;
        }
    }

    /* renamed from: h8.y0$d0 */
    /* loaded from: classes2.dex */
    static final class d0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ EpgDate f20040b;

        /* renamed from: c */
        final /* synthetic */ EpgProgram f20041c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(EpgDate epgDate, EpgProgram epgProgram) {
            super(1);
            this.f20040b = epgDate;
            this.f20041c = epgProgram;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EpgProgram mo542f(EpgProgram epgProgram) {
            AbstractC5868k.m23674f(epgProgram, "it");
            C1427v.f5519a.m6633S(C4710y0.this.f20021f, this.f20040b, this.f20041c);
            C7589m1 c7589m1 = C7589m1.f27886a;
            String m29162c = C7589m1.b.f27896a.m29162c();
            String programName = this.f20041c.getProgramName();
            if (programName == null) {
                programName = "";
            }
            c7589m1.m29136e(m29162c, programName);
            epgProgram.setFlag(1);
            return epgProgram;
        }
    }

    /* renamed from: h8.y0$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ EpgDate f20043b;

        /* renamed from: c */
        final /* synthetic */ EpgProgram f20044c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(EpgDate epgDate, EpgProgram epgProgram) {
            super(1);
            this.f20043b = epgDate;
            this.f20044c = epgProgram;
        }

        /* renamed from: a */
        public final void m19529a(ArrayList arrayList) {
            if (AbstractC6567a.m25635e(arrayList)) {
                C4710y0.this.m19520O5().mo17862z0();
                return;
            }
            if (C4710y0.this.f20021f == null) {
                return;
            }
            InterfaceC4277d m19520O5 = C4710y0.this.m19520O5();
            Channel channel = C4710y0.this.f20021f;
            AbstractC5868k.m23671c(channel);
            EpgDate epgDate = this.f20043b;
            EpgProgram epgProgram = this.f20044c;
            Object obj = arrayList.get(0);
            AbstractC5868k.m23673e(obj, "it[0]");
            m19520O5.mo17854D2(channel, epgDate, epgProgram, (ReservationList) obj);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19529a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.y0$e0 */
    /* loaded from: classes2.dex */
    static final class e0 extends AbstractC5869l implements InterfaceC5660l {
        e0() {
            super(1);
        }

        /* renamed from: a */
        public final void m19530a(EpgProgram epgProgram) {
            C4710y0.this.m19520O5().mo17862z0();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19530a((EpgProgram) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.y0$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f20046a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m19531a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19531a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.y0$f0 */
    /* loaded from: classes2.dex */
    static final class f0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f0 f20047a = new f0();

        f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m19532a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19532a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g f20048a = new g();

        g() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            return C1427v.f5519a.m6653q(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f20049a = new h();

        h() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "it");
            C1427v.f5519a.m6657t0(arrayList);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {
        i() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(ArrayList arrayList) {
            String str = null;
            AbstractC5868k.m23674f(arrayList, "it");
            C1427v c1427v = C1427v.f5519a;
            Channel channel = C4710y0.this.f20021f;
            if (channel != null) {
                str = channel.getChannelCode();
            } else {
                str = null;
            }
            c1427v.m6641a0(arrayList, str);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ String f20052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(1);
            this.f20052b = str;
        }

        /* renamed from: a */
        public final void m19536a(ArrayList arrayList) {
            C1427v c1427v = C1427v.f5519a;
            String str = this.f20052b;
            AbstractC5868k.m23673e(arrayList, "it");
            c1427v.m6652p0(str, arrayList);
            C4710y0.this.m19485g6();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19536a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final k f20053a = new k();

        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m19537a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19537a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.y0$l */
    /* loaded from: classes2.dex */
    static final class l extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final l f20054a = new l();

        l() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$m */
    /* loaded from: classes2.dex */
    public static final class m extends AbstractC5869l implements InterfaceC5660l {
        m() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(EpgDate epgDate) {
            String str = null;
            AbstractC5868k.m23674f(epgDate, "it");
            C1427v c1427v = C1427v.f5519a;
            Channel channel = C4710y0.this.f20021f;
            String str2 = null;
            if (channel != null) {
                str = channel.getChannelCode();
            } else {
                str = null;
            }
            ArrayList m6628N = c1427v.m6628N(str, epgDate);
            Channel channel2 = C4710y0.this.f20021f;
            if (channel2 != null) {
                str2 = channel2.getChannelCode();
            }
            c1427v.m6641a0(m6628N, str2);
            return m6628N;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$n */
    /* loaded from: classes2.dex */
    public static final class n extends AbstractC5869l implements InterfaceC5660l {
        n() {
            super(1);
        }

        /* renamed from: a */
        public final void m19540a(ArrayList arrayList) {
            if (AbstractC6567a.m25635e(arrayList)) {
                C4710y0.this.m19520O5().mo17859n3();
                return;
            }
            InterfaceC4277d m19520O5 = C4710y0.this.m19520O5();
            AbstractC5868k.m23673e(arrayList, "it");
            m19520O5.mo17861w4(arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19540a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$o */
    /* loaded from: classes2.dex */
    public static final class o extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final o f20057a = new o();

        o() {
            super(1);
        }

        /* renamed from: a */
        public final void m19541a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19541a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$p */
    /* loaded from: classes2.dex */
    public static final class p extends AbstractC5869l implements InterfaceC5660l {
        p() {
            super(1);
        }

        /* renamed from: a */
        public final void m19542a(ArrayList arrayList) {
            if (AbstractC6567a.m25635e(arrayList)) {
                C4710y0.this.m19520O5().mo17859n3();
                return;
            }
            InterfaceC4277d m19520O5 = C4710y0.this.m19520O5();
            AbstractC5868k.m23673e(arrayList, "it");
            m19520O5.mo17861w4(arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19542a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$q */
    /* loaded from: classes2.dex */
    public static final class q extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final q f20059a = new q();

        q() {
            super(1);
        }

        /* renamed from: a */
        public final void m19543a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19543a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$r */
    /* loaded from: classes2.dex */
    public static final class r extends AbstractC5869l implements InterfaceC5660l {
        r() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(EpgDate epgDate) {
            String str = null;
            AbstractC5868k.m23674f(epgDate, "it");
            C1427v c1427v = C1427v.f5519a;
            Channel channel = C4710y0.this.f20021f;
            String str2 = null;
            if (channel != null) {
                str = channel.getChannelCode();
            } else {
                str = null;
            }
            ArrayList m6628N = c1427v.m6628N(str, epgDate);
            Channel channel2 = C4710y0.this.f20021f;
            if (channel2 != null) {
                str2 = channel2.getChannelCode();
            }
            c1427v.m6641a0(m6628N, str2);
            return m6628N;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$s */
    /* loaded from: classes2.dex */
    public static final class s extends AbstractC5869l implements InterfaceC5660l {
        s() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(EpgDate epgDate) {
            String str = null;
            AbstractC5868k.m23674f(epgDate, "it");
            C1427v c1427v = C1427v.f5519a;
            Channel channel = C4710y0.this.f20021f;
            if (channel != null) {
                str = channel.getChannelCode();
            } else {
                str = null;
            }
            return c1427v.m6629O(epgDate, c1427v.m6626L(str));
        }
    }

    /* renamed from: h8.y0$t */
    /* loaded from: classes2.dex */
    static final class t extends AbstractC5869l implements InterfaceC5660l {
        t() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(Boolean bool) {
            AbstractC5868k.m23674f(bool, "it");
            ArrayList m6639Z = C1427v.f5519a.m6639Z(System.currentTimeMillis(), bool.booleanValue());
            if (bool.booleanValue()) {
                EpgDate epgDate = (EpgDate) m6639Z.get(6);
                String string = C4710y0.this.m19517B5().m3154d7().getString(R$string.today);
                AbstractC5868k.m23673e(string, "frag.resources.getString(R.string.today)");
                epgDate.setMonthInfo(string);
            } else {
                EpgDate epgDate2 = (EpgDate) m6639Z.get(0);
                String string2 = C4710y0.this.m19517B5().m3154d7().getString(R$string.today);
                AbstractC5868k.m23673e(string2, "frag.resources.getString(R.string.today)");
                epgDate2.setMonthInfo(string2);
            }
            return m6639Z;
        }
    }

    /* renamed from: h8.y0$u */
    /* loaded from: classes2.dex */
    static final class u extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ boolean f20063a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5941s f20064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(boolean z10, InterfaceC5941s interfaceC5941s) {
            super(1);
            this.f20063a = z10;
            this.f20064b = interfaceC5941s;
        }

        /* renamed from: a */
        public final void m19547a(ArrayList arrayList) {
            if (this.f20063a) {
                InterfaceC5941s interfaceC5941s = this.f20064b;
                if (interfaceC5941s != null) {
                    AbstractC5868k.m23673e(arrayList, "it");
                    interfaceC5941s.mo24025a(arrayList, 6);
                    return;
                }
                return;
            }
            InterfaceC5941s interfaceC5941s2 = this.f20064b;
            if (interfaceC5941s2 != null) {
                AbstractC5868k.m23673e(arrayList, "it");
                interfaceC5941s2.mo24025a(arrayList, 0);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19547a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.y0$v */
    /* loaded from: classes2.dex */
    static final class v extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final v f20065a = new v();

        v() {
            super(1);
        }

        /* renamed from: a */
        public final void m19548a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19548a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$w */
    /* loaded from: classes2.dex */
    public static final class w extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ boolean f20067b;

        /* renamed from: c */
        final /* synthetic */ int f20068c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z10, int i10) {
            super(1);
            this.f20067b = z10;
            this.f20068c = i10;
        }

        /* renamed from: a */
        public final void m19549a(ArrayList arrayList) {
            if (AbstractC6567a.m25635e(arrayList)) {
                C4710y0.this.m19520O5().mo17858n1(this.f20067b);
                return;
            }
            InterfaceC4277d m19520O5 = C4710y0.this.m19520O5();
            AbstractC5868k.m23673e(arrayList, "it");
            m19520O5.mo17853D0(arrayList, this.f20068c);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19549a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$x */
    /* loaded from: classes2.dex */
    public static final class x extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final x f20069a = new x();

        x() {
            super(1);
        }

        /* renamed from: a */
        public final void m19550a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19550a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$y */
    /* loaded from: classes2.dex */
    public static final class y extends AbstractC5869l implements InterfaceC5660l {
        y() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(EpgDate epgDate) {
            String str = null;
            AbstractC5868k.m23674f(epgDate, "it");
            C1427v c1427v = C1427v.f5519a;
            Channel channel = C4710y0.this.f20021f;
            String str2 = null;
            if (channel != null) {
                str = channel.getChannelCode();
            } else {
                str = null;
            }
            ArrayList m6628N = c1427v.m6628N(str, epgDate);
            Channel channel2 = C4710y0.this.f20021f;
            if (channel2 != null) {
                str2 = channel2.getChannelCode();
            }
            c1427v.m6641a0(m6628N, str2);
            return m6628N;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.y0$z */
    /* loaded from: classes2.dex */
    public static final class z extends AbstractC5869l implements InterfaceC5660l {
        z() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(EpgDate epgDate) {
            String str = null;
            AbstractC5868k.m23674f(epgDate, "it");
            C1427v c1427v = C1427v.f5519a;
            Channel channel = C4710y0.this.f20021f;
            if (channel != null) {
                str = channel.getChannelCode();
            } else {
                str = null;
            }
            return c1427v.m6629O(epgDate, c1427v.m6626L(str));
        }
    }

    public C4710y0(AbstractC1196d abstractC1196d, InterfaceC4277d interfaceC4277d) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractC1196d, "frag");
        AbstractC5868k.m23674f(interfaceC4277d, "view");
        this.f20016a = abstractC1196d;
        this.f20017b = interfaceC4277d;
        this.f20018c = C4710y0.class.getSimpleName();
        this.f20019d = 600000;
        this.f20022g = new C0199r0(this);
        this.f20023h = new C0223y(this);
        m5965b = AbstractC1314j.m5965b(l.f20054a);
        this.f20028m = m5965b;
    }

    /* renamed from: A5 */
    private final void m19431A5() {
        Disposable disposable = this.f20024i;
        if (disposable != null) {
            AbstractC6567a.m25632b(disposable);
        }
        this.f20024i = null;
        Disposable disposable2 = this.f20026k;
        if (disposable2 != null) {
            AbstractC6567a.m25632b(disposable2);
        }
        this.f20026k = null;
        Disposable disposable3 = this.f20025j;
        if (disposable3 != null) {
            AbstractC6567a.m25632b(disposable3);
        }
        this.f20025j = null;
        Disposable disposable4 = this.f20027l;
        if (disposable4 != null) {
            AbstractC6567a.m25632b(disposable4);
        }
        this.f20027l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A6 */
    public static final void m19432A6(ObservableEmitter observableEmitter) {
        GetColumnContentsResultData getColumnContentsResultData;
        List<ChildColumn> list;
        AbstractC5868k.m23674f(observableEmitter, "it");
        ArrayList arrayList = new ArrayList();
        Object m20485a = C5044a.f20862a.m20485a(C4300d.f18678a.m18035h());
        String str = null;
        if (m20485a instanceof GetColumnContentsResultData) {
            getColumnContentsResultData = (GetColumnContentsResultData) m20485a;
        } else {
            getColumnContentsResultData = null;
        }
        if (getColumnContentsResultData != null) {
            list = getColumnContentsResultData.getChildColumnList();
        } else {
            list = null;
        }
        if (list != null) {
            List<ChildColumn> childColumnList = getColumnContentsResultData.getChildColumnList();
            AbstractC5868k.m23671c(childColumnList);
            arrayList.addAll(childColumnList);
            C1407f c1407f = C1407f.f5458a;
            AbstractC5882y.m23701a(arrayList).remove(c1407f.m6519m());
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v != null) {
                str = m6887v.getRestrictedStatus();
            }
            if (AbstractC5868k.m23669a(str, "1")) {
                C4842a c4842a = C4842a.f20329a;
                if ((c4842a.m19920a().m19931H() || c4842a.m19920a().mo19970s()) && c1407f.m6519m() != null) {
                    if (arrayList.size() > 1) {
                        ChildColumn m6519m = c1407f.m6519m();
                        AbstractC5868k.m23671c(m6519m);
                        arrayList.add(2, m6519m);
                    } else {
                        ChildColumn m6519m2 = c1407f.m6519m();
                        AbstractC5868k.m23671c(m6519m2);
                        arrayList.add(m6519m2);
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), "all_Column_key", Integer.valueOf(((ChildColumn) arrayList.get(0)).getId()));
        }
        observableEmitter.onNext(arrayList);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B6 */
    public static final void m19433B6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C6 */
    public static final void m19435C6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D5 */
    public static final void m19437D5(C4710y0 c4710y0, int i10) {
        AbstractC5868k.m23674f(c4710y0, "this$0");
        c4710y0.f20017b.mo17856N0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D6 */
    public static final void m19438D6(int i10, C4710y0 c4710y0) {
        boolean z10 = false;
        AbstractC5868k.m23674f(c4710y0, "this$0");
        String m29097f = C7581k.f27855a.m29097f(String.valueOf(i10));
        if (c4710y0.f20016a.m3096J6() == null) {
            return;
        }
        if (m29097f != null && m29097f.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str = "";
        if (z10) {
            C4982a c4982a = C4982a.f20721a;
            Context m3096J6 = c4710y0.f20016a.m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            c4982a.m20335c(m3096J6, String.valueOf(i10), "");
        } else {
            C4982a c4982a2 = C4982a.f20721a;
            Context m3096J62 = c4710y0.f20016a.m3096J6();
            AbstractC5868k.m23671c(m3096J62);
            str = (String) c4982a2.m20333a(m3096J62, String.valueOf(i10), "");
        }
        C0199r0 c0199r0 = c4710y0.f20022g;
        AbstractC5868k.m23672d(c4710y0.f20016a, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        c0199r0.m718b(i10, str, !AbstractC5868k.m23669a(((C5442e1) r6).m21939Ia(), "HomeLive"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E6 */
    public static final EpgProgram m19440E6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (EpgProgram) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F5 */
    public static final void m19442F5(C4710y0 c4710y0, int i10) {
        AbstractC5868k.m23674f(c4710y0, "this$0");
        c4710y0.f20017b.mo17856N0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F6 */
    public static final EpgProgram m19443F6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (EpgProgram) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G6 */
    public static final void m19445G6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H5 */
    public static final void m19446H5(C4710y0 c4710y0, int i10) {
        AbstractC5868k.m23674f(c4710y0, "this$0");
        c4710y0.f20017b.mo17856N0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H6 */
    public static final void m19447H6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: K5 */
    private final Handler m19451K5() {
        return (Handler) this.f20028m.getValue();
    }

    /* renamed from: P5 */
    private final void m19458P5(List list, String str) {
        Observable just = Observable.just(list);
        final g gVar = g.f20048a;
        Observable map = just.map(new Function() { // from class: h8.v0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19466W5;
                m19466W5 = C4710y0.m19466W5(InterfaceC5660l.this, obj);
                return m19466W5;
            }
        });
        final h hVar = h.f20049a;
        Observable map2 = map.map(new Function() { // from class: h8.w0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19471Y5;
                m19471Y5 = C4710y0.m19471Y5(InterfaceC5660l.this, obj);
                return m19471Y5;
            }
        });
        final i iVar = new i();
        Observable compose = map2.map(new Function() { // from class: h8.x0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19472Z5;
                m19472Z5 = C4710y0.m19472Z5(InterfaceC5660l.this, obj);
                return m19472Z5;
            }
        }).compose(AbstractC7029f.m27121b());
        final j jVar = new j(str);
        Consumer consumer = new Consumer() { // from class: h8.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19461R5(InterfaceC5660l.this, obj);
            }
        };
        final k kVar = k.f20053a;
        this.f20026k = compose.subscribe(consumer, new Consumer() { // from class: h8.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19464U5(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R5 */
    public static final void m19461R5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U5 */
    public static final void m19464U5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W5 */
    public static final ArrayList m19466W5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y5 */
    public static final ArrayList m19471Y5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z5 */
    public static final ArrayList m19472Z5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: b6 */
    private final void m19475b6() {
        Observable just = Observable.just(this.f20020e);
        final m mVar = new m();
        Observable compose = just.map(new Function() { // from class: h8.x
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19478d6;
                m19478d6 = C4710y0.m19478d6(InterfaceC5660l.this, obj);
                return m19478d6;
            }
        }).compose(AbstractC7029f.m27121b());
        final n nVar = new n();
        Consumer consumer = new Consumer() { // from class: h8.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19481e6(InterfaceC5660l.this, obj);
            }
        };
        final o oVar = o.f20057a;
        this.f20025j = compose.subscribe(consumer, new Consumer() { // from class: h8.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19482f6(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d6 */
    public static final ArrayList m19478d6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e6 */
    public static final void m19481e6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f6 */
    public static final void m19482f6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g6 */
    public final void m19485g6() {
        EpgDate epgDate = this.f20020e;
        if (epgDate == null) {
            this.f20017b.mo17859n3();
            return;
        }
        Observable just = Observable.just(epgDate);
        final r rVar = new r();
        Observable map = just.map(new Function() { // from class: h8.o
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19487h6;
                m19487h6 = C4710y0.m19487h6(InterfaceC5660l.this, obj);
                return m19487h6;
            }
        });
        Observable just2 = Observable.just(this.f20020e);
        final s sVar = new s();
        Observable compose = Observable.zip(just2.map(new Function() { // from class: h8.p
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19489i6;
                m19489i6 = C4710y0.m19489i6(InterfaceC5660l.this, obj);
                return m19489i6;
            }
        }), map, new BiFunction() { // from class: h8.q
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                ArrayList m19490j6;
                m19490j6 = C4710y0.m19490j6((ArrayList) obj, (ArrayList) obj2);
                return m19490j6;
            }
        }).compose(AbstractC7029f.m27121b());
        final p pVar = new p();
        Consumer consumer = new Consumer() { // from class: h8.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19493k6(InterfaceC5660l.this, obj);
            }
        };
        final q qVar = q.f20059a;
        this.f20024i = compose.subscribe(consumer, new Consumer() { // from class: h8.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19494l6(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h6 */
    public static final ArrayList m19487h6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i6 */
    public static final ArrayList m19489i6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j6 */
    public static final ArrayList m19490j6(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC5868k.m23674f(arrayList, "t1");
        AbstractC5868k.m23674f(arrayList2, "t2");
        ArrayList arrayList3 = new ArrayList();
        if (!AbstractC6567a.m25635e(arrayList)) {
            arrayList3.addAll(arrayList);
        }
        if (!AbstractC6567a.m25635e(arrayList2)) {
            arrayList3.addAll(arrayList2);
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k5 */
    public static final EpgProgram m19492k5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (EpgProgram) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k6 */
    public static final void m19493k6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l6 */
    public static final void m19494l6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o5 */
    public static final void m19495o5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p6 */
    public static final ArrayList m19496p6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q6 */
    public static final void m19498q6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r5 */
    public static final void m19500r5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6 */
    public static final void m19501r6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s5 */
    public static final void m19503s5(EpgDate epgDate, EpgProgram epgProgram, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(epgDate, "$epgDate");
        AbstractC5868k.m23674f(epgProgram, "$epgItem");
        AbstractC5868k.m23674f(observableEmitter, "it");
        observableEmitter.onNext(C1427v.f5519a.m6642b0(epgDate, epgProgram));
        observableEmitter.onComplete();
    }

    /* renamed from: s6 */
    private final void m19504s6(ArrayList arrayList, int i10, boolean z10) {
        String str = null;
        Channel channel = this.f20021f;
        if (channel != null) {
            str = channel.getChannelCode();
        } else {
            str = null;
        }
        if (AbstractC6567a.m25637g(str) && ((z10 && i10 >= 0) || (!z10 && i10 <= arrayList.size() - 1))) {
            Object obj = arrayList.get(i10);
            AbstractC5868k.m23673e(obj, "dates[selectionPos]");
            EpgDate epgDate = (EpgDate) obj;
            Observable just = Observable.just(epgDate);
            final y yVar = new y();
            Observable map = just.map(new Function() { // from class: h8.a0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    ArrayList m19506t6;
                    m19506t6 = C4710y0.m19506t6(InterfaceC5660l.this, obj2);
                    return m19506t6;
                }
            });
            Observable just2 = Observable.just(epgDate);
            final z zVar = new z();
            Observable compose = Observable.zip(just2.map(new Function() { // from class: h8.b0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    ArrayList m19511w6;
                    m19511w6 = C4710y0.m19511w6(InterfaceC5660l.this, obj2);
                    return m19511w6;
                }
            }), map, new BiFunction() { // from class: h8.c0
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj2, Object obj3) {
                    ArrayList m19513x6;
                    m19513x6 = C4710y0.m19513x6((ArrayList) obj2, (ArrayList) obj3);
                    return m19513x6;
                }
            }).compose(AbstractC7029f.m27121b());
            final w wVar = new w(z10, i10);
            Consumer consumer = new Consumer() { // from class: h8.d0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    C4710y0.m19514y6(InterfaceC5660l.this, obj2);
                }
            };
            final x xVar = x.f20069a;
            this.f20027l = compose.subscribe(consumer, new Consumer() { // from class: h8.e0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    C4710y0.m19516z6(InterfaceC5660l.this, obj2);
                }
            });
            return;
        }
        this.f20017b.mo17860q6(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t5 */
    public static final ArrayList m19505t5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6 */
    public static final ArrayList m19506t6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w5 */
    public static final void m19510w5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w6 */
    public static final ArrayList m19511w6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6 */
    public static final ArrayList m19513x6(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC5868k.m23674f(arrayList, "t1");
        AbstractC5868k.m23674f(arrayList2, "t2");
        ArrayList arrayList3 = new ArrayList();
        if (!AbstractC6567a.m25635e(arrayList)) {
            arrayList3.addAll(arrayList);
        }
        if (!AbstractC6567a.m25635e(arrayList2)) {
            arrayList3.addAll(arrayList2);
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y6 */
    public static final void m19514y6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z5 */
    public static final void m19515z5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z6 */
    public static final void m19516z6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p130f8.InterfaceC4276c
    /* renamed from: B3 */
    public void mo17844B3(EpgDate epgDate, int i10) {
        String str = null;
        if (epgDate != null) {
            Channel channel = this.f20021f;
            String str2 = null;
            if (channel != null) {
                str = channel.getChannelCode();
            } else {
                str = null;
            }
            if (!AbstractC6567a.m25634d(str)) {
                m19431A5();
                this.f20020e = epgDate;
                if (C1407f.f5458a.m6522n0(this.f20021f)) {
                    Channel channel2 = this.f20021f;
                    AbstractC5868k.m23671c(channel2);
                    String channelCode = channel2.getChannelCode();
                    long currentTimeMillis = System.currentTimeMillis();
                    C1427v c1427v = C1427v.f5519a;
                    if (currentTimeMillis - c1427v.m6627M(channelCode) > this.f20019d) {
                        c1427v.m6659w(channelCode);
                    }
                    if (AbstractC6567a.m25635e(c1427v.m6626L(channelCode))) {
                        C0223y c0223y = this.f20023h;
                        Channel channel3 = this.f20021f;
                        if (channel3 != null) {
                            str2 = channel3.getChannelCode();
                        }
                        String str3 = str2;
                        AbstractC5868k.m23671c(str3);
                        C0223y.m783c(c0223y, str3, i10, null, 4, null);
                        return;
                    }
                    m19485g6();
                    return;
                }
                m19475b6();
            }
        }
    }

    /* renamed from: B5 */
    public final AbstractC1196d m19517B5() {
        return this.f20016a;
    }

    @Override // p301qb.InterfaceC6396j0
    /* renamed from: E4 */
    public void mo19518E4(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
    }

    @Override // p130f8.InterfaceC4276c
    /* renamed from: H1 */
    public void mo17845H1(Channel channel, EpgDate epgDate, EpgProgram epgProgram, ReservationList reservationList) {
        AbstractC5868k.m23674f(channel, "channel");
        AbstractC5868k.m23674f(epgDate, "epgDate");
        AbstractC5868k.m23674f(epgProgram, "epgItem");
        AbstractC5868k.m23674f(reservationList, "reserveList");
        Observable just = Observable.just(epgProgram);
        final c0 c0Var = new c0(reservationList);
        Observable map = just.map(new Function() { // from class: h8.n0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                EpgProgram m19440E6;
                m19440E6 = C4710y0.m19440E6(InterfaceC5660l.this, obj);
                return m19440E6;
            }
        });
        final d0 d0Var = new d0(epgDate, epgProgram);
        Observable compose = map.map(new Function() { // from class: h8.o0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                EpgProgram m19443F6;
                m19443F6 = C4710y0.m19443F6(InterfaceC5660l.this, obj);
                return m19443F6;
            }
        }).compose(AbstractC7029f.m27121b());
        final e0 e0Var = new e0();
        Consumer consumer = new Consumer() { // from class: h8.p0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19445G6(InterfaceC5660l.this, obj);
            }
        };
        final f0 f0Var = f0.f20047a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.q0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19447H6(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p130f8.InterfaceC4276c
    /* renamed from: L0 */
    public void mo17846L0(final EpgDate epgDate, final EpgProgram epgProgram) {
        AbstractC5868k.m23674f(epgDate, "epgDate");
        AbstractC5868k.m23674f(epgProgram, "epgItem");
        if (epgProgram.getFlag() == 1) {
            Observable just = Observable.just(epgProgram);
            final a aVar = new a(epgProgram);
            Observable compose = just.map(new Function() { // from class: h8.f0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    EpgProgram m19492k5;
                    m19492k5 = C4710y0.m19492k5(InterfaceC5660l.this, obj);
                    return m19492k5;
                }
            }).compose(AbstractC7029f.m27121b());
            final b bVar = new b();
            Consumer consumer = new Consumer() { // from class: h8.g0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4710y0.m19495o5(InterfaceC5660l.this, obj);
                }
            };
            final c cVar = c.f20034a;
            compose.subscribe(consumer, new Consumer() { // from class: h8.i0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C4710y0.m19500r5(InterfaceC5660l.this, obj);
                }
            });
            return;
        }
        Observable create = Observable.create(new ObservableOnSubscribe() { // from class: h8.j0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4710y0.m19503s5(EpgDate.this, epgProgram, observableEmitter);
            }
        });
        final d dVar = new d(epgProgram, this, epgDate);
        Observable compose2 = create.map(new Function() { // from class: h8.k0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19505t5;
                m19505t5 = C4710y0.m19505t5(InterfaceC5660l.this, obj);
                return m19505t5;
            }
        }).compose(AbstractC7029f.m27121b());
        final e eVar = new e(epgDate, epgProgram);
        Consumer consumer2 = new Consumer() { // from class: h8.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19510w5(InterfaceC5660l.this, obj);
            }
        };
        final f fVar = f.f20046a;
        compose2.subscribe(consumer2, new Consumer() { // from class: h8.m0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19515z5(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p301qb.InterfaceC6431v
    /* renamed from: N1 */
    public void mo18475N1(EpgData epgData, String str) {
        if (epgData != null && !AbstractC6567a.m25635e(epgData.getProgramList())) {
            List<EpgProgram> programList = epgData.getProgramList();
            AbstractC5868k.m23671c(programList);
            String channelCode = epgData.getChannelCode();
            AbstractC5868k.m23671c(channelCode);
            m19458P5(programList, channelCode);
            return;
        }
        m19485g6();
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20016a.m19902N3();
    }

    @Override // p301qb.InterfaceC6396j0
    /* renamed from: O1 */
    public void mo19519O1(GetLiveDataResult getLiveDataResult, final int i10) {
        String str = null;
        boolean z10 = false;
        String str2 = null;
        AbstractC5868k.m23674f(getLiveDataResult, "getChannelDataResult");
        C7383a c7383a = C7383a.f27389a;
        C7383a.m28494e(c7383a, null, 1, null);
        C1407f c1407f = C1407f.f5458a;
        boolean z11 = false;
        if (c1407f.m6523o() == i10) {
            c1407f.m6510g0(false);
        }
        if (AbstractC5868k.m23669a(getLiveDataResult.getReturnCode(), "304")) {
            List m6515j = c1407f.m6515j(i10);
            if (m6515j != null && !m6515j.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                String m29097f = C7581k.f27855a.m29097f(String.valueOf(i10));
                if (m29097f == null || m29097f.length() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    GetLiveDataResult getLiveDataResult2 = (GetLiveDataResult) AbstractC7027d.m27114a().fromJson(m29097f, GetLiveDataResult.class);
                    if (c1407f.m6523o() == i10) {
                        GetLiveDataResultData data = getLiveDataResult2.getData();
                        if (data != null) {
                            str2 = data.getApkNumberSwitch();
                        } else {
                            str2 = null;
                        }
                        c1407f.m6500Y(AbstractC5868k.m23669a(str2, "1"));
                    }
                    GetLiveDataResultData data2 = getLiveDataResult2.getData();
                    AbstractC5868k.m23671c(data2);
                    List<Channel> channelList = data2.getChannelList();
                    AbstractC5868k.m23671c(channelList);
                    c1407f.m6489N(i10, channelList);
                    m19451K5().post(new Runnable() { // from class: h8.s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4710y0.m19437D5(C4710y0.this, i10);
                        }
                    });
                } else {
                    C4982a c4982a = C4982a.f20721a;
                    Context m3096J6 = this.f20016a.m3096J6();
                    AbstractC5868k.m23671c(m3096J6);
                    c4982a.m20335c(m3096J6, String.valueOf(i10), "");
                }
            } else {
                m19451K5().post(new Runnable() { // from class: h8.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4710y0.m19442F5(C4710y0.this, i10);
                    }
                });
            }
        } else {
            GetLiveDataResultData data3 = getLiveDataResult.getData();
            AbstractC5868k.m23671c(data3);
            List<Channel> channelList2 = data3.getChannelList();
            AbstractC5868k.m23671c(channelList2);
            c1407f.m6489N(i10, channelList2);
            m19451K5().post(new Runnable() { // from class: h8.u0
                @Override // java.lang.Runnable
                public final void run() {
                    C4710y0.m19446H5(C4710y0.this, i10);
                }
            });
            String json = AbstractC7027d.m27114a().toJson(getLiveDataResult);
            if (json == null || json.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                C7581k c7581k = C7581k.f27855a;
                String valueOf = String.valueOf(i10);
                AbstractC5868k.m23673e(json, "strJson");
                c7581k.m29098g(valueOf, json);
            }
            if (c1407f.m6523o() == i10) {
                GetLiveDataResultData data4 = getLiveDataResult.getData();
                if (data4 != null) {
                    str = data4.getApkNumberSwitch();
                } else {
                    str = null;
                }
                c1407f.m6500Y(AbstractC5868k.m23669a(str, "1"));
            }
        }
        C7383a.m28493c(c7383a, null, 1, null);
    }

    /* renamed from: O5 */
    public final InterfaceC4277d m19520O5() {
        return this.f20017b;
    }

    @Override // p130f8.InterfaceC4276c
    /* renamed from: Y */
    public void mo17847Y(ArrayList arrayList, int i10, boolean z10) {
        AbstractC5868k.m23674f(arrayList, "dates");
        m19431A5();
        m19504s6(arrayList, i10, z10);
    }

    @Override // p130f8.InterfaceC4276c
    /* renamed from: l0 */
    public void mo17848l0(EpgProgram epgProgram) {
        AbstractC5868k.m23674f(epgProgram, "epgItem");
        C7709c.m29787d().m29801m(new PlaySelectedChannelListEvent());
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        this.f20017b.mo17855H();
    }

    @Override // p130f8.InterfaceC4276c
    /* renamed from: o0 */
    public void mo17849o0() {
        m19431A5();
        this.f20021f = null;
        this.f20020e = null;
    }

    @Override // p130f8.InterfaceC4276c
    /* renamed from: r3 */
    public void mo17850r3() {
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: h8.l
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4710y0.m19432A6(observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final a0 a0Var = new a0();
        Consumer consumer = new Consumer() { // from class: h8.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19433B6(InterfaceC5660l.this, obj);
            }
        };
        final b0 b0Var = b0.f20033a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19435C6(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p301qb.InterfaceC6431v
    /* renamed from: w2 */
    public void mo18478w2(String str, String str2) {
        AbstractC5868k.m23674f(str, "errCode");
        m19485g6();
    }

    @Override // p130f8.InterfaceC4276c
    /* renamed from: y0 */
    public void mo17851y0(final int i10) {
        AbstractC7030g.m27129c("load live data", new Runnable() { // from class: h8.r0
            @Override // java.lang.Runnable
            public final void run() {
                C4710y0.m19438D6(i10, this);
            }
        }, false);
    }

    @Override // p130f8.InterfaceC4276c
    /* renamed from: z2 */
    public void mo17852z2(Channel channel, InterfaceC5941s interfaceC5941s) {
        this.f20021f = channel;
        boolean m6522n0 = C1407f.f5458a.m6522n0(channel);
        Observable just = Observable.just(Boolean.valueOf(m6522n0));
        final t tVar = new t();
        Observable compose = just.map(new Function() { // from class: h8.t
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19496p6;
                m19496p6 = C4710y0.m19496p6(InterfaceC5660l.this, obj);
                return m19496p6;
            }
        }).compose(AbstractC7029f.m27121b());
        final u uVar = new u(m6522n0, interfaceC5941s);
        Consumer consumer = new Consumer() { // from class: h8.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19498q6(InterfaceC5660l.this, obj);
            }
        };
        final v vVar = v.f20065a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4710y0.m19501r6(InterfaceC5660l.this, obj);
            }
        });
    }
}
