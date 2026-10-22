package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class VodPlayEndCollectBean implements Serializable {
    private int carton_count;
    private int carton_duration;
    private int kcp_status;
    private String retcode;
    private String trans_id;
    private String type;

    public VodPlayEndCollectBean(String str, String str2, int i10, int i11, int i12, String str3) {
        AbstractC5868k.m23674f(str3, "type");
        this.trans_id = str;
        this.retcode = str2;
        this.kcp_status = i10;
        this.carton_count = i11;
        this.carton_duration = i12;
        this.type = str3;
    }

    public static /* synthetic */ VodPlayEndCollectBean copy$default(VodPlayEndCollectBean vodPlayEndCollectBean, String str, String str2, int i10, int i11, int i12, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = vodPlayEndCollectBean.trans_id;
        }
        if ((i13 & 2) != 0) {
            str2 = vodPlayEndCollectBean.retcode;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            i10 = vodPlayEndCollectBean.kcp_status;
        }
        int i14 = i10;
        if ((i13 & 8) != 0) {
            i11 = vodPlayEndCollectBean.carton_count;
        }
        int i15 = i11;
        if ((i13 & 16) != 0) {
            i12 = vodPlayEndCollectBean.carton_duration;
        }
        int i16 = i12;
        if ((i13 & 32) != 0) {
            str3 = vodPlayEndCollectBean.type;
        }
        return vodPlayEndCollectBean.copy(str, str4, i14, i15, i16, str3);
    }

    public final String component1() {
        return this.trans_id;
    }

    public final String component2() {
        return this.retcode;
    }

    public final int component3() {
        return this.kcp_status;
    }

    public final int component4() {
        return this.carton_count;
    }

    public final int component5() {
        return this.carton_duration;
    }

    public final String component6() {
        return this.type;
    }

    public final VodPlayEndCollectBean copy(String str, String str2, int i10, int i11, int i12, String str3) {
        AbstractC5868k.m23674f(str3, "type");
        return new VodPlayEndCollectBean(str, str2, i10, i11, i12, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodPlayEndCollectBean)) {
            return false;
        }
        VodPlayEndCollectBean vodPlayEndCollectBean = (VodPlayEndCollectBean) obj;
        return AbstractC5868k.m23669a(this.trans_id, vodPlayEndCollectBean.trans_id) && AbstractC5868k.m23669a(this.retcode, vodPlayEndCollectBean.retcode) && this.kcp_status == vodPlayEndCollectBean.kcp_status && this.carton_count == vodPlayEndCollectBean.carton_count && this.carton_duration == vodPlayEndCollectBean.carton_duration && AbstractC5868k.m23669a(this.type, vodPlayEndCollectBean.type);
    }

    public final int getCarton_count() {
        return this.carton_count;
    }

    public final int getCarton_duration() {
        return this.carton_duration;
    }

    public final int getKcp_status() {
        return this.kcp_status;
    }

    public final String getRetcode() {
        return this.retcode;
    }

    public final String getTrans_id() {
        return this.trans_id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.trans_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.retcode;
        return ((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.kcp_status) * 31) + this.carton_count) * 31) + this.carton_duration) * 31) + this.type.hashCode();
    }

    public final void setCarton_count(int i10) {
        this.carton_count = i10;
    }

    public final void setCarton_duration(int i10) {
        this.carton_duration = i10;
    }

    public final void setKcp_status(int i10) {
        this.kcp_status = i10;
    }

    public final void setRetcode(String str) {
        this.retcode = str;
    }

    public final void setTrans_id(String str) {
        this.trans_id = str;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
    }

    public String toString() {
        return "VodPlayEndCollectBean(trans_id=" + this.trans_id + ", retcode=" + this.retcode + ", kcp_status=" + this.kcp_status + ", carton_count=" + this.carton_count + ", carton_duration=" + this.carton_duration + ", type=" + this.type + ')';
    }
}
