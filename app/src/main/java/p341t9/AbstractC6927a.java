package p341t9;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import p009a8.C0111a;
import p315r9.InterfaceC6564b;
import retrofit2.HttpException;

/* renamed from: t9.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6927a {

    /* renamed from: a */
    private static InterfaceC6564b f26264a;

    /* renamed from: a */
    private static int m26911a(Throwable th) {
        if (th instanceof HttpException) {
            return ((HttpException) th).m25696a();
        }
        if (th instanceof TimeoutException) {
            return 50010;
        }
        if (th instanceof ConnectException) {
            return 50011;
        }
        if (th instanceof SocketTimeoutException) {
            return 50012;
        }
        if (th instanceof SSLException) {
            return 50013;
        }
        if (th instanceof UnknownHostException) {
            return 50014;
        }
        return 50015;
    }

    /* renamed from: b */
    public static void m26912b(String str, Throwable th) {
        if (f26264a == null) {
            return;
        }
        int i10 = 50015;
        if (th instanceof C0111a) {
            C0111a c0111a = (C0111a) th;
            if (c0111a.m485a() != 3 && c0111a.m485a() != 8) {
                Throwable cause = c0111a.getCause();
                if (cause != null) {
                    i10 = m26911a(cause);
                }
            } else {
                i10 = c0111a.m486b();
            }
        }
        f26264a.mo25628d(str, String.valueOf(i10));
    }

    /* renamed from: c */
    public static void m26913c(String str, long j10, int i10, String str2, long j11, String str3) {
        InterfaceC6564b interfaceC6564b = f26264a;
        if (interfaceC6564b == null) {
            return;
        }
        interfaceC6564b.mo25627c(str, j10, i10, str2, j11, str3);
    }

    /* renamed from: d */
    public static void m26914d(String str, long j10, String str2) {
        InterfaceC6564b interfaceC6564b = f26264a;
        if (interfaceC6564b == null) {
            return;
        }
        interfaceC6564b.mo25626b(str, j10, str2);
    }

    /* renamed from: e */
    public static void m26915e(String str, String str2) {
        InterfaceC6564b interfaceC6564b = f26264a;
        if (interfaceC6564b == null) {
            return;
        }
        interfaceC6564b.mo25625a(str, str2);
    }

    /* renamed from: f */
    public static void m26916f(String str, Throwable th) {
        InterfaceC6564b interfaceC6564b = f26264a;
        if (interfaceC6564b == null) {
            return;
        }
        interfaceC6564b.mo25629e(str, String.valueOf(m26911a(th)));
    }

    /* renamed from: g */
    public static void m26917g(InterfaceC6564b interfaceC6564b) {
        f26264a = interfaceC6564b;
    }
}
