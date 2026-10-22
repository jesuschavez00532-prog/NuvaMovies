package p344te;

import java.util.Iterator;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: te.h */
/* loaded from: classes3.dex */
public abstract class AbstractC6948h extends AbstractC6947g {

    /* renamed from: te.h$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC6942b {

        /* renamed from: a */
        final /* synthetic */ Iterator f26317a;

        public a(Iterator it) {
            this.f26317a = it;
        }

        @Override // p344te.InterfaceC6942b
        public Iterator iterator() {
            return this.f26317a;
        }
    }

    /* renamed from: c */
    public static InterfaceC6942b m26989c(Iterator it) {
        AbstractC5868k.m23674f(it, "<this>");
        return m26990d(new a(it));
    }

    /* renamed from: d */
    public static final InterfaceC6942b m26990d(InterfaceC6942b interfaceC6942b) {
        AbstractC5868k.m23674f(interfaceC6942b, "<this>");
        if (!(interfaceC6942b instanceof C6941a)) {
            return new C6941a(interfaceC6942b);
        }
        return interfaceC6942b;
    }
}
