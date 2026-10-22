package p251n9;

import android.content.Context;
import android.os.Environment;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.C1447d;
import cc.C1466m0;
import cc.C1477w;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.mine.R$id;
import com.mine.R$layout;
import com.mine.R$string;
import com.mobile.bean.UpdateBean;
import com.module.view.LoadingView;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.zhy.autolayout.AutoFrameLayout;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p131f9.C4296a;
import p132fa.C4300d;
import p153h2.AbstractC4509b;
import p160h9.InterfaceC4726c0;
import p160h9.InterfaceC4728d0;
import p170i2.C4842a;
import p192j9.C5021d0;
import p201k2.AbstractC5085b;
import p264o9.C5942a;
import p286p9.C6242a;
import p300q9.C6355c;
import p315r9.InterfaceC6563a;
import p315r9.InterfaceC6565c;
import p348u2.AbstractC7030g;
import p355u9.AbstractC7063c;
import p355u9.AsyncTaskC7064d;
import p359ue.AbstractC7166t;
import p400xa.AbstractC7598p1;
import p415y9.AbstractApplicationC7689d;

/* renamed from: n9.j1 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5797j1 extends AbstractC5774c<InterfaceC4726c0> implements InterfaceC4728d0, View.OnClickListener, View.OnKeyListener, InterfaceC6565c {

    /* renamed from: B0 */
    private boolean f23202B0;

    /* renamed from: C0 */
    private boolean f23203C0;

    /* renamed from: D0 */
    private boolean f23204D0;

    /* renamed from: E0 */
    private UpdateBean f23205E0;

    /* renamed from: F0 */
    private C4296a f23206F0;

    /* renamed from: G0 */
    private final InterfaceC1312h f23207G0;

    /* renamed from: H0 */
    public Map f23208H0 = new LinkedHashMap();

    /* renamed from: n9.j1$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6242a invoke() {
            return new C6242a(ViewOnClickListenerC5797j1.this.m3096J6(), new C1477w(".update"), new C1447d(".update"));
        }
    }

    /* renamed from: n9.j1$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC6563a {
        b() {
        }

        @Override // p315r9.InterfaceC6563a
        /* renamed from: b */
        public void mo19703b() {
            boolean z10;
            AbstractActivityC0712e m3075C6 = ViewOnClickListenerC5797j1.this.m3075C6();
            if (m3075C6 != null) {
                z10 = m3075C6.isFinishing();
            } else {
                z10 = true;
            }
            if (!z10 && !ViewOnClickListenerC5797j1.this.m3192t7()) {
                ViewOnClickListenerC5797j1.this.f23203C0 = false;
                ViewOnClickListenerC5797j1.this.f23204D0 = true;
                LoadingView loadingView = (LoadingView) ViewOnClickListenerC5797j1.this.m23387X9(R$id.mLoadingView);
                if (loadingView != null) {
                    loadingView.setVisibility(8);
                }
            }
        }

        @Override // p315r9.InterfaceC6563a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo19702a(UpdateBean updateBean) {
            boolean z10;
            AbstractActivityC0712e m3075C6 = ViewOnClickListenerC5797j1.this.m3075C6();
            if (m3075C6 != null) {
                z10 = m3075C6.isFinishing();
            } else {
                z10 = true;
            }
            if (!z10 && !ViewOnClickListenerC5797j1.this.m3192t7()) {
                TextView textView = (TextView) ViewOnClickListenerC5797j1.this.m23387X9(R$id.tvVersionName);
                if (textView != null) {
                    textView.setText(ViewOnClickListenerC5797j1.this.m3154d7().getString(R$string.personal_cur_upgrade) + ": V" + AbstractC5085b.m20603m(ViewOnClickListenerC5797j1.this.m3096J6()));
                }
                TextView textView2 = (TextView) ViewOnClickListenerC5797j1.this.m23387X9(R$id.tvUpdate);
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                ViewOnClickListenerC5797j1.this.f23205E0 = updateBean;
            }
        }

        @Override // p315r9.InterfaceC6563a
        public void onError(Throwable th) {
            boolean z10;
            AbstractActivityC0712e m3075C6 = ViewOnClickListenerC5797j1.this.m3075C6();
            if (m3075C6 != null) {
                z10 = m3075C6.isFinishing();
            } else {
                z10 = true;
            }
            if (!z10 && !ViewOnClickListenerC5797j1.this.m3192t7()) {
                ViewOnClickListenerC5797j1.this.f23203C0 = false;
                ViewOnClickListenerC5797j1.this.f23204D0 = true;
                LoadingView loadingView = (LoadingView) ViewOnClickListenerC5797j1.this.m23387X9(R$id.mLoadingView);
                if (loadingView != null) {
                    loadingView.setVisibility(8);
                }
                TextView textView = (TextView) ViewOnClickListenerC5797j1.this.m23387X9(R$id.tvVersionName);
                if (textView != null) {
                    textView.setText(ViewOnClickListenerC5797j1.this.m3154d7().getString(R$string.latest_version_frg, AbstractC5085b.m20603m(ViewOnClickListenerC5797j1.this.m3096J6())));
                }
                TextView textView2 = (TextView) ViewOnClickListenerC5797j1.this.m23387X9(R$id.tvUpdate);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
        }
    }

    public ViewOnClickListenerC5797j1() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f23207G0 = m5965b;
    }

    /* renamed from: ca */
    private final C6242a m23379ca() {
        return (C6242a) this.f23207G0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ea */
    public static final void m23380ea(ViewOnClickListenerC5797j1 viewOnClickListenerC5797j1) {
        AbstractC5868k.m23674f(viewOnClickListenerC5797j1, "this$0");
        viewOnClickListenerC5797j1.m23388ba();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fa */
    public static final void m23381fa(ViewOnClickListenerC5797j1 viewOnClickListenerC5797j1) {
        String m27728o;
        AbstractC5868k.m23674f(viewOnClickListenerC5797j1, "this$0");
        C4296a c4296a = viewOnClickListenerC5797j1.f23206F0;
        AbstractC5868k.m23671c(c4296a);
        c4296a.m17975f(C4300d.f18678a.m18068x0());
        if (C4842a.f20329a.m19920a().m19976y()) {
            String m20595e = AbstractC5085b.m20595e();
            AbstractC5868k.m23673e(m20595e, "getEnglishAppName()");
            m27728o = AbstractC7166t.m27728o(m20595e, " ", "", false, 4, null);
            Locale locale = Locale.US;
            AbstractC5868k.m23673e(locale, "US");
            String lowerCase = m27728o.toLowerCase(locale);
            AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db_" + lowerCase;
            AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
            String path = aVar.m29494a().getDatabasePath("user_vod.db").getPath();
            String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-shm_" + lowerCase;
            String path2 = aVar.m29494a().getDatabasePath("user_vod.db-shm").getPath();
            String str3 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-wal_" + lowerCase;
            String path3 = aVar.m29494a().getDatabasePath("user_vod.db-wal").getPath();
            C4296a c4296a2 = viewOnClickListenerC5797j1.f23206F0;
            AbstractC5868k.m23671c(c4296a2);
            c4296a2.m17972c(path, str);
            if (new File(path2).exists()) {
                C4296a c4296a3 = viewOnClickListenerC5797j1.f23206F0;
                AbstractC5868k.m23671c(c4296a3);
                c4296a3.m17972c(path2, str2);
            }
            if (new File(path3).exists()) {
                C4296a c4296a4 = viewOnClickListenerC5797j1.f23206F0;
                AbstractC5868k.m23671c(c4296a4);
                c4296a4.m17972c(path3, str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final void m23382ga(ViewOnClickListenerC5797j1 viewOnClickListenerC5797j1) {
        String m27728o;
        AbstractC5868k.m23674f(viewOnClickListenerC5797j1, "this$0");
        viewOnClickListenerC5797j1.m23388ba();
        C4296a c4296a = viewOnClickListenerC5797j1.f23206F0;
        AbstractC5868k.m23671c(c4296a);
        c4296a.m17974e();
        if (C4842a.f20329a.m19920a().m19976y()) {
            String m20595e = AbstractC5085b.m20595e();
            AbstractC5868k.m23673e(m20595e, "getEnglishAppName()");
            m27728o = AbstractC7166t.m27728o(m20595e, " ", "", false, 4, null);
            Locale locale = Locale.US;
            AbstractC5868k.m23673e(locale, "US");
            String lowerCase = m27728o.toLowerCase(locale);
            AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db_" + lowerCase;
            String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-shm_" + lowerCase;
            String str3 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-wal_" + lowerCase;
            if (new File(str).exists()) {
                C4296a c4296a2 = viewOnClickListenerC5797j1.f23206F0;
                AbstractC5868k.m23671c(c4296a2);
                c4296a2.m17973d(str);
            }
            if (new File(str2).exists()) {
                C4296a c4296a3 = viewOnClickListenerC5797j1.f23206F0;
                AbstractC5868k.m23671c(c4296a3);
                c4296a3.m17973d(str2);
            }
            if (new File(str3).exists()) {
                C4296a c4296a4 = viewOnClickListenerC5797j1.f23206F0;
                AbstractC5868k.m23671c(c4296a4);
                c4296a4.m17973d(str3);
            }
        }
    }

    /* renamed from: ha */
    private final void m23383ha() {
        ((TextView) m23387X9(R$id.tvUpdate)).setOnClickListener(new View.OnClickListener() { // from class: n9.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC5797j1.m23384ia(ViewOnClickListenerC5797j1.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ia */
    public static final void m23384ia(final ViewOnClickListenerC5797j1 viewOnClickListenerC5797j1, View view) {
        AbstractC5868k.m23674f(viewOnClickListenerC5797j1, "this$0");
        boolean z10 = false;
        if (AbstractC7598p1.m29241e(viewOnClickListenerC5797j1.m3096J6())) {
            UpdateBean updateBean = viewOnClickListenerC5797j1.f23205E0;
            if (updateBean != null) {
                String m27217d = AbstractC7063c.m27217d(viewOnClickListenerC5797j1.m3107M8(), C4842a.f20329a.m19920a().mo19959h());
                final C6355c c6355c = new C6355c();
                c6355c.m25152n(m27217d);
                c6355c.m25156r(updateBean.url + AbstractC7598p1.m29239c());
                c6355c.m25155q(updateBean.spareUrl + AbstractC7598p1.m29239c());
                c6355c.m25154p(updateBean.md5);
                if (updateBean.forceUpdate == 1) {
                    z10 = true;
                }
                c6355c.m25150l(z10);
                new AsyncTaskC7064d(new AsyncTaskC7064d.a() { // from class: n9.i1
                    @Override // p355u9.AsyncTaskC7064d.a
                    /* renamed from: a */
                    public final void mo22883a(String str) {
                        ViewOnClickListenerC5797j1.m23385ja(C6355c.this, viewOnClickListenerC5797j1, str);
                    }
                }).execute(c6355c.m25145g(), c6355c.m25144f());
                return;
            }
            return;
        }
        AbstractC4509b.m18869b("UpgradeFragment", "net is not ok!", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja */
    public static final void m23385ja(C6355c c6355c, ViewOnClickListenerC5797j1 viewOnClickListenerC5797j1, String str) {
        AbstractC5868k.m23674f(c6355c, "$upgradeConfig");
        AbstractC5868k.m23674f(viewOnClickListenerC5797j1, "this$0");
        c6355c.m25154p(str);
        C5942a.m24064e().m24070k(viewOnClickListenerC5797j1.m3107M8(), c6355c, true);
    }

    /* renamed from: ka */
    private final void m23386ka() {
        if (!this.f23203C0 && !this.f23204D0) {
            this.f23203C0 = true;
            LoadingView loadingView = (LoadingView) m23387X9(R$id.mLoadingView);
            if (loadingView != null) {
                loadingView.setVisibility(0);
            }
            C6242a m23379ca = m23379ca();
            C1466m0 c1466m0 = C1466m0.f5627a;
            m23379ca.m24862f(c1466m0.m6885t(), c1466m0.m6870i(), new b());
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_upgrade;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Button button = (Button) m23387X9(R$id.mCleanHistoryBtn);
        if (button != null && button.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        Button button2 = (Button) m23387X9(R$id.mCleanImageBtn);
        if (button2 != null && button2.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        Button button3 = (Button) m23387X9(R$id.mCleanAllBtn);
        if (button3 != null && button3.hasFocus()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            return true;
        }
        TextView textView = (TextView) m23387X9(R$id.tvUpdate);
        if (textView != null && textView.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: J9 */
    public boolean mo23244J9() {
        View view;
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m23387X9(R$id.mRootLayout);
        if (autoFrameLayout != null) {
            view = autoFrameLayout.getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m23387X9(R$id.mRootLayout);
        if (autoFrameLayout == null || autoFrameLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: O9 */
    public void mo23245O9() {
        Button button = (Button) m23387X9(R$id.mCleanHistoryBtn);
        if (button != null) {
            button.requestFocus();
        }
    }

    @Override // ba.AbstractC1196d, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public void mo3118Q7() {
        super.mo3118Q7();
        this.f23203C0 = false;
        m23379ca().m24860d();
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        C5942a.m24064e().m24071l(this);
        super.mo3123S7();
        mo5459m9();
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: U */
    public void mo11835U() {
        int i10 = R$id.tvProgress;
        TextView textView = (TextView) m23387X9(i10);
        if (textView != null) {
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = m3172j7(R$string.update_download_process);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.update_download_process)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{MessageService.MSG_DB_READY_REPORT + Operator.Operation.MOD}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(Html.fromHtml(format));
        }
        TextView textView2 = (TextView) m23387X9(i10);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    /* renamed from: X9 */
    public View m23387X9(int i10) {
        View findViewById;
        Map map = this.f23208H0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    /* renamed from: ba */
    public final void m23388ba() {
        ComponentCallbacks2C1586c.m7276d(AbstractApplicationC7689d.f28135d.m29494a()).m7285b();
    }

    @Override // ba.AbstractC1196d
    /* renamed from: da, reason: merged with bridge method [inline-methods] */
    public InterfaceC4726c0 mo5465y9() {
        return new C5021d0(this, this);
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: f1 */
    public void mo11842f1(long j10, long j11) {
        long j12 = (100 * j10) / j11;
        int i10 = R$id.tvProgress;
        TextView textView = (TextView) m23387X9(i10);
        if (textView != null) {
            C5881x c5881x = C5881x.f23415a;
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            String string = m3096J6.getResources().getString(R$string.update_download_process);
            AbstractC5868k.m23673e(string, "context!!.resources.getS….update_download_process)");
            String format = String.format(string, Arrays.copyOf(new Object[]{j12 + Operator.Operation.MOD}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(Html.fromHtml(format));
        }
        TextView textView2 = (TextView) m23387X9(i10);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23208H0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        m23383ha();
        m23386ka();
        this.f23206F0 = new C4296a();
        int i10 = R$id.mCleanImageBtn;
        ((Button) m23387X9(i10)).setOnClickListener(this);
        int i11 = R$id.mCleanHistoryBtn;
        ((Button) m23387X9(i11)).setOnClickListener(this);
        int i12 = R$id.mCleanAllBtn;
        ((Button) m23387X9(i12)).setOnClickListener(this);
        ((Button) m23387X9(i10)).setOnKeyListener(this);
        ((Button) m23387X9(i11)).setOnKeyListener(this);
        ((Button) m23387X9(i12)).setOnKeyListener(this);
        ((TextView) m23387X9(R$id.tvUpdate)).setOnKeyListener(this);
        C5942a.m24064e().m24069h(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mCleanImageBtn;
        if (num != null && num.intValue() == i10) {
            AbstractC7030g.m27129c("clear img cache", new Runnable() { // from class: n9.f1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC5797j1.m23380ea(ViewOnClickListenerC5797j1.this);
                }
            }, false);
            AbstractC7598p1.m29244h(m3096J6(), m3154d7().getString(R$string.clean_image_cache), 0);
            return;
        }
        int i11 = R$id.mCleanHistoryBtn;
        if (num != null && num.intValue() == i11) {
            AbstractC7030g.m27129c("clear play record", new Runnable() { // from class: n9.g1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC5797j1.m23381fa(ViewOnClickListenerC5797j1.this);
                }
            }, false);
            AbstractC7598p1.m29244h(m3096J6(), m3154d7().getString(R$string.clean_play_cache), 0);
            return;
        }
        int i12 = R$id.mCleanAllBtn;
        if (num != null && num.intValue() == i12) {
            AbstractC7030g.m27129c("clear all cache", new Runnable() { // from class: n9.h1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC5797j1.m23382ga(ViewOnClickListenerC5797j1.this);
                }
            }, false);
            AbstractC7598p1.m29244h(m3096J6(), m3154d7().getString(R$string.clean_all), 0);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        TextView textView;
        boolean z13 = false;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && keyEvent.getKeyCode() == 20) {
            if (view != null && view.getId() == R$id.mCleanAllBtn) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int i11 = R$id.tvUpdate;
                TextView textView2 = (TextView) m23387X9(i11);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    z13 = true;
                }
                if (z13 && (textView = (TextView) m23387X9(i11)) != null) {
                    textView.requestFocus();
                }
                return true;
            }
        }
        if (keyEvent != null && keyEvent.getAction() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && keyEvent.getKeyCode() == 22) {
            return true;
        }
        return false;
    }

    @Override // p315r9.InterfaceC6565c
    public void onSuccess() {
        TextView textView = (TextView) m23387X9(R$id.tvProgress);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
        m23386ka();
    }

    @Override // p315r9.InterfaceC6565c
    /* renamed from: u0 */
    public void mo11850u0(Exception exc) {
        TextView textView = (TextView) m23387X9(R$id.tvProgress);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23202B0;
    }
}
