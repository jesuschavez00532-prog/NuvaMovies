package bd;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import bd.C1304k;
import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.Progress;
import com.titan.ranger.Status;
import com.titan.ranger.bean.report.PlayError;
import com.titan.ranger.bean.report.PlayFile;
import com.titan.ranger.bean.report.PlayMedia;
import com.titan.ranger.bean.report.PlayProgram;
import com.titan.ranger.bean.report.SwitchPlayer;
import com.umeng.ccg.C3417a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5868k;
import p357uc.C7076c;
import p357uc.C7077d;
import p386wc.InterfaceC7392a;
import p386wc.InterfaceC7393b;
import p421z0.C7731e;
import p432zc.AbstractC7781a;

/* renamed from: bd.k */
/* loaded from: classes.dex */
public final class C1304k {

    /* renamed from: a */
    public static final C1304k f4966a = new C1304k();

    /* renamed from: b */
    private static final String f4967b = "TitanCallback";

    /* renamed from: c */
    private static final List f4968c = new ArrayList();

    /* renamed from: d */
    private static final List f4969d = new ArrayList();

    /* renamed from: e */
    private static Handler f4970e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private static InterfaceC7392a f4971f = new a();

    /* renamed from: g */
    private static InterfaceC7393b f4972g = new b();

    /* renamed from: bd.k$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC7392a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public static final void m5926A(int i10, String str) {
            AbstractC5868k.m23674f(str, "$name");
            Iterator it = C1304k.f4968c.iterator();
            while (it.hasNext()) {
                ((InterfaceC7392a) it.next()).mo5944c(i10, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public static final void m5927B(int i10, String str, String str2, int i11, String str3) {
            AbstractC5868k.m23674f(str, "$obj");
            AbstractC5868k.m23674f(str2, "$action");
            AbstractC5868k.m23674f(str3, "$name");
            Iterator it = C1304k.f4968c.iterator();
            while (it.hasNext()) {
                ((InterfaceC7392a) it.next()).mo5948g(i10, str, str2, i11, str3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static final void m5937t(boolean z10, Bitmap bitmap, String str) {
            AbstractC5868k.m23674f(str, "$name");
            Iterator it = C1304k.f4968c.iterator();
            while (it.hasNext()) {
                ((InterfaceC7392a) it.next()).mo5950i(z10, bitmap, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public static final void m5938u(int i10, long j10, String str) {
            AbstractC5868k.m23674f(str, "$name");
            Iterator it = C1304k.f4968c.iterator();
            while (it.hasNext()) {
                ((InterfaceC7392a) it.next()).mo5949h(i10, j10, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public static final void m5939v(int i10, String str, String str2) {
            AbstractC5868k.m23674f(str, "$type");
            AbstractC5868k.m23674f(str2, "$name");
            Iterator it = C1304k.f4968c.iterator();
            while (it.hasNext()) {
                ((InterfaceC7392a) it.next()).mo5946e(i10, str, str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static final void m5940w(boolean z10, String str) {
            AbstractC5868k.m23674f(str, "$name");
            Iterator it = C1304k.f4968c.iterator();
            while (it.hasNext()) {
                ((InterfaceC7392a) it.next()).mo5952k(z10, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public static final void m5941x(int i10, int i11, String str, String str2) {
            AbstractC5868k.m23674f(str, "$player");
            AbstractC5868k.m23674f(str2, "$name");
            Iterator it = C1304k.f4968c.iterator();
            while (it.hasNext()) {
                ((InterfaceC7392a) it.next()).mo5951j(i10, i11, str, str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static final void m5942y(int i10, int i11, int i12, String str, String str2) {
            AbstractC5868k.m23674f(str, "$type");
            AbstractC5868k.m23674f(str2, "$name");
            Iterator it = C1304k.f4968c.iterator();
            while (it.hasNext()) {
                ((InterfaceC7392a) it.next()).mo5953l(i10, i11, i12, str, str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public static final void m5943z(int i10, long j10, String str) {
            AbstractC5868k.m23674f(str, "$name");
            Iterator it = C1304k.f4968c.iterator();
            while (it.hasNext()) {
                ((InterfaceC7392a) it.next()).mo5947f(i10, j10, str);
            }
        }

        @Override // p386wc.InterfaceC7392a
        /* renamed from: c */
        public void mo5944c(final int i10, final String str) {
            AbstractC5868k.m23674f(str, SerializableCookie.NAME);
            Log.i(C1304k.f4967b, "onSeekComplete ----> 当前callBack集合size为" + C1304k.f4968c.size());
            C1304k.f4970e.post(new Runnable() { // from class: bd.d
                @Override // java.lang.Runnable
                public final void run() {
                    C1304k.a.m5926A(i10, str);
                }
            });
        }

