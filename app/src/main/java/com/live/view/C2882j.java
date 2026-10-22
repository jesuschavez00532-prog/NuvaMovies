package com.live.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
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

/* renamed from: com.live.view.j */
/* loaded from: classes2.dex */
public final class C2882j extends PopupWindow implements C1166j0.a {

    /* renamed from: a */
    private final Context f10964a;

    /* renamed from: b */
    private ArrayList f10965b;

    /* renamed from: c */
    private C1166j0 f10966c;

    /* renamed from: d */
    private RecyclerView f10967d;

    /* renamed from: e */
    private int f10968e;

    /* renamed from: f */
    private a f10969f;

    /* renamed from: com.live.view.j$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: f */
        void mo11638f(int i10, String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2882j(Context context, View view) {
        super(view, AbstractC7786b.m30166j(180), AbstractC7786b.m30166j(168));
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(view, "contentView");
        this.f10964a = context;
        this.f10965b = new ArrayList();
        m11634b();
    }

    /* renamed from: b */
    private final void m11634b() {
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable());
        View findViewById = getContentView().findViewById(R$id.mSubtitleRec);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f10967d = recyclerView;
        C1166j0 c1166j0 = null;
        if (recyclerView == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView = null;
        }
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.f10967d;
        if (recyclerView2 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView2 = null;
        }
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = this.f10967d;
        if (recyclerView3 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(this.f10964a, 1, false));
        C1166j0 c1166j02 = new C1166j0(this.f10964a);
        this.f10966c = c1166j02;
        c1166j02.setHasStableIds(true);
        RecyclerView recyclerView4 = this.f10967d;
        if (recyclerView4 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView4 = null;
        }
        C1166j0 c1166j03 = this.f10966c;
        if (c1166j03 == null) {
            AbstractC5868k.m23686r("mApter");
            c1166j03 = null;
        }
        recyclerView4.setAdapter(c1166j03);
        C1166j0 c1166j04 = this.f10966c;
        if (c1166j04 == null) {
            AbstractC5868k.m23686r("mApter");
        } else {
            c1166j0 = c1166j04;
        }
        c1166j0.m5349g(this);
    }

    @Override // p028b8.C1166j0.a
    /* renamed from: a */
    public void mo5352a(int i10) {
        this.f10968e = i10;
        a aVar = this.f10969f;
        if (aVar != null) {
            Object obj = this.f10965b.get(i10);
            AbstractC5868k.m23673e(obj, "mList[position]");
            aVar.mo11638f(i10, (String) obj);
        }
        dismiss();
    }

    /* renamed from: c */
    public final void m11635c(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "data");
        this.f10965b = arrayList;
        Log.d("VideoSizePopWindow", "setVideoSizeData size = " + arrayList.size());
        C1166j0 c1166j0 = this.f10966c;
        if (c1166j0 == null) {
            AbstractC5868k.m23686r("mApter");
            c1166j0 = null;
        }
        c1166j0.m5351i(this.f10965b);
    }

    /* renamed from: d */
    public final void m11636d(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f10969f = aVar;
    }

    /* renamed from: e */
    public final void m11637e(int i10) {
        if (i10 >= 0 && i10 < this.f10965b.size()) {
            this.f10968e = i10;
            C1166j0 c1166j0 = this.f10966c;
            if (c1166j0 == null) {
                AbstractC5868k.m23686r("mApter");
                c1166j0 = null;
            }
            c1166j0.m5350h(i10);
        }
    }
}
