package p102db;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.module.R$id;
import com.module.R$layout;
import com.umeng.analytics.pro.C3384f;
import ne.AbstractC5868k;
import p399x9.C7536k;
import p433zd.AbstractC7786b;

/* renamed from: db.o0 */
/* loaded from: classes2.dex */
public final class C4063o0 extends PopupWindow {

    /* renamed from: a */
    private Context f17941a;

    /* renamed from: b */
    public RecyclerView f17942b;

    /* renamed from: c */
    private C7536k f17943c;

    /* renamed from: d */
    private a f17944d;

    /* renamed from: db.o0$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo12229a(int i10, String str, String str2);
    }

    /* renamed from: db.o0$b */
    /* loaded from: classes2.dex */
    public static final class b implements C7536k.b {
        b() {
        }

        @Override // p399x9.C7536k.b
        /* renamed from: a */
        public void mo17093a(View view, boolean z10) {
            AbstractC5868k.m23674f(view, "view");
        }
    }

    /* renamed from: db.o0$c */
    /* loaded from: classes2.dex */
    public static final class c implements C7536k.a {
        c() {
        }

        @Override // p399x9.C7536k.a
        /* renamed from: a */
        public void mo17094a(int i10, String str, String str2) {
            AbstractC5868k.m23674f(str, "nation");
            AbstractC5868k.m23674f(str2, "nationCode");
            a m17087c = C4063o0.this.m17087c();
            if (m17087c != null) {
                m17087c.mo12229a(i10, str, str2);
            }
        }
    }

    /* renamed from: db.o0$d */
    /* loaded from: classes2.dex */
    public static final class d implements C7536k.c {
        d() {
        }

        @Override // p399x9.C7536k.c
        /* renamed from: a */
        public boolean mo17095a(View view, int i10, KeyEvent keyEvent, int i11) {
            AbstractC5868k.m23674f(view, "view");
            AbstractC5868k.m23674f(keyEvent, "event");
            if (keyEvent.getAction() == 0) {
                if (i10 != 4) {
                    if (i10 == 19 && i11 == 1) {
                        C4063o0.this.m17088d().scrollToPosition(0);
                        return true;
                    }
                } else {
                    C4063o0.this.dismiss();
                    return true;
                }
            }
            return false;
        }
    }

    public C4063o0(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f17941a = context;
        this.f17943c = new C7536k(context);
        m17090h();
        m17089e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m17085f(C4063o0 c4063o0, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c4063o0, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 4) {
            c4063o0.dismiss();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m17086g(C4063o0 c4063o0, View view, boolean z10) {
        AbstractC5868k.m23674f(c4063o0, "this$0");
        if (z10 && c4063o0.m17088d().getChildAt(1) != null && c4063o0.f17943c.m28880d() == -1) {
            c4063o0.m17088d().getChildAt(1).requestFocus();
        }
    }

    /* renamed from: c */
    public final a m17087c() {
        return this.f17944d;
    }

    /* renamed from: d */
    public final RecyclerView m17088d() {
        RecyclerView recyclerView = this.f17942b;
        if (recyclerView != null) {
            return recyclerView;
        }
        AbstractC5868k.m23686r("mRecyclerNation");
        return null;
    }

    /* renamed from: e */
    public final void m17089e() {
        this.f17943c.m28882i(new b());
        this.f17943c.m28881h(new c());
        this.f17943c.m28883j(new d());
        m17088d().setOnKeyListener(new View.OnKeyListener() { // from class: db.m0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                boolean m17085f;
                m17085f = C4063o0.m17085f(C4063o0.this, view, i10, keyEvent);
                return m17085f;
            }
        });
        m17088d().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: db.n0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C4063o0.m17086g(C4063o0.this, view, z10);
            }
        });
    }

    /* renamed from: h */
    public final void m17090h() {
        View inflate = LayoutInflater.from(this.f17941a).inflate(R$layout.layout_nation_popupwindow, (ViewGroup) null);
        setWidth(AbstractC7786b.m30166j(360));
        setHeight(AbstractC7786b.m30166j(640));
        setContentView(inflate);
        setFocusable(true);
        View findViewById = inflate.findViewById(R$id.mRecyclerNation);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        m17091i((RecyclerView) findViewById);
        m17088d().setAdapter(this.f17943c);
        m17088d().setLayoutManager(new LinearLayoutManager(this.f17941a, 1, false));
    }

    /* renamed from: i */
    public final void m17091i(RecyclerView recyclerView) {
        AbstractC5868k.m23674f(recyclerView, "<set-?>");
        this.f17942b = recyclerView;
    }

    /* renamed from: j */
    public final void m17092j(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        this.f17944d = aVar;
    }
}
