package p278p1;

import android.util.Base64;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p093d2.C3923b;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p278p1.InterfaceC6175o;

/* renamed from: p1.e */
/* loaded from: classes.dex */
public final class C6165e implements InterfaceC6175o {

    /* renamed from: a */
    private final a f24236a;

    /* renamed from: p1.e$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Class mo24613a();

        /* renamed from: b */
        Object mo24614b(String str);

        void close(Object obj);
    }

    /* renamed from: p1.e$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC1604d {

        /* renamed from: a */
        private final String f24237a;

        /* renamed from: b */
        private final a f24238b;

        /* renamed from: c */
        private Object f24239c;

        b(String str, a aVar) {
            this.f24237a = str;
            this.f24238b = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: a */
        public Class mo7418a() {
            return this.f24238b.mo24613a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: b */
        public void mo7423b() {
            try {
                this.f24238b.close(this.f24239c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: d */
        public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
            try {
                Object mo24614b = this.f24238b.mo24614b(this.f24237a);
                this.f24239c = mo24614b;
                aVar.mo7431e(mo24614b);
            } catch (IllegalArgumentException e10) {
                aVar.mo7430c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public EnumC4970a getDataSource() {
            return EnumC4970a.LOCAL;
        }
    }

    /* renamed from: p1.e$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC6176p {

        /* renamed from: a */
        private final a f24240a = new a();

        /* renamed from: p1.e$c$a */
        /* loaded from: classes.dex */
        class a implements a {
            a() {
            }

            @Override // p278p1.C6165e.a
            /* renamed from: a */
            public Class mo24613a() {
                return InputStream.class;
            }

            @Override // p278p1.C6165e.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(InputStream inputStream) {
                inputStream.close();
            }

            @Override // p278p1.C6165e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream mo24614b(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6165e(this.f24240a);
        }
    }

    public C6165e(a aVar) {
        this.f24236a = aVar;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: a */
    public boolean mo7342a(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: b */
    public InterfaceC6175o.a mo7343b(Object obj, int i10, int i11, C4977h c4977h) {
        return new InterfaceC6175o.a(new C3923b(obj), new b(obj.toString(), this.f24236a));
    }
}
