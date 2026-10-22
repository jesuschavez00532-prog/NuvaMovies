package p164hd;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import gd.AbstractC4433c;
import gd.EnumC4432b;
import io.reactivex.subjects.BehaviorSubject;
import p135fd.AbstractC4309d;
import p135fd.C4307b;

/* renamed from: hd.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4817b extends Fragment {

    /* renamed from: o0 */
    private final BehaviorSubject f20288o0 = BehaviorSubject.create();

    @Override // androidx.fragment.app.Fragment
    /* renamed from: H7 */
    public void mo3091H7(Activity activity) {
        super.mo3091H7(activity);
        this.f20288o0.onNext(EnumC4432b.ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        this.f20288o0.onNext(EnumC4432b.CREATE);
    }

    /* renamed from: N3 */
    public final C4307b m19902N3() {
        return AbstractC4433c.m18620b(this.f20288o0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public void mo3118Q7() {
        this.f20288o0.onNext(EnumC4432b.DESTROY);
        super.mo3118Q7();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        this.f20288o0.onNext(EnumC4432b.DESTROY_VIEW);
        super.mo3123S7();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: T7 */
    public void mo3126T7() {
        this.f20288o0.onNext(EnumC4432b.DETACH);
        super.mo3126T7();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b8 */
    public void mo3149b8() {
        this.f20288o0.onNext(EnumC4432b.PAUSE);
        super.mo3149b8();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        super.mo3164g8();
        this.f20288o0.onNext(EnumC4432b.RESUME);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: i8 */
    public void mo3170i8() {
        super.mo3170i8();
        this.f20288o0.onNext(EnumC4432b.START);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: j8 */
    public void mo3173j8() {
        this.f20288o0.onNext(EnumC4432b.STOP);
        super.mo3173j8();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        super.mo3176k8(view, bundle);
        this.f20288o0.onNext(EnumC4432b.CREATE_VIEW);
    }

    /* renamed from: l9 */
    public final C4307b m19903l9(EnumC4432b enumC4432b) {
        return AbstractC4309d.m18084c(this.f20288o0, enumC4432b);
    }
}
