package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0821h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
public abstract class AbstractC2572q extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.q$a */
    /* loaded from: classes.dex */
    class a extends C0821h {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0821h
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2572q(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0797p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0779b0 c0779b0, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i10);
        startSmoothScroll(aVar);
    }
}
