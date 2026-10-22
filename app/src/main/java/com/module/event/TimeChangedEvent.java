package com.module.event;

import ne.AbstractC5868k;
import p400xa.RunnableC7583k1;

/* loaded from: classes2.dex */
public final class TimeChangedEvent {
    private final RunnableC7583k1.a timeInfo;

    public TimeChangedEvent(RunnableC7583k1.a aVar) {
        AbstractC5868k.m23674f(aVar, "timeInfo");
        this.timeInfo = aVar;
    }

    public final RunnableC7583k1.a getTimeInfo() {
        return this.timeInfo;
    }
}
