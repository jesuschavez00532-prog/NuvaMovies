package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.AbstractC0765s;
import androidx.lifecycle.AbstractC0766t;
import androidx.lifecycle.InterfaceC0752f;
import androidx.lifecycle.InterfaceC0757k;
import androidx.savedstate.AbstractC0838c;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0710d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0 */
    private boolean f2762A0;
    private boolean mDismissed;
    private boolean mShownByMe;

    /* renamed from: o0 */
    private Handler f2764o0;

    /* renamed from: x0 */
    private boolean f2773x0;

    /* renamed from: z0 */
    private Dialog f2775z0;

    /* renamed from: p0 */
    private Runnable f2765p0 = new a();

    /* renamed from: q0 */
    private DialogInterface.OnCancelListener f2766q0 = new b();

    /* renamed from: r0 */
    private DialogInterface.OnDismissListener f2767r0 = new c();

    /* renamed from: s0 */
    private int f2768s0 = 0;

    /* renamed from: t0 */
    private int f2769t0 = 0;

    /* renamed from: u0 */
    private boolean f2770u0 = true;

    /* renamed from: v0 */
    private boolean f2771v0 = true;

    /* renamed from: w0 */
    private int f2772w0 = -1;

    /* renamed from: y0 */
    private InterfaceC0757k f2774y0 = new d();

    /* renamed from: B0 */
    private boolean f2763B0 = false;

    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC0710d.this.f2767r0.onDismiss(DialogInterfaceOnCancelListenerC0710d.this.f2775z0);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* loaded from: classes.dex */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0710d.this.f2775z0 != null) {
                DialogInterfaceOnCancelListenerC0710d dialogInterfaceOnCancelListenerC0710d = DialogInterfaceOnCancelListenerC0710d.this;
                dialogInterfaceOnCancelListenerC0710d.onCancel(dialogInterfaceOnCancelListenerC0710d.f2775z0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    /* loaded from: classes.dex */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0710d.this.f2775z0 != null) {
                DialogInterfaceOnCancelListenerC0710d dialogInterfaceOnCancelListenerC0710d = DialogInterfaceOnCancelListenerC0710d.this;
                dialogInterfaceOnCancelListenerC0710d.onDismiss(dialogInterfaceOnCancelListenerC0710d.f2775z0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    /* loaded from: classes.dex */
    class d implements InterfaceC0757k {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC0757k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3288a(InterfaceC0752f interfaceC0752f) {
            if (interfaceC0752f != null && DialogInterfaceOnCancelListenerC0710d.this.f2771v0) {
                View m3113O8 = DialogInterfaceOnCancelListenerC0710d.this.m3113O8();
                if (m3113O8.getParent() == null) {
                    if (DialogInterfaceOnCancelListenerC0710d.this.f2775z0 != null) {
                        if (AbstractC0729o.m3432F0(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC0710d.this.f2775z0);
                        }
                        DialogInterfaceOnCancelListenerC0710d.this.f2775z0.setContentView(m3113O8);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    /* loaded from: classes.dex */
    class e extends AbstractC0716g {

        /* renamed from: a */
        final /* synthetic */ AbstractC0716g f2780a;

        e(AbstractC0716g abstractC0716g) {
            this.f2780a = abstractC0716g;
        }

        @Override // androidx.fragment.app.AbstractC0716g
        /* renamed from: c */
        public View mo3209c(int i10) {
            if (this.f2780a.mo3210d()) {
                return this.f2780a.mo3209c(i10);
            }
            return DialogInterfaceOnCancelListenerC0710d.this.m3284v9(i10);
        }

        @Override // androidx.fragment.app.AbstractC0716g
        /* renamed from: d */
        public boolean mo3210d() {
            if (!this.f2780a.mo3210d() && !DialogInterfaceOnCancelListenerC0710d.this.m3285w9()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: q9 */
    private void m3271q9(boolean z10, boolean z11) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.f2775z0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2775z0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f2764o0.getLooper()) {
                    onDismiss(this.f2775z0);
                } else {
                    this.f2764o0.post(this.f2765p0);
                }
            }
        }
        this.f2762A0 = true;
        if (this.f2772w0 >= 0) {
            m3136X6().m3505V0(this.f2772w0, 1);
            this.f2772w0 = -1;
            return;
        }
        AbstractC0738x m3534m = m3136X6().m3534m();
        m3534m.mo3235p(this);
        if (z10) {
            m3534m.mo3228h();
        } else {
            m3534m.mo3227g();
        }
    }

    /* renamed from: x9 */
    private void m3272x9(Bundle bundle) {
        if (this.f2771v0 && !this.f2763B0) {
            try {
                this.f2773x0 = true;
                Dialog mo3283u9 = mo3283u9(bundle);
                this.f2775z0 = mo3283u9;
                if (this.f2771v0) {
                    m3275C9(mo3283u9, this.f2768s0);
                    Context m3096J6 = m3096J6();
                    if (m3096J6 instanceof Activity) {
                        this.f2775z0.setOwnerActivity((Activity) m3096J6);
                    }
                    this.f2775z0.setCancelable(this.f2770u0);
                    this.f2775z0.setOnCancelListener(this.f2766q0);
                    this.f2775z0.setOnDismissListener(this.f2767r0);
                    this.f2763B0 = true;
                } else {
                    this.f2775z0 = null;
                }
            } finally {
                this.f2773x0 = false;
            }
        }
    }

    /* renamed from: A9 */
    public void m3273A9(boolean z10) {
        this.f2771v0 = z10;
    }

    /* renamed from: B9 */
    public void m3274B9(int i10, int i11) {
        if (AbstractC0729o.m3432F0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i10 + ", " + i11);
        }
        this.f2768s0 = i10;
        if (i10 == 2 || i10 == 3) {
            this.f2769t0 = R.style.Theme.Panel;
        }
        if (i11 != 0) {
            this.f2769t0 = i11;
        }
    }

    /* renamed from: C9 */
    public void m3275C9(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: D9 */
    public int m3276D9(AbstractC0738x abstractC0738x, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC0738x.m3640d(this, str);
        this.f2762A0 = false;
        int mo3227g = abstractC0738x.mo3227g();
        this.f2772w0 = mo3227g;
        return mo3227g;
    }

    /* renamed from: E9 */
    public void mo3277E9(AbstractC0729o abstractC0729o, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC0738x m3534m = abstractC0729o.m3534m();
        m3534m.m3640d(this, str);
        m3534m.mo3227g();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: I7 */
    public void mo3094I7(Context context) {
        super.mo3094I7(context);
        m3184o7().m3680e(this.f2774y0);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        boolean z10;
        super.mo3103L7(bundle);
        this.f2764o0 = new Handler();
        if (this.f2667x == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2771v0 = z10;
        if (bundle != null) {
            this.f2768s0 = bundle.getInt("android:style", 0);
            this.f2769t0 = bundle.getInt("android:theme", 0);
            this.f2770u0 = bundle.getBoolean("android:cancelable", true);
            this.f2771v0 = bundle.getBoolean("android:showsDialog", this.f2771v0);
            this.f2772w0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        super.mo3123S7();
        Dialog dialog = this.f2775z0;
        if (dialog != null) {
            this.f2762A0 = true;
            dialog.setOnDismissListener(null);
            this.f2775z0.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.f2775z0);
            }
            this.f2775z0 = null;
            this.f2763B0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: T7 */
    public void mo3126T7() {
        super.mo3126T7();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        m3184o7().m3683h(this.f2774y0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: U7 */
    public LayoutInflater mo3128U7(Bundle bundle) {
        LayoutInflater mo3128U7 = super.mo3128U7(bundle);
        if (this.f2771v0 && !this.f2773x0) {
            m3272x9(bundle);
            if (AbstractC0729o.m3432F0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2775z0;
            if (dialog != null) {
                return mo3128U7.cloneInContext(dialog.getContext());
            }
            return mo3128U7;
        }
        if (AbstractC0729o.m3432F0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f2771v0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            } else {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            }
        }
        return mo3128U7;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: h8 */
    public void mo3167h8(Bundle bundle) {
        super.mo3167h8(bundle);
        Dialog dialog = this.f2775z0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f2768s0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2769t0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f2770u0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f2771v0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f2772w0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: i8 */
    public void mo3170i8() {
        super.mo3170i8();
        Dialog dialog = this.f2775z0;
        if (dialog != null) {
            this.f2762A0 = false;
            dialog.show();
            View decorView = this.f2775z0.getWindow().getDecorView();
            AbstractC0765s.m3748a(decorView, this);
            AbstractC0766t.m3749a(decorView, this);
            AbstractC0838c.m4315a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: j8 */
    public void mo3173j8() {
        super.mo3173j8();
        Dialog dialog = this.f2775z0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: l8 */
    public void mo3179l8(Bundle bundle) {
        Bundle bundle2;
        super.mo3179l8(bundle);
        if (this.f2775z0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2775z0.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: o9 */
    public void mo3278o9() {
        m3271q9(false, false);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f2762A0) {
            if (AbstractC0729o.m3432F0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            m3271q9(true, true);
        }
    }

    /* renamed from: p9 */
    public void mo3279p9() {
        m3271q9(true, false);
    }

    /* renamed from: r9 */
    public Dialog m3280r9() {
        return this.f2775z0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: s8 */
    public void mo3191s8(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo3191s8(layoutInflater, viewGroup, bundle);
        if (this.f2625H == null && this.f2775z0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2775z0.onRestoreInstanceState(bundle2);
        }
    }

    /* renamed from: s9 */
    public int m3281s9() {
        return this.f2769t0;
    }

    /* renamed from: t9 */
    public boolean m3282t9() {
        return this.f2770u0;
    }

    /* renamed from: u9 */
    public Dialog mo3283u9(Bundle bundle) {
        if (AbstractC0729o.m3432F0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m3107M8(), m3281s9());
    }

    /* renamed from: v9 */
    View m3284v9(int i10) {
        Dialog dialog = this.f2775z0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    /* renamed from: w9 */
    boolean m3285w9() {
        return this.f2763B0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: y6 */
    public AbstractC0716g mo3203y6() {
        return new e(super.mo3203y6());
    }

    /* renamed from: y9 */
    public final Dialog m3286y9() {
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            return m3280r9;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: z9 */
    public void m3287z9(boolean z10) {
        this.f2770u0 = z10;
        Dialog dialog = this.f2775z0;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }
}
