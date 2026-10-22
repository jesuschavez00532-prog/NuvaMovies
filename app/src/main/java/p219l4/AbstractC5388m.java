package p219l4;

import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: l4.m */
/* loaded from: classes.dex */
public abstract class AbstractC5388m {

    /* renamed from: l4.m$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List f22020a;

        /* renamed from: b */
        private final Object f22021b;

        /* synthetic */ a(Object obj, AbstractC5403r0 abstractC5403r0) {
            AbstractC5391n.m21783i(obj);
            this.f22021b = obj;
            this.f22020a = new ArrayList();
        }

        /* renamed from: a */
        public a m21774a(String str, Object obj) {
            List list = this.f22020a;
            AbstractC5391n.m21783i(str);
            list.add(str + Operator.Operation.EQUALS + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f22021b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f22020a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f22020a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static boolean m21771a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m21772b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static a m21773c(Object obj) {
        return new a(obj, null);
    }
}
