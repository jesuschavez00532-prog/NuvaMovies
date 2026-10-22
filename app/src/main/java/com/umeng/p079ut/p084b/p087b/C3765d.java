package com.umeng.p079ut.p084b.p087b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.umeng.p079ut.p080a.C3742a;
import com.umeng.p079ut.p080a.p083c.C3755d;
import com.umeng.p079ut.p080a.p083c.C3756e;
import com.umeng.p079ut.p084b.p085a.p086a.C3757a;
import com.umeng.p079ut.p084b.p085a.p086a.C3758b;
import com.umeng.p079ut.p084b.p085a.p086a.C3759c;
import com.umeng.p079ut.p084b.p085a.p086a.C3760d;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.android.agoo.common.Config;

/* renamed from: com.umeng.ut.b.b.d */
/* loaded from: classes3.dex */
public class C3765d {

    /* renamed from: a */
    private static C3765d f16813a;

    /* renamed from: a */
    private Context f16816a;

    /* renamed from: c */
    private String f16817c = null;

    /* renamed from: d */
    private long f16818d = -1;

    /* renamed from: b */
    private static Pattern f16815b = Pattern.compile("[^0-9a-zA-Z=/+]+");

    /* renamed from: a */
    private static final Object f16814a = new Object();

    private C3765d(Context context) {
        this.f16816a = context.getApplicationContext();
        C3742a.m15925a().m15930a(this.f16816a);
    }

    /* renamed from: a */
    public static C3765d m15978a(Context context) {
        if (context != null && f16813a == null) {
            synchronized (f16814a) {
                if (f16813a == null) {
                    f16813a = new C3765d(context);
                }
            }
        }
        return f16813a;
    }

