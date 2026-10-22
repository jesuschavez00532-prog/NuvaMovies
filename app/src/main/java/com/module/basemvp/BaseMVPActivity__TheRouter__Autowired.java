package com.module.basemvp;

import androidx.annotation.Keep;
import java.util.Iterator;
import mc.C5634i;
import p302qc.C6447b;
import tc.InterfaceC6931a;

@Keep
/* loaded from: classes2.dex */
public class BaseMVPActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void autowiredInject(Object obj) {
        if (obj instanceof AbstractActivityC2972a) {
            AbstractActivityC2972a abstractActivityC2972a = (AbstractActivityC2972a) obj;
            Iterator it = C5634i.m22846h().iterator();
            while (it.hasNext()) {
                try {
                    Boolean bool = (Boolean) ((InterfaceC6931a) it.next()).mo26766a("boolean", abstractActivityC2972a, new C6447b("boolean", "extra_from_router", 0, "", "com.module.basemvp.BaseMVPActivity", "isFromRouter", false, "No desc."));
                    if (bool != null) {
                        abstractActivityC2972a.f12044B = bool.booleanValue();
                    }
                } catch (Exception e10) {
                    if (C5634i.m22853o()) {
                        e10.printStackTrace();
                    }
                }
            }
        }
    }
}
