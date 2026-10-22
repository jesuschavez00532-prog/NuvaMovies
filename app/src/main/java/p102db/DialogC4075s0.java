package p102db;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$style;
import com.umeng.analytics.pro.C3384f;
import ga.C4417e;
import ne.AbstractC5868k;
import p201k2.AbstractC5085b;
import p348u2.AbstractC7028e;

/* renamed from: db.s0 */
/* loaded from: classes2.dex */
public final class DialogC4075s0 extends Dialog implements View.OnClickListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4075s0(Context context) {
        super(context, R$style.InputPasswordDialog);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        setContentView(R$layout.dialog_not_keep_activities);
    }

    /* renamed from: a */
    private final void m17109a() {
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        ((Button) findViewById(R$id.mBtnSet)).setOnClickListener(this);
        ((Button) findViewById(R$id.mBtnLater)).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mBtnSet) {
            getContext().startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
            AbstractC7028e.m27115a("nkad");
            C4417e c4417e = C4417e.f19115a;
            Context context = getContext();
            AbstractC5868k.m23673e(context, C3384f.f14563X);
            String m20598h = AbstractC5085b.m20598h(getContext());
            AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
            C4417e.m18497f(c4417e, context, m20598h, false, false, 12, null);
            dismiss();
            return;
        }
        if (id2 == R$id.mBtnLater) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m17109a();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
    }
}
