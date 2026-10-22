package com.live.view;

import android.content.Context;
import android.util.AttributeSet;
import com.request.result.LineupPlayer;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class LineUpView extends AutoFrameLayout {

    /* renamed from: a */
    private int f10913a;

    /* renamed from: b */
    private int f10914b;

    /* renamed from: c */
    private C2878f f10915c;

    /* renamed from: d */
    private ArrayList f10916d;

    /* renamed from: e */
    private C2878f f10917e;

    /* renamed from: f */
    private ArrayList f10918f;

    /* renamed from: g */
    public Map f10919g = new LinkedHashMap();

    public LineUpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10913a = AbstractC7786b.m30166j(50);
        this.f10914b = AbstractC7786b.m30166j(180);
    }

    /* renamed from: a */
    private final C2878f m11577a(LineupPlayer lineupPlayer, int i10) {
        C2878f c2878f = new C2878f(getContext());
        c2878f.setTeamType(i10);
        c2878f.m11616h(lineupPlayer.getNumber(), lineupPlayer.getName(), lineupPlayer.getIcon());
        return c2878f;
    }

    /* renamed from: c */
    private final void m11578c(int i10, int i11, int i12, int i13) {
        C2878f c2878f = this.f10917e;
        if (c2878f != null) {
            int i14 = (i10 - this.f10914b) + this.f10913a;
            int measuredHeight = i13 - (c2878f.getMeasuredHeight() / 2);
            c2878f.layout(i14, measuredHeight, c2878f.getMeasuredWidth() + i14, c2878f.getMeasuredHeight() + measuredHeight);
        }
    }

    /* renamed from: g */
    private final void m11579g(int i10, int i11, int i12, int i13) {
        int size;
        ArrayList arrayList = this.f10918f;
        if (arrayList != null) {
            int size2 = ((i11 - this.f10914b) - this.f10913a) / arrayList.size();
            int i14 = i12 / 5;
            int i15 = 0;
            for (Object obj : arrayList) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC1500l.m6991j();
                }
                List list = (List) obj;
                if (5 - list.size() <= 0) {
                    size = 0;
                } else {
                    size = ((5 - list.size()) * i14) / 2;
                }
                int i17 = ((i10 - this.f10914b) - this.f10913a) - (i15 * size2);
                int i18 = 0;
                for (Object obj2 : list) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        AbstractC1500l.m6991j();
                    }
                    C2878f c2878f = (C2878f) obj2;
                    int measuredHeight = (i18 * i14) + size + ((i14 - c2878f.getMeasuredHeight()) / 2);
                    c2878f.layout((i17 - size2) + c2878f.getMeasuredWidth(), measuredHeight, c2878f.getMeasuredWidth() + i17, c2878f.getMeasuredHeight() + measuredHeight);
                    i18 = i19;
                }
                i15 = i16;
            }
        }
    }

    /* renamed from: h */
    private final void m11580h(int i10, int i11, int i12, int i13) {
        C2878f c2878f = this.f10915c;
        if (c2878f != null) {
            int i14 = this.f10913a;
            int measuredHeight = i13 - (c2878f.getMeasuredHeight() / 2);
            c2878f.layout(i14, measuredHeight, c2878f.getMeasuredWidth() + i14, c2878f.getMeasuredHeight() + measuredHeight);
        }
    }

    /* renamed from: i */
    private final void m11581i(int i10, int i11, int i12, int i13) {
        int size;
        ArrayList arrayList = this.f10916d;
        if (arrayList != null) {
            int size2 = ((i11 - this.f10914b) - this.f10913a) / arrayList.size();
            int i14 = i12 / 5;
            int i15 = 0;
            for (Object obj : arrayList) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC1500l.m6991j();
                }
                List list = (List) obj;
                if (5 - list.size() <= 0) {
                    size = 0;
                } else {
                    size = ((5 - list.size()) * i14) / 2;
                }
                int i17 = this.f10914b + this.f10913a + (i15 * size2);
                int i18 = 0;
                for (Object obj2 : list) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        AbstractC1500l.m6991j();
                    }
                    C2878f c2878f = (C2878f) obj2;
                    int measuredHeight = (i18 * i14) + size + ((i14 - c2878f.getMeasuredHeight()) / 2);
                    c2878f.layout(i17, measuredHeight, c2878f.getMeasuredWidth() + i17, c2878f.getMeasuredHeight() + measuredHeight);
                    i18 = i19;
                }
                i15 = i16;
            }
        }
    }

    /* renamed from: j */
    public final void m11582j(LineupPlayer lineupPlayer, List list, LineupPlayer lineupPlayer2, List list2) {
        AbstractC5868k.m23674f(lineupPlayer, "visitKeeper");
        AbstractC5868k.m23674f(list, "visitPlayerList");
        AbstractC5868k.m23674f(lineupPlayer2, "homeKeeper");
        AbstractC5868k.m23674f(list2, "homePlayerList");
        removeAllViews();
        this.f10915c = null;
        this.f10916d = null;
        this.f10917e = null;
        this.f10918f = null;
        C2878f m11577a = m11577a(lineupPlayer, C2878f.f10938c.m11618b());
        this.f10915c = m11577a;
        addView(m11577a, -2, -2);
        this.f10916d = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list3 = (List) it.next();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                C2878f m11577a2 = m11577a((LineupPlayer) it2.next(), C2878f.f10938c.m11618b());
                addView(m11577a2, -2, -2);
                arrayList.add(m11577a2);
            }
            ArrayList arrayList2 = this.f10916d;
            AbstractC5868k.m23671c(arrayList2);
            arrayList2.add(arrayList);
        }
        C2878f m11577a3 = m11577a(lineupPlayer2, C2878f.f10938c.m11617a());
        this.f10917e = m11577a3;
        addView(m11577a3, -2, -2);
        this.f10918f = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            List list4 = (List) it3.next();
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                C2878f m11577a4 = m11577a((LineupPlayer) it4.next(), C2878f.f10938c.m11617a());
                addView(m11577a4, -2, -2);
                arrayList3.add(m11577a4);
            }
            ArrayList arrayList4 = this.f10918f;
            AbstractC5868k.m23671c(arrayList4);
            arrayList4.add(arrayList3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zhy.autolayout.AutoFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (getChildCount() == 0) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = getMeasuredHeight() / 2;
        m11580h(measuredWidth, measuredWidth2, measuredHeight, measuredHeight2);
        m11581i(measuredWidth, measuredWidth2, measuredHeight, measuredHeight2);
        m11578c(measuredWidth, measuredWidth2, measuredHeight, measuredHeight2);
        m11579g(measuredWidth, measuredWidth2, measuredHeight, measuredHeight2);
    }
}
