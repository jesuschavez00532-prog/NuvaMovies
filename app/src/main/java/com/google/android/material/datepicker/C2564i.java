package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0272b;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0551a;
import androidx.recyclerview.widget.C0822i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import p389x.C7458h0;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public final class C2564i<S> extends AbstractC2571p {

    /* renamed from: p0 */
    private int f9651p0;

    /* renamed from: q0 */
    private C2556a f9652q0;

    /* renamed from: r0 */
    private C2567l f9653r0;

    /* renamed from: s0 */
    private k f9654s0;

    /* renamed from: t0 */
    private C2558c f9655t0;

    /* renamed from: u0 */
    private RecyclerView f9656u0;

    /* renamed from: v0 */
    private RecyclerView f9657v0;

    /* renamed from: w0 */
    private View f9658w0;

    /* renamed from: x0 */
    private View f9659x0;

    /* renamed from: y0 */
    static final Object f9649y0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: z0 */
    static final Object f9650z0 = "NAVIGATION_PREV_TAG";

    /* renamed from: A0 */
    static final Object f9647A0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: B0 */
    static final Object f9648B0 = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f9660a;

        a(int i10) {
            this.f9660a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2564i.this.f9657v0.smoothScrollToPosition(this.f9660a);
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$b */
    /* loaded from: classes.dex */
    class b extends C0551a {
        b() {
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: g */
        public void mo2382g(View view, C7458h0 c7458h0) {
            super.mo2382g(view, c7458h0);
            c7458h0.m28601Z(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$c */
    /* loaded from: classes.dex */
    class c extends AbstractC2572q {

        /* renamed from: a */
        final /* synthetic */ int f9663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f9663a = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.C0779b0 c0779b0, int[] iArr) {
            if (this.f9663a == 0) {
                iArr[0] = C2564i.this.f9657v0.getWidth();
                iArr[1] = C2564i.this.f9657v0.getWidth();
            } else {
                iArr[0] = C2564i.this.f9657v0.getHeight();
                iArr[1] = C2564i.this.f9657v0.getHeight();
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$d */
    /* loaded from: classes.dex */
    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.C2564i.l
        /* renamed from: a */
        public void mo10495a(long j10) {
            if (!C2564i.this.f9652q0.m10454f().mo10464c(j10)) {
                return;
            }
            C2564i.m10481p9(C2564i.this);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$e */
    /* loaded from: classes.dex */
    public class e extends RecyclerView.AbstractC0796o {

        /* renamed from: a */
        private final Calendar f9666a = AbstractC2576u.m10551k();

        /* renamed from: b */
        private final Calendar f9667b = AbstractC2576u.m10551k();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0796o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0) {
            if ((recyclerView.getAdapter() instanceof C2577v) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C2564i.m10481p9(C2564i.this);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$f */
    /* loaded from: classes.dex */
    public class f extends C0551a {
        f() {
        }

        @Override // androidx.core.view.C0551a
        /* renamed from: g */
        public void mo2382g(View view, C7458h0 c7458h0) {
            String m3172j7;
            super.mo2382g(view, c7458h0);
            if (C2564i.this.f9659x0.getVisibility() == 0) {
                m3172j7 = C2564i.this.m3172j7(R$string.mtrl_picker_toggle_to_year_selection);
            } else {
                m3172j7 = C2564i.this.m3172j7(R$string.mtrl_picker_toggle_to_day_selection);
            }
            c7458h0.m28615i0(m3172j7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$g */
    /* loaded from: classes.dex */
    public class g extends RecyclerView.AbstractC0802u {

        /* renamed from: a */
        final /* synthetic */ C2569n f9670a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f9671b;

        g(C2569n c2569n, MaterialButton materialButton) {
            this.f9670a = c2569n;
            this.f9671b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f9671b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0802u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int findLastVisibleItemPosition;
            if (i10 < 0) {
                findLastVisibleItemPosition = C2564i.this.m10494z9().findFirstVisibleItemPosition();
            } else {
                findLastVisibleItemPosition = C2564i.this.m10494z9().findLastVisibleItemPosition();
            }
            C2564i.this.f9653r0 = this.f9670a.m10531b(findLastVisibleItemPosition);
            this.f9671b.setText(this.f9670a.m10532c(findLastVisibleItemPosition));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$h */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2564i.this.m10489E9();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$i */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C2569n f9674a;

        i(C2569n c2569n) {
            this.f9674a = c2569n;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findFirstVisibleItemPosition = C2564i.this.m10494z9().findFirstVisibleItemPosition() + 1;
            if (findFirstVisibleItemPosition < C2564i.this.f9657v0.getAdapter().getItemCount()) {
                C2564i.this.m10487C9(this.f9674a.m10531b(findFirstVisibleItemPosition));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$j */
    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C2569n f9676a;

        j(C2569n c2569n) {
            this.f9676a = c2569n;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findLastVisibleItemPosition = C2564i.this.m10494z9().findLastVisibleItemPosition() - 1;
            if (findLastVisibleItemPosition >= 0) {
                C2564i.this.m10487C9(this.f9676a.m10531b(findLastVisibleItemPosition));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$k */
    /* loaded from: classes.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$l */
    /* loaded from: classes.dex */
    public interface l {
        /* renamed from: a */
        void mo10495a(long j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A9 */
    public static C2564i m10477A9(InterfaceC2559d interfaceC2559d, int i10, C2556a c2556a) {
        C2564i c2564i = new C2564i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC2559d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2556a);
        bundle.putParcelable("CURRENT_MONTH_KEY", c2556a.m10457i());
        c2564i.m3132V8(bundle);
        return c2564i;
    }

    /* renamed from: B9 */
    private void m10478B9(int i10) {
        this.f9657v0.post(new a(i10));
    }

    /* renamed from: p9 */
    static /* synthetic */ InterfaceC2559d m10481p9(C2564i c2564i) {
        c2564i.getClass();
        return null;
    }

    /* renamed from: s9 */
    private void m10484s9(View view, C2569n c2569n) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R$id.month_navigation_fragment_toggle);
        materialButton.setTag(f9648B0);
        AbstractC0616q0.m2636n0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R$id.month_navigation_previous);
        materialButton2.setTag(f9650z0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(R$id.month_navigation_next);
        materialButton3.setTag(f9647A0);
        this.f9658w0 = view.findViewById(R$id.mtrl_calendar_year_selector_frame);
        this.f9659x0 = view.findViewById(R$id.mtrl_calendar_day_selector_frame);
        m10488D9(k.DAY);
        materialButton.setText(this.f9653r0.m10517g());
        this.f9657v0.addOnScrollListener(new g(c2569n, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(c2569n));
        materialButton2.setOnClickListener(new j(c2569n));
    }

    /* renamed from: t9 */
    private RecyclerView.AbstractC0796o m10485t9() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y9 */
    public static int m10486y9(Context context) {
        return context.getResources().getDimensionPixelSize(R$dimen.mtrl_calendar_day_height);
    }

    /* renamed from: C9 */
    void m10487C9(C2567l c2567l) {
        boolean z10;
        C2569n c2569n = (C2569n) this.f9657v0.getAdapter();
        int m10533d = c2569n.m10533d(c2567l);
        int m10533d2 = m10533d - c2569n.m10533d(this.f9653r0);
        boolean z11 = true;
        if (Math.abs(m10533d2) > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (m10533d2 <= 0) {
            z11 = false;
        }
        this.f9653r0 = c2567l;
        if (z10 && z11) {
            this.f9657v0.scrollToPosition(m10533d - 3);
            m10478B9(m10533d);
        } else if (z10) {
            this.f9657v0.scrollToPosition(m10533d + 3);
            m10478B9(m10533d);
        } else {
            m10478B9(m10533d);
        }
    }

    /* renamed from: D9 */
    void m10488D9(k kVar) {
        this.f9654s0 = kVar;
        if (kVar == k.YEAR) {
            this.f9656u0.getLayoutManager().scrollToPosition(((C2577v) this.f9656u0.getAdapter()).m10556a(this.f9653r0.f9706d));
            this.f9658w0.setVisibility(0);
            this.f9659x0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f9658w0.setVisibility(8);
            this.f9659x0.setVisibility(0);
            m10487C9(this.f9653r0);
        }
    }

    /* renamed from: E9 */
    void m10489E9() {
        k kVar = this.f9654s0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            m10488D9(k.DAY);
        } else if (kVar == k.DAY) {
            m10488D9(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        if (bundle == null) {
            bundle = m3090H6();
        }
        this.f9651p0 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC0272b.m941a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f9652q0 = (C2556a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9653r0 = (C2567l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m3096J6(), this.f9651p0);
        this.f9655t0 = new C2558c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C2567l m10458j = this.f9652q0.m10458j();
        if (C2565j.m10504O9(contextThemeWrapper)) {
            i10 = R$layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R$layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R$id.mtrl_calendar_days_of_week);
        AbstractC0616q0.m2636n0(gridView, new b());
        gridView.setAdapter((ListAdapter) new C2563h());
        gridView.setNumColumns(m10458j.f9707e);
        gridView.setEnabled(false);
        this.f9657v0 = (RecyclerView) inflate.findViewById(R$id.mtrl_calendar_months);
        this.f9657v0.setLayoutManager(new c(m3096J6(), i11, false, i11));
        this.f9657v0.setTag(f9649y0);
        C2569n c2569n = new C2569n(contextThemeWrapper, null, this.f9652q0, new d());
        this.f9657v0.setAdapter(c2569n);
        int integer = contextThemeWrapper.getResources().getInteger(R$integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R$id.mtrl_calendar_year_selector_frame);
        this.f9656u0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f9656u0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f9656u0.setAdapter(new C2577v(this));
            this.f9656u0.addItemDecoration(m10485t9());
        }
        if (inflate.findViewById(R$id.month_navigation_fragment_toggle) != null) {
            m10484s9(inflate, c2569n);
        }
        if (!C2565j.m10504O9(contextThemeWrapper)) {
            new C0822i().attachToRecyclerView(this.f9657v0);
        }
        this.f9657v0.scrollToPosition(c2569n.m10533d(this.f9653r0));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: h8 */
    public void mo3167h8(Bundle bundle) {
        super.mo3167h8(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9651p0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9652q0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f9653r0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u9 */
    public C2556a m10490u9() {
        return this.f9652q0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v9 */
    public C2558c m10491v9() {
        return this.f9655t0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w9 */
    public C2567l m10492w9() {
        return this.f9653r0;
    }

    /* renamed from: x9 */
    public InterfaceC2559d m10493x9() {
        return null;
    }

    /* renamed from: z9 */
    LinearLayoutManager m10494z9() {
        return (LinearLayoutManager) this.f9657v0.getLayoutManager();
    }
}
