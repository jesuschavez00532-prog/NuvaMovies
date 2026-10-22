package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.AbstractC0475c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.f */
/* loaded from: classes.dex */
public class C0478f {

    /* renamed from: b */
    private static final int[] f2038b = {0, 4, 8};

    /* renamed from: c */
    private static SparseIntArray f2039c;

    /* renamed from: a */
    private HashMap f2040a = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.constraintlayout.widget.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: A */
        public int f2041A;

        /* renamed from: B */
        public int f2042B;

        /* renamed from: C */
        public int f2043C;

        /* renamed from: D */
        public int f2044D;

        /* renamed from: E */
        public int f2045E;

        /* renamed from: F */
        public int f2046F;

        /* renamed from: G */
        public int f2047G;

        /* renamed from: H */
        public int f2048H;

        /* renamed from: I */
        public int f2049I;

        /* renamed from: J */
        public int f2050J;

        /* renamed from: K */
        public int f2051K;

        /* renamed from: L */
        public int f2052L;

        /* renamed from: M */
        public int f2053M;

        /* renamed from: N */
        public int f2054N;

        /* renamed from: O */
        public int f2055O;

        /* renamed from: P */
        public int f2056P;

        /* renamed from: Q */
        public float f2057Q;

        /* renamed from: R */
        public float f2058R;

        /* renamed from: S */
        public int f2059S;

        /* renamed from: T */
        public int f2060T;

        /* renamed from: U */
        public float f2061U;

        /* renamed from: V */
        public boolean f2062V;

        /* renamed from: W */
        public float f2063W;

        /* renamed from: X */
        public float f2064X;

        /* renamed from: Y */
        public float f2065Y;

        /* renamed from: Z */
        public float f2066Z;

        /* renamed from: a */
        boolean f2067a;

        /* renamed from: a0 */
        public float f2068a0;

        /* renamed from: b */
        public int f2069b;

        /* renamed from: b0 */
        public float f2070b0;

        /* renamed from: c */
        public int f2071c;

        /* renamed from: c0 */
        public float f2072c0;

        /* renamed from: d */
        int f2073d;

        /* renamed from: d0 */
        public float f2074d0;

        /* renamed from: e */
        public int f2075e;

        /* renamed from: e0 */
        public float f2076e0;

        /* renamed from: f */
        public int f2077f;

        /* renamed from: f0 */
        public float f2078f0;

        /* renamed from: g */
        public float f2079g;

        /* renamed from: g0 */
        public float f2080g0;

        /* renamed from: h */
        public int f2081h;

        /* renamed from: h0 */
        public boolean f2082h0;

        /* renamed from: i */
        public int f2083i;

        /* renamed from: i0 */
        public boolean f2084i0;

        /* renamed from: j */
        public int f2085j;

        /* renamed from: j0 */
        public int f2086j0;

        /* renamed from: k */
        public int f2087k;

        /* renamed from: k0 */
        public int f2088k0;

        /* renamed from: l */
        public int f2089l;

        /* renamed from: l0 */
        public int f2090l0;

        /* renamed from: m */
        public int f2091m;

        /* renamed from: m0 */
        public int f2092m0;

        /* renamed from: n */
        public int f2093n;

        /* renamed from: n0 */
        public int f2094n0;

        /* renamed from: o */
        public int f2095o;

        /* renamed from: o0 */
        public int f2096o0;

        /* renamed from: p */
        public int f2097p;

        /* renamed from: p0 */
        public float f2098p0;

        /* renamed from: q */
        public int f2099q;

        /* renamed from: q0 */
        public float f2100q0;

        /* renamed from: r */
        public int f2101r;

        /* renamed from: r0 */
        public boolean f2102r0;

        /* renamed from: s */
        public int f2103s;

        /* renamed from: s0 */
        public int f2104s0;

        /* renamed from: t */
        public int f2105t;

        /* renamed from: t0 */
        public int f2106t0;

        /* renamed from: u */
        public float f2107u;

        /* renamed from: u0 */
        public int[] f2108u0;

        /* renamed from: v */
        public float f2109v;

