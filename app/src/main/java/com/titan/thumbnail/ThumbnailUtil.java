package com.titan.thumbnail;

import android.net.Uri;
import android.text.TextUtils;
import be.C1318n;
import be.C1325u;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ne.AbstractC5868k;
import p359ue.AbstractC7167u;

/* loaded from: classes3.dex */
public final class ThumbnailUtil {
    private static final String SnapShotUrl = "%1$s/snapshot/v1/%2$s?offset_in_zip=%3$d&source_url=%4$s";
    private static CombineData mCurrentCombine;
    private static int mHorizontalCount;
    private static ThumbnailResult mThumbnailResult;
    private static int mVerticalCount;
    public static final ThumbnailUtil INSTANCE = new ThumbnailUtil();
    private static final String TAG = ThumbnailUtil.class.getSimpleName();
    private static String mSnapInfoUrl = "";
    private static ArrayList<CombineData> mCombineList = new ArrayList<>();
    private static String mSnapShotHost = "";
    private static String mSourceUrl = "";

    private ThumbnailUtil() {
    }

    private final CombineData getCombine(long j10) {
        List<CombineData> combines;
        CombineData combineData = mCurrentCombine;
        if (combineData != null) {
            if (combineData == null) {
                AbstractC5868k.m23682n();
            }
            long startMoment = combineData.getStartMoment();
            CombineData combineData2 = mCurrentCombine;
            if (combineData2 == null) {
                AbstractC5868k.m23682n();
            }
            long endMoment = combineData2.getEndMoment();
            if (startMoment <= j10 && endMoment >= j10) {
                return mCurrentCombine;
            }
        }
        ThumbnailResult thumbnailResult = mThumbnailResult;
        CombineData combineData3 = null;
        if (thumbnailResult != null && (combines = thumbnailResult.getCombines()) != null) {
            for (CombineData combineData4 : combines) {
                long startMoment2 = combineData4.getStartMoment();
                long endMoment2 = combineData4.getEndMoment();
                if (startMoment2 <= j10 && endMoment2 >= j10) {
                    combineData3 = combineData4;
                }
            }
        }
        mCurrentCombine = combineData3;
        return combineData3;
    }

