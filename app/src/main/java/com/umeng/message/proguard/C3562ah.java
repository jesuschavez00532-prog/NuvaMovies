package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.inapp.IUmengInAppMsgCloseCallback;
import com.umeng.message.inapp.InAppMessageManager;
import com.umeng.message.inapp.UmengCardMessage;
import com.umeng.message.proguard.AsyncTaskC3561ag;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.umeng.message.proguard.ah */
/* loaded from: classes3.dex */
public final class C3562ah implements InterfaceC3559ae, AsyncTaskC3561ag.a {

    /* renamed from: a */
    public static final String f15897a = "com.umeng.message.proguard.ah";

    /* renamed from: b */
    public Context f15898b;

    /* renamed from: c */
    public String f15899c;

    /* renamed from: d */
    private boolean f15900d;

    /* renamed from: e */
    private UInAppMessage f15901e;

    /* renamed from: f */
    private IUmengInAppMsgCloseCallback f15902f;

    public C3562ah(Activity activity, String str, IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback) {
        this.f15898b = activity;
        this.f15899c = str;
        this.f15902f = iUmengInAppMsgCloseCallback;
    }

    @Override // com.umeng.message.proguard.InterfaceC3559ae
    /* renamed from: a */
    public final void mo15266a(UInAppMessage uInAppMessage) {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0024  */
    @Override // com.umeng.message.proguard.InterfaceC3559ae
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo15267b(com.umeng.message.entity.UInAppMessage r4) {
        /*
            r3 = this;
            android.content.Context r0 = r3.f15898b
            com.umeng.message.inapp.InAppMessageManager r0 = com.umeng.message.inapp.InAppMessageManager.getInstance(r0)
            java.lang.String r1 = r3.f15899c
            java.lang.String r0 = r0.m15213a(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L21
            com.umeng.message.entity.UInAppMessage r1 = new com.umeng.message.entity.UInAppMessage     // Catch: org.json.JSONException -> L1d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1d
            r2.<init>(r0)     // Catch: org.json.JSONException -> L1d
            r1.<init>(r2)     // Catch: org.json.JSONException -> L1d
            goto L22
        L1d:
            r0 = move-exception
            r0.printStackTrace()
        L21:
            r1 = 0
        L22:
            if (r4 == 0) goto L49
            if (r1 == 0) goto L46
            java.lang.String r0 = r4.msg_id
            java.lang.String r2 = r1.msg_id
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L46
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r3.f15898b
            java.lang.String r1 = r1.msg_id
            java.lang.String r1 = com.umeng.message.proguard.C3678f.m15744a(r2, r1)
            r0.<init>(r1)
            android.content.Context r1 = r3.f15898b
            com.umeng.message.inapp.InAppMessageManager r1 = com.umeng.message.inapp.InAppMessageManager.getInstance(r1)
            r1.m15217a(r0)
        L46:
            r3.f15901e = r4
            goto L4d
        L49:
            if (r1 == 0) goto Lb8
            r3.f15901e = r1
        L4d:
            com.umeng.message.entity.UInAppMessage r4 = r3.f15901e
            int r4 = r4.show_type
            r0 = 1
            if (r4 != r0) goto L6a
            java.lang.String r4 = r3.f15899c
            boolean r4 = r3.m15297b(r4)
            if (r4 != 0) goto L6a
            android.content.Context r4 = r3.f15898b
            com.umeng.message.inapp.InAppMessageManager r4 = com.umeng.message.inapp.InAppMessageManager.getInstance(r4)
            com.umeng.message.entity.UInAppMessage r0 = r3.f15901e
            java.lang.String r0 = r0.msg_id
            r1 = 0
            r4.m15218a(r0, r1)
        L6a:
            android.content.Context r4 = r3.f15898b
            com.umeng.message.inapp.InAppMessageManager.getInstance(r4)
            com.umeng.message.entity.UInAppMessage r4 = r3.f15901e
            boolean r4 = com.umeng.message.inapp.InAppMessageManager.m15210b(r4)
            if (r4 == 0) goto Lb8
            android.content.Context r4 = r3.f15898b
            com.umeng.message.inapp.InAppMessageManager r4 = com.umeng.message.inapp.InAppMessageManager.getInstance(r4)
            com.umeng.message.entity.UInAppMessage r0 = r3.f15901e
            boolean r4 = r4.m15223c(r0)
            if (r4 != 0) goto L86
            goto Lb8
        L86:
            com.umeng.message.entity.UInAppMessage r4 = r3.f15901e
            int r4 = r4.msg_type
            r0 = 5
            if (r4 == r0) goto La8
            r0 = 6
            if (r4 != r0) goto L91
            goto La8
        L91:
            com.umeng.message.proguard.ag r4 = new com.umeng.message.proguard.ag
            android.content.Context r0 = r3.f15898b
            com.umeng.message.entity.UInAppMessage r1 = r3.f15901e
            r4.<init>(r0, r1)
            r4.f15894a = r3
            com.umeng.message.entity.UInAppMessage r0 = r3.f15901e
            java.lang.String r0 = r0.image_url
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r4.execute(r0)
            return
        La8:
            android.content.Context r4 = r3.f15898b
            com.umeng.message.inapp.InAppMessageManager r4 = com.umeng.message.inapp.InAppMessageManager.getInstance(r4)
            com.umeng.message.entity.UInAppMessage r0 = r3.f15901e
            java.lang.String r1 = r3.f15899c
            r4.m15216a(r0, r1)
            r3.m15295a()
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3562ah.mo15267b(com.umeng.message.entity.UInAppMessage):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m15298a(java.lang.String r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f15898b
            java.lang.String r0 = com.umeng.message.proguard.C3637d.m15596a(r0)
            android.content.Context r1 = r5.f15898b
            com.umeng.message.inapp.InAppMessageManager r1 = com.umeng.message.inapp.InAppMessageManager.getInstance(r1)
            java.lang.String r2 = "KEY_LAST_VERSION_CODE"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.m15214a(r2, r3)
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "KEY_CARD_LABEL_LIST"
            if (r0 != 0) goto L25
            android.content.Context r0 = r5.f15898b
            com.umeng.message.inapp.InAppMessageManager r0 = com.umeng.message.inapp.InAppMessageManager.getInstance(r0)
            r0.m15221b(r1, r3)
        L25:
            android.content.Context r0 = r5.f15898b
            com.umeng.message.inapp.InAppMessageManager r0 = com.umeng.message.inapp.InAppMessageManager.getInstance(r0)
            android.content.Context r4 = r5.f15898b
            java.lang.String r4 = com.umeng.message.proguard.C3637d.m15596a(r4)
            r0.m15221b(r2, r4)
            android.content.Context r0 = r5.f15898b
            com.umeng.message.inapp.InAppMessageManager r0 = com.umeng.message.inapp.InAppMessageManager.getInstance(r0)
            java.lang.String r0 = r0.m15214a(r1, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4e
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L4a
            r2.<init>(r0)     // Catch: org.json.JSONException -> L4a
            goto L4f
        L4a:
            r0 = move-exception
            r0.printStackTrace()
        L4e:
            r2 = 0
        L4f:
            r0 = 1
            if (r2 != 0) goto L68
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            r2.put(r6)
            android.content.Context r6 = r5.f15898b
            com.umeng.message.inapp.InAppMessageManager r6 = com.umeng.message.inapp.InAppMessageManager.getInstance(r6)
            java.lang.String r2 = r2.toString()
            r6.m15221b(r1, r2)
            return r0
        L68:
            boolean r3 = m15296a(r2, r6)
            if (r3 == 0) goto L6f
            return r0
        L6f:
            int r3 = r2.length()
            r4 = 10
            if (r3 >= r4) goto L88
            r2.put(r6)
            android.content.Context r6 = r5.f15898b
            com.umeng.message.inapp.InAppMessageManager r6 = com.umeng.message.inapp.InAppMessageManager.getInstance(r6)
            java.lang.String r2 = r2.toString()
            r6.m15221b(r1, r2)
            return r0
        L88:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3562ah.m15298a(java.lang.String):boolean");
    }

    /* renamed from: b */
    private boolean m15297b(String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(InAppMessageManager.getInstance(this.f15898b).m15222c(str));
        Calendar calendar2 = Calendar.getInstance();
        return calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1);
    }

    /* renamed from: a */
    private static boolean m15296a(JSONArray jSONArray, String str) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                if (jSONArray.getString(i10).equals(str)) {
                    return true;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m15295a() {
        try {
            UmengCardMessage umengCardMessage = new UmengCardMessage();
            umengCardMessage.f15816a = this.f15902f;
            Bundle bundle = new Bundle();
            bundle.putString("label", this.f15899c);
            bundle.putString("msg", this.f15901e.getRaw().toString());
            umengCardMessage.setArguments(bundle);
            umengCardMessage.show(((Activity) this.f15898b).getFragmentManager(), this.f15899c);
            InAppMessageManager.getInstance(this.f15898b).m15218a(this.f15901e.msg_id, 1);
            InAppMessageManager.getInstance(this.f15898b).m15220b(this.f15899c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.umeng.message.proguard.AsyncTaskC3561ag.a
    /* renamed from: a */
    public final void mo15265a(Bitmap[] bitmapArr) {
        Bitmap bitmap;
        if (!this.f15900d && (bitmap = bitmapArr[0]) != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                UmengCardMessage umengCardMessage = new UmengCardMessage();
                umengCardMessage.f15816a = this.f15902f;
                Bundle bundle = new Bundle();
                bundle.putString("label", this.f15899c);
                bundle.putString("msg", this.f15901e.getRaw().toString());
                bundle.putByteArray("bitmapByte", byteArray);
                umengCardMessage.setArguments(bundle);
                umengCardMessage.show(((Activity) this.f15898b).getFragmentManager(), this.f15899c);
                InAppMessageManager.getInstance(this.f15898b).m15218a(this.f15901e.msg_id, 1);
                InAppMessageManager.getInstance(this.f15898b).m15220b(this.f15899c);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        InAppMessageManager.getInstance(this.f15898b).m15216a(this.f15901e, this.f15899c);
    }
}
