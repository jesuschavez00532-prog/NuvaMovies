package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p019b.C1030b;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C1030b {
    @Override // p019b.C1030b
    /* renamed from: a */
    protected void mo888a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.m928b(bundle);
        }
        if (i10 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("search_results")) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                    parcelableArray.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
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
