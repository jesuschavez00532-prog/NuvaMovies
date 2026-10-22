package p000a;

import android.content.Context;
import androidx.annotation.Keep;
import nc.Digraph;
import p176i8.AbstractC4908a;
import p217l2.InterfaceC5340a;
import p217l2.InterfaceC5341b;
import p288pc.InterfaceC6255b;

@Keep
/* loaded from: classes.dex */
public class ServiceProvider__TheRouter__1482330061 implements InterfaceC6255b {
    public static final String FLOW_TASK_JSON = "{}";
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void addFlowTask(Context context, Digraph digraph) {
    }

    @Override // p288pc.InterfaceC6255b
    public <T> T interception(Class<T> cls, Object... objArr) {
        if (InterfaceC5340a.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC4908a.m20167a();
        }
        if (InterfaceC5341b.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC4908a.m20168b();
        }
        return null;
    }
}
