package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.f */
/* loaded from: classes.dex */
public abstract class AbstractC2609f {

    /* renamed from: a */
    TextInputLayout f9947a;

    /* renamed from: b */
    Context f9948b;

    /* renamed from: c */
    CheckableImageButton f9949c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2609f(TextInputLayout textInputLayout) {
        this.f9947a = textInputLayout;
        this.f9948b = textInputLayout.getContext();
        this.f9949c = textInputLayout.getEndIconView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo10745a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10782b(int i10) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10783c() {
        return false;
    }
}
