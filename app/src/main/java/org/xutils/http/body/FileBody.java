package org.xutils.http.body;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLConnection;
import org.xutils.common.util.LogUtil;

/* loaded from: classes3.dex */
public class FileBody extends InputStreamBody {
    private String contentType;
    private File file;

    public FileBody(File file) {
        this(file, null);
    }

    public static String getFileContentType(File file) {
        String str;
        try {
            str = URLConnection.guessContentTypeFromName(Uri.encode(file.getName(), "-![.:/,?&=]"));
        } catch (Exception e10) {
            LogUtil.m24375e(e10.toString());
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "application/octet-stream";
        }
        return str.replaceFirst("\\/jpg$", "/jpeg");
    }

    @Override // org.xutils.http.body.InputStreamBody, org.xutils.http.body.RequestBody
    public String getContentType() {
        if (TextUtils.isEmpty(this.contentType)) {
            this.contentType = getFileContentType(this.file);
        }
        return this.contentType;
    }

    @Override // org.xutils.http.body.InputStreamBody, org.xutils.http.body.RequestBody
    public void setContentType(String str) {
        this.contentType = str;
    }

    public FileBody(File file, String str) {
        super(new FileInputStream(file));
        this.file = file;
        this.contentType = str;
    }
}
