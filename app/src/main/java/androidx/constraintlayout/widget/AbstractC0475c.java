package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.ArrayList;
import java.util.HashMap;
import p228m.AbstractC5563f;
import p241n.C5701e;
import p241n.C5702f;
import p241n.C5703g;
import p241n.C5705i;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public abstract class AbstractC0475c extends ViewGroup {
    static final boolean ALLOWS_EMBEDDED = false;
    private static final boolean CACHE_MEASURED_DIMENSION = false;
    private static final boolean DEBUG = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-1.1.3";
    SparseArray<View> mChildrenByIds;
    private ArrayList<AbstractC0474b> mConstraintHelpers;
    private C0478f mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    private boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    C5703g mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    private AbstractC5563f mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOptimizationLevel;
    private final ArrayList<C5702f> mVariableDimensionsWidgets;

    public AbstractC0475c(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mVariableDimensionsWidgets = new ArrayList<>(100);
        this.mLayoutWidget = new C5703g();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        m2047b(null);
    }

    /* renamed from: a */
    private final C5702f m2046a(int i10) {
        if (i10 == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).widget;
    }

    /* renamed from: b */
    private void m2047b(AttributeSet attributeSet) {
        this.mLayoutWidget.m22970W(this);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.f2024a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == R$styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == R$styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0478f c0478f = new C0478f();
                        this.mConstraintSet = c0478f;
                        c0478f.m2061d(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m23038d1(this.mOptimizationLevel);
    }

    /* renamed from: c */
    private void m2048c(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int baseline;
        boolean z13;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z14;
        boolean z15;
        boolean z16;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                C5702f c5702f = aVar.widget;
                if (!aVar.isGuideline && !aVar.isHelper) {
                    c5702f.m23016x0(childAt.getVisibility());
                    int i13 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    int i14 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    boolean z17 = aVar.horizontalDimensionFixed;
                    if (!z17 && !(z16 = aVar.verticalDimensionFixed) && ((z17 || aVar.matchConstraintDefaultWidth != 1) && i13 != -1 && (z16 || (aVar.matchConstraintDefaultHeight != 1 && i14 != -1)))) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        if (i13 == 0) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingLeft, -2);
                            z11 = true;
                        } else if (i13 == -1) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingLeft, -1);
                            z11 = false;
                        } else {
                            if (i13 == -2) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z11 = z13;
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingLeft, i13);
                        }
                        if (i14 == 0) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
                            z12 = true;
                        } else if (i14 == -1) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingTop, -1);
                            z12 = false;
                        } else {
                            if (i14 == -2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingTop, i14);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        if (i13 == -2) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        c5702f.m23020z0(z14);
                        if (i14 == -2) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        c5702f.m22976c0(z15);
                        i13 = childAt.getMeasuredWidth();
                        i14 = childAt.getMeasuredHeight();
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                    c5702f.m23018y0(i13);
                    c5702f.m22975b0(i14);
                    if (z11) {
                        c5702f.m22946B0(i13);
                    }
                    if (z12) {
                        c5702f.m22944A0(i14);
                    }
                    if (aVar.needsBaseline && (baseline = childAt.getBaseline()) != -1) {
                        c5702f.m22969V(baseline);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021c  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2049d(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.AbstractC0475c.m2049d(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [androidx.constraintlayout.widget.c, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* renamed from: e */
    private void m2050e() {
        float f10;
        int i10;
        int i11;
        C5702f m2046a;
        C5702f m2046a2;
        C5702f m2046a3;
        C5702f m2046a4;
        int i12;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        Object r32 = 0;
        if (isInEditMode) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m2046a(childAt.getId()).m22971X(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            C5702f viewWidget = getViewWidget(getChildAt(i14));
            if (viewWidget != null) {
                viewWidget.mo22966Q();
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i15 = 0; i15 < childCount; i15++) {
                getChildAt(i15).getId();
                int i16 = this.mConstraintSetId;
            }
        }
        C0478f c0478f = this.mConstraintSet;
        if (c0478f != null) {
            c0478f.m2060a(this);
        }
        this.mLayoutWidget.m23087M0();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i17 = 0; i17 < size; i17++) {
                this.mConstraintHelpers.get(i17).mo2042e(this);
            }
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            getChildAt(i18);
        }
        int i19 = 0;
        while (i19 < childCount) {
            View childAt2 = getChildAt(i19);
            C5702f viewWidget2 = getViewWidget(childAt2);
            if (viewWidget2 != null) {
                a aVar = (a) childAt2.getLayoutParams();
                aVar.validate();
                if (aVar.helped) {
                    aVar.helped = r32;
                } else if (isInEditMode) {
                    try {
                        String resourceName2 = getResources().getResourceName(childAt2.getId());
                        setDesignInformation(r32, resourceName2, Integer.valueOf(childAt2.getId()));
                        m2046a(childAt2.getId()).m22971X(resourceName2.substring(resourceName2.indexOf("id/") + 3));
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                viewWidget2.m23016x0(childAt2.getVisibility());
                if (aVar.isInPlaceholder) {
                    viewWidget2.m23016x0(8);
                }
                viewWidget2.m22970W(childAt2);
                this.mLayoutWidget.m23084I0(viewWidget2);
                if (!aVar.verticalDimensionFixed || !aVar.horizontalDimensionFixed) {
                    this.mVariableDimensionsWidgets.add(viewWidget2);
                }
                if (aVar.isGuideline) {
                    C5705i c5705i = (C5705i) viewWidget2;
                    int i20 = aVar.resolvedGuideBegin;
                    int i21 = aVar.resolvedGuideEnd;
                    float f11 = aVar.resolvedGuidePercent;
                    if (f11 != -1.0f) {
                        c5705i.m23052L0(f11);
                    } else if (i20 != -1) {
                        c5705i.m23050J0(i20);
                    } else if (i21 != -1) {
                        c5705i.m23051K0(i21);
                    }
                } else if (aVar.leftToLeft != -1 || aVar.leftToRight != -1 || aVar.rightToLeft != -1 || aVar.rightToRight != -1 || aVar.startToStart != -1 || aVar.startToEnd != -1 || aVar.endToStart != -1 || aVar.endToEnd != -1 || aVar.topToTop != -1 || aVar.topToBottom != -1 || aVar.bottomToTop != -1 || aVar.bottomToBottom != -1 || aVar.baselineToBaseline != -1 || aVar.editorAbsoluteX != -1 || aVar.editorAbsoluteY != -1 || aVar.circleConstraint != -1 || ((ViewGroup.MarginLayoutParams) aVar).width == -1 || ((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i22 = aVar.resolvedLeftToLeft;
                    int i23 = aVar.resolvedLeftToRight;
                    int i24 = aVar.resolvedRightToLeft;
                    int i25 = aVar.resolvedRightToRight;
                    int i26 = aVar.resolveGoneLeftMargin;
                    int i27 = aVar.resolveGoneRightMargin;
                    float f12 = aVar.resolvedHorizontalBias;
                    int i28 = aVar.circleConstraint;
                    if (i28 != -1) {
                        C5702f m2046a5 = m2046a(i28);
                        if (m2046a5 != null) {
                            viewWidget2.m22979f(m2046a5, aVar.circleAngle, aVar.circleRadius);
                        }
                    } else {
                        if (i22 != -1) {
                            C5702f m2046a6 = m2046a(i22);
                            if (m2046a6 != null) {
                                C5701e.d dVar = C5701e.d.LEFT;
                                f10 = f12;
                                i10 = i27;
                                i11 = i25;
                                viewWidget2.m22960J(dVar, m2046a6, dVar, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i26);
                            } else {
                                f10 = f12;
                                i10 = i27;
                                i11 = i25;
                            }
                        } else {
                            f10 = f12;
                            i10 = i27;
                            i11 = i25;
                            if (i23 != -1 && (m2046a = m2046a(i23)) != null) {
                                viewWidget2.m22960J(C5701e.d.LEFT, m2046a, C5701e.d.RIGHT, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i26);
                            }
                        }
                        if (i24 != -1) {
                            C5702f m2046a7 = m2046a(i24);
                            if (m2046a7 != null) {
                                viewWidget2.m22960J(C5701e.d.RIGHT, m2046a7, C5701e.d.LEFT, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i10);
                            }
                        } else {
                            int i29 = i11;
                            if (i29 != -1 && (m2046a2 = m2046a(i29)) != null) {
                                C5701e.d dVar2 = C5701e.d.RIGHT;
                                viewWidget2.m22960J(dVar2, m2046a2, dVar2, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i10);
                            }
                        }
                        int i30 = aVar.topToTop;
                        if (i30 != -1) {
                            C5702f m2046a8 = m2046a(i30);
                            if (m2046a8 != null) {
                                C5701e.d dVar3 = C5701e.d.TOP;
                                viewWidget2.m22960J(dVar3, m2046a8, dVar3, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.goneTopMargin);
                            }
                        } else {
                            int i31 = aVar.topToBottom;
                            if (i31 != -1 && (m2046a3 = m2046a(i31)) != null) {
                                viewWidget2.m22960J(C5701e.d.TOP, m2046a3, C5701e.d.BOTTOM, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.goneTopMargin);
                            }
                        }
                        int i32 = aVar.bottomToTop;
                        if (i32 != -1) {
                            C5702f m2046a9 = m2046a(i32);
                            if (m2046a9 != null) {
                                viewWidget2.m22960J(C5701e.d.BOTTOM, m2046a9, C5701e.d.TOP, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.goneBottomMargin);
                            }
                        } else {
                            int i33 = aVar.bottomToBottom;
                            if (i33 != -1 && (m2046a4 = m2046a(i33)) != null) {
                                C5701e.d dVar4 = C5701e.d.BOTTOM;
                                viewWidget2.m22960J(dVar4, m2046a4, dVar4, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.goneBottomMargin);
                            }
                        }
                        int i34 = aVar.baselineToBaseline;
                        if (i34 != -1) {
                            View view = this.mChildrenByIds.get(i34);
                            C5702f m2046a10 = m2046a(aVar.baselineToBaseline);
                            if (m2046a10 != null && view != null && (view.getLayoutParams() instanceof a)) {
                                a aVar2 = (a) view.getLayoutParams();
                                aVar.needsBaseline = true;
                                aVar2.needsBaseline = true;
                                C5701e.d dVar5 = C5701e.d.BASELINE;
                                viewWidget2.mo22983h(dVar5).m22926a(m2046a10.mo22983h(dVar5), 0, -1, C5701e.c.STRONG, 0, true);
                                viewWidget2.mo22983h(C5701e.d.TOP).m22938m();
                                viewWidget2.mo22983h(C5701e.d.BOTTOM).m22938m();
                            }
                        }
                        if (f10 >= 0.0f && f10 != 0.5f) {
                            viewWidget2.m22977d0(f10);
                        }
                        float f13 = aVar.verticalBias;
                        if (f13 >= 0.0f && f13 != 0.5f) {
                            viewWidget2.m23004r0(f13);
                        }
                    }
                    if (isInEditMode && ((i12 = aVar.editorAbsoluteX) != -1 || aVar.editorAbsoluteY != -1)) {
                        viewWidget2.m22998o0(i12, aVar.editorAbsoluteY);
                    }
                    if (!aVar.horizontalDimensionFixed) {
                        if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                            viewWidget2.m22982g0(C5702f.b.MATCH_PARENT);
                            viewWidget2.mo22983h(C5701e.d.LEFT).f22760e = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                            viewWidget2.mo22983h(C5701e.d.RIGHT).f22760e = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        } else {
                            viewWidget2.m22982g0(C5702f.b.MATCH_CONSTRAINT);
                            viewWidget2.m23018y0(0);
                        }
                    } else {
                        viewWidget2.m22982g0(C5702f.b.FIXED);
                        viewWidget2.m23018y0(((ViewGroup.MarginLayoutParams) aVar).width);
                    }
                    if (!aVar.verticalDimensionFixed) {
                        if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                            viewWidget2.m23010u0(C5702f.b.MATCH_PARENT);
                            viewWidget2.mo22983h(C5701e.d.TOP).f22760e = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                            viewWidget2.mo22983h(C5701e.d.BOTTOM).f22760e = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            r32 = 0;
                        } else {
                            viewWidget2.m23010u0(C5702f.b.MATCH_CONSTRAINT);
                            r32 = 0;
                            viewWidget2.m22975b0(0);
                        }
                    } else {
                        r32 = 0;
                        viewWidget2.m23010u0(C5702f.b.FIXED);
                        viewWidget2.m22975b0(((ViewGroup.MarginLayoutParams) aVar).height);
                    }
                    String str = aVar.dimensionRatio;
                    if (str != null) {
                        viewWidget2.m22972Y(str);
                    }
                    viewWidget2.m22986i0(aVar.horizontalWeight);
                    viewWidget2.m23014w0(aVar.verticalWeight);
                    viewWidget2.m22978e0(aVar.horizontalChainStyle);
                    viewWidget2.m23006s0(aVar.verticalChainStyle);
                    viewWidget2.m22984h0(aVar.matchConstraintDefaultWidth, aVar.matchConstraintMinWidth, aVar.matchConstraintMaxWidth, aVar.matchConstraintPercentWidth);
                    viewWidget2.m23012v0(aVar.matchConstraintDefaultHeight, aVar.matchConstraintMinHeight, aVar.matchConstraintMaxHeight, aVar.matchConstraintPercentHeight);
                }
            }
            i19++;
            r32 = r32;
        }
    }

    /* renamed from: f */
    private void m2051f(int i10, int i11) {
        int i12;
        C5702f.b bVar;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C5702f.b bVar2 = C5702f.b.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    bVar = bVar2;
                } else {
                    i12 = Math.min(this.mMaxWidth, size) - paddingLeft;
                    bVar = bVar2;
                }
            } else {
                bVar = C5702f.b.WRAP_CONTENT;
            }
            i12 = 0;
        } else {
            i12 = size;
            bVar = C5702f.b.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    size2 = Math.min(this.mMaxHeight, size2) - paddingTop;
                }
            } else {
                bVar2 = C5702f.b.WRAP_CONTENT;
            }
            size2 = 0;
        } else {
            bVar2 = C5702f.b.WRAP_CONTENT;
        }
        this.mLayoutWidget.m22994m0(0);
        this.mLayoutWidget.m22992l0(0);
        this.mLayoutWidget.m22982g0(bVar);
        this.mLayoutWidget.m23018y0(i12);
        this.mLayoutWidget.m23010u0(bVar2);
        this.mLayoutWidget.m22975b0(size2);
        this.mLayoutWidget.m22994m0((this.mMinWidth - getPaddingLeft()) - getPaddingRight());
        this.mLayoutWidget.m22992l0((this.mMinHeight - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: g */
    private void m2052g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            this.mVariableDimensionsWidgets.clear();
            m2050e();
        }
    }

    /* renamed from: h */
    private void m2053h() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10);
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                this.mConstraintHelpers.get(i11).m2044d(this);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i11 = (int) ((parseInt / 1080.0f) * width);
                        int i12 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i11;
                        float f11 = i12;
                        float f12 = i11 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i12 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(AbstractC5563f abstractC5563f) {
        this.mLayoutWidget.m23027R0(abstractC5563f);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public Object getDesignInformation(int i10, Object obj) {
        if (i10 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.mDesignIds;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.mDesignIds.get(str);
            }
            return null;
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m23028S0();
    }

    public View getViewById(int i10) {
        return this.mChildrenByIds.get(i10);
    }

    public final C5702f getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).widget;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            C5702f c5702f = aVar.widget;
            if ((childAt.getVisibility() != 8 || aVar.isGuideline || aVar.isHelper || isInEditMode) && !aVar.isInPlaceholder) {
                int m22999p = c5702f.m22999p();
                int m23001q = c5702f.m23001q();
                childAt.layout(m22999p, m23001q, c5702f.m22949D() + m22999p, c5702f.m23003r() + m23001q);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.mConstraintHelpers.get(i15).mo2041c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.AbstractC0475c.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C5702f viewWidget = getViewWidget(view);
        if ((view instanceof C0480h) && !(viewWidget instanceof C5705i)) {
            a aVar = (a) view.getLayoutParams();
            C5705i c5705i = new C5705i();
            aVar.widget = c5705i;
            aVar.isGuideline = true;
            c5705i.m23053M0(aVar.orientation);
        }
        if (view instanceof AbstractC0474b) {
            AbstractC0474b abstractC0474b = (AbstractC0474b) view;
            abstractC0474b.m2045f();
            ((a) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(abstractC0474b)) {
                this.mConstraintHelpers.add(abstractC0474b);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        C5702f viewWidget = getViewWidget(view);
        this.mLayoutWidget.m23086L0(viewWidget);
        this.mConstraintHelpers.remove(view);
        this.mVariableDimensionsWidgets.remove(viewWidget);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    public void setConstraintSet(C0478f c0478f) {
        this.mConstraintSet = c0478f;
    }

    public void setDesignInformation(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf(Operator.Operation.DIVISION);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.mChildrenByIds.remove(getId());
        super.setId(i10);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i10;
        requestLayout();
    }

    public void setOptimizationLevel(int i10) {
        this.mLayoutWidget.m23038d1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void solveLinearSystem(String str) {
        this.mLayoutWidget.mo23024K0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public AbstractC0475c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mVariableDimensionsWidgets = new ArrayList<>(100);
        this.mLayoutWidget = new C5703g();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        m2047b(attributeSet);
    }

    public AbstractC0475c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mVariableDimensionsWidgets = new ArrayList<>(100);
        this.mLayoutWidget = new C5703g();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        m2047b(attributeSet);
    }

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public int baselineToBaseline;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String dimensionRatio;
        int dimensionRatioSide;
        float dimensionRatioValue;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        boolean horizontalDimensionFixed;
        public float horizontalWeight;
        boolean isGuideline;
        boolean isHelper;
        boolean isInPlaceholder;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        boolean needsBaseline;
        public int orientation;
        int resolveGoneLeftMargin;
        int resolveGoneRightMargin;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias;
        int resolvedLeftToLeft;
        int resolvedLeftToRight;
        int resolvedRightToLeft;
        int resolvedRightToRight;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        boolean verticalDimensionFixed;
        public float verticalWeight;
        C5702f widget;

        /* renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C7796a {

            /* renamed from: a */
            public static final SparseIntArray f2037a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2037a = sparseIntArray;
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i10;
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new C5702f();
            this.helped = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2024a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = C7796a.f2037a.get(index);
                switch (i12) {
                    case 1:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId == -1) {
                            this.circleConstraint = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f10;
                        if (f10 < 0.0f) {
                            this.circleAngle = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 == -1) {
                            this.leftToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 == -1) {
                            this.leftToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 == -1) {
                            this.rightToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 == -1) {
                            this.rightToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 == -1) {
                            this.topToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 == -1) {
                            this.topToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 == -1) {
                            this.bottomToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 == -1) {
                            this.bottomToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 == -1) {
                            this.baselineToBaseline = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 == -1) {
                            this.startToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 == -1) {
                            this.startToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 == -1) {
                            this.endToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 == -1) {
                            this.endToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultWidth = i13;
                        if (i13 == 1) {
                            Log.e(AbstractC0475c.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i14 = obtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultHeight = i14;
                        if (i14 == 1) {
                            Log.e(AbstractC0475c.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.matchConstraintMinWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.dimensionRatio = string;
                                this.dimensionRatioValue = Float.NaN;
                                this.dimensionRatioSide = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.dimensionRatio.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String substring = this.dimensionRatio.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.dimensionRatioSide = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.dimensionRatioSide = 1;
                                        }
                                        i10 = indexOf + 1;
                                    }
                                    int indexOf2 = this.dimensionRatio.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.dimensionRatio.substring(i10, indexOf2);
                                        String substring3 = this.dimensionRatio.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.dimensionRatioSide == 1) {
                                                        this.dimensionRatioValue = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.dimensionRatioValue = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.dimensionRatio.substring(i10);
                                        if (substring4.length() > 0) {
                                            this.dimensionRatioValue = Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            validate();
        }

        public void reset() {
            C5702f c5702f = this.widget;
            if (c5702f != null) {
                c5702f.mo22966Q();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r7) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.AbstractC0475c.a.resolveLayoutDirection(int):void");
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                this.matchConstraintDefaultWidth = 1;
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                this.matchConstraintDefaultHeight = 1;
            }
            if (i10 == 0 || i10 == -1) {
                this.horizontalDimensionFixed = false;
                if (i10 == 0 && this.matchConstraintDefaultWidth == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.verticalDimensionFixed = false;
                if (i11 == 0 && this.matchConstraintDefaultHeight == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent != -1.0f || this.guideBegin != -1 || this.guideEnd != -1) {
                this.isGuideline = true;
                this.horizontalDimensionFixed = true;
                this.verticalDimensionFixed = true;
                if (!(this.widget instanceof C5705i)) {
                    this.widget = new C5705i();
                }
                ((C5705i) this.widget).m23053M0(this.orientation);
            }
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new C5702f();
            this.helped = false;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new C5702f();
            this.helped = false;
        }
    }
}
