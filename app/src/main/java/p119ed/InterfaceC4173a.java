package p119ed;

import android.view.Surface;
import android.view.View;

/* renamed from: ed.a */
/* loaded from: classes3.dex */
public interface InterfaceC4173a {

    /* renamed from: ed.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo815a(b bVar);

        /* renamed from: b */
        void mo816b(int i10, int i11);

        /* renamed from: c */
        void mo817c(b bVar, int i10, int i11, int i12);

        /* renamed from: d */
        void mo818d(b bVar, int i10, int i11);
    }

    /* renamed from: ed.a$b */
    /* loaded from: classes3.dex */
    public interface b {
        InterfaceC4173a getRenderView();

        Surface openSurface();
    }

    /* renamed from: a */
    void mo17445a(a aVar);

    /* renamed from: b */
    void mo17446b(a aVar);

    View getView();

    void setAspectRatio(int i10);

    void setVideoRotation(int i10);

    void setVideoSize(int i10, int i11);
}
