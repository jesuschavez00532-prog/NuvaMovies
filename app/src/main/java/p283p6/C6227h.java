package p283p6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p235m6.C5598b;
import p235m6.InterfaceC5600d;
import p235m6.InterfaceC5601e;
import p248n6.InterfaceC5746a;
import p248n6.InterfaceC5747b;
import p283p6.C6227h;

/* renamed from: p6.h */
/* loaded from: classes.dex */
public class C6227h {

    /* renamed from: a */
    private final Map f24432a;

    /* renamed from: b */
    private final Map f24433b;

    /* renamed from: c */
    private final InterfaceC5600d f24434c;

    /* renamed from: p6.h$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC5747b {

        /* renamed from: d */
        private static final InterfaceC5600d f24435d = new InterfaceC5600d() { // from class: p6.g
            @Override // p235m6.InterfaceC5600d
            /* renamed from: a */
            public final void mo6142a(Object obj, Object obj2) {
                C6227h.a.m24838e(obj, (InterfaceC5601e) obj2);
            }
        };

        /* renamed from: a */
        private final Map f24436a = new HashMap();

        /* renamed from: b */
        private final Map f24437b = new HashMap();

        /* renamed from: c */
        private InterfaceC5600d f24438c = f24435d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m24838e(Object obj, InterfaceC5601e interfaceC5601e) {
            throw new C5598b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C6227h m24839c() {
            return new C6227h(new HashMap(this.f24436a), new HashMap(this.f24437b), this.f24438c);
        }

        /* renamed from: d */
        public a m24840d(InterfaceC5746a interfaceC5746a) {
            interfaceC5746a.mo6141a(this);
            return this;
        }

        @Override // p248n6.InterfaceC5747b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo23161a(Class cls, InterfaceC5600d interfaceC5600d) {
            this.f24436a.put(cls, interfaceC5600d);
            this.f24437b.remove(cls);
            return this;
        }
    }

    C6227h(Map map, Map map2, InterfaceC5600d interfaceC5600d) {
        this.f24432a = map;
        this.f24433b = map2;
        this.f24434c = interfaceC5600d;
    }

    /* renamed from: a */
    public static a m24834a() {
        return new a();
    }

    /* renamed from: b */
    public void m24835b(Object obj, OutputStream outputStream) {
        new C6225f(outputStream, this.f24432a, this.f24433b, this.f24434c).m24833s(obj);
    }

    /* renamed from: c */
    public byte[] m24836c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m24835b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
