package p038c6;

import android.support.v4.media.session.AbstractC0272b;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cookie.SerializableCookie;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3384f;
import p038c6.AbstractC1366a0;
import p235m6.C5599c;
import p235m6.InterfaceC5600d;
import p235m6.InterfaceC5601e;
import p248n6.InterfaceC5746a;
import p248n6.InterfaceC5747b;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: c6.a */
/* loaded from: classes.dex */
public final class C1365a implements InterfaceC5746a {

    /* renamed from: a */
    public static final InterfaceC5746a f5108a = new C1365a();

    /* renamed from: c6.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC5600d {

        /* renamed from: a */
        static final a f5109a = new a();

        /* renamed from: b */
        private static final C5599c f5110b = C5599c.m22762d("pid");

        /* renamed from: c */
        private static final C5599c f5111c = C5599c.m22762d("processName");

        /* renamed from: d */
        private static final C5599c f5112d = C5599c.m22762d("reasonCode");

        /* renamed from: e */
        private static final C5599c f5113e = C5599c.m22762d("importance");

        /* renamed from: f */
        private static final C5599c f5114f = C5599c.m22762d("pss");

        /* renamed from: g */
        private static final C5599c f5115g = C5599c.m22762d("rss");

        /* renamed from: h */
        private static final C5599c f5116h = C5599c.m22762d("timestamp");

        /* renamed from: i */
        private static final C5599c f5117i = C5599c.m22762d("traceFile");

