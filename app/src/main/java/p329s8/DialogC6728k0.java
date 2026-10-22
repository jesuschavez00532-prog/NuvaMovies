package p329s8;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$style;
import me.InterfaceC5642a;
import ne.AbstractC5868k;

/* renamed from: s8.k0 */
/* loaded from: classes2.dex */
public final class DialogC6728k0 extends Dialog {

    /* renamed from: a */
    private final Context f25838a;

    /* renamed from: b */
    private final InterfaceC5642a f25839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC6728k0(Context context, InterfaceC5642a interfaceC5642a) {
        super(context, R$style.InputPasswordDialog);
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(interfaceC5642a, "gotoLoginCallBack");
        this.f25838a = context;
        this.f25839b = interfaceC5642a;
    }

    /* renamed from: c */
    private final void m26381c() {
        setCancelable(true);
        int i10 = R$id.mBtnGoToLogin;
        ((TextView) findViewById(i10)).requestFocus();
        ((TextView) findViewById(R$id.mBtnBack)).setOnClickListener(new View.OnClickListener() { // from class: s8.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC6728k0.m26382d(DialogC6728k0.this, view);
            }
        });
        ((TextView) findViewById(i10)).setOnClickListener(new View.OnClickListener() { // from class: s8.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC6728k0.m26383e(DialogC6728k0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m26382d(DialogC6728k0 dialogC6728k0, View view) {
        AbstractC5868k.m23674f(dialogC6728k0, "this$0");
        dialogC6728k0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m26383e(DialogC6728k0 dialogC6728k0, View view) {
        AbstractC5868k.m23674f(dialogC6728k0, "this$0");
        dialogC6728k0.f25839b.invoke();
        dialogC6728k0.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.dialog_email_binded);
        m26381c();
    }
}
