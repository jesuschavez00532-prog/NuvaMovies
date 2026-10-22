package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.net.AbstractC3156a;
import com.taobao.accs.p073ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.C3202o;
import com.taobao.accs.utl.C3203p;
import com.taobao.accs.utl.C3205r;
import com.taobao.accs.utl.UtilityImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;

/* loaded from: classes.dex */
public class Message implements Serializable {
    public static int CONTROL_MAX_RETRY_TIMES = 5;
    public static final int EXT_HEADER_VALUE_MAX_LEN = 1023;
    public static final int FLAG_ACK_TYPE = 32;
    public static final int FLAG_BIZ_RET = 64;
    public static final int FLAG_DATA_TYPE = 32768;
    public static final int FLAG_ERR = 4096;
    public static final int FLAG_REQ_BIT1 = 16384;
    public static final int FLAG_REQ_BIT2 = 8192;
    public static final int FLAG_RET = 2048;
    public static final String KEY_BINDAPP = "ctrl_bindapp";
    public static final String KEY_BINDSERVICE = "ctrl_bindservice";
    public static final String KEY_BINDUSER = "ctrl_binduser";
    public static final String KEY_UNBINDAPP = "ctrl_unbindapp";
    public static final String KEY_UNBINDSERVICE = "ctrl_unbindservice";
    public static final String KEY_UNBINDUSER = "ctrl_unbinduser";
    public static final int MAX_RETRY_TIMES = 3;

    /* renamed from: a */
    static long f12874a = 1;

    /* renamed from: D */
    byte[] f12878D;

    /* renamed from: E */
    int f12879E;

    /* renamed from: F */
    long f12880F;

    /* renamed from: G */
    transient NetPerformanceMonitor f12881G;

    /* renamed from: I */
    C3135Id f12883I;
    public String cunstomDataId;

    /* renamed from: d */
    short f12886d;
    public String dataId;

    /* renamed from: e */
    short f12887e;

    /* renamed from: f */
    short f12888f;

    /* renamed from: g */
    byte f12889g;

    /* renamed from: h */
    byte f12890h;
    public URL host;

    /* renamed from: i */
    String f12891i;

    /* renamed from: j */
    String f12892j;

    /* renamed from: l */
    Map<Integer, String> f12894l;
    public long startSendTime;
    public boolean isAck = false;
    public boolean force = false;
    public boolean isCancel = false;

    /* renamed from: b */
    byte f12884b = 0;

    /* renamed from: c */
    byte f12885c = 0;

    /* renamed from: k */
    int f12893k = -1;

    /* renamed from: m */
    String f12895m = null;
    public Integer command = null;

    /* renamed from: n */
    Integer f12896n = 0;

    /* renamed from: o */
    String f12897o = null;
    public String appSign = null;

    /* renamed from: p */
    Integer f12898p = null;

    /* renamed from: q */
    String f12899q = null;

    /* renamed from: r */
    String f12900r = null;

    /* renamed from: s */
    String f12901s = null;

    /* renamed from: t */
    String f12902t = null;

    /* renamed from: u */
    String f12903u = null;

    /* renamed from: v */
    Integer f12904v = null;

    /* renamed from: w */
    String f12905w = null;

    /* renamed from: x */
    String f12906x = null;
    public String userinfo = null;
    public String serviceId = null;

    /* renamed from: y */
    String f12907y = null;

    /* renamed from: z */
    String f12908z = null;

    /* renamed from: A */
    String f12875A = null;

    /* renamed from: B */
    String f12876B = null;

    /* renamed from: C */
    String f12877C = null;
    public long delyTime = 0;
    public int retryTimes = 0;
    public int timeout = AbstractC3156a.ACCS_RECEIVE_TIMEOUT;
    public String bizId = null;

    /* renamed from: H */
    String f12882H = null;

    /* renamed from: com.taobao.accs.data.Message$Id */
    /* loaded from: classes.dex */
    public static class C3135Id implements Serializable {

        /* renamed from: a */
        private int f12909a;

        /* renamed from: b */
        private String f12910b;

        public C3135Id(int i10, String str) {
            this.f12909a = i10;
            this.f12910b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3135Id c3135Id = (C3135Id) obj;
            if (this.f12909a == c3135Id.getId() || this.f12910b.equals(c3135Id.getDataId())) {
                return true;
            }
            return false;
        }

