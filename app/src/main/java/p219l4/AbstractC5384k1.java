package p219l4;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.bytes.C0905a;
import com.taobao.accs.common.Constants;

/* renamed from: l4.k1 */
/* loaded from: classes.dex */
public abstract class AbstractC5384k1 {

    /* renamed from: a */
    private static final Uri f22005a;

    /* renamed from: b */
    private static final Uri f22006b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f22005a = parse;
        f22006b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m21763a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    /* renamed from: b */
    public static Intent m21764b(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(C0905a.MAX_POOL_SIZE);
        return intent;
    }

    /* renamed from: c */
    public static Intent m21765c(String str) {
        Uri fromParts = Uri.fromParts(Constants.KEY_PACKAGE, "com.google.android.gms", null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}
