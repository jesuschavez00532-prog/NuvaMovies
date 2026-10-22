package p161ha;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: ha.p0 */
/* loaded from: classes2.dex */
public final class C4791p0 extends C7767e {

    /* renamed from: F0 */
    private final int f20198F0;

    /* renamed from: H0 */
    private View f20200H0;

    /* renamed from: I0 */
    public Map f20201I0 = new LinkedHashMap();

    /* renamed from: G0 */
    private String f20199G0 = C4791p0.class.getSimpleName();

    public C4791p0(int i10) {
        this.f20198F0 = i10;
    }

    /* renamed from: J9 */
    private final void m19799J9() {
        ((Button) m19801I9(R$id.mBtnConfirm)).setOnClickListener(new View.OnClickListener() { // from class: ha.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4791p0.m19800K9(C4791p0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K9 */
    public static final void m19800K9(C4791p0 c4791p0, View view) {
        AbstractC5868k.m23674f(c4791p0, "this$0");
        c4791p0.mo3279p9();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20201I0.clear();
    }

    /* renamed from: I9 */
    public View m19801I9(int i10) {
        View findViewById;
        Map map = this.f20201I0;
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

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_free_gift_no_bind, viewGroup, false);
        this.f20200H0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public void mo3118Q7() {
        super.mo3118Q7();
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
            window.setLayout(AbstractC7786b.m30166j(913), AbstractC7786b.m30163g(631));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        String str;
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        TextView textView = (TextView) m19801I9(R$id.mTvGiftTips);
        AbstractActivityC0712e m3075C6 = m3075C6();
        if (m3075C6 != null) {
            str = m3075C6.getString(R$string.get_free_gift_days_tips, String.valueOf(this.f20198F0));
        } else {
            str = null;
        }
        textView.setText(Html.fromHtml(str));
        m19799J9();
    }
}
