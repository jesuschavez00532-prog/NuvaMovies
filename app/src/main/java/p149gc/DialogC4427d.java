package p149gc;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import be.C1328x;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.swlauthnew.R$id;
import com.swlauthnew.R$layout;
import com.swlauthnew.R$string;
import com.swlauthnew.R$style;
import me.InterfaceC5660l;
import p170i2.C4842a;
import p211kc.AbstractC5147b;

/* renamed from: gc.d */
/* loaded from: classes.dex */
public class DialogC4427d extends Dialog implements View.OnClickListener, TextWatcher {

    /* renamed from: a */
    private Context f19208a;

    /* renamed from: b */
    private String f19209b;

    /* renamed from: c */
    private String f19210c;

    /* renamed from: d */
    private String f19211d;

    /* renamed from: e */
    private LinearLayout f19212e;

    /* renamed from: f */
    private LinearLayout f19213f;

    /* renamed from: g */
    private TextView f19214g;

    /* renamed from: h */
    private TextView f19215h;

    /* renamed from: i */
    private TextView f19216i;

    /* renamed from: j */
    private TextView f19217j;

    /* renamed from: k */
    private TextView f19218k;

    /* renamed from: l */
    private EditText f19219l;

    /* renamed from: m */
    private EditText f19220m;

    /* renamed from: n */
    private EditText f19221n;

    /* renamed from: o */
    private EditText f19222o;

    /* renamed from: p */
    private Button f19223p;

    /* renamed from: q */
    private Button f19224q;

