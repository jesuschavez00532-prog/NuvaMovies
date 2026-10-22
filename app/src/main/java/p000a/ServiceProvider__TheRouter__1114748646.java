package p000a;

import android.content.Context;
import androidx.annotation.Keep;
import nc.Digraph;
import p208k9.AbstractC5137a;
import p217l2.InterfaceC5344e;
import p217l2.InterfaceC5346g;
import p288pc.InterfaceC6255b;

@Keep
/* loaded from: classes.dex */
public class ServiceProvider__TheRouter__1114748646 implements InterfaceC6255b {
    public static final String FLOW_TASK_JSON = "{}";
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void addFlowTask(Context context, Digraph digraph) {
    }

    @Override // p288pc.InterfaceC6255b
    public <T> T interception(Class<T> cls, Object... objArr) {
        if (InterfaceC5344e.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC5137a.m20781b();
        }
        if (InterfaceC5346g.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC5137a.m20782c();
        }
        return null;
    }
}
