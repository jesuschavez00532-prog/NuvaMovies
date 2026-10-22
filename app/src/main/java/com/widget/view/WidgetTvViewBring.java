package com.widget.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class WidgetTvViewBring {
    private int position = 0;

    public WidgetTvViewBring() {
    }

    public void bringChildToFront(ViewGroup viewGroup, View view) {
        int indexOfChild = viewGroup.indexOfChild(view);
        this.position = indexOfChild;
        if (indexOfChild != -1) {
            viewGroup.postInvalidate();
        }
    }

    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.position;
        if (i12 != -1) {
            int i13 = i10 - 1;
            if (i11 == i13) {
                return i12;
            }
            if (i11 == i12) {
                return i13;
            }
        }
        return i11;
    }

    public WidgetTvViewBring(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }
}
