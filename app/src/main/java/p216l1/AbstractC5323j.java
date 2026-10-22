package p216l1;

import p184j1.EnumC4970a;
import p184j1.EnumC4972c;

/* renamed from: l1.j */
/* loaded from: classes.dex */
public abstract class AbstractC5323j {

    /* renamed from: a */
    public static final AbstractC5323j f21743a = new a();

    /* renamed from: b */
    public static final AbstractC5323j f21744b = new b();

    /* renamed from: c */
    public static final AbstractC5323j f21745c = new c();

    /* renamed from: d */
    public static final AbstractC5323j f21746d = new d();

    /* renamed from: e */
    public static final AbstractC5323j f21747e = new e();

    /* renamed from: l1.j$a */
    /* loaded from: classes.dex */
    class a extends AbstractC5323j {
        a() {
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: a */
        public boolean mo21531a() {
            return true;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: b */
        public boolean mo21532b() {
            return true;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: c */
        public boolean mo21533c(EnumC4970a enumC4970a) {
            if (enumC4970a == EnumC4970a.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: d */
        public boolean mo21534d(boolean z10, EnumC4970a enumC4970a, EnumC4972c enumC4972c) {
            if (enumC4970a != EnumC4970a.RESOURCE_DISK_CACHE && enumC4970a != EnumC4970a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: l1.j$b */
    /* loaded from: classes.dex */
    class b extends AbstractC5323j {
        b() {
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: a */
        public boolean mo21531a() {
            return false;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: b */
        public boolean mo21532b() {
            return false;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: c */
        public boolean mo21533c(EnumC4970a enumC4970a) {
            return false;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: d */
        public boolean mo21534d(boolean z10, EnumC4970a enumC4970a, EnumC4972c enumC4972c) {
            return false;
        }
    }

    /* renamed from: l1.j$c */
    /* loaded from: classes.dex */
    class c extends AbstractC5323j {
        c() {
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: a */
        public boolean mo21531a() {
            return true;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: b */
        public boolean mo21532b() {
            return false;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: c */
        public boolean mo21533c(EnumC4970a enumC4970a) {
            if (enumC4970a != EnumC4970a.DATA_DISK_CACHE && enumC4970a != EnumC4970a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: d */
        public boolean mo21534d(boolean z10, EnumC4970a enumC4970a, EnumC4972c enumC4972c) {
            return false;
        }
    }

    /* renamed from: l1.j$d */
    /* loaded from: classes.dex */
    class d extends AbstractC5323j {
        d() {
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: a */
        public boolean mo21531a() {
            return false;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: b */
        public boolean mo21532b() {
            return true;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: c */
        public boolean mo21533c(EnumC4970a enumC4970a) {
            return false;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: d */
        public boolean mo21534d(boolean z10, EnumC4970a enumC4970a, EnumC4972c enumC4972c) {
            if (enumC4970a != EnumC4970a.RESOURCE_DISK_CACHE && enumC4970a != EnumC4970a.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: l1.j$e */
    /* loaded from: classes.dex */
    class e extends AbstractC5323j {
        e() {
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: a */
        public boolean mo21531a() {
            return true;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: b */
        public boolean mo21532b() {
            return true;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: c */
        public boolean mo21533c(EnumC4970a enumC4970a) {
            if (enumC4970a == EnumC4970a.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // p216l1.AbstractC5323j
        /* renamed from: d */
        public boolean mo21534d(boolean z10, EnumC4970a enumC4970a, EnumC4972c enumC4972c) {
            if (((z10 && enumC4970a == EnumC4970a.DATA_DISK_CACHE) || enumC4970a == EnumC4970a.LOCAL) && enumC4972c == EnumC4972c.TRANSFORMED) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public abstract boolean mo21531a();

    /* renamed from: b */
    public abstract boolean mo21532b();

    /* renamed from: c */
    public abstract boolean mo21533c(EnumC4970a enumC4970a);

    /* renamed from: d */
    public abstract boolean mo21534d(boolean z10, EnumC4970a enumC4970a, EnumC4972c enumC4972c);
}
