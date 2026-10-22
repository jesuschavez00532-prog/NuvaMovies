package p195jc;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.swlauthnew.R$layout;
import com.swlauthnew.R$string;
import com.swlauthnew.R$style;
import p149gc.DialogC4424a;
import p149gc.DialogC4425b;
import p211kc.EnumC5146a;
import p433zd.AbstractC7786b;

/* renamed from: jc.a */
/* loaded from: classes.dex */
public class C5048a {

    /* renamed from: a */
    private long f20868a;

    /* renamed from: b */
    private Context f20869b;

    /* renamed from: c */
    private DialogC4424a f20870c;

    /* renamed from: d */
    private DialogC4425b f20871d;

    /* renamed from: e */
    private String f20872e;

    /* renamed from: f */
    private EnumC5146a f20873f;

    /* renamed from: g */
    private String f20874g;

    /* renamed from: h */
    private int f20875h;

    /* renamed from: i */
    private String f20876i;

    /* renamed from: j */
    private String f20877j;

    /* renamed from: k */
    private String f20878k;

    /* renamed from: l */
    Handler f20879l;

    /* renamed from: m */
    Runnable f20880m;

    /* renamed from: jc.a$a */
    /* loaded from: classes.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            int i10 = message.what;
            if (i10 == 16) {
                C5048a.this.m20515p();
                return;
            }
            if (i10 != 32) {
                if (i10 == 48 && C5048a.this.f20871d != null) {
                    String str2 = C5048a.this.f20878k;
                    C5048a c5048a = C5048a.this;
                    c5048a.m20516s(c5048a.f20871d.m18557b(), C5048a.this.f20871d.m18558c(), C5048a.this.f20876i, str2);
                    C5048a.this.f20871d.dismiss();
                    C5048a.this.f20871d = null;
                    return;
                }
                return;
            }
            String string = C5048a.this.f20869b.getResources().getString(R$string.authmanager_tips);
            if (C5048a.this.f20875h <= 0) {
                str = C5048a.this.f20874g;
            } else {
                str = String.format(C5048a.this.f20874g, Integer.valueOf(C5048a.this.f20875h));
            }
            String str3 = C5048a.this.f20878k;
            if (C5048a.this.f20873f == EnumC5146a.SHOW_IN_CENTER) {
                C5048a c5048a2 = C5048a.this;
                c5048a2.m20516s(string, str, c5048a2.f20876i, str3);
            } else if (C5048a.this.f20873f == EnumC5146a.SHOW_IN_BOTTOM) {
                C5048a c5048a3 = C5048a.this;
                c5048a3.f20879l.removeCallbacks(c5048a3.f20880m);
                C5048a c5048a4 = C5048a.this;
                c5048a4.f20879l.postDelayed(c5048a4.f20880m, c5048a4.f20868a * 1000);
                C5048a c5048a5 = C5048a.this;
                c5048a5.m20517t(string, str, c5048a5.f20876i, str3);
            }
        }
    }

    /* renamed from: jc.a$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C5048a.this.f20879l.sendMessage(C5048a.this.f20879l.obtainMessage(16));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.a$c */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            C5048a.this.f20870c = null;
        }
    }

    /* renamed from: jc.a$d */
    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5048a.this.f20870c != null) {
                C5048a.this.f20870c.m18552b();
            }
        }
    }

    /* renamed from: jc.a$e */
    /* loaded from: classes.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5048a.this.f20871d != null) {
                C5048a.this.f20871d.m18556a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.a$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f20886a;

        /* renamed from: b */
        final /* synthetic */ String f20887b;

        /* renamed from: c */
        final /* synthetic */ String f20888c;

        /* renamed from: jc.a$f$a */
        /* loaded from: classes.dex */
        class a implements DialogInterface.OnDismissListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                C5048a.this.f20871d = null;
            }
        }

        f(String str, String str2, String str3) {
            this.f20886a = str;
            this.f20887b = str2;
            this.f20888c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5048a.this.f20871d == null) {
                C5048a.this.f20871d = new DialogC4425b(C5048a.this.f20869b, R$style.dialog, this.f20886a, this.f20887b, this.f20888c);
                C5048a.this.f20871d.setCanceledOnTouchOutside(true);
                C5048a.this.f20871d.setCancelable(true);
                C5048a.this.f20871d.setOnDismissListener(new a());
                Window window = C5048a.this.f20871d.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.x = 11;
                attributes.y = 20;
                window.setAttributes(attributes);
                window.setGravity(85);
                C5048a.this.f20871d.show();
                return;
            }
            C5048a.this.f20871d.show();
        }
    }

    public C5048a(Context context, String str, String str2, int i10, String str3, String str4) {
        this(context, str, str2, i10, str3, null, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m20515p() {
        if (this.f20871d != null) {
            this.f20879l.removeCallbacks(this.f20880m);
            if (this.f20871d.isShowing()) {
                this.f20871d.dismiss();
            }
        }
        this.f20871d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m20516s(String str, String str2, String str3, String str4) {
        DialogC4424a dialogC4424a = new DialogC4424a(this.f20869b, R$style.dialog, R$layout.dialog_auth_brasiliptv, str, str2, str3, this.f20877j, str4);
        this.f20870c = dialogC4424a;
        dialogC4424a.setCanceledOnTouchOutside(false);
        this.f20870c.setCancelable(true);
        this.f20870c.setOnDismissListener(new c());
        this.f20870c.show();
        WindowManager.LayoutParams attributes = this.f20870c.getWindow().getAttributes();
        attributes.width = AbstractC7786b.m30166j(980);
        attributes.height = AbstractC7786b.m30163g(540);
        this.f20870c.getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m20517t(String str, String str2, String str3, String str4) {
        new Handler(Looper.getMainLooper()).post(new f(str, str2, str4));
    }

    /* renamed from: o */
    public void m20518o() {
        DialogC4424a dialogC4424a = this.f20870c;
        if (dialogC4424a != null && dialogC4424a.isShowing()) {
            this.f20879l.postDelayed(new d(), 1000L);
        }
        DialogC4425b dialogC4425b = this.f20871d;
        if (dialogC4425b != null && dialogC4425b.isShowing()) {
            this.f20879l.postDelayed(new e(), 1000L);
        }
    }

    /* renamed from: q */
    public void m20519q() {
        if (this.f20871d != null) {
            this.f20879l.removeCallbacks(this.f20880m);
            if (this.f20871d.isShowing()) {
                this.f20871d.dismiss();
            }
        }
        this.f20871d = null;
        DialogC4424a dialogC4424a = this.f20870c;
        if (dialogC4424a != null && dialogC4424a.isShowing()) {
            this.f20870c.dismiss();
        }
        this.f20870c = null;
    }

    /* renamed from: r */
    public boolean m20520r() {
        DialogC4425b dialogC4425b = this.f20871d;
        if (dialogC4425b != null && dialogC4425b.isShowing()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public boolean m20521u() {
        if (m20520r()) {
            this.f20879l.sendMessage(this.f20879l.obtainMessage(48));
            return true;
        }
        return false;
    }

    public C5048a(Context context, String str, String str2, int i10, String str3, String str4, String str5) {
        this.f20868a = 10L;
        this.f20872e = "AuthManager";
        this.f20874g = "";
        this.f20875h = -1;
        this.f20876i = "";
        this.f20877j = "";
        this.f20878k = "";
        this.f20879l = new a();
        this.f20880m = new b();
        this.f20869b = context;
        this.f20873f = EnumC5146a.m20811b(str);
        this.f20874g = str2;
        this.f20875h = i10;
        this.f20876i = str3;
        this.f20877j = str4;
        this.f20878k = str5;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f20879l.sendMessage(this.f20879l.obtainMessage(32));
    }
}
