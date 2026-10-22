package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class DataCollectResult implements Serializable {
    private String code_desc;
    private String return_code;

    public DataCollectResult(String str, String str2) {
        this.return_code = str;
        this.code_desc = str2;
    }

    public static /* synthetic */ DataCollectResult copy$default(DataCollectResult dataCollectResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dataCollectResult.return_code;
        }
        if ((i10 & 2) != 0) {
            str2 = dataCollectResult.code_desc;
        }
        return dataCollectResult.copy(str, str2);
    }

    public final String component1() {
        return this.return_code;
    }

    public final String component2() {
        return this.code_desc;
    }

    public final DataCollectResult copy(String str, String str2) {
        return new DataCollectResult(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCollectResult)) {
            return false;
        }
        DataCollectResult dataCollectResult = (DataCollectResult) obj;
        return AbstractC5868k.m23669a(this.return_code, dataCollectResult.return_code) && AbstractC5868k.m23669a(this.code_desc, dataCollectResult.code_desc);
    }

    public final String getCode_desc() {
        return this.code_desc;
    }

    public final String getReturn_code() {
        return this.return_code;
    }

    public int hashCode() {
        String str = this.return_code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code_desc;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCode_desc(String str) {
        this.code_desc = str;
    }

    public final void setReturn_code(String str) {
        this.return_code = str;
    }

    public String toString() {
        return "DataCollectResult(return_code=" + this.return_code + ", code_desc=" + this.code_desc + ')';
    }
}
