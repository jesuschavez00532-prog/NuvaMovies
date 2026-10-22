package com.efs.sdk.base.core.cache;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.config.remote.C1698b;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p052c.p053a.C1681c;
import com.efs.sdk.base.core.p052c.p053a.C1682d;
import com.efs.sdk.base.core.p055d.C1708f;
import com.efs.sdk.base.core.util.C1713a;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.C1720a;
import com.efs.sdk.base.core.util.secure.EncodeUtil;
import com.lzy.okgo.OkGo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.core.cache.e */
/* loaded from: classes.dex */
public final class HandlerC1694e extends Handler implements InterfaceC1693d {

    /* renamed from: a */
    private final ConcurrentHashMap<String, a> f7081a;

    /* renamed from: b */
    private C1682d f7082b;

    /* renamed from: c */
    private C1681c f7083c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.cache.e$a */
    /* loaded from: classes.dex */
    public static class a extends FileOutputStream {

        /* renamed from: a */
        long f7084a;

        /* renamed from: b */
        File f7085b;

        a(File file) {
            super(file);
            this.f7085b = file;
            this.f7084a = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC1694e() {
        super(C1720a.f7206a.getLooper());
        this.f7081a = new ConcurrentHashMap<>();
        this.f7082b = new C1682d();
        this.f7083c = new C1681c();
    }

    /* renamed from: b */
    private static long m7665b(String str) {
        Map<String, String> m7696c = C1698b.m7679a().m7696c();
        String concat = "record_accumulation_time_".concat(String.valueOf(str));
        if (!m7696c.containsKey(concat)) {
            return OkGo.DEFAULT_MILLISECONDS;
        }
        String str2 = m7696c.get(concat);
        if (TextUtils.isEmpty(str2)) {
            return OkGo.DEFAULT_MILLISECONDS;
        }
        try {
            return Math.max(Long.parseLong(str2) * 1000, 1000L);
        } catch (Throwable th) {
            Log.m7727e("efs.cache", "get cache interval error", th);
            return OkGo.DEFAULT_MILLISECONDS;
        }
    }

    /* renamed from: c */
    private void m7667c(String str) {
        a aVar;
        C1708f c1708f;
        C1708f c1708f2;
        if (!this.f7081a.containsKey(str) || (aVar = this.f7081a.get(str)) == null) {
            return;
        }
        try {
            aVar.flush();
            FileUtil.safeClose(aVar);
            Log.m7730i("RecordLogCacheProcessor", "save file, type is ".concat(String.valueOf(str)));
            mo7661a(aVar.f7085b);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                this.f7081a.remove(str);
                if (!"wa".equalsIgnoreCase(str)) {
                    c1708f2 = C1708f.a.f7163a;
                    c1708f2.f7161c.m7711c();
                }
            } finally {
                this.f7081a.remove(str);
                if (!"wa".equalsIgnoreCase(str)) {
                    c1708f = C1708f.a.f7163a;
                    c1708f.f7161c.m7711c();
                }
            }
        }
    }

