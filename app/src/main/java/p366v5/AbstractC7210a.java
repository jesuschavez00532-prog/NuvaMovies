package p366v5;

import java.util.Set;
import p338t6.InterfaceC6922b;

/* renamed from: v5.a */
/* loaded from: classes.dex */
abstract class AbstractC7210a implements InterfaceC7218e {
    @Override // p366v5.InterfaceC7218e
    /* renamed from: a */
    public Object mo27905a(Class cls) {
        InterfaceC6922b mo27943b = mo27943b(cls);
        if (mo27943b == null) {
            return null;
        }
        return mo27943b.get();
    }

    @Override // p366v5.InterfaceC7218e
    /* renamed from: d */
    public Set mo27906d(Class cls) {
        return (Set) mo27944c(cls).get();
    }
}
