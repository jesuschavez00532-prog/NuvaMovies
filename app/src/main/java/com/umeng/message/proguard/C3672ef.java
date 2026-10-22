package com.umeng.message.proguard;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.umeng.message.proguard.C3674eh;

/* renamed from: com.umeng.message.proguard.ef */
/* loaded from: classes3.dex */
public final class C3672ef extends C3674eh {

    /* renamed from: a */
    private View.OnClickListener f16455a;

    public C3672ef(Context context) {
        super(context);
        setLayerType(1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean bool;
        if (this.f16455a != null) {
            if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                View.OnClickListener onClickListener = this.f16455a;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.umeng.message.proguard.C3674eh
    public final C3674eh.a getOnStatusListener() {
        return super.getOnStatusListener();
    }

    public final void setDismissListener(View.OnClickListener onClickListener) {
        this.f16455a = onClickListener;
    }
}
