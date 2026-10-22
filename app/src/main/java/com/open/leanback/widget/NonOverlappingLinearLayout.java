package com.open.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class NonOverlappingLinearLayout extends LinearLayout {

    /* renamed from: a */
    boolean f12497a;

    /* renamed from: b */
    boolean f12498b;

    /* renamed from: c */
    final ArrayList f12499c;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void focusableViewAvailable(View view) {
        int i10;
        if (this.f12498b) {
            for (View view2 = view; view2 != this && view2 != null; view2 = (View) view2.getParent()) {
                if (view2.getParent() == this) {
                    i10 = indexOfChild(view2);
                    break;
                }
            }
            i10 = -1;
            if (i10 != -1) {
                ((ArrayList) this.f12499c.get(i10)).add(view);
                return;
            }
            return;
        }
        super.focusableViewAvailable(view);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        int size;
        Object r02 = 0;
        int i14 = 0;
        try {
            if (this.f12497a && getOrientation() == 0 && getLayoutDirection() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f12498b = z11;
            if (z11) {
                while (this.f12499c.size() > getChildCount()) {
                    ArrayList arrayList = this.f12499c;
                    arrayList.remove(arrayList.size() - 1);
                }
                while (this.f12499c.size() < getChildCount()) {
                    this.f12499c.add(new ArrayList());
                }
            }
            super.onLayout(z10, i10, i11, i12, i13);
            if (this.f12498b) {
                for (int i15 = 0; i15 < this.f12499c.size(); i15++) {
                    for (int i16 = 0; i16 < ((ArrayList) this.f12499c.get(i15)).size(); i16++) {
                        super.focusableViewAvailable((View) ((ArrayList) this.f12499c.get(i15)).get(i16));
                    }
                }
            }
            if (z12) {
                while (true) {
                    if (i14 >= size) {
                        return;
                    }
                }
            }
        } finally {
            if (this.f12498b) {
                this.f12498b = false;
                while (r02 < this.f12499c.size()) {
                    ((ArrayList) this.f12499c.get(r02)).clear();
                    r02++;
                }
            }
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z10) {
        this.f12497a = z10;
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12497a = false;
        this.f12499c = new ArrayList();
    }
}
