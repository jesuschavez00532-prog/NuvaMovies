package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.AbstractC0547a;
import java.util.Arrays;

/* renamed from: androidx.core.app.c */
/* loaded from: classes.dex */
public abstract class AbstractC0498c extends AbstractC0547a {

    /* renamed from: androidx.core.app.c$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String[] f2187a;

        /* renamed from: b */
        final /* synthetic */ Activity f2188b;

        /* renamed from: c */
        final /* synthetic */ int f2189c;

        a(String[] strArr, Activity activity, int i10) {
            this.f2187a = strArr;
            this.f2188b = activity;
            this.f2189c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f2187a.length];
            PackageManager packageManager = this.f2188b.getPackageManager();
            String packageName = this.f2188b.getPackageName();
            int length = this.f2187a.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f2187a[i10], packageName);
            }
            ((c) this.f2188b).onRequestPermissionsResult(this.f2189c, this.f2187a, iArr);
        }
    }

    /* renamed from: androidx.core.app.c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f2190a;

        b(Activity activity) {
            this.f2190a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f2190a.isFinishing() && !AbstractC0503e.m2204i(this.f2190a)) {
                this.f2190a.recreate();
            }
        }
    }

    /* renamed from: androidx.core.app.c$c */
    /* loaded from: classes.dex */
    public interface c {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.c$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: e0 */
        void mo2187e0(int i10);
    }

    /* renamed from: l */
    public static void m2181l(Activity activity) {
        activity.finishAffinity();
    }

    /* renamed from: m */
    public static void m2182m(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            activity.recreate();
        } else if (i10 <= 23) {
            new Handler(activity.getMainLooper()).post(new b(activity));
        } else if (!AbstractC0503e.m2204i(activity)) {
            activity.recreate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static void m2183n(Activity activity, String[] strArr, int i10) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).mo2187e0(i10);
            }
            activity.requestPermissions(strArr, i10);
        } else if (activity instanceof c) {
            new Handler(Looper.getMainLooper()).post(new a(strArr, activity, i10));
        }
    }

    /* renamed from: o */
    public static boolean m2184o(Activity activity, String str) {
        boolean shouldShowRequestPermissionRationale;
        if (Build.VERSION.SDK_INT >= 23) {
            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
            return shouldShowRequestPermissionRationale;
        }
        return false;
    }

    /* renamed from: p */
    public static void m2185p(Activity activity, Intent intent, int i10, Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    /* renamed from: q */
    public static void m2186q(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
