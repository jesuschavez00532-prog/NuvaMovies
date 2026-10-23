package p172i4;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.AbstractC0517l;
import androidx.fragment.app.AbstractActivityC0712e;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.taobao.accs.common.Constants;
import com.umeng.message.entity.UMessage;
import p203k4.AbstractC5118o;
import p203k4.C5119p;
import p203k4.InterfaceC5108e;
import p219l4.AbstractC5391n;
import p219l4.AbstractC5416y;
import p219l4.AbstractDialogInterfaceOnClickListenerC5356b0;
import p281p4.AbstractC6204h;
import p281p4.AbstractC6207k;
import p310r4.AbstractC6531b;
import p365v4.AbstractC7207f;
import p365v4.AbstractC7208g;

/* renamed from: i4.i */
/* loaded from: classes.dex */
public class C4868i extends C4870j {

    /* renamed from: c */
    private String f20366c;

    /* renamed from: e */
    private static final Object f20364e = new Object();

    /* renamed from: f */
    private static final C4868i f20365f = new C4868i();

    /* renamed from: d */
    public static final int f20363d = C4870j.f20367a;

    /* renamed from: m */
    public static C4868i m20041m() {
        return f20365f;
    }

    @Override // p172i4.C4870j
    /* renamed from: b */
    public Intent mo20042b(Context context, int i10, String str) {
        return super.mo20042b(context, i10, str);
    }

    @Override // p172i4.C4870j
    /* renamed from: c */
    public PendingIntent mo20043c(Context context, int i10, int i11) {
        return super.mo20043c(context, i10, i11);
    }

    @Override // p172i4.C4870j
    /* renamed from: e */
    public final String mo20044e(int i10) {
        return super.mo20044e(i10);
    }

    @Override // p172i4.C4870j
    /* renamed from: g */
    public int mo20045g(Context context) {
        return super.mo20045g(context);
    }

    @Override // p172i4.C4870j
    /* renamed from: h */
    public int mo20046h(Context context, int i10) {
        return super.mo20046h(context, i10);
    }

    @Override // p172i4.C4870j
    /* renamed from: j */
    public final boolean mo20047j(int i10) {
        return super.mo20047j(i10);
    }

    /* renamed from: k */
    public Dialog m20048k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return m20052p(activity, i10, AbstractDialogInterfaceOnClickListenerC5356b0.m21645b(activity, mo20042b(activity, i10, "d"), i11), onCancelListener);
    }

    /* renamed from: l */
    public PendingIntent m20049l(Context context, C4854b c4854b) {
        if (c4854b.m20020k()) {
            return c4854b.m20019j();
        }
        return mo20043c(context, c4854b.m20017g(), 0);
    }

    /* renamed from: n */
    public boolean m20050n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m20048k = m20048k(activity, i10, i11, onCancelListener);
        if (m20048k == null) {
            return false;
        }
        m20055s(activity, m20048k, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: o */
    public void m20051o(Context context, int i10) {
        m20056t(context, i10, null, m20062d(context, i10, 0, "n"));
    }

    /* renamed from: p */
    final Dialog m20052p(Context context, int i10, AbstractDialogInterfaceOnClickListenerC5356b0 abstractDialogInterfaceOnClickListenerC5356b0, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC5416y.m21822d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m21821c = AbstractC5416y.m21821c(context, i10);
        if (m21821c != null) {
            builder.setPositiveButton(m21821c, abstractDialogInterfaceOnClickListenerC5356b0);
        }
        String m21825g = AbstractC5416y.m21825g(context, i10);
        if (m21825g != null) {
            builder.setTitle(m21825g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: q */
    public final Dialog m20053q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC5416y.m21822d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m20055s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: r */
    public final C5119p m20054r(Context context, AbstractC5118o abstractC5118o) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(Constants.KEY_PACKAGE);
        C5119p c5119p = new C5119p(abstractC5118o);
        AbstractC7207f.m27904l(context, c5119p, intentFilter);
        c5119p.m20754a(context);
        if (!m20063i(context, "com.google.android.gms")) {
            abstractC5118o.mo8049a();
            c5119p.m20755b();
            return null;
        }
        return c5119p;
    }

    /* renamed from: s */
    final void m20055s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0712e) {
                C4888s.m20097F9(dialog, onCancelListener).mo3277E9(((AbstractActivityC0712e) activity).m3294d4(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC4856c.m20022a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: t */
    final void m20056t(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11 = 0;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            m20057u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String m21824f = AbstractC5416y.m21824f(context, i10);
        String m21823e = AbstractC5416y.m21823e(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC5391n.m21783i(context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION));
        AbstractC0517l.e m2272w = new AbstractC0517l.e(context).m2266q(true).m2256f(true).m2261k(m21824f).m2272w(new AbstractC0517l.c().m2247h(m21823e));
        if (AbstractC6204h.m24757c(context)) {
            AbstractC5391n.m21786l(AbstractC6207k.m24768e());
            m2272w.m2270u(context.getApplicationInfo().icon).m2268s(2);
            if (AbstractC6204h.m24758d(context)) {
                m2272w.m2253a(R$drawable.common_full_open_on_phone, resources.getString(R$string.common_open_on_phone), pendingIntent);
            } else {
                m2272w.m2259i(pendingIntent);
            }
        } else {
            m2272w.m2270u(R.drawable.stat_sys_warning).m2273x(resources.getString(R$string.common_google_play_services_notification_ticker)).m2252A(System.currentTimeMillis()).m2259i(pendingIntent).m2260j(m21823e);
        }
        if (AbstractC6207k.m24771h()) {
            AbstractC5391n.m21786l(AbstractC6207k.m24771h());
            synchronized (f20364e) {
                str2 = this.f20366c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String m21820b = AbstractC5416y.m21820b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", m21820b, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!m21820b.contentEquals(name)) {
                        notificationChannel.setName(m21820b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            m2272w.m2257g(str2);
        }
        Notification m2254b = m2272w.m2254b();
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i11 = 39789;
        } else {
            AbstractC4884q.f20381b.set(false);
            i11 = 10436;
        }
        notificationManager.notify(i11, m2254b);
    }

    /* renamed from: u */
    final void m20057u(Context context) {
        new HandlerC4889t(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: v */
    public final boolean m20058v(Activity activity, InterfaceC5108e interfaceC5108e, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m20052p = m20052p(activity, i10, AbstractDialogInterfaceOnClickListenerC5356b0.m21646c(interfaceC5108e, mo20042b(activity, i10, "d"), 2), onCancelListener);
        if (m20052p == null) {
            return false;
        }
        m20055s(activity, m20052p, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: w */
    public final boolean m20059w(Context context, C4854b c4854b, int i10) {
        PendingIntent m20049l;
        if (AbstractC6531b.m25561a(context) || (m20049l = m20049l(context, c4854b)) == null) {
            return false;
        }
        m20056t(context, c4854b.m20017g(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m7909a(context, m20049l, i10, true), AbstractC7208g.f26975a | 134217728));
        return true;
    }
}
