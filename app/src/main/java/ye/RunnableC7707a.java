package ye;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ye.a */
/* loaded from: classes3.dex */
public class RunnableC7707a implements Runnable, InterfaceC7718l {

    /* renamed from: a */
    private final C7717k f28321a = new C7717k();

    /* renamed from: b */
    private final C7709c f28322b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC7707a(C7709c c7709c) {
        this.f28322b = c7709c;
    }

    @Override // ye.InterfaceC7718l
    /* renamed from: a */
    public void mo29783a(C7723q c7723q, Object obj) {
        this.f28321a.m29822a(C7716j.m29820a(c7723q, obj));
        this.f28322b.m29796e().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        C7716j m29823b = this.f28321a.m29823b();
        if (m29823b != null) {
            this.f28322b.m29798h(m29823b);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
