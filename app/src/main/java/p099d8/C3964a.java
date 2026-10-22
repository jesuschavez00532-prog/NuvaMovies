package p099d8;

import com.request.bean.ChannelEpg;
import p373w.InterfaceC7339d;

/* renamed from: d8.a */
/* loaded from: classes2.dex */
public class C3964a implements InterfaceC7339d {

    /* renamed from: c */
    private static C3964a f17662c = new C3964a(8);

    /* renamed from: a */
    private ChannelEpg[] f17663a;

    /* renamed from: b */
    private int f17664b;

    public C3964a(int i10) {
        if (i10 > 0) {
            this.f17663a = new ChannelEpg[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: d */
    private boolean m16813d(ChannelEpg channelEpg) {
        for (int i10 = 0; i10 < this.f17664b; i10++) {
            if (this.f17663a[i10] == channelEpg) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static ChannelEpg m16814e() {
        ChannelEpg mo16818b = f17662c.mo16818b();
        if (mo16818b == null) {
            return new ChannelEpg();
        }
        return mo16818b;
    }

    /* renamed from: h */
    public static void m16815h() {
        f17662c.m16821g();
        f17662c = null;
    }

    /* renamed from: i */
    public static void m16816i(ChannelEpg channelEpg) {
        channelEpg.setId(0);
        channelEpg.setChannelCode(null);
        channelEpg.setEpgJson(null);
        channelEpg.setEpgDate(null);
        channelEpg.setProgramList(null);
        f17662c.mo16817a(channelEpg);
    }

    @Override // p373w.InterfaceC7339d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ChannelEpg mo16818b() {
        int i10 = this.f17664b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        ChannelEpg[] channelEpgArr = this.f17663a;
        ChannelEpg channelEpg = channelEpgArr[i11];
        channelEpgArr[i11] = null;
        this.f17664b = i10 - 1;
        return channelEpg;
    }

    @Override // p373w.InterfaceC7339d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo16817a(ChannelEpg channelEpg) {
        if (!m16813d(channelEpg)) {
            int i10 = this.f17664b;
            ChannelEpg[] channelEpgArr = this.f17663a;
            if (i10 < channelEpgArr.length) {
                channelEpgArr[i10] = channelEpg;
                this.f17664b = i10 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: g */
    public void m16821g() {
        while (true) {
            int i10 = this.f17664b;
            if (i10 > 0) {
                this.f17663a[i10 - 1] = null;
                this.f17664b = i10 - 1;
            } else {
                this.f17663a = null;
                return;
            }
        }
    }
}
