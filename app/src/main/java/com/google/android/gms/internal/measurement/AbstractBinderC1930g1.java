package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import p325s4.InterfaceC6675a;

/* renamed from: com.google.android.gms.internal.measurement.g1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1930g1 extends AbstractBinderC2064p0 implements InterfaceC1945h1 {
    public AbstractBinderC1930g1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC1945h1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof InterfaceC1945h1) {
            return (InterfaceC1945h1) queryLocalInterface;
        }
        return new C1914f1(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC2064p0
    /* renamed from: a */
    protected final boolean mo5059a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC1990k1 c1960i1;
        InterfaceC1990k1 interfaceC1990k1;
        InterfaceC1990k1 interfaceC1990k12 = null;
        InterfaceC1990k1 interfaceC1990k13 = null;
        InterfaceC1990k1 interfaceC1990k14 = null;
        InterfaceC2035n1 interfaceC2035n1 = null;
        InterfaceC2035n1 interfaceC2035n12 = null;
        InterfaceC2035n1 interfaceC2035n13 = null;
        InterfaceC1990k1 interfaceC1990k15 = null;
        InterfaceC1990k1 interfaceC1990k16 = null;
        InterfaceC1990k1 interfaceC1990k17 = null;
        InterfaceC1990k1 interfaceC1990k18 = null;
        InterfaceC1990k1 interfaceC1990k19 = null;
        InterfaceC1990k1 interfaceC1990k110 = null;
        InterfaceC2065p1 interfaceC2065p1 = null;
        InterfaceC1990k1 interfaceC1990k111 = null;
        InterfaceC1990k1 interfaceC1990k112 = null;
        InterfaceC1990k1 interfaceC1990k113 = null;
        InterfaceC1990k1 interfaceC1990k114 = null;
        switch (i10) {
            case 1:
                InterfaceC6675a m26052c = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                C2080q1 c2080q1 = (C2080q1) AbstractC2079q0.m8774a(parcel, C2080q1.CREATOR);
                long readLong = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                initialize(m26052c, c2080q1, readLong);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
                boolean m8780g = AbstractC2079q0.m8780g(parcel);
                boolean m8780g2 = AbstractC2079q0.m8780g(parcel);
                long readLong2 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                logEvent(readString, readString2, bundle, m8780g, m8780g2, readLong2);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    interfaceC1990k1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof InterfaceC1990k1) {
                        c1960i1 = (InterfaceC1990k1) queryLocalInterface;
                    } else {
                        c1960i1 = new C1960i1(readStrongBinder);
                    }
                    interfaceC1990k1 = c1960i1;
                }
                long readLong3 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                logEventAndBundle(readString3, readString4, bundle2, interfaceC1990k1, readLong3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                InterfaceC6675a m26052c2 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                boolean m8780g3 = AbstractC2079q0.m8780g(parcel);
                long readLong4 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                setUserProperty(readString5, readString6, m26052c2, m8780g3, readLong4);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean m8780g4 = AbstractC2079q0.m8780g(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof InterfaceC1990k1) {
                        interfaceC1990k12 = (InterfaceC1990k1) queryLocalInterface2;
                    } else {
                        interfaceC1990k12 = new C1960i1(readStrongBinder2);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                getUserProperties(readString7, readString8, m8780g4, interfaceC1990k12);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof InterfaceC1990k1) {
                        interfaceC1990k114 = (InterfaceC1990k1) queryLocalInterface3;
                    } else {
                        interfaceC1990k114 = new C1960i1(readStrongBinder3);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                getMaxUserProperties(readString9, interfaceC1990k114);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                setUserId(readString10, readLong5);
                parcel2.writeNoException();
                return true;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                parcel2.writeNoException();
                return true;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof InterfaceC1990k1) {
                        interfaceC1990k113 = (InterfaceC1990k1) queryLocalInterface4;
                    } else {
                        interfaceC1990k113 = new C1960i1(readStrongBinder4);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                getConditionalUserProperties(readString13, readString14, interfaceC1990k113);
                parcel2.writeNoException();
                return true;
            case 11:
                boolean m8780g5 = AbstractC2079q0.m8780g(parcel);
                long readLong7 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                setMeasurementEnabled(m8780g5, readLong7);
                parcel2.writeNoException();
                return true;
            case 12:
                long readLong8 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                resetAnalyticsData(readLong8);
                parcel2.writeNoException();
                return true;
            case 13:
                long readLong9 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                setMinimumSessionDuration(readLong9);
                parcel2.writeNoException();
                return true;
            case 14:
                long readLong10 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                setSessionTimeoutDuration(readLong10);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC6675a m26052c3 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                setCurrentScreen(m26052c3, readString15, readString16, readLong11);
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof InterfaceC1990k1) {
                        interfaceC1990k112 = (InterfaceC1990k1) queryLocalInterface5;
                    } else {
                        interfaceC1990k112 = new C1960i1(readStrongBinder5);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                getCurrentScreenName(interfaceC1990k112);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof InterfaceC1990k1) {
                        interfaceC1990k111 = (InterfaceC1990k1) queryLocalInterface6;
                    } else {
                        interfaceC1990k111 = new C1960i1(readStrongBinder6);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                getCurrentScreenClass(interfaceC1990k111);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof InterfaceC2065p1) {
                        interfaceC2065p1 = (InterfaceC2065p1) queryLocalInterface7;
                    } else {
                        interfaceC2065p1 = new C2050o1(readStrongBinder7);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                setInstanceIdProvider(interfaceC2065p1);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof InterfaceC1990k1) {
                        interfaceC1990k110 = (InterfaceC1990k1) queryLocalInterface8;
                    } else {
                        interfaceC1990k110 = new C1960i1(readStrongBinder8);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                getCachedAppInstanceId(interfaceC1990k110);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof InterfaceC1990k1) {
                        interfaceC1990k19 = (InterfaceC1990k1) queryLocalInterface9;
                    } else {
                        interfaceC1990k19 = new C1960i1(readStrongBinder9);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                getAppInstanceId(interfaceC1990k19);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof InterfaceC1990k1) {
                        interfaceC1990k18 = (InterfaceC1990k1) queryLocalInterface10;
                    } else {
                        interfaceC1990k18 = new C1960i1(readStrongBinder10);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                getGmpAppId(interfaceC1990k18);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof InterfaceC1990k1) {
                        interfaceC1990k17 = (InterfaceC1990k1) queryLocalInterface11;
                    } else {
                        interfaceC1990k17 = new C1960i1(readStrongBinder11);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                generateEventId(interfaceC1990k17);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                beginAdUnitExposure(readString17, readLong12);
                parcel2.writeNoException();
                return true;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                endAdUnitExposure(readString18, readLong13);
                parcel2.writeNoException();
                return true;
            case 25:
                InterfaceC6675a m26052c4 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                onActivityStarted(m26052c4, readLong14);
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC6675a m26052c5 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                onActivityStopped(m26052c5, readLong15);
                parcel2.writeNoException();
                return true;
            case 27:
                InterfaceC6675a m26052c6 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                onActivityCreated(m26052c6, bundle5, readLong16);
                parcel2.writeNoException();
                return true;
            case 28:
                InterfaceC6675a m26052c7 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                onActivityDestroyed(m26052c7, readLong17);
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC6675a m26052c8 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                onActivityPaused(m26052c8, readLong18);
                parcel2.writeNoException();
                return true;
            case 30:
                InterfaceC6675a m26052c9 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                onActivityResumed(m26052c9, readLong19);
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC6675a m26052c10 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof InterfaceC1990k1) {
                        interfaceC1990k16 = (InterfaceC1990k1) queryLocalInterface12;
                    } else {
                        interfaceC1990k16 = new C1960i1(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                onActivitySaveInstanceState(m26052c10, interfaceC1990k16, readLong20);
                parcel2.writeNoException();
                return true;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof InterfaceC1990k1) {
                        interfaceC1990k15 = (InterfaceC1990k1) queryLocalInterface13;
                    } else {
                        interfaceC1990k15 = new C1960i1(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                performAction(bundle6, interfaceC1990k15, readLong21);
                parcel2.writeNoException();
                return true;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                InterfaceC6675a m26052c11 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                InterfaceC6675a m26052c12 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                InterfaceC6675a m26052c13 = InterfaceC6675a.a.m26052c(parcel.readStrongBinder());
                AbstractC2079q0.m8776c(parcel);
                logHealthData(readInt, readString19, m26052c11, m26052c12, m26052c13);
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof InterfaceC2035n1) {
                        interfaceC2035n13 = (InterfaceC2035n1) queryLocalInterface14;
                    } else {
                        interfaceC2035n13 = new C2005l1(readStrongBinder14);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                setEventInterceptor(interfaceC2035n13);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof InterfaceC2035n1) {
                        interfaceC2035n12 = (InterfaceC2035n1) queryLocalInterface15;
                    } else {
                        interfaceC2035n12 = new C2005l1(readStrongBinder15);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                registerOnMeasurementEventListener(interfaceC2035n12);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof InterfaceC2035n1) {
                        interfaceC2035n1 = (InterfaceC2035n1) queryLocalInterface16;
                    } else {
                        interfaceC2035n1 = new C2005l1(readStrongBinder16);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                unregisterOnMeasurementEventListener(interfaceC2035n1);
                parcel2.writeNoException();
                return true;
            case 37:
                HashMap m8775b = AbstractC2079q0.m8775b(parcel);
                AbstractC2079q0.m8776c(parcel);
                initForTests(m8775b);
                parcel2.writeNoException();
                return true;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof InterfaceC1990k1) {
                        interfaceC1990k14 = (InterfaceC1990k1) queryLocalInterface17;
                    } else {
                        interfaceC1990k14 = new C1960i1(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                AbstractC2079q0.m8776c(parcel);
                getTestFlag(interfaceC1990k14, readInt2);
                parcel2.writeNoException();
                return true;
            case 39:
                boolean m8780g6 = AbstractC2079q0.m8780g(parcel);
                AbstractC2079q0.m8776c(parcel);
                setDataCollectionEnabled(m8780g6);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof InterfaceC1990k1) {
                        interfaceC1990k13 = (InterfaceC1990k1) queryLocalInterface18;
                    } else {
                        interfaceC1990k13 = new C1960i1(readStrongBinder18);
                    }
                }
                AbstractC2079q0.m8776c(parcel);
                isDataCollectionEnabled(interfaceC1990k13);
                parcel2.writeNoException();
                return true;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                setDefaultEventParameters(bundle7);
                parcel2.writeNoException();
                return true;
            case 43:
                long readLong22 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                clearMeasurementEnabled(readLong22);
                parcel2.writeNoException();
                return true;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                setConsent(bundle8, readLong23);
                parcel2.writeNoException();
                return true;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                AbstractC2079q0.m8776c(parcel);
                setConsentThirdParty(bundle9, readLong24);
                parcel2.writeNoException();
                return true;
        }
    }
}