        @Override // p386wc.InterfaceC7392a
        /* renamed from: d */
        public C7077d mo5945d(C7076c c7076c, String str) {
            AbstractC5868k.m23674f(c7076c, "playStatus");
            AbstractC5868k.m23674f(str, SerializableCookie.NAME);
            Log.i(C1304k.f4967b, "onMediaInfo ----> 当前callBack集合size为" + C1304k.f4968c.size());
            Iterator it = C1304k.f4968c.iterator();
            C7077d c7077d = null;
            while (it.hasNext()) {
                C7077d mo5945d = ((InterfaceC7392a) it.next()).mo5945d(c7076c, str);
                if (mo5945d != null) {
                    c7077d = mo5945d;
                }
            }
            return c7077d;
        }

        @Override // p386wc.InterfaceC7392a
        /* renamed from: e */
        public void mo5946e(final int i10, final String str, final String str2) {
            AbstractC5868k.m23674f(str, "type");
            AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
            Log.i(C1304k.f4967b, "onCompletion ----> 当前callBack集合size为" + C1304k.f4968c.size());
            C1304k.f4970e.post(new Runnable() { // from class: bd.g
                @Override // java.lang.Runnable
                public final void run() {
                    C1304k.a.m5939v(i10, str, str2);
                }
            });
        }

        @Override // p386wc.InterfaceC7392a
        /* renamed from: f */
        public void mo5947f(final int i10, final long j10, final String str) {
            AbstractC5868k.m23674f(str, SerializableCookie.NAME);
            Log.i(C1304k.f4967b, "onProgress ----> 当前callBack集合size为" + C1304k.f4968c.size());
            C1304k.f4970e.post(new Runnable() { // from class: bd.f
                @Override // java.lang.Runnable
                public final void run() {
                    C1304k.a.m5943z(i10, j10, str);
                }
            });
        }

        @Override // p386wc.InterfaceC7392a
        /* renamed from: g */
        public void mo5948g(final int i10, final String str, final String str2, final int i11, final String str3) {
            AbstractC5868k.m23674f(str, "obj");
            AbstractC5868k.m23674f(str2, C3417a.f15001w);
            AbstractC5868k.m23674f(str3, SerializableCookie.NAME);
            Log.i(C1304k.f4967b, "setPlayerUI ----> 当前callBack集合size为" + C1304k.f4968c.size());
            C1304k.f4970e.post(new Runnable() { // from class: bd.h
                @Override // java.lang.Runnable
                public final void run() {
                    C1304k.a.m5927B(i10, str, str2, i11, str3);
                }
            });
        }

        @Override // p386wc.InterfaceC7392a
        /* renamed from: h */
        public void mo5949h(final int i10, final long j10, final String str) {
            AbstractC5868k.m23674f(str, SerializableCookie.NAME);
            Log.i(C1304k.f4967b, "onBuffering ----> 当前callBack集合size为" + C1304k.f4968c.size());
            C1304k.f4970e.post(new Runnable() { // from class: bd.b
                @Override // java.lang.Runnable
                public final void run() {
                    C1304k.a.m5938u(i10, j10, str);
                }
            });
        }

        @Override // p386wc.InterfaceC7392a
        /* renamed from: i */
        public void mo5950i(final boolean z10, final Bitmap bitmap, final String str) {
            AbstractC5868k.m23674f(str, SerializableCookie.NAME);
            Log.i(C1304k.f4967b, "onBitmapPrepared ----> 当前callBack集合size为" + C1304k.f4968c.size());
            C1304k.f4970e.post(new Runnable() { // from class: bd.j
                @Override // java.lang.Runnable
                public final void run() {
                    C1304k.a.m5937t(z10, bitmap, str);
                }
            });
        }

