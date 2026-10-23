package p322s1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p109e2.AbstractC4122l;

/* renamed from: s1.z */
/* loaded from: classes.dex */
public final class C6651z {

    /* renamed from: e */
    public static final boolean f25499e;

    /* renamed from: f */
    public static final boolean f25500f;

    /* renamed from: g */
    private static final File f25501g;

    /* renamed from: h */
    private static volatile C6651z f25502h;

    /* renamed from: b */
    private int f25504b;

    /* renamed from: c */
    private boolean f25505c = true;

    /* renamed from: d */
    private final AtomicBoolean f25506d = new AtomicBoolean(false);

    /* renamed from: a */
    private final int f25503a = 20000;

    static {
        boolean z10 = false;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = true;
        if (i10 < 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f25499e = z10;
        if (i10 < 28) {
            z11 = false;
        }
        f25500f = z11;
        f25501g = new File("/proc/self/fd");
    }

    C6651z() {
    }

    /* renamed from: a */
    private boolean m25963a() {
        if (f25499e && !this.f25506d.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C6651z m25964b() {
        if (f25502h == null) {
            synchronized (C6651z.class) {
                if (f25502h == null) {
                    f25502h = new C6651z();
                }
            }
        }
        return f25502h;
    }

    /* renamed from: c */
    private int m25965c() {
        if (m25967e()) {
            return 500;
        }
        return this.f25503a;
    }

    /* renamed from: d */
    private synchronized boolean m25966d() {
        boolean z10 = true;
        int i10 = this.f25504b + 1;
        this.f25504b = i10;
        if (i10 >= 50) {
            this.f25504b = 0;
            int length = f25501g.list().length;
            long m25965c = m25965c();
            if (length >= m25965c) {
                z10 = false;
            }
            this.f25505c = z10;
            if (!z10 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + m25965c);
            }
        }
        return this.f25505c;
    }

    /* renamed from: e */
    private static boolean m25967e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean m25968f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f25500f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (m25963a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 >= 0 && i11 >= 0) {
            if (!m25966d()) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m25969g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        Bitmap.Config config;
        boolean m25968f = m25968f(i10, i11, z10, z11);
        if (m25968f) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return m25968f;
    }

    /* renamed from: h */
    public void m25970h() {
        AbstractC4122l.m17229b();
        this.f25506d.set(true);
    }
}
