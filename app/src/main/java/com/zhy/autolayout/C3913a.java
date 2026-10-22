package com.zhy.autolayout;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import anet.channel.entity.EventType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p403xd.AbstractC7631a;
import p403xd.C7632b;
import p403xd.C7634d;
import p403xd.C7635e;
import p403xd.C7636f;
import p403xd.C7637g;
import p403xd.C7638h;
import p403xd.C7639i;
import p403xd.C7640j;
import p403xd.C7641k;
import p403xd.C7643m;
import p403xd.C7644n;
import p403xd.C7645o;
import p403xd.C7646p;
import p403xd.C7647q;
import p403xd.C7648r;

/* renamed from: com.zhy.autolayout.a */
/* loaded from: classes3.dex */
public class C3913a {

    /* renamed from: a */
    private List f17590a = new ArrayList();

    /* renamed from: c */
    public static C3913a m16742c(View view, int i10, int i11) {
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return null;
        }
        C3913a c3913a = new C3913a();
        if ((i10 & 1) != 0 && (i13 = layoutParams.width) > 0) {
            c3913a.m16743a(C7648r.m29431j(i13, i11));
        }
        if ((i10 & 2) != 0 && (i12 = layoutParams.height) > 0) {
            c3913a.m16743a(C7632b.m29413j(i12, i11));
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if ((i10 & 16) != 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                c3913a.m16743a(C7635e.m29415j(marginLayoutParams.leftMargin, i11));
                c3913a.m16743a(C7637g.m29417j(marginLayoutParams.topMargin, i11));
                c3913a.m16743a(C7636f.m29416j(marginLayoutParams.rightMargin, i11));
                c3913a.m16743a(C7634d.m29414j(marginLayoutParams.bottomMargin, i11));
            }
            if ((i10 & 32) != 0) {
                c3913a.m16743a(C7635e.m29415j(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11));
            }
            if ((i10 & 64) != 0) {
                c3913a.m16743a(C7637g.m29417j(((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i11));
            }
            if ((i10 & 128) != 0) {
                c3913a.m16743a(C7636f.m29416j(((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i11));
            }
            if ((i10 & 256) != 0) {
                c3913a.m16743a(C7634d.m29414j(((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, i11));
            }
        }
        if ((i10 & 8) != 0) {
            c3913a.m16743a(C7644n.m29427j(view.getPaddingLeft(), i11));
            c3913a.m16743a(C7646p.m29429j(view.getPaddingTop(), i11));
            c3913a.m16743a(C7645o.m29428j(view.getPaddingRight(), i11));
            c3913a.m16743a(C7643m.m29426j(view.getPaddingBottom(), i11));
        }
        if ((i10 & 512) != 0) {
            c3913a.m16743a(C7635e.m29415j(view.getPaddingLeft(), i11));
        }
        if ((i10 & EventType.AUTH_FAIL) != 0) {
            c3913a.m16743a(C7637g.m29417j(view.getPaddingTop(), i11));
        }
        if ((i10 & 2048) != 0) {
            c3913a.m16743a(C7636f.m29416j(view.getPaddingRight(), i11));
        }
        if ((i10 & 4096) != 0) {
            c3913a.m16743a(C7634d.m29414j(view.getPaddingBottom(), i11));
        }
        if ((i10 & 8192) != 0) {
            c3913a.m16743a(C7641k.m29424j(C7641k.m29425k(view), i11));
        }
        if ((i10 & 16384) != 0) {
            c3913a.m16743a(C7639i.m29420j(C7639i.m29421k(view), i11));
        }
        if ((32768 & i10) != 0) {
            c3913a.m16743a(C7640j.m29422j(C7640j.m29423k(view), i11));
        }
        if ((65536 & i10) != 0) {
            c3913a.m16743a(C7638h.m29418j(C7638h.m29419k(view), i11));
        }
        if ((view instanceof TextView) && (i10 & 4) != 0) {
            c3913a.m16743a(C7647q.m29430j((int) ((TextView) view).getTextSize(), i11));
        }
        return c3913a;
    }

    /* renamed from: a */
    public void m16743a(AbstractC7631a abstractC7631a) {
        this.f17590a.add(abstractC7631a);
    }

    /* renamed from: b */
    public void m16744b(View view) {
        Iterator it = this.f17590a.iterator();
        while (it.hasNext()) {
            ((AbstractC7631a) it.next()).mo29404a(view);
        }
    }

    public String toString() {
        return "AutoLayoutInfo{autoAttrs=" + this.f17590a + '}';
    }
}
