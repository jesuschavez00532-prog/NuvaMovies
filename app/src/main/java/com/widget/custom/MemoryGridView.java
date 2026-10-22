package com.widget.custom;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/* loaded from: classes3.dex */
public class MemoryGridView extends GridView {
    private boolean isMemoryFocus;
    private int lastSelectPosition;
    private View lastSelectView;

    public MemoryGridView(Context context) {
        super(context);
        this.isMemoryFocus = true;
        this.lastSelectPosition = -1;
        this.lastSelectView = null;
    }

    public int getLastSelectItemPosition() {
        return this.lastSelectPosition;
    }

    public View getLastSelectView() {
        return this.lastSelectView;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        this.lastSelectPosition = getSelectedItemPosition();
        this.lastSelectView = getSelectedView();
        super.onFocusChanged(z10, i10, rect);
        if (this.lastSelectView == null || this.lastSelectPosition == -1) {
            this.lastSelectPosition = getSelectedItemPosition();
            this.lastSelectView = getSelectedView();
        }
        if (this.isMemoryFocus && z10) {
            setSelection(this.lastSelectPosition);
            if (getOnItemSelectedListener() != null) {
                getOnItemSelectedListener().onItemSelected(this, this.lastSelectView, this.lastSelectPosition, getSelectedItemId());
            }
        }
    }

    public void setIsMemoryFocus(boolean z10) {
        this.isMemoryFocus = z10;
    }

    public void setLastSelectItemPosition(int i10) {
        if (i10 <= 0) {
            i10 = 0;
        }
        this.lastSelectPosition = i10;
    }

    public void setLastSelectView(View view) {
        this.lastSelectView = view;
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
    }

    public MemoryGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isMemoryFocus = true;
        this.lastSelectPosition = -1;
        this.lastSelectView = null;
    }

    public MemoryGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isMemoryFocus = true;
        this.lastSelectPosition = -1;
        this.lastSelectView = null;
    }
}