        private a() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.a aVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22768b(f5110b, aVar.mo6180c());
            interfaceC5601e.mo22770f(f5111c, aVar.mo6181d());
            interfaceC5601e.mo22768b(f5112d, aVar.mo6183f());
            interfaceC5601e.mo22768b(f5113e, aVar.mo6179b());
            interfaceC5601e.mo22767a(f5114f, aVar.mo6182e());
            interfaceC5601e.mo22767a(f5115g, aVar.mo6184g());
            interfaceC5601e.mo22767a(f5116h, aVar.mo6185h());
            interfaceC5601e.mo22770f(f5117i, aVar.mo6186i());
        }
    }

    /* renamed from: c6.a$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC5600d {

        /* renamed from: a */
        static final b f5118a = new b();

        /* renamed from: b */
        private static final C5599c f5119b = C5599c.m22762d(CacheEntity.KEY);

        /* renamed from: c */
        private static final C5599c f5120c = C5599c.m22762d("value");

        private b() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.c cVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5119b, cVar.mo6206b());
            interfaceC5601e.mo22770f(f5120c, cVar.mo6207c());
        }
    }

    /* renamed from: c6.a$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC5600d {

        /* renamed from: a */
        static final c f5121a = new c();

        /* renamed from: b */
        private static final C5599c f5122b = C5599c.m22762d(Constants.KEY_SDK_VERSION);

        /* renamed from: c */
        private static final C5599c f5123c = C5599c.m22762d("gmpAppId");

        /* renamed from: d */
        private static final C5599c f5124d = C5599c.m22762d(DispatchConstants.PLATFORM);

        /* renamed from: e */
        private static final C5599c f5125e = C5599c.m22762d("installationUuid");

        /* renamed from: f */
        private static final C5599c f5126f = C5599c.m22762d("buildVersion");

        /* renamed from: g */
        private static final C5599c f5127g = C5599c.m22762d("displayVersion");

        /* renamed from: h */
        private static final C5599c f5128h = C5599c.m22762d(C3384f.f14569aC);

        /* renamed from: i */
        private static final C5599c f5129i = C5599c.m22762d("ndkPayload");

        private c() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0 abstractC1366a0, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5122b, abstractC1366a0.mo6172i());
            interfaceC5601e.mo22770f(f5123c, abstractC1366a0.mo6168e());
            interfaceC5601e.mo22768b(f5124d, abstractC1366a0.mo6171h());
            interfaceC5601e.mo22770f(f5125e, abstractC1366a0.mo6169f());
            interfaceC5601e.mo22770f(f5126f, abstractC1366a0.mo6166c());
            interfaceC5601e.mo22770f(f5127g, abstractC1366a0.mo6167d());
            interfaceC5601e.mo22770f(f5128h, abstractC1366a0.mo6173j());
            interfaceC5601e.mo22770f(f5129i, abstractC1366a0.mo6170g());
        }
    }

    /* renamed from: c6.a$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC5600d {

        /* renamed from: a */
        static final d f5130a = new d();

        /* renamed from: b */
        private static final C5599c f5131b = C5599c.m22762d("files");

        /* renamed from: c */
        private static final C5599c f5132c = C5599c.m22762d("orgId");

        private d() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.d dVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5131b, dVar.mo6212b());
            interfaceC5601e.mo22770f(f5132c, dVar.mo6213c());
        }
    }

    /* renamed from: c6.a$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC5600d {

        /* renamed from: a */
        static final e f5133a = new e();

        /* renamed from: b */
        private static final C5599c f5134b = C5599c.m22762d("filename");

        /* renamed from: c */
        private static final C5599c f5135c = C5599c.m22762d("contents");

        private e() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.d.b bVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5134b, bVar.mo6219c());
            interfaceC5601e.mo22770f(f5135c, bVar.mo6218b());
        }
    }

    /* renamed from: c6.a$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC5600d {

        /* renamed from: a */
        static final f f5136a = new f();

        /* renamed from: b */
        private static final C5599c f5137b = C5599c.m22762d("identifier");

        /* renamed from: c */
        private static final C5599c f5138c = C5599c.m22762d("version");

        /* renamed from: d */
        private static final C5599c f5139d = C5599c.m22762d("displayVersion");

        /* renamed from: e */
        private static final C5599c f5140e = C5599c.m22762d("organization");

        /* renamed from: f */
        private static final C5599c f5141f = C5599c.m22762d("installationUuid");

        /* renamed from: g */
        private static final C5599c f5142g = C5599c.m22762d("developmentPlatform");

        /* renamed from: h */
        private static final C5599c f5143h = C5599c.m22762d("developmentPlatformVersion");

        private f() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.a aVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5137b, aVar.mo6243e());
            interfaceC5601e.mo22770f(f5138c, aVar.mo6246h());
            interfaceC5601e.mo22770f(f5139d, aVar.mo6242d());
            C5599c c5599c = f5140e;
            aVar.mo6245g();
            interfaceC5601e.mo22770f(c5599c, null);
            interfaceC5601e.mo22770f(f5141f, aVar.mo6244f());
            interfaceC5601e.mo22770f(f5142g, aVar.mo6240b());
            interfaceC5601e.mo22770f(f5143h, aVar.mo6241c());
        }
    }

    /* renamed from: c6.a$g */
    /* loaded from: classes.dex */
    private static final class g implements InterfaceC5600d {

        /* renamed from: a */
        static final g f5144a = new g();

        /* renamed from: b */
        private static final C5599c f5145b = C5599c.m22762d("clsId");

        private g() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo6142a(Object obj, Object obj2) {
            AbstractC0272b.m941a(obj);
            m6149b(null, (InterfaceC5601e) obj2);
        }

        /* renamed from: b */
        public void m6149b(AbstractC1366a0.e.a.b bVar, InterfaceC5601e interfaceC5601e) {
            throw null;
        }
    }

    /* renamed from: c6.a$h */
    /* loaded from: classes.dex */
    private static final class h implements InterfaceC5600d {

        /* renamed from: a */
        static final h f5146a = new h();

        /* renamed from: b */
        private static final C5599c f5147b = C5599c.m22762d("arch");

        /* renamed from: c */
        private static final C5599c f5148c = C5599c.m22762d(Constants.KEY_MODEL);

        /* renamed from: d */
        private static final C5599c f5149d = C5599c.m22762d("cores");

        /* renamed from: e */
        private static final C5599c f5150e = C5599c.m22762d("ram");

        /* renamed from: f */
        private static final C5599c f5151f = C5599c.m22762d("diskSpace");

        /* renamed from: g */
        private static final C5599c f5152g = C5599c.m22762d("simulator");

        /* renamed from: h */
        private static final C5599c f5153h = C5599c.m22762d("state");

        /* renamed from: i */
        private static final C5599c f5154i = C5599c.m22762d("manufacturer");

        /* renamed from: j */
        private static final C5599c f5155j = C5599c.m22762d("modelClass");

        private h() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.c cVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22768b(f5147b, cVar.mo6268b());
            interfaceC5601e.mo22770f(f5148c, cVar.mo6272f());
            interfaceC5601e.mo22768b(f5149d, cVar.mo6269c());
            interfaceC5601e.mo22767a(f5150e, cVar.mo6274h());
            interfaceC5601e.mo22767a(f5151f, cVar.mo6270d());
            interfaceC5601e.mo22769c(f5152g, cVar.mo6276j());
            interfaceC5601e.mo22768b(f5153h, cVar.mo6275i());
            interfaceC5601e.mo22770f(f5154i, cVar.mo6271e());
            interfaceC5601e.mo22770f(f5155j, cVar.mo6273g());
        }
    }

    /* renamed from: c6.a$i */
    /* loaded from: classes.dex */
    private static final class i implements InterfaceC5600d {

        /* renamed from: a */
        static final i f5156a = new i();

        /* renamed from: b */
        private static final C5599c f5157b = C5599c.m22762d("generator");

        /* renamed from: c */
        private static final C5599c f5158c = C5599c.m22762d("identifier");

        /* renamed from: d */
        private static final C5599c f5159d = C5599c.m22762d("startedAt");

        /* renamed from: e */
        private static final C5599c f5160e = C5599c.m22762d("endedAt");

        /* renamed from: f */
        private static final C5599c f5161f = C5599c.m22762d("crashed");

        /* renamed from: g */
        private static final C5599c f5162g = C5599c.m22762d("app");

        /* renamed from: h */
        private static final C5599c f5163h = C5599c.m22762d(C3309bd.f14106m);

        /* renamed from: i */
        private static final C5599c f5164i = C5599c.m22762d("os");

        /* renamed from: j */
        private static final C5599c f5165j = C5599c.m22762d("device");

        /* renamed from: k */
        private static final C5599c f5166k = C5599c.m22762d(C3384f.f14604ax);

        /* renamed from: l */
        private static final C5599c f5167l = C5599c.m22762d("generatorType");

        private i() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e eVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5157b, eVar.mo6228f());
            interfaceC5601e.mo22770f(f5158c, eVar.m6231i());
            interfaceC5601e.mo22767a(f5159d, eVar.mo6233k());
            interfaceC5601e.mo22770f(f5160e, eVar.mo6226d());
            interfaceC5601e.mo22769c(f5161f, eVar.mo6235m());
            interfaceC5601e.mo22770f(f5162g, eVar.mo6224b());
            interfaceC5601e.mo22770f(f5163h, eVar.mo6234l());
            interfaceC5601e.mo22770f(f5164i, eVar.mo6232j());
            interfaceC5601e.mo22770f(f5165j, eVar.mo6225c());
            interfaceC5601e.mo22770f(f5166k, eVar.mo6227e());
            interfaceC5601e.mo22768b(f5167l, eVar.mo6229g());
        }
    }

    /* renamed from: c6.a$j */
    /* loaded from: classes.dex */
    private static final class j implements InterfaceC5600d {

        /* renamed from: a */
        static final j f5168a = new j();

        /* renamed from: b */
        private static final C5599c f5169b = C5599c.m22762d("execution");

        /* renamed from: c */
        private static final C5599c f5170c = C5599c.m22762d("customAttributes");

        /* renamed from: d */
        private static final C5599c f5171d = C5599c.m22762d("internalKeys");

        /* renamed from: e */
        private static final C5599c f5172e = C5599c.m22762d("background");

        /* renamed from: f */
        private static final C5599c f5173f = C5599c.m22762d("uiOrientation");

        private j() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.d.a aVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5169b, aVar.mo6297d());
            interfaceC5601e.mo22770f(f5170c, aVar.mo6296c());
            interfaceC5601e.mo22770f(f5171d, aVar.mo6298e());
            interfaceC5601e.mo22770f(f5172e, aVar.mo6295b());
            interfaceC5601e.mo22768b(f5173f, aVar.mo6299f());
        }
    }

    /* renamed from: c6.a$k */
    /* loaded from: classes.dex */
    private static final class k implements InterfaceC5600d {

        /* renamed from: a */
        static final k f5174a = new k();

        /* renamed from: b */
        private static final C5599c f5175b = C5599c.m22762d("baseAddress");

        /* renamed from: c */
        private static final C5599c f5176c = C5599c.m22762d("size");

        /* renamed from: d */
        private static final C5599c f5177d = C5599c.m22762d(SerializableCookie.NAME);

        /* renamed from: e */
        private static final C5599c f5178e = C5599c.m22762d("uuid");

        private k() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.d.a.b.AbstractC7806a abstractC7806a, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22767a(f5175b, abstractC7806a.mo6314b());
            interfaceC5601e.mo22767a(f5176c, abstractC7806a.mo6316d());
            interfaceC5601e.mo22770f(f5177d, abstractC7806a.mo6315c());
            interfaceC5601e.mo22770f(f5178e, abstractC7806a.m6318f());
        }
    }

    /* renamed from: c6.a$l */
    /* loaded from: classes.dex */
    private static final class l implements InterfaceC5600d {

        /* renamed from: a */
        static final l f5179a = new l();

        /* renamed from: b */
        private static final C5599c f5180b = C5599c.m22762d("threads");

        /* renamed from: c */
        private static final C5599c f5181c = C5599c.m22762d("exception");

        /* renamed from: d */
        private static final C5599c f5182d = C5599c.m22762d("appExitInfo");

        /* renamed from: e */
        private static final C5599c f5183e = C5599c.m22762d("signal");

        /* renamed from: f */
        private static final C5599c f5184f = C5599c.m22762d("binaries");

        private l() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.d.a.b bVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5180b, bVar.mo6312f());
            interfaceC5601e.mo22770f(f5181c, bVar.mo6310d());
            interfaceC5601e.mo22770f(f5182d, bVar.mo6308b());
            interfaceC5601e.mo22770f(f5183e, bVar.mo6311e());
            interfaceC5601e.mo22770f(f5184f, bVar.mo6309c());
        }
    }

    /* renamed from: c6.a$m */
    /* loaded from: classes.dex */
    private static final class m implements InterfaceC5600d {

        /* renamed from: a */
        static final m f5185a = new m();

        /* renamed from: b */
        private static final C5599c f5186b = C5599c.m22762d("type");

        /* renamed from: c */
        private static final C5599c f5187c = C5599c.m22762d("reason");

        /* renamed from: d */
        private static final C5599c f5188d = C5599c.m22762d("frames");

        /* renamed from: e */
        private static final C5599c f5189e = C5599c.m22762d("causedBy");

        /* renamed from: f */
        private static final C5599c f5190f = C5599c.m22762d("overflowCount");

        private m() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.d.a.b.c cVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5186b, cVar.mo6336f());
            interfaceC5601e.mo22770f(f5187c, cVar.mo6335e());
            interfaceC5601e.mo22770f(f5188d, cVar.mo6333c());
            interfaceC5601e.mo22770f(f5189e, cVar.mo6332b());
            interfaceC5601e.mo22768b(f5190f, cVar.mo6334d());
        }
    }

    /* renamed from: c6.a$n */
    /* loaded from: classes.dex */
    private static final class n implements InterfaceC5600d {

        /* renamed from: a */
        static final n f5191a = new n();

        /* renamed from: b */
        private static final C5599c f5192b = C5599c.m22762d(SerializableCookie.NAME);

        /* renamed from: c */
        private static final C5599c f5193c = C5599c.m22762d(Constants.KEY_HTTP_CODE);

        /* renamed from: d */
        private static final C5599c f5194d = C5599c.m22762d("address");

        private n() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.d.a.b.AbstractC7810d abstractC7810d, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5192b, abstractC7810d.mo6346d());
            interfaceC5601e.mo22770f(f5193c, abstractC7810d.mo6345c());
            interfaceC5601e.mo22767a(f5194d, abstractC7810d.mo6344b());
        }
    }

    /* renamed from: c6.a$o */
    /* loaded from: classes.dex */
    private static final class o implements InterfaceC5600d {

        /* renamed from: a */
        static final o f5195a = new o();

        /* renamed from: b */
        private static final C5599c f5196b = C5599c.m22762d(SerializableCookie.NAME);

        /* renamed from: c */
        private static final C5599c f5197c = C5599c.m22762d("importance");

        /* renamed from: d */
        private static final C5599c f5198d = C5599c.m22762d("frames");

        private o() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.d.a.b.AbstractC7812e abstractC7812e, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5196b, abstractC7812e.mo6354d());
            interfaceC5601e.mo22768b(f5197c, abstractC7812e.mo6353c());
            interfaceC5601e.mo22770f(f5198d, abstractC7812e.mo6352b());
        }
    }

    /* renamed from: c6.a$p */
    /* loaded from: classes.dex */
    private static final class p implements InterfaceC5600d {

        /* renamed from: a */
        static final p f5199a = new p();

        /* renamed from: b */
        private static final C5599c f5200b = C5599c.m22762d("pc");

        /* renamed from: c */
        private static final C5599c f5201c = C5599c.m22762d("symbol");

        /* renamed from: d */
        private static final C5599c f5202d = C5599c.m22762d("file");

        /* renamed from: e */
        private static final C5599c f5203e = C5599c.m22762d(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);

        /* renamed from: f */
        private static final C5599c f5204f = C5599c.m22762d("importance");

        private p() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b abstractC7814b, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22767a(f5200b, abstractC7814b.mo6363e());
            interfaceC5601e.mo22770f(f5201c, abstractC7814b.mo6364f());
            interfaceC5601e.mo22770f(f5202d, abstractC7814b.mo6360b());
            interfaceC5601e.mo22767a(f5203e, abstractC7814b.mo6362d());
            interfaceC5601e.mo22768b(f5204f, abstractC7814b.mo6361c());
        }
    }

    /* renamed from: c6.a$q */
    /* loaded from: classes.dex */
    private static final class q implements InterfaceC5600d {

        /* renamed from: a */
        static final q f5205a = new q();

        /* renamed from: b */
        private static final C5599c f5206b = C5599c.m22762d("batteryLevel");

        /* renamed from: c */
        private static final C5599c f5207c = C5599c.m22762d("batteryVelocity");

        /* renamed from: d */
        private static final C5599c f5208d = C5599c.m22762d("proximityOn");

        /* renamed from: e */
        private static final C5599c f5209e = C5599c.m22762d("orientation");

        /* renamed from: f */
        private static final C5599c f5210f = C5599c.m22762d("ramUsed");

        /* renamed from: g */
        private static final C5599c f5211g = C5599c.m22762d("diskUsed");

        private q() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.d.c cVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5206b, cVar.mo6378b());
            interfaceC5601e.mo22768b(f5207c, cVar.mo6379c());
            interfaceC5601e.mo22769c(f5208d, cVar.mo6383g());
            interfaceC5601e.mo22768b(f5209e, cVar.mo6381e());
            interfaceC5601e.mo22767a(f5210f, cVar.mo6382f());
            interfaceC5601e.mo22767a(f5211g, cVar.mo6380d());
        }
    }

    /* renamed from: c6.a$r */
    /* loaded from: classes.dex */
    private static final class r implements InterfaceC5600d {

        /* renamed from: a */
        static final r f5212a = new r();

        /* renamed from: b */
        private static final C5599c f5213b = C5599c.m22762d("timestamp");

        /* renamed from: c */
        private static final C5599c f5214c = C5599c.m22762d("type");

        /* renamed from: d */
        private static final C5599c f5215d = C5599c.m22762d("app");

        /* renamed from: e */
        private static final C5599c f5216e = C5599c.m22762d("device");

        /* renamed from: f */
        private static final C5599c f5217f = C5599c.m22762d("log");

        private r() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.d dVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22767a(f5213b, dVar.mo6291e());
            interfaceC5601e.mo22770f(f5214c, dVar.mo6292f());
            interfaceC5601e.mo22770f(f5215d, dVar.mo6288b());
            interfaceC5601e.mo22770f(f5216e, dVar.mo6289c());
            interfaceC5601e.mo22770f(f5217f, dVar.mo6290d());
        }
    }

    /* renamed from: c6.a$s */
    /* loaded from: classes.dex */
    private static final class s implements InterfaceC5600d {

        /* renamed from: a */
        static final s f5218a = new s();

        /* renamed from: b */
        private static final C5599c f5219b = C5599c.m22762d("content");

        private s() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.d.AbstractC7816d abstractC7816d, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5219b, abstractC7816d.mo6392b());
        }
    }

    /* renamed from: c6.a$t */
    /* loaded from: classes.dex */
    private static final class t implements InterfaceC5600d {

        /* renamed from: a */
        static final t f5220a = new t();

        /* renamed from: b */
        private static final C5599c f5221b = C5599c.m22762d(DispatchConstants.PLATFORM);

        /* renamed from: c */
        private static final C5599c f5222c = C5599c.m22762d("version");

        /* renamed from: d */
        private static final C5599c f5223d = C5599c.m22762d("buildVersion");

        /* renamed from: e */
        private static final C5599c f5224e = C5599c.m22762d("jailbroken");

        private t() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.AbstractC7817e abstractC7817e, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22768b(f5221b, abstractC7817e.mo6397c());
            interfaceC5601e.mo22770f(f5222c, abstractC7817e.mo6398d());
            interfaceC5601e.mo22770f(f5223d, abstractC7817e.mo6396b());
            interfaceC5601e.mo22769c(f5224e, abstractC7817e.mo6399e());
        }
    }

    /* renamed from: c6.a$u */
    /* loaded from: classes.dex */
    private static final class u implements InterfaceC5600d {

        /* renamed from: a */
        static final u f5225a = new u();

        /* renamed from: b */
        private static final C5599c f5226b = C5599c.m22762d("identifier");

        private u() {
        }

        @Override // p235m6.InterfaceC5600d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6142a(AbstractC1366a0.e.f fVar, InterfaceC5601e interfaceC5601e) {
            interfaceC5601e.mo22770f(f5226b, fVar.mo6406b());
        }
    }

    private C1365a() {
    }

    @Override // p248n6.InterfaceC5746a
    /* renamed from: a */
    public void mo6141a(InterfaceC5747b interfaceC5747b) {
        c cVar = c.f5121a;
        interfaceC5747b.mo23161a(AbstractC1366a0.class, cVar);
        interfaceC5747b.mo23161a(C1367b.class, cVar);
        i iVar = i.f5156a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.class, iVar);
        interfaceC5747b.mo23161a(C1374g.class, iVar);
        f fVar = f.f5136a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.a.class, fVar);
        interfaceC5747b.mo23161a(C1375h.class, fVar);
        g gVar = g.f5144a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.a.b.class, gVar);
        interfaceC5747b.mo23161a(AbstractC1376i.class, gVar);
        u uVar = u.f5225a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.f.class, uVar);
        interfaceC5747b.mo23161a(C1389v.class, uVar);
        t tVar = t.f5220a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.AbstractC7817e.class, tVar);
        interfaceC5747b.mo23161a(C1388u.class, tVar);
        h hVar = h.f5146a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.c.class, hVar);
        interfaceC5747b.mo23161a(C1377j.class, hVar);
        r rVar = r.f5212a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.d.class, rVar);
        interfaceC5747b.mo23161a(C1378k.class, rVar);
        j jVar = j.f5168a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.d.a.class, jVar);
        interfaceC5747b.mo23161a(C1379l.class, jVar);
        l lVar = l.f5179a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.d.a.b.class, lVar);
        interfaceC5747b.mo23161a(C1380m.class, lVar);
        o oVar = o.f5195a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.d.a.b.AbstractC7812e.class, oVar);
        interfaceC5747b.mo23161a(C1384q.class, oVar);
        p pVar = p.f5199a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.class, pVar);
        interfaceC5747b.mo23161a(C1385r.class, pVar);
        m mVar = m.f5185a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.d.a.b.c.class, mVar);
        interfaceC5747b.mo23161a(C1382o.class, mVar);
        a aVar = a.f5109a;
        interfaceC5747b.mo23161a(AbstractC1366a0.a.class, aVar);
        interfaceC5747b.mo23161a(C1369c.class, aVar);
        n nVar = n.f5191a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.d.a.b.AbstractC7810d.class, nVar);
        interfaceC5747b.mo23161a(C1383p.class, nVar);
        k kVar = k.f5174a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.d.a.b.AbstractC7806a.class, kVar);
        interfaceC5747b.mo23161a(C1381n.class, kVar);
        b bVar = b.f5118a;
        interfaceC5747b.mo23161a(AbstractC1366a0.c.class, bVar);
        interfaceC5747b.mo23161a(C1371d.class, bVar);
        q qVar = q.f5205a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.d.c.class, qVar);
        interfaceC5747b.mo23161a(C1386s.class, qVar);
        s sVar = s.f5218a;
        interfaceC5747b.mo23161a(AbstractC1366a0.e.d.AbstractC7816d.class, sVar);
        interfaceC5747b.mo23161a(C1387t.class, sVar);
        d dVar = d.f5130a;
        interfaceC5747b.mo23161a(AbstractC1366a0.d.class, dVar);
        interfaceC5747b.mo23161a(C1372e.class, dVar);
        e eVar = e.f5133a;
        interfaceC5747b.mo23161a(AbstractC1366a0.d.b.class, eVar);
        interfaceC5747b.mo23161a(C1373f.class, eVar);
    }
}
