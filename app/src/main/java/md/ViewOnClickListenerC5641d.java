package md;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.C1447d;
import cc.C1466m0;
import cc.C1477w;
import com.lzy.okgo.model.Progress;
import com.mobile.bean.UpdateBean;
import com.module.p069db.UmengPush;
import com.module.view.LoadingView;
import com.taobao.accs.common.Constants;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$string;
import com.vod.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p102db.DialogC4023b;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p264o9.C5942a;
import p286p9.C6242a;
import p300q9.C6355c;
import p315r9.InterfaceC6563a;
import p315r9.InterfaceC6565c;
import p355u9.AbstractC7063c;
import p355u9.AsyncTaskC7064d;
import p400xa.AbstractC7598p1;
import p415y9.AbstractApplicationC7689d;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: md.d */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC5641d extends C7767e implements View.OnClickListener, InterfaceC6565c {

    /* renamed from: G0 */
    private boolean f22725G0;

    /* renamed from: H0 */
    private View f22726H0;

    /* renamed from: I0 */
    private UmengPush f22727I0;

    /* renamed from: J0 */
    private DialogC4023b f22728J0;

    /* renamed from: K0 */
    private final InterfaceC1312h f22729K0;

    /* renamed from: L0 */
    public Map f22730L0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f22724F0 = ViewOnClickListenerC5641d.class.getSimpleName();

    /* renamed from: md.d$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC6563a {
        a() {
        }

        @Override // p315r9.InterfaceC6563a
        /* renamed from: b */
        public void mo19703b() {
        }

        @Override // p315r9.InterfaceC6563a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo19702a(UpdateBean updateBean) {
            boolean z10 = false;
            AbstractActivityC0712e m3075C6 = ViewOnClickListenerC5641d.this.m3075C6();
            if (m3075C6 != null) {
                z10 = m3075C6.isFinishing();
            } else {
                z10 = true;
            }
            if (!z10 && !ViewOnClickListenerC5641d.this.m3192t7()) {
                if (AbstractC7598p1.m29241e(ViewOnClickListenerC5641d.this.m3096J6())) {
                    ViewOnClickListenerC5641d.this.m22890O9(updateBean);
                } else {
                    ViewOnClickListenerC5641d.this.f22725G0 = false;
                    ((LoadingView) ViewOnClickListenerC5641d.this.m22893I9(R$id.mLoadingView)).setVisibility(8);
                }
            }
        }

        @Override // p315r9.InterfaceC6563a
        public void onError(Throwable th) {
            boolean z10 = false;
            AbstractActivityC0712e m3075C6 = ViewOnClickListenerC5641d.this.m3075C6();
            if (m3075C6 != null && !m3075C6.isFinishing()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !ViewOnClickListenerC5641d.this.m3192t7()) {
                ViewOnClickListenerC5641d.this.f22725G0 = false;
                ((LoadingView) ViewOnClickListenerC5641d.this.m22893I9(R$id.mLoadingView)).setVisibility(8);
                ViewOnClickListenerC5641d viewOnClickListenerC5641d = ViewOnClickListenerC5641d.this;
                String string = viewOnClickListenerC5641d.m3154d7().getString(R$string.latest_version);
                AbstractC5868k.m23673e(string, "resources.getString(R.string.latest_version)");
                viewOnClickListenerC5641d.m22892T9(string);
            }
        }
    }

    /* renamed from: md.d$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6242a invoke() {
            return new C6242a(ViewOnClickListenerC5641d.this.m3096J6(), new C1477w(".update"), new C1447d(".update"));
        }
    }

    public ViewOnClickListenerC5641d() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f22729K0 = m5965b;
    }

    /* renamed from: M9 */
    private final void m22888M9() {
        if (this.f22725G0) {
            return;
        }
        this.f22725G0 = true;
        ((LoadingView) m22893I9(R$id.mLoadingView)).setVisibility(0);
        C6242a m22889N9 = m22889N9();
        C1466m0 c1466m0 = C1466m0.f5627a;
        m22889N9.m24862f(c1466m0.m6885t(), c1466m0.m6870i(), new a());
    }

    /* renamed from: N9 */
    private final C6242a m22889N9() {
        return (C6242a) this.f22729K0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O9 */
    public final void m22890O9(UpdateBean updateBean) {
        boolean z10 = false;
        if (updateBean == null) {
            this.f22725G0 = false;
            return;
        }
        String m27217d = AbstractC7063c.m27217d(m3107M8(), C4842a.f20329a.m19920a().mo19959h());
        final C6355c c6355c = new C6355c();
        c6355c.m25152n(m27217d);
        c6355c.m25156r(updateBean.url + AbstractC7598p1.m29239c());
        c6355c.m25155q(updateBean.spareUrl + AbstractC7598p1.m29239c());
        c6355c.m25154p(updateBean.md5);
        if (updateBean.forceUpdate == 1) {
            z10 = true;
        }
        c6355c.m25150l(z10);
        new AsyncTaskC7064d(new AsyncTaskC7064d.a() { // from class: md.c
            @Override // p355u9.AsyncTaskC7064d.a
            /* renamed from: a */
            public final void mo22883a(String str) {
                ViewOnClickListenerC5641d.m22891P9(C6355c.this, str);
            }
        }).execute(c6355c.m25145g(), c6355c.m25144f());
        ((LoadingView) m22893I9(R$id.mLoadingView)).setVisibility(8);
        mo3278o9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P9 */
    public static final void m22891P9(C6355c c6355c, String str) {
        AbstractC5868k.m23674f(c6355c, "$upgradeConfig");
        c6355c.m25154p(str);
        C5942a.m24064e().m24070k(AbstractApplicationC7689d.f28135d.m29494a(), c6355c, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T9 */
    public final void m22892T9(String str) {
        DialogC4023b dialogC4023b = new DialogC4023b(m3096J6(), R$layout.layout_checkupdate_dialog);
        this.f22728J0 = dialogC4023b;
        dialogC4023b.m17017b(str);
        DialogC4023b dialogC4023b2 = this.f22728J0;
        if (dialogC4023b2 != null) {
            dialogC4023b2.show();
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f22730L0.clear();
    }

    /* renamed from: I9 */
    public View m22893I9(int i10) {
        View findViewById;
        Map map = this.f22730L0;
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

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_msg_push_upgrade, viewGroup, false);
        this.f22726H0 = inflate;
        return inflate;
    }

    /* renamed from: Q9 */
    public final void m22894Q9() {
        int i10 = R$id.mBtnConfirm;
        ((Button) m22893I9(i10)).setOnClickListener(this);
        ((Button) m22893I9(i10)).requestFocus();
    }

    /* renamed from: R9 */
    public final void m22895R9() {
        String str = null;
        String m20603m = AbstractC5085b.m20603m(m3096J6());
        ((TextView) m22893I9(R$id.mTextCurVersion)).setText(m3172j7(R$string.current_version_str) + m20603m);
        if (this.f22727I0 != null) {
            TextView textView = (TextView) m22893I9(R$id.mTextUpdateNote);
            UmengPush umengPush = this.f22727I0;
            if (umengPush == null || (str = umengPush.getText()) == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: S9 */
    public final void m22896S9(AbstractC0729o abstractC0729o, String str, UmengPush umengPush) {
        AbstractC5868k.m23674f(abstractC0729o, "manager");
        AbstractC5868k.m23674f(str, Progress.TAG);
        AbstractC5868k.m23674f(umengPush, Constants.SHARED_MESSAGE_ID_FILE);
        super.mo3277E9(abstractC0729o, str);
        this.f22727I0 = umengPush;
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: U */
    public void mo11835U() {
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: f1 */
    public void mo11842f1(long j10, long j11) {
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: i8 */
    public void mo3170i8() {
        Window window;
        super.mo3170i8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            window = m3280r9.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = AbstractC7786b.m30166j(980);
            int m30163g = AbstractC7786b.m30163g(580);
            attributes.height = m30163g;
            window.setLayout(attributes.width, m30163g);
        }
    }

    @Override // p430z9.C7767e, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: j8 */
    public void mo3173j8() {
        DialogC4023b dialogC4023b;
        super.mo3173j8();
        ((LoadingView) m22893I9(R$id.mLoadingView)).setVisibility(8);
        DialogC4023b dialogC4023b2 = this.f22728J0;
        boolean z10 = false;
        if (dialogC4023b2 != null && dialogC4023b2.isShowing()) {
            z10 = true;
        }
        if (z10 && (dialogC4023b = this.f22728J0) != null) {
            dialogC4023b.dismiss();
        }
        m22889N9().m24860d();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        m3287z9(true);
        super.mo3176k8(view, bundle);
        m22894Q9();
        m22895R9();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: o9 */
    public void mo3278o9() {
        super.mo3278o9();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        if (view.getId() == R$id.mBtnConfirm) {
            m22888M9();
        }
    }

    @Override // p315r9.InterfaceC6565c
    public void onSuccess() {
        boolean z10 = false;
        AbstractActivityC0712e m3075C6 = m3075C6();
        if (m3075C6 != null && !m3075C6.isFinishing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !m3192t7()) {
            this.f22725G0 = false;
            ((LoadingView) m22893I9(R$id.mLoadingView)).setVisibility(8);
        }
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: u0 */
    public void mo11850u0(Exception exc) {
        boolean z10 = false;
        AbstractActivityC0712e m3075C6 = m3075C6();
        if (m3075C6 != null && !m3075C6.isFinishing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !m3192t7()) {
            this.f22725G0 = false;
            ((LoadingView) m22893I9(R$id.mLoadingView)).setVisibility(8);
        }
    }
}
