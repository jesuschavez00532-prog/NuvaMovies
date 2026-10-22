package p020b0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1031a implements Parcelable {

    /* renamed from: a */
    private final Parcelable f4268a;

    /* renamed from: b */
    public static final AbstractC1031a f4267b = new a();
    public static final Parcelable.Creator<AbstractC1031a> CREATOR = new b();

    /* renamed from: b0.a$a */
    /* loaded from: classes.dex */
    static class a extends AbstractC1031a {
        a() {
            super((a) null);
        }
    }

    /* renamed from: b0.a$b */
    /* loaded from: classes.dex */
    static class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1031a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC1031a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC1031a.f4267b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC1031a[] newArray(int i10) {
            return new AbstractC1031a[i10];
        }
    }

    /* synthetic */ AbstractC1031a(a aVar) {
        this();
    }

    /* renamed from: a */
    public final Parcelable m4828a() {
        return this.f4268a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f4268a, i10);
    }

    private AbstractC1031a() {
        this.f4268a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1031a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4268a = parcelable == f4267b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1031a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f4268a = readParcelable == null ? f4267b : readParcelable;
    }
}
