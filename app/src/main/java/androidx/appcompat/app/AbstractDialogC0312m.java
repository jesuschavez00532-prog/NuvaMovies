package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.core.view.AbstractC0623s;
import p138g.AbstractC4318b;

/* renamed from: androidx.appcompat.app.m */
/* loaded from: classes.dex */
public abstract class AbstractDialogC0312m extends Dialog implements InterfaceC0303d {

    /* renamed from: a */
    private AbstractC0304e f1152a;

    /* renamed from: b */
    private final AbstractC0623s.a f1153b;

    /* renamed from: androidx.appcompat.app.m$a */
    /* loaded from: classes.dex */
    class a implements AbstractC0623s.a {
        a() {
        }

        @Override // androidx.core.view.AbstractC0623s.a
        /* renamed from: I2 */
        public boolean mo1195I2(KeyEvent keyEvent) {
            return AbstractDialogC0312m.this.m1193c(keyEvent);
        }
    }

    public AbstractDialogC0312m(Context context, int i10) {
        super(context, m1191b(context, i10));
        this.f1153b = new a();
        AbstractC0304e m1192a = m1192a();
        m1192a.mo1075D(m1191b(context, i10));
        m1192a.mo1087q(null);
    }

    /* renamed from: b */
    private static int m1191b(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R$attr.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i10;
    }

    @Override // androidx.appcompat.app.InterfaceC0303d
    /* renamed from: N0 */
    public void mo1057N0(AbstractC4318b abstractC4318b) {
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

    /* renamed from: a */
    public AbstractC0304e m1192a() {
        if (this.f1152a == null) {
            this.f1152a = AbstractC0304e.m1068h(this, this);
        }
        return this.f1152a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1192a().mo1077d(view, layoutParams);
    }

    /* renamed from: c */
    boolean m1193c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean m1194d(int i10) {
        return m1192a().mo1094z(i10);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m1192a().mo1088r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0623s.m2807e(this.f1153b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return m1192a().mo1080i(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m1192a().mo1085o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m1192a().mo1084n();
        super.onCreate(bundle);
        m1192a().mo1087q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m1192a().mo1093w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        m1192a().mo1072A(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m1192a().mo1076E(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m1192a().mo1073B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1192a().mo1074C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        m1192a().mo1076E(getContext().getString(i10));
    }
}
