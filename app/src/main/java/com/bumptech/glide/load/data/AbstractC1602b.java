package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC1591h;
import com.bumptech.glide.load.data.InterfaceC1604d;
import java.io.IOException;
import p184j1.EnumC4970a;

/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes.dex */
public abstract class AbstractC1602b implements InterfaceC1604d {

    /* renamed from: a */
    private final String f6392a;

    /* renamed from: b */
    private final AssetManager f6393b;

    /* renamed from: c */
    private Object f6394c;

    public AbstractC1602b(AssetManager assetManager, String str) {
        this.f6393b = assetManager;
        this.f6392a = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: b */
    public void mo7423b() {
        Object obj = this.f6394c;
        if (obj == null) {
            return;
        }
        try {
            mo7424c(obj);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    protected abstract void mo7424c(Object obj);

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: d */
    public void mo7425d(EnumC1591h enumC1591h, InterfaceC1604d.a aVar) {
        try {
            Object mo7426e = mo7426e(this.f6393b, this.f6392a);
            this.f6394c = mo7426e;
            aVar.mo7431e(mo7426e);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.mo7430c(e10);
        }
    }

    /* renamed from: e */
    protected abstract Object mo7426e(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    public EnumC4970a getDataSource() {
        return EnumC4970a.LOCAL;
    }
}
