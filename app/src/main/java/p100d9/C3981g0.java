package p100d9;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.result.CouponCodeList;
import com.request.result.PackageInfo;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1500l;
import p132fa.C4297a;
import p317rb.AbstractC6567a;
import p399x9.AbstractC7527b;
import p399x9.C7531f;
import p400xa.C7554b;

/* renamed from: d9.g0 */
/* loaded from: classes2.dex */
public final class C3981g0 extends AbstractC7527b {

    /* renamed from: e */
    private final InterfaceC1312h f17699e;

    /* renamed from: f */
    private InterfaceC5660l f17700f;

    /* renamed from: g */
    private int f17701g;

    /* renamed from: h */
    private final C7554b f17702h;

    /* renamed from: d9.g0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f17703a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NumberFormat invoke() {
            NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.ENGLISH);
            numberInstance.setMaximumFractionDigits(2);
            return numberInstance;
        }
    }

    public C3981g0() {
        super(R$layout.item_package_purchase_list, null, 2, null);
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f17703a);
        this.f17699e = m5965b;
        this.f17702h = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m16852A(C3981g0 c3981g0, C7531f c7531f, PackageInfo packageInfo, View view) {
        AbstractC5868k.m23674f(c3981g0, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(packageInfo, "$bean");
        c3981g0.m16866E(c7531f.getAdapterPosition());
        InterfaceC5660l interfaceC5660l = c3981g0.f17700f;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(packageInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final boolean m16853B(C7531f c7531f, C3981g0 c3981g0, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c3981g0, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 20 && c7531f.getAdapterPosition() == c3981g0.m28849g().size() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private final String m16854C(double d10) {
        String format = new DecimalFormat("0.00").format(d10);
        AbstractC5868k.m23673e(format, "format.format(number)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m16861w(C7531f c7531f, C3981g0 c3981g0, PackageInfo packageInfo, View view, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c3981g0, "this$0");
        AbstractC5868k.m23674f(packageInfo, "$bean");
        if (z10) {
            c7531f.itemView.setSelected(true);
            C7554b c7554b = c3981g0.f17702h;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.03f);
            InterfaceC5660l interfaceC5660l = c3981g0.f17700f;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(packageInfo);
                return;
            }
            return;
        }
        c7531f.itemView.setSelected(false);
        C7554b c7554b2 = c3981g0.f17702h;
        AbstractC5868k.m23673e(view, "v");
        c7554b2.m28945f(view, 1.03f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m16862x(C7531f c7531f, C3981g0 c3981g0, PackageInfo packageInfo, View view, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c3981g0, "this$0");
        AbstractC5868k.m23674f(packageInfo, "$bean");
        if (z10) {
            c7531f.itemView.setSelected(true);
            C7554b c7554b = c3981g0.f17702h;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.03f);
            InterfaceC5660l interfaceC5660l = c3981g0.f17700f;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(packageInfo);
                return;
            }
            return;
        }
        c7531f.itemView.setSelected(false);
        C7554b c7554b2 = c3981g0.f17702h;
        AbstractC5868k.m23673e(view, "v");
        c7554b2.m28945f(view, 1.03f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m16863y(C7531f c7531f, C3981g0 c3981g0, PackageInfo packageInfo, View view, boolean z10) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c3981g0, "this$0");
        AbstractC5868k.m23674f(packageInfo, "$bean");
        if (z10) {
            c7531f.itemView.setSelected(true);
            C7554b c7554b = c3981g0.f17702h;
            AbstractC5868k.m23673e(view, "v");
            c7554b.m28943c(view, 1.03f);
            InterfaceC5660l interfaceC5660l = c3981g0.f17700f;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(packageInfo);
                return;
            }
            return;
        }
        c7531f.itemView.setSelected(false);
        C7554b c7554b2 = c3981g0.f17702h;
        AbstractC5868k.m23673e(view, "v");
        c7554b2.m28945f(view, 1.03f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m16864z(C3981g0 c3981g0, PackageInfo packageInfo, C7531f c7531f, View view, boolean z10) {
        AbstractC5868k.m23674f(c3981g0, "this$0");
        AbstractC5868k.m23674f(packageInfo, "$bean");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (z10) {
            InterfaceC5660l interfaceC5660l = c3981g0.f17700f;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(packageInfo);
            }
            c7531f.itemView.setSelected(true);
            return;
        }
        c7531f.itemView.setSelected(false);
    }

    /* renamed from: D */
    public final void m16865D(InterfaceC5660l interfaceC5660l) {
        this.f17700f = interfaceC5660l;
    }

