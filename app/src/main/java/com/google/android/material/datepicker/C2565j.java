package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0272b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC0616q0;
import androidx.fragment.app.AbstractC0738x;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.datepicker.C2556a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p106e.AbstractC4105b;
import p204k5.ViewOnTouchListenerC5130a;
import p282p5.AbstractC6215b;
import p326s5.C6686i;

/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
public final class C2565j<S> extends DialogInterfaceOnCancelListenerC0710d {

    /* renamed from: R0 */
    static final Object f9681R0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: S0 */
    static final Object f9682S0 = "CANCEL_BUTTON_TAG";

    /* renamed from: T0 */
    static final Object f9683T0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: C0 */
    private final LinkedHashSet f9684C0 = new LinkedHashSet();

    /* renamed from: D0 */
    private final LinkedHashSet f9685D0 = new LinkedHashSet();

    /* renamed from: E0 */
    private final LinkedHashSet f9686E0 = new LinkedHashSet();

    /* renamed from: F0 */
    private final LinkedHashSet f9687F0 = new LinkedHashSet();

    /* renamed from: G0 */
    private int f9688G0;

    /* renamed from: H0 */
    private AbstractC2571p f9689H0;

    /* renamed from: I0 */
    private C2556a f9690I0;

    /* renamed from: J0 */
    private C2564i f9691J0;

    /* renamed from: K0 */
    private int f9692K0;

    /* renamed from: L0 */
    private CharSequence f9693L0;

    /* renamed from: M0 */
    private boolean f9694M0;

    /* renamed from: N0 */
    private TextView f9695N0;

    /* renamed from: O0 */
    private CheckableImageButton f9696O0;

    /* renamed from: P0 */
    private C6686i f9697P0;

    /* renamed from: Q0 */
    private Button f9698Q0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.j$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC2570o {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.j$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2565j.this.f9696O0.toggle();
            C2565j c2565j = C2565j.this;
            c2565j.m10508S9(c2565j.f9696O0);
            C2565j.this.m10505P9();
        }
    }

    /* renamed from: I9 */
    private static Drawable m10499I9(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC4105b.m17170d(context, R$drawable.ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC4105b.m17170d(context, R$drawable.ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: J9 */
    private static int m10500J9(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_days_of_week_height);
        int i10 = C2568m.f9710d;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_bottom_padding);
    }

    /* renamed from: L9 */
    private static int m10501L9(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_content_padding);
        int i10 = C2567l.m10513k().f9707e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_width) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: M9 */
    private int m10502M9(Context context) {
        int i10 = this.f9688G0;
        if (i10 != 0) {
            return i10;
        }
        throw null;
    }

    /* renamed from: N9 */
    private void m10503N9(Context context) {
        this.f9696O0.setTag(f9683T0);
        this.f9696O0.setImageDrawable(m10499I9(context));
        AbstractC0616q0.m2636n0(this.f9696O0, null);
        m10508S9(this.f9696O0);
        this.f9696O0.setOnClickListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O9 */
    public static boolean m10504O9(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC6215b.m24789c(context, R$attr.materialCalendarStyle, C2564i.class.getCanonicalName()), new int[]{R.attr.windowFullscreen});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P9 */
    public void m10505P9() {
        AbstractC2571p abstractC2571p;
        this.f9691J0 = C2564i.m10477A9(null, m10502M9(m3107M8()), this.f9690I0);
        if (this.f9696O0.isChecked()) {
            abstractC2571p = C2566k.m10510n9(null, this.f9690I0);
        } else {
            abstractC2571p = this.f9691J0;
        }
        this.f9689H0 = abstractC2571p;
        m10507R9();
        AbstractC0738x m3534m = m3093I6().m3534m();
        m3534m.m3644q(R$id.mtrl_calendar_frame, this.f9689H0);
        m3534m.mo3229i();
        this.f9689H0.m10536l9(new a());
    }

    /* renamed from: Q9 */
    public static long m10506Q9() {
        return C2567l.m10513k().f9709g;
    }

    /* renamed from: R9 */
    private void m10507R9() {
        String m10509K9 = m10509K9();
        this.f9695N0.setContentDescription(String.format(m3172j7(R$string.mtrl_picker_announce_current_selection), m10509K9));
        this.f9695N0.setText(m10509K9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S9 */
    public void m10508S9(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f9696O0.isChecked()) {
            string = checkableImageButton.getContext().getString(R$string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(R$string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f9696O0.setContentDescription(string);
    }

    /* renamed from: K9 */
    public String m10509K9() {
        m3096J6();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public final void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        if (bundle == null) {
            bundle = m3090H6();
        }
        this.f9688G0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC0272b.m941a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f9690I0 = (C2556a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9692K0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f9693L0 = bundle.getCharSequence("TITLE_TEXT_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public final View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        if (this.f9694M0) {
            i10 = R$layout.mtrl_picker_fullscreen;
        } else {
            i10 = R$layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        if (this.f9694M0) {
            inflate.findViewById(R$id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m10501L9(context), -2));
        } else {
            View findViewById = inflate.findViewById(R$id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R$id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m10501L9(context), -1));
            findViewById2.setMinimumHeight(m10500J9(m3107M8()));
        }
        TextView textView = (TextView) inflate.findViewById(R$id.mtrl_picker_header_selection_text);
        this.f9695N0 = textView;
        AbstractC0616q0.m2640p0(textView, 1);
        this.f9696O0 = (CheckableImageButton) inflate.findViewById(R$id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R$id.mtrl_picker_title_text);
        CharSequence charSequence = this.f9693L0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f9692K0);
        }
        m10503N9(context);
        this.f9698Q0 = (Button) inflate.findViewById(R$id.confirm_button);
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: h8 */
    public final void mo3167h8(Bundle bundle) {
        super.mo3167h8(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f9688G0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C2556a.b bVar = new C2556a.b(this.f9690I0);
        if (this.f9691J0.m10492w9() != null) {
            bVar.m10463b(this.f9691J0.m10492w9().f9709g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.m10462a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f9692K0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f9693L0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: i8 */
    public void mo3170i8() {
        super.mo3170i8();
        Window window = m3286y9().getWindow();
        if (this.f9694M0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f9697P0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m3154d7().getDimensionPixelOffset(R$dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f9697P0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC5130a(m3286y9(), rect));
        }
        m10505P9();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: j8 */
    public void mo3173j8() {
        this.f9689H0.m10537m9();
        super.mo3173j8();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f9686E0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f9687F0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) m3182n7();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: u9 */
    public final Dialog mo3283u9(Bundle bundle) {
        Dialog dialog = new Dialog(m3107M8(), m10502M9(m3107M8()));
        Context context = dialog.getContext();
        this.f9694M0 = m10504O9(context);
        int m24789c = AbstractC6215b.m24789c(context, R$attr.colorSurface, C2565j.class.getCanonicalName());
        C6686i c6686i = new C6686i(context, null, R$attr.materialCalendarStyle, R$style.Widget_MaterialComponents_MaterialCalendar);
        this.f9697P0 = c6686i;
        c6686i.m26092J(context);
        this.f9697P0.m26096R(ColorStateList.valueOf(m24789c));
        this.f9697P0.m26095Q(AbstractC0616q0.m2651v(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
