package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.antibrush.AntiBrush;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.flowcontrol.FlowControl;
import com.taobao.accs.net.AbstractC3156a;
import com.taobao.accs.net.C3166k;
import com.taobao.accs.p073ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p073ut.monitor.TrafficsMonitor;
import com.taobao.accs.p073ut.p074a.C3181a;
import com.taobao.accs.p073ut.p074a.C3182b;
import com.taobao.accs.p073ut.p074a.C3184d;
import com.taobao.accs.p073ut.p074a.C3185e;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3198k;
import com.taobao.accs.utl.C3203p;
import com.taobao.accs.utl.C3206s;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.message.common.inter.ITagManager;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.data.d */
/* loaded from: classes.dex */
public class C3139d {

    /* renamed from: b */
    public int f12925b;

    /* renamed from: c */
    protected TrafficsMonitor f12926c;

    /* renamed from: d */
    public FlowControl f12927d;

    /* renamed from: e */
    public AntiBrush f12928e;

    /* renamed from: i */
    private Context f12932i;

    /* renamed from: j */
    private C3184d f12933j;

    /* renamed from: k */
    private Message f12934k;

    /* renamed from: l */
    private AbstractC3156a f12935l;

    /* renamed from: m */
    private String f12936m;

    /* renamed from: g */
    private ConcurrentMap<Message.C3135Id, Message> f12930g = new ConcurrentHashMap();

    /* renamed from: a */
    public ConcurrentMap<String, ScheduledFuture<?>> f12924a = new ConcurrentHashMap();

    /* renamed from: h */
    private boolean f12931h = false;

    /* renamed from: f */
    public String f12929f = "";

