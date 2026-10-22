package com.qiniu.android.dns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.qiniu.android.dns.C3063a;
import com.umeng.analytics.pro.C3309bd;
import java.util.Locale;
import p210kb.C5140a;

/* loaded from: classes2.dex */
public final class NetworkReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final Uri f12566a = Uri.parse("content://telephony/carriers/preferapn");

    /* renamed from: b */
    private static C5140a f12567b;

    /* renamed from: a */
    public static C3063a m12634a(NetworkInfo networkInfo, Context context) {
        C3063a.a aVar;
        String extraInfo;
        if (networkInfo == null) {
            return C3063a.f12568c;
        }
        int i10 = 0;
        if (networkInfo.getType() == 1) {
            aVar = C3063a.a.WIFI;
        } else {
            C3063a.a aVar2 = C3063a.a.MOBILE;
            Cursor query = context.getContentResolver().query(f12566a, null, null, null, null);
            if (query != null) {
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(C3309bd.f14106m));
                if (!TextUtils.isEmpty(string) && (string.startsWith("ctwap") || string.startsWith("ctnet"))) {
                    i10 = 1;
                }
            }
            query.close();
            if (i10 != 1 && (extraInfo = networkInfo.getExtraInfo()) != null) {
                String lowerCase = extraInfo.toLowerCase(Locale.getDefault());
                if (!lowerCase.equals("cmwap") && !lowerCase.equals("cmnet")) {
                    if (lowerCase.equals("3gnet") || lowerCase.equals("uninet") || lowerCase.equals("3gwap") || lowerCase.equals("uniwap")) {
                        i10 = 2;
                    }
                } else {
                    i10 = 3;
                }
            }
            aVar = aVar2;
        }
        return new C3063a(aVar, i10);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (f12567b == null) {
            return;
        }
        f12567b.m20801d(m12634a(((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo(), context));
    }
}
