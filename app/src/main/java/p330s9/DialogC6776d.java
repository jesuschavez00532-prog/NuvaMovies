package p330s9;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
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
import com.mobile.view.ScrollTextView;
import com.mobile.view.UpgradeProgressView;
import com.zhy.autolayout.AutoLinearLayout;
import p264o9.C5942a;
import p300q9.C6355c;
import p315r9.InterfaceC6565c;
import p330s9.DialogC6773a;
import p355u9.AsyncTaskC7064d;
import p370v9.AbstractC7250a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: s9.d */
/* loaded from: classes2.dex */
public class DialogC6776d extends Dialog implements InterfaceC6565c {

    /* renamed from: a */
    private long f26071a;

    /* renamed from: b */
    private long f26072b;

    /* renamed from: c */
    private final UpdateBean f26073c;

    /* renamed from: d */
    private final C6355c f26074d;

    /* renamed from: e */
    private UpgradeProgressView f26075e;

    /* renamed from: f */
    private TextView f26076f;

    /* renamed from: g */
    private DialogC6773a.a f26077g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s9.d$a */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC6776d.this.m26664g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s9.d$b */
    /* loaded from: classes2.dex */
    public class b implements AsyncTaskC7064d.a {
        b() {
        }

        @Override // p355u9.AsyncTaskC7064d.a
        /* renamed from: a */
        public void mo22883a(String str) {
            DialogC6776d.this.f26074d.m25154p(str);
            C5942a.m24064e().m24070k(DialogC6776d.this.getContext(), DialogC6776d.this.f26074d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s9.d$c */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC6776d.this.m26665h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s9.d$d */
    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC6776d.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogC6776d(Context context, UpdateBean updateBean, C6355c c6355c) {
        super(context, R$style.dialog_style);
        this.f26071a = 0L;
        this.f26072b = 0L;
        this.f26073c = updateBean;
        this.f26074d = c6355c;
    }

    /* renamed from: d */
    private String m26661d() {
        String str = null;
        try {
            str = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            str = "";
        }
        return getContext().getString(R$string.force_upgrade_current_version, str);
    }

    /* renamed from: e */
    private String m26662e() {
        if (TextUtils.isEmpty(this.f26073c.getNote())) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        String[] split = this.f26073c.getNote().split(";");
        int i10 = 0;
        while (i10 < split.length) {
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(".");
            sb2.append(split[i10]);
            sb2.append("<br>");
            i10 = i11;
        }
        return sb2.toString();
    }

    /* renamed from: f */
    private String m26663f() {
        return "(" + getContext().getString(R$string.normal_upgrade_version, this.f26073c.getVersionName()) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m26664g() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268697600);
        intent.setData(Uri.parse(this.f26074d.m25140b()));
        try {
            getContext().startActivity(intent);
        } catch (Exception unused) {
            AbstractC7250a.m28063a(getContext().getApplicationContext(), getContext().getApplicationContext().getString(R$string.error_hint_no_browser), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m26665h() {
        C5942a.m24064e().m24069h(this);
        new AsyncTaskC7064d(new b()).execute(this.f26074d.m25145g(), this.f26074d.m25144f());
    }

    /* renamed from: j */
    private void m26666j() {
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        TextView textView = (TextView) findViewById(R$id.mTvUpdating);
        TextView textView2 = (TextView) findViewById(R$id.mTvDontCloseApp);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        ((TextView) findViewById(R$id.mTvDownloadFail)).setVisibility(0);
        TextView textView3 = (TextView) findViewById(R$id.mTvDownloadHint);
        textView3.setVisibility(0);
        textView3.setText(R$string.force_upgrade_goto_app_store);
        if (!TextUtils.isEmpty(this.f26074d.m25140b())) {
            ((AutoLinearLayout) findViewById(R$id.mAllDownloadLink)).setVisibility(0);
            ((TextView) findViewById(R$id.mTvDownloadLinkDesc)).setText(R$string.force_upgrade_download_link);
            ((TextView) findViewById(R$id.mTvDownloadLink)).setText(this.f26074d.m25140b());
        }
        TextView textView4 = (TextView) findViewById(R$id.mTvContract);
        textView4.setVisibility(0);
        textView4.setText(getContext().getString(R$string.force_upgrade_contract_email, this.f26074d.m25142d()));
        Button button = (Button) findViewById(R$id.mBtnClose);
        button.setText(R$string.force_upgrade_close);
        button.setVisibility(0);
        button.requestFocus();
        button.setOnClickListener(new d());
    }

    /* renamed from: k */
    private void m26667k() {
        Button button = (Button) findViewById(R$id.mBtnClose);
        button.setText(R$string.force_upgrade_install);
        button.setVisibility(0);
        button.requestFocus();
        button.setOnClickListener(new c());
    }

    /* renamed from: l */
    private void m26668l() {
        TextView textView = (TextView) findViewById(R$id.mTvDownloadLink);
        textView.getPaint().setAntiAlias(true);
        textView.getPaint().setFlags(8);
        textView.setOnClickListener(new a());
        if (TextUtils.isEmpty(this.f26074d.m25140b())) {
            TextView textView2 = (TextView) findViewById(R$id.mTvDownloadHint);
            textView2.setVisibility(0);
            textView2.setText(R$string.normal_upgrade_goto_app_store);
        } else {
            ((AutoLinearLayout) findViewById(R$id.mAllDownloadLink)).setVisibility(0);
            ((TextView) findViewById(R$id.mTvDownloadLinkDesc)).setText(R$string.normal_upgrade_click_download_url);
            textView.setText(this.f26074d.m25140b());
        }
    }

    /* renamed from: m */
    private void m26669m(long j10) {
        String str = null;
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = ((j10 - this.f26071a) * 1000) / (currentTimeMillis - this.f26072b);
        if (j11 <= 0) {
            str = "0B/S";
        } else if (j11 < IjkMediaMeta.AV_CH_SIDE_RIGHT) {
            str = j11 + "B/S";
        } else if (j11 >= 1048576) {
            str = (j11 / 1048576) + "M/S";
        } else {
            str = (j11 / IjkMediaMeta.AV_CH_SIDE_RIGHT) + "KB/S";
        }
        this.f26076f.setText(str);
        this.f26071a = j10;
        this.f26072b = currentTimeMillis;
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: U */
    public void mo11835U() {
        this.f26071a = C5942a.m24064e().m24068g(getContext(), this.f26074d);
        this.f26072b = System.currentTimeMillis();
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: f1 */
    public void mo11842f1(long j10, long j11) {
        this.f26075e.setProgress((int) ((100 * j10) / j11));
        m26669m(j10);
    }

    /* renamed from: i */
    public void m26670i(DialogC6773a.a aVar) {
        this.f26077g = aVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.dialog_upgrade_progress);
        getWindow().setLayout(-1, -1);
        getWindow().addFlags(2);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.95f;
        getWindow().setAttributes(attributes);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        TextView textView = (TextView) findViewById(R$id.mTvVersion);
        ScrollTextView scrollTextView = (ScrollTextView) findViewById(R$id.mStvReleaseNote);
        TextView textView2 = (TextView) findViewById(R$id.mTvCurrentVersion);
        this.f26075e = (UpgradeProgressView) findViewById(R$id.mUpvProgress);
        this.f26076f = (TextView) findViewById(R$id.mTvNetSpeed);
        textView.setText(m26663f());
        scrollTextView.setText(Html.fromHtml(m26662e()));
        textView2.setText(m26661d());
        m26668l();
        m26665h();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        DialogC6773a.a aVar;
        if (keyEvent.getAction() == 0 && i10 == 4 && (aVar = this.f26077g) != null) {
            aVar.mo26652a();
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p315r9.InterfaceC6565c
    public void onSuccess() {
        this.f26076f.setText("");
        this.f26075e.setProgress(100);
        C5942a.m24064e().m24071l(this);
        m26667k();
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: u0 */
    public void mo11850u0(Exception exc) {
        this.f26076f.setText("");
        this.f26075e.setInvalid(true);
        C5942a.m24064e().m24071l(this);
        m26666j();
    }
}
