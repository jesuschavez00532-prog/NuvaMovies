package org.xutils.http.body;

import android.text.TextUtils;
import anet.channel.request.Request;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class StringBody implements RequestBody {
    private String charset;
    private byte[] content;
    private String contentType;

    public StringBody(String str, String str2) {
        this.charset = Request.DEFAULT_CHARSET;
        if (!TextUtils.isEmpty(str2)) {
            this.charset = str2;
        }
        this.content = str.getBytes(this.charset);
    }

    @Override // org.xutils.http.body.RequestBody
    public long getContentLength() {
        return this.content.length;
    }

    @Override // org.xutils.http.body.RequestBody
    public String getContentType() {
        if (TextUtils.isEmpty(this.contentType)) {
            return "application/json;charset=" + this.charset;
        }
        return this.contentType;
    }

    @Override // org.xutils.http.body.RequestBody
    public void setContentType(String str) {
        this.contentType = str;
    }

    @Override // org.xutils.http.body.RequestBody
    public void writeTo(OutputStream outputStream) {
        outputStream.write(this.content);
        outputStream.flush();
    }
}
