package org.xutils.http.body;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.xutils.common.Callback;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.http.ProgressHandler;

/* loaded from: classes3.dex */
public class InputStreamBody implements ProgressBody {
    private ProgressHandler callBackHandler;
    private InputStream content;
    private String contentType;
    private long current;
    private final long total;

    public InputStreamBody(InputStream inputStream) {
        this(inputStream, null);
    }

    public static long getInputStreamLength(InputStream inputStream) {
        try {
            if ((inputStream instanceof FileInputStream) || (inputStream instanceof ByteArrayInputStream)) {
                return inputStream.available();
            }
            return -1L;
        } catch (Throwable th) {
            LogUtil.m24382w(th.getMessage(), th);
            return -1L;
        }
    }

    @Override // org.xutils.http.body.RequestBody
    public long getContentLength() {
        return this.total;
    }

    @Override // org.xutils.http.body.RequestBody
    public String getContentType() {
        if (TextUtils.isEmpty(this.contentType)) {
            return "application/octet-stream";
        }
        return this.contentType;
    }

    @Override // org.xutils.http.body.RequestBody
    public void setContentType(String str) {
        this.contentType = str;
    }

    @Override // org.xutils.http.body.ProgressBody
    public void setProgressHandler(ProgressHandler progressHandler) {
        this.callBackHandler = progressHandler;
    }

    @Override // org.xutils.http.body.RequestBody
    public void writeTo(OutputStream outputStream) {
        ProgressHandler progressHandler = this.callBackHandler;
        if (progressHandler != null && !progressHandler.updateProgress(this.total, this.current, true)) {
            throw new Callback.CancelledException("upload stopped!");
        }
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = this.content.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    long j10 = this.current + read;
                    this.current = j10;
                    ProgressHandler progressHandler2 = this.callBackHandler;
                    if (progressHandler2 != null && !progressHandler2.updateProgress(this.total, j10, false)) {
                        throw new Callback.CancelledException("upload stopped!");
                    }
                } else {
                    outputStream.flush();
                    ProgressHandler progressHandler3 = this.callBackHandler;
                    if (progressHandler3 != null) {
                        progressHandler3.updateProgress(this.total, this.current, true);
                    }
                    return;
                }
            } finally {
                IOUtil.closeQuietly(this.content);
            }
        }
    }

    public InputStreamBody(InputStream inputStream, String str) {
        this.current = 0L;
        this.content = inputStream;
        this.contentType = str;
        this.total = getInputStreamLength(inputStream);
    }
}
