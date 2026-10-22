package com.umeng.message.proguard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.TextUtils;
import com.lzy.okgo.model.HttpHeaders;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.proguard.C3644df;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.cc */
/* loaded from: classes3.dex */
public final class C3613cc {

    /* renamed from: com.umeng.message.proguard.cc$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo15506a(Bitmap bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:13:0x006d, B:15:0x0078, B:16:0x0081, B:18:0x0086, B:19:0x008a, B:21:0x0091, B:45:0x007d), top: B:12:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:13:0x006d, B:15:0x0078, B:16:0x0081, B:18:0x0086, B:19:0x008a, B:21:0x0091, B:45:0x007d), top: B:12:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d A[Catch: all -> 0x0122, TryCatch #1 {all -> 0x0122, blocks: (B:13:0x006d, B:15:0x0078, B:16:0x0081, B:18:0x0086, B:19:0x008a, B:21:0x0091, B:45:0x007d), top: B:12:0x006d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject m15503a(org.json.JSONObject r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3613cc.m15503a(org.json.JSONObject, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    public static boolean m15504a(int i10, C3621ck c3621ck, String str) {
        int i11;
        AbstractC3627cq m15569a;
        HttpURLConnection httpURLConnection;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = "unknown";
        try {
            URL url = new URL(C3663dy.m15706a(str, c3621ck));
            str2 = url.getHost();
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            i11 = httpURLConnection.getResponseCode();
        } catch (Throwable th) {
            th = th;
            i11 = -1;
        }
        try {
            if (i11 < 400) {
                C3668eb.m15722a(httpURLConnection.getInputStream());
            } else {
                C3668eb.m15722a(httpURLConnection.getErrorStream());
            }
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
            }
            C3615ce.m15509a("Net", Integer.valueOf(i10), " host:".concat(String.valueOf(str2)), " code:", Integer.valueOf(i11), " consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (Throwable th2) {
            th = th2;
            try {
                C3615ce.m15509a("Net", Integer.valueOf(i10), " host:".concat(String.valueOf(str2)), " error:", th.getMessage(), " consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                if (i11 != 200) {
                    m15569a = C3628cr.m15569a();
                    m15569a.mo15559a(c3621ck, i10, i11, str2);
                }
                return false;
            } catch (Throwable th3) {
                if (i11 != 200) {
                    C3628cr.m15569a().mo15559a(c3621ck, i10, i11, str2);
                }
                throw th3;
            }
        }
        if (i11 == 200) {
            if (i11 != 200) {
                C3628cr.m15569a().mo15559a(c3621ck, i10, i11, str2);
            }
            return true;
        }
        if (i11 != 200) {
            m15569a = C3628cr.m15569a();
            m15569a.mo15559a(c3621ck, i10, i11, str2);
        }
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x013c: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:66:0x013c */
    /* renamed from: a */
    public static boolean m15505a(String str) {
        boolean z10;
        int responseCode;
        boolean z11;
        boolean z12;
        C3644df unused;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = "unknown";
        try {
            URL url = new URL(str);
            str2 = url.getHost();
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; utf-8");
            httpURLConnection.setRequestProperty(HttpHeaders.HEAD_KEY_ACCEPT, "application/json");
            httpURLConnection.setDoOutput(true);
            JSONObject jSONObject = new JSONObject();
            Context m15638a = C3643de.m15638a();
            try {
                jSONObject.put("oaid", C3611ca.m15493c(m15638a));
                jSONObject.put("idfa", C3611ca.m15488a(m15638a));
            } catch (Throwable unused2) {
            }
            jSONObject.put("imei_md5", C3611ca.m15496f(m15638a));
            jSONObject.put("android_id", C3611ca.m15491b(m15638a));
            jSONObject.put("device_token", UMUtils.getDeviceToken(m15638a));
            jSONObject.put(C3325bt.f14220al, UMUtils.getZid(m15638a));
            String jSONObject2 = jSONObject.toString();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(jSONObject2.getBytes("utf-8"));
                C3668eb.m15722a(outputStream);
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[512];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            C3668eb.m15722a(byteArrayOutputStream);
                            String str3 = new String(byteArray);
                            C3615ce.m15510b("Net", "pre check host:", str2, " resp:\n", str3);
                            JSONObject optJSONObject = new JSONObject(str3).optJSONObject("data");
                            if (optJSONObject != null) {
                                z12 = optJSONObject.optBoolean("allow", true);
                                try {
                                    JSONArray optJSONArray = optJSONObject.optJSONArray("activity_deny");
                                    if (optJSONArray != null) {
                                        int length = optJSONArray.length();
                                        ArrayList arrayList = new ArrayList(length);
                                        for (int i10 = 0; i10 < length; i10++) {
                                            String optString = optJSONArray.optString(i10);
                                            if (!TextUtils.isEmpty(optString)) {
                                                try {
                                                    arrayList.add(Class.forName(optString));
                                                } catch (Throwable unused3) {
                                                    C3615ce.m15510b("Net", "pre check activity not found: ", optString);
                                                }
                                            }
                                        }
                                        unused = C3644df.a.f16309a;
                                        C3658dt.m15682a().m15685a(arrayList);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    C3668eb.m15722a(inputStream);
                                    throw th;
                                }
                            } else {
                                z12 = true;
                            }
                            C3668eb.m15722a(inputStream);
                            z10 = z12;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = z11;
                        C3615ce.m15510b("Net", "pre check host:".concat(String.valueOf(str2)), " error:", th.getMessage(), " consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        return z10;
                    }
                } else {
                    z10 = true;
                }
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable unused4) {
                }
            } catch (Throwable th4) {
                C3668eb.m15722a(outputStream);
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            z10 = true;
        }
        try {
            C3615ce.m15510b("Net", "pre check host:".concat(String.valueOf(str2)), " code:", Integer.valueOf(responseCode), " consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (Throwable th6) {
            th = th6;
            C3615ce.m15510b("Net", "pre check host:".concat(String.valueOf(str2)), " error:", th.getMessage(), " consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            return z10;
        }
        return z10;
    }

    /* renamed from: a */
    public static Bitmap m15502a(Context context, String str) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmap = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                inputStream = httpURLConnection.getInputStream();
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            inputStream = null;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            if (decodeStream != null) {
                Point m15729a = C3670ed.m15729a(context);
                int min = Math.min(m15729a.x, m15729a.y);
                if (decodeStream.getWidth() <= min || decodeStream.getHeight() <= 0) {
                    bitmap = decodeStream;
                } else {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, min, (decodeStream.getHeight() * min) / decodeStream.getWidth(), true);
                    decodeStream.recycle();
                    bitmap = createScaledBitmap;
                }
            }
            C3668eb.m15722a(inputStream);
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
            }
            C3615ce.m15510b("Net", "image download consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            return bitmap;
        } catch (Throwable th3) {
            th = th3;
            try {
                C3615ce.m15512d("Net", "image download error:", th.getMessage());
                C3668eb.m15722a(inputStream);
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused2) {
                    }
                }
                C3615ce.m15510b("Net", "image download consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                return null;
            } catch (Throwable th4) {
                C3668eb.m15722a(inputStream);
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused3) {
                    }
                }
                C3615ce.m15510b("Net", "image download consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                throw th4;
            }
        }
    }
}
