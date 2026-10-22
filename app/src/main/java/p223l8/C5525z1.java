package p223l8;

import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.Fragment;
import ba.AbstractC1196d;
import com.core.sysopt.mark.live.LiveReserveRootView;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.p063db.ReservationList;
import com.widget.custom.MemoryListView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;
import ne.C5881x;
import p028b8.C1168k0;
import p028b8.C1170l0;
import p130f8.InterfaceC4280g;
import p130f8.InterfaceC4281h;
import p159h8.C4575b3;
import p207k8.ViewOnClickListenerC5136d;
import p317rb.AbstractC6567a;

/* renamed from: l8.z1 */
/* loaded from: classes2.dex */
public final class C5525z1 extends AbstractC1196d<InterfaceC4280g> implements InterfaceC4281h {

    /* renamed from: A0 */
    private ViewOnClickListenerC5136d f22453A0;

    /* renamed from: C0 */
    private boolean f22455C0;

    /* renamed from: y0 */
    private C1168k0 f22457y0;

    /* renamed from: z0 */
    private C1170l0 f22458z0;

    /* renamed from: D0 */
    public Map f22456D0 = new LinkedHashMap();

    /* renamed from: B0 */
    private String f22454B0 = "HomeLive";

    /* renamed from: l8.z1$a */
    /* loaded from: classes2.dex */
    public static final class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            C5525z1.this.m22408V9(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: l8.z1$b */
    /* loaded from: classes2.dex */
    public static final class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            C5525z1.this.m22410W9(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[RETURN] */
    /* renamed from: R9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m22404R9(android.view.View r1, int r2, android.view.KeyEvent r3) {
        /*
            r0 = this;
            int r1 = r3.getAction()
            r3 = 0
            if (r1 != 0) goto L26
            r1 = 1
            switch(r2) {
                case 19: goto L25;
                case 20: goto L19;
                case 21: goto Ld;
                case 22: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L26
        Lc:
            return r1
        Ld:
            int r2 = com.live.R$id.mLvDate
            android.view.View r2 = r0.m22420M9(r2)
            com.widget.custom.MemoryListView r2 = (com.widget.custom.MemoryListView) r2
            r2.requestFocus()
            return r1
        L19:
            b8.k0 r2 = r0.f22457y0
            if (r2 == 0) goto L22
            int r2 = r2.getCount()
            goto L23
        L22:
            r2 = 0
        L23:
            if (r2 > 0) goto L26
        L25:
            return r1
        L26:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p223l8.C5525z1.m22404R9(android.view.View, int, android.view.KeyEvent):boolean");
    }

    /* renamed from: S9 */
    private final void m22405S9(int i10) {
        ReservationList reservationList;
        C1170l0 c1170l0 = this.f22458z0;
        if (c1170l0 != null) {
            reservationList = c1170l0.getItem(i10);
        } else {
            reservationList = null;
        }
        ((InterfaceC4280g) m5478w9()).mo17917s3(reservationList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: T9 */
    private final boolean m22406T9(View view, int i10, KeyEvent keyEvent) {
        int i11;
        int i12;
        int action = keyEvent.getAction();
        int i13 = 0;
        if (action == 0) {
            switch (i10) {
                case 19:
                    C1168k0 c1168k0 = this.f22457y0;
                    if (c1168k0 != null) {
                        i11 = c1168k0.getCount();
                    } else {
                        i11 = 0;
                    }
                    if (i11 <= 0 || ((MemoryListView) m22420M9(R$id.mLvDate)).getSelectedItemPosition() == 0) {
                        return true;
                    }
                    break;
                case 20:
                    C1168k0 c1168k02 = this.f22457y0;
                    if (c1168k02 != null) {
                        i12 = c1168k02.getCount();
                    } else {
                        i12 = 0;
                    }
                    if (i12 <= 0) {
                        return true;
                    }
                    int selectedItemPosition = ((MemoryListView) m22420M9(R$id.mLvDate)).getSelectedItemPosition();
                    C1168k0 c1168k03 = this.f22457y0;
                    AbstractC5868k.m23671c(c1168k03);
                    if (selectedItemPosition == c1168k03.getCount() - 1) {
                        return true;
                    }
                    break;
                case 21:
                    Fragment m3133W6 = m3133W6();
                    AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
                    ((C5442e1) m3133W6).m21964ra();
                    return true;
                case 22:
                    C1168k0 c1168k04 = this.f22457y0;
                    if (c1168k04 != null) {
                        i13 = c1168k04.getCount();
                    }
                    if (i13 <= 0) {
                        return true;
                    }
                    int i14 = R$id.mLvEpg;
                    if (((MemoryListView) m22420M9(i14)).getAdapter().getCount() > 0) {
                        C1168k0 c1168k05 = this.f22457y0;
                        if (c1168k05 != null) {
                            c1168k05.m5358d(((MemoryListView) m22420M9(R$id.mLvDate)).getSelectedItemPosition());
                        }
                        ((MemoryListView) m22420M9(i14)).requestFocus();
                    }
                    return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: U9 */
    private final boolean m22407U9(View view, int i10, KeyEvent keyEvent) {
        int i11;
        if (keyEvent.getAction() == 0) {
            switch (i10) {
                case 20:
                    C1170l0 c1170l0 = this.f22458z0;
                    if (c1170l0 != null) {
                        i11 = c1170l0.getCount();
                    } else {
                        i11 = 0;
                    }
                    if (i11 <= 0) {
                        return true;
                    }
                    int selectedItemPosition = ((MemoryListView) m22420M9(R$id.mLvEpg)).getSelectedItemPosition();
                    C1170l0 c1170l02 = this.f22458z0;
                    AbstractC5868k.m23671c(c1170l02);
                    if (selectedItemPosition == c1170l02.getCount() - 1) {
                        return true;
                    }
                    break;
                case 21:
                    C1168k0 c1168k0 = this.f22457y0;
                    if (c1168k0 != null) {
                        c1168k0.m5358d(-1);
                    }
                    ((MemoryListView) m22420M9(R$id.mLvDate)).requestFocus();
                    return true;
                case 22:
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V9 */
    public final void m22408V9(int i10) {
        String str;
        InterfaceC4280g interfaceC4280g = (InterfaceC4280g) m5478w9();
        C1168k0 c1168k0 = this.f22457y0;
        if (c1168k0 != null) {
            str = c1168k0.m5355a(i10);
        } else {
            str = null;
        }
        interfaceC4280g.mo17913I2(str);
    }

    /* renamed from: W0 */
    private final void m22409W0() {
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        int i10 = R$id.mLvDate;
        MemoryListView memoryListView = (MemoryListView) m22420M9(i10);
        AbstractC5868k.m23673e(memoryListView, "mLvDate");
        this.f22457y0 = new C1168k0(m3096J6, memoryListView);
        ((MemoryListView) m22420M9(i10)).setAdapter((ListAdapter) this.f22457y0);
        Context m3096J62 = m3096J6();
        AbstractC5868k.m23671c(m3096J62);
        this.f22458z0 = new C1170l0(m3096J62);
        ((MemoryListView) m22420M9(R$id.mLvEpg)).setAdapter((ListAdapter) this.f22458z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W9 */
    public final void m22410W9(int i10) {
    }

    /* renamed from: X9 */
    private final void m22411X9() {
        Dialog m3280r9;
        ((InterfaceC4280g) m5478w9()).mo17916k3();
        ViewOnClickListenerC5136d viewOnClickListenerC5136d = this.f22453A0;
        boolean z10 = false;
        if (viewOnClickListenerC5136d != null && (m3280r9 = viewOnClickListenerC5136d.m3280r9()) != null && m3280r9.isShowing()) {
            z10 = true;
        }
        if (z10) {
            ViewOnClickListenerC5136d viewOnClickListenerC5136d2 = this.f22453A0;
            if (viewOnClickListenerC5136d2 != null) {
                viewOnClickListenerC5136d2.mo3278o9();
            }
            this.f22453A0 = null;
        }
    }

    /* renamed from: Y9 */
    private final void m22412Y9() {
        int i10 = R$id.mIvReserveClear;
        ((ImageView) m22420M9(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.t1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m22413Z9;
                m22413Z9 = C5525z1.m22413Z9(C5525z1.this, view, i11, keyEvent);
                return m22413Z9;
            }
        });
        int i11 = R$id.mLvDate;
        ((MemoryListView) m22420M9(i11)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.u1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                boolean m22414aa;
                m22414aa = C5525z1.m22414aa(C5525z1.this, view, i12, keyEvent);
                return m22414aa;
            }
        });
        int i12 = R$id.mLvEpg;
        ((MemoryListView) m22420M9(i12)).setOnKeyListener(new View.OnKeyListener() { // from class: l8.v1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
                boolean m22415ba;
                m22415ba = C5525z1.m22415ba(C5525z1.this, view, i13, keyEvent);
                return m22415ba;
            }
        });
        ((MemoryListView) m22420M9(i11)).setOnItemSelectedListener(new a());
        ((MemoryListView) m22420M9(i12)).setOnItemSelectedListener(new b());
        ((MemoryListView) m22420M9(i12)).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l8.w1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i13, long j10) {
                C5525z1.m22416ca(C5525z1.this, adapterView, view, i13, j10);
            }
        });
        ((ImageView) m22420M9(i10)).setOnClickListener(new View.OnClickListener() { // from class: l8.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5525z1.m22417da(C5525z1.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z9 */
    public static final boolean m22413Z9(C5525z1 c5525z1, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5525z1, "this$0");
        AbstractC5868k.m23673e(view, "v");
        AbstractC5868k.m23673e(keyEvent, "event");
        return c5525z1.m22404R9(view, i10, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aa */
    public static final boolean m22414aa(C5525z1 c5525z1, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5525z1, "this$0");
        AbstractC5868k.m23673e(view, "v");
        AbstractC5868k.m23673e(keyEvent, "event");
        return c5525z1.m22406T9(view, i10, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ba */
    public static final boolean m22415ba(C5525z1 c5525z1, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5525z1, "this$0");
        AbstractC5868k.m23673e(view, "v");
        AbstractC5868k.m23673e(keyEvent, "event");
        return c5525z1.m22407U9(view, i10, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ca */
    public static final void m22416ca(C5525z1 c5525z1, AdapterView adapterView, View view, int i10, long j10) {
        AbstractC5868k.m23674f(c5525z1, "this$0");
        c5525z1.m22405S9(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: da */
    public static final void m22417da(C5525z1 c5525z1, View view) {
        AbstractC5868k.m23674f(c5525z1, "this$0");
        c5525z1.m22418fa();
    }

    /* renamed from: fa */
    private final void m22418fa() {
        String str;
        int selectedItemPosition = ((MemoryListView) m22420M9(R$id.mLvDate)).getSelectedItemPosition();
        if (selectedItemPosition < 0) {
            return;
        }
        C1168k0 c1168k0 = this.f22457y0;
        if (c1168k0 != null) {
            str = c1168k0.m5355a(selectedItemPosition);
        } else {
            str = null;
        }
        if (AbstractC6567a.m25634d(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        AbstractC5868k.m23671c(str);
        String substring = str.substring(8);
        AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        sb2.append('/');
        String substring2 = str.substring(5, 7);
        AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring2);
        sb2.append('/');
        String substring3 = str.substring(0, 4);
        AbstractC5868k.m23673e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring3);
        String sb3 = sb2.toString();
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.dialog_clear_tip_format);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_clear_tip_format)");
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{sb3}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        ViewOnClickListenerC5136d m20774H9 = ViewOnClickListenerC5136d.m20774H9(2, format, false);
        this.f22453A0 = m20774H9;
        if (m20774H9 != null) {
            m20774H9.m20775I9(new ViewOnClickListenerC5136d.b() { // from class: l8.y1
                @Override // p207k8.ViewOnClickListenerC5136d.b
                /* renamed from: a */
                public final void mo20779a() {
                    C5525z1.m22419ga(C5525z1.this);
                }
            });
        }
        ViewOnClickListenerC5136d viewOnClickListenerC5136d = this.f22453A0;
        if (viewOnClickListenerC5136d != null) {
            AbstractActivityC0712e m3075C6 = m3075C6();
            AbstractC5868k.m23671c(m3075C6);
            viewOnClickListenerC5136d.m20778L9(m3075C6.m3294d4(), "ReservationListFragment_Clear");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final void m22419ga(C5525z1 c5525z1) {
        String str;
        AbstractC5868k.m23674f(c5525z1, "this$0");
        InterfaceC4280g interfaceC4280g = (InterfaceC4280g) c5525z1.m5478w9();
        C1168k0 c1168k0 = c5525z1.f22457y0;
        if (c1168k0 != null) {
            str = c1168k0.m5355a(((MemoryListView) c5525z1.m22420M9(R$id.mLvDate)).getSelectedItemPosition());
        } else {
            str = null;
        }
        interfaceC4280g.mo17914R1(str);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_live_reserve;
    }

    @Override // p130f8.InterfaceC4281h
    /* renamed from: F0 */
    public void mo17918F0(List list) {
        AbstractC5868k.m23674f(list, "datas");
        C1168k0 c1168k0 = this.f22457y0;
        if (c1168k0 != null) {
            c1168k0.m5357c(list);
        }
    }

    /* renamed from: M9 */
    public View m22420M9(int i10) {
        View findViewById;
        Map map = this.f22456D0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // p130f8.InterfaceC4281h
    /* renamed from: N4 */
    public void mo17919N4(List list) {
        AbstractC5868k.m23674f(list, "datas");
        C1170l0 c1170l0 = this.f22458z0;
        if (c1170l0 != null) {
            c1170l0.m5364b(list);
        }
    }

    /* renamed from: P9 */
    public final String m22421P9() {
        return this.f22454B0;
    }

    @Override // ba.AbstractC1196d
    /* renamed from: Q9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4280g mo5465y9() {
        return new C4575b3(this, this);
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: V7 */
    public void mo3131V7(boolean z10) {
        super.mo3131V7(z10);
        if (z10) {
            m22411X9();
            C1168k0 c1168k0 = this.f22457y0;
            if (c1168k0 != null) {
                c1168k0.m5358d(-1);
            }
            ((MemoryListView) m22420M9(R$id.mLvEpg)).setSelectionTriggerItemSelect(0);
            return;
        }
        ((InterfaceC4280g) m5478w9()).mo17915j0();
        ((MemoryListView) m22420M9(R$id.mLvDate)).setSelectionTriggerItemSelect(0);
        m22408V9(0);
    }

    @Override // p130f8.InterfaceC4281h
    /* renamed from: b6 */
    public void mo17920b6() {
        ViewOnClickListenerC5136d viewOnClickListenerC5136d = this.f22453A0;
        if (viewOnClickListenerC5136d != null) {
            viewOnClickListenerC5136d.mo3278o9();
        }
        this.f22453A0 = null;
        C1170l0 c1170l0 = this.f22458z0;
        if (c1170l0 != null) {
            c1170l0.m5364b(null);
        }
        C1168k0 c1168k0 = this.f22457y0;
        if (c1168k0 != null) {
            c1168k0.m5358d(-1);
        }
        ((MemoryListView) m22420M9(R$id.mLvDate)).requestFocus();
    }

    /* renamed from: ea */
    public final void m22423ea() {
        ((MemoryListView) m22420M9(R$id.mLvDate)).requestFocus();
    }

    @Override // ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f22456D0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        Fragment m3133W6 = m3133W6();
        AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
        this.f22454B0 = ((C5442e1) m3133W6).m21939Ia();
        m22412Y9();
        m22409W0();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        return false;
    }

    @Override // p130f8.InterfaceC4281h
    /* renamed from: p2 */
    public void mo17921p2() {
        C1170l0 c1170l0 = this.f22458z0;
        if (c1170l0 != null) {
            c1170l0.notifyDataSetChanged();
        }
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
        ((LiveReserveRootView) m22420M9(R$id.mRootView)).setVisibility(0);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f22455C0;
    }
}
