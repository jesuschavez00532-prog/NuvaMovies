package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.AbstractC0616q0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.datepicker.C2564i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
public class C2569n extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private final C2556a f9714a;

    /* renamed from: b */
    private final C2564i.l f9715b;

    /* renamed from: c */
    private final int f9716c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.n$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ MaterialCalendarGridView f9717a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f9717a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f9717a.getAdapter().m10529g(i10)) {
                C2569n.this.f9715b.mo10495a(this.f9717a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        final TextView f9719a;

        /* renamed from: b */
        final MaterialCalendarGridView f9720b;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R$id.month_title);
            this.f9719a = textView;
            AbstractC0616q0.m2638o0(textView, true);
            this.f9720b = (MaterialCalendarGridView) linearLayout.findViewById(R$id.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2569n(Context context, InterfaceC2559d interfaceC2559d, C2556a c2556a, C2564i.l lVar) {
        int i10;
        C2567l m10458j = c2556a.m10458j();
        C2567l m10455g = c2556a.m10455g();
        C2567l m10457i = c2556a.m10457i();
        if (m10458j.compareTo(m10457i) <= 0) {
            if (m10457i.compareTo(m10455g) <= 0) {
                int m10486y9 = C2568m.f9710d * C2564i.m10486y9(context);
                if (C2565j.m10504O9(context)) {
                    i10 = C2564i.m10486y9(context);
                } else {
                    i10 = 0;
                }
                this.f9716c = m10486y9 + i10;
                this.f9714a = c2556a;
                this.f9715b = lVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C2567l m10531b(int i10) {
        return this.f9714a.m10458j().m10519i(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public CharSequence m10532c(int i10) {
        return m10531b(i10).m10517g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m10533d(C2567l c2567l) {
        return this.f9714a.m10458j().m10520j(c2567l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        C2567l m10519i = this.f9714a.m10458j().m10519i(i10);
        bVar.f9719a.setText(m10519i.m10517g());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f9720b.findViewById(R$id.month_grid);
        if (materialCalendarGridView.getAdapter() != null && m10519i.equals(materialCalendarGridView.getAdapter().f9711a)) {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        } else {
            C2568m c2568m = new C2568m(m10519i, null, this.f9714a);
            materialCalendarGridView.setNumColumns(m10519i.f9707e);
            materialCalendarGridView.setAdapter((ListAdapter) c2568m);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (C2565j.m10504O9(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.C0798q(-1, this.f9716c));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f9714a.m10456h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return this.f9714a.m10458j().m10519i(i10).m10518h();
    }
}
