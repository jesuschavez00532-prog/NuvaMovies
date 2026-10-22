package org.xutils.http;

import android.text.TextUtils;
import anet.channel.request.Request;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;
import org.xutils.http.body.FileBody;
import org.xutils.http.body.InputStreamBody;
import org.xutils.http.body.MultipartBody;
import org.xutils.http.body.RequestBody;
import org.xutils.http.body.StringBody;
import org.xutils.http.body.UrlEncodedBody;

/* loaded from: classes3.dex */
public abstract class BaseParams {
    private String bodyContent;
    private String bodyContentType;
    private HttpMethod method;
    private RequestBody requestBody;
    private String charset = Request.DEFAULT_CHARSET;
    private boolean multipart = false;
    private boolean asJsonContent = false;
    private boolean asJsonArrayContent = false;
    private final List<Header> headers = new ArrayList();
    private final List<KeyValue> queryStringParams = new ArrayList();
    private final List<KeyValue> bodyParams = new ArrayList();

    /* loaded from: classes3.dex */
    public static final class ArrayItem extends KeyValue {
        public ArrayItem(String str, Object obj) {
            super(str, obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class BodyItemWrapper extends KeyValue {
        public final String contentType;
        public final String fileName;

        public BodyItemWrapper(String str, Object obj, String str2, String str3) {
            super(str, obj);
            if (TextUtils.isEmpty(str2)) {
                this.contentType = "application/octet-stream";
            } else {
                this.contentType = str2;
            }
            this.fileName = str3;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Header extends KeyValue {
        public final boolean setHeader;

        public Header(String str, String str2, boolean z10) {
            super(str, str2);
            this.setHeader = z10;
        }
    }

    private synchronized void checkBodyParams() {
        if (this.bodyParams.isEmpty()) {
            return;
        }
        if (this.requestBody == null && HttpMethod.permitsRequestBody(this.method)) {
            try {
                if (!this.asJsonContent && !this.asJsonArrayContent) {
                    if (!TextUtils.isEmpty(this.bodyContent)) {
                        this.queryStringParams.addAll(this.bodyParams);
                        this.bodyParams.clear();
                    }
                    return;
                }
                this.bodyContent = toJSONString(false);
                this.bodyParams.clear();
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            }
        }
        this.queryStringParams.addAll(this.bodyParams);
        this.bodyParams.clear();
    }

    private void params2Json(JSONObject jSONObject, List<KeyValue> list) {
        JSONArray jSONArray;
        HashSet hashSet = new HashSet(list.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            KeyValue keyValue = list.get(i10);
            String str = keyValue.key;
            if (!TextUtils.isEmpty(str)) {
                if (linkedHashMap.containsKey(str)) {
                    jSONArray = (JSONArray) linkedHashMap.get(str);
                } else {
                    jSONArray = new JSONArray();
                    linkedHashMap.put(str, jSONArray);
                }
                jSONArray.put(AbstractC6100a.m24397a(keyValue.value));
                if (keyValue instanceof ArrayItem) {
                    hashSet.add(str);
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            JSONArray jSONArray2 = (JSONArray) entry.getValue();
            if (jSONArray2.length() <= 1 && !hashSet.contains(str2)) {
                jSONObject.put(str2, jSONArray2.get(0));
            } else {
                jSONObject.put(str2, jSONArray2);
            }
        }
    }

    public void addBodyParameter(String str, Object obj) {
        addBodyParameter(str, obj, null, null);
    }

    public void addHeader(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.headers.add(new Header(str, str2, false));
    }

    public void addParameter(String str, Object obj) {
        if (HttpMethod.permitsRequestBody(this.method)) {
            addBodyParameter(str, obj, null, null);
        } else {
            addQueryStringParameter(str, obj);
        }
    }

    public void addQueryStringParameter(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.queryStringParams.add(new ArrayItem(str, it.next()));
            }
            return;
        }
        int i10 = 0;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            while (i10 < length) {
                this.queryStringParams.add(new ArrayItem(str, jSONArray.opt(i10)));
                i10++;
            }
            return;
        }
        if (obj != null && obj.getClass().isArray()) {
            int length2 = Array.getLength(obj);
            while (i10 < length2) {
                this.queryStringParams.add(new ArrayItem(str, Array.get(obj, i10)));
                i10++;
            }
            return;
        }
        this.queryStringParams.add(new KeyValue(str, obj));
    }

    public void clearParams() {
        this.queryStringParams.clear();
        this.bodyParams.clear();
        this.bodyContent = null;
        this.bodyContentType = null;
        this.requestBody = null;
    }

    public String getBodyContent() {
        checkBodyParams();
        return this.bodyContent;
    }

    public List<KeyValue> getBodyParams() {
        checkBodyParams();
        return new ArrayList(this.bodyParams);
    }

    public String getCharset() {
        return this.charset;
    }

    public List<Header> getHeaders() {
        return new ArrayList(this.headers);
    }

    public HttpMethod getMethod() {
        return this.method;
    }

    public List<KeyValue> getParams(String str) {
        ArrayList arrayList = new ArrayList();
        for (KeyValue keyValue : this.queryStringParams) {
            if (str != null && str.equals(keyValue.key)) {
                arrayList.add(keyValue);
            }
        }
        for (KeyValue keyValue2 : this.bodyParams) {
            if (str == null && keyValue2.key == null) {
                arrayList.add(keyValue2);
            } else if (str != null && str.equals(keyValue2.key)) {
                arrayList.add(keyValue2);
            }
        }
        return arrayList;
    }

    public List<KeyValue> getQueryStringParams() {
        checkBodyParams();
        return new ArrayList(this.queryStringParams);
    }

    public RequestBody getRequestBody() {
        String str;
        checkBodyParams();
        RequestBody requestBody = this.requestBody;
        if (requestBody != null) {
            return requestBody;
        }
        if (!TextUtils.isEmpty(this.bodyContent)) {
            StringBody stringBody = new StringBody(this.bodyContent, this.charset);
            stringBody.setContentType(this.bodyContentType);
            return stringBody;
        }
        if (this.multipart) {
            MultipartBody multipartBody = new MultipartBody(this.bodyParams, this.charset);
            multipartBody.setContentType(this.bodyContentType);
            return multipartBody;
        }
        if (this.bodyParams.size() == 1) {
            KeyValue keyValue = this.bodyParams.get(0);
            String str2 = keyValue.key;
            Object obj = keyValue.value;
            if (keyValue instanceof BodyItemWrapper) {
                str = ((BodyItemWrapper) keyValue).contentType;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = this.bodyContentType;
            }
            if (obj instanceof File) {
                return new FileBody((File) obj, str);
            }
            if (obj instanceof InputStream) {
                return new InputStreamBody((InputStream) obj, str);
            }
            if (obj instanceof byte[]) {
                return new InputStreamBody(new ByteArrayInputStream((byte[]) obj), str);
            }
            if (TextUtils.isEmpty(str2)) {
                StringBody stringBody2 = new StringBody(keyValue.getValueStrOrEmpty(), this.charset);
                stringBody2.setContentType(str);
                return stringBody2;
            }
            UrlEncodedBody urlEncodedBody = new UrlEncodedBody(this.bodyParams, this.charset);
            urlEncodedBody.setContentType(str);
            return urlEncodedBody;
        }
        UrlEncodedBody urlEncodedBody2 = new UrlEncodedBody(this.bodyParams, this.charset);
        urlEncodedBody2.setContentType(this.bodyContentType);
        return urlEncodedBody2;
    }

    public boolean isAsJsonArrayContent() {
        return this.asJsonArrayContent;
    }

    public boolean isAsJsonContent() {
        return this.asJsonContent;
    }

    public boolean isMultipart() {
        return this.multipart;
    }

    public void removeParameter(String str) {
        if (TextUtils.isEmpty(str)) {
            this.bodyContent = null;
            this.bodyContentType = null;
        } else {
            Iterator<KeyValue> it = this.queryStringParams.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().key)) {
                    it.remove();
                }
            }
        }
        Iterator<KeyValue> it2 = this.bodyParams.iterator();
        while (it2.hasNext()) {
            KeyValue next = it2.next();
            if (str == null && next.key == null) {
                it2.remove();
            } else if (str != null && str.equals(next.key)) {
                it2.remove();
            }
        }
    }

