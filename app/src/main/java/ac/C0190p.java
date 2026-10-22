package ac;

import ac.C0190p;
import be.C1328x;
import com.request.result.AssetList;
import com.request.result.SearchByNameResult;
import com.request.result.SearchByNameResultData;
import com.request.result.SearchItem;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p030bc.C1224f;
import p301qb.InterfaceC6404m;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p348u2.AbstractC7029f;

/* renamed from: ac.p */
/* loaded from: classes2.dex */
public final class C0190p extends AbstractC0166j {

    /* renamed from: b */
    private final String f532b;

    /* renamed from: c */
    private Disposable f533c;

    /* renamed from: ac.p$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f535c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ac.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C7795a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final C7795a f536a = new C7795a();

            C7795a() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List mo542f(List list) {
                AbstractC5868k.m23674f(list, "it");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    SearchItem searchItem = (SearchItem) it.next();
                    if (!AbstractC6567a.m25635e(searchItem.getItemList())) {
                        List<AssetList> itemList = searchItem.getItemList();
                        AbstractC5868k.m23671c(itemList);
                        arrayList.addAll(itemList);
                    }
                }
                return arrayList;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ac.p$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C0190p f537a;

            /* renamed from: b */
            final /* synthetic */ SearchByNameResult f538b;

            /* renamed from: c */
            final /* synthetic */ String f539c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C0190p c0190p, SearchByNameResult searchByNameResult, String str) {
                super(1);
                this.f537a = c0190p;
                this.f538b = searchByNameResult;
                this.f539c = str;
            }

            /* renamed from: a */
            public final void m697a(List list) {
                InterfaceC6404m interfaceC6404m = (InterfaceC6404m) this.f537a.m618a();
                AbstractC5868k.m23673e(list, "it");
                SearchByNameResultData data = this.f538b.getData();
                AbstractC5868k.m23671c(data);
                Integer totalSize = data.getTotalSize();
                AbstractC5868k.m23671c(totalSize);
                interfaceC6404m.mo23605W2(list, totalSize.intValue(), this.f539c);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m697a((List) obj);
                return C1328x.f4998a;
            }
        }

        a(String str) {
            this.f535c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final List m693f(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            return (List) interfaceC5660l.mo542f(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m694g(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            interfaceC5660l.mo542f(obj);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onNext(SearchByNameResult searchByNameResult) {
            AbstractC5868k.m23674f(searchByNameResult, "t");
            super.onNext(searchByNameResult);
            if (searchByNameResult.getData() != null) {
                SearchByNameResultData data = searchByNameResult.getData();
                AbstractC5868k.m23671c(data);
                if (!AbstractC6567a.m25635e(data.getSearchItemList())) {
                    SearchByNameResultData data2 = searchByNameResult.getData();
                    AbstractC5868k.m23671c(data2);
                    List<SearchItem> searchItemList = data2.getSearchItemList();
                    AbstractC5868k.m23671c(searchItemList);
                    Observable just = Observable.just(searchItemList);
                    final C7795a c7795a = C7795a.f536a;
                    Observable compose = just.map(new Function() { // from class: ac.n
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            List m693f;
                            m693f = C0190p.a.m693f(InterfaceC5660l.this, obj);
                            return m693f;
                        }
                    }).compose(AbstractC7029f.m27120a());
                    final b bVar = new b(C0190p.this, searchByNameResult, this.f535c);
                    compose.subscribe(new Consumer() { // from class: ac.o
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C0190p.a.m694g(InterfaceC5660l.this, obj);
                        }
                    });
                    return;
                }
            }
            ((InterfaceC6404m) C0190p.this.m618a()).mo24965l4();
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6404m) C0190p.this.m618a()).mo23608m3(AbstractC6570d.m25644a(th, "eb2", "500", "500"), this.f535c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            C0190p.this.m688c();
            C0190p.this.m690e(disposable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190p(InterfaceC6404m interfaceC6404m) {
        super(interfaceC6404m);
        AbstractC5868k.m23674f(interfaceC6404m, "view");
        this.f532b = "BlSearchByNameModel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m688c() {
        Disposable disposable = this.f533c;
        if (disposable != null) {
            AbstractC6567a.m25632b(disposable);
        }
        this.f533c = null;
    }

    /* renamed from: d */
    public final void m689d(String str, String str2, String str3, int i10, int i11, String str4) {
        AbstractC5868k.m23674f(str2, "value");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5597k(str, str2, str3, i10, i11, str4), ((InterfaceC6404m) m618a()).mo523N3()).subscribe(new a(str2));
    }

    /* renamed from: e */
    public final void m690e(Disposable disposable) {
        this.f533c = disposable;
    }
}
