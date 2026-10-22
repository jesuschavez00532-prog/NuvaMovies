package p100d9;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.request.result.ExchangeOrderInfo;
import com.request.result.OrderInfo;
import com.titans.entity.CdnType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p201k2.AbstractC5091h;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;

/* renamed from: d9.z */
/* loaded from: classes2.dex */
public final class C4014z extends AbstractC7527b {

    /* renamed from: e */
    private final String f17789e;

    /* renamed from: f */
    private final String f17790f;

    /* renamed from: g */
    private C7554b f17791g;

    /* renamed from: h */
    private InterfaceC5660l f17792h;

    public C4014z() {
        super(R$layout.item_order_history_list, null, 2, null);
        this.f17789e = "MM-dd-yyyy HH:mm:SS";
        this.f17790f = "dd-MM-yyyy HH:mm:SS";
        this.f17791g = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m16956r(C4014z c4014z, C7531f c7531f, View view, boolean z10) {
        AbstractC5868k.m23674f(c4014z, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (z10) {
            C7554b c7554b = c4014z.f17791g;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.04f);
        } else {
            C7554b c7554b2 = c4014z.f17791g;
            AbstractC5868k.m23673e(view, "v");
            c7554b2.m28945f(view, 1.04f);
        }
        if (c7531f.getBindingAdapterPosition() == 0 && z10) {
            InterfaceC5660l interfaceC5660l = c4014z.f17792h;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Boolean.TRUE);
                return;
            }
            return;
        }
        InterfaceC5660l interfaceC5660l2 = c4014z.f17792h;
        if (interfaceC5660l2 != null) {
            interfaceC5660l2.mo542f(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final boolean m16957s(C7531f c7531f, C4014z c4014z, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c4014z, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 20 && c7531f.getBindingAdapterPosition() == c4014z.m28849g().size() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private final String m16958t() {
        if (AbstractC5091h.m20663f()) {
            return this.f17790f;
        }
        return this.f17789e;
    }

    /* renamed from: u */
    private final String m16959u(String str) {
        switch (str.hashCode()) {
            case 66044:
                if (str.equals("BRL")) {
                    return "R$";
                }
                return str;
            case 69026:
                if (str.equals("EUR")) {
                    return "€";
                }
                return str;
            case 70357:
                if (str.equals("GBP")) {
                    return "￡";
                }
                return str;
            case 73683:
                if (str.equals("JPY")) {
                    return "J￥";
                }
                return str;
            case 84326:
                if (str.equals("USD")) {
                    return "$";
                }
                return str;
            default:
                return str;
        }
    }

    @Override // p399x9.AbstractC7527b
    /* renamed from: e */
    protected void mo5338e(final C7531f c7531f, Object obj) {
        String str;
        String str2;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(obj, "bean");
        String str3 = null;
        if (obj instanceof OrderInfo) {
            OrderInfo orderInfo = (OrderInfo) obj;
            C7531f m28865d = c7531f.m28865d(R$id.mTextPackageName, orderInfo.getPackagePlanName() + "(" + orderInfo.getAuthorizedDays() + ")").m28865d(R$id.mTextOrderNumber, orderInfo.getTransactionId());
            int i10 = R$id.mTextPrice;
            C7531f m28867f = m28865d.m28865d(i10, orderInfo.getAmountLocal()).m28867f(i10, true);
            int i11 = R$id.mTextPriceType;
            m28867f.m28867f(i11, true);
            if (orderInfo.getAmountLocal() != null && orderInfo.getCurrencyLocal() != null) {
                String currencyLocal = orderInfo.getCurrencyLocal();
                AbstractC5868k.m23671c(currencyLocal);
                c7531f.m28865d(i11, m16959u(currencyLocal));
            }
            if (orderInfo.getAmountLocal() == null && orderInfo.getCurrencyLocal() == null) {
                c7531f.m28865d(i10, orderInfo.getPaymentAmount()).m28865d(i11, m16959u(orderInfo.getPaymentCurrency()));
            }
            c7531f.m28865d(R$id.mTextPurchaseTime, m16961w(orderInfo.getCreateTime(), m16958t()));
            int i12 = R$string.order_history_unpaid;
            if (!orderInfo.getState().equals(MessageService.MSG_DB_READY_REPORT)) {
                if (!orderInfo.getState().equals("1") && !orderInfo.getState().equals("2")) {
                    if (orderInfo.getState().equals("4")) {
                        i12 = R$string.order_history_refunded;
                    } else if (orderInfo.getState().equals("3") || orderInfo.getState().equals(CdnType.DIGITAL_TYPE_PCDN)) {
                        i12 = R$string.order_history_trading_close;
                    }
                } else {
                    i12 = R$string.order_history_paid;
                }
            }
            int i13 = R$id.mTextStatus;
            Context m28850h = m28850h();
            if (m28850h != null) {
                str3 = m28850h.getString(i12);
            }
            c7531f.m28865d(i13, str3);
        } else if (obj instanceof ExchangeOrderInfo) {
            ExchangeOrderInfo exchangeOrderInfo = (ExchangeOrderInfo) obj;
            C7531f m28865d2 = c7531f.m28865d(R$id.mTextPackageName, exchangeOrderInfo.getProductName()).m28865d(R$id.mTextPurchaseTime, m16961w(exchangeOrderInfo.getUsingTime(), m16958t()));
            int i14 = R$id.mTextPurchaseTimeTitle;
            Context m28850h2 = m28850h();
            if (m28850h2 != null) {
                str = m28850h2.getString(R$string.order_history_use_time);
            } else {
                str = null;
            }
            C7531f m28865d3 = m28865d2.m28865d(i14, str);
            int i15 = R$id.mTextOrderNumberTitle;
            Context m28850h3 = m28850h();
            if (m28850h3 != null) {
                str2 = m28850h3.getString(R$string.order_history_active_code);
            } else {
                str2 = null;
            }
            C7531f m28865d4 = m28865d3.m28865d(i15, str2).m28865d(R$id.mTextOrderNumber, exchangeOrderInfo.getExchangeCode());
            int i16 = R$id.mTextStatus;
            Context m28850h4 = m28850h();
            if (m28850h4 != null) {
                str3 = m28850h4.getString(R$string.order_history_exchange_success);
            }
            m28865d4.m28865d(i16, str3).m28867f(R$id.mImgStatus, false).m28867f(R$id.mTextPrice, false).m28867f(R$id.mTextPriceType, false);
        }
        c7531f.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.x
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C4014z.m16956r(C4014z.this, c7531f, view, z10);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: d9.y
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i17, KeyEvent keyEvent) {
                boolean m16957s;
                m16957s = C4014z.m16957s(C7531f.this, this, view, i17, keyEvent);
                return m16957s;
            }
        });
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* renamed from: v */
    public final void m16960v(InterfaceC5660l interfaceC5660l) {
        this.f17792h = interfaceC5660l;
    }

    /* renamed from: w */
    public final String m16961w(String str, String str2) {
        AbstractC5868k.m23674f(str, "utcTime");
        AbstractC5868k.m23674f(str2, "localPattern");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date parse = simpleDateFormat.parse(str);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2);
            simpleDateFormat2.setTimeZone(TimeZone.getDefault());
            String format = simpleDateFormat2.format(Long.valueOf(parse.getTime()));
            AbstractC5868k.m23673e(format, "localFormat.format(utcDate.time)");
            return format;
        } catch (ParseException e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
