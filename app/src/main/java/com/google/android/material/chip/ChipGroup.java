package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.AbstractC2585c;
import com.google.android.material.internal.AbstractC2588f;

/* loaded from: classes.dex */
public class ChipGroup extends AbstractC2585c {

    /* renamed from: d */
    private int f9541d;

    /* renamed from: e */
    private int f9542e;

    /* renamed from: f */
    private boolean f9543f;

    /* renamed from: g */
    private final C2543b f9544g;

    /* renamed from: h */
    private ViewGroupOnHierarchyChangeListenerC2546e f9545h;

    /* renamed from: i */
    private int f9546i;

    /* renamed from: j */
    private boolean f9547j;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    /* loaded from: classes.dex */
    private class C2543b implements CompoundButton.OnCheckedChangeListener {
        private C2543b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (ChipGroup.this.f9547j) {
                return;
            }
            int id2 = compoundButton.getId();
            if (z10) {
                if (ChipGroup.this.f9546i != -1 && ChipGroup.this.f9546i != id2 && ChipGroup.this.f9543f) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.m10303k(chipGroup.f9546i, false);
                }
                ChipGroup.this.setCheckedId(id2);
                return;
            }
            if (ChipGroup.this.f9546i == id2) {
                ChipGroup.this.setCheckedId(-1);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    /* loaded from: classes.dex */
    public static class C2544c extends ViewGroup.MarginLayoutParams {
        public C2544c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2544c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C2544c(int i10, int i11) {
            super(i10, i11);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2545d {
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    /* loaded from: classes.dex */
    private class ViewGroupOnHierarchyChangeListenerC2546e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        private ViewGroup.OnHierarchyChangeListener f9549a;

        private ViewGroupOnHierarchyChangeListenerC2546e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f9544g);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f9549a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f9549a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.chipGroupStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m10303k(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof Chip) {
            this.f9547j = true;
            ((Chip) findViewById).setChecked(z10);
            this.f9547j = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i10) {
        this.f9546i = i10;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i11 = this.f9546i;
                if (i11 != -1 && this.f9543f) {
                    m10303k(i11, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // com.google.android.material.internal.AbstractC2585c
    /* renamed from: b */
    public boolean mo10304b() {
        return super.mo10304b();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2544c)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2544c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2544c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f9543f) {
            return this.f9546i;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f9541d;
    }

    public int getChipSpacingVertical() {
        return this.f9542e;
    }

    /* renamed from: j */
    public void m10305j() {
        this.f9547j = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f9547j = false;
        setCheckedId(-1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f9546i;
        if (i10 != -1) {
            m10303k(i10, true);
            setCheckedId(this.f9546i);
        }
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f9541d != i10) {
            this.f9541d = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f9542e != i10) {
            this.f9542e = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC2545d interfaceC2545d) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9545h.f9549a = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.AbstractC2585c
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        if (this.f9543f != z10) {
            this.f9543f = z10;
            m10305j();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9544g = new C2543b();
        this.f9545h = new ViewGroupOnHierarchyChangeListenerC2546e();
        this.f9546i = -1;
        this.f9547j = false;
        TypedArray m10660k = AbstractC2588f.m10660k(context, attributeSet, R$styleable.f9371z, i10, R$style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = m10660k.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(m10660k.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(m10660k.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(m10660k.getBoolean(R$styleable.ChipGroup_singleLine, false));
        setSingleSelection(m10660k.getBoolean(R$styleable.ChipGroup_singleSelection, false));
        int resourceId = m10660k.getResourceId(R$styleable.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f9546i = resourceId;
        }
        m10660k.recycle();
        super.setOnHierarchyChangeListener(this.f9545h);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2544c(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
