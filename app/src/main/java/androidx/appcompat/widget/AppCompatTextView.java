package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0272b;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.view.InterfaceC0604n0;
import androidx.core.widget.AbstractC0665d0;
import androidx.core.widget.InterfaceC0660b;
import androidx.core.widget.InterfaceC0671g0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p106e.AbstractC4105b;
import p276p.AbstractC6136i;
import p360v.AbstractC7184o;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC0604n0, InterfaceC0671g0, InterfaceC0660b {
    private final C0395g mBackgroundTintHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<AbstractC7184o> mPrecomputedTextFuture;
    private final C0416l0 mTextClassifierHelper;
    private final C0452u0 mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private void m1488f() {
        Future<AbstractC7184o> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                AbstractC0272b.m941a(future.get());
                AbstractC0665d0.m2942m(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0395g c0395g = this.mBackgroundTintHelper;
        if (c0395g != null) {
            c0395g.m1699b();
        }
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1952b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0660b.f2492P) {
            return super.getAutoSizeMaxTextSize();
        }
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            return c0452u0.m1954e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0660b.f2492P) {
            return super.getAutoSizeMinTextSize();
        }
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            return c0452u0.m1955f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0660b.f2492P) {
            return super.getAutoSizeStepGranularity();
        }
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            return c0452u0.m1956g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0660b.f2492P) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            return c0452u0.m1957h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0660b.f2492P) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 == null) {
            return 0;
        }
        return c0452u0.m1958i();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return AbstractC0665d0.m2931b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return AbstractC0665d0.m2932c(this);
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public ColorStateList getSupportBackgroundTintList() {
        C0395g c0395g = this.mBackgroundTintHelper;
        if (c0395g != null) {
            return c0395g.m1700c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0395g c0395g = this.mBackgroundTintHelper;
        if (c0395g != null) {
            return c0395g.m1701d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m1959j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m1960k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m1488f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0416l0 c0416l0;
        if (Build.VERSION.SDK_INT < 28 && (c0416l0 = this.mTextClassifierHelper) != null) {
            return c0416l0.m1779a();
        }
        return super.getTextClassifier();
    }

    public AbstractC7184o.a getTextMetricsParamsCompat() {
        return AbstractC0665d0.m2935f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m1967r(this, onCreateInputConnection, editorInfo);
        return AbstractC0423n.m1838a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1964o(z10, i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        m1488f();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null && !InterfaceC0660b.f2492P && c0452u0.m1961l()) {
            this.mTextHelper.m1953c();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (InterfaceC0660b.f2492P) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1969t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (InterfaceC0660b.f2492P) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1970u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (InterfaceC0660b.f2492P) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1971v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0395g c0395g = this.mBackgroundTintHelper;
        if (c0395g != null) {
            c0395g.m1703f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0395g c0395g = this.mBackgroundTintHelper;
        if (c0395g != null) {
            c0395g.m1704g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1965p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1965p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1965p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1965p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0665d0.m2945p(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            AbstractC0665d0.m2939j(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            AbstractC0665d0.m2940k(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        AbstractC0665d0.m2941l(this, i10);
    }

    public void setPrecomputedText(AbstractC7184o abstractC7184o) {
        AbstractC0665d0.m2942m(this, abstractC7184o);
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0395g c0395g = this.mBackgroundTintHelper;
        if (c0395g != null) {
            c0395g.m1706i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0395g c0395g = this.mBackgroundTintHelper;
        if (c0395g != null) {
            c0395g.m1707j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0671g0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m1972w(colorStateList);
        this.mTextHelper.m1952b();
    }

    @Override // androidx.core.widget.InterfaceC0671g0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m1973x(mode);
        this.mTextHelper.m1952b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1966q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0416l0 c0416l0;
        if (Build.VERSION.SDK_INT < 28 && (c0416l0 = this.mTextClassifierHelper) != null) {
            c0416l0.m1780b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<AbstractC7184o> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(AbstractC7184o.a aVar) {
        AbstractC0665d0.m2944o(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (InterfaceC0660b.f2492P) {
            super.setTextSize(i10, f10);
            return;
        }
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1951A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface != null && i10 > 0) {
            typeface2 = AbstractC6136i.m24453a(getContext(), typeface, i10);
        } else {
            typeface2 = null;
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(C0426n2.m1842b(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        AbstractC0422m2.m1832a(this, getContext());
        C0395g c0395g = new C0395g(this);
        this.mBackgroundTintHelper = c0395g;
        c0395g.m1702e(attributeSet, i10);
        C0452u0 c0452u0 = new C0452u0(this);
        this.mTextHelper = c0452u0;
        c0452u0.m1962m(attributeSet, i10);
        c0452u0.m1952b();
        this.mTextClassifierHelper = new C0416l0(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? AbstractC4105b.m17170d(context, i10) : null, i11 != 0 ? AbstractC4105b.m17170d(context, i11) : null, i12 != 0 ? AbstractC4105b.m17170d(context, i12) : null, i13 != 0 ? AbstractC4105b.m17170d(context, i13) : null);
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1965p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? AbstractC4105b.m17170d(context, i10) : null, i11 != 0 ? AbstractC4105b.m17170d(context, i11) : null, i12 != 0 ? AbstractC4105b.m17170d(context, i12) : null, i13 != 0 ? AbstractC4105b.m17170d(context, i13) : null);
        C0452u0 c0452u0 = this.mTextHelper;
        if (c0452u0 != null) {
            c0452u0.m1965p();
        }
    }
}
