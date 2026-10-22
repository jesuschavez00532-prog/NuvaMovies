package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.u0 */
/* loaded from: classes.dex */
public final class C2713u0 {

    /* renamed from: a */
    private final SharedPreferences f10378a;

    /* renamed from: b */
    private final String f10379b;

    /* renamed from: c */
    private final String f10380c;

    /* renamed from: e */
    private final Executor f10382e;

    /* renamed from: d */
    final ArrayDeque f10381d = new ArrayDeque();

    /* renamed from: f */
    private boolean f10383f = false;

    private C2713u0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f10378a = sharedPreferences;
        this.f10379b = str;
        this.f10380c = str2;
        this.f10382e = executor;
    }

    /* renamed from: b */
    private boolean m11318b(boolean z10) {
        if (z10 && !this.f10383f) {
            m11322i();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C2713u0 m11319c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C2713u0 c2713u0 = new C2713u0(sharedPreferences, str, str2, executor);
        c2713u0.m11320d();
        return c2713u0;
    }

    /* renamed from: d */
    private void m11320d() {
        synchronized (this.f10381d) {
            this.f10381d.clear();
            String string = this.f10378a.getString(this.f10379b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f10380c)) {
                String[] split = string.split(this.f10380c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f10381d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m11321h() {
        synchronized (this.f10381d) {
            this.f10378a.edit().putString(this.f10379b, m11325g()).commit();
        }
    }

    /* renamed from: i */
    private void m11322i() {
        this.f10382e.execute(new Runnable() { // from class: com.google.firebase.messaging.t0
            @Override // java.lang.Runnable
            public final void run() {
                C2713u0.this.m11321h();
            }
        });
    }

    /* renamed from: e */
    public String m11323e() {
        String str;
        synchronized (this.f10381d) {
            str = (String) this.f10381d.peek();
        }
        return str;
    }

    /* renamed from: f */
    public boolean m11324f(Object obj) {
        boolean m11318b;
        synchronized (this.f10381d) {
            m11318b = m11318b(this.f10381d.remove(obj));
        }
        return m11318b;
    }

    /* renamed from: g */
    public String m11325g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f10381d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f10380c);
        }
        return sb2.toString();
    }
}
