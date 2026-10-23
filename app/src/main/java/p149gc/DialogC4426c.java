package p149gc;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.result.ExchangeResult;
import com.request.result.ExchangeResultData;
import com.swlauthnew.R$color;
import com.swlauthnew.R$drawable;
import com.swlauthnew.R$id;
import com.swlauthnew.R$layout;
import com.swlauthnew.R$string;
import com.swlauthnew.R$style;
import com.zhy.autolayout.AutoLinearLayout;
import org.android.agoo.message.MessageService;
import p141g2.C4338b;
import p153h2.AbstractC4509b;
import p163hc.InterfaceC4815a;
import p170i2.C4842a;
import p180ic.C4930a;
import p201k2.AbstractC5086c;
import p201k2.C5096m;
import p211kc.AbstractC5147b;
import p211kc.AbstractC5148c;
import p211kc.AbstractC5149d;
import p371vb.C7252a;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: gc.c */
/* loaded from: classes.dex */
public class DialogC4426c extends Dialog implements View.OnClickListener, InterfaceC4815a {

    /* renamed from: A */
    private TextView f19168A;

    /* renamed from: B */
    private TextView f19169B;

    /* renamed from: C */
    private TextView f19170C;

    /* renamed from: D */
    private Button f19171D;

    /* renamed from: E */
    private Button f19172E;

    /* renamed from: F */
    private C4930a f19173F;

    /* renamed from: G */
    private ExchangeResult f19174G;

    /* renamed from: a */
    private final String f19175a;

    /* renamed from: b */
    private Context f19176b;

    /* renamed from: c */
    private String f19177c;

    /* renamed from: d */
    private int f19178d;

    /* renamed from: e */
    private String f19179e;

    /* renamed from: f */
    private String f19180f;

    /* renamed from: g */
    private AnimationDrawable f19181g;

    /* renamed from: h */
    private int f19182h;

    /* renamed from: i */
    private int f19183i;

    /* renamed from: j */
    SharedPreferences f19184j;

    /* renamed from: k */
    SharedPreferences.Editor f19185k;

    /* renamed from: l */
    private TextView f19186l;

    /* renamed from: m */
    private TextView f19187m;

    /* renamed from: n */
    private LinearLayout f19188n;

    /* renamed from: o */
    private ImageView f19189o;

    /* renamed from: p */
    private Button f19190p;

    /* renamed from: q */
    private LinearLayout f19191q;

    /* renamed from: r */
    private LinearLayout f19192r;

    /* renamed from: s */
    private LinearLayout f19193s;

    /* renamed from: t */
    private LinearLayout f19194t;

    /* renamed from: u */
    private LinearLayout f19195u;

    /* renamed from: v */
    private TextView f19196v;

    /* renamed from: w */
    private TextView f19197w;

    /* renamed from: x */
    private TextView f19198x;

    /* renamed from: y */
    private TextView f19199y;

