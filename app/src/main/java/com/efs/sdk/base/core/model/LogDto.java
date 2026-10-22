package com.efs.sdk.base.core.model;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;

/* loaded from: classes.dex */
public class LogDto {

    /* renamed from: a */
    private C1710a f7169a;

    /* renamed from: b */
    private C1711b f7170b = new C1711b();

    /* renamed from: c */
    private byte[] f7171c;

    /* renamed from: d */
    private File f7172d;

    public LogDto(String str, byte b10) {
        this.f7169a = new C1710a(str, b10);
    }

    /* renamed from: a */
    private void m7720a() {
        if (getLogBodyType() == 0 && getData() != null) {
            this.f7169a.f7178f = getData().length;
        } else if (getLogBodyType() == 1 && getFile().exists()) {
            this.f7169a.f7178f = getFile().length();
        }
    }

    public static LogDto buildLogDto(ILogProtocol iLogProtocol) {
        LogDto logDto;
        LogDto logDto2 = null;
        try {
            logDto = new LogDto(iLogProtocol.getLogType(), iLogProtocol.getLogProtocol());
        } catch (Exception e10) {
            e = e10;
        }
        try {
            int bodyType = iLogProtocol.getBodyType();
            if (bodyType != 0) {
                if (bodyType != 1) {
                    Log.m7738w("efs.base", "Can not support body type: " + iLogProtocol.getBodyType());
                } else {
                    logDto.setLogBodyType(1);
                    logDto.setFile(new File(iLogProtocol.getFilePath()));
                }
            } else {
                logDto.setLogBodyType(0);
                logDto.setData(iLogProtocol.generate());
                if (Constants.LOG_TYPE_CODELOGPERF.equals(logDto.getLogType())) {
                    logDto.setUid(ControllerCenter.getGlobalEnvStruct().getLogUid());
                    logDto.setDid(ControllerCenter.getGlobalEnvStruct().getLogDid());
                    logDto.setBeginTime(iLogProtocol.getLogBeginTime());
                    logDto.setEndTime(iLogProtocol.getLogEndTime());
                }
            }
            return logDto;
        } catch (Exception e11) {
            e = e11;
            logDto2 = logDto;
            Log.m7727e("efs.base", "log send error", e);
            return logDto2;
        }
    }

    public long getBeginTime() {
        return this.f7169a.f7182j;
    }

    public long getBodySize() {
        m7720a();
        return this.f7169a.f7178f;
    }

    public String getCp() {
        return this.f7169a.f7176d;
    }

    public byte[] getData() {
        return this.f7171c;
    }

    public int getDe() {
        return this.f7169a.f7177e;
    }

    public String getDid() {
        return this.f7169a.f7181i;
    }

    public long getEndTime() {
        return this.f7169a.f7183k;
    }

    public File getFile() {
        return this.f7172d;
    }

    public int getLogBodyType() {
        return this.f7169a.f7175c;
    }

    public int getLogCnt() {
        return this.f7169a.f7179g;
    }

    public byte getLogProtocol() {
        return this.f7169a.f7174b;
    }

    public String getLogType() {
        return this.f7169a.f7173a;
    }

    public HttpResponse getResponseDto() {
        return this.f7170b.f7186c;
    }

    public String getUid() {
        return this.f7169a.f7180h;
    }

    public boolean isCp() {
        if (!"none".equals(this.f7169a.f7176d)) {
            return true;
        }
        return false;
    }

    public boolean isDe() {
        if (1 != this.f7169a.f7177e) {
            return true;
        }
        return false;
    }

    public boolean isLimitByFlow() {
        return this.f7170b.f7185b;
    }

    public boolean isSendImediately() {
        return this.f7170b.f7184a;
    }

    public void setBeginTime(long j10) {
        this.f7169a.f7182j = j10;
    }

    public void setCp(String str) {
        this.f7169a.f7176d = str;
    }

    public void setData(byte[] bArr) {
        this.f7171c = bArr;
        m7720a();
    }

    public void setDe(int i10) {
        this.f7169a.f7177e = i10;
        m7720a();
    }

    public void setDid(String str) {
        this.f7169a.f7181i = str;
    }

    public void setEndTime(long j10) {
        this.f7169a.f7183k = j10;
    }

    public void setFile(File file) {
        this.f7172d = file;
    }

    public void setLimitByFlow(boolean z10) {
        this.f7170b.f7185b = z10;
    }

    public void setLogBodyType(int i10) {
        this.f7169a.f7175c = i10;
    }

    public void setLogCnt(int i10) {
        this.f7169a.f7179g = i10;
    }

    public void setResponseDto(HttpResponse httpResponse) {
        this.f7170b.f7186c = httpResponse;
    }

    public void setSendImediately(boolean z10) {
        this.f7170b.f7184a = z10;
    }

    public void setUid(String str) {
        this.f7169a.f7180h = str;
    }
}
