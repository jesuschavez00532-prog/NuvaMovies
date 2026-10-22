package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.AbstractC0665d0;
import p106e.AbstractC4105b;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public class C0407j extends CheckedTextView {

    /* renamed from: b */
    private static final int[] f1776b = {R.attr.checkMark};

    /* renamed from: a */
    private final C0452u0 f1777a;

    public C0407j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0452u0 c0452u0 = this.f1777a;
        if (c0452u0 != null) {
            c0452u0.m1952b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC0423n.m1838a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(AbstractC4105b.m17170d(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0665d0.m2945p(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0452u0 c0452u0 = this.f1777a;
        if (c0452u0 != null) {
            c0452u0.m1966q(context, i10);
        }
    }

    public C0407j(Context context, AttributeSet attributeSet, int i10) {
        super(C0426n2.m1842b(context), attributeSet, i10);
        AbstractC0422m2.m1832a(this, getContext());
        C0452u0 c0452u0 = new C0452u0(this);
        this.f1777a = c0452u0;
        c0452u0.m1962m(attributeSet, i10);
        c0452u0.m1952b();
        C0438q2 m1874v = C0438q2.m1874v(getContext(), attributeSet, f1776b, i10, 0);
        setCheckMarkDrawable(m1874v.m1881g(0));
        m1874v.m1894w();
    }
}
