package p100d9;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.mine.R$id;
import com.mine.R$layout;
import com.request.result.CouponCodeList;
import java.text.DecimalFormat;
import java.util.Map;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;
import p433zd.AbstractC7786b;

/* renamed from: d9.d */
/* loaded from: classes2.dex */
public final class C3974d extends AbstractC7527b {

    /* renamed from: e */
    private final C7554b f17685e;

    /* renamed from: f */
    private InterfaceC5664p f17686f;

    /* renamed from: g */
    private int f17687g;

    public C3974d() {
        super(R$layout.item_coupon_list, null, 2, null);
        this.f17685e = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m16836t(C3974d c3974d, CouponCodeList couponCodeList, C7531f c7531f, View view, boolean z10) {
        AbstractC5868k.m23674f(c3974d, "this$0");
        AbstractC5868k.m23674f(couponCodeList, "$bean");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (z10) {
            C7554b c7554b = c3974d.f17685e;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.01f);
            if (AbstractC5868k.m23669a(couponCodeList.getStatus(), MessageService.MSG_DB_READY_REPORT)) {
                c7531f.m28867f(R$id.tvGoPurchase, true);
                return;
            }
            return;
        }
        C7554b c7554b2 = c3974d.f17685e;
        AbstractC5868k.m23673e(view, "v");
        c7554b2.m28945f(view, 1.01f);
        c7531f.m28867f(R$id.tvGoPurchase, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m16837u(C7531f c7531f, C3974d c3974d, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c3974d, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 20 && c7531f.getAdapterPosition() == c3974d.m28849g().size() - 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m16838v(C3974d c3974d, C7531f c7531f, CouponCodeList couponCodeList, View view) {
        AbstractC5868k.m23674f(c3974d, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(couponCodeList, "$bean");
        c3974d.m16843y(c7531f.getAdapterPosition());
        InterfaceC5664p interfaceC5664p = c3974d.f17686f;
        if (interfaceC5664p != null) {
            interfaceC5664p.mo2391h(Integer.valueOf(c3974d.f17687g), couponCodeList);
        }
    }

    /* renamed from: w */
    private final String m16839w(float f10) {
        String format = new DecimalFormat("0.00").format(f10);
        AbstractC5868k.m23673e(format, "format.format(number.toDouble())");
        return format;
    }

    /* renamed from: z */
    private final void m16840z(TextView textView, CouponCodeList couponCodeList) {
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
        String m16839w = m16839w(f10);
        String str = m16839w + couponCurrency;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(AbstractC7786b.m30166j(29)), m16839w.length(), str.length(), 34);
        textView.setText(spannableStringBuilder);
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r0.equals("1") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r0.equals("2") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        r0 = com.mine.R$id.ivState;
        r9.m28867f(r0, true);
        r0 = (android.widget.ImageView) r9.m28863b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if ("1".equals(r10.getStatus()) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        r1 = com.mine.R$drawable.icon_coupons_used;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        r0.setImageResource(r1);
        r9.itemView.setSelected(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r1 = com.mine.R$drawable.icon_coupons_expired;
     */
    @Override // p399x9.AbstractC7527b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5338e(final p399x9.C7531f r9, final com.request.result.CouponCodeList r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p100d9.C3974d.mo5338e(x9.f, com.request.result.CouponCodeList):void");
    }

    /* renamed from: x */
    public final void m16842x(InterfaceC5664p interfaceC5664p) {
        this.f17686f = interfaceC5664p;
    }

    /* renamed from: y */
    public final void m16843y(int i10) {
        this.f17687g = i10;
        notifyDataSetChanged();
    }
}
