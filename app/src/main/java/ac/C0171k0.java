package ac;

import be.C1328x;
import com.request.result.ConfigData;
import com.request.result.ConfigResult;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p030bc.C1224f;
import p301qb.InterfaceC6378d0;
import p317rb.AbstractC6567a;

/* renamed from: ac.k0 */
/* loaded from: classes2.dex */
public final class C0171k0 extends AbstractC0166j {

    /* renamed from: ac.k0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m627a(ConfigResult configResult) {
            String config;
            if (configResult.getCode() == 200) {
                ConfigData data = configResult.getData();
                if (data != null && (config = data.getConfig()) != null) {
                    ((InterfaceC6378d0) C0171k0.this.m618a()).mo20390L4(config);
                    return;
                }
                return;
            }
            ((InterfaceC6378d0) C0171k0.this.m618a()).mo20393c3(configResult.getCode(), "");
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m627a((ConfigResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ac.k0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m628a(Throwable th) {
            InterfaceC6378d0 interfaceC6378d0 = (InterfaceC6378d0) C0171k0.this.m618a();
            String message = th.getMessage();
            AbstractC5868k.m23671c(message);
            interfaceC6378d0.mo20393c3(0, message);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m628a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171k0(InterfaceC6378d0 interfaceC6378d0) {
        super(interfaceC6378d0);
        AbstractC5868k.m23674f(interfaceC6378d0, "view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m624e(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m625f(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: d */
    public final void m626d() {
        Observable m25631a = AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5550B(), ((InterfaceC6378d0) m618a()).mo523N3());
        final a aVar = new a();
        Consumer consumer = new Consumer() { // from class: ac.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C0171k0.m624e(InterfaceC5660l.this, obj);
            }
        };
        final b bVar = new b();
        m25631a.subscribe(consumer, new Consumer() { // from class: ac.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C0171k0.m625f(InterfaceC5660l.this, obj);
            }
        });
    }
}
