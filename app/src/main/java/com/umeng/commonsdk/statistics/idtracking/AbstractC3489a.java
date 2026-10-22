package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.proto.C3512a;
import com.umeng.commonsdk.statistics.proto.C3513b;
import com.umeng.commonsdk.statistics.proto.C3514c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.android.agoo.message.MessageService;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.a */
/* loaded from: classes3.dex */
public abstract class AbstractC3489a {

    /* renamed from: a */
    private final int f15446a = 10;

    /* renamed from: b */
    private final int f15447b = 100;

    /* renamed from: c */
    private final String f15448c;

    /* renamed from: d */
    private List<C3512a> f15449d;

    /* renamed from: e */
    private C3513b f15450e;

    public AbstractC3489a(String str) {
        this.f15448c = str;
    }

    /* renamed from: g */
    private boolean m14866g() {
        String m14979b;
        int m14987h;
        C3513b c3513b = this.f15450e;
        if (c3513b == null) {
            m14979b = null;
        } else {
            m14979b = c3513b.m14979b();
        }
        if (c3513b == null) {
            m14987h = 0;
        } else {
            m14987h = c3513b.m14987h();
        }
        String m14867a = m14867a(mo14876f());
        if (m14867a == null || m14867a.equals(m14979b)) {
            return false;
        }
        if (c3513b == null) {
            c3513b = new C3513b();
        }
        c3513b.m14976a(m14867a);
        c3513b.m14975a(System.currentTimeMillis());
        c3513b.m14974a(m14987h + 1);
        C3512a c3512a = new C3512a();
        c3512a.m14938a(this.f15448c);
        c3512a.m14943c(m14867a);
        c3512a.m14940b(m14979b);
        c3512a.m14937a(c3513b.m14984e());
        if (this.f15449d == null) {
            this.f15449d = new ArrayList(2);
        }
        this.f15449d.add(c3512a);
        if (this.f15449d.size() > 10) {
            this.f15449d.remove(0);
        }
        this.f15450e = c3513b;
        return true;
    }

    /* renamed from: a */
    public boolean m14871a() {
        return m14866g();
    }

    /* renamed from: b */
    public String m14872b() {
        return this.f15448c;
    }

    /* renamed from: c */
    public boolean m14873c() {
        C3513b c3513b = this.f15450e;
        if (c3513b != null && c3513b.m14987h() > 100) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public C3513b m14874d() {
        return this.f15450e;
    }

    /* renamed from: e */
    public List<C3512a> m14875e() {
        return this.f15449d;
    }

    /* renamed from: f */
    public abstract String mo14876f();

    /* renamed from: a */
    public void m14868a(C3513b c3513b) {
        this.f15450e = c3513b;
    }

    /* renamed from: a */
    public void m14870a(List<C3512a> list) {
        this.f15449d = list;
    }

    /* renamed from: a */
    public String m14867a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0 || MessageService.MSG_DB_READY_REPORT.equals(trim) || "unknown".equals(trim.toLowerCase(Locale.US))) {
            return null;
        }
        return trim;
    }

    /* renamed from: a */
    public void m14869a(C3514c c3514c) {
        this.f15450e = c3514c.m15016c().get(this.f15448c);
        List<C3512a> m15022h = c3514c.m15022h();
        if (m15022h == null || m15022h.size() <= 0) {
            return;
        }
        if (this.f15449d == null) {
            this.f15449d = new ArrayList();
        }
        for (C3512a c3512a : m15022h) {
            if (this.f15448c.equals(c3512a.f15516a)) {
                this.f15449d.add(c3512a);
            }
        }
    }
}
