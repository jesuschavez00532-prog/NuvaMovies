package p096d5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: d5.b */
/* loaded from: classes.dex */
public final class C3942b extends AbstractC5593a {
    public static final Parcelable.Creator<C3942b> CREATOR = new C3943c();

    /* renamed from: a */
    final int f17621a;

    /* renamed from: b */
    private int f17622b;

    /* renamed from: c */
    private Intent f17623c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3942b(int i10, int i11, Intent intent) {
        this.f17621a = i10;
        this.f17622b = i11;
        this.f17623c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, this.f17621a);
        AbstractC5595c.m22741i(parcel, 2, this.f17622b);
        AbstractC5595c.m22745m(parcel, 3, this.f17623c, i10, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
