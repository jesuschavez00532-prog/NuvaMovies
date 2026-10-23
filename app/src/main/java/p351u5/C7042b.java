package p351u5;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2201y2;
import com.google.firebase.analytics.connector.internal.AbstractC2615b;
import com.google.firebase.analytics.connector.internal.C2617d;
import com.google.firebase.analytics.connector.internal.C2619f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p006a5.C0061a;
import p219l4.AbstractC5391n;
import p297q6.AbstractC6346a;
import p297q6.InterfaceC6347b;
import p297q6.InterfaceC6349d;
import p337t5.AbstractC6910a;
import p337t5.C6913d;
import p351u5.InterfaceC7041a;

/* renamed from: u5.b */
/* loaded from: classes.dex */
public class C7042b implements InterfaceC7041a {

    /* renamed from: c */
    private static volatile InterfaceC7041a f26411c;

    /* renamed from: a */
    final C0061a f26412a;

    /* renamed from: b */
    final Map f26413b;

    /* renamed from: u5.b$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC7041a.a {

        /* renamed from: a */
        final /* synthetic */ String f26414a;

        a(String str) {
            this.f26414a = str;
        }
    }

    C7042b(C0061a c0061a) {
        AbstractC5391n.m21783i(c0061a);
        this.f26412a = c0061a;
        this.f26413b = new ConcurrentHashMap();
    }

    /* renamed from: d */
    public static InterfaceC7041a m27144d(C6913d c6913d, Context context, InterfaceC6349d interfaceC6349d) {
        AbstractC5391n.m21783i(c6913d);
        AbstractC5391n.m21783i(context);
        AbstractC5391n.m21783i(interfaceC6349d);
        AbstractC5391n.m21783i(context.getApplicationContext());
        if (f26411c == null) {
            synchronized (C7042b.class) {
                if (f26411c == null) {
                    Bundle bundle = new Bundle(1);
                    if (c6913d.m26872t()) {
                        interfaceC6349d.mo25128a(AbstractC6910a.class, new Executor() { // from class: u5.c
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC6347b() { // from class: u5.d
                            @Override // p297q6.InterfaceC6347b
                            /* renamed from: a */
                            public final void mo11341a(AbstractC6346a abstractC6346a) {
                                C7042b.m27145e(abstractC6346a);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", c6913d.m26871s());
                    }
                    f26411c = new C7042b(C2201y2.m9206s(context, null, null, null, bundle).m9221p());
                }
            }
        }
        return f26411c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ void m27145e(AbstractC6346a abstractC6346a) {
        throw null;
    }

    /* renamed from: f */
    private final boolean m27146f(String str) {
        if (!str.isEmpty() && this.f26413b.containsKey(str) && this.f26413b.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // p351u5.InterfaceC7041a
    /* renamed from: a */
    public InterfaceC7041a.a mo27140a(String str, InterfaceC7041a.b bVar) {
        Object c2619f = null;
        AbstractC5391n.m21783i(bVar);
        if (!AbstractC2615b.m10847f(str) || m27146f(str)) {
            return null;
        }
        C0061a c0061a = this.f26412a;
        if ("fiam".equals(str)) {
            c2619f = new C2617d(c0061a, bVar);
        } else if (!"crash".equals(str) && !"clx".equals(str)) {
            c2619f = null;
        } else {
            c2619f = new C2619f(c0061a, bVar);
        }
        if (c2619f == null) {
            return null;
        }
        this.f26413b.put(str, c2619f);
        return new a(str);
    }

    @Override // p351u5.InterfaceC7041a
    /* renamed from: b */
    public void mo27141b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!AbstractC2615b.m10847f(str) || !AbstractC2615b.m10845d(str2, bundle) || !AbstractC2615b.m10844c(str, str2, bundle)) {
            return;
        }
        AbstractC2615b.m10843b(str, str2, bundle);
        this.f26412a.m216a(str, str2, bundle);
    }

    @Override // p351u5.InterfaceC7041a
    /* renamed from: c */
    public void mo27142c(String str, String str2, Object obj) {
        if (!AbstractC2615b.m10847f(str) || !AbstractC2615b.m10848g(str, str2)) {
            return;
        }
        this.f26412a.m218c(str, str2, obj);
    }
}
