package p278p1;

import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p093d2.C3923b;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p278p1.InterfaceC6175o;

/* renamed from: p1.b */
/* loaded from: classes.dex */
public class C6162b implements InterfaceC6175o {

    /* renamed from: a */
    private final b f24230a;

    /* renamed from: p1.b$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC6176p {

        /* renamed from: p1.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C7857a implements b {
            C7857a() {
            }

            @Override // p278p1.C6162b.b
            /* renamed from: a */
            public Class mo24606a() {
                return ByteBuffer.class;
            }

            @Override // p278p1.C6162b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo24607b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6162b(new C7857a());
        }
    }

    /* renamed from: p1.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        Class mo24606a();

        /* renamed from: b */
        Object mo24607b(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.b$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC1604d {

        /* renamed from: a */
        private final byte[] f24232a;

        /* renamed from: b */
        private final b f24233b;

        c(byte[] bArr, b bVar) {
            this.f24232a = bArr;
            this.f24233b = bVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: a */
        public Class mo7418a() {
            return this.f24233b.mo24606a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: b */
        public void mo7423b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: d */
        public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
            aVar.mo7431e(this.f24233b.mo24607b(this.f24232a));
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public EnumC4970a getDataSource() {
            return EnumC4970a.LOCAL;
        }
    }

    /* renamed from: p1.b$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC6176p {

        /* renamed from: p1.b$d$a */
        /* loaded from: classes.dex */
        class a implements b {
            a() {
            }

            @Override // p278p1.C6162b.b
            /* renamed from: a */
            public Class mo24606a() {
                return InputStream.class;
            }

            @Override // p278p1.C6162b.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo24607b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6162b(new a());
        }
    }

    public C6162b(b bVar) {
        this.f24230a = bVar;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(byte[] bArr, int i10, int i11, C4977h c4977h) {
        return new InterfaceC6175o.a(new C3923b(bArr), new c(bArr, this.f24230a));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(byte[] bArr) {
        return true;
    }
}
