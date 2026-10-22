package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p019b.C1030b;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C1030b {
    @Override // p019b.C1030b
    /* renamed from: a */
    protected void mo888a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.m928b(bundle);
        }
        if (i10 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("media_item")) {
                    Parcelable parcelable = bundle.getParcelable("media_item");
                    if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
