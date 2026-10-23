package p218l3;

import be.AbstractC1320p;
import be.C1328x;
import com.download.bean.DownloadModel;
import com.download.bean.LocalPlayBean;
import com.lzy.okgo.model.Progress;
import ee.InterfaceC4181d;
import ge.AbstractC4445l;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.InterfaceC5664p;
import ne.AbstractC5859b;
import ne.AbstractC5868k;
import ne.C5878u;
import p125f3.C4224c;
import p136fe.AbstractC4313d;
import p142g3.C4343e;
import p142g3.RunnableC4341c;
import p186j3.InterfaceC4983a;
import p186j3.InterfaceC4984b;
import p258o3.C5911g;
import p258o3.C5913i;
import p359ue.AbstractC7166t;
import p430z9.AbstractC7765c;
import ve.AbstractC7269d;
import ve.AbstractC7272e;
import ve.AbstractC7329x;
import ve.C7297m0;
import ve.C7327w0;
import ve.InterfaceC7261a0;
import ve.InterfaceC7271d1;

/* renamed from: l3.a */
/* loaded from: classes.dex */
public final class C5350a implements InterfaceC4983a {

    /* renamed from: a */
    private AbstractC7765c f21873a;

    /* renamed from: b */
    private InterfaceC4984b f21874b;

