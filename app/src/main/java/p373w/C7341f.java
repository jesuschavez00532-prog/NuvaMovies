package p373w;

/* renamed from: w.f */
/* loaded from: classes.dex */
public class C7341f extends C7340e {

    /* renamed from: c */
    private final Object f27243c;

    public C7341f(int i10) {
        super(i10);
        this.f27243c = new Object();
    }

    @Override // p373w.C7340e, p373w.InterfaceC7339d
    /* renamed from: a */
    public boolean mo16817a(Object obj) {
        boolean mo16817a;
        synchronized (this.f27243c) {
            mo16817a = super.mo16817a(obj);
        }
        return mo16817a;
    }

    @Override // p373w.C7340e, p373w.InterfaceC7339d
    /* renamed from: b */
    public Object mo16818b() {
        Object mo16818b;
        synchronized (this.f27243c) {
            mo16818b = super.mo16818b();
        }
        return mo16818b;
    }
}
