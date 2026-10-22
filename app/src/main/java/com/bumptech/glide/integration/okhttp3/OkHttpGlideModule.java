package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.C1587d;
import com.bumptech.glide.C1592i;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.integration.okhttp3.C1594b;
import java.io.InputStream;
import p278p1.C6169i;
import p407y1.InterfaceC7658b;

@Deprecated
/* loaded from: classes.dex */
public class OkHttpGlideModule implements InterfaceC7658b {
    @Override // p407y1.InterfaceC7658b
    /* renamed from: a */
    public void mo7340a(Context context, C1587d c1587d) {
    }

    @Override // p407y1.InterfaceC7658b
    /* renamed from: b */
    public void mo7341b(Context context, ComponentCallbacks2C1586c componentCallbacks2C1586c, C1592i c1592i) {
        c1592i.m7338r(C6169i.class, InputStream.class, new C1594b.a());
    }
}
