package p278p1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p184j1.C4977h;
import p278p1.InterfaceC6175o;

/* renamed from: p1.w */
/* loaded from: classes.dex */
public class C6183w implements InterfaceC6175o {

    /* renamed from: a */
    private final InterfaceC6175o f24320a;

    /* renamed from: p1.w$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC6176p {
        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6183w(c6179s.m24683d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: p1.w$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC6176p {
        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6183w(c6179s.m24683d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: p1.w$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC6176p {
        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6183w(c6179s.m24683d(Uri.class, InputStream.class));
        }
    }

    public C6183w(InterfaceC6175o interfaceC6175o) {
        this.f24320a = interfaceC6175o;
    }

    /* renamed from: e */
    private static Uri m24700e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m24701f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return m24701f(str);
        }
        return parse;
    }

    /* renamed from: f */
    private static Uri m24701f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(String str, int i10, int i11, C4977h c4977h) {
        Uri m24700e = m24700e(str);
        if (m24700e != null && this.f24320a.mo7342a(m24700e)) {
            return this.f24320a.mo7343b(m24700e, i10, i11, c4977h);
        }
        return null;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(String str) {
        return true;
    }
}
