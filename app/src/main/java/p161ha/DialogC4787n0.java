package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import java.util.Arrays;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.C5881x;
import p400xa.C7589m1;

/* renamed from: ha.n0 */
/* loaded from: classes2.dex */
public final class DialogC4787n0 extends Dialog {

    /* renamed from: a */
    private final int f20192a;

    /* renamed from: b */
    private final Context f20193b;

    /* renamed from: c */
    private final InterfaceC5642a f20194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4787n0(int i10, Context context, InterfaceC5642a interfaceC5642a) {
        super(context, R$style.InputPasswordDialog);
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(interfaceC5642a, "callBack");
        this.f20192a = i10;
        this.f20193b = context;
        this.f20194c = interfaceC5642a;
    }

    /* renamed from: c */
    private final void m19794c() {
        ((TextView) findViewById(R$id.mBtnLater)).setOnClickListener(new View.OnClickListener() { // from class: ha.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC4787n0.m19795d(DialogC4787n0.this, view);
            }
        });
        ((TextView) findViewById(R$id.mBtnBind)).setOnClickListener(new View.OnClickListener() { // from class: ha.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC4787n0.m19796e(DialogC4787n0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m19795d(DialogC4787n0 dialogC4787n0, View view) {
        AbstractC5868k.m23674f(dialogC4787n0, "this$0");
        C7589m1.f27886a.m29144m(false);
        dialogC4787n0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m19796e(DialogC4787n0 dialogC4787n0, View view) {
        AbstractC5868k.m23674f(dialogC4787n0, "this$0");
        dialogC4787n0.f20194c.invoke();
        C7589m1.f27886a.m29144m(true);
        dialogC4787n0.dismiss();
    }

    /* renamed from: f */
    private final void m19797f() {
        TextView textView = (TextView) findViewById(R$id.mTvTipNormal);
        C5881x c5881x = C5881x.f23415a;
        String string = this.f20193b.getResources().getString(R$string.tip_force_bind_normal);
        AbstractC5868k.m23673e(string, "mContext.resources.getSt…ng.tip_force_bind_normal)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f20192a)}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        textView.setText(Html.fromHtml(format));
        ((TextView) findViewById(R$id.mBtnBind)).requestFocus();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.dialog_force_bind_normal);
        m19797f();
        m19794c();
    }
}
