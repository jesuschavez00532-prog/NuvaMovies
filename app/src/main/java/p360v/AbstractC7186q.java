package p360v;

import java.util.Locale;

/* renamed from: v.q */
/* loaded from: classes.dex */
public abstract class AbstractC7186q {

    /* renamed from: a */
    public static final InterfaceC7185p f26884a = new e(null, false);

    /* renamed from: b */
    public static final InterfaceC7185p f26885b = new e(null, true);

    /* renamed from: c */
    public static final InterfaceC7185p f26886c = null;

    /* renamed from: d */
    public static final InterfaceC7185p f26887d = null;

    /* renamed from: e */
    public static final InterfaceC7185p f26888e = null;

    /* renamed from: f */
    public static final InterfaceC7185p f26889f = null;

    /* renamed from: v.q$a */
    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b */
        static final a f26890b = new a(true);

        /* renamed from: a */
        private final boolean f26891a;

        private a(boolean z10) {
            this.f26891a = z10;
        }

        @Override // p360v.AbstractC7186q.c
        /* renamed from: a */
        public int mo27815a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int m27813a = AbstractC7186q.m27813a(Character.getDirectionality(charSequence.charAt(i10)));
                if (m27813a != 0) {
                    if (m27813a == 1) {
                        if (!this.f26891a) {
                            return 1;
                        }
                    } else {
                        continue;
                        i10++;
                    }
                } else if (this.f26891a) {
                    return 0;
                }
                z10 = true;
                i10++;
            }
            if (z10) {
                return this.f26891a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: v.q$b */
    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a */
        static final b f26892a = new b();

        private b() {
        }

        @Override // p360v.AbstractC7186q.c
        /* renamed from: a */
        public int mo27815a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = AbstractC7186q.m27814b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v.q$c */
    /* loaded from: classes.dex */
    public class c {
        /* renamed from: a */
        int mo27815a(CharSequence charSequence, int i10, int i11);
    }

    /* renamed from: v.q$d */
    /* loaded from: classes.dex */
    private static abstract class d implements InterfaceC7185p {

        /* renamed from: a */
        private final c f26893a;

        d(c cVar) {
            this.f26893a = cVar;
        }

        /* renamed from: c */
        private boolean m27816c(CharSequence charSequence, int i10, int i11) {
            int mo27815a = this.f26893a.mo27815a(charSequence, i10, i11);
            if (mo27815a == 0) {
                return true;
            }
            if (mo27815a != 1) {
                return mo27817b();
            }
            return false;
        }

        @Override // p360v.InterfaceC7185p
        /* renamed from: a */
        public boolean mo27812a(CharSequence charSequence, int i10, int i11) {
            if (charSequence != null && i10 >= 0 && i11 >= 0 && charSequence.length() - i11 >= i10) {
                if (this.f26893a == null) {
                    return mo27817b();
                }
                return m27816c(charSequence, i10, i11);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: b */
        protected abstract boolean mo27817b();
    }

    /* renamed from: v.q$e */
    /* loaded from: classes.dex */
    private static class e extends d {

        /* renamed from: b */
        private final boolean f26894b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f26894b = z10;
        }

        @Override // p360v.AbstractC7186q.d
        /* renamed from: b */
        protected boolean mo27817b() {
            return this.f26894b;
        }
    }

    /* renamed from: v.q$f */
    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b */
        static final f f26895b = new f();

        f() {
            super(null);
        }

        @Override // p360v.AbstractC7186q.d
        /* renamed from: b */
        protected boolean mo27817b() {
            if (AbstractC7187r.m27818a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        b bVar = b.f26892a;
        f26886c = new e(bVar, false);
        f26887d = new e(bVar, true);
        f26888e = new e(a.f26890b, false);
        f26889f = f.f26895b;
    }

    /* renamed from: a */
    static int m27813a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m27814b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
