package p000a;

import androidx.annotation.Keep;
import com.therouter.router.RouteItem;
import p302qc.AbstractC6455j;

@Keep
/* loaded from: classes.dex */
public class RouterMap__TheRouter__531996569 {
    public static final String ROUTERMAP = "[{\"path\":\"http://module_mine/UserCenterActivity\",\"className\":\"com.mine.ui.activity.UserCenterActivity\",\"action\":\"\",\"description\":\"\",\"params\":{}},{\"path\":\"http://module_mine/InviteFriendsActivity\",\"className\":\"com.mine.ui.activity.InviteFriendsActivity\",\"action\":\"\",\"description\":\"\",\"params\":{}}]";
    public static final String TAG = "Created by kymjs, and APT Version is 1.2.1.";
    public static final String THEROUTER_APT_VERSION = "1.2.1";

    public static void addRoute() {
        AbstractC6455j.m25284c(new RouteItem("http://module_mine/UserCenterActivity", "com.mine.ui.activity.UserCenterActivity", "", ""));
        AbstractC6455j.m25284c(new RouteItem("http://module_mine/InviteFriendsActivity", "com.mine.ui.activity.InviteFriendsActivity", "", ""));
    }
}
