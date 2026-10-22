package com.vod.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class FocusFirstFrameLayout extends FrameLayout {
    public FocusFirstFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            Object tag = childAt.getTag();
            if ((tag instanceof String) && "focus first".equals((String) tag)) {
                childAt.requestFocus();
                return true;
            }
        }
        return super.requestFocus(i10, rect);
    }
}
