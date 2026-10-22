package com.module.event;

import com.module.p069db.UmengPush;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class RemoteLoginEvent {
    private UmengPush msg;

    public RemoteLoginEvent(UmengPush umengPush) {
        AbstractC5868k.m23674f(umengPush, "msg");
        this.msg = umengPush;
    }

    public final UmengPush getMsg() {
        return this.msg;
    }

    public final void setMsg(UmengPush umengPush) {
        AbstractC5868k.m23674f(umengPush, "<set-?>");
        this.msg = umengPush;
    }
}
