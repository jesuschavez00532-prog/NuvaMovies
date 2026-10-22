package p027b7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: b7.d */
/* loaded from: classes.dex */
public class C1141d {

    /* renamed from: b */
    private static volatile C1141d f4470b;

    /* renamed from: a */
    private final Set f4471a = new HashSet();

    C1141d() {
    }

    /* renamed from: a */
    public static C1141d m5197a() {
        C1141d c1141d = f4470b;
        if (c1141d == null) {
            synchronized (C1141d.class) {
                c1141d = f4470b;
                if (c1141d == null) {
                    c1141d = new C1141d();
                    f4470b = c1141d;
                }
            }
        }
        return c1141d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Set m5198b() {
        Set unmodifiableSet;
        synchronized (this.f4471a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f4471a);
        }
        return unmodifiableSet;
    }
}
