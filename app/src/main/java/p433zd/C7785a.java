package p433zd;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.zhy.autolayout.C3913a;
import com.zhy.autolayout.R$styleable;
import p403xd.C7632b;
import p403xd.C7633c;
import p403xd.C7634d;
import p403xd.C7635e;
import p403xd.C7636f;
import p403xd.C7637g;
import p403xd.C7638h;
import p403xd.C7639i;
import p403xd.C7640j;
import p403xd.C7641k;
import p403xd.C7642l;
import p403xd.C7643m;
import p403xd.C7644n;
import p403xd.C7645o;
import p403xd.C7646p;
import p403xd.C7647q;
import p403xd.C7648r;
import p419yd.C7706a;

/* renamed from: zd.a */
/* loaded from: classes3.dex */
public class C7785a {

    /* renamed from: b */
    private static final int[] f28714b = {R.attr.textSize, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.layout_width, R.attr.layout_height, R.attr.layout_margin, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight};

    /* renamed from: c */
    private static C7706a f28715c;

    /* renamed from: a */
    private final ViewGroup f28716a;

    /* renamed from: zd.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        C3913a getAutoLayoutInfo();
    }

    public C7785a(ViewGroup viewGroup) {
        this.f28716a = viewGroup;
        if (f28715c == null) {
            m30155c(viewGroup);
        }
    }

    /* renamed from: b */
    public static C3913a m30154b(Context context, AttributeSet attributeSet) {
        C3913a c3913a = new C3913a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f17572i);
        int i10 = obtainStyledAttributes.getInt(R$styleable.AutoLayout_Layout_layout_auto_basewidth, 0);
        int i11 = obtainStyledAttributes.getInt(R$styleable.AutoLayout_Layout_layout_auto_baseheight, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f28714b);
        int indexCount = obtainStyledAttributes2.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = obtainStyledAttributes2.getIndex(i12);
            if (AbstractC7787c.m30169b(obtainStyledAttributes2.peekValue(index))) {
                try {
                    int dimensionPixelOffset = obtainStyledAttributes2.getDimensionPixelOffset(index, 0);
                    switch (index) {
                        case 0:
                            c3913a.m16743a(new C7647q(dimensionPixelOffset, i10, i11));
                            break;
                        case 1:
                            c3913a.m16743a(new C7642l(dimensionPixelOffset, i10, i11));
                            break;
                        case 2:
                            c3913a.m16743a(new C7644n(dimensionPixelOffset, i10, i11));
                            break;
                        case 3:
                            c3913a.m16743a(new C7646p(dimensionPixelOffset, i10, i11));
                            break;
                        case 4:
                            c3913a.m16743a(new C7645o(dimensionPixelOffset, i10, i11));
                            break;
                        case 5:
                            c3913a.m16743a(new C7643m(dimensionPixelOffset, i10, i11));
                            break;
                        case 6:
                            c3913a.m16743a(new C7648r(dimensionPixelOffset, i10, i11));
                            break;
                        case 7:
                            c3913a.m16743a(new C7632b(dimensionPixelOffset, i10, i11));
                            break;
                        case 8:
                            c3913a.m16743a(new C7633c(dimensionPixelOffset, i10, i11));
                            break;
                        case 9:
                            c3913a.m16743a(new C7635e(dimensionPixelOffset, i10, i11));
                            break;
                        case 10:
                            c3913a.m16743a(new C7637g(dimensionPixelOffset, i10, i11));
                            break;
                        case 11:
                            c3913a.m16743a(new C7636f(dimensionPixelOffset, i10, i11));
                            break;
                        case 12:
                            c3913a.m16743a(new C7634d(dimensionPixelOffset, i10, i11));
                            break;
                        case 13:
                            c3913a.m16743a(new C7639i(dimensionPixelOffset, i10, i11));
                            break;
                        case 14:
                            c3913a.m16743a(new C7638h(dimensionPixelOffset, i10, i11));
                            break;
                        case 15:
                            c3913a.m16743a(new C7641k(dimensionPixelOffset, i10, i11));
                            break;
                        case 16:
                            c3913a.m16743a(new C7640j(dimensionPixelOffset, i10, i11));
                            break;
                    }
                } catch (Exception unused) {
                }
            }
        }
        obtainStyledAttributes2.recycle();
        AbstractC7788d.m30170a(" getAutoLayoutInfo " + c3913a.toString());
        return c3913a;
    }

    /* renamed from: c */
    private void m30155c(ViewGroup viewGroup) {
        C7706a m29774d = C7706a.m29774d();
        f28715c = m29774d;
        m29774d.m29781h(viewGroup.getContext());
    }

    /* renamed from: a */
    public void m30156a() {
        C3913a autoLayoutInfo;
        C7706a.m29774d().m29776a();
        int childCount = this.f28716a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f28716a.getChildAt(i10);
            Object layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof a) && (autoLayoutInfo = ((a) layoutParams).getAutoLayoutInfo()) != null) {
                autoLayoutInfo.m16744b(childAt);
            }
        }
    }
}
