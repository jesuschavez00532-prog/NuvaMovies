package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import be.C1328x;
import cc.C1447d;
import cc.C1466m0;
import cc.C1477w;
import com.mobile.bean.UpdateBean;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.module.view.DialogBottomBar;
import com.module.view.LoadingView;
import ga.C4417e;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p286p9.C6242a;
import p300q9.C6355c;
import p315r9.InterfaceC6563a;
import p317rb.AbstractC6567a;
import p330s9.DialogC6773a;
import p330s9.DialogC6774b;
import p348u2.AbstractC7028e;
import p355u9.AbstractC7063c;
import p370v9.AbstractC7250a;
import p400xa.AbstractC7598p1;
import p400xa.C7615w;
import p415y9.AbstractApplicationC7689d;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: ha.f1 */
/* loaded from: classes2.dex */
public final class C4768f1 extends C7767e {

    /* renamed from: F0 */
    private String f20124F0;

    /* renamed from: G0 */
    public Map f20125G0 = new LinkedHashMap();

    /* renamed from: ha.f1$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC6563a {
        a() {
        }

        @Override // p315r9.InterfaceC6563a
        /* renamed from: b */
        public void mo19703b() {
            boolean z10;
            if (C4768f1.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = C4768f1.this.m3075C6();
                if (m3075C6 != null) {
                    z10 = m3075C6.isFinishing();
                } else {
                    z10 = true;
                }
                if (!z10 && !C4768f1.this.m3192t7()) {
                    ((LoadingView) C4768f1.this.m19698J9(R$id.loadView)).setVisibility(8);
                }
            }
        }

