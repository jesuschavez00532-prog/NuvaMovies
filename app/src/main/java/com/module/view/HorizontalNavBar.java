package com.module.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.module.view.HorizontalNavBar;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p102db.InterfaceC4078t0;
import p317rb.AbstractC6567a;

/* loaded from: classes2.dex */
public final class HorizontalNavBar extends LinearLayout {

    /* renamed from: a */
    private int f12184a;

    /* renamed from: b */
    private final ArrayList f12185b;

    /* renamed from: c */
    private InterfaceC4078t0 f12186c;

    /* renamed from: d */
    public Map f12187d = new LinkedHashMap();

    public HorizontalNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12184a = -1;
        this.f12185b = new ArrayList();
        m12100j();
    }

    /* renamed from: d */
    private final View m12095d(final int i10, Object obj) {
        final View mo16537B1;
        InterfaceC4078t0 interfaceC4078t0 = this.f12186c;
        if (interfaceC4078t0 != null && (mo16537B1 = interfaceC4078t0.mo16537B1(i10, obj)) != null) {
            if (mo16537B1 instanceof ViewGroup) {
                ((ViewGroup) mo16537B1).setDescendantFocusability(393216);
            }
            mo16537B1.setFocusable(true);
            mo16537B1.setFocusableInTouchMode(true);
            mo16537B1.setOnKeyListener(new View.OnKeyListener() { // from class: db.m
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                    boolean m12096e;
                    m12096e = HorizontalNavBar.m12096e(HorizontalNavBar.this, i10, view, i11, keyEvent);
                    return m12096e;
                }
            });
            mo16537B1.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: db.n
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    HorizontalNavBar.m12097f(HorizontalNavBar.this, i10, view, z10);
                }
            });
            mo16537B1.setOnTouchListener(new View.OnTouchListener() { // from class: db.o
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m12098g;
                    m12098g = HorizontalNavBar.m12098g(HorizontalNavBar.this, mo16537B1, view, motionEvent);
                    return m12098g;
                }
            });
            return mo16537B1;
        }
        throw new InstantiationException("tab container instantiation error.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    public static final boolean m12096e(HorizontalNavBar horizontalNavBar, int i10, View view, int i11, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC5868k.m23674f(horizontalNavBar, "this$0");
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && keyEvent.getRepeatCount() == 0) {
            switch (i11) {
                case 19:
                    InterfaceC4078t0 interfaceC4078t0 = horizontalNavBar.f12186c;
                    if (interfaceC4078t0 != null && interfaceC4078t0.mo16554j3(i10)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        return true;
                    }
                    break;
                case 20:
                    InterfaceC4078t0 interfaceC4078t02 = horizontalNavBar.f12186c;
                    if (interfaceC4078t02 != null && interfaceC4078t02.mo16545S(i10)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        return true;
                    }
                    break;
                case 21:
                    if (i10 <= 0) {
                        InterfaceC4078t0 interfaceC4078t03 = horizontalNavBar.f12186c;
                        if (interfaceC4078t03 != null && interfaceC4078t03.mo16544O3(i10)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            return true;
                        }
                    }
                    horizontalNavBar.m12102k(-1);
                    break;
                case 22:
                    if (i10 >= horizontalNavBar.f12185b.size() - 1) {
                        InterfaceC4078t0 interfaceC4078t04 = horizontalNavBar.f12186c;
                        if (interfaceC4078t04 != null && interfaceC4078t04.mo16555n1(i10)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            return true;
                        }
                    }
                    horizontalNavBar.m12102k(-1);
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12097f(HorizontalNavBar horizontalNavBar, int i10, View view, boolean z10) {
        AbstractC5868k.m23674f(horizontalNavBar, "this$0");
        if (z10 && horizontalNavBar.f12184a != i10) {
            horizontalNavBar.f12184a = i10;
            view.setSelected(false);
            InterfaceC4078t0 interfaceC4078t0 = horizontalNavBar.f12186c;
            if (interfaceC4078t0 != null) {
                interfaceC4078t0.mo16546Y(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m12098g(HorizontalNavBar horizontalNavBar, View view, View view2, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(horizontalNavBar, "this$0");
        AbstractC5868k.m23674f(view, "$tabContainer");
        if (motionEvent.getAction() == 1) {
            horizontalNavBar.m12102k(-1);
            view.requestFocus();
        }
        return true;
    }

    /* renamed from: i */
    private final void m12099i(List list) {
        if (AbstractC6567a.m25635e(list) || this.f12186c == null) {
            return;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            View m12095d = m12095d(i10, obj);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            InterfaceC4078t0 interfaceC4078t0 = this.f12186c;
            if (interfaceC4078t0 != null) {
                interfaceC4078t0.mo16548c2(i10, layoutParams);
            }
            addView(m12095d, layoutParams);
            this.f12185b.add(m12095d);
            i10 = i11;
        }
        m12102k(0);
        this.f12184a = 0;
    }

    /* renamed from: j */
    private final void m12100j() {
        setOrientation(0);
    }

    public final int getSelectedIndex() {
        int i10 = 0;
        int i11 = 0;
        for (Object obj : this.f12185b) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1500l.m6991j();
            }
            if (((View) obj).isSelected()) {
                return i11;
            }
            i11 = i12;
        }
        for (Object obj2 : this.f12185b) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            if (((View) obj2).isFocused()) {
                return i10;
            }
            i10 = i13;
        }
        return -1;
    }

    /* renamed from: h */
    public final boolean m12101h() {
        int i10 = 0;
        for (Object obj : this.f12185b) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1500l.m6991j();
            }
            View view = (View) obj;
            view.setSelected(false);
            if (this.f12184a == i10) {
                return view.requestFocus();
            }
            i10 = i11;
        }
        return false;
    }

    /* renamed from: k */
    public final void m12102k(int i10) {
        boolean z10;
        int i11 = 0;
        for (Object obj : this.f12185b) {
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

    public final void setNavData(List<? extends Object> list) {
        AbstractC5868k.m23674f(list, "navDatas");
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        this.f12185b.clear();
        removeAllViews();
        m12099i(list);
    }

    public final void setOnNavListener(InterfaceC4078t0 interfaceC4078t0) {
        AbstractC5868k.m23674f(interfaceC4078t0, "listener");
        this.f12186c = interfaceC4078t0;
    }
}
