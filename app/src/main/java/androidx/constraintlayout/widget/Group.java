package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC0475c;

/* loaded from: classes.dex */
public class Group extends AbstractC0474b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0474b
    /* renamed from: b */
    public void mo2040b(AttributeSet attributeSet) {
        super.mo2040b(attributeSet);
        this.f2035e = false;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0474b
    /* renamed from: c */
    public void mo2041c(AbstractC0475c abstractC0475c) {
        AbstractC0475c.a aVar = (AbstractC0475c.a) getLayoutParams();
        aVar.widget.m23018y0(0);
        aVar.widget.m22975b0(0);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0474b
    /* renamed from: e */
    public void mo2042e(AbstractC0475c abstractC0475c) {
        float f10;
        int visibility = getVisibility();
        if (Build.VERSION.SDK_INT >= 21) {
            f10 = getElevation();
        } else {
            f10 = 0.0f;
        }
        for (int i10 = 0; i10 < this.f2032b; i10++) {
            View viewById = abstractC0475c.getViewById(this.f2031a[i10]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (f10 > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    viewById.setElevation(f10);
                }
            }
        }
    }
}
