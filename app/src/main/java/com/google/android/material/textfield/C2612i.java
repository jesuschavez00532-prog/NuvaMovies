package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;
import p106e.AbstractC4105b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.i */
/* loaded from: classes.dex */
public class C2612i extends AbstractC2609f {

    /* renamed from: d */
    private final TextWatcher f9976d;

    /* renamed from: e */
    private final TextInputLayout.InterfaceC2601f f9977e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC2602g f9978f;

    /* renamed from: com.google.android.material.textfield.i$a */
    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C2612i.this.f9949c.setChecked(!r1.m10824f());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: com.google.android.material.textfield.i$b */
    /* loaded from: classes.dex */
    class b implements TextInputLayout.InterfaceC2601f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2601f
        /* renamed from: a */
        public void mo10732a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            C2612i.this.f9949c.setChecked(!r4.m10824f());
            editText.removeTextChangedListener(C2612i.this.f9976d);
            editText.addTextChangedListener(C2612i.this.f9976d);
        }
    }

    /* renamed from: com.google.android.material.textfield.i$c */
    /* loaded from: classes.dex */
    class c implements TextInputLayout.InterfaceC2602g {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2602g
        /* renamed from: a */
        public void mo10733a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.i$d */
    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C2612i.this.f9947a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (C2612i.this.m10824f()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2612i(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f9976d = new a();
        this.f9977e = new b();
        this.f9978f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m10824f() {
        EditText editText = this.f9947a.getEditText();
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2609f
    /* renamed from: a */
    public void mo10745a() {
        this.f9947a.setEndIconDrawable(AbstractC4105b.m17170d(this.f9948b, R$drawable.design_password_eye));
        TextInputLayout textInputLayout = this.f9947a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R$string.password_toggle_content_description));
        this.f9947a.setEndIconOnClickListener(new d());
        this.f9947a.m10727c(this.f9977e);
        this.f9947a.m10729d(this.f9978f);
    }
}
