package com.dcs.bean;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class N1Random {
    private String random;

    public N1Random(String str) {
        AbstractC5868k.m23674f(str, "random");
        this.random = str;
    }

    public static /* synthetic */ N1Random copy$default(N1Random n1Random, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = n1Random.random;
        }
        return n1Random.copy(str);
    }

    public final String component1() {
        return this.random;
    }

    public final N1Random copy(String str) {
        AbstractC5868k.m23674f(str, "random");
        return new N1Random(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N1Random) && AbstractC5868k.m23669a(this.random, ((N1Random) obj).random);
    }

    public final String getRandom() {
        return this.random;
    }

    public int hashCode() {
        return this.random.hashCode();
    }

    public final void setRandom(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.random = str;
    }

    public String toString() {
        return "N1Random(random=" + this.random + ')';
    }
}
