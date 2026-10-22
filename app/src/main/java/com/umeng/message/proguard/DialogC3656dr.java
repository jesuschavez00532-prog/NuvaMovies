package com.umeng.message.proguard;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.umeng.message.proguard.C3613cc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.message.proguard.dr */
/* loaded from: classes3.dex */
public final class DialogC3656dr extends Dialog {

    /* renamed from: a */
    final C3674eh f16428a;

    /* renamed from: b */
    final ImageView f16429b;

    /* renamed from: c */
    final C3622cl f16430c;

    /* renamed from: d */
    final LinearLayout f16431d;

    /* renamed from: e */
    int f16432e;

    /* renamed from: f */
    View.OnClickListener f16433f;

    /* renamed from: g */
    private Bitmap f16434g;

    /* renamed from: h */
    private C3613cc.a f16435h;

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC3656dr(android.content.Context r10, com.umeng.message.proguard.C3622cl r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.DialogC3656dr.<init>(android.content.Context, com.umeng.message.proguard.cl):void");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Throwable th) {
            C3615ce.m15512d("Interstitial", "dismiss error:", th.getMessage());
        }
        this.f16435h = null;
        try {
            Bitmap bitmap = this.f16434g;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f16434g.recycle();
            }
        } catch (Throwable unused) {
        }
        this.f16434g = null;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (Throwable th) {
            C3615ce.m15512d("Interstitial", "show error:", th.getMessage());
        }
    }
}
