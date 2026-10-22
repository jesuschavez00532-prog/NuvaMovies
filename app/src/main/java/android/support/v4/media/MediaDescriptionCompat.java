package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0241a();

    /* renamed from: a */
    private final String f761a;

    /* renamed from: b */
    private final CharSequence f762b;

    /* renamed from: c */
    private final CharSequence f763c;

    /* renamed from: d */
    private final CharSequence f764d;

    /* renamed from: e */
    private final Bitmap f765e;

    /* renamed from: f */
    private final Uri f766f;

    /* renamed from: g */
    private final Bundle f767g;

    /* renamed from: h */
    private final Uri f768h;

    /* renamed from: i */
    private MediaDescription f769i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    class C0241a implements Parcelable.Creator {
        C0241a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            Parcelable.Creator creator;
            if (Build.VERSION.SDK_INT >= 21) {
                creator = MediaDescription.CREATOR;
                return MediaDescriptionCompat.m891a(creator.createFromParcel(parcel));
            }
            return new MediaDescriptionCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: classes.dex */
    public static final class C0242b {

        /* renamed from: a */
        private String f770a;

        /* renamed from: b */
        private CharSequence f771b;

        /* renamed from: c */
        private CharSequence f772c;

        /* renamed from: d */
        private CharSequence f773d;

        /* renamed from: e */
        private Bitmap f774e;

        /* renamed from: f */
        private Uri f775f;

        /* renamed from: g */
        private Bundle f776g;

        /* renamed from: h */
        private Uri f777h;

        /* renamed from: a */
        public MediaDescriptionCompat m895a() {
            return new MediaDescriptionCompat(this.f770a, this.f771b, this.f772c, this.f773d, this.f774e, this.f775f, this.f776g, this.f777h);
        }

        /* renamed from: b */
        public C0242b m896b(CharSequence charSequence) {
            this.f773d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0242b m897c(Bundle bundle) {
            this.f776g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0242b m898d(Bitmap bitmap) {
            this.f774e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0242b m899e(Uri uri) {
            this.f775f = uri;
            return this;
        }

        /* renamed from: f */
        public C0242b m900f(String str) {
            this.f770a = str;
            return this;
        }

        /* renamed from: g */
        public C0242b m901g(Uri uri) {
            this.f777h = uri;
            return this;
        }

        /* renamed from: h */
        public C0242b m902h(CharSequence charSequence) {
            this.f772c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0242b m903i(CharSequence charSequence) {
            this.f771b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f761a = str;
        this.f762b = charSequence;
        this.f763c = charSequence2;
        this.f764d = charSequence3;
        this.f765e = bitmap;
        this.f766f = uri;
        this.f767g = bundle;
        this.f768h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat m891a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L85
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L85
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            android.media.MediaDescription r9 = android.support.v4.media.AbstractC0245a.m908a(r9)
            java.lang.String r3 = android.support.v4.media.AbstractC0247c.m910a(r9)
            r2.m900f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.AbstractC0248d.m911a(r9)
            r2.m903i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.AbstractC0249e.m912a(r9)
            r2.m902h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.AbstractC0250f.m913a(r9)
            r2.m896b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.AbstractC0251g.m914a(r9)
            r2.m898d(r3)
            android.net.Uri r3 = android.support.v4.media.AbstractC0252h.m915a(r9)
            r2.m899e(r3)
            android.os.Bundle r3 = android.support.v4.media.AbstractC0253i.m916a(r9)
            if (r3 == 0) goto L46
            android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.m928b(r3)
        L46:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L51
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L52
        L51:
            r5 = r0
        L52:
            if (r5 == 0) goto L6a
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L64
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L64
            goto L6b
        L64:
            r3.remove(r4)
            r3.remove(r6)
        L6a:
            r0 = r3
        L6b:
            r2.m897c(r0)
            if (r5 == 0) goto L74
            r2.m901g(r5)
            goto L7f
        L74:
            r0 = 23
            if (r1 < r0) goto L7f
            android.net.Uri r0 = android.support.v4.media.AbstractC0254j.m917a(r9)
            r2.m901g(r0)
        L7f:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.m895a()
            r0.f769i = r9
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m891a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object m892b() {
        int i10;
        MediaDescription build;
        MediaDescription mediaDescription = this.f769i;
        if (mediaDescription == null && (i10 = Build.VERSION.SDK_INT) >= 21) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f761a);
            builder.setTitle(this.f762b);
            builder.setSubtitle(this.f763c);
            builder.setDescription(this.f764d);
            builder.setIconBitmap(this.f765e);
            builder.setIconUri(this.f766f);
            Bundle bundle = this.f767g;
            if (i10 < 23 && this.f768h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f768h);
            }
            builder.setExtras(bundle);
            if (i10 >= 23) {
                builder.setMediaUri(this.f768h);
            }
            build = builder.build();
            this.f769i = build;
            return build;
        }
        return mediaDescription;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f762b) + ", " + ((Object) this.f763c) + ", " + ((Object) this.f764d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            AbstractC0245a.m908a(m892b()).writeToParcel(parcel, i10);
            return;
        }
        parcel.writeString(this.f761a);
        TextUtils.writeToParcel(this.f762b, parcel, i10);
        TextUtils.writeToParcel(this.f763c, parcel, i10);
        TextUtils.writeToParcel(this.f764d, parcel, i10);
        parcel.writeParcelable(this.f765e, i10);
        parcel.writeParcelable(this.f766f, i10);
        parcel.writeBundle(this.f767g);
        parcel.writeParcelable(this.f768h, i10);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f761a = parcel.readString();
        this.f762b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f763c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f764d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f765e = (Bitmap) parcel.readParcelable(classLoader);
        this.f766f = (Uri) parcel.readParcelable(classLoader);
        this.f767g = parcel.readBundle(classLoader);
        this.f768h = (Uri) parcel.readParcelable(classLoader);
    }
}
