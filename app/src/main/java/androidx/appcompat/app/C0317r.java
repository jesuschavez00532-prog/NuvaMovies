package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.AbstractC0550d;
import com.lzy.okgo.OkGo;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.r */
/* loaded from: classes.dex */
class C0317r {

    /* renamed from: d */
    private static C0317r f1172d;

    /* renamed from: a */
    private final Context f1173a;

    /* renamed from: b */
    private final LocationManager f1174b;

    /* renamed from: c */
    private final a f1175c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.r$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        boolean f1176a;

        /* renamed from: b */
        long f1177b;

        /* renamed from: c */
        long f1178c;

        /* renamed from: d */
        long f1179d;

        /* renamed from: e */
        long f1180e;

        /* renamed from: f */
        long f1181f;

        a() {
        }
    }

    C0317r(Context context, LocationManager locationManager) {
        this.f1173a = context;
        this.f1174b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0317r m1213a(Context context) {
        if (f1172d == null) {
            Context applicationContext = context.getApplicationContext();
            f1172d = new C0317r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1172d;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0002: INVOKE (r0 I:int) = (r0v0 Object I:android.content.Context), (r1 I:java.lang.String) STATIC call: androidx.core.content.d.b(android.content.Context, java.lang.String):int A[MD:(android.content.Context, java.lang.String):int (m)] (LINE:5), block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0013: INVOKE (r2 I:int) = (r2v0 Object I:android.content.Context), (r3 I:java.lang.String) STATIC call: androidx.core.content.d.b(android.content.Context, java.lang.String):int A[MD:(android.content.Context, java.lang.String):int (m)] (LINE:24), block:B:4:0x0011 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* renamed from: b */
    private Location m1214b() {
        Object m2356b = null;
        Location location;
        Object m2356b2 = null;
        int m2356b3 = AbstractC0550d.m2356b(this.f1173a, m2356b);
        Location location2 = null;
        if (m2356b3 == 0) {
            location = m1215c("network");
        } else {
            location = null;
        }
        if (AbstractC0550d.m2356b(this.f1173a, m2356b2) == 0) {
            location2 = m1215c("gps");
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        }
        if (location2 != null) {
            return location2;
        }
        return location;
    }

    /* renamed from: c */
    private Location m1215c(String str) {
        try {
            if (this.f1174b.isProviderEnabled(str)) {
                return this.f1174b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m1216e() {
        if (this.f1175c.f1181f > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m1217f(Location location) {
        boolean z10;
        long j10;
        long j11;
        a aVar = this.f1175c;
        long currentTimeMillis = System.currentTimeMillis();
        C0316q m1211b = C0316q.m1211b();
        m1211b.m1212a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j12 = m1211b.f1169a;
        m1211b.m1212a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (m1211b.f1171c == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j13 = m1211b.f1170b;
        long j14 = m1211b.f1169a;
        boolean z11 = z10;
        m1211b.m1212a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j15 = m1211b.f1170b;
        if (j13 != -1 && j14 != -1) {
            if (currentTimeMillis > j14) {
                j11 = 0 + j15;
            } else if (currentTimeMillis > j13) {
                j11 = 0 + j14;
            } else {
                j11 = 0 + j13;
            }
            j10 = j11 + OkGo.DEFAULT_MILLISECONDS;
        } else {
            j10 = 43200000 + currentTimeMillis;
        }
        aVar.f1176a = z11;
        aVar.f1177b = j12;
        aVar.f1178c = j13;
        aVar.f1179d = j14;
        aVar.f1180e = j15;
        aVar.f1181f = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m1218d() {
        a aVar = this.f1175c;
        if (m1216e()) {
            return aVar.f1176a;
        }
        Location m1214b = m1214b();
        if (m1214b != null) {
            m1217f(m1214b);
            return aVar.f1176a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        if (i10 >= 6 && i10 < 22) {
            return false;
        }
        return true;
    }
}