        public String getDataId() {
            return this.f12910b;
        }

        public int getId() {
            return this.f12909a;
        }

        public int hashCode() {
            return this.f12910b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class MsgResType implements Serializable {
        public static final int INVALID = -1;
        public static final int NEED_ACK = 1;
        public static final int NO_ACK = 0;

        public static String name(int i10) {
            return i10 != 0 ? i10 != 1 ? "INVALID" : "NEED_ACK" : "NO_ACK";
        }

        public static int valueOf(int i10) {
            return i10 != 0 ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public static class MsgType implements Serializable {
        public static final int CONTROL = 0;
        public static final int DATA = 1;
        public static final int HANDSHAKE = 3;
        public static final int INVALID = -1;
        public static final int PING = 2;

        public static String name(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "INVALID" : "HANDSHAKE" : "PING" : "DATA" : "CONTROL";
        }

        public static int valueOf(int i10) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    i11 = 3;
                    if (i10 != 3) {
                        return 0;
                    }
                }
            }
            return i11;
        }
    }

    /* loaded from: classes.dex */
    public enum ReqType {
        DATA,
        ACK,
        REQ,
        RES;

        public static ReqType valueOf(int i10) {
            if (i10 == 0) {
                return DATA;
            }
            if (i10 == 1) {
                return ACK;
            }
            if (i10 == 2) {
                return REQ;
            }
            if (i10 != 3) {
                return DATA;
            }
            return RES;
        }
    }

    private Message() {
        synchronized (Message.class) {
            this.startSendTime = System.currentTimeMillis();
            String str = this.startSendTime + "." + f12874a;
            this.dataId = str;
            long j10 = f12874a;
            f12874a = 1 + j10;
            this.f12883I = new C3135Id((int) j10, str);
        }
    }

    public static Message BuildPing(boolean z10, int i10) {
        Message message = new Message();
        message.f12893k = 2;
        message.command = 201;
        message.force = z10;
        message.delyTime = i10;
        return message;
    }

    public static Message buildBackground(String str) {
        Message message = new Message();
        message.m12745a(1, ReqType.DATA, 0);
        message.command = 100;
        message.f12891i = Constants.TARGET_BACK;
        m12747a(str, message);
        return message;
    }

    @Deprecated
    public static Message buildBindApp(AbstractC3156a abstractC3156a, Context context, Intent intent) {
        return buildBindApp(abstractC3156a.mo12849b((String) null), abstractC3156a.f12990m, context, intent);
    }

    @Deprecated
    public static Message buildBindService(AbstractC3156a abstractC3156a, Context context, Intent intent) {
        return buildBindService(abstractC3156a.mo12849b((String) null), abstractC3156a.f12990m, intent);
    }

    @Deprecated
    public static Message buildBindUser(AbstractC3156a abstractC3156a, Context context, Intent intent) {
        return buildBindUser(abstractC3156a.mo12849b((String) null), abstractC3156a.f12990m, intent);
    }

    public static Message buildErrorReportMessage(String str, String str2, String str3, int i10) {
        Message message = new Message();
        try {
            message.host = new URL(str3);
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
        }
        message.f12891i = Constants.TARGET_SERVICE_ST;
        message.m12745a(1, ReqType.DATA, 0);
        message.command = 100;
        message.f12878D = ("0|" + i10 + "|" + str + "|" + C3197j.m13007b(GlobalClientInfo.getContext()) + "|" + str2).getBytes();
        return message;
    }

    public static Message buildForeground(String str) {
        Message message = new Message();
        message.m12745a(1, ReqType.DATA, 0);
        message.command = 100;
        message.f12891i = Constants.TARGET_FORE;
        m12747a(str, message);
        return message;
    }

    public static Message buildHandshake(String str) {
        Message message = new Message();
        message.m12745a(3, ReqType.DATA, 1);
        message.f12895m = str;
        message.f12891i = Constants.TARGET_CONTROL;
        message.command = 200;
        return message;
    }

    public static Message buildParameterError(String str, int i10) {
        Message message = new Message();
        message.m12745a(1, ReqType.ACK, 0);
        message.command = Integer.valueOf(i10);
        message.f12895m = str;
        return message;
    }