    /* renamed from: n */
    private LinkedHashMap<String, String> f12937n = new LinkedHashMap<String, String>() { // from class: com.taobao.accs.data.MessageHandler$1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, String> entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: o */
    private Map<String, C3136a> f12938o = new HashMap();

    /* renamed from: p */
    private Runnable f12939p = new RunnableC3141f(this);

    public C3139d(Context context, AbstractC3156a abstractC3156a) {
        String str;
        this.f12936m = "MsgRecv_";
        this.f12932i = context;
        this.f12935l = abstractC3156a;
        this.f12926c = new TrafficsMonitor(context);
        this.f12927d = new FlowControl(this.f12932i);
        this.f12928e = new AntiBrush(this.f12932i);
        if (abstractC3156a == null) {
            str = this.f12936m;
        } else {
            str = this.f12936m + abstractC3156a.f12990m;
        }
        this.f12936m = str;
        m12776i();
        m12796h();
    }

    /* renamed from: b */
    private boolean m12772b(int i10) {
        return i10 == -1 || i10 == -9 || i10 == -10 || i10 == -11;
    }

    /* renamed from: i */
    private void m12776i() {
        try {
            File file = new File(this.f12932i.getDir("accs", 0), Constants.SHARED_MESSAGE_ID_FILE + this.f12935l.m12863i());
            if (!file.exists()) {
                ALog.m12938d(this.f12936m, "message file not exist", new Object[0]);
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    this.f12937n.put(readLine, readLine);
                } else {
                    bufferedReader.close();
                    return;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: j */
    private void m12777j() {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.f12932i.getDir("accs", 0), Constants.SHARED_MESSAGE_ID_FILE + this.f12935l.m12863i()));
            fileWriter.write("");
            Iterator<String> it = this.f12937n.keySet().iterator();
            while (it.hasNext()) {
                fileWriter.append((CharSequence) it.next()).append((CharSequence) "\r\n");
            }
            fileWriter.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m12786a(byte[] bArr) {
        m12787a(bArr, (String) null);
    }

    /* renamed from: c */
    public boolean m12791c() {
        return this.f12931h;
    }

    /* renamed from: d */
    public int m12792d() {
        return this.f12930g.size();
    }

    /* renamed from: e */
    public Collection<Message> m12793e() {
        return this.f12930g.values();
    }

    /* renamed from: f */
    public Set<Message.C3135Id> m12794f() {
        return this.f12930g.keySet();
    }

    /* renamed from: g */
    public C3184d m12795g() {
        return this.f12933j;
    }

    /* renamed from: h */
    public void m12796h() {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(this.f12939p);
        } catch (Throwable th) {
            ALog.m12939e(this.f12936m, "restoreTraffics", th, new Object[0]);
        }
    }

    /* renamed from: c */
    private boolean m12774c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f12937n.containsKey(str);
    }

    /* renamed from: d */
    private void m12775d(String str) {
        if (TextUtils.isEmpty(str) || this.f12937n.containsKey(str)) {
            return;
        }
        this.f12937n.put(str, str);
        m12777j();
    }

    /* renamed from: a */
    public void m12787a(byte[] bArr, String str) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m12941i(this.f12936m, "onMessage", "host", str);
        }
        C3206s c3206s = new C3206s(bArr);
        try {
            int m13029a = c3206s.m13029a();
            int i10 = (m13029a & 240) >> 4;
            ALog.Level level = ALog.Level.D;
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(this.f12936m, "version:" + i10, new Object[0]);
            }
            int i11 = m13029a & 15;
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(this.f12936m, "compress:" + i11, new Object[0]);
            }
            c3206s.m13029a();
            int m13031b = c3206s.m13031b();
            if (ALog.isPrintLog(level)) {
                ALog.m12938d(this.f12936m, "totalLen:" + m13031b, new Object[0]);
            }
            int i12 = 0;
            while (i12 < m13031b) {
                int m13031b2 = c3206s.m13031b();
                int i13 = i12 + 2;
                if (m13031b2 > 0) {
                    byte[] bArr2 = new byte[m13031b2];
                    c3206s.read(bArr2);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        ALog.m12938d(this.f12936m, "buf len:" + m13031b2, new Object[0]);
                    }
                    i12 = i13 + m13031b2;
                    m12763a(i11, bArr2, str, i10);
                } else {
                    throw new IOException("data format error");
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: b */
    public void m12789b() {
        ALog.m12938d(this.f12936m, "onRcvPing", new Object[0]);
        synchronized (C3139d.class) {
            this.f12931h = false;
        }
    }

    /* renamed from: c */
    private Intent m12773c(Message message) {
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(message.f12895m);
        intent.putExtra("command", message.command);
        intent.putExtra(Constants.KEY_SERVICE_ID, message.serviceId);
        intent.putExtra(Constants.KEY_USER_ID, message.userinfo);
        Integer num = message.command;
        if (num != null && num.intValue() == 100) {
            intent.putExtra(Constants.KEY_DATA_ID, message.cunstomDataId);
        }
        NetPerformanceMonitor netPerformanceMonitor = message.f12881G;
        if (netPerformanceMonitor != null) {
            intent.putExtra(Constants.KEY_MONIROT, netPerformanceMonitor);
        }
        return intent;
    }

    /* renamed from: b */
    public void m12790b(Message message) {
        if (this.f12930g.keySet().size() > 0) {
            Iterator<Message.C3135Id> it = this.f12930g.keySet().iterator();
            while (it.hasNext()) {
                Message message2 = this.f12930g.get(it.next());
                if (message2 != null && message2.command != null && message2.getPackageName().equals(message.getPackageName())) {
                    switch (message.command.intValue()) {
                        case 1:
                        case 2:
                            if (message2.command.intValue() == 1 || message2.command.intValue() == 2) {
                                message2.isCancel = true;
                                break;
                            }
                            break;
                        case 3:
                        case 4:
                            if (message2.command.intValue() == 3 || message2.command.intValue() == 4) {
                                message2.isCancel = true;
                                break;
                            }
                            break;
                        case 5:
                        case 6:
                            if (message2.command.intValue() == 5 || message2.command.intValue() == 6) {
                                message2.isCancel = true;
                                break;
                            }
                            break;
                    }
                }
                if (message2 != null && message2.isCancel) {
                    ALog.m12940e(this.f12936m, "cancelControlMessage", "command", message2.command);
                }
            }
        }
    }

    /* renamed from: b */
    public Message m12788b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12930g.remove(new Message.C3135Id(0, str));
    }

    /* renamed from: b */
    private void m12771b(Message message, int i10) {
        if (message == null) {
            return;
        }
        String m12986j = UtilityImpl.m12986j(this.f12932i);
        String str = System.currentTimeMillis() + "";
        boolean z10 = i10 == 200;
        int intValue = message.command.intValue();
        if (intValue == 1) {
            C3181a c3181a = new C3181a();
            c3181a.f13087a = m12986j;
            c3181a.f13088b = str;
            c3181a.f13089c = z10;
            c3181a.m12924a(i10);
            c3181a.m12923a();
            return;
        }
        if (intValue != 3) {
            return;
        }
        C3182b c3182b = new C3182b();
        c3182b.f13093a = m12986j;
        c3182b.f13094b = str;
        c3182b.f13095c = z10;
        c3182b.f13097e = message.userinfo;
        c3182b.m12928a(i10);
        c3182b.m12927a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:107|(1:109)(1:188)|110|(6:(2:112|(2:114|(8:116|117|(5:123|124|125|126|(1:128))|137|124|125|126|(0))(1:138)))(1:187)|173|174|175|176|(0)(0))|(2:140|(2:142|143)(2:144|(3:146|(1:148)|149)))(1:186)|150|(1:152)|153|154|155|156|(1:158)(2:183|(1:185))|159|(1:161)|162|(1:164)(1:182)|165|(1:167)(1:181)|168|(1:170)(1:180)|171|172) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0669, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x066a, code lost:
    
        r45 = r51;
        r1 = r13;
        r2 = r18;
        r6 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05f1 A[Catch: Exception -> 0x0669, TRY_LEAVE, TryCatch #3 {Exception -> 0x0669, blocks: (B:116:0x05f1, B:120:0x05fb, B:123:0x0602, B:124:0x0621, B:137:0x0613, B:155:0x046f, B:158:0x0479, B:159:0x04b8, B:161:0x04d0, B:162:0x04d6, B:164:0x04da, B:165:0x04e5, B:167:0x0535, B:168:0x0543, B:171:0x05a3, B:176:0x05e6, B:180:0x05a2, B:183:0x0495, B:185:0x049d), top: B:154:0x046f }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x065b A[Catch: Exception -> 0x069f, TryCatch #1 {Exception -> 0x069f, blocks: (B:126:0x064b, B:128:0x065b, B:189:0x0672), top: B:105:0x03d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.taobao.accs.utl.ALog$Level] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v82, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r47v0, types: [com.taobao.accs.data.d] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Map] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m12763a(int r48, byte[] r49, java.lang.String r50, int r51) {
        /*
            Method dump skipped, instructions count: 1839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C3139d.m12763a(int, byte[], java.lang.String, int):void");
    }

    /* renamed from: a */
    private byte[] m12769a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    gZIPInputStream.close();
                    byteArrayOutputStream.close();
                } catch (Exception unused) {
                }
                return byteArray;
            } catch (Exception e10) {
                ALog.m12940e(this.f12936m, "uncompress data error " + e10.toString(), new Object[0]);
                C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.f12925b + " uncompress data error " + e10.toString());
                try {
                    gZIPInputStream.close();
                    byteArrayOutputStream.close();
                } catch (Exception unused2) {
                }
                return null;
            }
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m12766a(Message message, byte[] bArr, byte[] bArr2, String str) {
        JSONArray jSONArray;
        int i10 = -8;
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m12938d(this.f12936m, "handleControlMessage parse", "json", jSONObject.toString());
                }
                i10 = message.command.intValue() == 100 ? 200 : jSONObject.getInt(Constants.KEY_HTTP_CODE);
                if (i10 == 200) {
                    int intValue = message.command.intValue();
                    if (intValue == 1) {
                        UtilityImpl.m12970c(Constants.SP_FILE_NAME, this.f12932i);
                        try {
                            this.f12935l.m12864j().m12738a(this.f12932i.getPackageName());
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            this.f12929f = C3203p.m13019a(jSONObject2, Constants.KEY_DEVICE_TOKEN, null);
                            if (jSONObject2 != null && (jSONArray = jSONObject2.getJSONArray(Constants.KEY_PACKAGE_NAMES)) != null) {
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    String string = jSONArray.getString(i11);
                                    if (UtilityImpl.m12963a(this.f12932i, string)) {
                                        this.f12935l.m12864j().m12738a(message.f12895m);
                                    } else {
                                        ALog.m12938d(this.f12936m, "unbind app", "pkg", string);
                                        AbstractC3156a abstractC3156a = this.f12935l;
                                        abstractC3156a.m12854b(Message.buildUnbindApp(abstractC3156a.mo12849b((String) null), string), true);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            ALog.m12941i(this.f12936m, "no token/invalid app", th);
                        }
                    } else if (intValue == 2) {
                        this.f12935l.m12864j().m12740b(message.f12895m);
                    } else if (intValue == 3) {
                        this.f12935l.m12864j().m12739a(message.f12895m, message.userinfo);
                    } else if (intValue != 4) {
                        if (intValue == 100 && (this.f12935l instanceof C3166k) && "4|sal|accs-iot".equals(message.f12891i)) {
                            ((C3166k) this.f12935l).m12890a(jSONObject);
                        }
                    } else {
                        this.f12935l.m12864j().m12744e(message.f12895m);
                    }
                } else if (message.command.intValue() == 3 && i10 == 300) {
                    this.f12935l.m12864j().m12740b(message.f12895m);
                }
            } catch (Throwable th2) {
                th = th2;
                ALog.m12939e(this.f12936m, "handleControlMessage", th, new Object[0]);
                C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "handleControlMessage", "", this.f12925b + th.toString());
                m12783a(message, i10, null, bArr, null);
                m12785a(new TrafficsMonitor.C3187a(message.serviceId, GlobalAppRuntimeInfo.isAppBackground(), str, bArr2.length));
            }
        } catch (Throwable th3) {
            th = th3;
        }
        m12783a(message, i10, null, bArr, null);
        m12785a(new TrafficsMonitor.C3187a(message.serviceId, GlobalAppRuntimeInfo.isAppBackground(), str, bArr2.length));
    }

    /* renamed from: a */
    private Map<Integer, String> m12762a(C3206s c3206s) {
        HashMap hashMap = null;
        if (c3206s == null) {
            return null;
        }
        try {
            int m13031b = c3206s.m13031b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m12938d(this.f12936m, "extHeaderLen:" + m13031b, new Object[0]);
            }
            int i10 = 0;
            while (i10 < m13031b) {
                int m13031b2 = c3206s.m13031b();
                int i11 = (64512 & m13031b2) >> 10;
                int i12 = m13031b2 & Message.EXT_HEADER_VALUE_MAX_LEN;
                String m13030a = c3206s.m13030a(i12);
                i10 = i10 + 2 + i12;
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(Integer.valueOf(i11), m13030a);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m12938d(this.f12936m, "", "extHeaderType", Integer.valueOf(i11), "value", m13030a);
                }
            }
        } catch (Exception e10) {
            ALog.m12939e(this.f12936m, "parseExtHeader", e10, new Object[0]);
        }
        return hashMap;
    }

    /* renamed from: a */
    public void m12782a(Message message, int i10) {
        m12783a(message, i10, null, null, null);
    }

    /* renamed from: a */
    public void m12784a(Message message, int i10, Map<Integer, String> map) {
        m12783a(message, i10, null, null, map);
    }

    /* renamed from: a */
    public void m12783a(Message message, int i10, Message.ReqType reqType, byte[] bArr, Map<Integer, String> map) {
        if (message.command != null && message.getType() >= 0 && message.getType() != 2) {
            String str = message.cunstomDataId;
            if (str != null) {
                this.f12924a.remove(str);
            }
            Message.ReqType reqType2 = null;
            if (this.f12928e.checkAntiBrush(message.host, map)) {
                i10 = ErrorCode.SERVIER_ANTI_BRUSH;
                reqType = null;
                bArr = null;
                map = null;
            }
            int m12811a = this.f12927d.m12811a(map, message.serviceId);
            if (m12811a != 0) {
                i10 = m12811a == 2 ? ErrorCode.SERVIER_HIGH_LIMIT : m12811a == 3 ? ErrorCode.SERVIER_HIGH_LIMIT_BRUSH : ErrorCode.SERVIER_LOW_LIMIT;
                bArr = null;
                map = null;
            } else {
                reqType2 = reqType;
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m12938d(this.f12936m, "onResult", "command", message.command, "erorcode", Integer.valueOf(i10));
            }
            if (message.command.intValue() == 102) {
                return;
            }
            if (!message.isCancel) {
                if (m12772b(i10) && message.command.intValue() != 100 && message.retryTimes <= Message.CONTROL_MAX_RETRY_TIMES) {
                    message.startSendTime = System.currentTimeMillis();
                    int i11 = message.retryTimes + 1;
                    message.retryTimes = i11;
                    ALog.m12938d(this.f12936m, "onResult", "retryTimes", Integer.valueOf(i11));
                    this.f12935l.m12854b(message, true);
                    m12765a(message, i10, true);
                } else {
                    m12765a(message, i10, false);
                    Intent m12773c = m12773c(message);
                    m12773c.putExtra(Constants.KEY_ERROR_CODE, i10);
                    Message.ReqType valueOf = Message.ReqType.valueOf((message.f12888f >> 13) & 3);
                    if (reqType2 == Message.ReqType.RES || valueOf == Message.ReqType.REQ) {
                        m12773c.putExtra(Constants.KEY_SEND_TYPE, Constants.SEND_TYPE_RES);
                    }
                    if (i10 == 200) {
                        m12773c.putExtra("data", bArr);
                    }
                    m12773c.putExtra(Constants.KEY_APP_KEY, this.f12935l.f12979b);
                    m12773c.putExtra(Constants.KEY_CONFIG_TAG, this.f12935l.f12990m);
                    m12768a(map, m12773c);
                    C3142g.m12797a().m12808b(this.f12932i, m12773c);
                    if (!TextUtils.isEmpty(message.serviceId)) {
                        UTMini.getInstance().commitEvent(66001, "MsgToBuss0", "commandId=" + message.command, "serviceId=" + message.serviceId + " errorCode=" + i10 + " dataId=" + message.dataId, Integer.valueOf(Constants.SDK_VERSION_CODE));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("1commandId=");
                        sb2.append(message.command);
                        sb2.append("serviceId=");
                        sb2.append(message.serviceId);
                        C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_TO_BUSS, sb2.toString(), 0.0d);
                    }
                }
            } else {
                ALog.m12940e(this.f12936m, "onResult message is cancel", "command", message.command);
                m12765a(message, i10, true);
            }
            m12771b(message, i10);
            return;
        }
        ALog.m12938d(this.f12936m, "onError, skip ping/ack", new Object[0]);
    }

    /* renamed from: a */
    private void m12765a(Message message, int i10, boolean z10) {
        boolean z11;
        try {
            NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
            if (netPermanceMonitor == null) {
                return;
            }
            netPermanceMonitor.onToBizDate();
            URL url = message.host;
            String url2 = url == null ? null : url.toString();
            if (i10 == 200) {
                if (message.retryTimes > 0) {
                    C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_RESEND, "succ", 0.0d);
                    C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_RESEND, "succ_" + message.retryTimes, 0.0d);
                } else {
                    C3198k.m13009a("accs", BaseMonitor.ALARM_POINT_REQUEST, url2);
                }
                z11 = true;
            } else {
                if (message.retryTimes > 0) {
                    C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_RESEND, "fail＿" + i10, 0.0d);
                    C3198k.m13010a("accs", BaseMonitor.COUNT_POINT_RESEND, ITagManager.FAIL, 0.0d);
                } else if (i10 != -13) {
                    C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_REQUEST, url2, UtilityImpl.m12952a(i10), this.f12925b + message.serviceId + message.timeout);
                }
                netPermanceMonitor.setFailReason(i10);
                z11 = false;
            }
            netPermanceMonitor.setRet(z11);
            if (z10) {
                if (message.isCancel) {
                    netPermanceMonitor.setRet(false);
                    netPermanceMonitor.setFailReason("msg cancel");
                }
                AppMonitor.getInstance().commitStat(message.getNetPermanceMonitor());
            }
        } catch (Throwable th) {
            ALog.m12939e(this.f12936m, "monitorPerf", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public void m12779a() {
        ALog.m12938d(this.f12936m, "onSendPing", new Object[0]);
        synchronized (C3139d.class) {
            this.f12931h = true;
        }
    }

    /* renamed from: a */
    public void m12781a(Message message) {
        String str;
        Message message2 = this.f12934k;
        if (message2 != null && (str = message.cunstomDataId) != null && message.serviceId != null && message2.cunstomDataId.equals(str) && this.f12934k.serviceId.equals(message.serviceId)) {
            UTMini.getInstance().commitEvent(66001, "SEND_REPEAT", message.serviceId, message.cunstomDataId, Long.valueOf(Thread.currentThread().getId()));
        }
        if (message.getType() == -1 || message.getType() == 2 || message.isAck) {
            return;
        }
        this.f12930g.put(message.getMsgId(), message);
    }

    /* renamed from: a */
    public void m12780a(int i10) {
        this.f12931h = false;
        Message.C3135Id[] c3135IdArr = (Message.C3135Id[]) this.f12930g.keySet().toArray(new Message.C3135Id[0]);
        if (c3135IdArr.length > 0) {
            ALog.m12938d(this.f12936m, "onNetworkFail", new Object[0]);
            for (Message.C3135Id c3135Id : c3135IdArr) {
                Message remove = this.f12930g.remove(c3135Id);
                if (remove != null) {
                    m12782a(remove, i10);
                }
            }
        }
    }

    /* renamed from: a */
    public Message m12778a(String str) {
        return this.f12930g.get(new Message.C3135Id(0, str));
    }

    /* renamed from: a */
    private byte[] m12770a(String str, Map<Integer, String> map, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    int parseInt = Integer.parseInt(map.get(17));
                    int parseInt2 = Integer.parseInt(map.get(16));
                    if (parseInt2 <= 1) {
                        throw new RuntimeException("burstNums <= 1");
                    }
                    if (parseInt >= 0 && parseInt < parseInt2) {
                        String str2 = map.get(18);
                        long j10 = 0;
                        try {
                            String str3 = map.get(15);
                            if (!TextUtils.isEmpty(str3)) {
                                j10 = Long.parseLong(str3);
                            }
                        } catch (Throwable th) {
                            ALog.m12943w(this.f12936m, "putBurstMessage", th, new Object[0]);
                        }
                        C3136a c3136a = this.f12938o.get(str);
                        if (c3136a == null) {
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.m12941i(this.f12936m, "putBurstMessage", Constants.KEY_DATA_ID, str, "burstLength", Integer.valueOf(parseInt2));
                            }
                            c3136a = new C3136a(str, parseInt2, str2);
                            c3136a.m12759a(j10);
                            this.f12938o.put(str, c3136a);
                        }
                        return c3136a.m12760a(parseInt, parseInt2, bArr);
                    }
                    throw new RuntimeException(String.format("burstNums:%s burstIndex:%s", Integer.valueOf(parseInt2), Integer.valueOf(parseInt)));
                }
            } catch (Throwable th2) {
                ALog.m12943w(this.f12936m, "putBurstMessage", th2, new Object[0]);
                return null;
            }
        }
        throw new RuntimeException("burstLength == 0");
    }

    /* renamed from: a */
    private void m12768a(Map<Integer, String> map, Intent intent) {
        if (map == null || intent == null) {
            return;
        }
        intent.putExtra(TaoBaseService.ExtraInfo.EXT_HEADER, (HashMap) map);
    }

    /* renamed from: a */
    private void m12764a(Intent intent, String str, String str2, short s10) {
        if (intent != null) {
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("source", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("target", str2);
            }
            intent.putExtra(Constants.KEY_FLAGS, s10);
        }
    }

    /* renamed from: a */
    private void m12767a(String str, String str2) {
        C3185e c3185e = new C3185e();
        c3185e.f13122a = UtilityImpl.m12986j(this.f12932i);
        c3185e.f13124c = str;
        c3185e.f13125d = "" + System.currentTimeMillis();
        c3185e.f13127f = "";
        c3185e.f13126e = str2;
        c3185e.f13123b = "";
        c3185e.m12932a();
    }

    /* renamed from: a */
    public void m12785a(TrafficsMonitor.C3187a c3187a) {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3140e(this, c3187a));
        } catch (Throwable th) {
            ALog.m12939e(this.f12936m, "addTrafficsInfo", th, new Object[0]);
        }
    }
}
