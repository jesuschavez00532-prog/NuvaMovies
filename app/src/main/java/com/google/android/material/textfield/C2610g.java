package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.AbstractC0616q0;
import androidx.core.widget.AbstractC0665d0;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import java.util.ArrayList;
import java.util.List;
import p144g5.AbstractC4346a;
import p144g5.AbstractC4347b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.g */
/* loaded from: classes.dex */
public final class C2610g {

    /* renamed from: a */
    private final Context f9950a;

    /* renamed from: b */
    private final TextInputLayout f9951b;

    /* renamed from: c */
    private LinearLayout f9952c;

    /* renamed from: d */
    private int f9953d;

    /* renamed from: e */
    private FrameLayout f9954e;

    /* renamed from: f */
    private int f9955f;

    /* renamed from: g */
    private Animator f9956g;

    /* renamed from: h */
    private final float f9957h;

    /* renamed from: i */
    private int f9958i;

    /* renamed from: j */
    private int f9959j;

    /* renamed from: k */
    private CharSequence f9960k;

    /* renamed from: l */
    private boolean f9961l;

    /* renamed from: m */
    private TextView f9962m;

    /* renamed from: n */
    private int f9963n;

    /* renamed from: o */
    private ColorStateList f9964o;

    /* renamed from: p */
    private CharSequence f9965p;

    /* renamed from: q */
    private boolean f9966q;

    /* renamed from: r */
    private TextView f9967r;

    /* renamed from: s */
    private int f9968s;

    /* renamed from: t */
    private ColorStateList f9969t;

    /* renamed from: u */
    private Typeface f9970u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.g$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f9971a;

        /* renamed from: b */
        final /* synthetic */ TextView f9972b;

        /* renamed from: c */
        final /* synthetic */ int f9973c;

