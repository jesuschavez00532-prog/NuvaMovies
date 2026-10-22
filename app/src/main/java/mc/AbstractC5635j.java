package mc;

import android.util.Log;
import be.C1328x;
import com.lzy.okgo.model.Progress;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;

/* renamed from: mc.j */
/* loaded from: classes.dex */
public abstract class AbstractC5635j {

    /* renamed from: a */
    private static boolean f22702a = false;

    /* renamed from: b */
    private static boolean f22703b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mc.j$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f22704a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final void m22865a() {
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22865a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m22859a() {
        return f22702a;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m22860b(boolean z10) {
        f22702a = z10;
    }

    /* renamed from: c */
    public static final void m22861c(String str, String str2, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(str, Progress.TAG);
        AbstractC5868k.m23674f(str2, "msg");
        AbstractC5868k.m23674f(interfaceC5642a, "block");
        if (C5634i.m22853o()) {
            Log.d("TheRouter::" + str, str2);
            interfaceC5642a.invoke();
            return;
        }
        C5634i.m22845g().mo2391h("TheRouter::" + str, str2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m22862d(String str, String str2, InterfaceC5642a interfaceC5642a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC5642a = a.f22704a;
        }
        m22861c(str, str2, interfaceC5642a);
    }

    /* renamed from: e */
    public static final boolean m22863e() {
        return f22703b;
    }

    /* renamed from: f */
    public static final void m22864f(boolean z10, String str, String str2) {
        AbstractC5868k.m23674f(str, Progress.TAG);
        AbstractC5868k.m23674f(str2, "msg");
        if (!z10) {
            if (!C5634i.m22853o()) {
                C5634i.m22845g().mo2391h("TheRouter::" + str, str2);
                return;
            }
            throw new IllegalArgumentException("TheRouter::" + str + "::" + str2);
        }
    }
}
