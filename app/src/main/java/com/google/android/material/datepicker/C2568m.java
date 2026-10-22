package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public class C2568m extends BaseAdapter {

    /* renamed from: d */
    static final int f9710d = AbstractC2576u.m10551k().getMaximum(4);

    /* renamed from: a */
    final C2567l f9711a;

    /* renamed from: b */
    C2558c f9712b;

    /* renamed from: c */
    final C2556a f9713c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2568m(C2567l c2567l, InterfaceC2559d interfaceC2559d, C2556a c2556a) {
        this.f9711a = c2567l;
        this.f9713c = c2556a;
    }

    /* renamed from: d */
    private void m10523d(Context context) {
        if (this.f9712b == null) {
            this.f9712b = new C2558c(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m10524a() {
        return this.f9711a.m10515e();
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 >= this.f9711a.m10515e() && i10 <= m10527e()) {
            return Long.valueOf(this.f9711a.m10516f(m10528f(i10)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m10523d(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R$layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.m10524a()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L61
            com.google.android.material.datepicker.l r2 = r5.f9711a
            int r3 = r2.f9708f
            if (r7 < r3) goto L2e
            goto L61
        L2e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.l r2 = r5.f9711a
            long r2 = r2.m10516f(r7)
            com.google.android.material.datepicker.l r7 = r5.f9711a
            int r7 = r7.f9706d
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.C2567l.m10513k()
            int r4 = r4.f9706d
            if (r7 != r4) goto L53
            java.lang.String r7 = com.google.android.material.datepicker.AbstractC2561f.m10468a(r2)
            r0.setContentDescription(r7)
            goto L5a
        L53:
            java.lang.String r7 = com.google.android.material.datepicker.AbstractC2561f.m10470c(r2)
            r0.setContentDescription(r7)
        L5a:
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L69
        L61:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L69:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L70
            return r0
        L70:
            com.google.android.material.datepicker.a r7 = r5.f9713c
            com.google.android.material.datepicker.a$c r7 = r7.m10454f()
            long r2 = r6.longValue()
            boolean r6 = r7.mo10464c(r2)
            if (r6 != 0) goto L8b
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f9712b
            com.google.android.material.datepicker.b r6 = r6.f9640g
            r6.m10466b(r0)
            return r0
        L8b:
            r0.setEnabled(r8)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C2568m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m10527e() {
        return (this.f9711a.m10515e() + this.f9711a.f9708f) - 1;
    }

    /* renamed from: f */
    int m10528f(int i10) {
        return (i10 - this.f9711a.m10515e()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m10529g(int i10) {
        if (i10 >= m10524a() && i10 <= m10527e()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9711a.f9708f + m10524a();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f9711a.f9707e;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
