package org.xutils.http.body;

import android.text.TextUtils;
import anet.channel.request.Request;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.xutils.common.Callback;
import org.xutils.common.util.KeyValue;
import org.xutils.http.BaseParams;
import org.xutils.http.ProgressHandler;

/* loaded from: classes3.dex */
public class MultipartBody implements ProgressBody {
    private static byte[] BOUNDARY_PREFIX_BYTES = "--------7da3d81520810".getBytes();
    private static byte[] END_BYTES = "\r\n".getBytes();
    private static byte[] TWO_DASHES_BYTES = "--".getBytes();
    private byte[] boundaryPostfixBytes;
    private ProgressHandler callBackHandler;
    private String charset;
    private String contentType;
    private long current = 0;
    private List<KeyValue> multipartParams;
    private long total;

    public MultipartBody(List<KeyValue> list, String str) {
        this.charset = Request.DEFAULT_CHARSET;
        this.total = 0L;
        if (!TextUtils.isEmpty(str)) {
            this.charset = str;
        }
        this.multipartParams = list;
        generateContentType();
        C6103a c6103a = new C6103a();
        try {
            writeTo(c6103a);
            this.total = c6103a.f24041a.get();
        } catch (IOException unused) {
            this.total = -1L;
        }
    }

    private static byte[] buildContentDisposition(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder("Content-Disposition: form-data");
        sb2.append("; name=\"");
        sb2.append(str.replace("\"", "\\\""));
        sb2.append("\"");
        if (!TextUtils.isEmpty(str2)) {
            sb2.append("; filename=\"");
            sb2.append(str2.replace("\"", "\\\""));
            sb2.append("\"");
        }
        return sb2.toString().getBytes(str3);
    }

    private static byte[] buildContentType(Object obj, String str, String str2) {
        String replaceFirst;
        StringBuilder sb2 = new StringBuilder("Content-Type: ");
        if (TextUtils.isEmpty(str)) {
            if (obj instanceof String) {
                replaceFirst = "text/plain; charset=" + str2;
            } else {
                replaceFirst = "application/octet-stream";
            }
        } else {
            replaceFirst = str.replaceFirst("\\/jpg$", "/jpeg");
        }
        sb2.append(replaceFirst);
        return sb2.toString().getBytes(str2);
    }

    private void generateContentType() {
        String hexString = Double.toHexString(Math.random() * 65535.0d);
        this.boundaryPostfixBytes = hexString.getBytes();
        this.contentType = "multipart/form-data; boundary=" + new String(BOUNDARY_PREFIX_BYTES) + hexString;
    }

    private void writeEntry(OutputStream outputStream, KeyValue keyValue) {
        String str;
        String str2;
        byte[] bytes;
        String str3 = keyValue.key;
        Object obj = keyValue.value;
        if (!TextUtils.isEmpty(str3) && obj != null) {
            writeLine(outputStream, TWO_DASHES_BYTES, BOUNDARY_PREFIX_BYTES, this.boundaryPostfixBytes);
            if (keyValue instanceof BaseParams.BodyItemWrapper) {
                BaseParams.BodyItemWrapper bodyItemWrapper = (BaseParams.BodyItemWrapper) keyValue;
                str = bodyItemWrapper.fileName;
                str2 = bodyItemWrapper.contentType;
            } else {
                str = "";
                str2 = null;
            }
            if (obj instanceof File) {
                File file = (File) obj;
                if (TextUtils.isEmpty(str)) {
                    str = file.getName();
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = FileBody.getFileContentType(file);
                }
                writeLine(outputStream, buildContentDisposition(str3, str, this.charset));
                writeLine(outputStream, buildContentType(obj, str2, this.charset));
                writeLine(outputStream, new byte[0]);
                writeFile(outputStream, file);
                writeLine(outputStream, new byte[0]);
                return;
            }
            writeLine(outputStream, buildContentDisposition(str3, str, this.charset));
            writeLine(outputStream, buildContentType(obj, str2, this.charset));
            writeLine(outputStream, new byte[0]);
            if (obj instanceof InputStream) {
                writeStreamAndCloseIn(outputStream, (InputStream) obj);
                writeLine(outputStream, new byte[0]);
                return;
            }
            if (obj instanceof byte[]) {
                bytes = (byte[]) obj;
            } else {
                bytes = keyValue.getValueStrOrEmpty().getBytes(this.charset);
            }
            writeLine(outputStream, bytes);
            long length = this.current + bytes.length;
            this.current = length;
            ProgressHandler progressHandler = this.callBackHandler;
            if (progressHandler != null && !progressHandler.updateProgress(this.total, length, false)) {
                throw new Callback.CancelledException("upload stopped!");
            }
        }
    }

