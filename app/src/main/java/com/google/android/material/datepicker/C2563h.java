package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
class C2563h extends BaseAdapter {

    /* renamed from: d */
    private static final int f9643d;

    /* renamed from: a */
    private final Calendar f9644a;

    /* renamed from: b */
    private final int f9645b;

    /* renamed from: c */
    private final int f9646c;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        f9643d = i10;
    }

    public C2563h() {
        Calendar m10551k = AbstractC2576u.m10551k();
        this.f9644a = m10551k;
        this.f9645b = m10551k.getMaximum(7);
        this.f9646c = m10551k.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m10475b(int i10) {
        int i11 = i10 + this.f9646c;
        int i12 = this.f9645b;
        if (i11 > i12) {
            return i11 - i12;
        }
        return i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f9645b) {
            return null;
        }
        return Integer.valueOf(m10475b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9645b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f9644a.set(7, m10475b(i10));
        textView.setText(this.f9644a.getDisplayName(7, f9643d, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R$string.mtrl_picker_day_of_week_column_header), this.f9644a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
