package p278p1;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p093d2.C3923b;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p278p1.InterfaceC6175o;

/* renamed from: p1.h */
/* loaded from: classes.dex */
public class C6168h implements InterfaceC6175o {

    /* renamed from: a */
    private final d f24252a;

    /* renamed from: p1.h$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC6176p {

        /* renamed from: a */
        private final d f24253a;

        public a(d dVar) {
            this.f24253a = dVar;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public final void mo7347c() throws java.io.IOException {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public final InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6168h(this.f24253a);
        }
    }

    /* renamed from: p1.h$b */
    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: p1.h$b$a */
        /* loaded from: classes.dex */
        class a implements d {
            a() {
            }

            @Override // p278p1.C6168h.d
            /* renamed from: a */
            public Class mo24633a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p278p1.C6168h.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(ParcelFileDescriptor parcelFileDescriptor) throws java.io.IOException {
                parcelFileDescriptor.close();
            }

            @Override // p278p1.C6168h.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo24634b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1.h$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC1604d {

        /* renamed from: a */
        private final File f24254a;

        /* renamed from: b */
        private final d f24255b;

        /* renamed from: c */
        private Object f24256c;

        c(File file, d dVar) {
            this.f24254a = file;
            this.f24255b = dVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: a */
        public Class mo7418a() {
            return this.f24255b.mo24633a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: b */
        public void mo7423b() {
            Object obj = this.f24256c;
            if (obj != null) {
                try {
                    this.f24255b.close(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        /* renamed from: d */
        public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
            try {
                Object mo24634b = this.f24255b.mo24634b(this.f24254a);
                this.f24256c = mo24634b;
                aVar.mo7431e(mo24634b);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.mo7430c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1604d
        public EnumC4970a getDataSource() {
            return EnumC4970a.LOCAL;
        }
    }

    /* renamed from: p1.h$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        Class mo24633a();

        /* renamed from: b */
        Object mo24634b(File file);

        void close(Object obj);
    }

    /* renamed from: p1.h$e */
    /* loaded from: classes.dex */
    public static class e extends a {

        /* renamed from: p1.h$e$a */
        /* loaded from: classes.dex */
        class a implements d {
            a() {
            }

            @Override // p278p1.C6168h.d
            /* renamed from: a */
            public Class mo24633a() throws java.io.IOException {
                return InputStream.class;
            }

            @Override // p278p1.C6168h.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void close(InputStream inputStream) throws java.io.IOException {
                inputStream.close();
            }

            @Override // p278p1.C6168h.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream mo24634b(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public C6168h(d dVar) {
        this.f24252a = dVar;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(File file, int i10, int i11, C4977h c4977h) {
        return new InterfaceC6175o.a(new C3923b(file), new c(file, this.f24252a));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(File file) {
        return true;
    }
}
