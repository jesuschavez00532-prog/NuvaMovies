package com.umeng.message.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.ccg.ActionInfo;
import com.umeng.ccg.C3417a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.s */
/* loaded from: classes3.dex */
public final class C3700s implements ActionInfo {
    @Override // com.umeng.ccg.ActionInfo
    public final String getModule(Context context) {
        return "push";
    }

    @Override // com.umeng.ccg.ActionInfo
    public final String[] getSupportAction(Context context) {
        return new String[]{C3417a.f14983e};
    }

    @Override // com.umeng.ccg.ActionInfo
    public final boolean getSwitchState(Context context, String str) {
        if (TextUtils.equals(str, C3417a.f14983e)) {
            return C3678f.f16509a;
        }
        return false;
    }

    @Override // com.umeng.ccg.ActionInfo
    public final void onCommand(Context context, String str, Object obj) {
        Future<?> future;
        if (TextUtils.equals(str, C3417a.f14983e) && (obj instanceof JSONObject) && C3678f.m15753b(context)) {
            JSONObject jSONObject = (JSONObject) obj;
            WeakReference<Future<?>> weakReference = C3696o.f16551a;
            if (weakReference == null || (future = weakReference.get()) == null || future.isDone() || future.isCancelled()) {
                C3696o.f16551a = new WeakReference<>(C3581b.m15374b(new RunnableC3694n(jSONObject)));
            }
        }
    }
}
