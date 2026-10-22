package p000a;

import androidx.annotation.Keep;
import com.therouter.router.RouteItem;
import p302qc.AbstractC6455j;

@Keep
/* loaded from: classes.dex */
public class RouterMap__TheRouter__582089875 {
    public static final String ROUTERMAP = "[{\"path\":\"http://module_vod/VodDetailsActivity\",\"className\":\"com.vod.ui.activity.VodDetailsActivity\",\"action\":\"\",\"description\":\"\",\"params\":{}},{\"path\":\"http://module_vod/VodCategoryActivity\",\"className\":\"com.vod.ui.activity.VodCategoryActivity\",\"action\":\"\",\"description\":\"\",\"params\":{}},{\"path\":\"http://module_vod/TopicActivity\",\"className\":\"com.vod.ui.activity.TopicActivity\",\"action\":\"\",\"description\":\"\",\"params\":{}}]";
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void addRoute() {
        AbstractC6455j.m25284c(new RouteItem("http://module_vod/VodDetailsActivity", "com.vod.ui.activity.VodDetailsActivity", "", ""));
        AbstractC6455j.m25284c(new RouteItem("http://module_vod/VodCategoryActivity", "com.vod.ui.activity.VodCategoryActivity", "", ""));
        AbstractC6455j.m25284c(new RouteItem("http://module_vod/TopicActivity", "com.vod.ui.activity.TopicActivity", "", ""));
    }
}
