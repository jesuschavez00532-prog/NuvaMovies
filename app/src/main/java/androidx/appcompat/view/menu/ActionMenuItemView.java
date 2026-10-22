package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.C0325e;
import androidx.appcompat.view.menu.InterfaceC0331k;
import androidx.appcompat.widget.AbstractC0450t2;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC0441r1;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import p150h.InterfaceC4458e;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0331k.a, View.OnClickListener, ActionMenuView.InterfaceC0340a {

    /* renamed from: a */
    C0327g f1231a;

    /* renamed from: b */
    private CharSequence f1232b;

    /* renamed from: c */
    private Drawable f1233c;

    /* renamed from: d */
    C0325e.b f1234d;

    /* renamed from: e */
    private AbstractViewOnTouchListenerC0441r1 f1235e;

    /* renamed from: f */
    AbstractC0320b f1236f;

    /* renamed from: g */
    private boolean f1237g;

    /* renamed from: h */
    private boolean f1238h;

    /* renamed from: i */
    private int f1239i;

    /* renamed from: j */
    private int f1240j;

    /* renamed from: k */
    private int f1241k;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C0319a extends AbstractViewOnTouchListenerC0441r1 {
        public C0319a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0441r1
        /* renamed from: b */
        public InterfaceC4458e mo1266b() {
            AbstractC0320b abstractC0320b = ActionMenuItemView.this.f1236f;
            if (abstractC0320b != null) {
                return abstractC0320b.mo1268a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0441r1
        /* renamed from: c */
        protected boolean mo1267c() {
            InterfaceC4458e mo1266b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0325e.b bVar = actionMenuItemView.f1234d;
            if (bVar == null || !bVar.mo1269a(actionMenuItemView.f1231a) || (mo1266b = mo1266b()) == null || !mo1266b.isShowing()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0320b {
        /* renamed from: a */
        public abstract InterfaceC4458e mo1268a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: h */
    private boolean m1259h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480 && ((i10 < 640 || i11 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m1260i() {
        CharSequence charSequence;
        CharSequence title;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1232b);
        if (this.f1233c != null && (!this.f1231a.m1383B() || (!this.f1237g && !this.f1238h))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence2 = null;
        if (z12) {
            charSequence = this.f1232b;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f1231a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z12) {
                title = null;
            } else {
                title = this.f1231a.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1231a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z12) {
                charSequence2 = this.f1231a.getTitle();
            }
            AbstractC0450t2.m1940a(this, charSequence2);
            return;
        }
        AbstractC0450t2.m1940a(this, tooltipText);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0340a
    /* renamed from: b */
    public boolean mo1261b() {
        return m1265g();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0340a
    /* renamed from: c */
    public boolean mo1262c() {
        if (m1265g() && this.f1231a.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k.a
    /* renamed from: d */
    public boolean mo1263d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k.a
    /* renamed from: e */
    public void mo1264e(C0327g c0327g, int i10) {
        int i11;
        this.f1231a = c0327g;
        setIcon(c0327g.getIcon());
        setTitle(c0327g.m1390i(this));
        setId(c0327g.getItemId());
        if (c0327g.isVisible()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setEnabled(c0327g.isEnabled());
        if (c0327g.hasSubMenu() && this.f1235e == null) {
            this.f1235e = new C0319a();
        }
    }

    /* renamed from: g */
    public boolean m1265g() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k.a
    public C0327g getItemData() {
        return this.f1231a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0325e.b bVar = this.f1234d;
        if (bVar != null) {
            bVar.mo1269a(this.f1231a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1237g = m1259h();
        m1260i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean m1265g = m1265g();
        if (m1265g && (i13 = this.f1240j) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.f1239i);
        } else {
            i12 = this.f1239i;
        }
        if (mode != 1073741824 && this.f1239i > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!m1265g && this.f1233c != null) {
            super.setPadding((getMeasuredWidth() - this.f1233c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0441r1 abstractViewOnTouchListenerC0441r1;
        if (this.f1231a.hasSubMenu() && (abstractViewOnTouchListenerC0441r1 = this.f1235e) != null && abstractViewOnTouchListenerC0441r1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1238h != z10) {
            this.f1238h = z10;
            C0327g c0327g = this.f1231a;
            if (c0327g != null) {
                c0327g.m1386c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1233c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1241k;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1260i();
    }

    public void setItemInvoker(C0325e.b bVar) {
        this.f1234d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f1240j = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC0320b abstractC0320b) {
        this.f1236f = abstractC0320b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1232b = charSequence;
        m1260i();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f1237g = m1259h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f906c, i10, 0);
        this.f1239i = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1241k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1240j = -1;
        setSaveEnabled(false);
    }
}