    @Deprecated
    public static Message buildPushAck(AbstractC3156a abstractC3156a, String str, String str2, String str3, boolean z10, short s10, String str4, Map<Integer, String> map) {
        return buildPushAck(abstractC3156a.mo12849b((String) null), abstractC3156a.f12990m, str, str2, str3, z10, s10, str4, map);
    }

    @Deprecated
    public static Message buildRequest(AbstractC3156a abstractC3156a, Context context, String str, String str2, String str3, ACCSManager.AccsRequest accsRequest, boolean z10) {
        return buildRequest(context, abstractC3156a.mo12849b((String) null), abstractC3156a.f12990m, abstractC3156a.f12986i.getStoreId(), str, str2, accsRequest, z10);
    }

    @Deprecated
    public static Message buildSendData(AbstractC3156a abstractC3156a, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest) {
        return buildSendData(abstractC3156a.mo12849b((String) null), abstractC3156a.f12990m, abstractC3156a.f12986i.getStoreId(), context, str, accsRequest, true);
    }

    @Deprecated
    public static Message buildUnbindApp(AbstractC3156a abstractC3156a, Context context, Intent intent) {
        return buildUnbindApp(abstractC3156a.mo12849b((String) null), intent);
    }

    @Deprecated
    public static Message buildUnbindService(AbstractC3156a abstractC3156a, Context context, Intent intent) {
        return buildUnbindService(abstractC3156a.mo12849b((String) null), abstractC3156a.f12990m, intent);
    }

    @Deprecated
    public static Message buildUnbindUser(AbstractC3156a abstractC3156a, Context context, Intent intent) {
        return buildUnbindUser(abstractC3156a.mo12849b((String) null), abstractC3156a.f12990m, intent);
    }

    /* renamed from: c */
    private String m12750c() {
        return "Msg_" + this.f12882H;
    }

    /* renamed from: a */
    short m12751a(Map<Integer, String> map) {
        short s10 = 0;
        if (map != null) {
            try {
                Iterator<Integer> it = map.keySet().iterator();
                while (it.hasNext()) {
                    String str = map.get(Integer.valueOf(it.next().intValue()));
                    if (!TextUtils.isEmpty(str)) {
                        s10 = (short) (s10 + ((short) (str.getBytes("utf-8").length & EXT_HEADER_VALUE_MAX_LEN)) + 2);
                    }
                }
            } catch (Exception e10) {
                e10.toString();
            }
        }
        return s10;
    }

    /* renamed from: b */
    void m12753b() {
        Integer num;
        Integer num2 = this.command;
        if (num2 != null && num2.intValue() != 100 && this.command.intValue() != 102) {
            C3203p.a aVar = new C3203p.a();
            if (this.command.intValue() == 100) {
                num = null;
            } else {
                num = this.command;
            }
            this.f12878D = aVar.m13020a("command", num).m13022a(Constants.KEY_APP_KEY, this.f12897o).m13020a(Constants.KEY_OS_TYPE, this.f12898p).m13022a("sign", this.appSign).m13020a(Constants.KEY_SDK_VERSION, this.f12904v).m13022a("appVersion", this.f12903u).m13022a(Constants.KEY_TTID, this.f12905w).m13022a(Constants.KEY_MODEL, this.f12907y).m13022a(Constants.KEY_BRAND, this.f12908z).m13022a(Constants.KEY_IMEI, this.f12875A).m13022a(Constants.KEY_IMSI, this.f12876B).m13022a(Constants.KYE_MAC_ADDRESS, this.f12906x).m13022a("os", this.f12899q).m13022a(Constants.KEY_EXTS, this.f12902t).m13023a().toString().getBytes("utf-8");
        }
    }

