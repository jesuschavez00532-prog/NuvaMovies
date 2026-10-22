package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.InterfaceC0437q1;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC0437q1 {

    /* renamed from: a */
    private InterfaceC0437q1.a f1519a;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0437q1.a aVar = this.f1519a;
        if (aVar != null) {
            aVar.mo1158a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0437q1
    public void setOnFitSystemWindowsListener(InterfaceC0437q1.a aVar) {
        this.f1519a = aVar;
    }
}
