package p142g3;

import android.content.ContentValues;
import android.os.SystemClock;
import cc.AbstractC1457i;
import com.download.bean.DownloadFinishEvent;
import com.download.bean.DownloadModel;
import com.download.bean.DownloadParams;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.exception.StorageException;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.request.PostRequest;
import com.lzy.okgo.utils.HttpUtils;
import com.lzy.okgo.utils.IOUtils;
import com.lzy.okgo.utils.OkLogger;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.converterFactory.bean.ResultException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.Response;
import p030bc.C1224f;
import p125f3.C4224c;
import p134fc.AbstractC4305b;
import p245n3.RunnableC5738c;
import p258o3.C5909e;
import p258o3.C5911g;
import p348u2.AbstractC7027d;
import p400xa.C7589m1;
import p400xa.C7615w;
import ye.C7709c;

/* renamed from: g3.c */
/* loaded from: classes.dex */
public class RunnableC4341c implements Runnable {

    /* renamed from: a */
    public Progress f18886a;

    /* renamed from: b */
    public Map f18887b;

    /* renamed from: c */
    private ThreadPoolExecutor f18888c;

    /* renamed from: d */
    private RunnableC5738c f18889d;

    /* renamed from: e */
    private List f18890e;

    /* renamed from: f */
    private int f18891f;

    /* renamed from: g */
    private int f18892g;

    /* renamed from: h */
    public boolean f18893h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g3.c$a */
    /* loaded from: classes.dex */
    public class a implements Progress.Action {
        a() {
        }

