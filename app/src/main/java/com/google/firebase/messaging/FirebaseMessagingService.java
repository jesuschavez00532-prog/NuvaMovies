package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC2690j {

    /* renamed from: f */
    private static final Queue f10215f = new ArrayDeque(10);

    /* renamed from: l */
    private boolean m11079l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f10215f;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    /* renamed from: m */
    private void m11080m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C2682g0.m11221t(extras)) {
            C2682g0 c2682g0 = new C2682g0(extras);
            ExecutorService m11296e = AbstractC2700o.m11296e();
            try {
                if (new C2678f(this, c2682g0, m11296e).m11206a()) {
                    return;
                }
                m11296e.shutdown();
                if (AbstractC2676e0.m11174A(intent)) {
                    AbstractC2676e0.m11195t(intent);
                }
            } finally {
                m11296e.shutdown();
            }
        }
        mo11087q(new C2699n0(extras));
    }

    /* renamed from: n */
    private String m11081n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* renamed from: o */
    private void m11082o(Intent intent) {
        if (!m11079l(intent.getStringExtra("google.message_id"))) {
            m11083u(intent);
        }
    }

    /* renamed from: u */
    private void m11083u(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = AgooConstants.MESSAGE_SYSTEM_SOURCE_GCM;
        }
        char c10 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c10 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(AgooConstants.MESSAGE_SYSTEM_SOURCE_GCM)) {
                    c10 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c10 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                mo11086p();
                return;
            case 1:
                AbstractC2676e0.m11197v(intent);
                m11080m(intent);
                return;
            case 2:
                m11090t(m11081n(intent), new C2707r0(intent.getStringExtra("error")));
                return;
            case 3:
                m11088r(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2690j
    /* renamed from: e */
    protected Intent mo11084e(Intent intent) {
        return C2709s0.m11311b().m11313c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2690j
    /* renamed from: f */
    public void mo11085f(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                mo11089s(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        m11082o(intent);
    }

    /* renamed from: p */
    public void mo11086p() {
    }

    /* renamed from: q */
    public void mo11087q(C2699n0 c2699n0) {
    }

    /* renamed from: r */
    public void m11088r(String str) {
    }

    /* renamed from: s */
    public void mo11089s(String str) {
    }

    /* renamed from: t */
    public void m11090t(String str, Exception exc) {
    }
}
