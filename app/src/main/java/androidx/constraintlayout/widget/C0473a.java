package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p241n.C5698b;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C0473a extends AbstractC0474b {

    /* renamed from: g */
    private int f2028g;

    /* renamed from: h */
    private int f2029h;

    /* renamed from: i */
    private C5698b f2030i;

    public C0473a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0474b
    /* renamed from: b */
    public void mo2040b(AttributeSet attributeSet) {
        super.mo2040b(attributeSet);
        this.f2030i = new C5698b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f2024a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2030i.m22914K0(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f2034d = this.f2030i;
        m2045f();
    }

    public int getType() {
        return this.f2028g;
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f2030i.m22914K0(z10);
    }

    public void setType(int i10) {
        boolean z10;
        this.f2028g = i10;
        this.f2029h = i10;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = this.f2028g;
            if (i11 == 5) {
                this.f2029h = 1;
            } else if (i11 == 6) {
                this.f2029h = 0;
            }
        } else {
            int i12 = this.f2028g;
            if (i12 == 5) {
                this.f2029h = 0;
            } else if (i12 == 6) {
                this.f2029h = 1;
            }
        }
        this.f2030i.m22915L0(this.f2029h);
    }
}
