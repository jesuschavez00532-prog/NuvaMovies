package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p127f5.AbstractC4245i;
import p127f5.C4247j;
import p219l4.AbstractC5391n;

/* renamed from: com.google.firebase.messaging.c0 */
/* loaded from: classes.dex */
public class C2670c0 implements Closeable {

    /* renamed from: a */
    private final URL f10275a;

    /* renamed from: b */
    private volatile Future f10276b;

    /* renamed from: c */
    private AbstractC4245i f10277c;

    private C2670c0(URL url) {
        this.f10275a = url;
    }

    /* renamed from: c */
    private byte[] m11141c() {
        URLConnection openConnection = this.f10275a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] m11126d = AbstractC2666b.m11126d(AbstractC2666b.m11124b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + m11126d.length + " bytes from " + this.f10275a);
                }
                if (m11126d.length <= 1048576) {
                    return m11126d;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    /* renamed from: d */
    public static C2670c0 m11142d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C2670c0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m11143f(C4247j c4247j) {
        try {
            c4247j.m17726c(m11144b());
        } catch (Exception e10) {
            c4247j.m17725b(e10);
        }
    }

    /* renamed from: b */
    public Bitmap m11144b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f10275a);
        }
        byte[] m11141c = m11141c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m11141c, 0, m11141c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f10275a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f10275a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10276b.cancel(true);
    }

    /* renamed from: e */
    public AbstractC4245i m11145e() {
        return (AbstractC4245i) AbstractC5391n.m21783i(this.f10277c);
    }

    /* renamed from: h */
    public void m11146h(ExecutorService executorService) {
        final C4247j c4247j = new C4247j();
        this.f10276b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.b0
            @Override // java.lang.Runnable
            public final void run() {
                C2670c0.this.m11143f(c4247j);
            }
        });
        this.f10277c = c4247j.m17724a();
    }
}