        @Override // com.lzy.okgo.model.Progress.Action
        public void call(Progress progress) {
            RunnableC4341c.this.m18209e(progress);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g3.c$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Progress f18895a;

        b(Progress progress) {
            this.f18895a = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = RunnableC4341c.this.f18887b.values().iterator();
            while (it.hasNext()) {
                ((AbstractC4340b) it.next()).mo17286a(this.f18895a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g3.c$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Progress f18897a;

        c(Progress progress) {
            this.f18897a = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = RunnableC4341c.this.f18887b.values().iterator();
            while (it.hasNext()) {
                ((AbstractC4340b) it.next()).mo17288c(this.f18897a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g3.c$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Progress f18899a;

        d(Progress progress) {
            this.f18899a = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5909e.m23871k(OkGo.getInstance().getContext()).m23876m();
            C5909e.m23871k(OkGo.getInstance().getContext()).m23875l(1);
            Iterator it = RunnableC4341c.this.f18887b.values().iterator();
            while (it.hasNext()) {
                ((AbstractC4340b) it.next()).mo17288c(this.f18899a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g3.c$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Progress f18901a;

        e(Progress progress) {
            this.f18901a = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5909e.m23871k(OkGo.getInstance().getContext()).m23876m();
            C5909e.m23871k(OkGo.getInstance().getContext()).m23877n(this.f18901a.speed);
            Iterator it = RunnableC4341c.this.f18887b.values().iterator();
            while (it.hasNext()) {
                ((AbstractC4340b) it.next()).mo17288c(this.f18901a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g3.c$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Progress f18903a;

        f(Progress progress) {
            this.f18903a = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5909e.m23871k(OkGo.getInstance().getContext()).m23876m();
            C5909e.m23871k(OkGo.getInstance().getContext()).m23875l(2);
            for (AbstractC4340b abstractC4340b : RunnableC4341c.this.f18887b.values()) {
                abstractC4340b.mo17288c(this.f18903a);
                abstractC4340b.mo17287b(this.f18903a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g3.c$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Progress f18905a;

        /* renamed from: b */
        final /* synthetic */ File f18906b;

        g(Progress progress, File file) {
            this.f18905a = progress;
            this.f18906b = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5909e.m23871k(OkGo.getInstance().getContext()).m23873h();
            C7709c.m29787d().m29801m(new DownloadFinishEvent());
            for (AbstractC4340b abstractC4340b : RunnableC4341c.this.f18887b.values()) {
                abstractC4340b.mo17288c(this.f18905a);
                abstractC4340b.mo17289d(this.f18906b, this.f18905a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g3.c$h */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Progress f18908a;

        h(Progress progress) {
            this.f18908a = progress;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = RunnableC4341c.this.f18887b.values().iterator();
            while (it.hasNext()) {
                ((AbstractC4340b) it.next()).mo17290e(this.f18908a);
            }
            RunnableC4341c.this.f18887b.clear();
        }
    }

    public RunnableC4341c(Progress progress) {
        this.f18891f = 0;
        this.f18892g = 0;
        HttpUtils.checkNotNull(progress, "progress == null");
        this.f18886a = progress;
        this.f18888c = C4343e.m18227a().m18232d().m18225a();
        this.f18887b = new HashMap();
        Serializable serializable = progress.extra1;
        if (serializable instanceof DownloadModel) {
            List<DownloadParams> params = ((DownloadModel) serializable).getParams();
            this.f18890e = params;
            int size = params.size() - 1;
            this.f18892g = size;
            this.f18892g = Math.max(size, 0);
            this.f18891f = 0;
        }
    }

    /* renamed from: b */
    private void m18208b(InputStream inputStream, RandomAccessFile randomAccessFile, Progress progress) {
        long j10;
        long j11;
        if (inputStream != null && randomAccessFile != null) {
            byte[] bArr = new byte[8192];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = 0;
            long j13 = 0;
            while (true) {
                try {
                    try {
                        int read = bufferedInputStream.read(bArr, 0, 8192);
                        if (read == -1 || progress.status != 2) {
                            break;
                        }
                        randomAccessFile.write(bArr, 0, read);
                        long j14 = read;
                        long j15 = j12 + j14;
                        C7615w c7615w = C7615w.f27995a;
                        if (c7615w.m29309O() && j15 - j13 > c7615w.m29318y()) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (elapsedRealtime2 < 1000) {
                                try {
                                    Thread.sleep(1000 - elapsedRealtime2);
                                } catch (InterruptedException e10) {
                                    e10.printStackTrace();
                                }
                            }
                            j10 = SystemClock.elapsedRealtime();
                            j11 = j15;
                        } else {
                            j10 = elapsedRealtime;
                            j11 = j13;
                        }
                        Progress.changeProgress(progress, j14, progress.totalSize, new a());
                        j12 = j15;
                        elapsedRealtime = j10;
                        j13 = j11;
                    } finally {
                        IOUtils.closeQuietly(randomAccessFile);
                        IOUtils.closeQuietly(bufferedInputStream);
                        IOUtils.closeQuietly(inputStream);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m18209e(Progress progress) {
        C7615w c7615w = C7615w.f27995a;
        if (c7615w.m29309O() && progress.speed > c7615w.m29318y()) {
            progress.speed = c7615w.m29318y();
        }
        HttpUtils.runOnUiThread(new e(progress));
    }

    /* renamed from: f */
    private void m18210f(Progress progress, Throwable th) {
        progress.speed = 0L;
        progress.status = 4;
        progress.exception = th;
        m18217q(progress);
        HttpUtils.runOnUiThread(new f(progress));
    }

    /* renamed from: g */
    private void m18211g(Progress progress, File file) {
        progress.speed = 0L;
        progress.fraction = 1.0f;
        progress.status = 5;
        m18217q(progress);
        C7589m1.f27886a.m29155x();
        HttpUtils.runOnUiThread(new g(progress, file));
    }

    /* renamed from: h */
    private void m18212h(Progress progress) {
        m18217q(progress);
        HttpUtils.runOnUiThread(new h(progress));
    }

    /* renamed from: i */
    private void m18213i(Progress progress) {
        progress.speed = 0L;
        progress.status = 0;
        m18217q(progress);
        HttpUtils.runOnUiThread(new b(progress));
    }

    /* renamed from: j */
    private void m18214j(Progress progress) {
        progress.speed = 0L;
        progress.status = 3;
        m18217q(progress);
        HttpUtils.runOnUiThread(new d(progress));
    }

    /* renamed from: k */
    private void m18215k(Progress progress) {
        progress.speed = 0L;
        progress.status = 1;
        m18217q(progress);
        HttpUtils.runOnUiThread(new c(progress));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    private Response m18216n() {
        int i10 = this.f18891f;
        if (i10 >= this.f18892g) {
            return null;
        }
        try {
            this.f18891f = i10 + 1;
            ArrayList arrayList = new ArrayList();
            arrayList.add((DownloadParams) this.f18890e.get(this.f18891f));
            String json = AbstractC7027d.m27114a().toJson(arrayList);
            String m6795c = AbstractC1457i.m6795c(json, AbstractC4305b.f18742a.substring(0, 8));
            PostRequest post = OkGo.post(((DownloadParams) this.f18890e.get(this.f18891f)).getUrl());
            ((PostRequest) ((PostRequest) ((PostRequest) post.headers("apkVer", this.f18886a.request.getHeaders().get("apkVer"))).headers("apk", this.f18886a.request.getHeaders().get("apk"))).params("data", m6795c, new boolean[0])).params("len", json.getBytes().length, new boolean[0]);
            post.headers(HttpHeaders.HEAD_KEY_RANGE, "bytes=" + this.f18886a.currentSize + Operator.Operation.MINUS);
            Response execute = post.execute();
            int code = execute.code();
            if (code != 500 && code != 503) {
                return execute;
            }
            return m18216n();
        } catch (IOException e10) {
            if (e10 instanceof ResultException) {
                return null;
            }
            return m18216n();
        }
    }

    /* renamed from: q */
    private void m18217q(Progress progress) {
        ContentValues buildUpdateContentValues = Progress.buildUpdateContentValues(progress);
        C4224c m17667v = C4224c.m17667v();
        if (m17667v != null) {
            m17667v.m17678z(buildUpdateContentValues, progress.tag);
        }
    }

    /* renamed from: r */
    private Response m18218r() {
        try {
            DownloadModel downloadModel = (DownloadModel) this.f18886a.extra1;
            retrofit2.Response execute = C1224f.f4816e.m5631a().m5624x0(-1, downloadModel.getContentId(), downloadModel.getSeriesContentId(), "1", 0, null, null).execute();
            if (execute.m25763d()) {
                int size = this.f18890e.size() - 1;
                this.f18892g = size;
                this.f18892g = Math.max(size, 0);
                this.f18891f = -1;
                return m18216n();
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public void m18219c() {
        this.f18888c.remove(this.f18889d);
        Progress progress = this.f18886a;
        int i10 = progress.status;
        if (i10 == 1) {
            m18214j(progress);
            return;
        }
        if (i10 == 2) {
            progress.speed = 0L;
            progress.status = 3;
        } else {
            OkLogger.m11766w("only the task with status WAITING(1) or LOADING(2) can pause, current status is " + this.f18886a.status);
        }
    }

    /* renamed from: d */
    public void m18220d() {
        this.f18893h = true;
        m18219c();
    }

    /* renamed from: l */
    public RunnableC4341c m18221l(AbstractC4340b abstractC4340b) {
        if (abstractC4340b != null) {
            this.f18887b.put(abstractC4340b.f18885a, abstractC4340b);
        }
        return this;
    }

    /* renamed from: m */
    public RunnableC4341c m18222m(boolean z10) {
        m18219c();
        if (z10) {
            IOUtils.delFileOrFolder(C5911g.f23514h.m23905a().m23897l() + File.separator + this.f18886a.filePath);
        }
        C4224c.m17666u().m17669o(this.f18886a.tag);
        RunnableC4341c m18234f = C4343e.m18227a().m18234f(this.f18886a.tag);
        m18212h(this.f18886a);
        return m18234f;
    }

    /* renamed from: o */
    public void m18223o() {
        if (C4343e.m18227a().m18230b(this.f18886a.tag) != null && C4224c.m17666u().m17670p(this.f18886a.tag) != null) {
            this.f18893h = false;
            Progress progress = this.f18886a;
            int i10 = progress.status;
            if (i10 != 0 && i10 != 3 && i10 != 4) {
                if (i10 == 5) {
                    if (progress.filePath == null) {
                        m18210f(progress, new StorageException("the file of the task with tag:" + this.f18886a.tag + " may be invalid or damaged, please call the method restart() to download again！"));
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    C5911g.a aVar = C5911g.f23514h;
                    sb2.append(aVar.m23905a().m23897l());
                    String str = File.separator;
                    sb2.append(str);
                    sb2.append(this.f18886a.filePath);
                    File file = new File(sb2.toString());
                    if (file.exists()) {
                        long length = file.length();
                        Progress progress2 = this.f18886a;
                        if (length == progress2.totalSize) {
                            m18211g(progress2, new File(aVar.m23905a().m23897l() + str + this.f18886a.filePath));
                            return;
                        }
                    }
                    m18210f(this.f18886a, new StorageException("the file " + this.f18886a.filePath + " may be invalid or damaged, please call the method restart() to download again！"));
                    return;
                }
                OkLogger.m11766w("the task with tag " + this.f18886a.tag + " is already in the download queue, current task status is " + this.f18886a.status);
                return;
            }
            m18213i(progress);
            m18215k(this.f18886a);
            RunnableC5738c runnableC5738c = new RunnableC5738c(this.f18886a.priority, this);
            this.f18889d = runnableC5738c;
            this.f18888c.execute(runnableC5738c);
            return;
        }
        throw new IllegalStateException("you must call DownloadTask#save() before DownloadTask#start()！");
    }

    /* renamed from: p */
    public void m18224p(String str) {
        HttpUtils.checkNotNull(str, "tag == null");
        this.f18887b.remove(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0315, code lost:
    
        r3 = r16.f18886a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x031b, code lost:
    
        if (r5 <= r3.totalSize) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x031d, code lost:
    
        m18210f(r3, com.lzy.okgo.exception.OkGoException.BREAKPOINT_EXPIRED());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0324, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0327, code lost:
    
        if (r5 != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x032d, code lost:
    
        if (r0.exists() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x032f, code lost:
    
        com.lzy.okgo.utils.IOUtils.delFileOrFolder(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0338, code lost:
    
        if (r5 != r16.f18886a.totalSize) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x033c, code lost:
    
        if (r5 <= 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0342, code lost:
    
        if (r0.exists() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034a, code lost:
    
        if (r5 != r0.length()) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x034c, code lost:
    
        m18211g(r16.f18886a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0351, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0352, code lost:
    
        m18210f(r16.f18886a, com.lzy.okgo.exception.OkGoException.BREAKPOINT_EXPIRED());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x035b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x035c, code lost:
    
        r3 = new java.io.RandomAccessFile(r0, "rw");
        r3.seek(r5);
        r16.f18886a.currentSize = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x036a, code lost:
    
        p125f3.C4224c.m17666u().m17660k(r16.f18886a);
        m18208b(r2.byteStream(), r3, r16.f18886a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x037c, code lost:
    
        r2 = r16.f18886a;
        r3 = r2.status;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0381, code lost:
    
        if (r3 != 3) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0383, code lost:
    
        m18214j(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0388, code lost:
    
        if (r3 != 2) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x038a, code lost:
    
        r2 = r0.length();
        r4 = r16.f18886a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0394, code lost:
    
        if (r2 != r4.totalSize) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0396, code lost:
    
        m18211g(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x039a, code lost:
    
        m18210f(r4, com.lzy.okgo.exception.OkGoException.BREAKPOINT_EXPIRED());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03a3, code lost:
    
        m18210f(r16.f18886a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03a8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03aa, code lost:
    
        m18210f(r16.f18886a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03af, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02de, code lost:
    
        r0 = new java.io.File(r3.m23905a().m23897l() + r9 + r16.f18886a.filePath);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x014b, code lost:
    
        if (r2 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0165, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0145, code lost:
    
        if (r0.code() != 503) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0166, code lost:
    
        r2 = r0.code();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016c, code lost:
    
        if (r2 == 200) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0170, code lost:
    
        if (r2 == 206) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0174, code lost:
    
        if (r2 != 400) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0176, code lost:
    
        r0 = "APK请求LSLB参数错误，EC-7";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019d, code lost:
    
        m18210f(r16.f18886a, new p142g3.C4339a(r0, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0179, code lost:
    
        if (r2 != 401) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017b, code lost:
    
        r0 = "防盗链认证失败，EC-8";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0180, code lost:
    
        if (r2 != 404) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0182, code lost:
    
        r0 = "流不存在或没有发布，EC-9";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0185, code lost:
    
        if (r2 != 409) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0187, code lost:
    
        r0 = "用户关联分组内无可用推流服务器，EC-10";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018a, code lost:
    
        if (r2 != 500) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018c, code lost:
    
        r0 = "服务器内部错误";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0191, code lost:
    
        if (r2 != 502) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0193, code lost:
    
        r0 = "用户终端连接主备SLB均失败，EC-6";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0196, code lost:
    
        if (r2 != 503) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0198, code lost:
    
        r0 = "lslb请求其它异常，比如DNS无法解析域名，EC-20";
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019b, code lost:
    
        r0 = "network error! http response code is 4xx or 5xx!";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a8, code lost:
    
        r2 = r0.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ac, code lost:
    
        if (r2 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ae, code lost:
    
        m18210f(r16.f18886a, new com.lzy.okgo.exception.HttpException("response body is null"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bb, code lost:
    
        r3 = r16.f18886a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c3, code lost:
    
        if (r3.totalSize != (-1)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c5, code lost:
    
        r3.totalSize = r2.contentLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01cb, code lost:
    
        r3 = p258o3.C5911g.f23514h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e5, code lost:
    
        if (r16.f18886a.totalSize < ((java.lang.Long) r3.m23905a().m23899p().m5969c()).longValue()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e7, code lost:
    
        p142g3.C4343e.m18227a().m18233e();
        m18210f(r16.f18886a, new com.lzy.okgo.exception.StorageException("The external USB storage has insufficient space"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ff, code lost:
    
        if (r0.request() == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0209, code lost:
    
        if (r0.request().url() == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x020b, code lost:
    
        r4 = r0.request().url().pathSegments();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0217, code lost:
    
        if (r4 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0219, code lost:
    
        r4 = r4.get(r4.size() - 1);
        r9 = r4.lastIndexOf(".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x022b, code lost:
    
        if (r9 < 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022d, code lost:
    
        r4 = r4.substring(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0239, code lost:
    
        if (r16.f18886a.fileName.contains(r4) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x023b, code lost:
    
        r9 = new java.lang.StringBuilder();
        r10 = r16.f18886a;
        r9.append(r10.fileName);
        r9.append(r4);
        r10.fileName = r9.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0250, code lost:
    
        r4 = r16.f18886a.fileName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0258, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x025a, code lost:
    
        r4 = com.lzy.okgo.utils.HttpUtils.getNetFileName(r0, r16.f18886a.url);
        r16.f18886a.fileName = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0266, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append(r3.m23905a().m23897l());
        r9 = java.io.File.separator;
        r0.append(r9);
        r0.append(r16.f18886a.folder);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x028a, code lost:
    
        if (com.lzy.okgo.utils.IOUtils.createFolder(r0.toString()) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x028c, code lost:
    
        m18210f(r16.f18886a, com.lzy.okgo.exception.StorageException.NOT_AVAILABLE());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0295, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x029e, code lost:
    
        if (android.text.TextUtils.isEmpty(r16.f18886a.filePath) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02a0, code lost:
    
        r0 = new java.io.File(r3.m23905a().m23897l() + r9 + r16.f18886a.folder, r4);
        r16.f18886a.filePath = r16.f18886a.folder + r9 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0303, code lost:
    
        if (r5 <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0309, code lost:
    
        if (r0.exists() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x030b, code lost:
    
        m18210f(r16.f18886a, com.lzy.okgo.exception.OkGoException.BREAKPOINT_EXPIRED());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0314, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.lzy.okgo.request.base.Request] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p142g3.RunnableC4341c.run():void");
    }
}
