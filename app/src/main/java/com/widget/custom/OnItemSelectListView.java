package com.widget.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes3.dex */
public class OnItemSelectListView extends ListView implements View.OnFocusChangeListener {
    private AdapterView.OnItemSelectedListener mOnItemSelectedListener;

    public OnItemSelectListView(Context context) {
        super(context);
        setOnFocusChangeListener(this);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        AdapterView.OnItemSelectedListener onItemSelectedListener;
        if (z10 && (onItemSelectedListener = this.mOnItemSelectedListener) != null) {
            onItemSelectedListener.onItemSelected(this, getSelectedView(), getSelectedItemPosition(), getSelectedItemId());
        }
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.mOnItemSelectedListener = onItemSelectedListener;
        super.setOnItemSelectedListener(onItemSelectedListener);
    }

    public OnItemSelectListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnFocusChangeListener(this);
    }

    public OnItemSelectListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOnFocusChangeListener(this);
    }
}
