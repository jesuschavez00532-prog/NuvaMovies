package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.InterfaceC3505d;
import org.android.agoo.message.MessageService;

/* loaded from: classes3.dex */
public class Defcon implements InterfaceC3505d {
    private static final int LEVEL_0 = 0;
    private static final int LEVEL_1 = 1;
    private static final int LEVEL_2 = 2;
    private static final int LEVEL_3 = 3;
    private static final long MILLIS_24_HOURS = 86400000;
    private static final long MILLIS_4_HOURS = 14400000;
    private static final long MILLIS_8_HOURS = 28800000;
    private static Defcon instanse;
    private int mLevel = 0;

    private Defcon() {
    }

    public static synchronized Defcon getService(Context context) {
        Defcon defcon;
        synchronized (Defcon.class) {
            if (instanse == null) {
                instanse = new Defcon();
                instanse.setLevel(Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", MessageService.MSG_DB_READY_REPORT)).intValue());
            }
            defcon = instanse;
        }
        return defcon;
    }

    public int getLevel() {
        return this.mLevel;
    }

    public long getReqInterval() {
        int i10 = this.mLevel;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return 0L;
                }
                return 86400000L;
            }
            return MILLIS_8_HOURS;
        }
        return MILLIS_4_HOURS;
    }

    public long getRetryInterval() {
        if (this.mLevel == 0) {
            return 0L;
        }
        return 300000L;
    }

    public boolean isOpen() {
        if (this.mLevel != 0) {
            return true;
        }
        return false;
    }

    @Override // com.umeng.commonsdk.statistics.internal.InterfaceC3505d
    public void onImprintChanged(ImprintHandler.C3488a c3488a) {
        setLevel(Integer.valueOf(c3488a.m14863a("defcon", String.valueOf(0))).intValue());
    }

    public void setLevel(int i10) {
        if (i10 >= 0 && i10 <= 3) {
            this.mLevel = i10;
        }
    }
}
