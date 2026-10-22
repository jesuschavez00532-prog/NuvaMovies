package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UInAppMessage;

/* loaded from: classes3.dex */
public class UmengInAppClickHandler implements UInAppHandler {

    /* renamed from: a */
    private static final String f15838a = "com.umeng.message.inapp.UmengInAppClickHandler";

    /* renamed from: b */
    private String f15839b = null;

    /* renamed from: c */
    private String f15840c = null;

    /* renamed from: d */
    private String f15841d = null;

    @Override // com.umeng.message.inapp.UInAppHandler
    public final void handleInAppMessage(Activity activity, UInAppMessage uInAppMessage, int i10) {
        switch (i10) {
            case 16:
                this.f15839b = uInAppMessage.action_type;
                this.f15840c = uInAppMessage.action_activity;
                this.f15841d = uInAppMessage.action_url;
                break;
            case 17:
                this.f15839b = uInAppMessage.bottom_action_type;
                this.f15840c = uInAppMessage.bottom_action_activity;
                this.f15841d = uInAppMessage.bottom_action_url;
                break;
            case 18:
                this.f15839b = uInAppMessage.plainTextActionType;
                this.f15840c = uInAppMessage.plainTextActivity;
                this.f15841d = uInAppMessage.plainTextUrl;
                break;
            case 19:
                this.f15839b = uInAppMessage.customButtonActionType;
                this.f15840c = uInAppMessage.customButtonActivity;
                this.f15841d = uInAppMessage.customButtonUrl;
                break;
        }
        if (!TextUtils.isEmpty(this.f15839b)) {
            if (TextUtils.equals("go_activity", this.f15839b)) {
                openActivity(activity, this.f15840c);
            } else if (TextUtils.equals("go_url", this.f15839b)) {
                openUrl(activity, this.f15841d);
            } else {
                TextUtils.equals("go_app", this.f15839b);
            }
        }
    }

    public void openActivity(Activity activity, String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str.trim())) {
                    UMLog.mutlInfo(f15838a, 2, "打开Activity: ".concat(str));
                    Intent intent = new Intent();
                    intent.setClassName(activity, str);
                    intent.setFlags(536870912);
                    activity.startActivity(intent);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void openUrl(Activity activity, String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str.trim())) {
                    UMLog.mutlInfo(f15838a, 2, "打开链接: ".concat(str));
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
