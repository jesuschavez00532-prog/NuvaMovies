package com.vod.p089ui.activity;

import androidx.annotation.Keep;
import java.util.Iterator;
import mc.C5634i;
import p302qc.C6447b;
import tc.InterfaceC6931a;

@Keep
/* loaded from: classes3.dex */
public class VodDetailsActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void autowiredInject(Object obj) {
        String str;
        String str2 = "int";
        if (obj instanceof VodDetailsActivity) {
            VodDetailsActivity vodDetailsActivity = (VodDetailsActivity) obj;
            Iterator it = C5634i.m22846h().iterator();
            while (it.hasNext()) {
                InterfaceC6931a interfaceC6931a = (InterfaceC6931a) it.next();
                try {
                    Boolean bool = (Boolean) interfaceC6931a.mo26766a("boolean", vodDetailsActivity, new C6447b("boolean", "extra_free", 0, "", "com.vod.ui.activity.VodDetailsActivity", "isFree", false, "No desc."));
                    if (bool != null) {
                        vodDetailsActivity.f17376L = bool.booleanValue();
                    }
                } catch (Exception e10) {
                    if (C5634i.m22853o()) {
                        e10.printStackTrace();
                    }
                }
                try {
                    Boolean bool2 = (Boolean) interfaceC6931a.mo26766a("boolean", vodDetailsActivity, new C6447b("boolean", "extra_restrict", 0, "", "com.vod.ui.activity.VodDetailsActivity", "isRestrict", false, "No desc."));
                    if (bool2 != null) {
                        vodDetailsActivity.f17375K = bool2.booleanValue();
                    }
                } catch (Exception e11) {
                    if (C5634i.m22853o()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    Boolean bool3 = (Boolean) interfaceC6931a.mo26766a("boolean", vodDetailsActivity, new C6447b("boolean", "extra_ts", 0, "", "com.vod.ui.activity.VodDetailsActivity", "mIsTs", false, "No desc."));
                    if (bool3 != null) {
                        vodDetailsActivity.f17391m0 = bool3.booleanValue();
                    }
                } catch (Exception e12) {
                    if (C5634i.m22853o()) {
                        e12.printStackTrace();
                    }
                }
                try {
                    Boolean bool4 = (Boolean) interfaceC6931a.mo26766a("boolean", vodDetailsActivity, new C6447b("boolean", "extra_voice", 0, "", "com.vod.ui.activity.VodDetailsActivity", "mIsFormVoice", false, "No desc."));
                    if (bool4 != null) {
                        vodDetailsActivity.f17384Z = bool4.booleanValue();
                    }
                } catch (Exception e13) {
                    if (C5634i.m22853o()) {
                        e13.printStackTrace();
                    }
                }
                try {
                    Integer num = (Integer) interfaceC6931a.mo26766a(str2, vodDetailsActivity, new C6447b("int", "extra_column_id", 0, "", "com.vod.ui.activity.VodDetailsActivity", "mColumnId", false, "No desc."));
                    if (num != null) {
                        vodDetailsActivity.f17372H = num.intValue();
                    }
                } catch (Exception e14) {
                    if (C5634i.m22853o()) {
                        e14.printStackTrace();
                    }
                }
                try {
                    Integer num2 = (Integer) interfaceC6931a.mo26766a(str2, vodDetailsActivity, new C6447b("int", "extra_itemPosition", 0, "", "com.vod.ui.activity.VodDetailsActivity", "voiceItemPosition", false, "No desc."));
                    if (num2 != null) {
                        vodDetailsActivity.f17386h0 = num2.intValue();
                    }
                } catch (Exception e15) {
                    if (C5634i.m22853o()) {
                        e15.printStackTrace();
                    }
                }
                try {
                    String str3 = (String) interfaceC6931a.mo26766a("java.lang.String", vodDetailsActivity, new C6447b("java.lang.String", "extra_content_id", 0, "", "com.vod.ui.activity.VodDetailsActivity", "mContentId", false, "No desc."));
                    if (str3 != null) {
                        vodDetailsActivity.f17370F = str3;
                    }
                } catch (Exception e16) {
                    if (C5634i.m22853o()) {
                        e16.printStackTrace();
                    }
                }
                try {
                    String str4 = (String) interfaceC6931a.mo26766a("java.lang.String", vodDetailsActivity, new C6447b("java.lang.String", "extra_play_entrance", 0, "", "com.vod.ui.activity.VodDetailsActivity", "mPlayEntrance", false, "No desc."));
                    if (str4 != null) {
                        vodDetailsActivity.f17379O = str4;
                    }
                } catch (Exception e17) {
                    if (C5634i.m22853o()) {
                        e17.printStackTrace();
                    }
                }
                try {
                    String str5 = (String) interfaceC6931a.mo26766a("java.lang.String", vodDetailsActivity, new C6447b("java.lang.String", "extra_play_type", 0, "", "com.vod.ui.activity.VodDetailsActivity", "mPlayType", false, "No desc."));
                    if (str5 != null) {
                        vodDetailsActivity.f17373I = str5;
                    }
                } catch (Exception e18) {
                    if (C5634i.m22853o()) {
                        e18.printStackTrace();
                    }
                }
                try {
                    String str6 = (String) interfaceC6931a.mo26766a("java.lang.String", vodDetailsActivity, new C6447b("java.lang.String", "extra_searchWord", 0, "", "com.vod.ui.activity.VodDetailsActivity", "voiceSearchWord", false, "No desc."));
                    if (str6 != null) {
                        vodDetailsActivity.f17387i0 = str6;
                    }
                } catch (Exception e19) {
                    if (C5634i.m22853o()) {
                        e19.printStackTrace();
                    }
                }
                try {
                    String str7 = (String) interfaceC6931a.mo26766a("java.lang.String", vodDetailsActivity, new C6447b("java.lang.String", "extra_title", 0, "", "com.vod.ui.activity.VodDetailsActivity", "voiceTitle", false, "No desc."));
                    if (str7 != null) {
                        vodDetailsActivity.f17388j0 = str7;
                    }
                } catch (Exception e20) {
                    if (C5634i.m22853o()) {
                        e20.printStackTrace();
                    }
                }
                try {
                    String str8 = (String) interfaceC6931a.mo26766a("java.lang.String", vodDetailsActivity, new C6447b("java.lang.String", "extra_type", 0, "", "com.vod.ui.activity.VodDetailsActivity", "mType", false, "No desc."));
                    if (str8 != null) {
                        vodDetailsActivity.f17371G = str8;
                    }
                } catch (Exception e21) {
                    if (C5634i.m22853o()) {
                        e21.printStackTrace();
                    }
                }
                try {
                    String str9 = (String) interfaceC6931a.mo26766a("java.lang.String", vodDetailsActivity, new C6447b("java.lang.String", "extra_umeng_event_category", 0, "", "com.vod.ui.activity.VodDetailsActivity", "mUmengEventCategory", false, "No desc."));
                    if (str9 != null) {
                        vodDetailsActivity.f17378N = str9;
                    }
                } catch (Exception e22) {
                    if (C5634i.m22853o()) {
                        e22.printStackTrace();
                    }
                }
                try {
                    String str10 = (String) interfaceC6931a.mo26766a("java.lang.String", vodDetailsActivity, new C6447b("java.lang.String", "extra_umeng_event_key", 0, "", "com.vod.ui.activity.VodDetailsActivity", "mUmengEventKey", false, "No desc."));
                    if (str10 != null) {
                        vodDetailsActivity.f17377M = str10;
                    }
                } catch (Exception e23) {
                    if (C5634i.m22853o()) {
                        e23.printStackTrace();
                    }
                }
                try {
                    str = str2;
                } catch (Exception e24) {
                    e = e24;
                    str = str2;
                }
                try {
                    Long l10 = (Long) interfaceC6931a.mo26766a("long", vodDetailsActivity, new C6447b("long", "extra_startTime", 0, "", "com.vod.ui.activity.VodDetailsActivity", "voiceStartTime", false, "No desc."));
                    if (l10 != null) {
                        vodDetailsActivity.f17385g0 = l10.longValue();
                    }
                } catch (Exception e25) {
                    e = e25;
                    if (C5634i.m22853o()) {
                        e.printStackTrace();
                    }
                    str2 = str;
                }
                str2 = str;
            }
        }
    }
}
