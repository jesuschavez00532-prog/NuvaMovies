package org.xutils.p275ex;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class HttpException extends BaseException {
    private static final long serialVersionUID = 1;
    private int code;
    private String customMessage;
    private String errorCode;
    private String result;

    public HttpException(int i10, String str) {
        super(str);
        this.code = i10;
    }

    public int getCode() {
        return this.code;
    }

    public String getErrorCode() {
        String str = this.errorCode;
        if (str == null) {
            return String.valueOf(this.code);
        }
        return str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (!TextUtils.isEmpty(this.customMessage)) {
            return this.customMessage;
        }
        return super.getMessage();
    }

    public String getResult() {
        return this.result;
    }

    public void setCode(int i10) {
        this.code = i10;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setMessage(String str) {
        this.customMessage = str;
    }

    public void setResult(String str) {
        this.result = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "errorCode: " + getErrorCode() + ", msg: " + getMessage() + ", result: " + this.result;
    }
}
