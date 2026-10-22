package p258o3;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import anet.channel.entity.EventType;
import com.module.R$string;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import ne.AbstractC5868k;
import ne.C5881x;
import p287pb.AbstractApplicationC6253c;

/* renamed from: o3.i */
/* loaded from: classes.dex */
public final class C5913i {

    /* renamed from: a */
    public static final C5913i f23534a = new C5913i();

    private C5913i() {
    }

    /* renamed from: a */
    public static final float m23912a(float f10) {
        return TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: b */
    public static final String m23913b(long j10) {
        String[] strArr = {"B", "KB", "MB", "GB", "TB", "PB"};
        double d10 = j10;
        int i10 = 0;
        while (d10 > 900.0d && i10 < 5) {
            i10++;
            double d11 = EventType.AUTH_FAIL;
            Double.isNaN(d11);
            d10 /= d11;
        }
        String format = new DecimalFormat("#####0.0").format(d10);
        C5881x c5881x = C5881x.f23415a;
        String format2 = String.format(Locale.getDefault(), "%s %s", Arrays.copyOf(new Object[]{format, strArr[i10]}, 2));
        AbstractC5868k.m23673e(format2, "format(locale, format, *args)");
        return format2;
    }

    /* renamed from: d */
    public static final void m23914d(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    /* renamed from: c */
    public final String m23915c(String str) {
        AbstractC5868k.m23674f(str, "language");
        Context m24887a = AbstractApplicationC6253c.f24484b.m24887a();
        if (AbstractC5868k.m23669a(str, "zh")) {
            String string = m24887a.getString(R$string.language_zh);
            AbstractC5868k.m23673e(string, "mContext.getString(com.m…ule.R.string.language_zh)");
            return string;
        }
        if (AbstractC5868k.m23669a(str, "zh_HK")) {
            String string2 = m24887a.getString(R$string.language_zh_HK);
            AbstractC5868k.m23673e(string2, "mContext.getString(com.m….R.string.language_zh_HK)");
            return string2;
        }
        if (AbstractC5868k.m23669a(str, "en")) {
            String string3 = m24887a.getString(R$string.language_en);
            AbstractC5868k.m23673e(string3, "mContext.getString(com.m…ule.R.string.language_en)");
            return string3;
        }
        if (AbstractC5868k.m23669a(str, "es")) {
            String string4 = m24887a.getString(R$string.language_es);
            AbstractC5868k.m23673e(string4, "mContext.getString(com.m…ule.R.string.language_es)");
            return string4;
        }
        if (AbstractC5868k.m23669a(str, "hi")) {
            String string5 = m24887a.getString(R$string.language_hi);
            AbstractC5868k.m23673e(string5, "mContext.getString(com.m…ule.R.string.language_hi)");
            return string5;
        }
        if (AbstractC5868k.m23669a(str, "pt")) {
            String string6 = m24887a.getString(R$string.language_pt);
            AbstractC5868k.m23673e(string6, "mContext.getString(com.m…ule.R.string.language_pt)");
            return string6;
        }
        if (AbstractC5868k.m23669a(str, "ms")) {
            String string7 = m24887a.getString(R$string.language_ms);
            AbstractC5868k.m23673e(string7, "mContext.getString(com.m…ule.R.string.language_ms)");
            return string7;
        }
        if (AbstractC5868k.m23669a(str, "fr")) {
            String string8 = m24887a.getString(R$string.language_fr);
            AbstractC5868k.m23673e(string8, "mContext.getString(com.m…ule.R.string.language_fr)");
            return string8;
        }
        if (AbstractC5868k.m23669a(str, "chi")) {
            String string9 = m24887a.getString(R$string.audio_zh);
            AbstractC5868k.m23673e(string9, "mContext.getString(com.module.R.string.audio_zh)");
            return string9;
        }
        if (AbstractC5868k.m23669a(str, "por")) {
            String string10 = m24887a.getString(R$string.language_pt);
            AbstractC5868k.m23673e(string10, "mContext.getString(com.m…ule.R.string.language_pt)");
            return string10;
        }
        if (AbstractC5868k.m23669a(str, "eng")) {
            String string11 = m24887a.getString(R$string.language_en);
            AbstractC5868k.m23673e(string11, "mContext.getString(com.m…ule.R.string.language_en)");
            return string11;
        }
        if (AbstractC5868k.m23669a(str, "spa")) {
            String string12 = m24887a.getString(R$string.language_es);
            AbstractC5868k.m23673e(string12, "mContext.getString(com.m…ule.R.string.language_es)");
            return string12;
        }
        if (AbstractC5868k.m23669a(str, "fre")) {
            String string13 = m24887a.getString(R$string.language_fr);
            AbstractC5868k.m23673e(string13, "mContext.getString(com.m…ule.R.string.language_fr)");
            return string13;
        }
        if (AbstractC5868k.m23669a(str, "ara")) {
            String string14 = m24887a.getString(R$string.audio_ara);
            AbstractC5868k.m23673e(string14, "mContext.getString(com.module.R.string.audio_ara)");
            return string14;
        }
        if (AbstractC5868k.m23669a(str, "ita")) {
            String string15 = m24887a.getString(R$string.audio_ita);
            AbstractC5868k.m23673e(string15, "mContext.getString(com.module.R.string.audio_ita)");
            return string15;
        }
        if (AbstractC5868k.m23669a(str, "dut")) {
            String string16 = m24887a.getString(R$string.audio_dut);
            AbstractC5868k.m23673e(string16, "mContext.getString(com.module.R.string.audio_dut)");
            return string16;
        }
        if (AbstractC5868k.m23669a(str, "ger")) {
            String string17 = m24887a.getString(R$string.audio_ger);
            AbstractC5868k.m23673e(string17, "mContext.getString(com.module.R.string.audio_ger)");
            return string17;
        }
        if (AbstractC5868k.m23669a(str, "heb")) {
            String string18 = m24887a.getString(R$string.audio_heb);
            AbstractC5868k.m23673e(string18, "mContext.getString(com.module.R.string.audio_heb)");
            return string18;
        }
        if (AbstractC5868k.m23669a(str, "jpn")) {
            String string19 = m24887a.getString(R$string.audio_jpn);
            AbstractC5868k.m23673e(string19, "mContext.getString(com.module.R.string.audio_jpn)");
            return string19;
        }
        int i10 = R$string.language_null;
        if (AbstractC5868k.m23669a(str, m24887a.getString(i10))) {
            String string20 = m24887a.getString(i10);
            AbstractC5868k.m23673e(string20, "mContext.getString(com.m…e.R.string.language_null)");
            return string20;
        }
        String string21 = m24887a.getString(R$string.audio_default);
        AbstractC5868k.m23673e(string21, "{\n                mConte…io_default)\n            }");
        return string21;
    }
}
