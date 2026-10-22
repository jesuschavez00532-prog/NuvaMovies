package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.C1593a;
import com.module.utils.glide.MyOkHttpGlideModule;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    private final MyOkHttpGlideModule f6217a = new MyOkHttpGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.module.utils.glide.MyOkHttpGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
        }
    }

    @Override // p407y1.AbstractC7659c
    /* renamed from: a */
    public void mo7270a(Context context, ComponentCallbacks2C1586c componentCallbacks2C1586c, C1592i c1592i) {
        new C1593a().mo7270a(context, componentCallbacks2C1586c, c1592i);
        this.f6217a.mo7270a(context, componentCallbacks2C1586c, c1592i);
    }

    @Override // p407y1.AbstractC7657a
    /* renamed from: b */
    public void mo7271b(Context context, C1587d c1587d) {
        this.f6217a.mo7271b(context, c1587d);
    }

    @Override // p407y1.AbstractC7657a
    /* renamed from: c */
    public boolean mo7272c() {
        return this.f6217a.mo7272c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: d */
    public Set mo7268d() {
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1584a mo7269e() {
        return new C1584a();
    }
}
