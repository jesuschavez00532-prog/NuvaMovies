package p278p1;

import android.net.Uri;
import anet.channel.util.HttpConstant;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p184j1.C4977h;
import p278p1.InterfaceC6175o;

/* renamed from: p1.z */
/* loaded from: classes.dex */
public class C6186z implements InterfaceC6175o {

    /* renamed from: b */
    private static final Set f24329b = Collections.unmodifiableSet(new HashSet(Arrays.asList(HttpConstant.HTTP, HttpConstant.HTTPS)));

    /* renamed from: a */
    private final InterfaceC6175o f24330a;

    /* renamed from: p1.z$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC6176p {
        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6186z(c6179s.m24683d(C6169i.class, InputStream.class));
        }
    }

    public C6186z(InterfaceC6175o interfaceC6175o) {
        this.f24330a = interfaceC6175o;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(Uri uri, int i10, int i11, C4977h c4977h) {
        return this.f24330a.mo7343b(new C6169i(uri.toString()), i10, i11, c4977h);
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(Uri uri) {
        return f24329b.contains(uri.getScheme());
    }
}
