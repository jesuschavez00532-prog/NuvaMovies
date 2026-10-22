package p400xa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractC0729o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1596k;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import com.module.R$string;
import com.module.view.MyWebView;
import com.open.leanback.widget.AbstractC3050a;
import com.open.leanback.widget.GridLayoutManager;
import com.umeng.analytics.pro.C3384f;
import java.util.List;
import java.util.ListIterator;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.C5874q;
import ne.C5877t;
import p035c3.AbstractC1350e;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1508t;
import p161ha.C4773h0;
import p278p1.C6169i;
import p278p1.C6172l;
import p317rb.AbstractC6567a;
import p359ue.AbstractC7167u;
import p359ue.C7155i;

/* renamed from: xa.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7555b0 {
    /* renamed from: c */
    public static final boolean m28949c(Context context) {
        AbstractC5868k.m23674f(context, "<this>");
        if (MyWebView.f12252b.m12223c()) {
            return false;
        }
        try {
            new MyWebView(context, null, 0, 6, null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return !MyWebView.f12252b.m12223c();
    }

    /* renamed from: d */
    public static final boolean m28950d(String str, Context context) {
        boolean m27763v;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (AbstractC6567a.m25634d(str)) {
            return false;
        }
        AbstractC5868k.m23671c(str);
        m27763v = AbstractC7167u.m27763v(str, "urlOpen=out", false, 2, null);
        if (m27763v) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.setData(Uri.parse(str));
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception unused) {
                C7586l1 c7586l1 = C7586l1.f27877a;
                String string = context.getResources().getString(R$string.error_hint_no_browser);
                AbstractC5868k.m23673e(string, "context.resources.getStr…ng.error_hint_no_browser)");
                C7586l1.m29111d(c7586l1, context, string, 0, 0, 12, null);
                return true;
            }
        }
        if (!m28949c(context)) {
            return false;
        }
        C4773h0 c4773h0 = new C4773h0();
        Bundle bundle = new Bundle();
        bundle.putString("extra_visit_link", str);
        c4773h0.m3132V8(bundle);
        AbstractC0729o m3294d4 = ((AbstractActivityC0302c) context).m3294d4();
        AbstractC5868k.m23673e(m3294d4, "context as AppCompatActi…y).supportFragmentManager");
        c4773h0.mo3277E9(m3294d4, "float_web_dialog");
        return true;
    }

    /* renamed from: e */
    public static final String m28951e(String str) {
        List m6985d;
        boolean z10;
        String str2 = "";
        if (str != null && !AbstractC5868k.m23669a(str, "")) {
            List m27681e = new C7155i(";").m27681e(str, 0);
            if (!m27681e.isEmpty()) {
                ListIterator listIterator = m27681e.listIterator(m27681e.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        m6985d = AbstractC1508t.m6997B(m27681e, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m6985d = AbstractC1500l.m6985d();
            for (String str3 : (String[]) m6985d.toArray(new String[0])) {
                str2 = str2 + '*' + str3 + '\n';
            }
        }
        return str2;
    }

    /* renamed from: f */
    public static final C1596k m28952f(C1596k c1596k, String str) {
        C6169i c6169i;
        AbstractC5868k.m23674f(c1596k, "<this>");
        String m6119a = AbstractC1350e.m6119a(str, "key_poster");
        if (m6119a != null) {
            c6169i = m28960n(m6119a);
        } else {
            c6169i = null;
        }
        C1596k mo7367H0 = c1596k.mo7367H0(c6169i);
        AbstractC5868k.m23673e(mo7367H0, "this.load(url)");
        return mo7367H0;
    }

    /* renamed from: g */
    public static final C1596k m28953g(ComponentCallbacks2C1597l componentCallbacks2C1597l, String str, boolean z10) {
        C6169i c6169i;
        AbstractC5868k.m23674f(componentCallbacks2C1597l, "<this>");
        C6169i c6169i2 = null;
        if (str != null) {
            c6169i = m28960n(str);
        } else {
            c6169i = null;
        }
        if (z10) {
            String m6119a = AbstractC1350e.m6119a(str, "key_poster");
            if (m6119a != null) {
                c6169i2 = m28960n(m6119a);
            }
            c6169i = c6169i2;
        }
        C1596k mo7387m = componentCallbacks2C1597l.mo7387m(c6169i);
        AbstractC5868k.m23673e(mo7387m, "this.load(url)");
        return mo7387m;
    }

    /* renamed from: h */
    public static /* synthetic */ C1596k m28954h(ComponentCallbacks2C1597l componentCallbacks2C1597l, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return m28953g(componentCallbacks2C1597l, str, z10);
    }

    /* renamed from: i */
    public static final void m28955i(View view, final View.OnClickListener onClickListener) {
        AbstractC5868k.m23674f(view, "<this>");
        AbstractC5868k.m23674f(onClickListener, "listener");
        final C5877t c5877t = new C5877t();
        view.setOnClickListener(new View.OnClickListener() { // from class: xa.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC7555b0.m28956j(C5877t.this, onClickListener, view2);
            }
        });
    }

    /* renamed from: j */
    public static final void m28956j(C5877t c5877t, View.OnClickListener onClickListener, View view) {
        AbstractC5868k.m23674f(c5877t, "$lastTime");
        AbstractC5868k.m23674f(onClickListener, "$listener");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - c5877t.f23411a > 500) {
            c5877t.f23411a = currentTimeMillis;
            onClickListener.onClick(view);
        }
    }

    /* renamed from: k */
    public static final void m28957k(final AbstractC3050a abstractC3050a, final boolean z10, final boolean z11, final InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(abstractC3050a, "<this>");
        final C5874q c5874q = new C5874q();
        abstractC3050a.setOnTouchInterceptListener(new AbstractC3050a.g() { // from class: xa.z
            @Override // com.open.leanback.widget.AbstractC3050a.g
            /* renamed from: a */
            public final boolean mo12525a(MotionEvent motionEvent) {
                boolean m28959m;
                m28959m = AbstractC7555b0.m28959m(InterfaceC5660l.this, c5874q, abstractC3050a, z10, z11, motionEvent);
                return m28959m;
            }
        });
    }

    /* renamed from: l */
    public static /* synthetic */ void m28958l(AbstractC3050a abstractC3050a, boolean z10, boolean z11, InterfaceC5660l interfaceC5660l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            interfaceC5660l = null;
        }
        m28957k(abstractC3050a, z10, z11, interfaceC5660l);
    }

    /* renamed from: m */
    public static final boolean m28959m(InterfaceC5660l interfaceC5660l, C5874q c5874q, AbstractC3050a abstractC3050a, boolean z10, boolean z11, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(c5874q, "$setupTouchListConfig");
        AbstractC5868k.m23674f(abstractC3050a, "$this_setupTouchListConfig");
        if (interfaceC5660l != null) {
            AbstractC5868k.m23673e(motionEvent, "it");
            interfaceC5660l.mo542f(motionEvent);
        }
        if (c5874q.f23408a) {
            return false;
        }
        RecyclerView.AbstractC0797p layoutManager = abstractC3050a.getLayoutManager();
        AbstractC5868k.m23672d(layoutManager, "null cannot be cast to non-null type com.open.leanback.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (z10) {
            gridLayoutManager.m12430Z0(true);
        }
        if (z11) {
            gridLayoutManager.m12431a1(true);
        }
        gridLayoutManager.m12428X0(1);
        c5874q.f23408a = true;
        return false;
    }

    /* renamed from: n */
    public static final C6169i m28960n(String str) {
        AbstractC5868k.m23674f(str, "<this>");
        try {
            return new C6169i(str, new C6172l.a().m24654a("ReqSource", "own").m24656c());
        } catch (Exception unused) {
            return null;
        }
    }
}
