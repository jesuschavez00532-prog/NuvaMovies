package p138g;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0325e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p138g.AbstractC4318b;

/* renamed from: g.e */
/* loaded from: classes.dex */
public class C4321e extends AbstractC4318b implements C0325e.a {

    /* renamed from: c */
    private Context f18776c;

    /* renamed from: d */
    private ActionBarContextView f18777d;

    /* renamed from: e */
    private AbstractC4318b.a f18778e;

    /* renamed from: f */
    private WeakReference f18779f;

    /* renamed from: g */
    private boolean f18780g;

    /* renamed from: h */
    private boolean f18781h;

    /* renamed from: i */
    private C0325e f18782i;

    public C4321e(Context context, ActionBarContextView actionBarContextView, AbstractC4318b.a aVar, boolean z10) {
        this.f18776c = context;
        this.f18777d = actionBarContextView;
        this.f18778e = aVar;
        C0325e m1346S = new C0325e(actionBarContextView.getContext()).m1346S(1);
        this.f18782i = m1346S;
        m1346S.mo1345R(this);
        this.f18781h = z10;
    }

    @Override // androidx.appcompat.view.menu.C0325e.a
    /* renamed from: a */
    public boolean mo1141a(C0325e c0325e, MenuItem menuItem) {
        return this.f18778e.mo1164a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0325e.a
    /* renamed from: b */
    public void mo1143b(C0325e c0325e) {
        mo1250k();
        this.f18777d.m1437l();
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: c */
    public void mo1244c() {
        if (this.f18780g) {
            return;
        }
        this.f18780g = true;
        this.f18777d.sendAccessibilityEvent(32);
        this.f18778e.mo1165b(this);
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: d */
    public View mo1245d() {
        WeakReference weakReference = this.f18779f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: e */
    public Menu mo1246e() {
        return this.f18782i;
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: f */
    public MenuInflater mo1247f() {
        return new C4323g(this.f18777d.getContext());
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: g */
    public CharSequence mo1248g() {
        return this.f18777d.getSubtitle();
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: i */
    public CharSequence mo1249i() {
        return this.f18777d.getTitle();
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: k */
    public void mo1250k() {
        this.f18778e.mo1166c(this, this.f18782i);
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: l */
    public boolean mo1251l() {
        return this.f18777d.m1435j();
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: m */
    public void mo1252m(View view) {
        WeakReference weakReference;
        this.f18777d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f18779f = weakReference;
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: n */
    public void mo1253n(int i10) {
        mo1254o(this.f18776c.getString(i10));
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: o */
    public void mo1254o(CharSequence charSequence) {
        this.f18777d.setSubtitle(charSequence);
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: q */
    public void mo1255q(int i10) {
        mo1256r(this.f18776c.getString(i10));
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: r */
    public void mo1256r(CharSequence charSequence) {
        this.f18777d.setTitle(charSequence);
    }

    @Override // p138g.AbstractC4318b
    /* renamed from: s */
    public void mo1257s(boolean z10) {
        super.mo1257s(z10);
        this.f18777d.setTitleOptional(z10);
    }
}
