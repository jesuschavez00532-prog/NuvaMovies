package p317rb;

import com.request.converterFactory.bean.ResultException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import ne.AbstractC5868k;
import retrofit2.HttpException;

/* renamed from: rb.d */
/* loaded from: classes2.dex */
public abstract class AbstractC6570d {
    /* renamed from: a */
    public static final String m25644a(Throwable th, String str, String str2, String str3) {
        AbstractC5868k.m23674f(th, "<this>");
        AbstractC5868k.m23674f(str, "httpErrCode");
        AbstractC5868k.m23674f(str2, "ukHostErrCode");
        AbstractC5868k.m23674f(str3, "ukErrCode");
        if (m25646c(th)) {
            String returnCode = ((ResultException) th).getReturnCode();
            AbstractC5868k.m23673e(returnCode, "this as ResultException).returnCode");
            return returnCode;
        }
        if (m25645b(th)) {
            return str3;
        }
        if (m25647d(th)) {
            return str;
        }
        if (m25648e(th)) {
            return "EA9";
        }
        return str3;
    }

    /* renamed from: b */
    public static final boolean m25645b(Throwable th) {
        AbstractC5868k.m23674f(th, "<this>");
        return th instanceof HttpException;
    }

    /* renamed from: c */
    public static final boolean m25646c(Throwable th) {
        AbstractC5868k.m23674f(th, "<this>");
        return th instanceof ResultException;
    }

    /* renamed from: d */
    public static final boolean m25647d(Throwable th) {
        AbstractC5868k.m23674f(th, "<this>");
        if (!(th instanceof TimeoutException) && !(th instanceof ConnectException) && !(th instanceof SocketTimeoutException)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m25648e(Throwable th) {
        AbstractC5868k.m23674f(th, "<this>");
        return th instanceof UnknownHostException;
    }
}
