package ye;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: ye.o */
/* loaded from: classes3.dex */
public class C7721o {

    /* renamed from: a */
    final Method f28385a;

    /* renamed from: b */
    final ThreadMode f28386b;

    /* renamed from: c */
    final Class f28387c;

    /* renamed from: d */
    final int f28388d;

    /* renamed from: e */
    final boolean f28389e;

    /* renamed from: f */
    String f28390f;

    public C7721o(Method method, Class cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f28385a = method;
        this.f28386b = threadMode;
        this.f28387c = cls;
        this.f28388d = i10;
        this.f28389e = z10;
    }

    /* renamed from: a */
    private synchronized void m29825a() {
        if (this.f28390f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f28385a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f28385a.getName());
            sb2.append('(');
            sb2.append(this.f28387c.getName());
            this.f28390f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7721o) {
            m29825a();
            C7721o c7721o = (C7721o) obj;
            c7721o.m29825a();
            return this.f28390f.equals(c7721o.f28390f);
        }
        return false;
    }

    public int hashCode() {
        return this.f28385a.hashCode();
    }
}
