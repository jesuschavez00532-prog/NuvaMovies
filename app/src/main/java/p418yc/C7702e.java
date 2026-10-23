package p418yc;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import be.AbstractC1314j;
import be.C1325u;
import be.InterfaceC1312h;
import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.data.Message;
import com.titan.ranger.InterfaceC3248b;
import com.titan.ranger.InterfaceC3249c;
import com.titan.ranger.JniHandler;
import com.titan.ranger.NativeJni;
import com.titan.ranger.Status;
import com.titan.ranger.bean.Env;
import com.titan.ranger.bean.Program;
import com.titan.ranger.bean.report.PlayError;
import com.titan.ranger.bean.report.PlayFile;
import com.titan.ranger.bean.report.PlayMedia;
import com.titan.ranger.bean.report.PlayProgram;
import com.titan.ranger.bean.report.SwitchPlayer;
import com.titan.thumbnail.ThumbnailCallback;
import com.titan.thumbnail.ThumbnailUtil;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.ccg.C3417a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5879v;
import ne.C5872o;
import ne.C5877t;
import org.android.agoo.message.MessageService;
import p357uc.C7074a;
import p357uc.C7075b;
import p357uc.C7076c;
import p357uc.C7077d;
import p357uc.C7078e;
import p357uc.C7079f;
import p359ue.AbstractC7166t;
import p386wc.InterfaceC7392a;
import p386wc.InterfaceC7393b;
import p432zc.AbstractC7781a;
import p432zc.AbstractC7784d;
import p432zc.C7783c;
import se.InterfaceC6869f;
import tv.danmaku.ijk.media.player.AndroidMediaPlayer;
import tv.danmaku.ijk.media.player.ExoMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.MediaInfo;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;
import tv.danmaku.ijk.media.player.widget.media.MediaPlayerCompat;
import vc.EnumC7253a;
import vc.EnumC7254b;

/* renamed from: yc.e */
/* loaded from: classes3.dex */
public final class C7702e {

    /* renamed from: K */
    static final /* synthetic */ InterfaceC6869f[] f28170K = {AbstractC5879v.m23692d(new C5872o(AbstractC5879v.m23690b(C7702e.class), "mPlayerContext", "getMPlayerContext()Lcom/titan/media/PlayerContext;"))};

    /* renamed from: A */
    private final InterfaceC1312h f28171A;

    /* renamed from: B */
    private final ReadWriteLock f28172B;

    /* renamed from: C */
    private final Lock f28173C;

    /* renamed from: D */
    private final Lock f28174D;

    /* renamed from: E */
    private HashMap f28175E;

    /* renamed from: F */
    private long f28176F;

    /* renamed from: G */
    private String f28177G;

    /* renamed from: H */
    private d f28178H;

    /* renamed from: I */
    private final ThumbnailCallback f28179I;

    /* renamed from: J */
    private final e f28180J;

    /* renamed from: a */
    private final String f28181a;

    /* renamed from: b */
    private boolean f28182b;

    /* renamed from: c */
    private boolean f28183c;

    /* renamed from: d */
    private boolean f28184d;

    /* renamed from: e */
    private boolean f28185e;

    /* renamed from: f */
    private boolean f28186f;

    /* renamed from: g */
    private long f28187g;

    /* renamed from: h */
    private boolean f28188h;

    /* renamed from: i */
    private int f28189i;

    /* renamed from: j */
    private int f28190j;

    /* renamed from: k */
    private String f28191k;

    /* renamed from: l */
    private InterfaceC7392a f28192l;

    /* renamed from: m */
    private InterfaceC7393b f28193m;

    /* renamed from: n */
    private IMediaPlayer f28194n;

    /* renamed from: o */
    private int f28195o;

    /* renamed from: p */
    private Context f28196p;

    /* renamed from: q */
    private C7783c f28197q;

    /* renamed from: r */
    private C7704g f28198r;

    /* renamed from: s */
    private boolean f28199s;

    /* renamed from: t */
    private EnumC7254b f28200t;

    /* renamed from: u */
    private EnumC7254b f28201u;

    /* renamed from: v */
    private boolean f28202v;

    /* renamed from: w */
    private boolean f28203w;

    /* renamed from: x */
    private int f28204x;

    /* renamed from: y */
    private C7076c f28205y;

    /* renamed from: z */
    private C7703f f28206z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$a */
    /* loaded from: classes3.dex */
    public static final class a implements IjkMediaPlayer.OnSelectTrackListener {
        a() {
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.OnSelectTrackListener
        public final void onSelectTrack(ArrayList arrayList) {
            String str;
            String m29710d;
            ArrayList m27266f;
            ArrayList m27266f2;
            ArrayList m27266f3;
            ArrayList m27266f4;
            String str2 = "";
            C7702e.this.f28174D.lock();
            try {
                C7703f c7703f = C7702e.this.f28206z;
                if (c7703f != null) {
                    str = c7703f.m29710d();
                } else {
                    str = null;
                }
                if ((!AbstractC5868k.m23669a(str, "")) && C7702e.this.m29682a0() != null) {
                    C7076c c7076c = C7702e.this.f28205y;
                    if (c7076c != null) {
                        c7076c.m27280t(new ArrayList());
                    }
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        SparseArray sparseArray = (SparseArray) arrayList.get(i10);
                        int keyAt = sparseArray.keyAt(0);
                        String str3 = (String) sparseArray.valueAt(0);
                        if (keyAt == EnumC7253a.AVMEDIA_TYPE_VIDEO.m28085a()) {
                            C7075b c7075b = new C7075b(0, null, null, null, null, null, null, null, null, null, Message.EXT_HEADER_VALUE_MAX_LEN, null);
                            c7075b.m27255h(i10);
                            AbstractC5868k.m23670b(str3, "stLang");
                            c7075b.m27256i(str3);
                            c7075b.m27260m("video");
                            C7076c c7076c2 = C7702e.this.f28205y;
                            if (c7076c2 != null && (m27266f4 = c7076c2.m27266f()) != null) {
                                m27266f4.add(c7075b);
                            }
                        } else if (keyAt == EnumC7253a.AVMEDIA_TYPE_AUDIO.m28085a()) {
                            C7075b c7075b2 = new C7075b(0, null, null, null, null, null, null, null, null, null, Message.EXT_HEADER_VALUE_MAX_LEN, null);
                            c7075b2.m27255h(i10);
                            AbstractC5868k.m23670b(str3, "stLang");
                            c7075b2.m27256i(str3);
                            c7075b2.m27260m("audio");
                            C7076c c7076c3 = C7702e.this.f28205y;
                            if (c7076c3 != null && (m27266f3 = c7076c3.m27266f()) != null) {
                                m27266f3.add(c7075b2);
                            }
                        } else if (keyAt == EnumC7253a.AVMEDIA_TYPE_SUBTITLE.m28085a()) {
                            C7075b c7075b3 = new C7075b(0, null, null, null, null, null, null, null, null, null, Message.EXT_HEADER_VALUE_MAX_LEN, null);
                            c7075b3.m27255h(i10);
                            AbstractC5868k.m23670b(str3, "stLang");
                            c7075b3.m27256i(str3);
                            c7075b3.m27260m("subtitle");
                            C7076c c7076c4 = C7702e.this.f28205y;
                            if (c7076c4 != null && (m27266f2 = c7076c4.m27266f()) != null) {
                                m27266f2.add(c7075b3);
                            }
                        } else {
                            C7075b c7075b4 = new C7075b(0, null, null, null, null, null, null, null, null, null, Message.EXT_HEADER_VALUE_MAX_LEN, null);
                            c7075b4.m27255h(i10);
                            AbstractC5868k.m23670b(str3, "stLang");
                            c7075b4.m27256i(str3);
                            c7075b4.m27260m("unknown");
                            C7076c c7076c5 = C7702e.this.f28205y;
                            if (c7076c5 != null && (m27266f = c7076c5.m27266f()) != null) {
                                m27266f.add(c7075b4);
                            }
                        }
                    }
                    C7702e.this.f28202v = true;
                    C7076c c7076c6 = C7702e.this.f28205y;
                    if (c7076c6 != null) {
                        InterfaceC7392a m29682a0 = C7702e.this.m29682a0();
                        if (m29682a0 == null) {
                            AbstractC5868k.m23682n();
                        }
                        C7703f c7703f2 = C7702e.this.f28206z;
                        if (c7703f2 != null && (m29710d = c7703f2.m29710d()) != null) {
                            str2 = m29710d;
                        }
                        C7077d mo5945d = m29682a0.mo5945d(c7076c6, str2);
                        if (mo5945d != null) {
                            C7702e.this.m29666C0(mo5945d.m27282a());
                        }
                    }
                }
                C7702e.this.f28174D.unlock();
                C7702e.this.f28203w = true;
            } catch (Throwable th) {
                C7702e.this.f28174D.unlock();
                throw th;
            }
        }
    }

    /* renamed from: yc.e$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC3248b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3248b f28208a;

        b(InterfaceC3248b interfaceC3248b) {
            this.f28208a = interfaceC3248b;
        }

        @Override // com.titan.ranger.InterfaceC3248b
        /* renamed from: a */
        public void mo13130a(Status status) {
            InterfaceC3248b interfaceC3248b;
            if (status != null && (interfaceC3248b = this.f28208a) != null) {
                interfaceC3248b.mo13130a(status);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$c */
    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7702e.this.m29652r0();
        }
    }

    /* renamed from: yc.e$d */
    /* loaded from: classes3.dex */
    public static final class d implements JniHandler.InterfaceC3228a {

        /* renamed from: yc.e$d$a */
        /* loaded from: classes3.dex */
        static final class a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Object f28212b;

            /* renamed from: c */
            final /* synthetic */ long f28213c;

            a(Object obj, long j10) {
                this.f28212b = obj;
                this.f28213c = j10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7703f c7703f;
                C7703f c7703f2;
                C7703f c7703f3;
                C7703f c7703f4 = C7702e.this.f28206z;
                if (c7703f4 == null || !c7703f4.m29724r()) {
                    C7703f c7703f5 = C7702e.this.f28206z;
                    if (c7703f5 != null && c7703f5.m29725s()) {
                        C7702e.this.m29690v0((Status) this.f28212b);
                        if (this.f28213c == 1000 && (c7703f2 = C7702e.this.f28206z) != null) {
                            c7703f2.m29701F(true);
                        }
                        C7702e.this.m29641l0();
                        return;
                    }
                    C7702e.this.m29690v0((Status) this.f28212b);
                    if (this.f28213c == 1000 && (c7703f = C7702e.this.f28206z) != null) {
                        c7703f.m29701F(true);
                    }
                    C7702e.m29613Q0(C7702e.this, "", false, 2, null);
                    return;
                }
                C7703f c7703f6 = C7702e.this.f28206z;
                if (c7703f6 != null) {
                    c7703f6.m29700E((Status) this.f28212b);
                }
                if (this.f28213c == 1000 && (c7703f3 = C7702e.this.f28206z) != null) {
                    c7703f3.m29701F(true);
                }
            }
        }

