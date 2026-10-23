package p264o9;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.mobile.autoupdate.R$string;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p009a8.C0111a;
import p300q9.C6355c;
import p315r9.InterfaceC6565c;
import p328s7.AbstractC6696b;
import p339t7.AbstractC6923a;
import p339t7.InterfaceC6925c;
import p341t9.AbstractC6927a;
import p355u9.AbstractC7065e;
import p370v9.AbstractC7250a;
import p428z7.C7760a;

/* renamed from: o9.a */
/* loaded from: classes2.dex */
public final class C5942a {

    /* renamed from: c */
    private static C5942a f23627c;

    /* renamed from: a */
    private final List f23628a = new ArrayList();

    /* renamed from: b */
    private C7760a f23629b;

    /* renamed from: o9.a$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC6923a {

        /* renamed from: a */
        final /* synthetic */ boolean f23630a;

        /* renamed from: b */
        final /* synthetic */ Context f23631b;

        a(boolean z10, Context context) {
            this.f23630a = z10;
            this.f23631b = context;
        }

        @Override // p339t7.AbstractC6923a, p339t7.InterfaceC6924b
        /* renamed from: a */
        public void mo24072a() {
            super.mo24072a();
            C5942a.this.m24067j();
            Iterator it = new ArrayList(C5942a.this.f23628a).iterator();
            while (it.hasNext()) {
                ((InterfaceC6565c) it.next()).onSuccess();
            }
            C5942a.this.f23629b = null;
        }

        @Override // p339t7.AbstractC6923a, p339t7.InterfaceC6924b
        /* renamed from: d */
        public void mo24073d(long j10, long j11) {
            super.mo24073d(j10, j11);
            Iterator it = new ArrayList(C5942a.this.f23628a).iterator();
            while (it.hasNext()) {
                ((InterfaceC6565c) it.next()).mo11842f1(j10, j11);
            }
        }

        @Override // p339t7.AbstractC6923a, p339t7.InterfaceC6924b
        /* renamed from: f */
        public void mo24074f(C0111a c0111a) {
            super.mo24074f(c0111a);
            C5942a.this.m24066i(c0111a);
            Iterator it = new ArrayList(C5942a.this.f23628a).iterator();
            while (it.hasNext()) {
                ((InterfaceC6565c) it.next()).mo11850u0(c0111a);
            }
            if (this.f23630a) {
                AbstractC7250a.m28063a(this.f23631b.getApplicationContext(), this.f23631b.getApplicationContext().getString(R$string.normal_upgrade_download_fail), 0);
            }
            C5942a.this.f23629b = null;
        }

        @Override // p339t7.AbstractC6923a, p339t7.InterfaceC6924b
        public void onStart() {
            super.onStart();
            Iterator it = new ArrayList(C5942a.this.f23628a).iterator();
            while (it.hasNext()) {
                ((InterfaceC6565c) it.next()).mo11835U();
            }
        }
    }

    private C5942a() {
    }

    /* renamed from: e */
    public static C5942a m24064e() {
        if (f23627c == null) {
            f23627c = new C5942a();
        }
        return f23627c;
    }

    /* renamed from: f */
    private boolean m24065f(String str) {
        return str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m24066i(Throwable th) {
        C7760a c7760a = this.f23629b;
        if (c7760a == null) {
            return;
        }
        String m30007f = c7760a.m30007f();
        if (TextUtils.isEmpty(m30007f)) {
            return;
        }
        AbstractC6927a.m26912b(Uri.parse(m30007f).getHost(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m24067j() {
        String str = null;
        C7760a c7760a = this.f23629b;
        if (c7760a == null) {
            return;
        }
        String m30007f = c7760a.m30007f();
        if (TextUtils.isEmpty(m30007f)) {
            return;
        }
        String m27227b = AbstractC7065e.m27227b(new File(this.f23629b.m30010i()));
        if (m27227b == null || m27227b.isEmpty()) {
            m27227b = "apkMd5 is empty";
        }
        String str2 = m27227b;
        String m27228c = AbstractC7065e.m27228c(this.f23629b.m30010i());
        if (m27228c == null || m27228c.trim().isEmpty()) {
            m27228c = "pathMd5 is empty";
        }
        if (m24065f(this.f23629b.m30010i())) {
            str = "externalStorage_";
        } else {
            str = "internalStorage_";
        }
        AbstractC6927a.m26913c(Uri.parse(m30007f).getHost(), (System.currentTimeMillis() - this.f23629b.m30004c()) / 1000, this.f23629b.m30003b(), str + m27228c, this.f23629b.m30012k(), str2);
    }

    /* renamed from: g */
    public long m24068g(Context context, C6355c c6355c) {
        C7760a mo26245d;
        if (c6355c == null) {
            return 0L;
        }
        String m25143e = c6355c.m25143e();
        if (TextUtils.isEmpty(m25143e) || (mo26245d = AbstractC6696b.m26246a(context).mo26245d(m25143e)) == null) {
            return 0L;
        }
        return mo26245d.m30011j();
    }

    /* renamed from: h */
    public void m24069h(InterfaceC6565c interfaceC6565c) {
        this.f23628a.add(interfaceC6565c);
    }

    /* renamed from: k */
    public void m24070k(Context context, C6355c c6355c, boolean z10) {
        if (c6355c == null) {
            return;
        }
        String m25145g = c6355c.m25145g();
        String m25144f = c6355c.m25144f();
        String m25143e = c6355c.m25143e();
        String m25141c = c6355c.m25141c();
        if (!TextUtils.isEmpty(m25145g) && !TextUtils.isEmpty(m25141c)) {
            InterfaceC6925c m26246a = AbstractC6696b.m26246a(context);
            if (TextUtils.isEmpty(m25143e)) {
                AbstractC6927a.m26915e(Uri.parse(m25145g).getHost(), "md5 is null");
                AbstractC7250a.m28063a(context, context.getString(R$string.get_md5_fail), 1);
                return;
            }
            C7760a mo26245d = m26246a.mo26245d(m25143e);
            if (mo26245d != null) {
                mo26245d.m30001G(m25145g);
                mo26245d.m30020s(m25144f);
                File file = new File(m25141c);
                C7760a c7760a = this.f23629b;
                if (c7760a != null && c7760a.m30017p()) {
                    return;
                }
                if (file.exists()) {
                    String m27227b = AbstractC7065e.m27227b(file);
                    if (m27227b != null && !m27227b.equals(m25143e)) {
                        m26246a.mo26244c(mo26245d);
                    }
                } else {
                    m26246a.mo26244c(mo26245d);
                }
                mo26245d = null;
            }
            if (mo26245d == null) {
                mo26245d = new C7760a.a().m30030c(m25143e).m30032e(m25145g).m30029b(m25144f).m30031d(m25141c).m30028a();
            }
            C7760a c7760a2 = this.f23629b;
            if (c7760a2 != null && c7760a2 != mo26245d) {
                return;
            }
            this.f23629b = mo26245d;
            if (mo26245d.m30016o()) {
                Iterator it = new ArrayList(this.f23628a).iterator();
                while (it.hasNext()) {
                    ((InterfaceC6565c) it.next()).onSuccess();
                }
                this.f23629b = null;
                return;
            }
            this.f23629b.m30023v(new a(z10, context));
            m26246a.mo26243b(this.f23629b);
        }
    }

    /* renamed from: l */
    public void m24071l(InterfaceC6565c interfaceC6565c) {
        this.f23628a.remove(interfaceC6565c);
    }
}
