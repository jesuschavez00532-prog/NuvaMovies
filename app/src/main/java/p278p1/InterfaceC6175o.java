package p278p1;

import com.bumptech.glide.load.data.InterfaceC1604d;
import java.util.Collections;
import java.util.List;
import p109e2.AbstractC4121k;
import p184j1.C4977h;
import p184j1.InterfaceC4975f;

/* renamed from: p1.o */
/* loaded from: classes.dex */
public interface InterfaceC6175o {

    /* renamed from: p1.o$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final InterfaceC4975f f24285a;

        /* renamed from: b */
        public final List f24286b;

        /* renamed from: c */
        public final InterfaceC1604d f24287c;

        public a(InterfaceC4975f interfaceC4975f, InterfaceC1604d interfaceC1604d) {
            this(interfaceC4975f, Collections.emptyList(), interfaceC1604d);
        }

        public a(InterfaceC4975f interfaceC4975f, List list, InterfaceC1604d interfaceC1604d) {
            this.f24285a = (InterfaceC4975f) AbstractC4121k.m17226d(interfaceC4975f);
            this.f24286b = (List) AbstractC4121k.m17226d(list);
            this.f24287c = (InterfaceC1604d) AbstractC4121k.m17226d(interfaceC1604d);
        }
    }

    /* renamed from: a */
    boolean mo7342a(Object obj);

    /* renamed from: b */
    a mo7343b(Object obj, int i10, int i11, C4977h c4977h);
}
