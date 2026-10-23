package p040c8;

import android.text.TextUtils;
import com.request.result.Channel;
import com.request.result.ChildColumn;
import com.request.result.FavIdDataItem;
import com.request.result.FavoriteList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5868k;
import ne.AbstractC5882y;

/* renamed from: c8.w */
/* loaded from: classes2.dex */
public final class C1428w {

    /* renamed from: a */
    public static final C1428w f5539a = new C1428w();

    /* renamed from: b */
    private static int f5540b = 2;

    /* renamed from: c */
    private static final HashMap f5541c = new HashMap();

    /* renamed from: d */
    private static List f5542d;

    private C1428w() {
    }

    /* renamed from: a */
    public final void m6668a(FavIdDataItem favIdDataItem, String str) {
        if (favIdDataItem == null) {
            return;
        }
        FavoriteList favoriteList = new FavoriteList(favIdDataItem.getFavoriteId(), favIdDataItem.getContentId(), "", null, null, null, null, 0, 0, null, null, 0.0f, null, null, null, 0, 0, null, null, null, null, str, 2097144, null);
        HashMap hashMap = f5541c;
        if (((FavoriteList) hashMap.get(favIdDataItem.getContentId())) == null) {
            String contentId = favIdDataItem.getContentId();
            if (contentId == null) {
                contentId = "";
            }
            hashMap.put(contentId, favoriteList);
            if (f5542d == null) {
                f5542d = new ArrayList();
            }
            List list = f5542d;
            if (list != null) {
                list.add(0, favoriteList);
            }
        }
    }

    /* renamed from: b */
    public final void m6669b(String str) {
        FavoriteList favoriteList;
        List list;
        if (!TextUtils.isEmpty(str) && (favoriteList = (FavoriteList) AbstractC5882y.m23703c(f5541c).remove(str)) != null && (list = f5542d) != null) {
            list.remove(favoriteList);
        }
    }

    /* renamed from: c */
    public final FavoriteList m6670c(Channel channel) {
        if (channel != null) {
            HashMap hashMap = f5541c;
            if (hashMap.size() != 0) {
                return (FavoriteList) hashMap.get(channel.getChannelCode());
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    public final List m6671d() {
        List arrayList;
        List<FavoriteList> list;
        ArrayList arrayList2 = new ArrayList();
        C1407f c1407f = C1407f.f5458a;
        List m6515j = c1407f.m6515j(c1407f.m6523o());
        if (c1407f.m6524p() != null) {
            ChildColumn m6524p = c1407f.m6524p();
            AbstractC5868k.m23671c(m6524p);
            arrayList = c1407f.m6515j(m6524p.getId());
        } else {
            arrayList = new ArrayList();
        }
        if (m6515j != null && (list = f5542d) != null && arrayList != null && list != null) {
            for (FavoriteList favoriteList : list) {
                if (AbstractC5868k.m23669a(favoriteList.getSupportVideoType(), "av1")) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Channel channel = (Channel) it.next();
                            if (AbstractC5868k.m23669a(favoriteList.getContentId(), channel.getChannelCode())) {
                                channel.setFav(true);
                                arrayList2.add(channel);
                                break;
                            }
                        }
                    }
                } else {
                    Iterator it2 = m6515j.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Channel channel2 = (Channel) it2.next();
                            if (AbstractC5868k.m23669a(favoriteList.getContentId(), channel2.getChannelCode())) {
                                channel2.setFav(true);
                                arrayList2.add(channel2);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: e */
    public final int m6672e() {
        return f5540b;
    }

    /* renamed from: f */
    public final void m6673f(List list) {
        boolean z10 = false;
        if (f5541c.size() != 0 && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Channel channel = (Channel) it.next();
                if (((FavoriteList) f5541c.get(channel.getChannelCode())) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                channel.setFav(z10);
            }
        }
    }

    /* renamed from: g */
    public final boolean m6674g(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        HashMap hashMap = f5541c;
        if (hashMap.size() == 0 || hashMap.get(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void m6675h() {
        f5540b = 2;
        f5541c.clear();
        List list = f5542d;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: i */
    public final void m6676i(List list) {
        f5541c.clear();
        List<FavoriteList> list2 = f5542d;
        f5542d = list;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FavoriteList favoriteList = (FavoriteList) it.next();
                if (!TextUtils.isEmpty(favoriteList.getContentId())) {
                    HashMap hashMap = f5541c;
                    String contentId = favoriteList.getContentId();
                    AbstractC5868k.m23671c(contentId);
                    hashMap.put(contentId, favoriteList);
                }
            }
        }
        if (list2 != null) {
            for (FavoriteList favoriteList2 : list2) {
                HashMap hashMap2 = f5541c;
                if (((FavoriteList) hashMap2.get(favoriteList2.getContentId())) == null) {
                    List list3 = f5542d;
                    if (list3 != null) {
                        list3.add(favoriteList2);
                    }
                    String contentId2 = favoriteList2.getContentId();
                    AbstractC5868k.m23671c(contentId2);
                    hashMap2.put(contentId2, favoriteList2);
                }
            }
            list2.clear();
        }
    }

    /* renamed from: j */
    public final void m6677j(int i10) {
        f5540b = i10;
    }
}
