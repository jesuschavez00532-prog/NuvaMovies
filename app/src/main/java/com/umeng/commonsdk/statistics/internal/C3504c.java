package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.lzy.okgo.model.HttpHeaders;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3330by;
import com.umeng.analytics.pro.C3335cc;
import com.umeng.analytics.pro.C3392n;
import com.umeng.analytics.pro.C3395q;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3452a;
import com.umeng.commonsdk.internal.C3453b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.C3482b;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.C3520d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: com.umeng.commonsdk.statistics.internal.c */
/* loaded from: classes3.dex */
public class C3504c {

    /* renamed from: e */
    private static boolean f15490e;

    /* renamed from: f */
    private static boolean f15491f;

    /* renamed from: g */
    private static boolean f15492g;

    /* renamed from: a */
    private String f15493a = "10.0.0.172";

    /* renamed from: b */
    private int f15494b = 80;

    /* renamed from: c */
    private Context f15495c;

    /* renamed from: d */
    private InterfaceC3503b f15496d;

    public C3504c(Context context) {
        this.f15495c = context;
    }

    /* renamed from: b */
    private void m14911b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f15495c, "domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f15495c, "domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        String imprintProperty3 = UMEnvelopeBuild.imprintProperty(this.f15495c, "oversea_domain_p", "");
        String imprintProperty4 = UMEnvelopeBuild.imprintProperty(this.f15495c, "oversea_domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty3)) {
            UMServerURL.OVERSEA_DEFAULT_URL = DataHelper.assembleURL(imprintProperty3);
        }
        if (!TextUtils.isEmpty(imprintProperty4)) {
            UMServerURL.OVERSEA_SECONDARY_URL = DataHelper.assembleURL(imprintProperty4);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.OVERSEA_DEFAULT_URL, UMServerURL.OVERSEA_SECONDARY_URL};
        if (TextUtils.isEmpty(C3482b.f15389b)) {
            return;
        }
        if (C3482b.f15389b.startsWith("460") || C3482b.f15389b.startsWith("461")) {
            AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
        }
    }

    /* renamed from: c */
    private void m14913c() {
        if (f15492g) {
            return;
        }
        ImprintHandler.getImprintService(this.f15495c).registImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, new UMImprintChangeCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.1
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                if (FieldManager.m14543b()) {
                    FieldManager.m14542a().m14545a(C3504c.this.f15495c, str2);
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> apply imprint change and exit: key=" + str + "; value= " + str2);
                    UMWorkDispatch.sendEvent(C3504c.this.f15495c, C3452a.f15283w, C3453b.m14605a(C3504c.this.f15495c).m14606a(), null);
                }
            }
        });
        f15492g = true;
    }

    /* renamed from: d */
    private void m14915d() {
        if (!f15491f) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 注册零号报文 imprint 应答处理回调。");
            ImprintHandler.getImprintService(this.f15495c).registPreProcessCallback(AnalyticsConstants.ZERO_RESPONSE_FLAG, new UMImprintPreProcessCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.2
                @Override // com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback
                public boolean onPreProcessImprintKey(String str, String str2) {
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> onImprintValueChanged: key=" + str + "; value= " + str2);
                    FieldManager.m14542a().m14544a(C3504c.this.f15495c);
                    UMWorkDispatch.sendEvent(C3504c.this.f15495c, C3452a.f15279s, C3453b.m14605a(C3504c.this.f15495c).m14606a(), null);
                    ImprintHandler.getImprintService(C3504c.this.f15495c).m14855a(AnalyticsConstants.ZERO_RESPONSE_FLAG);
                    return true;
                }
            });
            ImprintHandler.getImprintService(this.f15495c).registImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, new UMImprintChangeCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.3
                @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                public void onImprintValueChanged(String str, String str2) {
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> first onImprintValueChanged: key=" + str + "; value= " + str2);
                    FieldManager.m14542a().m14545a(C3504c.this.f15495c, str2);
                    UMWorkDispatch.sendEvent(C3504c.this.f15495c, C3452a.f15279s, C3453b.m14605a(C3504c.this.f15495c).m14606a(), null);
                    if (FieldManager.allow(C3520d.f15634E)) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> recv zcfg response: foregound count timer enabled.");
                        if (!UMWorkDispatch.eventHasExist()) {
                            UMWorkDispatch.sendEventEx(C3504c.this.f15495c, C3395q.a.f14854E, CoreProtocol.getInstance(C3504c.this.f15495c), null, 0L);
                        }
                    }
                    if (FieldManager.allow(C3520d.f15635F)) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> recv zcfg response: FirstResumeTrigger enabled.");
                        C3392n.m14299a(C3504c.this.f15495c).m14319b(C3504c.this.f15495c);
                    }
                    ImprintHandler.getImprintService(C3504c.this.f15495c).unregistImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, this);
                }
            });
            f15491f = true;
        }
    }

    /* renamed from: a */
    public void m14916a(InterfaceC3503b interfaceC3503b) {
        this.f15496d = interfaceC3503b;
    }

    /* renamed from: a */
    private void m14910a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f15495c, "domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f15495c, "domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
    }

    /* renamed from: c */
    private byte[] m14914c(byte[] bArr, String str) {
        if (C3330by.m13997a().m14003b()) {
            return m14917a(bArr, str.replace("ulogs", "cnlogs"));
        }
        return m14917a(bArr, str);
    }

    /* renamed from: a */
    public byte[] m14918a(byte[] bArr, boolean z10, boolean z11, String str) {
        if (SdkVersion.SDK_TYPE == 0) {
            m14910a();
        } else {
            UMServerURL.DEFAULT_URL = UMServerURL.OVERSEA_DEFAULT_URL;
            UMServerURL.SECONDARY_URL = UMServerURL.OVERSEA_SECONDARY_URL;
            m14911b();
        }
        byte[] bArr2 = null;
        int i10 = 0;
        while (true) {
            String[] strArr = AnalyticsConstants.APPLOG_URL_LIST;
            if (i10 >= strArr.length) {
                break;
            }
            String str2 = strArr[i10];
            if (z11) {
                m14915d();
            } else {
                m14913c();
            }
            String str3 = str2 + File.separator + str;
            if (SdkVersion.SDK_TYPE != 0) {
                bArr2 = m14917a(bArr, str3);
            } else if (i10 == 0) {
                bArr2 = m14912b(bArr, str3);
            } else {
                bArr2 = m14914c(bArr, str3);
            }
            if (bArr2 != null) {
                InterfaceC3503b interfaceC3503b = this.f15496d;
                if (interfaceC3503b != null) {
                    interfaceC3503b.onRequestSucceed(z10);
                }
            } else {
                InterfaceC3503b interfaceC3503b2 = this.f15496d;
                if (interfaceC3503b2 != null) {
                    interfaceC3503b2.onRequestFailed();
                }
                i10++;
            }
        }
        return bArr2;
    }

    /* renamed from: b */
    private byte[] m14912b(byte[] bArr, String str) {
        if (C3330by.m13997a().m14003b()) {
            if (!str.contains("preulogs")) {
                str = str.replace("ulogs", "cnlogs");
            }
            String m13999b = C3330by.m13999b(str);
            String m14021c = C3335cc.m14018b().m14021c();
            if (!TextUtils.isEmpty(m14021c)) {
                str = C3330by.m13998a(m14021c, m13999b);
            }
            byte[] m14917a = m14917a(bArr, str);
            if (m14917a != null) {
                return m14917a;
            }
            String m14002a = C3330by.m13997a().m14002a(m13999b);
            return (TextUtils.isEmpty(m14002a) || str.equalsIgnoreCase(m14002a)) ? m14917a : m14917a(bArr, m14002a);
        }
        return m14917a(bArr, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0181: IF  (r6 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:107:0x018d, block:B:106:0x0181 */
    /* renamed from: a */
    public byte[] m14917a(byte[] bArr, String str) {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "[有状态] 上报url: " + str);
        try {
            try {
                InterfaceC3503b interfaceC3503b = this.f15496d;
                if (interfaceC3503b != null) {
                    interfaceC3503b.onRequestStart();
                }
                httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                try {
                    boolean z10 = true;
                    if (!f15490e) {
                        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, new SecureRandom());
                        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                        f15490e = true;
                    }
                    httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                    httpsURLConnection.setRequestProperty("X-Umeng-Sdk", C3502a.m14898a(this.f15495c).m14903b());
                    httpsURLConnection.setRequestProperty("Content-Type", C3502a.m14898a(this.f15495c).m14901a());
                    httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                    httpsURLConnection.setRequestProperty("X-Umeng-Pro-Ver", "1.0.0");
                    httpsURLConnection.setRequestProperty("SM-IMP", "1");
                    httpsURLConnection.setRequestProperty(HttpHeaders.HEAD_KEY_USER_AGENT, DeviceConfig.getCustomAgt());
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(30000);
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setUseCaches(false);
                    outputStream = httpsURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArr);
                        outputStream.flush();
                        httpsURLConnection.connect();
                        InterfaceC3503b interfaceC3503b2 = this.f15496d;
                        if (interfaceC3503b2 != null) {
                            interfaceC3503b2.onRequestEnd();
                        }
                        int responseCode = httpsURLConnection.getResponseCode();
                        String headerField = httpsURLConnection.getHeaderField("Content-Type");
                        if (TextUtils.isEmpty(headerField) || !headerField.equalsIgnoreCase("application/thrift")) {
                            z10 = false;
                        }
                        String str2 = AnalyticsConstants.f15384OS;
                        if (responseCode == 200 && z10) {
                            InputStream inputStream = httpsURLConnection.getInputStream();
                            try {
                                byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                                try {
                                    outputStream.close();
                                } catch (Exception e10) {
                                    UMCrashManager.reportCrash(this.f15495c, e10);
                                }
                                try {
                                    httpsURLConnection.getInputStream().close();
                                } catch (IOException unused) {
                                }
                                httpsURLConnection.disconnect();
                                return readStreamToByteArray;
                            } finally {
                                HelperUtils.safeClose(inputStream);
                            }
                        }
                        try {
                            outputStream.close();
                        } catch (Exception e11) {
                            UMCrashManager.reportCrash(this.f15495c, e11);
                        }
                        try {
                            httpsURLConnection.getInputStream().close();
                        } catch (IOException unused2) {
                        }
                        httpsURLConnection.disconnect();
                        return null;
                    } catch (UnknownHostException unused3) {
                        UMLog.m14562aq("A_10200", 2, "\\|");
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e12) {
                                UMCrashManager.reportCrash(this.f15495c, e12);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused4) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    } catch (SSLHandshakeException unused5) {
                        UMLog.m14562aq("A_10201", 2, "\\|");
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e13) {
                                UMCrashManager.reportCrash(this.f15495c, e13);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused6) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    } catch (Throwable unused7) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e14) {
                                UMCrashManager.reportCrash(this.f15495c, e14);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused8) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    }
                } catch (UnknownHostException unused9) {
                    outputStream = null;
                } catch (SSLHandshakeException unused10) {
                    outputStream = null;
                } catch (Throwable unused11) {
                    outputStream = null;
                }
            } catch (Throwable th) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e15) {
                        UMCrashManager.reportCrash(this.f15495c, e15);
                    }
                }
                if (str != 0) {
                    try {
                        str.getInputStream().close();
                    } catch (IOException unused12) {
                    }
                    str.disconnect();
                    throw th;
                }
                throw th;
            }
        } catch (UnknownHostException unused13) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (SSLHandshakeException unused14) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (Throwable unused15) {
            httpsURLConnection = null;
            outputStream = null;
        }
    }
}
