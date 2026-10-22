package p211kc;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import p323s2.AbstractC6652a;

/* renamed from: kc.d */
/* loaded from: classes.dex */
public abstract class AbstractC5149d {

    /* renamed from: kc.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f21115a;

        /* renamed from: b */
        final /* synthetic */ String f21116b;

        a(Context context, String str) {
            this.f21115a = context;
            this.f21116b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast makeText = Toast.makeText(this.f21115a, this.f21116b, 0);
            AbstractC6652a.m25971a(makeText);
            Context context = this.f21115a;
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                makeText.show();
            }
        }
    }

    /* renamed from: a */
    public static void m20821a(Context context, String str) {
        new Handler(Looper.getMainLooper()).post(new a(context, str));
    }
}
