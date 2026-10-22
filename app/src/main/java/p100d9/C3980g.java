package p100d9;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import cc.C1464l0;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.request.result.CouponCodeList;
import java.text.DecimalFormat;
import java.util.Map;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p433zd.AbstractC7786b;

/* renamed from: d9.g */
/* loaded from: classes2.dex */
public final class C3980g extends AbstractC7527b {

    /* renamed from: e */
    private int f17698e;

    public C3980g() {
        super(R$layout.item_coupon_already_get, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m16846s(View view, boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m16847t(C3980g c3980g, C7531f c7531f, View view) {
        AbstractC5868k.m23674f(c3980g, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        c3980g.m16851v(c7531f.getAdapterPosition());
    }

    /* renamed from: u */
    private final String m16848u(float f10) {
        String format = new DecimalFormat("0.00").format(f10);
        AbstractC5868k.m23673e(format, "format.format(number.toDouble())");
        return format;
    }

    /* renamed from: w */
    private final void m16849w(TextView textView, CouponCodeList couponCodeList) {
        float f10;
        Float f11;
        String couponCurrency = couponCodeList.getCouponCurrency();
        if (couponCurrency == null) {
            couponCurrency = "";
        }
        Map<String, Float> couponAmount = couponCodeList.getCouponAmount();
        if (couponAmount != null && (f11 = couponAmount.get(couponCurrency)) != null) {
            f10 = f11.floatValue();
        } else {
            f10 = 0.0f;
        }
        String m16848u = m16848u(f10);
        String str = m16848u + couponCurrency;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(AbstractC7786b.m30166j(24)), m16848u.length(), str.length(), 34);
        textView.setText(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, CouponCodeList couponCodeList) {
        String string;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(couponCodeList, "bean");
        if (AbstractC5868k.m23669a(couponCodeList.getStatus(), MessageService.MSG_DB_READY_REPORT)) {
            c7531f.itemView.setSelected(true);
        }
        m16849w((TextView) c7531f.m28863b(R$id.tvPrice), couponCodeList);
        if (equals(couponCodeList.getCouponEffectType()) && !TextUtils.isEmpty(couponCodeList.getEffectTime())) {
            C1464l0 c1464l0 = C1464l0.f5622a;
            String effectTime = couponCodeList.getEffectTime();
            if (effectTime == null) {
                effectTime = "";
            }
            string = c1464l0.m6826e(effectTime, "dd-MM-yyyy") + " to " + c1464l0.m6826e(couponCodeList.getInvalidTime(), "dd-MM-yyyy") + "(" + m28850h().getString(R$string.date_format) + ")";
        } else {
            string = m28850h().getString(R$string.benefits_valid_until, C1464l0.f5622a.m6826e(couponCodeList.getInvalidTime(), "dd-MM-yyyy"));
            AbstractC5868k.m23673e(string, "{\n            mContext.g…,\"dd-MM-yyyy\"))\n        }");
        }
        String string2 = m28850h().getString(R$string.coupons_use_on, couponCodeList.getPackageLabel(), couponCodeList.getPackageName());
        AbstractC5868k.m23673e(string2, "mContext.getString(R.str…eLabel, bean.packageName)");
        c7531f.m28865d(R$id.tvCouponsTitle, couponCodeList.getCouponTitle()).m28865d(R$id.tvDate, string).m28865d(R$id.tvUseOn, string2);
        ((View) c7531f.m28863b(R$id.mLlCoupon)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C3980g.m16846s(view, z10);
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: d9.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3980g.m16847t(C3980g.this, c7531f, view);
            }
        });
    }

    /* renamed from: v */
    public final void m16851v(int i10) {
        this.f17698e = i10;
        notifyDataSetChanged();
    }
}
