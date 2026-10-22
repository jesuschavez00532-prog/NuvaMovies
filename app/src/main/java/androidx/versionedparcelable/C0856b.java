package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import p214l.C5303a;

/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
class C0856b extends AbstractC0855a {

    /* renamed from: d */
    private final SparseIntArray f3640d;

    /* renamed from: e */
    private final Parcel f3641e;

    /* renamed from: f */
    private final int f3642f;

    /* renamed from: g */
    private final int f3643g;

    /* renamed from: h */
    private final String f3644h;

    /* renamed from: i */
    private int f3645i;

    /* renamed from: j */
    private int f3646j;

    /* renamed from: k */
    private int f3647k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0856b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C5303a(), new C5303a(), new C5303a());
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: A */
    public void mo4400A(byte[] bArr) {
        if (bArr != null) {
            this.f3641e.writeInt(bArr.length);
            this.f3641e.writeByteArray(bArr);
        } else {
            this.f3641e.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: C */
    protected void mo4402C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3641e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: E */
    public void mo4404E(int i10) {
        this.f3641e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: G */
    public void mo4406G(Parcelable parcelable) {
        this.f3641e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: I */
    public void mo4408I(String str) {
        this.f3641e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: a */
    public void mo4413a() {
        int i10 = this.f3645i;
        if (i10 >= 0) {
            int i11 = this.f3640d.get(i10);
            int dataPosition = this.f3641e.dataPosition();
            this.f3641e.setDataPosition(i11);
            this.f3641e.writeInt(dataPosition - i11);
            this.f3641e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: b */
    protected AbstractC0855a mo4414b() {
        Parcel parcel = this.f3641e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f3646j;
        if (i10 == this.f3642f) {
            i10 = this.f3643g;
        }
        return new C0856b(parcel, dataPosition, i10, this.f3644h + "  ", this.f3637a, this.f3638b, this.f3639c);
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: g */
    public boolean mo4416g() {
        if (this.f3641e.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: i */
    public byte[] mo4418i() {
        int readInt = this.f3641e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3641e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: k */
    protected CharSequence mo4420k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3641e);
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: m */
    public boolean mo4422m(int i10) {
        while (this.f3646j < this.f3643g) {
            int i11 = this.f3647k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f3641e.setDataPosition(this.f3646j);
            int readInt = this.f3641e.readInt();
            this.f3647k = this.f3641e.readInt();
            this.f3646j += readInt;
        }
        if (this.f3647k == i10) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: o */
    public int mo4424o() {
        return this.f3641e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: q */
    public Parcelable mo4426q() {
        return this.f3641e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: s */
    public String mo4428s() {
        return this.f3641e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: w */
    public void mo4432w(int i10) {
        mo4413a();
        this.f3645i = i10;
        this.f3640d.put(i10, this.f3641e.dataPosition());
        mo4404E(0);
        mo4404E(i10);
    }

    @Override // androidx.versionedparcelable.AbstractC0855a
    /* renamed from: y */
    public void mo4434y(boolean z10) {
        this.f3641e.writeInt(z10 ? 1 : 0);
    }

    private C0856b(Parcel parcel, int i10, int i11, String str, C5303a c5303a, C5303a c5303a2, C5303a c5303a3) {
        super(c5303a, c5303a2, c5303a3);
        this.f3640d = new SparseIntArray();
        this.f3645i = -1;
        this.f3647k = -1;
        this.f3641e = parcel;
        this.f3642f = i10;
        this.f3643g = i11;
        this.f3646j = i10;
        this.f3644h = str;
    }
}
