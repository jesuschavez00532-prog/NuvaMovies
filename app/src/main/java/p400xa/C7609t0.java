package p400xa;

import android.content.Context;
import be.C1328x;
import com.request.result.ChildColumn;
import com.request.result.GetColumnContentsResult;
import com.request.result.GetColumnContentsResultData;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p132fa.C4300d;
import p179ib.AbstractC4929f;
import p185j2.C4982a;
import p193ja.C5044a;
import p194jb.AbstractC5047b;
import p287pb.AbstractApplicationC6253c;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7027d;
import p415y9.AbstractApplicationC7689d;

/* renamed from: xa.t0 */
/* loaded from: classes2.dex */
public final class C7609t0 {

    /* renamed from: a */
    public static final C7609t0 f27981a = new C7609t0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.t0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f27982a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m29260a(C1328x c1328x) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29260a((C1328x) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.t0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f27983a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m29261a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29261a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    private C7609t0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final C1328x m29255e() {
        GetColumnContentsResult getColumnContentsResult;
        GetColumnContentsResultData data;
        List<ChildColumn> childColumnList;
        GetColumnContentsResultData data2;
        String m29097f = C7581k.f27855a.m29097f("column_data_10002");
        List<ChildColumn> list = null;
        if (m29097f != null) {
            getColumnContentsResult = (GetColumnContentsResult) AbstractC7027d.m27114a().fromJson(m29097f, GetColumnContentsResult.class);
        } else {
            getColumnContentsResult = null;
        }
        if (getColumnContentsResult != null && (data2 = getColumnContentsResult.getData()) != null) {
            list = data2.getChildColumnList();
        }
        if (AbstractC6567a.m25638h(list)) {
            if (getColumnContentsResult != null && (data = getColumnContentsResult.getData()) != null && (childColumnList = data.getChildColumnList()) != null) {
                Iterator<T> it = childColumnList.iterator();
                while (it.hasNext()) {
                    C7581k.f27855a.m29098g(String.valueOf(((ChildColumn) it.next()).getId()), "");
                }
            }
            C7581k.f27855a.m29098g("column_data_10002", "");
        }
        return C1328x.f4998a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m29256f(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m29257g(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: d */
    public final void m29258d(Context context) {
        GetColumnContentsResultData getColumnContentsResultData;
        List<ChildColumn> childColumnList;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        ((Number) C4982a.f20721a.m20333a(AbstractApplicationC6253c.f24484b.m24887a(), "all_Column_key", -1)).intValue();
        Object m20485a = C5044a.f20862a.m20485a(C4300d.f18678a.m18035h());
        List<ChildColumn> list = null;
        if (m20485a instanceof GetColumnContentsResultData) {
            getColumnContentsResultData = (GetColumnContentsResultData) m20485a;
        } else {
            getColumnContentsResultData = null;
        }
        if (getColumnContentsResultData != null) {
            list = getColumnContentsResultData.getChildColumnList();
        }
        if (AbstractC6567a.m25638h(list)) {
            if (getColumnContentsResultData != null && (childColumnList = getColumnContentsResultData.getChildColumnList()) != null) {
                for (ChildColumn childColumn : childColumnList) {
                    if (context != null) {
                        C4982a.f20721a.m20335c(AbstractApplicationC7689d.f28135d.m29494a(), String.valueOf(childColumn.getId()), "");
                    }
                }
                return;
            }
            return;
        }
        Observable observeOn = Observable.fromCallable(new Callable() { // from class: xa.q0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1328x m29255e;
                m29255e = C7609t0.m29255e();
                return m29255e;
            }
        }).subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        final a aVar = a.f27982a;
        Consumer consumer = new Consumer() { // from class: xa.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7609t0.m29256f(InterfaceC5660l.this, obj);
            }
        };
        final b bVar = b.f27983a;
        observeOn.subscribe(consumer, new Consumer() { // from class: xa.s0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7609t0.m29257g(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: h */
    public final void m29259h(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (AbstractC4929f.m20252b() != AbstractC5047b.m20500b(context)) {
            m29258d(context);
        }
    }
}
