package com.mine.ui.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.mine.R$color;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.mine.ui.activity.InviteFriendsActivity;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.view.LoadingView;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p148g9.InterfaceC4409e;
import p148g9.InterfaceC4410f;
import p170i2.C4842a;
import p177i9.C4917i;
import p238m9.C5617i;
import p348u2.AbstractC7026c;

/* loaded from: classes2.dex */
public final class InviteFriendsActivity extends AbstractActivityC2972a implements InterfaceC4410f {

    /* renamed from: F */
    private final InterfaceC1312h f11725F;

    /* renamed from: G */
    public Map f11726G = new LinkedHashMap();

    /* renamed from: E */
    private String f11724E = "";

    /* renamed from: com.mine.ui.activity.InviteFriendsActivity$a */
    /* loaded from: classes2.dex */
    static final class C2966a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final C2966a f11727a = new C2966a();

        C2966a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5617i invoke() {
            return new C5617i();
        }
    }

    public InviteFriendsActivity() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(C2966a.f11727a);
        this.f11725F = m5965b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h6 */
    public static final void m11924h6(InviteFriendsActivity inviteFriendsActivity, View view) {
        AbstractC5868k.m23674f(inviteFriendsActivity, "this$0");
        Dialog m3280r9 = inviteFriendsActivity.m11925i6().m3280r9();
        boolean z10 = false;
        if (m3280r9 != null && m3280r9.isShowing()) {
            z10 = true;
        }
        if (!z10 && !inviteFriendsActivity.m11925i6().m3079D7()) {
            Bundle bundle = new Bundle();
            bundle.putString(C5617i.f22648H0.m22804a(), inviteFriendsActivity.f11724E);
            inviteFriendsActivity.m11925i6().m3132V8(bundle);
            inviteFriendsActivity.m11925i6().mo3277E9(inviteFriendsActivity.m3294d4(), "InviteQrCodeDialog");
        }
    }

    /* renamed from: i6 */
    private final C5617i m11925i6() {
        return (C5617i) this.f11725F.getValue();
    }

    @Override // p148g9.InterfaceC4410f
    /* renamed from: E1 */
    public void mo11926E1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f11724E = "";
        ((TextView) m11930g6(R$id.mTvCode)).setText(Html.fromHtml(getString(R$string.invite_my_code, "")));
        AbstractActivityC2972a.m11957W5(this, str, false, null, null, null, null, null, 126, null);
    }

    @Override // p148g9.InterfaceC4410f
    /* renamed from: J0 */
    public void mo11927J0(String str) {
        AbstractC5868k.m23674f(str, "inviteCode");
        this.f11724E = str;
        ((TextView) m11930g6(R$id.mTvCode)).setText(Html.fromHtml(getString(R$string.invite_my_code, str)));
    }

    @Override // p148g9.InterfaceC4410f
    /* renamed from: a */
    public void mo11928a() {
        ((LoadingView) m11930g6(R$id.mLoadingView)).setVisibility(0);
    }

    @Override // p148g9.InterfaceC4410f
    /* renamed from: b */
    public void mo11929b() {
        ((LoadingView) m11930g6(R$id.mLoadingView)).setVisibility(8);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        ((AutoLinearLayout) m11930g6(R$id.mRootView)).setBackgroundDrawable(AbstractC7026c.m27111a(this, R$color.color_0b0b0b));
        ((TextView) m11930g6(R$id.mTvCode)).setText(Html.fromHtml(getString(R$string.invite_my_code, "")));
        ((TextView) m11930g6(R$id.mTvDownload)).setText(Html.fromHtml(getString(R$string.invite_download_tele, C4842a.f20329a.m19920a().mo19955d())));
        ((TextView) m11930g6(R$id.mTvBenefit1)).setText(Html.fromHtml(getString(R$string.invite_benefit_1)));
        ((TextView) m11930g6(R$id.mTvBenefit2)).setText(Html.fromHtml(getString(R$string.invite_benefit_2)));
        int i10 = R$id.mTvParticipate;
        ((TextView) m11930g6(i10)).setOnClickListener(new View.OnClickListener() { // from class: l9.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteFriendsActivity.m11924h6(InviteFriendsActivity.this, view);
            }
        });
        ((TextView) m11930g6(i10)).requestFocus();
    }

    /* renamed from: g6 */
    public View m11930g6(int i10) {
        Map map = this.f11726G;
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

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public InterfaceC4409e mo7516s5() {
        return new C4917i(this, this);
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_invite_friends;
    }
}
