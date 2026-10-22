package com.taobao.accs.data;

import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.umeng.analytics.pro.C3373dn;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.data.a */
/* loaded from: classes.dex */
public class C3136a {
    public static final int SPLITTED_DATA_INDEX = 17;
    public static final int SPLITTED_DATA_MD5 = 18;
    public static final int SPLITTED_DATA_NUMS = 16;
    public static final int SPLITTED_TIME_OUT = 15;

    /* renamed from: a */
    private static final char[] f12914a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private String f12915b;

    /* renamed from: c */
    private int f12916c;

    /* renamed from: d */
    private String f12917d;

    /* renamed from: e */
    private long f12918e;

    /* renamed from: g */
    private ScheduledFuture<?> f12920g;

    /* renamed from: f */
    private volatile int f12919f = 0;

    /* renamed from: h */
    private Map<Integer, byte[]> f12921h = new TreeMap(new C3137b(this));

    public C3136a(String str, int i10, String str2) {
        this.f12915b = str;
        this.f12916c = i10;
        this.f12917d = str2;
    }

    /* renamed from: a */
    public void m12759a(long j10) {
        if (j10 <= 0) {
            j10 = 30000;
        }
        this.f12920g = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC3138c(this), j10, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9 A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:13:0x003e, B:15:0x0042, B:17:0x004e, B:18:0x0057, B:20:0x0059, B:22:0x0061, B:23:0x0067, B:25:0x007a, B:26:0x0085, B:28:0x008b, B:31:0x0095, B:38:0x00a5, B:40:0x00af, B:42:0x00c4, B:44:0x00e9, B:45:0x011d, B:47:0x013e, B:48:0x0141, B:52:0x0158, B:54:0x0143), top: B:12:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:13:0x003e, B:15:0x0042, B:17:0x004e, B:18:0x0057, B:20:0x0059, B:22:0x0061, B:23:0x0067, B:25:0x007a, B:26:0x0085, B:28:0x008b, B:31:0x0095, B:38:0x00a5, B:40:0x00af, B:42:0x00c4, B:44:0x00e9, B:45:0x011d, B:47:0x013e, B:48:0x0141, B:52:0x0158, B:54:0x0143), top: B:12:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m12760a(int r13, int r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C3136a.m12760a(int, int, byte[]):byte[]");
    }

    /* renamed from: a */
    private static char[] m12756a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f12914a;
            cArr[i10] = cArr2[(b10 & 240) >>> 4];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & C3373dn.f14525m];
        }
        return cArr;
    }
}
