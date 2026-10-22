package p216l1;

import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC1605e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p109e2.AbstractC4121k;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p373w.InterfaceC7339d;
import p391x1.InterfaceC7488e;

/* renamed from: l1.i */
/* loaded from: classes.dex */
public class C5322i {

    /* renamed from: a */
    private final Class f21738a;

    /* renamed from: b */
    private final List f21739b;

    /* renamed from: c */
    private final InterfaceC7488e f21740c;

    /* renamed from: d */
    private final InterfaceC7339d f21741d;

    /* renamed from: e */
    private final String f21742e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.i$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        InterfaceC5335v mo21515a(InterfaceC5335v interfaceC5335v);
    }

    public C5322i(Class cls, Class cls2, Class cls3, List list, InterfaceC7488e interfaceC7488e, InterfaceC7339d interfaceC7339d) {
        this.f21738a = cls;
        this.f21739b = list;
        this.f21740c = interfaceC7488e;
        this.f21741d = interfaceC7339d;
        this.f21742e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC5335v m21528b(InterfaceC1605e interfaceC1605e, int i10, int i11, C4977h c4977h) {
        List list = (List) AbstractC4121k.m17226d(this.f21741d.mo16818b());
        try {
            return m21529c(interfaceC1605e, i10, i11, c4977h, list);
        } finally {
            this.f21741d.mo16817a(list);
        }
    }

    /* renamed from: c */
    private InterfaceC5335v m21529c(InterfaceC1605e interfaceC1605e, int i10, int i11, C4977h c4977h, List list) {
        int size = this.f21739b.size();
        InterfaceC5335v interfaceC5335v = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC4979j interfaceC4979j = (InterfaceC4979j) this.f21739b.get(i12);
            try {
                if (interfaceC4979j.mo20330b(interfaceC1605e.mo7412a(), c4977h)) {
                    interfaceC5335v = interfaceC4979j.mo20329a(interfaceC1605e.mo7412a(), i10, i11, c4977h);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC4979j, e10);
                }
                list.add(e10);
            }
            if (interfaceC5335v != null) {
                break;
            }
        }
        if (interfaceC5335v != null) {
            return interfaceC5335v;
        }
        throw new C5330q(this.f21742e, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC5335v m21530a(InterfaceC1605e interfaceC1605e, int i10, int i11, C4977h c4977h, a aVar) {
        return this.f21740c.mo28680a(aVar.mo21515a(m21528b(interfaceC1605e, i10, i11, c4977h)), c4977h);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f21738a + ", decoders=" + this.f21739b + ", transcoder=" + this.f21740c + '}';
    }
}
