package p172i4;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p219l4.AbstractBinderC5396o1;
import p219l4.AbstractC5391n;
import p219l4.InterfaceC5399p1;
import p325s4.BinderC6676b;
import p325s4.InterfaceC6675a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i4.c0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4857c0 extends AbstractBinderC5396o1 {

    /* renamed from: a */
    private final int f20343a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC4857c0(byte[] bArr) {
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC5391n.m21775a(z10);
        this.f20343a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public static byte[] m20023M(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public abstract byte[] mo20024N();

    public final boolean equals(Object obj) {
        InterfaceC6675a mo20026g;
        if (obj != null && (obj instanceof InterfaceC5399p1)) {
            try {
                InterfaceC5399p1 interfaceC5399p1 = (InterfaceC5399p1) obj;
                if (interfaceC5399p1.mo20025f() != this.f20343a || (mo20026g = interfaceC5399p1.mo20026g()) == null) {
                    return false;
                }
                return Arrays.equals(mo20024N(), (byte[]) BinderC6676b.m26054d(mo20026g));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    @Override // p219l4.InterfaceC5399p1
    /* renamed from: f */
    public final int mo20025f() {
        return this.f20343a;
    }

    @Override // p219l4.InterfaceC5399p1
    /* renamed from: g */
    public final InterfaceC6675a mo20026g() {
        return BinderC6676b.m26053M(mo20024N());
    }

    public final int hashCode() {
        return this.f20343a;
    }
}
