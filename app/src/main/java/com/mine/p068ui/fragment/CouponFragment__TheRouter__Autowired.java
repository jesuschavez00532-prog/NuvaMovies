package com.mine.p068ui.fragment;

import androidx.annotation.Keep;
import java.util.Iterator;
import mc.C5634i;
import p251n9.C5783f;
import p302qc.C6447b;
import tc.InterfaceC6931a;

@Keep
/* loaded from: classes2.dex */
public class CouponFragment__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void autowiredInject(Object obj) {
        if (obj instanceof C5783f) {
            C5783f c5783f = (C5783f) obj;
            Iterator it = C5634i.m22846h().iterator();
            while (it.hasNext()) {
                InterfaceC6931a interfaceC6931a = (InterfaceC6931a) it.next();
                try {
                    Boolean bool = (Boolean) interfaceC6931a.mo26766a("boolean", c5783f, new C6447b("boolean", "isFromHome", 0, "", "com.mine.ui.fragment.CouponFragment", "isFromHome", false, "No desc."));
                    if (bool != null) {
                        c5783f.f23166D0 = bool.booleanValue();
                    }
                } catch (Exception e10) {
                    if (C5634i.m22853o()) {
                        e10.printStackTrace();
                    }
                }
                try {
                    String str = (String) interfaceC6931a.mo26766a("java.lang.String", c5783f, new C6447b("java.lang.String", "couponIdList", 0, "", "com.mine.ui.fragment.CouponFragment", "couponIdJson", false, "No desc."));
                    if (str != null) {
                        c5783f.f23165C0 = str;
                    }
                } catch (Exception e11) {
                    if (C5634i.m22853o()) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }
}
