package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.InterfaceC0437q1;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0437q1 {

    /* renamed from: a */
    private InterfaceC0437q1.a f1520a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0437q1.a aVar = this.f1520a;
        if (aVar != null) {
            aVar.mo1158a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0437q1
    public void setOnFitSystemWindowsListener(InterfaceC0437q1.a aVar) {
        this.f1520a = aVar;
    }
}
