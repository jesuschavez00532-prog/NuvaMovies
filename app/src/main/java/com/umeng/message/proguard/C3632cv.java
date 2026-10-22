package com.umeng.message.proguard;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.umeng.message.proguard.InterfaceC3606bx;

/* renamed from: com.umeng.message.proguard.cv */
/* loaded from: classes3.dex */
public final class C3632cv implements InterfaceC3606bx.f {

    /* renamed from: a */
    public Uri f16253a;

    /* renamed from: b */
    public SurfaceHolder f16254b;

    /* renamed from: c */
    int f16255c;

    /* renamed from: d */
    public boolean f16256d;

    /* renamed from: e */
    public boolean f16257e;

    /* renamed from: f */
    public boolean f16258f;

    /* renamed from: g */
    public int f16259g;

    /* renamed from: h */
    public boolean f16260h;

    /* renamed from: i */
    public long f16261i;

    /* renamed from: j */
    public int f16262j;

    /* renamed from: k */
    public int f16263k;

    /* renamed from: l */
    public InterfaceC3606bx.e f16264l;

    /* renamed from: m */
    private MediaPlayer f16265m;

    /* renamed from: n */
    private boolean f16266n;

    /* renamed from: o */
    private boolean f16267o;

    /* renamed from: p */
    private boolean f16268p;

    /* renamed from: q */
    private long f16269q;

