package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class P2pDaemonResult implements Serializable {
    private Integer mode;

    public P2pDaemonResult(Integer num) {
        this.mode = num;
    }

    public static /* synthetic */ P2pDaemonResult copy$default(P2pDaemonResult p2pDaemonResult, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = p2pDaemonResult.mode;
        }
        return p2pDaemonResult.copy(num);
    }

    public final Integer component1() {
        return this.mode;
    }

    public final P2pDaemonResult copy(Integer num) {
        return new P2pDaemonResult(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P2pDaemonResult) && AbstractC5868k.m23669a(this.mode, ((P2pDaemonResult) obj).mode);
    }

    public final Integer getMode() {
        return this.mode;
    }

    public int hashCode() {
        Integer num = this.mode;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void setMode(Integer num) {
        this.mode = num;
    }

    public String toString() {
        return "P2pDaemonResult(mode=" + this.mode + ')';
    }
}
