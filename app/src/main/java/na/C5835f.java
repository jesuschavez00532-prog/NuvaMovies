package na;

import ac.C0145d2;
import ac.C0149e2;
import ca.InterfaceC1439a;
import com.request.result.AssetList;
import com.request.result.Channel;
import com.request.result.GetLiveDataResultData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import la.InterfaceC5539g;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p135fd.C4307b;
import p301qb.InterfaceC6385f1;
import p301qb.InterfaceC6388g1;
import p317rb.AbstractC6567a;
import p399x9.C7550y;

/* renamed from: na.f */
/* loaded from: classes2.dex */
public final class C5835f implements InterfaceC1439a, InterfaceC6388g1, InterfaceC6385f1 {

    /* renamed from: j */
    private static final int f23360j = 0;

    /* renamed from: a */
    private InterfaceC5539g f23364a;

    /* renamed from: b */
    private final String f23365b;

    /* renamed from: c */
    private int f23366c;

    /* renamed from: d */
    private int f23367d;

    /* renamed from: e */
    private int f23368e;

    /* renamed from: f */
    private String f23369f;

    /* renamed from: g */
    private C0149e2 f23370g;

    /* renamed from: h */
    private C0145d2 f23371h;

    /* renamed from: i */
    public static final a f23359i = new a(null);

    /* renamed from: k */
    private static final int f23361k = 1;

    /* renamed from: l */
    private static final int f23362l = 2;

    /* renamed from: m */
    private static final int f23363m = 20;

    /* renamed from: na.f$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    public C5835f(InterfaceC5539g interfaceC5539g) {
        AbstractC5868k.m23674f(interfaceC5539g, "view");
        this.f23364a = interfaceC5539g;
        this.f23365b = C5835f.class.getSimpleName();
        this.f23366c = f23360j;
        this.f23367d = 1;
        this.f23368e = 1;
        this.f23369f = "";
        this.f23370g = new C0149e2(this);
        this.f23371h = new C0145d2(this);
    }

    /* renamed from: E3 */
    private final void m23602E3() {
        this.f23364a.mo19751d1();
        this.f23370g.m566e(this.f23369f, this.f23367d);
    }

    /* renamed from: G3 */
    private final void m23603G3() {
        this.f23364a.mo19751d1();
        this.f23371h.m552d(-1, this.f23369f, "1", f23363m, this.f23367d, "");
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    /* renamed from: F3 */
    public void m23604F3() {
        int i10 = this.f23367d + 1;
        this.f23367d = i10;
        if (i10 > this.f23368e) {
            return;
        }
        if (this.f23366c == f23361k) {
            m23602E3();
        } else {
            m23603G3();
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f23364a.mo523N3();
    }

    @Override // p301qb.InterfaceC6385f1
    /* renamed from: W2 */
    public void mo23605W2(List list, int i10, String str) {
        AbstractC5868k.m23674f(list, "assetLists");
        AbstractC5868k.m23674f(str, "searchStr");
        this.f23366c = f23362l;
        if (i10 == 0) {
            this.f23364a.mo19753k1();
            this.f23364a.mo19749X3();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C7550y(null, (AssetList) it.next()));
        }
        int i11 = f23363m;
        int i12 = i10 / i11;
        if (i10 % i11 != 0) {
            i12++;
        }
        this.f23368e = i12;
        this.f23364a.mo19754m6(this.f23366c, this.f23367d, i10, arrayList);
        this.f23364a.mo19749X3();
    }

    /* renamed from: Y0 */
    public void m23606Y0(String str) {
        AbstractC5868k.m23674f(str, "voiceMsg");
        if (AbstractC6567a.m25634d(str)) {
            return;
        }
        this.f23369f = str;
        this.f23366c = 0;
        this.f23367d = 1;
        this.f23364a.mo19752j1();
        m23602E3();
    }

    @Override // p301qb.InterfaceC6388g1
    /* renamed from: a2 */
    public void mo23607a2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        if (this.f23366c == f23360j) {
            m23603G3();
        } else {
            this.f23364a.mo19753k1();
            this.f23364a.mo19749X3();
        }
    }

    @Override // p301qb.InterfaceC6385f1
    /* renamed from: m3 */
    public void mo23608m3(String str, String str2) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, "searchStr");
        this.f23366c = f23362l;
        this.f23364a.mo19753k1();
        this.f23364a.mo19749X3();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6388g1
    /* renamed from: o2 */
    public void mo23609o2(GetLiveDataResultData getLiveDataResultData) {
        List<Channel> list;
        int i10;
        Integer channelListTotalSize;
        List<Channel> channelList;
        List<Channel> list2;
        if (this.f23366c == f23360j) {
            if (getLiveDataResultData != null) {
                list2 = getLiveDataResultData.getChannelList();
            } else {
                list2 = null;
            }
            if (AbstractC6567a.m25635e(list2)) {
                m23603G3();
                return;
            }
        }
        if (getLiveDataResultData != null) {
            list = getLiveDataResultData.getChannelList();
        } else {
            list = null;
        }
        if (AbstractC6567a.m25635e(list)) {
            this.f23364a.mo19753k1();
            this.f23364a.mo19749X3();
            return;
        }
        this.f23366c = f23361k;
        ArrayList arrayList = new ArrayList();
        if (getLiveDataResultData != null && (channelList = getLiveDataResultData.getChannelList()) != null) {
            Iterator<T> it = channelList.iterator();
            while (it.hasNext()) {
                arrayList.add(new C7550y((Channel) it.next(), null));
            }
        }
        if (getLiveDataResultData != null && (channelListTotalSize = getLiveDataResultData.getChannelListTotalSize()) != null) {
            i10 = channelListTotalSize.intValue();
        } else {
            i10 = 0;
        }
        int i11 = f23363m;
        int i12 = i10 / i11;
        if (i10 % i11 != 0) {
            i12++;
        }
        this.f23368e = i12;
        this.f23364a.mo19754m6(this.f23366c, this.f23367d, i10, arrayList);
        this.f23364a.mo19749X3();
    }
}
