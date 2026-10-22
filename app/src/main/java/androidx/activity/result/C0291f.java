package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.activity.result.f */
/* loaded from: classes.dex */
public final class C0291f implements Parcelable {
    public static final Parcelable.Creator<C0291f> CREATOR = new a();

    /* renamed from: a */
    private final IntentSender f876a;

    /* renamed from: b */
    private final Intent f877b;

    /* renamed from: c */
    private final int f878c;

    /* renamed from: d */
    private final int f879d;

    /* renamed from: androidx.activity.result.f$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0291f createFromParcel(Parcel parcel) {
            return new C0291f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0291f[] newArray(int i10) {
            return new C0291f[i10];
        }
    }

    /* renamed from: androidx.activity.result.f$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private IntentSender f880a;

        /* renamed from: b */
        private Intent f881b;

        /* renamed from: c */
        private int f882c;

        /* renamed from: d */
        private int f883d;

        public b(IntentSender intentSender) {
            this.f880a = intentSender;
        }

        /* renamed from: a */
        public C0291f m991a() {
            return new C0291f(this.f880a, this.f881b, this.f882c, this.f883d);
        }

        /* renamed from: b */
        public b m992b(Intent intent) {
            this.f881b = intent;
            return this;
        }

        /* renamed from: c */
        public b m993c(int i10, int i11) {
            this.f883d = i10;
            this.f882c = i11;
            return this;
        }
    }

    C0291f(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f876a = intentSender;
        this.f877b = intent;
        this.f878c = i10;
        this.f879d = i11;
    }

    /* renamed from: a */
    public Intent m985a() {
        return this.f877b;
    }

    /* renamed from: b */
    public int m986b() {
        return this.f878c;
    }

    /* renamed from: d */
    public int m987d() {
        return this.f879d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public IntentSender m988e() {
        return this.f876a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f876a, i10);
        parcel.writeParcelable(this.f877b, i10);
        parcel.writeInt(this.f878c);
        parcel.writeInt(this.f879d);
    }

    C0291f(Parcel parcel) {
        this.f876a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f877b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f878c = parcel.readInt();
        this.f879d = parcel.readInt();
    }
}
