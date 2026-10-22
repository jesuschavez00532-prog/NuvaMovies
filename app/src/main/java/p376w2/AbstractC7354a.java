package p376w2;

import io.reactivex.functions.Function;
import retrofit2.HttpException;

/* renamed from: w2.a */
/* loaded from: classes.dex */
public abstract class AbstractC7354a implements Function {

    /* renamed from: a */
    private int f27297a = 200;

    /* renamed from: c */
    private void m28383c(Throwable th) {
        if (th != null && (th instanceof HttpException)) {
            this.f27297a = ((HttpException) th).m25696a();
        } else {
            this.f27297a = -1;
        }
    }

    /* renamed from: a */
    public abstract Object mo4897a(Object obj);

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        m28383c((Throwable) obj);
        return mo4897a(obj);
    }

    /* renamed from: b */
    public int m28384b() {
        return this.f27297a;
    }
}
