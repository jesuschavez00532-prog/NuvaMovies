package org.xutils.http.loader;

import android.text.TextUtils;
import com.lzy.okgo.model.HttpHeaders;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Date;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.cache.DiskCacheFile;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.Callback;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.common.util.ProcessLock;
import org.xutils.http.ProgressHandler;
import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;
import org.xutils.p275ex.FileLockedException;
import org.xutils.p275ex.HttpException;

/* loaded from: classes3.dex */
public class FileLoader extends Loader<File> {
    private static final int CHECK_SIZE = 512;
    private long contentLength;
    private DiskCacheFile diskCacheFile;
    private boolean isAutoRename;
    private boolean isAutoResume;
    private RequestParams params;
    private String responseFileName;
    private String saveFilePath;
    private String tempSaveFilePath;

    private File autoRename(File file) {
        if (this.isAutoRename && file.exists() && !TextUtils.isEmpty(this.responseFileName)) {
            File file2 = new File(file.getParent(), this.responseFileName);
            while (file2.exists()) {
                file2 = new File(file.getParent(), System.currentTimeMillis() + this.responseFileName);
            }
            if (file.renameTo(file2)) {
                return file2;
            }
            return file;
        }
        if (!this.saveFilePath.equals(this.tempSaveFilePath)) {
            File file3 = new File(this.saveFilePath);
            if (file.renameTo(file3)) {
                return file3;
            }
            return file;
        }
        return file;
    }

    private static String getResponseFileName(UriRequest uriRequest) {
        int indexOf;
        if (uriRequest == null) {
            return null;
        }
        String responseHeader = uriRequest.getResponseHeader(HttpHeaders.HEAD_KEY_CONTENT_DISPOSITION);
        if (!TextUtils.isEmpty(responseHeader) && (indexOf = responseHeader.indexOf("filename=")) > 0) {
            int i10 = indexOf + 9;
            int indexOf2 = responseHeader.indexOf(";", i10);
            if (indexOf2 < 0) {
                indexOf2 = responseHeader.length();
            }
            if (indexOf2 > i10) {
                try {
                    String decode = URLDecoder.decode(responseHeader.substring(i10, indexOf2), uriRequest.getParams().getCharset());
                    if (decode.startsWith("\"") && decode.endsWith("\"")) {
                        return decode.substring(1, decode.length() - 1);
                    }
                    return decode;
                } catch (UnsupportedEncodingException e10) {
                    LogUtil.m24376e(e10.getMessage(), e10);
                }
            }
        }
        return null;
    }

    private void initDiskCacheFile(UriRequest uriRequest) {
        DiskCacheEntity diskCacheEntity = new DiskCacheEntity();
        diskCacheEntity.setKey(uriRequest.getCacheKey());
        DiskCacheFile createDiskCacheFile = LruDiskCache.getDiskCache(this.params.getCacheDirName()).createDiskCacheFile(diskCacheEntity);
        this.diskCacheFile = createDiskCacheFile;
        if (createDiskCacheFile != null) {
            String absolutePath = createDiskCacheFile.getAbsolutePath();
            this.saveFilePath = absolutePath;
            this.tempSaveFilePath = absolutePath;
            this.isAutoRename = false;
            return;
        }
        throw new IOException("create cache file error:" + uriRequest.getCacheKey());
    }

    private static boolean isSupportRange(UriRequest uriRequest) {
        if (uriRequest == null) {
            return false;
        }
        String responseHeader = uriRequest.getResponseHeader("Accept-Ranges");
        if (responseHeader != null) {
            return responseHeader.contains("bytes");
        }
        String responseHeader2 = uriRequest.getResponseHeader(HttpHeaders.HEAD_KEY_CONTENT_RANGE);
        if (responseHeader2 == null || !responseHeader2.contains("bytes")) {
            return false;
        }
        return true;
    }

    @Override // org.xutils.http.loader.Loader
    public Loader<File> newInstance() {
        return new FileLoader();
    }

    @Override // org.xutils.http.loader.Loader
    public void save2Cache(UriRequest uriRequest) {
    }

