package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.AbstractC0616q0;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;
import p106e.AbstractC4105b;
import p144g5.AbstractC4346a;
import p188j5.AbstractC4995a;
import p326s5.C6686i;
import p326s5.C6690m;
import p389x.C7458h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.e */
/* loaded from: classes.dex */
public class C2608e extends AbstractC2609f {

    /* renamed from: o */
    private static final boolean f9923o;

    /* renamed from: d */
    private final TextWatcher f9924d;

    /* renamed from: e */
    private final TextInputLayout.C2600e f9925e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC2601f f9926f;

    /* renamed from: g */
    private boolean f9927g;

    /* renamed from: h */
    private boolean f9928h;

    /* renamed from: i */
    private long f9929i;

    /* renamed from: j */
    private StateListDrawable f9930j;

    /* renamed from: k */
    private C6686i f9931k;

    /* renamed from: l */
    private AccessibilityManager f9932l;

    /* renamed from: m */
    private ValueAnimator f9933m;

    /* renamed from: n */
    private ValueAnimator f9934n;

    /* renamed from: com.google.android.material.textfield.e$a */
    /* loaded from: classes.dex */
    class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC7822a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AutoCompleteTextView f9936a;

            RunnableC7822a(AutoCompleteTextView autoCompleteTextView) {
                this.f9936a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f9936a.isPopupShowing();
                C2608e.this.m10781z(isPopupShowing);
                C2608e.this.f9927g = isPopupShowing;
            }
        }

        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C2608e c2608e = C2608e.this;
            AutoCompleteTextView m10776u = c2608e.m10776u(c2608e.f9947a.getEditText());
            m10776u.post(new RunnableC7822a(m10776u));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: com.google.android.material.textfield.e$b */
    /* loaded from: classes.dex */
    class b extends TextInputLayout.C2600e {
        b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C2600e, androidx.core.view.C0551a
        /* renamed from: g */
        public void mo2382g(View view, C7458h0 c7458h0) {
            super.mo2382g(view, c7458h0);
            c7458h0.m28599X(Spinner.class.getName());
            if (c7458h0.m28590J()) {
                c7458h0.m28615i0(null);
            }
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: h */
        public void mo2383h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2383h(view, accessibilityEvent);
            C2608e c2608e = C2608e.this;
            AutoCompleteTextView m10776u = c2608e.m10776u(c2608e.f9947a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C2608e.this.f9932l.isTouchExplorationEnabled()) {
                C2608e.this.m10758C(m10776u);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.e$c */
    /* loaded from: classes.dex */
    class c implements TextInputLayout.InterfaceC2601f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2601f
        /* renamed from: a */
        public void mo10732a(TextInputLayout textInputLayout) {
            AutoCompleteTextView m10776u = C2608e.this.m10776u(textInputLayout.getEditText());
            C2608e.this.m10756A(m10776u);
            C2608e.this.m10773r(m10776u);
            C2608e.this.m10757B(m10776u);
            m10776u.setThreshold(0);
            m10776u.removeTextChangedListener(C2608e.this.f9924d);
            m10776u.addTextChangedListener(C2608e.this.f9924d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C2608e.this.f9925e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.e$d */
    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2608e.this.m10758C((AutoCompleteTextView) C2608e.this.f9947a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$e */
    /* loaded from: classes.dex */
    public class e implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AutoCompleteTextView f9941a;

        e(AutoCompleteTextView autoCompleteTextView) {
            this.f9941a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C2608e.this.m10780y()) {
                    C2608e.this.f9927g = false;
                }
                C2608e.this.m10758C(this.f9941a);
                view.performClick();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$f */
    /* loaded from: classes.dex */
    public class f implements View.OnFocusChangeListener {
        f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            C2608e.this.f9947a.setEndIconActivated(z10);
            if (!z10) {
                C2608e.this.m10781z(false);
                C2608e.this.f9927g = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$g */
    /* loaded from: classes.dex */
    public class g implements AutoCompleteTextView.OnDismissListener {
        g() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C2608e.this.f9927g = true;
            C2608e.this.f9929i = System.currentTimeMillis();
            C2608e.this.m10781z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$h */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2608e c2608e = C2608e.this;
            c2608e.f9949c.setChecked(c2608e.f9928h);
            C2608e.this.f9934n.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$i */
    /* loaded from: classes.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2608e.this.f9949c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        f9923o = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2608e(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f9924d = new a();
        this.f9925e = new b(this.f9947a);
        this.f9926f = new c();
        this.f9927g = false;
        this.f9928h = false;
        this.f9929i = Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m10756A(AutoCompleteTextView autoCompleteTextView) {
        if (f9923o) {
            int boxBackgroundMode = this.f9947a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f9931k);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f9930j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m10757B(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new f());
        if (f9923o) {
            autoCompleteTextView.setOnDismissListener(new g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m10758C(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (m10780y()) {
            this.f9927g = false;
        }
        if (!this.f9927g) {
            if (f9923o) {
                m10781z(!this.f9928h);
            } else {
                this.f9928h = !this.f9928h;
                this.f9949c.toggle();
            }
            if (this.f9928h) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.f9927g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m10773r(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f9947a.getBoxBackgroundMode();
        C6686i boxBackground = this.f9947a.getBoxBackground();
        int m20373c = AbstractC4995a.m20373c(autoCompleteTextView, R$attr.colorControlHighlight);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            m10775t(autoCompleteTextView, m20373c, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            m10774s(autoCompleteTextView, m20373c, iArr, boxBackground);
        }
    }

    /* renamed from: s */
    private void m10774s(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, C6686i c6686i) {
        int boxBackgroundColor = this.f9947a.getBoxBackgroundColor();
        int[] iArr2 = {AbstractC4995a.m20376f(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f9923o) {
            AbstractC0616q0.m2642q0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), c6686i, c6686i));
            return;
        }
        C6686i c6686i2 = new C6686i(c6686i.m26087A());
        c6686i2.m26096R(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c6686i, c6686i2});
        int m2589G = AbstractC0616q0.m2589G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int m2587F = AbstractC0616q0.m2587F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        AbstractC0616q0.m2642q0(autoCompleteTextView, layerDrawable);
        AbstractC0616q0.m2660z0(autoCompleteTextView, m2589G, paddingTop, m2587F, paddingBottom);
    }

    /* renamed from: t */
    private void m10775t(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, C6686i c6686i) {
        LayerDrawable layerDrawable;
        int m20373c = AbstractC4995a.m20373c(autoCompleteTextView, R$attr.colorSurface);
        C6686i c6686i2 = new C6686i(c6686i.m26087A());
        int m20376f = AbstractC4995a.m20376f(i10, m20373c, 0.1f);
        c6686i2.m26096R(new ColorStateList(iArr, new int[]{m20376f, 0}));
        if (f9923o) {
            c6686i2.setTint(m20373c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m20376f, m20373c});
            C6686i c6686i3 = new C6686i(c6686i.m26087A());
            c6686i3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c6686i2, c6686i3), c6686i});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{c6686i2, c6686i});
        }
        AbstractC0616q0.m2642q0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public AutoCompleteTextView m10776u(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: v */
    private ValueAnimator m10777v(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AbstractC4346a.f18924a);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    /* renamed from: w */
    private C6686i m10778w(float f10, float f11, float f12, int i10) {
        C6690m m26165m = C6690m.m26123a().m26177z(f10).m26163D(f10).m26169r(f11).m26173v(f11).m26165m();
        C6686i m26081l = C6686i.m26081l(this.f9948b, f12);
        m26081l.setShapeAppearanceModel(m26165m);
        m26081l.m26098T(0, i10, 0, i10);
        return m26081l;
    }

    /* renamed from: x */
    private void m10779x() {
        this.f9934n = m10777v(67, 0.0f, 1.0f);
        ValueAnimator m10777v = m10777v(50, 1.0f, 0.0f);
        this.f9933m = m10777v;
        m10777v.addListener(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public boolean m10780y() {
        long currentTimeMillis = System.currentTimeMillis() - this.f9929i;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m10781z(boolean z10) {
        if (this.f9928h != z10) {
            this.f9928h = z10;
            this.f9934n.cancel();
            this.f9933m.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2609f
    /* renamed from: a */
    public void mo10745a() {
        int i10;
        float dimensionPixelOffset = this.f9948b.getResources().getDimensionPixelOffset(R$dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f9948b.getResources().getDimensionPixelOffset(R$dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f9948b.getResources().getDimensionPixelOffset(R$dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C6686i m10778w = m10778w(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C6686i m10778w2 = m10778w(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f9931k = m10778w;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f9930j = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, m10778w);
        this.f9930j.addState(new int[0], m10778w2);
        if (f9923o) {
            i10 = R$drawable.mtrl_dropdown_arrow;
        } else {
            i10 = R$drawable.mtrl_ic_arrow_drop_down;
        }
        this.f9947a.setEndIconDrawable(AbstractC4105b.m17170d(this.f9948b, i10));
        TextInputLayout textInputLayout = this.f9947a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.exposed_dropdown_menu_content_description));
        this.f9947a.setEndIconOnClickListener(new d());
        this.f9947a.m10727c(this.f9926f);
        m10779x();
        AbstractC0616q0.m2654w0(this.f9949c, 2);
        this.f9932l = (AccessibilityManager) this.f9948b.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2609f
    /* renamed from: b */
    public boolean mo10782b(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2609f
    /* renamed from: c */
    public boolean mo10783c() {
        return true;
    }
}
