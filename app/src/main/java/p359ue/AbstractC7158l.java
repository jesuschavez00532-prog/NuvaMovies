package p359ue;

import me.InterfaceC5660l;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ue.l */
/* loaded from: classes.dex */
public abstract class AbstractC7158l {
    /* renamed from: a */
    public static void m27714a(Appendable appendable, Object obj, InterfaceC5660l interfaceC5660l) {
        boolean z10;
        AbstractC5868k.m23674f(appendable, "<this>");
        if (interfaceC5660l != null) {
            appendable.append((CharSequence) interfaceC5660l.mo542f(obj));
            return;
        }
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof CharSequence;
        }
        if (z10) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
