package com.request.result;

/* loaded from: classes.dex */
public final class VerifyEmailCodeData {
    private int rewardDays;

    public VerifyEmailCodeData(int i10) {
        this.rewardDays = i10;
    }

    public static /* synthetic */ VerifyEmailCodeData copy$default(VerifyEmailCodeData verifyEmailCodeData, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = verifyEmailCodeData.rewardDays;
        }
        return verifyEmailCodeData.copy(i10);
    }

    public final int component1() {
        return this.rewardDays;
    }

    public final VerifyEmailCodeData copy(int i10) {
        return new VerifyEmailCodeData(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifyEmailCodeData) && this.rewardDays == ((VerifyEmailCodeData) obj).rewardDays;
    }

    public final int getRewardDays() {
        return this.rewardDays;
    }

    public int hashCode() {
        return this.rewardDays;
    }

    public final void setRewardDays(int i10) {
        this.rewardDays = i10;
    }

    public String toString() {
        return "VerifyEmailCodeData(rewardDays=" + this.rewardDays + ')';
    }
}
