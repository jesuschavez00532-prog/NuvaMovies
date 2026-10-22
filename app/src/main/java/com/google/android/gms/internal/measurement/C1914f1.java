package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p325s4.InterfaceC6675a;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
/* loaded from: classes.dex */
public final class C1914f1 extends AbstractC2049o0 implements InterfaceC1945h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1914f1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeLong(j10);
        m8747N(23, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeString(str2);
        AbstractC2079q0.m8778e(m8748d, bundle);
        m8747N(9, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void endAdUnitExposure(String str, long j10) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeLong(j10);
        m8747N(24, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void generateEventId(InterfaceC1990k1 interfaceC1990k1) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC1990k1);
        m8747N(22, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void getCachedAppInstanceId(InterfaceC1990k1 interfaceC1990k1) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC1990k1);
        m8747N(19, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void getConditionalUserProperties(String str, String str2, InterfaceC1990k1 interfaceC1990k1) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeString(str2);
        AbstractC2079q0.m8779f(m8748d, interfaceC1990k1);
        m8747N(10, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void getCurrentScreenClass(InterfaceC1990k1 interfaceC1990k1) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC1990k1);
        m8747N(17, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void getCurrentScreenName(InterfaceC1990k1 interfaceC1990k1) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC1990k1);
        m8747N(16, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void getGmpAppId(InterfaceC1990k1 interfaceC1990k1) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC1990k1);
        m8747N(21, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void getMaxUserProperties(String str, InterfaceC1990k1 interfaceC1990k1) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        AbstractC2079q0.m8779f(m8748d, interfaceC1990k1);
        m8747N(6, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC1990k1 interfaceC1990k1) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeString(str2);
        AbstractC2079q0.m8777d(m8748d, z10);
        AbstractC2079q0.m8779f(m8748d, interfaceC1990k1);
        m8747N(5, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void initialize(InterfaceC6675a interfaceC6675a, C2080q1 c2080q1, long j10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        AbstractC2079q0.m8778e(m8748d, c2080q1);
        m8748d.writeLong(j10);
        m8747N(1, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeString(str2);
        AbstractC2079q0.m8778e(m8748d, bundle);
        AbstractC2079q0.m8777d(m8748d, z10);
        AbstractC2079q0.m8777d(m8748d, z11);
        m8748d.writeLong(j10);
        m8747N(2, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void logHealthData(int i10, String str, InterfaceC6675a interfaceC6675a, InterfaceC6675a interfaceC6675a2, InterfaceC6675a interfaceC6675a3) {
        Parcel m8748d = m8748d();
        m8748d.writeInt(5);
        m8748d.writeString(str);
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a2);
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a3);
        m8747N(33, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void onActivityCreated(InterfaceC6675a interfaceC6675a, Bundle bundle, long j10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        AbstractC2079q0.m8778e(m8748d, bundle);
        m8748d.writeLong(j10);
        m8747N(27, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void onActivityDestroyed(InterfaceC6675a interfaceC6675a, long j10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        m8748d.writeLong(j10);
        m8747N(28, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void onActivityPaused(InterfaceC6675a interfaceC6675a, long j10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        m8748d.writeLong(j10);
        m8747N(29, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void onActivityResumed(InterfaceC6675a interfaceC6675a, long j10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        m8748d.writeLong(j10);
        m8747N(30, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void onActivitySaveInstanceState(InterfaceC6675a interfaceC6675a, InterfaceC1990k1 interfaceC1990k1, long j10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        AbstractC2079q0.m8779f(m8748d, interfaceC1990k1);
        m8748d.writeLong(j10);
        m8747N(31, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void onActivityStarted(InterfaceC6675a interfaceC6675a, long j10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        m8748d.writeLong(j10);
        m8747N(25, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void onActivityStopped(InterfaceC6675a interfaceC6675a, long j10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        m8748d.writeLong(j10);
        m8747N(26, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void registerOnMeasurementEventListener(InterfaceC2035n1 interfaceC2035n1) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC2035n1);
        m8747N(35, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, bundle);
        m8748d.writeLong(j10);
        m8747N(8, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void setCurrentScreen(InterfaceC6675a interfaceC6675a, String str, String str2, long j10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        m8748d.writeString(str);
        m8748d.writeString(str2);
        m8748d.writeLong(j10);
        m8747N(15, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8777d(m8748d, z10);
        m8747N(39, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void setUserId(String str, long j10) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeLong(j10);
        m8747N(7, m8748d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1945h1
    public final void setUserProperty(String str, String str2, InterfaceC6675a interfaceC6675a, boolean z10, long j10) {
        Parcel m8748d = m8748d();
        m8748d.writeString(str);
        m8748d.writeString(str2);
        AbstractC2079q0.m8779f(m8748d, interfaceC6675a);
        AbstractC2079q0.m8777d(m8748d, z10);
        m8748d.writeLong(j10);
        m8747N(4, m8748d);
    }
}
