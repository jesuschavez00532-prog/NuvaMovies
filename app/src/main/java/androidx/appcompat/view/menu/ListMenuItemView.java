package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.InterfaceC0331k;
import androidx.appcompat.widget.C0438q2;
import androidx.core.view.AbstractC0616q0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0331k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    private C0327g f1246a;

    /* renamed from: b */
    private ImageView f1247b;

    /* renamed from: c */
    private RadioButton f1248c;

    /* renamed from: d */
    private TextView f1249d;

    /* renamed from: e */
    private CheckBox f1250e;

    /* renamed from: f */
    private TextView f1251f;

    /* renamed from: g */
    private ImageView f1252g;

    /* renamed from: h */
    private ImageView f1253h;

    /* renamed from: i */
    private LinearLayout f1254i;

    /* renamed from: j */
    private Drawable f1255j;

    /* renamed from: k */
    private int f1256k;

    /* renamed from: l */
    private Context f1257l;

    /* renamed from: m */
    private boolean f1258m;

    /* renamed from: n */
    private Drawable f1259n;

    /* renamed from: o */
    private boolean f1260o;

    /* renamed from: p */
    private LayoutInflater f1261p;

    /* renamed from: q */
    private boolean f1262q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.listMenuViewStyle);
    }

    /* renamed from: a */
    private void m1271a(View view) {
        m1272b(view, -1);
    }

    /* renamed from: b */
    private void m1272b(View view, int i10) {
        LinearLayout linearLayout = this.f1254i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    /* renamed from: c */
    private void m1273c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R$layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f1250e = checkBox;
        m1271a(checkBox);
    }

    /* renamed from: f */
    private void m1274f() {
        ImageView imageView = (ImageView) getInflater().inflate(R$layout.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f1247b = imageView;
        m1272b(imageView, 0);
    }

    /* renamed from: g */
    private void m1275g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R$layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f1248c = radioButton;
        m1271a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1261p == null) {
            this.f1261p = LayoutInflater.from(getContext());
        }
        return this.f1261p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f1252g;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1253h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1253h.getLayoutParams();
            rect.top += this.f1253h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k.a
    /* renamed from: d */
    public boolean mo1263d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k.a
    /* renamed from: e */
    public void mo1264e(C0327g c0327g, int i10) {
        int i11;
        this.f1246a = c0327g;
        if (c0327g.isVisible()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setTitle(c0327g.m1390i(this));
        setCheckable(c0327g.isCheckable());
        m1276h(c0327g.m1382A(), c0327g.m1388g());
        setIcon(c0327g.getIcon());
        setEnabled(c0327g.isEnabled());
        setSubMenuArrowVisible(c0327g.hasSubMenu());
        setContentDescription(c0327g.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0331k.a
    public C0327g getItemData() {
        return this.f1246a;
    }

    /* renamed from: h */
    public void m1276h(boolean z10, char c10) {
        int i10;
        if (z10 && this.f1246a.m1382A()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (i10 == 0) {
            this.f1251f.setText(this.f1246a.m1389h());
        }
        if (this.f1251f.getVisibility() != i10) {
            this.f1251f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        AbstractC0616q0.m2642q0(this, this.f1255j);
        TextView textView = (TextView) findViewById(R$id.title);
        this.f1249d = textView;
        int i10 = this.f1256k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1257l, i10);
        }
        this.f1251f = (TextView) findViewById(R$id.shortcut);
        ImageView imageView = (ImageView) findViewById(R$id.submenuarrow);
        this.f1252g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1259n);
        }
        this.f1253h = (ImageView) findViewById(R$id.group_divider);
        this.f1254i = (LinearLayout) findViewById(R$id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f1247b != null && this.f1258m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1247b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f1248c == null && this.f1250e == null) {
            return;
        }
        if (this.f1246a.m1394m()) {
            if (this.f1248c == null) {
                m1275g();
            }
            compoundButton = this.f1248c;
            view = this.f1250e;
        } else {
            if (this.f1250e == null) {
                m1273c();
            }
            compoundButton = this.f1250e;
            view = this.f1248c;
        }
        if (z10) {
            compoundButton.setChecked(this.f1246a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox = this.f1250e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1248c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f1246a.m1394m()) {
            if (this.f1248c == null) {
                m1275g();
            }
            compoundButton = this.f1248c;
        } else {
            if (this.f1250e == null) {
                m1273c();
            }
            compoundButton = this.f1250e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f1262q = z10;
        this.f1258m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i10;
        ImageView imageView = this.f1253h;
        if (imageView != null) {
            if (!this.f1260o && z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10;
        if (!this.f1246a.m1407z() && !this.f1262q) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !this.f1258m) {
            return;
        }
        ImageView imageView = this.f1247b;
        if (imageView == null && drawable == null && !this.f1258m) {
            return;
        }
        if (imageView == null) {
            m1274f();
        }
        if (drawable == null && !this.f1258m) {
            this.f1247b.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.f1247b;
        if (!z10) {
            drawable = null;
        }
        imageView2.setImageDrawable(drawable);
        if (this.f1247b.getVisibility() != 0) {
            this.f1247b.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1249d.setText(charSequence);
            if (this.f1249d.getVisibility() != 0) {
                this.f1249d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f1249d.getVisibility() != 8) {
            this.f1249d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        C0438q2 m1874v = C0438q2.m1874v(getContext(), attributeSet, R$styleable.f890E, i10, 0);
        this.f1255j = m1874v.m1881g(R$styleable.MenuView_android_itemBackground);
        this.f1256k = m1874v.m1888n(R$styleable.MenuView_android_itemTextAppearance, -1);
        this.f1258m = m1874v.m1875a(R$styleable.MenuView_preserveIconSpacing, false);
        this.f1257l = context;
        this.f1259n = m1874v.m1881g(R$styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, R$attr.dropDownListViewStyle, 0);
        this.f1260o = obtainStyledAttributes.hasValue(0);
        m1874v.m1894w();
        obtainStyledAttributes.recycle();
    }
}