    public void setAsJsonArrayContent(boolean z10) {
        this.asJsonArrayContent = z10;
    }

    public void setAsJsonContent(boolean z10) {
        this.asJsonContent = z10;
    }

    public void setBodyContent(String str) {
        this.bodyContent = str;
    }

    public void setBodyContentType(String str) {
        this.bodyContentType = str;
    }

    public void setCharset(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.charset = str;
        }
    }

    public void setHeader(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Header header = new Header(str, str2, true);
        Iterator<Header> it = this.headers.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().key)) {
                it.remove();
            }
        }
        this.headers.add(header);
    }

    public void setMethod(HttpMethod httpMethod) {
        this.method = httpMethod;
    }

    public void setMultipart(boolean z10) {
        this.multipart = z10;
    }

    public void setRequestBody(RequestBody requestBody) {
        this.requestBody = requestBody;
    }

    public String toJSONString() {
        return toJSONString(true);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.queryStringParams.isEmpty()) {
            for (KeyValue keyValue : this.queryStringParams) {
                sb2.append(keyValue.key);
                sb2.append(Operator.Operation.EQUALS);
                sb2.append(keyValue.value);
                sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
            }
            sb2.deleteCharAt(sb2.length() - 1);
        }
        if (!TextUtils.isEmpty(this.bodyContent)) {
            sb2.append(Operator.Operation.LESS_THAN);
            sb2.append(this.bodyContent);
            sb2.append(Operator.Operation.GREATER_THAN);
        } else if (!this.bodyParams.isEmpty()) {
            sb2.append(Operator.Operation.LESS_THAN);
            for (KeyValue keyValue2 : this.bodyParams) {
                sb2.append(keyValue2.key);
                sb2.append(Operator.Operation.EQUALS);
                sb2.append(keyValue2.value);
                sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb2.append(Operator.Operation.GREATER_THAN);
        }
        return sb2.toString();
    }

    private String toJSONString(boolean z10) {
        JSONObject jSONObject;
        JSONArray jSONArray = null;
        if (!TextUtils.isEmpty(this.bodyContent)) {
            if (this.bodyContent.trim().startsWith("[")) {
                jSONArray = new JSONArray(this.bodyContent);
                if (jSONArray.length() > 0) {
                    Object obj = jSONArray.get(0);
                    if (obj instanceof JSONObject) {
                        jSONObject = (JSONObject) obj;
                    } else {
                        LogUtil.m24381w("only contains bodyContent");
                        return jSONArray.toString();
                    }
                } else {
                    jSONObject = new JSONObject();
                    jSONArray.put(jSONObject);
                }
            } else {
                jSONObject = new JSONObject(this.bodyContent);
            }
        } else {
            jSONObject = new JSONObject();
            if (this.asJsonArrayContent) {
                jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
            }
        }
        if (z10) {
            ArrayList arrayList = new ArrayList(this.queryStringParams.size() + this.bodyParams.size());
            arrayList.addAll(this.queryStringParams);
            arrayList.addAll(this.bodyParams);
            params2Json(jSONObject, arrayList);
        } else {
            params2Json(jSONObject, this.bodyParams);
        }
        return jSONArray != null ? jSONArray.toString() : jSONObject.toString();
    }

    public void addBodyParameter(String str, Object obj, String str2) {
        addBodyParameter(str, obj, str2, null);
    }

    public void addBodyParameter(String str, Object obj, String str2, String str3) {
        if (TextUtils.isEmpty(str) && obj == null) {
            return;
        }
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    this.bodyParams.add(new ArrayItem(str, it.next()));
                }
                return;
            }
            int i10 = 0;
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                while (i10 < length) {
                    this.bodyParams.add(new ArrayItem(str, jSONArray.opt(i10)));
                    i10++;
                }
                return;
            }
            if (obj instanceof byte[]) {
                this.bodyParams.add(new KeyValue(str, obj));
                return;
            }
            if (obj != null && obj.getClass().isArray()) {
                int length2 = Array.getLength(obj);
                while (i10 < length2) {
                    this.bodyParams.add(new ArrayItem(str, Array.get(obj, i10)));
                    i10++;
                }
                return;
            }
            this.bodyParams.add(new KeyValue(str, obj));
            return;
        }
        this.bodyParams.add(new BodyItemWrapper(str, obj, str2, str3));
    }
}
