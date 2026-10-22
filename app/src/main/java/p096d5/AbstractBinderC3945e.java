package p096d5;

import android.os.Parcel;
import p365v4.AbstractBinderC7203b;
import p365v4.AbstractC7204c;

/* renamed from: d5.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3945e extends AbstractBinderC7203b implements InterfaceC3946f {
    public AbstractBinderC3945e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p365v4.AbstractBinderC7203b
    /* renamed from: M */
    protected final boolean mo16776M(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                AbstractC7204c.m27900b(parcel);
                break;
            case 4:
                AbstractC7204c.m27900b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC7204c.m27900b(parcel);
                break;
            case 7:
                AbstractC7204c.m27900b(parcel);
                break;
            case 8:
                C3952l c3952l = (C3952l) AbstractC7204c.m27899a(parcel, C3952l.CREATOR);
                AbstractC7204c.m27900b(parcel);
                mo16777w(c3952l);
                break;
            case 9:
                AbstractC7204c.m27900b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
