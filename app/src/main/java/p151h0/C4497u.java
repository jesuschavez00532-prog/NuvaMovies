package p151h0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h0.u */
/* loaded from: classes.dex */
public class C4497u {

    /* renamed from: b */
    public View f19464b;

    /* renamed from: a */
    public final Map f19463a = new HashMap();

    /* renamed from: c */
    final ArrayList f19465c = new ArrayList();

    public C4497u(View view) {
        this.f19464b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4497u) {
            C4497u c4497u = (C4497u) obj;
            if (this.f19464b == c4497u.f19464b && this.f19463a.equals(c4497u.f19463a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f19464b.hashCode() * 31) + this.f19463a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f19464b + "\n") + "    values:";
        for (String str2 : this.f19463a.keySet()) {
            str = str + "    " + str2 + ": " + this.f19463a.get(str2) + "\n";
        }
        return str;
    }
}
