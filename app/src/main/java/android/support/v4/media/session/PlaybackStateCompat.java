package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0270a();

    /* renamed from: a */
    final int f798a;

    /* renamed from: b */
    final long f799b;

    /* renamed from: c */
    final long f800c;

    /* renamed from: d */
    final float f801d;

    /* renamed from: e */
    final long f802e;

    /* renamed from: f */
    final int f803f;

    /* renamed from: g */
    final CharSequence f804g;

    /* renamed from: h */
    final long f805h;

    /* renamed from: i */
    List f806i;

    /* renamed from: j */
    final long f807j;

    /* renamed from: k */
    final Bundle f808k;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0269a();

        /* renamed from: a */
        private final String f809a;

        /* renamed from: b */
        private final CharSequence f810b;

        /* renamed from: c */
        private final int f811c;

        /* renamed from: d */
        private final Bundle f812d;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        class C0269a implements Parcelable.Creator {
            C0269a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f809a = parcel.readString();
            this.f810b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f811c = parcel.readInt();
            this.f812d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f810b) + ", mIcon=" + this.f811c + ", mExtras=" + this.f812d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f809a);
            TextUtils.writeToParcel(this.f810b, parcel, i10);
            parcel.writeInt(this.f811c);
            parcel.writeBundle(this.f812d);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    class C0270a implements Parcelable.Creator {
        C0270a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f798a = parcel.readInt();
        this.f799b = parcel.readLong();
        this.f801d = parcel.readFloat();
        this.f805h = parcel.readLong();
        this.f800c = parcel.readLong();
        this.f802e = parcel.readLong();
        this.f804g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f806i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f807j = parcel.readLong();
        this.f808k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f803f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f798a + ", position=" + this.f799b + ", buffered position=" + this.f800c + ", speed=" + this.f801d + ", updated=" + this.f805h + ", actions=" + this.f802e + ", error code=" + this.f803f + ", error message=" + this.f804g + ", custom actions=" + this.f806i + ", active item id=" + this.f807j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f798a);
        parcel.writeLong(this.f799b);
        parcel.writeFloat(this.f801d);
        parcel.writeLong(this.f805h);
        parcel.writeLong(this.f800c);
        parcel.writeLong(this.f802e);
        TextUtils.writeToParcel(this.f804g, parcel, i10);
        parcel.writeTypedList(this.f806i);
        parcel.writeLong(this.f807j);
        parcel.writeBundle(this.f808k);
        parcel.writeInt(this.f803f);
    }
}
