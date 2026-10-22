package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0589j1;
import androidx.core.view.InterfaceC0593k1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0371a extends ViewGroup {

    /* renamed from: a */
    protected final a f1647a;

    /* renamed from: b */
    protected final Context f1648b;

    /* renamed from: c */
    protected ActionMenuView f1649c;

    /* renamed from: d */
    protected C0387e f1650d;

    /* renamed from: e */
    protected int f1651e;

    /* renamed from: f */
    protected C0589j1 f1652f;

    /* renamed from: g */
    private boolean f1653g;

    /* renamed from: h */
    private boolean f1654h;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    protected class a implements InterfaceC0593k1 {

        /* renamed from: a */
        private boolean f1655a = false;

        /* renamed from: b */
        int f1656b;

        protected a() {
        }

        @Override // androidx.core.view.InterfaceC0593k1
        /* renamed from: a */
        public void mo1593a(View view) {
            this.f1655a = true;
        }

        @Override // androidx.core.view.InterfaceC0593k1
        /* renamed from: b */
        public void mo1160b(View view) {
            if (this.f1655a) {
                return;
            }
            AbstractC0371a abstractC0371a = AbstractC0371a.this;
            abstractC0371a.f1652f = null;
            AbstractC0371a.super.setVisibility(this.f1656b);
        }

        @Override // androidx.core.view.InterfaceC0593k1
        /* renamed from: c */
        public void mo1161c(View view) {
            AbstractC0371a.super.setVisibility(0);
            this.f1655a = false;
        }

        /* renamed from: d */
        public a m1594d(C0589j1 c0589j1, int i10) {
            AbstractC0371a.this.f1652f = c0589j1;
            this.f1656b = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0371a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1647a = new a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f1648b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1648b = context;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static int m1590d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m1591c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m1592e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    /* renamed from: f */
    public C0589j1 mo1432f(int i10, long j10) {
        C0589j1 c0589j1 = this.f1652f;
        if (c0589j1 != null) {
            c0589j1.m2484b();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0589j1 m2483a = AbstractC0616q0.m2615d(this).m2483a(1.0f);
            m2483a.m2486d(j10);
            m2483a.m2488f(this.f1647a.m1594d(m2483a, i10));
            return m2483a;
        }
        C0589j1 m2483a2 = AbstractC0616q0.m2615d(this).m2483a(0.0f);
        m2483a2.m2486d(j10);
        m2483a2.m2488f(this.f1647a.m1594d(m2483a2, i10));
        return m2483a2;
    }

    public int getAnimatedVisibility() {
        if (this.f1652f != null) {
            return this.f1647a.f1656b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1651e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.f904a, R$attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0387e c0387e = this.f1650d;
        if (c0387e != null) {
            c0387e.m1683F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1654h = false;
        }
        if (!this.f1654h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1654h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1654h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1653g = false;
        }
        if (!this.f1653g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1653g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1653g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C0589j1 c0589j1 = this.f1652f;
            if (c0589j1 != null) {
                c0589j1.m2484b();
            }
            super.setVisibility(i10);
        }
    }
}
