package com.umeng.message.proguard;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.common.UPLog;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.p */
/* loaded from: classes3.dex */
public final class C3697p {

    /* renamed from: a */
    Boolean f16553a;

    /* renamed from: b */
    public boolean f16554b;

    /* renamed from: c */
    private Handler f16555c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.p$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        final String f16556a;

        /* renamed from: b */
        final String f16557b;

        /* renamed from: c */
        final long f16558c;

        /* renamed from: d */
        final int f16559d;

        /* renamed from: e */
        final int f16560e;

        /* renamed from: f */
        final long f16561f;

        public a(long j10, int i10, long j11, int i11, String str, String str2) {
            this.f16559d = i11;
            this.f16556a = str;
            this.f16557b = str2;
            this.f16558c = j10;
            this.f16560e = i10;
            this.f16561f = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.p$c */
    /* loaded from: classes3.dex */
    public class c implements Handler.Callback {

        /* renamed from: b */
        private long f16567b = 0;

        /* renamed from: c */
        private PrintWriter f16568c;

        /* renamed from: d */
        private final DateFormat f16569d;

        /* renamed from: e */
        private final DateFormat f16570e;

        /* renamed from: f */
        private final File f16571f;

        /* renamed from: g */
        private String f16572g;

        c() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            this.f16569d = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
            this.f16570e = simpleDateFormat2;
            simpleDateFormat2.setTimeZone(TimeZone.getDefault());
            Application m15840a = C3706y.m15840a();
            this.f16571f = new File(m15840a.getFilesDir(), ".upush_log");
            String m15743a = C3678f.m15743a(m15840a);
            this.f16572g = m15743a;
            int lastIndexOf = m15743a.lastIndexOf(":");
            if (lastIndexOf >= 0) {
                this.f16572g = this.f16572g.substring(lastIndexOf + 1) + "_";
                return;
            }
            this.f16572g = "";
        }

        /* renamed from: a */
        private void m15800a() {
            PrintWriter printWriter = this.f16568c;
            if (printWriter != null) {
                try {
                    printWriter.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.f16568c = null;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10;
            String str;
            try {
                i10 = message.what;
            } catch (Throwable th) {
                UPLog.m15195d("Log", UPLog.getStackTrace(th));
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                m15800a();
                long currentTimeMillis = (System.currentTimeMillis() / 86400000) * 86400000;
                if (Math.abs(currentTimeMillis - this.f16567b) > 86400000) {
                    this.f16567b = currentTimeMillis;
                    File[] listFiles = this.f16571f.listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            long lastModified = file.lastModified() / 86400000;
                            Long.signum(lastModified);
                            if (Math.abs(currentTimeMillis - (lastModified * 86400000)) > 86400000) {
                                file.delete();
                            }
                        }
                    }
                }
                return true;
            }
            try {
                if (!this.f16571f.exists()) {
                    this.f16571f.mkdirs();
                }
                a aVar = (a) message.obj;
                String format = String.format("%s%s", this.f16572g, this.f16569d.format(Long.valueOf(aVar.f16558c)));
                int i11 = aVar.f16559d;
                if (i11 == 3) {
                    str = "D";
                } else if (i11 == 4) {
                    str = "I";
                } else if (i11 == 5) {
                    str = "W";
                } else if (i11 == 6) {
                    str = "E";
                } else {
                    str = "U";
                }
                String format2 = String.format("%s %s-%s %s %s %s", this.f16570e.format(Long.valueOf(aVar.f16558c)), Integer.valueOf(aVar.f16560e), Long.valueOf(aVar.f16561f), str, aVar.f16556a, aVar.f16557b);
                File file2 = new File(this.f16571f, format + ".log");
                if (file2.exists() && file2.length() + format2.length() > 5242880) {
                    File file3 = new File(this.f16571f, format + ".bak");
                    if (file3.exists()) {
                        file3.delete();
                    }
                    file2.renameTo(file3);
                    file2.delete();
                }
                if (!file2.exists()) {
                    m15800a();
                }
                if (this.f16568c == null) {
                    this.f16568c = new PrintWriter(new FileWriter(file2, true));
                }
                this.f16568c.println(format2);
                this.f16568c.flush();
                C3697p.this.m15796b().removeMessages(2);
                C3697p.this.m15796b().sendEmptyMessageDelayed(2, 5000L);
            } catch (Throwable th2) {
                UPLog.m15195d("Log", UPLog.getStackTrace(th2));
                m15800a();
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m15795a() {
        if (!C3678f.f16510b) {
            return false;
        }
        if (this.f16553a == null) {
            this.f16553a = Boolean.valueOf(MessageSharedPrefs.getInstance(C3706y.m15840a()).m15180m());
        }
        return this.f16553a.booleanValue();
    }

    /* renamed from: b */
    final Handler m15796b() {
        Handler handler;
        Handler handler2 = this.f16555c;
        if (handler2 != null) {
            return handler2;
        }
        synchronized (this) {
            if (this.f16555c == null) {
                try {
                    HandlerThread handlerThread = new HandlerThread("upush_log", 10);
                    handlerThread.start();
                    this.f16555c = new Handler(handlerThread.getLooper(), new c());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            handler = this.f16555c;
        }
        return handler;
    }

    /* renamed from: a */
    public final void m15794a(int i10, String str, String str2) {
        Handler m15796b;
        if (i10 < 4 || str2 == null || (m15796b = m15796b()) == null) {
            return;
        }
        m15796b.obtainMessage(1, new a(System.currentTimeMillis(), Process.myPid(), Thread.currentThread().getId(), i10, str, str2)).sendToTarget();
    }

    /* renamed from: com.umeng.message.proguard.p$b */
    /* loaded from: classes3.dex */
    public static class b {
        /* renamed from: a */
        static JSONObject m15797a(String str, String str2, String str3) {
            String str4;
            try {
                Application m15840a = C3706y.m15840a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put("appkey", str);
                jSONObject.put("device_token", str2);
                jSONObject.put("android_id", str3);
                jSONObject.put("utdid", C3637d.m15623o(m15840a));
                jSONObject.put(C3325bt.f14265g, C3637d.m15618k(m15840a));
                try {
                    str4 = UMUtils.getZid(m15840a);
                    try {
                        jSONObject.put("oaid", DeviceConfig.getOaid(m15840a));
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    str4 = null;
                }
                jSONObject.put(C3325bt.f14220al, str4);
                jSONObject.put("sdk_v", MsgConstant.SDK_VERSION);
                return C3680g.m15764a(jSONObject, "https://offmsg.umeng.com/log/switch", str, true);
            } catch (Throwable th) {
                UPLog.m15198i("Log", UPLog.getStackTrace(th));
                return null;
            }
        }

        /* renamed from: a */
        final void m15799a(File file, File file2) {
            File[] listFiles;
            if (!file.exists() || (listFiles = file.listFiles(new FileFilter() { // from class: com.umeng.message.proguard.p.b.2
                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    if (file3.isDirectory() || file3.length() > 5242880) {
                        return false;
                    }
                    String name = file3.getName();
                    if (!name.endsWith(".log") && !name.endsWith(".bak")) {
                        return false;
                    }
                    return true;
                }
            })) == null || listFiles.length == 0) {
                return;
            }
            if (listFiles.length > 8) {
                File[] fileArr = new File[8];
                System.arraycopy(listFiles, 0, fileArr, 0, 8);
                listFiles = fileArr;
            }
            ZipOutputStream zipOutputStream = null;
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file2));
                try {
                    for (File file3 : listFiles) {
                        m15798a(file3, zipOutputStream2);
                        file3.delete();
                    }
                    zipOutputStream2.finish();
                    C3678f.m15748a(zipOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    zipOutputStream = zipOutputStream2;
                    try {
                        UPLog.m15198i("Log", UPLog.getStackTrace(th));
                    } finally {
                        C3678f.m15748a(zipOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* renamed from: a */
        private static void m15798a(File file, ZipOutputStream zipOutputStream) {
            if (!file.exists() || file.length() < 256) {
                return;
            }
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read != -1) {
                            zipOutputStream.write(bArr, 0, read);
                        } else {
                            zipOutputStream.closeEntry();
                            C3678f.m15748a(fileInputStream2);
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    try {
                        UPLog.m15198i("Log", UPLog.getStackTrace(th));
                    } finally {
                        C3678f.m15748a(fileInputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