    private void writeFile(OutputStream outputStream, File file) {
        if (outputStream instanceof C6103a) {
            ((C6103a) outputStream).m24399a(file);
        } else {
            writeStreamAndCloseIn(outputStream, new FileInputStream(file));
        }
    }

    private void writeLine(OutputStream outputStream, byte[]... bArr) {
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                outputStream.write(bArr2);
            }
        }
        outputStream.write(END_BYTES);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        throw new org.xutils.common.Callback.CancelledException("upload stopped!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeStreamAndCloseIn(java.io.OutputStream r13, java.io.InputStream r14) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof org.xutils.http.body.MultipartBody.C6103a
            if (r0 == 0) goto La
            org.xutils.http.body.MultipartBody$a r13 = (org.xutils.http.body.MultipartBody.C6103a) r13
            r13.m24400b(r14)
            goto L38
        La:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L39
        Le:
            int r1 = r14.read(r0)     // Catch: java.lang.Throwable -> L39
            if (r1 < 0) goto L35
            r2 = 0
            r13.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L39
            long r2 = r12.current     // Catch: java.lang.Throwable -> L39
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L39
            long r9 = r2 + r4
            r12.current = r9     // Catch: java.lang.Throwable -> L39
            org.xutils.http.ProgressHandler r6 = r12.callBackHandler     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto Le
            long r7 = r12.total     // Catch: java.lang.Throwable -> L39
            r11 = 0
            boolean r1 = r6.updateProgress(r7, r9, r11)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L2d
            goto Le
        L2d:
            org.xutils.common.Callback$CancelledException r13 = new org.xutils.common.Callback$CancelledException     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = "upload stopped!"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L39
            throw r13     // Catch: java.lang.Throwable -> L39
        L35:
            org.xutils.common.util.IOUtil.closeQuietly(r14)
        L38:
            return
        L39:
            r13 = move-exception
            org.xutils.common.util.IOUtil.closeQuietly(r14)
            goto L3f
        L3e:
            throw r13
        L3f:
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.body.MultipartBody.writeStreamAndCloseIn(java.io.OutputStream, java.io.InputStream):void");
    }

    @Override // org.xutils.http.body.RequestBody
    public long getContentLength() {
        return this.total;
    }

    @Override // org.xutils.http.body.RequestBody
    public String getContentType() {
        return this.contentType;
    }

    @Override // org.xutils.http.body.RequestBody
    public void setContentType(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.contentType = "multipart/" + str + this.contentType.substring(this.contentType.indexOf(";"));
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
        Iterator<KeyValue> it = this.multipartParams.iterator();
        while (it.hasNext()) {
            writeEntry(outputStream, it.next());
        }
        byte[] bArr = TWO_DASHES_BYTES;
        writeLine(outputStream, bArr, BOUNDARY_PREFIX_BYTES, this.boundaryPostfixBytes, bArr);
        outputStream.flush();
        ProgressHandler progressHandler2 = this.callBackHandler;
        if (progressHandler2 != null) {
            progressHandler2.updateProgress(this.total, this.current, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.xutils.http.body.MultipartBody$a */
    /* loaded from: classes3.dex */
    public class C6103a extends OutputStream {

        /* renamed from: a */
        final AtomicLong f24041a = new AtomicLong(0);

        public C6103a() {
        }

        /* renamed from: a */
        public void m24399a(File file) {
            if (this.f24041a.get() == -1) {
                return;
            }
            this.f24041a.addAndGet(file.length());
        }

        /* renamed from: b */
        public void m24400b(InputStream inputStream) {
            if (this.f24041a.get() == -1) {
                return;
            }
            long inputStreamLength = InputStreamBody.getInputStreamLength(inputStream);
            if (inputStreamLength > 0) {
                this.f24041a.addAndGet(inputStreamLength);
            } else {
                this.f24041a.set(-1L);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            if (this.f24041a.get() == -1) {
                return;
            }
            this.f24041a.incrementAndGet();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            if (this.f24041a.get() == -1) {
                return;
            }
            this.f24041a.addAndGet(bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            if (this.f24041a.get() == -1) {
                return;
            }
            this.f24041a.addAndGet(i11);
        }
    }
}
