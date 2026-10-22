package p096d5;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p037c5.InterfaceC1363e;
import p143g4.C4345a;
import p172i4.AbstractC4884q;
import p172i4.C4854b;
import p187j4.AbstractC4991e;
import p219l4.AbstractC5358c;
import p219l4.AbstractC5370g;
import p219l4.AbstractC5391n;
import p219l4.C5361d;
import p219l4.C5371g0;

/* renamed from: d5.a */
/* loaded from: classes.dex */
public class C3941a extends AbstractC5370g implements InterfaceC1363e {

    /* renamed from: M */
    public static final /* synthetic */ int f17616M = 0;

    /* renamed from: I */
    private final boolean f17617I;

    /* renamed from: J */
    private final C5361d f17618J;

    /* renamed from: K */
    private final Bundle f17619K;

    /* renamed from: L */
    private final Integer f17620L;

    public C3941a(Context context, Looper looper, boolean z10, C5361d c5361d, Bundle bundle, AbstractC4991e.a aVar, AbstractC4991e.b bVar) {
        super(context, looper, 44, c5361d, aVar, bVar);
        this.f17617I = true;
        this.f17618J = c5361d;
        this.f17619K = bundle;
        this.f17620L = c5361d.m21705g();
    }

    /* renamed from: k0 */
    public static Bundle m16773k0(C5361d c5361d) {
        c5361d.m21704f();
        Integer m21705g = c5361d.m21705g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c5361d.m21699a());
        if (m21705g != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m21705g.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p219l4.AbstractC5358c
    /* renamed from: D */
    public final String mo9656D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: E */
    protected final String mo9657E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: i */
    public final int mo9658i() {
        return AbstractC4884q.f20380a;
    }

    @Override // p219l4.AbstractC5358c, p187j4.C4987a.f
    /* renamed from: l */
    public final boolean mo16774l() {
        return this.f17617I;
    }

    @Override // p037c5.InterfaceC1363e
    /* renamed from: m */
    public final void mo6139m(InterfaceC3946f interfaceC3946f) {
        GoogleSignInAccount googleSignInAccount;
        AbstractC5391n.m21784j(interfaceC3946f, "Expecting a valid ISignInCallbacks");
        try {
            Account m21700b = this.f17618J.m21700b();
            if ("<<default account>>".equals(m21700b.name)) {
                googleSignInAccount = C4345a.m18238a(m21696x()).m18240b();
            } else {
                googleSignInAccount = null;
            }
            ((C3947g) m21663C()).m16778O(new C3950j(1, new C5371g0(m21700b, ((Integer) AbstractC5391n.m21783i(this.f17620L)).intValue(), googleSignInAccount)), interfaceC3946f);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC3946f.mo16777w(new C3952l(1, new C4854b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // p037c5.InterfaceC1363e
    /* renamed from: n */
    public final void mo6140n() {
        m21684g(new AbstractC5358c.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p219l4.AbstractC5358c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo9659r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C3947g) {
            return (C3947g) queryLocalInterface;
        }
        return new C3947g(iBinder);
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: z */
    protected final Bundle mo16775z() {
        if (!m21696x().getPackageName().equals(this.f17618J.m21702d())) {
            this.f17619K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f17618J.m21702d());
        }
        return this.f17619K;
    }
}
