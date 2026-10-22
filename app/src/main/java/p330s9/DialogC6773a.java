package p330s9;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import p300q9.C6355c;
import p370v9.AbstractC7250a;

/* renamed from: s9.a */
/* loaded from: classes2.dex */
public class DialogC6773a extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private final UpdateBean f26064a;

    /* renamed from: b */
    private final C6355c f26065b;

    /* renamed from: c */
    private a f26066c;

    /* renamed from: s9.a$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo26652a();
    }

    public DialogC6773a(Context context, UpdateBean updateBean, C6355c c6355c) {
        super(context, R$style.dialog_style);
        this.f26064a = updateBean;
        this.f26065b = c6355c;
    }

    /* renamed from: a */
    private String m26647a() {
        if (TextUtils.isEmpty(this.f26064a.getNote())) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        String[] split = this.f26064a.getNote().split(";");
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

    /* renamed from: b */
    private String m26648b() {
        return getContext().getString(R$string.normal_upgrade_version, this.f26064a.getVersionName());
    }

    /* renamed from: c */
    private void m26649c() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268697600);
        intent.setData(Uri.parse(this.f26065b.m25140b()));
        try {
            getContext().startActivity(intent);
        } catch (Exception unused) {
            AbstractC7250a.m28063a(getContext().getApplicationContext(), getContext().getApplicationContext().getString(R$string.error_hint_no_browser), 1);
        }
    }

    /* renamed from: d */
    public void m26650d() {
        DialogC6776d dialogC6776d = new DialogC6776d(getContext(), this.f26064a, this.f26065b);
        dialogC6776d.m26670i(this.f26066c);
        dialogC6776d.show();
    }

    /* renamed from: e */
    public void m26651e(a aVar) {
        this.f26066c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.mTvOfficialDownloadUrl) {
            m26649c();
        } else if (view.getId() == R$id.mBtnUpdateNow) {
            m26650d();
            dismiss();
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        String m25146h;
        super.onCreate(bundle);
        setContentView(R$layout.dialog_force_upgrade);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = AutoSizeUtils.dp2px(getContext(), 656.0f);
        attributes.height = AutoSizeUtils.dp2px(getContext(), 440.0f);
        getWindow().setAttributes(attributes);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        TextView textView = (TextView) findViewById(R$id.mTvVersionName);
        TextView textView2 = (TextView) findViewById(R$id.mStvReleaseNote);
        TextView textView3 = (TextView) findViewById(R$id.mTvDownloadHint);
        TextView textView4 = (TextView) findViewById(R$id.mTvOfficialDownloadUrl);
        Button button = (Button) findViewById(R$id.mBtnUpdateNow);
        TextView textView5 = (TextView) findViewById(R$id.mTvCurrentVersion);
        TextView textView6 = (TextView) findViewById(R$id.mTvUserId);
        TextView textView7 = (TextView) findViewById(R$id.mTvServiceEmail);
        textView2.setText(m26647a());
        textView4.setPaintFlags(8);
        textView4.getPaint().setAntiAlias(true);
        textView5.setText(String.format(getContext().getString(R$string.update_current_version), this.f26065b.m25139a()));
        if (this.f26065b.m25148j()) {
            m25146h = this.f26065b.m25147i();
            if (m25146h.isEmpty()) {
                m25146h = this.f26065b.m25146h();
            }
        } else {
            m25146h = this.f26065b.m25146h();
        }
        if (m25146h.isEmpty()) {
            textView6.setVisibility(8);
        } else {
            textView6.setVisibility(0);
            textView6.setText(String.format(getContext().getString(R$string.update_account), m25146h));
        }
        textView7.setText(String.format(getContext().getString(R$string.update_service_email), this.f26065b.m25142d()));
        textView.setText(m26648b());
        textView2.setText(m26647a());
        textView4.setPaintFlags(8);
        textView4.getPaint().setAntiAlias(true);
        if (TextUtils.isEmpty(this.f26065b.m25140b())) {
            textView3.setText(R$string.normal_upgrade_goto_app_store);
            textView4.setVisibility(8);
        } else {
            textView3.setText(R$string.normal_upgrade_click_download_url);
            textView4.setVisibility(0);
            textView4.setText(this.f26065b.m25140b());
        }
        textView4.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        a aVar;
        if (keyEvent.getAction() == 0 && i10 == 4 && (aVar = this.f26066c) != null) {
            aVar.mo26652a();
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }
}
