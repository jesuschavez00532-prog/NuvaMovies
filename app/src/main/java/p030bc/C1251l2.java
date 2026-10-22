package p030bc;

import android.content.Context;
import be.AbstractC1324t;
import be.C1318n;
import be.C1328x;
import com.request.bean.SubTitleFileList;
import com.request.bean.SubTitleItemData;
import com.request.bean.SubtitleDownloadFinishEvent;
import com.umeng.analytics.pro.C3384f;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p201k2.AbstractC5092i;
import p287pb.AbstractApplicationC6253c;
import ye.C7709c;

/* renamed from: bc.l2 */
/* loaded from: classes.dex */
public final class C1251l2 {

    /* renamed from: b */
    public static final a f4860b = new a(null);

    /* renamed from: a */
    private final String f4861a = C1251l2.class.getSimpleName();

    /* renamed from: bc.l2$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final String m5652a(Context context, String str, String str2, String str3, String str4, C1318n c1318n) {
            String str5;
            boolean z10;
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(str, "contentId");
            AbstractC5868k.m23674f(c1318n, "download2Usb");
            if (((Boolean) c1318n.m5969c()).booleanValue()) {
                if (((CharSequence) c1318n.m5970d()).length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return ((String) c1318n.m5970d()) + "/subtitles/" + str + '_' + str4 + '_' + str2 + '.' + str3;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            File externalCacheDir = AbstractApplicationC6253c.f24484b.m24887a().getExternalCacheDir();
            if (externalCacheDir != null) {
                str5 = externalCacheDir.getAbsolutePath();
            } else {
                str5 = null;
            }
            sb2.append(str5);
            sb2.append("/sub/");
            sb2.append(str);
            sb2.append('/');
            sb2.append(str4);
            sb2.append('/');
            sb2.append(str2);
            sb2.append('.');
            sb2.append(str3);
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.l2$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ Context f4863b;

        /* renamed from: c */
        final /* synthetic */ String f4864c;

