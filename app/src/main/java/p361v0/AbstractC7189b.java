package p361v0;

import android.text.TextUtils;
import com.advertlib.bean.AdInfo;
import ne.AbstractC5868k;

/* renamed from: v0.b */
/* loaded from: classes.dex */
public abstract class AbstractC7189b {
    /* renamed from: a */
    public static final String m27820a(AdInfo adInfo) {
        AbstractC5868k.m23674f(adInfo, "<this>");
        if (!TextUtils.equals(adInfo.getAction_type(), "1") && !TextUtils.equals(adInfo.getAction_type(), "toPurchase")) {
            return "";
        }
        return adInfo.getAction();
    }
}
