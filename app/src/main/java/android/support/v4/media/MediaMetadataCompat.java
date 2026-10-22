package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p214l.C5303a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: b */
    static final C5303a f778b;

    /* renamed from: c */
    private static final String[] f779c;

    /* renamed from: d */
    private static final String[] f780d;

    /* renamed from: e */
    private static final String[] f781e;

    /* renamed from: a */
    final Bundle f782a;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    /* loaded from: classes.dex */
    class C0243a implements Parcelable.Creator {
        C0243a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        C5303a c5303a = new C5303a();
        f778b = c5303a;
        c5303a.put("android.media.metadata.TITLE", 1);
        c5303a.put("android.media.metadata.ARTIST", 1);
        c5303a.put("android.media.metadata.DURATION", 0);
        c5303a.put("android.media.metadata.ALBUM", 1);
        c5303a.put("android.media.metadata.AUTHOR", 1);
        c5303a.put("android.media.metadata.WRITER", 1);
        c5303a.put("android.media.metadata.COMPOSER", 1);
        c5303a.put("android.media.metadata.COMPILATION", 1);
        c5303a.put("android.media.metadata.DATE", 1);
        c5303a.put("android.media.metadata.YEAR", 0);
        c5303a.put("android.media.metadata.GENRE", 1);
        c5303a.put("android.media.metadata.TRACK_NUMBER", 0);
        c5303a.put("android.media.metadata.NUM_TRACKS", 0);
        c5303a.put("android.media.metadata.DISC_NUMBER", 0);
        c5303a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c5303a.put("android.media.metadata.ART", 2);
        c5303a.put("android.media.metadata.ART_URI", 1);
        c5303a.put("android.media.metadata.ALBUM_ART", 2);
        c5303a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c5303a.put("android.media.metadata.USER_RATING", 3);
        c5303a.put("android.media.metadata.RATING", 3);
        c5303a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c5303a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c5303a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c5303a.put("android.media.metadata.DISPLAY_ICON", 2);
        c5303a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c5303a.put("android.media.metadata.MEDIA_ID", 1);
        c5303a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c5303a.put("android.media.metadata.MEDIA_URI", 1);
        c5303a.put("android.media.metadata.ADVERTISEMENT", 0);
        c5303a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f779c = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f780d = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f781e = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C0243a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f782a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f782a);
    }
}