        d() {
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
        @Override // com.titan.ranger.JniHandler.InterfaceC3228a
        /* renamed from: a */
        public int mo13090a(int i10, String str, String str2, String str3) {
            AbstractC5868k.m23675g(str, "event");
            AbstractC5868k.m23675g(str2, "data");
            AbstractC5868k.m23675g(str3, "app_ctx");
            try {
                switch (str.hashCode()) {
                    case -1877933145:
                        if (str.equals("play_file")) {
                            PlayFile playFile = (PlayFile) AbstractC7781a.m30143a().fromJson(str2, PlayFile.class);
                            AbstractC5868k.m23670b(playFile, "playFile");
                            playFile.setTitan_ver(C7705h.f28256m.m29772c() + "-[" + NativeJni.f13374d + ']');
                            InterfaceC7393b m29683b0 = C7702e.this.m29683b0();
                            if (m29683b0 != null) {
                                m29683b0.mo5955b(i10, str, playFile, str3);
                            }
                            return 0;
                        }
                        return 22;
                    case 1283382393:
                        if (str.equals("play_program")) {
                            PlayProgram playProgram = (PlayProgram) AbstractC7781a.m30143a().fromJson(str2, PlayProgram.class);
                            AbstractC5868k.m23670b(playProgram, "playProgram");
                            playProgram.setTitan_ver(C7705h.f28256m.m29772c() + "-[" + NativeJni.f13374d + ']');
                            InterfaceC7393b m29683b02 = C7702e.this.m29683b0();
                            if (m29683b02 != null) {
                                m29683b02.mo5955b(i10, str, playProgram, str3);
                            }
                            return 0;
                        }
                        return 22;
                    case 1814306380:
                        if (str.equals("switch_player")) {
                            SwitchPlayer switchPlayer = (SwitchPlayer) AbstractC7781a.m30143a().fromJson(str2, SwitchPlayer.class);
                            AbstractC5868k.m23670b(switchPlayer, "swPlayer");
                            switchPlayer.setTitan_ver(C7705h.f28256m.m29772c() + "-[" + NativeJni.f13374d + ']');
                            InterfaceC7393b m29683b03 = C7702e.this.m29683b0();
                            if (m29683b03 != null) {
                                m29683b03.mo5955b(i10, str, switchPlayer, str3);
                            }
                            return 0;
                        }
                        return 22;
                    case 1912965437:
                        if (str.equals("play_error")) {
                            PlayError playError = (PlayError) AbstractC7781a.m30143a().fromJson(str2, PlayError.class);
                            AbstractC5868k.m23670b(playError, "playError");
                            playError.setTitan_ver(C7705h.f28256m.m29772c() + "-[" + NativeJni.f13374d + ']');
                            InterfaceC7393b m29683b04 = C7702e.this.m29683b0();
                            if (m29683b04 != null) {
                                m29683b04.mo5955b(i10, str, playError, str3);
                            }
                            return 0;
                        }
                        return 22;
                    case 1919952665:
                        if (str.equals("play_media")) {
                            PlayMedia playMedia = (PlayMedia) AbstractC7781a.m30143a().fromJson(str2, PlayMedia.class);
                            AbstractC5868k.m23670b(playMedia, "playMedia");
                            playMedia.setTitan_ver(C7705h.f28256m.m29772c() + "-[" + NativeJni.f13374d + ']');
                            InterfaceC7393b m29683b05 = C7702e.this.m29683b0();
                            if (m29683b05 != null) {
                                m29683b05.mo5955b(i10, str, playMedia, str3);
                            }
                            return 0;
                        }
                        return 22;
                    default:
                        return 22;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return 0;
            }
        }

        @Override // com.titan.ranger.JniHandler.InterfaceC3228a
        /* renamed from: b */
        public int mo13091b() {
            return C7702e.this.f28195o;
        }

        @Override // com.titan.ranger.JniHandler.InterfaceC3228a
        /* renamed from: c */
        public int mo13092c(String str, String str2, int i10) {
            String str3;
            AbstractC5868k.m23675g(str, "obj");
            AbstractC5868k.m23675g(str2, C3417a.f15001w);
            InterfaceC7392a m29682a0 = C7702e.this.m29682a0();
            if (m29682a0 != null) {
                int i11 = C7702e.this.f28195o;
                C7703f c7703f = C7702e.this.f28206z;
                if (c7703f == null || (str3 = c7703f.m29710d()) == null) {
                    str3 = "";
                }
                m29682a0.mo5948g(i11, str, str2, i10, str3);
                return 0;
            }
            return 0;
        }

        @Override // com.titan.ranger.JniHandler.InterfaceC3228a
        /* renamed from: d */
        public int mo13093d(int i10, String str, Object obj, long j10) {
            if (!AbstractC7784d.m30152a(str) && obj != null && (obj instanceof Status)) {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1589184968) {
                        if (hashCode == 1948221757 && str.equals("cast_prepared")) {
                            Status status = (Status) obj;
                            C7702e.this.m29690v0(status);
                            InterfaceC7393b m29683b0 = C7702e.this.m29683b0();
                            if (m29683b0 != null) {
                                m29683b0.mo5954a(i10, "cast_prepared", status, j10);
                                return 0;
                            }
                            return 0;
                        }
                    } else if (str.equals("media_prepared")) {
                        C7702e.this.f28180J.post(new a(obj, j10));
                        return 0;
                    }
                }
                InterfaceC7393b m29683b02 = C7702e.this.m29683b0();
                if (m29683b02 != null) {
                    if (str == null) {
                        AbstractC5868k.m23682n();
                    }
                    m29683b02.mo5954a(i10, str, (Status) obj, j10);
                    return 0;
                }
                return 0;
            }
            return 22;
        }

