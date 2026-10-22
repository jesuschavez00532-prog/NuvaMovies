package com.umeng.message.proguard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.umeng.message.UTrack;
import com.umeng.message.api.UPushInAppMessageCallback;
import com.umeng.message.common.UPLog;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.umeng.message.proguard.at */
/* loaded from: classes3.dex */
public final class C3574at extends FrameLayout {

    /* renamed from: a */
    private View.OnClickListener f15987a;

    /* renamed from: b */
    private final C3570ap f15988b;

    public C3574at(Context context, C3570ap c3570ap) {
        super(context);
        setLayerType(1, null);
        this.f15988b = c3570ap;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean bool;
        if (this.f15987a != null) {
            if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                View.OnClickListener onClickListener = this.f15987a;
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

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            UPLog.m15198i("Pop", "attach", this.f15988b.f15961a.getMsgId());
            UTrack.getInstance().trackInAppNotifyShow(this.f15988b.f15961a);
            UPushInAppMessageCallback inAppMessageCallback = C3703v.m15825a().getInAppMessageCallback();
            if (inAppMessageCallback != null) {
                inAppMessageCallback.onShow(C3706y.m15840a(), this.f15988b.f15961a);
            }
        } catch (Throwable th) {
            UPLog.m15197e("Pop", "onAttachedToWindow", th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            UPLog.m15198i("Pop", "detach", this.f15988b.f15961a.getMsgId());
            UPushInAppMessageCallback inAppMessageCallback = C3703v.m15825a().getInAppMessageCallback();
            if (inAppMessageCallback != null) {
                inAppMessageCallback.onDismiss(C3706y.m15840a(), this.f15988b.f15961a);
            }
        } catch (Throwable th) {
            UPLog.m15197e("Pop", "onDetachedFromWindow", th);
        }
    }

    public final void setDismissListener(View.OnClickListener onClickListener) {
        this.f15987a = onClickListener;
    }
}
