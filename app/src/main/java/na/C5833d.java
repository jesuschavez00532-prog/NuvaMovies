package na;

import ac.C0158h;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import ca.InterfaceC1439a;
import com.module.R$array;
import com.request.result.GetAreaCodeResult;
import com.umeng.analytics.pro.C3384f;
import la.InterfaceC5537e;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p132fa.C4300d;
import p135fd.C4307b;
import p301qb.InterfaceC6392i;

/* renamed from: na.d */
/* loaded from: classes2.dex */
public final class C5833d implements InterfaceC1439a, InterfaceC6392i {

    /* renamed from: a */
    private InterfaceC5537e f23352a;

    /* renamed from: b */
    private final Context f23353b;

    /* renamed from: c */
    private final InterfaceC1312h f23354c;

    /* renamed from: na.d$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0158h invoke() {
            return new C0158h(C5833d.this);
        }
    }

    public C5833d(InterfaceC5537e interfaceC5537e, Context context) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f23352a = interfaceC5537e;
        this.f23353b = context;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f23354c = m5965b;
    }

    /* renamed from: E3 */
    private final C0158h m23591E3() {
        return (C0158h) this.f23354c.getValue();
    }

    /* renamed from: F3 */
    private final String m23592F3(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] stringArray = this.f23353b.getResources().getStringArray(R$array.nation);
        AbstractC5868k.m23673e(stringArray, "context.resources.getStringArray(R.array.nation)");
        String[] stringArray2 = this.f23353b.getResources().getStringArray(R$array.code);
        AbstractC5868k.m23673e(stringArray2, "context.resources.getStringArray(R.array.code)");
        int length = stringArray2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        while (i10 < length) {
            int i13 = i11 + 1;
            if (TextUtils.equals(stringArray2[i10], str)) {
                i12 = i11;
            }
            i10++;
            i11 = i13;
        }
        if (i12 == -1 || i12 >= stringArray.length) {
            return "";
        }
        String str2 = stringArray[i12];
        AbstractC5868k.m23673e(str2, "nations[findIndex]");
        return str2;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        InterfaceC5537e interfaceC5537e = this.f23352a;
        if (interfaceC5537e != null) {
            return interfaceC5537e.mo523N3();
        }
        return null;
    }

    @Override // p301qb.InterfaceC6392i
    /* renamed from: U3 */
    public void mo23593U3(GetAreaCodeResult getAreaCodeResult) {
        boolean z10 = false;
        AbstractC5868k.m23674f(getAreaCodeResult, "bean");
        String m23592F3 = m23592F3(getAreaCodeResult.getData().getAreaCode());
        InterfaceC5537e interfaceC5537e = this.f23352a;
        if (interfaceC5537e != null) {
            interfaceC5537e.mo22453a4(getAreaCodeResult.getData().getAreaCode(), m23592F3);
        }
        if (m23592F3.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            C4300d.f18678a.m17995A0(new Pair(m23592F3, getAreaCodeResult.getData().getAreaCode()));
        }
    }

    /* renamed from: Y0 */
    public void m23594Y0() {
        m23591E3().m605b();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6392i
    /* renamed from: v2 */
    public void mo23595v2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
    }
}
