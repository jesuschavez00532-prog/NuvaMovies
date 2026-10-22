package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class VodCartonCollectBean implements Serializable {
    private int buffer_data;
    private int buffer_time;
    private int carton_count;
    private int carton_duration;
    private int kcp_status;
    private String trans_id;
    private String type;

    public VodCartonCollectBean(String str, int i10, int i11, int i12, int i13, int i14, String str2) {
        AbstractC5868k.m23674f(str2, "type");
        this.trans_id = str;
        this.buffer_time = i10;
        this.buffer_data = i11;
        this.kcp_status = i12;
        this.carton_count = i13;
        this.carton_duration = i14;
        this.type = str2;
    }

    public static /* synthetic */ VodCartonCollectBean copy$default(VodCartonCollectBean vodCartonCollectBean, String str, int i10, int i11, int i12, int i13, int i14, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = vodCartonCollectBean.trans_id;
        }
        if ((i15 & 2) != 0) {
            i10 = vodCartonCollectBean.buffer_time;
        }
        int i16 = i10;
        if ((i15 & 4) != 0) {
            i11 = vodCartonCollectBean.buffer_data;
        }
        int i17 = i11;
        if ((i15 & 8) != 0) {
            i12 = vodCartonCollectBean.kcp_status;
        }
        int i18 = i12;
        if ((i15 & 16) != 0) {
            i13 = vodCartonCollectBean.carton_count;
        }
        int i19 = i13;
        if ((i15 & 32) != 0) {
            i14 = vodCartonCollectBean.carton_duration;
        }
        int i20 = i14;
        if ((i15 & 64) != 0) {
            str2 = vodCartonCollectBean.type;
        }
        return vodCartonCollectBean.copy(str, i16, i17, i18, i19, i20, str2);
    }

    public final String component1() {
        return this.trans_id;
    }

    public final int component2() {
        return this.buffer_time;
    }

    public final int component3() {
        return this.buffer_data;
    }

    public final int component4() {
        return this.kcp_status;
    }

    public final int component5() {
        return this.carton_count;
    }

    public final int component6() {
        return this.carton_duration;
    }

    public final String component7() {
        return this.type;
    }

    public final VodCartonCollectBean copy(String str, int i10, int i11, int i12, int i13, int i14, String str2) {
        AbstractC5868k.m23674f(str2, "type");
        return new VodCartonCollectBean(str, i10, i11, i12, i13, i14, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodCartonCollectBean)) {
            return false;
        }
        VodCartonCollectBean vodCartonCollectBean = (VodCartonCollectBean) obj;
        return AbstractC5868k.m23669a(this.trans_id, vodCartonCollectBean.trans_id) && this.buffer_time == vodCartonCollectBean.buffer_time && this.buffer_data == vodCartonCollectBean.buffer_data && this.kcp_status == vodCartonCollectBean.kcp_status && this.carton_count == vodCartonCollectBean.carton_count && this.carton_duration == vodCartonCollectBean.carton_duration && AbstractC5868k.m23669a(this.type, vodCartonCollectBean.type);
    }

    public final int getBuffer_data() {
        return this.buffer_data;
    }

    public final int getBuffer_time() {
        return this.buffer_time;
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

    public final String getTrans_id() {
        return this.trans_id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.trans_id;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.buffer_time) * 31) + this.buffer_data) * 31) + this.kcp_status) * 31) + this.carton_count) * 31) + this.carton_duration) * 31) + this.type.hashCode();
    }

    public final void setBuffer_data(int i10) {
        this.buffer_data = i10;
    }

    public final void setBuffer_time(int i10) {
        this.buffer_time = i10;
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

    public final void setTrans_id(String str) {
        this.trans_id = str;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
    }

    public String toString() {
        return "VodCartonCollectBean(trans_id=" + this.trans_id + ", buffer_time=" + this.buffer_time + ", buffer_data=" + this.buffer_data + ", kcp_status=" + this.kcp_status + ", carton_count=" + this.carton_count + ", carton_duration=" + this.carton_duration + ", type=" + this.type + ')';
    }
}
