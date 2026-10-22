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

/* renamed from: com.live.view.g */
/* loaded from: classes2.dex */
public final class C2879g extends PopupWindow implements C1166j0.a {

    /* renamed from: a */
    private final Context f10943a;

    /* renamed from: b */
    private ArrayList f10944b;

    /* renamed from: c */
    private C1166j0 f10945c;

    /* renamed from: d */
    private RecyclerView f10946d;

    /* renamed from: e */
    private int f10947e;

    /* renamed from: f */
    private a f10948f;

    /* renamed from: com.live.view.g$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: g */
        void mo11623g(int i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2879g(Context context, View view) {
        super(view, AbstractC7786b.m30166j(180), AbstractC7786b.m30166j(133));
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(view, "contentView");
        this.f10943a = context;
        this.f10944b = new ArrayList();
        m11619b();
    }

    /* renamed from: b */
    private final void m11619b() {
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable());
        View findViewById = getContentView().findViewById(R$id.mSubtitleRec);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f10946d = recyclerView;
        C1166j0 c1166j0 = null;
        if (recyclerView == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView = null;
        }
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.f10946d;
        if (recyclerView2 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView2 = null;
        }
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = this.f10946d;
        if (recyclerView3 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(this.f10943a, 1, false));
        C1166j0 c1166j02 = new C1166j0(this.f10943a);
        this.f10945c = c1166j02;
        c1166j02.setHasStableIds(true);
        RecyclerView recyclerView4 = this.f10946d;
        if (recyclerView4 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView4 = null;
        }
        C1166j0 c1166j03 = this.f10945c;
        if (c1166j03 == null) {
            AbstractC5868k.m23686r("mApter");
            c1166j03 = null;
        }
        recyclerView4.setAdapter(c1166j03);
        C1166j0 c1166j04 = this.f10945c;
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
        this.f10947e = i10;
        a aVar = this.f10948f;
        if (aVar != null) {
            aVar.mo11623g(i10);
        }
        dismiss();
    }

    /* renamed from: c */
    public final void m11620c(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "data");
        this.f10944b = arrayList;
        Log.d("LiveHdPopWindow", "setVideoSizeData size = " + arrayList.size());
        C1166j0 c1166j0 = this.f10945c;
        if (c1166j0 == null) {
            AbstractC5868k.m23686r("mApter");
            c1166j0 = null;
        }
        c1166j0.m5351i(this.f10944b);
    }

    /* renamed from: d */
    public final void m11621d(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f10948f = aVar;
    }

    /* renamed from: e */
    public final void m11622e(int i10) {
        if (i10 >= 0 && i10 < this.f10944b.size()) {
            this.f10947e = i10;
            C1166j0 c1166j0 = this.f10945c;
            if (c1166j0 == null) {
                AbstractC5868k.m23686r("mApter");
                c1166j0 = null;
            }
            c1166j0.m5350h(i10);
        }
    }
}
