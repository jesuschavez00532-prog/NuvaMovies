package com.efs.sdk.base.core.p055d;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p051b.InterfaceC1673d;
import com.efs.sdk.base.core.p055d.C1708f;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.p056a.C1717d;
import com.efs.sdk.base.core.util.secure.EncodeUtil;
import com.efs.sdk.base.http.HttpResponse;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.efs.sdk.base.core.d.e */
/* loaded from: classes.dex */
public final class C1707e implements InterfaceC1673d {
    /* renamed from: a */
    private static void m7713a(HttpResponse httpResponse) {
        if (httpResponse == null || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        for (String str : httpResponse.data.split("`")) {
            String[] split = str.split(Operator.Operation.EQUALS);
            if (split.length >= 2) {
                if (split[0].equalsIgnoreCase("retcode")) {
                    httpResponse.setBizCode(split[1]);
                } else {
                    ((Map) httpResponse.extra).put(split[0], split[1]);
                }
            }
        }
    }

    @Override // com.efs.sdk.base.core.p051b.InterfaceC1673d
    /* renamed from: a */
    public final HttpResponse mo7629a(LogDto logDto, boolean z10) {
        HttpResponse httpResponse;
        C1708f c1708f;
        try {
            c1708f = C1708f.a.f7163a;
            C1705c c1705c = c1708f.f7159a;
            String valueOf = String.valueOf(System.currentTimeMillis());
            String md5 = EncodeUtil.md5(c1705c.f7152b + c1705c.f7153c + valueOf + "AppChk#2014");
            StringBuilder sb2 = new StringBuilder();
            String str = c1705c.f7151a;
            if (str.startsWith(HttpConstant.HTTP)) {
                sb2.append(str);
                sb2.append("?chk=");
            } else {
                sb2.append(str);
                sb2.append("?chk=");
            }
            sb2.append(md5.substring(md5.length() - 8));
            sb2.append("&vno=");
            sb2.append(valueOf);
            sb2.append("&uuid=");
            sb2.append(c1705c.f7153c);
            sb2.append("&app=");
            sb2.append(c1705c.f7152b);
            sb2.append("&zip=gzip");
            String sb3 = sb2.toString();
            int i10 = 0;
            byte[] bArr = new byte[0];
            if (logDto.getLogBodyType() == 0) {
                bArr = logDto.getData();
                i10 = bArr.length;
            } else if (1 == logDto.getLogBodyType()) {
                bArr = FileUtil.read(logDto.getFile().getPath());
                i10 = bArr.length;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/x-www-form-urlencoded");
            hashMap.put("Content-Length", String.valueOf(i10));
            C1717d m7764a = new C1717d(sb3).m7764a(hashMap);
            m7764a.f7202a.f7196c = bArr;
            httpResponse = m7764a.m7761a().m7760b();
            m7713a(httpResponse);
        } catch (Throwable th) {
            httpResponse = 0 == 0 ? new HttpResponse() : null;
            Log.m7727e("efs.wa.send", "get file size error", th);
        }
        if (httpResponse.succ) {
            Log.m7730i("efs.base", "wa upload succ, " + httpResponse.toString());
            FileUtil.delete(logDto.getFile());
            return httpResponse;
        }
        Log.m7730i("efs.base", "wa upload fail, resp is " + httpResponse.toString());
        return httpResponse;
    }
}