        @Override // p386wc.InterfaceC7392a
        /* renamed from: j */
        public void mo5951j(final int i10, final int i11, final String str, final String str2) {
            AbstractC5868k.m23674f(str, "player");
            AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
            Log.i(C1304k.f4967b, "onPlayerError ----> 当前callBack集合size为" + C1304k.f4968c.size());
            C1304k.f4970e.post(new Runnable() { // from class: bd.e
                @Override // java.lang.Runnable
                public final void run() {
                    C1304k.a.m5941x(i10, i11, str, str2);
                }
            });
        }

        @Override // p386wc.InterfaceC7392a
        /* renamed from: k */
        public void mo5952k(final boolean z10, final String str) {
            AbstractC5868k.m23674f(str, SerializableCookie.NAME);
            Log.i(C1304k.f4967b, "onGetThumbnail ----> 当前callBack集合size为" + C1304k.f4968c.size());
            C1304k.f4970e.post(new Runnable() { // from class: bd.i
                @Override // java.lang.Runnable
                public final void run() {
                    C1304k.a.m5940w(z10, str);
                }
            });
        }

        @Override // p386wc.InterfaceC7392a
        /* renamed from: l */
        public void mo5953l(final int i10, final int i11, final int i12, final String str, final String str2) {
            AbstractC5868k.m23674f(str, "type");
            AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
            Log.i(C1304k.f4967b, "onPrepared ----> 当前callBack集合size为" + C1304k.f4968c.size());
            C1304k.f4970e.post(new Runnable() { // from class: bd.c
                @Override // java.lang.Runnable
                public final void run() {
                    C1304k.a.m5942y(i10, i11, i12, str, str2);
                }
            });
        }
    }

    /* renamed from: bd.k$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC7393b {
        b() {
        }

        @Override // p386wc.InterfaceC7393b
        /* renamed from: a */
        public void mo5954a(int i10, String str, Status status, long j10) {
            AbstractC5868k.m23674f(str, "event");
            AbstractC5868k.m23674f(status, Progress.STATUS);
            Log.i(C1304k.f4967b, "onPrepareEvent ----> 当前callBack集合size为" + C1304k.f4969d.size());
            Iterator it = C1304k.f4969d.iterator();
            while (it.hasNext()) {
                ((InterfaceC7393b) it.next()).mo5954a(i10, str, status, j10);
            }
        }

        @Override // p386wc.InterfaceC7393b
        /* renamed from: b */
        public void mo5955b(int i10, String str, Object obj, String str2) {
            long j10;
            long j11;
            long j12;
            AbstractC5868k.m23674f(str, "event");
            AbstractC5868k.m23674f(obj, "data");
            AbstractC5868k.m23674f(str2, "app_ctx");
            Log.i(C1304k.f4967b, "onReport ----> 当前callBack集合size为" + C1304k.f4969d.size());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            switch (str.hashCode()) {
                case -1877933145:
                    if (str.equals("play_file")) {
                        if (!(obj instanceof PlayFile)) {
                            return;
                        }
                        long duration = elapsedRealtime - ((PlayFile) obj).getDuration();
                        if (duration > 0) {
                            j10 = duration;
                        } else {
                            j10 = elapsedRealtime;
                        }
                        com.bigbee.bean.request.PlayFile playFile = (com.bigbee.bean.request.PlayFile) AbstractC7781a.m30143a().fromJson(AbstractC7781a.m30143a().toJson(obj), com.bigbee.bean.request.PlayFile.class);
                        C7731e c7731e = C7731e.f28446a;
                        AbstractC5868k.m23673e(playFile, "playFile");
                        c7731e.m29866b(playFile, j10, elapsedRealtime);
                        break;
                    }
                    break;
                case 1283382393:
                    if (str.equals("play_program")) {
                        if (!(obj instanceof PlayProgram)) {
                            return;
                        }
                        long duration2 = elapsedRealtime - ((PlayProgram) obj).getDuration();
                        if (duration2 > 0) {
                            j11 = duration2;
                        } else {
                            j11 = elapsedRealtime;
                        }
                        com.bigbee.bean.request.PlayProgram playProgram = (com.bigbee.bean.request.PlayProgram) AbstractC7781a.m30143a().fromJson(AbstractC7781a.m30143a().toJson(obj), com.bigbee.bean.request.PlayProgram.class);
                        C7731e c7731e2 = C7731e.f28446a;
                        AbstractC5868k.m23673e(playProgram, "playProgram");
                        c7731e2.m29868d(playProgram, j11, elapsedRealtime);
                        break;
                    }
                    break;
                case 1814306380:
                    if (str.equals("switch_player")) {
                        if (!(obj instanceof SwitchPlayer)) {
                            return;
                        }
                        com.bigbee.bean.request.SwitchPlayer switchPlayer = (com.bigbee.bean.request.SwitchPlayer) AbstractC7781a.m30143a().fromJson(AbstractC7781a.m30143a().toJson(obj), com.bigbee.bean.request.SwitchPlayer.class);
                        C7731e c7731e3 = C7731e.f28446a;
                        AbstractC5868k.m23673e(switchPlayer, "switchPlayer");
                        c7731e3.m29869e(switchPlayer, elapsedRealtime, elapsedRealtime);
                        break;
                    }
                    break;
                case 1912965437:
                    if (str.equals("play_error")) {
                        if (!(obj instanceof PlayError)) {
                            return;
                        }
                        com.bigbee.bean.request.PlayError playError = (com.bigbee.bean.request.PlayError) AbstractC7781a.m30143a().fromJson(AbstractC7781a.m30143a().toJson(obj), com.bigbee.bean.request.PlayError.class);
                        C7731e c7731e4 = C7731e.f28446a;
                        AbstractC5868k.m23673e(playError, "playError");
                        c7731e4.m29865a(playError, elapsedRealtime, elapsedRealtime);
                        break;
                    }
                    break;
                case 1919952665:
                    if (str.equals("play_media")) {
                        if (!(obj instanceof PlayMedia)) {
                            return;
                        }
                        long duration3 = elapsedRealtime - ((PlayMedia) obj).getDuration();
                        if (duration3 > 0) {
                            j12 = duration3;
                        } else {
                            j12 = elapsedRealtime;
                        }
                        com.bigbee.bean.request.PlayMedia playMedia = (com.bigbee.bean.request.PlayMedia) AbstractC7781a.m30143a().fromJson(AbstractC7781a.m30143a().toJson(obj), com.bigbee.bean.request.PlayMedia.class);
                        C7731e c7731e5 = C7731e.f28446a;
                        AbstractC5868k.m23673e(playMedia, "playMedia");
                        c7731e5.m29867c(playMedia, j12, elapsedRealtime);
                        break;
                    }
                    break;
            }
            Iterator it = C1304k.f4969d.iterator();
            while (it.hasNext()) {
                ((InterfaceC7393b) it.next()).mo5955b(i10, str, obj, str2);
            }
        }

        @Override // p386wc.InterfaceC7393b
        /* renamed from: t */
        public void mo5956t(String str, String str2, long j10) {
            AbstractC5868k.m23674f(str, "adName");
            AbstractC5868k.m23674f(str2, "path");
            Log.i(C1304k.f4967b, "onPrefetchAd ----> 当前callBack集合size为" + C1304k.f4969d.size());
            Iterator it = C1304k.f4969d.iterator();
            while (it.hasNext()) {
                ((InterfaceC7393b) it.next()).mo5956t(str, str2, j10);
            }
        }
    }

    private C1304k() {
    }

    /* renamed from: e */
    public final void m5922e(InterfaceC7392a interfaceC7392a, InterfaceC7393b interfaceC7393b) {
        AbstractC5868k.m23674f(interfaceC7392a, "playerCallback");
        AbstractC5868k.m23674f(interfaceC7393b, "rangerCallback");
        List list = f4968c;
        if (!list.contains(interfaceC7392a)) {
            list.add(interfaceC7392a);
        }
        List list2 = f4969d;
        if (!list2.contains(interfaceC7393b)) {
            list2.add(interfaceC7393b);
        }
    }

    /* renamed from: f */
    public final InterfaceC7392a m5923f() {
        return f4971f;
    }

    /* renamed from: g */
    public final InterfaceC7393b m5924g() {
        return f4972g;
    }

    /* renamed from: h */
    public final void m5925h(InterfaceC7392a interfaceC7392a, InterfaceC7393b interfaceC7393b) {
        AbstractC5868k.m23674f(interfaceC7392a, "playerCallback");
        AbstractC5868k.m23674f(interfaceC7393b, "rangerCallback");
        List list = f4968c;
        if (list.contains(interfaceC7392a)) {
            list.remove(interfaceC7392a);
        }
        List list2 = f4969d;
        if (list2.contains(interfaceC7393b)) {
            list2.remove(interfaceC7393b);
        }
    }
}
