package com.open.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.open.leanback.R$styleable;

/* loaded from: classes2.dex */
public class VerticalGridView extends AbstractC3050a {

    /* renamed from: m */
    private int f12500m;

    public VerticalGridView(Context context) {
        this(context, null);
    }

    @Override // com.open.leanback.widget.AbstractC3050a, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int childAdapterPosition;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 20 && this.f12500m > 1) {
            RecyclerView.AbstractC0797p layoutManager = getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                int itemCount = layoutManager.getItemCount();
                int i10 = itemCount % this.f12500m;
                View focusedChild = getFocusedChild();
                if (focusedChild != null && i10 != 0 && (childAdapterPosition = getChildAdapterPosition(focusedChild)) < itemCount - i10 && childAdapterPosition >= itemCount - this.f12500m) {
                    setSelectedPositionSmooth(itemCount - 1);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    protected void m12515g(Context context, AttributeSet attributeSet) {
        m12519e(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f12398c0);
        setColumnWidth(obtainStyledAttributes);
        setNumColumns(obtainStyledAttributes.getInt(R$styleable.lbVerticalGridView_numberOfColumns, 1));
        obtainStyledAttributes.recycle();
    }

    void setColumnWidth(TypedArray typedArray) {
        int i10 = R$styleable.lbVerticalGridView_columnWidth;
        if (typedArray.peekValue(i10) != null) {
            setColumnWidth(typedArray.getLayoutDimension(i10, 0));
        }
    }

    public void setNumColumns(int i10) {
        this.f12501a.m12449j1(i10);
        this.f12500m = i10;
        requestLayout();
    }

    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12501a.setOrientation(1);
        m12515g(context, attributeSet);
    }

    public void setColumnWidth(int i10) {
        this.f12501a.m12461o1(i10);
        requestLayout();
    }
}
