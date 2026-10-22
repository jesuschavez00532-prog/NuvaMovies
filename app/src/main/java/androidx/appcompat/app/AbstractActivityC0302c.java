package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0462w2;
import androidx.core.app.AbstractC0498c;
import androidx.core.app.AbstractC0513j;
import androidx.core.app.C0500c1;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.lifecycle.AbstractC0765s;
import androidx.lifecycle.AbstractC0766t;
import androidx.savedstate.AbstractC0838c;
import androidx.savedstate.SavedStateRegistry;
import p031c.InterfaceC1333b;
import p138g.AbstractC4318b;

/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0302c extends AbstractActivityC0712e implements InterfaceC0303d, C0500c1.a {

    /* renamed from: q */
    private AbstractC0304e f1048q;

    /* renamed from: r */
    private Resources f1049r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.c$a */
    /* loaded from: classes.dex */
    public class a implements SavedStateRegistry.InterfaceC0835b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0835b
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            AbstractActivityC0302c.this.m1064u4().mo1091u(bundle);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.c$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC1333b {
        b() {
        }

        @Override // p031c.InterfaceC1333b
        /* renamed from: a */
        public void mo955a(Context context) {
            AbstractC0304e m1064u4 = AbstractActivityC0302c.this.m1064u4();
            m1064u4.mo1084n();
            m1064u4.mo1087q(AbstractActivityC0302c.this.mo947B3().m4306a("androidx:appcompat"));
        }
    }

    public AbstractActivityC0302c() {
        m1051w4();
    }

    /* renamed from: N4 */
    private boolean m1049N4(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: Y3 */
    private void m1050Y3() {
        AbstractC0765s.m3748a(getWindow().getDecorView(), this);
        AbstractC0766t.m3749a(getWindow().getDecorView(), this);
        AbstractC0838c.m4315a(getWindow().getDecorView(), this);
    }

    /* renamed from: w4 */
    private void m1051w4() {
        mo947B3().m4309d("androidx:appcompat", new a());
        m949T3(new b());
    }

    /* renamed from: C4 */
    public void m1052C4(C0500c1 c0500c1) {
        c0500c1.m2191g(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D4 */
    public void m1053D4(int i10) {
    }

    /* renamed from: I4 */
    public void m1054I4(C0500c1 c0500c1) {
    }

    /* renamed from: K4 */
    public void m1055K4() {
    }

    /* renamed from: M4 */
    public boolean m1056M4() {
        Intent mo1060Q1 = mo1060Q1();
        if (mo1060Q1 != null) {
            if (m1059P4(mo1060Q1)) {
                C0500c1 m2189j = C0500c1.m2189j(this);
                m1052C4(m2189j);
                m1054I4(m2189j);
                m2189j.m2193k();
                try {
                    AbstractC0498c.m2181l(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            m1058O4(mo1060Q1);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.InterfaceC0303d
    /* renamed from: N0 */
    public void mo1057N0(AbstractC4318b abstractC4318b) {
    }

    /* renamed from: O4 */
    public void m1058O4(Intent intent) {
        AbstractC0513j.m2222e(this, intent);
    }

    /* renamed from: P4 */
    public boolean m1059P4(Intent intent) {
        return AbstractC0513j.m2223f(this, intent);
    }

    @Override // androidx.core.app.C0500c1.a
    /* renamed from: Q1 */
    public Intent mo1060Q1() {
        return AbstractC0513j.m2218a(this);
    }

    @Override // androidx.appcompat.app.InterfaceC0303d
    /* renamed from: U1 */
    public AbstractC4318b mo1061U1(AbstractC4318b.a aVar) {
        return null;
    }

    @Override // androidx.appcompat.app.InterfaceC0303d
    /* renamed from: V1 */
    public void mo1062V1(AbstractC4318b abstractC4318b) {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1050Y3();
        m1064u4().mo1077d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(m1064u4().mo1079f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0300a m1065v4 = m1065v4();
        if (getWindow().hasFeature(0)) {
            if (m1065v4 == null || !m1065v4.m1024g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.AbstractActivityC0511i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0300a m1065v4 = m1065v4();
        if (keyCode == 82 && m1065v4 != null && m1065v4.m1033p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return m1064u4().mo1080i(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m1064u4().mo1082l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1049r == null && C0462w2.m2022b()) {
            this.f1049r = new C0462w2(this, super.getResources());
        }
        Resources resources = this.f1049r;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m1064u4().mo1085o();
    }

    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1049r != null) {
            this.f1049r.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m1064u4().mo1086p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m1055K4();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m1064u4().mo1088r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (m1049N4(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC0300a m1065v4 = m1065v4();
        if (menuItem.getItemId() == 16908332 && m1065v4 != null && (m1065v4.mo1027j() & 4) != 0) {
            return m1056M4();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m1064u4().mo1089s(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m1064u4().mo1090t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onStart() {
        super.onStart();
        m1064u4().mo1092v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onStop() {
        super.onStop();
        m1064u4().mo1093w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        m1064u4().mo1076E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0300a m1065v4 = m1065v4();
        if (getWindow().hasFeature(0)) {
            if (m1065v4 == null || !m1065v4.m1034q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0712e
    /* renamed from: s4 */
    public void mo1063s4() {
        m1064u4().mo1085o();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        m1050Y3();
        m1064u4().mo1072A(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        m1064u4().mo1075D(i10);
    }

    /* renamed from: u4 */
    public AbstractC0304e m1064u4() {
        if (this.f1048q == null) {
            this.f1048q = AbstractC0304e.m1067g(this, this);
        }
        return this.f1048q;
    }

    /* renamed from: v4 */
    public AbstractC0300a m1065v4() {
        return m1064u4().mo1083m();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m1050Y3();
        m1064u4().mo1073B(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1050Y3();
        m1064u4().mo1074C(view, layoutParams);
    }
}
