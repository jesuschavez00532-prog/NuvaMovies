package p149gc;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.swlauthnew.R$id;
import com.swlauthnew.R$string;
import com.swlauthnew.R$style;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import mc.C5634i;
import p201k2.AbstractC5095l;
import p211kc.AbstractC5147b;
import p211kc.AbstractC5149d;
import p348u2.AbstractC7029f;

/* renamed from: gc.a */
/* loaded from: classes.dex */
public class DialogC4424a extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private String f19144a;

    /* renamed from: b */
    private int f19145b;

    /* renamed from: c */
    private Context f19146c;

    /* renamed from: d */
    private String f19147d;

    /* renamed from: e */
    private String f19148e;

    /* renamed from: f */
    private ImageView f19149f;

    /* renamed from: g */
    private TextView f19150g;

    /* renamed from: h */
    private TextView f19151h;

    /* renamed from: i */
    private TextView f19152i;

    /* renamed from: j */
    private TextView f19153j;

    /* renamed from: k */
    private String f19154k;

    /* renamed from: l */
    private String f19155l;

    /* renamed from: m */
    private String f19156m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.a$a */
    /* loaded from: classes.dex */
    public class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Bitmap bitmap) {
            if (bitmap != null) {
                DialogC4424a.this.f19149f.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.a$b */
    /* loaded from: classes.dex */
    public class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.a$c */
    /* loaded from: classes.dex */
    public class c implements Function {
        c() {
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap apply(String str) {
            return AbstractC5095l.m20689c(str, 180, 180);
        }
    }

    public DialogC4424a(Context context, int i10, int i11, String str, String str2, String str3, String str4, String str5) {
        super(context, i10);
        this.f19144a = "AppAuthDialog";
        this.f19145b = i11;
        this.f19146c = context;
        this.f19154k = str;
        this.f19155l = str2;
        this.f19147d = str3.trim();
        this.f19148e = str5;
        this.f19156m = str4;
    }

    /* renamed from: c */
    private void m18548c() {
        Observable.just(this.f19156m).map(new c()).compose(AbstractC7029f.m27121b()).subscribe(new a(), new b());
    }

    /* renamed from: d */
    private void m18549d() {
        this.f19150g.setText(this.f19154k);
        this.f19151h.setText(this.f19155l);
        if (!TextUtils.isEmpty(this.f19156m)) {
            this.f19149f.setVisibility(0);
            m18548c();
        } else {
            this.f19149f.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f19148e)) {
            this.f19152i.setText(this.f19148e);
        } else {
            this.f19152i.setText(this.f19146c.getText(R$string.have_activation_code_new));
        }
        this.f19152i.requestFocus();
        if (!AbstractC5147b.m20813b(this.f19146c)) {
            Context context = this.f19146c;
            AbstractC5149d.m20821a(context, context.getString(R$string.net_state_tip_new));
        }
    }

    /* renamed from: e */
    private void m18550e() {
        this.f19150g = (TextView) findViewById(R$id.mTextTitle);
        this.f19151h = (TextView) findViewById(R$id.mTextTips);
        this.f19152i = (TextView) findViewById(R$id.mTextUseCode);
        this.f19153j = (TextView) findViewById(R$id.mTextContinue);
        this.f19149f = (ImageView) findViewById(R$id.mImageQRCode);
    }

    /* renamed from: f */
    private void m18551f() {
        this.f19152i.setOnClickListener(this);
        this.f19153j.setOnClickListener(this);
    }

    /* renamed from: b */
    public void m18552b() {
        this.f19153j.requestFocus();
        this.f19152i.requestFocus();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.mTextUseCode) {
            if (this.f19152i.getText() == this.f19146c.getString(R$string.have_activation_code_new)) {
                if (TextUtils.isEmpty(this.f19147d)) {
                    new DialogC4426c(this.f19146c, R$style.dialog, 7, "", this.f19147d).show();
                } else {
                    new DialogC4427d(this.f19146c, R$style.dialog, this.f19147d).show();
                }
            } else if (this.f19152i.getText() == this.f19146c.getString(R$string.authmanager_purchase)) {
                C5634i.m22843d("http://module_mine/UserCenterActivity").m25255u("SELECTED_POSITION", 1).m25254t(262144).m25247k(this.f19146c);
            }
            dismiss();
            return;
        }
        if (view.getId() == R$id.mTextContinue) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f19145b);
        m18550e();
        m18551f();
        m18549d();
    }
}
