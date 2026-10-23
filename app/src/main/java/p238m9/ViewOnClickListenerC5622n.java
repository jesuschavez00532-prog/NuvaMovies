package p238m9;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import cc.C1466m0;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.mine.R$style;
import com.mine.p068ui.activity.UserCenterActivity;
import com.module.event.CloseDialogEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import org.greenrobot.eventbus.ThreadMode;
import p149gc.DialogC4427d;
import p170i2.C4842a;
import p371vb.C7252a;
import p400xa.C7619y;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: m9.n */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC5622n extends C7767e implements View.OnClickListener {

    /* renamed from: F0 */
    private View f22671F0;

    /* renamed from: G0 */
    public Map f22672G0 = new LinkedHashMap();

    /* renamed from: I9 */
    private final void m22824I9() {
        ((Button) m22825H9(R$id.vipOverToBind)).setOnClickListener(this);
        ((Button) m22825H9(R$id.vipOverToCode)).setOnClickListener(this);
        ((Button) m22825H9(R$id.vipOverToPurchase)).setOnClickListener(this);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f22672G0.clear();
    }

    /* renamed from: H9 */
    public View m22825H9(int i10) {
        View findViewById;
        Map map = this.f22672G0;
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
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            m3280r9.requestWindowFeature(1);
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void OnEventCloseDialog(CloseDialogEvent closeDialogEvent) {
        AbstractC5868k.m23674f(closeDialogEvent, "event");
        mo3278o9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_viptime_over, viewGroup, false);
        this.f22671F0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public void mo3118Q7() {
        super.mo3118Q7();
        C7709c.m29787d().m29806v(this);
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
        int i10 = 0;
        int i11 = 0;
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(620));
        }
        Button button = (Button) m22825H9(R$id.vipOverToPurchase);
        C4842a c4842a = C4842a.f20329a;
        int i12 = 0;
        if (c4842a.m19920a().m19927D()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        button.setVisibility(i10);
        Button button2 = (Button) m22825H9(R$id.vipOverToBind);
        if (c4842a.m19920a().m19927D()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        button2.setVisibility(i11);
        Button button3 = (Button) m22825H9(R$id.vipOverToCancel);
        if (c4842a.m19920a().m19927D()) {
            i12 = 8;
        }
        button3.setVisibility(i12);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        String str = null;
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        TextView textView = (TextView) m22825H9(R$id.tx_vip_over);
        AbstractActivityC0712e m3075C6 = m3075C6();
        if (m3075C6 != null) {
            str = m3075C6.getString(R$string.dialog_vip_over, Integer.valueOf(C7252a.f27087a.m28070e()));
        } else {
            str = null;
        }
        textView.setText(str);
        m22824I9();
        C7709c.m29787d().m29803r(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        AbstractActivityC0712e m3075C6;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.vipOverToCode;
        if (num != null && num.intValue() == i10) {
            new DialogC4427d(m3075C6(), R$style.dialog, C1466m0.f5627a.m6878m()).show();
            return;
        }
        int i11 = R$id.vipOverToPurchase;
        if (num == null || num.intValue() != i11) {
            int i12 = R$id.vipOverToBind;
            if (num != null && num.intValue() == i12 && (m3075C6 = m3075C6()) != null) {
                C7619y.f28056a.m29369b(m3075C6, UserCenterActivity.class);
            }
        }
    }
}
