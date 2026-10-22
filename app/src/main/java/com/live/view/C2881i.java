package com.live.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.live.R$id;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p028b8.C1166j0;
import p433zd.AbstractC7786b;

/* renamed from: com.live.view.i */
/* loaded from: classes2.dex */
public final class C2881i extends PopupWindow implements C1166j0.a {

    /* renamed from: a */
    private final Context f10958a;

    /* renamed from: b */
    private ArrayList f10959b;

    /* renamed from: c */
    private C1166j0 f10960c;

    /* renamed from: d */
    private RecyclerView f10961d;

    /* renamed from: e */
    private int f10962e;

    /* renamed from: f */
    private a f10963f;

    /* renamed from: com.live.view.i$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: c */
        void mo11633c(int i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2881i(Context context, View view) {
        super(view, AbstractC7786b.m30166j(180), AbstractC7786b.m30166j(133));
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(view, "contentView");
        this.f10958a = context;
        this.f10959b = new ArrayList();
        m11629b();
    }

    /* renamed from: b */
    private final void m11629b() {
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable());
        View findViewById = getContentView().findViewById(R$id.mSubtitleRec);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f10961d = recyclerView;
        C1166j0 c1166j0 = null;
        if (recyclerView == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView = null;
        }
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.f10961d;
        if (recyclerView2 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView2 = null;
        }
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = this.f10961d;
        if (recyclerView3 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(this.f10958a, 1, false));
        C1166j0 c1166j02 = new C1166j0(this.f10958a);
        this.f10960c = c1166j02;
        c1166j02.setHasStableIds(true);
        RecyclerView recyclerView4 = this.f10961d;
        if (recyclerView4 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView4 = null;
        }
        C1166j0 c1166j03 = this.f10960c;
        if (c1166j03 == null) {
            AbstractC5868k.m23686r("mAdapter");
            c1166j03 = null;
        }
        recyclerView4.setAdapter(c1166j03);
        C1166j0 c1166j04 = this.f10960c;
        if (c1166j04 == null) {
            AbstractC5868k.m23686r("mAdapter");
        } else {
            c1166j0 = c1166j04;
        }
        c1166j0.m5349g(this);
    }

    @Override // p028b8.C1166j0.a
    /* renamed from: a */
    public void mo5352a(int i10) {
        this.f10962e = i10;
        a aVar = this.f10963f;
        if (aVar != null) {
            aVar.mo11633c(i10);
        }
        dismiss();
    }

    /* renamed from: c */
    public final void m11630c(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "data");
        this.f10959b = arrayList;
        C1166j0 c1166j0 = this.f10960c;
        if (c1166j0 == null) {
            AbstractC5868k.m23686r("mAdapter");
            c1166j0 = null;
        }
        c1166j0.m5351i(this.f10959b);
    }

    /* renamed from: d */
    public final void m11631d(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f10963f = aVar;
    }

    /* renamed from: e */
    public final void m11632e(int i10) {
        if (i10 >= 0 && i10 < this.f10959b.size()) {
            this.f10962e = i10;
            C1166j0 c1166j0 = this.f10960c;
            if (c1166j0 == null) {
                AbstractC5868k.m23686r("mAdapter");
                c1166j0 = null;
            }
            c1166j0.m5350h(i10);
        }
    }
}
