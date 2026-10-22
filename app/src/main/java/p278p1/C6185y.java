package p278p1;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.C1601a;
import com.bumptech.glide.load.data.C1609i;
import com.bumptech.glide.load.data.C1616p;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p093d2.C3923b;
import p184j1.C4977h;
import p278p1.InterfaceC6175o;

/* renamed from: p1.y */
/* loaded from: classes.dex */
public class C6185y implements InterfaceC6175o {

    /* renamed from: b */
    private static final Set f24324b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a */
    private final c f24325a;

    /* renamed from: p1.y$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC6176p, c {

        /* renamed from: a */
        private final ContentResolver f24326a;

        public a(ContentResolver contentResolver) {
            this.f24326a = contentResolver;
        }

        @Override // p278p1.C6185y.c
        /* renamed from: a */
        public InterfaceC1604d mo24708a(Uri uri) {
            return new C1601a(this.f24326a, uri);
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6185y(this);
        }
    }

    /* renamed from: p1.y$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC6176p, c {

        /* renamed from: a */
        private final ContentResolver f24327a;

        public b(ContentResolver contentResolver) {
            this.f24327a = contentResolver;
        }

        @Override // p278p1.C6185y.c
        /* renamed from: a */
        public InterfaceC1604d mo24708a(Uri uri) {
            return new C1609i(this.f24327a, uri);
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6185y(this);
        }
    }

    /* renamed from: p1.y$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC1604d mo24708a(Uri uri);
    }

    /* renamed from: p1.y$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC6176p, c {

        /* renamed from: a */
        private final ContentResolver f24328a;

        public d(ContentResolver contentResolver) {
            this.f24328a = contentResolver;
        }

        @Override // p278p1.C6185y.c
        /* renamed from: a */
        public InterfaceC1604d mo24708a(Uri uri) {
            return new C1616p(this.f24328a, uri);
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: c */
        public void mo7347c() {
        }

        @Override // p278p1.InterfaceC6176p
        /* renamed from: d */
        public InterfaceC6175o mo7348d(C6179s c6179s) {
            return new C6185y(this);
        }
    }

    public C6185y(c cVar) {
        this.f24325a = cVar;
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6175o.a mo7343b(Uri uri, int i10, int i11, C4977h c4977h) {
        return new InterfaceC6175o.a(new C3923b(uri), this.f24325a.mo24708a(uri));
    }

    @Override // p278p1.InterfaceC6175o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo7342a(Uri uri) {
        return f24324b.contains(uri.getScheme());
    }
}
