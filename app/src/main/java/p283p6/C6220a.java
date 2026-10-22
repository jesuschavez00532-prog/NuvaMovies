package p283p6;

import p283p6.InterfaceC6223d;

/* renamed from: p6.a */
/* loaded from: classes.dex */
public final class C6220a {

    /* renamed from: a */
    private int f24413a;

    /* renamed from: b */
    private InterfaceC6223d.a f24414b = InterfaceC6223d.a.DEFAULT;

    /* renamed from: p6.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC6223d {

        /* renamed from: a */
        private final int f24415a;

        /* renamed from: b */
        private final InterfaceC6223d.a f24416b;

        a(int i10, InterfaceC6223d.a aVar) {
            this.f24415a = i10;
            this.f24416b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return InterfaceC6223d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC6223d)) {
                return false;
            }
            InterfaceC6223d interfaceC6223d = (InterfaceC6223d) obj;
            if (this.f24415a == interfaceC6223d.tag() && this.f24416b.equals(interfaceC6223d.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f24415a) + (this.f24416b.hashCode() ^ 2041407134);
        }

        @Override // p283p6.InterfaceC6223d
        public InterfaceC6223d.a intEncoding() {
            return this.f24416b;
        }

        @Override // p283p6.InterfaceC6223d
        public int tag() {
            return this.f24415a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f24415a + "intEncoding=" + this.f24416b + ')';
        }
    }

    /* renamed from: b */
    public static C6220a m24809b() {
        return new C6220a();
    }

    /* renamed from: a */
    public InterfaceC6223d m24810a() {
        return new a(this.f24413a, this.f24414b);
    }

    /* renamed from: c */
    public C6220a m24811c(int i10) {
        this.f24413a = i10;
        return this;
    }
}
