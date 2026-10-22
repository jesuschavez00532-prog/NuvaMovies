package com.umeng.message.api;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3565ak;
import com.umeng.message.proguard.C3702u;

/* loaded from: classes3.dex */
public class UPushInAppMessageHandler {
    public boolean canShowMessage(Context context, UMessage uMessage) {
        return true;
    }

    public final void dismiss() {
        C3565ak.m15312a().mo15317a(C3702u.m15820d());
    }

    public View getView(Context context, UMessage uMessage, FrameLayout.LayoutParams layoutParams) {
        return null;
    }

    public boolean isOnlyShowLatestMessage() {
        return false;
    }

    public void onMessageIgnored(Context context, UMessage uMessage) {
    }
}
