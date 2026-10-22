package com.module.event;

import ne.AbstractC5868k;
import p102db.C4053l;

/* loaded from: classes2.dex */
public final class ShowGuideEvent {
    private C4053l.c type;

    public ShowGuideEvent(C4053l.c cVar) {
        AbstractC5868k.m23674f(cVar, "type");
        this.type = cVar;
    }

    public final C4053l.c getType() {
        return this.type;
    }

    public final void setType(C4053l.c cVar) {
        AbstractC5868k.m23674f(cVar, "<set-?>");
        this.type = cVar;
    }
}
