package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.R$attr;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0559c;
import androidx.core.view.InterfaceC0596l0;
import androidx.core.view.InterfaceC0604n0;
import androidx.core.widget.AbstractC0665d0;
import androidx.core.widget.C0667e0;
import p405y.AbstractC7653c;
import p405y.AbstractC7654d;

/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
public class C0419m extends EditText implements InterfaceC0604n0, InterfaceC0596l0 {

    /* renamed from: a */
    private final C0395g f1816a;

    /* renamed from: b */
    private final C0452u0 f1817b;

    /* renamed from: c */
    private final C0416l0 f1818c;

    /* renamed from: d */
    private final C0667e0 f1819d;

    public C0419m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.editTextStyle);
    }

    @Override // androidx.core.view.InterfaceC0596l0
    /* renamed from: a */
    public C0559c mo1826a(C0559c c0559c) {
        return this.f1819d.mo2495a(this, c0559c);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0395g c0395g = this.f1816a;
        if (c0395g != null) {
            c0395g.m1699b();
        }
        C0452u0 c0452u0 = this.f1817b;
        if (c0452u0 != null) {
            c0452u0.m1952b();
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public ColorStateList getSupportBackgroundTintList() {
        C0395g c0395g = this.f1816a;
        if (c0395g != null) {
            return c0395g.m1700c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0395g c0395g = this.f1816a;
        if (c0395g != null) {
            return c0395g.m1701d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0416l0 c0416l0;
        if (Build.VERSION.SDK_INT < 28 && (c0416l0 = this.f1818c) != null) {
            return c0416l0.m1779a();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1817b.m1967r(this, onCreateInputConnection, editorInfo);
        InputConnection m1838a = AbstractC0423n.m1838a(onCreateInputConnection, editorInfo, this);
        String[] m2585E = AbstractC0616q0.m2585E(this);
        if (m1838a != null && m2585E != null) {
            AbstractC7653c.m29442d(editorInfo, m2585E);
            return AbstractC7654d.m29448a(m1838a, editorInfo, AbstractC0467y.m2029a(this));
        }
        return m1838a;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC0467y.m2030b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (AbstractC0467y.m2031c(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0395g c0395g = this.f1816a;
        if (c0395g != null) {
            c0395g.m1703f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0395g c0395g = this.f1816a;
        if (c0395g != null) {
            c0395g.m1704g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0665d0.m2945p(this, callback));
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0395g c0395g = this.f1816a;
        if (c0395g != null) {
            c0395g.m1706i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0395g c0395g = this.f1816a;
        if (c0395g != null) {
            c0395g.m1707j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0452u0 c0452u0 = this.f1817b;
        if (c0452u0 != null) {
            c0452u0.m1966q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0416l0 c0416l0;
        if (Build.VERSION.SDK_INT < 28 && (c0416l0 = this.f1818c) != null) {
            c0416l0.m1780b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public C0419m(Context context, AttributeSet attributeSet, int i10) {
        super(C0426n2.m1842b(context), attributeSet, i10);
        AbstractC0422m2.m1832a(this, getContext());
        C0395g c0395g = new C0395g(this);
        this.f1816a = c0395g;
        c0395g.m1702e(attributeSet, i10);
        C0452u0 c0452u0 = new C0452u0(this);
        this.f1817b = c0452u0;
        c0452u0.m1962m(attributeSet, i10);
        c0452u0.m1952b();
        this.f1818c = new C0416l0(this);
        this.f1819d = new C0667e0();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