    public byte[] build(Context context, int i10) {
        String str;
        byte[] bytes;
        int length;
        try {
            m12753b();
        } catch (UnsupportedEncodingException e10) {
            ALog.m12939e(m12750c(), "build2", e10, new Object[0]);
        } catch (JSONException e11) {
            ALog.m12939e(m12750c(), "build1", e11, new Object[0]);
        }
        byte[] bArr = this.f12878D;
        if (bArr == null) {
            str = "";
        } else {
            str = new String(bArr);
        }
        m12752a();
        if (!this.isAck) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(UtilityImpl.m12986j(context));
            sb2.append("|");
            sb2.append(this.f12895m);
            sb2.append("|");
            String str2 = this.serviceId;
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append("|");
            String str3 = this.userinfo;
            if (str3 == null) {
                str3 = "";
            }
            sb2.append(str3);
            this.f12892j = sb2.toString();
        }
        try {
            bytes = (this.dataId + "").getBytes("utf-8");
            this.f12890h = (byte) this.f12892j.getBytes("utf-8").length;
            this.f12889g = (byte) this.f12891i.getBytes("utf-8").length;
        } catch (Exception e12) {
            e12.printStackTrace();
            ALog.m12939e(m12750c(), "build3", e12, new Object[0]);
            bytes = (this.dataId + "").getBytes();
            this.f12890h = (byte) this.f12892j.getBytes().length;
            this.f12889g = (byte) this.f12891i.getBytes().length;
        }
        short m12751a = m12751a(this.f12894l);
        int length2 = this.f12889g + 3 + 1 + this.f12890h + 1 + bytes.length;
        byte[] bArr2 = this.f12878D;
        if (bArr2 == null) {
            length = 0;
        } else {
            length = bArr2.length;
        }
        short s10 = (short) (length2 + length + m12751a + 2);
        this.f12887e = s10;
        this.f12886d = (short) (s10 + 2);
        C3205r c3205r = new C3205r(this.f12886d + 2 + 4);
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level)) {
            ALog.m12938d(m12750c(), "Build Message", Constants.KEY_DATA_ID, new String(bytes));
        }
        try {
            c3205r.m13027a((byte) (this.f12884b | 32));
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\tversion:2 compress:" + ((int) this.f12884b), new Object[0]);
            }
            if (i10 == 0) {
                c3205r.m13027a(Byte.MIN_VALUE);
                if (ALog.isPrintLog(level)) {
                    ALog.m12938d(m12750c(), "\tflag: 0x80", new Object[0]);
                }
            } else {
                c3205r.m13027a((byte) 64);
                if (ALog.isPrintLog(level)) {
                    ALog.m12938d(m12750c(), "\tflag: 0x40", new Object[0]);
                }
            }
            c3205r.m13028a(this.f12886d);
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\ttotalLength:" + ((int) this.f12886d), new Object[0]);
            }
            c3205r.m13028a(this.f12887e);
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\tdataLength:" + ((int) this.f12887e), new Object[0]);
            }
            c3205r.m13028a(this.f12888f);
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\tflags:" + Integer.toHexString(this.f12888f), new Object[0]);
            }
            c3205r.m13027a(this.f12889g);
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\ttargetLength:" + ((int) this.f12889g), new Object[0]);
            }
            c3205r.write(this.f12891i.getBytes("utf-8"));
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\ttarget:" + this.f12891i, new Object[0]);
            }
            c3205r.m13027a(this.f12890h);
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\tsourceLength:" + ((int) this.f12890h), new Object[0]);
            }
            c3205r.write(this.f12892j.getBytes("utf-8"));
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\tsource:" + this.f12892j, new Object[0]);
            }
            c3205r.m13027a((byte) bytes.length);
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\tdataIdLength:" + bytes.length, new Object[0]);
            }
            c3205r.write(bytes);
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\tdataId:" + new String(bytes), new Object[0]);
            }
            c3205r.m13028a(m12751a);
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(m12750c(), "\textHeader len:" + ((int) m12751a), new Object[0]);
            }
            Map<Integer, String> map = this.f12894l;
            if (map != null) {
                Iterator<Integer> it = map.keySet().iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    String str4 = this.f12894l.get(Integer.valueOf(intValue));
                    if (!TextUtils.isEmpty(str4)) {
                        c3205r.m13028a((short) ((((short) intValue) << 10) | ((short) (str4.getBytes("utf-8").length & EXT_HEADER_VALUE_MAX_LEN))));
                        c3205r.write(str4.getBytes("utf-8"));
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            ALog.m12938d(m12750c(), "\textHeader key:" + intValue + " value:" + str4, new Object[0]);
                        }
                    }
                }
            }
            byte[] bArr3 = this.f12878D;
            if (bArr3 != null) {
                c3205r.write(bArr3);
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m12938d(m12750c(), "\toriData:" + str, new Object[0]);
            }
            c3205r.flush();
        } catch (IOException e13) {
            ALog.m12939e(m12750c(), "build4", e13, new Object[0]);
        }
        byte[] byteArray = c3205r.toByteArray();
        try {
            c3205r.close();
        } catch (IOException e14) {
            ALog.m12939e(m12750c(), "build5", e14, new Object[0]);
        }
        return byteArray;
    }

    public String getDataId() {
        return this.dataId;
    }

    public long getDelyTime() {
        return this.delyTime;
    }

    public C3135Id getMsgId() {
        return this.f12883I;
    }

    public NetPerformanceMonitor getNetPermanceMonitor() {
        return this.f12881G;
    }

    public int getNode() {
        return this.f12879E;
    }

    public String getPackageName() {
        String str = this.f12895m;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int getRetryTimes() {
        return this.retryTimes;
    }

    public int getType() {
        return this.f12893k;
    }

    public boolean isControlFrame() {
        return Constants.TARGET_CONTROL.equals(this.f12891i);
    }

    public boolean isTimeOut() {
        boolean z10;
        if ((System.currentTimeMillis() - this.startSendTime) + this.delyTime >= this.timeout) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ALog.m12940e(m12750c(), "delay time:" + this.delyTime + " beforeSendTime:" + (System.currentTimeMillis() - this.startSendTime) + " timeout" + this.timeout, new Object[0]);
        }
        return z10;
    }

    public void setSendTime(long j10) {
        this.f12880F = j10;
    }

    public static Message buildBindApp(String str, String str2, Context context, Intent intent) {
        Message message = null;
        try {
            message = buildBindApp(context, str2, intent.getStringExtra(Constants.KEY_APP_KEY), intent.getStringExtra("app_sercet"), intent.getStringExtra(Constants.KEY_PACKAGE_NAME), intent.getStringExtra(Constants.KEY_TTID), intent.getStringExtra("appVersion"));
            m12747a(str, message);
            return message;
        } catch (Exception e10) {
            ALog.m12940e("Msg", "buildBindApp", e10.getMessage());
            return message;
        }
    }

    public static Message buildBindService(String str, String str2, Intent intent) {
        Message message = null;
        try {
            message = buildBindService(intent.getStringExtra(Constants.KEY_PACKAGE_NAME), intent.getStringExtra(Constants.KEY_SERVICE_ID));
            message.f12882H = str2;
            m12747a(str, message);
            return message;
        } catch (Exception e10) {
            ALog.m12939e("Msg", "buildBindService", e10, new Object[0]);
            e10.printStackTrace();
            return message;
        }
    }

    public static Message buildBindUser(String str, String str2, Intent intent) {
        Message message = null;
        try {
            message = buildBindUser(intent.getStringExtra(Constants.KEY_PACKAGE_NAME), intent.getStringExtra(Constants.KEY_USER_ID));
            if (message != null) {
                message.f12882H = str2;
                m12747a(str, message);
            }
        } catch (Exception e10) {
            ALog.m12939e("Msg", "buildBindUser", e10, new Object[0]);
            e10.printStackTrace();
        }
        return message;
    }

    public static Message buildPushAck(String str, String str2, String str3, String str4, String str5, boolean z10, short s10, String str6, Map<Integer, String> map) {
        Message message = new Message();
        message.f12879E = 1;
        message.m12749a(s10, z10);
        message.f12892j = str3;
        message.f12891i = str4;
        message.dataId = str5;
        message.isAck = true;
        message.f12894l = map;
        try {
            try {
                if (TextUtils.isEmpty(str6)) {
                    message.host = new URL(str);
                } else {
                    message.host = new URL(str6);
                }
                message.f12882H = str2;
                if (message.host == null) {
                    message.host = new URL(str);
                }
            } catch (Throwable th) {
                try {
                    ALog.m12939e("Msg", "buildPushAck", th, new Object[0]);
                    if (message.host == null) {
                        message.host = new URL(str);
                    }
                } catch (Throwable th2) {
                    if (message.host == null) {
                        try {
                            message.host = new URL(str);
                        } catch (MalformedURLException e10) {
                            e10.printStackTrace();
                        }
                    }
                    throw th2;
                }
            }
        } catch (MalformedURLException e11) {
            e11.printStackTrace();
        }
        return message;
    }

    public static Message buildRequest(Context context, String str, String str2, String str3, String str4, String str5, ACCSManager.AccsRequest accsRequest, boolean z10) {
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.f12879E = 1;
        message.m12745a(1, ReqType.REQ, 1);
        message.command = 100;
        message.f12895m = str4;
        message.serviceId = accsRequest.serviceId;
        message.userinfo = accsRequest.userId;
        message.f12878D = accsRequest.data;
        String str6 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str5);
        sb2.append(str6);
        sb2.append("|");
        String str7 = accsRequest.target;
        if (str7 == null) {
            str7 = "";
        }
        sb2.append(str7);
        message.f12891i = sb2.toString();
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            accsRequest.dataId = message.getMsgId().getDataId();
        }
        message.cunstomDataId = accsRequest.dataId;
        message.bizId = accsRequest.businessId;
        message.f12882H = str2;
        int i10 = accsRequest.timeout;
        if (i10 > 0) {
            message.timeout = i10;
        }
        if (z10) {
            m12748a(str, message, accsRequest);
        } else {
            message.host = accsRequest.host;
        }
        m12746a(message, GlobalClientInfo.getInstance(context).getSid(str2), GlobalClientInfo.getInstance(context).getUserId(str2), str3, GlobalClientInfo.f12845c, accsRequest.businessId, accsRequest.tag);
        NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
        message.f12881G = netPerformanceMonitor;
        netPerformanceMonitor.setDataId(accsRequest.dataId);
        message.f12881G.setServiceId(accsRequest.serviceId);
        message.f12881G.setHost(message.host.toString());
        message.f12882H = str2;
        return message;
    }

    @Deprecated
    public static Message buildSendData(AbstractC3156a abstractC3156a, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest, boolean z10) {
        return buildSendData(abstractC3156a.mo12849b((String) null), abstractC3156a.f12990m, abstractC3156a.f12986i.getStoreId(), context, str, accsRequest, z10);
    }

    public static Message buildUnbindApp(String str, Intent intent) {
        ALog.m12940e("Msg", "buildUnbindApp1" + UtilityImpl.m12956a(new Exception()), new Object[0]);
        Message message = null;
        try {
            message = buildUnbindApp(str, intent.getStringExtra(Constants.KEY_PACKAGE_NAME));
            m12747a(str, message);
            return message;
        } catch (Exception e10) {
            ALog.m12940e("Msg", "buildUnbindApp1", e10.getMessage());
            return message;
        }
    }

    public static Message buildUnbindService(String str, String str2, Intent intent) {
        Message message = null;
        try {
            message = buildUnbindService(intent.getStringExtra(Constants.KEY_PACKAGE_NAME), intent.getStringExtra(Constants.KEY_SERVICE_ID));
            message.f12882H = str2;
            m12747a(str, message);
            return message;
        } catch (Exception e10) {
            ALog.m12939e("Msg", "buildUnbindService", e10, new Object[0]);
            e10.printStackTrace();
            return message;
        }
    }

    public static Message buildUnbindUser(String str, String str2, Intent intent) {
        Message message = null;
        try {
            message = buildUnbindUser(intent.getStringExtra(Constants.KEY_PACKAGE_NAME));
            message.f12882H = str2;
            m12747a(str, message);
            return message;
        } catch (Exception e10) {
            ALog.m12939e("Msg", "buildUnbindUser", e10, new Object[0]);
            e10.printStackTrace();
            return message;
        }
    }

    public static Message buildSendData(String str, String str2, String str3, Context context, String str4, ACCSManager.AccsRequest accsRequest) {
        return buildSendData(str, str2, str3, context, str4, accsRequest, true);
    }

    public static Message buildSendData(String str, String str2, String str3, Context context, String str4, ACCSManager.AccsRequest accsRequest, boolean z10) {
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.f12879E = 1;
        message.m12745a(1, ReqType.DATA, 1);
        message.command = 100;
        message.f12895m = str4;
        message.serviceId = accsRequest.serviceId;
        message.userinfo = accsRequest.userId;
        message.f12878D = accsRequest.data;
        String str5 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Constants.TARGET_SERVICE_PRE);
        sb2.append(str5);
        sb2.append("|");
        String str6 = accsRequest.target;
        if (str6 == null) {
            str6 = "";
        }
        sb2.append(str6);
        message.f12891i = sb2.toString();
        if (TextUtils.isEmpty(accsRequest.dataId)) {
            accsRequest.dataId = message.getMsgId().getDataId();
        }
        message.cunstomDataId = accsRequest.dataId;
        message.bizId = accsRequest.businessId;
        int i10 = accsRequest.timeout;
        if (i10 > 0) {
            message.timeout = i10;
        }
        if (z10) {
            m12748a(str, message, accsRequest);
        } else {
            message.host = accsRequest.host;
        }
        m12746a(message, GlobalClientInfo.getInstance(context).getSid(str2), GlobalClientInfo.getInstance(context).getUserId(str2), str3, GlobalClientInfo.f12845c, accsRequest.businessId, accsRequest.tag);
        NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
        message.f12881G = netPerformanceMonitor;
        netPerformanceMonitor.setMsgType(0);
        message.f12881G.setDataId(accsRequest.dataId);
        message.f12881G.setServiceId(accsRequest.serviceId);
        message.f12881G.setHost(message.host.toString());
        message.f12882H = str2;
        return message;
    }

    /* renamed from: a */
    void m12752a() {
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            try {
            } catch (Throwable th2) {
                gZIPOutputStream = null;
                th = th2;
                byteArrayOutputStream = null;
            }
            if (this.f12878D == null) {
                return;
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f12878D);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray != null && byteArray.length < this.f12878D.length) {
                        this.f12878D = byteArray;
                        this.f12884b = (byte) 1;
                    }
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        Log.e(m12750c(), th.toString());
                        th.printStackTrace();
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        if (byteArrayOutputStream == null) {
                            return;
                        }
                        byteArrayOutputStream.close();
                    } catch (Throwable th4) {
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Exception unused) {
                                throw th4;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                gZIPOutputStream = null;
                th = th5;
            }
            byteArrayOutputStream.close();
        } catch (Exception unused2) {
        }
    }

    @Deprecated
    public static Message buildUnbindApp(AbstractC3156a abstractC3156a, Context context, String str, String str2, String str3, String str4) {
        return buildUnbindApp(abstractC3156a.mo12849b((String) null), str);
    }

    public static Message buildUnbindApp(String str, String str2) {
        Message message = null;
        try {
            ALog.m12938d("Msg", "buildUnbindApp", new Object[0]);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            Message message2 = new Message();
            try {
                message2.f12879E = 1;
                message2.m12745a(1, ReqType.DATA, 1);
                message2.f12895m = str2;
                message2.f12891i = Constants.TARGET_CONTROL;
                message2.command = 2;
                message2.f12895m = str2;
                message2.f12904v = Integer.valueOf(Constants.SDK_VERSION_CODE);
                message2.cunstomDataId = KEY_UNBINDAPP;
                m12747a(str, message2);
                return message2;
            } catch (Exception e10) {
                e = e10;
                message = message2;
                ALog.m12940e("Msg", "buildUnbindApp", e.getMessage());
                return message;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Deprecated
    public static Message buildUnbindUser(Context context, String str, String str2, String str3, String str4, String str5) {
        return buildUnbindUser(str);
    }

    @Deprecated
    public static Message buildBindService(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        return buildBindService(str, str3);
    }

    @Deprecated
    public static Message buildBindUser(Context context, String str, String str2, String str3, String str4, String str5) {
        return buildBindUser(str, str4);
    }

    @Deprecated
    public static Message buildUnbindService(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        return buildUnbindService(str, str3);
    }

    public static Message buildUnbindUser(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.f12879E = 1;
        message.m12745a(1, ReqType.DATA, 1);
        message.f12895m = str;
        message.f12891i = Constants.TARGET_CONTROL;
        message.command = 4;
        message.f12904v = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.cunstomDataId = KEY_UNBINDUSER;
        return message;
    }

    @Deprecated
    public static Message buildBindApp(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return buildBindApp(context, str, str2, str3, str4, str5, str6);
    }

    public static Message buildBindService(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f12879E = 1;
        message.m12745a(1, ReqType.DATA, 1);
        message.f12895m = str;
        message.serviceId = str2;
        message.f12891i = Constants.TARGET_CONTROL;
        message.command = 5;
        message.f12895m = str;
        message.serviceId = str2;
        message.f12904v = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.cunstomDataId = KEY_BINDSERVICE;
        return message;
    }

    public static Message buildBindUser(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f12879E = 1;
        message.m12745a(1, ReqType.DATA, 1);
        message.f12895m = str;
        message.userinfo = str2;
        message.f12891i = Constants.TARGET_CONTROL;
        message.command = 3;
        message.f12895m = str;
        message.userinfo = str2;
        message.f12904v = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.cunstomDataId = KEY_BINDUSER;
        return message;
    }

    public static Message buildUnbindService(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f12879E = 1;
        message.m12745a(1, ReqType.DATA, 1);
        message.f12895m = str;
        message.serviceId = str2;
        message.f12891i = Constants.TARGET_CONTROL;
        message.command = 6;
        message.f12895m = str;
        message.serviceId = str2;
        message.f12904v = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.cunstomDataId = KEY_UNBINDSERVICE;
        return message;
    }

    public static Message buildBindApp(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.f12879E = 1;
        message.m12745a(1, ReqType.DATA, 1);
        message.f12898p = 1;
        message.f12899q = Build.VERSION.SDK_INT + "";
        message.f12895m = str4;
        message.f12891i = Constants.TARGET_CONTROL;
        message.command = 1;
        message.f12897o = str2;
        message.appSign = UtilityImpl.m12955a(str2, str3, UtilityImpl.m12986j(context));
        message.f12904v = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f12903u = str6;
        message.f12895m = str4;
        message.f12905w = str5;
        message.f12907y = Build.MODEL;
        message.f12908z = Build.BRAND;
        message.cunstomDataId = KEY_BINDAPP;
        message.f12882H = str;
        C3203p.a aVar = new C3203p.a();
        aVar.m13022a("notifyEnable", UtilityImpl.m12993o(context));
        aVar.m13022a("romInfo", new C3202o().mo13018a());
        message.f12902t = aVar.m13023a().toString();
        UtilityImpl.m12960a(context, Constants.SP_FILE_NAME, UtilityImpl.m12993o(context));
        return message;
    }

    /* renamed from: a */
    private static void m12748a(String str, Message message, ACCSManager.AccsRequest accsRequest) {
        URL url = accsRequest.host;
        if (url == null) {
            try {
                message.host = new URL(str);
                return;
            } catch (MalformedURLException e10) {
                ALog.m12939e("Msg", "setUnit", e10, new Object[0]);
                e10.printStackTrace();
                return;
            }
        }
        message.host = url;
    }

    /* renamed from: a */
    private static void m12747a(String str, Message message) {
        try {
            message.host = new URL(str);
        } catch (Exception e10) {
            ALog.m12939e("Msg", "setControlHost", e10, new Object[0]);
        }
    }

    /* renamed from: a */
    private static void m12746a(Message message, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str6) && str4 == null) {
            return;
        }
        message.f12894l = new HashMap();
        if (str5 != null && UtilityImpl.m12951a(str5) <= 1023) {
            message.f12894l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_BUSINESS.ordinal()), str5);
        }
        if (str != null && UtilityImpl.m12951a(str) <= 1023) {
            message.f12894l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_SID.ordinal()), str);
        }
        if (str2 != null && UtilityImpl.m12951a(str2) <= 1023) {
            message.f12894l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_USERID.ordinal()), str2);
        }
        if (str6 != null && UtilityImpl.m12951a(str6) <= 1023) {
            message.f12894l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_TAG.ordinal()), str6);
        }
        if (str4 != null && UtilityImpl.m12951a(str4) <= 1023) {
            message.f12894l.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_COOKIE.ordinal()), str4);
        }
        if (str3 == null || UtilityImpl.m12951a(str3) > 1023) {
            return;
        }
        message.f12894l.put(19, str3);
    }

    /* renamed from: a */
    private void m12745a(int i10, ReqType reqType, int i11) {
        this.f12893k = i10;
        if (i10 != 2) {
            this.f12888f = (short) (((((i10 & 1) << 4) | (reqType.ordinal() << 2)) | i11) << 11);
        }
    }

    /* renamed from: a */
    private void m12749a(short s10, boolean z10) {
        this.f12893k = 1;
        short s11 = (short) (((short) (((short) (((short) (s10 & (-16385))) | 8192)) & (-2049))) & (-65));
        this.f12888f = s11;
        if (z10) {
            this.f12888f = (short) (s11 | 32);
        }
    }
}