    @Override // org.xutils.http.loader.Loader
    public void setParams(RequestParams requestParams) {
        if (requestParams != null) {
            this.params = requestParams;
            this.isAutoResume = requestParams.isAutoResume();
            this.isAutoRename = requestParams.isAutoRename();
        }
    }

    protected File load(InputStream inputStream) {
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            File file = new File(this.tempSaveFilePath);
            if (!file.isDirectory()) {
                if (!file.exists()) {
                    File parentFile = file.getParentFile();
                    if ((!parentFile.exists() && !parentFile.mkdirs()) || !parentFile.isDirectory()) {
                        throw new IOException("could not create the dir: " + parentFile.getAbsolutePath());
                    }
                }
                long length = file.length();
                if (this.isAutoResume && length > 0) {
                    long j10 = length - 512;
                    try {
                        if (j10 > 0) {
                            fileInputStream = new FileInputStream(file);
                            try {
                                if (Arrays.equals(IOUtil.readBytes(inputStream, 0L, 512), IOUtil.readBytes(fileInputStream, j10, 512))) {
                                    this.contentLength -= 512;
                                    IOUtil.closeQuietly(fileInputStream);
                                } else {
                                    IOUtil.closeQuietly(fileInputStream);
                                    IOUtil.deleteFileOrDir(file);
                                    throw new RuntimeException("need retry");
                                }
                            } catch (Throwable th) {
                                th = th;
                                IOUtil.closeQuietly(fileInputStream);
                                throw th;
                            }
                        } else {
                            IOUtil.deleteFileOrDir(file);
                            throw new RuntimeException("need retry");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = null;
                    }
                }
                if (this.isAutoResume) {
                    fileOutputStream = new FileOutputStream(file, true);
                } else {
                    fileOutputStream = new FileOutputStream(file);
                    length = 0;
                }
                long j11 = this.contentLength + length;
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
                try {
                    bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                }
                try {
                    ProgressHandler progressHandler = this.progressHandler;
                    if (progressHandler != null && !progressHandler.updateProgress(j11, length, true)) {
                        throw new Callback.CancelledException("download stopped!");
                    }
                    byte[] bArr = new byte[4096];
                    while (true) {
                        long j12 = length;
                        int read = bufferedInputStream2.read(bArr);
                        if (read != -1) {
                            if (file.getParentFile().exists()) {
                                bufferedOutputStream2.write(bArr, 0, read);
                                length = read + j12;
                                ProgressHandler progressHandler2 = this.progressHandler;
                                if (progressHandler2 != null && !progressHandler2.updateProgress(j11, length, false)) {
                                    bufferedOutputStream2.flush();
                                    throw new Callback.CancelledException("download stopped!");
                                }
                            } else {
                                file.getParentFile().mkdirs();
                                throw new IOException("parent be deleted!");
                            }
                        } else {
                            bufferedOutputStream2.flush();
                            DiskCacheFile diskCacheFile = this.diskCacheFile;
                            if (diskCacheFile != null) {
                                file = diskCacheFile.commit();
                            }
                            ProgressHandler progressHandler3 = this.progressHandler;
                            if (progressHandler3 != null) {
                                progressHandler3.updateProgress(j11, j12, true);
                            }
                            IOUtil.closeQuietly(bufferedInputStream2);
                            IOUtil.closeQuietly(bufferedOutputStream2);
                            return autoRename(file);
                        }
                    }
                } catch (Throwable th4) {
                    bufferedOutputStream = bufferedOutputStream2;
                    th = th4;
                    bufferedInputStream = bufferedInputStream2;
                    IOUtil.closeQuietly(bufferedInputStream);
                    IOUtil.closeQuietly(bufferedOutputStream);
                    throw th;
                }
            } else {
                throw new IOException("could not create the file: " + this.tempSaveFilePath);
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.xutils.http.loader.Loader
    public File loadFromCache(DiskCacheEntity diskCacheEntity) {
        return LruDiskCache.getDiskCache(this.params.getCacheDirName()).getDiskCacheFile(diskCacheEntity.getKey());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.xutils.http.loader.Loader
    public File load(UriRequest uriRequest) {
        File file;
        File autoRename;
        ProcessLock processLock = null;
        try {
            try {
                String saveFilePath = this.params.getSaveFilePath();
                this.saveFilePath = saveFilePath;
                this.diskCacheFile = null;
                if (TextUtils.isEmpty(saveFilePath)) {
                    ProgressHandler progressHandler = this.progressHandler;
                    if (progressHandler != null && !progressHandler.updateProgress(0L, 0L, false)) {
                        throw new Callback.CancelledException("download stopped!");
                    }
                    initDiskCacheFile(uriRequest);
                } else {
                    this.tempSaveFilePath = this.saveFilePath + ".tmp";
                }
                ProgressHandler progressHandler2 = this.progressHandler;
                if (progressHandler2 != null && !progressHandler2.updateProgress(0L, 0L, false)) {
                    throw new Callback.CancelledException("download stopped!");
                }
                processLock = ProcessLock.tryLock(this.saveFilePath + "_lock", true);
            } catch (HttpException e10) {
                if (e10.getCode() == 416) {
                    DiskCacheFile diskCacheFile = this.diskCacheFile;
                    if (diskCacheFile != null) {
                        file = diskCacheFile.commit();
                    } else {
                        file = new File(this.tempSaveFilePath);
                    }
                    if (file != null && file.exists()) {
                        if (this.isAutoRename) {
                            this.responseFileName = getResponseFileName(uriRequest);
                        }
                        autoRename = autoRename(file);
                    } else {
                        IOUtil.deleteFileOrDir(file);
                        throw new IllegalStateException("cache file not found" + uriRequest.getCacheKey());
                    }
                } else {
                    throw e10;
                }
            }
            if (processLock != null && processLock.isValid()) {
                this.params = uriRequest.getParams();
                long j10 = 0;
                if (this.isAutoResume) {
                    File file2 = new File(this.tempSaveFilePath);
                    long length = file2.length();
                    if (length <= 512) {
                        IOUtil.deleteFileOrDir(file2);
                    } else {
                        j10 = length - 512;
                    }
                }
                this.params.setHeader(HttpHeaders.HEAD_KEY_RANGE, "bytes=" + j10 + Operator.Operation.MINUS);
                ProgressHandler progressHandler3 = this.progressHandler;
                if (progressHandler3 != null && !progressHandler3.updateProgress(0L, 0L, false)) {
                    throw new Callback.CancelledException("download stopped!");
                }
                uriRequest.sendRequest();
                this.contentLength = uriRequest.getContentLength();
                if (this.isAutoRename) {
                    this.responseFileName = getResponseFileName(uriRequest);
                }
                if (this.isAutoResume) {
                    this.isAutoResume = isSupportRange(uriRequest);
                }
                ProgressHandler progressHandler4 = this.progressHandler;
                if (progressHandler4 != null && !progressHandler4.updateProgress(0L, 0L, false)) {
                    throw new Callback.CancelledException("download stopped!");
                }
                DiskCacheFile diskCacheFile2 = this.diskCacheFile;
                if (diskCacheFile2 != null) {
                    try {
                        DiskCacheEntity cacheEntity = diskCacheFile2.getCacheEntity();
                        cacheEntity.setLastAccess(System.currentTimeMillis());
                        cacheEntity.setEtag(uriRequest.getETag());
                        cacheEntity.setExpires(uriRequest.getExpiration());
                        cacheEntity.setLastModify(new Date(uriRequest.getLastModified()));
                    } catch (Throwable th) {
                        LogUtil.m24376e(th.getMessage(), th);
                    }
                }
                autoRename = load(uriRequest.getInputStream());
                return autoRename;
            }
            throw new FileLockedException("download exists: " + this.saveFilePath);
        } finally {
            IOUtil.closeQuietly((Closeable) null);
            IOUtil.closeQuietly(this.diskCacheFile);
        }
    }
}