        /* renamed from: d */
        final /* synthetic */ C1318n f4865d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str, C1318n c1318n) {
            super(1);
            this.f4863b = context;
            this.f4864c = str;
            this.f4865d = c1318n;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo542f(SubTitleItemData subTitleItemData) {
            AbstractC5868k.m23674f(subTitleItemData, "it");
            return C1251l2.this.m5651s(this.f4863b, this.f4864c, subTitleItemData, this.f4865d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.l2$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f4866a = new c();

        c() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(HashMap hashMap) {
            boolean z10;
            AbstractC5868k.m23674f(hashMap, "it");
            if (hashMap.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.l2$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f4867a = new d();

        d() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObservableSource mo542f(HashMap hashMap) {
            AbstractC5868k.m23674f(hashMap, "it");
            return Observable.fromIterable(hashMap.entrySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.l2$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f4868a = new e();

        e() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Map.Entry entry) {
            boolean z10;
            AbstractC5868k.m23674f(entry, "it");
            ((SubTitleFileList) entry.getValue()).setDownloadFinished(false);
            ((SubTitleFileList) entry.getValue()).setDownloadError(false);
            Object key = entry.getKey();
            AbstractC5868k.m23673e(key, "it.key");
            String str = (String) key;
            if (AbstractC5868k.m23669a("srt", ((SubTitleFileList) entry.getValue()).getFileType())) {
                File file = new File(str);
                if (!file.exists()) {
                    return Boolean.TRUE;
                }
                if (file.length() == 0) {
                    boolean delete = file.delete();
                    if (!delete) {
                        ((SubTitleFileList) entry.getValue()).setDownloadFinished(true);
                        ((SubTitleFileList) entry.getValue()).setDownloadError(true);
                    }
                    return Boolean.valueOf(delete);
                }
                String m20668c = AbstractC5092i.m20668c(file);
                if (m20668c != null && m20668c.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 || !m20668c.equals(((SubTitleFileList) entry.getValue()).getMd5())) {
                    boolean delete2 = file.delete();
                    if (!delete2) {
                        ((SubTitleFileList) entry.getValue()).setDownloadFinished(true);
                        ((SubTitleFileList) entry.getValue()).setDownloadError(true);
                    }
                    return Boolean.valueOf(delete2);
                }
            }
            ((SubTitleFileList) entry.getValue()).setDownloadFinished(true);
            ((SubTitleFileList) entry.getValue()).setDownloadError(false);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.l2$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f4869a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(1);
            this.f4869a = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObservableSource mo542f(Map.Entry entry) {
            AbstractC5868k.m23674f(entry, "it");
            C1220e m5540a = C1220e.f4793e.m5540a();
            String str = this.f4869a;
            Object value = entry.getValue();
            AbstractC5868k.m23673e(value, "it.value");
            Object key = entry.getKey();
            AbstractC5868k.m23673e(key, "it.key");
            return m5540a.m5537j(str, (SubTitleFileList) value, (String) key, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.l2$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m5658a(Boolean bool) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5658a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.l2$h */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C1318n f4872b;

        /* renamed from: c */
        final /* synthetic */ String f4873c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C1318n c1318n, String str) {
            super(1);
            this.f4872b = c1318n;
            this.f4873c = str;
        }

        /* renamed from: a */
        public final void m5659a(Throwable th) {
            if (!((Boolean) this.f4872b.m5969c()).booleanValue()) {
                C7709c.m29787d().m29801m(new SubtitleDownloadFinishEvent(this.f4873c, true));
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m5659a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m5641j(C1251l2 c1251l2, Context context, String str, List list, C1318n c1318n, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            c1318n = AbstractC1324t.m5980a(Boolean.FALSE, "");
        }
        c1251l2.m5650i(context, str, list, c1318n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final HashMap m5642k(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (HashMap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m5643l(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final ObservableSource m5644m(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final boolean m5645n(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final ObservableSource m5646o(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m5647p(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m5648q(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m5649r(C1251l2 c1251l2, C1318n c1318n, String str) {
        AbstractC5868k.m23674f(c1251l2, "this$0");
        AbstractC5868k.m23674f(c1318n, "$download2Usb");
        AbstractC5868k.m23674f(str, "$contentId");
        if (!((Boolean) c1318n.m5969c()).booleanValue()) {
            C7709c.m29787d().m29801m(new SubtitleDownloadFinishEvent(str, false, 2, null));
        }
    }

    /* renamed from: i */
    public final void m5650i(Context context, final String str, List list, final C1318n c1318n) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(list, "subTitleList");
        AbstractC5868k.m23674f(c1318n, "download2Usb");
        Observable fromIterable = Observable.fromIterable(list);
        final b bVar = new b(context, str, c1318n);
        Observable map = fromIterable.map(new Function() { // from class: bc.d2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                HashMap m5642k;
                m5642k = C1251l2.m5642k(InterfaceC5660l.this, obj);
                return m5642k;
            }
        });
        final c cVar = c.f4866a;
        Observable filter = map.filter(new Predicate() { // from class: bc.e2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m5643l;
                m5643l = C1251l2.m5643l(InterfaceC5660l.this, obj);
                return m5643l;
            }
        });
        final d dVar = d.f4867a;
        Observable flatMap = filter.flatMap(new Function() { // from class: bc.f2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m5644m;
                m5644m = C1251l2.m5644m(InterfaceC5660l.this, obj);
                return m5644m;
            }
        });
        final e eVar = e.f4868a;
        Observable subscribeOn = flatMap.filter(new Predicate() { // from class: bc.g2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m5645n;
                m5645n = C1251l2.m5645n(InterfaceC5660l.this, obj);
                return m5645n;
            }
        }).subscribeOn(Schedulers.m20294io());
        final f fVar = new f(str);
        Observable flatMap2 = subscribeOn.flatMap(new Function() { // from class: bc.h2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m5646o;
                m5646o = C1251l2.m5646o(InterfaceC5660l.this, obj);
                return m5646o;
            }
        });
        final g gVar = new g();
        Consumer consumer = new Consumer() { // from class: bc.i2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1251l2.m5647p(InterfaceC5660l.this, obj);
            }
        };
        final h hVar = new h(c1318n, str);
        flatMap2.subscribe(consumer, new Consumer() { // from class: bc.j2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1251l2.m5648q(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: bc.k2
            @Override // io.reactivex.functions.Action
            public final void run() {
                C1251l2.m5649r(C1251l2.this, c1318n, str);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap m5651s(android.content.Context r21, java.lang.String r22, com.request.bean.SubTitleItemData r23, be.C1318n r24) {
        /*
            r20 = this;
            java.lang.String r0 = "context"
            r8 = r21
            ne.AbstractC5868k.m23674f(r8, r0)
            java.lang.String r0 = "contentId"
            r9 = r22
            ne.AbstractC5868k.m23674f(r9, r0)
            java.lang.String r0 = "subTitleItemData"
            r1 = r23
            ne.AbstractC5868k.m23674f(r1, r0)
            java.lang.String r0 = "download2Usb"
            r10 = r24
            ne.AbstractC5868k.m23674f(r10, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r11 = r23.getLanguage()
            java.util.List r1 = r23.getFile()
            if (r1 == 0) goto Lcc
            java.util.Iterator r12 = r1.iterator()
        L2f:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto Lcc
            java.lang.Object r1 = r12.next()
            r13 = r1
            com.request.bean.SubTitleFileList r13 = (com.request.bean.SubTitleFileList) r13
            java.lang.String r5 = r13.getFileType()
            java.lang.String r1 = r13.getUrl()
            r2 = 1
            r3 = 2
            r4 = 0
            r6 = 0
            if (r1 == 0) goto L54
            java.lang.String r7 = "srt"
            boolean r7 = p359ue.AbstractC7157k.m27713v(r1, r7, r4, r3, r6)
            if (r7 != r2) goto L54
            r7 = 1
            goto L55
        L54:
            r7 = 0
        L55:
            java.lang.String r15 = "this as java.lang.String).substring(startIndex)"
            if (r7 == 0) goto L8e
            if (r1 == 0) goto L75
            java.lang.String r3 = "/"
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            r14 = r1
            r7 = r15
            r15 = r3
            int r3 = p359ue.AbstractC7157k.m27691J(r14, r15, r16, r17, r18, r19)
            int r3 = r3 + r2
            java.lang.String r1 = r1.substring(r3)
            ne.AbstractC5868k.m23673e(r1, r7)
            goto L76
        L75:
            r1 = r6
        L76:
            if (r1 == 0) goto Lba
            int r2 = r1.length()
            r3 = 4
            if (r2 < r3) goto Lba
            int r2 = r1.length()
            int r2 = r2 - r3
            java.lang.String r1 = r1.substring(r4, r2)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            ne.AbstractC5868k.m23673e(r1, r2)
            goto Lb9
        L8e:
            r7 = r15
            if (r1 == 0) goto Laa
            java.lang.String r15 = "preview/"
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            r14 = r1
            int r2 = p359ue.AbstractC7157k.m27691J(r14, r15, r16, r17, r18, r19)
            int r2 = r2 + 8
            java.lang.String r1 = r1.substring(r2)
            ne.AbstractC5868k.m23673e(r1, r7)
            goto Lab
        Laa:
            r1 = r6
        Lab:
            if (r1 == 0) goto Lba
            java.lang.String r2 = "?"
            boolean r4 = p359ue.AbstractC7157k.m27713v(r1, r2, r4, r3, r6)
            if (r4 == 0) goto Lba
            java.lang.String r1 = p359ue.AbstractC7157k.m27697a0(r1, r2, r6, r3, r6)
        Lb9:
            r6 = r1
        Lba:
            bc.l2$a r1 = p030bc.C1251l2.f4860b
            r2 = r21
            r3 = r22
            r4 = r11
            r7 = r24
            java.lang.String r1 = r1.m5652a(r2, r3, r4, r5, r6, r7)
            r0.put(r1, r13)
            goto L2f
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bc.C1251l2.m5651s(android.content.Context, java.lang.String, com.request.bean.SubTitleItemData, be.n):java.util.HashMap");
    }
}
