package p222l7;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.tv.R;
import com.interactive.brasiliptv.R$id;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import ga.C4417e;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import p201k2.AbstractC5085b;
import p348u2.AbstractC7028e;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7598p1;
import p400xa.C7589m1;

/* renamed from: l7.b */
/* loaded from: classes2.dex */
public final class DialogC5423b extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private Context f22063a;

    /* renamed from: b */
    private InterfaceC5642a f22064b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC5423b(Context context, InterfaceC5642a interfaceC5642a) {
        super(context, R.style.InputPasswordDialog);
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(interfaceC5642a, "callback");
        this.f22063a = context;
        this.f22064b = interfaceC5642a;
        setContentView(R.layout.dialog_permission);
    }

    /* renamed from: b */
    private final void m21830b() {
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        Button button = (Button) findViewById(R$id.mBtnSet);
        AbstractC5868k.m23673e(button, "mBtnSet");
        AbstractC7555b0.m28955i(button, this);
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l7.a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                DialogC5423b.m21831c(DialogC5423b.this, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m21831c(DialogC5423b dialogC5423b, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogC5423b, "this$0");
        AbstractC7028e.m27115a(C3325bt.f14186aD);
        C4417e c4417e = C4417e.f19115a;
        Context context = dialogC5423b.getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        String m20598h = AbstractC5085b.m20598h(dialogC5423b.f22063a);
        AbstractC5868k.m23673e(m20598h, "getPackageName(mContext)");
        C4417e.m18497f(c4417e, context, m20598h, false, false, 12, null);
        dialogC5423b.dismiss();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        if (view.getId() == R.id.mBtnSet) {
            try {
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts(Constants.KEY_PACKAGE, AbstractC5085b.m20598h(this.f22063a), null));
                this.f22063a.startActivity(intent);
            } catch (Exception unused) {
                C7589m1.f27886a.m29124G();
                AbstractC7598p1.m29244h(getContext(), getContext().getString(R.string.you_have_not_granted_app_permissions), new int[0]);
            }
            this.f22064b.invoke();
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        TextView textView = (TextView) findViewById(R$id.mTvWay);
        if (Build.VERSION.SDK_INT >= 33) {
            string = this.f22063a.getString(R.string.storage_permission_to_set_tip_new);
        } else {
            string = this.f22063a.getString(R.string.storage_permission_to_set_tip);
        }
        textView.setText(string);
        m21830b();
    }
}
