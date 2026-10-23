package p155h4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.C4247j;
import p127f5.InterfaceC4229a;
import p127f5.InterfaceC4235d;
import p127f5.InterfaceC4243h;
import p214l.C5311i;
import p378w4.AbstractC7361a;

/* renamed from: h4.d */
/* loaded from: classes.dex */
public class C4522d {

    /* renamed from: h */
    private static int f19545h;

    /* renamed from: i */
    private static PendingIntent f19546i;

    /* renamed from: j */
    private static final Executor f19547j = new Executor() { // from class: h4.e0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k */
    private static final Pattern f19548k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    private final Context f19550b;

    /* renamed from: c */
    private final C4545y f19551c;

    /* renamed from: d */
    private final ScheduledExecutorService f19552d;

    /* renamed from: f */
    private Messenger f19554f;

    /* renamed from: g */
    private C4529i f19555g;

    /* renamed from: a */
    private final C5311i f19549a = new C5311i();

    /* renamed from: e */
    private Messenger f19553e = new Messenger(new HandlerC4526f(this, Looper.getMainLooper()));

    public C4522d(Context context) {
        this.f19550b = context;
        this.f19551c = new C4545y(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19552d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC4245i m18911b(Bundle bundle) {
        if (m18917j(bundle)) {
            return AbstractC4250l.m17733e(null);
        }
        return AbstractC4250l.m17733e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m18912d(C4522d c4522d, Message message) {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C4528h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C4529i) {
                        c4522d.f19555g = (C4529i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c4522d.f19554f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            str4 = "Unexpected response action: ".concat(valueOf);
                        } else {
                            str4 = new String("Unexpected response action: ");
                        }
                        Log.d("Rpc", str4);
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 49);
                        sb2.append("Unexpected response, no error or registration id ");
                        sb2.append(valueOf2);
                        Log.w("Rpc", sb2.toString());
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra2.length() != 0) {
                            str3 = "Received InstanceID error ".concat(stringExtra2);
                        } else {
                            str3 = new String("Received InstanceID error ");
                        }
                        Log.d("Rpc", str3);
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str5 = split[2];
                            String str6 = split[3];
                            if (str6.startsWith(":")) {
                                str6 = str6.substring(1);
                            }
                            c4522d.m18916i(str5, intent2.putExtra("error", str6).getExtras());
                            return;
                        }
                        if (stringExtra2.length() != 0) {
                            str2 = "Unexpected structured response ".concat(stringExtra2);
                        } else {
                            str2 = new String("Unexpected structured response ");
                        }
                        Log.w("Rpc", str2);
                        return;
                    }
                    synchronized (c4522d.f19549a) {
                        for (int i10 = 0; i10 < c4522d.f19549a.size(); i10++) {
                            c4522d.m18916i((String) c4522d.f19549a.m21434i(i10), intent2.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher = f19548k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra.length() != 0) {
                            str = "Unexpected response string: ".concat(stringExtra);
                        } else {
                            str = new String("Unexpected response string: ");
                        }
                        Log.d("Rpc", str);
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    c4522d.m18916i(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: f */
    private final AbstractC4245i m18913f(Bundle bundle) {
        final String m18914g = m18914g();
        final C4247j c4247j = new C4247j();
        synchronized (this.f19549a) {
            this.f19549a.put(m18914g, c4247j);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f19551c.m18943b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m18915h(this.f19550b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m18914g).length() + 5);
        sb2.append("|ID|");
        sb2.append(m18914g);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f19553e);
        if (this.f19554f != null || this.f19555g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f19554f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f19555g.m18922b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f19552d.schedule(new Runnable() { // from class: h4.d0
                @Override // java.lang.Runnable
                public final void run() {
                    if (C4247j.this.m17727d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            c4247j.m17724a().mo17701c(f19547j, new InterfaceC4235d() { // from class: h4.b0
                @Override // p127f5.InterfaceC4235d
                /* renamed from: a */
                public final void mo488a(AbstractC4245i abstractC4245i) {
                    C4522d.this.m18920e(m18914g, schedule, abstractC4245i);
                }
            });
            return c4247j.m17724a();
        }
        if (this.f19551c.m18943b() == 2) {
            this.f19550b.sendBroadcast(intent);
        } else {
            this.f19550b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f19552d.schedule(new Runnable() { // from class: h4.d0
            @Override // java.lang.Runnable
            public final void run() {
                if (C4247j.this.m17727d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c4247j.m17724a().mo17701c(f19547j, new InterfaceC4235d() { // from class: h4.b0
            @Override // p127f5.InterfaceC4235d
            /* renamed from: a */
            public final void mo488a(AbstractC4245i abstractC4245i) {
                C4522d.this.m18920e(m18914g, schedule2, abstractC4245i);
            }
        });
        return c4247j.m17724a();
    }

    /* renamed from: g */
    private static synchronized String m18914g() {
        String num = null;
        synchronized (C4522d.class) {
            int i10 = f19545h;
            f19545h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m18915h(Context context, Intent intent) {
        synchronized (C4522d.class) {
            if (f19546i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f19546i = AbstractC7361a.m28424a(context, 0, intent2, AbstractC7361a.f27339a);
            }
            intent.putExtra("app", f19546i);
        }
    }

    /* renamed from: i */
    private final void m18916i(String str, Bundle bundle) {
        String str2 = null;
        synchronized (this.f19549a) {
            C4247j c4247j = (C4247j) this.f19549a.remove(str);
            if (c4247j == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("Rpc", str2);
                return;
            }
            c4247j.m17726c(bundle);
        }
    }

    /* renamed from: j */
    private static boolean m18917j(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC4245i m18918a(final Bundle bundle) {
        if (this.f19551c.m18942a() < 12000000) {
            if (this.f19551c.m18943b() != 0) {
                return m18913f(bundle).mo17706h(f19547j, new InterfaceC4229a() { // from class: h4.z
                    @Override // p127f5.InterfaceC4229a
                    /* renamed from: a */
                    public final Object mo289a(AbstractC4245i abstractC4245i) {
                        return C4522d.this.m18919c(bundle, abstractC4245i);
                    }
                });
            }
            return AbstractC4250l.m17732d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return C4544x.m18936b(this.f19550b).m18941d(1, bundle).mo17705g(f19547j, new InterfaceC4229a() { // from class: h4.a0
            @Override // p127f5.InterfaceC4229a
            /* renamed from: a */
            public final Object mo289a(AbstractC4245i abstractC4245i) {
                if (abstractC4245i.mo17712n()) {
                    return (Bundle) abstractC4245i.mo17708j();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(abstractC4245i.mo17707i());
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
                    sb2.append("Error making request: ");
                    sb2.append(valueOf);
                    Log.d("Rpc", sb2.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC4245i.mo17707i());
            }
        });
    }

    /* renamed from: c */
    public final /* synthetic */ AbstractC4245i m18919c(Bundle bundle, AbstractC4245i abstractC4245i) {
        if (!abstractC4245i.mo17712n()) {
            return abstractC4245i;
        }
        if (!m18917j((Bundle) abstractC4245i.mo17708j())) {
            return abstractC4245i;
        }
        return m18913f(bundle).mo17714p(f19547j, new InterfaceC4243h() { // from class: h4.c0
            @Override // p127f5.InterfaceC4243h
            /* renamed from: a */
            public final AbstractC4245i mo346a(Object obj) {
                return C4522d.m18911b((Bundle) obj);
            }
        });
    }

    /* renamed from: e */
    public final /* synthetic */ void m18920e(String str, ScheduledFuture scheduledFuture, AbstractC4245i abstractC4245i) {
        synchronized (this.f19549a) {
            this.f19549a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
