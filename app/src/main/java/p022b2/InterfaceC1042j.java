package p022b2;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.manager.InterfaceC1628k;
import p003a2.InterfaceC0008d;
import p034c2.InterfaceC1344b;

/* renamed from: b2.j */
/* loaded from: classes.dex */
public interface InterfaceC1042j extends InterfaceC1628k {
    InterfaceC0008d getRequest();

    void getSize(InterfaceC1041i interfaceC1041i);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(Object obj, InterfaceC1344b interfaceC1344b);

    void removeCallback(InterfaceC1041i interfaceC1041i);

    void setRequest(InterfaceC0008d interfaceC0008d);
}
