package p278p1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import p184j1.C4977h;
import p278p1.InterfaceC6175o;

/* renamed from: p1.u */
/* loaded from: classes.dex */
public final class C6181u implements InterfaceC6175o {

    /* renamed from: a */
    private final Context f24315a;

    /* renamed from: b */
    private final InterfaceC6175o f24316b;

    /* renamed from: p1.u$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC6176p {

        /* renamed from: a */
        private final Context f24317a;

        a(Context context) {
            this.f24317a = context;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6181u(this.f24317a, c6179s.m24683d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: p1.u$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC6176p {

        /* renamed from: a */
        private final Context f24318a;

        b(Context context) {
            this.f24318a = context;
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6181u(this.f24318a, c6179s.m24683d(Integer.class, InputStream.class));
        }
    }

    C6181u(Context context, InterfaceC6175o interfaceC6175o) {
        this.f24315a = context.getApplicationContext();
        this.f24316b = interfaceC6175o;
    }

    /* renamed from: e */
    public static InterfaceC6176p m24693e(Context context) {
        return new a(context);
    }

    /* renamed from: f */
    public static InterfaceC6176p m24694f(Context context) {
        return new b(context);
    }

    /* renamed from: g */
    private InterfaceC6175o.a m24695g(Uri uri, int i10, int i11, C4977h c4977h) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt == 0) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                }
                return null;
            }
            return this.f24316b.mo7343b(Integer.valueOf(parseInt), i10, i11, c4977h);
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    /* renamed from: h */
    private InterfaceC6175o.a m24696h(Uri uri, int i10, int i11, C4977h c4977h) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f24315a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f24315a.getPackageName());
        if (identifier == 0) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
                return null;
            }
            return null;
        }
        return this.f24316b.mo7343b(Integer.valueOf(identifier), i10, i11, c4977h);
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(Uri uri, int i10, int i11, C4977h c4977h) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return m24695g(uri, i10, i11, c4977h);
        }
        if (pathSegments.size() == 2) {
            return m24696h(uri, i10, i11, c4977h);
        }
        if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
            return null;
        }
        return null;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(Uri uri) {
        if ("android.resource".equals(uri.getScheme()) && this.f24315a.getPackageName().equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }
}
