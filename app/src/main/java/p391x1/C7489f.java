package p391x1;

import java.util.ArrayList;
import java.util.List;

/* renamed from: x1.f */
/* loaded from: classes.dex */
public class C7489f {

    /* renamed from: a */
    private final List f27559a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final Class f27560a;

        /* renamed from: b */
        final Class f27561b;

        /* renamed from: c */
        final InterfaceC7488e f27562c;

        a(Class cls, Class cls2, InterfaceC7488e interfaceC7488e) {
            this.f27560a = cls;
            this.f27561b = cls2;
            this.f27562c = interfaceC7488e;
        }

        /* renamed from: a */
        public boolean m28685a(Class cls, Class cls2) {
            if (this.f27560a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f27561b)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public synchronized InterfaceC7488e m28682a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C7490g.m28686b();
        }
        for (a aVar : this.f27559a) {
            if (aVar.m28685a(cls, cls2)) {
                return aVar.f27562c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized List m28683b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f27559a) {
            if (aVar.m28685a(cls, cls2) && !arrayList.contains(aVar.f27561b)) {
                arrayList.add(aVar.f27561b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized void m28684c(Class cls, Class cls2, InterfaceC7488e interfaceC7488e) {
        this.f27559a.add(new a(cls, cls2, interfaceC7488e));
    }
}
