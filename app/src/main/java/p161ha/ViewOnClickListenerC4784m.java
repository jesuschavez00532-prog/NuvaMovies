package p161ha;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import cc.C1466m0;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$mipmap;
import com.module.R$string;
import com.module.R$style;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import ne.AbstractC5868k;
import p132fa.C4300d;
import p371vb.C7252a;
import p400xa.C7577i1;
import p400xa.C7578j;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: ha.m */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4784m extends C7767e implements View.OnClickListener {

    /* renamed from: F0 */
    private View f20188F0;

    /* renamed from: G0 */
    public InterfaceC4786n f20189G0;

    /* renamed from: H0 */
    public Map f20190H0 = new LinkedHashMap();

    /* renamed from: J9 */
    private final void m19787J9() {
        ((Button) m19788H9(R$id.mBtnCancel)).setOnClickListener(this);
        ((Button) m19788H9(R$id.mBtnGet)).setOnClickListener(this);
        m3287z9(false);
        ((TextView) m19788H9(R$id.mDialogTipsOne)).setText(m3172j7(R$string.dialog_show_coupon_tips_congratulation));
        Drawable drawable = m3154d7().getDrawable(R$mipmap.icon_coupon_dialog_person);
        String m3172j7 = m3172j7(R$string.dialog_show_coupon_tips_one);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_show_coupon_tips_one)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m3172j7 + m3172j7(R$string.dialog_show_coupon_tips_two));
        drawable.setBounds(0, 0, AbstractC7786b.m30166j(36), AbstractC7786b.m30166j(36));
        spannableStringBuilder.setSpan(new ImageSpan(drawable), m3172j7.length(), m3172j7.length() + 1, 33);
        ((TextView) m19788H9(R$id.mDialogTipsTwo)).setText(spannableStringBuilder);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20190H0.clear();
    }

    /* renamed from: H9 */
    public View m19788H9(int i10) {
        View findViewById;
        Map map = this.f20190H0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    /* renamed from: I9 */
    public final InterfaceC4786n m19789I9() {
        InterfaceC4786n interfaceC4786n = this.f20189G0;
        if (interfaceC4786n != null) {
            return interfaceC4786n;
        }
        AbstractC5868k.m23686r("mReceiveListener");
        return null;
    }

    /* renamed from: K9 */
    public final void m19790K9(InterfaceC4786n interfaceC4786n) {
        AbstractC5868k.m23674f(interfaceC4786n, "<set-?>");
        this.f20189G0 = interfaceC4786n;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public final void m19791L9(InterfaceC4786n interfaceC4786n) {
        AbstractC5868k.m23674f(interfaceC4786n, "couponReceiveListener");
        m19790K9(interfaceC4786n);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_coupon, viewGroup, false);
        this.f20188F0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(861), AbstractC7786b.m30163g(700));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m19787J9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        ((Button) m19788H9(R$id.mBtnGet)).requestFocus();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        GetAuthInfoResultData getAuthInfoResultData;
        Long l10 = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mBtnCancel;
        if (num != null && num.intValue() == i10) {
            String str = C1466m0.f5627a.m6878m() + C4300d.f18678a.m18047n();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
            if (m28073h != null) {
                getAuthInfoResultData = m28073h.getData();
            } else {
                getAuthInfoResultData = null;
            }
            AbstractC5868k.m23671c(getAuthInfoResultData);
            Date parse = simpleDateFormat.parse(getAuthInfoResultData.getNowTime());
            if (parse != null) {
                l10 = Long.valueOf(parse.getTime());
            }
            C7577i1.f27838b.m29083b().m29076h(str, l10);
            mo3278o9();
            return;
        }
        int i11 = R$id.mBtnGet;
        if (num != null && num.intValue() == i11 && !C7578j.f27850a.m29087a() && m19789I9() != null) {
            m19789I9().mo11901a();
        }
    }
}
