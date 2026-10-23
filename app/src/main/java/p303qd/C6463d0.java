package p303qd;

import ac.C0153f2;
import android.text.TextUtils;
import ba.AbstractC1196d;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.request.result.PersonDetailInfo;
import com.request.result.PersonSearchResult;
import com.request.result.ResourceSearchResult;
import com.request.result.SearchROrPData;
import gd.EnumC4432b;
import java.util.List;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import p135fd.C4307b;
import p268od.InterfaceC5969e;
import p268od.InterfaceC5970f;
import p301qb.InterfaceC6391h1;
import p317rb.AbstractC6567a;
import p400xa.C7589m1;

/* renamed from: qd.d0 */
/* loaded from: classes3.dex */
public final class C6463d0 implements InterfaceC5969e, InterfaceC6391h1 {

    /* renamed from: a */
    private AbstractC1196d f24833a;

    /* renamed from: b */
    private InterfaceC5970f f24834b;

    /* renamed from: c */
    private String f24835c;

    /* renamed from: d */
    private int f24836d;

    /* renamed from: e */
    private final int f24837e;

    /* renamed from: f */
    private final InterfaceC1312h f24838f;

    /* renamed from: qd.d0$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0153f2 invoke() {
            return new C0153f2(C6463d0.this);
        }
    }

    public C6463d0(AbstractC1196d abstractC1196d, InterfaceC5970f interfaceC5970f) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractC1196d, "frag");
        AbstractC5868k.m23674f(interfaceC5970f, "view");
        this.f24833a = abstractC1196d;
        this.f24834b = interfaceC5970f;
        this.f24835c = "";
        this.f24837e = 25;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f24838f = m5965b;
    }

    /* renamed from: Y0 */
    private final C0153f2 m25293Y0() {
        return (C0153f2) this.f24838f.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6391h1
    /* renamed from: C0 */
    public void mo25204C0(SearchROrPData searchROrPData, String str, String str2) {
        AbstractC5868k.m23674f(searchROrPData, "data");
        AbstractC5868k.m23674f(str, "searchStr");
    }

    @Override // p268od.InterfaceC5969e
    /* renamed from: F */
    public String mo24144F() {
        return this.f24835c;
    }

    @Override // p301qb.InterfaceC6391h1
    /* renamed from: L5 */
    public void mo25205L5(PersonSearchResult personSearchResult, String str, String str2) {
        List<PersonDetailInfo> list;
        int i10 = 0;
        List<PersonDetailInfo> list2;
        AbstractC5868k.m23674f(str, "searchStr");
        AbstractC5868k.m23674f(str2, "searchType");
        this.f24834b.mo24149b();
        List<PersonDetailInfo> list3 = null;
        if (this.f24836d <= 1) {
            if (personSearchResult != null) {
                i10 = personSearchResult.getTotalSize();
            } else {
                i10 = 0;
            }
            if (personSearchResult != null) {
                list2 = personSearchResult.getPersonList();
            } else {
                list2 = null;
            }
            if (AbstractC5882y.m23710j(list2)) {
                list3 = list2;
            }
            if (i10 != 0 && !AbstractC6567a.m25635e(list3)) {
                InterfaceC5970f interfaceC5970f = this.f24834b;
                AbstractC5868k.m23671c(list3);
                interfaceC5970f.mo24153r(list3, i10);
                return;
            }
            this.f24834b.mo24151m();
            return;
        }
        if (personSearchResult != null) {
            list = personSearchResult.getPersonList();
        } else {
            list = null;
        }
        if (AbstractC5882y.m23710j(list)) {
            list3 = list;
        }
        if (list3 != null) {
            this.f24834b.mo24152o(list3);
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24833a.m19903l9(EnumC4432b.DESTROY);
    }

    @Override // p301qb.InterfaceC6391h1
    /* renamed from: Z4 */
    public void mo25206Z4(List list, int i10, String str, String str2) {
        AbstractC5868k.m23674f(list, "data");
        AbstractC5868k.m23674f(str, "searchStr");
        AbstractC5868k.m23674f(str2, "searchType");
    }

    @Override // p268od.InterfaceC5969e
    /* renamed from: d */
    public void mo24145d(String str) {
        if (!AbstractC6567a.m25634d(str) && !TextUtils.equals(str, this.f24835c)) {
            this.f24836d = 1;
            AbstractC5868k.m23671c(str);
            this.f24835c = str;
            this.f24834b.mo24148a();
            this.f24834b.mo24147S();
            m25293Y0().m589e(this.f24835c, "3", this.f24836d, this.f24837e);
            C7589m1.f27886a.m29151t("EVENT_SEARCH_GLOBAL", this.f24835c, 2);
        }
    }

    @Override // p301qb.InterfaceC6391h1
    /* renamed from: h1 */
    public void mo25207h1(ResourceSearchResult resourceSearchResult, String str, String str2) {
        AbstractC5868k.m23674f(str, "searchStr");
        AbstractC5868k.m23674f(str2, "searchType");
    }

    @Override // p301qb.InterfaceC6391h1
    /* renamed from: i4 */
    public void mo25208i4(List list, int i10, String str, String str2) {
        AbstractC5868k.m23674f(list, "data");
        AbstractC5868k.m23674f(str, "searchStr");
        AbstractC5868k.m23674f(str2, "searchType");
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6391h1
    /* renamed from: p4 */
    public void mo25209p4(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, "searchStr");
        int i10 = this.f24836d;
        if (i10 <= 1) {
            this.f24835c = "";
        }
        this.f24836d = i10 - 1;
        this.f24834b.mo24149b();
        this.f24834b.mo24150j(str);
    }

    @Override // p268od.InterfaceC5969e
    /* renamed from: z */
    public void mo24146z() {
        this.f24836d++;
        this.f24834b.mo24148a();
        m25293Y0().m589e(this.f24835c, "3", this.f24836d, this.f24837e);
    }
}
