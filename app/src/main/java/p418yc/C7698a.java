package p418yc;

import android.text.TextUtils;
import ne.AbstractC5868k;
import p432zc.AbstractC7784d;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: yc.a */
/* loaded from: classes3.dex */
public final class C7698a {

    /* renamed from: a */
    public static final C7698a f28162a = new C7698a();

    private C7698a() {
    }

    /* renamed from: a */
    public final IMediaPlayer m29579a(String str, boolean z10, int i10, boolean z11, String str2) {
        AbstractC5868k.m23675g(str, "defaultLanguage");
        IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer();
        IjkMediaPlayer.native_setLogLevel(6);
        if (i10 == 1) {
            ijkMediaPlayer.setOption(4, "mediacodec", 1L);
            ijkMediaPlayer.setOption(4, "mediacodec-hevc", 1L);
        }
        ijkMediaPlayer.setOption(4, "overlay-format", "fcc-_es2");
        ijkMediaPlayer.setOption(4, "opensles", 0L);
        ijkMediaPlayer.setOption(1, "http-detect-range-support", 0L);
        ijkMediaPlayer.setOption(2, "skip_loop_filter", 48L);
        ijkMediaPlayer.setOption(4, "live-streaming", 1L);
        ijkMediaPlayer.setOption(4, "delay-optimization", 1L);
        ijkMediaPlayer.setOption(4, "start-on-prepared", 1L);
        ijkMediaPlayer.setOption(4, "timeout", 20000L);
        ijkMediaPlayer.setOption(4, "get-av-frame-timeout", 20000L);
        if (!TextUtils.isEmpty(str)) {
            ijkMediaPlayer.setOption(4, "audio_language", str);
        }
        ijkMediaPlayer.setOption(1, "flush_packets", 1L);
        ijkMediaPlayer.setOption(4, "framedrop", 1L);
        ijkMediaPlayer.setOption(4, "render-wait-start", 1L);
        ijkMediaPlayer.setOption(1, "reconnect", 1L);
        ijkMediaPlayer.setOption(1, "reconnect_delay_max", 5L);
        ijkMediaPlayer.setOption(1, "http_multiple", 0L);
        ijkMediaPlayer.setOption(4, "max-buffer-audio-tracks", 4L);
        if (z10) {
            ijkMediaPlayer.setOption(4, "live_mode", 1L);
        }
        if (z11) {
            ijkMediaPlayer.setOption(4, "avio", 1L);
            ijkMediaPlayer.setOption(4, "min-frames", 30L);
        }
        if (AbstractC7784d.m30153b(str2)) {
            ijkMediaPlayer.setOption(4, "iformat", str2);
        }
        return ijkMediaPlayer;
    }
}
