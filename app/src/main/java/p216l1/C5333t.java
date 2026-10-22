package p216l1;

import com.bumptech.glide.load.data.InterfaceC1605e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p109e2.AbstractC4121k;
import p184j1.C4977h;
import p216l1.C5322i;
import p373w.InterfaceC7339d;

/* renamed from: l1.t */
/* loaded from: classes.dex */
public class C5333t {

    /* renamed from: a */
    private final Class f21834a;

    /* renamed from: b */
    private final InterfaceC7339d f21835b;

    /* renamed from: c */
    private final List f21836c;

    /* renamed from: d */
    private final String f21837d;

    public C5333t(Class cls, Class cls2, Class cls3, List list, InterfaceC7339d interfaceC7339d) {
        this.f21834a = cls;
        this.f21835b = interfaceC7339d;
        this.f21836c = (List) AbstractC4121k.m17225c(list);
        this.f21837d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC5335v m21598b(InterfaceC1605e interfaceC1605e, C4977h c4977h, int i10, int i11, C5322i.a aVar, List list) {
        int size = this.f21836c.size();
        InterfaceC5335v interfaceC5335v = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                interfaceC5335v = ((C5322i) this.f21836c.get(i12)).m21530a(interfaceC1605e, i10, i11, c4977h, aVar);
            } catch (C5330q e10) {
                list.add(e10);
            }
            if (interfaceC5335v != null) {
                break;
            }
        }
        if (interfaceC5335v != null) {
            return interfaceC5335v;
        }
        throw new C5330q(this.f21837d, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC5335v m21599a(InterfaceC1605e interfaceC1605e, C4977h c4977h, int i10, int i11, C5322i.a aVar) {
        List list = (List) AbstractC4121k.m17226d(this.f21835b.mo16818b());
        try {
            return m21598b(interfaceC1605e, c4977h, i10, i11, aVar, list);
        } finally {
            this.f21835b.mo16817a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f21836c.toArray()) + '}';
    }
}