        /* renamed from: v0 */
        public String f2110v0;

        /* renamed from: w */
        public String f2111w;

        /* renamed from: x */
        public int f2112x;

        /* renamed from: y */
        public int f2113y;

        /* renamed from: z */
        public float f2114z;

        private b() {
            this.f2067a = false;
            this.f2075e = -1;
            this.f2077f = -1;
            this.f2079g = -1.0f;
            this.f2081h = -1;
            this.f2083i = -1;
            this.f2085j = -1;
            this.f2087k = -1;
            this.f2089l = -1;
            this.f2091m = -1;
            this.f2093n = -1;
            this.f2095o = -1;
            this.f2097p = -1;
            this.f2099q = -1;
            this.f2101r = -1;
            this.f2103s = -1;
            this.f2105t = -1;
            this.f2107u = 0.5f;
            this.f2109v = 0.5f;
            this.f2111w = null;
            this.f2112x = -1;
            this.f2113y = 0;
            this.f2114z = 0.0f;
            this.f2041A = -1;
            this.f2042B = -1;
            this.f2043C = -1;
            this.f2044D = -1;
            this.f2045E = -1;
            this.f2046F = -1;
            this.f2047G = -1;
            this.f2048H = -1;
            this.f2049I = -1;
            this.f2050J = 0;
            this.f2051K = -1;
            this.f2052L = -1;
            this.f2053M = -1;
            this.f2054N = -1;
            this.f2055O = -1;
            this.f2056P = -1;
            this.f2057Q = 0.0f;
            this.f2058R = 0.0f;
            this.f2059S = 0;
            this.f2060T = 0;
            this.f2061U = 1.0f;
            this.f2062V = false;
            this.f2063W = 0.0f;
            this.f2064X = 0.0f;
            this.f2065Y = 0.0f;
            this.f2066Z = 0.0f;
            this.f2068a0 = 1.0f;
            this.f2070b0 = 1.0f;
            this.f2072c0 = Float.NaN;
            this.f2074d0 = Float.NaN;
            this.f2076e0 = 0.0f;
            this.f2078f0 = 0.0f;
            this.f2080g0 = 0.0f;
            this.f2082h0 = false;
            this.f2084i0 = false;
            this.f2086j0 = 0;
            this.f2088k0 = 0;
            this.f2090l0 = -1;
            this.f2092m0 = -1;
            this.f2094n0 = -1;
            this.f2096o0 = -1;
            this.f2098p0 = 1.0f;
            this.f2100q0 = 1.0f;
            this.f2102r0 = false;
            this.f2104s0 = -1;
            this.f2106t0 = -1;
        }

