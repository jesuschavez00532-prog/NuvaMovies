package p102db;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$style;

/* renamed from: db.b */
/* loaded from: classes2.dex */
public class DialogC4023b extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private TextView f17823a;

    /* renamed from: b */
    private Button f17824b;

    /* renamed from: c */
    private Button f17825c;

    /* renamed from: d */
    private String f17826d;

    /* renamed from: e */
    private String f17827e;

    /* renamed from: f */
    private String f17828f;

    /* renamed from: g */
    private DialogInterface.OnClickListener f17829g;

    /* renamed from: h */
    private DialogInterface.OnClickListener f17830h;

    /* renamed from: i */
    private boolean f17831i;

    public DialogC4023b(Context context, int i10) {
        this(context, R$style.BasePopDialog, i10);
    }

    /* renamed from: a */
    public Button m17016a() {
        return this.f17824b;
    }

    /* renamed from: b */
    public void m17017b(String str) {
        this.f17826d = str;
    }

    /* renamed from: c */
    public Button m17018c(String str, DialogInterface.OnClickListener onClickListener) {
        this.f17828f = str;
        this.f17830h = onClickListener;
        return this.f17825c;
    }

    /* renamed from: d */
    public Button m17019d(String str, DialogInterface.OnClickListener onClickListener) {
        this.f17827e = str;
        this.f17829g = onClickListener;
        return this.f17824b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R$id.layout_double_dialog_positive_btn) {
            DialogInterface.OnClickListener onClickListener = this.f17829g;
            if (onClickListener != null) {
                onClickListener.onClick(this, 0);
            }
            dismiss();
            return;
        }
        if (id2 == R$id.layout_double_dialog_negative_btn) {
            DialogInterface.OnClickListener onClickListener2 = this.f17830h;
            if (onClickListener2 != null) {
                onClickListener2.onClick(this, 1);
            }
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (this.f17823a != null && !TextUtils.isEmpty(this.f17826d)) {
            this.f17823a.setText(this.f17826d);
            if (!this.f17831i) {
                this.f17823a.setGravity(17);
            }
        }
        if (this.f17824b != null && !TextUtils.isEmpty(this.f17827e)) {
            this.f17824b.setText(this.f17827e);
            this.f17824b.setVisibility(0);
            this.f17823a.setGravity(1);
            this.f17824b.setOnClickListener(this);
        }
        if (this.f17825c != null && !TextUtils.isEmpty(this.f17828f)) {
            this.f17825c.setText(this.f17828f);
            this.f17825c.setVisibility(0);
            this.f17823a.setGravity(1);
            this.f17825c.setOnClickListener(this);
        }
    }

    public DialogC4023b(Context context, int i10, int i11) {
        super(context, i10);
        setContentView(i11);
        this.f17823a = (TextView) findViewById(R$id.layout_double_dialog_msg_tv);
        this.f17824b = (Button) findViewById(R$id.layout_double_dialog_positive_btn);
        this.f17825c = (Button) findViewById(R$id.layout_double_dialog_negative_btn);
    }
}
