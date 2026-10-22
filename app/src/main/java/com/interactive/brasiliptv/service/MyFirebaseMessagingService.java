package com.interactive.brasiliptv.service;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.C2699n0;
import com.google.firebase.messaging.FirebaseMessagingService;
import ne.AbstractC5868k;
import p153h2.AbstractC4509b;

/* loaded from: classes2.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: g */
    private final String f10602g = MyFirebaseMessagingService.class.getSimpleName();

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: p */
    public void mo11086p() {
        super.mo11086p();
        AbstractC4509b.m18869b(this.f10602g, "onDeletedMessages", new Object[0]);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: q */
    public void mo11087q(C2699n0 c2699n0) {
        AbstractC5868k.m23674f(c2699n0, "remoteMessage");
        super.mo11087q(c2699n0);
        c2699n0.m11288i();
        C2699n0.b m11288i = c2699n0.m11288i();
        if (m11288i != null) {
            AbstractC4509b.m18869b(this.f10602g, "Message Notification title: " + m11288i.m11291c(), new Object[0]);
            AbstractC4509b.m18869b(this.f10602g, "Message Notification Body: " + m11288i.m11290a(), new Object[0]);
            AbstractC4509b.m18869b(this.f10602g, "Message Notification data: " + c2699n0.m11287g(), new Object[0]);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: s */
    public void mo11089s(String str) {
        AbstractC5868k.m23674f(str, "token");
        super.mo11089s(str);
        AbstractC4509b.m18869b(this.f10602g, "Refreshed token: " + str, new Object[0]);
        AbstractC4509b.m18869b(this.f10602g, "firebase " + FirebaseInstanceId.m10913i().m10932n(), new Object[0]);
    }
}
