package ac;

import com.request.result.AssetList;
import com.request.result.ProgramSearchResult;
import com.request.result.SearchROrPData;
import com.request.result.SearchROrPResult;
import com.request.result.SeriesSearchResult;
import io.reactivex.disposables.Disposable;
import java.util.List;
import ne.AbstractC5868k;
import p030bc.C1224f;
import p301qb.InterfaceC6391h1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.f2 */
/* loaded from: classes2.dex */
public final class C0153f2 extends AbstractC0166j {

    /* renamed from: b */
    private Disposable f442b;

    /* renamed from: ac.f2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f444c;

        /* renamed from: d */
        final /* synthetic */ String f445d;

        a(String str, String str2) {
            this.f444c = str;
            this.f445d = str2;
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(SearchROrPResult searchROrPResult) {
            AbstractC5868k.m23674f(searchROrPResult, "t");
            super.onNext(searchROrPResult);
            List<AssetList> list = null;
            if (AbstractC5868k.m23669a(this.f444c, "1")) {
                if (searchROrPResult.getData() != null) {
                    SearchROrPData data = searchROrPResult.getData();
                    AbstractC5868k.m23671c(data);
                    ProgramSearchResult programResult = data.getProgramResult();
                    if (programResult != null) {
                        list = programResult.getProgramList();
                    }
                    if (AbstractC6567a.m25638h(list)) {
                        InterfaceC6391h1 interfaceC6391h1 = (InterfaceC6391h1) C0153f2.this.m618a();
                        SearchROrPData data2 = searchROrPResult.getData();
                        AbstractC5868k.m23671c(data2);
                        ProgramSearchResult programResult2 = data2.getProgramResult();
                        AbstractC5868k.m23671c(programResult2);
                        List<AssetList> programList = programResult2.getProgramList();
                        AbstractC5868k.m23671c(programList);
                        SearchROrPData data3 = searchROrPResult.getData();
                        AbstractC5868k.m23671c(data3);
                        ProgramSearchResult programResult3 = data3.getProgramResult();
                        AbstractC5868k.m23671c(programResult3);
                        interfaceC6391h1.mo25206Z4(programList, programResult3.getTotalSize(), this.f445d, this.f444c);
                        return;
                    }
                }
                ((InterfaceC6391h1) C0153f2.this.m618a()).mo25209p4("", this.f445d, this.f444c);
                return;
            }
            if (AbstractC5868k.m23669a(this.f444c, "2")) {
                if (searchROrPResult.getData() != null) {
                    SearchROrPData data4 = searchROrPResult.getData();
                    AbstractC5868k.m23671c(data4);
                    SeriesSearchResult seriesResult = data4.getSeriesResult();
                    if (seriesResult != null) {
                        list = seriesResult.getSeriesList();
                    }
                    if (AbstractC6567a.m25638h(list)) {
                        InterfaceC6391h1 interfaceC6391h12 = (InterfaceC6391h1) C0153f2.this.m618a();
                        SearchROrPData data5 = searchROrPResult.getData();
                        AbstractC5868k.m23671c(data5);
                        SeriesSearchResult seriesResult2 = data5.getSeriesResult();
                        AbstractC5868k.m23671c(seriesResult2);
                        List<AssetList> seriesList = seriesResult2.getSeriesList();
                        AbstractC5868k.m23671c(seriesList);
                        SearchROrPData data6 = searchROrPResult.getData();
                        AbstractC5868k.m23671c(data6);
                        SeriesSearchResult seriesResult3 = data6.getSeriesResult();
                        AbstractC5868k.m23671c(seriesResult3);
                        interfaceC6391h12.mo25208i4(seriesList, seriesResult3.getTotalSize(), this.f445d, this.f444c);
                        return;
                    }
                }
                ((InterfaceC6391h1) C0153f2.this.m618a()).mo25209p4("", this.f445d, this.f444c);
                return;
            }
            if (AbstractC5868k.m23669a(this.f444c, "3")) {
                if (searchROrPResult.getData() != null) {
                    InterfaceC6391h1 interfaceC6391h13 = (InterfaceC6391h1) C0153f2.this.m618a();
                    SearchROrPData data7 = searchROrPResult.getData();
                    AbstractC5868k.m23671c(data7);
                    interfaceC6391h13.mo25205L5(data7.getPersonResult(), this.f445d, this.f444c);
                    return;
                }
                ((InterfaceC6391h1) C0153f2.this.m618a()).mo25209p4("", this.f445d, this.f444c);
                return;
            }
            if (AbstractC5868k.m23669a(this.f444c, "4")) {
                if (searchROrPResult.getData() != null) {
                    InterfaceC6391h1 interfaceC6391h14 = (InterfaceC6391h1) C0153f2.this.m618a();
                    SearchROrPData data8 = searchROrPResult.getData();
                    AbstractC5868k.m23671c(data8);
                    interfaceC6391h14.mo25207h1(data8.getResourceResult(), this.f445d, this.f444c);
                    return;
                }
                ((InterfaceC6391h1) C0153f2.this.m618a()).mo25209p4("", this.f445d, this.f444c);
                return;
            }
            if (searchROrPResult.getData() != null) {
                InterfaceC6391h1 interfaceC6391h15 = (InterfaceC6391h1) C0153f2.this.m618a();
                SearchROrPData data9 = searchROrPResult.getData();
                AbstractC5868k.m23671c(data9);
                interfaceC6391h15.mo25204C0(data9, this.f445d, this.f444c);
                return;
            }
            ((InterfaceC6391h1) C0153f2.this.m618a()).mo25209p4("", this.f445d, this.f444c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6391h1) C0153f2.this.m618a()).mo25209p4(AbstractC6570d.m25644a(th, "eb2", "500", "500"), this.f445d, this.f444c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            C0153f2.this.m588d();
            C0153f2.this.f442b = disposable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153f2(InterfaceC6391h1 interfaceC6391h1) {
        super(interfaceC6391h1);
        AbstractC5868k.m23674f(interfaceC6391h1, "view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m588d() {
        Disposable disposable = this.f442b;
        if (disposable != null) {
            AbstractC6567a.m25632b(disposable);
        }
        this.f442b = null;
    }

    /* renamed from: e */
    public final void m589e(String str, String str2, int i10, int i11) {
        AbstractC5868k.m23674f(str, "value");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5612r0(str, str2, i10, i11), ((InterfaceC6391h1) m618a()).mo523N3()).subscribe(new a(str2, str));
    }
}
