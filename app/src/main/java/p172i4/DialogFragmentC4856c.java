package p172i4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import p219l4.AbstractC5391n;

/* renamed from: i4.c */
/* loaded from: classes.dex */
public class DialogFragmentC4856c extends DialogFragment {

    /* renamed from: a */
    private Dialog f20340a;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f20341b;

    /* renamed from: c */
    private Dialog f20342c;

    /* renamed from: a */
    public static DialogFragmentC4856c m20022a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC4856c dialogFragmentC4856c = new DialogFragmentC4856c();
        Dialog dialog2 = (Dialog) AbstractC5391n.m21784j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC4856c.f20340a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC4856c.f20341b = onCancelListener;
        }
        return dialogFragmentC4856c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f20341b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f20340a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f20342c == null) {
                this.f20342c = new AlertDialog.Builder((Context) AbstractC5391n.m21783i(getActivity())).create();
            }
            return this.f20342c;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
