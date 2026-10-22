package p172i4;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import p365v4.HandlerC7209h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i4.t */
/* loaded from: classes.dex */
public final class HandlerC4889t extends HandlerC7209h {

    /* renamed from: a */
    private final Context f20396a;

    /* renamed from: b */
    final /* synthetic */ C4868i f20397b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HandlerC4889t(p172i4.C4868i r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f20397b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f20396a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p172i4.HandlerC4889t.<init>(i4.i, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int mo20045g = this.f20397b.mo20045g(this.f20396a);
        if (this.f20397b.mo20047j(mo20045g)) {
            this.f20397b.m20051o(this.f20396a, mo20045g);
        }
    }
}
