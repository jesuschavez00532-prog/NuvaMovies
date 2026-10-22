package com.vod.p089ui.activity;

import androidx.annotation.Keep;
import java.util.Iterator;
import mc.C5634i;
import p302qc.C6447b;
import tc.InterfaceC6931a;

@Keep
/* loaded from: classes3.dex */
public class VodCategoryActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void autowiredInject(Object obj) {
        if (obj instanceof VodCategoryActivity) {
            VodCategoryActivity vodCategoryActivity = (VodCategoryActivity) obj;
            Iterator it = C5634i.m22846h().iterator();
            while (it.hasNext()) {
                InterfaceC6931a interfaceC6931a = (InterfaceC6931a) it.next();
                try {
                    Boolean bool = (Boolean) interfaceC6931a.mo26766a("boolean", vodCategoryActivity, new C6447b("boolean", "extra_restrict", 0, "", "com.vod.ui.activity.VodCategoryActivity", "isRestrict", false, "No desc."));
                    if (bool != null) {
                        vodCategoryActivity.f17339j0 = bool.booleanValue();
                    }
                } catch (Exception e10) {
                    if (C5634i.m22853o()) {
                        e10.printStackTrace();
                    }
                }
                try {
                    Integer num = (Integer) interfaceC6931a.mo26766a("int", vodCategoryActivity, new C6447b("int", "extra_category_index", 0, "", "com.vod.ui.activity.VodCategoryActivity", "mCategoryIndex", false, "No desc."));
                    if (num != null) {
                        vodCategoryActivity.f17342m0 = num.intValue();
                    }
                } catch (Exception e11) {
                    if (C5634i.m22853o()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    Integer num2 = (Integer) interfaceC6931a.mo26766a("int", vodCategoryActivity, new C6447b("int", "extra_column_id", 0, "", "com.vod.ui.activity.VodCategoryActivity", "mColumnId", false, "No desc."));
                    if (num2 != null) {
                        vodCategoryActivity.f17325J = num2.intValue();
                    }
                } catch (Exception e12) {
                    if (C5634i.m22853o()) {
                        e12.printStackTrace();
                    }
                }
                try {
                    Integer num3 = (Integer) interfaceC6931a.mo26766a("int", vodCategoryActivity, new C6447b("int", "extra_parent_column_id", 0, "", "com.vod.ui.activity.VodCategoryActivity", "mParentColumnId", false, "No desc."));
                    if (num3 != null) {
                        vodCategoryActivity.f17349t0 = num3.intValue();
                    }
                } catch (Exception e13) {
                    if (C5634i.m22853o()) {
                        e13.printStackTrace();
                    }
                }
                try {
                    String str = (String) interfaceC6931a.mo26766a("java.lang.String", vodCategoryActivity, new C6447b("java.lang.String", "extra_category_selected_alias", 0, "", "com.vod.ui.activity.VodCategoryActivity", "mCategorySelectedAlias", false, "No desc."));
                    if (str != null) {
                        vodCategoryActivity.f17346q0 = str;
                    }
                } catch (Exception e14) {
                    if (C5634i.m22853o()) {
                        e14.printStackTrace();
                    }
                }
                try {
                    String str2 = (String) interfaceC6931a.mo26766a("java.lang.String", vodCategoryActivity, new C6447b("java.lang.String", "extra_category_type", 0, "", "com.vod.ui.activity.VodCategoryActivity", "vodType", false, "No desc."));
                    if (str2 != null) {
                        vodCategoryActivity.f17344o0 = str2;
                    }
                } catch (Exception e15) {
                    if (C5634i.m22853o()) {
                        e15.printStackTrace();
                    }
                }
                try {
                    String str3 = (String) interfaceC6931a.mo26766a("java.lang.String", vodCategoryActivity, new C6447b("java.lang.String", "extra_column_code", 0, "", "com.vod.ui.activity.VodCategoryActivity", "mColumnCode", false, "No desc."));
                    if (str3 != null) {
                        vodCategoryActivity.f17326K = str3;
                    }
                } catch (Exception e16) {
                    if (C5634i.m22853o()) {
                        e16.printStackTrace();
                    }
                }
                try {
                    String str4 = (String) interfaceC6931a.mo26766a("java.lang.String", vodCategoryActivity, new C6447b("java.lang.String", "extra_column_name", 0, "", "com.vod.ui.activity.VodCategoryActivity", "mColumnName", false, "No desc."));
                    if (str4 != null) {
                        vodCategoryActivity.f17327L = str4;
                    }
                } catch (Exception e17) {
                    if (C5634i.m22853o()) {
                        e17.printStackTrace();
                    }
                }
                try {
                    String str5 = (String) interfaceC6931a.mo26766a("java.lang.String", vodCategoryActivity, new C6447b("java.lang.String", "extra_play_entrance", 0, "", "com.vod.ui.activity.VodCategoryActivity", "mPlayEntrance", false, "No desc."));
                    if (str5 != null) {
                        vodCategoryActivity.f17343n0 = str5;
                    }
                } catch (Exception e18) {
                    if (C5634i.m22853o()) {
                        e18.printStackTrace();
                    }
                }
            }
        }
    }
}
