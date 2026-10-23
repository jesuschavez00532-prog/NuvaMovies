package p159h8;

import ac.C0138c;
import ac.C0160h1;
import ac.C0177l2;
import ac.C0183n0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.AbstractC0547a;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.Fragment;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1456h0;
import cc.C1466m0;
import cc.C1473s;
import com.live.R$color;
import com.live.R$drawable;
import com.live.R$string;
import com.live.bean.InfoBarBean;
import com.live.p063db.ChannelList;
import com.live.p063db.PlayBackDao;
import com.live.p063db.PlaybackPositionModel;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.GetLiveFavoriteSucEvent;
import com.module.event.LockMonitorEvent;
import com.module.event.UpdatePlayIndexItemEvent;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.request.result.FavIdDataItem;
import com.request.result.FavoriteList;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.GetFavoritesResultData;
import com.request.result.LicenseBTVData;
import com.request.result.LiveAddress;
import com.request.result.StartPlayBTVResult;
import com.request.result.StartPlayBTVResultData;
import com.request.result.StartPlayBTVResultLicenseList;
import com.titan.ranger.bean.Media;
import com.titan.ranger.bean.Program;
import com.titans.entity.RangerPlayTag;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.C3303ay;
import com.umeng.analytics.pro.C3309bd;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.jessyan.autosize.utils.AutoSizeUtils;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5874q;
import ne.C5876s;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.message.MessageService;
import p040c8.C1407f;
import p040c8.C1415j;
import p040c8.C1427v;
import p040c8.C1428w;
import p040c8.InterfaceC1409g;
import p043ce.AbstractC1508t;
import p117ea.AbstractC4161e;
import p130f8.InterfaceC4278e;
import p130f8.InterfaceC4279f;
import p132fa.AbstractC4298b;
import p132fa.C4297a;
import p135fd.C4307b;
import p185j2.C4982a;
import p201k2.AbstractC5086c;
import p223l8.C5498s1;
import p223l8.C5500t;
import p263o8.InterfaceC5940r;
import p301qb.InterfaceC6387g0;
import p301qb.InterfaceC6406m1;
import p301qb.InterfaceC6438x0;
import p301qb.InterfaceC6441y0;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p363v2.C7197a;
import p371vb.C7252a;
import p400xa.AbstractC7598p1;
import p400xa.C7565e1;
import p400xa.C7589m1;
import p400xa.C7597p0;
import p400xa.C7617x;
import p430z9.AbstractC7766d;
import ye.C7709c;

/* renamed from: h8.f2 */
/* loaded from: classes2.dex */
public final class C4598f2 implements InterfaceC4278e, InterfaceC6406m1, InterfaceC6438x0, InterfaceC6441y0, InterfaceC6387g0 {

    /* renamed from: a */
    private AbstractC7766d f19752a;

    /* renamed from: b */
    private InterfaceC4279f f19753b;

    /* renamed from: c */
    private final String f19754c;

    /* renamed from: d */
    private String f19755d;

    /* renamed from: e */
    private ChannelList f19756e;

    /* renamed from: f */
    private String f19757f;

    /* renamed from: g */
    private String f19758g;

    /* renamed from: h */
    private Channel f19759h;

    /* renamed from: i */
    private boolean f19760i;

    /* renamed from: j */
    private Disposable f19761j;

    /* renamed from: k */
    private C0177l2 f19762k;

    /* renamed from: l */
    private EpgProgram f19763l;

    /* renamed from: m */
    private String f19764m;

    /* renamed from: n */
    private final InterfaceC1312h f19765n;

    /* renamed from: o */
    private final InterfaceC1312h f19766o;

    /* renamed from: p */
    private final InterfaceC1312h f19767p;

    /* renamed from: q */
    private final InterfaceC1312h f19768q;

    /* renamed from: r */
    private InterfaceC5940r f19769r;

    /* renamed from: h8.f2$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC1409g {

        /* renamed from: b */
        final /* synthetic */ Channel f19771b;

        a(Channel channel) {
            this.f19771b = channel;
        }

        @Override // p040c8.InterfaceC1409g
        /* renamed from: F */
        public void mo6539F() {
            C4598f2.this.m19225O5().mo17885F();
        }

        @Override // p040c8.InterfaceC1409g
        /* renamed from: G */
        public void mo6540G() {
            InterfaceC4279f.a.m17911a(C4598f2.this.m19225O5(), false, 1, null);
        }

        @Override // p040c8.InterfaceC1409g
        /* renamed from: H */
        public void mo6541H() {
            C4598f2.this.m19225O5().mo17904q3(this.f19771b);
        }

