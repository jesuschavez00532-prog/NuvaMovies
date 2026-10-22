package com.vod.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.umeng.analytics.pro.C3384f;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes3.dex */
public final class MainFocusListView extends ListView {

    /* renamed from: a */
    public Map f17443a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MainFocusListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if (hasFocus() && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFocusListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17443a = new LinkedHashMap();
    }

    public /* synthetic */ MainFocusListView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
