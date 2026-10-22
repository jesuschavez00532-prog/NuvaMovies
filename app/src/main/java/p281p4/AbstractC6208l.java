package p281p4;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p219l4.AbstractC5391n;

/* renamed from: p4.l */
/* loaded from: classes.dex */
public abstract class AbstractC6208l {

    /* renamed from: a */
    private static String f24377a;

    /* renamed from: b */
    private static int f24378b;

    /* renamed from: a */
    public static String m24776a() {
        BufferedReader bufferedReader;
        if (f24377a == null) {
            int i10 = f24378b;
            if (i10 == 0) {
                i10 = Process.myPid();
                f24378b = i10;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i10 > 0) {
                try {
                    String str2 = "/proc/" + i10 + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str2));
                        try {
                            String readLine = bufferedReader.readLine();
                            AbstractC5391n.m21783i(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            AbstractC6206j.m24763a(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                AbstractC6206j.m24763a(bufferedReader);
            }
            f24377a = str;
        }
        return f24377a;
    }
}
