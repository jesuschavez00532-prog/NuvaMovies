package org.xutils.http.app;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.raizlabs.android.dbflow.sql.language.Operator;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.http.request.HttpRequest;
import org.xutils.http.request.UriRequest;

/* loaded from: classes3.dex */
public class DefaultRedirectHandler implements RedirectHandler {
    @Override // org.xutils.http.app.RedirectHandler
    public RequestParams getRedirectParams(UriRequest uriRequest) {
        if (uriRequest instanceof HttpRequest) {
            HttpRequest httpRequest = (HttpRequest) uriRequest;
            RequestParams params = httpRequest.getParams();
            String responseHeader = httpRequest.getResponseHeader("Location");
            if (!TextUtils.isEmpty(responseHeader)) {
                if (!URLUtil.isHttpsUrl(responseHeader) && !URLUtil.isHttpUrl(responseHeader)) {
                    String uri = params.getUri();
                    if (responseHeader.startsWith(Operator.Operation.DIVISION)) {
                        int indexOf = uri.indexOf(Operator.Operation.DIVISION, 8);
                        if (indexOf != -1) {
                            uri = uri.substring(0, indexOf);
                        }
                    } else {
                        int lastIndexOf = uri.lastIndexOf(Operator.Operation.DIVISION);
                        if (lastIndexOf >= 8) {
                            uri = uri.substring(0, lastIndexOf + 1);
                        } else {
                            uri = uri + Operator.Operation.DIVISION;
                        }
                    }
                    responseHeader = uri + responseHeader;
                }
                params.setUri(responseHeader);
                int responseCode = uriRequest.getResponseCode();
                if (responseCode == 301 || responseCode == 302 || responseCode == 303) {
                    params.clearParams();
                    params.setMethod(HttpMethod.GET);
                }
                return params;
            }
            return null;
        }
        return null;
    }
}
