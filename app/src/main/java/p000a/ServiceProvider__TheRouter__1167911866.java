package p000a;

import android.content.Context;
import androidx.annotation.Keep;
import nc.Digraph;
import p217l2.InterfaceC5345f;
import p217l2.InterfaceC5347h;
import p217l2.InterfaceC5348i;
import p217l2.InterfaceC5349j;
import p288pc.InterfaceC6255b;
import p319rd.AbstractC6572a;

@Keep
/* loaded from: classes.dex */
public class ServiceProvider__TheRouter__1167911866 implements InterfaceC6255b {
    public static final String FLOW_TASK_JSON = "{}";
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void addFlowTask(Context context, Digraph digraph) {
    }

    @Override // p288pc.InterfaceC6255b
    public <T> T interception(Class<T> cls, Object... objArr) {
        if (InterfaceC5345f.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC6572a.m25652a();
        }
        if (InterfaceC5347h.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC6572a.m25653b();
        }
        if (InterfaceC5348i.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC6572a.m25654c();
        }
        if (InterfaceC5349j.class.equals(cls) && objArr.length == 0) {
            return (T) AbstractC6572a.m25655d();
        }
        return null;
    }
}