    private final String getHost(String str) {
        boolean m27763v;
        boolean m27763v2;
        int m27735E;
        int m27734D;
        try {
            if (!TextUtils.isEmpty(str)) {
                m27763v = AbstractC7167u.m27763v(str, "//", false, 2, null);
                if (m27763v) {
                    m27763v2 = AbstractC7167u.m27763v(str, Operator.Operation.DIVISION, false, 2, null);
                    if (m27763v2) {
                        m27735E = AbstractC7167u.m27735E(str, "//", 0, false, 6, null);
                        m27734D = AbstractC7167u.m27734D(str, '/', m27735E + 2, false, 4, null);
                        if (str != null) {
                            String substring = str.substring(0, m27734D);
                            AbstractC5868k.m23670b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            return substring;
                        }
                        throw new C1325u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private final int searchSnapshot(long j10, List<Snapshot> list) {
        long moment;
        int size = list.size() - 1;
        if (size <= 0) {
            return -1;
        }
        int i10 = (size + 0) / 2;
        int i11 = 0;
        while (i11 <= size) {
            i10 = (i11 + size) / 2;
            int i12 = i10 + 1;
            if (i12 < list.size()) {
                moment = list.get(i12).getMoment();
            } else {
                moment = list.get(i10).getMoment() + 5000;
            }
            if (j10 < list.get(i10).getMoment()) {
                size = i10 - 1;
            } else if (j10 > moment) {
                i11 = i12;
            } else {
                return i10;
            }
        }
        if (i10 >= list.size() - 1) {
            return list.size() - 1;
        }
        return i10;
    }

    public final ArrayList<CombineData> getCombineList() {
        return mCombineList;
    }

    public final String getCombineUrl(long j10) {
        CombineData combine = getCombine(j10);
        if (combine != null) {
            String format = String.format(SnapShotUrl, Arrays.copyOf(new Object[]{mSnapShotHost, combine.getName(), Long.valueOf(combine.getOffset()), Uri.encode(mSourceUrl)}, 4));
            AbstractC5868k.m23670b(format, "java.lang.String.format(this, *args)");
            if (format != null) {
                return format;
            }
        }
        return "";
    }

    public final CombineData getCurrentCombine() {
        return mCurrentCombine;
    }

    public final int getMHorizontalCount() {
        return mHorizontalCount;
    }

    public final int getMVerticalCount() {
        return mVerticalCount;
    }

    public final C1318n getSnapshotPosition(long j10) {
        List<Snapshot> snapshots;
        int searchSnapshot;
        CombineData combine = getCombine(j10);
        if (combine != null && (snapshots = combine.getSnapshots()) != null && (searchSnapshot = INSTANCE.searchSnapshot(j10, snapshots)) != -1) {
            int i10 = mHorizontalCount;
            int i11 = searchSnapshot % i10;
            double d10 = searchSnapshot / i10;
            Double.isNaN(d10);
            return new C1318n(Integer.valueOf(i11), Integer.valueOf((int) (d10 + 0.5d)));
        }
        return new C1318n(-1, -1);
    }

    public final boolean hasThumbnail() {
        if (mThumbnailResult != null) {
            return true;
        }
        return false;
    }

    public final void reset() {
        mThumbnailResult = null;
        mCombineList.clear();
        mCurrentCombine = null;
        mSnapShotHost = "";
        mSourceUrl = "";
    }

    public final void setData(ThumbnailResult thumbnailResult) {
        AbstractC5868k.m23675g(thumbnailResult, "thumbnailResult");
        mThumbnailResult = thumbnailResult;
        mCombineList.clear();
        ThumbnailResult thumbnailResult2 = mThumbnailResult;
        if (thumbnailResult2 == null) {
            AbstractC5868k.m23682n();
        }
        mHorizontalCount = thumbnailResult2.getCombine_wn();
        ThumbnailResult thumbnailResult3 = mThumbnailResult;
        if (thumbnailResult3 == null) {
            AbstractC5868k.m23682n();
        }
        mVerticalCount = thumbnailResult3.getCombine_hn();
        ThumbnailResult thumbnailResult4 = mThumbnailResult;
        if (thumbnailResult4 == null) {
            AbstractC5868k.m23682n();
        }
        String source_url = thumbnailResult4.getSource_url();
        String str = "";
        if (source_url == null) {
            source_url = "";
        }
        mSourceUrl = source_url;
        ThumbnailResult thumbnailResult5 = mThumbnailResult;
        if (thumbnailResult5 == null) {
            AbstractC5868k.m23682n();
        }
        String source_url2 = thumbnailResult5.getSource_url();
        if (source_url2 != null) {
            str = source_url2;
        }
        mSnapShotHost = getHost(str);
        ThumbnailResult thumbnailResult6 = mThumbnailResult;
        if (thumbnailResult6 == null) {
            AbstractC5868k.m23682n();
        }
        List<CombineData> combines = thumbnailResult6.getCombines();
        if (combines != null) {
            for (CombineData combineData : combines) {
                if (combineData.getSnapshots() != null) {
                    if (combineData.getSnapshots() == null) {
                        AbstractC5868k.m23682n();
                    }
                    if (!r2.isEmpty()) {
                        List<Snapshot> snapshots = combineData.getSnapshots();
                        if (snapshots == null) {
                            AbstractC5868k.m23682n();
                        }
                        combineData.setStartMoment(snapshots.get(0).getMoment());
                        List<Snapshot> snapshots2 = combineData.getSnapshots();
                        if (snapshots2 == null) {
                            AbstractC5868k.m23682n();
                        }
                        if (combineData.getSnapshots() == null) {
                            AbstractC5868k.m23682n();
                        }
                        combineData.setEndMoment(snapshots2.get(r3.size() - 1).getMoment() + 5000);
                    }
                }
            }
            mCombineList.addAll(combines);
        }
    }

    public final void setMHorizontalCount(int i10) {
        mHorizontalCount = i10;
    }

    public final void setMVerticalCount(int i10) {
        mVerticalCount = i10;
    }

    public final void setSnapInfoUrl(String str) {
        boolean z10;
        AbstractC5868k.m23675g(str, "url");
        mSnapInfoUrl = str;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            reset();
        }
    }

    public final String getCombineUrl(CombineData combineData) {
        AbstractC5868k.m23675g(combineData, "combine");
        String format = String.format(SnapShotUrl, Arrays.copyOf(new Object[]{mSnapShotHost, combineData.getName(), Long.valueOf(combineData.getOffset()), Uri.encode(mSourceUrl)}, 4));
        AbstractC5868k.m23670b(format, "java.lang.String.format(this, *args)");
        return format;
    }
}
