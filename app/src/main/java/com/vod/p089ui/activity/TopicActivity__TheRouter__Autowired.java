package com.vod.p089ui.activity;

import androidx.annotation.Keep;
import java.util.Iterator;
import mc.C5634i;
import p302qc.C6447b;
import tc.InterfaceC6931a;

@Keep
/* loaded from: classes3.dex */
public class TopicActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void autowiredInject(Object obj) {
        if (obj instanceof TopicActivity) {
            TopicActivity topicActivity = (TopicActivity) obj;
            Iterator it = C5634i.m22846h().iterator();
            while (it.hasNext()) {
                InterfaceC6931a interfaceC6931a = (InterfaceC6931a) it.next();
                try {
                    String str = (String) interfaceC6931a.mo26766a("java.lang.String", topicActivity, new C6447b("java.lang.String", "extra_play_entrance", 0, "", "com.vod.ui.activity.TopicActivity", "mPlayEntrance", false, "No desc."));
                    if (str != null) {
                        topicActivity.f17296K = str;
                    }
                } catch (Exception e10) {
                    if (C5634i.m22853o()) {
                        e10.printStackTrace();
                    }
                }
                try {
                    String str2 = (String) interfaceC6931a.mo26766a("java.lang.String", topicActivity, new C6447b("java.lang.String", "extra_topic_alias", 0, "", "com.vod.ui.activity.TopicActivity", "mTopicAlias", false, "No desc."));
                    if (str2 != null) {
                        topicActivity.f17292G = str2;
                    }
                } catch (Exception e11) {
                    if (C5634i.m22853o()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    String str3 = (String) interfaceC6931a.mo26766a("java.lang.String", topicActivity, new C6447b("java.lang.String", "extra_topic_background", 0, "", "com.vod.ui.activity.TopicActivity", "backgroundUrl", false, "No desc."));
                    if (str3 != null) {
                        topicActivity.f17294I = str3;
                    }
                } catch (Exception e12) {
                    if (C5634i.m22853o()) {
                        e12.printStackTrace();
                    }
                }
                try {
                    String str4 = (String) interfaceC6931a.mo26766a("java.lang.String", topicActivity, new C6447b("java.lang.String", "extra_topic_column_id", 0, "", "com.vod.ui.activity.TopicActivity", "columnId", false, "No desc."));
                    if (str4 != null) {
                        topicActivity.f17290E = str4;
                    }
                } catch (Exception e13) {
                    if (C5634i.m22853o()) {
                        e13.printStackTrace();
                    }
                }
                try {
                    String str5 = (String) interfaceC6931a.mo26766a("java.lang.String", topicActivity, new C6447b("java.lang.String", "extra_topic_name", 0, "", "com.vod.ui.activity.TopicActivity", "mTopicName", false, "No desc."));
                    if (str5 != null) {
                        topicActivity.f17291F = str5;
                    }
                } catch (Exception e14) {
                    if (C5634i.m22853o()) {
                        e14.printStackTrace();
                    }
                }
                try {
                    String str6 = (String) interfaceC6931a.mo26766a("java.lang.String", topicActivity, new C6447b("java.lang.String", "extra_topic_poster", 0, "", "com.vod.ui.activity.TopicActivity", "posterUrl", false, "No desc."));
                    if (str6 != null) {
                        topicActivity.f17293H = str6;
                    }
                } catch (Exception e15) {
                    if (C5634i.m22853o()) {
                        e15.printStackTrace();
                    }
                }
            }
        }
    }
}
