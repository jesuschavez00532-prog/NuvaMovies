package p149gc;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.swlauthnew.R$id;
import com.swlauthnew.R$layout;
import com.swlauthnew.R$style;
import com.umeng.analytics.pro.C3384f;
import ne.AbstractC5868k;
import p141g2.C4337a;
import ye.C7709c;

/* renamed from: gc.g */
/* loaded from: classes.dex */
public final class DialogC4430g extends Dialog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4430g(Context context) {
        super(context, R$style.dialog_style);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        setContentView(R$layout.dialog_page_expired);
    }

    /* renamed from: c */
    private final void m18616c() {
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        ((Button) findViewById(R$id.mBtnReLogin)).setOnClickListener(new View.OnClickListener() { // from class: gc.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC4430g.m18617d(DialogC4430g.this, view);
            }
        });
        ((Button) findViewById(R$id.mBtnExit)).setOnClickListener(new View.OnClickListener() { // from class: gc.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC4430g.m18618e(DialogC4430g.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m18617d(DialogC4430g dialogC4430g, View view) {
        AbstractC5868k.m23674f(dialogC4430g, "this$0");
        C7709c.m29787d().m29801m(new C4337a(true));
        dialogC4430g.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m18618e(DialogC4430g dialogC4430g, View view) {
        AbstractC5868k.m23674f(dialogC4430g, "this$0");
        C7709c.m29787d().m29801m(new C4337a(false));
        dialogC4430g.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18616c();
    }
}