        @Override // com.titan.ranger.JniHandler.InterfaceC3228a
        /* renamed from: t */
        public int mo13094t(String str, String str2, long j10) {
            AbstractC5868k.m23675g(str, SerializableCookie.NAME);
            AbstractC5868k.m23675g(str2, "path");
            InterfaceC7393b m29683b0 = C7702e.this.m29683b0();
            if (m29683b0 != null) {
                m29683b0.mo5956t(str, str2, j10);
            }
            if (AbstractC7784d.m30153b(str2)) {
                C7702e.this.f28175E.put(str, str2);
                return 0;
            }
            return 0;
        }
    }

    /* renamed from: yc.e$e */
    /* loaded from: classes3.dex */
    public static final class e extends Handler {
        e() {
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            String str;
            InterfaceC7392a m29682a0;
            String str2;
            String m29710d;
            AbstractC5868k.m23675g(message, "msg");
            int i10 = message.what;
            if (i10 == 61699) {
                C7703f c7703f = C7702e.this.f28206z;
                if (c7703f != null) {
                    str = c7703f.m29710d();
                } else {
                    str = null;
                }
                if ((!AbstractC5868k.m23669a(str, "")) && (m29682a0 = C7702e.this.m29682a0()) != null) {
                    int i11 = C7702e.this.f28195o;
                    C7703f c7703f2 = C7702e.this.f28206z;
                    if (c7703f2 == null || (m29710d = c7703f2.m29710d()) == null) {
                        str2 = "";
                    } else {
                        str2 = m29710d;
                    }
                    m29682a0.mo5948g(i11, "buffering", "none", 0, str2);
                }
                C7703f c7703f3 = C7702e.this.f28206z;
                if (c7703f3 != null) {
                    c7703f3.m29728v(false);
                    return;
                }
                return;
            }
            if (i10 == 61703) {
                C7702e.this.m29617S0();
                C7702e.this.m29598E0(0);
                C7702e.this.m29609N0(0);
                C7702e.this.m29641l0();
                NativeJni.m13097c().m13105k(C7702e.this.f28195o, "onReplay", 0, 0, 0L, "");
            }
        }
    }

    /* renamed from: yc.e$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final f f28215a = new f();

        f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7699b invoke() {
            return new C7699b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC3249c {

        /* renamed from: b */
        final /* synthetic */ long f28217b;

        /* renamed from: yc.e$g$a */
        /* loaded from: classes3.dex */
        static final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                C7702e.this.m29593A0(gVar.f28217b);
            }
        }

        g(long j10) {
            this.f28217b = j10;
        }

        @Override // com.titan.ranger.InterfaceC3249c
        /* renamed from: a */
        public final void mo13116a(String str) {
            C7702e.this.f28180J.post(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$h */
    /* loaded from: classes3.dex */
    public static final class h implements IMediaPlayer.OnPreparedListener {
        h() {
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x02e4  */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPrepared(tv.danmaku.ijk.media.player.IMediaPlayer r14) {
            /*
                Method dump skipped, instructions count: 1055
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p418yc.C7702e.h.onPrepared(tv.danmaku.ijk.media.player.IMediaPlayer):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$i */
    /* loaded from: classes3.dex */
    public static final class i implements IMediaPlayer.OnCompletionListener {
        i() {
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer r12) {
            /*
                Method dump skipped, instructions count: 392
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p418yc.C7702e.i.onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$j */
    /* loaded from: classes3.dex */
    public static final class j implements IMediaPlayer.OnErrorListener {
        j() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            C7703f c7703f;
            InterfaceC7392a m29682a0;
            String m29710d;
            if (i10 != -38 && C7702e.this.f28189i != 5) {
                if (C7702e.this.m29681Z() instanceof AndroidMediaPlayer) {
                    C7702e.this.f28183c = false;
                }
                if (i10 != -10000 && i10 != -1004 && i10 != -110 && Build.VERSION.SDK_INT <= 22) {
                    NativeJni.m13097c().m13105k(C7702e.this.f28195o, "onError", 0, 1103, 0L, "");
                    String str = "";
                    if ((!AbstractC5868k.m23669a(C7702e.this.f28206z != null ? r11.m29710d() : null, "")) && (m29682a0 = C7702e.this.m29682a0()) != null) {
                        int i12 = C7702e.this.f28195o;
                        String m28086a = C7702e.this.f28200t.m28086a();
                        C7703f c7703f2 = C7702e.this.f28206z;
                        if (c7703f2 != null && (m29710d = c7703f2.m29710d()) != null) {
                            str = m29710d;
                        }
                        m29682a0.mo5951j(i12, 1103, m28086a, str);
                    }
                }
                if (i11 == 1100 && (C7702e.this.m29681Z() instanceof IjkMediaPlayer)) {
                    if (AbstractC5868k.m23669a(Build.MODEL, "AFTSS") && (c7703f = C7702e.this.f28206z) != null) {
                        c7703f.m29706K(true);
                    }
                    NativeJni m13097c = NativeJni.m13097c();
                    int i13 = C7702e.this.f28195o;
                    IMediaPlayer m29681Z = C7702e.this.m29681Z();
                    if (m29681Z == null) {
                        throw new C1325u("null cannot be cast to non-null type tv.danmaku.ijk.media.player.IjkMediaPlayer");
                    }
                    m13097c.m13102h(i13, "codec_list", ((IjkMediaPlayer) m29681Z).getCandidateCodecList());
                }
                int m29621X = C7702e.this.m29621X(i10, i11);
                NativeJni.m13097c().m13105k(C7702e.this.f28195o, "onError", i10, m29621X, 0L, "");
                if (i11 != 1104 && i11 != 1100 && i11 != 1201 && i11 != 1105 && i11 != 1106) {
                    C7702e.this.m29598E0(-1);
                }
                C7702e.this.f28191k = ";mediaPlayError:(" + i10 + ',' + m29621X + ')';
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$k */
    /* loaded from: classes3.dex */
    public static final class k implements IMediaPlayer.OnInfoListener {
        k() {
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onInfo(tv.danmaku.ijk.media.player.IMediaPlayer r11, int r12, int r13) {
            /*
                Method dump skipped, instructions count: 512
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p418yc.C7702e.k.onInfo(tv.danmaku.ijk.media.player.IMediaPlayer, int, int):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$l */
    /* loaded from: classes3.dex */
    public static final class l implements IMediaPlayer.OnSeekCompleteListener {
        l() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public final void onSeekComplete(IMediaPlayer iMediaPlayer) {
            long j10;
            String str;
            C7703f c7703f;
            InterfaceC7392a m29682a0;
            String str2;
            String m29710d;
            String str3;
            long j11;
            String m29710d2;
            C7702e.this.f28183c = false;
            C7703f c7703f2 = C7702e.this.f28206z;
            if (c7703f2 != null) {
                j10 = c7703f2.m29711e();
            } else {
                j10 = -1;
            }
            String str4 = "";
            if (j10 > 0 && C7702e.this.f28200t == EnumC7254b.NATIVE && C7702e.this.m29645n0()) {
                C7702e c7702e = C7702e.this;
                C7703f c7703f3 = c7702e.f28206z;
                if (c7703f3 != null && (m29710d2 = c7703f3.m29710d()) != null) {
                    str4 = m29710d2;
                }
                C7703f c7703f4 = C7702e.this.f28206z;
                if (c7703f4 != null) {
                    j11 = c7703f4.m29711e();
                } else {
                    j11 = -1;
                }
                c7702e.m29665B0(str4, j11);
                C7703f c7703f5 = C7702e.this.f28206z;
                if (c7703f5 != null) {
                    c7703f5.m29696A(-1L);
                    return;
                }
                return;
            }
            NativeJni.m13097c().m13105k(C7702e.this.f28195o, "onSeekComplete", 0, 0, 0L, "");
            C7702e.this.m29598E0(2);
            if (C7702e.this.f28195o != 1 && C7702e.this.f28197q == null) {
                C7702e.this.m29615R0();
            }
            C7703f c7703f6 = C7702e.this.f28206z;
            if (c7703f6 != null) {
                str = c7703f6.m29710d();
            } else {
                str = null;
            }
            if (!AbstractC5868k.m23669a(str, "")) {
                InterfaceC7392a m29682a02 = C7702e.this.m29682a0();
                if (m29682a02 != null) {
                    int i10 = C7702e.this.f28195o;
                    C7703f c7703f7 = C7702e.this.f28206z;
                    if (c7703f7 == null || (str3 = c7703f7.m29710d()) == null) {
                        str3 = "";
                    }
                    m29682a02.mo5944c(i10, str3);
                }
                if (C7702e.this.f28200t == EnumC7254b.NATIVE && (c7703f = C7702e.this.f28206z) != null && !c7703f.m29720n() && (m29682a0 = C7702e.this.m29682a0()) != null) {
                    int i11 = C7702e.this.f28195o;
                    C7703f c7703f8 = C7702e.this.f28206z;
                    if (c7703f8 == null || (m29710d = c7703f8.m29710d()) == null) {
                        str2 = "";
                    } else {
                        str2 = m29710d;
                    }
                    m29682a0.mo5948g(i11, "buffering", "none", 0, str2);
                }
            }
            if (C7702e.this.f28184d) {
                EnumC7254b enumC7254b = C7702e.this.f28201u;
                EnumC7254b enumC7254b2 = EnumC7254b.NONE;
                if (enumC7254b != enumC7254b2) {
                    C7702e c7702e2 = C7702e.this;
                    c7702e2.m29678U0(c7702e2.f28201u.m28086a(), 0);
                    C7702e.this.f28201u = enumC7254b2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$m */
    /* loaded from: classes3.dex */
    public static final class m implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: yc.e$m$a */
        /* loaded from: classes3.dex */
        public static final class a implements InterfaceC3248b {

            /* renamed from: a */
            final /* synthetic */ C5877t f28225a;

            a(C5877t c5877t) {
                this.f28225a = c5877t;
            }

            @Override // com.titan.ranger.InterfaceC3248b
            /* renamed from: a */
            public void mo13130a(Status status) {
                C5877t c5877t = this.f28225a;
                if (status == null) {
                    AbstractC5868k.m23682n();
                }
                c5877t.f23411a = status.getBuffer();
            }
        }

        m() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public final void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10, long j10) {
            String str;
            boolean z10;
            InterfaceC7392a m29682a0;
            String m29710d;
            long j11;
            C7703f c7703f;
            C7703f c7703f2;
            Program m29713g;
            C7703f c7703f3 = C7702e.this.f28206z;
            String str2 = null;
            if (c7703f3 != null && (m29713g = c7703f3.m29713g()) != null) {
                str = m29713g.getBuss();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(str, "live") && (c7703f2 = C7702e.this.f28206z) != null && c7703f2.m29724r()) {
                return;
            }
            if (C7702e.this.f28195o != 1 && (((c7703f = C7702e.this.f28206z) == null || c7703f.m29723q() != 0) && C7702e.this.f28200t == EnumC7254b.IJK)) {
                z10 = true;
            } else {
                z10 = false;
            }
            C5877t c5877t = new C5877t();
            long j12 = 0;
            c5877t.f23411a = 0L;
            if (z10) {
                C7702e.this.m29632g0(new a(c5877t));
            }
            if (j10 <= 0 && i10 > 0) {
                C7076c c7076c = C7702e.this.f28205y;
                if (c7076c != null) {
                    j11 = c7076c.m27263c();
                } else {
                    j11 = 0;
                }
                if (j11 > 0) {
                    C7076c c7076c2 = C7702e.this.f28205y;
                    if (c7076c2 != null) {
                        j12 = c7076c2.m27263c() / 100;
                    }
                    j10 = j12 * i10;
                }
            }
            if (C7702e.this.m29681Z() instanceof AndroidMediaPlayer) {
                C7702e.this.f28176F = j10;
            }
            long j13 = j10 + c5877t.f23411a;
            C7703f c7703f4 = C7702e.this.f28206z;
            if (c7703f4 != null) {
                str2 = c7703f4.m29710d();
            }
            String str3 = "";
            if ((!AbstractC5868k.m23669a(str2, "")) && (m29682a0 = C7702e.this.m29682a0()) != null) {
                int i11 = C7702e.this.f28195o;
                C7703f c7703f5 = C7702e.this.f28206z;
                if (c7703f5 != null && (m29710d = c7703f5.m29710d()) != null) {
                    str3 = m29710d;
                }
                m29682a0.mo5949h(i11, j13, str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$n */
    /* loaded from: classes3.dex */
    public static final class n implements IMediaPlayer.OnReplayListener {
        n() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnReplayListener
        public final void onReplay(IMediaPlayer iMediaPlayer) {
            C7702e.this.f28180J.removeMessages(61703);
            C7702e.this.f28180J.sendEmptyMessageDelayed(61703, 1500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$o */
    /* loaded from: classes3.dex */
    public static final class o implements IMediaPlayer.OnSeekListener {

        /* renamed from: yc.e$o$a */
        /* loaded from: classes3.dex */
        static final class a implements InterfaceC3249c {

            /* renamed from: a */
            public static final a f28228a = new a();

            a() {
            }

            @Override // com.titan.ranger.InterfaceC3249c
            /* renamed from: a */
            public final void mo13116a(String str) {
            }
        }

        o() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekListener
        public final void onSeek(IMediaPlayer iMediaPlayer, long j10) {
            String str;
            if (C7702e.this.m29681Z() != null && C7702e.this.f28189i != 0 && C7702e.this.f28189i != -1) {
                C7702e.this.m29650q0();
                NativeJni m13097c = NativeJni.m13097c();
                int i10 = C7702e.this.f28195o;
                C7703f c7703f = C7702e.this.f28206z;
                if (c7703f != null) {
                    str = c7703f.m29710d();
                } else {
                    str = null;
                }
                m13097c.m13111q(i10, str, -1L, j10, a.f28228a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yc.e$p */
    /* loaded from: classes3.dex */
    public static final class p extends AbstractC5869l implements InterfaceC5642a {
        p() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            C7702e c7702e = C7702e.this;
            c7702e.f28187g = c7702e.m29679V();
            C7702e c7702e2 = C7702e.this;
            c7702e2.f28188h = c7702e2.m29687o0();
            return C7702e.this.f28177G;
        }
    }

    /* renamed from: yc.e$q */
    /* loaded from: classes3.dex */
    public static final class q implements C7783c.a {
        q() {
        }

        @Override // p432zc.C7783c.a
        /* renamed from: a */
        public void mo29695a(String str) {
            String str2;
            InterfaceC7392a m29682a0;
            String m29710d;
            AbstractC5868k.m23675g(str, "programData");
            C7703f c7703f = C7702e.this.f28206z;
            String str3 = null;
            if (c7703f != null) {
                str2 = c7703f.m29712f();
            } else {
                str2 = null;
            }
            if (AbstractC7784d.m30153b(str2) && C7702e.this.m29681Z() != null) {
                C7702e.this.m29650q0();
                C7703f c7703f2 = C7702e.this.f28206z;
                if (c7703f2 != null) {
                    str3 = c7703f2.m29710d();
                }
                String str4 = "";
                if ((!AbstractC5868k.m23669a(str3, "")) && (m29682a0 = C7702e.this.m29682a0()) != null) {
                    int i10 = C7702e.this.f28195o;
                    long j10 = C7702e.this.f28187g;
                    C7703f c7703f3 = C7702e.this.f28206z;
                    if (c7703f3 != null && (m29710d = c7703f3.m29710d()) != null) {
                        str4 = m29710d;
                    }
                    m29682a0.mo5947f(i10, j10, str4);
                }
            }
        }
    }

    /* renamed from: yc.e$r */
    /* loaded from: classes3.dex */
    public static final class r implements ThumbnailCallback {
        r() {
        }

        @Override // com.titan.thumbnail.ThumbnailCallback
        public void onBitmapPrepared(boolean z10, Bitmap bitmap) {
            String str;
            InterfaceC7392a m29682a0;
            String m29710d;
            String str2 = "";
            C7702e.this.f28173C.lock();
            try {
                C7703f c7703f = C7702e.this.f28206z;
                if (c7703f != null) {
                    str = c7703f.m29710d();
                } else {
                    str = null;
                }
                if ((!AbstractC5868k.m23669a(str, "")) && (m29682a0 = C7702e.this.m29682a0()) != null) {
                    C7703f c7703f2 = C7702e.this.f28206z;
                    if (c7703f2 != null && (m29710d = c7703f2.m29710d()) != null) {
                        str2 = m29710d;
                    }
                    m29682a0.mo5950i(z10, bitmap, str2);
                }
            } finally {
                C7702e.this.f28173C.unlock();
            }
        }

        @Override // com.titan.thumbnail.ThumbnailCallback
        public void onGetThumbnail(boolean z10) {
            String str;
            InterfaceC7392a m29682a0;
            String m29710d;
            String str2 = "";
            C7702e.this.f28173C.lock();
            try {
                C7703f c7703f = C7702e.this.f28206z;
                if (c7703f != null) {
                    str = c7703f.m29710d();
                } else {
                    str = null;
                }
                if ((!AbstractC5868k.m23669a(str, "")) && (m29682a0 = C7702e.this.m29682a0()) != null) {
                    C7703f c7703f2 = C7702e.this.f28206z;
                    if (c7703f2 != null && (m29710d = c7703f2.m29710d()) != null) {
                        str2 = m29710d;
                    }
                    m29682a0.mo5952k(z10, str2);
                }
            } finally {
                C7702e.this.f28173C.unlock();
            }
        }
    }

    public C7702e(int i10) {
        InterfaceC1312h m5965b;
        String simpleName = C7702e.class.getSimpleName();
        AbstractC5868k.m23670b(simpleName, "javaClass.simpleName");
        this.f28181a = simpleName;
        this.f28191k = "";
        this.f28195o = i10;
        this.f28200t = EnumC7254b.NATIVE;
        this.f28201u = EnumC7254b.NONE;
        this.f28204x = -1;
        m5965b = AbstractC1314j.m5965b(f.f28215a);
        this.f28171A = m5965b;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f28172B = reentrantReadWriteLock;
        this.f28173C = reentrantReadWriteLock.readLock();
        this.f28174D = reentrantReadWriteLock.writeLock();
        this.f28175E = new HashMap();
        this.f28177G = "";
        this.f28178H = new d();
        this.f28179I = new r();
        this.f28180J = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public final void m29593A0(long j10) {
        String str;
        InterfaceC7392a interfaceC7392a;
        String str2;
        String m29710d;
        if (m29645n0()) {
            try {
                IMediaPlayer iMediaPlayer = this.f28194n;
                if (iMediaPlayer != null) {
                    iMediaPlayer.seekTo(j10);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f28183c = true;
            NativeJni.m13097c().m13106l(this.f28195o, "seekTo", "", 0);
            C7703f c7703f = this.f28206z;
            if (c7703f != null) {
                str = c7703f.m29710d();
            } else {
                str = null;
            }
            if ((true ^ AbstractC5868k.m23669a(str, "")) && (interfaceC7392a = this.f28192l) != null) {
                int i10 = this.f28195o;
                C7703f c7703f2 = this.f28206z;
                if (c7703f2 == null || (m29710d = c7703f2.m29710d()) == null) {
                    str2 = "";
                } else {
                    str2 = m29710d;
                }
                interfaceC7392a.mo5948g(i10, "buffering", "show", 0, str2);
            }
            C7703f c7703f3 = this.f28206z;
            if (c7703f3 != null) {
                c7703f3.m29704I(j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public final void m29598E0(int i10) {
        this.f28189i = i10;
    }

    /* renamed from: J0 */
    private final void m29604J0() {
        IMediaPlayer iMediaPlayer = this.f28194n;
        if (iMediaPlayer != null) {
            iMediaPlayer.setOnPreparedListener(new h());
        }
        IMediaPlayer iMediaPlayer2 = this.f28194n;
        if (iMediaPlayer2 != null) {
            iMediaPlayer2.setOnCompletionListener(new i());
        }
        IMediaPlayer iMediaPlayer3 = this.f28194n;
        if (iMediaPlayer3 != null) {
            iMediaPlayer3.setOnErrorListener(new j());
        }
        IMediaPlayer iMediaPlayer4 = this.f28194n;
        if (iMediaPlayer4 != null) {
            iMediaPlayer4.setOnInfoListener(new k());
        }
        IMediaPlayer iMediaPlayer5 = this.f28194n;
        if (iMediaPlayer5 != null) {
            iMediaPlayer5.setOnSeekCompleteListener(new l());
        }
        IMediaPlayer iMediaPlayer6 = this.f28194n;
        if (iMediaPlayer6 != null) {
            iMediaPlayer6.setOnBufferingUpdateListener(new m());
        }
        IMediaPlayer iMediaPlayer7 = this.f28194n;
        if (iMediaPlayer7 != null) {
            iMediaPlayer7.setOnReplayListener(new n());
        }
        IMediaPlayer iMediaPlayer8 = this.f28194n;
        if (iMediaPlayer8 != null) {
            iMediaPlayer8.setOnSeekListener(new o());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public final void m29609N0(int i10) {
        this.f28190j = i10;
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m29613Q0(C7702e c7702e, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c7702e.m29676P0(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public final void m29615R0() {
        String str;
        m29616S();
        if (this.f28195o != 1) {
            C7703f c7703f = this.f28206z;
            if (c7703f != null) {
                str = c7703f.m29712f();
            } else {
                str = null;
            }
            if (AbstractC7784d.m30153b(str) && this.f28194n != null) {
                if (this.f28197q == null) {
                    this.f28197q = new C7783c();
                }
                C7783c c7783c = this.f28197q;
                if (c7783c == null) {
                    AbstractC5868k.m23682n();
                }
                c7783c.m30149d(m29622Y().m29580a(), new p(), new q());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public final void m29616S() {
        if (this.f28195o != 1) {
            C7783c c7783c = this.f28197q;
            if (c7783c != null) {
                c7783c.m30148c();
            }
            this.f28197q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public final void m29617S0() {
        try {
            IMediaPlayer iMediaPlayer = this.f28194n;
            if (iMediaPlayer != null) {
                iMediaPlayer.stop();
            }
        } catch (Exception unused) {
        }
        NativeJni.m13097c().m13106l(this.f28195o, "stop", "", 0);
        m29661x0();
        m29616S();
    }

    /* renamed from: T */
    private final void m29618T() {
        try {
            m29659w0();
            this.f28194n = m29619U();
            if (m29622Y().m29584e()) {
                IMediaPlayer iMediaPlayer = this.f28194n;
                if (iMediaPlayer != null) {
                    iMediaPlayer.setVolume(m29622Y().m29583d(), m29622Y().m29583d());
                }
                if (m29622Y().m29583d() == 1.0f) {
                    m29622Y().m29590k(false);
                }
            }
            m29604J0();
            C7704g c7704g = this.f28198r;
            if (c7704g != null) {
                IMediaPlayer iMediaPlayer2 = this.f28194n;
                if (iMediaPlayer2 != null) {
                    iMediaPlayer2.setSurface(c7704g.m29734b());
                }
                this.f28199s = true;
            }
            IMediaPlayer iMediaPlayer3 = this.f28194n;
            if (iMediaPlayer3 != null) {
                iMediaPlayer3.setScreenOnWhilePlaying(true);
            }
        } catch (AssertionError unused) {
            NativeJni.m13097c().m13105k(this.f28195o, "onError", 0, 1202, 0L, "");
        } catch (Exception unused2) {
        }
    }

    /* renamed from: U */
    private final IMediaPlayer m29619U() {
        String str;
        String str2;
        C7703f c7703f;
        Program m29713g;
        C7703f c7703f2;
        C7703f c7703f3 = this.f28206z;
        String str3 = null;
        if (c7703f3 != null) {
            str = c7703f3.m29712f();
        } else {
            str = null;
        }
        if (!AbstractC7784d.m30153b(str)) {
            return null;
        }
        int i10 = AbstractC7701d.f28169a[this.f28200t.ordinal()];
        boolean z10 = false;
        if (i10 != 1) {
            if (i10 != 2) {
                if (this.f28195o != 1 && ((c7703f2 = this.f28206z) == null || c7703f2.m29723q() != 0)) {
                    z10 = true;
                }
                C7698a c7698a = C7698a.f28162a;
                String m29581b = m29622Y().m29581b();
                C7703f c7703f4 = this.f28206z;
                if (c7703f4 != null && (m29713g = c7703f4.m29713g()) != null) {
                    str2 = m29713g.getBuss();
                } else {
                    str2 = null;
                }
                boolean m23669a = AbstractC5868k.m23669a(str2, "live");
                int m29585f = m29622Y().m29585f();
                C7703f c7703f5 = this.f28206z;
                if (c7703f5 != null) {
                    str3 = c7703f5.m29708b();
                }
                IMediaPlayer m29579a = c7698a.m29579a(m29581b, m23669a, m29585f, z10, str3);
                if (m29579a != null) {
                    IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) m29579a;
                    if (z10 && (c7703f = this.f28206z) != null) {
                        ijkMediaPlayer.setSharedBuffer(c7703f.m29707a());
                    }
                    ijkMediaPlayer.setOnSelectTrackListener(new a());
                    return ijkMediaPlayer;
                }
                throw new C1325u("null cannot be cast to non-null type tv.danmaku.ijk.media.player.IjkMediaPlayer");
            }
            return new AndroidMediaPlayer();
        }
        Context context = this.f28196p;
        if (context != null) {
            z10 = true;
        }
        if (z10) {
            return new ExoMediaPlayer(context);
        }
        throw new IllegalStateException("ExoMediaPlayer need context!".toString());
    }

    /* renamed from: V0 */
    private final void m29620V0(String str, Program program) {
        this.f28174D.lock();
        try {
            C7703f c7703f = new C7703f();
            this.f28206z = c7703f;
            c7703f.m29732z(str);
            this.f28174D.unlock();
            C7703f c7703f2 = this.f28206z;
            if (c7703f2 != null) {
                c7703f2.m29699D(program);
            }
        } catch (Throwable th) {
            this.f28174D.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public final int m29621X(int i10, int i11) {
        if (i10 == -10000) {
            return i11;
        }
        if (-1004 == i11) {
            return 3000;
        }
        if (-1007 == i11) {
            return 3001;
        }
        if (-1010 == i11) {
            return 3002;
        }
        return -110 == i11 ? 3003 : 3004;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public final C7699b m29622Y() {
        InterfaceC1312h interfaceC1312h = this.f28171A;
        InterfaceC6869f interfaceC6869f = f28170K[0];
        return (C7699b) interfaceC1312h.getValue();
    }

    /* renamed from: d0 */
    private final int m29627d0(int i10) {
        return MediaPlayerCompat.getSelectedTrack(this.f28194n, i10);
    }

    /* renamed from: e0 */
    private final int m29629e0(int i10) {
        MediaPlayer internalMediaPlayer;
        int selectedTrack;
        if (!m29645n0()) {
            return -1;
        }
        IMediaPlayer iMediaPlayer = this.f28194n;
        if (iMediaPlayer instanceof AndroidMediaPlayer) {
            if (Build.VERSION.SDK_INT < 21) {
                return -1;
            }
            try {
                AndroidMediaPlayer androidMediaPlayer = (AndroidMediaPlayer) iMediaPlayer;
                if (androidMediaPlayer != null && (internalMediaPlayer = androidMediaPlayer.getInternalMediaPlayer()) != null) {
                    selectedTrack = internalMediaPlayer.getSelectedTrack(i10);
                    return selectedTrack;
                }
                return -1;
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1;
            }
        }
        return m29627d0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m29632g0(InterfaceC3248b interfaceC3248b) {
        String str;
        C7703f c7703f = this.f28206z;
        String str2 = null;
        if (c7703f != null) {
            str = c7703f.m29710d();
        } else {
            str = null;
        }
        if (AbstractC7784d.m30153b(str)) {
            NativeJni m13097c = NativeJni.m13097c();
            int i10 = this.f28195o;
            C7703f c7703f2 = this.f28206z;
            if (c7703f2 != null) {
                str2 = c7703f2.m29710d();
            }
            m13097c.m13099e(i10, str2, new b(interfaceC3248b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m29635i0() {
        MediaInfo mediaInfo;
        String str;
        MediaInfo mediaInfo2;
        String str2;
        C7076c c7076c;
        int m29629e0 = m29629e0(1);
        int m29629e02 = m29629e0(2);
        int m29629e03 = m29629e0(3);
        ArrayList m29637j0 = m29637j0();
        C7076c c7076c2 = this.f28205y;
        if (c7076c2 != null) {
            c7076c2.m27280t(m29637j0);
        }
        Iterator it = m29637j0.iterator();
        while (it.hasNext()) {
            C7075b c7075b = (C7075b) it.next();
            int m27249b = c7075b.m27249b();
            String str3 = "";
            if (m27249b == m29629e0) {
                C7076c c7076c3 = this.f28205y;
                if (c7076c3 != null) {
                    C7079f c7079f = new C7079f(0, null, null, 0.0f, 0L, 0L, 63, null);
                    c7079f.m27292g(c7075b.m27249b());
                    c7079f.m27289d(c7075b.m27248a());
                    IMediaPlayer iMediaPlayer = this.f28194n;
                    if (iMediaPlayer != null && (mediaInfo = iMediaPlayer.getMediaInfo()) != null && (str = mediaInfo.mVideoDecoderImpl) != null) {
                        str3 = str;
                    }
                    c7079f.m27290e(str3);
                    NativeJni.m13097c().m13102h(this.f28195o, "vdecoder", c7079f.m27286a());
                    c7076c3.m27281u(c7079f);
                }
                NativeJni.m13097c().m13102h(this.f28195o, "vcodec", c7075b.m27248a());
            } else if (m27249b == m29629e02) {
                C7076c c7076c4 = this.f28205y;
                if (c7076c4 != null) {
                    C7074a c7074a = new C7074a(0, null, null, null, 0.0f, 0L, 0L, 127, null);
                    c7074a.m27246g(c7075b.m27249b());
                    c7074a.m27247h(c7075b.m27250c());
                    c7074a.m27243d(c7075b.m27248a());
                    IMediaPlayer iMediaPlayer2 = this.f28194n;
                    if (iMediaPlayer2 != null && (mediaInfo2 = iMediaPlayer2.getMediaInfo()) != null && (str2 = mediaInfo2.mAudioDecoderImpl) != null) {
                        str3 = str2;
                    }
                    c7074a.m27244e(str3);
                    c7076c4.m27268h(c7074a);
                }
                NativeJni.m13097c().m13102h(this.f28195o, "acodec", c7075b.m27248a());
            } else if (m27249b == m29629e03 && (c7076c = this.f28205y) != null) {
                C7078e c7078e = new C7078e(0, null, null, 0.0f, 15, null);
                c7078e.m27284b(c7075b.m27249b());
                c7078e.m27283a(c7075b.m27248a());
                c7078e.m27285c(c7075b.m27250c());
                c7076c.m27278r(c7078e);
            }
        }
    }

    /* renamed from: j0 */
    private final ArrayList m29637j0() {
        ITrackInfo[] iTrackInfoArr;
        boolean z10;
        ArrayList m27266f;
        Object obj;
        ArrayList arrayList = new ArrayList();
        try {
            IMediaPlayer iMediaPlayer = this.f28194n;
            if (iMediaPlayer != null) {
                iTrackInfoArr = iMediaPlayer.getTrackInfo();
            } else {
                iTrackInfoArr = null;
            }
            if (iTrackInfoArr != null) {
                if (iTrackInfoArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int length = iTrackInfoArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        ITrackInfo iTrackInfo = iTrackInfoArr[i10];
                        AbstractC5868k.m23670b(iTrackInfo, "info");
                        if (iTrackInfo.getTrackType() == 2) {
                            C7075b c7075b = new C7075b(0, null, null, null, null, null, null, null, null, null, Message.EXT_HEADER_VALUE_MAX_LEN, null);
                            IMediaFormat format = iTrackInfo.getFormat();
                            if (!(format instanceof IjkMediaFormat)) {
                                format = null;
                            }
                            IjkMediaFormat ijkMediaFormat = (IjkMediaFormat) format;
                            if (ijkMediaFormat != null) {
                                String string = ijkMediaFormat.getString(IjkMediaFormat.KEY_IJK_CODEC_NAME_UI);
                                AbstractC5868k.m23670b(string, "it.getString(IjkMediaFormat.KEY_IJK_CODEC_NAME_UI)");
                                c7075b.m27253f(string);
                                String string2 = ijkMediaFormat.getString(IjkMediaFormat.KEY_IJK_CHANNELS_UI);
                                AbstractC5868k.m23670b(string2, "it.getString(IjkMediaFormat.KEY_IJK_CHANNELS_UI)");
                                c7075b.m27252e(string2);
                                String string3 = ijkMediaFormat.getString(IjkMediaFormat.KEY_IJK_SAMPLE_RATE_UI);
                                AbstractC5868k.m23670b(string3, "it.getString(IjkMediaFor…t.KEY_IJK_SAMPLE_RATE_UI)");
                                c7075b.m27259l(string3);
                            }
                            c7075b.m27255h(i10);
                            String language = iTrackInfo.getLanguage();
                            AbstractC5868k.m23670b(language, "info.language");
                            c7075b.m27256i(language);
                            c7075b.m27260m("audio");
                            arrayList.add(c7075b);
                        } else if (iTrackInfo.getTrackType() == 1) {
                            C7075b c7075b2 = new C7075b(0, null, null, null, null, null, null, null, null, null, Message.EXT_HEADER_VALUE_MAX_LEN, null);
                            IMediaFormat format2 = iTrackInfo.getFormat();
                            if (!(format2 instanceof IjkMediaFormat)) {
                                format2 = null;
                            }
                            IjkMediaFormat ijkMediaFormat2 = (IjkMediaFormat) format2;
                            if (ijkMediaFormat2 != null) {
                                String string4 = ijkMediaFormat2.getString(IjkMediaFormat.KEY_IJK_CODEC_PIXEL_FORMAT_UI);
                                AbstractC5868k.m23670b(string4, "it.getString(IjkMediaFor…JK_CODEC_PIXEL_FORMAT_UI)");
                                c7075b2.m27257j(string4);
                                String string5 = ijkMediaFormat2.getString(IjkMediaFormat.KEY_IJK_CODEC_NAME_UI);
                                AbstractC5868k.m23670b(string5, "it.getString(IjkMediaFormat.KEY_IJK_CODEC_NAME_UI)");
                                c7075b2.m27253f(string5);
                                String string6 = ijkMediaFormat2.getString(IjkMediaFormat.KEY_IJK_FRAME_RATE_UI);
                                AbstractC5868k.m23670b(string6, "it.getString(IjkMediaFormat.KEY_IJK_FRAME_RATE_UI)");
                                c7075b2.m27254g(string6);
                            }
                            c7075b2.m27255h(i10);
                            c7075b2.m27260m("video");
                            StringBuilder sb2 = new StringBuilder();
                            IMediaPlayer iMediaPlayer2 = this.f28194n;
                            Object obj2 = MessageService.MSG_DB_READY_REPORT;
                            if (iMediaPlayer2 != null) {
                                obj = Integer.valueOf(iMediaPlayer2.getVideoWidth());
                            } else {
                                obj = MessageService.MSG_DB_READY_REPORT;
                            }
                            sb2.append(obj);
                            sb2.append(" x ");
                            IMediaPlayer iMediaPlayer3 = this.f28194n;
                            if (iMediaPlayer3 != null) {
                                obj2 = Integer.valueOf(iMediaPlayer3.getVideoHeight());
                            }
                            sb2.append(obj2);
                            c7075b2.m27258k(sb2.toString());
                            arrayList.add(c7075b2);
                        } else if (iTrackInfo.getTrackType() == 3) {
                            C7075b c7075b3 = new C7075b(0, null, null, null, null, null, null, null, null, null, Message.EXT_HEADER_VALUE_MAX_LEN, null);
                            IMediaFormat format3 = iTrackInfo.getFormat();
                            if (!(format3 instanceof IjkMediaFormat)) {
                                format3 = null;
                            }
                            IjkMediaFormat ijkMediaFormat3 = (IjkMediaFormat) format3;
                            if (ijkMediaFormat3 != null) {
                                String string7 = ijkMediaFormat3.getString(IjkMediaFormat.KEY_IJK_CODEC_NAME_UI);
                                AbstractC5868k.m23670b(string7, "it.getString(IjkMediaFormat.KEY_IJK_CODEC_NAME_UI)");
                                c7075b3.m27253f(string7);
                            }
                            c7075b3.m27255h(i10);
                            String language2 = iTrackInfo.getLanguage();
                            AbstractC5868k.m23670b(language2, "info.language");
                            c7075b3.m27256i(language2);
                            c7075b3.m27260m("subtitle");
                            arrayList.add(c7075b3);
                        } else {
                            C7075b c7075b4 = new C7075b(0, null, null, null, null, null, null, null, null, null, Message.EXT_HEADER_VALUE_MAX_LEN, null);
                            IMediaFormat format4 = iTrackInfo.getFormat();
                            if (!(format4 instanceof IjkMediaFormat)) {
                                format4 = null;
                            }
                            IjkMediaFormat ijkMediaFormat4 = (IjkMediaFormat) format4;
                            if (ijkMediaFormat4 != null) {
                                String string8 = ijkMediaFormat4.getString(IjkMediaFormat.KEY_IJK_CODEC_NAME_UI);
                                AbstractC5868k.m23670b(string8, "it.getString(IjkMediaFormat.KEY_IJK_CODEC_NAME_UI)");
                                c7075b4.m27253f(string8);
                            }
                            c7075b4.m27255h(i10);
                            String language3 = iTrackInfo.getLanguage();
                            AbstractC5868k.m23670b(language3, "info.language");
                            c7075b4.m27256i(language3);
                            c7075b4.m27260m("unknown");
                            C7076c c7076c = this.f28205y;
                            if (c7076c != null && (m27266f = c7076c.m27266f()) != null) {
                                m27266f.add(c7075b4);
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r0 != false) goto L30;
     */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m29639k0(java.lang.String r12) {
        /*
            r11 = this;
            yc.f r0 = r11.f28206z
            r1 = 1
            if (r0 == 0) goto Lb
            boolean r0 = r0.m29725s()
            if (r0 == r1) goto Lc3
        Lb:
            if (r12 == 0) goto Lc3
            yc.f r0 = r11.f28206z
            if (r0 == 0) goto L19
            boolean r0 = r0.m29724r()
            if (r0 != r1) goto L19
            goto Lc3
        L19:
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r11.f28194n
            r2 = 0
            if (r0 == 0) goto L68
            boolean r0 = r0 instanceof tv.danmaku.ijk.media.player.AndroidMediaPlayer
            if (r0 == 0) goto L68
            yc.h$b r0 = p418yc.C7705h.f28256m
            yc.h r0 = r0.m29771a()
            com.titan.ranger.bean.Env r0 = r0.m29757m()
            if (r0 == 0) goto L33
            java.lang.String r0 = r0.getDev_id()
            goto L34
        L33:
            r0 = r2
        L34:
            boolean r0 = p432zc.AbstractC7784d.m30153b(r0)
            if (r0 == 0) goto L68
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r3 > r0) goto L44
            r3 = 23
            if (r3 >= r0) goto L56
        L44:
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r3 = "Ebox"
            boolean r3 = p359ue.AbstractC7157k.m27705j(r0, r3, r1)
            if (r3 != 0) goto L56
            java.lang.String r3 = "Obox"
            boolean r0 = p359ue.AbstractC7157k.m27705j(r0, r3, r1)
            if (r0 == 0) goto L68
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 115(0x73, float:1.61E-43)
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            return r12
        L68:
            java.lang.String r0 = "s"
            r3 = 2
            r4 = 0
            boolean r0 = p359ue.AbstractC7157k.m27710q(r12, r0, r4, r3, r2)
            if (r0 == 0) goto L7b
            java.lang.String r12 = r12.substring(r1)
            java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
            ne.AbstractC5868k.m23670b(r12, r0)
        L7b:
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r11.f28194n
            boolean r2 = r0 instanceof tv.danmaku.ijk.media.player.AndroidMediaPlayer
            if (r2 != 0) goto Lc3
            boolean r0 = r0 instanceof tv.danmaku.ijk.media.player.ExoMediaPlayer
            if (r0 == 0) goto L86
            goto Lc3
        L86:
            java.lang.String r6 = "?"
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r12
            int r0 = p359ue.AbstractC7157k.m27689E(r5, r6, r7, r8, r9, r10)
            r2 = -1
            if (r0 == r2) goto La8
            if (r12 == 0) goto La0
            java.lang.String r0 = r12.substring(r4, r0)
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            ne.AbstractC5868k.m23670b(r0, r2)
            goto La9
        La0:
            be.u r12 = new be.u
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r0)
            throw r12
        La8:
            r0 = r12
        La9:
            java.lang.String r2 = ".m3u8"
            boolean r0 = p359ue.AbstractC7157k.m27703h(r0, r2, r1)
            if (r0 == 0) goto Lb2
            return r12
        Lb2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ijkhttphook:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
        Lc3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p418yc.C7702e.m29639k0(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public final void m29641l0() {
        String str;
        C7703f c7703f = this.f28206z;
        if (c7703f != null) {
            str = c7703f.m29712f();
        } else {
            str = null;
        }
        if (!AbstractC7784d.m30152a(str) && this.f28198r != null) {
            m29618T();
            m29661x0();
            this.f28180J.post(new c());
        }
    }

    /* renamed from: m0 */
    private final boolean m29643m0() {
        String str;
        if (Build.VERSION.SDK_INT == 28) {
            Env m29757m = C7705h.f28256m.m29771a().m29757m();
            if (m29757m != null) {
                str = m29757m.getDev_id();
            } else {
                str = null;
            }
            if (AbstractC7784d.m30153b(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public final boolean m29645n0() {
        int i10 = 0;
        if (this.f28194n != null && (i10 = this.f28189i) != -1 && i10 != 0 && i10 != 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public final void m29648p0(String str) {
        String str2;
        C7703f c7703f = this.f28206z;
        if (c7703f != null && c7703f.m29724r()) {
            str2 = C3325bt.f14185aC;
        } else {
            str2 = "media";
        }
        NativeJni.m13097c().m13103i(this.f28195o, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final void m29650q0() {
        long j10;
        long m29679V = m29679V();
        IMediaPlayer iMediaPlayer = this.f28194n;
        if (iMediaPlayer instanceof IjkMediaPlayer) {
            if (iMediaPlayer != null) {
                j10 = ((IjkMediaPlayer) iMediaPlayer).getAudioCachedDuration();
            } else {
                throw new C1325u("null cannot be cast to non-null type tv.danmaku.ijk.media.player.IjkMediaPlayer");
            }
        } else {
            j10 = this.f28176F - m29679V;
        }
        NativeJni.m13097c().m13104j(this.f28195o, m29679V, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r4 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2 A[Catch: AssertionError -> 0x00d3, Exception -> 0x00e9, TryCatch #2 {AssertionError -> 0x00d3, Exception -> 0x00e9, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000a, B:8:0x0010, B:12:0x0027, B:14:0x002e, B:16:0x0034, B:18:0x003c, B:20:0x0044, B:22:0x004a, B:24:0x004e, B:26:0x0056, B:28:0x005a, B:30:0x005e, B:31:0x0062, B:32:0x0089, B:34:0x0095, B:37:0x009d, B:39:0x00a5, B:41:0x00ab, B:42:0x00ae, B:44:0x00b2, B:45:0x00b5, B:47:0x00b9, B:48:0x00bc, B:52:0x0066, B:54:0x0078, B:55:0x007b, B:57:0x007f, B:59:0x0083, B:60:0x0086, B:62:0x00cb, B:64:0x00cf), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9 A[Catch: AssertionError -> 0x00d3, Exception -> 0x00e9, TryCatch #2 {AssertionError -> 0x00d3, Exception -> 0x00e9, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000a, B:8:0x0010, B:12:0x0027, B:14:0x002e, B:16:0x0034, B:18:0x003c, B:20:0x0044, B:22:0x004a, B:24:0x004e, B:26:0x0056, B:28:0x005a, B:30:0x005e, B:31:0x0062, B:32:0x0089, B:34:0x0095, B:37:0x009d, B:39:0x00a5, B:41:0x00ab, B:42:0x00ae, B:44:0x00b2, B:45:0x00b5, B:47:0x00b9, B:48:0x00bc, B:52:0x0066, B:54:0x0078, B:55:0x007b, B:57:0x007f, B:59:0x0083, B:60:0x0086, B:62:0x00cb, B:64:0x00cf), top: B:2:0x0001 }] */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29652r0() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p418yc.C7702e.m29652r0():void");
    }

    /* renamed from: u0 */
    private final void m29656u0() {
        Field field;
        try {
            IMediaPlayer iMediaPlayer = this.f28194n;
            if (iMediaPlayer != null) {
                if (iMediaPlayer != null) {
                    field = iMediaPlayer.getClass().getDeclaredField("subTitleService");
                } else {
                    field = null;
                }
                if (field != null) {
                    field.setAccessible(true);
                }
                if (field != null) {
                    field.set(this.f28194n, null);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m29659w0() {
        /*
            r5 = this;
            yc.e$e r0 = r5.f28180J
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r0 = 0
            r5.m29598E0(r0)
            r5.m29609N0(r0)
            r5.m29661x0()
            r5.m29616S()
            tv.danmaku.ijk.media.player.IMediaPlayer r2 = r5.f28194n
            if (r2 == 0) goto L65
            boolean r2 = r5.m29643m0()
            if (r2 == 0) goto L29
            tv.danmaku.ijk.media.player.IMediaPlayer r2 = r5.f28194n
            boolean r3 = r2 instanceof tv.danmaku.ijk.media.player.AndroidMediaPlayer
            if (r3 == 0) goto L29
            if (r2 == 0) goto L30
            r2.reset()
            goto L30
        L29:
            tv.danmaku.ijk.media.player.IMediaPlayer r2 = r5.f28194n
            if (r2 == 0) goto L30
            r2.stop()
        L30:
            com.titan.ranger.NativeJni r2 = com.titan.ranger.NativeJni.m13097c()
            int r3 = r5.f28195o
            java.lang.String r4 = "stop"
            r2.m13106l(r3, r4, r4, r0)
            tv.danmaku.ijk.media.player.IMediaPlayer r2 = r5.f28194n
            if (r2 == 0) goto L42
            r2.release()
        L42:
            com.titan.ranger.NativeJni r2 = com.titan.ranger.NativeJni.m13097c()
            int r3 = r5.f28195o
            java.lang.String r4 = "release"
            r2.m13106l(r3, r4, r4, r0)
            r5.f28199s = r0
            java.lang.String r0 = r5.f28181a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mediaPlayer has release;"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
        L65:
            r5.f28194n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p418yc.C7702e.m29659w0():void");
    }

    /* renamed from: x0 */
    private final void m29661x0() {
        this.f28183c = false;
        this.f28185e = false;
        this.f28186f = false;
        this.f28191k = "";
        this.f28202v = false;
        this.f28203w = false;
        this.f28204x = -1;
        this.f28177G = "";
        this.f28184d = false;
        this.f28201u = EnumC7254b.NONE;
        C7703f c7703f = this.f28206z;
        if (c7703f != null) {
            c7703f.m29728v(false);
        }
        C7703f c7703f2 = this.f28206z;
        if (c7703f2 != null) {
            c7703f2.m29696A(-1L);
        }
        C7703f c7703f3 = this.f28206z;
        if (c7703f3 != null) {
            c7703f3.m29729w(false);
        }
        C7703f c7703f4 = this.f28206z;
        if (c7703f4 != null) {
            c7703f4.m29706K(false);
        }
    }

    /* renamed from: y0 */
    private final void m29663y0() {
        this.f28180J.removeCallbacksAndMessages(null);
        m29661x0();
        m29598E0(0);
    }

    /* renamed from: B0 */
    public final int m29665B0(String str, long j10) {
        boolean z10;
        C7703f c7703f;
        C7703f c7703f2;
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        if (!m29645n0()) {
            return -1;
        }
        if (this.f28189i == 5) {
            m29598E0(4);
        }
        C7703f c7703f3 = this.f28206z;
        if (c7703f3 != null) {
            c7703f3.m29729w(false);
        }
        C7703f c7703f4 = this.f28206z;
        if (c7703f4 != null) {
            c7703f4.m29703H(j10);
        }
        if (this.f28183c && this.f28200t == EnumC7254b.NATIVE) {
            C7703f c7703f5 = this.f28206z;
            if (c7703f5 != null) {
                c7703f5.m29696A(j10);
            }
            return -1;
        }
        NativeJni.m13097c().m13102h(this.f28195o, "seek_count", "");
        if (this.f28195o != 1 && (((c7703f2 = this.f28206z) == null || c7703f2.m29723q() != 0) && this.f28200t == EnumC7254b.IJK)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && ((c7703f = this.f28206z) == null || !c7703f.m29722p())) {
            NativeJni.m13097c().m13111q(this.f28195o, str, j10, -1L, new g(j10));
        } else {
            m29593A0(j10);
        }
        return 0;
    }

    /* renamed from: C0 */
    public final int m29666C0(int i10) {
        ExoMediaPlayer exoMediaPlayer;
        MediaPlayer internalMediaPlayer;
        ExoMediaPlayer exoMediaPlayer2;
        MediaPlayer internalMediaPlayer2;
        ArrayList arrayList;
        C7074a m27261a;
        String str;
        MediaInfo mediaInfo;
        if (m29645n0()) {
            IMediaPlayer iMediaPlayer = this.f28194n;
            if (iMediaPlayer instanceof IjkMediaPlayer) {
                IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) iMediaPlayer;
                if (ijkMediaPlayer != null) {
                    ijkMediaPlayer.selectTrack(i10);
                }
            } else if (iMediaPlayer instanceof AndroidMediaPlayer) {
                AndroidMediaPlayer androidMediaPlayer = (AndroidMediaPlayer) iMediaPlayer;
                if (androidMediaPlayer != null && (internalMediaPlayer2 = androidMediaPlayer.getInternalMediaPlayer()) != null) {
                    internalMediaPlayer2.selectTrack(i10);
                }
            } else if ((iMediaPlayer instanceof ExoMediaPlayer) && (exoMediaPlayer2 = (ExoMediaPlayer) iMediaPlayer) != null) {
                exoMediaPlayer2.selectAudioTrack(i10);
            }
            NativeJni.m13097c().m13102h(this.f28195o, "switch_count", "");
            int m29629e0 = m29629e0(2);
            C7076c c7076c = this.f28205y;
            if (c7076c != null) {
                arrayList = c7076c.m27266f();
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C7075b c7075b = (C7075b) it.next();
                    if (m29629e0 == c7075b.m27249b()) {
                        C7076c c7076c2 = this.f28205y;
                        if (c7076c2 != null && (m27261a = c7076c2.m27261a()) != null) {
                            m27261a.m27246g(c7075b.m27249b());
                            m27261a.m27247h(c7075b.m27250c());
                            m27261a.m27243d(c7075b.m27248a());
                            IMediaPlayer iMediaPlayer2 = this.f28194n;
                            if (iMediaPlayer2 == null || (mediaInfo = iMediaPlayer2.getMediaInfo()) == null || (str = mediaInfo.mAudioDecoderImpl) == null) {
                                str = "";
                            }
                            m27261a.m27244e(str);
                        }
                        NativeJni.m13097c().m13102h(this.f28195o, "acodec", c7075b.m27248a());
                    }
                }
            }
            return 0;
        }
        boolean z10 = this.f28202v;
        if (z10 && !this.f28203w) {
            IMediaPlayer iMediaPlayer3 = this.f28194n;
            if (iMediaPlayer3 instanceof IjkMediaPlayer) {
                IjkMediaPlayer ijkMediaPlayer2 = (IjkMediaPlayer) iMediaPlayer3;
                if (ijkMediaPlayer2 != null) {
                    ijkMediaPlayer2.selectTrack(i10);
                }
            } else if (iMediaPlayer3 instanceof AndroidMediaPlayer) {
                AndroidMediaPlayer androidMediaPlayer2 = (AndroidMediaPlayer) iMediaPlayer3;
                if (androidMediaPlayer2 != null && (internalMediaPlayer = androidMediaPlayer2.getInternalMediaPlayer()) != null) {
                    internalMediaPlayer.selectTrack(i10);
                }
            } else if ((iMediaPlayer3 instanceof ExoMediaPlayer) && (exoMediaPlayer = (ExoMediaPlayer) iMediaPlayer3) != null) {
                exoMediaPlayer.selectAudioTrack(i10);
            }
            return 0;
        }
        if (z10) {
            this.f28204x = i10;
            return 0;
        }
        return -1;
    }

    /* renamed from: D0 */
    public final void m29667D0(InterfaceC7392a interfaceC7392a, InterfaceC7393b interfaceC7393b) {
        AbstractC5868k.m23675g(interfaceC7392a, "playerCallback");
        AbstractC5868k.m23675g(interfaceC7393b, "rangerCallback");
        this.f28192l = interfaceC7392a;
        this.f28193m = interfaceC7393b;
        JniHandler.m13088d(this.f28195o, this.f28178H);
    }

    /* renamed from: F0 */
    public final void m29668F0(int i10) {
        m29622Y().m29587h(i10);
    }

    /* renamed from: G0 */
    public final void m29669G0(int i10) {
        m29622Y().m29588i(i10);
    }

    /* renamed from: H0 */
    public final void m29670H0(Context context) {
        this.f28196p = context;
    }

    /* renamed from: I0 */
    public final int m29671I0(String str, String str2) {
        Program m29713g;
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        AbstractC5868k.m23675g(str2, "media");
        C7703f c7703f = this.f28206z;
        if (c7703f != null && (m29713g = c7703f.m29713g()) != null) {
            m29713g.setMedia(str2);
        }
        C7703f c7703f2 = this.f28206z;
        if (c7703f2 != null) {
            c7703f2.m29701F(false);
        }
        C7703f c7703f3 = this.f28206z;
        if (c7703f3 != null) {
            c7703f3.m29703H(-1L);
        }
        C7703f c7703f4 = this.f28206z;
        if (c7703f4 != null) {
            c7703f4.m29702G(0L);
        }
        this.f28205y = null;
        m29648p0("end");
        NativeJni.m13097c().m13113s(this.f28195o, str, str2);
        return 0;
    }

    /* renamed from: K0 */
    public final void m29672K0(int i10) {
        m29622Y().m29586g(i10);
    }

    /* renamed from: L0 */
    public final int m29673L0(int i10) {
        m29645n0();
        return 0;
    }

    /* renamed from: M0 */
    public final void m29674M0(Surface surface, String str) {
        String str2;
        AbstractC5868k.m23675g(str, "surfaceId");
        String str3 = null;
        if (surface == null) {
            C7704g c7704g = this.f28198r;
            if (c7704g != null) {
                str2 = c7704g.m29733a();
            } else {
                str2 = null;
            }
            if (AbstractC5868k.m23669a(str, str2)) {
                IMediaPlayer iMediaPlayer = this.f28194n;
                if (iMediaPlayer != null) {
                    iMediaPlayer.setSurface(null);
                }
                this.f28198r = null;
                this.f28199s = false;
                return;
            }
            return;
        }
        C7704g c7704g2 = new C7704g(str, surface);
        this.f28198r = c7704g2;
        if (!this.f28199s) {
            IMediaPlayer iMediaPlayer2 = this.f28194n;
            if (iMediaPlayer2 != null) {
                iMediaPlayer2.setSurface(c7704g2.m29734b());
            }
            this.f28199s = true;
        }
        C7703f c7703f = this.f28206z;
        if (c7703f != null) {
            str3 = c7703f.m29712f();
        }
        if (AbstractC7784d.m30153b(str3) && this.f28194n == null) {
            m29641l0();
        }
    }

    /* renamed from: O0 */
    public final int m29675O0(int i10) {
        float f10 = i10 / 100;
        if (m29645n0()) {
            m29622Y().m29589j(f10);
            IMediaPlayer iMediaPlayer = this.f28194n;
            if (iMediaPlayer != null) {
                iMediaPlayer.setVolume(f10, f10);
                return 0;
            }
            return 0;
        }
        m29622Y().m29589j(f10);
        m29622Y().m29590k(true);
        return 0;
    }

    /* renamed from: P0 */
    public final void m29676P0(String str, boolean z10) {
        String str2;
        String m29718l;
        Program m29713g;
        C7076c c7076c;
        AbstractC5868k.m23675g(str, "realPlayUrl");
        C7703f c7703f = this.f28206z;
        if (c7703f != null) {
            c7703f.m29697B(z10);
        }
        C7703f c7703f2 = this.f28206z;
        if (c7703f2 != null) {
            c7703f2.m29704I(0L);
        }
        C7703f c7703f3 = this.f28206z;
        String str3 = "";
        if (c7703f3 != null) {
            if (AbstractC7784d.m30152a(str) && ((c7076c = this.f28205y) == null || (str = c7076c.m27264d()) == null)) {
                str = "";
            }
            c7703f3.m29698C(str);
        }
        C7703f c7703f4 = this.f28206z;
        if (c7703f4 != null && (m29713g = c7703f4.m29713g()) != null) {
            str2 = m29713g.getBuss();
        } else {
            str2 = null;
        }
        if (AbstractC5868k.m23669a(str2, "vod") && !z10) {
            ThumbnailUtil thumbnailUtil = ThumbnailUtil.INSTANCE;
            C7703f c7703f5 = this.f28206z;
            if (c7703f5 != null && (m29718l = c7703f5.m29718l()) != null) {
                str3 = m29718l;
            }
            thumbnailUtil.setSnapInfoUrl(str3);
        }
        m29641l0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (ne.AbstractC5868k.m23669a(r11, "record") != false) goto L28;
     */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m29677T0(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "name"
            ne.AbstractC5868k.m23675g(r11, r0)
            r0 = 0
            r10.f28205y = r0
            r10.m29616S()
            java.lang.String r1 = "end"
            r10.m29648p0(r1)
            r10.m29659w0()     // Catch: java.lang.AssertionError -> L14 java.lang.Exception -> L27
            goto L28
        L14:
            com.titan.ranger.NativeJni r2 = com.titan.ranger.NativeJni.m13097c()
            int r3 = r10.f28195o
            java.lang.String r4 = "onError"
            r5 = 0
            r6 = 1202(0x4b2, float:1.684E-42)
            r7 = 0
            java.lang.String r9 = ""
            r2.m13105k(r3, r4, r5, r6, r7, r9)
            goto L28
        L27:
        L28:
            r1 = 0
            r10.m29598E0(r1)
            r10.m29609N0(r1)
            yc.f r2 = r10.f28206z
            if (r2 == 0) goto L42
            boolean r2 = r2.m29722p()
            if (r2 != 0) goto L42
            com.titan.ranger.NativeJni r2 = com.titan.ranger.NativeJni.m13097c()
            int r3 = r10.f28195o
            r2.m13115u(r3, r11)
        L42:
            yc.f r11 = r10.f28206z
            if (r11 == 0) goto L51
            com.titan.ranger.bean.Program r11 = r11.m29713g()
            if (r11 == 0) goto L51
            java.lang.String r11 = r11.getBuss()
            goto L52
        L51:
            r11 = r0
        L52:
            java.lang.String r2 = "vod"
            boolean r11 = ne.AbstractC5868k.m23669a(r11, r2)
            if (r11 != 0) goto L72
            yc.f r11 = r10.f28206z
            if (r11 == 0) goto L69
            com.titan.ranger.bean.Program r11 = r11.m29713g()
            if (r11 == 0) goto L69
            java.lang.String r11 = r11.getBuss()
            goto L6a
        L69:
            r11 = r0
        L6a:
            java.lang.String r2 = "record"
            boolean r11 = ne.AbstractC5868k.m23669a(r11, r2)
            if (r11 == 0) goto L81
        L72:
            com.titan.thumbnail.ThumbnailUtil r11 = com.titan.thumbnail.ThumbnailUtil.INSTANCE
            r11.reset()
            com.titan.thumbnail.PreviewUtil r11 = com.titan.thumbnail.PreviewUtil.INSTANCE
            r11.recycle()
            com.titan.thumbnail.ThumbnailRequest r11 = com.titan.thumbnail.ThumbnailRequest.INSTANCE
            r11.cancel()
        L81:
            java.util.concurrent.locks.Lock r11 = r10.f28174D
            r11.lock()
            yc.f r11 = r10.f28206z     // Catch: java.lang.Throwable -> L97
            if (r11 == 0) goto L8f
            java.lang.String r2 = ""
            r11.m29732z(r2)     // Catch: java.lang.Throwable -> L97
        L8f:
            r10.f28206z = r0     // Catch: java.lang.Throwable -> L97
            java.util.concurrent.locks.Lock r11 = r10.f28174D
            r11.unlock()
            return r1
        L97:
            r11 = move-exception
            java.util.concurrent.locks.Lock r0 = r10.f28174D
            r0.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p418yc.C7702e.m29677T0(java.lang.String):int");
    }

    /* renamed from: U0 */
    public final int m29678U0(String str, int i10) {
        String str2;
        boolean z10;
        String str3;
        C7703f c7703f;
        C7703f c7703f2;
        Program m29713g;
        AbstractC5868k.m23675g(str, "playerType");
        C7703f c7703f3 = this.f28206z;
        if (c7703f3 != null) {
            str2 = c7703f3.m29712f();
        } else {
            str2 = null;
        }
        if (AbstractC7784d.m30153b(str2) && this.f28194n != null) {
            if (!AbstractC5868k.m23669a(str, this.f28200t.m28086a())) {
                if (this.f28200t == EnumC7254b.NATIVE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EnumC7254b m28087a = EnumC7254b.f27113g.m28087a(str);
                if (m28087a == null) {
                    AbstractC5868k.m23682n();
                }
                if (this.f28183c && z10) {
                    this.f28184d = true;
                    this.f28201u = m28087a;
                    return 0;
                }
                this.f28200t = m28087a;
                C7703f c7703f4 = this.f28206z;
                if (c7703f4 != null && (m29713g = c7703f4.m29713g()) != null) {
                    str3 = m29713g.getBuss();
                } else {
                    str3 = null;
                }
                if (!AbstractC5868k.m23669a(str3, "live")) {
                    long m29679V = m29679V();
                    if (m29679V > 1 && (c7703f = this.f28206z) != null && c7703f.m29715i() == 0 && (c7703f2 = this.f28206z) != null) {
                        c7703f2.m29702G(m29679V);
                    }
                }
                m29663y0();
                C7703f c7703f5 = this.f28206z;
                if (c7703f5 != null) {
                    c7703f5.m29703H(-1L);
                }
                C7076c c7076c = this.f28205y;
                if (c7076c != null) {
                    c7076c.m27276p(this.f28200t.m28086a());
                }
                C7076c c7076c2 = this.f28205y;
                if (c7076c2 != null) {
                    c7076c2.m27281u(null);
                }
                C7076c c7076c3 = this.f28205y;
                if (c7076c3 != null) {
                    c7076c3.m27268h(null);
                }
                C7076c c7076c4 = this.f28205y;
                if (c7076c4 != null) {
                    c7076c4.m27278r(null);
                }
                C7076c c7076c5 = this.f28205y;
                if (c7076c5 != null) {
                    c7076c5.m27280t(null);
                }
                C7703f c7703f6 = this.f28206z;
                if (c7703f6 != null && c7703f6.m29722p()) {
                    m29641l0();
                } else {
                    NativeJni.m13097c().m13101g(this.f28195o, this.f28200t.m28086a(), i10);
                }
            }
        } else if (!AbstractC5868k.m23669a(str, this.f28200t.m28086a())) {
            EnumC7254b m28087a2 = EnumC7254b.f27113g.m28087a(str);
            if (m28087a2 == null) {
                AbstractC5868k.m23682n();
            }
            this.f28200t = m28087a2;
            NativeJni.m13097c().m13101g(this.f28195o, this.f28200t.m28086a(), -1);
        }
        return 0;
    }

    /* renamed from: V */
    public final long m29679V() {
        Long l10;
        if (m29645n0()) {
            IMediaPlayer iMediaPlayer = this.f28194n;
            if (iMediaPlayer != null) {
                l10 = Long.valueOf(iMediaPlayer.getCurrentPosition());
            } else {
                l10 = null;
            }
            if (l10 == null) {
                AbstractC5868k.m23682n();
            }
            return l10.longValue();
        }
        return -1L;
    }

    /* renamed from: W */
    public final long m29680W() {
        Long l10;
        if (m29645n0()) {
            IMediaPlayer iMediaPlayer = this.f28194n;
            if (iMediaPlayer != null) {
                l10 = Long.valueOf(iMediaPlayer.getDuration());
            } else {
                l10 = null;
            }
            if (l10 == null) {
                AbstractC5868k.m23682n();
            }
            return l10.longValue();
        }
        return -1L;
    }

    /* renamed from: Z */
    public final IMediaPlayer m29681Z() {
        return this.f28194n;
    }

    /* renamed from: a0 */
    public final InterfaceC7392a m29682a0() {
        return this.f28192l;
    }

    /* renamed from: b0 */
    public final InterfaceC7393b m29683b0() {
        return this.f28193m;
    }

    /* renamed from: c0 */
    public final String m29684c0() {
        IMediaPlayer iMediaPlayer = this.f28194n;
        if (iMediaPlayer instanceof IjkMediaPlayer) {
            if (iMediaPlayer != null) {
                String dumpPlayInfo = ((IjkMediaPlayer) iMediaPlayer).dumpPlayInfo();
                AbstractC5868k.m23670b(dumpPlayInfo, "(mediaPlayer as IjkMediaPlayer).dumpPlayInfo()");
                return dumpPlayInfo;
            }
            throw new C1325u("null cannot be cast to non-null type tv.danmaku.ijk.media.player.IjkMediaPlayer");
        }
        return "none";
    }

    /* renamed from: f0 */
    public final C7076c m29685f0() {
        C7074a m27261a;
        C7074a m27261a2;
        C7074a m27261a3;
        C7079f m27267g;
        C7079f m27267g2;
        C7079f m27267g3;
        IMediaPlayer iMediaPlayer = this.f28194n;
        if (!(iMediaPlayer instanceof IjkMediaPlayer)) {
            iMediaPlayer = null;
        }
        IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer) iMediaPlayer;
        if (ijkMediaPlayer != null) {
            C7076c c7076c = this.f28205y;
            if (c7076c != null && (m27267g3 = c7076c.m27267g()) != null) {
                m27267g3.m27288c(ijkMediaPlayer.getVideoCachedDuration());
            }
            C7076c c7076c2 = this.f28205y;
            if (c7076c2 != null && (m27267g2 = c7076c2.m27267g()) != null) {
                m27267g2.m27287b(ijkMediaPlayer.getVideoCachedBytes());
            }
            C7076c c7076c3 = this.f28205y;
            if (c7076c3 != null && (m27267g = c7076c3.m27267g()) != null) {
                m27267g.m27291f(ijkMediaPlayer.getVideoDecodeFramesPerSecond());
            }
            C7076c c7076c4 = this.f28205y;
            if (c7076c4 != null && (m27261a3 = c7076c4.m27261a()) != null) {
                m27261a3.m27242c(ijkMediaPlayer.getAudioCachedDuration());
            }
            C7076c c7076c5 = this.f28205y;
            if (c7076c5 != null && (m27261a2 = c7076c5.m27261a()) != null) {
                m27261a2.m27241b(ijkMediaPlayer.getAudioCachedBytes());
            }
            C7076c c7076c6 = this.f28205y;
            if (c7076c6 != null && (m27261a = c7076c6.m27261a()) != null) {
                m27261a.m27245f(ijkMediaPlayer.getAVDiff());
            }
        }
        C7076c c7076c7 = this.f28205y;
        if (c7076c7 != null) {
            c7076c7.m27276p(this.f28200t.m28086a());
        }
        return this.f28205y;
    }

    /* renamed from: h0 */
    public final ThumbnailCallback m29686h0() {
        return this.f28179I;
    }

    /* renamed from: o0 */
    public final boolean m29687o0() {
        String m29712f;
        boolean z10;
        IMediaPlayer iMediaPlayer;
        C7703f c7703f = this.f28206z;
        if (c7703f == null || (m29712f = c7703f.m29712f()) == null) {
            return false;
        }
        if (m29712f.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || !m29645n0() || (iMediaPlayer = this.f28194n) == null || !iMediaPlayer.isPlaying()) {
            return false;
        }
        return true;
    }

    /* renamed from: s0 */
    public final int m29688s0(String str) {
        int i10 = 0;
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        this.f28182b = true;
        m29609N0(4);
        if (m29645n0()) {
            C7703f c7703f = this.f28206z;
            if (c7703f != null && !c7703f.m29722p()) {
                NativeJni.m13097c().m13108n(this.f28195o, str);
            }
            try {
                IMediaPlayer iMediaPlayer = this.f28194n;
                if (iMediaPlayer != null) {
                    iMediaPlayer.pause();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            i10 = 0;
            NativeJni.m13097c().m13106l(this.f28195o, "pause", "", 0);
            m29598E0(4);
        } else {
            i10 = -1;
        }
        this.f28185e = true;
        return i10;
    }

    /* renamed from: t0 */
    public final void m29689t0(String str, Program program, String str2) {
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        AbstractC5868k.m23675g(program, "program");
        AbstractC5868k.m23675g(str2, "extra");
        m29620V0(str, program);
        this.f28205y = new C7076c(0L, null, null, null, null, null, null, 0L, null, null, null, null, null, null, 16383, null);
        this.f28182b = false;
        NativeJni.m13097c().m13109o(this.f28195o, str, AbstractC7781a.m30143a().toJson(program), str2);
    }

    /* renamed from: v0 */
    public final void m29690v0(Status status) {
        boolean m27729p;
        AbstractC5868k.m23675g(status, Progress.STATUS);
        if (this.f28205y == null) {
            this.f28205y = new C7076c(0L, null, null, null, null, null, null, 0L, null, null, null, null, null, null, 16383, null);
        }
        C7076c c7076c = this.f28205y;
        if (c7076c != null) {
            String program = status.getProgram();
            AbstractC5868k.m23670b(program, "status.program");
            c7076c.m27277q(program);
        }
        C7076c c7076c2 = this.f28205y;
        if (c7076c2 != null) {
            String title = status.getTitle();
            AbstractC5868k.m23670b(title, "status.title");
            c7076c2.m27279s(title);
        }
        C7076c c7076c3 = this.f28205y;
        if (c7076c3 != null) {
            String buss = status.getBuss();
            AbstractC5868k.m23670b(buss, "status.buss");
            c7076c3.m27269i(buss);
        }
        C7076c c7076c4 = this.f28205y;
        if (c7076c4 != null) {
            String media = status.getMedia();
            AbstractC5868k.m23670b(media, "status.media");
            c7076c4.m27274n(media);
        }
        C7076c c7076c5 = this.f28205y;
        if (c7076c5 != null) {
            String play_url = status.getPlay_url();
            AbstractC5868k.m23670b(play_url, "status.play_url");
            c7076c5.m27275o(play_url);
        }
        C7076c c7076c6 = this.f28205y;
        if (c7076c6 != null) {
            c7076c6.m27273m(status.getLinks());
        }
        C7076c c7076c7 = this.f28205y;
        if (c7076c7 != null) {
            c7076c7.m27272l(status.getLatency());
        }
        C7703f c7703f = this.f28206z;
        if (c7703f != null) {
            String snapinfo_url = status.getSnapinfo_url();
            AbstractC5868k.m23670b(snapinfo_url, "status.snapinfo_url");
            c7703f.m29705J(snapinfo_url);
        }
        C7703f c7703f2 = this.f28206z;
        if (c7703f2 != null) {
            String play_url2 = status.getPlay_url();
            AbstractC5868k.m23670b(play_url2, "status.play_url");
            c7703f2.m29698C(play_url2);
        }
        C7703f c7703f3 = this.f28206z;
        if (c7703f3 != null) {
            String format = status.getFormat();
            AbstractC5868k.m23670b(format, "status.format");
            c7703f3.m29730x(format);
        }
        C7703f c7703f4 = this.f28206z;
        if (c7703f4 != null) {
            c7703f4.m29727u(status.getMedia_buffer());
        }
        String play_url3 = status.getPlay_url();
        AbstractC5868k.m23670b(play_url3, "status.play_url");
        m27729p = AbstractC7166t.m27729p(play_url3, "mem://", true);
        if (m27729p) {
            C7703f c7703f5 = this.f28206z;
            if (c7703f5 != null) {
                c7703f5.m29731y(1);
                return;
            }
            return;
        }
        C7703f c7703f6 = this.f28206z;
        if (c7703f6 != null) {
            c7703f6.m29731y(0);
        }
    }

    /* renamed from: z0 */
    public final int m29691z0(String str) {
        AbstractC5868k.m23675g(str, SerializableCookie.NAME);
        C7703f c7703f = this.f28206z;
        if (c7703f != null && c7703f.m29721o()) {
            Log.d(this.f28181a, "resume from beginning");
            m29665B0(str, 0L);
        }
        this.f28182b = false;
        this.f28185e = false;
        m29609N0(3);
        if (m29645n0()) {
            C7703f c7703f2 = this.f28206z;
            if (c7703f2 != null && !c7703f2.m29722p()) {
                NativeJni.m13097c().m13110p(this.f28195o, str);
            }
            IMediaPlayer iMediaPlayer = this.f28194n;
            if (iMediaPlayer != null && !iMediaPlayer.isPlaying()) {
                try {
                    IMediaPlayer iMediaPlayer2 = this.f28194n;
                    if (iMediaPlayer2 != null) {
                        iMediaPlayer2.start();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                NativeJni.m13097c().m13106l(this.f28195o, "start", "", 0);
                this.f28183c = false;
                C7703f c7703f3 = this.f28206z;
                if (c7703f3 != null) {
                    c7703f3.m29729w(false);
                }
                m29598E0(3);
                m29615R0();
            }
            return 0;
        }
        return -1;
    }
}
