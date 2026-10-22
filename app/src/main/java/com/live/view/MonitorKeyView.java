package com.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class MonitorKeyView extends FrameLayout {

    /* renamed from: a */
    private InterfaceC5642a f10924a;

    /* renamed from: b */
    public Map f10925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonitorKeyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f10925b = new LinkedHashMap();
    }

    /* renamed from: a */
    public final void m11591a(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, Constants.KEY_MONIROT);
        this.f10924a = interfaceC5642a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC5642a interfaceC5642a;
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        boolean z10 = false;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        }
        if (z10 && dispatchKeyEvent && (interfaceC5642a = this.f10924a) != null) {
            interfaceC5642a.invoke();
        }
        return dispatchKeyEvent;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }
}
