package com.request.result;

import com.lzy.okgo.cookie.SerializableCookie;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class HomeData {
    private static final int TYPE_RCM = 0;
    private String alias;
    private List<AssetList> assetList;
    private String code;
    private int columnId;
    private ArrayList<ChildColumn> columnList;
    private ArrayList<Channel> liveList;
    private ArrayList<Match> matchList;
    private String name;
    private ArrayList<RecommendList> rcmList;
    private int viewType;
    public static final Companion Companion = new Companion(null);
    private static final int TYPE_ITEM = 1;
    private static final int TYPE_COLUMN = 2;
    private static final int TYPE_MATCH = 3;
    private static final int TYPE_LIVE_STREAM = 4;
    private static final int TYPE_BACK_TOP = 5;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC5864g abstractC5864g) {
            this();
        }

        public final int getTYPE_BACK_TOP() {
            return HomeData.TYPE_BACK_TOP;
        }

        public final int getTYPE_COLUMN() {
            return HomeData.TYPE_COLUMN;
        }

        public final int getTYPE_ITEM() {
            return HomeData.TYPE_ITEM;
        }

        public final int getTYPE_LIVE_STREAM() {
            return HomeData.TYPE_LIVE_STREAM;
        }

        public final int getTYPE_MATCH() {
            return HomeData.TYPE_MATCH;
        }

        public final int getTYPE_RCM() {
            return HomeData.TYPE_RCM;
        }
    }

    public HomeData(int i10, String str, String str2, String str3, List<AssetList> list) {
        AbstractC5868k.m23674f(str, Constants.KEY_HTTP_CODE);
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str3, "alias");
        AbstractC5868k.m23674f(list, "assetList");
        this.columnId = i10;
        this.code = str;
        this.name = str2;
        this.alias = str3;
        this.assetList = list;
        this.viewType = TYPE_ITEM;
        this.rcmList = new ArrayList<>();
        this.columnList = new ArrayList<>();
        this.matchList = new ArrayList<>();
        this.liveList = new ArrayList<>();
    }

    public static /* synthetic */ HomeData copy$default(HomeData homeData, int i10, String str, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = homeData.columnId;
        }
        if ((i11 & 2) != 0) {
            str = homeData.code;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = homeData.name;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = homeData.alias;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            list = homeData.assetList;
        }
        return homeData.copy(i10, str4, str5, str6, list);
    }

    public final int component1() {
        return this.columnId;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.alias;
    }

    public final List<AssetList> component5() {
        return this.assetList;
    }

    public final HomeData copy(int i10, String str, String str2, String str3, List<AssetList> list) {
        AbstractC5868k.m23674f(str, Constants.KEY_HTTP_CODE);
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str3, "alias");
        AbstractC5868k.m23674f(list, "assetList");
        return new HomeData(i10, str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeData)) {
            return false;
        }
        HomeData homeData = (HomeData) obj;
        return this.columnId == homeData.columnId && AbstractC5868k.m23669a(this.code, homeData.code) && AbstractC5868k.m23669a(this.name, homeData.name) && AbstractC5868k.m23669a(this.alias, homeData.alias) && AbstractC5868k.m23669a(this.assetList, homeData.assetList);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final List<AssetList> getAssetList() {
        return this.assetList;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getColumnId() {
        return this.columnId;
    }

    public final ArrayList<ChildColumn> getColumnList() {
        return this.columnList;
    }

    public final ArrayList<Channel> getLiveList() {
        return this.liveList;
    }

    public final ArrayList<Match> getMatchList() {
        return this.matchList;
    }

    public final String getName() {
        return this.name;
    }

    public final ArrayList<RecommendList> getRcmList() {
        return this.rcmList;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return (((((((this.columnId * 31) + this.code.hashCode()) * 31) + this.name.hashCode()) * 31) + this.alias.hashCode()) * 31) + this.assetList.hashCode();
    }

    public final void setAlias(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.alias = str;
    }

    public final void setAssetList(List<AssetList> list) {
        AbstractC5868k.m23674f(list, "<set-?>");
        this.assetList = list;
    }

    public final void setCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.code = str;
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
    }

    public final void setColumnList(ArrayList<ChildColumn> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.columnList = arrayList;
    }

    public final void setLiveList(ArrayList<Channel> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.liveList = arrayList;
    }

    public final void setMatchList(ArrayList<Match> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.matchList = arrayList;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setRcmList(ArrayList<RecommendList> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.rcmList = arrayList;
    }

    public final void setViewType(int i10) {
        this.viewType = i10;
    }

    public String toString() {
        return "HomeData(columnId=" + this.columnId + ", code=" + this.code + ", name=" + this.name + ", alias=" + this.alias + ", assetList=" + this.assetList + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeData(int i10, ArrayList<RecommendList> arrayList) {
        this(-1, "", "", "", new ArrayList());
        AbstractC5868k.m23674f(arrayList, "rcmList");
        this.viewType = i10;
        this.rcmList = arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeData(ArrayList<ChildColumn> arrayList) {
        this(-1, "", "", "", new ArrayList());
        AbstractC5868k.m23674f(arrayList, "columnList");
        this.viewType = TYPE_COLUMN;
        this.columnList = arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeData(int i10, List<Match> list) {
        this(-1, "", "", "", new ArrayList());
        AbstractC5868k.m23674f(list, "matchList");
        this.viewType = i10;
        this.matchList = (ArrayList) list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeData(List<Channel> list) {
        this(-1, "", "", "", new ArrayList());
        AbstractC5868k.m23674f(list, "liveList");
        this.viewType = TYPE_LIVE_STREAM;
        this.liveList = (ArrayList) list;
    }
}