        /* renamed from: d */
        final /* synthetic */ TextView f9974d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f9971a = i10;
            this.f9972b = textView;
            this.f9973c = i11;
            this.f9974d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2610g.this.f9958i = this.f9971a;
            C2610g.this.f9956g = null;
            TextView textView = this.f9972b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f9973c == 1 && C2610g.this.f9962m != null) {
                    C2610g.this.f9962m.setText((CharSequence) null);
                }
                TextView textView2 = this.f9974d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.f9974d.setAlpha(1.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f9974d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C2610g(TextInputLayout textInputLayout) {
        this.f9950a = textInputLayout.getContext();
        this.f9951b = textInputLayout;
        this.f9957h = r0.getResources().getDimensionPixelSize(R$dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: F */
    private void m10784F(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: H */
    private void m10785H(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: I */
    private boolean m10786I(TextView textView, CharSequence charSequence) {
        if (AbstractC0616q0.m2600R(this.f9951b) && this.f9951b.isEnabled() && (this.f9959j != this.f9958i || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private void m10787L(int i10, int i11, boolean z10) {
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f9956g = animatorSet;
            ArrayList arrayList = new ArrayList();
            m10792h(arrayList, this.f9966q, this.f9967r, 2, i10, i11);
            m10792h(arrayList, this.f9961l, this.f9962m, 1, i10, i11);
            AbstractC4347b.m18243a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, m10795l(i10), i10, m10795l(i11)));
            animatorSet.start();
        } else {
            m10797y(i10, i11);
        }
        this.f9951b.m10726Y();
        this.f9951b.m10728c0(z10);
        this.f9951b.m10731e0();
    }

    /* renamed from: f */
    private boolean m10791f() {
        if (this.f9952c != null && this.f9951b.getEditText() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m10792h(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                if (i12 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                list.add(m10793i(textView, z11));
                if (i12 == i10) {
                    list.add(m10794j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m10793i(TextView textView, boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f10);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(AbstractC4346a.f18924a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m10794j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f9957h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(AbstractC4346a.f18927d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m10795l(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f9967r;
        }
        return this.f9962m;
    }

    /* renamed from: t */
    private boolean m10796t(int i10) {
        if (i10 == 1 && this.f9962m != null && !TextUtils.isEmpty(this.f9960k)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private void m10797y(int i10, int i11) {
        TextView m10795l;
        TextView m10795l2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (m10795l2 = m10795l(i11)) != null) {
            m10795l2.setVisibility(0);
            m10795l2.setAlpha(1.0f);
        }
        if (i10 != 0 && (m10795l = m10795l(i10)) != null) {
            m10795l.setVisibility(4);
            if (i10 == 1) {
                m10795l.setText((CharSequence) null);
            }
        }
        this.f9958i = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m10798A(int i10) {
        this.f9963n = i10;
        TextView textView = this.f9962m;
        if (textView != null) {
            this.f9951b.m10724Q(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m10799B(ColorStateList colorStateList) {
        this.f9964o = colorStateList;
        TextView textView = this.f9962m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m10800C(int i10) {
        this.f9968s = i10;
        TextView textView = this.f9967r;
        if (textView != null) {
            AbstractC0665d0.m2943n(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m10801D(boolean z10) {
        if (this.f9966q == z10) {
            return;
        }
        m10808g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f9950a);
            this.f9967r = appCompatTextView;
            appCompatTextView.setId(R$id.textinput_helper_text);
            Typeface typeface = this.f9970u;
            if (typeface != null) {
                this.f9967r.setTypeface(typeface);
            }
            this.f9967r.setVisibility(4);
            AbstractC0616q0.m2640p0(this.f9967r, 1);
            m10800C(this.f9968s);
            m10802E(this.f9969t);
            m10806d(this.f9967r, 1);
        } else {
            m10816s();
            m10820x(this.f9967r, 1);
            this.f9967r = null;
            this.f9951b.m10726Y();
            this.f9951b.m10731e0();
        }
        this.f9966q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m10802E(ColorStateList colorStateList) {
        this.f9969t = colorStateList;
        TextView textView = this.f9967r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m10803G(Typeface typeface) {
        if (typeface != this.f9970u) {
            this.f9970u = typeface;
            m10784F(this.f9962m, typeface);
            m10784F(this.f9967r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m10804J(CharSequence charSequence) {
        m10808g();
        this.f9960k = charSequence;
        this.f9962m.setText(charSequence);
        int i10 = this.f9958i;
        if (i10 != 1) {
            this.f9959j = 1;
        }
        m10787L(i10, this.f9959j, m10786I(this.f9962m, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m10805K(CharSequence charSequence) {
        m10808g();
        this.f9965p = charSequence;
        this.f9967r.setText(charSequence);
        int i10 = this.f9958i;
        if (i10 != 2) {
            this.f9959j = 2;
        }
        m10787L(i10, this.f9959j, m10786I(this.f9967r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m10806d(TextView textView, int i10) {
        if (this.f9952c == null && this.f9954e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f9950a);
            this.f9952c = linearLayout;
            linearLayout.setOrientation(0);
            this.f9951b.addView(this.f9952c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f9950a);
            this.f9954e = frameLayout;
            this.f9952c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f9952c.addView(new Space(this.f9950a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f9951b.getEditText() != null) {
                m10807e();
            }
        }
        if (m10817u(i10)) {
            this.f9954e.setVisibility(0);
            this.f9954e.addView(textView);
            this.f9955f++;
        } else {
            this.f9952c.addView(textView, i10);
        }
        this.f9952c.setVisibility(0);
        this.f9953d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m10807e() {
        if (m10791f()) {
            AbstractC0616q0.m2660z0(this.f9952c, AbstractC0616q0.m2589G(this.f9951b.getEditText()), 0, AbstractC0616q0.m2587F(this.f9951b.getEditText()), 0);
        }
    }

    /* renamed from: g */
    void m10808g() {
        Animator animator = this.f9956g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m10809k() {
        return m10796t(this.f9959j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence m10810m() {
        return this.f9960k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m10811n() {
        TextView textView = this.f9962m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ColorStateList m10812o() {
        TextView textView = this.f9962m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public CharSequence m10813p() {
        return this.f9965p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m10814q() {
        TextView textView = this.f9967r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m10815r() {
        this.f9960k = null;
        m10808g();
        if (this.f9958i == 1) {
            if (this.f9966q && !TextUtils.isEmpty(this.f9965p)) {
                this.f9959j = 2;
            } else {
                this.f9959j = 0;
            }
        }
        m10787L(this.f9958i, this.f9959j, m10786I(this.f9962m, null));
    }

    /* renamed from: s */
    void m10816s() {
        m10808g();
        int i10 = this.f9958i;
        if (i10 == 2) {
            this.f9959j = 0;
        }
        m10787L(i10, this.f9959j, m10786I(this.f9967r, null));
    }

    /* renamed from: u */
    boolean m10817u(int i10) {
        return i10 == 0 || i10 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean m10818v() {
        return this.f9961l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m10819w() {
        return this.f9966q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m10820x(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f9952c == null) {
            return;
        }
        if (m10817u(i10) && (frameLayout = this.f9954e) != null) {
            int i11 = this.f9955f - 1;
            this.f9955f = i11;
            m10785H(frameLayout, i11);
            this.f9954e.removeView(textView);
        } else {
            this.f9952c.removeView(textView);
        }
        int i12 = this.f9953d - 1;
        this.f9953d = i12;
        m10785H(this.f9952c, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m10821z(boolean z10) {
        if (this.f9961l == z10) {
            return;
        }
        m10808g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f9950a);
            this.f9962m = appCompatTextView;
            appCompatTextView.setId(R$id.textinput_error);
            Typeface typeface = this.f9970u;
            if (typeface != null) {
                this.f9962m.setTypeface(typeface);
            }
            m10798A(this.f9963n);
            m10799B(this.f9964o);
            this.f9962m.setVisibility(4);
            AbstractC0616q0.m2640p0(this.f9962m, 1);
            m10806d(this.f9962m, 0);
        } else {
            m10815r();
            m10820x(this.f9962m, 0);
            this.f9962m = null;
            this.f9951b.m10726Y();
            this.f9951b.m10731e0();
        }
        this.f9961l = z10;
    }
}
