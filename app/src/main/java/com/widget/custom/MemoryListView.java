package com.widget.custom;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.widget.custom.adapter.BaseAdapterImpl;

/* loaded from: classes3.dex */
public class MemoryListView extends ListView {
    private int forceToSelectPosition;
    private int ignoreDirection;
    private int selectPosition;

    public MemoryListView(Context context) {
        super(context);
        this.selectPosition = -1;
        this.forceToSelectPosition = -1;
        this.ignoreDirection = -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11;
        int selectedItemPosition = getSelectedItemPosition();
        super.onFocusChanged(z10, i10, rect);
        if (!(getAdapter() instanceof BaseAdapterImpl)) {
            return;
        }
        View selectedView = getSelectedView();
        if (selectedView != null) {
            i11 = (int) selectedView.getY();
        } else {
            i11 = 0;
        }
        BaseAdapterImpl baseAdapterImpl = (BaseAdapterImpl) getAdapter();
        if (z10) {
            int i12 = this.selectPosition;
            if (i12 >= 0) {
                setSelectionFromTop(i12, 0);
                baseAdapterImpl.setSecondPosition(-1);
                this.selectPosition = -1;
            } else {
                setSelectionFromTop(selectedItemPosition, i11);
                baseAdapterImpl.setSecondPosition(-1);
            }
            int i13 = this.forceToSelectPosition;
            if (i13 != -1 && this.ignoreDirection != i10) {
                if (i13 == selectedItemPosition) {
                    AdapterView.OnItemSelectedListener onItemSelectedListener = getOnItemSelectedListener();
                    int i14 = this.forceToSelectPosition;
                    onItemSelectedListener.onItemSelected(null, null, i14, i14);
                } else {
                    setSelectionTriggerItemSelect(i13);
                }
            }
            this.forceToSelectPosition = -1;
            return;
        }
        baseAdapterImpl.setSecondPosition(selectedItemPosition);
    }

    public void setForceSelectWhenGetFocus(int i10, int i11) {
        this.forceToSelectPosition = i10;
        this.ignoreDirection = i11;
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public void setSelection(int i10) {
        this.selectPosition = i10;
    }

    public void setSelectionTriggerItemSelect(int i10) {
        super.setSelection(i10);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
    }

    public MemoryListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.selectPosition = -1;
        this.forceToSelectPosition = -1;
        this.ignoreDirection = -1;
    }

    public MemoryListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.selectPosition = -1;
        this.forceToSelectPosition = -1;
        this.ignoreDirection = -1;
    }
}
