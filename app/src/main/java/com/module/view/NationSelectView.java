package com.module.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.module.R$color;
import com.module.R$drawable;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$mipmap;
import com.module.R$styleable;
import com.module.view.NationSelectView;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p102db.C4063o0;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class NationSelectView extends AutoLinearLayout implements View.OnClickListener, View.OnKeyListener, View.OnFocusChangeListener {

    /* renamed from: a */
    private View f12256a;

    /* renamed from: b */
    private TextView f12257b;

    /* renamed from: c */
    private ImageView f12258c;

    /* renamed from: d */
    private C4063o0 f12259d;

    /* renamed from: e */
    private InterfaceC3018b f12260e;

    /* renamed from: f */
    private View.OnClickListener f12261f;

    /* renamed from: g */
    private int f12262g;

    /* renamed from: h */
    private int f12263h;

    /* renamed from: i */
    public Map f12264i;

    /* renamed from: com.module.view.NationSelectView$a */
    /* loaded from: classes2.dex */
    public static final class C3017a implements C4063o0.a {
        C3017a() {
        }

        @Override // p102db.C4063o0.a
        /* renamed from: a */
        public void mo12229a(int i10, String str, String str2) {
            AbstractC5868k.m23674f(str, "nation");
            AbstractC5868k.m23674f(str2, "nationCode");
            TextView textView = NationSelectView.this.f12257b;
            if (textView != null) {
                textView.setText(str);
            }
            InterfaceC3018b interfaceC3018b = NationSelectView.this.f12260e;
            if (interfaceC3018b != null) {
                interfaceC3018b.mo12230a(i10, str, str2);
            }
            NationSelectView.this.getNationPopupWindow().dismiss();
        }
    }

    /* renamed from: com.module.view.NationSelectView$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3018b {
        /* renamed from: a */
        void mo12230a(int i10, String str, String str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NationSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(attributeSet, "attrs");
        this.f12264i = new LinkedHashMap();
        this.f12259d = new C4063o0(context);
        this.f12262g = 360;
        this.f12263h = 640;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        setOnFocusChangeListener(this);
        setOnClickListener(this);
        setOnKeyListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f11927F0);
        AbstractC5868k.m23673e(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NationSelectView)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == R$styleable.NationSelectView_popWidth) {
                this.f12262g = obtainStyledAttributes.getInt(index, 360);
            } else if (index == R$styleable.NationSelectView_popHeight) {
                this.f12263h = obtainStyledAttributes.getInt(index, 640);
            }
        }
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(R$layout.layout_nation_selecte_view, (ViewGroup) this, true);
        this.f12256a = inflate;
        AbstractC5868k.m23671c(inflate);
        View findViewById = inflate.findViewById(R$id.mTextNationName);
        AbstractC5868k.m23672d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f12257b = (TextView) findViewById;
        View view = this.f12256a;
        AbstractC5868k.m23671c(view);
        View findViewById2 = view.findViewById(R$id.mImageLine);
        AbstractC5868k.m23672d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f12258c = (ImageView) findViewById2;
        this.f12259d.m17092j(new C3017a());
        this.f12259d.setWidth(AbstractC7786b.m30166j(this.f12262g));
        this.f12259d.setHeight(AbstractC7786b.m30166j(this.f12263h));
        this.f12259d.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: db.p0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                NationSelectView.m12225b(NationSelectView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12225b(NationSelectView nationSelectView) {
        AbstractC5868k.m23674f(nationSelectView, "this$0");
        nationSelectView.m12228e(true);
    }

    /* renamed from: e */
    public final void m12228e(boolean z10) {
        if (z10) {
            setBackgroundResource(R$drawable.bg_dialog_rounded_rectangle_red);
            ImageView imageView = this.f12258c;
            if (imageView != null) {
                imageView.setImageResource(R$color.color_ffffff);
                return;
            }
            return;
        }
        setBackgroundResource(R$mipmap.bg_dialog_edit);
        ImageView imageView2 = this.f12258c;
        if (imageView2 != null) {
            imageView2.setImageResource(R$color.color_5c6066);
        }
    }

    public final C4063o0 getNationPopupWindow() {
        return this.f12259d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f12261f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this.f12259d.showAsDropDown(view, 0, 0);
        m12228e(false);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        m12228e(z10);
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.getAction() == 0 && i10 == 4) {
            this.f12259d.dismiss();
            return false;
        }
        return false;
    }

    public final void setNationName(String str) {
        AbstractC5868k.m23674f(str, "nation");
        TextView textView = this.f12257b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setNationPopupWindow(C4063o0 c4063o0) {
        AbstractC5868k.m23674f(c4063o0, "<set-?>");
        this.f12259d = c4063o0;
    }

    public final void setOnClickCallback(View.OnClickListener onClickListener) {
        AbstractC5868k.m23674f(onClickListener, "listener");
        this.f12261f = onClickListener;
    }

    public final void setOnItemClickListener(InterfaceC3018b interfaceC3018b) {
        AbstractC5868k.m23674f(interfaceC3018b, "listener");
        this.f12260e = interfaceC3018b;
    }
}
