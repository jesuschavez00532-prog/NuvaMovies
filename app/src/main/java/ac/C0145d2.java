package ac;

import ac.C0145d2;
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
import p301qb.InterfaceC6385f1;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p348u2.AbstractC7029f;

/* renamed from: ac.d2 */
/* loaded from: classes2.dex */
public final class C0145d2 extends AbstractC0166j {

    /* renamed from: b */
    private final String f418b;

    /* renamed from: c */
    private Disposable f419c;

    /* renamed from: ac.d2$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6929a {

        /* renamed from: c */
        final /* synthetic */ String f421c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ac.d2$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C7794a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final C7794a f422a = new C7794a();

            C7794a() {
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
        /* renamed from: ac.d2$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C0145d2 f423a;

            /* renamed from: b */
            final /* synthetic */ SearchByNameResult f424b;

            /* renamed from: c */
            final /* synthetic */ String f425c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C0145d2 c0145d2, SearchByNameResult searchByNameResult, String str) {
                super(1);
                this.f423a = c0145d2;
                this.f424b = searchByNameResult;
                this.f425c = str;
            }

            /* renamed from: a */
            public final void m560a(List list) {
                InterfaceC6385f1 interfaceC6385f1 = (InterfaceC6385f1) this.f423a.m618a();
                AbstractC5868k.m23673e(list, "it");
                SearchByNameResultData data = this.f424b.getData();
                AbstractC5868k.m23671c(data);
                Integer totalSize = data.getTotalSize();
                AbstractC5868k.m23671c(totalSize);
                interfaceC6385f1.mo23605W2(list, totalSize.intValue(), this.f425c);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m560a((List) obj);
                return C1328x.f4998a;
            }
        }

        a(String str) {
            this.f421c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final List m556f(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            return (List) interfaceC5660l.mo542f(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m557g(InterfaceC5660l interfaceC5660l, Object obj) {
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
                    final C7794a c7794a = C7794a.f422a;
                    Observable compose = just.map(new Function() { // from class: ac.b2
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            List m556f;
                            m556f = C0145d2.a.m556f(InterfaceC5660l.this, obj);
                            return m556f;
                        }
                    }).compose(AbstractC7029f.m27121b());
                    final b bVar = new b(C0145d2.this, searchByNameResult, this.f421c);
                    compose.subscribe(new Consumer() { // from class: ac.c2
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C0145d2.a.m557g(InterfaceC5660l.this, obj);
                        }
                    });
                    return;
                }
            }
            ((InterfaceC6385f1) C0145d2.this.m618a()).mo23608m3("", this.f421c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6385f1) C0145d2.this.m618a()).mo23608m3(AbstractC6570d.m25644a(th, "eb2", "500", "500"), this.f421c);
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            C0145d2.this.m551c();
            C0145d2.this.m553e(disposable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0145d2(InterfaceC6385f1 interfaceC6385f1) {
        super(interfaceC6385f1);
        AbstractC5868k.m23674f(interfaceC6385f1, "view");
        this.f418b = "SearchByNamePresenter";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m551c() {
        Disposable disposable = this.f419c;
        if (disposable != null) {
            AbstractC6567a.m25632b(disposable);
        }
        this.f419c = null;
    }

    /* renamed from: d */
    public final void m552d(int i10, String str, String str2, int i11, int i12, String str3) {
        AbstractC5868k.m23674f(str, "value");
        AbstractC5868k.m23674f(str2, "type");
        AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5608p0(i10, str, str2, i11, i12, str3), ((InterfaceC6385f1) m618a()).mo523N3()).subscribe(new a(str));
    }

    /* renamed from: e */
    public final void m553e(Disposable disposable) {
        this.f419c = disposable;
    }
}
