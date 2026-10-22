package com.widget.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class CustomRelativeLayout extends AutoFrameLayout implements View.OnFocusChangeListener, View.OnClickListener {
    private View mHasFocusView;
    private View mLoseFocusView;
    private OnItemClickListener mOnItemClickListener;
    private OnItemFocusChangeListener mOnItemFocusChangeListener;
    private int mOnKeyDirection;
    private List<Integer> viewDirection;

    /* loaded from: classes3.dex */
    public interface OnItemClickListener {
        void onItemClick(View view);
    }

    /* loaded from: classes3.dex */
    public interface OnItemFocusChangeListener {
        void onItemFocusChange(View view, boolean z10);

        void onLayoutFocusChange(View view, boolean z10);
    }

    public CustomRelativeLayout(Context context) {
        this(context, null);
    }

    private boolean hasDirectDefine(View view, String str) {
        if (view != null && view.getTag() != null) {
            return ((String) view.getTag()).contains(str);
        }
        return false;
    }

    public void clearState() {
        this.mHasFocusView = null;
        this.mLoseFocusView = null;
        setFocusable(false);
        setDescendantFocusability(262144);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        this.mOnKeyDirection = i10;
        return super.focusSearch(view, i10);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        OnItemClickListener onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(view);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        if (z10 && view == this.mLoseFocusView) {
            OnItemFocusChangeListener onItemFocusChangeListener = this.mOnItemFocusChangeListener;
            if (onItemFocusChangeListener != null) {
                onItemFocusChangeListener.onLayoutFocusChange(view, true);
            }
        } else if (!z10 && this.mHasFocusView == view && (this.viewDirection.contains(Integer.valueOf(this.mOnKeyDirection)) || ((this.mOnKeyDirection == 17 && hasDirectDefine(view, "left")) || ((this.mOnKeyDirection == 66 && hasDirectDefine(view, "right")) || ((this.mOnKeyDirection == 33 && hasDirectDefine(view, C3384f.f14557R)) || (this.mOnKeyDirection == 130 && hasDirectDefine(view, "down"))))))) {
            setFocusable(true);
            setDescendantFocusability(393216);
            OnItemFocusChangeListener onItemFocusChangeListener2 = this.mOnItemFocusChangeListener;
            if (onItemFocusChangeListener2 != null) {
                onItemFocusChangeListener2.onLayoutFocusChange(view, false);
            }
        } else {
            OnItemFocusChangeListener onItemFocusChangeListener3 = this.mOnItemFocusChangeListener;
            if (onItemFocusChangeListener3 != null) {
                onItemFocusChangeListener3.onItemFocusChange(view, z10);
            }
        }
        if (z10) {
            this.mHasFocusView = view;
        } else {
            this.mLoseFocusView = view;
        }
    }

    public void setChildView(View... viewArr) {
        for (View view : viewArr) {
            view.setOnFocusChangeListener(this);
            view.setOnClickListener(this);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public void setOnItemFocusChangeListener(OnItemFocusChangeListener onItemFocusChangeListener) {
        this.mOnItemFocusChangeListener = onItemFocusChangeListener;
    }

    public void setViewDirection(int... iArr) {
        this.viewDirection.clear();
        for (int i10 : iArr) {
            this.viewDirection.add(Integer.valueOf(i10));
        }
    }

    public CustomRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mOnKeyDirection = -1;
        this.viewDirection = new ArrayList(66);
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.widget.custom.CustomRelativeLayout.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z10) {
                if (z10) {
                    CustomRelativeLayout.this.setDescendantFocusability(262144);
                    if (CustomRelativeLayout.this.mLoseFocusView != null) {
                        CustomRelativeLayout.this.mLoseFocusView.requestFocus();
                    }
                    CustomRelativeLayout.this.setFocusable(false);
                }
            }
        });
    }
}
