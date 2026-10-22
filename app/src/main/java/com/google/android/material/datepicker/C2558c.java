package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import p282p5.AbstractC6215b;
import p282p5.AbstractC6216c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C2558c {

    /* renamed from: a */
    final C2557b f9634a;

    /* renamed from: b */
    final C2557b f9635b;

    /* renamed from: c */
    final C2557b f9636c;

    /* renamed from: d */
    final C2557b f9637d;

    /* renamed from: e */
    final C2557b f9638e;

    /* renamed from: f */
    final C2557b f9639f;

    /* renamed from: g */
    final C2557b f9640g;

    /* renamed from: h */
    final Paint f9641h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2558c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC6215b.m24789c(context, R$attr.materialCalendarStyle, C2564i.class.getCanonicalName()), R$styleable.f9319Y);
        this.f9634a = C2557b.m10465a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayStyle, 0));
        this.f9640g = C2557b.m10465a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f9635b = C2557b.m10465a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f9636c = C2557b.m10465a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList m24791a = AbstractC6216c.m24791a(context, obtainStyledAttributes, R$styleable.MaterialCalendar_rangeFillColor);
        this.f9637d = C2557b.m10465a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearStyle, 0));
        this.f9638e = C2557b.m10465a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f9639f = C2557b.m10465a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f9641h = paint;
        paint.setColor(m24791a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
