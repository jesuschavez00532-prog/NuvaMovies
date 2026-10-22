package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;
import com.p077uc.crashsdk.export.LogType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.g1 */
/* loaded from: classes.dex */
public class C0397g1 {

    /* renamed from: l */
    private static final RectF f1748l = new RectF();

    /* renamed from: m */
    private static ConcurrentHashMap f1749m = new ConcurrentHashMap();

    /* renamed from: n */
    private static ConcurrentHashMap f1750n = new ConcurrentHashMap();

    /* renamed from: a */
    private int f1751a = 0;

    /* renamed from: b */
    private boolean f1752b = false;

    /* renamed from: c */
    private float f1753c = -1.0f;

    /* renamed from: d */
    private float f1754d = -1.0f;

    /* renamed from: e */
    private float f1755e = -1.0f;

    /* renamed from: f */
    private int[] f1756f = new int[0];

    /* renamed from: g */
    private boolean f1757g = false;

    /* renamed from: h */
    private TextPaint f1758h;

    /* renamed from: i */
    private final TextView f1759i;

    /* renamed from: j */
    private final Context f1760j;

    /* renamed from: k */
    private final c f1761k;

    /* renamed from: androidx.appcompat.widget.g1$a */
    /* loaded from: classes.dex */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.C0397g1.c
        /* renamed from: a */
        void mo1737a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0397g1.m1717o(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.g1$b */
    /* loaded from: classes.dex */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.C0397g1.a, androidx.appcompat.widget.C0397g1.c
        /* renamed from: a */
        void mo1737a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.C0397g1.c
        /* renamed from: b */
        boolean mo1738b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g1$c */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        /* renamed from: a */
        void mo1737a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        boolean mo1738b(TextView textView) {
            return ((Boolean) C0397g1.m1717o(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0397g1(TextView textView) {
        this.f1759i = textView;
        this.f1760j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f1761k = new b();
        } else if (i10 >= 23) {
            this.f1761k = new a();
        } else {
            this.f1761k = new c();
        }
    }

    /* renamed from: A */
    private boolean m1709A() {
        return !(this.f1759i instanceof C0419m);
    }

    /* renamed from: B */
    private void m1710B(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            if (f11 > f10) {
                if (f12 > 0.0f) {
                    this.f1751a = 1;
                    this.f1754d = f10;
                    this.f1755e = f11;
                    this.f1753c = f12;
                    this.f1757g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
    }

    /* renamed from: b */
    private int[] m1711b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m1712c() {
        this.f1751a = 0;
        this.f1754d = -1.0f;
        this.f1755e = -1.0f;
        this.f1753c = -1.0f;
        this.f1756f = new int[0];
        this.f1752b = false;
    }

    /* renamed from: e */
    private StaticLayout m1713e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        int breakStrategy;
        StaticLayout.Builder breakStrategy2;
        int hyphenationFrequency;
        StaticLayout.Builder hyphenationFrequency2;
        StaticLayout build;
        obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1758h, i10);
        alignment2 = obtain.setAlignment(alignment);
        lineSpacing = alignment2.setLineSpacing(this.f1759i.getLineSpacingExtra(), this.f1759i.getLineSpacingMultiplier());
        includePad = lineSpacing.setIncludePad(this.f1759i.getIncludeFontPadding());
        breakStrategy = this.f1759i.getBreakStrategy();
        breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
        hyphenationFrequency = this.f1759i.getHyphenationFrequency();
        hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency2.setMaxLines(i11);
        try {
            this.f1761k.mo1737a(obtain, this.f1759i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        build = obtain.build();
        return build;
    }

    /* renamed from: f */
    private StaticLayout m1714f(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f1758h, i10, alignment, this.f1759i.getLineSpacingMultiplier(), this.f1759i.getLineSpacingExtra(), this.f1759i.getIncludeFontPadding());
    }

    /* renamed from: g */
    private int m1715g(RectF rectF) {
        int length = this.f1756f.length;
        if (length != 0) {
            int i10 = 1;
            int i11 = length - 1;
            int i12 = 0;
            while (i10 <= i11) {
                int i13 = (i10 + i11) / 2;
                if (m1722z(this.f1756f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i10;
                    i10 = i14;
                } else {
                    i12 = i13 - 1;
                    i11 = i12;
                }
            }
            return this.f1756f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: m */
    private static Method m1716m(String str) {
        try {
            Method method = (Method) f1749m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1749m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    /* renamed from: o */
    static Object m1717o(Object obj, String str, Object obj2) {
        try {
            return m1716m(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    /* renamed from: u */
    private void m1718u(float f10) {
        if (f10 != this.f1759i.getPaint().getTextSize()) {
            this.f1759i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f1759i.isInLayout();
            if (this.f1759i.getLayout() != null) {
                this.f1752b = false;
                try {
                    Method m1716m = m1716m("nullLayouts");
                    if (m1716m != null) {
                        m1716m.invoke(this.f1759i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!isInLayout) {
                    this.f1759i.requestLayout();
                } else {
                    this.f1759i.forceLayout();
                }
                this.f1759i.invalidate();
            }
        }
    }

    /* renamed from: w */
    private boolean m1719w() {
        if (m1709A() && this.f1751a == 1) {
            if (!this.f1757g || this.f1756f.length == 0) {
                int floor = ((int) Math.floor((this.f1755e - this.f1754d) / this.f1753c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1754d + (i10 * this.f1753c));
                }
                this.f1756f = m1711b(iArr);
            }
            this.f1752b = true;
        } else {
            this.f1752b = false;
        }
        return this.f1752b;
    }

    /* renamed from: x */
    private void m1720x(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1756f = m1711b(iArr);
            m1721y();
        }
    }

    /* renamed from: y */
    private boolean m1721y() {
        boolean z10;
        if (this.f1756f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1757g = z10;
        if (z10) {
            this.f1751a = 1;
            this.f1754d = r0[0];
            this.f1755e = r0[r1 - 1];
            this.f1753c = -1.0f;
        }
        return z10;
    }

    /* renamed from: z */
    private boolean m1722z(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1759i.getText();
        TransformationMethod transformationMethod = this.f1759i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1759i)) != null) {
            text = transformation;
        }
        int maxLines = this.f1759i.getMaxLines();
        m1730n(i10);
        StaticLayout m1724d = m1724d(text, (Layout.Alignment) m1717o(this.f1759i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        if ((maxLines != -1 && (m1724d.getLineCount() > maxLines || m1724d.getLineEnd(m1724d.getLineCount() - 1) != text.length())) || m1724d.getHeight() > rectF.bottom) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1723a() {
        int measuredWidth;
        if (!m1731p()) {
            return;
        }
        if (this.f1752b) {
            if (this.f1759i.getMeasuredHeight() > 0 && this.f1759i.getMeasuredWidth() > 0) {
                if (this.f1761k.mo1738b(this.f1759i)) {
                    measuredWidth = LogType.ANR;
                } else {
                    measuredWidth = (this.f1759i.getMeasuredWidth() - this.f1759i.getTotalPaddingLeft()) - this.f1759i.getTotalPaddingRight();
                }
                int height = (this.f1759i.getHeight() - this.f1759i.getCompoundPaddingBottom()) - this.f1759i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f1748l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float m1715g = m1715g(rectF);
                        if (m1715g != this.f1759i.getTextSize()) {
                            m1736v(0, m1715g);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f1752b = true;
    }

    /* renamed from: d */
    StaticLayout m1724d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            return m1713e(charSequence, alignment, i10, i11);
        }
        return m1714f(charSequence, alignment, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m1725h() {
        return Math.round(this.f1755e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m1726i() {
        return Math.round(this.f1754d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m1727j() {
        return Math.round(this.f1753c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] m1728k() {
        return this.f1756f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m1729l() {
        return this.f1751a;
    }

    /* renamed from: n */
    void m1730n(int i10) {
        TextPaint textPaint = this.f1758h;
        if (textPaint == null) {
            this.f1758h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1758h.set(this.f1759i.getPaint());
        this.f1758h.setTextSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m1731p() {
        if (m1709A() && this.f1751a != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1732q(AttributeSet attributeSet, int i10) {
        float f10;
        float f11;
        float f12;
        int resourceId;
        Context context = this.f1760j;
        int[] iArr = R$styleable.f917n;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1759i;
        AbstractC0616q0.m2632l0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = R$styleable.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1751a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = R$styleable.AppCompatTextView_autoSizeStepGranularity;
        if (obtainStyledAttributes.hasValue(i12)) {
            f10 = obtainStyledAttributes.getDimension(i12, -1.0f);
        } else {
            f10 = -1.0f;
        }
        int i13 = R$styleable.AppCompatTextView_autoSizeMinTextSize;
        if (obtainStyledAttributes.hasValue(i13)) {
            f11 = obtainStyledAttributes.getDimension(i13, -1.0f);
        } else {
            f11 = -1.0f;
        }
        int i14 = R$styleable.AppCompatTextView_autoSizeMaxTextSize;
        if (obtainStyledAttributes.hasValue(i14)) {
            f12 = obtainStyledAttributes.getDimension(i14, -1.0f);
        } else {
            f12 = -1.0f;
        }
        int i15 = R$styleable.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1720x(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (m1709A()) {
            if (this.f1751a == 1) {
                if (!this.f1757g) {
                    DisplayMetrics displayMetrics = this.f1760j.getResources().getDisplayMetrics();
                    if (f11 == -1.0f) {
                        f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (f12 == -1.0f) {
                        f12 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (f10 == -1.0f) {
                        f10 = 1.0f;
                    }
                    m1710B(f11, f12, f10);
                }
                m1719w();
                return;
            }
            return;
        }
        this.f1751a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m1733r(int i10, int i11, int i12, int i13) {
        if (m1709A()) {
            DisplayMetrics displayMetrics = this.f1760j.getResources().getDisplayMetrics();
            m1710B(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (m1719w()) {
                m1723a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m1734s(int[] iArr, int i10) {
        if (m1709A()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1760j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1756f = m1711b(iArr2);
                if (!m1721y()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1757g = false;
            }
            if (m1719w()) {
                m1723a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m1735t(int i10) {
        if (m1709A()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = this.f1760j.getResources().getDisplayMetrics();
                    m1710B(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m1719w()) {
                        m1723a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            m1712c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m1736v(int i10, float f10) {
        Resources resources;
        Context context = this.f1760j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m1718u(TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics()));
    }
}
