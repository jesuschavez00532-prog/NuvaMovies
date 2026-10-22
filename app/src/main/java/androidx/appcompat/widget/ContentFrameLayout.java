package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0616q0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private TypedValue f1511a;

    /* renamed from: b */
    private TypedValue f1512b;

    /* renamed from: c */
    private TypedValue f1513c;

    /* renamed from: d */
    private TypedValue f1514d;

    /* renamed from: e */
    private TypedValue f1515e;

    /* renamed from: f */
    private TypedValue f1516f;

    /* renamed from: g */
    private final Rect f1517g;

    /* renamed from: h */
    private InterfaceC0345a f1518h;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0345a {
        /* renamed from: a */
        void mo1159a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m1491a(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: b */
    public void m1492b(int i10, int i11, int i12, int i13) {
        this.f1517g.set(i10, i11, i12, i13);
        if (AbstractC0616q0.m2600R(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1515e == null) {
            this.f1515e = new TypedValue();
        }
        return this.f1515e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1516f == null) {
            this.f1516f = new TypedValue();
        }
        return this.f1516f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1513c == null) {
            this.f1513c = new TypedValue();
        }
        return this.f1513c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1514d == null) {
            this.f1514d = new TypedValue();
        }
        return this.f1514d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1511a == null) {
            this.f1511a = new TypedValue();
        }
        return this.f1511a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1512b == null) {
            this.f1512b = new TypedValue();
        }
        return this.f1512b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0345a interfaceC0345a = this.f1518h;
        if (interfaceC0345a != null) {
            interfaceC0345a.mo1159a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0345a interfaceC0345a = this.f1518h;
        if (interfaceC0345a != null) {
            interfaceC0345a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0345a interfaceC0345a) {
        this.f1518h = interfaceC0345a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1517g = new Rect();
    }
}
