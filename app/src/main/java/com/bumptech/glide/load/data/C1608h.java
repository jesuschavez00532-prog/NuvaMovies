package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* renamed from: com.bumptech.glide.load.data.h */
/* loaded from: classes.dex */
public class C1608h extends AbstractC1602b {
    public C1608h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1604d
    /* renamed from: a */
    public Class mo7418a() {
        return AssetFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC1602b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo7424c(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC1602b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo7426e(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