    /* renamed from: r */
    private RelativeLayout f19225r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.d$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5660l {
        a() {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1328x mo542f(String str) {
            if (DialogC4427d.this.f19208a != null && DialogC4427d.this.f19218k != null) {
                DialogC4427d.this.f19218k.setText(DialogC4427d.this.f19208a.getString(R$string.questions_contact, str));
            }
            return null;
        }
    }

    public DialogC4427d(Context context, int i10, String str) {
        super(context, i10);
        this.f19211d = "";
        this.f19208a = context;
        this.f19209b = str;
    }

    /* renamed from: h */
    private void m18607h(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f19225r.setVisibility(8);
            return;
        }
        this.f19225r.setVisibility(0);
        this.f19217j.setText(str);
        this.f19217j.setSelected(true);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        View currentFocus;
        m18607h("");
        if (TextUtils.isEmpty(this.f19219l.getText()) && TextUtils.isEmpty(this.f19220m.getText()) && TextUtils.isEmpty(this.f19221n.getText()) && TextUtils.isEmpty(this.f19222o.getText())) {
            this.f19223p.setText(R$string.button_cancel_new);
        } else {
            this.f19223p.setText(R$string.button_reset);
        }
        if (editable.length() == 4 && (currentFocus = getCurrentFocus()) != null) {
            int id2 = currentFocus.getId();
            if (id2 == R$id.mEditFirst) {
                this.f19220m.requestFocus();
                return;
            }
            if (id2 == R$id.mEditSecond) {
                this.f19221n.requestFocus();
            } else if (id2 == R$id.mEditThird) {
                this.f19222o.requestFocus();
            } else if (id2 == R$id.mEditFourth) {
                this.f19224q.requestFocus();
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: c */
    public void m18608c() {
        this.f19219l.getEditableText().clear();
        this.f19220m.getEditableText().clear();
        this.f19221n.getEditableText().clear();
        this.f19222o.getEditableText().clear();
        this.f19211d = "";
    }

    /* renamed from: d */
    public void m18609d() {
        this.f19212e = (LinearLayout) findViewById(R$id.mLayoutInputCode);
        this.f19213f = (LinearLayout) findViewById(R$id.mLayoutButton);
        this.f19214g = (TextView) findViewById(R$id.mTextTitle);
        this.f19215h = (TextView) findViewById(R$id.mTextShowCode);
        this.f19219l = (EditText) findViewById(R$id.mEditFirst);
        this.f19220m = (EditText) findViewById(R$id.mEditSecond);
        this.f19221n = (EditText) findViewById(R$id.mEditThird);
        this.f19222o = (EditText) findViewById(R$id.mEditFourth);
        this.f19223p = (Button) findViewById(R$id.mButtonCancelOrReEnter);
        this.f19224q = (Button) findViewById(R$id.mButtonConfirm);
        this.f19216i = (TextView) findViewById(R$id.mTextInputTip);
        this.f19225r = (RelativeLayout) findViewById(R$id.mLayoutBottomBar);
        this.f19217j = (TextView) findViewById(R$id.mTextNotify);
        this.f19218k = (TextView) findViewById(R$id.mTextQuestion);
        C4842a.f20329a.m19921b().mo19978a(new a());
        m18612g(true);
        getWindow().setSoftInputMode(2);
    }

    /* renamed from: e */
    public void m18610e() {
        if (AbstractC5147b.m20812a()) {
            this.f19210c = "en";
        } else {
            this.f19210c = "zh";
        }
        if (!AbstractC5147b.m20813b(this.f19208a)) {
            m18607h(this.f19208a.getString(R$string.net_state_tip_new));
        }
    }

    /* renamed from: f */
    public void m18611f() {
        this.f19224q.setOnClickListener(this);
        this.f19223p.setOnClickListener(this);
        this.f19219l.addTextChangedListener(this);
        this.f19220m.addTextChangedListener(this);
        this.f19221n.addTextChangedListener(this);
        this.f19222o.addTextChangedListener(this);
    }

    /* renamed from: g */
    public void m18612g(boolean z10) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        TextView textView = this.f19216i;
        if (z10) {
            i10 = R$string.enter_code_redemption;
        } else {
            i10 = R$string.confirm_again_new;
        }
        textView.setText(i10);
        LinearLayout linearLayout = this.f19212e;
        int i13 = 0;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        Button button = this.f19223p;
        if (z10) {
            i12 = R$string.button_cancel_new;
        } else {
            i12 = R$string.button_re_enter_new;
        }
        button.setText(i12);
        TextView textView2 = this.f19215h;
        if (z10) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        this.f19215h.setText(this.f19211d);
        if (!z10) {
            this.f19224q.setText(R$string.button_confirm_new);
        } else {
            this.f19224q.setText(R$string.button_confirm_new);
        }
        if (z10) {
            this.f19219l.requestFocus();
        } else {
            this.f19224q.requestFocus();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.mButtonCancelOrReEnter) {
            CharSequence text = this.f19223p.getText();
            Context context = this.f19208a;
            int i10 = R$string.button_cancel_new;
            if (!text.equals(context.getString(i10)) && !this.f19223p.getText().equals(this.f19208a.getString(R$string.button_reset))) {
                m18608c();
                m18612g(true);
                return;
            } else if (this.f19223p.getText().equals(this.f19208a.getString(i10))) {
                dismiss();
                return;
            } else {
                m18608c();
                return;
            }
        }
        if (view.getId() == R$id.mButtonConfirm) {
            if (this.f19212e.getVisibility() == 0) {
                String str = ((Object) this.f19219l.getText()) + Operator.Operation.MINUS + ((Object) this.f19220m.getText()) + Operator.Operation.MINUS + ((Object) this.f19221n.getText()) + Operator.Operation.MINUS + ((Object) this.f19222o.getText());
                this.f19211d = str;
                str.trim();
                if (this.f19211d.length() == 19) {
                    m18612g(false);
                    return;
                } else {
                    m18607h(this.f19208a.getString(R$string.redemption_invalid_code));
                    return;
                }
            }
            new DialogC4426c(this.f19208a, R$style.dialog, -1, this.f19211d, this.f19209b).show();
            dismiss();
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.dialog_input_code_brasiliptv);
        m18609d();
        m18611f();
        m18610e();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
