package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C2201y2;
import com.google.firebase.installations.C2655c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p025b5.InterfaceC1125w;
import p127f5.AbstractC4250l;
import p219l4.AbstractC5391n;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f9997b;

    /* renamed from: a */
    private final C2201y2 f9998a;

    public FirebaseAnalytics(C2201y2 c2201y2) {
        AbstractC5391n.m21783i(c2201y2);
        this.f9998a = c2201y2;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f9997b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f9997b == null) {
                    f9997b = new FirebaseAnalytics(C2201y2.m9206s(context, null, null, null, null));
                }
            }
        }
        return f9997b;
    }

    @Keep
    public static InterfaceC1125w getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C2201y2 m9206s = C2201y2.m9206s(context, null, null, null, bundle);
        if (m9206s == null) {
            return null;
        }
        return new C2613a(m9206s);
    }

    /* renamed from: a */
    public void m10840a(String str, Bundle bundle) {
        this.f9998a.m9211G(str, bundle);
    }

    /* renamed from: b */
    public void m10841b(String str) {
        this.f9998a.m9217e(str);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) AbstractC4250l.m17730b(C2655c.m11017o().mo11028a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f9998a.m9216d(activity, str, str2);
    }
}
