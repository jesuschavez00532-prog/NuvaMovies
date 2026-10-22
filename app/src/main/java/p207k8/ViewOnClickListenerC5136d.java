package p207k8;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d;
import com.live.R$id;
import com.live.R$layout;
import com.live.R$string;
import com.live.R$style;

/* renamed from: k8.d */
/* loaded from: classes2.dex */
public class ViewOnClickListenerC5136d extends DialogInterfaceOnCancelListenerC0710d implements View.OnClickListener {

    /* renamed from: C0 */
    private TextView f21077C0;

    /* renamed from: D0 */
    private Button f21078D0;

    /* renamed from: E0 */
    private Button f21079E0;

    /* renamed from: F0 */
    private int f21080F0 = -1;

    /* renamed from: G0 */
    private String f21081G0 = "";

    /* renamed from: H0 */
    private b f21082H0;

    /* renamed from: I0 */
    private DialogInterface.OnDismissListener f21083I0;

    /* renamed from: J0 */
    private boolean f21084J0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k8.d$a */
    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnDismissListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (ViewOnClickListenerC5136d.this.f21083I0 != null) {
                ViewOnClickListenerC5136d.this.f21083I0.onDismiss(dialogInterface);
            }
        }
    }

    /* renamed from: k8.d$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo20779a();
    }

    /* renamed from: G9 */
    private void m20773G9(View view) {
        this.f21077C0 = (TextView) view.findViewById(R$id.tv_tip_1);
        this.f21078D0 = (Button) view.findViewById(R$id.btn_positive);
        this.f21079E0 = (Button) view.findViewById(R$id.btn_negative);
        this.f21077C0.setText(this.f21081G0);
        int i10 = this.f21080F0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f21078D0.setText(R$string.dialog_clear_positive);
                    this.f21079E0.setText(R$string.dialog_clear_negative);
                }
            } else {
                this.f21078D0.setText(R$string.dialog_time_positive);
                this.f21079E0.setText(R$string.dialog_time_negative);
            }
        } else {
            this.f21078D0.setText(R$string.dialog_exist_positive);
            this.f21079E0.setText(R$string.dialog_exist_negative);
        }
        this.f21078D0.setOnClickListener(this);
        this.f21079E0.setOnClickListener(this);
        m3280r9().setOnDismissListener(new a());
        if (this.f21084J0) {
            this.f21078D0.requestFocus();
        }
    }

    /* renamed from: H9 */
    public static ViewOnClickListenerC5136d m20774H9(int i10, String str, boolean z10) {
        ViewOnClickListenerC5136d viewOnClickListenerC5136d = new ViewOnClickListenerC5136d();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i10);
        bundle.putString("tipMsg", str);
        bundle.putBoolean("isRequest", z10);
        viewOnClickListenerC5136d.m3132V8(bundle);
        return viewOnClickListenerC5136d;
    }

    /* renamed from: I9 */
    public void m20775I9(b bVar) {
        this.f21082H0 = bVar;
    }

    /* renamed from: J9 */
    public void m20776J9(DialogInterface.OnDismissListener onDismissListener) {
        this.f21083I0 = onDismissListener;
    }

    /* renamed from: K9 */
    public void m20777K9(String str) {
        this.f21077C0.setText(str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        if (m3090H6() != null) {
            this.f21080F0 = m3090H6().getInt("type");
            this.f21081G0 = m3090H6().getString("tipMsg");
            this.f21084J0 = m3090H6().getBoolean("isRequest");
        }
        m3274B9(1, R$style.ReserveDialog);
    }

    /* renamed from: L9 */
    public void m20778L9(AbstractC0729o abstractC0729o, String str) {
        mo3277E9(abstractC0729o, str);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.dialog_reservation, viewGroup, false);
        m20773G9(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        mo3278o9();
        DialogInterface.OnDismissListener onDismissListener = this.f21083I0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R$id.btn_negative) {
            mo3278o9();
            DialogInterface.OnDismissListener onDismissListener = this.f21083I0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(null);
                return;
            }
            return;
        }
        if (id2 == R$id.btn_positive) {
            this.f21082H0.mo20779a();
        }
    }
}