        @Override // p040c8.InterfaceC1409g
        /* renamed from: I */
        public void mo6542I() {
            C4598f2.this.m19225O5().mo17910y2(this.f19771b);
        }
    }

    /* renamed from: h8.f2$a0 */
    /* loaded from: classes2.dex */
    static final class a0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a0 f19772a = new a0();

        a0() {
            super(1);
        }

        /* renamed from: a */
        public final void m19236a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19236a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19237a(Integer num) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19237a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$b0 */
    /* loaded from: classes2.dex */
    static final class b0 extends AbstractC5869l implements InterfaceC5660l {
        b0() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChannelList mo542f(Channel channel) {
            String str = null;
            ChannelList channelList;
            ChannelList channelList2;
            AbstractC5868k.m23674f(channel, "it");
            C4598f2.this.f19756e = C1415j.f5500a.m6573n(channel.getChannelCode());
            if (C4598f2.this.f19756e == null) {
                C4598f2.this.f19756e = new ChannelList();
            }
            ChannelList channelList3 = C4598f2.this.f19756e;
            if (channelList3 != null) {
                channelList3.setChannelCode(channel.getChannelCode());
            }
            ChannelList channelList4 = C4598f2.this.f19756e;
            String str2 = null;
            if (channelList4 != null) {
                str = channelList4.getLocked_start_time();
            } else {
                str = null;
            }
            if (AbstractC6567a.m25634d(str) && (channelList2 = C4598f2.this.f19756e) != null) {
                channelList2.setLocked_start_time("00:00");
            }
            ChannelList channelList5 = C4598f2.this.f19756e;
            if (channelList5 != null) {
                str2 = channelList5.getLocked_end_time();
            }
            if (AbstractC6567a.m25634d(str2) && (channelList = C4598f2.this.f19756e) != null) {
                channelList.setLocked_end_time("23:59");
            }
            ChannelList channelList6 = C4598f2.this.f19756e;
            AbstractC5868k.m23671c(channelList6);
            return channelList6;
        }
    }

    /* renamed from: h8.f2$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f19775a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19239a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19239a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$c0 */
    /* loaded from: classes2.dex */
    static final class c0 extends AbstractC5869l implements InterfaceC5660l {
        c0() {
            super(1);
        }

        /* renamed from: a */
        public final void m19240a(ChannelList channelList) {
            C4598f2.this.m19225O5().mo17901k5(channelList.getLocked_start_time(), channelList.getLocked_end_time());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19240a((ChannelList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.f2$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ Channel f19778b;

        /* renamed from: c */
        final /* synthetic */ C5874q f19779c;

        /* renamed from: d */
        final /* synthetic */ String f19780d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Channel channel, C5874q c5874q, String str) {
            super(1);
            this.f19778b = channel;
            this.f19779c = c5874q;
            this.f19780d = str;
        }

        /* renamed from: a */
        public final void m19241a(ArrayList arrayList) {
            C4598f2.this.m19225O5().mo17899i3(this.f19778b.getChannelCode());
            if (arrayList.isEmpty()) {
                if (this.f19779c.f23408a) {
                    AbstractC7766d m19233s5 = C4598f2.this.m19233s5();
                    AbstractC5868k.m23672d(m19233s5, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
                    C5498s1.m22145Ab((C5498s1) m19233s5, 10021, false, "", "apk", "live", this.f19778b.getChannelCode(), this.f19778b.getName(), "", "", null, 512, null);
                    return;
                }
                C4598f2.this.m19221G6();
                return;
            }
            String channelCode = this.f19778b.getChannelCode();
            String value = RangerPlayTag.LIVE.getValue();
            String name = this.f19778b.getName();
            String str = this.f19780d;
            AbstractC5868k.m23673e(arrayList, "mediaList");
            C4598f2.this.m19225O5().mo17888K(new Program(channelCode, value, name, "-1", str, C3309bd.f14106m, arrayList, ((Media) arrayList.get(0)).getName(), 0L), this.f19778b.getChannelCode());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19241a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$d0 */
    /* loaded from: classes2.dex */
    static final class d0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d0 f19781a = new d0();

        d0() {
            super(1);
        }

        /* renamed from: a */
        public final void m19242a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19242a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.f2$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f19782a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m19243a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19243a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$e0 */
    /* loaded from: classes2.dex */
    static final class e0 extends AbstractC5869l implements InterfaceC5660l {
        e0() {
            super(1);
        }

        /* renamed from: a */
        public final void m19244a(Integer num) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19244a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5660l {
        f() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(Integer num) {
            AbstractC5868k.m23674f(num, "it");
            ArrayList arrayList = new ArrayList(num.intValue());
            Drawable m2324f = AbstractC0547a.m2324f(C4598f2.this.m19233s5().m3107M8(), R$drawable.ic_info_menu);
            AbstractC5868k.m23671c(m2324f);
            arrayList.add(m2324f);
            Drawable m2324f2 = AbstractC0547a.m2324f(C4598f2.this.m19233s5().m3107M8(), R$drawable.ic_info_left_and_right);
            AbstractC5868k.m23671c(m2324f2);
            arrayList.add(m2324f2);
            Drawable m2324f3 = AbstractC0547a.m2324f(C4598f2.this.m19233s5().m3107M8(), R$drawable.selector_info_btn_pip);
            AbstractC5868k.m23671c(m2324f3);
            arrayList.add(m2324f3);
            Drawable m2324f4 = AbstractC0547a.m2324f(C4598f2.this.m19233s5().m3107M8(), R$drawable.selector_info_btn_hd);
            AbstractC5868k.m23671c(m2324f4);
            arrayList.add(m2324f4);
            Drawable m2324f5 = AbstractC0547a.m2324f(C4598f2.this.m19233s5().m3107M8(), R$drawable.selector_info_btn_back);
            AbstractC5868k.m23671c(m2324f5);
            arrayList.add(m2324f5);
            Drawable m2324f6 = AbstractC0547a.m2324f(C4598f2.this.m19233s5().m3107M8(), R$drawable.selector_info_btn_ratio);
            AbstractC5868k.m23671c(m2324f6);
            arrayList.add(m2324f6);
            Drawable m2324f7 = AbstractC0547a.m2324f(C4598f2.this.m19233s5().m3107M8(), R$drawable.selector_info_btn_fav);
            AbstractC5868k.m23671c(m2324f7);
            arrayList.add(m2324f7);
            Drawable m2324f8 = AbstractC0547a.m2324f(C4598f2.this.m19233s5().m3107M8(), R$drawable.selector_info_btn_switch_player);
            AbstractC5868k.m23671c(m2324f8);
            arrayList.add(m2324f8);
            Drawable m2324f9 = AbstractC0547a.m2324f(C4598f2.this.m19233s5().m3107M8(), R$drawable.selector_info_btn_lock);
            AbstractC5868k.m23671c(m2324f9);
            arrayList.add(m2324f9);
            Drawable m2324f10 = AbstractC0547a.m2324f(C4598f2.this.m19233s5().m3107M8(), R$drawable.selector_info_btn_feedback);
            AbstractC5868k.m23671c(m2324f10);
            arrayList.add(m2324f10);
            return arrayList;
        }
    }

    /* renamed from: h8.f2$f0 */
    /* loaded from: classes2.dex */
    static final class f0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f0 f19785a = new f0();

        f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m19246a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19246a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$g */
    /* loaded from: classes2.dex */
    static final class g extends AbstractC5869l implements InterfaceC5660l {
        g() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "it");
            ((Drawable) arrayList.get(0)).setBounds(0, 0, AutoSizeUtils.dp2px(C4598f2.this.m19233s5().m3107M8(), 29.0f), AutoSizeUtils.dp2px(C4598f2.this.m19233s5().m3107M8(), 15.0f));
            ((Drawable) arrayList.get(1)).setBounds(0, 0, AutoSizeUtils.dp2px(C4598f2.this.m19233s5().m3107M8(), 39.0f), AutoSizeUtils.dp2px(C4598f2.this.m19233s5().m3107M8(), 18.0f));
            int dp2px = AutoSizeUtils.dp2px(C4598f2.this.m19233s5().m3107M8(), 28.0f);
            int size = arrayList.size();
            for (int i10 = 2; i10 < size; i10++) {
                ((Drawable) arrayList.get(i10)).setBounds(0, 0, dp2px, dp2px);
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.f2$g0 */
    /* loaded from: classes2.dex */
    public static final class g0 extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g0 f19787a = new g0();

        g0() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Long l10) {
            AbstractC5868k.m23674f(l10, "it");
            return Boolean.valueOf(C1456h0.f5574a.m6779o());
        }
    }

    /* renamed from: h8.f2$h */
    /* loaded from: classes2.dex */
    static final class h extends AbstractC5869l implements InterfaceC5660l {
        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m19249a(ArrayList arrayList) {
            InterfaceC4279f m19225O5 = C4598f2.this.m19225O5();
            AbstractC5868k.m23673e(arrayList, "it");
            m19225O5.mo17909x3(arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19249a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$h0 */
    /* loaded from: classes2.dex */
    public static final class h0 implements Observer {

        /* renamed from: b */
        final /* synthetic */ boolean f19790b;

        h0(boolean z10) {
            this.f19790b = z10;
        }

        /* renamed from: a */
        public void m19250a(long j10) {
            Disposable disposable = C4598f2.this.f19761j;
            if (disposable != null) {
                disposable.dispose();
            }
            C4598f2.this.m19231g5(this.f19790b);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            C1473s.f5656a.m6918b(32600);
            C1456h0.f5574a.m6781q(true);
            C4598f2.this.m19231g5(this.f19790b);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
        }

        @Override // io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            m19250a(((Number) obj).longValue());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            C4598f2.this.f19761j = disposable;
        }
    }

    /* renamed from: h8.f2$i */
    /* loaded from: classes2.dex */
    static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final i f19791a = new i();

        i() {
            super(1);
        }

        /* renamed from: a */
        public final void m19251a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19251a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.f2$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Channel f19792a;

        /* renamed from: b */
        final /* synthetic */ C4598f2 f19793b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Channel channel, C4598f2 c4598f2) {
            super(1);
            this.f19792a = channel;
            this.f19793b = c4598f2;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InfoBarBean mo542f(InfoBarBean infoBarBean) {
            String quality = null;
            AbstractC5868k.m23674f(infoBarBean, "it");
            C1407f.f5458a.m6490O(this.f19792a, infoBarBean.getDefinitions(), C1456h0.f5574a.m6773i(C1456h0.a.LIVE), this.f19793b.m19228R5());
            if (!AbstractC6567a.m25637g(this.f19793b.f19758g) || !AbstractC5868k.m23669a(infoBarBean.getChannelCode(), this.f19793b.f19758g)) {
                this.f19793b.f19758g = "";
                quality = this.f19792a.getQuality();
            } else {
                quality = this.f19793b.f19757f;
            }
            String str = "HD";
            if (quality != null) {
                switch (quality.hashCode()) {
                    case 49:
                        quality.equals("1");
                        break;
                    case 50:
                        if (quality.equals("2")) {
                            str = "HD+";
                            break;
                        }
                        break;
                    case 51:
                        if (quality.equals("3")) {
                            str = "UHD";
                            break;
                        }
                        break;
                }
            }
            infoBarBean.setVideoQuality(str);
            return infoBarBean;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.f2$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InfoBarBean f19794a;

        /* renamed from: b */
        final /* synthetic */ Channel f19795b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InfoBarBean infoBarBean, Channel channel) {
            super(1);
            this.f19794a = infoBarBean;
            this.f19795b = channel;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InfoBarBean mo542f(InfoBarBean infoBarBean) {
            AbstractC5868k.m23674f(infoBarBean, "it");
            this.f19794a.setFaved(C1428w.f5539a.m6674g(this.f19795b.getChannelCode()));
            return infoBarBean;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.f2$l */
    /* loaded from: classes2.dex */
    public static final class l extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Channel f19796a;

        /* renamed from: b */
        final /* synthetic */ InfoBarBean f19797b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Channel channel, InfoBarBean infoBarBean) {
            super(1);
            this.f19796a = channel;
            this.f19797b = infoBarBean;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InfoBarBean mo542f(InfoBarBean infoBarBean) {
            AbstractC5868k.m23674f(infoBarBean, "it");
            if (C1415j.f5500a.m6573n(this.f19796a.getChannelCode()) != null) {
                this.f19797b.setLocked(true);
            }
            return infoBarBean;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.f2$m */
    /* loaded from: classes2.dex */
    public static final class m extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InfoBarBean f19798a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(InfoBarBean infoBarBean) {
            super(1);
            this.f19798a = infoBarBean;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InfoBarBean mo542f(InfoBarBean infoBarBean) {
            AbstractC5868k.m23674f(infoBarBean, "it");
            infoBarBean.getInfoBarEpgs().clear();
            infoBarBean.getInfoBarEpgs().addAll(C1427v.f5519a.m6638Y(this.f19798a.getChannelCode()));
            return infoBarBean;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.f2$n */
    /* loaded from: classes2.dex */
    public static final class n extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final n f19799a = new n();

        n() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InfoBarBean mo542f(InfoBarBean infoBarBean) {
            AbstractC5868k.m23674f(infoBarBean, "it");
            if (AbstractC6567a.m25635e(infoBarBean.getInfoBarEpgs())) {
                return infoBarBean;
            }
            long m20619l = AbstractC5086c.m20619l(infoBarBean.getInfoBarEpgs().get(0).getStartTime(), "yyyyMMddHHmmss");
            long m20619l2 = AbstractC5086c.m20619l(infoBarBean.getInfoBarEpgs().get(0).getEndTime(), "yyyyMMddHHmmss");
            long currentTimeMillis = System.currentTimeMillis();
            if (m20619l <= currentTimeMillis) {
                infoBarBean.setProcess((int) ((100 * (currentTimeMillis - m20619l)) / (m20619l2 - m20619l)));
            }
            return infoBarBean;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.f2$o */
    /* loaded from: classes2.dex */
    public static final class o extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Channel f19800a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5940r f19801b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Channel channel, InterfaceC5940r interfaceC5940r) {
            super(1);
            this.f19800a = channel;
            this.f19801b = interfaceC5940r;
        }

        /* renamed from: a */
        public final void m19257a(InfoBarBean infoBarBean) {
            this.f19800a.setFav(infoBarBean.getFaved());
            this.f19800a.setLock(infoBarBean.getLocked());
            InterfaceC5940r interfaceC5940r = this.f19801b;
            if (interfaceC5940r != null) {
                AbstractC5868k.m23673e(infoBarBean, "it");
                interfaceC5940r.mo23994d(infoBarBean);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19257a((InfoBarBean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.f2$p */
    /* loaded from: classes2.dex */
    public static final class p extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5940r f19802a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(InterfaceC5940r interfaceC5940r) {
            super(1);
            this.f19802a = interfaceC5940r;
        }

        /* renamed from: a */
        public final void m19258a(Throwable th) {
            InterfaceC5940r interfaceC5940r = this.f19802a;
            if (interfaceC5940r != null) {
                interfaceC5940r.mo23993b();
            }
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19258a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$q */
    /* loaded from: classes2.dex */
    static final class q extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final q f19803a = new q();

        q() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            C1428w.f5539a.m6673f(list);
            return list;
        }
    }

    /* renamed from: h8.f2$r */
    /* loaded from: classes2.dex */
    static final class r extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final r f19804a = new r();

        r() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            C1407f.f5458a.m6520m0(list);
            return list;
        }
    }

    /* renamed from: h8.f2$s */
    /* loaded from: classes2.dex */
    static final class s extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ int f19806b;

        /* renamed from: c */
        final /* synthetic */ List f19807c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h8.f2$s$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5642a {

            /* renamed from: a */
            final /* synthetic */ List f19808a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(0);
                this.f19808a = list;
            }

            @Override // me.InterfaceC5642a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f19808a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h8.f2$s$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final b f19809a = new b();

            b() {
                super(1);
            }

            /* renamed from: a */
            public final void m19263a(int i10) {
                C1407f.f5458a.m6506e0(i10);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m19263a(((Number) obj).intValue());
                return C1328x.f4998a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(int i10, List list) {
            super(1);
            this.f19806b = i10;
            this.f19807c = list;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            if (!AbstractC6567a.m25635e(list)) {
                C4982a c4982a = C4982a.f20721a;
                Context m3096J6 = C4598f2.this.m19233s5().m3096J6();
                AbstractC5868k.m23671c(m3096J6);
                String str = (String) c4982a.m20333a(m3096J6, "live_last_channel_code", ((Channel) list.get(0)).getChannelCode());
                int m17990b = AbstractC4298b.m17990b("last_sort", 0);
                C1407f c1407f = C1407f.f5458a;
                if (c1407f.m6512h0(m17990b, str, list, new a(this.f19807c), b.f19809a)) {
                    c1407f.m6501Z(this.f19806b);
                    return list;
                }
            }
            return new ArrayList();
        }
    }

    /* renamed from: h8.f2$t */
    /* loaded from: classes2.dex */
    static final class t extends AbstractC5869l implements InterfaceC5660l {
        t() {
            super(1);
        }

        /* renamed from: a */
        public final void m19264a(List list) {
            C1407f c1407f = C1407f.f5458a;
            AbstractC5868k.m23673e(list, "it");
            c1407f.m6508f0(list);
            AbstractC7766d m19233s5 = C4598f2.this.m19233s5();
            AbstractC5868k.m23672d(m19233s5, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
            if (AbstractC5868k.m23669a(((C5498s1) m19233s5).m22282za(), "HomeLive")) {
                Fragment m3133W6 = C4598f2.this.m19233s5().m3133W6();
                AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.HomeLiveFragment");
                ((C5500t) m3133W6).mo17967T2();
            }
            C4598f2.this.m19234s6();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19264a((List) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$u */
    /* loaded from: classes2.dex */
    static final class u extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final u f19811a = new u();

        u() {
            super(1);
        }

        /* renamed from: a */
        public final void m19265a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19265a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.f2$v */
    /* loaded from: classes2.dex */
    static final class v extends AbstractC5869l implements InterfaceC5642a {
        v() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0138c invoke() {
            return new C0138c(C4598f2.this);
        }
    }

    /* renamed from: h8.f2$w */
    /* loaded from: classes2.dex */
    static final class w extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final w f19813a = new w();

        w() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PlayBackDao invoke() {
            return new PlayBackDao();
        }
    }

    /* renamed from: h8.f2$x */
    /* loaded from: classes2.dex */
    static final class x extends AbstractC5869l implements InterfaceC5642a {
        x() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0183n0 invoke() {
            return new C0183n0(C4598f2.this);
        }
    }

    /* renamed from: h8.f2$y */
    /* loaded from: classes2.dex */
    static final class y extends AbstractC5869l implements InterfaceC5642a {
        y() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0160h1 invoke() {
            return new C0160h1(C4598f2.this);
        }
    }

    /* renamed from: h8.f2$z */
    /* loaded from: classes2.dex */
    static final class z extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5660l f19816a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(InterfaceC5660l interfaceC5660l) {
            super(1);
            this.f19816a = interfaceC5660l;
        }

        /* renamed from: a */
        public final void m19270a(Integer num) {
            InterfaceC5660l interfaceC5660l = this.f19816a;
            AbstractC5868k.m23673e(num, "it");
            interfaceC5660l.mo542f(num);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19270a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    public C4598f2(AbstractC7766d abstractC7766d, InterfaceC4279f interfaceC4279f) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        AbstractC5868k.m23674f(abstractC7766d, "frag");
        AbstractC5868k.m23674f(interfaceC4279f, "view");
        this.f19752a = abstractC7766d;
        this.f19753b = interfaceC4279f;
        this.f19754c = C4598f2.class.getSimpleName();
        this.f19755d = "";
        this.f19757f = "1";
        this.f19758g = "";
        this.f19764m = "";
        m5965b = AbstractC1314j.m5965b(w.f19813a);
        this.f19765n = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new v());
        this.f19766o = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new y());
        this.f19767p = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(new x());
        this.f19768q = m5965b4;
    }

    /* renamed from: A5 */
    private final C0160h1 m19129A5() {
        return (C0160h1) this.f19767p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A6 */
    public static final void m19130A6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: B5 */
    private final List m19131B5(StartPlayBTVResult startPlayBTVResult, List list) {
        boolean z10 = false;
        ArrayList arrayList = new ArrayList();
        StartPlayBTVResultData data = startPlayBTVResult.getData();
        AbstractC5868k.m23671c(data);
        List<StartPlayBTVResultLicenseList> totalPlayUrlList = data.getTotalPlayUrlList();
        AbstractC5868k.m23671c(totalPlayUrlList);
        Iterator<StartPlayBTVResultLicenseList> it = totalPlayUrlList.iterator();
        while (it.hasNext()) {
            List<LicenseBTVData> licenseList = it.next().getLicenseList();
            if (licenseList != null && !licenseList.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                for (LicenseBTVData licenseBTVData : licenseList) {
                    if (!AbstractC6567a.m25634d(licenseBTVData.getLicense())) {
                        this.f19764m = C7597p0.f27965b.m29236a().m29234b(licenseBTVData.getLicense(), "media_code");
                        if (list.contains(licenseBTVData.getTag())) {
                            arrayList.add(new Media(this.f19764m, licenseBTVData.getLicense(), "", "", "", ""));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B6 */
    public static final void m19132B6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C6 */
    public static final void m19134C6(C4598f2 c4598f2, String str, int i10, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c4598f2, "this$0");
        AbstractC5868k.m23674f(str, "$contentId");
        AbstractC5868k.m23674f(observableEmitter, "it");
        c4598f2.m19212w5().insert(new PlaybackPositionModel(str, String.valueOf(i10)));
        observableEmitter.onNext(0);
    }

    /* renamed from: D5 */
    private final void m19136D5(final Channel channel, String str) {
        boolean z10 = false;
        boolean z11 = false;
        C1456h0 c1456h0 = C1456h0.f5574a;
        C1456h0.a aVar = C1456h0.a.LIVE;
        List m6773i = c1456h0.m6773i(aVar);
        final List m6774j = c1456h0.m6774j(aVar);
        int i10 = 1;
        if (m6773i != null && !m6773i.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !AbstractC6567a.m25635e(channel.getLiveAddressList())) {
            if (m6774j != null && !m6774j.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                this.f19753b.mo17893P1(channel);
                final C5876s c5876s = new C5876s();
                String quality = channel.getQuality();
                if (quality != null) {
                    i10 = Integer.parseInt(quality);
                }
                c5876s.f23410a = i10;
                final C5874q c5874q = new C5874q();
                Observable create = Observable.create(new ObservableOnSubscribe() { // from class: h8.r1
                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(ObservableEmitter observableEmitter) {
                        C4598f2.m19141F5(Channel.this, this, c5876s, c5874q, m6774j, observableEmitter);
                    }
                });
                AbstractC5868k.m23673e(create, "create<ArrayList<Media>>…Next(mediaList)\n        }");
                Observable compose = AbstractC6567a.m25631a(create, this.f19752a.m19902N3()).compose(AbstractC7029f.m27120a());
                final d dVar = new d(channel, c5874q, str);
                Consumer consumer = new Consumer() { // from class: h8.s1
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C4598f2.m19144H5(InterfaceC5660l.this, obj);
                    }
                };
                final e eVar = e.f19782a;
                compose.subscribe(consumer, new Consumer() { // from class: h8.t1
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C4598f2.m19151K5(InterfaceC5660l.this, obj);
                    }
                });
                return;
            }
        }
        this.f19753b.mo17896Y0(false);
        AbstractC7766d abstractC7766d = this.f19752a;
        AbstractC5868k.m23672d(abstractC7766d, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
        C7617x c7617x = C7617x.f28030a;
        Context m3107M8 = this.f19752a.m3107M8();
        AbstractC5868k.m23673e(m3107M8, "frag.requireContext()");
        C5498s1.m22145Ab((C5498s1) abstractC7766d, 10024, false, C7617x.m29327c(c7617x, m3107M8, "10024", false, 4, null), "apk", "live", channel.getChannelCode(), channel.getName(), "", "", null, 512, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D6 */
    public static final void m19137D6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E6 */
    public static final void m19139E6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F5 */
    public static final void m19141F5(Channel channel, C4598f2 c4598f2, C5876s c5876s, C5874q c5874q, List list, ObservableEmitter observableEmitter) {
        int i10 = 0;
        String str = null;
        String str2 = null;
        AbstractC5868k.m23674f(channel, "$playChannel");
        AbstractC5868k.m23674f(c4598f2, "this$0");
        AbstractC5868k.m23674f(c5876s, "$defaultQuality");
        AbstractC5868k.m23674f(c5874q, "$isHadTagEquals");
        AbstractC5868k.m23674f(list, "$cdnTagList");
        AbstractC5868k.m23674f(observableEmitter, "it");
        ArrayList arrayList = new ArrayList();
        List<LiveAddress> liveAddressList = channel.getLiveAddressList();
        if (liveAddressList != null) {
            for (LiveAddress liveAddress : liveAddressList) {
                int i11 = c5876s.f23410a;
                String quality = liveAddress.getQuality();
                int i12 = 1;
                if (quality != null) {
                    i10 = Integer.parseInt(quality);
                } else {
                    i10 = 1;
                }
                if (i11 == i10) {
                    if (!c5874q.f23408a && list.contains(liveAddress.getTag())) {
                        c5874q.f23408a = true;
                    }
                    if (AbstractC6567a.m25637g(liveAddress.getPlayCode()) && list.contains(liveAddress.getTag())) {
                        String quality2 = liveAddress.getQuality();
                        if (quality2 != null) {
                            i12 = Integer.parseInt(quality2);
                        }
                        String license = liveAddress.getLicense();
                        if (AbstractC6567a.m25637g(license)) {
                            String playCode = liveAddress.getPlayCode();
                            AbstractC5868k.m23671c(playCode);
                            String m28997b = C7565e1.f27773a.m28997b(i12);
                            String supportVideoType = channel.getSupportVideoType();
                            if (supportVideoType == null) {
                                str = "";
                            } else {
                                str = supportVideoType;
                            }
                            String aVFormat = liveAddress.getAVFormat();
                            if (aVFormat == null) {
                                str2 = "";
                            } else {
                                str2 = aVFormat;
                            }
                            arrayList.add(new Media(playCode, license, "", m28997b, str, str2));
                        }
                    }
                }
            }
        }
        observableEmitter.onNext(arrayList);
    }

    /* renamed from: F6 */
    private final void m19142F6() {
        String str = null;
        String str2 = null;
        String name = null;
        String channelCode = null;
        AbstractActivityC0712e m3075C6 = this.f19752a.m3075C6();
        AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
        AbstractActivityC2972a abstractActivityC2972a = (AbstractActivityC2972a) m3075C6;
        Channel channel = this.f19759h;
        if (channel == null || (channelCode = channel.getChannelCode()) == null) {
            str = "";
        } else {
            str = channelCode;
        }
        Channel channel2 = this.f19759h;
        if (channel2 == null || (name = channel2.getName()) == null) {
            str2 = "";
        } else {
            str2 = name;
        }
        abstractActivityC2972a.m11972U5(C3303ay.f14041a, false, "apk", "live", str, str2, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H5 */
    public static final void m19144H5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: H6 */
    private final void m19145H6(boolean z10) {
        int i10 = 0;
        AbstractActivityC0712e m3075C6 = this.f19752a.m3075C6();
        boolean z11 = false;
        if (m3075C6 != null && !m3075C6.isFinishing()) {
            z11 = true;
        }
        if (z11) {
            int m6917a = C1473s.f5656a.m6917a();
            if (m6917a == 0) {
                i10 = 20900;
            } else {
                i10 = m6917a;
            }
            AbstractC7766d abstractC7766d = this.f19752a;
            AbstractC5868k.m23672d(abstractC7766d, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
            C7617x c7617x = C7617x.f28030a;
            Context m3107M8 = this.f19752a.m3107M8();
            AbstractC5868k.m23673e(m3107M8, "frag.requireContext()");
            C5498s1.m22145Ab((C5498s1) abstractC7766d, i10, true, C7617x.m29327c(c7617x, m3107M8, String.valueOf(i10), false, 4, null), "/getSlbInfo", "live", "", "", C7197a.f26917a.m27847d(), "", null, 512, null);
        }
    }

    /* renamed from: I6 */
    static /* synthetic */ void m19147I6(C4598f2 c4598f2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c4598f2.m19145H6(z10);
    }

    /* renamed from: J6 */
    private final void m19149J6(String str, int i10, String str2) {
        if (this.f19762k == null) {
            this.f19762k = new C0177l2(this);
        }
        C0177l2 c0177l2 = this.f19762k;
        if (c0177l2 != null) {
            c0177l2.m646b(MessageService.MSG_DB_READY_REPORT, i10, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K5 */
    public static final void m19151K5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: K6 */
    private final void m19152K6(boolean z10) {
        Disposable disposable;
        Disposable disposable2 = this.f19761j;
        if (disposable2 != null) {
            AbstractC5868k.m23671c(disposable2);
            if (!disposable2.isDisposed() && (disposable = this.f19761j) != null) {
                disposable.dispose();
            }
        }
        Observable<Long> intervalRange = Observable.intervalRange(0L, 45L, 0L, 2L, TimeUnit.SECONDS);
        final g0 g0Var = g0.f19787a;
        Observable<Long> filter = intervalRange.filter(new Predicate() { // from class: h8.z1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m19153L6;
                m19153L6 = C4598f2.m19153L6(InterfaceC5660l.this, obj);
                return m19153L6;
            }
        });
        AbstractC5868k.m23673e(filter, "intervalRange(0, 45, 0, …bFinish\n                }");
        AbstractC6567a.m25631a(filter, this.f19752a.m19902N3()).compose(AbstractC7029f.m27120a()).subscribe(new h0(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L6 */
    public static final boolean m19153L6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* renamed from: N6 */
    private final void m19156N6() {
        boolean z10 = false;
        this.f19753b.mo17894Q();
        C1427v c1427v = C1427v.f5519a;
        Channel m6622H = c1427v.m6622H();
        int m6624J = c1427v.m6624J();
        String m6623I = c1427v.m6623I();
        AbstractC7766d abstractC7766d = this.f19752a;
        AbstractC5868k.m23672d(abstractC7766d, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
        EpgProgram m22237I4 = ((C5498s1) abstractC7766d).m22237I4();
        this.f19763l = m22237I4;
        if (m22237I4 != null) {
            AbstractC5868k.m23671c(m22237I4);
            String contentId = m22237I4.getContentId();
            if (contentId != null && contentId.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && m6624J != -1 && m6622H != null && !m19192i5(m6622H)) {
                EpgProgram epgProgram = this.f19763l;
                AbstractC5868k.m23671c(epgProgram);
                String contentId2 = epgProgram.getContentId();
                AbstractC5868k.m23671c(contentId2);
                m19149J6(m6623I, m6624J, contentId2);
            }
        }
    }

    /* renamed from: O6 */
    private final void m19159O6(String str) {
        C1456h0 c1456h0 = C1456h0.f5574a;
        C1456h0.a aVar = C1456h0.a.LIVE;
        List m6774j = c1456h0.m6774j(aVar);
        boolean z10 = false;
        if (c1456h0.m6778n(aVar) && !m6774j.isEmpty()) {
            Channel channel = this.f19759h;
            if (channel != null) {
                this.f19753b.mo17903m1();
                this.f19753b.mo17898h4();
                this.f19753b.mo17891M2();
                List<LiveAddress> liveAddressList = channel.getLiveAddressList();
                if (liveAddressList != null) {
                    for (LiveAddress liveAddress : liveAddressList) {
                        if (AbstractC5868k.m23669a(liveAddress.getQuality(), str) && m6774j.contains(liveAddress.getTag())) {
                            z10 = true;
                        }
                    }
                }
                if (!z10) {
                    m19221G6();
                    return;
                }
                this.f19758g = channel.getChannelCode();
                AbstractC5868k.m23671c(str);
                this.f19757f = str;
                this.f19753b.mo17890M1(this.f19758g, str);
                return;
            }
            return;
        }
        m19147I6(this, false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r6 != false) goto L20;
     */
    /* renamed from: P5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m19162P5(com.request.result.Channel r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L46
            java.lang.String r1 = r6.getSupportVideoType()
            r2 = 1
            if (r1 == 0) goto L13
            int r1 = r1.length()
            if (r1 != 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            if (r1 != 0) goto L1e
            java.lang.String r1 = r6.getSupportVideoType()
            ne.AbstractC5868k.m23671c(r1)
            goto L20
        L1e:
            java.lang.String r1 = ""
        L20:
            boolean r3 = p201k2.AbstractC5085b.m20604n()
            if (r3 == 0) goto L46
            fa.d r3 = p132fa.C4300d.f18678a
            java.lang.String r4 = r3.m18061u()
            boolean r1 = p359ue.AbstractC7157k.m27705j(r4, r1, r2)
            if (r1 != 0) goto L42
            java.lang.String r6 = r6.getName()
            java.lang.String r1 = r3.m18070y0()
            r3 = 2
            r4 = 0
            boolean r6 = p359ue.AbstractC7157k.m27713v(r6, r1, r0, r3, r4)
            if (r6 == 0) goto L46
        L42:
            r5.m19142F6()
            return r2
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159h8.C4598f2.m19162P5(com.request.result.Channel):boolean");
    }

    /* renamed from: P6 */
    private final void m19163P6(String str, boolean z10) {
        ArrayList m6533y = C1407f.f5458a.m6533y();
        if (!AbstractC6567a.m25635e(m6533y) && !AbstractC6567a.m25634d(str)) {
            Iterator it = m6533y.iterator();
            while (it.hasNext()) {
                Channel channel = (Channel) it.next();
                if (AbstractC5868k.m23669a(channel.getChannelCode(), str)) {
                    channel.setLock(z10);
                    return;
                }
            }
        }
    }

    /* renamed from: Q6 */
    private final void m19166Q6() {
        AbstractC7766d abstractC7766d = this.f19752a;
        AbstractC5868k.m23672d(abstractC7766d, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
        if (AbstractC5868k.m23669a(((C5498s1) abstractC7766d).m22282za(), "NewVoiceLive")) {
            AbstractC7766d abstractC7766d2 = this.f19752a;
            AbstractC5868k.m23672d(abstractC7766d2, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
            this.f19755d = ((C5498s1) abstractC7766d2).m22230Ba();
            return;
        }
        C5498s1.a aVar = C5498s1.f22305l1;
        if (aVar.m22284a()) {
            this.f19755d = "search";
            aVar.m22286c(false);
        } else {
            String lowerCase = C1407f.f5458a.m6517l().toLowerCase();
            AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase()");
            this.f19755d = lowerCase;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U5 */
    public static final ArrayList m19169U5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W5 */
    public static final ArrayList m19171W5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y5 */
    public static final void m19176Y5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z5 */
    public static final void m19177Z5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: b6 */
    private final void m19180b6(InterfaceC5940r interfaceC5940r, InfoBarBean infoBarBean, Channel channel) {
        Observable just = Observable.just(infoBarBean);
        final j jVar = new j(channel, this);
        Observable map = just.map(new Function() { // from class: h8.a2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InfoBarBean m19183d6;
                m19183d6 = C4598f2.m19183d6(InterfaceC5660l.this, obj);
                return m19183d6;
            }
        });
        final k kVar = new k(infoBarBean, channel);
        Observable map2 = map.map(new Function() { // from class: h8.b2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InfoBarBean m19186e6;
                m19186e6 = C4598f2.m19186e6(InterfaceC5660l.this, obj);
                return m19186e6;
            }
        });
        final l lVar = new l(channel, infoBarBean);
        Observable map3 = map2.map(new Function() { // from class: h8.c2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InfoBarBean m19187f6;
                m19187f6 = C4598f2.m19187f6(InterfaceC5660l.this, obj);
                return m19187f6;
            }
        });
        final m mVar = new m(infoBarBean);
        Observable map4 = map3.map(new Function() { // from class: h8.d2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InfoBarBean m19189g6;
                m19189g6 = C4598f2.m19189g6(InterfaceC5660l.this, obj);
                return m19189g6;
            }
        });
        final n nVar = n.f19799a;
        Observable compose = map4.map(new Function() { // from class: h8.e2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InfoBarBean m19191h6;
                m19191h6 = C4598f2.m19191h6(InterfaceC5660l.this, obj);
                return m19191h6;
            }
        }).compose(AbstractC7029f.m27121b());
        final o oVar = new o(channel, interfaceC5940r);
        Consumer consumer = new Consumer() { // from class: h8.a1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19193i6(InterfaceC5660l.this, obj);
            }
        };
        final p pVar = new p(interfaceC5940r);
        compose.subscribe(consumer, new Consumer() { // from class: h8.b1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19194j6(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d6 */
    public static final InfoBarBean m19183d6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (InfoBarBean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e6 */
    public static final InfoBarBean m19186e6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (InfoBarBean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f6 */
    public static final InfoBarBean m19187f6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (InfoBarBean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g6 */
    public static final InfoBarBean m19189g6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (InfoBarBean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h6 */
    public static final InfoBarBean m19191h6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (InfoBarBean) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: i5 */
    private final boolean m19192i5(Channel channel) {
        return C1415j.m6561d(C1415j.f5500a, channel, new a(channel), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i6 */
    public static final void m19193i6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j6 */
    public static final void m19194j6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k5 */
    public static final void m19196k5(String str, C4598f2 c4598f2, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(str, "$contentId");
        AbstractC5868k.m23674f(c4598f2, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        PlaybackPositionModel playbackPositionModel = new PlaybackPositionModel();
        playbackPositionModel.setCode(str);
        c4598f2.m19212w5().delete(playbackPositionModel);
        observableEmitter.onNext(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k6 */
    public static final List m19197k6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l6 */
    public static final List m19198l6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o5 */
    public static final void m19199o5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p6 */
    public static final List m19200p6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q6 */
    public static final void m19202q6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r5 */
    public static final void m19204r5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r6 */
    public static final void m19205r6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: t5 */
    private final C0138c m19207t5() {
        return (C0138c) this.f19766o.getValue();
    }

    /* renamed from: t6 */
    private final void m19208t6() {
        this.f19764m = "";
        if (C1456h0.f5574a.m6779o()) {
            m19231g5(false);
        } else {
            m19152K6(false);
        }
    }

    /* renamed from: w5 */
    private final PlayBackDao m19212w5() {
        return (PlayBackDao) this.f19765n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w6 */
    public static final void m19213w6(C4598f2 c4598f2, String str, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c4598f2, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        PlaybackPositionModel query = c4598f2.m19212w5().query(str);
        if (query != null && Integer.parseInt(query.getPosition()) > 0) {
            observableEmitter.onNext(Integer.valueOf(Integer.parseInt(query.getPosition())));
        } else {
            observableEmitter.onNext(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6 */
    public static final void m19215x6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y6 */
    public static final void m19216y6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: z5 */
    private final C0183n0 m19217z5() {
        return (C0183n0) this.f19768q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z6 */
    public static final ChannelList m19218z6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ChannelList) interfaceC5660l.mo542f(obj);
    }

    @Override // p301qb.InterfaceC6387g0
    /* renamed from: A */
    public void mo19219A(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        C1428w.f5539a.m6677j(2);
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: A1 */
    public void mo17863A1() {
        C1428w c1428w = C1428w.f5539a;
        if (c1428w.m6672e() == 2) {
            c1428w.m6677j(3);
            C0183n0.m673c(m19217z5(), "live", false, 2, null);
        }
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: B */
    public void mo17864B() {
        m19208t6();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6441y0
    /* renamed from: E2 */
    public void mo19220E2(Channel channel, int i10) {
        AbstractC5868k.m23674f(channel, "channel");
        this.f19760i = false;
        channel.setFav(false);
        C1428w.f5539a.m6669b(channel.getChannelCode());
        InterfaceC5940r interfaceC5940r = this.f19769r;
        if (interfaceC5940r != null) {
            interfaceC5940r.mo23995e(false);
        }
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: F0 */
    public void mo17865F0(String str, String str2) {
        AbstractC5868k.m23674f(str, AnalyticsConfig.RTD_START_TIME);
        AbstractC5868k.m23674f(str2, "endTime");
        ChannelList channelList = this.f19756e;
        if (channelList != null) {
            channelList.setLocked_start_time(str);
        }
        ChannelList channelList2 = this.f19756e;
        if (channelList2 != null) {
            channelList2.setLocked_end_time(str2);
        }
        ChannelList channelList3 = this.f19756e;
        if (channelList3 != null) {
            String m20618k = AbstractC5086c.m20618k();
            AbstractC5868k.m23673e(m20618k, "getCurrentTimeZone2()");
            channelList3.setLocked_time_zone(m20618k);
        }
        if (C1415j.f5500a.m6571i(this.f19756e)) {
            C7709c.m29787d().m29801m(new LockMonitorEvent(this.f19756e, true));
            this.f19753b.mo17906s6(true);
            this.f19753b.mo17884D5(R$string.pwd_time_change_suc, R$color.color_31793a);
            return;
        }
        this.f19753b.mo17884D5(R$string.pwd_time_change_error, R$color.color_ef303b);
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: G2 */
    public void mo17866G2(int i10, String str) {
        AbstractC5868k.m23674f(str, "quality");
        int hashCode = str.hashCode();
        String str2 = "1";
        if (hashCode != 2300) {
            if (hashCode != 71343) {
                if (hashCode == 83985 && str.equals("UHD")) {
                    str2 = "3";
                }
            } else if (str.equals("HD+")) {
                str2 = "2";
            }
        } else {
            str.equals("HD");
        }
        m19159O6(str2);
    }

    /* renamed from: G6 */
    public void m19221G6() {
        String str = null;
        String str2 = null;
        String name = null;
        String channelCode = null;
        String str3 = null;
        GetAuthInfoResultData data;
        GetAuthInfoResultData data2;
        if (C1466m0.f5627a.m6840M()) {
            C7252a c7252a = C7252a.f27087a;
            GetAuthInfoResult m28073h = c7252a.m28073h();
            String str4 = null;
            if (m28073h != null && (data2 = m28073h.getData()) != null) {
                str3 = data2.getRenewFlag();
            } else {
                str3 = null;
            }
            if (AbstractC5868k.m23669a(str3, "2")) {
                InterfaceC4279f interfaceC4279f = this.f19753b;
                String string = this.f19752a.m3154d7().getString(R$string.play_not_vip);
                AbstractC5868k.m23673e(string, "frag.resources.getString(R.string.play_not_vip)");
                interfaceC4279f.mo17886I0(string);
                return;
            }
            GetAuthInfoResult m28073h2 = c7252a.m28073h();
            if (m28073h2 != null && (data = m28073h2.getData()) != null) {
                str4 = data.getShowType();
            }
            if (AbstractC5868k.m23669a(str4, "1")) {
                InterfaceC4279f interfaceC4279f2 = this.f19753b;
                String string2 = this.f19752a.m3154d7().getString(R$string.play_not_vip_noflag);
                AbstractC5868k.m23673e(string2, "frag.resources.getString…ring.play_not_vip_noflag)");
                interfaceC4279f2.mo17886I0(string2);
                return;
            }
            return;
        }
        AbstractC7766d abstractC7766d = this.f19752a;
        AbstractC5868k.m23672d(abstractC7766d, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
        C5498s1 c5498s1 = (C5498s1) abstractC7766d;
        C7617x c7617x = C7617x.f28030a;
        Context m3107M8 = this.f19752a.m3107M8();
        AbstractC5868k.m23673e(m3107M8, "frag.requireContext()");
        String m29327c = C7617x.m29327c(c7617x, m3107M8, "10024", false, 4, null);
        Channel channel = this.f19759h;
        if (channel == null || (channelCode = channel.getChannelCode()) == null) {
            str = "";
        } else {
            str = channelCode;
        }
        Channel channel2 = this.f19759h;
        if (channel2 == null || (name = channel2.getName()) == null) {
            str2 = "";
        } else {
            str2 = name;
        }
        C5498s1.m22145Ab(c5498s1, 10024, false, m29327c, "apk", "live", str, str2, "", "", null, 512, null);
    }

    @Override // p301qb.InterfaceC6387g0
    /* renamed from: I */
    public void mo19222I(GetFavoritesResultData getFavoritesResultData) {
        List<FavoriteList> list;
        C1428w c1428w = C1428w.f5539a;
        c1428w.m6677j(1);
        if (getFavoritesResultData != null) {
            list = getFavoritesResultData.getFavoriteList();
        } else {
            list = null;
        }
        c1428w.m6676i(list);
        C7709c.m29787d().m29801m(new GetLiveFavoriteSucEvent());
    }

    @Override // p301qb.InterfaceC6441y0
    /* renamed from: K1 */
    public void mo19223K1(String str, String str2) {
        String str3 = null;
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, "channelCode");
        this.f19760i = false;
        Context m3096J6 = this.f19752a.m3096J6();
        Context m3096J62 = this.f19752a.m3096J6();
        if (m3096J62 == null || (str3 = m3096J62.getString(R$string.rm_favorite_failed)) == null) {
            str3 = "";
        }
        AbstractC7598p1.m29245i(m3096J6, str3, new int[0]);
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: K2 */
    public void mo17867K2(InterfaceC5940r interfaceC5940r) {
        if (!C1407f.f5458a.m6507f()) {
            this.f19753b.mo17892O0(R$string.no_history_channel);
        } else {
            mo17869N2();
            mo17877f(interfaceC5940r);
        }
    }

    /* renamed from: M6 */
    public void m19224M6() {
        Channel channel;
        C4297a.f18620a.m17988e(false);
        InterfaceC4279f.a.m17911a(this.f19753b, false, 1, null);
        Channel m6531w = C1407f.f5458a.m6531w();
        this.f19759h = m6531w;
        if (!m19162P5(m6531w) && (channel = this.f19759h) != null) {
            String quality = channel.getQuality();
            if (quality == null) {
                quality = "1";
            }
            this.f19757f = quality;
            if (!m19192i5(channel)) {
                m19136D5(channel, this.f19755d);
            }
            this.f19753b.mo17908v3(channel.getName());
        }
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: N0 */
    public void mo17868N0(int i10) {
        C1407f c1407f = C1407f.f5458a;
        ArrayList m6533y = c1407f.m6533y();
        if (!AbstractC6567a.m25635e(m6533y) && !C4297a.f18620a.m17985b()) {
            c1407f.m6506e0(((c1407f.m6532x() + i10) + m6533y.size()) % m6533y.size());
        }
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: N2 */
    public void mo17869N2() {
        this.f19753b.mo17898h4();
        m19234s6();
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f19752a.m19902N3();
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: O0 */
    public void mo17870O0() {
        String str = null;
        C1415j c1415j = C1415j.f5500a;
        ChannelList channelList = this.f19756e;
        String str2 = null;
        if (channelList != null) {
            str = channelList.getChannelCode();
        } else {
            str = null;
        }
        AbstractC5868k.m23671c(str);
        if (c1415j.m6570h(str)) {
            C7709c.m29787d().m29801m(new LockMonitorEvent(this.f19756e, false));
            ChannelList channelList2 = this.f19756e;
            if (channelList2 != null) {
                str2 = channelList2.getChannelCode();
            }
            m19163P6(str2, false);
            this.f19753b.mo17884D5(R$string.pwd_time_unlocked, R$color.color_31793a);
            this.f19753b.mo17906s6(false);
            return;
        }
        this.f19753b.mo17884D5(R$string.pwd_time_unlocked_error, R$color.color_ef303b);
    }

    /* renamed from: O5 */
    public final InterfaceC4279f m19225O5() {
        return this.f19753b;
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: P */
    public void mo17871P(int i10) {
        if (i10 == -1) {
            return;
        }
        List m6509g = C1407f.f5458a.m6509g(i10);
        Observable just = Observable.just(m6509g);
        final q qVar = q.f19803a;
        Observable map = just.map(new Function() { // from class: h8.i1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m19197k6;
                m19197k6 = C4598f2.m19197k6(InterfaceC5660l.this, obj);
                return m19197k6;
            }
        });
        final r rVar = r.f19804a;
        Observable map2 = map.map(new Function() { // from class: h8.j1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m19198l6;
                m19198l6 = C4598f2.m19198l6(InterfaceC5660l.this, obj);
                return m19198l6;
            }
        });
        final s sVar = new s(i10, m6509g);
        Observable compose = map2.map(new Function() { // from class: h8.l1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m19200p6;
                m19200p6 = C4598f2.m19200p6(InterfaceC5660l.this, obj);
                return m19200p6;
            }
        }).compose(AbstractC7029f.m27121b());
        final t tVar = new t();
        Consumer consumer = new Consumer() { // from class: h8.m1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19202q6(InterfaceC5660l.this, obj);
            }
        };
        final u uVar = u.f19811a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.n1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19205r6(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: Q */
    public void mo17872Q() {
        Observable just = Observable.just(7);
        final f fVar = new f();
        Observable map = just.map(new Function() { // from class: h8.z0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19169U5;
                m19169U5 = C4598f2.m19169U5(InterfaceC5660l.this, obj);
                return m19169U5;
            }
        });
        final g gVar = new g();
        Observable compose = map.map(new Function() { // from class: h8.k1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19171W5;
                m19171W5 = C4598f2.m19171W5(InterfaceC5660l.this, obj);
                return m19171W5;
            }
        }).compose(AbstractC7029f.m27121b());
        final h hVar = new h();
        Consumer consumer = new Consumer() { // from class: h8.v1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19176Y5(InterfaceC5660l.this, obj);
            }
        };
        final i iVar = i.f19791a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.y1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19177Z5(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p301qb.InterfaceC6406m1
    /* renamed from: R2 */
    public void mo19226R2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC7766d abstractC7766d = this.f19752a;
        AbstractC5868k.m23672d(abstractC7766d, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
        C5498s1.m22210nb((C5498s1) abstractC7766d, str, false, 2, null);
    }

    @Override // p301qb.InterfaceC6438x0
    /* renamed from: R4 */
    public void mo19227R4(String str, String str2) {
        String str3 = null;
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, "channelCode");
        this.f19760i = false;
        if (AbstractC5868k.m23669a(str, "portal100061")) {
            Context m3096J6 = this.f19752a.m3096J6();
            if (m3096J6 != null) {
                AbstractC7598p1.m29245i(m3096J6, m3096J6.getString(com.module.R$string.error_code_user_type) + AgooConstants.ACK_BODY_NULL + m3096J6.getString(com.module.R$string.user_ef11), new int[0]);
                return;
            }
            return;
        }
        Context m3096J62 = this.f19752a.m3096J6();
        Context m3096J63 = this.f19752a.m3096J6();
        if (m3096J63 == null || (str3 = m3096J63.getString(R$string.favorite_failed)) == null) {
            str3 = "";
        }
        AbstractC7598p1.m29245i(m3096J62, str3, new int[0]);
    }

    /* renamed from: R5 */
    public final boolean m19228R5() {
        C1407f c1407f = C1407f.f5458a;
        if (c1407f.m6528t() == c1407f.m6525q() && c1407f.m6525q() != -1) {
            return true;
        }
        return false;
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: T2 */
    public void mo17873T2() {
        String str = null;
        C1415j c1415j = C1415j.f5500a;
        ChannelList channelList = this.f19756e;
        if (channelList != null) {
            str = channelList.getChannelCode();
        } else {
            str = null;
        }
        if (c1415j.m6573n(str) != null) {
            this.f19753b.mo17900k4();
        } else {
            this.f19753b.mo17884D5(R$string.no_lock, R$color.color_31793a);
        }
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: U */
    public void mo17874U(InterfaceC5940r interfaceC5940r) {
        Channel m6531w;
        if (this.f19760i || (m6531w = C1407f.f5458a.m6531w()) == null || AbstractC5868k.m23669a("1", m6531w.getRestricted())) {
            return;
        }
        this.f19769r = interfaceC5940r;
        FavoriteList m6670c = C1428w.f5539a.m6670c(m6531w);
        if (m6670c != null) {
            m19129A5().m609b(m6670c.getId(), m6531w, 0);
        } else {
            m19207t5().m536b("2", m6531w, 0);
        }
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: W0 */
    public Channel mo17875W0() {
        return C1407f.f5458a.m6531w();
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: d3 */
    public void mo17876d3(final String str) {
        AbstractC5868k.m23674f(str, "contentId");
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: h8.u1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4598f2.m19196k5(str, this, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final b bVar = new b();
        Consumer consumer = new Consumer() { // from class: h8.w1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19199o5(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f19775a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.x1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19204r5(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p301qb.InterfaceC6438x0
    /* renamed from: e2 */
    public void mo19229e2(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        this.f19760i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    @Override // p130f8.InterfaceC4278e
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo17877f(p263o8.InterfaceC5940r r20) {
        /*
            r19 = this;
            r0 = r20
            c8.f r1 = p040c8.C1407f.f5458a
            java.util.ArrayList r2 = r1.m6533y()
            boolean r2 = p317rb.AbstractC6567a.m25635e(r2)
            if (r2 == 0) goto L14
            if (r0 == 0) goto L13
            r20.mo23993b()
        L13:
            return
        L14:
            com.request.result.Channel r2 = r1.m6531w()
            boolean r3 = r1.m6527s()
            java.lang.String r4 = ""
            if (r3 == 0) goto L2a
            if (r2 == 0) goto L28
            java.lang.String r1 = r2.getFixedChannelNumber()
            if (r1 != 0) goto L34
        L28:
            r6 = r4
            goto L35
        L2a:
            int r1 = r1.m6532x()
            int r1 = r1 + 1
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L34:
            r6 = r1
        L35:
            if (r2 == 0) goto L70
            com.live.bean.InfoBarBean r1 = new com.live.bean.InfoBarBean
            java.lang.String r3 = p237m8.AbstractC5607a.m22776a(r2)
            if (r3 != 0) goto L41
            r7 = r4
            goto L42
        L41:
            r7 = r3
        L42:
            java.lang.String r8 = r2.getChannelCode()
            xa.o0 r3 = p400xa.C7594o0.f27942a
            java.util.List r4 = r2.getPosterList()
            xa.o0$a r5 = p400xa.C7594o0.a.Icon
            java.lang.String r9 = r3.m29220i(r4, r5)
            boolean r10 = r2.isFav()
            boolean r11 = r2.isLock()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r16 = r2.getSupportVideoType()
            r17 = 960(0x3c0, float:1.345E-42)
            r18 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = r19
            r3.m19180b6(r0, r1, r2)
            goto L72
        L70:
            r3 = r19
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p159h8.C4598f2.mo17877f(o8.r):void");
    }

    @Override // p301qb.InterfaceC6406m1
    /* renamed from: f5 */
    public void mo19230f5(StartPlayBTVResult startPlayBTVResult) {
        boolean z10 = false;
        int i10 = 0;
        List<StartPlayBTVResultLicenseList> totalPlayUrlList;
        AbstractC5868k.m23674f(startPlayBTVResult, "result");
        StartPlayBTVResultData data = startPlayBTVResult.getData();
        boolean z11 = true;
        if (data != null && (totalPlayUrlList = data.getTotalPlayUrlList()) != null) {
            z10 = totalPlayUrlList.isEmpty();
        } else {
            z10 = true;
        }
        if (z10) {
            this.f19764m = "";
            this.f19753b.mo17902l3();
            m19221G6();
            return;
        }
        List m6774j = C1456h0.f5574a.m6774j(C1456h0.a.RECORD);
        if (m6774j.isEmpty()) {
            AbstractC7766d abstractC7766d = this.f19752a;
            AbstractC5868k.m23672d(abstractC7766d, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
            C5498s1.m22210nb((C5498s1) abstractC7766d, "20900", false, 2, null);
            return;
        }
        List m19131B5 = m19131B5(startPlayBTVResult, m6774j);
        if (m19131B5.size() == 0) {
            AbstractActivityC0712e m3075C6 = this.f19752a.m3075C6();
            if (m3075C6 == null || m3075C6.isFinishing()) {
                z11 = false;
            }
            if (z11) {
                int m6917a = C1473s.f5656a.m6917a();
                if (m6917a == 0) {
                    i10 = 20900;
                } else {
                    i10 = m6917a;
                }
                AbstractC7766d abstractC7766d2 = this.f19752a;
                AbstractC5868k.m23672d(abstractC7766d2, "null cannot be cast to non-null type com.live.ui.fragment.LiveFrag");
                C7617x c7617x = C7617x.f28030a;
                Context m3107M8 = this.f19752a.m3107M8();
                AbstractC5868k.m23673e(m3107M8, "frag.requireContext()");
                C5498s1.m22145Ab((C5498s1) abstractC7766d2, i10, true, C7617x.m29327c(c7617x, m3107M8, String.valueOf(i10), false, 4, null), "/getSlbInfo", "live", "", "", C7197a.f26917a.m27847d(), "", null, 512, null);
                return;
            }
            return;
        }
        this.f19753b.mo17887J2(m19131B5, this.f19755d);
    }

    /* renamed from: g5 */
    public final void m19231g5(boolean z10) {
        if (z10) {
            if (C1456h0.f5574a.m6778n(C1456h0.a.LIVE)) {
                m19224M6();
                this.f19753b.mo17897a3();
                return;
            } else {
                m19145H6(true);
                return;
            }
        }
        if (C1456h0.f5574a.m6778n(C1456h0.a.RECORD)) {
            m19156N6();
        } else {
            m19147I6(this, false, 1, null);
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        C1415j.m6563g(C1415j.f5500a, null, 1, null);
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: o */
    public void mo17878o(final String str, final int i10) {
        AbstractC5868k.m23674f(str, "contentId");
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: h8.o1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4598f2.m19134C6(C4598f2.this, str, i10, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final e0 e0Var = new e0();
        Consumer consumer = new Consumer() { // from class: h8.p1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19137D6(InterfaceC5660l.this, obj);
            }
        };
        final f0 f0Var = f0.f19785a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.q1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19139E6(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p301qb.InterfaceC6441y0
    /* renamed from: o6 */
    public void mo19232o6(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        this.f19760i = true;
    }

    /* renamed from: s5 */
    public final AbstractC7766d m19233s5() {
        return this.f19752a;
    }

    /* renamed from: s6 */
    public final void m19234s6() {
        m19166Q6();
        C7709c.m29787d().m29801m(new UpdatePlayIndexItemEvent());
        this.f19753b.mo17903m1();
        C1407f c1407f = C1407f.f5458a;
        if (c1407f.m6483D() && c1407f.m6486H()) {
            return;
        }
        if (C1456h0.f5574a.m6779o()) {
            m19231g5(true);
        } else {
            m19152K6(true);
        }
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: u2 */
    public void mo17879u2(Channel channel, boolean z10) {
        AbstractC5868k.m23674f(channel, "channel");
        if (z10) {
            C1427v c1427v = C1427v.f5519a;
            int m6624J = c1427v.m6624J();
            String m6623I = c1427v.m6623I();
            EpgProgram epgProgram = this.f19763l;
            if (epgProgram != null) {
                String contentId = epgProgram.getContentId();
                AbstractC5868k.m23671c(contentId);
                m19149J6(m6623I, m6624J, contentId);
                return;
            }
            return;
        }
        C4297a.f18620a.m17988e(false);
        m19136D5(channel, this.f19755d);
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: w0 */
    public void mo17880w0(String str, String str2) {
        boolean z10 = false;
        String str3 = null;
        String str4 = null;
        if (AbstractC6567a.m25634d(AbstractC4161e.f18225a.m17399b())) {
            this.f19753b.mo17895R5();
            return;
        }
        boolean z11 = false;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (str2 == null || str2.length() == 0) {
                z11 = true;
            }
            if (!z11 && AbstractC5086c.m20621n(str) && AbstractC5086c.m20621n(str2)) {
                AbstractC5868k.m23671c(str);
                AbstractC5868k.m23671c(str2);
                if (str.compareTo(str2) <= 0) {
                    C1415j c1415j = C1415j.f5500a;
                    ChannelList channelList = this.f19756e;
                    String str5 = null;
                    if (channelList != null) {
                        str3 = channelList.getChannelCode();
                    } else {
                        str3 = null;
                    }
                    if (c1415j.m6573n(str3) != null) {
                        ChannelList channelList2 = this.f19756e;
                        if (channelList2 != null) {
                            str4 = channelList2.getLocked_start_time();
                        } else {
                            str4 = null;
                        }
                        if (AbstractC5868k.m23669a(str4, str)) {
                            ChannelList channelList3 = this.f19756e;
                            if (channelList3 != null) {
                                str5 = channelList3.getLocked_end_time();
                            }
                            if (AbstractC5868k.m23669a(str5, str2)) {
                                this.f19753b.mo17884D5(R$string.pwd_time_suc, R$color.color_31793a);
                                this.f19753b.mo17906s6(true);
                                return;
                            }
                        }
                        this.f19753b.mo17905r3(str, str2);
                        return;
                    }
                    ChannelList channelList4 = this.f19756e;
                    if (channelList4 != null) {
                        channelList4.setLocked_start_time(str);
                    }
                    ChannelList channelList5 = this.f19756e;
                    if (channelList5 != null) {
                        channelList5.setLocked_end_time(str2);
                    }
                    ChannelList channelList6 = this.f19756e;
                    if (channelList6 != null) {
                        String m20618k = AbstractC5086c.m20618k();
                        AbstractC5868k.m23673e(m20618k, "getCurrentTimeZone2()");
                        channelList6.setLocked_time_zone(m20618k);
                    }
                    if (c1415j.m6571i(this.f19756e)) {
                        C7709c.m29787d().m29801m(new LockMonitorEvent(this.f19756e, true));
                        ChannelList channelList7 = this.f19756e;
                        if (channelList7 != null) {
                            str5 = channelList7.getChannelCode();
                        }
                        m19163P6(str5, true);
                        this.f19753b.mo17906s6(true);
                        this.f19753b.mo17884D5(R$string.pwd_time_suc, R$color.color_31793a);
                        return;
                    }
                    this.f19753b.mo17884D5(R$string.pwd_time_error, R$color.color_ef303b);
                    return;
                }
            }
        }
        this.f19753b.mo17884D5(R$string.pwd_time_input_error, R$color.color_ef303b);
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: x */
    public void mo17881x(final String str, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC5660l, "callback");
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: h8.f1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4598f2.m19213w6(C4598f2.this, str, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final z zVar = new z(interfaceC5660l);
        Consumer consumer = new Consumer() { // from class: h8.g1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19215x6(InterfaceC5660l.this, obj);
            }
        };
        final a0 a0Var = a0.f19772a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.h1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19216y6(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: x2 */
    public void mo17882x2(ChannelList channelList, boolean z10) {
        String str = null;
        AbstractC5868k.m23674f(channelList, "lockedChannel");
        String channelCode = channelList.getChannelCode();
        Channel channel = this.f19759h;
        if (channel != null) {
            str = channel.getChannelCode();
        } else {
            str = null;
        }
        if (!AbstractC5868k.m23669a(channelCode, str)) {
            return;
        }
        if (z10) {
            C1415j.m6567p(C1415j.f5500a, channelList, null, null, 4, null);
        } else {
            C1415j.m6563g(C1415j.f5500a, null, 1, null);
        }
    }

    @Override // p130f8.InterfaceC4278e
    /* renamed from: y1 */
    public boolean mo17883y1(Channel channel) {
        if (channel == null) {
            return false;
        }
        Observable just = Observable.just(channel);
        final b0 b0Var = new b0();
        Observable compose = just.map(new Function() { // from class: h8.c1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ChannelList m19218z6;
                m19218z6 = C4598f2.m19218z6(InterfaceC5660l.this, obj);
                return m19218z6;
            }
        }).compose(AbstractC7029f.m27121b());
        final c0 c0Var = new c0();
        Consumer consumer = new Consumer() { // from class: h8.d1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19130A6(InterfaceC5660l.this, obj);
            }
        };
        final d0 d0Var = d0.f19781a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.e1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4598f2.m19132B6(InterfaceC5660l.this, obj);
            }
        });
        return true;
    }

    @Override // p301qb.InterfaceC6438x0
    /* renamed from: z3 */
    public void mo19235z3(List list, Channel channel, int i10) {
        Object m7008t = null;
        AbstractC5868k.m23674f(list, "favId");
        AbstractC5868k.m23674f(channel, "channel");
        this.f19760i = false;
        C7589m1.f27886a.m29135d(C7589m1.b.f27896a.m29160a(), channel.getChannelCode(), channel.getName(), 0L);
        channel.setFav(true);
        C1428w c1428w = C1428w.f5539a;
        m7008t = AbstractC1508t.m7008t(list, 0);
        c1428w.m6668a((FavIdDataItem) m7008t, channel.getSupportVideoType());
        InterfaceC5940r interfaceC5940r = this.f19769r;
        if (interfaceC5940r != null) {
            interfaceC5940r.mo23995e(true);
        }
    }
}
