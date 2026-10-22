package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;
import anet.channel.strategy.dispatch.DispatchConstants;

/* renamed from: androidx.appcompat.widget.v2 */
/* loaded from: classes.dex */
class C0458v2 {

    /* renamed from: a */
    private final Context f1963a;

    /* renamed from: b */
    private final View f1964b;

    /* renamed from: c */
    private final TextView f1965c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1966d;

    /* renamed from: e */
    private final Rect f1967e;

    /* renamed from: f */
    private final int[] f1968f;

    /* renamed from: g */
    private final int[] f1969g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0458v2(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1966d = layoutParams;
        this.f1967e = new Rect();
        this.f1968f = new int[2];
        this.f1969g = new int[2];
        this.f1963a = context;
        View inflate = LayoutInflater.from(context).inflate(R$layout.abc_tooltip, (ViewGroup) null);
        this.f1964b = inflate;
        this.f1965c = (TextView) inflate.findViewById(R$id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R$style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1987a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        int i13;
        int i14;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1963a.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1963a.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_extra_offset);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f1963a.getResources();
        if (z10) {
            i13 = R$dimen.tooltip_y_offset_touch;
        } else {
            i13 = R$dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i13);
        View m1988b = m1988b(view);
        if (m1988b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m1988b.getWindowVisibleDisplayFrame(this.f1967e);
        Rect rect = this.f1967e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f1963a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID);
            if (identifier != 0) {
                i14 = resources2.getDimensionPixelSize(identifier);
            } else {
                i14 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f1967e.set(0, i14, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m1988b.getLocationOnScreen(this.f1969g);
        view.getLocationOnScreen(this.f1968f);
        int[] iArr = this.f1968f;
        int i15 = iArr[0];
        int[] iArr2 = this.f1969g;
        int i16 = i15 - iArr2[0];
        iArr[0] = i16;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i16 + i10) - (m1988b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1964b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1964b.getMeasuredHeight();
        int i17 = this.f1968f[1];
        int i18 = ((i12 + i17) - dimensionPixelOffset3) - measuredHeight;
        int i19 = i17 + height + dimensionPixelOffset3;
        if (z10) {
            if (i18 >= 0) {
                layoutParams.y = i18;
                return;
            } else {
                layoutParams.y = i19;
                return;
            }
        }
        if (measuredHeight + i19 <= this.f1967e.height()) {
            layoutParams.y = i19;
        } else {
            layoutParams.y = i18;
        }
    }

    /* renamed from: b */
    private static View m1988b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1989c() {
        if (!m1990d()) {
            return;
        }
        ((WindowManager) this.f1963a.getSystemService("window")).removeView(this.f1964b);
    }

    /* renamed from: d */
    boolean m1990d() {
        if (this.f1964b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1991e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (m1990d()) {
            m1989c();
        }
        this.f1965c.setText(charSequence);
        m1987a(view, i10, i11, z10, this.f1966d);
        ((WindowManager) this.f1963a.getSystemService("window")).addView(this.f1964b, this.f1966d);
    }
}
