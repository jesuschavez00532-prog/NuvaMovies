package p219l4;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p172i4.C4858d;
import p219l4.InterfaceC5376i;
import p233m4.AbstractC5593a;

/* renamed from: l4.f */
/* loaded from: classes.dex */
public class C5367f extends AbstractC5593a {
    public static final Parcelable.Creator<C5367f> CREATOR = new C5360c1();

    /* renamed from: o */
    static final Scope[] f21954o = new Scope[0];

    /* renamed from: p */
    static final C4858d[] f21955p = new C4858d[0];

    /* renamed from: a */
    final int f21956a;

    /* renamed from: b */
    final int f21957b;

    /* renamed from: c */
    int f21958c;

    /* renamed from: d */
    String f21959d;

    /* renamed from: e */
    IBinder f21960e;

    /* renamed from: f */
    Scope[] f21961f;

    /* renamed from: g */
    Bundle f21962g;

    /* renamed from: h */
    Account f21963h;

    /* renamed from: i */
    C4858d[] f21964i;

    /* renamed from: j */
    C4858d[] f21965j;

    /* renamed from: k */
    boolean f21966k;

    /* renamed from: l */
    int f21967l;

    /* renamed from: m */
    boolean f21968m;

    /* renamed from: n */
    private String f21969n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5367f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C4858d[] c4858dArr, C4858d[] c4858dArr2, boolean z10, int i13, boolean z11, String str2) {
        Account account2;
        scopeArr = scopeArr == null ? f21954o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c4858dArr = c4858dArr == null ? f21955p : c4858dArr;
        c4858dArr2 = c4858dArr2 == null ? f21955p : c4858dArr2;
        this.f21956a = i10;
        this.f21957b = i11;
        this.f21958c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f21959d = "com.google.android.gms";
        } else {
            this.f21959d = str;
        }
        if (i10 < 2) {
            if (iBinder != null) {
                account2 = AbstractBinderC5352a.m21642d(InterfaceC5376i.a.m21747c(iBinder));
            } else {
                account2 = null;
            }
            this.f21963h = account2;
        } else {
            this.f21960e = iBinder;
            this.f21963h = account;
        }
        this.f21961f = scopeArr;
        this.f21962g = bundle;
        this.f21964i = c4858dArr;
        this.f21965j = c4858dArr2;
        this.f21966k = z10;
        this.f21967l = i13;
        this.f21968m = z11;
        this.f21969n = str2;
    }

    /* renamed from: g */
    public final String m21727g() {
        return this.f21969n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5360c1.m21698a(this, parcel, i10);
    }
}
