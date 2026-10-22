package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.v */
/* loaded from: classes.dex */
public class C2577v extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private final C2564i f9723a;

    /* renamed from: com.google.android.material.datepicker.v$a */
    /* loaded from: classes.dex */
    public static class a extends RecyclerView.AbstractC0787f0 {

        /* renamed from: a */
        final TextView f9724a;

        a(TextView textView) {
            super(textView);
            this.f9724a = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2577v(C2564i c2564i) {
        this.f9723a = c2564i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m10556a(int i10) {
        return i10 - this.f9723a.m10490u9().m10458j().f9706d;
    }

    /* renamed from: b */
    int m10557b(int i10) {
        return this.f9723a.m10490u9().m10458j().f9706d + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i10) {
        int m10557b = m10557b(i10);
        String string = aVar.f9724a.getContext().getString(R$string.mtrl_picker_navigate_to_year_description);
        aVar.f9724a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(m10557b)));
        aVar.f9724a.setContentDescription(String.format(string, Integer.valueOf(m10557b)));
        C2558c m10491v9 = this.f9723a.m10491v9();
        if (AbstractC2576u.m10549i().get(1) == m10557b) {
            C2557b c2557b = m10491v9.f9639f;
        } else {
            C2557b c2557b2 = m10491v9.f9637d;
        }
        this.f9723a.m10493x9();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f9723a.m10490u9().m10459k();
    }
}
