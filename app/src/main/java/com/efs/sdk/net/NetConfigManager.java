package com.efs.sdk.net;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import java.util.Random;

/* loaded from: classes.dex */
public class NetConfigManager {

    /* renamed from: c */
    private EfsReporter f7309c;

    /* renamed from: d */
    private int f7310d;

    /* renamed from: e */
    private int f7311e;

    /* renamed from: f */
    private int f7312f;

    /* renamed from: g */
    private int f7313g;

    /* renamed from: h */
    private int f7314h;

    /* renamed from: i */
    private int f7315i;

    /* renamed from: j */
    private boolean f7316j;

    /* renamed from: k */
    private Context f7317k;

    /* renamed from: l */
    private int f7318l;

    /* renamed from: a */
    private final String f7307a = "NetConfigManager";

    /* renamed from: b */
    private final int f7308b = 0;

    /* renamed from: m */
    private boolean f7319m = false;

    /* JADX WARN: Removed duplicated region for block: B:15:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NetConfigManager(android.content.Context r20, com.efs.sdk.base.EfsReporter r21) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.NetConfigManager.<init>(android.content.Context, com.efs.sdk.base.EfsReporter):void");
    }

    public boolean enableTracer() {
        return this.f7316j;
    }

    public int getDataRate() {
        return this.f7315i;
    }

    public int getDayLimit() {
        return this.f7314h;
    }

    public int getExtraRateFlag() {
        return this.f7318l;
    }

    public boolean getNetRequestBodyCollectState() {
        return this.f7319m;
    }

    public void setNetRequestBodyCollectState(boolean z10) {
        this.f7319m = z10;
    }

    /* renamed from: a */
    private static boolean m7820a(int i10) {
        if (i10 == 0) {
            return false;
        }
        return i10 == 100 || new Random().nextInt(100) <= i10;
    }
}
