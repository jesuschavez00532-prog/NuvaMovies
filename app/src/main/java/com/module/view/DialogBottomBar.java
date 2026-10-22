package com.module.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.module.R$color;
import com.module.R$drawable;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$mipmap;
import com.module.childlock.view.MarqueTextView;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class DialogBottomBar extends AutoRelativeLayout {

    /* renamed from: a */
    public Map f12163a;

    /* renamed from: com.module.view.DialogBottomBar$a */
    /* loaded from: classes2.dex */
    public enum EnumC2998a {
        SUCCESS,
        FAIL
    }

    /* renamed from: com.module.view.DialogBottomBar$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2999b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12167a;

        static {
            int[] iArr = new int[EnumC2998a.values().length];
            try {
                iArr[EnumC2998a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2998a.FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12167a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(attributeSet, "attrs");
        this.f12163a = new LinkedHashMap();
        m12077f();
    }

    /* renamed from: f */
    private final void m12077f() {
        LayoutInflater.from(getContext()).inflate(R$layout.layout_dialog_bottom_bar, (ViewGroup) this, true);
    }

    /* renamed from: d */
    public View m12078d(int i10) {
        Map map = this.f12163a;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public final void m12079e() {
        ((MarqueTextView) m12078d(R$id.mTextNotify)).setText("");
        setVisibility(8);
    }

    /* renamed from: g */
    public final void m12080g(String str, EnumC2998a enumC2998a) {
        AbstractC5868k.m23674f(str, "msg");
        AbstractC5868k.m23674f(enumC2998a, "type");
        setVisibility(0);
        int i10 = C2999b.f12167a[enumC2998a.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                ((AutoRelativeLayout) m12078d(R$id.mLayoutBottomBar)).setBackgroundResource(R$drawable.bg_notify_error);
                ((ImageView) m12078d(R$id.mImageNotify)).setImageResource(R$mipmap.icon_notify_error);
                ((MarqueTextView) m12078d(R$id.mTextNotify)).setTextColor(getResources().getColor(R$color.color_333333));
            }
        } else {
            ((AutoRelativeLayout) m12078d(R$id.mLayoutBottomBar)).setBackgroundResource(R$drawable.bg_notify_success);
            ((ImageView) m12078d(R$id.mImageNotify)).setImageResource(R$drawable.icon_notify_success);
            ((MarqueTextView) m12078d(R$id.mTextNotify)).setTextColor(getResources().getColor(R$color.color_ffffff));
        }
        ((MarqueTextView) m12078d(R$id.mTextNotify)).setText(str);
    }

    /* renamed from: h */
    public final void m12081h(String str, EnumC2998a enumC2998a) {
        AbstractC5868k.m23674f(str, "msg");
        AbstractC5868k.m23674f(enumC2998a, "type");
        setVisibility(0);
        int i10 = C2999b.f12167a[enumC2998a.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                ((AutoRelativeLayout) m12078d(R$id.mLayoutBottomBar)).setBackgroundResource(R$drawable.bg_notify_login);
                ((ImageView) m12078d(R$id.mImageNotify)).setImageResource(R$mipmap.icon_notify_error_login);
                ((MarqueTextView) m12078d(R$id.mTextNotify)).setTextColor(getResources().getColor(R$color.color_FF3737));
            }
        } else {
            ((AutoRelativeLayout) m12078d(R$id.mLayoutBottomBar)).setBackgroundResource(R$drawable.bg_notify_login);
            ((ImageView) m12078d(R$id.mImageNotify)).setImageResource(R$drawable.icon_notify_success_login);
            ((MarqueTextView) m12078d(R$id.mTextNotify)).setTextColor(getResources().getColor(R$color.color_ffffff));
        }
        ((MarqueTextView) m12078d(R$id.mTextNotify)).setText(str);
    }
}