        /* renamed from: a */
        public void m2062a(AbstractC0475c.a aVar) {
            aVar.leftToLeft = this.f2081h;
            aVar.leftToRight = this.f2083i;
            aVar.rightToLeft = this.f2085j;
            aVar.rightToRight = this.f2087k;
            aVar.topToTop = this.f2089l;
            aVar.topToBottom = this.f2091m;
            aVar.bottomToTop = this.f2093n;
            aVar.bottomToBottom = this.f2095o;
            aVar.baselineToBaseline = this.f2097p;
            aVar.startToEnd = this.f2099q;
            aVar.startToStart = this.f2101r;
            aVar.endToStart = this.f2103s;
            aVar.endToEnd = this.f2105t;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = this.f2044D;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = this.f2045E;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = this.f2046F;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = this.f2047G;
            aVar.goneStartMargin = this.f2056P;
            aVar.goneEndMargin = this.f2055O;
            aVar.horizontalBias = this.f2107u;
            aVar.verticalBias = this.f2109v;
            aVar.circleConstraint = this.f2112x;
            aVar.circleRadius = this.f2113y;
            aVar.circleAngle = this.f2114z;
            aVar.dimensionRatio = this.f2111w;
            aVar.editorAbsoluteX = this.f2041A;
            aVar.editorAbsoluteY = this.f2042B;
            aVar.verticalWeight = this.f2057Q;
            aVar.horizontalWeight = this.f2058R;
            aVar.verticalChainStyle = this.f2060T;
            aVar.horizontalChainStyle = this.f2059S;
            aVar.constrainedWidth = this.f2082h0;
            aVar.constrainedHeight = this.f2084i0;
            aVar.matchConstraintDefaultWidth = this.f2086j0;
            aVar.matchConstraintDefaultHeight = this.f2088k0;
            aVar.matchConstraintMaxWidth = this.f2090l0;
            aVar.matchConstraintMaxHeight = this.f2092m0;
            aVar.matchConstraintMinWidth = this.f2094n0;
            aVar.matchConstraintMinHeight = this.f2096o0;
            aVar.matchConstraintPercentWidth = this.f2098p0;
            aVar.matchConstraintPercentHeight = this.f2100q0;
            aVar.orientation = this.f2043C;
            aVar.guidePercent = this.f2079g;
            aVar.guideBegin = this.f2075e;
            aVar.guideEnd = this.f2077f;
            ((ViewGroup.MarginLayoutParams) aVar).width = this.f2069b;
            ((ViewGroup.MarginLayoutParams) aVar).height = this.f2071c;
            aVar.setMarginStart(this.f2049I);
            aVar.setMarginEnd(this.f2048H);
            aVar.validate();
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b clone() {
            b bVar = new b();
            bVar.f2067a = this.f2067a;
            bVar.f2069b = this.f2069b;
            bVar.f2071c = this.f2071c;
            bVar.f2075e = this.f2075e;
            bVar.f2077f = this.f2077f;
            bVar.f2079g = this.f2079g;
            bVar.f2081h = this.f2081h;
            bVar.f2083i = this.f2083i;
            bVar.f2085j = this.f2085j;
            bVar.f2087k = this.f2087k;
            bVar.f2089l = this.f2089l;
            bVar.f2091m = this.f2091m;
            bVar.f2093n = this.f2093n;
            bVar.f2095o = this.f2095o;
            bVar.f2097p = this.f2097p;
            bVar.f2099q = this.f2099q;
            bVar.f2101r = this.f2101r;
            bVar.f2103s = this.f2103s;
            bVar.f2105t = this.f2105t;
            bVar.f2107u = this.f2107u;
            bVar.f2109v = this.f2109v;
            bVar.f2111w = this.f2111w;
            bVar.f2041A = this.f2041A;
            bVar.f2042B = this.f2042B;
            bVar.f2107u = this.f2107u;
            bVar.f2107u = this.f2107u;
            bVar.f2107u = this.f2107u;
            bVar.f2107u = this.f2107u;
            bVar.f2107u = this.f2107u;
            bVar.f2043C = this.f2043C;
            bVar.f2044D = this.f2044D;
            bVar.f2045E = this.f2045E;
            bVar.f2046F = this.f2046F;
            bVar.f2047G = this.f2047G;
            bVar.f2048H = this.f2048H;
            bVar.f2049I = this.f2049I;
            bVar.f2050J = this.f2050J;
            bVar.f2051K = this.f2051K;
            bVar.f2052L = this.f2052L;
            bVar.f2053M = this.f2053M;
            bVar.f2054N = this.f2054N;
            bVar.f2055O = this.f2055O;
            bVar.f2056P = this.f2056P;
            bVar.f2057Q = this.f2057Q;
            bVar.f2058R = this.f2058R;
            bVar.f2059S = this.f2059S;
            bVar.f2060T = this.f2060T;
            bVar.f2061U = this.f2061U;
            bVar.f2062V = this.f2062V;
            bVar.f2063W = this.f2063W;
            bVar.f2064X = this.f2064X;
            bVar.f2065Y = this.f2065Y;
            bVar.f2066Z = this.f2066Z;
            bVar.f2068a0 = this.f2068a0;
            bVar.f2070b0 = this.f2070b0;
            bVar.f2072c0 = this.f2072c0;
            bVar.f2074d0 = this.f2074d0;
            bVar.f2076e0 = this.f2076e0;
            bVar.f2078f0 = this.f2078f0;
            bVar.f2080g0 = this.f2080g0;
            bVar.f2082h0 = this.f2082h0;
            bVar.f2084i0 = this.f2084i0;
            bVar.f2086j0 = this.f2086j0;
            bVar.f2088k0 = this.f2088k0;
            bVar.f2090l0 = this.f2090l0;
            bVar.f2092m0 = this.f2092m0;
            bVar.f2094n0 = this.f2094n0;
            bVar.f2096o0 = this.f2096o0;
            bVar.f2098p0 = this.f2098p0;
            bVar.f2100q0 = this.f2100q0;
            bVar.f2104s0 = this.f2104s0;
            bVar.f2106t0 = this.f2106t0;
            int[] iArr = this.f2108u0;
            if (iArr != null) {
                bVar.f2108u0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f2112x = this.f2112x;
            bVar.f2113y = this.f2113y;
            bVar.f2114z = this.f2114z;
            bVar.f2102r0 = this.f2102r0;
            return bVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2039c = sparseIntArray;
        sparseIntArray.append(R$styleable.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f2039c.append(R$styleable.ConstraintSet_layout_editor_absoluteX, 6);
        f2039c.append(R$styleable.ConstraintSet_layout_editor_absoluteY, 7);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintGuide_begin, 17);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintGuide_end, 18);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintGuide_percent, 19);
        f2039c.append(R$styleable.ConstraintSet_android_orientation, 27);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f2039c.append(R$styleable.ConstraintSet_layout_goneMarginLeft, 13);
        f2039c.append(R$styleable.ConstraintSet_layout_goneMarginTop, 16);
        f2039c.append(R$styleable.ConstraintSet_layout_goneMarginRight, 14);
        f2039c.append(R$styleable.ConstraintSet_layout_goneMarginBottom, 11);
        f2039c.append(R$styleable.ConstraintSet_layout_goneMarginStart, 15);
        f2039c.append(R$styleable.ConstraintSet_layout_goneMarginEnd, 12);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintVertical_weight, 40);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintVertical_bias, 37);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintDimensionRatio, 5);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintLeft_creator, 75);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintTop_creator, 75);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintRight_creator, 75);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintBottom_creator, 75);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintBaseline_creator, 75);
        f2039c.append(R$styleable.ConstraintSet_android_layout_marginLeft, 24);
        f2039c.append(R$styleable.ConstraintSet_android_layout_marginRight, 28);
        f2039c.append(R$styleable.ConstraintSet_android_layout_marginStart, 31);
        f2039c.append(R$styleable.ConstraintSet_android_layout_marginEnd, 8);
        f2039c.append(R$styleable.ConstraintSet_android_layout_marginTop, 34);
        f2039c.append(R$styleable.ConstraintSet_android_layout_marginBottom, 2);
        f2039c.append(R$styleable.ConstraintSet_android_layout_width, 23);
        f2039c.append(R$styleable.ConstraintSet_android_layout_height, 21);
        f2039c.append(R$styleable.ConstraintSet_android_visibility, 22);
        f2039c.append(R$styleable.ConstraintSet_android_alpha, 43);
        f2039c.append(R$styleable.ConstraintSet_android_elevation, 44);
        f2039c.append(R$styleable.ConstraintSet_android_rotationX, 45);
        f2039c.append(R$styleable.ConstraintSet_android_rotationY, 46);
        f2039c.append(R$styleable.ConstraintSet_android_rotation, 60);
        f2039c.append(R$styleable.ConstraintSet_android_scaleX, 47);
        f2039c.append(R$styleable.ConstraintSet_android_scaleY, 48);
        f2039c.append(R$styleable.ConstraintSet_android_transformPivotX, 49);
        f2039c.append(R$styleable.ConstraintSet_android_transformPivotY, 50);
        f2039c.append(R$styleable.ConstraintSet_android_translationX, 51);
        f2039c.append(R$styleable.ConstraintSet_android_translationY, 52);
        f2039c.append(R$styleable.ConstraintSet_android_translationZ, 53);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintWidth_default, 54);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintHeight_default, 55);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintWidth_max, 56);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintHeight_max, 57);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintWidth_min, 58);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintHeight_min, 59);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintCircle, 61);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintCircleRadius, 62);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintCircleAngle, 63);
        f2039c.append(R$styleable.ConstraintSet_android_id, 38);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintWidth_percent, 69);
        f2039c.append(R$styleable.ConstraintSet_layout_constraintHeight_percent, 70);
        f2039c.append(R$styleable.ConstraintSet_chainUseRtl, 71);
        f2039c.append(R$styleable.ConstraintSet_barrierDirection, 72);
        f2039c.append(R$styleable.ConstraintSet_constraint_referenced_ids, 73);
        f2039c.append(R$styleable.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: b */
    private int[] m2056b(View view, String str) {
        int i10;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof AbstractC0475c) && (designInformation = ((AbstractC0475c) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i10 = ((Integer) designInformation).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    /* renamed from: c */
    private b m2057c(Context context, AttributeSet attributeSet) {
        b bVar = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2026c);
        m2059f(bVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return bVar;
    }

    /* renamed from: e */
    private static int m2058e(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    /* renamed from: f */
    private void m2059f(b bVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            int i11 = f2039c.get(index);
            switch (i11) {
                case 1:
                    bVar.f2097p = m2058e(typedArray, index, bVar.f2097p);
                    break;
                case 2:
                    bVar.f2047G = typedArray.getDimensionPixelSize(index, bVar.f2047G);
                    break;
                case 3:
                    bVar.f2095o = m2058e(typedArray, index, bVar.f2095o);
                    break;
                case 4:
                    bVar.f2093n = m2058e(typedArray, index, bVar.f2093n);
                    break;
                case 5:
                    bVar.f2111w = typedArray.getString(index);
                    break;
                case 6:
                    bVar.f2041A = typedArray.getDimensionPixelOffset(index, bVar.f2041A);
                    break;
                case 7:
                    bVar.f2042B = typedArray.getDimensionPixelOffset(index, bVar.f2042B);
                    break;
                case 8:
                    bVar.f2048H = typedArray.getDimensionPixelSize(index, bVar.f2048H);
                    break;
                case 9:
                    bVar.f2105t = m2058e(typedArray, index, bVar.f2105t);
                    break;
                case 10:
                    bVar.f2103s = m2058e(typedArray, index, bVar.f2103s);
                    break;
                case 11:
                    bVar.f2054N = typedArray.getDimensionPixelSize(index, bVar.f2054N);
                    break;
                case 12:
                    bVar.f2055O = typedArray.getDimensionPixelSize(index, bVar.f2055O);
                    break;
                case 13:
                    bVar.f2051K = typedArray.getDimensionPixelSize(index, bVar.f2051K);
                    break;
                case 14:
                    bVar.f2053M = typedArray.getDimensionPixelSize(index, bVar.f2053M);
                    break;
                case 15:
                    bVar.f2056P = typedArray.getDimensionPixelSize(index, bVar.f2056P);
                    break;
                case 16:
                    bVar.f2052L = typedArray.getDimensionPixelSize(index, bVar.f2052L);
                    break;
                case 17:
                    bVar.f2075e = typedArray.getDimensionPixelOffset(index, bVar.f2075e);
                    break;
                case 18:
                    bVar.f2077f = typedArray.getDimensionPixelOffset(index, bVar.f2077f);
                    break;
                case 19:
                    bVar.f2079g = typedArray.getFloat(index, bVar.f2079g);
                    break;
                case 20:
                    bVar.f2107u = typedArray.getFloat(index, bVar.f2107u);
                    break;
                case 21:
                    bVar.f2071c = typedArray.getLayoutDimension(index, bVar.f2071c);
                    break;
                case 22:
                    bVar.f2050J = f2038b[typedArray.getInt(index, bVar.f2050J)];
                    break;
                case 23:
                    bVar.f2069b = typedArray.getLayoutDimension(index, bVar.f2069b);
                    break;
                case 24:
                    bVar.f2044D = typedArray.getDimensionPixelSize(index, bVar.f2044D);
                    break;
                case 25:
                    bVar.f2081h = m2058e(typedArray, index, bVar.f2081h);
                    break;
                case 26:
                    bVar.f2083i = m2058e(typedArray, index, bVar.f2083i);
                    break;
                case 27:
                    bVar.f2043C = typedArray.getInt(index, bVar.f2043C);
                    break;
                case 28:
                    bVar.f2045E = typedArray.getDimensionPixelSize(index, bVar.f2045E);
                    break;
                case 29:
                    bVar.f2085j = m2058e(typedArray, index, bVar.f2085j);
                    break;
                case 30:
                    bVar.f2087k = m2058e(typedArray, index, bVar.f2087k);
                    break;
                case 31:
                    bVar.f2049I = typedArray.getDimensionPixelSize(index, bVar.f2049I);
                    break;
                case 32:
                    bVar.f2099q = m2058e(typedArray, index, bVar.f2099q);
                    break;
                case 33:
                    bVar.f2101r = m2058e(typedArray, index, bVar.f2101r);
                    break;
                case 34:
                    bVar.f2046F = typedArray.getDimensionPixelSize(index, bVar.f2046F);
                    break;
                case 35:
                    bVar.f2091m = m2058e(typedArray, index, bVar.f2091m);
                    break;
                case 36:
                    bVar.f2089l = m2058e(typedArray, index, bVar.f2089l);
                    break;
                case 37:
                    bVar.f2109v = typedArray.getFloat(index, bVar.f2109v);
                    break;
                case 38:
                    bVar.f2073d = typedArray.getResourceId(index, bVar.f2073d);
                    break;
                case 39:
                    bVar.f2058R = typedArray.getFloat(index, bVar.f2058R);
                    break;
                case 40:
                    bVar.f2057Q = typedArray.getFloat(index, bVar.f2057Q);
                    break;
                case 41:
                    bVar.f2059S = typedArray.getInt(index, bVar.f2059S);
                    break;
                case 42:
                    bVar.f2060T = typedArray.getInt(index, bVar.f2060T);
                    break;
                case 43:
                    bVar.f2061U = typedArray.getFloat(index, bVar.f2061U);
                    break;
                case 44:
                    bVar.f2062V = true;
                    bVar.f2063W = typedArray.getDimension(index, bVar.f2063W);
                    break;
                case 45:
                    bVar.f2065Y = typedArray.getFloat(index, bVar.f2065Y);
                    break;
                case 46:
                    bVar.f2066Z = typedArray.getFloat(index, bVar.f2066Z);
                    break;
                case 47:
                    bVar.f2068a0 = typedArray.getFloat(index, bVar.f2068a0);
                    break;
                case 48:
                    bVar.f2070b0 = typedArray.getFloat(index, bVar.f2070b0);
                    break;
                case 49:
                    bVar.f2072c0 = typedArray.getFloat(index, bVar.f2072c0);
                    break;
                case 50:
                    bVar.f2074d0 = typedArray.getFloat(index, bVar.f2074d0);
                    break;
                case 51:
                    bVar.f2076e0 = typedArray.getDimension(index, bVar.f2076e0);
                    break;
                case 52:
                    bVar.f2078f0 = typedArray.getDimension(index, bVar.f2078f0);
                    break;
                case 53:
                    bVar.f2080g0 = typedArray.getDimension(index, bVar.f2080g0);
                    break;
                default:
                    switch (i11) {
                        case 60:
                            bVar.f2064X = typedArray.getFloat(index, bVar.f2064X);
                            break;
                        case 61:
                            bVar.f2112x = m2058e(typedArray, index, bVar.f2112x);
                            break;
                        case 62:
                            bVar.f2113y = typedArray.getDimensionPixelSize(index, bVar.f2113y);
                            break;
                        case 63:
                            bVar.f2114z = typedArray.getFloat(index, bVar.f2114z);
                            break;
                        default:
                            switch (i11) {
                                case 69:
                                    bVar.f2098p0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    bVar.f2100q0 = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    bVar.f2104s0 = typedArray.getInt(index, bVar.f2104s0);
                                    break;
                                case 73:
                                    bVar.f2110v0 = typedArray.getString(index);
                                    break;
                                case 74:
                                    bVar.f2102r0 = typedArray.getBoolean(index, bVar.f2102r0);
                                    break;
                                case 75:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2039c.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2039c.get(index));
                                    break;
                            }
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2060a(AbstractC0475c abstractC0475c) {
        int childCount = abstractC0475c.getChildCount();
        HashSet hashSet = new HashSet(this.f2040a.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = abstractC0475c.getChildAt(i10);
            int id2 = childAt.getId();
            if (id2 != -1) {
                if (this.f2040a.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    b bVar = (b) this.f2040a.get(Integer.valueOf(id2));
                    if (childAt instanceof C0473a) {
                        bVar.f2106t0 = 1;
                    }
                    int i11 = bVar.f2106t0;
                    if (i11 != -1 && i11 == 1) {
                        C0473a c0473a = (C0473a) childAt;
                        c0473a.setId(id2);
                        c0473a.setType(bVar.f2104s0);
                        c0473a.setAllowsGoneWidget(bVar.f2102r0);
                        int[] iArr = bVar.f2108u0;
                        if (iArr != null) {
                            c0473a.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f2110v0;
                            if (str != null) {
                                int[] m2056b = m2056b(c0473a, str);
                                bVar.f2108u0 = m2056b;
                                c0473a.setReferencedIds(m2056b);
                            }
                        }
                    }
                    AbstractC0475c.a aVar = (AbstractC0475c.a) childAt.getLayoutParams();
                    bVar.m2062a(aVar);
                    childAt.setLayoutParams(aVar);
                    childAt.setVisibility(bVar.f2050J);
                    int i12 = Build.VERSION.SDK_INT;
                    childAt.setAlpha(bVar.f2061U);
                    childAt.setRotation(bVar.f2064X);
                    childAt.setRotationX(bVar.f2065Y);
                    childAt.setRotationY(bVar.f2066Z);
                    childAt.setScaleX(bVar.f2068a0);
                    childAt.setScaleY(bVar.f2070b0);
                    if (!Float.isNaN(bVar.f2072c0)) {
                        childAt.setPivotX(bVar.f2072c0);
                    }
                    if (!Float.isNaN(bVar.f2074d0)) {
                        childAt.setPivotY(bVar.f2074d0);
                    }
                    childAt.setTranslationX(bVar.f2076e0);
                    childAt.setTranslationY(bVar.f2078f0);
                    if (i12 >= 21) {
                        childAt.setTranslationZ(bVar.f2080g0);
                        if (bVar.f2062V) {
                            childAt.setElevation(bVar.f2063W);
                        }
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            b bVar2 = (b) this.f2040a.get(num);
            int i13 = bVar2.f2106t0;
            if (i13 != -1 && i13 == 1) {
                C0473a c0473a2 = new C0473a(abstractC0475c.getContext());
                c0473a2.setId(num.intValue());
                int[] iArr2 = bVar2.f2108u0;
                if (iArr2 != null) {
                    c0473a2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f2110v0;
                    if (str2 != null) {
                        int[] m2056b2 = m2056b(c0473a2, str2);
                        bVar2.f2108u0 = m2056b2;
                        c0473a2.setReferencedIds(m2056b2);
                    }
                }
                c0473a2.setType(bVar2.f2104s0);
                AbstractC0475c.a generateDefaultLayoutParams = abstractC0475c.generateDefaultLayoutParams();
                c0473a2.m2045f();
                bVar2.m2062a(generateDefaultLayoutParams);
                abstractC0475c.addView(c0473a2, generateDefaultLayoutParams);
            }
            if (bVar2.f2067a) {
                View c0480h = new C0480h(abstractC0475c.getContext());
                c0480h.setId(num.intValue());
                AbstractC0475c.a generateDefaultLayoutParams2 = abstractC0475c.generateDefaultLayoutParams();
                bVar2.m2062a(generateDefaultLayoutParams2);
                abstractC0475c.addView(c0480h, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: d */
    public void m2061d(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        b m2057c = m2057c(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            m2057c.f2067a = true;
                        }
                        this.f2040a.put(Integer.valueOf(m2057c.f2073d), m2057c);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
