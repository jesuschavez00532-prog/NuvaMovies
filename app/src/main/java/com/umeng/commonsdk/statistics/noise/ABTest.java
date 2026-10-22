package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.InterfaceC3505d;
import org.android.agoo.message.MessageService;

/* loaded from: classes3.dex */
public class ABTest implements InterfaceC3505d {
    private static ABTest instance;
    private Context context;
    private boolean isInTest = false;
    private int mPolicy = -1;
    private int mInterval = -1;
    private int mGroup = -1;
    private float mProb13 = 0.0f;
    private float mProb07 = 0.0f;
    private String mPoli = null;

    private ABTest(Context context, String str, int i10) {
        this.context = context;
        onExperimentChanged(str, i10);
    }

    public static synchronized ABTest getService(Context context) {
        ABTest aBTest;
        synchronized (ABTest.class) {
            if (instance == null) {
                instance = new ABTest(context, UMEnvelopeBuild.imprintProperty(context, "client_test", null), Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "test_report_interval", MessageService.MSG_DB_READY_REPORT)).intValue());
            }
            aBTest = instance;
        }
        return aBTest;
    }

    private void parseFIXED(String str) {
        float f10;
        int i10;
        int[] iArr;
        if (str == null) {
            return;
        }
        String[] split = str.split("\\|");
        if (split[2].equals("SIG13")) {
            f10 = Float.valueOf(split[3]).floatValue();
        } else {
            f10 = 0.0f;
        }
        if (this.mProb13 > f10) {
            this.isInTest = false;
            return;
        }
        if (split[0].equals("FIXED")) {
            i10 = Integer.valueOf(split[1]).intValue();
        } else {
            i10 = -1;
        }
        if (split[4].equals("RPT")) {
            this.mPoli = "RPT";
            String[] split2 = split[5].split(",");
            iArr = new int[split2.length];
            for (int i11 = 0; i11 < split2.length; i11++) {
                iArr[i11] = Integer.valueOf(split2[i11]).intValue();
            }
        } else {
            if (split[4].equals("DOM")) {
                this.mPoli = "DOM";
                this.isInTest = true;
                try {
                    String[] split3 = split[5].split(",");
                    iArr = new int[split3.length];
                    for (int i12 = 0; i12 < split3.length; i12++) {
                        try {
                            iArr[i12] = Integer.valueOf(split3[i12]).intValue();
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            iArr = null;
        }
        if (i10 != -1) {
            this.isInTest = true;
            this.mGroup = i10;
            if (iArr != null) {
                this.mPolicy = iArr[i10 - 1];
                return;
            }
            return;
        }
        this.isInTest = false;
    }

    private void parseSig7(String str) {
        float f10;
        float[] fArr;
        if (str == null) {
            return;
        }
        String[] split = str.split("\\|");
        float f11 = 0.0f;
        if (split[2].equals("SIG13")) {
            f10 = Float.valueOf(split[3]).floatValue();
        } else {
            f10 = 0.0f;
        }
        if (this.mProb13 > f10) {
            this.isInTest = false;
            return;
        }
        int[] iArr = null;
        if (split[0].equals("SIG7")) {
            String[] split2 = split[1].split(",");
            fArr = new float[split2.length];
            for (int i10 = 0; i10 < split2.length; i10++) {
                fArr[i10] = Float.valueOf(split2[i10]).floatValue();
            }
        } else {
            fArr = null;
        }
        if (split[4].equals("RPT")) {
            this.mPoli = "RPT";
            String[] split3 = split[5].split(",");
            iArr = new int[split3.length];
            for (int i11 = 0; i11 < split3.length; i11++) {
                iArr[i11] = Integer.valueOf(split3[i11]).intValue();
            }
        } else if (split[4].equals("DOM")) {
            this.isInTest = true;
            this.mPoli = "DOM";
            try {
                String[] split4 = split[5].split(",");
                iArr = new int[split4.length];
                for (int i12 = 0; i12 < split4.length; i12++) {
                    iArr[i12] = Integer.valueOf(split4[i12]).intValue();
                }
            } catch (Exception unused) {
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 < fArr.length) {
                f11 += fArr[i13];
                if (this.mProb07 < f11) {
                    break;
                } else {
                    i13++;
                }
            } else {
                i13 = -1;
                break;
            }
        }
        if (i13 != -1) {
            this.isInTest = true;
            this.mGroup = i13 + 1;
            if (iArr != null) {
                this.mPolicy = iArr[i13];
                return;
            }
            return;
        }
        this.isInTest = false;
    }

    private float prob(String str, int i10) {
        int i11 = i10 * 2;
        if (str == null) {
            return 0.0f;
        }
        return Integer.valueOf(str.substring(i11, i11 + 5), 16).intValue() / 1048576.0f;
    }

    public static boolean validate(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("\\|");
        if (split.length != 6) {
            return false;
        }
        if (split[0].startsWith("SIG7") && split[1].split(",").length == split[5].split(",").length) {
            return true;
        }
        if (split[0].startsWith("FIXED")) {
            int length = split[5].split(",").length;
            int parseInt = Integer.parseInt(split[1]);
            if (length >= parseInt && parseInt >= 1) {
                return true;
            }
        }
        return false;
    }

    public int getGroup() {
        return this.mGroup;
    }

    public String getGroupInfo() {
        if (!this.isInTest) {
            return "error";
        }
        return String.valueOf(this.mGroup);
    }

    public int getTestInterval() {
        return this.mInterval;
    }

    public String getTestName() {
        return this.mPoli;
    }

    public int getTestPolicy() {
        return this.mPolicy;
    }

    public boolean isInTest() {
        return this.isInTest;
    }

    public void onExperimentChanged(String str, int i10) {
        this.mInterval = i10;
        String signature = Envelope.getSignature(this.context);
        if (!TextUtils.isEmpty(signature) && !TextUtils.isEmpty(str)) {
            try {
                this.mProb13 = prob(signature, 12);
                this.mProb07 = prob(signature, 6);
                if (str.startsWith("SIG7")) {
                    parseSig7(str);
                } else if (str.startsWith("FIXED")) {
                    parseFIXED(str);
                }
                return;
            } catch (Exception e10) {
                this.isInTest = false;
                MLog.m14767e("v:" + str, e10);
                return;
            }
        }
        this.isInTest = false;
    }

    @Override // com.umeng.commonsdk.statistics.internal.InterfaceC3505d
    public void onImprintChanged(ImprintHandler.C3488a c3488a) {
        onExperimentChanged(c3488a.m14863a("client_test", null), Integer.valueOf(c3488a.m14863a("test_report_interval", MessageService.MSG_DB_READY_REPORT)).intValue());
    }

    public String toString() {
        return " p13:" + this.mProb13 + " p07:" + this.mProb07 + " policy:" + this.mPolicy + " interval:" + this.mInterval;
    }
}
