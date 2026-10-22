package com.efs.sdk.base.core.p055d;

import com.efs.sdk.base.core.config.GlobalInfo;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.p050a.C1666a;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.protocol.record.AbsRecordLog;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.efs.sdk.base.core.d.b */
/* loaded from: classes.dex */
public final class C1704b extends AbsRecordLog {

    /* renamed from: a */
    private String f7145a;

    /* renamed from: b */
    private String f7146b;

    /* renamed from: c */
    private String f7147c;

    /* renamed from: d */
    private String f7148d;

    /* renamed from: e */
    private long f7149e;

    /* renamed from: f */
    private long f7150f;

    public C1704b(String str, String str2, String str3) {
        super("wa");
        this.f7149e = 0L;
        this.f7150f = 0L;
        this.f7145a = str;
        this.f7146b = str2;
        this.f7148d = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CHINA);
        C1666a.m7610a();
        this.f7147c = simpleDateFormat.format(new Date(C1666a.m7613b()));
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final byte[] generate() {
        String generateString = generateString();
        if (ControllerCenter.getGlobalEnvStruct().isPrintLogDetail()) {
            Log.m7730i("efs.base", generateString);
        }
        return generateString.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String generateString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lt=event`");
        sb2.append("ev_ct=");
        sb2.append(this.f7145a);
        sb2.append("`");
        sb2.append("ev_ac=");
        sb2.append(this.f7146b);
        sb2.append("`");
        sb2.append("tm=");
        sb2.append(this.f7147c);
        sb2.append("`");
        sb2.append("dn=");
        sb2.append(this.f7148d);
        sb2.append("`");
        for (Map.Entry<String, Object> entry : this.dataMap.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(Operator.Operation.EQUALS);
            sb2.append(entry.getValue());
            sb2.append("`");
        }
        return sb2.subSequence(0, sb2.length() - 1).toString();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkId() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkKey() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final long getLogBeginTime() {
        return this.f7149e;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final long getLogEndTime() {
        return this.f7150f;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void insertGlobal(GlobalInfo globalInfo) {
        this.dataMap.putAll(globalInfo.getGlobalInfoMap());
        this.dataMap.putAll(ControllerCenter.getGlobalEnvStruct().getPublicParamMap());
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void setLogBeginTime(long j10) {
        this.f7149e = j10;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void setLogEndTime(long j10) {
        this.f7150f = j10;
    }
}
