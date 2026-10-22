package com.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC0547a;
import com.live.R$color;
import com.live.R$drawable;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p317rb.AbstractC6567a;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class MatchNavBar extends AutoLinearLayout {

    /* renamed from: a */
    private int f10920a;

    /* renamed from: b */
    private final ArrayList f10921b;

    /* renamed from: c */
    private InterfaceC2894v f10922c;

    /* renamed from: d */
    public Map f10923d = new LinkedHashMap();

    public MatchNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10920a = -1;
        this.f10921b = new ArrayList();
    }

    /* renamed from: c */
    private final View m11585c(final int i10, C2893u c2893u) {
        AutoFrameLayout autoFrameLayout = new AutoFrameLayout(getContext());
        autoFrameLayout.setBackgroundResource(R$drawable.bg_match_nav);
        autoFrameLayout.setDescendantFocusability(393216);
        autoFrameLayout.setFocusable(true);
        autoFrameLayout.setFocusableInTouchMode(true);
        int m30166j = AbstractC7786b.m30166j(30);
        autoFrameLayout.setPadding(m30166j, 0, m30166j, 0);
        TextView textView = new TextView(getContext());
        textView.setDuplicateParentStateEnabled(true);
        textView.setText(c2893u.m11746a());
        textView.setTextColor(AbstractC0547a.m2323e(getContext(), R$color.selector_match_nav_text));
        textView.setTextSize(0, AbstractC7786b.m30166j(32));
        AutoFrameLayout.C3910a c3910a = new AutoFrameLayout.C3910a(-2, -2);
        ((FrameLayout.LayoutParams) c3910a).gravity = 17;
        autoFrameLayout.addView(textView, c3910a);
        View view = new View(getContext());
        view.setBackgroundResource(R$drawable.bg_match_nav_indicator);
        view.setDuplicateParentStateEnabled(true);
        AutoFrameLayout.C3910a c3910a2 = new AutoFrameLayout.C3910a(AbstractC7786b.m30166j(48), AbstractC7786b.m30166j(6));
        ((FrameLayout.LayoutParams) c3910a2).gravity = 81;
        autoFrameLayout.addView(view, c3910a2);
        autoFrameLayout.setOnKeyListener(new View.OnKeyListener() { // from class: com.live.view.s
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i11, KeyEvent keyEvent) {
                boolean m11586d;
                m11586d = MatchNavBar.m11586d(i10, this, view2, i11, keyEvent);
                return m11586d;
            }
        });
        autoFrameLayout.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.live.view.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                MatchNavBar.m11587e(MatchNavBar.this, i10, view2, z10);
            }
        });
        return autoFrameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: d */
    public static final boolean m11586d(int i10, MatchNavBar matchNavBar, View view, int i11, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC5868k.m23674f(matchNavBar, "this$0");
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            switch (i11) {
                case 19:
                    InterfaceC2894v interfaceC2894v = matchNavBar.f10922c;
                    if (interfaceC2894v != null && interfaceC2894v.mo11523x2(i10)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        matchNavBar.m11590h(i10);
                        return true;
                    }
                    break;
                case 20:
                    InterfaceC2894v interfaceC2894v2 = matchNavBar.f10922c;
                    if (interfaceC2894v2 != null && interfaceC2894v2.mo11510S(i10)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        matchNavBar.m11590h(i10);
                        return true;
                    }
                    break;
                case 21:
                    if (i10 <= 0) {
                        return true;
                    }
                    matchNavBar.m11590h(-1);
                    break;
                case 22:
                    if (i10 >= matchNavBar.f10921b.size() - 1) {
                        return true;
                    }
                    matchNavBar.m11590h(-1);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m11587e(MatchNavBar matchNavBar, int i10, View view, boolean z10) {
        AbstractC5868k.m23674f(matchNavBar, "this$0");
        if (z10 && matchNavBar.f10920a != i10) {
            matchNavBar.f10920a = i10;
            view.setSelected(false);
            InterfaceC2894v interfaceC2894v = matchNavBar.f10922c;
            if (interfaceC2894v != null) {
                interfaceC2894v.mo11514Y(i10);
            }
        }
    }

    /* renamed from: g */
    private final void m11588g(List list) {
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            View m11585c = m11585c(i10, (C2893u) obj);
            addView(m11585c, -2, -1);
            this.f10921b.add(m11585c);
            i10 = i11;
        }
        m11590h(0);
        this.f10920a = 0;
    }

    /* renamed from: f */
    public final void m11589f() {
        int i10 = 0;
        for (Object obj : this.f10921b) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            View view = (View) obj;
            view.setSelected(false);
            if (this.f10920a == i10) {
                view.requestFocus();
            }
            i10 = i11;
        }
    }

    /* renamed from: h */
    public final void m11590h(int i10) {
        boolean z10;
        int i11 = 0;
        for (Object obj : this.f10921b) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1500l.m6991j();
            }
            View view = (View) obj;
            if (i10 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            view.setSelected(z10);
            i11 = i12;
        }
    }

    public final void setNavData(List<C2893u> list) {
        AbstractC5868k.m23674f(list, "navDatas");
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        this.f10921b.clear();
        removeAllViews();
        m11588g(list);
    }

    public final void setOnMatchNavListener(InterfaceC2894v interfaceC2894v) {
        AbstractC5868k.m23674f(interfaceC2894v, "listener");
        this.f10922c = interfaceC2894v;
    }
}
