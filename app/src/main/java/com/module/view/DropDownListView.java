package com.module.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import be.C1328x;
import com.module.R$drawable;
import com.module.view.DropDownListView;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p102db.C4032e;
import p359ue.AbstractC7167u;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class DropDownListView extends AutoLinearLayout {

    /* renamed from: a */
    private TextView f12176a;

    /* renamed from: b */
    private ImageView f12177b;

    /* renamed from: c */
    private final C4032e f12178c;

    /* renamed from: d */
    private ArrayList f12179d;

    /* renamed from: e */
    public Map f12180e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.DropDownListView$a */
    /* loaded from: classes2.dex */
    public static final class C3000a extends AbstractC5869l implements InterfaceC5660l {
        C3000a() {
            super(1);
        }

        /* renamed from: a */
        public final void m12091a(int i10) {
            TextView textView = DropDownListView.this.f12176a;
            if (textView == null) {
                AbstractC5868k.m23686r("mTextView");
                textView = null;
            }
            textView.setText((CharSequence) DropDownListView.this.f12179d.get(i10));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m12091a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(attributeSet, "attr");
        this.f12180e = new LinkedHashMap();
        this.f12178c = new C4032e(context);
        this.f12179d = new ArrayList();
        m12088g();
        m12086e();
    }

    /* renamed from: e */
    private final void m12086e() {
        this.f12178c.m17024e(new C3000a());
        this.f12178c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: db.c
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                DropDownListView.m12087f(DropDownListView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12087f(DropDownListView dropDownListView) {
        AbstractC5868k.m23674f(dropDownListView, "this$0");
        dropDownListView.m12089h(false);
        dropDownListView.setBackgroundResource(R$drawable.bg_pop_rounded_rectangle_red);
    }

    /* renamed from: g */
    private final void m12088g() {
        setFocusable(true);
        setClickable(true);
        setOrientation(0);
        setGravity(16);
        setBackgroundResource(R$drawable.bg_pop_rounded_rectangle_gray);
        int m30166j = AbstractC7786b.m30166j(20);
        setPadding(m30166j, 0, m30166j, 0);
        TextView textView = new TextView(getContext());
        this.f12176a = textView;
        textView.setTextColor(-1);
        TextView textView2 = this.f12176a;
        View view = null;
        if (textView2 == null) {
            AbstractC5868k.m23686r("mTextView");
            textView2 = null;
        }
        textView2.setSingleLine();
        TextView textView3 = this.f12176a;
        if (textView3 == null) {
            AbstractC5868k.m23686r("mTextView");
            textView3 = null;
        }
        textView3.setGravity(16);
        TextView textView4 = this.f12176a;
        if (textView4 == null) {
            AbstractC5868k.m23686r("mTextView");
            textView4 = null;
        }
        textView4.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        TextView textView5 = this.f12176a;
        if (textView5 == null) {
            AbstractC5868k.m23686r("mTextView");
            textView5 = null;
        }
        textView5.setTextSize(0, AbstractC7786b.m30166j(32));
        AutoLinearLayout.C3911a c3911a = new AutoLinearLayout.C3911a(0, -2);
        ((LinearLayout.LayoutParams) c3911a).weight = 1.0f;
        View view2 = this.f12176a;
        if (view2 == null) {
            AbstractC5868k.m23686r("mTextView");
            view2 = null;
        }
        addView(view2, c3911a);
        View view3 = new View(getContext());
        AutoLinearLayout.C3911a c3911a2 = new AutoLinearLayout.C3911a(AbstractC7786b.m30166j(1), AbstractC7786b.m30163g(38));
        ((LinearLayout.LayoutParams) c3911a2).leftMargin = AbstractC7786b.m30166j(15);
        ((LinearLayout.LayoutParams) c3911a2).rightMargin = AbstractC7786b.m30166j(15);
        view3.setBackgroundColor(Color.parseColor("#5c6066"));
        addView(view3, c3911a2);
        ImageView imageView = new ImageView(getContext());
        this.f12177b = imageView;
        imageView.setImageResource(R$drawable.icon_dropdown_arrow);
        ViewGroup.LayoutParams c3911a3 = new AutoLinearLayout.C3911a(AbstractC7786b.m30166j(20), AbstractC7786b.m30163g(14));
        View view4 = this.f12177b;
        if (view4 == null) {
            AbstractC5868k.m23686r("mArrowImg");
        } else {
            view = view4;
        }
        addView(view, c3911a3);
    }

    /* renamed from: h */
    private final void m12089h(boolean z10) {
        ObjectAnimator ofFloat;
        ImageView imageView = null;
        if (z10) {
            ImageView imageView2 = this.f12177b;
            if (imageView2 == null) {
                AbstractC5868k.m23686r("mArrowImg");
            } else {
                imageView = imageView2;
            }
            ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 180.0f);
        } else {
            ImageView imageView3 = this.f12177b;
            if (imageView3 == null) {
                AbstractC5868k.m23686r("mArrowImg");
            } else {
                imageView = imageView3;
            }
            ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 180.0f, 0.0f);
        }
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    /* renamed from: d */
    public final void m12090d(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "data");
        this.f12179d.clear();
        this.f12179d.addAll(arrayList);
        this.f12178c.m17023d(arrayList);
    }

    public final String getText() {
        CharSequence m27758b0;
        TextView textView = this.f12176a;
        if (textView == null) {
            AbstractC5868k.m23686r("mTextView");
            textView = null;
        }
        CharSequence text = textView.getText();
        AbstractC5868k.m23673e(text, "mTextView.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        return m27758b0.toString();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            setBackgroundResource(R$drawable.bg_pop_rounded_rectangle_red);
        } else {
            setBackgroundResource(R$drawable.bg_pop_rounded_rectangle_gray);
        }
        super.onFocusChanged(z10, i10, rect);
    }

    @Override // android.view.View
    public boolean performClick() {
        m12089h(true);
        setBackgroundResource(R$drawable.bg_pop_rounded_rectangle_gray);
        this.f12178c.showAsDropDown(this, AbstractC7786b.m30166j(-20), 0);
        return super.performClick();
    }

    public final void setText(String str) {
        AbstractC5868k.m23674f(str, "content");
        TextView textView = this.f12176a;
        if (textView == null) {
            AbstractC5868k.m23686r("mTextView");
            textView = null;
        }
        textView.setText(str);
    }
}
