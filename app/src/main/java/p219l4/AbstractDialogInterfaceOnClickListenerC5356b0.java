package p219l4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p203k4.InterfaceC5108e;

/* renamed from: l4.b0 */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC5356b0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static AbstractDialogInterfaceOnClickListenerC5356b0 m21645b(Activity activity, Intent intent, int i10) {
        return new C5418z(intent, activity, i10);
    }

    /* renamed from: c */
    public static AbstractDialogInterfaceOnClickListenerC5356b0 m21646c(InterfaceC5108e interfaceC5108e, Intent intent, int i10) {
        return new C5353a0(intent, interfaceC5108e, 2);
    }

    /* renamed from: a */
    protected abstract void mo21643a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            mo21643a();
        } catch (ActivityNotFoundException e10) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e10);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
