package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.InterfaceC3344cl;

/* loaded from: classes3.dex */
public enum Gender implements InterfaceC3344cl {
    MALE(0),
    FEMALE(1),
    UNKNOWN(2);

    private final int value;

    Gender(int i10) {
        this.value = i10;
    }

    public static Gender findByValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return UNKNOWN;
            }
            return FEMALE;
        }
        return MALE;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3344cl
    public int getValue() {
        return this.value;
    }
}
