package p416ya;

import android.content.Context;
import com.bumptech.glide.ComponentCallbacks2C1586c;
import com.bumptech.glide.ComponentCallbacks2C1597l;
import com.bumptech.glide.manager.InterfaceC1627j;
import com.bumptech.glide.manager.InterfaceC1632o;
import java.io.File;
import p003a2.C0012h;

/* renamed from: ya.d */
/* loaded from: classes2.dex */
public class C7694d extends ComponentCallbacks2C1597l {
    public C7694d(ComponentCallbacks2C1586c componentCallbacks2C1586c, InterfaceC1627j interfaceC1627j, InterfaceC1632o interfaceC1632o, Context context) {
        super(componentCallbacks2C1586c, interfaceC1627j, interfaceC1632o, context);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1597l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C7693c mo7386l(File file) {
        return (C7693c) super.mo7386l(file);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1597l
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C7693c mo7387m(Object obj) {
        return (C7693c) super.mo7387m(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.ComponentCallbacks2C1597l
    /* renamed from: r */
    public void mo7392r(C0012h c0012h) {
        if (c0012h instanceof C7692b) {
            super.mo7392r(c0012h);
        } else {
            super.mo7392r(new C7692b().mo43a(c0012h));
        }
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1597l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C7693c mo7376a(Class cls) {
        return new C7693c(this.f6363a, this, cls, this.f6364b);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1597l
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C7693c mo7377b() {
        return (C7693c) super.mo7377b();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1597l
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C7693c mo7378c() {
        return (C7693c) super.mo7378c();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1597l
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C7693c mo7379d() {
        return (C7693c) super.mo7379d();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C1597l
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C7693c mo7382h() {
        return (C7693c) super.mo7382h();
    }
}
