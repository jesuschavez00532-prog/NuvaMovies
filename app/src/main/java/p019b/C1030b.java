package p019b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p019b.InterfaceC1029a;

/* renamed from: b.b */
/* loaded from: classes.dex */
public class C1030b implements Parcelable {
    public static final Parcelable.Creator<C1030b> CREATOR = new a();

    /* renamed from: a */
    final boolean f4260a = false;

    /* renamed from: b */
    final Handler f4261b = null;

    /* renamed from: c */
    InterfaceC1029a f4262c;

    /* renamed from: b.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1030b createFromParcel(Parcel parcel) {
            return new C1030b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1030b[] newArray(int i10) {
            return new C1030b[i10];
        }
    }

    /* renamed from: b.b$b */
    /* loaded from: classes.dex */
    class b extends InterfaceC1029a.a {
        b() {
        }

        @Override // p019b.InterfaceC1029a
        /* renamed from: L */
        public void mo4824L(int i10, Bundle bundle) {
            C1030b c1030b = C1030b.this;
            Handler handler = c1030b.f4261b;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                c1030b.mo888a(i10, bundle);
            }
        }
    }

    /* renamed from: b.b$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a */
        final int f4264a;

        /* renamed from: b */
        final Bundle f4265b;

        c(int i10, Bundle bundle) {
            this.f4264a = i10;
            this.f4265b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1030b.this.mo888a(this.f4264a, this.f4265b);
        }
    }

    C1030b(Parcel parcel) {
        this.f4262c = InterfaceC1029a.a.m4825a(parcel.readStrongBinder());
    }

    /* renamed from: a */
    protected void mo888a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f4262c == null) {
                this.f4262c = new b();
            }
            parcel.writeStrongBinder(this.f4262c.asBinder());
        }
    }
}
