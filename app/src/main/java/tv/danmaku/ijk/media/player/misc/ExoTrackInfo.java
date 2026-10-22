package tv.danmaku.ijk.media.player.misc;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ExoTrackInfo implements ITrackInfo {
    private TrackGroup mTrackGroup;

    public ExoTrackInfo(TrackGroup trackGroup) {
        this.mTrackGroup = trackGroup;
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public IMediaFormat getFormat() {
        return null;
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public String getInfoInline() {
        return null;
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public String getLanguage() {
        if (this.mTrackGroup.getFormat(0).language != null) {
            return new Locale(this.mTrackGroup.getFormat(0).language).getISO3Language();
        }
        return this.mTrackGroup.getFormat(0).language;
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public int getTrackType() {
        String str = this.mTrackGroup.getFormat(0).sampleMimeType;
        if (MimeTypes.isVideo(str)) {
            return 1;
        }
        if (!MimeTypes.isAudio(str)) {
            return 0;
        }
        return 2;
    }

    public String toString() {
        return "ExoTrackInfo{mTrackGroup.Format=" + this.mTrackGroup.getFormat(0).toString() + '}';
    }
}
