package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC0421m1;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0415l;
import androidx.core.content.AbstractC0547a;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0631u;
import androidx.core.view.C0551a;
import androidx.core.widget.AbstractC0665d0;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.internal.AbstractC2584b;
import com.google.android.material.internal.C2583a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p020b0.AbstractC1031a;
import p106e.AbstractC4105b;
import p144g5.AbstractC4346a;
import p188j5.AbstractC4995a;
import p290q.AbstractC6306k;
import p326s5.C6686i;
import p326s5.C6690m;
import p389x.C7458h0;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: D0 */
    private static final int f9835D0 = R$style.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private int f9836A;

    /* renamed from: A0 */
    private ValueAnimator f9837A0;

    /* renamed from: B */
    private final Rect f9838B;

    /* renamed from: B0 */
    private boolean f9839B0;

    /* renamed from: C */
    private final Rect f9840C;

    /* renamed from: C0 */
    private boolean f9841C0;

    /* renamed from: D */
    private final RectF f9842D;

    /* renamed from: E */
    private Typeface f9843E;

    /* renamed from: F */
    private final CheckableImageButton f9844F;

    /* renamed from: G */
    private ColorStateList f9845G;

    /* renamed from: H */
    private boolean f9846H;

    /* renamed from: I */
    private PorterDuff.Mode f9847I;

    /* renamed from: J */
    private boolean f9848J;

    /* renamed from: K */
    private Drawable f9849K;

    /* renamed from: L */
    private View.OnLongClickListener f9850L;

    /* renamed from: M */
    private final LinkedHashSet f9851M;

    /* renamed from: N */
    private int f9852N;

    /* renamed from: O */
    private final SparseArray f9853O;

    /* renamed from: V */
    private final CheckableImageButton f9854V;

    /* renamed from: W */
    private final LinkedHashSet f9855W;

    /* renamed from: a */
    private final FrameLayout f9856a;

    /* renamed from: b */
    private final FrameLayout f9857b;

    /* renamed from: c */
    EditText f9858c;

    /* renamed from: d */
    private CharSequence f9859d;

    /* renamed from: e */
    private final C2610g f9860e;

    /* renamed from: f */
    boolean f9861f;

    /* renamed from: g */
    private int f9862g;

    /* renamed from: g0 */
    private ColorStateList f9863g0;

    /* renamed from: h */
    private boolean f9864h;

    /* renamed from: h0 */
    private boolean f9865h0;

    /* renamed from: i */
    private TextView f9866i;

    /* renamed from: i0 */
    private PorterDuff.Mode f9867i0;

    /* renamed from: j */
    private int f9868j;

    /* renamed from: j0 */
    private boolean f9869j0;

    /* renamed from: k */
    private int f9870k;

    /* renamed from: k0 */
    private Drawable f9871k0;

    /* renamed from: l */
    private ColorStateList f9872l;

    /* renamed from: l0 */
    private Drawable f9873l0;

    /* renamed from: m */
    private ColorStateList f9874m;

    /* renamed from: m0 */
    private final CheckableImageButton f9875m0;

    /* renamed from: n */
    private boolean f9876n;

    /* renamed from: n0 */
    private View.OnLongClickListener f9877n0;

    /* renamed from: o */
    private CharSequence f9878o;

    /* renamed from: o0 */
    private ColorStateList f9879o0;

    /* renamed from: p */
    private boolean f9880p;

    /* renamed from: p0 */
    private ColorStateList f9881p0;

    /* renamed from: q */
    private C6686i f9882q;

    /* renamed from: q0 */
    private final int f9883q0;

    /* renamed from: r */
    private C6686i f9884r;

    /* renamed from: r0 */
    private final int f9885r0;

    /* renamed from: s */
    private C6690m f9886s;

    /* renamed from: s0 */
    private int f9887s0;

    /* renamed from: t */
    private final int f9888t;

    /* renamed from: t0 */
    private int f9889t0;

    /* renamed from: u */
    private int f9890u;

    /* renamed from: u0 */
    private final int f9891u0;

    /* renamed from: v */
    private final int f9892v;

    /* renamed from: v0 */
    private final int f9893v0;

    /* renamed from: w */
    private int f9894w;

    /* renamed from: w0 */
    private final int f9895w0;

    /* renamed from: x */
    private final int f9896x;

    /* renamed from: x0 */
    private boolean f9897x0;

    /* renamed from: y */
    private final int f9898y;

    /* renamed from: y0 */
    final C2583a f9899y0;

    /* renamed from: z */
    private int f9900z;

    /* renamed from: z0 */
    private boolean f9901z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes.dex */
    public class C2596a implements TextWatcher {
        C2596a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.m10728c0(!r0.f9841C0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f9861f) {
                textInputLayout.m10725V(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes.dex */
    class RunnableC2597b implements Runnable {
        RunnableC2597b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f9854V.performClick();
            TextInputLayout.this.f9854V.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes.dex */
    class RunnableC2598c implements Runnable {
        RunnableC2598c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f9858c.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes.dex */
    public class C2599d implements ValueAnimator.AnimatorUpdateListener {
        C2599d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f9899y0.m10617O(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes.dex */
    public static class C2600e extends C0551a {

        /* renamed from: d */
        private final TextInputLayout f9906d;

        public C2600e(TextInputLayout textInputLayout) {
            this.f9906d = textInputLayout;
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: g */
        public void mo2382g(View view, C7458h0 c7458h0) {
            Editable editable;
            boolean z10;
            super.mo2382g(view, c7458h0);
            EditText editText = this.f9906d.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.f9906d.getHint();
            CharSequence error = this.f9906d.getError();
            CharSequence counterOverflowDescription = this.f9906d.getCounterOverflowDescription();
            boolean z11 = !TextUtils.isEmpty(editable);
            boolean z12 = !TextUtils.isEmpty(hint);
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = false;
            if (!z13 && TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z11) {
                c7458h0.m28632s0(editable);
            } else if (z12) {
                c7458h0.m28632s0(hint);
            }
            if (z12) {
                c7458h0.m28615i0(hint);
                if (!z11 && z12) {
                    z14 = true;
                }
                c7458h0.m28627p0(z14);
            }
            if (z10) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                c7458h0.m28610e0(error);
                c7458h0.m28607c0(true);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: classes.dex */
    public interface InterfaceC2601f {
        /* renamed from: a */
        void mo10732a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: classes.dex */
    public interface InterfaceC2602g {
        /* renamed from: a */
        void mo10733a(TextInputLayout textInputLayout, int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    /* loaded from: classes.dex */
    public static class C2603h extends AbstractC1031a {
        public static final Parcelable.Creator<C2603h> CREATOR = new a();

        /* renamed from: c */
        CharSequence f9907c;

        /* renamed from: d */
        boolean f9908d;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2603h createFromParcel(Parcel parcel) {
                return new C2603h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2603h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2603h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C2603h[] newArray(int i10) {
                return new C2603h[i10];
            }
        }

        C2603h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f9907c) + "}";
        }

        @Override // p020b0.AbstractC1031a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f9907c, parcel, i10);
            parcel.writeInt(this.f9908d ? 1 : 0);
        }

        C2603h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9907c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9908d = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.textInputStyle);
    }

    /* renamed from: A */
    private void m10675A(Canvas canvas) {
        if (this.f9876n) {
            this.f9899y0.m10624i(canvas);
        }
    }

    /* renamed from: B */
    private void m10676B(boolean z10) {
        ValueAnimator valueAnimator = this.f9837A0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f9837A0.cancel();
        }
        if (z10 && this.f9901z0) {
            m10730e(0.0f);
        } else {
            this.f9899y0.m10617O(0.0f);
        }
        if (m10716w() && ((C2607d) this.f9882q).m10752c0()) {
            m10714u();
        }
        this.f9897x0 = true;
    }

    /* renamed from: C */
    private boolean m10677C() {
        if (this.f9852N != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private boolean m10678D() {
        if (getStartIconDrawable() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private boolean m10679H() {
        if (this.f9890u == 1 && this.f9858c.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private void m10680J() {
        m10705l();
        m10683M();
        m10731e0();
        if (this.f9890u != 0) {
            m10697b0();
        }
    }

    /* renamed from: K */
    private void m10681K() {
        if (!m10716w()) {
            return;
        }
        RectF rectF = this.f9842D;
        this.f9899y0.m10625k(rectF);
        m10701h(rectF);
        rectF.offset(-getPaddingLeft(), 0.0f);
        ((C2607d) this.f9882q).m10755i0(rectF);
    }

    /* renamed from: L */
    private static void m10682L(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                m10682L((ViewGroup) childAt, z10);
            }
        }
    }

    /* renamed from: M */
    private void m10683M() {
        if (m10687R()) {
            AbstractC0616q0.m2642q0(this.f9858c, this.f9882q);
        }
    }

    /* renamed from: N */
    private static void m10684N(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z10;
        boolean m2595M = AbstractC0616q0.m2595M(checkableImageButton);
        boolean z11 = false;
        int i10 = 1;
        if (onLongClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (m2595M || z10) {
            z11 = true;
        }
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(m2595M);
        checkableImageButton.setPressable(m2595M);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i10 = 2;
        }
        AbstractC0616q0.m2654w0(checkableImageButton, i10);
    }

    /* renamed from: O */
    private static void m10685O(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m10684N(checkableImageButton, onLongClickListener);
    }

    /* renamed from: P */
    private static void m10686P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m10684N(checkableImageButton, onLongClickListener);
    }

    /* renamed from: R */
    private boolean m10687R() {
        EditText editText = this.f9858c;
        if (editText != null && this.f9882q != null && editText.getBackground() == null && this.f9890u != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private void m10688S(boolean z10) {
        if (z10 && getEndIconDrawable() != null) {
            Drawable mutate = AbstractC6306k.m25072r(getEndIconDrawable()).mutate();
            AbstractC6306k.m25068n(mutate, this.f9860e.m10811n());
            this.f9854V.setImageDrawable(mutate);
            return;
        }
        m10702i();
    }

    /* renamed from: T */
    private void m10689T(Rect rect) {
        C6686i c6686i = this.f9884r;
        if (c6686i != null) {
            int i10 = rect.bottom;
            c6686i.setBounds(rect.left, i10 - this.f9898y, rect.right, i10);
        }
    }

    /* renamed from: U */
    private void m10690U() {
        int length;
        if (this.f9866i != null) {
            EditText editText = this.f9858c;
            if (editText == null) {
                length = 0;
            } else {
                length = editText.getText().length();
            }
            m10725V(length);
        }
    }

    /* renamed from: W */
    private static void m10691W(Context context, TextView textView, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i12 = R$string.character_counter_overflowed_content_description;
        } else {
            i12 = R$string.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i12, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* renamed from: X */
    private void m10692X() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f9866i;
        if (textView != null) {
            if (this.f9864h) {
                i10 = this.f9868j;
            } else {
                i10 = this.f9870k;
            }
            m10724Q(textView, i10);
            if (!this.f9864h && (colorStateList2 = this.f9872l) != null) {
                this.f9866i.setTextColor(colorStateList2);
            }
            if (this.f9864h && (colorStateList = this.f9874m) != null) {
                this.f9866i.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: Z */
    private boolean m10693Z() {
        int max;
        if (this.f9858c == null || this.f9858c.getMeasuredHeight() >= (max = Math.max(this.f9854V.getMeasuredHeight(), this.f9844F.getMeasuredHeight()))) {
            return false;
        }
        this.f9858c.setMinimumHeight(max);
        return true;
    }

    /* renamed from: a0 */
    private boolean m10695a0() {
        boolean z10;
        if (this.f9858c == null) {
            return false;
        }
        boolean z11 = true;
        if (m10678D() && m10723I() && this.f9844F.getMeasuredWidth() > 0) {
            if (this.f9849K == null) {
                this.f9849K = new ColorDrawable();
                this.f9849K.setBounds(0, 0, (this.f9844F.getMeasuredWidth() - this.f9858c.getPaddingLeft()) + AbstractC0631u.m2817a((ViewGroup.MarginLayoutParams) this.f9844F.getLayoutParams()), 1);
            }
            Drawable[] m2930a = AbstractC0665d0.m2930a(this.f9858c);
            Drawable drawable = m2930a[0];
            Drawable drawable2 = this.f9849K;
            if (drawable != drawable2) {
                AbstractC0665d0.m2938i(this.f9858c, drawable2, m2930a[1], m2930a[2], m2930a[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f9849K != null) {
                Drawable[] m2930a2 = AbstractC0665d0.m2930a(this.f9858c);
                AbstractC0665d0.m2938i(this.f9858c, null, m2930a2[1], m2930a2[2], m2930a2[3]);
                this.f9849K = null;
                z10 = true;
            }
            z10 = false;
        }
        CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
        if (endIconToUpdateDummyDrawable != null && endIconToUpdateDummyDrawable.getMeasuredWidth() > 0) {
            if (this.f9871k0 == null) {
                this.f9871k0 = new ColorDrawable();
                this.f9871k0.setBounds(0, 0, (endIconToUpdateDummyDrawable.getMeasuredWidth() - this.f9858c.getPaddingRight()) + AbstractC0631u.m2818b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()), 1);
            }
            Drawable[] m2930a3 = AbstractC0665d0.m2930a(this.f9858c);
            Drawable drawable3 = m2930a3[2];
            Drawable drawable4 = this.f9871k0;
            if (drawable3 != drawable4) {
                this.f9873l0 = drawable3;
                AbstractC0665d0.m2938i(this.f9858c, m2930a3[0], m2930a3[1], drawable4, m2930a3[3]);
            } else {
                z11 = z10;
            }
        } else if (this.f9871k0 != null) {
            Drawable[] m2930a4 = AbstractC0665d0.m2930a(this.f9858c);
            if (m2930a4[2] == this.f9871k0) {
                AbstractC0665d0.m2938i(this.f9858c, m2930a4[0], m2930a4[1], this.f9873l0, m2930a4[3]);
            } else {
                z11 = z10;
            }
            this.f9871k0 = null;
        } else {
            return z10;
        }
        return z11;
    }

    /* renamed from: b0 */
    private void m10697b0() {
        if (this.f9890u != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9856a.getLayoutParams();
            int m10711r = m10711r();
            if (m10711r != layoutParams.topMargin) {
                layoutParams.topMargin = m10711r;
                this.f9856a.requestLayout();
            }
        }
    }

    /* renamed from: d0 */
    private void m10698d0(boolean z10, boolean z11) {
        boolean z12;
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f9858c;
        boolean z13 = true;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f9858c;
        if (editText2 == null || !editText2.hasFocus()) {
            z13 = false;
        }
        boolean m10809k = this.f9860e.m10809k();
        ColorStateList colorStateList2 = this.f9879o0;
        if (colorStateList2 != null) {
            this.f9899y0.m10609E(colorStateList2);
            this.f9899y0.m10614K(this.f9879o0);
        }
        if (!isEnabled) {
            this.f9899y0.m10609E(ColorStateList.valueOf(this.f9895w0));
            this.f9899y0.m10614K(ColorStateList.valueOf(this.f9895w0));
        } else if (m10809k) {
            this.f9899y0.m10609E(this.f9860e.m10812o());
        } else if (this.f9864h && (textView = this.f9866i) != null) {
            this.f9899y0.m10609E(textView.getTextColors());
        } else if (z13 && (colorStateList = this.f9881p0) != null) {
            this.f9899y0.m10609E(colorStateList);
        }
        if (!z12 && (!isEnabled() || (!z13 && !m10809k))) {
            if (z11 || !this.f9897x0) {
                m10676B(z10);
                return;
            }
            return;
        }
        if (z11 || this.f9897x0) {
            m10715v(z10);
        }
    }

    /* renamed from: f */
    private void m10699f() {
        C6686i c6686i = this.f9882q;
        if (c6686i == null) {
            return;
        }
        c6686i.setShapeAppearanceModel(this.f9886s);
        if (m10712s()) {
            this.f9882q.m26100V(this.f9894w, this.f9900z);
        }
        int m10706m = m10706m();
        this.f9836A = m10706m;
        this.f9882q.m26096R(ColorStateList.valueOf(m10706m));
        if (this.f9852N == 3) {
            this.f9858c.getBackground().invalidateSelf();
        }
        m10700g();
        invalidate();
    }

    /* renamed from: g */
    private void m10700g() {
        if (this.f9884r == null) {
            return;
        }
        if (m10713t()) {
            this.f9884r.m26096R(ColorStateList.valueOf(this.f9900z));
        }
        invalidate();
    }

    private AbstractC2609f getEndIconDelegate() {
        AbstractC2609f abstractC2609f = (AbstractC2609f) this.f9853O.get(this.f9852N);
        if (abstractC2609f == null) {
            return (AbstractC2609f) this.f9853O.get(0);
        }
        return abstractC2609f;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f9875m0.getVisibility() == 0) {
            return this.f9875m0;
        }
        if (m10677C() && m10720E()) {
            return this.f9854V;
        }
        return null;
    }

    /* renamed from: h */
    private void m10701h(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f9888t;
        rectF.left = f10 - i10;
        rectF.top -= i10;
        rectF.right += i10;
        rectF.bottom += i10;
    }

    /* renamed from: i */
    private void m10702i() {
        m10703j(this.f9854V, this.f9865h0, this.f9863g0, this.f9869j0, this.f9867i0);
    }

    /* renamed from: j */
    private void m10703j(CheckableImageButton checkableImageButton, boolean z10, ColorStateList colorStateList, boolean z11, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z10 || z11)) {
            drawable = AbstractC6306k.m25072r(drawable).mutate();
            if (z10) {
                AbstractC6306k.m25069o(drawable, colorStateList);
            }
            if (z11) {
                AbstractC6306k.m25070p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: k */
    private void m10704k() {
        m10703j(this.f9844F, this.f9846H, this.f9845G, this.f9848J, this.f9847I);
    }

    /* renamed from: l */
    private void m10705l() {
        int i10 = this.f9890u;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (this.f9876n && !(this.f9882q instanceof C2607d)) {
                        this.f9882q = new C2607d(this.f9886s);
                    } else {
                        this.f9882q = new C6686i(this.f9886s);
                    }
                    this.f9884r = null;
                    return;
                }
                throw new IllegalArgumentException(this.f9890u + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.f9882q = new C6686i(this.f9886s);
            this.f9884r = new C6686i();
            return;
        }
        this.f9882q = null;
        this.f9884r = null;
    }

    /* renamed from: m */
    private int m10706m() {
        int i10 = this.f9836A;
        if (this.f9890u == 1) {
            return AbstractC4995a.m20375e(AbstractC4995a.m20374d(this, R$attr.colorSurface, 0), this.f9836A);
        }
        return i10;
    }

    /* renamed from: n */
    private Rect m10707n(Rect rect) {
        EditText editText = this.f9858c;
        if (editText != null) {
            Rect rect2 = this.f9840C;
            rect2.bottom = rect.bottom;
            int i10 = this.f9890u;
            if (i10 != 1) {
                if (i10 != 2) {
                    rect2.left = rect.left + editText.getCompoundPaddingLeft();
                    rect2.top = getPaddingTop();
                    rect2.right = rect.right - this.f9858c.getCompoundPaddingRight();
                    return rect2;
                }
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - m10711r();
                rect2.right = rect.right - this.f9858c.getPaddingRight();
                return rect2;
            }
            rect2.left = rect.left + editText.getCompoundPaddingLeft();
            rect2.top = rect.top + this.f9892v;
            rect2.right = rect.right - this.f9858c.getCompoundPaddingRight();
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    private int m10708o(Rect rect, Rect rect2, float f10) {
        if (this.f9890u == 1) {
            return (int) (rect2.top + f10);
        }
        return rect.bottom - this.f9858c.getCompoundPaddingBottom();
    }

    /* renamed from: p */
    private int m10709p(Rect rect, float f10) {
        if (m10679H()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return rect.top + this.f9858c.getCompoundPaddingTop();
    }

    /* renamed from: q */
    private Rect m10710q(Rect rect) {
        if (this.f9858c != null) {
            Rect rect2 = this.f9840C;
            float m10629q = this.f9899y0.m10629q();
            rect2.left = rect.left + this.f9858c.getCompoundPaddingLeft();
            rect2.top = m10709p(rect, m10629q);
            rect2.right = rect.right - this.f9858c.getCompoundPaddingRight();
            rect2.bottom = m10708o(rect, rect2, m10629q);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: r */
    private int m10711r() {
        float m10627m;
        if (!this.f9876n) {
            return 0;
        }
        int i10 = this.f9890u;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                return 0;
            }
            m10627m = this.f9899y0.m10627m() / 2.0f;
        } else {
            m10627m = this.f9899y0.m10627m();
        }
        return (int) m10627m;
    }

    /* renamed from: s */
    private boolean m10712s() {
        if (this.f9890u == 2 && m10713t()) {
            return true;
        }
        return false;
    }

    private void setEditText(EditText editText) {
        if (this.f9858c == null) {
            if (this.f9852N != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f9858c = editText;
            m10680J();
            setTextInputAccessibilityDelegate(new C2600e(this));
            this.f9899y0.m10622U(this.f9858c.getTypeface());
            this.f9899y0.m10616M(this.f9858c.getTextSize());
            int gravity = this.f9858c.getGravity();
            this.f9899y0.m10610F((gravity & (-113)) | 48);
            this.f9899y0.m10615L(gravity);
            this.f9858c.addTextChangedListener(new C2596a());
            if (this.f9879o0 == null) {
                this.f9879o0 = this.f9858c.getHintTextColors();
            }
            if (this.f9876n) {
                if (TextUtils.isEmpty(this.f9878o)) {
                    CharSequence hint = this.f9858c.getHint();
                    this.f9859d = hint;
                    setHint(hint);
                    this.f9858c.setHint((CharSequence) null);
                }
                this.f9880p = true;
            }
            if (this.f9866i != null) {
                m10725V(this.f9858c.getText().length());
            }
            m10726Y();
            this.f9860e.m10807e();
            this.f9844F.bringToFront();
            this.f9857b.bringToFront();
            this.f9875m0.bringToFront();
            m10717x();
            m10698d0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z10) {
        int i10;
        CheckableImageButton checkableImageButton = this.f9875m0;
        int i11 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        FrameLayout frameLayout = this.f9857b;
        if (z10) {
            i11 = 8;
        }
        frameLayout.setVisibility(i11);
        if (!m10677C()) {
            m10695a0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f9878o)) {
            this.f9878o = charSequence;
            this.f9899y0.m10620S(charSequence);
            if (!this.f9897x0) {
                m10681K();
            }
        }
    }

    /* renamed from: t */
    private boolean m10713t() {
        if (this.f9894w > -1 && this.f9900z != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private void m10714u() {
        if (m10716w()) {
            ((C2607d) this.f9882q).m10753f0();
        }
    }

    /* renamed from: v */
    private void m10715v(boolean z10) {
        ValueAnimator valueAnimator = this.f9837A0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f9837A0.cancel();
        }
        if (z10 && this.f9901z0) {
            m10730e(1.0f);
        } else {
            this.f9899y0.m10617O(1.0f);
        }
        this.f9897x0 = false;
        if (m10716w()) {
            m10681K();
        }
    }

    /* renamed from: w */
    private boolean m10716w() {
        if (this.f9876n && !TextUtils.isEmpty(this.f9878o) && (this.f9882q instanceof C2607d)) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private void m10717x() {
        Iterator it = this.f9851M.iterator();
        while (it.hasNext()) {
            ((InterfaceC2601f) it.next()).mo10732a(this);
        }
    }

    /* renamed from: y */
    private void m10718y(int i10) {
        Iterator it = this.f9855W.iterator();
        while (it.hasNext()) {
            ((InterfaceC2602g) it.next()).mo10733a(this, i10);
        }
    }

    /* renamed from: z */
    private void m10719z(Canvas canvas) {
        C6686i c6686i = this.f9884r;
        if (c6686i != null) {
            Rect bounds = c6686i.getBounds();
            bounds.top = bounds.bottom - this.f9894w;
            this.f9884r.draw(canvas);
        }
    }

    /* renamed from: E */
    public boolean m10720E() {
        if (this.f9857b.getVisibility() == 0 && this.f9854V.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public boolean m10721F() {
        return this.f9860e.m10819w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean m10722G() {
        return this.f9880p;
    }

    /* renamed from: I */
    public boolean m10723I() {
        if (this.f9844F.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L11;
     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m10724Q(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.AbstractC0665d0.m2943n(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = com.google.android.material.R$style.TextAppearance_AppCompat_Caption
            androidx.core.widget.AbstractC0665d0.m2943n(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = com.google.android.material.R$color.design_error
            int r4 = androidx.core.content.AbstractC0547a.m2322d(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m10724Q(android.widget.TextView, int):void");
    }

    /* renamed from: V */
    void m10725V(int i10) {
        boolean z10;
        boolean z11 = this.f9864h;
        if (this.f9862g == -1) {
            this.f9866i.setText(String.valueOf(i10));
            this.f9866i.setContentDescription(null);
            this.f9864h = false;
        } else {
            if (AbstractC0616q0.m2637o(this.f9866i) == 1) {
                AbstractC0616q0.m2640p0(this.f9866i, 0);
            }
            if (i10 > this.f9862g) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f9864h = z10;
            m10691W(getContext(), this.f9866i, i10, this.f9862g, this.f9864h);
            if (z11 != this.f9864h) {
                m10692X();
                if (this.f9864h) {
                    AbstractC0616q0.m2640p0(this.f9866i, 1);
                }
            }
            this.f9866i.setText(getContext().getString(R$string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.f9862g)));
        }
        if (this.f9858c != null && z11 != this.f9864h) {
            m10728c0(false);
            m10731e0();
            m10726Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m10726Y() {
        Drawable background;
        TextView textView;
        EditText editText = this.f9858c;
        if (editText == null || this.f9890u != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (AbstractC0421m1.m1828a(background)) {
            background = background.mutate();
        }
        if (this.f9860e.m10809k()) {
            background.setColorFilter(C0415l.m1764e(this.f9860e.m10811n(), PorterDuff.Mode.SRC_IN));
        } else if (this.f9864h && (textView = this.f9866i) != null) {
            background.setColorFilter(C0415l.m1764e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC6306k.m25057c(background);
            this.f9858c.refreshDrawableState();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f9856a.addView(view, layoutParams2);
            this.f9856a.setLayoutParams(layoutParams);
            m10697b0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* renamed from: c */
    public void m10727c(InterfaceC2601f interfaceC2601f) {
        this.f9851M.add(interfaceC2601f);
        if (this.f9858c != null) {
            interfaceC2601f.mo10732a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m10728c0(boolean z10) {
        m10698d0(z10, false);
    }

    /* renamed from: d */
    public void m10729d(InterfaceC2602g interfaceC2602g) {
        this.f9855W.add(interfaceC2602g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText;
        if (this.f9859d != null && (editText = this.f9858c) != null) {
            boolean z10 = this.f9880p;
            this.f9880p = false;
            CharSequence hint = editText.getHint();
            this.f9858c.setHint(this.f9859d);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f9858c.setHint(hint);
                this.f9880p = z10;
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f9841C0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f9841C0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m10675A(canvas);
        m10719z(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z10;
        if (this.f9839B0) {
            return;
        }
        boolean z11 = true;
        this.f9839B0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C2583a c2583a = this.f9899y0;
        if (c2583a != null) {
            z10 = c2583a.m10619R(drawableState) | false;
        } else {
            z10 = false;
        }
        if (!AbstractC0616q0.m2600R(this) || !isEnabled()) {
            z11 = false;
        }
        m10728c0(z11);
        m10726Y();
        m10731e0();
        if (z10) {
            invalidate();
        }
        this.f9839B0 = false;
    }

    /* renamed from: e */
    void m10730e(float f10) {
        if (this.f9899y0.m10630r() == f10) {
            return;
        }
        if (this.f9837A0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9837A0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC4346a.f18925b);
            this.f9837A0.setDuration(167L);
            this.f9837A0.addUpdateListener(new C2599d());
        }
        this.f9837A0.setFloatValues(this.f9899y0.m10630r(), f10);
        this.f9837A0.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void m10731e0() {
        boolean z10;
        boolean z11;
        TextView textView;
        boolean z12;
        EditText editText;
        EditText editText2;
        if (this.f9882q != null && this.f9890u != 0) {
            boolean z13 = false;
            if (!isFocused() && ((editText2 = this.f9858c) == null || !editText2.hasFocus())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!isHovered() && ((editText = this.f9858c) == null || !editText.isHovered())) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!isEnabled()) {
                this.f9900z = this.f9895w0;
            } else if (this.f9860e.m10809k()) {
                this.f9900z = this.f9860e.m10811n();
            } else if (this.f9864h && (textView = this.f9866i) != null) {
                this.f9900z = textView.getCurrentTextColor();
            } else if (z10) {
                this.f9900z = this.f9887s0;
            } else if (z11) {
                this.f9900z = this.f9885r0;
            } else {
                this.f9900z = this.f9883q0;
            }
            if (this.f9860e.m10809k() && getEndIconDelegate().mo10783c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            m10688S(z12);
            if (getErrorIconDrawable() != null && this.f9860e.m10818v() && this.f9860e.m10809k()) {
                z13 = true;
            }
            setErrorIconVisible(z13);
            if ((z11 || z10) && isEnabled()) {
                this.f9894w = this.f9898y;
            } else {
                this.f9894w = this.f9896x;
            }
            if (this.f9890u == 1) {
                if (!isEnabled()) {
                    this.f9836A = this.f9891u0;
                } else if (z11) {
                    this.f9836A = this.f9893v0;
                } else {
                    this.f9836A = this.f9889t0;
                }
            }
            m10699f();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f9858c;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m10711r();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6686i getBoxBackground() {
        int i10 = this.f9890u;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.f9882q;
    }

    public int getBoxBackgroundColor() {
        return this.f9836A;
    }

    public int getBoxBackgroundMode() {
        return this.f9890u;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f9882q.m26106r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f9882q.m26107s();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f9882q.m26089D();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f9882q.m26088C();
    }

    public int getBoxStrokeColor() {
        return this.f9887s0;
    }

    public int getCounterMaxLength() {
        return this.f9862g;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f9861f && this.f9864h && (textView = this.f9866i) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f9872l;
    }

    public ColorStateList getCounterTextColor() {
        return this.f9872l;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f9879o0;
    }

    public EditText getEditText() {
        return this.f9858c;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f9854V.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f9854V.getDrawable();
    }

    public int getEndIconMode() {
        return this.f9852N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f9854V;
    }

    public CharSequence getError() {
        if (this.f9860e.m10818v()) {
            return this.f9860e.m10810m();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f9860e.m10811n();
    }

    public Drawable getErrorIconDrawable() {
        return this.f9875m0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f9860e.m10811n();
    }

    public CharSequence getHelperText() {
        if (this.f9860e.m10819w()) {
            return this.f9860e.m10813p();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f9860e.m10814q();
    }

    public CharSequence getHint() {
        if (this.f9876n) {
            return this.f9878o;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f9899y0.m10627m();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f9899y0.m10628n();
    }

    public ColorStateList getHintTextColor() {
        return this.f9881p0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f9854V.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f9854V.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f9844F.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f9844F.getDrawable();
    }

    public Typeface getTypeface() {
        return this.f9843E;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f9858c;
        if (editText != null) {
            Rect rect = this.f9838B;
            AbstractC2584b.m10635a(this, editText, rect);
            m10689T(rect);
            if (this.f9876n) {
                this.f9899y0.m10607C(m10707n(rect));
                this.f9899y0.m10613J(m10710q(rect));
                this.f9899y0.m10633z();
                if (m10716w() && !this.f9897x0) {
                    m10681K();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean m10693Z = m10693Z();
        boolean m10695a0 = m10695a0();
        if (m10693Z || m10695a0) {
            this.f9858c.post(new RunnableC2598c());
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2603h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2603h c2603h = (C2603h) parcelable;
        super.onRestoreInstanceState(c2603h.m4828a());
        setError(c2603h.f9907c);
        if (c2603h.f9908d) {
            this.f9854V.post(new RunnableC2597b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z10;
        C2603h c2603h = new C2603h(super.onSaveInstanceState());
        if (this.f9860e.m10809k()) {
            c2603h.f9907c = getError();
        }
        if (m10677C() && this.f9854V.isChecked()) {
            z10 = true;
        } else {
            z10 = false;
        }
        c2603h.f9908d = z10;
        return c2603h;
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f9836A != i10) {
            this.f9836A = i10;
            this.f9889t0 = i10;
            m10699f();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(AbstractC0547a.m2322d(getContext(), i10));
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f9890u) {
            return;
        }
        this.f9890u = i10;
        if (this.f9858c != null) {
            m10680J();
        }
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f9887s0 != i10) {
            this.f9887s0 = i10;
            m10731e0();
        }
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f9861f != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f9866i = appCompatTextView;
                appCompatTextView.setId(R$id.textinput_counter);
                Typeface typeface = this.f9843E;
                if (typeface != null) {
                    this.f9866i.setTypeface(typeface);
                }
                this.f9866i.setMaxLines(1);
                this.f9860e.m10806d(this.f9866i, 2);
                m10692X();
                m10690U();
            } else {
                this.f9860e.m10820x(this.f9866i, 2);
                this.f9866i = null;
            }
            this.f9861f = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f9862g != i10) {
            if (i10 > 0) {
                this.f9862g = i10;
            } else {
                this.f9862g = -1;
            }
            if (this.f9861f) {
                m10690U();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f9868j != i10) {
            this.f9868j = i10;
            m10692X();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f9874m != colorStateList) {
            this.f9874m = colorStateList;
            m10692X();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f9870k != i10) {
            this.f9870k = i10;
            m10692X();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f9872l != colorStateList) {
            this.f9872l = colorStateList;
            m10692X();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f9879o0 = colorStateList;
        this.f9881p0 = colorStateList;
        if (this.f9858c != null) {
            m10728c0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        m10682L(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f9854V.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f9854V.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? AbstractC4105b.m17170d(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) {
        boolean z10;
        int i11 = this.f9852N;
        this.f9852N = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEndIconVisible(z10);
        if (getEndIconDelegate().mo10782b(this.f9890u)) {
            getEndIconDelegate().mo10745a();
            m10702i();
            m10718y(i11);
        } else {
            throw new IllegalStateException("The current box background mode " + this.f9890u + " is not supported by the end icon mode " + i10);
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m10685O(this.f9854V, onClickListener, this.f9877n0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9877n0 = onLongClickListener;
        m10686P(this.f9854V, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f9863g0 != colorStateList) {
            this.f9863g0 = colorStateList;
            this.f9865h0 = true;
            m10702i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f9867i0 != mode) {
            this.f9867i0 = mode;
            this.f9869j0 = true;
            m10702i();
        }
    }

    public void setEndIconVisible(boolean z10) {
        int i10;
        if (m10720E() != z10) {
            CheckableImageButton checkableImageButton = this.f9854V;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            checkableImageButton.setVisibility(i10);
            m10695a0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f9860e.m10818v()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f9860e.m10804J(charSequence);
        } else {
            this.f9860e.m10815r();
        }
    }

    public void setErrorEnabled(boolean z10) {
        this.f9860e.m10821z(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? AbstractC4105b.m17170d(getContext(), i10) : null);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9875m0.getDrawable();
        if (drawable != null) {
            drawable = AbstractC6306k.m25072r(drawable).mutate();
            AbstractC6306k.m25069o(drawable, colorStateList);
        }
        if (this.f9875m0.getDrawable() != drawable) {
            this.f9875m0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9875m0.getDrawable();
        if (drawable != null) {
            drawable = AbstractC6306k.m25072r(drawable).mutate();
            AbstractC6306k.m25070p(drawable, mode);
        }
        if (this.f9875m0.getDrawable() != drawable) {
            this.f9875m0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.f9860e.m10798A(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f9860e.m10799B(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m10721F()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!m10721F()) {
                setHelperTextEnabled(true);
            }
            this.f9860e.m10805K(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f9860e.m10802E(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f9860e.m10801D(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f9860e.m10800C(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f9876n) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f9901z0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f9876n) {
            this.f9876n = z10;
            if (!z10) {
                this.f9880p = false;
                if (!TextUtils.isEmpty(this.f9878o) && TextUtils.isEmpty(this.f9858c.getHint())) {
                    this.f9858c.setHint(this.f9878o);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f9858c.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f9878o)) {
                        setHint(hint);
                    }
                    this.f9858c.setHint((CharSequence) null);
                }
                this.f9880p = true;
            }
            if (this.f9858c != null) {
                m10697b0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f9899y0.m10608D(i10);
        this.f9881p0 = this.f9899y0.m10626l();
        if (this.f9858c != null) {
            m10728c0(false);
            m10697b0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f9881p0 != colorStateList) {
            if (this.f9879o0 == null) {
                this.f9899y0.m10609E(colorStateList);
            }
            this.f9881p0 = colorStateList;
            if (this.f9858c != null) {
                m10728c0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? AbstractC4105b.m17170d(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f9852N != 1) {
            setEndIconMode(1);
        } else if (!z10) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f9863g0 = colorStateList;
        this.f9865h0 = true;
        m10702i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f9867i0 = mode;
        this.f9869j0 = true;
        m10702i();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f9844F.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? AbstractC4105b.m17170d(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m10685O(this.f9844F, onClickListener, this.f9850L);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9850L = onLongClickListener;
        m10686P(this.f9844F, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f9845G != colorStateList) {
            this.f9845G = colorStateList;
            this.f9846H = true;
            m10704k();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f9847I != mode) {
            this.f9847I = mode;
            this.f9848J = true;
            m10704k();
        }
    }

    public void setStartIconVisible(boolean z10) {
        int i10;
        if (m10723I() != z10) {
            CheckableImageButton checkableImageButton = this.f9844F;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            m10695a0();
        }
    }

    public void setTextInputAccessibilityDelegate(C2600e c2600e) {
        EditText editText = this.f9858c;
        if (editText != null) {
            AbstractC0616q0.m2636n0(editText, c2600e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f9843E) {
            this.f9843E = typeface;
            this.f9899y0.m10622U(typeface);
            this.f9860e.m10803G(typeface);
            TextView textView = this.f9866i;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r23, android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f9854V.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f9854V.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f9875m0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f9860e.m10818v());
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f9844F.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f9844F.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m10704k();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f9854V.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f9854V.setImageDrawable(drawable);
    }
}
