package p000a;

import android.content.Context;
import androidx.annotation.Keep;
import nc.Digraph;
import p217l2.InterfaceC5342c;
import p288pc.InterfaceC6255b;
import p314r8.AbstractC6561b;
import p314r8.AbstractC6562c;
import va.InterfaceC7251a;

@Keep
/* loaded from: classes.dex */
public class ServiceProvider__TheRouter__1432029340 implements InterfaceC6255b {
    public static final String FLOW_TASK_JSON = "{}";
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void addFlowTask(Context context, Digraph digraph) {
    }

    @Override // p288pc.InterfaceC6255b
    public <T> T interception(Class<T> cls, Object... objArr) {
        if (InterfaceC7251a.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC6561b.m25618a();
        }
        if (InterfaceC5342c.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC6562c.m25624a();
        }
        return null;
    }
}
