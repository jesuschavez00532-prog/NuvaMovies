package p179ib;

import android.content.Context;
import android.util.Log;
import com.umeng.message.entity.UMessage;
import java.util.Map;
import p194jb.AbstractC5046a;

/* renamed from: ib.b */
/* loaded from: classes2.dex */
public class C4925b {

    /* renamed from: a */
    private final String f20469a = "UMDomainHandler";

    /* renamed from: b */
    private boolean f20470b = true;

    /* renamed from: a */
    public void m20230a(Context context, UMessage uMessage) {
        if (uMessage.extra == null) {
            m20232c("UMDomainHandler", "收到自定义消息: msg.extra = null");
            return;
        }
        m20232c("UMDomainHandler", "收到自定义消息:" + uMessage.extra.toString());
        for (Map.Entry<String, String> entry : uMessage.extra.entrySet()) {
            m20232c("UMDomainHandler", "Key = " + entry.getKey() + ", Value = " + entry.getValue());
            AbstractC5046a.m20497d(context, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: b */
    public void m20231b(Context context, UMessage uMessage) {
        m20232c("UMDomainHandler", "收到通知消息:" + uMessage.getRaw().toString());
    }

    /* renamed from: c */
    public void m20232c(String str, String str2) {
        if (this.f20470b) {
            Log.i(str, str2);
        }
    }

    /* renamed from: d */
    public void m20233d(boolean z10) {
        this.f20470b = z10;
    }
}
