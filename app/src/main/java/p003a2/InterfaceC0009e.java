package p003a2;

/* renamed from: a2.e */
/* loaded from: classes.dex */
public interface InterfaceC0009e {

    /* renamed from: a2.e$a */
    /* loaded from: classes.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: a */
        private final boolean f49a;

        a(boolean z10) {
            this.f49a = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m99b() {
            return this.f49a;
        }
    }

    /* renamed from: a */
    InterfaceC0009e mo86a();

    /* renamed from: b */
    boolean mo87b();

    /* renamed from: c */
    boolean mo88c(InterfaceC0008d interfaceC0008d);

    /* renamed from: e */
    void mo90e(InterfaceC0008d interfaceC0008d);

    /* renamed from: f */
    boolean mo91f(InterfaceC0008d interfaceC0008d);

    /* renamed from: i */
    boolean mo94i(InterfaceC0008d interfaceC0008d);

    /* renamed from: k */
    void mo96k(InterfaceC0008d interfaceC0008d);
}