    /* renamed from: z */
    private TextView f19200z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.c$a */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnDismissListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            DialogC4426c dialogC4426c = DialogC4426c.this;
            dialogC4426c.f19176b = dialogC4426c.getContext();
            if (DialogC4426c.this.f19176b instanceof ContextWrapper) {
                DialogC4426c dialogC4426c2 = DialogC4426c.this;
                dialogC4426c2.f19176b = ((ContextWrapper) dialogC4426c2.f19176b).getBaseContext();
            }
            if (C5096m.f20979a.m20692c()) {
                C7252a c7252a = C7252a.f27087a;
                if (c7252a.m28073h().getData().getBindMail().equals(MessageService.MSG_DB_READY_REPORT) && c7252a.m28073h().getData().getBindMobile().equals(MessageService.MSG_DB_READY_REPORT) && DialogC4426c.this.f19177c.equals(DialogC4426c.this.f19176b.getString(R$string.redemption_success_see_result))) {
                    C4842a.f20329a.m19921b().mo19987j(((AbstractActivityC0712e) DialogC4426c.this.f19176b).m3294d4(), DialogC4426c.this.f19176b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.c$b */
    /* loaded from: classes.dex */
    public class b implements f {
        b() {
        }

        @Override // p149gc.DialogC4426c.f
        /* renamed from: a */
        public void mo18604a(long j10) {
            if (j10 == 1) {
                DialogC4426c.this.m18564F();
            } else if (j10 == 2) {
                DialogC4426c.this.m18563E(3);
            } else {
                DialogC4426c.this.m18563E(6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.c$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f19203a;

        c(int i10) {
            this.f19203a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            String str = null;
            int i11 = 0;
            LinearLayout linearLayout = DialogC4426c.this.f19191q;
            int i12 = 0;
            if (this.f19203a == 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            linearLayout.setVisibility(i10);
            TextView textView = DialogC4426c.this.f19186l;
            String str2 = "";
            if (this.f19203a == 0) {
                str = DialogC4426c.this.f19179e;
            } else {
                str = "";
            }
            textView.setText(str);
            LinearLayout linearLayout2 = DialogC4426c.this.f19188n;
            if (this.f19203a == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
            TextView textView2 = DialogC4426c.this.f19187m;
            if (this.f19203a == 1) {
                str2 = DialogC4426c.this.f19177c;
            }
            textView2.setText(str2);
            if (!DialogC4426c.this.f19177c.equals(DialogC4426c.this.f19176b.getString(R$string.redemption_success_see_result)) && !DialogC4426c.this.f19177c.equals(DialogC4426c.this.f19176b.getString(R$string.redemption_success)) && !DialogC4426c.this.f19177c.equals(DialogC4426c.this.f19176b.getString(R$string.redemption_code_used_see_result))) {
                DialogC4426c.this.f19187m.setTextColor(DialogC4426c.this.f19176b.getResources().getColor(R$color.color_red));
            } else {
                DialogC4426c.this.f19187m.setTextColor(DialogC4426c.this.f19176b.getResources().getColor(R$color.color_green));
            }
            if (this.f19203a == 1) {
                DialogC4426c.this.f19190p.requestFocus();
            }
            LinearLayout linearLayout3 = DialogC4426c.this.f19192r;
            if (this.f19203a != 2) {
                i12 = 8;
            }
            linearLayout3.setVisibility(i12);
            if (this.f19203a == 2) {
                DialogC4426c.this.f19197w.setText(DialogC4426c.this.f19179e);
                DialogC4426c.this.f19171D.requestFocus();
                DialogC4426c.this.f19198x.setText(DialogC4426c.this.f19176b.getString(R$string.redeem_failed));
                if (DialogC4426c.this.f19174G != null && DialogC4426c.this.f19174G.getData() != null) {
                    String returnCode = DialogC4426c.this.f19174G.getReturnCode();
                    ExchangeResultData data = DialogC4426c.this.f19174G.getData();
                    if (returnCode.equals("aaa40006")) {
                        DialogC4426c.this.f19199y.setText(R$string.redeem_unuse);
                        DialogC4426c.this.f19200z.setText(R$string.redeem_valid_until);
                        DialogC4426c dialogC4426c = DialogC4426c.this;
                        dialogC4426c.m18568N(dialogC4426c.f19168A, AbstractC5086c.m20609b("yyyy-MM-dd HH:mm:ss", "dd/MM/yyyy", data.getCodeInvalidTime()));
                        DialogC4426c.this.f19169B.setText(R$string.redeem_service_days);
                        Integer assAuthDays = data.getAssAuthDays();
                        if (assAuthDays != null) {
                            DialogC4426c dialogC4426c2 = DialogC4426c.this;
                            dialogC4426c2.m18568N(dialogC4426c2.f19170C, assAuthDays.toString());
                        }
                        DialogC4426c.this.f19196v.setText(R$string.redeem_already_used_tips);
                        if (TextUtils.isEmpty(data.getCodeInvalidTime())) {
                            DialogC4426c.this.f19194t.setVisibility(8);
                        }
                    } else if (returnCode.equals("aaa40005")) {
                        DialogC4426c.this.f19199y.setText(R$string.redeem_unuse);
                        DialogC4426c.this.f19200z.setText(R$string.redeem_valid_until);
                        DialogC4426c dialogC4426c3 = DialogC4426c.this;
                        dialogC4426c3.m18568N(dialogC4426c3.f19168A, AbstractC5086c.m20609b("yyyy-MM-dd HH:mm:ss", "dd/MM/yyyy", data.getCodeInvalidTime()));
                        DialogC4426c.this.f19169B.setText(R$string.redeem_service_days);
                        Integer assAuthDays2 = data.getAssAuthDays();
                        if (assAuthDays2 != null) {
                            DialogC4426c dialogC4426c4 = DialogC4426c.this;
                            dialogC4426c4.m18568N(dialogC4426c4.f19170C, assAuthDays2.toString());
                        }
                        DialogC4426c.this.f19196v.setText(R$string.redeem_only_mobile_tips);
                        if (TextUtils.isEmpty(data.getCodeInvalidTime())) {
                            DialogC4426c.this.f19194t.setVisibility(8);
                        }
                    } else if (returnCode.equals("aaa40004")) {
                        DialogC4426c.this.f19199y.setText(R$string.redeem_unuse);
                        DialogC4426c.this.f19200z.setText(R$string.redeem_valid_until);
                        DialogC4426c dialogC4426c5 = DialogC4426c.this;
                        dialogC4426c5.m18568N(dialogC4426c5.f19168A, AbstractC5086c.m20609b("yyyy-MM-dd HH:mm:ss", "dd/MM/yyyy", data.getCodeInvalidTime()));
                        DialogC4426c.this.f19169B.setText(R$string.redeem_service_days);
                        Integer assAuthDays3 = data.getAssAuthDays();
                        if (assAuthDays3 != null) {
                            DialogC4426c dialogC4426c6 = DialogC4426c.this;
                            dialogC4426c6.m18568N(dialogC4426c6.f19170C, assAuthDays3.toString());
                        }
                        DialogC4426c.this.f19196v.setText(R$string.redeem_only_expires_tips);
                        if (TextUtils.isEmpty(data.getCodeInvalidTime())) {
                            DialogC4426c.this.f19194t.setVisibility(8);
                        }
                    } else if (returnCode.equals("aaa40003")) {
                        DialogC4426c.this.f19199y.setText(R$string.redeem_invalid);
                        DialogC4426c.this.f19194t.setVisibility(8);
                        DialogC4426c.this.f19195u.setVisibility(8);
                        DialogC4426c.this.m18569P(AbstractC7786b.m30163g(55));
                        DialogC4426c.this.f19196v.setText(R$string.redeem_invalid_tips);
                    } else if (returnCode.equals("aaa40002")) {
                        DialogC4426c.this.f19199y.setText(R$string.redeem_used);
                        DialogC4426c.this.f19200z.setText(R$string.redeem_time_use);
                        DialogC4426c dialogC4426c7 = DialogC4426c.this;
                        dialogC4426c7.m18568N(dialogC4426c7.f19168A, AbstractC5086c.m20609b("yyyy-MM-dd HH:mm:ss", "dd/MM/yyyy HH:mm", data.getExchangeDate()));
                        DialogC4426c.this.f19195u.setVisibility(8);
                        DialogC4426c.this.f19196v.setText(R$string.redeem_used_tips);
                        if (TextUtils.isEmpty(data.getExchangeDate())) {
                            DialogC4426c.this.f19194t.setVisibility(8);
                        }
                    } else if (returnCode.equals("aaa40001")) {
                        DialogC4426c.this.f19199y.setText(R$string.redeem_expired);
                        DialogC4426c.this.f19200z.setText(R$string.redeem_valid_until);
                        DialogC4426c dialogC4426c8 = DialogC4426c.this;
                        dialogC4426c8.m18568N(dialogC4426c8.f19168A, AbstractC5086c.m20609b("yyyy-MM-dd HH:mm:ss", "dd/MM/yyyy", data.getCodeInvalidTime()));
                        DialogC4426c.this.f19195u.setVisibility(8);
                        DialogC4426c.this.f19196v.setVisibility(8);
                        if (TextUtils.isEmpty(data.getCodeInvalidTime())) {
                            DialogC4426c.this.f19194t.setVisibility(8);
                        }
                    } else {
                        DialogC4426c.this.f19193s.setVisibility(8);
                        DialogC4426c.this.f19194t.setVisibility(8);
                        DialogC4426c.this.f19195u.setVisibility(8);
                        DialogC4426c.this.f19196v.setText(DialogC4426c.this.f19177c);
                    }
                } else {
                    DialogC4426c.this.f19193s.setVisibility(8);
                    DialogC4426c.this.f19194t.setVisibility(8);
                    DialogC4426c.this.f19195u.setVisibility(8);
                    DialogC4426c.this.f19196v.setText(DialogC4426c.this.f19177c);
                    return;
                }
            }
            if (DialogC4426c.this.f19181g != null) {
                if (this.f19203a == 0) {
                    DialogC4426c.this.f19181g.start();
                } else {
                    DialogC4426c.this.f19181g.stop();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.c$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ f f19205a;

        d(f fVar) {
            this.f19205a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = DialogC4426c.this.f19184j.getString("LastTime", "");
            String m18597H = DialogC4426c.this.m18597H();
            if (TextUtils.isEmpty(m18597H)) {
                DialogC4426c.this.f19183i = -1;
            } else if (AbstractC5148c.m20819f(string, m18597H)) {
                DialogC4426c.this.f19183i = 1;
            } else {
                DialogC4426c.this.f19183i = 2;
            }
            this.f19205a.mo18604a(DialogC4426c.this.f19183i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.c$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogC4426c.this.f19185k.putString("LastTime", DialogC4426c.this.m18597H());
            DialogC4426c.this.f19185k.commit();
        }
    }

    /* renamed from: gc.c$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo18604a(long j10);
    }

    public DialogC4426c(Context context, int i10, int i11, String str, String str2) {
        super(context, i10);
        this.f19175a = "ExchangeDialog";
        this.f19177c = "";
        this.f19182h = 0;
        this.f19183i = -1;
        this.f19176b = context;
        this.f19178d = i11;
        this.f19179e = str;
        this.f19180f = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m18563E(int i10) {
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 3) {
                    if (i10 != 10) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    this.f19177c = this.f19176b.getString(R$string.server_timeout_new);
                                    m18602Q(2);
                                    return;
                                } else {
                                    this.f19177c = this.f19176b.getString(R$string.empty_sn_new);
                                    m18602Q(1);
                                    return;
                                }
                            }
                            this.f19177c = this.f19176b.getString(R$string.server_timeout_new);
                            m18602Q(2);
                            return;
                        }
                        this.f19177c = this.f19176b.getString(R$string.redemption_code_used);
                        m18602Q(2);
                        return;
                    }
                    m18602Q(2);
                    return;
                }
                this.f19177c = this.f19176b.getString(R$string.input_error_tip_new);
                m18602Q(1);
                return;
            }
            this.f19177c = this.f19176b.getString(R$string.redemption_success_see_result);
            m18602Q(1);
            C7709c.m29787d().m29801m(new C4338b());
            C4842a.f20329a.m19921b().mo19988k();
            return;
        }
        AbstractC4509b.m18870c("ExchangeDialog", "Activing", new Object[0]);
        m18602Q(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m18564F() {
        if (AbstractC5147b.m20813b(this.f19176b)) {
            m18566K();
            return;
        }
        if (this.f19182h <= 5) {
            Context context = this.f19176b;
            AbstractC5149d.m20821a(context, context.getString(R$string.net_state_tip_new));
        }
        this.f19182h++;
    }

    /* renamed from: G */
    private void m18565G(f fVar) {
        new Thread(new d(fVar)).start();
    }

    /* renamed from: K */
    private void m18566K() {
        if (this.f19173F == null) {
            this.f19173F = new C4930a(this);
        }
        this.f19173F.m20264c(this.f19179e.replaceAll(Operator.Operation.MINUS, "").trim());
    }

    /* renamed from: L */
    private void m18567L() {
        new Thread(new e()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m18568N(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m18569P(int i10) {
        AutoLinearLayout.C3911a c3911a = new AutoLinearLayout.C3911a(-2, -2);
        ((ViewGroup.MarginLayoutParams) c3911a).topMargin = i10;
        ((ViewGroup.MarginLayoutParams) c3911a).leftMargin = AbstractC7786b.m30166j(74);
        ((ViewGroup.MarginLayoutParams) c3911a).rightMargin = AbstractC7786b.m30166j(74);
        this.f19196v.setLayoutParams(c3911a);
        this.f19196v.setTextSize(0, AbstractC7786b.m30165i() * 24.0f);
    }

    /* renamed from: R */
    private void m18570R(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!"aaa100028".equals(str) && !"aaa100027".equals(str) && !"aaa100083".equals(str)) {
                if (str.equals("diamond100004")) {
                    m18563E(5);
                    return;
                }
                if (str.equals("diamond100000")) {
                    this.f19177c = this.f19176b.getString(R$string.redemption_invalid_code);
                    m18563E(10);
                    return;
                }
                if (str.equals("diamond100003")) {
                    this.f19177c = this.f19176b.getString(R$string.redemption_invalid_code);
                    m18563E(10);
                    return;
                }
                if (str.equals("diamond100005")) {
                    this.f19177c = this.f19176b.getString(R$string.redemption_invalid_code);
                    m18563E(10);
                    return;
                }
                if (str.equals("diamond100009")) {
                    m18563E(3);
                    return;
                }
                if (str.equals("diamond100020")) {
                    this.f19177c = this.f19176b.getString(R$string.redemption_code_limited);
                    m18563E(10);
                    return;
                }
                if (str.equals("aaa100005")) {
                    this.f19177c = this.f19176b.getString(R$string.activation_eg7) + this.f19176b.getString(R$string.activation_failed);
                    m18563E(10);
                    return;
                }
                if (str.equals("aaa100033")) {
                    this.f19177c = this.f19176b.getString(R$string.activation_eg8) + this.f19176b.getString(R$string.activation_failed);
                    m18563E(10);
                    return;
                }
                if (str.equals("diamond100006")) {
                    this.f19177c = this.f19176b.getString(R$string.redemption_code_expired);
                    m18563E(10);
                    return;
                } else {
                    if (str.equals("aaa300003")) {
                        this.f19177c = this.f19176b.getString(R$string.activation_eg10) + this.f19176b.getString(R$string.activation_failed_and_code_used);
                        m18563E(10);
                        return;
                    }
                    this.f19177c = this.f19176b.getString(R$string.activation_failed);
                    m18563E(10);
                    return;
                }
            }
            new DialogC4430g(this.f19176b).show();
            dismiss();
        }
    }

    /* renamed from: H */
    public String m18597H() {
        String str = null;
        if (this.f19184j.getBoolean("is_baidu", true)) {
            str = AbstractC5148c.m20817d("http://www.baidu.com");
            if (TextUtils.isEmpty(str)) {
                this.f19185k.putBoolean("is_baidu", false);
                this.f19185k.commit();
            } else {
                this.f19185k.putBoolean("is_baidu", true);
                this.f19185k.commit();
            }
        } else {
            str = "";
        }
        if (!this.f19184j.getBoolean("is_baidu", true)) {
            str = AbstractC5148c.m20817d("http://www.google.com");
            if (TextUtils.isEmpty(str)) {
                this.f19185k.putBoolean("is_baidu", true);
                this.f19185k.commit();
            } else {
                this.f19185k.putBoolean("is_baidu", false);
                this.f19185k.commit();
            }
            if (this.f19184j.getBoolean("is_baidu", true)) {
                str = AbstractC5148c.m20817d("http://www.baidu.com");
                if (TextUtils.isEmpty(str)) {
                    this.f19185k.putBoolean("is_baidu", false);
                    this.f19185k.commit();
                } else {
                    this.f19185k.putBoolean("is_baidu", true);
                    this.f19185k.commit();
                }
            }
        }
        return str;
    }

    /* renamed from: I */
    public void m18598I() {
        this.f19189o.setImageResource(R$drawable.animation_activing);
        this.f19181g = (AnimationDrawable) this.f19189o.getDrawable();
        if (!AbstractC5147b.m20813b(this.f19176b)) {
            Context context = this.f19176b;
            AbstractC5149d.m20821a(context, context.getString(R$string.net_state_tip_new));
        }
        SharedPreferences sharedPreferences = this.f19176b.getSharedPreferences("AuthSharedPreferences", 0);
        this.f19184j = sharedPreferences;
        this.f19185k = sharedPreferences.edit();
        m18563E(this.f19178d);
        if (this.f19178d == -1) {
            m18565G(new b());
        }
    }

    /* renamed from: J */
    public void m18599J() {
        this.f19198x = (TextView) findViewById(R$id.mTextTitle);
        this.f19191q = (LinearLayout) findViewById(R$id.llActiving);
        this.f19186l = (TextView) findViewById(R$id.mTextShowCode);
        this.f19187m = (TextView) findViewById(R$id.mTextTips);
        this.f19188n = (LinearLayout) findViewById(R$id.mLayoutExit);
        this.f19189o = (ImageView) findViewById(R$id.mImageActiving);
        this.f19190p = (Button) findViewById(R$id.mButtonExit);
        this.f19192r = (LinearLayout) findViewById(R$id.llExchangeFail);
        this.f19193s = (LinearLayout) findViewById(R$id.llRemeedFail2);
        this.f19194t = (LinearLayout) findViewById(R$id.llRemeedFail3);
        this.f19195u = (LinearLayout) findViewById(R$id.llRemeedFail4);
        this.f19199y = (TextView) findViewById(R$id.tvRedeemCodeStatus);
        this.f19200z = (TextView) findViewById(R$id.tvRedeemTimeDes);
        this.f19169B = (TextView) findViewById(R$id.tvRedeemOtherDes);
        this.f19170C = (TextView) findViewById(R$id.tvRedeemOther);
        this.f19168A = (TextView) findViewById(R$id.tvRedeemTime);
        this.f19197w = (TextView) findViewById(R$id.tvRedeemCode);
        this.f19196v = (TextView) findViewById(R$id.tvRedeemTips);
        this.f19171D = (Button) findViewById(R$id.btnConfirm);
        this.f19172E = (Button) findViewById(R$id.btnReEnter);
    }

    /* renamed from: M */
    public void m18600M() {
        this.f19190p.setOnClickListener(this);
        this.f19171D.setOnClickListener(this);
        this.f19172E.setOnClickListener(this);
        setOnDismissListener(new a());
    }

    @Override // p163hc.InterfaceC4815a
    /* renamed from: O */
    public void mo18601O(String str) {
        m18570R(str);
    }

    /* renamed from: Q */
    public void m18602Q(int i10) {
        new Handler(Looper.getMainLooper()).post(new c(i10));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        C4930a c4930a = this.f19173F;
        if (c4930a != null) {
            c4930a.m20265d();
            this.f19173F = null;
        }
    }

    @Override // p163hc.InterfaceC4815a
    /* renamed from: h0 */
    public void mo18603h0(ExchangeResult exchangeResult) {
        this.f19174G = exchangeResult;
        if (exchangeResult != null && !TextUtils.isEmpty(exchangeResult.getReturnCode())) {
            if (exchangeResult.getData() != null && exchangeResult.getReturnCode().equals("3")) {
                m18567L();
            }
            if (TextUtils.isDigitsOnly(exchangeResult.getReturnCode())) {
                m18563E(Integer.parseInt(exchangeResult.getReturnCode()));
                return;
            } else {
                m18570R(exchangeResult.getReturnCode());
                return;
            }
        }
        m18563E(6);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.mButtonExit) {
            dismiss();
            return;
        }
        if (view.getId() == R$id.btnConfirm) {
            dismiss();
        } else if (view.getId() == R$id.btnReEnter) {
            new DialogC4427d(this.f19176b, R$style.dialog, this.f19180f).show();
            dismiss();
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.dialog_exchange_brasiliptv);
        m18599J();
        m18600M();
        m18598I();
    }
}
