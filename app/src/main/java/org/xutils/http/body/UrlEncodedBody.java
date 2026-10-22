package org.xutils.http.body;

import android.text.TextUtils;
import anet.channel.request.Request;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;

/* loaded from: classes3.dex */
public class UrlEncodedBody implements RequestBody {
    private String charset;
    private byte[] content;

    public UrlEncodedBody(List<KeyValue> list, String str) {
        this.charset = Request.DEFAULT_CHARSET;
        if (!TextUtils.isEmpty(str)) {
            this.charset = str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (list != null) {
            for (KeyValue keyValue : list) {
                String str2 = keyValue.key;
                String valueStrOrNull = keyValue.getValueStrOrNull();
                if (!TextUtils.isEmpty(str2) && valueStrOrNull != null) {
                    if (sb2.length() > 0) {
                        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
                    }
                    sb2.append(URLEncoder.encode(str2, this.charset).replaceAll("\\+", "%20"));
                    sb2.append(Operator.Operation.EQUALS);
                    sb2.append(URLEncoder.encode(valueStrOrNull, this.charset).replaceAll("\\+", "%20"));
                }
            }
        }
        this.content = sb2.toString().getBytes(this.charset);
    }

    @Override // org.xutils.http.body.RequestBody
    public long getContentLength() {
        return this.content.length;
    }

    @Override // org.xutils.http.body.RequestBody
    public String getContentType() {
        return "application/x-www-form-urlencoded;charset=" + this.charset;
    }

    @Override // org.xutils.http.body.RequestBody
    public void setContentType(String str) {
        if (!TextUtils.isEmpty(str)) {
            LogUtil.m24381w("ignored Content-Type: " + str);
        }
    }

    @Override // org.xutils.http.body.RequestBody
    public void writeTo(OutputStream outputStream) {
        outputStream.write(this.content);
        outputStream.flush();
    }
}
