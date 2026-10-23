package bb;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Html;
import android.text.TextUtils;
import android.widget.TextView;
import anet.channel.request.Request;
import be.AbstractC1324t;
import be.C1318n;
import be.C1328x;
import com.module.bean.SRT;
import com.request.bean.SubTitleItemData;
import com.umeng.analytics.pro.C3384f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ke.AbstractC5252a;
import ne.AbstractC5868k;
import p043ce.AbstractC1508t;
import p105df.C4103c;
import p153h2.AbstractC4509b;
import p359ue.AbstractC7167u;
import p400xa.C7589m1;

/* renamed from: bb.g */
/* loaded from: classes2.dex */
public final class C1203g {

    /* renamed from: b */
    private HandlerThread f4764b;

    /* renamed from: c */
    private Handler f4765c;

    /* renamed from: g */
    private SRT f4769g;

    /* renamed from: h */
    private SRT f4770h;

    /* renamed from: a */
    private final String f4763a = "SubtitleManger";

    /* renamed from: d */
    private String f4766d = "";

    /* renamed from: e */
    private List f4767e = new ArrayList();

    /* renamed from: f */
    private SimpleDateFormat f4768f = new SimpleDateFormat("HH:mm:ss,SSS", Locale.getDefault());

    /* renamed from: i */
    private int f4771i = -1;

