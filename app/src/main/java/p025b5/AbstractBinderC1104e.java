package p025b5;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC2064p0;
import com.google.android.gms.internal.measurement.AbstractC2079q0;
import com.google.android.gms.measurement.internal.C2267d;
import com.google.android.gms.measurement.internal.C2354k9;
import com.google.android.gms.measurement.internal.C2453t9;
import com.google.android.gms.measurement.internal.C2465v;
import java.util.List;

/* renamed from: b5.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1104e extends AbstractBinderC2064p0 implements InterfaceC1106f {
    public AbstractBinderC1104e() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC2064p0
    /* renamed from: a */
    protected final boolean mo5059a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                C2465v c2465v = (C2465v) AbstractC2079q0.m8774a(parcel, C2465v.CREATOR);
                C2453t9 c2453t9 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                mo5076v(c2465v, c2453t9);
                parcel2.writeNoException();
                return true;
            case 2:
                C2354k9 c2354k9 = (C2354k9) AbstractC2079q0.m8774a(parcel, C2354k9.CREATOR);
                C2453t9 c2453t92 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                mo5063D(c2354k9, c2453t92);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                C2453t9 c2453t93 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                mo5077x(c2453t93);
                parcel2.writeNoException();
                return true;
            case 5:
                C2465v c2465v2 = (C2465v) AbstractC2079q0.m8774a(parcel, C2465v.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC2079q0.m8776c(parcel);
                mo5062C(c2465v2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                C2453t9 c2453t94 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                mo5068j(c2453t94);
                parcel2.writeNoException();
                return true;
            case 7:
                C2453t9 c2453t95 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                boolean m8780g = AbstractC2079q0.m8780g(parcel);
                AbstractC2079q0.m8776c(parcel);
                List mo5072n = mo5072n(c2453t95, m8780g);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo5072n);
                return true;
            case 9:
                C2465v c2465v3 = (C2465v) AbstractC2079q0.m8774a(parcel, C2465v.CREATOR);
                String readString3 = parcel.readString();
                AbstractC2079q0.m8776c(parcel);
                byte[] mo5073p = mo5073p(c2465v3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(mo5073p);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                AbstractC2079q0.m8776c(parcel);
                mo5061B(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                C2453t9 c2453t96 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                String mo5074r = mo5074r(c2453t96);
                parcel2.writeNoException();
                parcel2.writeString(mo5074r);
                return true;
            case 12:
                C2267d c2267d = (C2267d) AbstractC2079q0.m8774a(parcel, C2267d.CREATOR);
                C2453t9 c2453t97 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                mo5067I(c2267d, c2453t97);
                parcel2.writeNoException();
                return true;
            case 13:
                C2267d c2267d2 = (C2267d) AbstractC2079q0.m8774a(parcel, C2267d.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                mo5071m(c2267d2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean m8780g2 = AbstractC2079q0.m8780g(parcel);
                C2453t9 c2453t98 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                List mo5065F = mo5065F(readString7, readString8, m8780g2, c2453t98);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo5065F);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean m8780g3 = AbstractC2079q0.m8780g(parcel);
                AbstractC2079q0.m8776c(parcel);
                List mo5070l = mo5070l(readString9, readString10, readString11, m8780g3);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo5070l);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                C2453t9 c2453t99 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                List mo5078y = mo5078y(readString12, readString13, c2453t99);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo5078y);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                AbstractC2079q0.m8776c(parcel);
                List mo5075s = mo5075s(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo5075s);
                return true;
            case 18:
                C2453t9 c2453t910 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                mo5066G(c2453t910);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
                C2453t9 c2453t911 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                mo5069k(bundle, c2453t911);
                parcel2.writeNoException();
                return true;
            case 20:
                C2453t9 c2453t912 = (C2453t9) AbstractC2079q0.m8774a(parcel, C2453t9.CREATOR);
                AbstractC2079q0.m8776c(parcel);
                mo5064E(c2453t912);
                parcel2.writeNoException();
                return true;
        }
    }
}
