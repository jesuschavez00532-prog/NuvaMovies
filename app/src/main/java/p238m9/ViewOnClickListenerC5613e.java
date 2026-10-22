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
import com.module.event.CloseDialogEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import org.greenrobot.eventbus.ThreadMode;
import p149gc.DialogC4427d;
import p371vb.C7252a;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: m9.e */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC5613e extends C7767e implements View.OnClickListener {

    /* renamed from: F0 */
    private View f22643F0;

    /* renamed from: G0 */
    public Map f22644G0 = new LinkedHashMap();

    /* renamed from: I9 */
    private final void m22790I9() {
        ((Button) m22791H9(R$id.bind_now)).setOnClickListener(this);
        ((Button) m22791H9(R$id.purchase_plan)).setOnClickListener(this);
        ((Button) m22791H9(R$id.use_a_redeem_code)).setOnClickListener(this);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f22644G0.clear();
    }

    /* renamed from: H9 */
    public View m22791H9(int i10) {
        View findViewById;
        Map map = this.f22644G0;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_freetime_over, viewGroup, false);
        this.f22643F0 = inflate;
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
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(620));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        String str;
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        TextView textView = (TextView) m22791H9(R$id.daysForBind);
        AbstractActivityC0712e m3075C6 = m3075C6();
        if (m3075C6 != null) {
            str = m3075C6.getString(R$string.dialog_free_trial_over, Integer.valueOf(C7252a.f27087a.m28070e()));
        } else {
            str = null;
        }
        textView.setText(str);
        m22790I9();
        C7709c.m29787d().m29803r(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.bind_now;
        if (num == null || num.intValue() != i10) {
            int i11 = R$id.purchase_plan;
            if (num == null || num.intValue() != i11) {
                int i12 = R$id.use_a_redeem_code;
                if (num != null && num.intValue() == i12) {
                    new DialogC4427d(m3075C6(), com.swlauthnew.R$style.dialog, C1466m0.f5627a.m6878m()).show();
                }
            }
        }
    }
}
