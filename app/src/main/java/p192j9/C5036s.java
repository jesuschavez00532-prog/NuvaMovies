package p192j9;

import android.os.Environment;
import be.C1328x;
import com.module.bean.Album;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p116e9.C4156a;
import p131f9.C4296a;
import p132fa.C4300d;
import p160h9.InterfaceC4737m;
import p160h9.InterfaceC4738n;
import p170i2.C4842a;
import p201k2.AbstractC5085b;
import p359ue.AbstractC7166t;
import p415y9.AbstractApplicationC7689d;
import p430z9.AbstractC7765c;

/* renamed from: j9.s */
/* loaded from: classes2.dex */
public final class C5036s implements InterfaceC4737m {

    /* renamed from: a */
    private AbstractC7765c f20839a;

    /* renamed from: b */
    private InterfaceC4738n f20840b;

    /* renamed from: c */
    private C4296a f20841c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j9.s$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m20476a(List list) {
            C5036s.this.m20475n().mo19620r5(list);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20476a((List) obj);
            return C1328x.f4998a;
        }
    }

    public C5036s(AbstractC7765c abstractC7765c, InterfaceC4738n interfaceC4738n) {
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4738n, "view");
        this.f20839a = abstractC7765c;
        this.f20840b = interfaceC4738n;
        this.f20841c = new C4296a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m20472i(Album album, C5036s c5036s, ObservableEmitter observableEmitter) {
        String m27728o;
        AbstractC5868k.m23674f(c5036s, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        if (album == null) {
            c5036s.f20841c.m17975f(C4300d.f18678a.m18068x0());
        } else {
            c5036s.f20841c.m17977h(C4300d.f18678a.m18068x0(), album.getContentId());
        }
        if (C4842a.f20329a.m19920a().m19976y()) {
            String m20595e = AbstractC5085b.m20595e();
            AbstractC5868k.m23673e(m20595e, "getEnglishAppName()");
            m27728o = AbstractC7166t.m27728o(m20595e, " ", "", false, 4, null);
            Locale locale = Locale.US;
            AbstractC5868k.m23673e(locale, "US");
            String lowerCase = m27728o.toLowerCase(locale);
            AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db_" + lowerCase;
            AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
            String path = aVar.m29494a().getDatabasePath("user_vod.db").getPath();
            String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-shm_" + lowerCase;
            String path2 = aVar.m29494a().getDatabasePath("user_vod.db-shm").getPath();
            String str3 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/user_vod.db-wal_" + lowerCase;
            String path3 = aVar.m29494a().getDatabasePath("user_vod.db-wal").getPath();
            c5036s.f20841c.m17972c(path, str);
            if (new File(path2).exists()) {
                c5036s.f20841c.m17972c(path2, str2);
            }
            if (new File(path3).exists()) {
                c5036s.f20841c.m17972c(path3, str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final List m20473k(C5036s c5036s) {
        AbstractC5868k.m23674f(c5036s, "this$0");
        List<Album> m17981l = c5036s.f20841c.m17981l(C4300d.f18678a.m18068x0());
        ArrayList arrayList = new ArrayList();
        if (m17981l != null) {
            for (Album album : m17981l) {
                if (album.getShelveType().equals("1")) {
                    arrayList.add(new C4156a(album, c5036s.f20841c.m17983n(album.getContentId())));
                } else {
                    arrayList.add(new C4156a(album, null, 2, null));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m20474l(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        mo19618Y1();
    }

    @Override // p160h9.InterfaceC4737m
    /* renamed from: Y1 */
    public void mo19618Y1() {
        Observable observeOn = Observable.fromCallable(new Callable() { // from class: j9.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m20473k;
                m20473k = C5036s.m20473k(C5036s.this);
                return m20473k;
            }
        }).subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        final a aVar = new a();
        observeOn.subscribe(new Consumer() { // from class: j9.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5036s.m20474l(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p160h9.InterfaceC4737m
    /* renamed from: f3 */
    public void mo19619f3(final Album album) {
        Observable.create(new ObservableOnSubscribe() { // from class: j9.r
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C5036s.m20472i(Album.this, this, observableEmitter);
            }
        }).subscribeOn(Schedulers.m20294io()).subscribe();
    }

    /* renamed from: n */
    public final InterfaceC4738n m20475n() {
        return this.f20840b;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }
}
