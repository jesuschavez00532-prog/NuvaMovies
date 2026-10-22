package p124f2;

/* renamed from: f2.c */
/* loaded from: classes.dex */
public abstract class AbstractC4221c {

    /* renamed from: f2.c$b */
    /* loaded from: classes.dex */
    private static class b extends AbstractC4221c {

        /* renamed from: a */
        private volatile boolean f18497a;

        b() {
            super();
        }

        @Override // p124f2.AbstractC4221c
        /* renamed from: b */
        public void mo17648b(boolean z10) {
            this.f18497a = z10;
        }

        @Override // p124f2.AbstractC4221c
        /* renamed from: c */
        public void mo17649c() {
            if (!this.f18497a) {
            } else {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private AbstractC4221c() {
    }

    /* renamed from: a */
    public static AbstractC4221c m17647a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo17648b(boolean z10);

    /* renamed from: c */
    public abstract void mo17649c();
}
