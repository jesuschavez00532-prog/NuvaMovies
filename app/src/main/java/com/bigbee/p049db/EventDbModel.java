package com.bigbee.p049db;

import com.raizlabs.android.dbflow.structure.BaseModel;

/* loaded from: classes.dex */
public class EventDbModel extends BaseModel {
    public String appVer;
    public String cipherStr;
    public String commonStr;
    public long endTime;
    public String eventId;

    /* renamed from: id */
    public int f6215id;
    public boolean notIntactEvent;
    public boolean reporting;
    public String reserveA;
    public String reserveB;
    public long startTime;
    public String sysVer;

    public String toString() {
        return "EventDbModel{id=" + this.f6215id + ", appVer='" + this.appVer + "', sysVer='" + this.sysVer + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", eventId='" + this.eventId + "', reporting=" + this.reporting + ", cipherStr='" + this.cipherStr + "', commonStr='" + this.commonStr + "', notIntactEvent=" + this.notIntactEvent + ", reserveA='" + this.reserveA + "', reserveB='" + this.reserveB + "'}";
    }
}
