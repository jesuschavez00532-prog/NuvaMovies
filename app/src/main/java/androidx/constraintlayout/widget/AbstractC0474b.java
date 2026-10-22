package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.AbstractC0475c;
import java.util.Arrays;
import p241n.AbstractC5706j;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC0474b extends View {

    /* renamed from: a */
    protected int[] f2031a;

    /* renamed from: b */
    protected int f2032b;

    /* renamed from: c */
    protected Context f2033c;

    /* renamed from: d */
    protected AbstractC5706j f2034d;

    /* renamed from: e */
    protected boolean f2035e;

    /* renamed from: f */
    private String f2036f;

    public AbstractC0474b(Context context) {
        super(context);
        this.f2031a = new int[32];
        this.f2035e = false;
        this.f2033c = context;
        mo2040b(null);
    }

    /* renamed from: a */
    private void m2043a(String str) {
        int i10;
        Object designInformation;
        if (str == null || this.f2033c == null) {
            return;
        }
        String trim = str.trim();
        try {
            i10 = R$id.class.getField(trim).getInt(null);
        } catch (Exception unused) {
            i10 = 0;
        }
        if (i10 == 0) {
            i10 = this.f2033c.getResources().getIdentifier(trim, "id", this.f2033c.getPackageName());
        }
        if (i10 == 0 && isInEditMode() && (getParent() instanceof AbstractC0475c) && (designInformation = ((AbstractC0475c) getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
            i10 = ((Integer) designInformation).intValue();
        }
        if (i10 != 0) {
            setTag(i10, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                m2043a(str.substring(i10));
                return;
            } else {
                m2043a(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2040b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f2024a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2036f = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2041c(AbstractC0475c abstractC0475c) {
    }

    /* renamed from: d */
    public void m2044d(AbstractC0475c abstractC0475c) {
    }

    /* renamed from: e */
    public void mo2042e(AbstractC0475c abstractC0475c) {
        if (isInEditMode()) {
            setIds(this.f2036f);
        }
        AbstractC5706j abstractC5706j = this.f2034d;
        if (abstractC5706j == null) {
            return;
        }
        abstractC5706j.m23055J0();
        for (int i10 = 0; i10 < this.f2032b; i10++) {
            View viewById = abstractC0475c.getViewById(this.f2031a[i10]);
            if (viewById != null) {
                this.f2034d.m23054I0(abstractC0475c.getViewWidget(viewById));
            }
        }
    }

    /* renamed from: f */
    public void m2045f() {
        if (this.f2034d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof AbstractC0475c.a) {
            ((AbstractC0475c.a) layoutParams).widget = this.f2034d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2031a, this.f2032b);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f2035e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2032b = 0;
        for (int i10 : iArr) {
            setTag(i10, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        int i11 = this.f2032b + 1;
        int[] iArr = this.f2031a;
        if (i11 > iArr.length) {
            this.f2031a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2031a;
        int i12 = this.f2032b;
        iArr2[i12] = i10;
        this.f2032b = i12 + 1;
    }

    public AbstractC0474b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2031a = new int[32];
        this.f2035e = false;
        this.f2033c = context;
        mo2040b(attributeSet);
    }
}
