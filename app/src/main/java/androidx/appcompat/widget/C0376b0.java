package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.DialogInterfaceC0301b;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.InterfaceC0604n0;
import p106e.AbstractC4105b;
import p150h.InterfaceC4458e;

/* renamed from: androidx.appcompat.widget.b0 */
/* loaded from: classes.dex */
public class C0376b0 extends Spinner implements InterfaceC0604n0 {

    /* renamed from: i */
    private static final int[] f1664i = {R.attr.spinnerMode};

    /* renamed from: a */
    private final C0395g f1665a;

    /* renamed from: b */
    private final Context f1666b;

    /* renamed from: c */
    private AbstractViewOnTouchListenerC0441r1 f1667c;

    /* renamed from: d */
    private SpinnerAdapter f1668d;

    /* renamed from: e */
    private final boolean f1669e;

    /* renamed from: f */
    private g f1670f;

    /* renamed from: g */
    int f1671g;

    /* renamed from: h */
    final Rect f1672h;

    /* renamed from: androidx.appcompat.widget.b0$a */
    /* loaded from: classes.dex */
    class a extends AbstractViewOnTouchListenerC0441r1 {

        /* renamed from: j */
        final /* synthetic */ e f1673j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f1673j = eVar;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0441r1
        /* renamed from: b */
        public InterfaceC4458e mo1266b() {
            return this.f1673j;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0441r1
        /* renamed from: c */
        public boolean mo1267c() {
            if (!C0376b0.this.getInternalPopup().isShowing()) {
                C0376b0.this.m1605b();
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$b */
    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C0376b0.this.getInternalPopup().isShowing()) {
                C0376b0.this.m1605b();
            }
            ViewTreeObserver viewTreeObserver = C0376b0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$c */
    /* loaded from: classes.dex */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: a */
        DialogInterfaceC0301b f1676a;

        /* renamed from: b */
        private ListAdapter f1677b;

        /* renamed from: c */
        private CharSequence f1678c;

        c() {
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: a */
        public int mo1606a() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: c */
        public void mo1607c(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: d */
        public CharSequence mo1608d() {
            return this.f1678c;
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        public void dismiss() {
            DialogInterfaceC0301b dialogInterfaceC0301b = this.f1676a;
            if (dialogInterfaceC0301b != null) {
                dialogInterfaceC0301b.dismiss();
                this.f1676a = null;
            }
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: f */
        public Drawable mo1609f() {
            return null;
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: g */
        public void mo1610g(CharSequence charSequence) {
            this.f1678c = charSequence;
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: i */
        public void mo1611i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        public boolean isShowing() {
            DialogInterfaceC0301b dialogInterfaceC0301b = this.f1676a;
            if (dialogInterfaceC0301b != null) {
                return dialogInterfaceC0301b.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: j */
        public void mo1612j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: k */
        public void mo1613k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: l */
        public void mo1614l(int i10, int i11) {
            if (this.f1677b == null) {
                return;
            }
            DialogInterfaceC0301b.a aVar = new DialogInterfaceC0301b.a(C0376b0.this.getPopupContext());
            CharSequence charSequence = this.f1678c;
            if (charSequence != null) {
                aVar.m1048h(charSequence);
            }
            DialogInterfaceC0301b m1041a = aVar.m1047g(this.f1677b, C0376b0.this.getSelectedItemPosition(), this).m1041a();
            this.f1676a = m1041a;
            ListView m1040e = m1041a.m1040e();
            m1040e.setTextDirection(i10);
            m1040e.setTextAlignment(i11);
            this.f1676a.show();
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: m */
        public int mo1615m() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: n */
        public void mo1616n(ListAdapter listAdapter) {
            this.f1677b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C0376b0.this.setSelection(i10);
            if (C0376b0.this.getOnItemClickListener() != null) {
                C0376b0.this.performItemClick(null, i10, this.f1677b.getItemId(i10));
            }
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.b0$d */
    /* loaded from: classes.dex */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f1680a;

        /* renamed from: b */
        private ListAdapter f1681b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            Resources.Theme dropDownViewTheme;
            this.f1680a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1681b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && AbstractC0380c0.m1631a(spinnerAdapter)) {
                ThemedSpinnerAdapter m1667a = AbstractC0384d0.m1667a(spinnerAdapter);
                dropDownViewTheme = m1667a.getDropDownViewTheme();
                if (dropDownViewTheme != theme) {
                    m1667a.setDropDownViewTheme(theme);
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1681b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1680a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1680a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1680a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1680a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1680a;
            if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
                return true;
            }
            return false;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1681b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1680a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1680a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$e */
    /* loaded from: classes.dex */
    class e extends AbstractC0461w1 implements g {

        /* renamed from: J */
        private CharSequence f1682J;

        /* renamed from: K */
        ListAdapter f1683K;

        /* renamed from: L */
        private final Rect f1684L;

        /* renamed from: M */
        private int f1685M;

        /* renamed from: androidx.appcompat.widget.b0$e$a */
        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ C0376b0 f1687a;

            a(C0376b0 c0376b0) {
                this.f1687a = c0376b0;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                C0376b0.this.setSelection(i10);
                if (C0376b0.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    C0376b0.this.performItemClick(view, i10, eVar.f1683K.getItemId(i10));
                }
                e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.b0$e$b */
        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.m1620O(C0376b0.this)) {
                    e.this.dismiss();
                } else {
                    e.this.m1618M();
                    e.super.show();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.b0$e$c */
        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1690a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1690a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0376b0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1690a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1684L = new Rect();
            m2018x(C0376b0.this);
            m2000D(true);
            m2004I(0);
            m2002F(new a(C0376b0.this));
        }

        /* renamed from: M */
        void m1618M() {
            int i10;
            int m1619N;
            Drawable m2009f = m2009f();
            if (m2009f != null) {
                m2009f.getPadding(C0376b0.this.f1672h);
                if (AbstractC0466x2.m2027b(C0376b0.this)) {
                    i10 = C0376b0.this.f1672h.right;
                } else {
                    i10 = -C0376b0.this.f1672h.left;
                }
            } else {
                Rect rect = C0376b0.this.f1672h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = C0376b0.this.getPaddingLeft();
            int paddingRight = C0376b0.this.getPaddingRight();
            int width = C0376b0.this.getWidth();
            C0376b0 c0376b0 = C0376b0.this;
            int i11 = c0376b0.f1671g;
            if (i11 == -2) {
                int m1604a = c0376b0.m1604a((SpinnerAdapter) this.f1683K, m2009f());
                int i12 = C0376b0.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C0376b0.this.f1672h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (m1604a > i13) {
                    m1604a = i13;
                }
                m2020z(Math.max(m1604a, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                m2020z((width - paddingLeft) - paddingRight);
            } else {
                m2020z(i11);
            }
            if (AbstractC0466x2.m2027b(C0376b0.this)) {
                m1619N = i10 + (((width - paddingRight) - m2015t()) - m1619N());
            } else {
                m1619N = i10 + paddingLeft + m1619N();
            }
            m2008c(m1619N);
        }

        /* renamed from: N */
        public int m1619N() {
            return this.f1685M;
        }

        /* renamed from: O */
        boolean m1620O(View view) {
            if (AbstractC0616q0.m2599Q(view) && view.getGlobalVisibleRect(this.f1684L)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: d */
        public CharSequence mo1608d() {
            return this.f1682J;
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: g */
        public void mo1610g(CharSequence charSequence) {
            this.f1682J = charSequence;
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: k */
        public void mo1613k(int i10) {
            this.f1685M = i10;
        }

        @Override // androidx.appcompat.widget.C0376b0.g
        /* renamed from: l */
        public void mo1614l(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            m1618M();
            m1999C(2);
            super.show();
            ListView mo1301h = mo1301h();
            mo1301h.setChoiceMode(1);
            mo1301h.setTextDirection(i10);
            mo1301h.setTextAlignment(i11);
            m2005J(C0376b0.this.getSelectedItemPosition());
            if (!isShowing && (viewTreeObserver = C0376b0.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                m2001E(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.AbstractC0461w1, androidx.appcompat.widget.C0376b0.g
        /* renamed from: n */
        public void mo1616n(ListAdapter listAdapter) {
            super.mo1616n(listAdapter);
            this.f1683K = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.b0$f */
    /* loaded from: classes.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a */
        boolean f1692a;

        /* renamed from: androidx.appcompat.widget.b0$f$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1692a ? (byte) 1 : (byte) 0);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f1692a = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.b0$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        int mo1606a();

        /* renamed from: c */
        void mo1607c(int i10);

        /* renamed from: d */
        CharSequence mo1608d();

        void dismiss();

        /* renamed from: f */
        Drawable mo1609f();

        /* renamed from: g */
        void mo1610g(CharSequence charSequence);

        /* renamed from: i */
        void mo1611i(Drawable drawable);

        boolean isShowing();

        /* renamed from: j */
        void mo1612j(int i10);

        /* renamed from: k */
        void mo1613k(int i10);

        /* renamed from: l */
        void mo1614l(int i10, int i11);

        /* renamed from: m */
        int mo1615m();

        /* renamed from: n */
        void mo1616n(ListAdapter listAdapter);
    }

    public C0376b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.spinnerStyle);
    }

    /* renamed from: a */
    int m1604a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1672h);
            Rect rect = this.f1672h;
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    /* renamed from: b */
    void m1605b() {
        this.f1670f.mo1614l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0395g c0395g = this.f1665a;
        if (c0395g != null) {
            c0395g.m1699b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f1670f;
        if (gVar != null) {
            return gVar.mo1606a();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f1670f;
        if (gVar != null) {
            return gVar.mo1615m();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1670f != null) {
            return this.f1671g;
        }
        return super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f1670f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f1670f;
        if (gVar != null) {
            return gVar.mo1609f();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1666b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f1670f;
        if (gVar != null) {
            return gVar.mo1608d();
        }
        return super.getPrompt();
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public ColorStateList getSupportBackgroundTintList() {
        C0395g c0395g = this.f1665a;
        if (c0395g != null) {
            return c0395g.m1700c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0395g c0395g = this.f1665a;
        if (c0395g != null) {
            return c0395g.m1701d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f1670f;
        if (gVar != null && gVar.isShowing()) {
            this.f1670f.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1670f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1604a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f1692a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z10;
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f1670f;
        if (gVar != null && gVar.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        fVar.f1692a = z10;
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0441r1 abstractViewOnTouchListenerC0441r1 = this.f1667c;
        if (abstractViewOnTouchListenerC0441r1 != null && abstractViewOnTouchListenerC0441r1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f1670f;
        if (gVar != null) {
            if (!gVar.isShowing()) {
                m1605b();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0395g c0395g = this.f1665a;
        if (c0395g != null) {
            c0395g.m1703f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0395g c0395g = this.f1665a;
        if (c0395g != null) {
            c0395g.m1704g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f1670f;
        if (gVar != null) {
            gVar.mo1613k(i10);
            this.f1670f.mo1607c(i10);
        } else {
            super.setDropDownHorizontalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f1670f;
        if (gVar != null) {
            gVar.mo1612j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1670f != null) {
            this.f1671g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f1670f;
        if (gVar != null) {
            gVar.mo1611i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(AbstractC4105b.m17170d(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f1670f;
        if (gVar != null) {
            gVar.mo1610g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0395g c0395g = this.f1665a;
        if (c0395g != null) {
            c0395g.m1706i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0604n0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0395g c0395g = this.f1665a;
        if (c0395g != null) {
            c0395g.m1707j(mode);
        }
    }

    public C0376b0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1669e) {
            this.f1668d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1670f != null) {
            Context context = this.f1666b;
            if (context == null) {
                context = getContext();
            }
            this.f1670f.mo1616n(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public C0376b0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (r11 == null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.appcompat.widget.b0, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0376b0(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0376b0.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
