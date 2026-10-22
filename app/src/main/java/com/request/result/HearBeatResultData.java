package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class HearBeatResultData implements Serializable {
    private int availableTime;
    private String userToken;

    public HearBeatResultData(String str, int i10) {
        this.userToken = str;
        this.availableTime = i10;
    }

    public static /* synthetic */ HearBeatResultData copy$default(HearBeatResultData hearBeatResultData, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hearBeatResultData.userToken;
        }
        if ((i11 & 2) != 0) {
            i10 = hearBeatResultData.availableTime;
        }
        return hearBeatResultData.copy(str, i10);
    }

    public final String component1() {
        return this.userToken;
    }

    public final int component2() {
        return this.availableTime;
    }

    public final HearBeatResultData copy(String str, int i10) {
        return new HearBeatResultData(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HearBeatResultData)) {
            return false;
        }
        HearBeatResultData hearBeatResultData = (HearBeatResultData) obj;
        return AbstractC5868k.m23669a(this.userToken, hearBeatResultData.userToken) && this.availableTime == hearBeatResultData.availableTime;
    }

    public final int getAvailableTime() {
        return this.availableTime;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        String str = this.userToken;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.availableTime;
    }

    public final void setAvailableTime(int i10) {
        this.availableTime = i10;
    }

    public final void setUserToken(String str) {
        this.userToken = str;
    }

    public String toString() {
        return "HearBeatResultData(userToken=" + this.userToken + ", availableTime=" + this.availableTime + ')';
    }
}
