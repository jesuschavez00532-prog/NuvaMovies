package com.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class InterceptKeyView extends AutoFrameLayout {

    /* renamed from: a */
    private InterfaceC2872a f10911a;

    /* renamed from: b */
    public Map f10912b = new LinkedHashMap();

    /* renamed from: com.live.view.InterceptKeyView$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2872a {
        /* renamed from: H1 */
        boolean mo11576H1(KeyEvent keyEvent, boolean z10);
    }

    public InterceptKeyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        AbstractC5868k.m23674f(keyEvent, "event");
        InterfaceC2872a interfaceC2872a = this.f10911a;
        if (interfaceC2872a != null) {
            z10 = interfaceC2872a.mo11576H1(keyEvent, true);
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void setOnInterceptKeyEventListener(InterfaceC2872a interfaceC2872a) {
        AbstractC5868k.m23674f(interfaceC2872a, "onInterceptKeyEventListener");
        this.f10911a = interfaceC2872a;
    }
}
