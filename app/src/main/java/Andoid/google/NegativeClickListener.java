package Andoid.google;

import android.content.DialogInterface;
import np.dcc.protect.EntryPoint;

/* loaded from: classes.dex */
public class NegativeClickListener implements DialogInterface.OnClickListener {
    static {
        EntryPoint.stub(22);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public native void onClick(DialogInterface dialogInterface, int i10);
}
