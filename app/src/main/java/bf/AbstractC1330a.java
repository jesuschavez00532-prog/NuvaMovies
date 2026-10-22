package bf;

import android.content.Context;
import be.C1328x;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;

/* renamed from: bf.a */
/* loaded from: classes3.dex */
public abstract class AbstractC1330a {

    /* renamed from: a */
    private static final InterfaceC5660l f5001a = a.f5002a;

    /* renamed from: bf.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f5002a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m5983a(Throwable th) {
            AbstractC5868k.m23675g(th, "throwable");
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5983a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: bf.a$b */
    /* loaded from: classes3.dex */
    static final class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f5003a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5660l f5004b;

        b(Context context, InterfaceC5660l interfaceC5660l) {
            this.f5003a = context;
            this.f5004b = interfaceC5660l;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5004b.mo542f(this.f5003a);
        }
    }

    /* renamed from: a */
    public static final void m5982a(Context context, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23675g(context, "$receiver");
        AbstractC5868k.m23675g(interfaceC5660l, "f");
        C1331b c1331b = C1331b.f5007c;
        if (AbstractC5868k.m23669a(c1331b.m5985b(), Thread.currentThread())) {
            interfaceC5660l.mo542f(context);
        } else {
            c1331b.m5984a().post(new b(context, interfaceC5660l));
        }
    }
}
