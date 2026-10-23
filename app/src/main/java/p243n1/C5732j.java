package p243n1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import anet.channel.entity.EventType;

/* renamed from: n1.j */
/* loaded from: classes.dex */
public final class C5732j {

    /* renamed from: a */
    private final int f23005a;

    /* renamed from: b */
    private final int f23006b;

    /* renamed from: c */
    private final Context f23007c;

    /* renamed from: d */
    private final int f23008d;

    /* renamed from: n1.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: i */
        static final int f23009i;

        /* renamed from: a */
        final Context f23010a;

        /* renamed from: b */
        ActivityManager f23011b;

        /* renamed from: c */
        c f23012c;

        /* renamed from: e */
        float f23014e;

        /* renamed from: d */
        float f23013d = 2.0f;

        /* renamed from: f */
        float f23015f = 0.4f;

        /* renamed from: g */
        float f23016g = 0.33f;

        /* renamed from: h */
        int f23017h = 4194304;

        static {
            int i10 = 0;
            if (Build.VERSION.SDK_INT < 26) {
                i10 = 4;
            } else {
                i10 = 1;
            }
            f23009i = i10;
        }

        public a(Context context) {
            this.f23014e = f23009i;
            this.f23010a = context;
            this.f23011b = (ActivityManager) context.getSystemService("activity");
            this.f23012c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C5732j.m23137e(this.f23011b)) {
                this.f23014e = 0.0f;
            }
        }

        /* renamed from: a */
        public C5732j m23142a() {
            return new C5732j(this);
        }
    }

    /* renamed from: n1.j$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final DisplayMetrics f23018a;

        b(DisplayMetrics displayMetrics) {
            this.f23018a = displayMetrics;
        }

        @Override // p243n1.C5732j.c
        /* renamed from: a */
        public int mo23143a() {
            return this.f23018a.heightPixels;
        }

        @Override // p243n1.C5732j.c
        /* renamed from: b */
        public int mo23144b() {
            return this.f23018a.widthPixels;
        }
    }

    /* renamed from: n1.j$c */
    /* loaded from: classes.dex */
    class c {
        /* renamed from: a */
        int mo23143a();

        /* renamed from: b */
        int mo23144b();
    }

    C5732j(a aVar) {
        int i10 = 0;
        boolean z10;
        this.f23007c = aVar.f23010a;
        if (m23137e(aVar.f23011b)) {
            i10 = aVar.f23017h / 2;
        } else {
            i10 = aVar.f23017h;
        }
        this.f23008d = i10;
        int m23136c = m23136c(aVar.f23011b, aVar.f23015f, aVar.f23016g);
        float mo23144b = aVar.f23012c.mo23144b() * aVar.f23012c.mo23143a() * 4;
        int round = Math.round(aVar.f23014e * mo23144b);
        int round2 = Math.round(mo23144b * aVar.f23013d);
        int i11 = m23136c - i10;
        int i12 = round2 + round;
        if (i12 <= i11) {
            this.f23006b = round2;
            this.f23005a = round;
        } else {
            float f10 = i11;
            float f11 = aVar.f23014e;
            float f12 = aVar.f23013d;
            float f13 = f10 / (f11 + f12);
            this.f23006b = Math.round(f12 * f13);
            this.f23005a = Math.round(f13 * aVar.f23014e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(m23138f(this.f23006b));
            sb2.append(", pool size: ");
            sb2.append(m23138f(this.f23005a));
            sb2.append(", byte array size: ");
            sb2.append(m23138f(i10));
            sb2.append(", memory class limited? ");
            if (i12 > m23136c) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            sb2.append(", max size: ");
            sb2.append(m23138f(m23136c));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f23011b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(m23137e(aVar.f23011b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    /* renamed from: c */
    private static int m23136c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * EventType.AUTH_FAIL * EventType.AUTH_FAIL;
        if (m23137e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    /* renamed from: e */
    static boolean m23137e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: f */
    private String m23138f(int i10) {
        return Formatter.formatFileSize(this.f23007c, i10);
    }

    /* renamed from: a */
    public int m23139a() {
        return this.f23008d;
    }

    /* renamed from: b */
    public int m23140b() {
        return this.f23005a;
    }

    /* renamed from: d */
    public int m23141d() {
        return this.f23006b;
    }
}