    /* renamed from: b */
    private boolean m15983b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        if (24 == str.length()) {
            return !f16815b.matcher(str).find();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r0 > 7776000) goto L7;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long m15984c() {
        /*
            r5 = this;
            java.lang.String r0 = "um_push_ut"
            android.content.SharedPreferences r0 = r5.m15977a(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = "v_i"
            r2 = 604800(0x93a80, double:2.98811E-318)
            long r0 = r0.getLong(r1, r2)     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r0 = 0
        L12:
            r2 = 600(0x258, double:2.964E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1a
        L18:
            r0 = r2
            goto L22
        L1a:
            r2 = 7776000(0x76a700, double:3.8418545E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L22
            goto L18
        L22:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.p079ut.p084b.p087b.C3765d.m15984c():long");
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: e */
    private void m15986e() {
        try {
            m15977a("um_push_ut").edit().remove("v_r").commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|3|(7:8|(2:10|(2:18|(3:22|23|24))(3:14|15|16))|25|26|(5:28|(1:30)|31|32|33)|35|36)|39|(0)|25|26|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x006c, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0009, B:10:0x0017, B:12:0x0023, B:14:0x002b, B:18:0x002f, B:20:0x003b, B:22:0x0043, B:26:0x004c, B:28:0x0052, B:30:0x005e, B:31:0x0061, B:38:0x0066), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[Catch: Exception -> 0x0065, all -> 0x006c, TryCatch #0 {Exception -> 0x0065, blocks: (B:26:0x004c, B:28:0x0052, B:30:0x005e, B:31:0x0061), top: B:25:0x004c, outer: #1 }] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.lang.String m15987j() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.m15985c()     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L14
            android.content.Context r0 = r4.f16816a     // Catch: java.lang.Throwable -> L6c
            boolean r0 = com.umeng.p079ut.p080a.p083c.C3752a.m15940a(r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L4c
            java.lang.String r3 = r4.m15989l()     // Catch: java.lang.Throwable -> L6c
            r4.f16817c = r3     // Catch: java.lang.Throwable -> L6c
            boolean r3 = com.umeng.p079ut.p084b.p085a.p086a.C3760d.isEmpty(r3)     // Catch: java.lang.Throwable -> L6c
            if (r3 != 0) goto L2f
            java.lang.String r3 = r4.f16817c     // Catch: java.lang.Throwable -> L6c
            boolean r3 = r4.m15983b(r3)     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L2f
            java.lang.String r0 = r4.f16817c     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r4)
            return r0
        L2f:
            java.lang.String r3 = r4.m15988k()     // Catch: java.lang.Throwable -> L6c
            r4.f16817c = r3     // Catch: java.lang.Throwable -> L6c
            boolean r3 = com.umeng.p079ut.p084b.p085a.p086a.C3760d.isEmpty(r3)     // Catch: java.lang.Throwable -> L6c
            if (r3 != 0) goto L4c
            java.lang.String r3 = r4.f16817c     // Catch: java.lang.Throwable -> L6c
            boolean r3 = r4.m15983b(r3)     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L4c
            java.lang.String r0 = r4.f16817c     // Catch: java.lang.Throwable -> L6c
            r4.m15980a(r0, r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r4.f16817c     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r4)
            return r0
        L4c:
            byte[] r1 = r4.m15981a()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L6c
            if (r1 == 0) goto L69
            r3 = 2
            java.lang.String r1 = com.umeng.p079ut.p084b.p085a.p086a.C3757a.m15960a(r1, r3)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L6c
            r4.f16817c = r1     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L6c
            r4.m15980a(r1, r2)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L6c
            if (r0 != 0) goto L61
            r4.m15986e()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L6c
        L61:
            java.lang.String r0 = r4.f16817c     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L6c
            monitor-exit(r4)
            return r0
        L65:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6c
        L69:
            monitor-exit(r4)
            r0 = 0
            return r0
        L6c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.p079ut.p084b.p087b.C3765d.m15987j():java.lang.String");
    }

    /* renamed from: k */
    private String m15988k() {
        try {
            SharedPreferences m15977a = m15977a(Config.PREFERENCES);
            String string = m15977a.getString("deviceId", null);
            if (string == null || string.length() <= 0) {
                return null;
            }
            String string2 = m15977a.getString("utdid", null);
            if (string2 != null) {
                try {
                    if (string2.length() == 0) {
                    }
                } catch (Throwable unused) {
                }
                return string2;
            }
            return m15977a(Constants.SP_FILE_NAME).getString("utdid", null);
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: l */
    private String m15989l() {
        try {
            return m15977a("um_push_ut").getString("d_id", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m15992d() {
        try {
            return m15977a("um_push_ut").getBoolean("t_f", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: f */
    public void m15993f() {
        try {
            m15977a("um_push_ut").edit().remove("t_id").remove("t_f").commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String getValue() {
        String str = this.f16817c;
        if (str != null) {
            return str;
        }
        return m15987j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public String m15994m() {
        String str;
        try {
            str = m15977a("um_push_ut").getString("t_id", null);
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null || "-1".equals(str) || str.length() < 2 || str.length() > 128) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private boolean m15985c() {
        try {
            return m15977a("um_push_ut").getBoolean("v_r", true);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    private void m15980a(String str, boolean z10) {
        if (m15983b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() == 24) {
                m15982b(str, z10);
            }
        }
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: b */
    public boolean m15991b() {
        try {
            SharedPreferences m15977a = m15977a("um_push_ut");
            if (this.f16818d == -1) {
                this.f16818d = m15977a.getLong("v_ts", 0L);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - this.f16818d) >= m15984c()) {
                this.f16818d = currentTimeMillis;
                m15977a.edit().putLong("v_ts", currentTimeMillis).commit();
                C3756e.m15954a("UTUtdid", "req valid");
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: a */
    private byte[] m15981a() {
        String str;
        C3756e.m15954a("UTUtdid", "generate UTDid");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] bytes = C3758b.getBytes(currentTimeMillis);
        byte[] bytes2 = C3758b.getBytes(nextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = C3759c.m15965f();
        } catch (Exception unused) {
            str = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(C3758b.getBytes(C3760d.m15968a(str)), 0, 4);
        byteArrayOutputStream.write(C3758b.getBytes(C3760d.m15968a(m15979a(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: b */
    private void m15982b(String str, boolean z10) {
        try {
            m15977a("um_push_ut").edit().putString("d_id", str).putBoolean("t_f", z10).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static String m15979a(byte[] bArr) {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(C3755d.m15949b(new byte[]{69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, -68, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93}), mac.getAlgorithm()));
        return C3757a.m15960a(mac.doFinal(bArr), 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    public void m15990a(String str, long j10) {
        boolean z10;
        try {
            SharedPreferences.Editor edit = m15977a("um_push_ut").edit();
            boolean z11 = true;
            if (j10 > 0) {
                edit.putLong("v_i", j10);
                edit.putLong("v_ts", System.currentTimeMillis());
                z10 = true;
            } else {
                z10 = false;
            }
            if (str == null || "-1".equals(str) || str.length() < 2 || str.length() > 128) {
                z11 = z10;
            } else {
                edit.putString("t_id", str);
                edit.putBoolean("v_r", false);
            }
            if (z11) {
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private SharedPreferences m15977a(String str) {
        return this.f16816a.getSharedPreferences(str, 0);
    }
}
