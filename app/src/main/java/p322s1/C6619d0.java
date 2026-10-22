package p322s1;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import p184j1.C4977h;
import p184j1.InterfaceC4979j;
import p216l1.InterfaceC5335v;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: s1.d0 */
/* loaded from: classes.dex */
public final class C6619d0 implements InterfaceC4979j {

    /* renamed from: a */
    private final C6646u f25424a;

    public C6619d0(C6646u c6646u) {
        this.f25424a = c6646u;
    }

    /* renamed from: e */
    private boolean m25839e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= IjkMediaMeta.AV_CH_STEREO_LEFT) {
            return true;
        }
        return false;
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5335v mo20329a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C4977h c4977h) {
        return this.f25424a.m25953d(parcelFileDescriptor, i10, i11, c4977h);
    }

    @Override // p184j1.InterfaceC4979j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo20330b(ParcelFileDescriptor parcelFileDescriptor, C4977h c4977h) {
        if (m25839e(parcelFileDescriptor) && this.f25424a.m25956o(parcelFileDescriptor)) {
            return true;
        }
        return false;
    }
}
