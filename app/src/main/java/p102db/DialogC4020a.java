package p102db;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.umeng.analytics.pro.C3384f;
import java.util.Arrays;
import ne.AbstractC5868k;
import ne.C5881x;

/* renamed from: db.a */
/* loaded from: classes2.dex */
public final class DialogC4020a extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private a f17820a;

    /* renamed from: db.a$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo17015a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4020a(Context context) {
        super(context, R$style.InputPasswordDialog);
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        setContentView(R$layout.dialog_auto_exit);
    }

    /* renamed from: c */
    private final void m17012c() {
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        ((Button) findViewById(R$id.mContinueUseBtn)).setOnClickListener(this);
    }

    /* renamed from: a */
    public final void m17013a(String str) {
        AbstractC5868k.m23674f(str, "msg");
        TextView textView = (TextView) findViewById(R$id.mContentText);
        C5881x c5881x = C5881x.f23415a;
        String string = getContext().getResources().getString(R$string.exit_app_content);
        AbstractC5868k.m23673e(string, "context.resources.getStr….string.exit_app_content)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        textView.setText(Html.fromHtml(format));
    }

    /* renamed from: b */
    public final void m17014b(a aVar) {
        this.f17820a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        if (view.getId() == R$id.mContinueUseBtn) {
            dismiss();
            a aVar = this.f17820a;
            if (aVar != null) {
                aVar.mo17015a();
            }
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m17012c();
    }
}
