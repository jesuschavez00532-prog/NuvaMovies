package ve;

import java.util.concurrent.CancellationException;
import ne.AbstractC5868k;

/* renamed from: ve.e1 */
/* loaded from: classes3.dex */
public final class C7274e1 extends CancellationException {

    /* renamed from: a */
    public final InterfaceC7271d1 f27163a;

    public C7274e1(String str, Throwable th, InterfaceC7271d1 interfaceC7271d1) {
        super(str);
        this.f27163a = interfaceC7271d1;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C7274e1) {
                C7274e1 c7274e1 = (C7274e1) obj;
                if (!AbstractC5868k.m23669a(c7274e1.getMessage(), getMessage()) || !AbstractC5868k.m23669a(c7274e1.f27163a, this.f27163a) || !AbstractC5868k.m23669a(c7274e1.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i10;
        String message = getMessage();
        AbstractC5868k.m23671c(message);
        int hashCode = ((message.hashCode() * 31) + this.f27163a.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f27163a;
    }
}
