package p278p1;

import java.util.Queue;
import p109e2.AbstractC4122l;
import p109e2.C4118h;

/* renamed from: p1.n */
/* loaded from: classes.dex */
public class C6174n {

    /* renamed from: a */
    private final C4118h f24279a;

    /* renamed from: p1.n$a */
    /* loaded from: classes.dex */
    class a extends C4118h {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p109e2.C4118h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo17216j(b bVar, Object obj) {
            bVar.m24665c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p1.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: d */
        private static final Queue f24281d = AbstractC4122l.m17234g(0);

        /* renamed from: a */
        private int f24282a;

        /* renamed from: b */
        private int f24283b;

        /* renamed from: c */
        private Object f24284c;

        private b() {
        }

        /* renamed from: a */
        static b m24663a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f24281d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.m24664b(obj, i10, i11);
            return bVar;
        }

        /* renamed from: b */
        private void m24664b(Object obj, int i10, int i11) {
            this.f24284c = obj;
            this.f24283b = i10;
            this.f24282a = i11;
        }

        /* renamed from: c */
        public void m24665c() {
            Queue queue = f24281d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24283b != bVar.f24283b || this.f24282a != bVar.f24282a || !this.f24284c.equals(bVar.f24284c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f24282a * 31) + this.f24283b) * 31) + this.f24284c.hashCode();
        }
    }

    public C6174n(long j10) {
        this.f24279a = new a(j10);
    }

    /* renamed from: a */
    public Object m24660a(Object obj, int i10, int i11) {
        b m24663a = b.m24663a(obj, i10, i11);
        Object m17213g = this.f24279a.m17213g(m24663a);
        m24663a.m24665c();
        return m17213g;
    }

    /* renamed from: b */
    public void m24661b(Object obj, int i10, int i11, Object obj2) {
        this.f24279a.m17217k(b.m24663a(obj, i10, i11), obj2);
    }
}
