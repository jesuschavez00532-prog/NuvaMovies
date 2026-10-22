package p172i4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import p219l4.AbstractC5391n;

/* renamed from: i4.s */
/* loaded from: classes.dex */
public class C4888s extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: C0 */
    private Dialog f20393C0;

    /* renamed from: D0 */
    private DialogInterface.OnCancelListener f20394D0;

    /* renamed from: E0 */
    private Dialog f20395E0;

    /* renamed from: F9 */
    public static C4888s m20097F9(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C4888s c4888s = new C4888s();
        Dialog dialog2 = (Dialog) AbstractC5391n.m21784j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c4888s.f20393C0 = dialog2;
        if (onCancelListener != null) {
            c4888s.f20394D0 = onCancelListener;
        }
        return c4888s;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: E9 */
    public void mo3277E9(AbstractC0729o abstractC0729o, String str) {
        super.mo3277E9(abstractC0729o, str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f20394D0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: u9 */
    public Dialog mo3283u9(Bundle bundle) {
        Dialog dialog = this.f20393C0;
        if (dialog == null) {
            m3273A9(false);
            if (this.f20395E0 == null) {
                this.f20395E0 = new AlertDialog.Builder((Context) AbstractC5391n.m21783i(m3096J6())).create();
            }
            return this.f20395E0;
        }
        return dialog;
    }
}
