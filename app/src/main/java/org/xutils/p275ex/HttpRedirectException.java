package org.xutils.p275ex;

/* loaded from: classes3.dex */
public class HttpRedirectException extends HttpException {
    private static final long serialVersionUID = 1;

    public HttpRedirectException(int i10, String str, String str2) {
        super(i10, str);
        setResult(str2);
    }
}
