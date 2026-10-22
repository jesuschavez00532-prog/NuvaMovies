package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;
import p106e.AbstractC4105b;
import p144g5.AbstractC4346a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes.dex */
public class C2604a extends AbstractC2609f {

    /* renamed from: d */
    private final TextWatcher f9909d;

    /* renamed from: e */
    private final TextInputLayout.InterfaceC2601f f9910e;

    /* renamed from: f */
    private AnimatorSet f9911f;

    /* renamed from: g */
    private ValueAnimator f9912g;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C2604a.m10743j(editable)) {
                if (!C2604a.this.f9947a.m10720E()) {
                    C2604a.this.f9912g.cancel();
                    C2604a.this.f9911f.start();
                    return;
                }
                return;
            }
            C2604a.this.f9911f.cancel();
            C2604a.this.f9912g.start();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: classes.dex */
    class b implements TextInputLayout.InterfaceC2601f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2601f
        /* renamed from: a */
        public void mo10732a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C2604a.m10743j(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(C2604a.this.f9909d);
            editText.addTextChangedListener(C2604a.this.f9909d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2604a.this.f9947a.getEditText().setText((CharSequence) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2604a.this.f9947a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$e */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2604a.this.f9947a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$f */
    /* loaded from: classes.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2604a.this.f9949c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$g */
    /* loaded from: classes.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2604a.this.f9949c.setScaleX(floatValue);
            C2604a.this.f9949c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2604a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f9909d = new a();
        this.f9910e = new b();
    }

    /* renamed from: h */
    private ValueAnimator m10741h(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AbstractC4346a.f18924a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }

    /* renamed from: i */
    private ValueAnimator m10742i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(AbstractC4346a.f18927d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new g());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m10743j(Editable editable) {
        if (editable.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m10744k() {
        ValueAnimator m10742i = m10742i();
        ValueAnimator m10741h = m10741h(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f9911f = animatorSet;
        animatorSet.playTogether(m10742i, m10741h);
        this.f9911f.addListener(new d());
        ValueAnimator m10741h2 = m10741h(1.0f, 0.0f);
        this.f9912g = m10741h2;
        m10741h2.addListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2609f
    /* renamed from: a */
    public void mo10745a() {
        this.f9947a.setEndIconDrawable(AbstractC4105b.m17170d(this.f9948b, R$drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f9947a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.clear_text_end_icon_content_description));
        this.f9947a.setEndIconOnClickListener(new c());
        this.f9947a.m10727c(this.f9910e);
        m10744k();
    }
}
