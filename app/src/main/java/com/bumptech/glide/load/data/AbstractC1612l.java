package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.FileNotFoundException;
import java.io.IOException;
import p184j1.EnumC4970a;

/* renamed from: com.bumptech.glide.load.data.l */
/* loaded from: classes.dex */
public abstract class AbstractC1612l implements InterfaceC1604d {

    /* renamed from: a */
    private final Uri f6416a;

    /* renamed from: b */
    private final ContentResolver f6417b;

    /* renamed from: c */
    private Object f6418c;

    public AbstractC1612l(ContentResolver contentResolver, Uri uri) {
        this.f6417b = contentResolver;
        this.f6416a = uri;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: b */
    public void mo7423b() {
        Object obj = this.f6418c;
        if (obj != null) {
            try {
                mo7419c(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    protected abstract void mo7419c(Object obj);

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: d */
    public final void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
        try {
            Object mo7420e = mo7420e(this.f6416a, this.f6417b);
            this.f6418c = mo7420e;
            aVar.mo7431e(mo7420e);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.mo7430c(e10);
        }
    }

    /* renamed from: e */
    protected abstract Object mo7420e(Uri uri, ContentResolver contentResolver);

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    public EnumC4970a getDataSource() {
        return EnumC4970a.LOCAL;
    }
}
