package cc;

import android.app.RecoverableSecurityException;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import be.C1328x;
import com.umeng.analytics.pro.C3329bx;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p185j2.C4982a;
import p201k2.C5090g;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;

/* renamed from: cc.r */
/* loaded from: classes.dex */
public final class C1472r {

    /* renamed from: a */
    public static final C1472r f5652a = new C1472r();

    /* renamed from: cc.r$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Context f5653a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(1);
            this.f5653a = context;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (Build.VERSION.SDK_INT <= 29) {
                C1472r c1472r = C1472r.f5652a;
                c1472r.m6911n();
                c1472r.m6912o(this.f5653a);
            } else {
                C1472r c1472r2 = C1472r.f5652a;
                c1472r2.m6910m(this.f5653a);
                c1472r2.m6912o(this.f5653a);
            }
            return str;
        }
    }

    /* renamed from: cc.r$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f5654a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m6915a(String str) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6915a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: cc.r$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f5655a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m6916a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6916a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    private C1472r() {
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m6905g(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C1472r.m6905g(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m6906h(android.content.Context r7, java.lang.String r8, android.net.Uri r9, int r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C1472r.m6906h(android.content.Context, java.lang.String, android.net.Uri, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final String m6907j(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (String) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m6908k(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m6909l(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m6910m(Context context) {
        Uri uri;
        String m6799d;
        Cursor query;
        String m27728o;
        String m27728o2;
        Cursor cursor = null;
        try {
            try {
                uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                String[] strArr = {C3329bx.f14344d, "_display_name", "title"};
                String[] strArr2 = {'%' + Environment.DIRECTORY_ALARMS + "/system_c/%", "%google%"};
                m6799d = AbstractC1459j.m6799d(C1466m0.f5627a.m6868h(), C5090g.f20948a.m20640e());
                query = context.getContentResolver().query(uri, strArr, "relative_path LIKE ? AND title like ?", strArr2, "_id DESC");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        if (query != null) {
            try {
                try {
                } catch (Exception e11) {
                    e = e11;
                    cursor = query;
                    e.printStackTrace();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return;
                }
                if (query.getCount() > 0) {
                    if (!query.moveToNext()) {
                        query.close();
                        return;
                    }
                    if (TextUtils.equals(m6799d, m6905g(context))) {
                        query.close();
                        return;
                    }
                    try {
                        Uri withAppendedId = ContentUris.withAppendedId(uri, query.getInt(0));
                        AbstractC5868k.m23673e(withAppendedId, "withAppendedId(uri, id.toLong())");
                        context.getContentResolver().delete(withAppendedId, null);
                        AbstractC5868k.m23673e(m6799d, "fileContent");
                        AbstractC5868k.m23673e(uri, "uri");
                        m6906h(context, m6799d, uri, 0);
                    } catch (RecoverableSecurityException e12) {
                        e12.printStackTrace();
                        String string = query.getString(1);
                        AbstractC5868k.m23673e(string, "displayName");
                        m27728o = AbstractC7166t.m27728o(string, ".wav", "", false, 4, null);
                        m27728o2 = AbstractC7166t.m27728o(m27728o, "google", "", false, 4, null);
                        int m25639i = AbstractC6567a.m25639i(m27728o2) + 1;
                        AbstractC5868k.m23673e(m6799d, "fileContent");
                        AbstractC5868k.m23673e(uri, "uri");
                        m6906h(context, m6799d, uri, m25639i);
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                    query.close();
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        AbstractC5868k.m23673e(m6799d, "fileContent");
        AbstractC5868k.m23673e(uri, "uri");
        m6906h(context, m6799d, uri, 0);
        if (query != null) {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m6911n() {
        try {
            C5090g c5090g = C5090g.f20948a;
            c5090g.m20656x(c5090g.m20646k(), C1466m0.f5627a.m6868h());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m6912o(Context context) {
        C4982a.f20721a.m20335c(context, C5090g.f20948a.m20646k(), C1466m0.f5627a.m6868h());
    }

    /* renamed from: i */
    public final void m6913i(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        Observable just = Observable.just("(write pin)");
        final a aVar = new a(context);
        Observable compose = just.map(new Function() { // from class: cc.o
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m6907j;
                m6907j = C1472r.m6907j(InterfaceC5660l.this, obj);
                return m6907j;
            }
        }).compose(AbstractC7029f.m27122c());
        final b bVar = b.f5654a;
        Consumer consumer = new Consumer() { // from class: cc.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1472r.m6908k(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f5655a;
        compose.subscribe(consumer, new Consumer() { // from class: cc.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1472r.m6909l(InterfaceC5660l.this, obj);
            }
        });
    }
}
