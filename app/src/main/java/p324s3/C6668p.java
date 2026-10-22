package p324s3;

import java.util.Set;
import p294q3.C6335b;
import p294q3.InterfaceC6338e;
import p294q3.InterfaceC6339f;
import p294q3.InterfaceC6340g;

/* renamed from: s3.p */
/* loaded from: classes.dex */
final class C6668p implements InterfaceC6340g {

    /* renamed from: a */
    private final Set f25578a;

    /* renamed from: b */
    private final AbstractC6667o f25579b;

    /* renamed from: c */
    private final InterfaceC6671s f25580c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6668p(Set set, AbstractC6667o abstractC6667o, InterfaceC6671s interfaceC6671s) {
        this.f25578a = set;
        this.f25579b = abstractC6667o;
        this.f25580c = interfaceC6671s;
    }

    @Override // p294q3.InterfaceC6340g
    /* renamed from: a */
    public InterfaceC6339f mo25123a(String str, Class cls, C6335b c6335b, InterfaceC6338e interfaceC6338e) {
        if (this.f25578a.contains(c6335b)) {
            return new C6670r(this.f25579b, str, c6335b, interfaceC6338e, this.f25580c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c6335b, this.f25578a));
    }
}
