package com.request.bean;

import java.util.ArrayList;
import ne.AbstractC5868k;
import p291q0.AbstractC6322a;

/* loaded from: classes2.dex */
public final class BackProgram {
    private ArrayList<EpgProgram> backProgramList;
    private String channelCode;
    private long requestTime;

    public BackProgram(String str, ArrayList<EpgProgram> arrayList, long j10) {
        AbstractC5868k.m23674f(str, "channelCode");
        AbstractC5868k.m23674f(arrayList, "backProgramList");
        this.channelCode = str;
        this.backProgramList = arrayList;
        this.requestTime = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BackProgram copy$default(BackProgram backProgram, String str, ArrayList arrayList, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = backProgram.channelCode;
        }
        if ((i10 & 2) != 0) {
            arrayList = backProgram.backProgramList;
        }
        if ((i10 & 4) != 0) {
            j10 = backProgram.requestTime;
        }
        return backProgram.copy(str, arrayList, j10);
    }

    public final String component1() {
        return this.channelCode;
    }

    public final ArrayList<EpgProgram> component2() {
        return this.backProgramList;
    }

    public final long component3() {
        return this.requestTime;
    }

    public final BackProgram copy(String str, ArrayList<EpgProgram> arrayList, long j10) {
        AbstractC5868k.m23674f(str, "channelCode");
        AbstractC5868k.m23674f(arrayList, "backProgramList");
        return new BackProgram(str, arrayList, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackProgram)) {
            return false;
        }
        BackProgram backProgram = (BackProgram) obj;
        return AbstractC5868k.m23669a(this.channelCode, backProgram.channelCode) && AbstractC5868k.m23669a(this.backProgramList, backProgram.backProgramList) && this.requestTime == backProgram.requestTime;
    }

    public final ArrayList<EpgProgram> getBackProgramList() {
        return this.backProgramList;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final long getRequestTime() {
        return this.requestTime;
    }

    public int hashCode() {
        return (((this.channelCode.hashCode() * 31) + this.backProgramList.hashCode()) * 31) + AbstractC6322a.m25086a(this.requestTime);
    }

    public final void setBackProgramList(ArrayList<EpgProgram> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.backProgramList = arrayList;
    }

    public final void setChannelCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.channelCode = str;
    }

    public final void setRequestTime(long j10) {
        this.requestTime = j10;
    }

    public String toString() {
        return "BackProgram(channelCode=" + this.channelCode + ", backProgramList=" + this.backProgramList + ", requestTime=" + this.requestTime + ')';
    }
}
