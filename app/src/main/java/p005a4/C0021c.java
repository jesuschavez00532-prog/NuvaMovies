package p005a4;

import java.util.Map;
import p095d4.InterfaceC3935a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a4.c */
/* loaded from: classes.dex */
public final class C0021c extends AbstractC0060z {

    /* renamed from: a */
    private final InterfaceC3935a f116a;

    /* renamed from: b */
    private final Map f117b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0021c(InterfaceC3935a interfaceC3935a, Map map) {
        if (interfaceC3935a != null) {
            this.f116a = interfaceC3935a;
            if (map != null) {
                this.f117b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p005a4.AbstractC0060z
    /* renamed from: e */
    public InterfaceC3935a mo141e() {
        return this.f116a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0060z)) {
            return false;
        }
        AbstractC0060z abstractC0060z = (AbstractC0060z) obj;
        if (this.f116a.equals(abstractC0060z.mo141e()) && this.f117b.equals(abstractC0060z.mo142h())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p005a4.AbstractC0060z
    /* renamed from: h */
    public Map mo142h() {
        return this.f117b;
    }

    public int hashCode() {
        return ((this.f116a.hashCode() ^ 1000003) * 1000003) ^ this.f117b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f116a + ", values=" + this.f117b + "}";
    }
}