    /* renamed from: c */
    private InterfaceC7271d1 f21875c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4445l implements InterfaceC5664p {

        /* renamed from: e */
        Object f21876e = null;

        /* renamed from: f */
        int f21877f;

        /* renamed from: h */
        final /* synthetic */ C5878u f21879h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C7853a extends AbstractC4445l implements InterfaceC5664p {

            /* renamed from: e */
            int f21880e;

            C7853a(InterfaceC4181d interfaceC4181d) {
                super(2, interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: a */
            public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                return new C7853a(interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: l */
            public final Object mo2392l(Object obj) {
                File[] listFiles;
                boolean m27721h;
                boolean m27721h2;
                boolean m27721h3;
                String str = null;
                AbstractC4313d.m18094c();
                if (this.f21880e == 0) {
                    AbstractC1320p.m5976b(obj);
                    ArrayList arrayList = new ArrayList();
                    List m18229h = C4343e.m18229h(C4224c.m17666u().m17674t());
                    AbstractC5868k.m23672d(m18229h, "null cannot be cast to non-null type java.util.ArrayList<com.download.download.DownloadTask>{ kotlin.collections.TypeAliasesKt.ArrayList<com.download.download.DownloadTask> }");
                    Iterator it = ((ArrayList) m18229h).iterator();
                    AbstractC5868k.m23673e(it, "arrayList.iterator()");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC5868k.m23673e(next, "iterator.next()");
                        RunnableC4341c runnableC4341c = (RunnableC4341c) next;
                        StringBuilder sb2 = new StringBuilder();
                        C5911g.a aVar = C5911g.f23514h;
                        sb2.append(aVar.m23905a().m23897l());
                        sb2.append('/');
                        sb2.append(runnableC4341c.f18886a.filePath);
                        File file = new File(sb2.toString());
                        if (file.exists() && !file.isDirectory()) {
                            Progress progress = runnableC4341c.f18886a;
                            Serializable serializable = progress.extra1;
                            if (serializable instanceof DownloadModel) {
                                AbstractC5868k.m23672d(serializable, "null cannot be cast to non-null type com.download.bean.DownloadModel");
                                str = ((DownloadModel) serializable).getName();
                            } else {
                                str = progress.fileName;
                            }
                            AbstractC5868k.m23673e(str, Progress.FILE_NAME);
                            arrayList.add(new LocalPlayBean(str, aVar.m23905a().m23897l() + '/' + runnableC4341c.f18886a.filePath, C5913i.m23913b(runnableC4341c.f18886a.totalSize), runnableC4341c));
                        }
                    }
                    String m23895j = C5911g.f23514h.m23905a().m23895j();
                    if (m23895j != null && new File(m23895j).exists()) {
                        File file2 = new File(m23895j);
                        if (file2.exists() && file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                            Iterator m23657a = AbstractC5859b.m23657a(listFiles);
                            while (m23657a.hasNext()) {
                                File file3 = (File) m23657a.next();
                                if (!file3.isDirectory()) {
                                    String name = file3.getName();
                                    AbstractC5868k.m23673e(name, "item.name");
                                    m27721h = AbstractC7166t.m27721h(name, ".mp4", true);
                                    if (!m27721h) {
                                        String name2 = file3.getName();
                                        AbstractC5868k.m23673e(name2, "item.name");
                                        m27721h2 = AbstractC7166t.m27721h(name2, ".flv", true);
                                        if (!m27721h2) {
                                            String name3 = file3.getName();
                                            AbstractC5868k.m23673e(name3, "item.name");
                                            m27721h3 = AbstractC7166t.m27721h(name3, ".ts", true);
                                            if (m27721h3) {
                                            }
                                        }
                                    }
                                    String name4 = file3.getName();
                                    AbstractC5868k.m23673e(name4, "item.name");
                                    String absolutePath = file3.getAbsolutePath();
                                    AbstractC5868k.m23673e(absolutePath, "item.absolutePath");
                                    arrayList.add(new LocalPlayBean(name4, absolutePath, C5913i.m23913b(file3.length()), null));
                                }
                            }
                        }
                    }
                    return arrayList;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // me.InterfaceC5664p
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                return ((C7853a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5878u c5878u, InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
            this.f21879h = c5878u;
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            return new a(this.f21879h, interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        public final Object mo2392l(Object obj) {
            Object m18094c = null;
            C5878u c5878u;
            m18094c = AbstractC4313d.m18094c();
            int i10 = this.f21877f;
            if (i10 != 0) {
                if (i10 == 1) {
                    c5878u = (C5878u) this.f21876e;
                    AbstractC1320p.m5976b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1320p.m5976b(obj);
                C5350a.this.m21636a().mo18887g(true);
                C5878u c5878u2 = this.f21879h;
                AbstractC7329x m28252b = C7297m0.m28252b();
                C7853a c7853a = new C7853a(null);
                this.f21876e = c5878u2;
                this.f21877f = 1;
                Object m28113c = AbstractC7269d.m28113c(m28252b, c7853a, this);
                if (m28113c == m18094c) {
                    return m18094c;
                }
                c5878u = c5878u2;
                obj = m28113c;
            }
            c5878u.f23412a = obj;
            C5350a.this.m21636a().mo18887g(false);
            if (((List) this.f21879h.f23412a).isEmpty()) {
                C5350a.this.m21636a().mo18886X();
            } else {
                C5350a.this.m21636a().mo18885U5((List) this.f21879h.f23412a);
            }
            return C1328x.f4998a;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
            return ((a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
        }
    }

    public C5350a(AbstractC7765c abstractC7765c, InterfaceC4984b interfaceC4984b) {
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4984b, "view");
        this.f21873a = abstractC7765c;
        this.f21874b = interfaceC4984b;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        mo20341h();
    }

    /* renamed from: a */
    public final InterfaceC4984b m21636a() {
        return this.f21874b;
    }

    @Override // p186j3.InterfaceC4983a
    /* renamed from: h */
    public void mo20341h() {
        if (C5911g.f23514h.m23905a().m23900q()) {
            mo20342j();
        } else {
            this.f21874b.mo18881G();
        }
    }

    @Override // p186j3.InterfaceC4983a
    /* renamed from: j */
    public void mo20342j() {
        InterfaceC7271d1 m28125b;
        C5878u c5878u = new C5878u();
        InterfaceC7271d1 interfaceC7271d1 = this.f21875c;
        if (interfaceC7271d1 != null) {
            InterfaceC7271d1.a.m28118a(interfaceC7271d1, null, 1, null);
        }
        m28125b = AbstractC7272e.m28125b(C7327w0.f27234a, C7297m0.m28253c(), null, new a(c5878u, null), 2, null);
        this.f21875c = m28125b;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        InterfaceC7271d1 interfaceC7271d1 = this.f21875c;
        if (interfaceC7271d1 != null) {
            InterfaceC7271d1.a.m28118a(interfaceC7271d1, null, 1, null);
        }
    }
}
