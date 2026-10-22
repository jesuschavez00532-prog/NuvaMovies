package anet.channel.request;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: anet.channel.request.a */
/* loaded from: classes.dex */
final class C0955a implements Parcelable.Creator<ByteArrayEntry> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ByteArrayEntry createFromParcel(Parcel parcel) {
        byte[] bArr;
        ByteArrayEntry byteArrayEntry = new ByteArrayEntry((C0955a) null);
        byteArrayEntry.bytes = new byte[parcel.readInt()];
        bArr = byteArrayEntry.bytes;
        parcel.readByteArray(bArr);
        byteArrayEntry.offset = parcel.readInt();
        byteArrayEntry.count = parcel.readInt();
        byteArrayEntry.contentType = parcel.readString();
        return byteArrayEntry;
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ByteArrayEntry[] newArray(int i10) {
        return new ByteArrayEntry[i10];
    }
}
