package com.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.live.R$color;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.lzy.okgo.cookie.SerializableCookie;
import com.umeng.analytics.pro.C3384f;
import com.zhy.autolayout.AutoFrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p317rb.AbstractC6567a;
import p400xa.C7594o0;
import p433zd.AbstractC7786b;

/* renamed from: com.live.view.f */
/* loaded from: classes2.dex */
public final class C2878f extends AutoFrameLayout {

    /* renamed from: d */
    private static final int f10939d = 0;

    /* renamed from: a */
    private int f10941a;

    /* renamed from: b */
    public Map f10942b;

    /* renamed from: c */
    public static final a f10938c = new a(null);

    /* renamed from: e */
    private static final int f10940e = 1;

    /* renamed from: com.live.view.f$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final int m11617a() {
            return C2878f.f10940e;
        }

        /* renamed from: b */
        public final int m11618b() {
            return C2878f.f10939d;
        }
    }

    public C2878f(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public View m11615a(int i10) {
        Map map = this.f10942b;
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

    /* renamed from: h */
    public final void m11616h(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "no");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        int i10 = this.f10941a;
        if (i10 == f10939d) {
            int i11 = R$id.mPlayerNo;
            ((TextView) m11615a(i11)).setTextColor(getResources().getColor(R$color.color_font_main));
            ((TextView) m11615a(i11)).setBackgroundResource(R$drawable.bg_visit_player_no);
        } else if (i10 == f10940e) {
            int i12 = R$id.mPlayerNo;
            ((TextView) m11615a(i12)).setTextColor(getResources().getColor(R$color.color_1a1a1a));
            ((TextView) m11615a(i12)).setBackgroundResource(R$drawable.bg_home_player_no);
        }
        ((TextView) m11615a(R$id.mPlayerNo)).setText(str);
        ((TextView) m11615a(R$id.mPlayerName)).setText(str2);
        if (AbstractC6567a.m25634d(str3)) {
            ((ImageView) m11615a(R$id.mIvPlayer)).setImageResource(R$drawable.ic_line_up_player_default);
            return;
        }
        C7594o0 c7594o0 = C7594o0.f27942a;
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        AbstractC5868k.m23671c(str3);
        ImageView imageView = (ImageView) m11615a(R$id.mIvPlayer);
        AbstractC5868k.m23673e(imageView, "mIvPlayer");
        c7594o0.m29225x(context, str3, imageView, Integer.valueOf(R$drawable.ic_line_up_player_default), Integer.valueOf(AbstractC7786b.m30166j(40)));
    }

    public final void setTeamType(int i10) {
        this.f10941a = i10;
    }

    public C2878f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2878f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10942b = new LinkedHashMap();
        this.f10941a = f10939d;
        setClipToPadding(false);
        setClipChildren(false);
        LayoutInflater.from(context).inflate(R$layout.layout_line_up_player, this);
    }
}
