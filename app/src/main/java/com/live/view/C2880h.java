package com.live.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.live.R$id;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p028b8.C1160g0;
import p433zd.AbstractC7786b;

/* renamed from: com.live.view.h */
/* loaded from: classes2.dex */
public final class C2880h extends PopupWindow implements C1160g0.a {

    /* renamed from: a */
    private final Context f10949a;

    /* renamed from: b */
    private String f10950b;

    /* renamed from: c */
    private ArrayList f10951c;

    /* renamed from: d */
    private C1160g0 f10952d;

    /* renamed from: e */
    private RecyclerView f10953e;

    /* renamed from: f */
    private int f10954f;

    /* renamed from: g */
    private a f10955g;

    /* renamed from: h */
    private final Handler f10956h;

    /* renamed from: com.live.view.h$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo11628a(int i10, String str);
    }

    /* renamed from: com.live.view.h$b */
    /* loaded from: classes2.dex */
    public static final class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC5868k.m23674f(message, "msg");
            if (message.what == 200) {
                C2880h.this.dismiss();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2880h(Context context, View view) {
        super(view, AbstractC7786b.m30166j(212), AbstractC7786b.m30166j(165));
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(view, "contentView");
        this.f10949a = context;
        this.f10950b = "LivePipPopWindow";
        this.f10951c = new ArrayList();
        m11624b();
        this.f10956h = new b();
    }

    /* renamed from: b */
    private final void m11624b() {
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable());
        View findViewById = getContentView().findViewById(R$id.mSubtitleRec);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f10953e = recyclerView;
        C1160g0 c1160g0 = null;
        if (recyclerView == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView = null;
        }
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.f10953e;
        if (recyclerView2 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView2 = null;
        }
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = this.f10953e;
        if (recyclerView3 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(this.f10949a, 1, false));
        C1160g0 c1160g02 = new C1160g0(this.f10949a);
        this.f10952d = c1160g02;
        c1160g02.setHasStableIds(true);
        RecyclerView recyclerView4 = this.f10953e;
        if (recyclerView4 == null) {
            AbstractC5868k.m23686r("mRecycler");
            recyclerView4 = null;
        }
        C1160g0 c1160g03 = this.f10952d;
        if (c1160g03 == null) {
            AbstractC5868k.m23686r("mApter");
            c1160g03 = null;
        }
        recyclerView4.setAdapter(c1160g03);
        C1160g0 c1160g04 = this.f10952d;
        if (c1160g04 == null) {
            AbstractC5868k.m23686r("mApter");
        } else {
            c1160g0 = c1160g04;
        }
        c1160g0.m5327g(this);
    }

    @Override // p028b8.C1160g0.a
    /* renamed from: a */
    public void mo5330a(int i10, String str) {
        AbstractC5868k.m23674f(str, "operate");
        this.f10954f = i10;
        a aVar = this.f10955g;
        if (aVar != null) {
            aVar.mo11628a(i10, str);
        }
        if (i10 == 0) {
            this.f10956h.removeMessages(200);
            this.f10956h.sendEmptyMessageDelayed(200, 1000L);
        }
    }

    /* renamed from: c */
    public final void m11625c(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "data");
        this.f10951c = arrayList;
        C1160g0 c1160g0 = this.f10952d;
        if (c1160g0 == null) {
            AbstractC5868k.m23686r("mApter");
            c1160g0 = null;
        }
        c1160g0.m5329i(this.f10951c);
    }

    /* renamed from: d */
    public final void m11626d(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f10955g = aVar;
    }

    /* renamed from: e */
    public final void m11627e(int i10) {
        if (i10 >= 0 && i10 < this.f10951c.size()) {
            this.f10954f = i10;
            C1160g0 c1160g0 = this.f10952d;
            if (c1160g0 == null) {
                AbstractC5868k.m23686r("mApter");
                c1160g0 = null;
            }
            c1160g0.m5328h(i10);
        }
    }
}
