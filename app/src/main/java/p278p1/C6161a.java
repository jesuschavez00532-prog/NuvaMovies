package p278p1;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C1608h;
import com.bumptech.glide.load.data.C1615o;
import com.bumptech.glide.load.data.InterfaceC1604d;
import p093d2.C3923b;
import p184j1.C4977h;
import p278p1.InterfaceC6175o;

/* renamed from: p1.a */
/* loaded from: classes.dex */
public class C6161a implements InterfaceC6175o {

    /* renamed from: c */
    private static final int f24225c = 22;

    /* renamed from: a */
    private final AssetManager f24226a;

    /* renamed from: b */
    private final a f24227b;

    /* renamed from: p1.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        InterfaceC1604d mo24603a(AssetManager assetManager, String str);
    }

    /* renamed from: p1.a$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC6176p, a {

        /* renamed from: a */
        private final AssetManager f24228a;

        public b(AssetManager assetManager) {
            this.f24228a = assetManager;
        }

        @Override // p278p1.C6161a.a
        /* renamed from: a */
        public InterfaceC1604d mo24603a(AssetManager assetManager, String str) {
            return new C1608h(assetManager, str);
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6161a(this.f24228a, this);
        }
    }

    /* renamed from: p1.a$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC6176p, a {

        /* renamed from: a */
        private final AssetManager f24229a;

        public c(AssetManager assetManager) {
            this.f24229a = assetManager;
        }

        @Override // p278p1.C6161a.a
        /* renamed from: a */
        public InterfaceC1604d mo24603a(AssetManager assetManager, String str) {
            return new C1615o(assetManager, str);
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6161a(this.f24229a, this);
        }
    }

    public C6161a(AssetManager assetManager, a aVar) {
        this.f24226a = assetManager;
        this.f24227b = aVar;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(Uri uri, int i10, int i11, C4977h c4977h) {
        return new InterfaceC6175o.a(new C3923b(uri), this.f24227b.mo24603a(this.f24226a, uri.toString().substring(f24225c)));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