    /* renamed from: d */
    private void m15578d(int i10) {
        MediaPlayer mediaPlayer = this.f16265m;
        if (mediaPlayer != null) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(i10, 3);
                } else {
                    mediaPlayer.seekTo(i10);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    private void m15579f() {
        MediaPlayer mediaPlayer = this.f16265m;
        if (mediaPlayer != null) {
            try {
                if (this.f16256d) {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                } else {
                    mediaPlayer.setVolume(1.0f, 1.0f);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    private void m15580g() {
        if (this.f16253a == null) {
            C3615ce.m15509a("VideoPlayer", "init uri null!");
            return;
        }
        SurfaceHolder surfaceHolder = this.f16254b;
        if (surfaceHolder == null) {
            C3615ce.m15509a("VideoPlayer", "init surfaceHolder null!");
            this.f16268p = true;
            return;
        }
        try {
            Surface surface = surfaceHolder.getSurface();
            if (!surface.isValid()) {
                C3615ce.m15509a("VideoPlayer", "init surface not valid!");
                this.f16268p = true;
                return;
            }
            MediaPlayer mediaPlayer = this.f16265m;
            if (mediaPlayer == null) {
                this.f16265m = new MediaPlayer();
            } else {
                mediaPlayer.reset();
            }
            this.f16265m.setAudioStreamType(3);
            this.f16265m.setDataSource(this.f16253a.getPath());
            m15579f();
            this.f16265m.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.umeng.message.proguard.cv.2
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer2, int i10, int i11) {
                    C3615ce.m15509a("VideoPlayer", "onInfo what:" + i10 + " extra:" + i11);
                    return false;
                }
            });
            this.f16265m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.umeng.message.proguard.cv.3
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    try {
                        InterfaceC3606bx.e eVar = C3632cv.this.f16264l;
                        if (eVar != null) {
                            eVar.mo15463d();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    try {
                        C3632cv c3632cv = C3632cv.this;
                        int i10 = c3632cv.f16259g;
                        c3632cv.f16255c = i10;
                        c3632cv.m15588c(i10);
                        C3632cv c3632cv2 = C3632cv.this;
                        c3632cv2.f16255c = 0;
                        if (c3632cv2.f16257e) {
                            mediaPlayer2.start();
                            C3632cv c3632cv3 = C3632cv.this;
                            c3632cv3.m15584b(c3632cv3.f16255c);
                            return;
                        }
                        mediaPlayer2.seekTo(0);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            });
            this.f16265m.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.umeng.message.proguard.cv.4
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                    C3615ce.m15512d("VideoPlayer", "onError what:" + i10 + " extra:" + i11);
                    try {
                        C3632cv.this.m15583a(false);
                        InterfaceC3606bx.e eVar = C3632cv.this.f16264l;
                        if (eVar != null) {
                            eVar.mo15460a("media player error, what:" + i10 + " extra:" + i11);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    return false;
                }
            });
            this.f16265m.setVideoScalingMode(1);
            this.f16265m.setSurface(surface);
            this.f16265m.setScreenOnWhilePlaying(true);
            this.f16265m.setLooping(false);
            this.f16265m.setOnPreparedListener(null);
            this.f16265m.prepare();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void m15581a() {
        try {
            m15580g();
            if (this.f16265m != null) {
                m15578d(this.f16255c);
                C3615ce.m15509a("VideoPlayer", "preview position:" + this.f16255c);
                if (this.f16268p) {
                    m15587c();
                    this.f16268p = false;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public final synchronized boolean m15586b() {
        if (!this.f16266n) {
            m15587c();
        }
        return !this.f16266n;
    }

    /* renamed from: c */
    public final synchronized void m15587c() {
        MediaPlayer mediaPlayer;
        try {
            if (!this.f16267o && this.f16266n && (mediaPlayer = this.f16265m) != null && !mediaPlayer.isPlaying()) {
                this.f16265m.start();
                this.f16266n = false;
                this.f16255c = this.f16265m.getCurrentPosition();
                C3615ce.m15509a("VideoPlayer", "start position:" + this.f16255c);
                m15584b(this.f16255c);
                InterfaceC3606bx.e eVar = this.f16264l;
                if (eVar != null) {
                    eVar.mo15461b();
                }
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            MediaPlayer mediaPlayer2 = this.f16265m;
            if (mediaPlayer2 == null || !mediaPlayer2.isPlaying()) {
                m15580g();
                if (this.f16265m != null) {
                    m15578d(this.f16255c);
                    C3615ce.m15509a("VideoPlayer", "start position:" + this.f16255c);
                    this.f16265m.start();
                    m15584b(this.f16255c);
                    InterfaceC3606bx.e eVar2 = this.f16264l;
                    if (eVar2 != null) {
                        eVar2.mo15461b();
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
            } finally {
                this.f16267o = false;
            }
        }
    }

    /* renamed from: e */
    public final int m15590e() {
        MediaPlayer mediaPlayer = this.f16265m;
        if (mediaPlayer != null) {
            try {
                this.f16255c = mediaPlayer.getCurrentPosition();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.f16255c;
    }

    /* renamed from: b */
    public final void m15585b(boolean z10) {
        this.f16256d = z10;
        m15579f();
    }

    /* renamed from: b */
    protected final synchronized void m15584b(int i10) {
        this.f16260h = true;
        this.f16269q = i10;
    }

    /* renamed from: d */
    public final boolean m15589d() {
        MediaPlayer mediaPlayer = this.f16265m;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            return mediaPlayer.isPlaying();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized void m15583a(boolean z10) {
        try {
            if (this.f16265m != null) {
                m15577c(z10);
                this.f16265m.release();
            }
        } finally {
            try {
                this.f16267o = false;
                this.f16266n = false;
            } finally {
            }
        }
        this.f16267o = false;
        this.f16266n = false;
    }

    /* renamed from: a */
    public final synchronized void m15582a(int i10) {
        if (m15589d()) {
            m15588c(i10);
            m15584b(i10);
        }
    }

    /* renamed from: c */
    private synchronized void m15577c(boolean z10) {
        InterfaceC3606bx.e eVar;
        this.f16267o = true;
        MediaPlayer mediaPlayer = this.f16265m;
        if (mediaPlayer != null) {
            try {
                this.f16255c = mediaPlayer.getCurrentPosition();
                mediaPlayer.stop();
                C3615ce.m15509a("VideoPlayer", "stop position:" + this.f16255c);
                m15588c(this.f16255c);
                if (!this.f16266n && z10 && (eVar = this.f16264l) != null) {
                    eVar.mo15462c();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    protected final synchronized void m15588c(int i10) {
        long j10 = this.f16269q;
        if (j10 >= 0) {
            this.f16261i += i10 - j10;
        }
        this.f16269q = -1L;
    }
}
