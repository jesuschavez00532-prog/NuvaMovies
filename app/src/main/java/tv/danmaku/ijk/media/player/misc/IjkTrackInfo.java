package tv.danmaku.ijk.media.player.misc;

import android.text.TextUtils;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes3.dex */
public class IjkTrackInfo implements ITrackInfo {
    private IjkMediaMeta.IjkStreamMeta mStreamMeta;
    private int mTrackType = 0;

    public IjkTrackInfo(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public IMediaFormat getFormat() {
        return new IjkMediaFormat(this.mStreamMeta);
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public String getInfoInline() {
        StringBuilder sb2 = new StringBuilder(128);
        int i10 = this.mTrackType;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        sb2.append("UNKNOWN");
                    } else {
                        sb2.append("SUBTITLE");
                    }
                } else {
                    sb2.append("TIMEDTEXT");
                    sb2.append(", ");
                    sb2.append(this.mStreamMeta.mLanguage);
                }
            } else {
                sb2.append("AUDIO");
                sb2.append(", ");
                sb2.append(this.mStreamMeta.getCodecShortNameInline());
                sb2.append(", ");
                sb2.append(this.mStreamMeta.getBitrateInline());
                sb2.append(", ");
                sb2.append(this.mStreamMeta.getSampleRateInline());
            }
        } else {
            sb2.append("VIDEO");
            sb2.append(", ");
            sb2.append(this.mStreamMeta.getCodecShortNameInline());
            sb2.append(", ");
            sb2.append(this.mStreamMeta.getBitrateInline());
            sb2.append(", ");
            sb2.append(this.mStreamMeta.getResolutionInline());
        }
        return sb2.toString();
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public String getLanguage() {
        IjkMediaMeta.IjkStreamMeta ijkStreamMeta = this.mStreamMeta;
        if (ijkStreamMeta != null && !TextUtils.isEmpty(ijkStreamMeta.mLanguage)) {
            return this.mStreamMeta.mLanguage;
        }
        return "und";
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public int getTrackType() {
        return this.mTrackType;
    }

    public void setMediaMeta(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    public void setTrackType(int i10) {
        this.mTrackType = i10;
    }

    public String toString() {
        return getClass().getSimpleName() + '{' + getInfoInline() + "}";
    }
}
