package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.bz */
/* loaded from: classes3.dex */
public enum EnumC3331bz {
    UnKnownCode(5000),
    Timeout(5001),
    NetworkUnavailable(5002),
    SSLException(5003),
    IOException(5004),
    UnKnownHostException(5005),
    HttpError(5006),
    EmptyResponse(5007),
    ErrorResponse(5008),
    ErrorMakeRequestBody(5009);


    /* renamed from: k */
    private final int f14370k;

    EnumC3331bz(int i10) {
        this.f14370k = i10;
    }

    /* renamed from: b */
    private String m14004b() {
        return "错误码：" + this.f14370k + " 错误信息：";
    }

    /* renamed from: a */
    public String m14005a() {
        if (this == UnKnownCode) {
            return m14004b() + "--未知错误--";
        }
        if (this == Timeout) {
            return m14004b() + "--连接超时--";
        }
        if (this == NetworkUnavailable) {
            return m14004b() + "--网络不可用--";
        }
        if (this == SSLException) {
            return m14004b() + "--SSL证书认证失败--";
        }
        if (this == IOException) {
            return m14004b() + "--IO异常--";
        }
        if (this == HttpError) {
            return m14004b() + "--服务端返回HTTP错误--";
        }
        if (this == EmptyResponse) {
            return m14004b() + "--服务端返回数据为空--";
        }
        if (this == ErrorResponse) {
            return m14004b() + "--服务端返回错误数据--";
        }
        if (this == ErrorMakeRequestBody) {
            return m14004b() + "--请求报文构建错误--";
        }
        return "unknown";
    }
}
