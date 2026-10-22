package p219l4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: l4.r */
/* loaded from: classes.dex */
public class C5402r extends AbstractC5593a {
    public static final Parcelable.Creator<C5402r> CREATOR = new C5410v();

    /* renamed from: a */
    private final int f22037a;

    /* renamed from: b */
    private List f22038b;

    public C5402r(int i10, List list) {
        this.f22037a = i10;
        this.f22038b = list;
    }

    /* renamed from: g */
    public final int m21805g() {
        return this.f22037a;
    }

    /* renamed from: i */
    public final List m21806i() {
        return this.f22038b;
    }

    /* renamed from: j */
    public final void m21807j(C5385l c5385l) {
        if (this.f22038b == null) {
            this.f22038b = new ArrayList();
        }
        this.f22038b.add(c5385l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, this.f22037a);
        AbstractC5595c.m22749q(parcel, 2, this.f22038b, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }
}
