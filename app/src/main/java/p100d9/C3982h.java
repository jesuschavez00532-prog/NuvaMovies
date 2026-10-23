package p100d9;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.request.result.AvailableCouponCodeList;
import java.text.DecimalFormat;
import java.util.Map;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p433zd.AbstractC7786b;

/* renamed from: d9.h */
/* loaded from: classes2.dex */
public final class C3982h extends AbstractC7527b {
    public C3982h() {
        super(R$layout.item_coupons_available, null, 2, null);
    }

    /* renamed from: q */
    private final String m16869q(float f10) {
        String format = new DecimalFormat("0.00").format(f10);
        AbstractC5868k.m23673e(format, "format.format(number.toDouble())");
        return format;
    }

    /* renamed from: r */
    private final void m16870r(TextView textView, AvailableCouponCodeList availableCouponCodeList) {
        float f10 = 0.0f;
        Float f11;
        String couponCurrency = availableCouponCodeList.getCouponCurrency();
        if (couponCurrency == null) {
            couponCurrency = "";
        }
        Map<String, Float> couponAmount = availableCouponCodeList.getCouponAmount();
        if (couponAmount != null && (f11 = couponAmount.get(couponCurrency)) != null) {
            f10 = f11.floatValue();
        } else {
            f10 = 0.0f;
        }
        String m16869q = m16869q(f10);
        String str = m16869q + couponCurrency;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(AbstractC7786b.m30166j(24)), m16869q.length(), str.length(), 34);
        textView.setText(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo5338e(C7531f c7531f, AvailableCouponCodeList availableCouponCodeList) {
        AbstractC5868k.m23674f(c7531f, "helper");
        AbstractC5868k.m23674f(availableCouponCodeList, "item");
        m16870r((TextView) c7531f.m28863b(R$id.tvPrice), availableCouponCodeList);
        String string = m28850h().getString(R$string.coupons_use_on, availableCouponCodeList.getPackageLabel(), availableCouponCodeList.getPackageName());
        AbstractC5868k.m23673e(string, "mContext.getString(R.str…eLabel, item.packageName)");
        c7531f.m28865d(R$id.tvCouponsTitle, availableCouponCodeList.getCouponTitle()).m28865d(R$id.tvUseOn, string);
    }
}
