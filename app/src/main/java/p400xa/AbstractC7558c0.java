package p400xa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p231m2.AbstractC5584b;

/* renamed from: xa.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7558c0 {

    /* renamed from: a */
    private static b f27757a;

    /* renamed from: b */
    private static a f27758b;

    /* renamed from: xa.c0$a */
    /* loaded from: classes2.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a */
        final String f27759a = "reason";

        /* renamed from: b */
        final String f27760b = "homekey";

        /* renamed from: c */
        final String f27761c = "recentapps";

        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = null;
            if (AbstractC7558c0.f27757a != null && intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && (stringExtra = intent.getStringExtra("reason")) != null && AbstractC7558c0.f27757a != null) {
                if (stringExtra.equals("homekey")) {
                    AbstractC7558c0.f27757a.mo11975o1();
                } else if (stringExtra.equals("recentapps")) {
                    AbstractC7558c0.f27757a.mo11969N2();
                }
            }
        }
    }

    /* renamed from: xa.c0$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: N2 */
        void mo11969N2();

        /* renamed from: o1 */
        void mo11975o1();
    }

    /* renamed from: b */
    public static void m28978b(Context context) {
        if (f27758b == null) {
            return;
        }
        try {
            context.getApplicationContext().unregisterReceiver(f27758b);
            f27758b = null;
        } catch (Exception e10) {
            AbstractC5584b.m22679a(e10, "HomeKeyObserver");
        }
    }

    /* renamed from: c */
    public static void m28979c(b bVar) {
        f27757a = bVar;
    }

    /* renamed from: d */
    public static void m28980d(Context context) {
        if (f27758b != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        f27758b = new a();
        context.getApplicationContext().registerReceiver(f27758b, intentFilter);
    }

    /* renamed from: e */
    public static void m28981e() {
        f27757a = null;
    }
}
