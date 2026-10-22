package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C2080q1;
import com.google.android.gms.measurement.internal.C2415q4;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.lzy.okgo.cookie.SerializableCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p025b5.AbstractC1118p;
import p025b5.InterfaceC1125w;
import p219l4.AbstractC5391n;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b */
    private static volatile AppMeasurement f8317b;

    /* renamed from: a */
    private final AbstractC2232e f8318a;

    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            AbstractC5391n.m21783i(bundle);
            this.mAppId = (String) AbstractC1118p.m5085a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) AbstractC1118p.m5085a(bundle, "origin", String.class, null);
            this.mName = (String) AbstractC1118p.m5085a(bundle, SerializableCookie.NAME, String.class, null);
            this.mValue = AbstractC1118p.m5085a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) AbstractC1118p.m5085a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) AbstractC1118p.m5085a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) AbstractC1118p.m5085a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) AbstractC1118p.m5085a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) AbstractC1118p.m5085a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) AbstractC1118p.m5085a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) AbstractC1118p.m5085a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) AbstractC1118p.m5085a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) AbstractC1118p.m5085a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) AbstractC1118p.m5085a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) AbstractC1118p.m5085a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) AbstractC1118p.m5085a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C2415q4 c2415q4) {
        this.f8318a = new C2229b(c2415q4);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f8317b == null) {
            synchronized (AppMeasurement.class) {
                if (f8317b == null) {
                    InterfaceC1125w interfaceC1125w = (InterfaceC1125w) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC1125w != null) {
                        f8317b = new AppMeasurement(interfaceC1125w);
                    } else {
                        f8317b = new AppMeasurement(C2415q4.m10013H(context, new C2080q1(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f8317b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f8318a.mo5101s(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f8318a.mo5102t(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f8318a.mo5103u(str);
    }

    @Keep
    public long generateEventId() {
        return this.f8318a.mo5091e();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f8318a.mo5092h();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List mo5097o = this.f8318a.mo5097o(str, str2);
        if (mo5097o == null) {
            size = 0;
        } else {
            size = mo5097o.size();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = mo5097o.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f8318a.mo5093i();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f8318a.mo5094l();
    }

    @Keep
    public String getGmpAppId() {
        return this.f8318a.mo5095m();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f8318a.mo5096n(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f8318a.mo5098p(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f8318a.mo5100r(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC5391n.m21783i(conditionalUserProperty);
        AbstractC2232e abstractC2232e = this.f8318a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(SerializableCookie.NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC1118p.m5086b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC2232e.mo5099q(bundle);
    }

    public AppMeasurement(InterfaceC1125w interfaceC1125w) {
        this.f8318a = new C2230c(interfaceC1125w);
    }
}
