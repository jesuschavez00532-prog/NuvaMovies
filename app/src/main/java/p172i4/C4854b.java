package p172i4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import anet.channel.util.HttpConstant;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import p219l4.AbstractC5388m;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: i4.b */
/* loaded from: classes.dex */
public final class C4854b extends AbstractC5593a {

    /* renamed from: a */
    final int f20336a;

    /* renamed from: b */
    private final int f20337b;

    /* renamed from: c */
    private final PendingIntent f20338c;

    /* renamed from: d */
    private final String f20339d;

    /* renamed from: e */
    public static final C4854b f20335e = new C4854b(0);
    public static final Parcelable.Creator<C4854b> CREATOR = new C4890u();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4854b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f20336a = i10;
        this.f20337b = i11;
        this.f20338c = pendingIntent;
        this.f20339d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static String m20016o(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return HttpConstant.SUCCESS;
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4854b)) {
            return false;
        }
        C4854b c4854b = (C4854b) obj;
        if (this.f20337b == c4854b.f20337b && AbstractC5388m.m21771a(this.f20338c, c4854b.f20338c) && AbstractC5388m.m21771a(this.f20339d, c4854b.f20339d)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public int m20017g() {
        return this.f20337b;
    }

    public int hashCode() {
        return AbstractC5388m.m21772b(Integer.valueOf(this.f20337b), this.f20338c, this.f20339d);
    }

    /* renamed from: i */
    public String m20018i() {
        return this.f20339d;
    }

    /* renamed from: j */
    public PendingIntent m20019j() {
        return this.f20338c;
    }

    /* renamed from: k */
    public boolean m20020k() {
        return (this.f20337b == 0 || this.f20338c == null) ? false : true;
    }

    /* renamed from: n */
    public boolean m20021n() {
        return this.f20337b == 0;
    }

    public String toString() {
        AbstractC5388m.a m21773c = AbstractC5388m.m21773c(this);
        m21773c.m21774a("statusCode", m20016o(this.f20337b));
        m21773c.m21774a(C3325bt.f14284z, this.f20338c);
        m21773c.m21774a(Constants.SHARED_MESSAGE_ID_FILE, this.f20339d);
        return m21773c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, this.f20336a);
        AbstractC5595c.m22741i(parcel, 2, m20017g());
        AbstractC5595c.m22745m(parcel, 3, m20019j(), i10, false);
        AbstractC5595c.m22746n(parcel, 4, m20018i(), false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    public C4854b(int i10) {
        this(i10, null, null);
    }

    public C4854b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public C4854b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
