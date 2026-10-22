package com.umeng.message.proguard;

import com.taobao.accs.common.Constants;
import com.umeng.message.proguard.InterfaceC3606bx;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.ck */
/* loaded from: classes3.dex */
public final class C3621ck {

    /* renamed from: a */
    public final InterfaceC3606bx.c f16165a;

    /* renamed from: b */
    public final JSONObject f16166b;

    /* renamed from: c */
    public String f16167c;

    /* renamed from: d */
    public final int f16168d;

    /* renamed from: e */
    public final boolean f16169e;

    /* renamed from: f */
    public int f16170f;

    /* renamed from: g */
    public int f16171g;

    /* renamed from: h */
    public int f16172h;

    /* renamed from: i */
    public long f16173i;

    /* renamed from: j */
    public long f16174j;

    /* renamed from: k */
    public long f16175k;

    /* renamed from: l */
    public long f16176l;

    /* renamed from: m */
    public float f16177m;

    /* renamed from: n */
    public float f16178n;

    /* renamed from: o */
    public float f16179o;

    /* renamed from: p */
    public float f16180p;

    /* renamed from: q */
    public float f16181q;

    /* renamed from: r */
    public float f16182r;

    /* renamed from: s */
    public float f16183s;

    /* renamed from: t */
    public float f16184t;

    public C3621ck(JSONObject jSONObject) {
        this.f16170f = -1;
        this.f16171g = -1;
        this.f16172h = -1;
        this.f16173i = -1L;
        this.f16174j = -1L;
        this.f16175k = -1L;
        this.f16176l = -1L;
        this.f16177m = -1.0f;
        this.f16178n = -1.0f;
        this.f16179o = -1.0f;
        this.f16180p = -1.0f;
        this.f16181q = -1.0f;
        this.f16182r = -1.0f;
        this.f16183s = -1.0f;
        this.f16184t = -1.0f;
        this.f16166b = jSONObject;
        this.f16168d = jSONObject.optInt(Constants.KEY_HTTP_CODE, -1);
        this.f16165a = C3602bt.m15448a(this);
        int m15446a = C3601bs.m15446a(m15521a());
        boolean z10 = false;
        if (m15446a != 0) {
            if (m15446a == C3601bs.f16096e || m15446a == C3601bs.f16097f) {
                z10 = true;
            }
        }
        this.f16169e = z10;
    }

    /* renamed from: a */
    public final int m15521a() {
        return this.f16166b.optInt("style", -1);
    }

    /* renamed from: b */
    public final String m15522b() {
        return this.f16166b.optString("image");
    }

    /* renamed from: c */
    public final String m15523c() {
        return this.f16166b.optString("sid");
    }

    /* renamed from: d */
    public final String m15524d() {
        return this.f16166b.optString("title");
    }

    /* renamed from: e */
    public final String m15525e() {
        return this.f16166b.optString("content");
    }

    /* renamed from: f */
    public final boolean m15526f() {
        if (this.f16166b.optInt("ic", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m15527g() {
        if (this.f16166b.optInt("h5_in_app", 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int m15528h() {
        return Math.max(5000, this.f16166b.optInt("imp_jg", 5000));
    }

    /* renamed from: i */
    public final long m15529i() {
        return this.f16166b.optLong("exposed_duration", -1L);
    }

    /* renamed from: j */
    public final String m15530j() {
        return this.f16166b.optString("pkg_name");
    }

    /* renamed from: k */
    public final int m15531k() {
        return this.f16166b.optInt("after_clk");
    }

    /* renamed from: l */
    public final String m15532l() {
        return this.f16166b.optString("v_url");
    }

    public C3621ck(InterfaceC3606bx.c cVar, String str) {
        this.f16170f = -1;
        this.f16171g = -1;
        this.f16172h = -1;
        this.f16173i = -1L;
        this.f16174j = -1L;
        this.f16175k = -1L;
        this.f16176l = -1L;
        this.f16177m = -1.0f;
        this.f16178n = -1.0f;
        this.f16179o = -1.0f;
        this.f16180p = -1.0f;
        this.f16181q = -1.0f;
        this.f16182r = -1.0f;
        this.f16183s = -1.0f;
        this.f16184t = -1.0f;
        this.f16166b = new JSONObject();
        this.f16165a = cVar;
        this.f16168d = -1;
        this.f16167c = str;
        this.f16169e = false;
    }
}
