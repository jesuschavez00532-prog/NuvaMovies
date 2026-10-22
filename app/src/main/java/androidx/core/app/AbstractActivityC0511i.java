package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.AbstractC0623s;
import androidx.lifecycle.AbstractC0749c;
import androidx.lifecycle.C0753g;
import androidx.lifecycle.FragmentC0759m;
import androidx.lifecycle.InterfaceC0752f;
import p214l.C5311i;

/* renamed from: androidx.core.app.i */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0511i extends Activity implements InterfaceC0752f, AbstractC0623s.a {

    /* renamed from: a */
    private C5311i f2212a = new C5311i();

    /* renamed from: b */
    private C0753g f2213b = new C0753g(this);

    @Override // androidx.core.view.AbstractC0623s.a
    /* renamed from: I2 */
    public boolean mo1195I2(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && AbstractC0623s.m2806d(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0623s.m2807e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && AbstractC0623s.m2806d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0759m.m3736f(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f2213b.m3721j(AbstractC0749c.c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
