package p000a;

import android.content.Context;
import androidx.annotation.Keep;
import nc.Digraph;
import p217l2.InterfaceC5343d;
import p288pc.InterfaceC6255b;
import p429z8.AbstractC7762a;

@Keep
/* loaded from: classes.dex */
public class ServiceProvider__TheRouter__243470720 implements InterfaceC6255b {
    public static final String FLOW_TASK_JSON = "{}";
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void addFlowTask(Context context, Digraph digraph) {
    }

    @Override // p288pc.InterfaceC6255b
    public <T> T interception(Class<T> cls, Object... objArr) {
        if (InterfaceC5343d.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC7762a.m30048a();
        }
        return null;
    }
}
