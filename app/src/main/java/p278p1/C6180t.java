package p278p1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import p184j1.C4977h;
import p278p1.InterfaceC6175o;

/* renamed from: p1.t */
/* loaded from: classes.dex */
public class C6180t implements InterfaceC6175o {

    /* renamed from: a */
    private final InterfaceC6175o f24310a;

    /* renamed from: b */
    private final Resources f24311b;

    /* renamed from: p1.t$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC6176p {

        /* renamed from: a */
        private final Resources f24312a;

        public a(Resources resources) {
            this.f24312a = resources;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6180t(this.f24312a, c6179s.m24683d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: p1.t$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC6176p {

        /* renamed from: a */
        private final Resources f24313a;

        public b(Resources resources) {
            this.f24313a = resources;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6180t(this.f24313a, c6179s.m24683d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: p1.t$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC6176p {

        /* renamed from: a */
        private final Resources f24314a;

        public c(Resources resources) {
            this.f24314a = resources;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6180t(this.f24314a, C6184x.m24704c());
        }
    }

    public C6180t(Resources resources, InterfaceC6175o interfaceC6175o) {
        this.f24311b = resources;
        this.f24310a = interfaceC6175o;
    }

    /* renamed from: d */
    private Uri m24690d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f24311b.getResourcePackageName(num.intValue()) + '/' + this.f24311b.getResourceTypeName(num.intValue()) + '/' + this.f24311b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
                return null;
            }
            return null;
        }
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(Integer num, int i10, int i11, C4977h c4977h) {
        Uri m24690d = m24690d(num);
        if (m24690d == null) {
            return null;
        }
        return this.f24310a.mo7343b(m24690d, i10, i11, c4977h);
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(Integer num) {
        return true;
    }
}
