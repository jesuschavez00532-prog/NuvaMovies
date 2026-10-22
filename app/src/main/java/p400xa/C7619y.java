package p400xa;

import android.content.Context;
import android.content.Intent;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p170i2.C4842a;

/* renamed from: xa.y */
/* loaded from: classes2.dex */
public final class C7619y {

    /* renamed from: a */
    public static final C7619y f28056a = new C7619y();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.y$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5660l f28057a;

        /* renamed from: b */
        final /* synthetic */ Intent f28058b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5660l interfaceC5660l, Intent intent) {
            super(0);
            this.f28057a = interfaceC5660l;
            this.f28058b = intent;
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return (Intent) this.f28057a.mo542f(this.f28058b);
        }
    }

    /* renamed from: xa.y$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ Intent f28059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Intent intent) {
            super(0);
            this.f28059a = intent;
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return this.f28059a;
        }
    }

    private C7619y() {
    }

    /* renamed from: d */
    public static /* synthetic */ void m29367d(C7619y c7619y, Context context, Class cls, Boolean bool, InterfaceC5660l interfaceC5660l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = Boolean.TRUE;
        }
        c7619y.m29370c(context, cls, bool, interfaceC5660l);
    }

    /* renamed from: a */
    public final void m29368a(Context context, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(context, "<this>");
        AbstractC5868k.m23674f(interfaceC5642a, "intent");
        try {
            context.startActivity((Intent) interfaceC5642a.invoke());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m29369b(Context context, Class cls) {
        AbstractC5868k.m23674f(context, "<this>");
        AbstractC5868k.m23674f(cls, "clazz");
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.setFlags(262144);
        m29368a(context, new b(intent));
    }

    /* renamed from: c */
    public final void m29370c(Context context, Class cls, Boolean bool, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(context, "<this>");
        AbstractC5868k.m23674f(cls, "clazz");
        AbstractC5868k.m23674f(interfaceC5660l, "addExtra");
        Intent intent = new Intent(context, (Class<?>) cls);
        if (context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") && C4842a.f20329a.m19920a().mo19968q() && AbstractC5868k.m23669a(bool, Boolean.TRUE)) {
            intent.setFlags(262144);
        }
        m29368a(context, new a(interfaceC5660l, intent));
    }
}
