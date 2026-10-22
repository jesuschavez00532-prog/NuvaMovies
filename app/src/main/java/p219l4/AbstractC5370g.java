package p219l4;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p172i4.C4868i;
import p187j4.AbstractC4991e;
import p187j4.C4987a;
import p203k4.InterfaceC5106c;
import p203k4.InterfaceC5111h;

/* renamed from: l4.g */
/* loaded from: classes.dex */
public abstract class AbstractC5370g extends AbstractC5358c implements C4987a.f {

    /* renamed from: F */
    private final C5361d f21977F;

    /* renamed from: G */
    private final Set f21978G;

    /* renamed from: H */
    private final Account f21979H;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5370g(Context context, Looper looper, int i10, C5361d c5361d, AbstractC4991e.a aVar, AbstractC4991e.b bVar) {
        this(context, looper, i10, c5361d, (InterfaceC5106c) aVar, (InterfaceC5111h) bVar);
    }

    /* renamed from: j0 */
    private final Set m21738j0(Set set) {
        Set m21739i0 = m21739i0(set);
        Iterator it = m21739i0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return m21739i0;
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: B */
    protected final Set mo21662B() {
        return this.f21978G;
    }

    @Override // p187j4.C4987a.f
    /* renamed from: a */
    public Set mo20348a() {
        if (mo16774l()) {
            return this.f21978G;
        }
        return Collections.emptySet();
    }

    /* renamed from: i0 */
    protected Set m21739i0(Set set) {
        return set;
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: t */
    public final Account mo21692t() {
        return this.f21979H;
    }

    @Override // p219l4.AbstractC5358c
    /* renamed from: v */
    protected final Executor mo21694v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5370g(Context context, Looper looper, int i10, C5361d c5361d, InterfaceC5106c interfaceC5106c, InterfaceC5111h interfaceC5111h) {
        this(context, looper, AbstractC5373h.m21741b(context), C4868i.m20041m(), i10, c5361d, (InterfaceC5106c) AbstractC5391n.m21783i(interfaceC5106c), (InterfaceC5111h) AbstractC5391n.m21783i(interfaceC5111h));
    }

    protected AbstractC5370g(Context context, Looper looper, AbstractC5373h abstractC5373h, C4868i c4868i, int i10, C5361d c5361d, InterfaceC5106c interfaceC5106c, InterfaceC5111h interfaceC5111h) {
        super(context, looper, abstractC5373h, c4868i, i10, interfaceC5106c == null ? null : new C5359c0(interfaceC5106c), interfaceC5111h == null ? null : new C5362d0(interfaceC5111h), c5361d.m21706h());
        this.f21977F = c5361d;
        this.f21979H = c5361d.m21699a();
        this.f21978G = m21738j0(c5361d.m21701c());
    }
}
