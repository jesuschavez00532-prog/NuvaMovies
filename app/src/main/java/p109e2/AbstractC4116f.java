package p109e2;

/* renamed from: e2.f */
/* loaded from: classes.dex */
public abstract class AbstractC4116f {

    /* renamed from: e2.f$a */
    /* loaded from: classes.dex */
    class a implements b {

        /* renamed from: a */
        private volatile Object f18076a;

        /* renamed from: b */
        final /* synthetic */ b f18077b;

        a(b bVar) {
            this.f18077b = bVar;
        }

        @Override // p109e2.AbstractC4116f.b
        public Object get() {
            if (this.f18076a == null) {
                synchronized (this) {
                    if (this.f18076a == null) {
                        this.f18076a = AbstractC4121k.m17226d(this.f18077b.get());
                    }
                }
            }
            return this.f18076a;
        }
    }

    /* renamed from: e2.f$b */
    /* loaded from: classes.dex */
    public interface b {
        Object get();
    }

    /* renamed from: a */
    public static b m17208a(b bVar) {
        return new a(bVar);
    }
}
