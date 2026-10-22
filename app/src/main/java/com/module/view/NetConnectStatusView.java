package com.module.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.module.R$drawable;
import com.module.R$mipmap;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class NetConnectStatusView extends AutoLinearLayout {

    /* renamed from: a */
    private final InterfaceC1312h f12266a;

    /* renamed from: b */
    private final InterfaceC1312h f12267b;

    /* renamed from: c */
    private final InterfaceC1312h f12268c;

    /* renamed from: d */
    public Map f12269d = new LinkedHashMap();

    /* renamed from: com.module.view.NetConnectStatusView$a */
    /* loaded from: classes2.dex */
    public enum EnumC3019a {
        Default,
        Checking,
        Connected,
        Error
    }

    /* renamed from: com.module.view.NetConnectStatusView$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C3020b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12275a;

        static {
            int[] iArr = new int[EnumC3019a.values().length];
            try {
                iArr[EnumC3019a.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3019a.Checking.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3019a.Connected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3019a.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12275a = iArr;
        }
    }

    public NetConnectStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        m5965b = AbstractC1314j.m5965b(new C3038f(this));
        this.f12266a = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new C3037e(this));
        this.f12267b = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new C3036d(this));
        this.f12268c = m5965b3;
        setOrientation(1);
        setGravity(1);
        getMTvDelay().setTextColor(-1);
        getMTvDelay().setTextSize(0, AbstractC7786b.m30163g(28));
        getMTvDelay().setBackgroundResource(R$drawable.bg_net_check_delay);
        getMTvDelay().setPadding(AbstractC7786b.m30166j(16), 0, AbstractC7786b.m30166j(16), 0);
        getMTvDelay().setGravity(17);
        getMTvDelay().setVisibility(8);
        addView(getMTvDelay(), new AutoLinearLayout.C3911a(-2, AbstractC7786b.m30163g(48)));
        getMIvError().setImageResource(R$mipmap.ic_net_check_error);
        ViewGroup.LayoutParams c3911a = new AutoLinearLayout.C3911a(AbstractC7786b.m30166j(48), AbstractC7786b.m30163g(48));
        getMIvError().setVisibility(8);
        addView(getMIvError(), c3911a);
        getMIvConnect().setBackgroundResource(R$mipmap.ic_connecting_default);
        AutoLinearLayout.C3911a c3911a2 = new AutoLinearLayout.C3911a(AbstractC7786b.m30166j(156), AbstractC7786b.m30163g(6));
        ((LinearLayout.LayoutParams) c3911a2).topMargin = AbstractC7786b.m30163g(23);
        addView(getMIvConnect(), c3911a2);
    }

    private final ImageView getMIvConnect() {
        return (ImageView) this.f12268c.getValue();
    }

    private final ImageView getMIvError() {
        return (ImageView) this.f12267b.getValue();
    }

    private final TextView getMTvDelay() {
        return (TextView) this.f12266a.getValue();
    }

    /* renamed from: a */
    public final void m12231a(EnumC3019a enumC3019a, long j10) {
        StringBuilder sb2;
        AbstractC5868k.m23674f(enumC3019a, "state");
        int i10 = C3020b.f12275a[enumC3019a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        getMTvDelay().setVisibility(8);
                        getMIvError().setVisibility(0);
                        if (getMIvConnect().getBackground() instanceof AnimationDrawable) {
                            Drawable background = getMIvConnect().getBackground();
                            AbstractC5868k.m23672d(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                            ((AnimationDrawable) background).stop();
                        }
                        getMIvConnect().setBackgroundResource(R$mipmap.ic_connecting_default);
                        return;
                    }
                    return;
                }
                getMTvDelay().setVisibility(0);
                getMIvError().setVisibility(8);
                TextView mTvDelay = getMTvDelay();
                if (j10 >= 1000) {
                    sb2 = new StringBuilder();
                    sb2.append(j10 / 1000);
                    sb2.append('s');
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(j10);
                    sb2.append("ms");
                }
                mTvDelay.setText(sb2.toString());
                if (getMIvConnect().getBackground() instanceof AnimationDrawable) {
                    Drawable background2 = getMIvConnect().getBackground();
                    AbstractC5868k.m23672d(background2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    ((AnimationDrawable) background2).stop();
                }
                getMIvConnect().setBackgroundResource(R$mipmap.ic_connecting_default);
                return;
            }
            getMTvDelay().setVisibility(8);
            getMIvError().setVisibility(8);
            getMIvConnect().setBackgroundResource(R$drawable.connecting);
            if (getMIvConnect().getBackground() instanceof AnimationDrawable) {
                Drawable background3 = getMIvConnect().getBackground();
                AbstractC5868k.m23672d(background3, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                ((AnimationDrawable) background3).start();
                return;
            }
            return;
        }
        getMTvDelay().setVisibility(8);
        getMIvError().setVisibility(8);
        getMTvDelay().setText("");
        if (getMIvConnect().getBackground() instanceof AnimationDrawable) {
            Drawable background4 = getMIvConnect().getBackground();
            AbstractC5868k.m23672d(background4, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((AnimationDrawable) background4).stop();
        }
        getMIvConnect().setBackgroundResource(R$mipmap.ic_connecting_default);
    }
}
