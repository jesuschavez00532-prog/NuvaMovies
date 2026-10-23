package p421z0;

import android.text.TextUtils;
import com.bigbee.bean.body.CustomizeBodyBean;
import com.bigbee.bean.body.EventBodyBean;
import com.bigbee.bean.body.KeyValueBean;
import com.bigbee.p049db.EventDbModel;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ne.AbstractC5868k;
import p123f1.C4209a;
import p123f1.C4212d;
import p123f1.C4216h;

/* renamed from: z0.d */
/* loaded from: classes.dex */
public final class C7730d {

    /* renamed from: a */
    public static final C7730d f28438a = new C7730d();

    /* renamed from: b */
    private static final String f28439b = C7730d.class.getSimpleName();

    /* renamed from: c */
    private static final Gson f28440c = new Gson();

    /* renamed from: z0.d$a */
    /* loaded from: classes.dex */
    public static final class a implements C4212d.c {

        /* renamed from: a */
        final /* synthetic */ long f28441a;

        /* renamed from: b */
        final /* synthetic */ long f28442b;

        /* renamed from: c */
        final /* synthetic */ String f28443c;

        /* renamed from: d */
        final /* synthetic */ HashMap f28444d;

        /* renamed from: e */
        final /* synthetic */ boolean f28445e;

        a(long j10, long j11, String str, HashMap hashMap, boolean z10) {
            this.f28441a = j10;
            this.f28442b = j11;
            this.f28443c = str;
            this.f28444d = hashMap;
            this.f28445e = z10;
        }

        @Override // p123f1.C4212d.c
        /* renamed from: a */
        public void mo17607a() {
            long j10;
            C4216h c4216h = C4216h.f18482a;
            long m17618a = c4216h.m17618a();
            long j11 = this.f28441a;
            C4209a c4209a = C4209a.f18456a;
            long m17589g = m17618a + (j11 - c4209a.m17589g());
            if (this.f28442b > 0) {
                j10 = c4216h.m17618a() + (this.f28442b - c4209a.m17589g());
            } else {
                j10 = m17589g;
            }
            C7737k c7737k = C7737k.f28482a;
            if (!TextUtils.isEmpty(c7737k.m29914a().getUserName())) {
                HashMap hashMap = this.f28444d;
                String userName = c7737k.m29914a().getUserName();
                if (userName == null) {
                    userName = "";
                }
                hashMap.put("uname", userName);
            }
            C7734h.f28449q.m29905a().m29901w(C7730d.f28438a.m29864c(this.f28443c, this.f28444d, m17589g, j10, this.f28445e));
        }
    }

    private C7730d() {
    }

    /* renamed from: b */
    public static /* synthetic */ void m29861b(C7730d c7730d, String str, HashMap hashMap, long j10, long j11, boolean z10, boolean z11, int i10, Object obj) {
        long j12;
        boolean z12 = false;
        boolean z13 = false;
        if ((i10 & 8) != 0) {
            j12 = 0;
        } else {
            j12 = j11;
        }
        if ((i10 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i10 & 32) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        c7730d.m29863a(str, hashMap, j10, j12, z12, z13);
    }

    /* renamed from: d */
    public static /* synthetic */ EventDbModel m29862d(C7730d c7730d, String str, HashMap hashMap, long j10, long j11, boolean z10, int i10, Object obj) {
        long j12;
        boolean z11 = false;
        if ((i10 & 8) != 0) {
            j12 = 0;
        } else {
            j12 = j11;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        return c7730d.m29864c(str, hashMap, j10, j12, z11);
    }

    /* renamed from: a */
    public final synchronized void m29863a(String str, HashMap hashMap, long j10, long j11, boolean z10, boolean z11) {
        boolean z12 = false;
        AbstractC5868k.m23674f(str, "eventId");
        AbstractC5868k.m23674f(hashMap, "parameters");
        if (str.length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            C4212d.f18470c.m17606a().m17604f(new a(j10, j11, str, hashMap, z10));
        }
    }

    /* renamed from: c */
    public final EventDbModel m29864c(String str, HashMap hashMap, long j10, long j11, boolean z10) {
        AbstractC5868k.m23674f(hashMap, "parameters");
        CustomizeBodyBean customizeBodyBean = new CustomizeBodyBean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (!hashMap.isEmpty()) {
            for (String str2 : hashMap.keySet()) {
                if (hashMap.get(str2) != null) {
                    copyOnWriteArrayList.add(new KeyValueBean(str2, hashMap.get(str2)));
                }
            }
        }
        C7737k c7737k = C7737k.f28482a;
        if (!TextUtils.isEmpty(c7737k.m29914a().getUserId())) {
            copyOnWriteArrayList.add(new KeyValueBean("uid", c7737k.m29914a().getUserId()));
        }
        if (!copyOnWriteArrayList.isEmpty()) {
            customizeBodyBean.setParameter(copyOnWriteArrayList);
        }
        EventDbModel eventDbModel = new EventDbModel();
        eventDbModel.notIntactEvent = z10;
        String json = f28440c.toJson(customizeBodyBean);
        AbstractC5868k.m23673e(json, "eventGson.toJson(mCustomKeyValueBean)");
        EventDbModel transportEventDbModel = new EventBodyBean(c7737k.m29914a().getAppVer(), c7737k.m29914a().getSysVer(), j10, str, json, j11, c7737k.m29914a().getRangerVer()).transportEventDbModel(eventDbModel);
        AbstractC5868k.m23673e(transportEventDbModel, "mEventBodyBean.transportEventDbModel(eventDbModel)");
        return transportEventDbModel;
    }
}
