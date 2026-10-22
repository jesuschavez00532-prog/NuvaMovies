package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p325s4.InterfaceC6675a;

/* renamed from: com.google.android.gms.internal.measurement.h1 */
/* loaded from: classes.dex */
public interface InterfaceC1945h1 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(InterfaceC1990k1 interfaceC1990k1);

    void getAppInstanceId(InterfaceC1990k1 interfaceC1990k1);

    void getCachedAppInstanceId(InterfaceC1990k1 interfaceC1990k1);

    void getConditionalUserProperties(String str, String str2, InterfaceC1990k1 interfaceC1990k1);

    void getCurrentScreenClass(InterfaceC1990k1 interfaceC1990k1);

    void getCurrentScreenName(InterfaceC1990k1 interfaceC1990k1);

    void getGmpAppId(InterfaceC1990k1 interfaceC1990k1);

    void getMaxUserProperties(String str, InterfaceC1990k1 interfaceC1990k1);

    void getTestFlag(InterfaceC1990k1 interfaceC1990k1, int i10);

    void getUserProperties(String str, String str2, boolean z10, InterfaceC1990k1 interfaceC1990k1);

    void initForTests(Map map);

    void initialize(InterfaceC6675a interfaceC6675a, C2080q1 c2080q1, long j10);

    void isDataCollectionEnabled(InterfaceC1990k1 interfaceC1990k1);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1990k1 interfaceC1990k1, long j10);

    void logHealthData(int i10, String str, InterfaceC6675a interfaceC6675a, InterfaceC6675a interfaceC6675a2, InterfaceC6675a interfaceC6675a3);

    void onActivityCreated(InterfaceC6675a interfaceC6675a, Bundle bundle, long j10);

    void onActivityDestroyed(InterfaceC6675a interfaceC6675a, long j10);

    void onActivityPaused(InterfaceC6675a interfaceC6675a, long j10);

    void onActivityResumed(InterfaceC6675a interfaceC6675a, long j10);

    void onActivitySaveInstanceState(InterfaceC6675a interfaceC6675a, InterfaceC1990k1 interfaceC1990k1, long j10);

    void onActivityStarted(InterfaceC6675a interfaceC6675a, long j10);

    void onActivityStopped(InterfaceC6675a interfaceC6675a, long j10);

    void performAction(Bundle bundle, InterfaceC1990k1 interfaceC1990k1, long j10);

    void registerOnMeasurementEventListener(InterfaceC2035n1 interfaceC2035n1);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(InterfaceC6675a interfaceC6675a, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC2035n1 interfaceC2035n1);

    void setInstanceIdProvider(InterfaceC2065p1 interfaceC2065p1);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, InterfaceC6675a interfaceC6675a, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(InterfaceC2035n1 interfaceC2035n1);
}
