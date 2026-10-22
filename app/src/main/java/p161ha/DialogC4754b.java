package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import be.C1328x;
import cc.C1466m0;
import com.advertlib.bean.AdInfo;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$style;
import com.module.p070ui.activity.WebActivity;
import com.module.view.LoadingView;
import com.p077uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.C3384f;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p242n0.C5714a;
import p277p0.C6156m;
import p277p0.C6160q;
import p359ue.AbstractC7167u;
import p400xa.C7589m1;
import p433zd.AbstractC7786b;

/* renamed from: ha.b */
/* loaded from: classes2.dex */
public final class DialogC4754b extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private AdInfo f20093a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ AdInfo f20095b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdInfo adInfo) {
            super(1);
            this.f20095b = adInfo;
        }

        /* renamed from: a */
        public final void m19653a(boolean z10) {
            ((LoadingView) DialogC4754b.this.findViewById(R$id.mLoadingView)).setVisibility(8);
            if (z10) {
                C6160q c6160q = C6160q.f24221a;
                Context context = DialogC4754b.this.getContext();
                AbstractC5868k.m23673e(context, C3384f.f14563X);
                c6160q.m24600i(context, C1466m0.f5627a.m6888w(), C5714a.f22937a.m23088a(), this.f20095b);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19653a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4754b(Context context) {
        super(context, R$style.InputPasswordDialog);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        setContentView(R$layout.dialog_ad_screen);
    }

    /* renamed from: a */
    private final void m19649a() {
        boolean m27763v;
        AdInfo adInfo = this.f20093a;
        if (adInfo != null) {
            C6160q c6160q = C6160q.f24221a;
            Context context = getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            c6160q.m24599h(context, C1466m0.f5627a.m6888w(), C5714a.f22937a.m23088a(), adInfo);
            String action = adInfo.getAction();
            if (action != null) {
                m27763v = AbstractC7167u.m27763v(action, "toInviteFriends", false, 2, null);
                if (m27763v) {
                    C7589m1.f27886a.m29148q("1");
                }
                WebActivity.C2989a c2989a = WebActivity.f12115H;
                Context context2 = getContext();
                AbstractC5868k.m23673e(context2, C3384f.f14563X);
                c2989a.m12054a(context2, action);
            }
        }
    }

    /* renamed from: b */
    private final void m19650b() {
        AdInfo adInfo = this.f20093a;
        if (adInfo != null) {
            C6156m c6156m = C6156m.f24180a;
            Context context = getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            C5714a c5714a = C5714a.f22937a;
            c6156m.m24572g0(context, c5714a.m23088a(), adInfo.getAd_id());
            ((LoadingView) findViewById(R$id.mLoadingView)).setVisibility(0);
            Context context2 = getContext();
            AbstractC5868k.m23673e(context2, C3384f.f14563X);
            ImageView imageView = (ImageView) findViewById(R$id.mIvAd);
            AbstractC5868k.m23673e(imageView, "mIvAd");
            C6156m.m24538k0(c6156m, context2, imageView, c5714a.m23088a(), this.f20093a, null, new a(adInfo), null, false, 0, 464, null);
        }
    }

    /* renamed from: d */
    private final void m19651d() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        int i10 = R$id.mIvAd;
        ((ImageView) findViewById(i10)).setOnClickListener(this);
        ((ImageView) findViewById(i10)).requestFocus();
    }

    /* renamed from: c */
    public final void m19652c(AdInfo adInfo) {
        AbstractC5868k.m23674f(adInfo, "adInfo");
        this.f20093a = adInfo;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 3) {
            dismiss();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        AbstractC5868k.m23674f(view, "v");
        if (view.getId() == R$id.mIvAd) {
            AdInfo adInfo = this.f20093a;
            String str2 = null;
            if (adInfo != null) {
                str = adInfo.getAction_type();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(str, "1")) {
                AdInfo adInfo2 = this.f20093a;
                if (adInfo2 != null) {
                    str2 = adInfo2.getAction();
                }
                if (!TextUtils.isEmpty(str2)) {
                    m19649a();
                    dismiss();
                }
            }
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m19651d();
        m19650b();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = AbstractC7786b.m30166j(LogType.UNEXP_ANR);
            int m30163g = AbstractC7786b.m30163g(720);
            attributes.height = m30163g;
            window.setLayout(attributes.width, m30163g);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }
}
