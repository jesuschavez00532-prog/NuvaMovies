package com.mine.ui.activity;

import androidx.annotation.Keep;
import java.util.Iterator;
import mc.C5634i;
import p302qc.C6447b;
import tc.InterfaceC6931a;

@Keep
/* loaded from: classes2.dex */
public class UserCenterActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void autowiredInject(Object obj) {
        if (obj instanceof UserCenterActivity) {
            UserCenterActivity userCenterActivity = (UserCenterActivity) obj;
            Iterator it = C5634i.m22846h().iterator();
            while (it.hasNext()) {
                InterfaceC6931a interfaceC6931a = (InterfaceC6931a) it.next();
                try {
                    Boolean bool = (Boolean) interfaceC6931a.mo26766a("boolean", userCenterActivity, new C6447b("boolean", "needPerformCrSwitch", 0, "", "com.mine.ui.activity.UserCenterActivity", "needPerformCrSwitch", false, "No desc."));
                    if (bool != null) {
                        userCenterActivity.f11732H = bool.booleanValue();
                    }
                } catch (Exception e10) {
                    if (C5634i.m22853o()) {
                        e10.printStackTrace();
                    }
                }
                try {
                    Integer num = (Integer) interfaceC6931a.mo26766a("int", userCenterActivity, new C6447b("int", "SELECTED_FRAGMENT_POSITION", 0, "", "com.mine.ui.activity.UserCenterActivity", "fragmentTabPosition", false, "No desc."));
                    if (num != null) {
                        userCenterActivity.f11734J = num.intValue();
                    }
                } catch (Exception e11) {
                    if (C5634i.m22853o()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    Integer num2 = (Integer) interfaceC6931a.mo26766a("int", userCenterActivity, new C6447b("int", "SELECTED_POSITION", 0, "", "com.mine.ui.activity.UserCenterActivity", "targetPosition", false, "No desc."));
                    if (num2 != null) {
                        userCenterActivity.f11733I = num2.intValue();
                    }
                } catch (Exception e12) {
                    if (C5634i.m22853o()) {
                        e12.printStackTrace();
                    }
                }
            }
        }
    }
}
