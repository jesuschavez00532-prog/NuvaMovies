package com.module.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class AutoCompleteEditView extends EditText {

    /* renamed from: a */
    private InterfaceC2992a f12132a;

    /* renamed from: com.module.view.AutoCompleteEditView$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2992a {
        /* renamed from: a */
        boolean mo12062a(int i10, KeyEvent keyEvent);
    }

    public AutoCompleteEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        if (!this.f12132a.mo12062a(i10, keyEvent) && !super.onKeyPreIme(i10, keyEvent)) {
            return false;
        }
        return true;
    }

    public void setOnKeyPreImeListener(InterfaceC2992a interfaceC2992a) {
        this.f12132a = interfaceC2992a;
    }
}
