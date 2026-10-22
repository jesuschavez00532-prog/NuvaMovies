package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.InterfaceC0764r;
import p373w.AbstractC7342g;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public class C0722j {

    /* renamed from: a */
    private final AbstractC0726l f2876a;

    private C0722j(AbstractC0726l abstractC0726l) {
        this.f2876a = abstractC0726l;
    }

    /* renamed from: b */
    public static C0722j m3382b(AbstractC0726l abstractC0726l) {
        return new C0722j((AbstractC0726l) AbstractC7342g.m28328h(abstractC0726l, "callbacks == null"));
    }

    /* renamed from: a */
    public void m3383a(Fragment fragment) {
        AbstractC0726l abstractC0726l = this.f2876a;
        abstractC0726l.f2882e.m3529k(abstractC0726l, abstractC0726l, fragment);
    }

    /* renamed from: c */
    public void m3384c() {
        this.f2876a.f2882e.m3554y();
    }

    /* renamed from: d */
    public void m3385d(Configuration configuration) {
        this.f2876a.f2882e.m3468A(configuration);
    }

    /* renamed from: e */
    public boolean m3386e(MenuItem menuItem) {
        return this.f2876a.f2882e.m3470B(menuItem);
    }

    /* renamed from: f */
    public void m3387f() {
        this.f2876a.f2882e.m3472C();
    }

    /* renamed from: g */
    public boolean m3388g(Menu menu, MenuInflater menuInflater) {
        return this.f2876a.f2882e.m3474D(menu, menuInflater);
    }

    /* renamed from: h */
    public void m3389h() {
        this.f2876a.f2882e.m3476E();
    }

    /* renamed from: i */
    public void m3390i() {
        this.f2876a.f2882e.m3479G();
    }

    /* renamed from: j */
    public void m3391j(boolean z10) {
        this.f2876a.f2882e.m3480H(z10);
    }

    /* renamed from: k */
    public boolean m3392k(MenuItem menuItem) {
        return this.f2876a.f2882e.m3484J(menuItem);
    }

    /* renamed from: l */
    public void m3393l(Menu menu) {
        this.f2876a.f2882e.m3486K(menu);
    }

    /* renamed from: m */
    public void m3394m() {
        this.f2876a.f2882e.m3489M();
    }

    /* renamed from: n */
    public void m3395n(boolean z10) {
        this.f2876a.f2882e.m3491N(z10);
    }

    /* renamed from: o */
    public boolean m3396o(Menu menu) {
        return this.f2876a.f2882e.m3492O(menu);
    }

    /* renamed from: p */
    public void m3397p() {
        this.f2876a.f2882e.m3496Q();
    }

    /* renamed from: q */
    public void m3398q() {
        this.f2876a.f2882e.m3498R();
    }

    /* renamed from: r */
    public void m3399r() {
        this.f2876a.f2882e.m3501T();
    }

    /* renamed from: s */
    public boolean m3400s() {
        return this.f2876a.f2882e.m3510a0(true);
    }

    /* renamed from: t */
    public AbstractC0729o m3401t() {
        return this.f2876a.f2882e;
    }

    /* renamed from: u */
    public void m3402u() {
        this.f2876a.f2882e.m3500S0();
    }

    /* renamed from: v */
    public View m3403v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2876a.f2882e.m3548u0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void m3404w(Parcelable parcelable) {
        AbstractC0726l abstractC0726l = this.f2876a;
        if (abstractC0726l instanceof InterfaceC0764r) {
            abstractC0726l.f2882e.m3524h1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: x */
    public Parcelable m3405x() {
        return this.f2876a.f2882e.m3528j1();
    }
}