    /* renamed from: h */
    private final String m5486h(String str) {
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

    /* renamed from: j */
    private final boolean m5487j(long j10, SRT srt) {
        if (srt == null || srt.getEndTime() == srt.getStartTime() || j10 < srt.getStartTime() || j10 > srt.getEndTime()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private final void m5488l(String str, String str2) {
        List m27748R;
        List m27748R2;
        CharSequence m27758b0;
        List m27748R3;
        boolean m27763v;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                StringBuffer stringBuffer = new StringBuffer();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str), m5486h(str)));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            C1328x c1328x = C1328x.f4998a;
                            AbstractC5252a.m21156a(bufferedReader, null);
                            return;
                        }
                        AbstractC5868k.m23673e(readLine, "it.readLine() ?: break");
                        if (AbstractC5868k.m23669a(readLine, "")) {
                            m27748R2 = AbstractC7167u.m27748R(stringBuffer, new String[]{"@"}, false, 0, 6, null);
                            if (m27748R2.size() < 3) {
                                stringBuffer.delete(0, stringBuffer.length());
                            } else {
                                SRT srt = new SRT(null, 0L, 0L, null, 15, null);
                                srt.setNode((String) m27748R2.get(0));
                                m27758b0 = AbstractC7167u.m27758b0((String) m27748R2.get(1));
                                m27748R3 = AbstractC7167u.m27748R(m27758b0.toString(), new String[]{"-->"}, false, 0, 6, null);
                                if (m27748R3.size() == 2) {
                                    srt.setStartTime(this.f4768f.parse((String) m27748R3.get(0)).getTime() - this.f4768f.parse("00:00:00,000").getTime());
                                    srt.setEndTime(this.f4768f.parse((String) m27748R3.get(1)).getTime() - this.f4768f.parse("00:00:00,000").getTime());
                                }
                                StringBuffer stringBuffer2 = new StringBuffer();
                                Iterator it = m27748R2.subList(2, m27748R2.size() - 1).iterator();
                                while (it.hasNext()) {
                                    stringBuffer2.append((String) it.next());
                                    stringBuffer2.append("<br>");
                                }
                                m27763v = AbstractC7167u.m27763v(stringBuffer2, "<br>", false, 2, null);
                                if (m27763v) {
                                    String substring = stringBuffer2.substring(0, stringBuffer2.length() - 4);
                                    AbstractC5868k.m23673e(substring, "srtContent");
                                    srt.setContent(substring);
                                } else {
                                    srt.setContent("");
                                }
                                stringBuffer.delete(0, stringBuffer.length());
                                this.f4767e.add(srt);
                            }
                        } else {
                            stringBuffer.append(readLine);
                            stringBuffer.append("@");
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter((Writer) stringWriter, true));
            String stringWriter2 = stringWriter.toString();
            AbstractC5868k.m23673e(stringWriter2, "sw.toString()");
            m27748R = AbstractC7167u.m27748R(stringWriter2, new String[]{"\n"}, false, 0, 6, null);
            String str3 = (String) m27748R.get(0);
            AbstractC4509b.m18869b(this.f4763a, "parse error : " + str3, new Object[0]);
            C7589m1.f27886a.m29128K(str2, str3);
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m5489n(C1203g c1203g, Context context, String str, SubTitleItemData subTitleItemData, C1318n c1318n, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            c1318n = AbstractC1324t.m5980a(Boolean.FALSE, "");
        }
        c1203g.m5500m(context, str, subTitleItemData, c1318n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m5490r(C1203g c1203g) {
        AbstractC5868k.m23674f(c1203g, "this$0");
        c1203g.f4767e.clear();
        c1203g.f4771i = -1;
        c1203g.f4769g = null;
        c1203g.f4770h = null;
    }

    /* renamed from: s */
    private final int m5491s(long j10) {
        int size = this.f4767e.size() - 1;
        if (size > 0 && j10 >= 0) {
            int i10 = (size + 0) / 2;
            int i11 = 0;
            while (i11 <= size) {
                i10 = (i11 + size) / 2;
                if (j10 < ((SRT) this.f4767e.get(i10)).getStartTime()) {
                    size = i10 - 1;
                } else if (j10 > ((SRT) this.f4767e.get(i10)).getEndTime()) {
                    i11 = i10 + 1;
                } else {
                    return i10;
                }
            }
            if (((SRT) this.f4767e.get(i10)).getEndTime() < j10) {
                i10++;
            }
            if (i10 > this.f4767e.size() - 1) {
                return this.f4767e.size() - 1;
            }
            return i10;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m5492u(C1203g c1203g, TextView textView) {
        AbstractC5868k.m23674f(c1203g, "this$0");
        AbstractC5868k.m23674f(textView, "$textView");
        SRT srt = c1203g.f4769g;
        if (srt == null) {
            return;
        }
        AbstractC5868k.m23671c(srt);
        textView.setText(Html.fromHtml(srt.getContent()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m5493v(C1203g c1203g, TextView textView) {
        Object m7008t = null;
        AbstractC5868k.m23674f(c1203g, "this$0");
        AbstractC5868k.m23674f(textView, "$textView");
        SRT srt = c1203g.f4770h;
        if (srt == null) {
            return;
        }
        AbstractC5868k.m23671c(srt);
        textView.setText(Html.fromHtml(srt.getContent()));
        c1203g.f4769g = c1203g.f4770h;
        int i10 = c1203g.f4771i + 1;
        c1203g.f4771i = i10;
        m7008t = AbstractC1508t.m7008t(c1203g.f4767e, i10 + 1);
        c1203g.f4770h = (SRT) m7008t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m5494w(TextView textView) {
        AbstractC5868k.m23674f(textView, "$textView");
        textView.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m5495x(TextView textView, SRT srt, C1203g c1203g) {
        AbstractC5868k.m23674f(textView, "$textView");
        AbstractC5868k.m23674f(c1203g, "this$0");
        AbstractC5868k.m23671c(srt);
        textView.setText(Html.fromHtml(srt.getContent()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m5496y(TextView textView) {
        AbstractC5868k.m23674f(textView, "$textView");
        textView.setText("");
    }

    /* renamed from: g */
    public final void m5497g() {
        Handler handler = this.f4765c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:6:0x0030->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m5498i(android.content.Context r22, java.lang.String r23, com.request.bean.SubTitleItemData r24, be.C1318n r25) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.C1203g.m5498i(android.content.Context, java.lang.String, com.request.bean.SubTitleItemData, be.n):java.lang.String");
    }

    /* renamed from: k */
    public final void m5499k(int i10, long j10, SRT srt, SRT srt2) {
    }

    /* renamed from: m */
    public final void m5500m(Context context, String str, SubTitleItemData subTitleItemData, C1318n c1318n) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(subTitleItemData, "subTitleItemData");
        AbstractC5868k.m23674f(c1318n, "download2Usb");
        String m5498i = m5498i(context, str, subTitleItemData, c1318n);
        this.f4766d = m5498i;
        m5488l(m5498i, str);
    }

    /* renamed from: o */
    public final void m5501o(long j10, Runnable runnable) {
        AbstractC5868k.m23674f(runnable, "r");
        if (this.f4765c == null) {
            m5503q();
        }
        Handler handler = this.f4765c;
        if (handler != null) {
            handler.postDelayed(runnable, j10);
        }
    }

    /* renamed from: p */
    public final void m5502p() {
        Handler handler = this.f4765c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = this.f4764b;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f4764b = null;
        this.f4765c = null;
    }

    /* renamed from: q */
    public final void m5503q() {
        if (this.f4764b == null) {
            HandlerThread handlerThread = new HandlerThread("subTitle");
            this.f4764b = handlerThread;
            handlerThread.start();
            HandlerThread handlerThread2 = this.f4764b;
            AbstractC5868k.m23671c(handlerThread2);
            this.f4765c = new Handler(handlerThread2.getLooper());
        } else {
            Handler handler = this.f4765c;
            AbstractC5868k.m23671c(handler);
            handler.removeCallbacksAndMessages(null);
        }
        this.f4766d = "";
        Handler handler2 = this.f4765c;
        AbstractC5868k.m23671c(handler2);
        handler2.post(new Runnable() { // from class: bb.a
            @Override // java.lang.Runnable
            public final void run() {
                C1203g.m5490r(C1203g.this);
            }
        });
    }

    /* renamed from: t */
    public final long m5504t(final TextView textView, long j10) {
        Object m7008t = null;
        Object m7008t2 = null;
        Object m7008t3 = null;
        AbstractC5868k.m23674f(textView, "textView");
        if (this.f4767e.size() == 0) {
            m5499k(0, j10, this.f4769g, this.f4770h);
            return -1L;
        }
        if (m5487j(j10, this.f4769g)) {
            textView.post(new Runnable() { // from class: bb.b
                @Override // java.lang.Runnable
                public final void run() {
                    C1203g.m5492u(C1203g.this, textView);
                }
            });
            m5499k(1, j10, this.f4769g, this.f4770h);
            SRT srt = this.f4769g;
            AbstractC5868k.m23671c(srt);
            return srt.getEndTime() - j10;
        }
        if (m5487j(j10, this.f4770h)) {
            SRT srt2 = this.f4770h;
            textView.post(new Runnable() { // from class: bb.c
                @Override // java.lang.Runnable
                public final void run() {
                    C1203g.m5493v(C1203g.this, textView);
                }
            });
            m5499k(2, j10, this.f4769g, this.f4770h);
            AbstractC5868k.m23671c(srt2);
            return srt2.getEndTime() - j10;
        }
        SRT srt3 = this.f4769g;
        if (srt3 != null && this.f4770h != null) {
            AbstractC5868k.m23671c(srt3);
            if (j10 > srt3.getEndTime()) {
                SRT srt4 = this.f4770h;
                AbstractC5868k.m23671c(srt4);
                if (j10 < srt4.getStartTime()) {
                    textView.post(new Runnable() { // from class: bb.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1203g.m5494w(textView);
                        }
                    });
                    m5499k(3, j10, this.f4769g, this.f4770h);
                    SRT srt5 = this.f4770h;
                    AbstractC5868k.m23671c(srt5);
                    return srt5.getStartTime() - j10;
                }
            }
        }
        int m5491s = m5491s(j10);
        m7008t = AbstractC1508t.m7008t(this.f4767e, m5491s);
        final SRT srt6 = (SRT) m7008t;
        if (m5487j(j10, srt6)) {
            textView.post(new Runnable() { // from class: bb.e
                @Override // java.lang.Runnable
                public final void run() {
                    C1203g.m5495x(textView, srt6, this);
                }
            });
            this.f4769g = srt6;
            this.f4771i = m5491s;
            m7008t3 = AbstractC1508t.m7008t(this.f4767e, m5491s + 1);
            SRT srt7 = (SRT) m7008t3;
            this.f4770h = srt7;
            m5499k(4, j10, this.f4769g, srt7);
            AbstractC5868k.m23671c(srt6);
            return srt6.getEndTime() - j10;
        }
        textView.post(new Runnable() { // from class: bb.f
            @Override // java.lang.Runnable
            public final void run() {
                C1203g.m5496y(textView);
            }
        });
        int i10 = m5491s - 1;
        this.f4771i = i10;
        m7008t2 = AbstractC1508t.m7008t(this.f4767e, i10);
        SRT srt8 = (SRT) m7008t2;
        this.f4769g = srt8;
        this.f4770h = srt6;
        if (srt6 == null) {
            m5499k(5, j10, srt8, srt6);
            return -1L;
        }
        AbstractC5868k.m23671c(srt6);
        long startTime = srt6.getStartTime() - j10;
        SRT srt9 = this.f4770h;
        AbstractC5868k.m23671c(srt9);
        long startTime2 = srt9.getStartTime();
        SRT srt10 = this.f4770h;
        AbstractC5868k.m23671c(srt10);
        if (startTime2 == srt10.getEndTime()) {
            startTime = 200;
        }
        if ((startTime < 0 && j10 < this.f4767e.size() - 1) || (j10 == 0 && startTime > 500)) {
            startTime = 500;
        }
        m5499k(6, j10, this.f4769g, this.f4770h);
        return startTime;
    }
}
