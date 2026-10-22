package p430z9;

import gd.EnumC4432b;
import io.reactivex.subjects.BehaviorSubject;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p135fd.AbstractC4309d;
import p135fd.C4307b;

/* renamed from: z9.e */
/* loaded from: classes2.dex */
public class C7767e extends C7764b {

    /* renamed from: D0 */
    private final BehaviorSubject f28629D0;

    /* renamed from: E0 */
    public Map f28630E0 = new LinkedHashMap();

    public C7767e() {
        BehaviorSubject create = BehaviorSubject.create();
        AbstractC5868k.m23673e(create, "create<FragmentEvent>()");
        this.f28629D0 = create;
    }

    @Override // p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f28630E0.clear();
    }

    /* renamed from: G9 */
    public final C4307b m30064G9(EnumC4432b enumC4432b) {
        AbstractC5868k.m23674f(enumC4432b, "event");
        C4307b m18084c = AbstractC4309d.m18084c(this.f28629D0, enumC4432b);
        AbstractC5868k.m23673e(m18084c, "bindUntilEvent(lifecycleSubject,event)");
        return m18084c;
    }

    /* renamed from: N3 */
    public final C4307b m30065N3() {
        return m30064G9(EnumC4432b.DESTROY);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public void mo3118Q7() {
        super.mo3118Q7();
        this.f28629D0.onNext(EnumC4432b.DESTROY);
    }

    @Override // p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        super.mo3123S7();
        this.f28629D0.onNext(EnumC4432b.DESTROY_VIEW);
        mo16979F9();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: T7 */
    public void mo3126T7() {
        super.mo3126T7();
        this.f28629D0.onNext(EnumC4432b.DETACH);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b8 */
    public void mo3149b8() {
        super.mo3149b8();
        this.f28629D0.onNext(EnumC4432b.PAUSE);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: j8 */
    public void mo3173j8() {
        super.mo3173j8();
        this.f28629D0.onNext(EnumC4432b.STOP);
    }
}
