package Andoid.google;

import android.content.DialogInterface;
import np.dcc.protect.EntryPoint;

/* loaded from: classes.dex */
public class NeutralClickListener implements DialogInterface.OnClickListener {
    static {
        EntryPoint.stub(23);
    }

    protected native void dismiss(Object obj);

    @Override // android.content.DialogInterface.OnClickListener
    public native void onClick(DialogInterface dialogInterface, int i10);
}
