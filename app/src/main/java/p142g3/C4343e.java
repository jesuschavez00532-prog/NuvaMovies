package p142g3;

import android.os.Environment;
import com.download.bean.DownloadModel;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.utils.IOUtils;
import com.lzy.okgo.utils.OkLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p125f3.C4224c;

/* renamed from: g3.e */
/* loaded from: classes.dex */
public class C4343e {

    /* renamed from: a */
    private String f18915a;

    /* renamed from: b */
    private C4342d f18916b;

    /* renamed from: c */
    private ConcurrentHashMap f18917c;

    /* renamed from: g3.e$a */
    /* loaded from: classes.dex */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(RunnableC4341c runnableC4341c, RunnableC4341c runnableC4341c2) {
            DownloadModel downloadModel = (DownloadModel) runnableC4341c.f18886a.extra1;
            DownloadModel downloadModel2 = (DownloadModel) runnableC4341c2.f18886a.extra1;
            if (downloadModel == null) {
                return -1;
            }
            if (downloadModel2 == null) {
                return 1;
            }
            return (int) (downloadModel.getTimeStamp() - downloadModel2.getTimeStamp());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g3.e$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private static final C4343e f18919a = new C4343e(null);
    }

    /* synthetic */ C4343e(a aVar) {
        this();
    }

    /* renamed from: a */
    public static C4343e m18227a() {
        return b.f18919a;
    }

    /* renamed from: g */
    public static void m18228g() {
        List<Progress> m17673s = C4224c.m17666u().m17673s();
        for (Progress progress : m17673s) {
            int i10 = progress.status;
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                progress.status = 0;
            }
        }
        C4224c.m17666u().m17661l(m17673s);
    }

    /* renamed from: h */
    public static List m18229h(List list) {
        Map m18231c = m18227a().m18231c();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Progress progress = (Progress) it.next();
            RunnableC4341c runnableC4341c = (RunnableC4341c) m18231c.get(progress.tag);
            if (runnableC4341c == null) {
                runnableC4341c = new RunnableC4341c(progress);
                m18231c.put(progress.tag, runnableC4341c);
            }
            arrayList.add(runnableC4341c);
        }
        return arrayList;
    }

    /* renamed from: b */
    public RunnableC4341c m18230b(String str) {
        return (RunnableC4341c) this.f18917c.get(str);
    }

    /* renamed from: c */
    public Map m18231c() {
        return this.f18917c;
    }

    /* renamed from: d */
    public C4342d m18232d() {
        return this.f18916b;
    }

    /* renamed from: e */
    public void m18233e() {
        for (Map.Entry entry : this.f18917c.entrySet()) {
            RunnableC4341c runnableC4341c = (RunnableC4341c) entry.getValue();
            if (runnableC4341c == null) {
                OkLogger.m11766w("can't find task with tag = " + ((String) entry.getKey()));
            } else {
                int i10 = runnableC4341c.f18886a.status;
                if (i10 != 2 && i10 != 5) {
                    runnableC4341c.m18219c();
                }
            }
        }
        for (Map.Entry entry2 : this.f18917c.entrySet()) {
            RunnableC4341c runnableC4341c2 = (RunnableC4341c) entry2.getValue();
            if (runnableC4341c2 == null) {
                OkLogger.m11766w("can't find task with tag = " + ((String) entry2.getKey()));
            } else if (runnableC4341c2.f18886a.status == 2) {
                runnableC4341c2.m18219c();
            }
        }
    }

    /* renamed from: f */
    public RunnableC4341c m18234f(String str) {
        return (RunnableC4341c) this.f18917c.remove(str);
    }

    /* renamed from: i */
    public void m18235i() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f18917c.entrySet()) {
            RunnableC4341c runnableC4341c = (RunnableC4341c) entry.getValue();
            if (runnableC4341c == null) {
                OkLogger.m11766w("can't find task with tag = " + ((String) entry.getKey()));
            } else {
                int i10 = runnableC4341c.f18886a.status;
                if (i10 != 5 && !runnableC4341c.f18893h && i10 != 4) {
                    arrayList.add(runnableC4341c);
                }
            }
        }
        Collections.sort(arrayList, new a());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((RunnableC4341c) it.next()).m18223o();
        }
    }

    private C4343e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        sb2.append(str);
        sb2.append("download");
        sb2.append(str);
        String sb3 = sb2.toString();
        this.f18915a = sb3;
        IOUtils.createFolder(sb3);
        this.f18916b = new C4342d();
        this.f18917c = new ConcurrentHashMap();
    }
}
