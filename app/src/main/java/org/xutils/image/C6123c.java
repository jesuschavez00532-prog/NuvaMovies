package org.xutils.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: org.xutils.image.c */
/* loaded from: classes3.dex */
final class C6123c extends BitmapDrawable implements InterfaceC6124d {

    /* renamed from: a */
    private C6122b f24109a;

    public C6123c(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // org.xutils.image.InterfaceC6124d
    public C6122b getMemCacheKey() {
        return this.f24109a;
    }

    @Override // org.xutils.image.InterfaceC6124d
    public void setMemCacheKey(C6122b c6122b) {
        this.f24109a = c6122b;
    }
}
