package com.lzy.okgo.request.base;

import com.lzy.okgo.callback.Callback;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.utils.HttpUtils;
import com.lzy.okgo.utils.OkLogger;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

/* loaded from: classes2.dex */
public class ProgressRequestBody<T> extends RequestBody {
    private Callback<T> callback;
    private UploadInterceptor interceptor;
    private RequestBody requestBody;

    /* loaded from: classes2.dex */
    private final class CountingSink extends ForwardingSink {
        private Progress progress;

        CountingSink(Sink sink) {
            super(sink);
            Progress progress = new Progress();
            this.progress = progress;
            progress.totalSize = ProgressRequestBody.this.contentLength();
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j10) {
            super.write(buffer, j10);
            Progress.changeProgress(this.progress, j10, new Progress.Action() { // from class: com.lzy.okgo.request.base.ProgressRequestBody.CountingSink.1
                @Override // com.lzy.okgo.model.Progress.Action
                public void call(Progress progress) {
                    if (ProgressRequestBody.this.interceptor == null) {
                        ProgressRequestBody.this.onProgress(progress);
                    } else {
                        ProgressRequestBody.this.interceptor.uploadProgress(progress);
                    }
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public interface UploadInterceptor {
        void uploadProgress(Progress progress);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProgressRequestBody(RequestBody requestBody, Callback<T> callback) {
        this.requestBody = requestBody;
        this.callback = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgress(final Progress progress) {
        HttpUtils.runOnUiThread(new Runnable() { // from class: com.lzy.okgo.request.base.ProgressRequestBody.1
            @Override // java.lang.Runnable
            public void run() {
                if (ProgressRequestBody.this.callback != null) {
                    ProgressRequestBody.this.callback.uploadProgress(progress);
                }
            }
        });
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        try {
            return this.requestBody.contentLength();
        } catch (IOException e10) {
            OkLogger.printStackTrace(e10);
            return -1L;
        }
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.requestBody.contentType();
    }

    public void setInterceptor(UploadInterceptor uploadInterceptor) {
        this.interceptor = uploadInterceptor;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) {
        BufferedSink buffer = Okio.buffer(new CountingSink(bufferedSink));
        this.requestBody.writeTo(buffer);
        buffer.flush();
    }
}