    /* renamed from: E */
    public final void m16866E(int i10) {
        this.f17701g = i10;
        notifyDataSetChanged();
    }

    @Override // p399x9.AbstractC7527b, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, final PackageInfo packageInfo) {
        Collection m6985d;
        String m16854C;
        double d10 = 0.0;
        boolean z10;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(packageInfo, "bean");
        C4297a c4297a = C4297a.f18620a;
        boolean z11 = true;
        if (AbstractC6567a.m25638h(c4297a.m17984a())) {
            HashMap hashMap = new HashMap();
            List m17984a = c4297a.m17984a();
            if (m17984a == null) {
                m6985d = AbstractC1500l.m6985d();
            } else {
                m6985d = new ArrayList();
                for (Object obj : m17984a) {
                    if (AbstractC5868k.m23669a(((CouponCodeList) obj).getStatus(), MessageService.MSG_DB_READY_REPORT)) {
                        m6985d.add(obj);
                    }
                }
            }
            if (m6985d != null) {
                int i10 = 0;
                for (Object obj2 : m6985d) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC1500l.m6991j();
                    }
                    CouponCodeList couponCodeList = (CouponCodeList) obj2;
                    if (!hashMap.containsKey(couponCodeList.getPackageCode())) {
                        Float f10 = couponCodeList.getCouponAmount().get(packageInfo.getCurrency());
                        if (f10 != null) {
                        }
                    } else {
                        Set entrySet = hashMap.entrySet();
                        AbstractC5868k.m23673e(entrySet, "dataMap.entries");
                        int i12 = 0;
                        for (Object obj3 : entrySet) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                AbstractC1500l.m6991j();
                            }
                            Map.Entry entry = (Map.Entry) obj3;
                            if (AbstractC5868k.m23669a(entry.getKey(), couponCodeList.getPackageCode())) {
                                Object value = entry.getValue();
                                AbstractC5868k.m23673e(value, "set.value");
                                float floatValue = ((Number) value).floatValue();
                                Float f11 = couponCodeList.getCouponAmount().get(packageInfo.getCurrency());
                                AbstractC5868k.m23671c(f11);
                                if (floatValue < f11.floatValue()) {
                                    Float f12 = couponCodeList.getCouponAmount().get(packageInfo.getCurrency());
                                    AbstractC5868k.m23671c(f12);
                                    entry.setValue(f12);
                                }
                            }
                            i12 = i13;
                        }
                    }
                    i10 = i11;
                }
            }
            if (hashMap.containsKey(packageInfo.getPackageCode())) {
                Float f13 = (Float) hashMap.get(packageInfo.getPackageCode());
                double currentPrice = packageInfo.getCurrentPrice();
                AbstractC5868k.m23671c(f13);
                double floatValue2 = f13.floatValue();
                Double.isNaN(floatValue2);
                double d11 = currentPrice - floatValue2;
                double d12 = 0.0d;
                if (d11 >= 0.0d) {
                    double currentPrice2 = packageInfo.getCurrentPrice();
                    double floatValue3 = f13.floatValue();
                    Double.isNaN(floatValue3);
                    m16854C = m16854C(currentPrice2 - floatValue3);
                } else {
                    m16854C = m16854C(0.0d);
                }
                double currentPrice3 = packageInfo.getCurrentPrice();
                double floatValue4 = f13.floatValue();
                Double.isNaN(floatValue4);
                if (currentPrice3 - floatValue4 >= 0.0d) {
                    double currentPrice4 = packageInfo.getCurrentPrice();
                    double floatValue5 = f13.floatValue();
                    Double.isNaN(floatValue5);
                    d10 = currentPrice4 - floatValue5;
                } else {
                    d10 = 0.0d;
                }
                C7531f m28865d = c7531f.m28865d(R$id.mTvName, packageInfo.getPackagePlanName()).m28865d(R$id.mTvPrice, m16854C).m28865d(R$id.mTvPriceType, packageInfo.getCurrency());
                int i14 = R$id.mTvPerDayPrice;
                double authorizedDays = packageInfo.getAuthorizedDays();
                Double.isNaN(authorizedDays);
                C7531f m28865d2 = m28865d.m28865d(i14, m16854C(d10 / authorizedDays) + Operator.Operation.DIVISION + m28850h().getString(R$string.purchase_day));
                int i15 = R$id.mIvHot;
                if (packageInfo.isRecommend() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C7531f m28867f = m28865d2.m28867f(i15, z10);
                int i16 = R$id.mTvCouponPrice;
                C5881x c5881x = C5881x.f23415a;
                String string = m28850h().getString(R$string.purchase_coupon_price);
                AbstractC5868k.m23673e(string, "mContext.getString(R.string.purchase_coupon_price)");
                Object[] objArr = new Object[1];
                Float f14 = (Float) hashMap.get(packageInfo.getPackageCode());
                if (f14 != null) {
                    d12 = f14.floatValue();
                }
                objArr[0] = m16854C(d12);
                String format = String.format(string, Arrays.copyOf(objArr, 1));
                AbstractC5868k.m23673e(format, "format(format, *args)");
                C7531f m28865d3 = m28867f.m28865d(i16, format + " " + packageInfo.getCurrency());
                int i17 = R$id.mTvOriginalPrice;
                m28865d3.m28867f(i17, true).m28867f(R$id.mLayoutCoupon, true).m28865d(i17, m16854C(packageInfo.getCurrentPrice()) + " " + packageInfo.getCurrency());
                ((View) c7531f.m28863b(R$id.mRlPackage)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.a0
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z12) {
                        C3981g0.m16861w(C7531f.this, this, packageInfo, view, z12);
                    }
                });
            } else {
                C7531f m28865d4 = c7531f.m28865d(R$id.mTvName, packageInfo.getPackagePlanName()).m28865d(R$id.mTvPrice, String.valueOf(m16854C(packageInfo.getCurrentPrice()))).m28865d(R$id.mTvPriceType, packageInfo.getCurrency());
                int i18 = R$id.mTvPerDayPrice;
                double currentPrice5 = packageInfo.getCurrentPrice();
                double authorizedDays2 = packageInfo.getAuthorizedDays();
                Double.isNaN(authorizedDays2);
                C7531f m28865d5 = m28865d4.m28865d(i18, m16854C(currentPrice5 / authorizedDays2) + Operator.Operation.DIVISION + m28850h().getString(R$string.purchase_day));
                int i19 = R$id.mIvHot;
                if (packageInfo.isRecommend() != 1) {
                    z11 = false;
                }
                m28865d5.m28867f(i19, z11).m28867f(R$id.mTvOriginalPrice, false).m28867f(R$id.mLayoutCoupon, false);
                ((View) c7531f.m28863b(R$id.mRlPackage)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.b0
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z12) {
                        C3981g0.m16862x(C7531f.this, this, packageInfo, view, z12);
                    }
                });
            }
        } else {
            C7531f m28865d6 = c7531f.m28865d(R$id.mTvName, packageInfo.getPackagePlanName()).m28865d(R$id.mTvPrice, String.valueOf(m16854C(packageInfo.getCurrentPrice()))).m28865d(R$id.mTvPriceType, packageInfo.getCurrency());
            int i20 = R$id.mTvPerDayPrice;
            double currentPrice6 = packageInfo.getCurrentPrice();
            double authorizedDays3 = packageInfo.getAuthorizedDays();
            Double.isNaN(authorizedDays3);
            C7531f m28865d7 = m28865d6.m28865d(i20, m16854C(currentPrice6 / authorizedDays3) + Operator.Operation.DIVISION + m28850h().getString(R$string.purchase_day));
            int i21 = R$id.mIvHot;
            if (packageInfo.isRecommend() != 1) {
                z11 = false;
            }
            m28865d7.m28867f(i21, z11).m28867f(R$id.mTvOriginalPrice, false).m28867f(R$id.mLayoutCoupon, false);
            ((View) c7531f.m28863b(R$id.mRlPackage)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.c0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z12) {
                    C3981g0.m16863y(C7531f.this, this, packageInfo, view, z12);
                }
            });
        }
        TextView textView = (TextView) c7531f.m28863b(R$id.mTvOriginalPrice);
        textView.setPaintFlags(textView.getPaintFlags() | 16);
        ((View) c7531f.m28863b(R$id.mRlPackage)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: d9.d0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z12) {
                C3981g0.m16864z(C3981g0.this, packageInfo, c7531f, view, z12);
            }
        });
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: d9.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3981g0.m16852A(C3981g0.this, c7531f, packageInfo, view);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: d9.f0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i22, KeyEvent keyEvent) {
                boolean m16853B;
                m16853B = C3981g0.m16853B(C7531f.this, this, view, i22, keyEvent);
                return m16853B;
            }
        });
    }
}
