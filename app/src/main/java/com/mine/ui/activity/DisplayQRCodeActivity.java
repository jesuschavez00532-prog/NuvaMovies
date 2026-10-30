package com.mine.ui.activity;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mine.R$color;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$mipmap;
import com.mine.R$string;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.taobao.accs.common.Constants;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p148g9.InterfaceC4405a;
import p148g9.InterfaceC4406b;
import p170i2.C4842a;
import p177i9.C4914f;
import p179ib.AbstractC4926c;
import p348u2.AbstractC7026c;
import p433zd.AbstractC7786b;

/* loaded from: classes2.dex */
public final class DisplayQRCodeActivity extends AbstractActivityC2972a implements InterfaceC4406b {

    /* renamed from: F */
    public Map f11716F = new LinkedHashMap();

    /* renamed from: E */
    private String f11715E = "";

    @Override // p148g9.InterfaceC4406b
    /* renamed from: J */
    public void mo11910J() {
        LoadingView loadingView = (LoadingView) m11912e6(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(8);
        }
    }

    @Override // p148g9.InterfaceC4406b
    /* renamed from: a */
    public void mo11911a() {
        LoadingView loadingView = (LoadingView) m11912e6(R$id.mLoadingView);
        if (loadingView != null) {
            loadingView.setVisibility(0);
        }
    }

    /* renamed from: e6 */
    public View m11912e6(int i10) {
        Map map = this.f11716F;
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

    @Override // p148g9.InterfaceC4406b
    /* renamed from: f */
    public void mo11913f(Bitmap bitmap) {
        if (bitmap != null) {
            int i10 = R$id.mImgQrCode;
            ((ImageView) m11912e6(i10)).setVisibility(0);
            if (!bitmap.isRecycled()) {
                ((ImageView) m11912e6(i10)).setImageBitmap(bitmap);
            }
        }
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((AutoLinearLayout) m11912e6(R$id.mRootView)).setBackgroundDrawable(AbstractC7026c.m27111a(this, R$color.color_0b0b0b));
        String m20242i = AbstractC4926c.m20242i();
        AbstractC5868k.m23673e(m20242i, "getScanQRLoginDomain()");
        this.f11715E = m20242i;
        String string = getString(R$string.qr_des_one_pref);
        AbstractC5868k.m23673e(string, "getString(R.string.qr_des_one_pref)");
        String mo19954c = C4842a.f20329a.m19920a().mo19954c();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + mo19954c + getString(R$string.qr_des_one_suff));
        spannableStringBuilder.setSpan(new UnderlineSpan(), string.length(), string.length() + mo19954c.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R$color.color_download_apk_url)), string.length(), string.length() + mo19954c.length(), 33);
        ((TextView) m11912e6(R$id.tvDesOne)).setText(spannableStringBuilder);
        Drawable drawable = getResources().getDrawable(R$mipmap.vod_icon_qr_code_scan);
        String string2 = getString(R$string.qr_des_two_perf);
        AbstractC5868k.m23673e(string2, "getString(R.string.qr_des_two_perf)");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2 + getString(R$string.qr_des_two_suff));
        drawable.setBounds(0, 0, AbstractC7786b.m30166j(40), AbstractC7786b.m30166j(40));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable), string2.length(), string2.length() + 1, 33);
        ((TextView) m11912e6(R$id.tvDesTwo)).setText(spannableStringBuilder2);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4405a mo7516s5() {
        return new C4914f(this, this);
    }

    @Override // p148g9.InterfaceC4406b
    /* renamed from: m2 */
    public String mo11915m2() {
        return "http://" + this.f11715E + "/#/download";
    }

    @Override // p148g9.InterfaceC4406b
    /* renamed from: s0 */
    public void mo11916s0(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        if (!AbstractC5868k.m23669a(str, "aaa100094") && ((ImageView) m11912e6(R$id.mImgQrCode)).getVisibility() == 8) {
            ((TextView) m11912e6(R$id.mTvError)).setVisibility(0);
        }
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_displayqrcode;
    }
}
