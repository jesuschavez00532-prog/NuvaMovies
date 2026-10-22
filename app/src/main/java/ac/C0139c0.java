package ac;

import com.request.result.FilterGenreResult;
import com.request.result.FilterGenreResultData;
import com.request.result.FilterInfo;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p030bc.C1224f;
import p301qb.InterfaceC6437x;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p348u2.AbstractC7029f;

/* renamed from: ac.c0 */
/* loaded from: classes2.dex */
public final class C0139c0 extends AbstractC0166j {

    /* renamed from: b */
    private final String f408b;

    /* renamed from: ac.c0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f409a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f409a = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FilterGenreResult mo542f(FilterGenreResult filterGenreResult) {
            List<String> list;
            boolean z10;
            AbstractC5868k.m23674f(filterGenreResult, "it");
            FilterGenreResultData data = filterGenreResult.getData();
            if (data != null) {
                list = data.getYear();
            } else {
                list = null;
            }
            if (AbstractC6567a.m25638h(list)) {
                FilterGenreResultData data2 = filterGenreResult.getData();
                AbstractC5868k.m23671c(data2);
                List<String> year = data2.getYear();
                ArrayList arrayList = new ArrayList();
                FilterGenreResultData data3 = filterGenreResult.getData();
                AbstractC5868k.m23671c(data3);
                data3.setFixYear(arrayList);
                int size = year.size();
                int min = Math.min(size, 10);
                int i10 = 0;
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList.add(new FilterInfo(year.get(i11), year.get(i11)));
                }
                Object obj = arrayList.get(min - 1);
                AbstractC5868k.m23673e(obj, "fixYearList[fixYearCount - 1]");
                FilterInfo filterInfo = (FilterInfo) obj;
                String str = year.get(size - 1);
                if (filterInfo.getKey().compareTo(str) > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append('-');
                    String key = filterInfo.getKey();
                    if (key != null && key.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        try {
                            i10 = Integer.parseInt(key);
                        } catch (NumberFormatException e10) {
                            e10.printStackTrace();
                        }
                    }
                    sb2.append(i10 - 1);
                    arrayList.add(new FilterInfo(sb2.toString(), this.f409a));
                }
            }
            return filterGenreResult;
        }
    }

    /* renamed from: ac.c0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6929a {
        b() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(FilterGenreResult filterGenreResult) {
            AbstractC5868k.m23674f(filterGenreResult, "t");
            super.onNext(filterGenreResult);
            if (filterGenreResult.getData() != null) {
                ((InterfaceC6437x) C0139c0.this.m618a()).mo24934m5(filterGenreResult);
            } else {
                ((InterfaceC6437x) C0139c0.this.m618a()).mo24935t4("portal100022");
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6437x) C0139c0.this.m618a()).mo24935t4(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139c0(InterfaceC6437x interfaceC6437x) {
        super(interfaceC6437x);
        AbstractC5868k.m23674f(interfaceC6437x, "view");
        this.f408b = C0139c0.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final FilterGenreResult m539d(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (FilterGenreResult) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: c */
    public final void m540c(String str) {
        AbstractC5868k.m23674f(str, "earlierStr");
        Observable compose = C1224f.f4816e.m5631a().m5621w().compose(AbstractC7029f.m27124e());
        final a aVar = new a(str);
        Observable compose2 = compose.map(new Function() { // from class: ac.b0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                FilterGenreResult m539d;
                m539d = C0139c0.m539d(InterfaceC5660l.this, obj);
                return m539d;
            }
        }).compose(AbstractC7029f.m27125f());
        AbstractC5868k.m23673e(compose2, "earlierStr : String) {\n …erHelper.observeOnMain())");
        AbstractC6567a.m25631a(compose2, ((InterfaceC6437x) m618a()).mo523N3()).subscribe(new b());
    }
}
