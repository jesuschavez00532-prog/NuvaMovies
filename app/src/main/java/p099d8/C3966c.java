package p099d8;

import com.request.bean.EpgProgram;
import java.util.List;
import p373w.InterfaceC7339d;

/* renamed from: d8.c */
/* loaded from: classes2.dex */
public class C3966c implements InterfaceC7339d {

    /* renamed from: c */
    private static C3966c f17665c = new C3966c(1008);

    /* renamed from: a */
    private EpgProgram[] f17666a;

    /* renamed from: b */
    private int f17667b;

    public C3966c(int i10) {
        if (i10 > 0) {
            this.f17666a = new EpgProgram[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: d */
    private boolean m16825d(EpgProgram epgProgram) {
        for (int i10 = 0; i10 < this.f17667b; i10++) {
            if (this.f17666a[i10] == epgProgram) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static EpgProgram m16826e() {
        EpgProgram mo16818b = f17665c.mo16818b();
        if (mo16818b == null) {
            return new EpgProgram();
        }
        return mo16818b;
    }

    /* renamed from: h */
    public static void m16827h() {
        f17665c.m16832g();
        f17665c = null;
    }

    /* renamed from: i */
    private static void m16828i(EpgProgram epgProgram) {
        epgProgram.setContentId(null);
        epgProgram.setProgramName(null);
        epgProgram.setStartTime(null);
        epgProgram.setEndTime(null);
        epgProgram.setRemark(null);
        epgProgram.setType(null);
        epgProgram.setDesc(null);
        epgProgram.setFlag(0);
        epgProgram.setDate("");
        epgProgram.setStart("");
        epgProgram.setStop("");
        f17665c.mo16817a(epgProgram);
    }

    /* renamed from: j */
    public static void m16829j(List list) {
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                m16828i((EpgProgram) list.get(i10));
            }
        }
    }

    @Override // p373w.InterfaceC7339d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public EpgProgram mo16818b() {
        int i10 = this.f17667b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        EpgProgram[] epgProgramArr = this.f17666a;
        EpgProgram epgProgram = epgProgramArr[i11];
        epgProgramArr[i11] = null;
        this.f17667b = i10 - 1;
        return epgProgram;
    }

    @Override // p373w.InterfaceC7339d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo16817a(EpgProgram epgProgram) {
        if (!m16825d(epgProgram)) {
            int i10 = this.f17667b;
            EpgProgram[] epgProgramArr = this.f17666a;
            if (i10 < epgProgramArr.length) {
                epgProgramArr[i10] = epgProgram;
                this.f17667b = i10 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: g */
    public void m16832g() {
        while (true) {
            int i10 = this.f17667b;
            if (i10 > 0) {
                this.f17666a[i10 - 1] = null;
                this.f17667b = i10 - 1;
            } else {
                this.f17666a = null;
                return;
            }
        }
    }
}
