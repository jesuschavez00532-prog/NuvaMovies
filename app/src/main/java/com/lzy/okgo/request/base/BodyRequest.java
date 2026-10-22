package com.lzy.okgo.request.base;

import android.text.TextUtils;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.request.base.BodyRequest;
import com.lzy.okgo.utils.HttpUtils;
import com.lzy.okgo.utils.OkLogger;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class BodyRequest<T, R extends BodyRequest> extends Request<T, R> implements HasBody<R> {
    private static final long serialVersionUID = -6459175248476927501L;

    /* renamed from: bs */
    protected byte[] f11264bs;
    protected String content;
    protected transient File file;
    protected boolean isMultipart;
    protected boolean isSpliceUrl;
    protected transient MediaType mediaType;
    protected RequestBody requestBody;

    public BodyRequest(String str) {
        super(str);
        this.isMultipart = false;
        this.isSpliceUrl = false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (!TextUtils.isEmpty(str)) {
            this.mediaType = MediaType.parse(str);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        String mediaType;
        objectOutputStream.defaultWriteObject();
        MediaType mediaType2 = this.mediaType;
        if (mediaType2 == null) {
            mediaType = "";
        } else {
            mediaType = mediaType2.toString();
        }
        objectOutputStream.writeObject(mediaType);
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public /* bridge */ /* synthetic */ Object addFileParams(String str, List list) {
        return addFileParams(str, (List<File>) list);
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public /* bridge */ /* synthetic */ Object addFileWrapperParams(String str, List list) {
        return addFileWrapperParams(str, (List<HttpParams.FileWrapper>) list);
    }

    @Override // com.lzy.okgo.request.base.Request
    public RequestBody generateRequestBody() {
        MediaType mediaType;
        MediaType mediaType2;
        MediaType mediaType3;
        if (this.isSpliceUrl) {
            this.url = HttpUtils.createUrlFromParams(this.baseUrl, this.params.urlParamsMap);
        }
        RequestBody requestBody = this.requestBody;
        if (requestBody != null) {
            return requestBody;
        }
        String str = this.content;
        if (str != null && (mediaType3 = this.mediaType) != null) {
            return RequestBody.create(mediaType3, str);
        }
        byte[] bArr = this.f11264bs;
        if (bArr != null && (mediaType2 = this.mediaType) != null) {
            return RequestBody.create(mediaType2, bArr);
        }
        File file = this.file;
        if (file != null && (mediaType = this.mediaType) != null) {
            return RequestBody.create(mediaType, file);
        }
        return HttpUtils.generateMultipartRequestBody(this.params, this.isMultipart);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Request.Builder generateRequestBuilder(RequestBody requestBody) {
        try {
            headers("Content-Length", String.valueOf(requestBody.contentLength()));
        } catch (IOException e10) {
            OkLogger.printStackTrace(e10);
        }
        return HttpUtils.appendHeaders(new Request.Builder(), this.headers);
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R addFileParams(String str, List<File> list) {
        this.params.putFileParams(str, list);
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R addFileWrapperParams(String str, List<HttpParams.FileWrapper> list) {
        this.params.putFileWrapperParams(str, list);
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R isMultipart(boolean z10) {
        this.isMultipart = z10;
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R isSpliceUrl(boolean z10) {
        this.isSpliceUrl = z10;
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R upRequestBody(RequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R upBytes(byte[] bArr) {
        this.f11264bs = bArr;
        this.mediaType = HttpParams.MEDIA_TYPE_STREAM;
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R upFile(File file) {
        this.file = file;
        this.mediaType = HttpUtils.guessMimeType(file.getName());
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R upString(String str) {
        this.content = str;
        this.mediaType = HttpParams.MEDIA_TYPE_PLAIN;
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R params(String str, File file) {
        this.params.put(str, file);
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R upJson(String str) {
        this.content = str;
        this.mediaType = HttpParams.MEDIA_TYPE_JSON;
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R params(String str, File file, String str2) {
        this.params.put(str, file, str2);
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R upBytes(byte[] bArr, MediaType mediaType) {
        this.f11264bs = bArr;
        this.mediaType = mediaType;
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R upFile(File file, MediaType mediaType) {
        this.file = file;
        this.mediaType = mediaType;
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R upString(String str, MediaType mediaType) {
        this.content = str;
        this.mediaType = mediaType;
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R params(String str, File file, String str2, MediaType mediaType) {
        this.params.put(str, file, str2, mediaType);
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R upJson(JSONObject jSONObject) {
        this.content = jSONObject.toString();
        this.mediaType = HttpParams.MEDIA_TYPE_JSON;
        return this;
    }

    @Override // com.lzy.okgo.request.base.HasBody
    public R upJson(JSONArray jSONArray) {
        this.content = jSONArray.toString();
        this.mediaType = HttpParams.MEDIA_TYPE_JSON;
        return this;
    }
}
