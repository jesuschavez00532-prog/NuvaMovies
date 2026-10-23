package p330s9;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.mobile.autoupdate.R$id;
import com.mobile.autoupdate.R$layout;
import com.mobile.autoupdate.R$string;
import com.mobile.autoupdate.R$style;
import com.mobile.bean.UpdateBean;
import me.jessyan.autosize.utils.AutoSizeUtils;
import p264o9.C5942a;
import p300q9.C6355c;
import p355u9.AsyncTaskC7064d;
import p370v9.AbstractC7250a;

/* renamed from: s9.b */
/* loaded from: classes2.dex */
public class DialogC6774b extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private final UpdateBean f26067a;

    /* renamed from: b */
    private final C6355c f26068b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s9.b$a */
    /* loaded from: classes2.dex */
    public class a implements AsyncTaskC7064d.a {
        a() {
        }

        @Override // p355u9.AsyncTaskC7064d.a
        /* renamed from: a */
        public void mo22883a(String str) {
            DialogC6774b.this.f26068b.m25154p(str);
            C5942a.m24064e().m24070k(DialogC6774b.this.getContext(), DialogC6774b.this.f26068b, true);
        }
    }

    public DialogC6774b(Context context, UpdateBean updateBean, C6355c c6355c) {
        super(context, R$style.dialog_style);
        this.f26067a = updateBean;
        this.f26068b = c6355c;
    }

    /* renamed from: b */
    private String m26654b() {
        if (TextUtils.isEmpty(this.f26067a.getNote())) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        String[] split = this.f26067a.getNote().split(";");
        int i10 = 0;
        while (i10 < split.length) {
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(".");
            sb2.append(split[i10]);
            sb2.append("\n");
            i10 = i11;
        }
        return sb2.toString();
    }

    /* renamed from: c */
    private String m26655c() {
        return getContext().getString(R$string.normal_upgrade_version, this.f26067a.getVersionName());
    }

    /* renamed from: d */
    private void m26656d() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268697600);
        intent.setData(Uri.parse(this.f26068b.m25140b()));
        try {
            getContext().startActivity(intent);
        } catch (Exception unused) {
            AbstractC7250a.m28063a(getContext().getApplicationContext(), getContext().getApplicationContext().getString(R$string.error_hint_no_browser), 1);
        }
    }

    /* renamed from: e */
    public void m26657e() {
        C5942a.m24064e().m24069h(new C6775c(getContext()));
        new AsyncTaskC7064d(new a()).execute(this.f26068b.m25145g(), this.f26068b.m25144f());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.mTvOfficialDownloadUrl) {
            m26656d();
            return;
        }
        if (view.getId() == R$id.mBtnCancel) {
            dismiss();
        } else if (view.getId() == R$id.mBtnUpgrade) {
            m26657e();
            dismiss();
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        String m25146h = null;
        super.onCreate(bundle);
        setContentView(R$layout.dialog_normal_upgrade);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = AutoSizeUtils.dp2px(getContext(), 656.0f);
        attributes.height = AutoSizeUtils.dp2px(getContext(), 440.0f);
        getWindow().setAttributes(attributes);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        TextView textView = (TextView) findViewById(R$id.mTvVersionName);
        TextView textView2 = (TextView) findViewById(R$id.mStvReleaseNote);
        TextView textView3 = (TextView) findViewById(R$id.mTvDownloadHint);
        TextView textView4 = (TextView) findViewById(R$id.mTvOfficialDownloadUrl);
        TextView textView5 = (TextView) findViewById(R$id.mTvCurrentVersion);
        TextView textView6 = (TextView) findViewById(R$id.mTvUserId);
        TextView textView7 = (TextView) findViewById(R$id.mTvServiceEmail);
        Button button = (Button) findViewById(R$id.mBtnCancel);
        Button button2 = (Button) findViewById(R$id.mBtnUpgrade);
        textView.setText(m26655c());
        textView2.setText(m26654b());
        textView4.setPaintFlags(8);
        textView4.getPaint().setAntiAlias(true);
        textView5.setText(String.format(getContext().getString(R$string.update_current_version), this.f26068b.m25139a()));
        if (this.f26068b.m25148j()) {
            m25146h = this.f26068b.m25147i();
            if (m25146h.isEmpty()) {
                m25146h = this.f26068b.m25146h();
            }
        } else {
            m25146h = this.f26068b.m25146h();
        }
        if (m25146h.isEmpty()) {
            textView6.setVisibility(8);
        } else {
            textView6.setVisibility(0);
            textView6.setText(String.format(getContext().getString(R$string.update_account), m25146h));
        }
        textView7.setText(String.format(getContext().getString(R$string.update_service_email), this.f26068b.m25142d()));
        if (TextUtils.isEmpty(this.f26068b.m25140b())) {
            textView3.setText(R$string.normal_upgrade_goto_app_store);
            textView4.setVisibility(8);
        } else {
            textView3.setText(R$string.normal_upgrade_click_download_url);
            textView4.setVisibility(0);
            textView4.setText(this.f26068b.m25140b());
        }
        textView4.setOnClickListener(this);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
}
