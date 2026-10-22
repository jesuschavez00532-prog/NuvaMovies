package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.C0753g;
import androidx.lifecycle.C0763q;
import androidx.lifecycle.InterfaceC0764r;
import androidx.savedstate.C0836a;
import androidx.savedstate.InterfaceC0837b;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.g0 */
/* loaded from: classes.dex */
public class C0717g0 implements InterfaceC0837b, InterfaceC0764r {

    /* renamed from: a */
    private final Fragment f2837a;

    /* renamed from: b */
    private final C0763q f2838b;

    /* renamed from: c */
    private C0753g f2839c = null;

    /* renamed from: d */
    private C0836a f2840d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0717g0(Fragment fragment, C0763q c0763q) {
        this.f2837a = fragment;
        this.f2838b = c0763q;
    }

    @Override // androidx.savedstate.InterfaceC0837b
    /* renamed from: B3 */
    public SavedStateRegistry mo947B3() {
        m3342b();
        return this.f2840d.m4312b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3341a(AbstractC0749c.b bVar) {
        this.f2839c.m3720h(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3342b() {
        if (this.f2839c == null) {
            this.f2839c = new C0753g(this);
            this.f2840d = C0836a.m4311a(this);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0764r
    /* renamed from: b3 */
    public C0763q mo951b3() {
        m3342b();
        return this.f2838b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m3343c() {
        if (this.f2839c != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m3344d(Bundle bundle) {
        this.f2840d.m4313c(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m3345e(Bundle bundle) {
        this.f2840d.m4314d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m3346f(AbstractC0749c.c cVar) {
        this.f2839c.m3722o(cVar);
    }

    @Override // androidx.lifecycle.InterfaceC0752f
    /* renamed from: f6 */
    public AbstractC0749c mo953f6() {
        m3342b();
        return this.f2839c;
    }
}
