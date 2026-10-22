package gb;

import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import anet.channel.request.Request;
import be.C1328x;
import gb.AbstractC4422e;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ke.AbstractC5252a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p105df.C4103c;
import p359ue.AbstractC7167u;

/* renamed from: gb.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4422e {

    /* renamed from: a */
    public static final a f19130a = new a(null);

    /* renamed from: b */
    private static final String f19131b = "ExternalSubtitles";

    /* renamed from: c */
    private static ArrayList f19132c = new ArrayList();

    /* renamed from: d */
    private static SimpleDateFormat f19133d = new SimpleDateFormat("HH:mm:ss,SSS", Locale.getDefault());

    /* renamed from: e */
    private static long f19134e;

    /* renamed from: f */
    private static Disposable f19135f;

    /* renamed from: g */
    private static Disposable f19136g;

    /* renamed from: gb.e$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gb.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C7848a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ TextView f19137a;

            /* renamed from: b */
            final /* synthetic */ long f19138b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7848a(TextView textView, long j10) {
                super(1);
                this.f19137a = textView;
                this.f19138b = j10;
            }

            /* renamed from: a */
            public final void m18538a(String str) {
                AbstractC4422e.f19130a.m18535j(this.f19137a, this.f19138b);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m18538a((String) obj);
                return C1328x.f4998a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gb.e$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ String f19139a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f19139a = str;
            }

            /* renamed from: a */
            public final void m18539a(String str) {
                AbstractC4422e.f19130a.m18528h(this.f19139a);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m18539a((String) obj);
                return C1328x.f4998a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: g */
        private final String m18527g(String str) {
            String str2 = Request.DEFAULT_CHARSET;
            FileInputStream fileInputStream = null;
            try {
                try {
                    byte[] bArr = new byte[4096];
                    FileInputStream fileInputStream2 = new FileInputStream(str);
                    try {
                        try {
                            C4103c c4103c = new C4103c(null);
                            while (true) {
                                int read = fileInputStream2.read(bArr);
                                if (read <= 0 || c4103c.m17164d()) {
                                    break;
                                }
                                c4103c.m17163c(bArr, 0, read);
                            }
                            c4103c.m17161a();
                            String m17162b = c4103c.m17162b();
                            AbstractC5868k.m23673e(m17162b, "detector.detectedCharset");
                            try {
                                if (!TextUtils.isEmpty(m17162b)) {
                                    str2 = m17162b;
                                }
                                c4103c.m17165e();
                                fileInputStream2.close();
                            } catch (Exception e10) {
                                e = e10;
                                str2 = m17162b;
                                fileInputStream = fileInputStream2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return str2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e12) {
                e = e12;
            }
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public final synchronized void m18528h(String str) {
            List m27748R;
            CharSequence m27758b0;
            List m27748R2;
            boolean m27763v;
            try {
                AbstractC4422e.f19132c.clear();
                File file = new File(str);
                if (file.exists() && file.isFile()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str), m18527g(str)));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            AbstractC5868k.m23673e(readLine, "it.readLine() ?: break");
                            if (AbstractC5868k.m23669a(readLine, "")) {
                                m27748R = AbstractC7167u.m27748R(stringBuffer, new String[]{"@"}, false, 0, 6, null);
                                if (m27748R.size() < 4) {
                                    stringBuffer.delete(0, stringBuffer.length());
                                } else {
                                    C4423f c4423f = new C4423f();
                                    c4423f.m18545f((String) m27748R.get(0));
                                    m27758b0 = AbstractC7167u.m27758b0((String) m27748R.get(1));
                                    m27748R2 = AbstractC7167u.m27748R(m27758b0.toString(), new String[]{"-->"}, false, 0, 6, null);
                                    if (m27748R2.size() == 2) {
                                        c4423f.m18546g(AbstractC4422e.f19133d.parse((String) m27748R2.get(0)).getTime() - AbstractC4422e.f19133d.parse("00:00:00,000").getTime());
                                        c4423f.m18544e(AbstractC4422e.f19133d.parse((String) m27748R2.get(1)).getTime() - AbstractC4422e.f19133d.parse("00:00:00,000").getTime());
                                    }
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    Iterator it = m27748R.subList(2, m27748R.size() - 1).iterator();
                                    while (it.hasNext()) {
                                        stringBuffer2.append((String) it.next());
                                        stringBuffer2.append("<br>");
                                    }
                                    String str2 = "";
                                    m27763v = AbstractC7167u.m27763v(stringBuffer2, "<br>", false, 2, null);
                                    if (m27763v) {
                                        str2 = stringBuffer2.substring(0, stringBuffer2.length() - 4);
                                        AbstractC5868k.m23673e(str2, "content.substring(0, con…t.length - \"<br>\".length)");
                                    }
                                    c4423f.m18543d(str2);
                                    stringBuffer.delete(0, stringBuffer.length());
                                    AbstractC4422e.f19132c.add(c4423f);
                                }
                            } else {
                                stringBuffer.append(readLine);
                                stringBuffer.append("@");
                            }
                        } finally {
                        }
                    }
                    C1328x c1328x = C1328x.f4998a;
                    AbstractC5252a.m21156a(bufferedReader, null);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: i */
        private final int m18529i(long j10) {
            int size = AbstractC4422e.f19132c.size() - 1;
            if (size == 0) {
                return -1;
            }
            int i10 = 0;
            while (i10 <= size) {
                int i11 = (i10 + size) / 2;
                if (j10 < ((C4423f) AbstractC4422e.f19132c.get(i11)).m18542c()) {
                    size = i11 - 1;
                } else if (j10 > ((C4423f) AbstractC4422e.f19132c.get(i11)).m18541b()) {
                    i10 = i11 + 1;
                } else {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static final void m18530k(TextView textView) {
            AbstractC5868k.m23674f(textView, "$textView");
            textView.bringToFront();
            if (textView.getVisibility() == 0) {
                textView.setVisibility(4);
                textView.setText("");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public static final void m18531l(TextView textView, C4423f c4423f) {
            AbstractC5868k.m23674f(textView, "$textView");
            AbstractC5868k.m23674f(c4423f, "$srt");
            textView.bringToFront();
            textView.setVisibility(0);
            textView.setText(Html.fromHtml(c4423f.m18540a()));
            Log.d(AbstractC4422e.f19131b, c4423f.m18540a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m18532n(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            interfaceC5660l.mo542f(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public static final void m18533p(InterfaceC5660l interfaceC5660l, Object obj) {
            AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
            interfaceC5660l.mo542f(obj);
        }

        /* renamed from: f */
        public final void m18534f() {
            Disposable disposable = AbstractC4422e.f19135f;
            if (disposable != null) {
                disposable.dispose();
            }
            AbstractC4422e.f19132c.clear();
            Disposable disposable2 = AbstractC4422e.f19136g;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            AbstractC4422e.f19135f = null;
            AbstractC4422e.f19136g = null;
        }

        /* renamed from: j */
        public final synchronized void m18535j(final TextView textView, long j10) {
            AbstractC5868k.m23674f(textView, "textView");
            if (AbstractC4422e.f19134e != j10) {
                AbstractC4422e.f19134e = j10;
                Log.i(AbstractC4422e.f19131b, "position: " + j10 + ", size: " + AbstractC4422e.f19132c.size());
                int m18529i = m18529i(j10);
                Log.d(AbstractC4422e.f19131b, "searchPos: " + m18529i);
                if (m18529i == -1) {
                    textView.post(new Runnable() { // from class: gb.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC4422e.a.m18530k(textView);
                        }
                    });
                } else {
                    Object obj = AbstractC4422e.f19132c.get(m18529i);
                    AbstractC5868k.m23673e(obj, "subtitleList[searchPos]");
                    final C4423f c4423f = (C4423f) obj;
                    textView.post(new Runnable() { // from class: gb.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC4422e.a.m18531l(textView, c4423f);
                        }
                    });
                }
            }
        }

        /* renamed from: m */
        public final void m18536m(TextView textView, long j10) {
            Disposable disposable;
            AbstractC5868k.m23674f(textView, "textView");
            Disposable disposable2 = AbstractC4422e.f19136g;
            boolean z10 = false;
            if (disposable2 != null && !disposable2.isDisposed()) {
                z10 = true;
            }
            if (z10 && (disposable = AbstractC4422e.f19136g) != null) {
                disposable.dispose();
            }
            Observable subscribeOn = Observable.just("").subscribeOn(Schedulers.m20294io());
            final C7848a c7848a = new C7848a(textView, j10);
            AbstractC4422e.f19136g = subscribeOn.subscribe(new Consumer() { // from class: gb.a
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC4422e.a.m18532n(InterfaceC5660l.this, obj);
                }
            });
        }

        /* renamed from: o */
        public final void m18537o(String str) {
            AbstractC5868k.m23674f(str, "path");
            m18534f();
            if (TextUtils.isEmpty(str)) {
                Log.e(AbstractC4422e.f19131b, "sub path is NULL...");
                return;
            }
            Observable subscribeOn = Observable.just("").subscribeOn(Schedulers.m20294io());
            final b bVar = new b(str);
            AbstractC4422e.f19135f = subscribeOn.subscribe(new Consumer() { // from class: gb.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbstractC4422e.a.m18533p(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    /* renamed from: j */
    public static final void m18519j() {
        f19130a.m18534f();
    }

    /* renamed from: k */
    public static final void m18520k(TextView textView, long j10) {
        f19130a.m18536m(textView, j10);
    }

    /* renamed from: l */
    public static final void m18521l(String str) {
        f19130a.m18537o(str);
    }
}