    @Override // com.efs.sdk.base.core.cache.InterfaceC1693d
    /* renamed from: a */
    public final void mo7660a(LogDto logDto) {
        Message obtain = Message.obtain();
        obtain.obj = logDto;
        obtain.what = 0;
        sendMessage(obtain);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                Object obj = message.obj;
                if (obj instanceof String) {
                    m7667c(obj.toString());
                    return;
                }
                return;
            }
            return;
        }
        LogDto logDto = (LogDto) message.obj;
        for (int i11 = 0; i11 < 3; i11++) {
            try {
                a m7666b = m7666b(logDto);
                if (m7666b == null) {
                    Log.m7738w("efs.cache", "writer is null for type " + logDto.getLogType());
                    return;
                }
                if (m7666b.getChannel().position() + logDto.getData().length > 819200) {
                    m7667c(logDto.getLogType());
                    m7666b = m7666b(logDto);
                    if (m7666b == null) {
                        Log.m7738w("efs.cache", "writer is null for type " + logDto.getLogType());
                        return;
                    }
                }
                m7666b.write(EncodeUtil.base64Encode(logDto.getData()));
                m7666b.write("\n".getBytes());
                return;
            } catch (Throwable th) {
                Log.m7727e("efs.cache", "cache file error", th);
            }
        }
    }

    @Override // com.efs.sdk.base.core.cache.InterfaceC1693d
    /* renamed from: a */
    public final boolean mo7663a(File file, LogDto logDto) {
        if (!logDto.isCp()) {
            mo7661a(file);
            return false;
        }
        if (!file.exists()) {
            return false;
        }
        logDto.setFile(file);
        logDto.setSendImediately(true);
        logDto.setLogBodyType(1);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.efs.sdk.base.core.cache.HandlerC1694e.a m7666b(com.efs.sdk.base.core.model.LogDto r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.core.cache.e$a> r0 = r5.f7081a
            java.lang.String r1 = r6.getLogType()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.core.cache.e$a> r0 = r5.f7081a
            java.lang.String r6 = r6.getLogType()
            java.lang.Object r6 = r0.get(r6)
            com.efs.sdk.base.core.cache.e$a r6 = (com.efs.sdk.base.core.cache.HandlerC1694e.a) r6
            return r6
        L19:
            java.lang.String r0 = r6.getLogType()
            java.lang.String r1 = "codelogperf"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            java.lang.String r0 = com.efs.sdk.base.core.util.FileUtil.getCodelogFileName(r6)
            java.io.File r2 = new java.io.File
            com.efs.sdk.base.core.config.GlobalEnvStruct r3 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            android.content.Context r3 = r3.mAppContext
            com.efs.sdk.base.core.config.GlobalEnvStruct r4 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            java.lang.String r4 = r4.getAppid()
            java.io.File r3 = com.efs.sdk.base.core.util.C1713a.m7749g(r3, r4)
            r2.<init>(r3, r0)
            goto L5c
        L41:
            java.lang.String r0 = com.efs.sdk.base.core.util.FileUtil.getFileName(r6)
            java.io.File r2 = new java.io.File
            com.efs.sdk.base.core.config.GlobalEnvStruct r3 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            android.content.Context r3 = r3.mAppContext
            com.efs.sdk.base.core.config.GlobalEnvStruct r4 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            java.lang.String r4 = r4.getAppid()
            java.io.File r3 = com.efs.sdk.base.core.util.C1713a.m7748f(r3, r4)
            r2.<init>(r3, r0)
        L5c:
            r0 = 0
            com.efs.sdk.base.core.cache.e$a r3 = new com.efs.sdk.base.core.cache.e$a     // Catch: java.lang.Throwable -> Lac
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lac
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.core.cache.e$a> r0 = r5.f7081a     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = r6.getLogType()     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = r0.putIfAbsent(r4, r3)     // Catch: java.lang.Throwable -> Laa
            com.efs.sdk.base.core.cache.e$a r0 = (com.efs.sdk.base.core.cache.HandlerC1694e.a) r0     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L77
            com.efs.sdk.base.core.util.FileUtil.safeClose(r3)     // Catch: java.lang.Throwable -> Laa
            com.efs.sdk.base.core.util.FileUtil.delete(r2)     // Catch: java.lang.Throwable -> Laa
            return r0
        L77:
            java.lang.String r0 = r6.getLogType()     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Laa
            r1 = 1
            if (r0 == 0) goto L92
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r6.getLogType()     // Catch: java.lang.Throwable -> Laa
            r0.obj = r2     // Catch: java.lang.Throwable -> Laa
            r0.what = r1     // Catch: java.lang.Throwable -> Laa
            r5.sendMessage(r0)     // Catch: java.lang.Throwable -> Laa
            goto Lb2
        L92:
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r6.getLogType()     // Catch: java.lang.Throwable -> Laa
            r0.obj = r2     // Catch: java.lang.Throwable -> Laa
            r0.what = r1     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = r6.getLogType()     // Catch: java.lang.Throwable -> Laa
            long r1 = m7665b(r1)     // Catch: java.lang.Throwable -> Laa
            r5.sendMessageDelayed(r0, r1)     // Catch: java.lang.Throwable -> Laa
            goto Lb2
        Laa:
            r0 = move-exception
            goto Laf
        Lac:
            r1 = move-exception
            r3 = r0
            r0 = r1
        Laf:
            r0.printStackTrace()
        Lb2:
            java.lang.String r0 = "wa"
            java.lang.String r6 = r6.getLogType()
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 != 0) goto Lc7
            com.efs.sdk.base.core.d.f r6 = com.efs.sdk.base.core.p055d.C1708f.a.m7718a()
            com.efs.sdk.base.core.d.d r6 = r6.f7161c
            r6.m7710b()
        Lc7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.core.cache.HandlerC1694e.m7666b(com.efs.sdk.base.core.model.LogDto):com.efs.sdk.base.core.cache.e$a");
    }

    @Override // com.efs.sdk.base.core.cache.InterfaceC1693d
    /* renamed from: a */
    public final void mo7662a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.obj = str;
        obtain.what = 1;
        sendMessage(obtain);
    }

    @Override // com.efs.sdk.base.core.cache.InterfaceC1693d
    /* renamed from: a */
    public final void mo7661a(File file) {
        LogDto createLogDtoByName;
        String fileName;
        File m7750h;
        String name = file.getName();
        if (!TextUtils.isEmpty(name) && name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
            createLogDtoByName = FileUtil.createCodeLogDtoByName(name);
        } else {
            createLogDtoByName = FileUtil.createLogDtoByName(name);
        }
        if (createLogDtoByName == null) {
            CacheManager.getInstance().onChangeDtoError(file);
            return;
        }
        if (m7664a(createLogDtoByName, file) && createLogDtoByName.getData() != null && createLogDtoByName.getData().length > 0) {
            if (Constants.LOG_TYPE_CODELOGPERF.equals(createLogDtoByName.getLogType())) {
                fileName = FileUtil.getCodelogFileName(createLogDtoByName);
                m7750h = C1713a.m7751i(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
            } else {
                fileName = FileUtil.getFileName(createLogDtoByName);
                m7750h = C1713a.m7750h(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
            }
            File file2 = new File(m7750h, fileName);
            Log.m7730i("RecordLogCacheProcessor", "upload file, name is ".concat(String.valueOf(name)));
            FileUtil.write(file2, createLogDtoByName.getData());
            FileUtil.delete(file);
            return;
        }
        CacheManager.getInstance().onChangeDtoError(file);
    }

    /* renamed from: a */
    private boolean m7664a(LogDto logDto, File file) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        StringBuilder sb2 = new StringBuilder();
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                String base64DecodeToStr = EncodeUtil.base64DecodeToStr(readLine.getBytes());
                if (!TextUtils.isEmpty(base64DecodeToStr)) {
                    sb2.append(base64DecodeToStr);
                    sb2.append("\n");
                }
            }
            logDto.setData(sb2.toString().getBytes());
            logDto.setSendImediately(true);
            this.f7083c.mo7648a(logDto);
            logDto.setFile(file);
            FileUtil.safeClose(bufferedReader);
            FileUtil.safeClose(fileReader);
            return true;
        } catch (Throwable th3) {
            th = th3;
            fileReader2 = fileReader;
            try {
                Log.m7727e("efs.cache", "local decode error", th);
                FileUtil.safeClose(bufferedReader);
                FileUtil.safeClose(fileReader2);
                return false;
            } catch (Throwable th4) {
                FileUtil.safeClose(bufferedReader);
                FileUtil.safeClose(fileReader2);
                throw th4;
            }
        }
    }
}
