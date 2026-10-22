package p335t3;

import android.content.Context;
import p095d4.InterfaceC3935a;

/* renamed from: t3.c */
/* loaded from: classes.dex */
final class C6895c extends AbstractC6900h {

    /* renamed from: a */
    private final Context f26209a;

    /* renamed from: b */
    private final InterfaceC3935a f26210b;

    /* renamed from: c */
    private final InterfaceC3935a f26211c;

    /* renamed from: d */
    private final String f26212d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6895c(Context context, InterfaceC3935a interfaceC3935a, InterfaceC3935a interfaceC3935a2, String str) {
        if (context != null) {
            this.f26209a = context;
            if (interfaceC3935a != null) {
                this.f26210b = interfaceC3935a;
                if (interfaceC3935a2 != null) {
                    this.f26211c = interfaceC3935a2;
                    if (str != null) {
                        this.f26212d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // p335t3.AbstractC6900h
    /* renamed from: b */
    public Context mo26823b() {
        return this.f26209a;
    }

    @Override // p335t3.AbstractC6900h
    /* renamed from: c */
    public String mo26824c() {
        return this.f26212d;
    }

    @Override // p335t3.AbstractC6900h
    /* renamed from: d */
    public InterfaceC3935a mo26825d() {
        return this.f26211c;
    }

    @Override // p335t3.AbstractC6900h
    /* renamed from: e */
    public InterfaceC3935a mo26826e() {
        return this.f26210b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6900h)) {
            return false;
        }
        AbstractC6900h abstractC6900h = (AbstractC6900h) obj;
        if (this.f26209a.equals(abstractC6900h.mo26823b()) && this.f26210b.equals(abstractC6900h.mo26826e()) && this.f26211c.equals(abstractC6900h.mo26825d()) && this.f26212d.equals(abstractC6900h.mo26824c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f26209a.hashCode() ^ 1000003) * 1000003) ^ this.f26210b.hashCode()) * 1000003) ^ this.f26211c.hashCode()) * 1000003) ^ this.f26212d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f26209a + ", wallClock=" + this.f26210b + ", monotonicClock=" + this.f26211c + ", backendName=" + this.f26212d + "}";
    }
}
