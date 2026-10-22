package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import be.C1328x;
import cc.C1466m0;
import com.advertlib.bean.AdInfo;
import com.module.R$id;
import com.module.R$style;
import com.module.view.LoadingView;
import com.umeng.analytics.pro.C3384f;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p242n0.C5714a;
import p277p0.C6156m;
import p277p0.C6160q;

/* renamed from: ha.d0 */
/* loaded from: classes2.dex */
public final class DialogC4761d0 extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private View f20115a;

    /* renamed from: b */
    private AdInfo f20116b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.d0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ AdInfo f20118b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdInfo adInfo) {
            super(1);
            this.f20118b = adInfo;
        }

        /* renamed from: a */
        public final void m19690a(boolean z10) {
            ((LoadingView) DialogC4761d0.this.findViewById(R$id.mLoadingView)).setVisibility(8);
            if (z10) {
                C6160q c6160q = C6160q.f24221a;
                Context context = DialogC4761d0.this.getContext();
                AbstractC5868k.m23673e(context, C3384f.f14563X);
                c6160q.m24600i(context, C1466m0.f5627a.m6888w(), C5714a.f22937a.m23090c(), this.f20118b);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19690a(((Boolean) obj).booleanValue());
            return C1328x.f4998a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4761d0(Context context, View view) {
        super(context, R$style.InputPasswordDialog);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(view, "mContentView");
        this.f20115a = view;
        setContentView(view);
    }

    /* renamed from: a */
    private final void m19687a() {
        AdInfo adInfo = this.f20116b;
        if (adInfo != null) {
            C6156m c6156m = C6156m.f24180a;
            Context context = getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            C5714a c5714a = C5714a.f22937a;
            c6156m.m24572g0(context, c5714a.m23090c(), adInfo.getAd_id());
            ((LoadingView) findViewById(R$id.mLoadingView)).setVisibility(0);
            Context context2 = getContext();
            ImageView imageView = (ImageView) findViewById(R$id.mIvAd);
            String m23090c = c5714a.m23090c();
            AdInfo adInfo2 = this.f20116b;
            AbstractC5868k.m23673e(context2, C3384f.f14563X);
            AbstractC5868k.m23673e(imageView, "mIvAd");
            C6156m.m24538k0(c6156m, context2, imageView, m23090c, adInfo2, null, new a(adInfo), null, false, 1, 208, null);
        }
    }

    /* renamed from: c */
    private final void m19688c() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        ((Button) findViewById(R$id.mBtnOk)).setOnClickListener(this);
    }

    /* renamed from: b */
    public final void m19689b(AdInfo adInfo) {
        AbstractC5868k.m23674f(adInfo, "adInfo");
        this.f20116b = adInfo;
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
        AbstractC5868k.m23674f(view, "v");
        if (view.getId() == R$id.mBtnOk) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m19688c();
        m19687a();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }
}
