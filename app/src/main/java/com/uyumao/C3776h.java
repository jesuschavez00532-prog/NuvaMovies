package com.uyumao;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.uyumao.h */
/* loaded from: classes3.dex */
public class C3776h extends BroadcastReceiver {

    /* renamed from: a */
    public long f16957a = 0;

    /* renamed from: com.uyumao.h$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f16958a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f16959b;

        public a(C3776h c3776h, Context context, JSONObject jSONObject) {
            this.f16958a = context;
            this.f16959b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(this.f16958a.getCacheDir().getPath() + File.separator + "net_change");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f16959b.toString());
            sb2.append("\n");
            C3773e.m16013a(file, sb2.toString().getBytes(), true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0124 A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:3:0x0002, B:5:0x000c, B:9:0x0015, B:12:0x0034, B:14:0x003a, B:16:0x0040, B:19:0x004c, B:21:0x005b, B:22:0x0066, B:39:0x0124, B:45:0x013d, B:51:0x011e, B:55:0x0075, B:57:0x007b, B:59:0x0081, B:60:0x0093, B:62:0x0099, B:64:0x009f, B:66:0x00a5, B:69:0x00b1, B:71:0x00c0, B:73:0x00d0, B:41:0x012b), top: B:2:0x0002, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uyumao.C3776h.onReceive(android.content.Context, android.content.Intent):void");
    }
}