        @Override // p315r9.InterfaceC6563a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo19702a(UpdateBean updateBean) {
            boolean z10;
            if (C4768f1.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = C4768f1.this.m3075C6();
                if (m3075C6 != null) {
                    z10 = m3075C6.isFinishing();
                } else {
                    z10 = true;
                }
                if (!z10 && !C4768f1.this.m3192t7()) {
                    ((LoadingView) C4768f1.this.m19698J9(R$id.loadView)).setVisibility(8);
                    AbstractActivityC0712e m3075C62 = C4768f1.this.m3075C6();
                    if (m3075C62 != null) {
                        C4768f1.this.m19697Q9(m3075C62, updateBean);
                    }
                }
            }
        }

        @Override // p315r9.InterfaceC6563a
        public void onError(Throwable th) {
            boolean z10;
            if (C4768f1.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = C4768f1.this.m3075C6();
                if (m3075C6 != null) {
                    z10 = m3075C6.isFinishing();
                } else {
                    z10 = true;
                }
                if (!z10 && !C4768f1.this.m3192t7()) {
                    ((LoadingView) C4768f1.this.m19698J9(R$id.loadView)).setVisibility(8);
                    C4768f1 c4768f1 = C4768f1.this;
                    int i10 = R$id.mBottomBar;
                    ((DialogBottomBar) c4768f1.m19698J9(i10)).setVisibility(0);
                    DialogBottomBar dialogBottomBar = (DialogBottomBar) C4768f1.this.m19698J9(i10);
                    String m3172j7 = C4768f1.this.m3172j7(R$string.check_update_fail);
                    AbstractC5868k.m23673e(m3172j7, "getString(R.string.check_update_fail)");
                    dialogBottomBar.m12080g(m3172j7, DialogBottomBar.EnumC2998a.FAIL);
                }
            }
        }
    }

    /* renamed from: ha.f1$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19705a(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (C4768f1.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = C4768f1.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    ((TextView) C4768f1.this.m19698J9(R$id.tvContact)).setText(C4768f1.this.m3175k7(R$string.account_questions_contact, str));
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19705a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ha.f1$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f20128a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19706a(String str) {
            AbstractC5868k.m23674f(str, "it");
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19706a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ha.f1$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m19707a(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (C4768f1.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = C4768f1.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    C4768f1 c4768f1 = C4768f1.this;
                    int i10 = R$id.mUpdateDownloadUrl;
                    ((TextView) c4768f1.m19698J9(i10)).setVisibility(0);
                    ((TextView) C4768f1.this.m19698J9(R$id.mTvDownloadHint)).setVisibility(0);
                    C4768f1.this.m19701P9(str);
                    SpannableString spannableString = new SpannableString(C4768f1.this.m19700M9());
                    spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                    ((TextView) C4768f1.this.m19698J9(i10)).setText(spannableString);
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19707a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N9 */
    public static final void m19695N9(C4768f1 c4768f1, View view) {
        AbstractC5868k.m23674f(c4768f1, "this$0");
        c4768f1.m19699L9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O9 */
    public static final void m19696O9(C4768f1 c4768f1, View view) {
        AbstractC5868k.m23674f(c4768f1, "this$0");
        Intent action = new Intent().setAction("android.intent.action.VIEW");
        AbstractC5868k.m23673e(action, "Intent().setAction(Intent.ACTION_VIEW)");
        action.setFlags(268697600);
        action.setData(Uri.parse(c4768f1.f20124F0));
        try {
            Context m3096J6 = c4768f1.m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            m3096J6.startActivity(action);
        } catch (Exception unused) {
            Context m3096J62 = c4768f1.m3096J6();
            AbstractC5868k.m23671c(m3096J62);
            Context applicationContext = m3096J62.getApplicationContext();
            Context m3096J63 = c4768f1.m3096J6();
            AbstractC5868k.m23671c(m3096J63);
            AbstractC7250a.m28063a(applicationContext, m3096J63.getApplicationContext().getString(R$string.error_hint_no_browser), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q9 */
    public final void m19697Q9(AbstractActivityC0712e abstractActivityC0712e, UpdateBean updateBean) {
        String m6870i;
        if (updateBean == null) {
            return;
        }
        C6355c c6355c = new C6355c();
        C4842a c4842a = C4842a.f20329a;
        if (AbstractC6567a.m25634d(c4842a.m19920a().mo19957f())) {
            c6355c.m25151m("");
        } else {
            String defaultDownloadUrl = updateBean.getDefaultDownloadUrl();
            if (AbstractC6567a.m25634d(defaultDownloadUrl)) {
                defaultDownloadUrl = c4842a.m19920a().mo19957f();
            }
            c6355c.m25151m(defaultDownloadUrl);
        }
        c6355c.m25153o(C7615w.f27995a.m29302F());
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        Context m29494a = aVar.m29494a();
        AbstractC5868k.m23671c(m29494a);
        c6355c.m25149k(m29494a.getString(R$string.version_format, AbstractC5085b.m20603m(aVar.m29494a())));
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (AbstractC6567a.m25637g(c1466m0.m6878m())) {
            m6870i = c1466m0.m6878m();
        } else {
            m6870i = c1466m0.m6870i();
        }
        c6355c.m25157s(m6870i);
        c6355c.m25154p(updateBean.md5);
        c6355c.m25156r(updateBean.url + AbstractC7598p1.m29239c());
        c6355c.m25155q(updateBean.spareUrl + AbstractC7598p1.m29239c());
        c6355c.m25152n(AbstractC7063c.m27217d(abstractActivityC0712e, c4842a.m19920a().mo19959h()));
        if (updateBean.forceUpdate == 1) {
            c6355c.m25150l(true);
            new DialogC6773a(abstractActivityC0712e, updateBean, c6355c).show();
        } else {
            c6355c.m25150l(false);
            new DialogC6774b(abstractActivityC0712e, updateBean, c6355c).show();
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20125G0.clear();
    }

    /* renamed from: J9 */
    public View m19698J9(int i10) {
        View findViewById;
        Map map = this.f20125G0;
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

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public final void m19699L9() {
        ((LoadingView) m19698J9(R$id.loadView)).setVisibility(0);
        C6242a c6242a = new C6242a(m3075C6(), new C1477w(".update"), new C1447d(".update"));
        C1466m0 c1466m0 = C1466m0.f5627a;
        c6242a.m24862f(c1466m0.m6885t(), c1466m0.m6870i(), new a());
    }

    /* renamed from: M9 */
    public final String m19700M9() {
        return this.f20124F0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.dialog_version_not_support, viewGroup, false);
    }

    /* renamed from: P9 */
    public final void m19701P9(String str) {
        this.f20124F0 = str;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(860), -2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        String m6870i;
        Window window;
        AbstractC5868k.m23674f(view, "view");
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        int i10 = R$id.tvUpdate;
        ((TextView) m19698J9(i10)).setOnClickListener(new View.OnClickListener() { // from class: ha.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4768f1.m19695N9(C4768f1.this, view2);
            }
        });
        ((TextView) m19698J9(i10)).requestFocus();
        C7615w.f27995a.m29316v(new b(), c.f20128a, new d());
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String string = m3096J6.getString(R$string.version_format, AbstractC5085b.m20603m(m3096J6()));
        AbstractC5868k.m23673e(string, "context!!.getString(R.st….getVersionName(context))");
        TextView textView = (TextView) m19698J9(R$id.mTvCurrentVersion);
        C5881x c5881x = C5881x.f23415a;
        Context m3096J62 = m3096J6();
        AbstractC5868k.m23671c(m3096J62);
        String string2 = m3096J62.getString(R$string.update_current_version);
        AbstractC5868k.m23673e(string2, "context!!.getString(R.st…g.update_current_version)");
        String format = String.format(string2, Arrays.copyOf(new Object[]{string}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        textView.setText(format);
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (AbstractC6567a.m25637g(c1466m0.m6878m())) {
            m6870i = c1466m0.m6878m();
        } else {
            m6870i = c1466m0.m6870i();
        }
        TextView textView2 = (TextView) m19698J9(R$id.mTvUserId);
        Context m3096J63 = m3096J6();
        AbstractC5868k.m23671c(m3096J63);
        String string3 = m3096J63.getString(R$string.update_id);
        AbstractC5868k.m23673e(string3, "context!!.getString(R.string.update_id)");
        String format2 = String.format(string3, Arrays.copyOf(new Object[]{m6870i}, 1));
        AbstractC5868k.m23673e(format2, "format(format, *args)");
        textView2.setText(format2);
        ((TextView) m19698J9(R$id.mUpdateDownloadUrl)).setOnClickListener(new View.OnClickListener() { // from class: ha.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4768f1.m19696O9(C4768f1.this, view2);
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        mo3278o9();
        AbstractC7028e.m27115a("vnsd");
        C4417e c4417e = C4417e.f19115a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m20598h = AbstractC5085b.m20598h(m3096J6());
        AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
        C4417e.m18497f(c4417e, m3096J6, m20598h, false, false, 12, null);
    }
}
