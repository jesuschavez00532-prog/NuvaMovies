package cc;

import android.app.ActivityManager;
import android.app.RecoverableSecurityException;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaDrm;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Base64;
import anet.channel.entity.EventType;
import be.C1328x;
import com.umeng.analytics.pro.C3329bx;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.NetworkInterface;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p170i2.C4842a;
import p185j2.C4982a;
import p201k2.AbstractC5093j;
import p201k2.C5090g;
import p201k2.C5096m;
import p287pb.AbstractApplicationC6253c;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p356ub.AbstractC7073a;
import p359ue.AbstractC7162p;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;

/* renamed from: cc.c0 */
/* loaded from: classes.dex */
public final class C1446c0 {

    /* renamed from: a */
    public static final C1446c0 f5559a = new C1446c0();

    /* renamed from: b */
    private static String f5560b = "";

    /* renamed from: c */
    private static String f5561c;

    /* renamed from: cc.c0$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Context f5562a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(1);
            this.f5562a = context;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (Build.VERSION.SDK_INT <= 29) {
                C1446c0 c1446c0 = C1446c0.f5559a;
                c1446c0.m6721P();
                c1446c0.m6722Q(this.f5562a);
            } else {
                C1446c0 c1446c02 = C1446c0.f5559a;
                c1446c02.m6720O(this.f5562a);
                c1446c02.m6722Q(this.f5562a);
            }
            return str;
        }
    }

    /* renamed from: cc.c0$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f5563a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m6754a(String str) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6754a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: cc.c0$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f5564a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m6755a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6755a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    private C1446c0() {
    }

    /* renamed from: A */
    private final String m6709A() {
        byte[] hardwareAddress;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            NetworkInterface byName = NetworkInterface.getByName("wlan0");
            if (byName == null || (hardwareAddress = byName.getHardwareAddress()) == null) {
                return "02:00:00:00:00:00";
            }
            for (byte b10 : hardwareAddress) {
                C5881x c5881x = C5881x.f23415a;
                String format = String.format("%02X:", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                AbstractC5868k.m23673e(format, "format(format, *args)");
                stringBuffer.append(format);
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            return stringBuffer.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:26:0x0004, B:7:0x0013, B:9:0x0023, B:15:0x0030, B:18:0x004a, B:20:0x0061, B:22:0x0065), top: B:25:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:26:0x0004, B:7:0x0013, B:9:0x0023, B:15:0x0030, B:18:0x004a, B:20:0x0061, B:22:0x0065), top: B:25:0x0004 }] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m6710B(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            if (r10 == 0) goto Lf
            int r2 = r10.length()     // Catch: java.lang.Exception -> Ld
            if (r2 != 0) goto Lb
            goto Lf
        Lb:
            r2 = 0
            goto L10
        Ld:
            r10 = move-exception
            goto L6f
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L13
            return r1
        L13:
            i2.a r2 = p170i2.C4842a.f20329a     // Catch: java.lang.Exception -> Ld
            i2.b r2 = r2.m19920a()     // Catch: java.lang.Exception -> Ld
            java.lang.String r2 = r2.mo19967p()     // Catch: java.lang.Exception -> Ld
            java.lang.String r3 = cc.AbstractC1459j.m6797b(r10, r2)     // Catch: java.lang.Exception -> Ld
            if (r3 == 0) goto L2c
            int r10 = r3.length()     // Catch: java.lang.Exception -> Ld
            if (r10 != 0) goto L2a
            goto L2c
        L2a:
            r10 = 0
            goto L2d
        L2c:
            r10 = 1
        L2d:
            if (r10 == 0) goto L30
            return r1
        L30:
            java.lang.String r10 = "decryptedSn"
            ne.AbstractC5868k.m23673e(r3, r10)     // Catch: java.lang.Exception -> Ld
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Exception -> Ld
            java.lang.String r10 = ","
            r4[r1] = r10     // Catch: java.lang.Exception -> Ld
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            java.util.List r10 = p359ue.AbstractC7157k.m27692R(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> Ld
            int r2 = r10.size()     // Catch: java.lang.Exception -> Ld
            if (r2 > r0) goto L4a
            return r1
        L4a:
            cc.m0 r2 = cc.C1466m0.f5627a     // Catch: java.lang.Exception -> Ld
            java.lang.Object r3 = r10.get(r1)     // Catch: java.lang.Exception -> Ld
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Ld
            r2.m6865f0(r3)     // Catch: java.lang.Exception -> Ld
            java.lang.String r3 = "02:00:00:00:00:00"
            java.lang.String r4 = r2.m6885t()     // Catch: java.lang.Exception -> Ld
            boolean r3 = ne.AbstractC5868k.m23669a(r3, r4)     // Catch: java.lang.Exception -> Ld
            if (r3 == 0) goto L65
            r9.m6740h()     // Catch: java.lang.Exception -> Ld
            return r0
        L65:
            java.lang.Object r10 = r10.get(r0)     // Catch: java.lang.Exception -> Ld
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> Ld
            r2.m6848U(r10)     // Catch: java.lang.Exception -> Ld
            return r0
        L6f:
            r10.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C1446c0.m6710B(java.lang.String):boolean");
    }

    /* renamed from: C */
    private final boolean m6711C(String str) {
        List list;
        boolean z10;
        if (str != null) {
            list = AbstractC7167u.m27748R(str, new String[]{","}, false, 0, 6, null);
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || TextUtils.isEmpty((CharSequence) list.get(0))) {
            return false;
        }
        C1466m0.f5627a.m6865f0((String) list.get(0));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m6712D(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C1446c0.m6712D(android.content.Context):java.lang.String");
    }

    /* renamed from: F */
    private final boolean m6713F(Context context) {
        C4982a c4982a = C4982a.f20721a;
        String str = AbstractC7073a.f26508c;
        AbstractC5868k.m23673e(str, "KEY_SP_SN");
        c4982a.m20335c(context, str, "");
        boolean m6738I = m6738I(context);
        if (Build.VERSION.SDK_INT <= 29) {
            if (m6738I) {
                m6721P();
                m6723R(context);
                return true;
            }
            if (m6715H()) {
                m6722Q(context);
                m6723R(context);
            }
            return true;
        }
        if (m6738I) {
            m6720O(context);
            m6723R(context);
            return true;
        }
        if (m6714G(context)) {
            m6722Q(context);
            m6723R(context);
            return true;
        }
        if (m6715H()) {
            m6720O(context);
            m6722Q(context);
            m6723R(context);
        }
        return true;
    }

    /* renamed from: G */
    private final boolean m6714G(Context context) {
        return m6710B(m6712D(context));
    }

    /* renamed from: H */
    private final boolean m6715H() {
        boolean z10;
        C5090g c5090g = C5090g.f20948a;
        String m20653t = c5090g.m20653t(c5090g.m20648m());
        String m20653t2 = c5090g.m20653t(c5090g.m20644i());
        C1466m0 c1466m0 = C1466m0.f5627a;
        c1466m0.m6848U(m20653t2);
        if (m20653t.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        c1466m0.m6865f0(m20653t);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m6716J(android.content.Context r7, java.lang.String r8, android.net.Uri r9, int r10) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C1446c0.m6716J(android.content.Context, java.lang.String, android.net.Uri, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final String m6717L(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (String) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m6718M(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m6719N(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final void m6720O(Context context) {
        String m27728o;
        String m27728o2;
        Cursor cursor = null;
        try {
            try {
                Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                String[] strArr = {C3329bx.f14344d, "_display_name", "title"};
                C4842a c4842a = C4842a.f20329a;
                String[] strArr2 = {'%' + Environment.DIRECTORY_ALARMS + '/' + c4842a.m19920a().mo19963l() + "/%", "%google%"};
                StringBuilder sb2 = new StringBuilder();
                C1466m0 c1466m0 = C1466m0.f5627a;
                sb2.append(c1466m0.m6885t());
                sb2.append(',');
                sb2.append(c1466m0.m6870i());
                sb2.append(",1");
                String m6799d = AbstractC1459j.m6799d(sb2.toString(), c4842a.m19920a().mo19967p());
                Cursor query = context.getContentResolver().query(uri, strArr, "relative_path LIKE ? AND title like ?", strArr2, "_id DESC");
                if (query != null) {
                    try {
                        try {
                            if (query.getCount() > 0) {
                                if (!query.moveToNext()) {
                                    query.close();
                                    return;
                                }
                                if (TextUtils.equals(m6799d, m6712D(context))) {
                                    query.close();
                                    return;
                                }
                                try {
                                    Uri withAppendedId = ContentUris.withAppendedId(uri, query.getInt(0));
                                    AbstractC5868k.m23673e(withAppendedId, "withAppendedId(uri, id.toLong())");
                                    context.getContentResolver().delete(withAppendedId, null);
                                    AbstractC5868k.m23673e(m6799d, "fileContent");
                                    AbstractC5868k.m23673e(uri, "uri");
                                    m6716J(context, m6799d, uri, 0);
                                } catch (RecoverableSecurityException e10) {
                                    e10.printStackTrace();
                                    String string = query.getString(1);
                                    AbstractC5868k.m23673e(string, "displayName");
                                    m27728o = AbstractC7166t.m27728o(string, ".wav", "", false, 4, null);
                                    m27728o2 = AbstractC7166t.m27728o(m27728o, "google", "", false, 4, null);
                                    int m25639i = AbstractC6567a.m25639i(m27728o2) + 1;
                                    AbstractC5868k.m23673e(m6799d, "fileContent");
                                    AbstractC5868k.m23673e(uri, "uri");
                                    m6716J(context, m6799d, uri, m25639i);
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                query.close();
                                return;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            cursor = query;
                            e.printStackTrace();
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                AbstractC5868k.m23673e(m6799d, "fileContent");
                AbstractC5868k.m23673e(uri, "uri");
                m6716J(context, m6799d, uri, 0);
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final void m6721P() {
        try {
            C5090g c5090g = C5090g.f20948a;
            String m20648m = c5090g.m20648m();
            C1466m0 c1466m0 = C1466m0.f5627a;
            c5090g.m20656x(m20648m, c1466m0.m6885t());
            c5090g.m20656x(c5090g.m20644i(), c1466m0.m6870i());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public final void m6722Q(Context context) {
        C4982a c4982a = C4982a.f20721a;
        String str = AbstractC7073a.f26507b;
        AbstractC5868k.m23673e(str, "SP_SN_BACKUP");
        StringBuilder sb2 = new StringBuilder();
        C1466m0 c1466m0 = C1466m0.f5627a;
        sb2.append(c1466m0.m6885t());
        sb2.append(",1");
        c4982a.m20335c(context, str, sb2.toString());
        c4982a.m20335c(context, C5090g.f20948a.m20644i(), c1466m0.m6870i());
    }

    /* renamed from: R */
    private final void m6723R(Context context) {
        C4982a c4982a = C4982a.f20721a;
        String str = AbstractC7073a.f26508c;
        AbstractC5868k.m23673e(str, "KEY_SP_SN");
        c4982a.m20335c(context, str, C1466m0.f5627a.m6885t());
    }

    /* renamed from: d */
    private final String m6727d(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            fileReader = new FileReader(str);
        } catch (Throwable unused) {
        }
        try {
            bufferedReader = new BufferedReader(fileReader, EventType.AUTH_FAIL);
            try {
                str2 = bufferedReader.readLine();
                try {
                    fileReader.close();
                } catch (Throwable unused2) {
                }
                bufferedReader.close();
                return str2;
            } catch (Throwable th) {
                th = th;
                try {
                    fileReader.close();
                } catch (Throwable unused3) {
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m6731i(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.lang.Process r7 = r2.exec(r7)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r7 != 0) goto L13
            java.lang.String r7 = ""
            return r7
        L13:
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L48
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L48
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L48
            r4 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L48
        L23:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 != 0) goto L32
            r2.close()
            if (r7 == 0) goto L5f
            r7.close()
            goto L5f
        L32:
            r0.append(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.lang.String r1 = "sb.append(line)"
            ne.AbstractC5868k.m23673e(r0, r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            goto L23
        L3b:
            r0 = move-exception
            r1 = r2
            goto L45
        L3e:
            r1 = move-exception
            r5 = r2
            r2 = r7
            r7 = r1
            r1 = r5
            goto L52
        L44:
            r0 = move-exception
        L45:
            r2 = r7
            r7 = r0
            goto L6a
        L48:
            r2 = move-exception
            r5 = r2
            r2 = r7
            r7 = r5
            goto L52
        L4d:
            r7 = move-exception
            r2 = r1
            goto L6a
        L50:
            r7 = move-exception
            r2 = r1
        L52:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L5a
            r1.close()
        L5a:
            if (r2 == 0) goto L5f
            r2.close()
        L5f:
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "sb.toString()"
            ne.AbstractC5868k.m23673e(r7, r0)
            return r7
        L69:
            r7 = move-exception
        L6a:
            if (r1 == 0) goto L6f
            r1.close()
        L6f:
            if (r2 == 0) goto L74
            r2.close()
        L74:
            goto L76
        L75:
            throw r7
        L76:
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C1446c0.m6731i(java.lang.String):java.lang.String");
    }

    /* renamed from: n */
    private final String m6732n() {
        try {
            String m6727d = m6727d("/sys/class/net/eth0/address");
            if (m6727d != null) {
                return m6727d;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    private final String m6733o() {
        byte[] bArr;
        byte[] hardwareAddress;
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        try {
            NetworkInterface byName = NetworkInterface.getByName("eth0");
            if (byName != null) {
                bArr = byName.getHardwareAddress();
            } else {
                bArr = null;
            }
            boolean z11 = false;
            if (bArr != null) {
                for (byte b10 : bArr) {
                    C5881x c5881x = C5881x.f23415a;
                    String format = String.format("%02X:", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                    AbstractC5868k.m23673e(format, "format(format, *args)");
                    sb2.append(format);
                }
                if (sb2.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    AbstractC7162p.m27715b(sb2);
                } else {
                    sb2.deleteCharAt(sb2.length() - 1);
                    return sb2.toString();
                }
            }
            NetworkInterface byName2 = NetworkInterface.getByName("eth1");
            if (byName2 == null || (hardwareAddress = byName2.getHardwareAddress()) == null) {
                return "02:00:00:00:00:00";
            }
            for (byte b11 : hardwareAddress) {
                C5881x c5881x2 = C5881x.f23415a;
                String format2 = String.format("%02X:", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
                AbstractC5868k.m23673e(format2, "format(format, *args)");
                sb2.append(format2);
            }
            if (sb2.length() > 0) {
                z11 = true;
            }
            if (z11) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    /* renamed from: r */
    private final String m6734r() {
        String m6727d;
        try {
            String[] strArr = {"/sys/class/net/wlan0/address", "/sys/devices/virtual/net/wlan0/address"};
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    m6727d = m6727d(strArr[i10]);
                } catch (Throwable unused) {
                }
                if (m6727d != null) {
                    return m6727d;
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: x */
    private final String m6735x() {
        try {
            return (String) Build.class.getMethod("getSerial", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: z */
    private final String m6736z(Context context) {
        Object systemService = context.getSystemService("wifi");
        AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
        if (connectionInfo != null) {
            return connectionInfo.getMacAddress();
        }
        return null;
    }

    /* renamed from: E */
    public final void m6737E(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        int mo19965n = C4842a.f20329a.m19920a().mo19965n();
        if (mo19965n != 1) {
            if (mo19965n != 2) {
                C5096m c5096m = C5096m.f20979a;
                if (TextUtils.isEmpty(c5096m.m20690a())) {
                    m6713F(context);
                    return;
                }
                C1466m0 c1466m0 = C1466m0.f5627a;
                c1466m0.m6865f0(c5096m.m20690a());
                c1466m0.m6848U((String) C4982a.f20721a.m20333a(context, C5090g.f20948a.m20644i(), ""));
                return;
            }
            m6713F(context);
            return;
        }
        C1466m0 c1466m02 = C1466m0.f5627a;
        c1466m02.m6865f0(C5096m.f20979a.m20690a());
        c1466m02.m6848U((String) C4982a.f20721a.m20333a(context, C5090g.f20948a.m20644i(), ""));
    }

    /* renamed from: I */
    public final boolean m6738I(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        C4982a c4982a = C4982a.f20721a;
        String str = AbstractC7073a.f26507b;
        AbstractC5868k.m23673e(str, "SP_SN_BACKUP");
        String str2 = (String) c4982a.m20333a(context, str, "");
        C1466m0.f5627a.m6848U((String) c4982a.m20333a(context, C5090g.f20948a.m20644i(), ""));
        return m6711C(str2);
    }

    /* renamed from: K */
    public final void m6739K(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        m6723R(context);
        Observable just = Observable.just("(write sn)");
        final a aVar = new a(context);
        Observable compose = just.map(new Function() { // from class: cc.z
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m6717L;
                m6717L = C1446c0.m6717L(InterfaceC5660l.this, obj);
                return m6717L;
            }
        }).compose(AbstractC7029f.m27122c());
        final b bVar = b.f5563a;
        Consumer consumer = new Consumer() { // from class: cc.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1446c0.m6718M(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f5564a;
        compose.subscribe(consumer, new Consumer() { // from class: cc.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1446c0.m6719N(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: h */
    public final void m6740h() {
        C1466m0 c1466m0 = C1466m0.f5627a;
        c1466m0.m6865f0("");
        c1466m0.m6848U("");
    }

    /* renamed from: j */
    public final String m6741j(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        String string = Settings.System.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: k */
    public final String m6742k() {
        String m6897e = AbstractC1468n0.m6897e();
        if (TextUtils.isEmpty(m6897e)) {
            return "";
        }
        String m6797b = AbstractC1459j.m6797b(m6897e, "combrasiltvaslgklxckbcombrasiltv");
        AbstractC5868k.m23673e(m6797b, "serial");
        return m6797b;
    }

    /* renamed from: l */
    public final String m6743l() {
        boolean z10;
        boolean z11;
        String m6731i = m6731i("cat /sys/block/mmcblk0/device/type");
        String m6731i2 = m6731i("cat /sys/block/mmcblk0/device/name");
        String m6731i3 = m6731i("cat /sys/block/mmcblk0/device/cid");
        boolean z12 = true;
        if (m6731i.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (m6731i2.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (m6731i3.length() != 0) {
                    z12 = false;
                }
                if (z12) {
                    return "";
                }
            }
        }
        return m6731i + ',' + m6731i2 + ',' + m6731i3;
    }

    /* renamed from: m */
    public final String m6744m() {
        String str = f5561c;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: p */
    public final String m6745p() {
        boolean m27763v;
        String m6733o = m6733o();
        String str = "02:00:00:00:00:00";
        if (m6733o == null) {
            m6733o = "02:00:00:00:00:00";
        }
        if ((TextUtils.equals("02:00:00:00:00:00", m6733o) || TextUtils.isEmpty(m6733o)) && (m6733o = m6732n()) == null) {
            m6733o = "02:00:00:00:00:00";
        }
        if (Build.MODEL.equals("UTV LT1")) {
            String m6734r = m6734r();
            if (m6734r != null) {
                str = m6734r;
            }
            m6733o = str;
        }
        m27763v = AbstractC7167u.m27763v(m6733o, ":", false, 2, null);
        if (!m27763v) {
            m6733o = Pattern.compile("(.{2}(?=.))").matcher(m6733o).replaceAll("$1:");
            AbstractC5868k.m23673e(m6733o, "compile(\"(.{2}(?=.))\").m…er(mac).replaceAll(\"$1:\")");
        }
        Locale locale = Locale.getDefault();
        AbstractC5868k.m23673e(locale, "getDefault()");
        String lowerCase = m6733o.toLowerCase(locale);
        AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: q */
    public final String m6746q() {
        String m20678j = AbstractC5093j.m20678j();
        if (AbstractC5868k.m23669a(m20678j, "000000000000")) {
            return "02:00:00:00:00:00";
        }
        String replaceAll = Pattern.compile("(.{2}(?=.))").matcher(m20678j).replaceAll("$1:");
        AbstractC5868k.m23673e(replaceAll, "reserve1");
        return replaceAll;
    }

    /* renamed from: s */
    public final void m6747s() {
        try {
            byte[] propertyByteArray = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L)).getPropertyByteArray("deviceUniqueId");
            AbstractC5868k.m23673e(propertyByteArray, "MediaDrm(wideVineUuid).g…ROPERTY_DEVICE_UNIQUE_ID)");
            f5561c = Base64.encodeToString(propertyByteArray, 2);
        } catch (Exception e10) {
            e10.printStackTrace();
            f5561c = "";
        }
    }

    /* renamed from: t */
    public final String m6748t() {
        boolean z10;
        String m20690a;
        if (f5560b.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            C5096m c5096m = C5096m.f20979a;
            if (c5096m.m20692c()) {
                C4982a c4982a = C4982a.f20721a;
                Context m24887a = AbstractApplicationC6253c.f24484b.m24887a();
                String str = AbstractC7073a.f26508c;
                AbstractC5868k.m23673e(str, "KEY_SP_SN");
                m20690a = (String) c4982a.m20333a(m24887a, str, "");
            } else {
                m20690a = c5096m.m20690a();
            }
            f5560b = m20690a;
        }
        return f5560b;
    }

    /* renamed from: u */
    public final String m6749u(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return "";
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            String formatFileSize = Formatter.formatFileSize(context, memoryInfo.totalMem);
            AbstractC5868k.m23673e(formatFileSize, "formatFileSize(context, totalSize)");
            return formatFileSize;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: v */
    public final String m6750v(Context context) {
        String str;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            str = Formatter.formatFileSize(context, statFs.getBlockSizeLong() * statFs.getBlockCountLong());
        } catch (Exception unused) {
            str = "";
        }
        AbstractC5868k.m23673e(str, "{\n            try {\n    …\"\n            }\n        }");
        return str;
    }

    /* renamed from: w */
    public final String m6751w() {
        String str = Build.SERIAL;
        String str2 = "unknown";
        if (str == null) {
            str = "unknown";
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals("unknown", str)) {
            String m6735x = m6735x();
            if (m6735x != null) {
                str2 = m6735x;
            }
            return str2;
        }
        return str;
    }

    /* renamed from: y */
    public final String m6752y(Context context) {
        String str;
        boolean m27763v;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        String str2 = "02:00:00:00:00:00";
        if (Build.VERSION.SDK_INT >= 23 || (str = m6736z(context)) == null) {
            str = "02:00:00:00:00:00";
        }
        if (TextUtils.equals("02:00:00:00:00:00", str) || TextUtils.isEmpty(str)) {
            str = m6709A();
        }
        if (TextUtils.equals("02:00:00:00:00:00", str) || TextUtils.isEmpty(str)) {
            String m6734r = m6734r();
            if (m6734r != null) {
                str2 = m6734r;
            }
            str = str2;
        }
        m27763v = AbstractC7167u.m27763v(str, ":", false, 2, null);
        if (!m27763v) {
            str = Pattern.compile("(.{2}(?=.))").matcher(str).replaceAll("$1:");
            AbstractC5868k.m23673e(str, "compile(\"(.{2}(?=.))\").m…ifiMac).replaceAll(\"$1:\")");
        }
        Locale locale = Locale.getDefault();
        AbstractC5868k.m23673e(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
