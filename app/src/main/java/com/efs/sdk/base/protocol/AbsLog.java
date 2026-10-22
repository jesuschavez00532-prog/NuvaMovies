package com.efs.sdk.base.protocol;

/* loaded from: classes.dex */
public abstract class AbsLog implements ILogProtocol {

    /* renamed from: cp */
    private String f7210cp = "none";

    /* renamed from: de */
    private byte f7211de = 1;
    private String logType;

    public AbsLog(String str) {
        this.logType = str;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLogType() {
        return this.logType;
    }

    public boolean isCp() {
        if (!this.f7210cp.equals("none")) {
            return true;
        }
        return false;
    }

    public boolean isDe() {
        if (this.f7211de != 1) {
            return true;
        }
        return false;
    }

    public void setCp(String str) {
        this.f7210cp = str;
    }

    public void setDe(byte b10) {
        this.f7211de = b10;
    }
}
