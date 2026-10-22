package p155h4;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p295q4.ThreadFactoryC6342a;
import p378w4.AbstractC7365e;

/* renamed from: h4.b */
/* loaded from: classes.dex */
public abstract class AbstractC4518b extends BroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f19539a;

    public AbstractC4518b() {
        AbstractC7365e.m28425a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6342a("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19539a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: e */
    private final int m18906e(Context context, Intent intent) {
        AbstractC4245i m18940c;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            m18940c = AbstractC4250l.m17733e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            m18940c = C4544x.m18936b(context).m18940c(2, bundle);
        }
        int mo10942b = mo10942b(context, new C4516a(intent));
        try {
            AbstractC4250l.m17730b(m18940c, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(valueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return mo10942b;
    }

    /* renamed from: f */
    private final int m18907f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo10943c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* renamed from: a */
    protected Executor m18908a() {
        return this.f19539a;
    }

    /* renamed from: b */
    protected abstract int mo10942b(Context context, C4516a c4516a);

    /* renamed from: c */
    protected abstract void mo10943c(Context context, Bundle bundle);

    /* renamed from: d */
    public final /* synthetic */ void m18909d(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int m18906e;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                m18906e = m18907f(context, intent2);
            } else {
                m18906e = m18906e(context, intent);
            }
            if (z10) {
                pendingResult.setResultCode(m18906e);
            }
        } finally {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        m18908a().execute(new Runnable() { // from class: h4.j
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4518b.this.m18909d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
