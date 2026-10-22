package nc;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ne.AbstractC5868k;

/* renamed from: nc.a */
/* loaded from: classes.dex */
public abstract class AbstractC5837a {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final String m23622c(List list, AbstractC5838b abstractC5838b) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb2.append(((AbstractC5838b) it.next()).m23627d());
                sb2.append("-->");
            }
            if (abstractC5838b != null) {
                sb2.append(abstractC5838b.m23627d());
            }
            String sb3 = sb2.toString();
            AbstractC5868k.m23673e(sb3, "stringBuilder.toString()");
            return sb3;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m23623d(Set set) {
        if (set != null && (!set.isEmpty())) {
            return true;
        }
        return false;
    }
}
